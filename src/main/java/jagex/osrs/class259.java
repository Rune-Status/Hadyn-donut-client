package jagex.osrs;

public class class259 extends class208 {

    static class202 field3339;
    static class249 field3340;

    static {
        field3339 = new class202(64);
    }

    public boolean field3341;

    class259() {
        this.field3341 = false;
    }

    static boolean method5087(int var0, int var1) {
        return var0 == 57 || var0 == 58 || var0 == 1007 || var0 == 25 || var0 == 30;
    }

    void method5078(Buffer var1, int var2, int var3) {
        if (var2 == 2) {
            this.field3341 = true;
        }

    }

    void method5080(Buffer var1, int var2) {
        while (true) {
            int var3 = var1.readUint8();
            if (var3 == 0) {
                return;
            }

            this.method5078(var1, var3, -1388161728);
        }
    }
}
