package jagex.osrs;

import java.net.URL;

public class class11 {

    static int sceneZ;

    static final void decodeSceneRebuild(boolean instanced, PacketBuffer buffer) {
        client.instancedScene = instanced;
        int var3;
        int var4;
        int var6;
        int var7;
        int var8;
        int var9;
        if (!client.instancedScene) {
            var3 = buffer.method3792(1840053040);
            var4 = buffer.method3808(-1873828017);
            int var5 = buffer.readUint16();
            class250.field3247 = new int[var5][4];

            for (var6 = 0; var6 < var5; ++var6) {
                for (var7 = 0; var7 < 4; ++var7) {
                    class250.field3247[var6][var7] = buffer.getInt();
                }
            }

            class37.field367 = new int[var5];
            class219.field2532 = new int[var5];
            class29.field295 = new int[var5];
            IssacRandom.field2458 = new byte[var5][];
            BufferedFile.field1487 = new byte[var5][];
            boolean var17 = false;
            if ((var4 / 8 == 48 || var4 / 8 == 49) && var3 / 8 == 48) {
                var17 = true;
            }

            if (var4 / 8 == 48 && var3 / 8 == 148) {
                var17 = true;
            }

            var5 = 0;

            for (var7 = (var4 - 6) / 8; var7 <= (var4 + 6) / 8; ++var7) {
                for (var8 = (var3 - 6) / 8; var8 <= (var3 + 6) / 8; ++var8) {
                    var9 = var8 + (var7 << 8);
                    if (!var17 || var8 != 49 && var8 != 149 && var8 != 147 && var7 != 50 && (
                        var7 != 49 || var8 != 47)) {
                        class37.field367[var5] = var9;
                        class219.field2532[var5] = class332.index5
                            .method4825("m" + var7 + "_" + var8, 1011742774);
                        class29.field295[var5] = class332.index5
                            .method4825("l" + var7 + "_" + var8, 1011742774);
                        ++var5;
                    }
                }
            }

            class156.method3442(var4, var3, true, (byte) -124);
        } else {
            var3 = buffer.method3808(-1577602496);
            var4 = buffer.method3792(323800451);
            boolean var16 = buffer.readUint8() == 1;
            var6 = buffer.readUint16();
            buffer.startBitAccess();

            int var10;
            for (var7 = 0; var7 < 4; ++var7) {
                for (var8 = 0; var8 < 13; ++var8) {
                    for (var9 = 0; var9 < 13; ++var9) {
                        var10 = buffer.readBits(1);
                        if (var10 == 1) {
                            client.field703[var7][var8][var9] = buffer.readBits(26);
                        } else {
                            client.field703[var7][var8][var9] = -1;
                        }
                    }
                }
            }

            buffer.endBitAccess();
            class250.field3247 = new int[var6][4];

            for (var7 = 0; var7 < var6; ++var7) {
                for (var8 = 0; var8 < 4; ++var8) {
                    class250.field3247[var7][var8] = buffer.getInt();
                }
            }

            class37.field367 = new int[var6];
            class219.field2532 = new int[var6];
            class29.field295 = new int[var6];
            IssacRandom.field2458 = new byte[var6][];
            BufferedFile.field1487 = new byte[var6][];
            var6 = 0;

            for (var7 = 0; var7 < 4; ++var7) {
                for (var8 = 0; var8 < 13; ++var8) {
                    for (var9 = 0; var9 < 13; ++var9) {
                        var10 = client.field703[var7][var8][var9];
                        if (var10 != -1) {
                            int var11 = var10 >> 14 & 1023;
                            int var12 = var10 >> 3 & 2047;
                            int var13 = (var11 / 8 << 8) + var12 / 8;

                            int var14;
                            for (var14 = 0; var14 < var6; ++var14) {
                                if (class37.field367[var14] == var13) {
                                    var13 = -1;
                                    break;
                                }
                            }

                            if (var13 != -1) {
                                class37.field367[var6] = var13;
                                var14 = var13 >> 8 & 255;
                                int var15 = var13 & 255;
                                class219.field2532[var6] = class332.index5
                                    .method4825("m" + var14 + "_" + var15, 1011742774);
                                class29.field295[var6] = class332.index5
                                    .method4825("l" + var14 + "_" + var15, 1011742774);
                                ++var6;
                            }
                        }
                    }
                }
            }

            class156.method3442(var4, var3, !var16, (byte) -33);
        }

    }

    static boolean method121(int var0) {
        try {
            if (class66.field1010 == null) {
                class66.field1010 = class37.field352
                    .method3278(new URL(SeekableFile.field1496), 433596934);
            } else if (class66.field1010.method3286(-1584029153)) {
                byte[] var1 = class66.field1010.method3281((byte) -36);
                Buffer var2 = new Buffer(var1);
                var2.getInt();
                class66.field1013 = var2.readUint16();
                class66.field1017 = new class66[class66.field1013];

                class66 var4;
                for (int var3 = 0; var3 < class66.field1013; var4.field1024 = var3++) {
                    var4 = class66.field1017[var3] = new class66();
                    var4.field1015 = var2.readUint16();
                    var4.field1008 = var2.getInt();
                    var4.field1019 = var2.getString();
                    var4.field1022 = var2.getString();
                    var4.field1021 = var2.readUint8();
                    var4.field1020 = var2.method3814((byte) -1);
                }

                class305.method5919(class66.field1017, 0, class66.field1017.length - 1,
                                    class66.field1016, class66.field1018, -725934529);
                class66.field1010 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            class66.field1010 = null;
        }

        return false;
    }

    static class59 method119(int var0, byte var1) {
        return (class59) class85.field1249.method4185((long) var0);
    }
}
