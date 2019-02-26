package jagex.osrs;

public class class86 extends class208 {

    static class202 field1261;
    static int field1260;

    static {
        field1261 = new class202(128);
    }

    int[] field1257;
    int[] field1252;
    int field1256;
    int field1254;
    int field1258;
    String[] field1255;
    int field1259;
    class199[] field1253;

    static void method2163(Buffer var0, int var1, int var2) {
        byte[] var3 = var0.bytes;
        if (client.field708 == null) {
            client.field708 = new byte[24];
        }

        class195.method4102(var3, var1, client.field708, 0, 24);
        if (class157.field2038 != null) {
            try {
                class157.field2038.seek(0L);
                class157.field2038.method2692(var0.bytes, var1, 24, (byte) -33);
            } catch (Exception var5) {
                ;
            }
        }

    }

    static boolean method2162(PacketBuffer var0, int var1, int var2) {
        int var3 = var0.readBits(2);
        int var4;
        int var5;
        int var8;
        int var9;
        int var10;
        int var11;
        if (var3 == 0) {
            if (var0.readBits(1) != 0) {
                method2162(var0, var1, -202222013);
            }

            var4 = var0.readBits(13);
            var5 = var0.readBits(13);
            boolean var13 = var0.readBits(1) == 1;
            if (var13) {
                class83.field1234[++class83.field1227 - 1] = var1;
            }

            if (client.players[var1] != null) {
                throw new RuntimeException();
            } else {
                Player var7 = client.players[var1] = new Player();
                var7.id = var1;
                if (class83.playerConfigs[var1] != null) {
                    var7.decode(class83.playerConfigs[var1]);
                }

                var7.field990 = class83.field1231[var1];
                var7.field965 = class83.field1232[var1];
                var8 = class83.field1230[var1];
                var9 = var8 >> 28;
                var10 = var8 >> 14 & 255;
                var11 = var8 & 255;
                var7.field996[0] = class83.field1224[var1];
                var7.level = (byte) var9;
                var7.method1210((var10 << 13) + var4 - class49.sceneX,
                                (var11 << 13) + var5 - class11.sceneZ, 2030321279);
                var7.field631 = false;
                return true;
            }
        } else if (var3 == 1) {
            var4 = var0.readBits(2);
            var5 = class83.field1230[var1];
            class83.field1230[var1] = (var5 & 268435455) + (((var5 >> 28) + var4 & 3) << 28);
            return false;
        } else {
            int var6;
            int var12;
            if (var3 == 2) {
                var4 = var0.readBits(5);
                var5 = var4 >> 3;
                var6 = var4 & 7;
                var12 = class83.field1230[var1];
                var8 = (var12 >> 28) + var5 & 3;
                var9 = var12 >> 14 & 255;
                var10 = var12 & 255;
                if (var6 == 0) {
                    --var9;
                    --var10;
                }

                if (var6 == 1) {
                    --var10;
                }

                if (var6 == 2) {
                    ++var9;
                    --var10;
                }

                if (var6 == 3) {
                    --var9;
                }

                if (var6 == 4) {
                    ++var9;
                }

                if (var6 == 5) {
                    --var9;
                    ++var10;
                }

                if (var6 == 6) {
                    ++var10;
                }

                if (var6 == 7) {
                    ++var9;
                    ++var10;
                }

                class83.field1230[var1] = (var9 << 14) + var10 + (var8 << 28);
                return false;
            } else {
                var4 = var0.readBits(18);
                var5 = var4 >> 16;
                var6 = var4 >> 8 & 255;
                var12 = var4 & 255;
                var8 = class83.field1230[var1];
                var9 = (var8 >> 28) + var5 & 3;
                var10 = var6 + (var8 >> 14) & 255;
                var11 = var8 + var12 & 255;
                class83.field1230[var1] = (var10 << 14) + var11 + (var9 << 28);
                return false;
            }
        }
    }

    public static void method2165(int var0, int var1) {
        class48.field484 = var0;
    }

    static class86 method2153(int var0, int var1, byte var2) {
        class86 var3 = (class86) field1261.method4198((long) (var0 << 16));
        if (var3 != null) {
            return var3;
        } else {
            String var4 = String.valueOf(var0);
            int var5 = class137.index12.method4825(var4, 1011742774);
            if (var5 == -1) {
                return null;
            } else {
                byte[] var6 = class137.index12.method4835(var5, (short) -625);
                if (var6 != null) {
                    if (var6.length <= 1) {
                        return null;
                    }

                    var3 = class80.method2052(var6, (byte) 4);
                    if (var3 != null) {
                        field1261.method4204(var3, (long) (var0 << 16));
                        return var3;
                    }
                }

                return null;
            }
        }
    }

    static String method2167(class232 var0, int var1) {
        return class9.method98(class254.method5000(var0, 2139696969), (byte) 40) == 0 ? null
            : (var0.field2752 != null && var0.field2752.trim().length() != 0 ? var0.field2752
                : null);
    }

    public static class268 method2166(int var0, int var1) {
        class268 var2 = (class268) class268.field3414.method4198((long) var0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class268.field3419.method4831(8, var0, 1789634852);
            var2 = new class268();
            if (var3 != null) {
                var2.method5223(new Buffer(var3), 448568525);
            }

            class268.field3414.method4204(var2, (long) var0);
            return var2;
        }
    }

    class199[] method2151(int var1, int var2) {
        return new class199[var1];
    }
}
