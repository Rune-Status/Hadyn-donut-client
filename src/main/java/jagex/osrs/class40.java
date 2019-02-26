package jagex.osrs;

public class class40 implements class91 {

    static int field396;

    static final void method760(byte var0) {
        client.field837 = client.field828;
        class22.field221 = true;
    }

    public static final void method764(byte var0) {
        class122.field1711 = false;
        class122.field1713 = 0;
    }

    public static void method766(int var0, int var1, int var2) {
        class265 var3 = class77.method2004(var0, (byte) 99);
        int var4 = var3.field3397;
        int var5 = var3.field3399;
        int var6 = var3.field3398;
        int var7 = class227.field2627[var6 - var5];
        if (var1 < 0 || var1 > var7) {
            var1 = 0;
        }

        var7 <<= var5;
        class227.field2629[var4] = class227.field2629[var4] & ~var7 | var1 << var5 & var7;
    }

    static final void method761(String var0, short var1) {
        if (var0.equalsIgnoreCase("toggleroof")) {
            GameApplet.field435.field1029 = !GameApplet.field435.field1029;
            Player.writePreferences();
            if (GameApplet.field435.field1029) {
                class59.method1163(99, "", "Roofs are now all hidden", -1483885983);
            } else {
                class59.method1163(99, "", "Roofs will only be removed selectively", -1483885983);
            }
        }

        if (var0.equalsIgnoreCase("displayfps")) {
            client.field886 = !client.field886;
        }

        if (var0.equalsIgnoreCase("renderself")) {
            client.field762 = !client.field762;
        }

        if (var0.equalsIgnoreCase("mouseovertext")) {
            client.field791 = !client.field791;
        }

        if (client.rights >= 2) {
            if (var0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }

            if (var0.equalsIgnoreCase("showcoord")) {
                class45.field418.field3994 = !class45.field418.field3994;
            }

            if (var0.equalsIgnoreCase("fpson")) {
                client.field886 = true;
            }

            if (var0.equalsIgnoreCase("fpsoff")) {
                client.field886 = false;
            }

            if (var0.equalsIgnoreCase("gc")) {
                System.gc();
            }

            if (var0.equalsIgnoreCase("clientdrop")) {
                class19.method241(595198465);
            }
        }

        OutboundPacket var2 = class131
            .method3243(class171.field2267, client.field690.random, (byte) 23);
        var2.buffer.writeByte(var0.length() + 1);
        var2.buffer.writeString(var0);
        client.field690.method2193(var2, 1476947389);
    }

    public class97 vmethod2256(byte var1) {
        return new class44();
    }
}
