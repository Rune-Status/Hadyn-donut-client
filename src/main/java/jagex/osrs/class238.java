package jagex.osrs;

public class class238 {

    public static void method4785(int var0) {
        if (class39.field386 != null) {
            class39 var1 = class39.field386;
            synchronized (class39.field386) {
                class39.field386 = null;
            }
        }

    }

    static final void method4784(int var0, int var1, int var2) {
        class207 var3 = client.field829[class60.level][var0][var1];
        if (var3 == null) {
            class243.field3173.method3078(class60.level, var0, var1);
        } else {
            long var4 = -99999999L;
            class81 var6 = null;

            class81 var7;
            for (var7 = (class81) var3.method4298(); var7 != null;
                 var7 = (class81) var3.method4283()) {
                class271 var8 = class84.method2125(var7.field1213, -205103429);
                long var9 = (long) var8.field3544;
                if (var8.field3523 == 1) {
                    var9 *= (long) (var7.field1214 + 1);
                }

                if (var9 > var4) {
                    var4 = var9;
                    var6 = var7;
                }
            }

            if (var6 == null) {
                class243.field3173.method3078(class60.level, var0, var1);
            } else {
                var3.method4277(var6);
                class81 var13 = null;
                class81 var12 = null;

                for (var7 = (class81) var3.method4298(); var7 != null;
                     var7 = (class81) var3.method4283()) {
                    if (var6.field1213 != var7.field1213) {
                        if (var13 == null) {
                            var13 = var7;
                        }

                        if (var7.field1213 != var13.field1213 && var12 == null) {
                            var12 = var7;
                        }
                    }
                }

                long var10 = class0.method12(var0, var1, 3, false, 0, -2018038234);
                class243.field3173.method3064(class60.level, var0, var1, class152
                                                  .method3394(var0 * 128 + 64, var1 * 128 + 64, class60.level, (byte) 114),
                                              var6, var10, var13, var12);
            }
        }
    }
}
