package jagex.osrs;

import java.io.IOException;

public final class class130 {

    public long field1848;
    public class129 field1846;
    public class129 field1847;
    int field1841;
    int field1842;
    int field1849;
    int field1843;
    int field1844;
    int field1845;

    class130() {
        this.field1848 = 0L;
        this.field1841 = 0;
    }

    public static boolean method3241(byte var0) {
        long var1 = class120.method2866((short) 3133);
        int var3 = (int) (var1 - class252.field3260);
        class252.field3260 = var1;
        if (var3 > 200) {
            var3 = 200;
        }

        class252.field3272 += var3;
        if (class252.field3269 == 0 && class252.field3264 == 0 && class252.field3267 == 0
            && class252.field3262 == 0) {
            return true;
        } else if (class252.field3263 == null) {
            return false;
        } else {
            try {
                if (class252.field3272 > 30000) {
                    throw new IOException();
                } else {
                    class248 var4;
                    Buffer var5;
                    while (class252.field3264 < 200 && class252.field3262 > 0) {
                        var4 = (class248) class252.field3270.method4235();
                        var5 = new Buffer(4);
                        var5.writeByte(1);
                        var5.method3755((int) var4.key, -1892569166);
                        class252.field3263.vmethod3578(var5.bytes, 0, 4, -2088230859);
                        class252.field3261.method4226(var4, var4.key);
                        --class252.field3262;
                        ++class252.field3264;
                    }

                    while (class252.field3269 < 200 && class252.field3267 > 0) {
                        var4 = (class248) class252.field3265.method4156();
                        var5 = new Buffer(4);
                        var5.writeByte(0);
                        var5.method3755((int) var4.key, -1712590043);
                        class252.field3263.vmethod3578(var5.bytes, 0, 4, 67959876);
                        var4.method4308();
                        class252.field3268.method4226(var4, var4.key);
                        --class252.field3267;
                        ++class252.field3269;
                    }

                    for (int var16 = 0; var16 < 100; ++var16) {
                        int var17 = class252.field3263.available((byte) 54);
                        if (var17 < 0) {
                            throw new IOException();
                        }

                        if (var17 == 0) {
                            break;
                        }

                        class252.field3272 = 0;
                        byte var6 = 0;
                        if (class193.field2460 == null) {
                            var6 = 8;
                        } else if (class252.chunkOffset == -1) {
                            var6 = 1;
                        }

                        int var7;
                        int var8;
                        int var9;
                        int var11;
                        if (var6 > 0) {
                            var7 = var6 - class252.field3258.offset;
                            if (var7 > var17) {
                                var7 = var17;
                            }

                            class252.field3263.read(class252.field3258.bytes,
                                                    class252.field3258.offset, var7
                                                   );
                            if (class252.field3279 != 0) {
                                for (var8 = 0; var8 < var7; ++var8) {
                                    class252.field3258.bytes[var8
                                        + class252.field3258.offset] ^= class252.field3279;
                                }
                            }

                            class252.field3258.offset += var7;
                            if (class252.field3258.offset < var6) {
                                break;
                            }

                            if (class193.field2460 == null) {
                                class252.field3258.offset = 0;
                                var8 = class252.field3258.getUByte();
                                var9 = class252.field3258.readUint16();
                                System.out.println("Recvd " + var8 + ", " + var9);
                                int compression = class252.field3258.getUByte();
                                var11 = class252.field3258.getInt();
                                long var12 = (long) (var9 + (var8 << 16));
                                class248 var14 = (class248) class252.field3261.method4224(var12);
                                class250.field3246 = true;
                                if (var14 == null) {
                                    var14 = (class248) class252.field3268.method4224(var12);
                                    class250.field3246 = false;
                                }

                                if (var14 == null) {
                                    throw new IOException();
                                }

                                int var15 = compression == 0 ? 5 : 9;
                                class193.field2460 = var14;
                                class252.field3271 = new Buffer(
                                    var11 + var15 + class193.field2460.field3221);
                                class252.field3271.writeByte(compression);
                                class252.field3271.writeInt(var11);
                                class252.chunkOffset = 5;
                                class252.field3258.offset = 0;
                            } else if (class252.chunkOffset == -1) {
                                if (class252.field3258.bytes[0] == -1) {
                                    class252.chunkOffset = 0;
                                    class252.field3258.offset = 0;
                                } else {
                                    class193.field2460 = null;
                                }
                            }
                        } else {
                            var7 =
                                class252.field3271.bytes.length - class193.field2460.field3221;
                            var8 = 512 - class252.chunkOffset;
                            if (var8 > var7 - class252.field3271.offset) {
                                var8 = var7 - class252.field3271.offset;
                            }

                            if (var8 > var17) {
                                var8 = var17;
                            }

                            class252.field3263.read(class252.field3271.bytes,
                                                    class252.field3271.offset, var8
                                                   );
                            if (class252.field3279 != 0) {
                                for (var9 = 0; var9 < var8; ++var9) {
                                    class252.field3271.bytes[class252.field3271.offset
                                        + var9] ^= class252.field3279;
                                }
                            }

                            class252.field3271.offset += var8;
                            class252.chunkOffset += var8;
                            if (var7 == class252.field3271.offset) {
                                if (class193.field2460.key == 0xff00ffL) {
                                    class79.releaseManifest = class252.field3271;

                                    for (var9 = 0; var9 < 256; ++var9) {
                                        class251 var18 = class252.field3275[var9];
                                        if (var18 != null) {
                                            class79.releaseManifest.offset = var9 * 8 + 5;
                                            var11 = class79.releaseManifest.getInt();
                                            int var19 = class79.releaseManifest.getInt();
                                            var18.initialize(var11, var19);
                                        }
                                    }
                                } else {
                                    class252.field3274.reset();
                                    class252.field3274
                                        .update(class252.field3271.bytes, 0, var7);
                                    var9 = (int) class252.field3274.getValue();
                                    if (var9 != class193.field2460.field3220) {
                                        try {
                                            class252.field3263.vmethod3558(-760129588);
                                        } catch (Exception var21) {
                                            ;
                                        }

                                        ++class252.field3277;
                                        class252.field3263 = null;
                                        class252.field3279 = (byte) ((int) (Math.random() * 255.0D
                                            + 1.0D));
                                        return false;
                                    }

                                    class252.field3277 = 0;
                                    class252.field3278 = 0;
                                    class193.field2460.field3219
                                        .method4927((int) (class193.field2460.key & 65535L),
                                                    class252.field3271.bytes,
                                                    16711680L == (class193.field2460.key
                                                        & 16711680L), class250.field3246,
                                                    (byte) 66);
                                }

                                class193.field2460.unlink();
                                if (class250.field3246) {
                                    --class252.field3264;
                                } else {
                                    --class252.field3269;
                                }

                                class252.chunkOffset = 0;
                                class193.field2460 = null;
                                class252.field3271 = null;
                            } else {
                                if (class252.chunkOffset != 512) {
                                    break;
                                }

                                class252.chunkOffset = -1;
                            }
                        }
                    }

                    return true;
                }
            } catch (IOException var22) {
                try {
                    class252.field3263.vmethod3558(-913166985);
                } catch (Exception var20) {
                    ;
                }
                var22.printStackTrace();

                ++class252.field3278;
                class252.field3263 = null;
                return false;
            }
        }
    }
}
