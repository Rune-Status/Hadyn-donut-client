package jagex.osrs;

public class class265 extends class208 {

    public static class202 field3396;
    static class322 field3401;
    static class249 field3400;

    static {
        field3396 = new class202(64);
    }

    public int field3397;
    public int field3399;
    public int field3398;

    void method5169(Buffer var1, int var2, int var3) {
        if (var2 == 1) {
            this.field3397 = var1.readUint16();
            this.field3399 = var1.readUint8();
            this.field3398 = var1.readUint8();
        }

    }

    void method5165(Buffer var1, int var2) {
        while (true) {
            int var3 = var1.readUint8();
            if (var3 == 0) {
                return;
            }

            this.method5169(var1, var3, 1853206793);
        }
    }
}
