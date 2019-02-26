package jagex.osrs;

public class class248 extends class208 {

    static int field3222;
    byte field3221;
    class251 field3219;
    int field3220;

    public static class273 method4823(int var0, int var1) {
        class273 var2 = (class273) class273.field3566.method4198((long) var0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class273.field3597.method4831(9, var0, 1789634852);
            var2 = new class273();
            var2.field3568 = var0;
            if (var3 != null) {
                var2.method5417(new Buffer(var3), -1697913779);
            }

            var2.method5392((byte) -46);
            class273.field3566.method4204(var2, (long) var0);
            return var2;
        }
    }

    static class323 method4824(int var0) {
        class323 var1 = new class323();
        var1.field3883 = class324.field3891;
        var1.field3884 = class324.field3896;
        var1.field3881 = class324.field3890[0];
        var1.field3882 = class324.field3892[0];
        var1.field3879 = class324.field3895[0];
        var1.field3887 = class258.field3334[0];
        int var2 = var1.field3887 * var1.field3879;
        byte[] var3 = class324.field3897[0];
        var1.field3889 = new int[var2];

        for (int var4 = 0; var4 < var2; ++var4) {
            var1.field3889[var4] = class324.field3894[var3[var4] & 255];
        }

        class324.field3890 = null;
        class324.field3892 = null;
        class324.field3895 = null;
        class258.field3334 = null;
        class324.field3894 = null;
        class324.field3897 = null;
        return var1;
    }
}
