package jagex.osrs;

public class class56 extends Node {

    boolean field555;
    int field556;
    int field560;

    class56() {
        this.field555 = false;
    }

    static void method1108(int var0, int var1, int var2) {
        int var3 = class163.field2066.method5793("Choose Option");

        int var4;
        int var5;
        for (var4 = 0; var4 < client.field780; ++var4) {
            var5 = class163.field2066.method5793(class34.method644(var4, (byte) -27));
            if (var5 > var3) {
                var3 = var5;
            }
        }

        var3 += 8;
        var4 = client.field780 * 15 + 22;
        var5 = var0 - var3 / 2;
        if (var5 + var3 > class68.windowWidth) {
            var5 = class68.windowWidth - var3;
        }

        if (var5 < 0) {
            var5 = 0;
        }

        int var6 = var1;
        if (var1 + var4 > class141.windowHeight) {
            var6 = class141.windowHeight - var4;
        }

        if (var6 < 0) {
            var6 = 0;
        }

        class163.field2067 = var5;
        class86.field1260 = var6;
        class74.field1113 = var3;
        class128.field1838 = client.field780 * 15 + 22;
    }

    public static void method1112(byte var0) {
        class229.field2636.method4199();
    }

    public static int method1110(long var0) {
        return (int) (var0 >>> 17 & 4294967295L);
    }

    static String method1109(String var0, boolean var1, byte var2) {
        String var3 = var1 ? "https://" : "http://";
        if (client.field645 == 1) {
            var0 = var0 + "-wtrc";
        } else if (client.field645 == 2) {
            var0 = var0 + "-wtqa";
        } else if (client.field645 == 3) {
            var0 = var0 + "-wtwip";
        } else if (client.field645 == 5) {
            var0 = var0 + "-wti";
        } else if (client.field645 == 4) {
            var0 = "local";
        }

        String var4 = "";
        if (class6.parameters != null) {
            var4 = "/p=" + class6.parameters;
        }

        String var5 = "runescape.com";
        return var3 + var0 + "." + var5 + "/l=" + client.field785 + "/a=" + client.affiliateId + var4
            + "/";
    }

    static final void method1111(int var0, int var1, int var2, int var3, class323 var4,
                                 class226 var5, int var6) {
        if (var4 != null) {
            int var7 = client.field658 & 2047;
            int var8 = var3 * var3 + var2 * var2;
            if (var8 <= 6400) {
                int var9 = class124.field1747[var7];
                int var10 = class124.field1754[var7];
                int var11 = var10 * var2 + var3 * var9 >> 16;
                int var12 = var3 * var10 - var9 * var2 >> 16;
                if (var8 > 2500) {
                    var4.method6179(var11 + var5.field2626 / 2 - var4.field3883 / 2,
                                    var5.field2621 / 2 - var12 - var4.field3884 / 2, var0, var1,
                                    var5.field2626, var5.field2621, var5.field2623, var5.field2622);
                } else {
                    var4.method6164(var0 + var11 + var5.field2626 / 2 - var4.field3883 / 2,
                                    var5.field2621 / 2 + var1 - var12 - var4.field3884 / 2);
                }

            }
        }
    }
}
