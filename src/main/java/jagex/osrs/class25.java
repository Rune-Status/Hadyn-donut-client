package jagex.osrs;

public class class25 {

    static final class25 field252;
    static final class25 field258;
    public static int field256;
    static int[] field253;

    static {
        field258 = new class25(0);
        field252 = new class25(1);
    }

    final int field254;

    class25(int var1) {
        this.field254 = var1;
    }

    public static class266 method479(int var0, byte var1) {
        class266 var2 = (class266) class266.field3406.method4198((long) var0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class6.field49.method4831(11, var0, 1789634852);
            var2 = new class266();
            if (var3 != null) {
                var2.method5176(new Buffer(var3), 820419216);
            }

            var2.method5186(-1772411568);
            class266.field3406.method4204(var2, (long) var0);
            return var2;
        }
    }

    public static void method478(int var0, class249 var1, int var2, int var3, int var4,
                                 boolean var5, int var6) {
        class219.field2529 = 1;
        class137.field1911 = var1;
        class219.field2533 = var2;
        ArchiveCache.field2073 = var3;
        class318.field3851 = var4;
        class219.field2534 = var5;
        class0.field0 = var0;
    }

    static final void method476(int var0) {
        for (class63 var1 = (class63) client.field688.method4298(); var1 != null;
             var1 = (class63) client.field688.method4283()) {
            if (var1.field933 > 0) {
                --var1.field933;
            }

            if (var1.field933 == 0) {
                if (var1.field923 < 0 || class114
                    .method2769(var1.field923, var1.field924, 1752301276)) {
                    class69.method1831(var1.field934, var1.field926, var1.field922, var1.field925,
                                       var1.field923, var1.field935, var1.field924, 800548389);
                    var1.unlink();
                }
            } else {
                if (var1.field932 > 0) {
                    --var1.field932;
                }

                if (var1.field932 == 0 && var1.field922 >= 1 && var1.field925 >= 1
                    && var1.field922 <= 102 && var1.field925 <= 102 && (var1.field929 < 0
                    || class114.method2769(var1.field929, var1.field931, 1725549320))) {
                    class69.method1831(var1.field934, var1.field926, var1.field922, var1.field925,
                                       var1.field929, var1.field930, var1.field931, 2074421450);
                    var1.field932 = -1;
                    if (var1.field923 == var1.field929 && var1.field923 == -1) {
                        var1.unlink();
                    } else if (var1.field929 == var1.field923 && var1.field930 == var1.field935
                        && var1.field931 == var1.field924) {
                        var1.unlink();
                    }
                }
            }
        }

    }

    static void method480(int var0, int var1) {
        if (var0 != -1) {
            if (class189.method4028(var0, 1156425740)) {
                class232[] var2 = class145.field1951[var0];

                for (int var3 = 0; var3 < var2.length; ++var3) {
                    class232 var4 = var2[var3];
                    if (var4.field2754 != null) {
                        class57 var5 = new class57();
                        var5.field570 = var4;
                        var5.field575 = var4.field2754;
                        client.method1655(var5, 5000000, 1700616346);
                    }
                }

            }
        }
    }

    public static String method477(CharSequence[] var0, int var1, int var2, int var3) {
        if (var2 == 0) {
            return "";
        } else if (var2 == 1) {
            CharSequence var4 = var0[var1];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var9 = var2 + var1;
            int var5 = 0;

            for (int var6 = var1; var6 < var9; ++var6) {
                CharSequence var7 = var0[var6];
                if (var7 == null) {
                    var5 += 4;
                } else {
                    var5 += var7.length();
                }
            }

            StringBuilder var10 = new StringBuilder(var5);

            for (int var11 = var1; var11 < var9; ++var11) {
                CharSequence var8 = var0[var11];
                if (var8 == null) {
                    var10.append("null");
                } else {
                    var10.append(var8);
                }
            }

            return var10.toString();
        }
    }
}
