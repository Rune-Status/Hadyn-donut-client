package jagex.osrs;

import javax.imageio.ImageIO;

public class class43 {

    static class90 field413;
    static long field411;

    static {
        ImageIO.setUseCache(false);
    }

    public static class190 method791(class190[] var0, int var1, int var2) {
        class190[] var3 = var0;

        for (int var4 = 0; var4 < var3.length; ++var4) {
            class190 var5 = var3[var4];
            if (var1 == var5.vmethod6130((byte) 1)) {
                return var5;
            }
        }

        return null;
    }

    static final void method790(class63 var0, short var1) {
        long var2 = 0L;
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (var0.field926 == 0) {
            var2 = class243.field3173.method3083(var0.field934, var0.field922, var0.field925);
        }

        if (var0.field926 == 1) {
            var2 = class243.field3173.method3084(var0.field934, var0.field922, var0.field925);
        }

        if (var0.field926 == 2) {
            var2 = class243.field3173.method3085(var0.field934, var0.field922, var0.field925);
        }

        if (var0.field926 == 3) {
            var2 = class243.field3173.method3182(var0.field934, var0.field922, var0.field925);
        }

        if (0L != var2) {
            int var7 = class243.field3173
                .method3087(var0.field934, var0.field922, var0.field925, var2);
            var4 = class56.method1110(var2);
            var5 = var7 & 31;
            var6 = var7 >> 6 & 3;
        }

        var0.field923 = var4;
        var0.field924 = var5;
        var0.field935 = var6;
    }

    static final int method792(int var0, int var1, int var2) {
        int var3 = class189.method4037(var0 + 45365, var1 + 91923, 4, 120115909) - 128 + (
            class189.method4037(var0 + 10294, var1 + 37821, 2, 30511308) - 128 >> 1) + (
            class189.method4037(var0, var1, 1, 123660185) - 128 >> 2);
        var3 = (int) ((double) var3 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }

        return var3;
    }

    static class78[] method787(byte var0) {
        return new class78[]{class78.field1136, class78.field1134, class78.field1139,
            class78.field1141};
    }
}
