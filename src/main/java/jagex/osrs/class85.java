package jagex.osrs;

import java.awt.Component;
import java.util.HashMap;
import java.util.Map;

public class class85 {

    static final Map field1248;
    static final class199 field1249;
    static final class217 field1247;
    static int field1246;
    static int[] encryptionKey;

    static {
        field1248 = new HashMap();
        field1249 = new class199(1024);
        field1247 = new class217();
        field1246 = 0;
    }

    static void method2144(Component var0, int var1) {
        var0.removeKeyListener(class39.field386);
        var0.removeFocusListener(class39.field386);
        class39.field383 = -1;
    }

    static String method2145(String var0, int var1) {
        class244[] var2 = class6.method80(-523285600);

        for (int var3 = 0; var3 < var2.length; ++var3) {
            class244 var4 = var2[var3];
            if (var4.field3185 != -1 && var0
                .startsWith(class19.method243(var4.field3185, 703327785))) {
                var0 = var0.substring(6 + Integer.toString(var4.field3185).length());
                break;
            }
        }

        return var0;
    }

    public static void method2146(class249 var0, class249 var1, byte var2) {
        class260.field3347 = var0;
        class260.field3343 = var1;
    }

    public static int method2126(long var0) {
        return (int) (var0 >>> 7 & 127L);
    }

    static int method2148(int var0, int var1) {
        class88 var2 = (class88) field1248.get(Integer.valueOf(var0));
        return var2 == null ? 0 : var2.method2180(-1455380015);
    }
}
