package jagex.osrs;

import java.io.File;
import java.io.RandomAccessFile;

public class class34 extends class16 {

    static int[] field328;
    int field333;
    int field336;
    int field330;
    int field329;

    static String method644(int var0, byte var1) {
        return var0 < 0 ? "" : (client.field786[var0].length() > 0 ? client.field916[var0] + " "
            + client.field786[var0] : client.field916[var0]);
    }

    static final void method643(String var0, int var1) {
        class59.method1163(30, "", var0, -1483885983);
    }

    static final void method647(int var0, int var1) {
        if (var0 >= 0) {
            int var2 = client.field781[var0];
            int var3 = client.field782[var0];
            int var4 = client.field783[var0];
            int var5 = client.field784[var0];
            String var6 = client.field916[var0];
            String var7 = client.field786[var0];
            class15
                .method178(var2, var3, var4, var5, var6, var7, class48.field478, class48.field467,
                           -2119291913);
        }
    }

    static final void method624(int var0, int var1, int var2, int var3, byte var4) {
        ++client.field741;
        class268.method5228((byte) 21);
        class66.method1735((byte) -17);
        if (client.field769 >= 0 && client.players[client.field769] != null) {
            Player.method1207(client.players[client.field769], false, (byte) 28);
        }

        class117.method2851(true, -1542277702);
        int var5 = class83.field1226;
        int[] var6 = class83.field1222;

        int var7;
        for (var7 = 0; var7 < var5; ++var7) {
            if (var6[var7] != client.field769 && var6[var7] != client.localPlayerId) {
                Player.method1207(client.players[var6[var7]], true, (byte) -21);
            }
        }

        class117.method2851(false, -1542277702);

        for (class80 var29 = (class80) client.field773.method4298(); var29 != null;
             var29 = (class80) client.field773.method4283()) {
            if (var29.field1183 == class60.level && client.field655 <= var29.field1189) {
                if (client.field655 >= var29.field1188) {
                    if (var29.field1192 > 0) {
                        class73 var34 = client.field806[var29.field1192 - 1];
                        if (var34 != null && var34.x >= 0 && var34.x < 13312
                            && var34.z >= 0 && var34.z < 13312) {
                            var29.method2042(var34.x, var34.z, class152
                                                 .method3394(var34.x, var34.z, var29.field1183,
                                                             (byte) 90) - var29.field1187, client.field655,
                                             -1215482147);
                        }
                    }

                    if (var29.field1192 < 0) {
                        var7 = -var29.field1192 - 1;
                        Player var35;
                        if (var7 == client.localPlayerId) {
                            var35 = class69.localPlayer;
                        } else {
                            var35 = client.players[var7];
                        }

                        if (var35 != null && var35.x >= 0 && var35.x < 13312
                            && var35.z >= 0 && var35.z < 13312) {
                            var29.method2042(var35.x, var35.z, class152
                                                 .method3394(var35.x, var35.z, var29.field1183,
                                                             (byte) 82) - var29.field1187, client.field655,
                                             -1215482147);
                        }
                    }

                    var29.method2048(client.field705, -1214727271);
                    class243.field3173
                        .method3092(class60.level, (int) var29.field1185, (int) var29.field1191,
                                    (int) var29.field1184, 60, var29, var29.field1194, -1L, false);
                }
            } else {
                var29.unlink();
            }
        }

        for (class71 var37 = (class71) client.field711.method4298(); var37 != null;
             var37 = (class71) client.field711.method4283()) {
            if (var37.field1086 == class60.level && !var37.field1093) {
                if (client.field655 >= var37.field1085) {
                    var37.method1954(client.field705, (byte) 0);
                    if (var37.field1093) {
                        var37.unlink();
                    } else {
                        class243.field3173
                            .method3092(var37.field1086, var37.field1087, var37.field1088,
                                        var37.field1089, 60, var37, 0, -1L, false);
                    }
                }
            } else {
                var37.unlink();
            }
        }

        class3.method36(var0, var1, var2, var3, true, 2059905827);
        var0 = client.field657;
        var1 = client.field693;
        var2 = client.field644;
        var3 = client.field764;
        class319.method6067(var0, var1, var0 + var2, var3 + var1);
        class124.method3000();
        int var8;
        int var9;
        int var10;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var19;
        int var20;
        int var30;
        if (!client.field889) {
            var5 = client.field712;
            if (client.field729 / 256 > var5) {
                var5 = client.field729 / 256;
            }

            if (client.field890[4] && client.field892[4] + 128 > var5) {
                var5 = client.field892[4] + 128;
            }

            var30 = client.field658 & 2047;
            var7 = class9.field68;
            var8 = class122.field1717;
            var9 = class9.field70;
            var10 = var5 * 3 + 600;
            var13 = var3 - 334;
            if (var13 < 0) {
                var13 = 0;
            } else if (var13 > 100) {
                var13 = 100;
            }

            var14 = (client.field898 - client.field897) * var13 / 100 + client.field897;
            var12 = var14 * var10 / 256;
            var13 = 2048 - var5 & 2047;
            var14 = 2048 - var30 & 2047;
            var15 = 0;
            var16 = 0;
            var17 = var12;
            int var18;
            if (var13 != 0) {
                var18 = class124.field1747[var13];
                var19 = class124.field1754[var13];
                var20 = var19 * var16 - var18 * var12 >> 16;
                var17 = var18 * var16 + var19 * var12 >> 16;
                var16 = var20;
            }

            if (var14 != 0) {
                var18 = class124.field1747[var14];
                var19 = class124.field1754[var14];
                var20 = var17 * var18 + var19 * var15 >> 16;
                var17 = var19 * var17 - var18 * var15 >> 16;
                var15 = var20;
            }

            class157.field2036 = var7 - var15;
            Buffer.field2409 = var8 - var16;
            class50.field508 = var9 - var17;
            class57.field576 = var5;
            class15.field143 = var30;
            if (client.field718 == 1 && client.rights >= 2 && client.field655 % 50 == 0 && (
                class9.field68 >> 7 != class69.localPlayer.x >> 7
                    || class9.field70 >> 7 != class69.localPlayer.z >> 7)) {
                var18 = class69.localPlayer.level;
                var19 = (class9.field68 >> 7) + class49.sceneX;
                var20 = (class9.field70 >> 7) + class11.sceneZ;
                class49.method1023(var19, var20, var18, true, -2030262017);
            }
        }

        int var11;
        if (!client.field889) {
            if (GameApplet.field435.field1029) {
                var30 = class60.level;
            } else {
                label804:
                {
                    var7 = 3;
                    if (class57.field576 < 310) {
                        if (client.field718 == 1) {
                            var8 = class9.field68 >> 7;
                            var9 = class9.field70 >> 7;
                        } else {
                            var8 = class69.localPlayer.x >> 7;
                            var9 = class69.localPlayer.z >> 7;
                        }

                        var10 = class157.field2036 >> 7;
                        var11 = class50.field508 >> 7;
                        if (var10 < 0 || var11 < 0 || var10 >= 104 || var11 >= 104) {
                            var30 = class60.level;
                            break label804;
                        }

                        if (var8 < 0 || var9 < 0 || var8 >= 104 || var9 >= 104) {
                            var30 = class60.level;
                            break label804;
                        }

                        if ((class50.field492[class60.level][var10][var11] & 4) != 0) {
                            var7 = class60.level;
                        }

                        if (var8 > var10) {
                            var12 = var8 - var10;
                        } else {
                            var12 = var10 - var8;
                        }

                        if (var9 > var11) {
                            var13 = var9 - var11;
                        } else {
                            var13 = var11 - var9;
                        }

                        if (var12 > var13) {
                            var14 = var13 * 65536 / var12;
                            var15 = 32768;

                            while (var10 != var8) {
                                if (var10 < var8) {
                                    ++var10;
                                } else if (var10 > var8) {
                                    --var10;
                                }

                                if ((class50.field492[class60.level][var10][var11] & 4) != 0) {
                                    var7 = class60.level;
                                }

                                var15 += var14;
                                if (var15 >= 65536) {
                                    var15 -= 65536;
                                    if (var11 < var9) {
                                        ++var11;
                                    } else if (var11 > var9) {
                                        --var11;
                                    }

                                    if ((class50.field492[class60.level][var10][var11] & 4)
                                        != 0) {
                                        var7 = class60.level;
                                    }
                                }
                            }
                        } else if (var13 > 0) {
                            var14 = var12 * 65536 / var13;
                            var15 = 32768;

                            while (var9 != var11) {
                                if (var11 < var9) {
                                    ++var11;
                                } else if (var11 > var9) {
                                    --var11;
                                }

                                if ((class50.field492[class60.level][var10][var11] & 4) != 0) {
                                    var7 = class60.level;
                                }

                                var15 += var14;
                                if (var15 >= 65536) {
                                    var15 -= 65536;
                                    if (var10 < var8) {
                                        ++var10;
                                    } else if (var10 > var8) {
                                        --var10;
                                    }

                                    if ((class50.field492[class60.level][var10][var11] & 4)
                                        != 0) {
                                        var7 = class60.level;
                                    }
                                }
                            }
                        }
                    }

                    if (class69.localPlayer.x >= 0 && class69.localPlayer.z >= 0
                        && class69.localPlayer.x < 13312
                        && class69.localPlayer.z < 13312) {
                        if ((class50.field492[class60.level][class69.localPlayer.x >> 7][
                            class69.localPlayer.z >> 7] & 4) != 0) {
                            var7 = class60.level;
                        }

                        var30 = var7;
                    } else {
                        var30 = class60.level;
                    }
                }
            }

            var5 = var30;
        } else {
            if (GameApplet.field435.field1029) {
                var30 = class60.level;
            } else {
                var7 = class152
                    .method3394(class157.field2036, class50.field508, class60.level, (byte) 100);
                if (var7 - Buffer.field2409 < 800 &&
                    (class50.field492[class60.level][class157.field2036 >> 7][class50.field508
                        >> 7] & 4) != 0) {
                    var30 = class60.level;
                } else {
                    var30 = 3;
                }
            }

            var5 = var30;
        }

        var30 = class157.field2036;
        var7 = Buffer.field2409;
        var8 = class50.field508;
        var9 = class57.field576;
        var10 = class15.field143;

        for (var11 = 0; var11 < 5; ++var11) {
            if (client.field890[var11]) {
                var12 = (int) (Math.random() * (double) (client.field891[var11] * 2 + 1)
                    - (double) client.field891[var11] + Math.sin(
                    (double) client.field893[var11] / 100.0D * (double) client.field894[var11])
                    * (double) client.field892[var11]);
                if (var11 == 0) {
                    class157.field2036 += var12;
                }

                if (var11 == 1) {
                    Buffer.field2409 += var12;
                }

                if (var11 == 2) {
                    class50.field508 += var12;
                }

                if (var11 == 3) {
                    class15.field143 = var12 + class15.field143 & 2047;
                }

                if (var11 == 4) {
                    class57.field576 += var12;
                    if (class57.field576 < 128) {
                        class57.field576 = 128;
                    }

                    if (class57.field576 > 383) {
                        class57.field576 = 383;
                    }
                }
            }
        }

        var11 = class48.field473;
        var12 = class48.field464 * -976212263;
        if (class48.field477 != 0) {
            var11 = class48.field478;
            var12 = class48.field467;
        }

        if (var11 >= var0 && var11 < var0 + var2 && var12 >= var1 && var12 < var3 + var1) {
            var13 = var11 - var0;
            var14 = var12 - var1;
            class122.field1712 = var13;
            class122.field1715 = var14;
            class122.field1711 = true;
            class122.field1713 = 0;
            class122.field1708 = false;
        } else {
            class40.method764((byte) 1);
        }

        class160.method3502((byte) 70);
        class319.method6047(var0, var1, var2, var3, 0);
        class160.method3502((byte) 125);
        var13 = class124.field1741;
        class124.field1741 = client.field907;
        class243.field3173
            .method3098(class157.field2036, Buffer.field2409, class50.field508, class57.field576,
                        class15.field143, var5);
        class124.field1741 = var13;
        class160.method3502((byte) 100);
        class243.field3173.method3071();
        client.field912 = 0;
        boolean var36 = false;
        var15 = -1;
        var16 = -1;
        var17 = class83.field1226;
        int[] var31 = class83.field1222;

        for (var19 = 0; var19 < var17 + client.field686; ++var19) {
            Object var32;
            if (var19 < var17) {
                var32 = client.players[var31[var19]];
                if (var31[var19] == client.field769) {
                    var36 = true;
                    var15 = var19;
                    continue;
                }

                if (var32 == class69.localPlayer) {
                    var16 = var19;
                    continue;
                }
            } else {
                var32 = client.field806[client.field687[var19 - var17]];
            }

            class68.method1828((class64) var32, var19, var0, var1, var2, var3, -1365633758);
        }

        if (client.field762 && var16 != -1) {
            class68.method1828(class69.localPlayer, var16, var0, var1, var2, var3, -577288766);
        }

        if (var36) {
            class68.method1828(client.players[client.field769], var15, var0, var1, var2, var3,
                               -1669401018);
        }

        for (var19 = 0; var19 < client.field912; ++var19) {
            var20 = client.field732[var19];
            int var21 = client.field733[var19];
            int var22 = client.field757[var19];
            int var23 = client.field738[var19];
            boolean var24 = true;

            while (var24) {
                var24 = false;

                for (int var25 = 0; var25 < var19; ++var25) {
                    if (var21 + 2 > client.field733[var25] - client.field738[var25]
                        && var21 - var23 < client.field733[var25] + 2
                        && var20 - var22 < client.field757[var25] + client.field732[var25]
                        && var22 + var20 > client.field732[var25] - client.field757[var25]
                        && client.field733[var25] - client.field738[var25] < var21) {
                        var21 = client.field733[var25] - client.field738[var25];
                        var24 = true;
                    }
                }
            }

            client.field652 = client.field732[var19];
            client.field903 = client.field733[var19] = var21;
            String var33 = client.field739[var19];
            if (client.field807 == 0) {
                int var26 = 16776960;
                if (client.field736[var19] < 6) {
                    var26 = client.field859[client.field736[var19]];
                }

                if (client.field736[var19] == 6) {
                    var26 = client.field741 % 20 < 10 ? 16711680 : 16776960;
                }

                if (client.field736[var19] == 7) {
                    var26 = client.field741 % 20 < 10 ? 255 : '\uffff';
                }

                if (client.field736[var19] == 8) {
                    var26 = client.field741 % 20 < 10 ? '\ub000' : 8454016;
                }

                int var27;
                if (client.field736[var19] == 9) {
                    var27 = 150 - client.field818[var19];
                    if (var27 < 50) {
                        var26 = var27 * 1280 + 16711680;
                    } else if (var27 < 100) {
                        var26 = 16776960 - (var27 - 50) * 327680;
                    } else if (var27 < 150) {
                        var26 = (var27 - 100) * 5 + 65280;
                    }
                }

                if (client.field736[var19] == 10) {
                    var27 = 150 - client.field818[var19];
                    if (var27 < 50) {
                        var26 = var27 * 5 + 16711680;
                    } else if (var27 < 100) {
                        var26 = 16711935 - (var27 - 50) * 327680;
                    } else if (var27 < 150) {
                        var26 = (var27 - 100) * 327680 + 255 - (var27 - 100) * 5;
                    }
                }

                if (client.field736[var19] == 11) {
                    var27 = 150 - client.field818[var19];
                    if (var27 < 50) {
                        var26 = 16777215 - var27 * 327685;
                    } else if (var27 < 100) {
                        var26 = (var27 - 50) * 327685 + 65280;
                    } else if (var27 < 150) {
                        var26 = 16777215 - (var27 - 100) * 327680;
                    }
                }

                if (client.field737[var19] == 0) {
                    class163.field2066
                        .method5880(var33, var0 + client.field652, client.field903 + var1, var26,
                                    0);
                }

                if (client.field737[var19] == 1) {
                    class163.field2066
                        .method5802(var33, var0 + client.field652, client.field903 + var1, var26, 0,
                                    client.field741);
                }

                if (client.field737[var19] == 2) {
                    class163.field2066
                        .method5803(var33, var0 + client.field652, client.field903 + var1, var26, 0,
                                    client.field741);
                }

                if (client.field737[var19] == 3) {
                    class163.field2066
                        .method5820(var33, var0 + client.field652, client.field903 + var1, var26, 0,
                                    client.field741, 150 - client.field818[var19]);
                }

                if (client.field737[var19] == 4) {
                    var27 = (150 - client.field818[var19]) * (class163.field2066.method5793(var33)
                        + 100) / 150;
                    class319
                        .method6041(var0 + client.field652 - 50, var1, var0 + client.field652 + 50,
                                    var3 + var1);
                    class163.field2066.method5846(var33, var0 + client.field652 + 50 - var27,
                                                  client.field903 + var1, var26, 0);
                    class319.method6067(var0, var1, var0 + var2, var3 + var1);
                }

                if (client.field737[var19] == 5) {
                    var27 = 150 - client.field818[var19];
                    int var28 = 0;
                    if (var27 < 25) {
                        var28 = var27 - 25;
                    } else if (var27 > 125) {
                        var28 = var27 - 125;
                    }

                    class319
                        .method6041(var0, client.field903 + var1 - class163.field2066.field3765 - 1,
                                    var0 + var2, client.field903 + var1 + 5);
                    class163.field2066
                        .method5880(var33, var0 + client.field652, var28 + client.field903 + var1,
                                    var26, 0);
                    class319.method6067(var0, var1, var0 + var2, var3 + var1);
                }
            } else {
                class163.field2066
                    .method5880(var33, var0 + client.field652, client.field903 + var1, 16776960, 0);
            }
        }

        if (client.field663 == 2) {
            class157.method3463((client.field666 - class49.sceneX << 7) + client.field669,
                                (client.field667 - class11.sceneZ << 7) + client.field755,
                                client.field668 * 2, -819166900);
            if (client.field652 > -1 && client.field655 % 20 < 10) {
                class49.field489[0]
                    .method6164(var0 + client.field652 - 12, client.field903 + var1 - 28);
            }
        }

        ((class113) class124.field1752).method2748(client.field705, (byte) -26);
        class13.method144(var0, var1, var2, var3, 1278936273);
        class157.field2036 = var30;
        Buffer.field2409 = var7;
        class50.field508 = var8;
        class57.field576 = var9;
        class15.field143 = var10;
        if (client.field654 && class50.method1058(true, false, (byte) 30) == 0) {
            client.field654 = false;
        }

        if (client.field654) {
            class319.method6047(var0, var1, var2, var3, 0);
            class58.method1132("Loading - please wait.", false, 1806181800);
        }

    }

