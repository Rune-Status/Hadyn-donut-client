package jagex.osrs;

public class class244 implements class190 {

    static final class244 field3191;
    static final class244 field3182;
    static final class244 field3181;
    static final class244 field3184;
    static final class244 field3183;
    static final class244 field3189;

    static {
        field3191 = new class244(0, -1, true, false, true);
        field3182 = new class244(1, 0, true, true, true);
        field3181 = new class244(2, 1, true, true, false);
        field3184 = new class244(3, 2, false, false, true);
        field3183 = new class244(4, 3, false, false, true);
        field3189 = new class244(5, 10, false, false, true);
    }

    public final int field3185;
    public final boolean field3188;
    public final boolean field3190;
    final int field3187;

    class244(int var1, int var2, boolean var3, boolean var4, boolean var5) {
        this.field3187 = var1;
        this.field3185 = var2;
        this.field3188 = var4;
        this.field3190 = var5;
    }

    static class232 method4799(class232 var0, int var1) {
        int var2 = class10.method110(class254.method5000(var0, 2119304179), (byte) -107);
        if (var2 == 0) {
            return null;
        } else {
            for (int var3 = 0; var3 < var2; ++var3) {
                var0 = class18.method213(var0.field2700, -1933589061);
                if (var0 == null) {
                    return null;
                }
            }

            return var0;
        }
    }

    public int vmethod6130(byte var1) {
        return this.field3187;
    }
}
