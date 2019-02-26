package jagex.osrs;

public class class24 {

    static final class24 field251;
    static final class24 field245;

    static {
        field251 = new class24(0);
        field245 = new class24(1);
    }

    final int field247;

    class24(int var1) {
        this.field247 = var1;
    }

    static class132 method475(int var0, byte var1) {
        class132 var2 = (class132) class275.field3619.method4198((long) var0);
        if (var2 != null) {
            return var2;
        } else {
            class249 var4 = class275.field3616;
            class249 var5 = class275.field3617;
            boolean var6 = true;
            int[] var7 = var4.method4839(var0, -1155394537);

            for (int var8 = 0; var8 < var7.length; ++var8) {
                byte[] var9 = var4.method4836(var0, var7[var8], 2050923780);
                if (var9 == null) {
                    var6 = false;
                } else {
                    int var10 = (var9[0] & 255) << 8 | var9[1] & 255;
                    byte[] var11 = var5.method4836(var10, 0, 1655654258);
                    if (var11 == null) {
                        var6 = false;
                    }
                }
            }

            class132 var3;
            if (!var6) {
                var3 = null;
            } else {
                try {
                    var3 = new class132(var4, var5, var0, false);
                } catch (Exception var13) {
                    var3 = null;
                }
            }

            if (var3 != null) {
                class275.field3619.method4204(var3, (long) var0);
            }

            return var3;
        }
    }

    public static class261 method474(int var0, int var1) {
        class261 var2 = (class261) class261.field3359.method4198((long) var0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class261.field3365.method4831(1, var0, 1789634852);
            var2 = new class261();
            if (var3 != null) {
                var2.method5126(new Buffer(var3), var0, (byte) 2);
            }

            var2.method5111((byte) -8);
            class261.field3359.method4204(var2, (long) var0);
            return var2;
        }
    }

    static void method472(int var0, int var1) {
        client.field718 = var0;
    }

    public static boolean method473(char var0, int var1) {
        return var0 >= ' ' && var0 <= '~' ? true : (var0 >= 160 && var0 <= 255 ? true
            : var0 == 8364 || var0 == 338 || var0 == 8212 || var0 == 339 || var0 == 376);
    }
}