    static File method645(String var0, int var1) {
        if (!class160.field2043) {
            throw new RuntimeException("");
        } else {
            File var2 = (File) class160.field2040.get(var0);
            if (var2 != null) {
                return var2;
            } else {
                File var3 = new File(class307.field3802, var0);
                RandomAccessFile var4 = null;

                try {
                    File var5 = new File(var3.getParent());
                    if (!var5.exists()) {
                        throw new RuntimeException("");
                    } else {
                        var4 = new RandomAccessFile(var3, "rw");
                        int var6 = var4.read();
                        var4.seek(0L);
                        var4.write(var6);
                        var4.seek(0L);
                        var4.close();
                        class160.field2040.put(var0, var3);
                        return var3;
                    }
                } catch (Exception var9) {
                    try {
                        if (var4 != null) {
                            var4.close();
                            var4 = null;
                        }
                    } catch (Exception var8) {
                        ;
                    }

                    throw new RuntimeException();
                }
            }
        }
    }

    static void method617(Player var0, int var1, int var2, int var3) {
        if (var0.field971 == var1 && var1 != -1) {
            int var4 = class29.method532(var1, 1921248409).field3615;
            if (var4 == 1) {
                var0.field986 = 0;
                var0.field989 = 0;
                var0.field998 = var2;
                var0.field975 = 0;
            }

            if (var4 == 2) {
                var0.field975 = 0;
            }
        } else if (var1 == -1 || var0.field971 == -1
            || class29.method532(var1, 1066284684).field3627 >= class29
            .method532(var0.field971, -767601180).field3627) {
            var0.field971 = var1;
            var0.field986 = 0;
            var0.field989 = 0;
            var0.field998 = var2;
            var0.field975 = 0;
            var0.field959 = var0.field939;
        }

    }

