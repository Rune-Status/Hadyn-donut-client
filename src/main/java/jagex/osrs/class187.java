package jagex.osrs;

public class class187 {

    static final int[] field2431;
    static final int[] field2432;
    static int field2433;

    static {
        field2431 = new int[2048];
        field2432 = new int[2048];
        double var0 = 0.0030679615757712823D;

        for (int var2 = 0; var2 < 2048; ++var2) {
            field2431[var2] = (int) (65536.0D * Math.sin(var0 * (double) var2));
            field2432[var2] = (int) (65536.0D * Math.cos(var0 * (double) var2));
        }

    }

    public static class255 method4011(int var0, int var1) {
        class255 var2 = (class255) class255.field3298.method4198((long) var0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class255.field3301.method4831(5, var0, 1789634852);
            var2 = new class255();
            if (var3 != null) {
                var2.method5004(new Buffer(var3), -532058353);
            }

            class255.field3298.method4204(var2, (long) var0);
            return var2;
        }
    }
}
