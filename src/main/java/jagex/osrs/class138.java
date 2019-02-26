package jagex.osrs;

import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;

public class class138 {

    static class155 field1924;
    static int field1926;
    static class322 field1925;
    final URL field1920;
    volatile byte[] field1921;
    volatile boolean field1922;

    class138(URL var1) {
        this.field1920 = var1;
    }

    static void method3292(class66 var0, int var1) {
        if (var0.method1684(-1158560872) != client.field647) {
            client.field647 = var0.method1684(-1158560872);
            boolean var2 = var0.method1684(-1158560872);
            if (var2 != class229.field2648) {
                class89.method2200((byte) 15);
                class229.field2648 = var2;
            }
        }

        class10.field79 = var0.field1019;
        client.field691 = var0.field1015;
        client.field660 = var0.field1008;
        class139.field1928 = client.field645 == 0 ? 43594 : var0.field1015 + 40000;
        class2.field23 = client.field645 == 0 ? 443 : var0.field1015 + 50000;
        class144.field1947 = class139.field1928;
    }

    public static void method3291(String var0, boolean var1, boolean var2, short var3) {
        if (var1) {
            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                try {
                    Desktop.getDesktop().browse(new URI(var0));
                    return;
                } catch (Exception var5) {
                    ;
                }
            }

            if (class45.field420.startsWith("win")) {
                class242.method4796(var0, 0, "openjs", -1270490048);
            } else if (class45.field420.startsWith("mac")) {
                class242.method4796(var0, 1, "openjs", 1635854307);
            } else {
                class242.method4796(var0, 2, "openjs", 879705095);
            }
        } else {
            class242.method4796(var0, 3, "openjs", 31177252);
        }

    }

    static int method3282(int var0, int var1, int var2) {
        class54 var3 = (class54) class54.field534.method4224((long) var0);
        return var3 == null ? 0
            : (var1 >= 0 && var1 < var3.field532.length ? var3.field532[var1] : 0);
    }

    public boolean method3286(int var1) {
        return this.field1922;
    }

    public byte[] method3281(byte var1) {
        return this.field1921;
    }
}
