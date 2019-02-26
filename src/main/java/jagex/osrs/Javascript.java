package jagex.osrs;

import java.applet.Applet;
import netscape.javascript.JSObject;

public class Javascript {

    public static Object call(Applet var0, String var1, Object[] var2) throws Throwable {
        return JSObject.getWindow(var0).call(var1, var2);
    }

    public static Object call(Applet var0, String var1) throws Throwable {
        return JSObject.getWindow(var0).call(var1, (Object[]) null);
    }
}
