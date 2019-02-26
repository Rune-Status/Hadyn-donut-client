package jagex.osrs;

public class class279 {

    public static class323[] method5496(class249 var0, String var1, String var2, int var3) {
        int var4 = var0.method4825(var1, 1011742774);
        int var5 = var0.method4847(var4, var2, -910169082);
        byte[] var8 = var0.method4831(var4, var5, 1789634852);
        boolean var7;
        if (var8 == null) {
            var7 = false;
        } else {
            class125.method3051(var8, 2067081321);
            var7 = true;
        }

        class323[] var6;
        if (!var7) {
            var6 = null;
        } else {
            class323[] var9 = new class323[class324.field3893];

            for (int var10 = 0; var10 < class324.field3893; ++var10) {
                class323 var11 = var9[var10] = new class323();
                var11.field3883 = class324.field3891;
                var11.field3884 = class324.field3896;
                var11.field3881 = class324.field3890[var10];
                var11.field3882 = class324.field3892[var10];
                var11.field3879 = class324.field3895[var10];
                var11.field3887 = class258.field3334[var10];
                int var12 = var11.field3879 * var11.field3887;
                byte[] var13 = class324.field3897[var10];
                var11.field3889 = new int[var12];

                for (int var14 = 0; var14 < var12; ++var14) {
                    var11.field3889[var14] = class324.field3894[var13[var14] & 255];
                }
            }

            class324.field3890 = null;
            class324.field3892 = null;
            class324.field3895 = null;
            class258.field3334 = null;
            class324.field3894 = null;
            class324.field3897 = null;
            var6 = var9;
        }

        return var6;
    }
}
