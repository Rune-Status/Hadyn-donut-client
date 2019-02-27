package jagex.osrs;

import java.util.Date;
import netscape.javascript.JSObject;

public class class277 {

    static void method5493(String var0, byte var1) {
        class6.parameters = var0;

        try {
            String var2 = class157.field2037.getParameter(class281.field3671.field3677);
            String var3 = class157.field2037.getParameter(class281.field3674.field3677);
            String var4 = var2 + "settings=" + var0 + "; version=1; path=/; domain=" + var3;
            String var6;
            if (var0.length() == 0) {
                var4 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                String var5 = var4 + "; Expires=";
                long var7 = Time.currentTimeMillis() + 94608000000L;
                class194.field2463.setTime(new Date(var7));
                int var9 = class194.field2463.get(7);
                int var10 = class194.field2463.get(5);
                int var11 = class194.field2463.get(2);
                int var12 = class194.field2463.get(1);
                int var13 = class194.field2463.get(11);
                int var14 = class194.field2463.get(12);
                int var15 = class194.field2463.get(13);
                var6 = class194.field2466[var9 - 1] + ", " + var10 / 10 + var10 % 10 + "-"
                    + class194.field2464[0][var11] + "-" + var12 + " " + var13 / 10 + var13 % 10
                    + ":" + var14 / 10 + var14 % 10 + ":" + var15 / 10 + var15 % 10 + " GMT";
                var4 = var5 + var6 + "; Max-Age=" + 94608000L;
            }

            client var17 = class157.field2037;
            var6 = "document.cookie=\"" + var4 + "\"";
            JSObject.getWindow(var17).eval(var6);
        } catch (Throwable var16) {
            ;
        }

    }
}
