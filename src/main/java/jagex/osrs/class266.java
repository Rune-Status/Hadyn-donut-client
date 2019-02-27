package jagex.osrs;

public class class266 extends class208 {

    static class202 field3406;

    static {
        field3406 = new class202(64);
    }

    public int field3402;
    public String field3405;
    char field3403;
    boolean field3404;

    class266() {
        this.field3404 = true;
    }

    void method5179(Buffer var1, int var2, byte var3) {
        if (var2 == 1) {
            byte var5 = var1.method3931(2126324579);
            int var6 = var5 & 255;
            if (var6 == 0) {
                throw new IllegalArgumentException("");
            }

            if (var6 >= 128 && var6 < 160) {
                char var7 = class303.field3785[var6 - 128];
                if (var7 == 0) {
                    var7 = '?';
                }

                var6 = var7;
            }

            char var4 = (char) var6;
            this.field3403 = var4;
        } else if (var2 == 2) {
            this.field3402 = var1.getInt();
        } else if (var2 == 4) {
            this.field3404 = false;
        } else if (var2 == 5) {
            this.field3405 = var1.getString();
        }

    }

    public boolean method5180(byte var1) {
        return this.field3403 == 's';
    }

    void method5186(int var1) {
    }

    void method5176(Buffer var1, int var2) {
        while (true) {
            int var3 = var1.readUint8();
            if (var3 == 0) {
                return;
            }

            this.method5179(var1, var3, (byte) -28);
        }
    }
}
