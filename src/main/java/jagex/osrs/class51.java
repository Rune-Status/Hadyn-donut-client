package jagex.osrs;

import java.io.File;

public class class51 {

    static File field519;
    static class76 field520;
    int field523;
    class86 field521;
    int[] field514;
    String[] field517;

    class51() {
        this.field523 = -1;
    }

    public static void method1062(int var0) {
        class275.field3618.method4199();
        class275.field3619.method4199();
    }

    static final boolean method1061(class121 var0, int var1, int var2, int var3, byte var4) {
        boolean var5 = class122.field1711;
        if (!var5) {
            return false;
        } else {
            int var6;
            int var7;
            int var8;
            int var9;
            int var12;
            int var13;
            int var14;
            int var17;
            int var18;
            if (!class122.field1708) {
                var6 = class127.field1769;
                var7 = class127.field1796;
                var8 = class127.field1797;
                var9 = class127.field1798;
                byte var10 = 50;
                short var11 = 3500;
                var12 = (class122.field1712 - class124.field1739) * var10 / class124.field1741;
                var13 = (class122.field1715 - class124.field1730) * var10 / class124.field1741;
                var14 = (class122.field1712 - class124.field1739) * var11 / class124.field1741;
                int var15 = (class122.field1715 - class124.field1730) * var11 / class124.field1741;
                int var16 = class124.method2998(var13, var10, var7, var6);
                var17 = class124.method3012(var13, var10, var7, var6);
                var13 = var16;
                var16 = class124.method2998(var15, var11, var7, var6);
                var18 = class124.method3012(var15, var11, var7, var6);
                var15 = var16;
                var16 = class124.method2988(var12, var17, var9, var8);
                var17 = class124.method2997(var12, var17, var9, var8);
                var12 = var16;
                var16 = class124.method2988(var14, var18, var9, var8);
                var18 = class124.method2997(var14, var18, var9, var8);
                class122.field1709 = (var12 + var16) / 2;
                class55.field552 = (var15 + var13) / 2;
                class60.field605 = (var18 + var17) / 2;
                class248.field3222 = (var16 - var12) / 2;
                class84.field1243 = (var15 - var13) / 2;
                class114.field1513 = (var18 - var17) / 2;
                class294.field3725 = Math.abs(class248.field3222);
                class40.field396 = Math.abs(class84.field1243);
                class292.field3719 = Math.abs(class114.field1513);
            }

            var6 = var0.field1676 + var1;
            var7 = var2 + var0.field1671;
            var8 = var3 + var0.field1658;
            var9 = var0.field1673;
            var17 = var0.field1674;
            var18 = var0.field1691;
            var12 = class122.field1709 - var6;
            var13 = class55.field552 - var7;
            var14 = class60.field605 - var8;
            return Math.abs(var12) > var9 + class294.field3725 ? false
                : (Math.abs(var13) > var17 + class40.field396 ? false
                    : (Math.abs(var14) > var18 + class292.field3719 ? false
                        : (Math.abs(var14 * class84.field1243 - var13 * class114.field1513)
                            > var18 * class40.field396 + var17 * class292.field3719 ? false
                            : (Math.abs(var12 * class114.field1513 - var14 * class248.field3222)
                                > var18 * class294.field3725 + var9 * class292.field3719 ? false
                                : Math.abs(var13 * class248.field3222 - var12 * class84.field1243)
                                    <= var17 * class294.field3725 + var9 * class40.field396))));
        }
    }

    public static class309 method1060(int var0, int var1) {
        class309[] var2 = new class309[]{class309.field3806, class309.field3808,
            class309.field3805};
        class309[] var3 = var2;

        for (int var4 = 0; var4 < var3.length; ++var4) {
            class309 var5 = var3[var4];
            if (var0 == var5.field3807) {
                return var5;
            }
        }

        return null;
    }
}
