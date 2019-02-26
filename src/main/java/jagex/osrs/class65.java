package jagex.osrs;

public class class65 extends Node {

    int field1006;
    int field1004;
    int field1002;
    int field1003;

    class65(int var1, int var2, int var3, int var4) {
        this.field1006 = var1;
        this.field1004 = var2;
        this.field1002 = var3;
        this.field1003 = var4;
    }

    static int method1683(int var0, int var1, byte var2) {
        class274 var4 = (class274) class274.field3601.method4198((long) var0);
        class274 var3;
        if (var4 != null) {
            var3 = var4;
        } else {
            byte[] var5 = class274.field3611.method4831(4, var0, 1789634852);
            var4 = new class274();
            if (var5 != null) {
                var4.method5452(new Buffer(var5), var0, (byte) -100);
            }

            var4.method5432((short) -23349);
            class274.field3601.method4204(var4, (long) var0);
            var3 = var4;
        }

        if (var3 == null) {
            return var1;
        } else if (var3.field3606 >= 0) {
            return var3.field3606 | -16777216;
        } else if (var3.field3604 >= 0) {
            int var11 = class123
                .method2974(class124.field1752.vmethod3247(var3.field3604, -1345426295), 96,
                            (byte) -8);
            return class124.field1749[var11] | -16777216;
        } else if (var3.field3603 == 16711935) {
            return var1;
        } else {
            int var6 = var3.field3607;
            int var7 = var3.field3608;
            int var8 = var3.field3610;
            if (var8 > 179) {
                var7 /= 2;
            }

            if (var8 > 192) {
                var7 /= 2;
            }

            if (var8 > 217) {
                var7 /= 2;
            }

            if (var8 > 243) {
                var7 /= 2;
            }

            int var9 = (var7 / 32 << 7) + var8 / 2 + (var6 / 4 << 10);
            int var10 = class123.method2974(var9, 96, (byte) -36);
            return class124.field1749[var10] | -16777216;
        }
    }

    public static final void method1682(int var0, boolean var1, int var2, int var3) {
        if (var0 >= 8000 && var0 <= 48000) {
            class97.field1377 = var0;
            class26.field264 = var1;
            class19.field189 = var2;
        } else {
            throw new IllegalArgumentException();
        }
    }

    void method1681(int var1, int var2, int var3, int var4, int var5) {
        this.field1006 = var1;
        this.field1004 = var2;
        this.field1002 = var3;
        this.field1003 = var4;
    }
}
