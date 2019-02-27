package jagex.osrs;

public class class10 extends class16 {

    static String field79;
    static class322[] field81;
    static class322 field77;
    static String field82;
    static class251 index7;
    static class232 field75;

    static void method114(class323 var0, int var1, int var2, int var3, int var4) {
        class203 var5 = class23.field235;
        long var7 = (long) (var3 << 16 | var1 << 8 | var2);
        var5.method4213(var0, var7, var0.field3889.length * 4);
    }

    static final void method115(PacketBuffer var0, int var1) {
        int var2 = 0;
        var0.startBitAccess();

        int var3;
        int var4;
        int var5;
        for (var3 = 0; var3 < class83.field1226; ++var3) {
            var4 = class83.field1222[var3];
            if ((class83.field1223[var4] & 1) == 0) {
                if (var2 > 0) {
                    --var2;
                    class83.field1223[var4] = (byte) (class83.field1223[var4] | 2);
                } else {
                    var5 = var0.readBits(1);
                    if (var5 == 0) {
                        var2 = class22.method333(var0, (short) -2488);
                        class83.field1223[var4] = (byte) (class83.field1223[var4] | 2);
                    } else {
                        OutboundPacket.method3670(var0, var4, (byte) 83);
                    }
                }
            }
        }

        var0.endBitAccess();
        if (var2 != 0) {
            throw new RuntimeException();
        } else {
            var0.startBitAccess();

            for (var3 = 0; var3 < class83.field1226; ++var3) {
                var4 = class83.field1222[var3];
                if ((class83.field1223[var4] & 1) != 0) {
                    if (var2 > 0) {
                        --var2;
                        class83.field1223[var4] = (byte) (class83.field1223[var4] | 2);
                    } else {
                        var5 = var0.readBits(1);
                        if (var5 == 0) {
                            var2 = class22.method333(var0, (short) -18630);
                            class83.field1223[var4] = (byte) (class83.field1223[var4] | 2);
                        } else {
                            OutboundPacket.method3670(var0, var4, (byte) 114);
                        }
                    }
                }
            }

            var0.endBitAccess();
            if (var2 != 0) {
                throw new RuntimeException();
            } else {
                var0.startBitAccess();

                for (var3 = 0; var3 < class83.field1228; ++var3) {
                    var4 = class83.field1225[var3];
                    if ((class83.field1223[var4] & 1) != 0) {
                        if (var2 > 0) {
                            --var2;
                            class83.field1223[var4] = (byte) (class83.field1223[var4] | 2);
                        } else {
                            var5 = var0.readBits(1);
                            if (var5 == 0) {
                                var2 = class22.method333(var0, (short) -3881);
                                class83.field1223[var4] = (byte) (class83.field1223[var4] | 2);
                            } else if (class86.method2162(var0, var4, -202222013)) {
                                class83.field1223[var4] = (byte) (class83.field1223[var4] | 2);
                            }
                        }
                    }
                }

                var0.endBitAccess();
                if (var2 != 0) {
                    throw new RuntimeException();
                } else {
                    var0.startBitAccess();

                    for (var3 = 0; var3 < class83.field1228; ++var3) {
                        var4 = class83.field1225[var3];
                        if ((class83.field1223[var4] & 1) == 0) {
                            if (var2 > 0) {
                                --var2;
                                class83.field1223[var4] = (byte) (class83.field1223[var4] | 2);
                            } else {
                                var5 = var0.readBits(1);
                                if (var5 == 0) {
                                    var2 = class22.method333(var0, (short) -31034);
                                    class83.field1223[var4] = (byte) (class83.field1223[var4] | 2);
                                } else if (class86.method2162(var0, var4, -202222013)) {
                                    class83.field1223[var4] = (byte) (class83.field1223[var4] | 2);
                                }
                            }
                        }
                    }

                    var0.endBitAccess();
                    if (var2 != 0) {
                        throw new RuntimeException();
                    } else {
                        class83.field1226 = 0;
                        class83.field1228 = 0;

                        for (var3 = 1; var3 < 2048; ++var3) {
                            class83.field1223[var3] = (byte) (class83.field1223[var3] >> 1);
                            Player var6 = client.players[var3];
                            if (var6 != null) {
                                class83.field1222[++class83.field1226 - 1] = var3;
                            } else {
                                class83.field1225[++class83.field1228 - 1] = var3;
                            }
                        }

                    }
                }
            }
        }
    }

