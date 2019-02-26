package jagex.osrs;

import java.util.HashMap;

public class class298 {

    class249 field3751;
    class249 field3750;
    HashMap field3752;

    public class298(class249 var1, class249 var2) {
        this.field3751 = var1;
        this.field3750 = var2;
        this.field3752 = new HashMap();
    }

    public HashMap method5771(class297[] var1, int var2) {
        HashMap var3 = new HashMap();
        class297[] var4 = var1;

        for (int var5 = 0; var5 < var4.length; ++var5) {
            class297 var6 = var4[var5];
            if (this.field3752.containsKey(var6)) {
                var3.put(var6, this.field3752.get(var6));
            } else {
                class249 var8 = this.field3751;
                class249 var9 = this.field3750;
                String var10 = var6.field3748;
                int var11 = var8.method4825(var10, 1011742774);
                int var12 = var8.method4847(var11, "", 924003172);
                class300 var13;
                if (!class17.method212(var8, var11, var12, (byte) 1)) {
                    var13 = null;
                } else {
                    byte[] var15 = var9.method4831(var11, var12, 1789634852);
                    class300 var14;
                    if (var15 == null) {
                        var14 = null;
                    } else {
                        class300 var16 = new class300(var15, class324.field3890, class324.field3892,
                                                      class324.field3895, class258.field3334,
                                                      class324.field3894, class324.field3897);
                        class324.field3890 = null;
                        class324.field3892 = null;
                        class324.field3895 = null;
                        class258.field3334 = null;
                        class324.field3894 = null;
                        class324.field3897 = null;
                        var14 = var16;
                    }

                    var13 = var14;
                }

                if (var13 != null) {
                    this.field3752.put(var6, var13);
                    var3.put(var6, var13);
                }
            }
        }

        return var3;
    }
}
