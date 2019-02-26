package jagex.osrs;

public class class22 {

    protected static String field222;
    static boolean field221;
    static int field220;
    String field223;
    class12 field216;
    int field214;
    int field215;

    class22(String var1, int var2, int var3, class12 var4) {
        this.field223 = var1;
        this.field214 = var2;
        this.field215 = var3;
        this.field216 = var4;
    }

    static int method333(PacketBuffer var0, short var1) {
        int var2 = var0.readBits(2);
        int var3;
        if (var2 == 0) {
            var3 = 0;
        } else if (var2 == 1) {
            var3 = var0.readBits(5);
        } else if (var2 == 2) {
            var3 = var0.readBits(8);
        } else {
            var3 = var0.readBits(11);
        }

        return var3;
    }

    public static String method332(Buffer var0, byte var1) {
        return class120.method2865(var0, 32767, (short) 3996);
    }

    public static int method334(long var0) {
        return (int) (var0 >>> 0 & 127L);
    }
}
