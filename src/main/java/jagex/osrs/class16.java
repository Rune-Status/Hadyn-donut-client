package jagex.osrs;

import java.io.IOException;
import java.util.LinkedList;

public abstract class class16 {

    int field147;
    int field149;
    short[][][] field152;
    int field148;
    short[][][] field153;
    class19[][][][] field156;
    int field150;
    byte[][][] field154;
    int field146;
    int field151;
    byte[][][] field155;

    class16() {
        new LinkedList();
    }

    static void method202(int var0, int var1) {
        if (var0 != client.state) {
            if (client.state == 0) {
                class157.field2037.method873(787938515);
            }

            if (var0 == 20 || var0 == 40 || var0 == 45) {
                client.loginStage = 0;
                client.field678 = 0;
                client.field679 = 0;
                client.field904.method5503(var0, (byte) 43);
                if (var0 != 20) {
                    class30.method577(false, -2143307376);
                }
            }

            if (var0 != 20 && var0 != 40 && class52.field524 != null) {
                class52.field524.vmethod3558(-1987090849);
                class52.field524 = null;
            }

            if (client.state == 25) {
                client.field700 = 0;
                client.field696 = 0;
                client.field697 = 1;
                client.field753 = 0;
                client.field909 = 1;
            }

            if (var0 != 5 && var0 != 10) {
                if (var0 == 20) {
                    class20.method317(class12.index10, class154.index8, true,
                                      client.state == 11 ? 4 : 0, (byte) 9);
                } else if (var0 == 11) {
                    class20.method317(class12.index10, class154.index8, false, 4, (byte) 31);
                } else if (class79.field1174) {
                    class79.field1149 = null;
                    class307.field3801 = null;
                    class6.field44 = null;
                    class79.field1145 = null;
                    class79.field1146 = null;
                    class265.field3401 = null;
                    class79.field1147 = null;
                    class185.field2417 = null;
                    class132.field1861 = null;
                    class78.field1137 = null;
                    BufferedFile.field1490 = null;
                    class10.field81 = null;
                    class50.field513 = null;
                    class10.field77 = null;
                    class79.field1151 = null;
                    class58.field583 = null;
                    class161.field2048 = null;
                    class69.field1047 = null;
                    class62.field640 = null;
                    class32.field322 = null;
                    class19.field182 = null;
                    class19.field183 = null;
                    class180.method3732(2, -1344959189);
                    class227.method4642(true, -714835684);
                    class79.field1174 = false;
                }
            } else {
                class20.method317(class12.index10, class154.index8, true, 0, (byte) 27);
            }

            client.state = var0;
        }
    }

    public static int method206(int var0, int var1) {
        int var2 = 0;
        if (var0 < 0 || var0 >= 65536) {
            var0 >>>= 16;
            var2 += 16;
        }

        if (var0 >= 256) {
            var0 >>>= 8;
            var2 += 8;
        }

        if (var0 >= 16) {
            var0 >>>= 4;
            var2 += 4;
        }

        if (var0 >= 4) {
            var0 >>>= 2;
            var2 += 2;
        }

        if (var0 >= 1) {
            var0 >>>= 1;
            ++var2;
        }

        return var0 + var2;
    }

    public static void method207(class159 var0, boolean var1, int var2) {
        if (class252.field3263 != null) {
            try {
                class252.field3263.vmethod3558(-977993525);
            } catch (Exception var7) {
                ;
            }

            class252.field3263 = null;
        }

        class252.field3263 = var0;
        class227.method4642(var1, -714835684);
        class252.field3258.offset = 0;
        class193.field2460 = null;
        class252.field3271 = null;
        class252.chunkOffset = 0;

        while (true) {
            class248 var3 = (class248) class252.field3261.method4235();
            if (var3 == null) {
                while (true) {
                    var3 = (class248) class252.field3268.method4235();
                    if (var3 == null) {
                        if (class252.field3279 != 0) {
                            try {
                                Buffer var8 = new Buffer(4);
                                var8.writeByte(4);
                                var8.writeByte(class252.field3279);
                                var8.writeShort(0);
                                class252.field3263.vmethod3578(var8.bytes, 0, 4, 963996646);
                            } catch (IOException var6) {
                                try {
                                    class252.field3263.vmethod3558(-891634539);
                                } catch (Exception var5) {
                                    ;
                                }

                                ++class252.field3278;
                                class252.field3263 = null;
                            }
                        }

                        class252.field3272 = 0;
                        class252.field3260 = class120.method2866((short) 3133);
                        return;
                    }

                    class252.field3265.method4147(var3);
                    class252.field3266.method4226(var3, var3.key);
                    ++class252.field3267;
                    --class252.field3269;
                }
            }

            class252.field3270.method4226(var3, var3.key);
            ++class252.field3262;
            --class252.field3264;
        }
    }

