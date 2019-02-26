package jagex.osrs;

import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

public final class class42 extends Canvas {

    static class251 index1;
    static int field405;
    Component field404;

    class42(Component var1) {
        this.field404 = var1;
    }

    static boolean method784(class232 var0, int var1) {
        return var0.field2704;
    }

    static final void method783(int var0) {
        OutboundPacket var1 = class131
            .method3243(class171.field2227, client.field690.random, (byte) 52);
        client.field690.method2193(var1, 752770943);

        for (class56 var2 = (class56) client.field804.method4235(); var2 != null;
             var2 = (class56) client.field804.method4229()) {
            if (var2.field560 == 0 || var2.field560 == 3) {
                class6.method67(var2, true, (short) 180);
            }
        }

        if (client.field880 != null) {
            class37.method721(client.field880, 1238023037);
            client.field880 = null;
        }

    }

    static int method786(int var0, class86 var1, boolean var2, byte var3) {
        class232 var4 = class18.method213(class70.field1070[--class60.field600], -531497740);
        if (var0 == 2800) {
            class70.field1070[++class60.field600 - 1] = class9
                .method98(class254.method5000(var4, 2099543406), (byte) -84);
            return 1;
        } else if (var0 != 2801) {
            if (var0 == 2802) {
                if (var4.field2697 == null) {
                    class70.field1065[++class70.field1072 - 1] = "";
                } else {
                    class70.field1065[++class70.field1072 - 1] = var4.field2697;
                }

                return 1;
            } else {
                return 2;
            }
        } else {
            int var5 = class70.field1070[--class60.field600];
            --var5;
            if (var4.field2731 != null && var5 < var4.field2731.length
                && var4.field2731[var5] != null) {
                class70.field1065[++class70.field1072 - 1] = var4.field2731[var5];
            } else {
                class70.field1065[++class70.field1072 - 1] = "";
            }

            return 1;
        }
    }

    static final int method785(int var0, int var1, int var2) {
        if (var0 == -2) {
            return 12345678;
        } else if (var0 == -1) {
            if (var1 < 2) {
                var1 = 2;
            } else if (var1 > 126) {
                var1 = 126;
            }

            return var1;
        } else {
            var1 = (var0 & 127) * var1 / 128;
            if (var1 < 2) {
                var1 = 2;
            } else if (var1 > 126) {
                var1 = 126;
            }

            return (var0 & 65408) + var1;
        }
    }

    public final void update(Graphics var1) {
        this.field404.update(var1);
    }

    public final void paint(Graphics var1) {
        this.field404.paint(var1);
    }
}
