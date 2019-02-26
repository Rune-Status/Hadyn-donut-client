package jagex.osrs;

import java.net.URL;

public class class242 implements class190 {

    public static final class242 field3166;
    public static final class242 field3172;
    public static final class242 field3162;
    public static final class242 field3163;
    public static final class242 field3168;
    public static final class242 field3169;
    public static final class242 field3164;
    public static final class242 field3167;

    static {
        field3172 = new class242(5, 0);
        field3163 = new class242(6, 1);
        field3164 = new class242(1, 2);
        field3162 = new class242(0, 3);
        field3166 = new class242(4, 4);
        field3169 = new class242(3, 5);
        field3168 = new class242(2, 6);
        field3167 = new class242(7, 7);
    }

    public final int field3170;
    final int field3171;

    class242(int var1, int var2) {
        this.field3170 = var1;
        this.field3171 = var2;
    }

    static boolean method4796(String var0, int var1, String var2, int var3) {
        if (var1 == 0) {
            try {
                if (!class45.field420.startsWith("win")) {
                    throw new Exception();
                } else if (!var0.startsWith("http://") && !var0.startsWith("https://")) {
                    throw new Exception();
                } else {
                    String var11 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

                    for (int var5 = 0; var5 < var0.length(); ++var5) {
                        if (var11.indexOf(var0.charAt(var5)) == -1) {
                            throw new Exception();
                        }
                    }

                    Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
                    return true;
                }
            } catch (Throwable var6) {
                return false;
            }
        } else if (var1 == 1) {
            try {
                Object var4 = Javascript.call(class45.field419, var2, new Object[]{
                    (new URL(class45.field419.getCodeBase(), var0)).toString()});
                return var4 != null;
            } catch (Throwable var7) {
                return false;
            }
        } else if (var1 == 2) {
            try {
                class45.field419.getAppletContext()
                                .showDocument(new URL(class45.field419.getCodeBase(), var0),
                                              "_blank");
                return true;
            } catch (Exception var8) {
                return false;
            }
        } else if (var1 == 3) {
            try {
                Javascript.call(class45.field419, "loggedout");
            } catch (Throwable var10) {
                ;
            }

            try {
                class45.field419.getAppletContext()
                                .showDocument(new URL(class45.field419.getCodeBase(), var0),
                                              "_top");
                return true;
            } catch (Exception var9) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public int vmethod6130(byte var1) {
        return this.field3171;
    }
}
