package jagex.osrs;

public class class189 {

    static class245 field2441;

    public static boolean method4028(int var0, int var1) {
        if (class148.field1970[var0]) {
            return true;
        } else if (!class232.field2757.method4832(var0, (byte) -23)) {
            return false;
        } else {
            int var2 = class232.field2757.method4889(var0, 1064669026);
            if (var2 == 0) {
                class148.field1970[var0] = true;
                return true;
            } else {
                if (class145.field1951[var0] == null) {
                    class145.field1951[var0] = new class232[var2];
                }

                for (int var3 = 0; var3 < var2; ++var3) {
                    if (class145.field1951[var0][var3] == null) {
                        byte[] var4 = class232.field2757.method4831(var0, var3, 1789634852);
                        if (var4 != null) {
                            class145.field1951[var0][var3] = new class232();
                            class145.field1951[var0][var3].field2770 = var3 + (var0 << 16);
                            if (var4[0] == -1) {
                                class145.field1951[var0][var3]
                                    .method4701(new Buffer(var4), 1861759842);
                            } else {
                                class145.field1951[var0][var3]
                                    .method4702(new Buffer(var4), -1422883307);
                            }
                        }
                    }
                }

                class148.field1970[var0] = true;
                return true;
            }
        }
    }

    static final int method4037(int var0, int var1, int var2, int var3) {
        int var4 = var0 / var2;
        int var5 = var0 & var2 - 1;
        int var6 = var1 / var2;
        int var7 = var1 & var2 - 1;
        int var8 = class177.method3702(var4, var6, -366823646);
        int var9 = class177.method3702(var4 + 1, var6, 647131011);
        int var10 = class177.method3702(var4, var6 + 1, 33427903);
        int var11 = class177.method3702(var4 + 1, var6 + 1, -546461797);
        int var13 = 65536 - class124.field1754[var5 * 1024 / var2] >> 1;
        int var12 = ((65536 - var13) * var8 >> 16) + (var9 * var13 >> 16);
        int var15 = 65536 - class124.field1754[var5 * 1024 / var2] >> 1;
        int var14 = ((65536 - var15) * var10 >> 16) + (var15 * var11 >> 16);
        int var17 = 65536 - class124.field1754[var7 * 1024 / var2] >> 1;
        int var16 = ((65536 - var17) * var12 >> 16) + (var14 * var17 >> 16);
        return var16;
    }
}
