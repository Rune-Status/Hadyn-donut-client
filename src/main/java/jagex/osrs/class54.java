package jagex.osrs;

public class class54 extends Node {

    static class204 field534;

    static {
        field534 = new class204(32);
    }

    int[] field533;
    int[] field532;

    class54() {
        this.field533 = new int[]{-1};
        this.field532 = new int[]{0};
    }

    public static int method1088(CharSequence var0, int var1) {
        int var2 = var0.length();
        int var3 = 0;

        for (int var4 = 0; var4 < var2; ++var4) {
            var3 = (var3 << 5) - var3 + class131.method3242(var0.charAt(var4), (byte) 0);
        }

        return var3;
    }

    static int method1105(int var0, class86 var1, boolean var2, int var3) {
        class232 var4;
        if (var0 >= 2000) {
            var0 -= 1000;
            var4 = class18.method213(class70.field1070[--class60.field600], -943889115);
        } else {
            var4 = var2 ? class10.field75 : class70.field1080;
        }

        if (var0 == 1927) {
            if (class70.field1075 >= 10) {
                throw new RuntimeException();
            } else if (var4.field2782 == null) {
                return 0;
            } else {
                class57 var5 = new class57();
                var5.field570 = var4;
                var5.field575 = var4.field2782;
                var5.field572 = class70.field1075 + 1;
                client.field842.method4276(var5);
                return 1;
            }
        } else {
            return 2;
        }
    }
}
