package jagex.osrs;

public class class278 {

    static class322[] field3642;

    static final void method5494(class322 var0, int var1) {
        short var2 = 256;

        int var3;
        for (var3 = 0; var3 < class62.field640.length; ++var3) {
            class62.field640[var3] = 0;
        }

        int var4;
        for (var3 = 0; var3 < 5000; ++var3) {
            var4 = (int) (Math.random() * 128.0D * (double) var2);
            class62.field640[var4] = (int) (Math.random() * 256.0D);
        }

        int var5;
        int var6;
        for (var3 = 0; var3 < 20; ++var3) {
            for (var4 = 1; var4 < var2 - 1; ++var4) {
                for (var5 = 1; var5 < 127; ++var5) {
                    var6 = var5 + (var4 << 7);
                    class32.field322[var6] =
                        (class62.field640[var6 - 128] + class62.field640[var6 + 1]
                            + class62.field640[var6 + 128] + class62.field640[var6 - 1]) / 4;
                }
            }

            int[] var9 = class62.field640;
            class62.field640 = class32.field322;
            class32.field322 = var9;
        }

        if (var0 != null) {
            var3 = 0;

            for (var4 = 0; var4 < var0.field3873; ++var4) {
                for (var5 = 0; var5 < var0.field3872; ++var5) {
                    if (var0.field3870[var3++] != 0) {
                        var6 = var5 + var0.field3874 + 16;
                        int var7 = var4 + var0.field3877 + 16;
                        int var8 = var6 + (var7 << 7);
                        class62.field640[var8] = 0;
                    }
                }
            }
        }

    }

    static void method5495(int var0, int var1, int var2, boolean var3, int var4, boolean var5,
                           int var6) {
        if (var0 < var1) {
            int var7 = (var0 + var1) / 2;
            int var8 = var0;
            class66 var9 = class66.field1017[var7];
            class66.field1017[var7] = class66.field1017[var1];
            class66.field1017[var1] = var9;

            for (int var10 = var0; var10 < var1; ++var10) {
                class66 var12 = class66.field1017[var10];
                int var13 = class135.method3265(var12, var9, var2, var3, -565177887);
                int var11;
                if (var13 != 0) {
                    if (var3) {
                        var11 = -var13;
                    } else {
                        var11 = var13;
                    }
                } else if (var4 == -1) {
                    var11 = 0;
                } else {
                    int var14 = class135.method3265(var12, var9, var4, var5, -416027757);
                    if (var5) {
                        var11 = -var14;
                    } else {
                        var11 = var14;
                    }
                }

                if (var11 <= 0) {
                    class66 var15 = class66.field1017[var10];
                    class66.field1017[var10] = class66.field1017[var8];
                    class66.field1017[var8++] = var15;
                }
            }

            class66.field1017[var1] = class66.field1017[var8];
            class66.field1017[var8] = var9;
            method5495(var0, var8 - 1, var2, var3, var4, var5, 916898456);
            method5495(var8 + 1, var1, var2, var3, var4, var5, 463967175);
        }

    }
}
