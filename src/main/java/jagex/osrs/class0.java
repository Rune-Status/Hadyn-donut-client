package jagex.osrs;

import java.util.Comparator;

final class class0 implements Comparator {

    public static int field0;

    public static class259 method0(int var0, byte var1) {
        class259 var2 = (class259) class259.field3339.method4198((long) var0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class259.field3340.method4831(15, var0, 1789634852);
            var2 = new class259();
            if (var3 != null) {
                var2.method5080(new Buffer(var3), 2012780847);
            }

            class259.field3339.method4204(var2, (long) var0);
            return var2;
        }
    }

    static void method11(int var0) {
        for (class56 var1 = (class56) client.field804.method4235(); var1 != null;
             var1 = (class56) client.field804.method4229()) {
            int var2 = var1.field556;
            if (class189.method4028(var2, 602506200)) {
                boolean var3 = true;
                class232[] var4 = class145.field1951[var2];

                int var5;
                for (var5 = 0; var5 < var4.length; ++var5) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field2685;
                        break;
                    }
                }

                if (!var3) {
                    var5 = (int) var1.key;
                    class232 var6 = class18.method213(var5, -1067295075);
                    if (var6 != null) {
                        class37.method721(var6, 1238023037);
                    }
                }
            }
        }

    }

    static void method10(int var0, int var1) {
        class51.field520 = new class76();
        class51.field520.field1125 = client.field781[var0];
        class51.field520.field1124 = client.field782[var0];
        class51.field520.field1123 = client.field783[var0];
        class51.field520.field1126 = client.field784[var0];
        class51.field520.field1127 = client.field916[var0];
    }

    public static long method12(int var0, int var1, int var2, boolean var3, int var4, int var5) {
        long var6 = (long) ((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14)
            | ((long) var4 & 4294967295L) << 17;
        if (var3) {
            var6 |= 65536L;
        }

        return var6;
    }

    static class66 method2(int var0) {
        class66.field1014 = 0;
        return class17.method208((byte) 37);
    }

    int method1(class2 var1, class2 var2, int var3) {
        return var1.field17 < var2.field17 ? -1 : (var2.field17 == var1.field17 ? 0 : 1);
    }

    public boolean equals(Object var1) {
        return super.equals(var1);
    }

    public int compare(Object var1, Object var2) {
        return this.method1((class2) var1, (class2) var2, -1058596839);
    }
}
