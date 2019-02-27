package jagex.osrs;

import java.lang.management.GarbageCollectorMXBean;
import java.util.Comparator;

final class class3 implements Comparator {

    static class295 field26;
    static class300 field25;
    static class323 field29;
    static GarbageCollectorMXBean field24;

    public static int method28(int var0, int var1) {
        --var0;
        var0 |= var0 >>> 1;
        var0 |= var0 >>> 2;
        var0 |= var0 >>> 4;
        var0 |= var0 >>> 8;
        var0 |= var0 >>> 16;
        return var0 + 1;
    }

    static final void method36(int var0, int var1, int var2, int var3, boolean var4, int var5) {
        if (var2 < 1) {
            var2 = 1;
        }

        if (var3 < 1) {
            var3 = 1;
        }

        int var6 = var3 - 334;
        int var7;
        if (var6 < 0) {
            var7 = client.field649;
        } else if (var6 >= 100) {
            var7 = client.field896;
        } else {
            var7 = (client.field896 - client.field649) * var6 / 100 + client.field649;
        }

        int var8 = var3 * var7 * 512 / (var2 * 334);
        int var9;
        int var10;
        short var11;
        if (var8 < client.field901) {
            var11 = client.field901;
            var7 = var11 * var2 * 334 / (var3 * 512);
            if (var7 > client.field684) {
                var7 = client.field684;
                var9 = var3 * var7 * 512 / (var11 * 334);
                var10 = (var2 - var9) / 2;
                if (var4) {
                    class319.method6037();
                    class319.method6047(var0, var1, var10, var3, -16777216);
                    class319.method6047(var0 + var2 - var10, var1, var10, var3, -16777216);
                }

                var0 += var10;
                var2 -= var10 * 2;
            }
        } else if (var8 > client.field754) {
            var11 = client.field754;
            var7 = var11 * var2 * 334 / (var3 * 512);
            if (var7 < client.field899) {
                var7 = client.field899;
                var9 = var11 * var2 * 334 / (var7 * 512);
                var10 = (var3 - var9) / 2;
                if (var4) {
                    class319.method6037();
                    class319.method6047(var0, var1, var2, var10, -16777216);
                    class319.method6047(var0, var3 + var1 - var10, var2, var10, -16777216);
                }

                var1 += var10;
                var3 -= var10 * 2;
            }
        }

        client.field907 = var3 * var7 / 334;
        if (var2 != client.field644 || var3 != client.field764) {
            ScriptCall.method1122(var2, var3, -1174946118);
        }

        client.field657 = var0;
        client.field693 = var1;
        client.field644 = var2;
        client.field764 = var3;
    }

    int method30(class2 var1, class2 var2, byte var3) {
        return var1.field19.field33 < var2.field19.field33 ? -1
            : (var2.field19.field33 == var1.field19.field33 ? 0 : 1);
    }

    public boolean equals(Object var1) {
        return super.equals(var1);
    }

    public int compare(Object var1, Object var2) {
        return this.method30((class2) var1, (class2) var2, (byte) -5);
    }
}
