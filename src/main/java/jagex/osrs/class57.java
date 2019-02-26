package jagex.osrs;

public class class57 extends Node {

    static int field576;
    int field573;
    Object[] field575;
    class232 field570;
    int field565;
    int field566;
    class232 field568;
    int field572;
    boolean field563;
    String field571;
    int field567;
    int field569;
    int field562;

    public class57() {
        this.field573 = 76;
    }

    static void method1122(int var0, int var1, int var2) {
        int[] var3 = new int[9];

        for (int var4 = 0; var4 < var3.length; ++var4) {
            int var5 = var4 * 32 + 15 + 128;
            int var6 = var5 * 3 + 600;
            int var8 = class124.field1747[var5];
            int var10 = var1 - 334;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 100) {
                var10 = 100;
            }

            int var11 = (client.field898 - client.field897) * var10 / 100 + client.field897;
            int var9 = var11 * var6 / 256;
            var3[var4] = var8 * var9 >> 16;
        }

        class127.method3168(var3, 500, 800, var0 * 334 / var1, 334);
    }

    static int method1125(int var0, int var1) {
        class59 var2 = (class59) class85.field1249.method4185((long) var0);
        return var2 == null ? -1 : (var2.field2502 == class85.field1247.field2518 ? -1
            : ((class59) var2.field2502).field595);
    }

    static void method1117(int var0, boolean var1, int var2, boolean var3, int var4) {
        if (class66.field1017 != null) {
            class278.method5495(0, class66.field1017.length - 1, var0, var1, var2, var3, 653071948);
        }

    }

    public void method1114(Object[] var1, byte var2) {
        this.field575 = var1;
    }

    public void method1116(int var1, int var2) {
        this.field573 = var1;
    }
}
