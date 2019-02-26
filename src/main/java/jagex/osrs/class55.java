package jagex.osrs;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class class55 {

    static ArchiveCache manifests;
    static int field552;
    static class323 field551;
    static int[][][] field553;

    public static void method1106(String var0, String var1, int var2, int var3, int var4)
        throws IOException {
        class157.field2024 = var3;
        class157.field2033 = var2;

        try {
            class146.field1954 = System.getProperty("os.name");
        } catch (Exception var30) {
            class146.field1954 = "Unknown";
        }

        class28.field284 = class146.field1954.toLowerCase();

        try {
            class21.field206 = System.getProperty("user.home");
            if (class21.field206 != null) {
                class21.field206 = class21.field206 + "/";
            }
        } catch (Exception var29) {
            ;
        }

        try {
            if (class28.field284.startsWith("win")) {
                if (class21.field206 == null) {
                    class21.field206 = System.getenv("USERPROFILE");
                }
            } else if (class21.field206 == null) {
                class21.field206 = System.getenv("HOME");
            }

            if (class21.field206 != null) {
                class21.field206 = class21.field206 + "/";
            }
        } catch (Exception var28) {
            ;
        }

        if (class21.field206 == null) {
            class21.field206 = "~/";
        }

        class229.field2646 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/",
            "c:/", class21.field206, "/tmp/", ""};
        class8.field66 = new String[]{".jagex_cache_" + class157.field2033,
            ".file_store_" + class157.field2033};
        int var19 = 0;

        label278:
        while (var19 < 4) {
            String var7 = var19 == 0 ? "" : "" + var19;
            class157.field2023 = new File(class21.field206,
                                          "jagex_cl_" + var0 + "_" + var1 + var7 + ".dat");
            String var8 = null;
            String var9 = null;
            boolean var10 = false;
            File var37;
            if (class157.field2023.exists()) {
                try {
                    SeekableFile var11 = new SeekableFile(class157.field2023, "rw", 10000L);

                    Buffer var12;
                    int var13;
                    for (var12 = new Buffer((int) var11.method2719(1052508146));
                         var12.offset < var12.bytes.length; var12.offset += var13) {
                        var13 = var11.method2720(var12.bytes, var12.offset,
                                                 var12.bytes.length - var12.offset,
                                                 1230210783);
                        if (var13 == -1) {
                            throw new IOException();
                        }
                    }

                    var12.offset = 0;
                    var13 = var12.getUByte();
                    if (var13 < 1 || var13 > 3) {
                        throw new IOException("" + var13);
                    }

                    int var14 = 0;
                    if (var13 > 1) {
                        var14 = var12.getUByte();
                    }

                    if (var13 <= 2) {
                        var8 = var12.method3779(1447526260);
                        if (var14 == 1) {
                            var9 = var12.method3779(624286807);
                        }
                    } else {
                        var8 = var12.method3780((byte) 56);
                        if (var14 == 1) {
                            var9 = var12.method3780((byte) -11);
                        }
                    }

                    var11.method2717(-514512039);
                } catch (IOException var33) {
                    var33.printStackTrace();
                }

                if (var8 != null) {
                    var37 = new File(var8);
                    if (!var37.exists()) {
                        var8 = null;
                    }
                }

                if (var8 != null) {
                    var37 = new File(var8, "test.dat");
                    if (!class188.method4014(var37, true, -2018829811)) {
                        var8 = null;
                    }
                }
            }

            if (var8 == null && var19 == 0) {
                label253:
                for (int var20 = 0; var20 < class8.field66.length; ++var20) {
                    for (int var21 = 0; var21 < class229.field2646.length; ++var21) {
                        File var22 = new File(
                            class229.field2646[var21] + class8.field66[var20] + File.separatorChar
                                + var0 + File.separatorChar);
                        if (var22.exists() && class188
                            .method4014(new File(var22, "test.dat"), true, 427265688)) {
                            var8 = var22.toString();
                            var10 = true;
                            break label253;
                        }
                    }
                }
            }

            // TODO
            var8 = null;
            if (var8 == null) {
                var8 =
                    class21.field206 + File.separatorChar + "donutcache" + var7 + File.separatorChar
                        + var0 + File.separatorChar + var1 + File.separatorChar;
                var10 = true;
            }

            if (var9 != null) {
                File var36 = new File(var9);
                var37 = new File(var8);

                try {
                    File[] var40 = var36.listFiles();
                    File[] var23 = var40;

                    for (int var15 = 0; var15 < var23.length; ++var15) {
                        File var16 = var23[var15];
                        File var17 = new File(var37, var16.getName());
                        boolean var18 = var16.renameTo(var17);
                        if (!var18) {
                            throw new IOException();
                        }
                    }
                } catch (Exception var32) {
                    var32.printStackTrace();
                }

                var10 = true;
            }

            if (var10) {
                class162.method3538(new File(var8), (File) null, 88922872);
            }

            File var6 = new File(var8);
            class51.field519 = var6;
            if (!class51.field519.exists()) {
                class51.field519.mkdirs();
            }

            File[] var35 = class51.field519.listFiles();
            if (var35 != null) {
                File[] var38 = var35;

                for (int var24 = 0; var24 < var38.length; ++var24) {
                    File var25 = var38[var24];
                    if (!class188.method4014(var25, false, 43506210)) {
                        ++var19;
                        continue label278;
                    }
                }
            }
            break;
        }

        class142.method3329(class51.field519, (byte) 0);

        try {
            File var5 = new File(class21.field206, "random.dat");
            int var27;
            if (var5.exists()) {
                class157.field2038 = new BufferedFile(new SeekableFile(var5, "rw", 25L), 24, 0);
            } else {
                label206:
                for (int var26 = 0; var26 < class8.field66.length; ++var26) {
                    for (var27 = 0; var27 < class229.field2646.length; ++var27) {
                        File var39 = new File(
                            class229.field2646[var27] + class8.field66[var26] + File.separatorChar
                                + "random.dat");
                        if (var39.exists()) {
                            class157.field2038 = new BufferedFile(new SeekableFile(var39, "rw", 25L), 24,
                                                                  0);
                            break label206;
                        }
                    }
                }
            }

            if (class157.field2038 == null) {
                RandomAccessFile var34 = new RandomAccessFile(var5, "rw");
                var27 = var34.read();
                var34.seek(0L);
                var34.write(var27);
                var34.seek(0L);
                var34.close();
                class157.field2038 = new BufferedFile(new SeekableFile(var5, "rw", 25L), 24, 0);
            }
        } catch (IOException var31) {
            ;
        }

        class157.blocksFile = new BufferedFile(
            new SeekableFile(class34.method645("main_file_cache.dat2", -247190777), "rw", 1048576000L),
            5200, 0);
        class157.manifestIndexFile = new BufferedFile(
            new SeekableFile(class34.method645("main_file_cache.idx255", -247190777), "rw", 1048576L),
            6000, 0);
        class157.indexFiles = new BufferedFile[class157.field2024];

        for (var19 = 0; var19 < class157.field2024; ++var19) {
            class157.indexFiles[var19] = new BufferedFile(
                new SeekableFile(class34.method645("main_file_cache.idx" + var19, -247190777), "rw",
                                 1048576L), 6000, 0);
        }

    }

    static void method1107(int var0, class228 var1, boolean var2, byte var3) {
        class20 var4 = class7.method88(1288700322).method6347(var0, -296101836);
        int var5 = class69.localPlayer.level;
        int var6 = (class69.localPlayer.x >> 7) + class49.sceneX;
        int var7 = (class69.localPlayer.z >> 7) + class11.sceneZ;
        class228 var8 = new class228(var5, var6, var7);
        class7.method88(607220513).method6335(var4, var8, var1, var2, (byte) 3);
    }
}
