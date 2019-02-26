package jagex.osrs;

import java.io.IOException;

public class class227 {

    public static int[] field2630;
    public static int[] field2629;
    static int[] field2627;

    static {
        field2627 = new int[32];
        int var0 = 2;

        for (int var1 = 0; var1 < 32; ++var1) {
            field2627[var1] = var0 - 1;
            var0 += var0;
        }

        field2630 = new int[4000];
        field2629 = new int[4000];
    }

    public static void method4642(boolean var0, int var1) {
        if (class252.field3263 != null) {
            try {
                Buffer var2 = new Buffer(4);
                var2.writeByte(var0 ? 2 : 3);
                var2.method3755(0, -1549188072);
                class252.field3263.vmethod3578(var2.bytes, 0, 4, -1015443147);
            } catch (IOException var5) {
                try {
                    class252.field3263.vmethod3558(-1822394002);
                } catch (Exception var4) {
                    ;
                }

                ++class252.field3278;
                class252.field3263 = null;
            }

        }
    }

    static final void method4641(int var0, int var1, int var2, int var3, byte var4) {
        for (int var5 = 0; var5 < client.field853; ++var5) {
            if (client.field819[var5] + client.field763[var5] > var0
                && client.field763[var5] < var0 + var2
                && client.field854[var5] + client.field852[var5] > var1
                && client.field852[var5] < var3 + var1) {
                client.field849[var5] = true;
            }
        }

    }
}