    static final void method203(int var0, int var1, int var2, int var3, int var4, int var5) {
        class194.field2465[0].method6143(var0, var1);
        class194.field2465[1].method6143(var0, var3 + var1 - 16);
        class319.method6047(var0, var1 + 16, 16, var3 - 32, client.field917);
        int var6 = var3 * (var3 - 32) / var4;
        if (var6 < 8) {
            var6 = 8;
        }

        int var7 = (var3 - 32 - var6) * var2 / (var4 - var3);
        class319.method6047(var0, var7 + var1 + 16, 16, var6, client.field778);
        class319.method6054(var0, var7 + var1 + 16, var6, client.field709);
        class319.method6054(var0 + 1, var7 + var1 + 16, var6, client.field709);
        class319.method6098(var0, var7 + var1 + 16, 16, client.field709);
        class319.method6098(var0, var7 + var1 + 17, 16, client.field709);
        class319.method6054(var0 + 15, var7 + var1 + 16, var6, client.field883);
        class319.method6054(var0 + 14, var7 + var1 + 17, var6 - 1, client.field883);
        class319.method6098(var0, var7 + var6 + var1 + 15, 16, client.field883);
        class319.method6098(var0 + 1, var7 + var6 + var1 + 14, 15, client.field883);
    }

    static void method182(int var0) {
        if (class140.field1933 != null) {
            client.field914 = client.field655;
            class140.field1933.method4983(-1251368617);

            for (int var1 = 0; var1 < client.players.length; ++var1) {
                if (client.players[var1] != null) {
                    class140.field1933
                        .method4982((client.players[var1].x >> 7) + class49.sceneX,
                                    (client.players[var1].z >> 7) + class11.sceneZ,
                                    -1117895153);
                }
            }
        }

    }

    static int method205(int var0, class86 var1, boolean var2, int var3) {
        class232 var4 = class18.method213(class70.field1070[--class60.field600], -122107085);
        if (var0 == 2600) {
            class70.field1070[++class60.field600 - 1] = var4.field2711;
            return 1;
        } else if (var0 == 2601) {
            class70.field1070[++class60.field600 - 1] = var4.field2689;
            return 1;
        } else if (var0 == 2602) {
            class70.field1065[++class70.field1072 - 1] = var4.field2728;
            return 1;
        } else if (var0 == 2603) {
            class70.field1070[++class60.field600 - 1] = var4.field2690;
            return 1;
        } else if (var0 == 2604) {
            class70.field1070[++class60.field600 - 1] = var4.field2691;
            return 1;
        } else if (var0 == 2605) {
            class70.field1070[++class60.field600 - 1] = var4.field2721;
            return 1;
        } else if (var0 == 2606) {
            class70.field1070[++class60.field600 - 1] = var4.field2732;
            return 1;
        } else if (var0 == 2607) {
            class70.field1070[++class60.field600 - 1] = var4.field2720;
            return 1;
        } else if (var0 == 2608) {
            class70.field1070[++class60.field600 - 1] = var4.field2719;
            return 1;
        } else if (var0 == 2609) {
            class70.field1070[++class60.field600 - 1] = var4.field2698;
            return 1;
        } else if (var0 == 2610) {
            class70.field1070[++class60.field600 - 1] = var4.field2699;
            return 1;
        } else if (var0 == 2611) {
            class70.field1070[++class60.field600 - 1] = var4.field2686;
            return 1;
        } else if (var0 == 2612) {
            class70.field1070[++class60.field600 - 1] = var4.field2693;
            return 1;
        } else if (var0 == 2613) {
            class70.field1070[++class60.field600 - 1] = var4.field2744.vmethod6130((byte) 1);
            return 1;
        } else if (var0 == 2614) {
            class70.field1070[++class60.field600 - 1] = var4.field2725 ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    int method184(int var1, int var2, int var3) {
        return var1 >= 0 && var2 >= 0 ? (var1 < 64 && var2 < 64 ? this.field152[0][var1][var2] - 1
            : -1) : -1;
    }

    void method183(int var1, int var2, Buffer var3, int var4, byte var5) {
        int var6 = ((var4 & 24) >> 3) + 1;
        boolean var7 = (var4 & 2) != 0;
        boolean var8 = (var4 & 4) != 0;
        this.field152[0][var1][var2] = (short) var3.getUByte();
        int var9;
        int var10;
        int var12;
        if (var7) {
            var9 = var3.getUByte();

            for (var10 = 0; var10 < var9; ++var10) {
                int var11 = var3.getUByte();
                if (var11 != 0) {
                    this.field153[var10][var1][var2] = (short) var11;
                    var12 = var3.getUByte();
                    this.field154[var10][var1][var2] = (byte) (var12 >> 2);
                    this.field155[var10][var1][var2] = (byte) (var12 & 3);
                }
            }
        }

        if (var8) {
            for (var9 = 0; var9 < var6; ++var9) {
                var10 = var3.getUByte();
                if (var10 != 0) {
                    class19[] var15 = this.field156[var9][var1][var2] = new class19[var10];

                    for (var12 = 0; var12 < var10; ++var12) {
                        int var13 = var3.method3898((byte) -128);
                        int var14 = var3.getUByte();
                        var15[var12] = new class19(var13, var14 >> 2, var14 & 3);
                    }
                }
            }
        }

    }

    void method201(int var1, int var2, Buffer var3, int var4, int var5) {
        boolean var6 = (var4 & 2) != 0;
        if (var6) {
            this.field153[0][var1][var2] = (short) var3.getUByte();
        }

        this.field152[0][var1][var2] = (short) var3.getUByte();
    }

    int method204(int var1) {
        return this.field147;
    }

    int method180(byte var1) {
        return this.field149;
    }

    void method181(int var1, int var2, Buffer var3, int var4) {
        int var5 = var3.getUByte();
        if (var5 != 0) {
            if ((var5 & 1) != 0) {
                this.method201(var1, var2, var3, var5, -109374768);
            } else {
                this.method183(var1, var2, var3, var5, (byte) 104);
            }

        }
    }
}
