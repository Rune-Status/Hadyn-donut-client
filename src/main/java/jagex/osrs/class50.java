package jagex.osrs;

public final class class50 {

    static final int[] field491;
    static final int[] field499;
    static final int[] field497;
    static final int[] field501;
    static final int[] field502;
    static final int[] field507;
    static int[][][] field506;
    static byte[][][] field492;
    static class251 index2;
    static int field493;
    static int field504;
    static int field498;
    static class322[] field513;
    static class232 field495;
    static int field508;
    static byte[][][] field494;
    static byte[][][] field503;
    static int[][] field496;
    static int[] field510;

    static {
        field506 = new int[4][105][105];
        field492 = new byte[4][104][104];
        field493 = 99;
        field491 = new int[]{1, 2, 4, 8};
        field499 = new int[]{16, 32, 64, 128};
        field497 = new int[]{1, 0, -1, 0};
        field501 = new int[]{0, -1, 0, 1};
        field502 = new int[]{1, -1, -1, 1};
        field507 = new int[]{-1, -1, 1, 1};
        field504 = (int) (Math.random() * 17.0D) - 8;
        field498 = (int) (Math.random() * 33.0D) - 16;
    }

    static int method1031(int var0, class86 var1, boolean var2, byte var3) {
        int var4;
        int var5;
        if (var0 == 100) {
            class60.field600 -= 3;
            var4 = class70.field1070[class60.field600];
            var5 = class70.field1070[class60.field600 + 1];
            int var6 = class70.field1070[class60.field600 + 2];
            if (var5 == 0) {
                throw new RuntimeException();
            } else {
                class232 var7 = class18.method213(var4, -1222610389);
                if (var7.field2791 == null) {
                    var7.field2791 = new class232[var6 + 1];
                }

                if (var7.field2791.length <= var6) {
                    class232[] var8 = new class232[var6 + 1];

                    for (int var9 = 0; var9 < var7.field2791.length; ++var9) {
                        var8[var9] = var7.field2791[var9];
                    }

                    var7.field2791 = var8;
                }

                if (var6 > 0 && var7.field2791[var6 - 1] == null) {
                    throw new RuntimeException("" + (var6 - 1));
                } else {
                    class232 var13 = new class232();
                    var13.field2808 = var5;
                    var13.field2700 = var13.field2770 = var7.field2770;
                    var13.field2787 = var6;
                    var13.field2685 = true;
                    var7.field2791[var6] = var13;
                    if (var2) {
                        class10.field75 = var13;
                    } else {
                        class70.field1080 = var13;
                    }

                    class37.method721(var7, 1238023037);
                    return 1;
                }
            }
        } else {
            class232 var10;
            if (var0 == 101) {
                var10 = var2 ? class10.field75 : class70.field1080;
                class232 var11 = class18.method213(var10.field2770, -1798782347);
                var11.field2791[var10.field2787] = null;
                class37.method721(var11, 1238023037);
                return 1;
            } else if (var0 == 102) {
                var10 = class18.method213(class70.field1070[--class60.field600], -634525794);
                var10.field2791 = null;
                class37.method721(var10, 1238023037);
                return 1;
            } else if (var0 != 200) {
                if (var0 == 201) {
                    var10 = class18.method213(class70.field1070[--class60.field600], -1795991905);
                    if (var10 != null) {
                        class70.field1070[++class60.field600 - 1] = 1;
                        if (var2) {
                            class10.field75 = var10;
                        } else {
                            class70.field1080 = var10;
                        }
                    } else {
                        class70.field1070[++class60.field600 - 1] = 0;
                    }

                    return 1;
                } else {
                    return 2;
                }
            } else {
                class60.field600 -= 2;
                var4 = class70.field1070[class60.field600];
                var5 = class70.field1070[class60.field600 + 1];
                class232 var12 = class9.method102(var4, var5, 1397460264);
                if (var12 != null && var5 != -1) {
                    class70.field1070[++class60.field600 - 1] = 1;
                    if (var2) {
                        class10.field75 = var12;
                    } else {
                        class70.field1080 = var12;
                    }
                } else {
                    class70.field1070[++class60.field600 - 1] = 0;
                }

                return 1;
            }
        }
    }

    public static int method1058(boolean var0, boolean var1, byte var2) {
        byte var3 = 0;
        int var4 = var3 + class252.field3262 + class252.field3264;
        return var4;
    }
}
