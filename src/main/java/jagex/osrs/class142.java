package jagex.osrs;

import java.io.File;

public class class142 extends class285 {

    final boolean field1941;

    public class142(boolean var1) {
        this.field1941 = var1;
    }

    public static class256 method3328(int var0, byte var1) {
        class256 var2 = (class256) class256.field3304.method4198((long) var0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class256.field3303.method4831(16, var0, 1789634852);
            var2 = new class256();
            if (var3 != null) {
                var2.method5019(new Buffer(var3), 427124525);
            }

            class256.field3304.method4204(var2, (long) var0);
            return var2;
        }
    }

    static void method3329(File var0, byte var1) {
        class307.field3802 = var0;
        if (!class307.field3802.exists()) {
            throw new RuntimeException("");
        } else {
            class160.field2043 = true;
        }
    }

    int method3323(class289 var1, class289 var2, int var3) {
        return client.field691 == var1.field3708 && var2.field3708 == client.field691 ? (
            this.field1941 ? var1.field3706 - var2.field3706 : var2.field3706 - var1.field3706)
            : this.method5566(var1, var2, (byte) 31);
    }

    public int compare(Object var1, Object var2) {
        return this.method3323((class289) var1, (class289) var2, 2066152605);
    }
}
