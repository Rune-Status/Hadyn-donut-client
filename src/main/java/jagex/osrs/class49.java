package jagex.osrs;

public final class class49 {

    static int sceneX;
    static class323[] field489;

    public static void method1023(int var0, int var1, int var2, boolean var3, int var4) {
        OutboundPacket var5 = class131
            .method3243(class171.field2211, client.field690.random, (byte) 8);
        var5.buffer.method3893(var3 ? client.field659 : 0, (byte) 33);
        var5.buffer.method3869(var1, (byte) 1);
        var5.buffer.method3796(var2, -987074513);
        var5.buffer.writeShort(var0);
        client.field690.method2193(var5, 1521789682);
    }

    static void method1024(boolean var0, int var1) {
        class79.field1165 = "";
        class79.field1166 = "Enter your username/email & password.";
        class79.field1167 = "";
        class79.field1163 = 2;
        if (var0) {
            class79.password = "";
        }

        if (class79.username == null || class79.username.length() <= 0) {
            if (GameApplet.field435.field1034 != null) {
                class79.username = GameApplet.field435.field1034;
                client.field746 = true;
            } else {
                client.field746 = false;
            }
        }

        if (client.field746 && class79.username != null && class79.username.length() > 0) {
            class79.field1150 = 1;
        } else {
            class79.field1150 = 0;
        }

    }
}