    public static int method110(int var0, byte var1) {
        return var0 >> 17 & 7;
    }

    public static boolean method117(int var0) {
        return class219.field2529 != 0 ? true : class193.field2461.method4492(-865895227);
    }

    public static int method116(CharSequence var0, CharSequence var1, int var2, byte var3) {
        int var4 = var0.length();
        int var5 = var1.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;

        while (var6 - var8 < var4 || var7 - var9 < var5) {
            if (var6 - var8 >= var4) {
                return -1;
            }

            if (var7 - var9 >= var5) {
                return 1;
            }

            char var10;
            if (var8 != 0) {
                var10 = var8;
                boolean var15 = false;
            } else {
                var10 = var0.charAt(var6++);
            }

            char var11;
            if (var9 != 0) {
                var11 = var9;
                boolean var16 = false;
            } else {
                var11 = var1.charAt(var7++);
            }

            var8 = class9.method100(var10, 1861109886);
            var9 = class9.method100(var11, 1861109886);
            var10 = class99.method2421(var10, var2, -1412869221);
            var11 = class99.method2421(var11, var2, -1579337198);
            if (var11 != var10 && Character.toUpperCase(var10) != Character.toUpperCase(var11)) {
                var10 = Character.toLowerCase(var10);
                var11 = Character.toLowerCase(var11);
                if (var11 != var10) {
                    return class84.method2117(var10, var2, 324290877) - class84
                        .method2117(var11, var2, 324290877);
                }
            }
        }

        int var17 = Math.min(var4, var5);

        char var13;
        int var18;
        for (var18 = 0; var18 < var17; ++var18) {
            char var12 = var0.charAt(var18);
            var13 = var1.charAt(var18);
            if (var12 != var13 && Character.toUpperCase(var12) != Character.toUpperCase(var13)) {
                var12 = Character.toLowerCase(var12);
                var13 = Character.toLowerCase(var13);
                if (var12 != var13) {
                    return class84.method2117(var12, var2, 324290877) - class84
                        .method2117(var13, var2, 324290877);
                }
            }
        }

        var18 = var4 - var5;
        if (var18 != 0) {
            return var18;
        } else {
            for (int var19 = 0; var19 < var17; ++var19) {
                var13 = var0.charAt(var19);
                char var14 = var1.charAt(var19);
                if (var14 != var13) {
                    return class84.method2117(var13, var2, 324290877) - class84
                        .method2117(var14, var2, 324290877);
                }
            }

            return 0;
        }
    }

    void method106(Buffer var1, Buffer var2, int var3) {
        int var4 = var2.readUint8();
        if (var4 != class25.field258.field254) {
            throw new IllegalStateException("");
        } else {
            super.field150 = var2.readUint8();
            super.field148 = var2.readUint8();
            super.field146 = var2.readUint16();
            super.field151 = var2.readUint16();
            super.field147 = var2.readUint16();
            super.field149 = var2.readUint16();
            super.field148 = Math.min(super.field148, 4);
            super.field152 = new short[1][64][64];
            super.field153 = new short[super.field148][64][64];
            super.field154 = new byte[super.field148][64][64];
            super.field155 = new byte[super.field148][64][64];
            super.field156 = new class19[super.field148][64][64][];
            var4 = var1.readUint8();
            if (var4 != class24.field251.field247) {
                throw new IllegalStateException("");
            } else {
                int var5 = var1.readUint8();
                int var6 = var1.readUint8();
                if (var5 == super.field147 && var6 == super.field149) {
                    for (int var7 = 0; var7 < 64; ++var7) {
                        for (int var8 = 0; var8 < 64; ++var8) {
                            this.method181(var7, var8, var1, -979754326);
                        }
                    }

                } else {
                    throw new IllegalStateException("");
                }
            }
        }
    }

    public boolean equals(Object var1) {
        if (!(var1 instanceof class10)) {
            return false;
        } else {
            class10 var2 = (class10) var1;
            return var2.field147 == super.field147 && var2.field149 == super.field149;
        }
    }

    public int hashCode() {
        return super.field147 | super.field149 << 8;
    }
}
