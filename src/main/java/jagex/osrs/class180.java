package jagex.osrs;

public class class180 {

    static int field2361;

    public static boolean method3733(int var0) {
        try {
            if (class219.field2529 == 2) {
                if (class4.field39 == null) {
                    class4.field39 = class225
                        .method4626(class137.field1911, class219.field2533, ArchiveCache.field2073);
                    if (class4.field39 == null) {
                        return false;
                    }
                }

                if (class82.field1218 == null) {
                    class82.field1218 = new class100(class219.field2531, class219.field2530);
                }

                if (class193.field2461
                    .method4398(class4.field39, class219.field2535, class82.field1218, 22050,
                                1521934600)) {
                    class193.field2461.method4399(378390219);
                    class193.field2461.method4426(class318.field3851, (byte) -24);
                    class193.field2461.method4401(class4.field39, class219.field2534, 214285867);
                    class219.field2529 = 0;
                    class4.field39 = null;
                    class82.field1218 = null;
                    class137.field1911 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class193.field2461.method4521((byte) 27);
            class219.field2529 = 0;
            class4.field39 = null;
            class82.field1218 = null;
            class137.field1911 = null;
        }

        return false;
    }

    public static void method3734(int var0) {
        class23.field235.method4216(5);
        class23.field232.method4216(5);
    }

    public static void method3732(int var0) {
        class219.field2529 = 1;
        class137.field1911 = null;
        class219.field2533 = -1;
        ArchiveCache.field2073 = -1;
        class318.field3851 = 0;
        class219.field2534 = false;
        class0.field0 = var0;
    }

    static final void method3731(int var0, int var1, int var2, int var3, int var4) {
        for (int var5 = var1; var5 <= var3 + var1; ++var5) {
            for (int var6 = var0; var6 <= var0 + var2; ++var6) {
                if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
                    class50.field503[0][var6][var5] = 127;
                    if (var0 == var6 && var6 > 0) {
                        class50.field506[0][var6][var5] = class50.field506[0][var6 - 1][var5];
                    }

                    if (var6 == var0 + var2 && var6 < 103) {
                        class50.field506[0][var6][var5] = class50.field506[0][var6 + 1][var5];
                    }

                    if (var5 == var1 && var5 > 0) {
                        class50.field506[0][var6][var5] = class50.field506[0][var6][var5 - 1];
                    }

                    if (var3 + var1 == var5 && var5 < 103) {
                        class50.field506[0][var6][var5] = class50.field506[0][var6][var5 + 1];
                    }
                }
            }
        }

    }
}
