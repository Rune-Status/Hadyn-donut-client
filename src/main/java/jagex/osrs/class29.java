package jagex.osrs;

public class class29 {

    public static final class29 field291;
    public static final class29 field288;
    public static final class29 field290;
    public static final class29 field289;
    public static final class29 field292;
    static int[] field295;

    static {
        field291 = new class29("details");
        field288 = new class29("compositemap");
        field289 = new class29("compositetexture");
        field290 = new class29("area");
        field292 = new class29("labels");
    }

    public final String field298;

    class29(String var1) {
        this.field298 = var1;
    }

    public static class275 method532(int var0) {
        class275 var2 = (class275) class275.field3618.method4198((long) var0);
        if (var2 != null) {
            return var2;
        }

        byte[] var3 = class275.field3631.method4831(12, var0, 1789634852);
        var2 = new class275();
        if (var3 != null) {
            var2.method5464(new Buffer(var3), -1690168982);
        }

        var2.method5456(-2062242357);
        class275.field3618.method4204(var2, (long) var0);
        return var2;
    }

    static boolean method533(long var0) {
        int var2 = (int) (var0 >>> 14 & 3L);
        return var2 == 2;
    }

    public static final class323 method531(int var0, int var1, int var2, int var3, int var4,
                                           boolean var5, int var6) {
        if (var1 == -1) {
            var4 = 0;
        } else if (var4 == 2 && var1 != 1) {
            var4 = 1;
        }

        long var7 =
            ((long) var4 << 40) + (long) var0 + ((long) var1 << 16) + ((long) var2 << 38) + (
                (long) var3 << 42);
        class323 var9;
        if (!var5) {
            var9 = (class323) ItemConfig.field3546.method4198(var7);
            if (var9 != null) {
                return var9;
            }
        }

        ItemConfig var10 = ItemConfig.get(var0);
        if (var1 > 1 && var10.field3553 != null) {
            int var11 = -1;

            for (int var12 = 0; var12 < 10; ++var12) {
                if (var1 >= var10.field3542[var12] && var10.field3542[var12] != 0) {
                    var11 = var10.field3553[var12];
                }
            }

            if (var11 != -1) {
                var10 = ItemConfig.get(var11);
            }
        }

        class121 var22 = var10.method5350(1, 1390502366);
        if (var22 == null) {
            return null;
        } else {
            class323 var23 = null;
            if (var10.field3552 != -1) {
                var23 = method531(var10.field3549, 10, 1, 0, 0, true, 965420868);
                if (var23 == null) {
                    return null;
                }
            } else if (var10.field3518 != -1) {
                var23 = method531(var10.field3511, var1, var2, var3, 0, false, -1642346913);
                if (var23 == null) {
                    return null;
                }
            } else if (var10.field3510 != -1) {
                var23 = method531(var10.field3555, var1, 0, 0, 0, false, 996775076);
                if (var23 == null) {
                    return null;
                }
            }

            int[] var13 = class319.field3856;
            int var14 = class319.field3854;
            int var15 = class319.field3855;
            int[] var16 = new int[4];
            class319.method6110(var16);
            var9 = new class323(36, 32);
            class319.method6038(var9.field3889, 36, 32);
            class319.method6043();
            class124.method3000();
            class124.method2986(16, 16);
            class124.field1731 = false;
            if (var10.field3510 != -1) {
                var23.method6164(0, 0);
            }

            int var17 = var10.field3517;
            if (var5) {
                var17 = (int) (1.5D * (double) var17);
            } else if (var2 == 2) {
                var17 = (int) ((double) var17 * 1.04D);
            }

            int var18 = var17 * class124.field1747[var10.field3524] >> 16;
            int var19 = var17 * class124.field1754[var10.field3524] >> 16;
            var22.method2873();
            var22.method2925(0, var10.field3519, var10.field3520, var10.field3524, var10.field3521,
                             var22.field1840 / 2 + var18 + var10.field3522,
                             var19 + var10.field3522);
            if (var10.field3518 != -1) {
                var23.method6164(0, 0);
            }

            if (var2 >= 1) {
                var9.method6160(1);
            }

            if (var2 >= 2) {
                var9.method6160(16777215);
            }

            if (var3 != 0) {
                var9.method6161(var3);
            }

            class319.method6038(var9.field3889, 36, 32);
            if (var10.field3552 != -1) {
                var23.method6164(0, 0);
            }

            if (var4 == 1 || var4 == 2 && var10.stackable == 1) {
                class300 var20 = class140.field1931;
                String var21;
                if (var1 < 100000) {
                    var21 = "<col=ffff00>" + var1 + "</col>";
                } else if (var1 < 10000000) {
                    var21 = "<col=ffffff>" + var1 / 1000 + "K" + "</col>";
                } else {
                    var21 = "<col=00ff80>" + var1 / 1000000 + "M" + "</col>";
                }

                var20.method5846(var21, 0, 9, 16776960, 1);
            }

            if (!var5) {
                ItemConfig.field3546.method4204(var9, var7);
            }

            class319.method6038(var13, var14, var15);
            class319.method6050(var16);
            class124.method3000();
            class124.field1731 = true;
            return var9;
        }
    }

    static int method530(int var0, class86 var1, boolean var2, int var3) {
        class232 var4;
        if (var0 >= 2000) {
            var0 -= 1000;
            var4 = class18.method213(ScriptExecutor.field1070[--class60.field600], -734005908);
        } else {
            var4 = var2 ? class10.field75 : ScriptExecutor.field1080;
        }

        class37.method721(var4, 1238023037);
        if (var0 != 1200 && var0 != 1205 && var0 != 1212) {
            if (var0 == 1201) {
                var4.field2740 = 2;
                var4.field2755 = ScriptExecutor.field1070[--class60.field600];
                return 1;
            } else if (var0 == 1202) {
                var4.field2740 = 3;
                var4.field2755 = class69.localPlayer.field630.method4672(-1528803238);
                return 1;
            } else {
                return 2;
            }
        } else {
            class60.field600 -= 2;
            int var5 = ScriptExecutor.field1070[class60.field600];
            int var6 = ScriptExecutor.field1070[class60.field600 + 1];
            var4.field2793 = var5;
            var4.field2794 = var6;
            ItemConfig var7 = ItemConfig.get(var5);
            var4.field2732 = var7.field3524;
            var4.field2719 = var7.field3519;
            var4.field2720 = var7.field3520;
            var4.field2718 = var7.field3521;
            var4.field2717 = var7.field3522;
            var4.field2721 = var7.field3517;
            if (var0 == 1205) {
                var4.field2797 = 0;
            } else if (var0 == 1212 | var7.stackable == 1) {
                var4.field2797 = 1;
            } else {
                var4.field2797 = 2;
            }

            if (var4.field2722 > 0) {
                var4.field2721 = var4.field2721 * 32 / var4.field2722;
            } else if (var4.field2678 > 0) {
                var4.field2721 = var4.field2721 * 32 / var4.field2678;
            }

            return 1;
        }
    }
}
