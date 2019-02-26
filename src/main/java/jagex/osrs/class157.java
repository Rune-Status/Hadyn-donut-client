package jagex.osrs;

import java.io.File;
import java.util.Iterator;

public class class157 {

    public static BufferedFile field2038;
    public static BufferedFile blocksFile;
    public static BufferedFile manifestIndexFile;
    public static BufferedFile[] indexFiles;
    static client field2037;
    static int field2033;
    static int field2024;
    static class251 index3;
    static File field2023;
    static int field2036;

    static {
        field2038 = null;
        blocksFile = null;
        manifestIndexFile = null;
    }

    static void method3460(int var0) {
        Iterator var1 = class85.field1249.iterator();

        while (var1.hasNext()) {
            class59 var2 = (class59) var1.next();
            var2.method1138((byte) -16);
        }

    }

    public static void method3462(class249 var0, int var1) {
        class256.field3303 = var0;
        class256.field3302 = class256.field3303.method4889(16, 1064669026);
    }

    static boolean method3456(Player var0, byte var1) {
        return client.field676 == 0 ? false
            : (class69.localPlayer == var0 ? class234.method4768(1086286921)
                : class66.method1727((byte) -101) || class12.method137(-1896196282) && var0
                    .method1173(-922368349) || class181.method3738(1022302201) && var0
                    .method1176((byte) 0));
    }

    static final void method3463(int var0, int var1, int var2, int var3) {
        if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) {
            int var4 = class152.method3394(var0, var1, class60.level, (byte) 5) - var2;
            var0 -= field2036;
            var4 -= Buffer.field2409;
            var1 -= class50.field508;
            int var5 = class124.field1747[class57.field576];
            int var6 = class124.field1754[class57.field576];
            int var7 = class124.field1747[class15.field143];
            int var8 = class124.field1754[class15.field143];
            int var9 = var7 * var1 + var0 * var8 >> 16;
            var1 = var8 * var1 - var0 * var7 >> 16;
            var0 = var9;
            var9 = var4 * var6 - var5 * var1 >> 16;
            var1 = var4 * var5 + var6 * var1 >> 16;
            if (var1 >= 50) {
                client.field652 = var0 * client.field907 / var1 + client.field644 / 2;
                client.field903 = client.field764 / 2 + var9 * client.field907 / var1;
            } else {
                client.field652 = -1;
                client.field903 = -1;
            }

        } else {
            client.field652 = -1;
            client.field903 = -1;
        }
    }
}
