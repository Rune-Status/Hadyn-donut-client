package jagex.osrs;

public class class263 extends class208 {

    public static class202 field3385;
    public static class202 field3382;
    public static class249 field3389;
    public static class249 field3380;

    static {
        field3385 = new class202(64);
        field3382 = new class202(64);
    }

    public int field3391;
    public int field3386;
    public int field3394;
    public int field3387;
    public int field3383;
    public int field3381;
    public int field3392;
    public int field3393;
    int field3379;
    int field3390;

    class263() {
        this.field3391 = 255;
        this.field3386 = 255;
        this.field3394 = -1;
        this.field3381 = 1;
        this.field3387 = 70;
        this.field3390 = -1;
        this.field3379 = -1;
        this.field3392 = 30;
        this.field3393 = 0;
    }

    void method5156(Buffer var1, int var2, int var3) {
        if (var2 == 1) {
            var1.readUint16();
        } else if (var2 == 2) {
            this.field3391 = var1.readUint8();
        } else if (var2 == 3) {
            this.field3386 = var1.readUint8();
        } else if (var2 == 4) {
            this.field3394 = 0;
        } else if (var2 == 5) {
            this.field3387 = var1.readUint16();
        } else if (var2 == 6) {
            var1.readUint8();
        } else if (var2 == 7) {
            this.field3390 = var1.method3898((byte) -26);
        } else if (var2 == 8) {
            this.field3379 = var1.method3898((byte) -32);
        } else if (var2 == 11) {
            this.field3394 = var1.readUint16();
        } else if (var2 == 14) {
            this.field3392 = var1.readUint8();
        } else if (var2 == 15) {
            this.field3393 = var1.readUint8();
        }

    }

    void method5147(Buffer var1, byte var2) {
        while (true) {
            int var3 = var1.readUint8();
            if (var3 == 0) {
                return;
            }

            this.method5156(var1, var3, -991537919);
        }
    }

    public class323 method5150(int var1) {
        if (this.field3379 < 0) {
            return null;
        } else {
            class323 var2 = (class323) field3382.method4198((long) this.field3379);
            if (var2 != null) {
                return var2;
            } else {
                var2 = class145.method3349(field3380, this.field3379, 0, (byte) 29);
                if (var2 != null) {
                    field3382.method4204(var2, (long) this.field3379);
                }

                return var2;
            }
        }
    }

    public class323 method5149(int var1) {
        if (this.field3390 < 0) {
            return null;
        } else {
            class323 var2 = (class323) field3382.method4198((long) this.field3390);
            if (var2 != null) {
                return var2;
            } else {
                var2 = class145.method3349(field3380, this.field3390, 0, (byte) -8);
                if (var2 != null) {
                    field3382.method4204(var2, (long) this.field3390);
                }

                return var2;
            }
        }
    }
}
