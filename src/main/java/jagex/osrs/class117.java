package jagex.osrs;

public final class class117 {

    public class129 field1586;
    public long field1587;
    int field1584;
    int field1585;
    int field1583;
    int field1588;

    static void method2852(class232 var0, int var1, int var2, int var3) {
        if (var0.field2672 == 0) {
            var0.field2680 = var0.field2676;
        } else if (var0.field2672 == 1) {
            var0.field2680 = var0.field2676 + (var1 - var0.field2682) / 2;
        } else if (var0.field2672 == 2) {
            var0.field2680 = var1 - var0.field2682 - var0.field2676;
        } else if (var0.field2672 == 3) {
            var0.field2680 = var0.field2676 * var1 >> 14;
        } else if (var0.field2672 == 4) {
            var0.field2680 = (var0.field2676 * var1 >> 14) + (var1 - var0.field2682) / 2;
        } else {
            var0.field2680 = var1 - var0.field2682 - (var0.field2676 * var1 >> 14);
        }

        if (var0.field2673 == 0) {
            var0.field2772 = var0.field2751;
        } else if (var0.field2673 == 1) {
            var0.field2772 = (var2 - var0.field2683) / 2 + var0.field2751;
        } else if (var0.field2673 == 2) {
            var0.field2772 = var2 - var0.field2683 - var0.field2751;
        } else if (var0.field2673 == 3) {
            var0.field2772 = var2 * var0.field2751 >> 14;
        } else if (var0.field2673 == 4) {
            var0.field2772 = (var2 - var0.field2683) / 2 + (var2 * var0.field2751 >> 14);
        } else {
            var0.field2772 = var2 - var0.field2683 - (var2 * var0.field2751 >> 14);
        }

    }

    static final void method2851(boolean var0, int var1) {
        for (int var2 = 0; var2 < client.field686; ++var2) {
            class73 var3 = client.field806[client.field687[var2]];
            if (var3 != null && var3.vmethod1973(1563766353) && var3.field1102.field3572 == var0
                && var3.field1102.method5398(207776887)) {
                int var4 = var3.x >> 7;
                int var5 = var3.z >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var3.field964 == 1 && (var3.x & 127) == 64
                        && (var3.z & 127) == 64) {
                        if (client.field740[var4][var5] == client.field741) {
                            continue;
                        }

                        client.field740[var4][var5] = client.field741;
                    }

                    long var6 = class0
                        .method12(0, 0, 1, !var3.field1102.field3589, client.field687[var2],
                                  -1648457268);
                    var3.field943 = client.field655;
                    class243.field3173.method3092(class60.level, var3.x, var3.z,
                                                  class152.method3394(
                                                      var3.field964 * 64 - 64 + var3.x,
                                                      var3.field964 * 64 - 64 + var3.z,
                                                      class60.level, (byte) 17),
                                                  var3.field964 * 64 - 64 + 60, var3, var3.field940,
                                                  var6, var3.field941);
                }
            }
        }

    }
}
