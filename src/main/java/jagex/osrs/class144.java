package jagex.osrs;

public class class144 extends class285 {

    static int field1947;
    static class323[] field1945;
    final boolean field1946;

    public class144(boolean var1) {
        this.field1946 = var1;
    }

    public static final boolean method3342(int var0, int var1, class168 var2, class166 var3,
                                           int var4) {
        int var5 = var0;
        int var6 = var1;
        byte var7 = 64;
        byte var8 = 64;
        int var9 = var0 - var7;
        int var10 = var1 - var8;
        class167.field2105[var7][var8] = 99;
        class167.field2103[var7][var8] = 0;
        byte var11 = 0;
        int var12 = 0;
        class167.field2106[var11] = var0;
        byte var10001 = var11;
        int var19 = var11 + 1;
        class167.field2110[var10001] = var1;
        int[][] var13 = var3.field2101;

        while (var19 != var12) {
            var5 = class167.field2106[var12];
            var6 = class167.field2110[var12];
            var12 = var12 + 1 & 4095;
            int var17 = var5 - var9;
            int var18 = var6 - var10;
            int var14 = var5 - var3.field2097;
            int var15 = var6 - var3.field2086;
            if (var2.vmethod3646(2, var5, var6, var3, -255143762)) {
                class233.field2809 = var5;
                class167.field2107 = var6;
                return true;
            }

            int var16 = class167.field2103[var17][var18] + 1;
            if (var17 > 0 && class167.field2105[var17 - 1][var18] == 0
                && (var13[var14 - 1][var15] & 19136782) == 0
                && (var13[var14 - 1][var15 + 1] & 19136824) == 0) {
                class167.field2106[var19] = var5 - 1;
                class167.field2110[var19] = var6;
                var19 = var19 + 1 & 4095;
                class167.field2105[var17 - 1][var18] = 2;
                class167.field2103[var17 - 1][var18] = var16;
            }

            if (var17 < 126 && class167.field2105[var17 + 1][var18] == 0
                && (var13[var14 + 2][var15] & 19136899) == 0
                && (var13[var14 + 2][var15 + 1] & 19136992) == 0) {
                class167.field2106[var19] = var5 + 1;
                class167.field2110[var19] = var6;
                var19 = var19 + 1 & 4095;
                class167.field2105[var17 + 1][var18] = 8;
                class167.field2103[var17 + 1][var18] = var16;
            }

            if (var18 > 0 && class167.field2105[var17][var18 - 1] == 0
                && (var13[var14][var15 - 1] & 19136782) == 0
                && (var13[var14 + 1][var15 - 1] & 19136899) == 0) {
                class167.field2106[var19] = var5;
                class167.field2110[var19] = var6 - 1;
                var19 = var19 + 1 & 4095;
                class167.field2105[var17][var18 - 1] = 1;
                class167.field2103[var17][var18 - 1] = var16;
            }

            if (var18 < 126 && class167.field2105[var17][var18 + 1] == 0
                && (var13[var14][var15 + 2] & 19136824) == 0
                && (var13[var14 + 1][var15 + 2] & 19136992) == 0) {
                class167.field2106[var19] = var5;
                class167.field2110[var19] = var6 + 1;
                var19 = var19 + 1 & 4095;
                class167.field2105[var17][var18 + 1] = 4;
                class167.field2103[var17][var18 + 1] = var16;
            }

            if (var17 > 0 && var18 > 0 && class167.field2105[var17 - 1][var18 - 1] == 0
                && (var13[var14 - 1][var15] & 19136830) == 0
                && (var13[var14 - 1][var15 - 1] & 19136782) == 0
                && (var13[var14][var15 - 1] & 19136911) == 0) {
                class167.field2106[var19] = var5 - 1;
                class167.field2110[var19] = var6 - 1;
                var19 = var19 + 1 & 4095;
                class167.field2105[var17 - 1][var18 - 1] = 3;
                class167.field2103[var17 - 1][var18 - 1] = var16;
            }

            if (var17 < 126 && var18 > 0 && class167.field2105[var17 + 1][var18 - 1] == 0
                && (var13[var14 + 1][var15 - 1] & 19136911) == 0
                && (var13[var14 + 2][var15 - 1] & 19136899) == 0
                && (var13[var14 + 2][var15] & 19136995) == 0) {
                class167.field2106[var19] = var5 + 1;
                class167.field2110[var19] = var6 - 1;
                var19 = var19 + 1 & 4095;
                class167.field2105[var17 + 1][var18 - 1] = 9;
                class167.field2103[var17 + 1][var18 - 1] = var16;
            }

            if (var17 > 0 && var18 < 126 && class167.field2105[var17 - 1][var18 + 1] == 0
                && (var13[var14 - 1][var15 + 1] & 19136830) == 0
                && (var13[var14 - 1][var15 + 2] & 19136824) == 0
                && (var13[var14][var15 + 2] & 19137016) == 0) {
                class167.field2106[var19] = var5 - 1;
                class167.field2110[var19] = var6 + 1;
                var19 = var19 + 1 & 4095;
                class167.field2105[var17 - 1][var18 + 1] = 6;
                class167.field2103[var17 - 1][var18 + 1] = var16;
            }

            if (var17 < 126 && var18 < 126 && class167.field2105[var17 + 1][var18 + 1] == 0
                && (var13[var14 + 1][var15 + 2] & 19137016) == 0
                && (var13[var14 + 2][var15 + 2] & 19136992) == 0
                && (var13[var14 + 2][var15 + 1] & 19136995) == 0) {
                class167.field2106[var19] = var5 + 1;
                class167.field2110[var19] = var6 + 1;
                var19 = var19 + 1 & 4095;
                class167.field2105[var17 + 1][var18 + 1] = 12;
                class167.field2103[var17 + 1][var18 + 1] = var16;
            }
        }

        class233.field2809 = var5;
        class167.field2107 = var6;
        return false;
    }

    int method3335(class289 var1, class289 var2, byte var3) {
        if (var1.field3708 != 0) {
            if (var2.field3708 == 0) {
                return this.field1946 ? -1 : 1;
            }
        } else if (var2.field3708 != 0) {
            return this.field1946 ? 1 : -1;
        }

        return this.method5566(var1, var2, (byte) -6);
    }

    public int compare(Object var1, Object var2) {
        return this.method3335((class289) var1, (class289) var2, (byte) -67);
    }
}