    int method621(int var1) {
        return this.field330;
    }

    boolean method618(int var1, int var2, int var3) {
        return var1 < this.field330 * 8 ? false : (var2 < this.field329 * 8 ? false
            : (var1 >= this.field330 * 8 + 8 ? false : var2 < this.field329 * 8 + 8));
    }

    int method622(int var1) {
        return this.field329;
    }

    void method631(Buffer var1, Buffer var2, int var3) {
        int var4 = var2.getUByte();
        if (var4 != class25.field252.field254) {
            throw new IllegalStateException("");
        } else {
            super.field150 = var2.getUByte();
            super.field148 = var2.getUByte();
            super.field146 = var2.readUint16();
            super.field151 = var2.readUint16();
            this.field333 = var2.getUByte();
            this.field336 = var2.getUByte();
            super.field147 = var2.readUint16();
            super.field149 = var2.readUint16();
            this.field330 = var2.getUByte();
            this.field329 = var2.getUByte();
            super.field148 = Math.min(super.field148, 4);
            super.field152 = new short[1][64][64];
            super.field153 = new short[super.field148][64][64];
            super.field154 = new byte[super.field148][64][64];
            super.field155 = new byte[super.field148][64][64];
            super.field156 = new class19[super.field148][64][64][];
            var4 = var1.getUByte();
            if (var4 != class24.field245.field247) {
                throw new IllegalStateException("");
            } else {
                int var5 = var1.getUByte();
                int var6 = var1.getUByte();
                int var7 = var1.getUByte();
                int var8 = var1.getUByte();
                if (var5 == super.field147 && var6 == super.field149 && var7 == this.field330
                    && var8 == this.field329) {
                    for (int var9 = 0; var9 < 8; ++var9) {
                        for (int var10 = 0; var10 < 8; ++var10) {
                            this.method181(var9 + this.field330 * 8, var10 + this.field329 * 8,
                                           var1, -979754326);
                        }
                    }

                } else {
                    throw new IllegalStateException("");
                }
            }
        }
    }

    int method627(int var1) {
        return this.field333;
    }

    int method620(byte var1) {
        return this.field336;
    }

    public boolean equals(Object var1) {
        if (!(var1 instanceof class34)) {
            return false;
        } else {
            class34 var2 = (class34) var1;
            return super.field147 == var2.field147 && super.field149 == var2.field149 ?
                var2.field330 == this.field330 && var2.field329 == this.field329 : false;
        }
    }

    public int hashCode() {
        return super.field147 | super.field149 << 8 | this.field330 << 16 | this.field329 << 24;
    }
}
