package jagex.osrs;

import java.util.concurrent.Callable;

public class class52 implements Callable {

    static class159 field524;

    public static int method1070(int var0, int var1) {
        var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765);
        var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459);
        var0 = var0 + (var0 >>> 4) & 252645135;
        var0 += var0 >>> 8;
        var0 += var0 >>> 16;
        return var0 & 255;
    }

    public static boolean method1072(byte var0) {
        return client.rights >= 2;
    }

    public static void method1073(int var0) {
        class267.field3413.method4199();
    }

    static final void method1071(class232 var0, int var1, byte[] var2, byte[] var3, int var4) {
        if (var0.field2710 == null) {
            if (var2 == null) {
                return;
            }

            var0.field2710 = new byte[11][];
            var0.field2743 = new byte[11][];
            var0.field2765 = new int[11];
            var0.field2745 = new int[11];
        }

        var0.field2710[var1] = var2;
        if (var2 != null) {
            var0.field2724 = true;
        } else {
            var0.field2724 = false;

            for (int var5 = 0; var5 < var0.field2710.length; ++var5) {
                if (var0.field2710[var5] != null) {
                    var0.field2724 = true;
                    break;
                }
            }
        }

        var0.field2743[var1] = var3;
    }

    static final void method1064(int var0) {
        OutboundPacket var1 = class131
            .method3243(class171.field2291, client.field690.random, (byte) 55);
        var1.buffer.writeByte(0);
        client.field690.method2193(var1, 377616996);
    }

    public Object call() {
        return class273.method5403(-786347934);
    }
}
