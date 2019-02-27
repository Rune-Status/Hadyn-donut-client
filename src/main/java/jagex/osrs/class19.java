package jagex.osrs;

public class class19 {

    static int[] field182;
    static int[] field183;
    static class251 index0;
    static int field189;
    static byte[][][] field188;
    final int field184;
    final int field179;
    final int field180;

    class19(int var1, int var2, int var3) {
        this.field184 = var1;
        this.field179 = var2;
        this.field180 = var3;
    }

    static final void method241(int var0) {
        if (client.field725 > 0) {
            class74.logout();
        } else {
            client.field904.method5502(-1898107601);
            client.setState(40);
            class52.field524 = client.field690.getSocket();
            client.field690.method2191((byte) -10);
        }
    }

    static String method243(int var0, int var1) {
        return "<img=" + var0 + ">";
    }

    public static boolean method244(long var0) {
        boolean var2 = 0L != var0;
        if (var2) {
            boolean var3 = (int) (var0 >>> 16 & 1L) == 1;
            var2 = !var3;
        }

        return var2;
    }

    static boolean method242(int var0, int var1) {
        for (int var2 = 0; var2 < client.field865; ++var2) {
            if (client.field867[var2] == var0) {
                return true;
            }
        }

        return false;
    }
}
