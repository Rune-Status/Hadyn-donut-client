package jagex.osrs;

import java.io.File;
import java.io.IOException;

public abstract class class162 {

    public static class257 method3533(int var0, int var1) {
        return var0 >= 0 && var0 < class257.field3310.length && class257.field3310[var0] != null
            ? class257.field3310[var0] : new class257(var0);
    }

    static void method3545(class232[] var0, int var1, int var2, int var3, boolean var4, byte var5) {
        for (int var6 = 0; var6 < var0.length; ++var6) {
            class232 var7 = var0[var6];
            if (var7 != null && var7.field2700 == var1) {
                class136.method3270(var7, var2, var3, var4, (byte) 22);
                class117.method2852(var7, var2, var3, -1265714488);
                if (var7.field2711 > var7.field2690 - var7.field2682) {
                    var7.field2711 = var7.field2690 - var7.field2682;
                }

                if (var7.field2711 < 0) {
                    var7.field2711 = 0;
                }

                if (var7.field2689 > var7.field2691 - var7.field2683) {
                    var7.field2689 = var7.field2691 - var7.field2683;
                }

                if (var7.field2689 < 0) {
                    var7.field2689 = 0;
                }

                if (var7.field2808 == 0) {
                    class223.method4594(var0, var7, var4, 1658306306);
                }
            }
        }

    }

    public static byte[] method3547(Object var0, boolean var1, byte var2) {
        if (var0 == null) {
            return null;
        } else if (var0 instanceof byte[]) {
            byte[] var7 = (byte[]) ((byte[]) var0);
            if (var1) {
                int var5 = var7.length;
                byte[] var6 = new byte[var5];
                System.arraycopy(var7, 0, var6, 0, var5);
                return var6;
            } else {
                return var7;
            }
        } else if (var0 instanceof class188) {
            class188 var3 = (class188) var0;
            return var3.vmethod4013((short) 1376);
        } else {
            throw new IllegalArgumentException();
        }
    }

    static void method3538(File var0, File var1, int var2) {
        try {
            SeekableFile var3 = new SeekableFile(class157.field2023, "rw", 10000L);
            Buffer var4 = new Buffer(500);
            var4.writeByte(3);
            var4.writeByte(var1 != null ? 1 : 0);
            var4.method3989(var0.getPath(), 1449200682);
            if (var1 != null) {
                var4.method3989(var1.getPath(), 1449200682);
            }

            var3.write(var4.bytes, 0, var4.offset);
            var3.method2717(99569689);
        } catch (IOException var5) {
            var5.printStackTrace();
        }

    }

    static void method3548(int var0) {
        class79.username = class79.username.trim();
        if (class79.username.length() == 0) {
            class185.method4006("Please enter your username.",
                                "If you created your account after November",
                                "2010, this will be the creation email address.", 1357057186);
        } else {
            long var2 = class268.method5222(1787196199);
            int var1;
            if (var2 == 0L) {
                var1 = 5;
            } else {
                var1 = class114.method2768(var2, class79.username, 1442617160);
            }

            switch (var1) {
                case 2:
                    class185.method4006(class239.field2943, class239.field3118, class239.field3081,
                                        1409904339);
                    class79.field1163 = 6;
                    break;
                case 3:
                    class185.method4006("", "Error connecting to server.", "", 1702839068);
                    break;
                case 4:
                    class185.method4006("The part of the website you are trying",
                                        "to connect to is offline at the moment.",
                                        "Please try again later.", 1774928429);
                    break;
                case 5:
                    class185.method4006("Sorry, there was an error trying to",
                                        "log you in to this part of the website.",
                                        "Please try again later.", 1331965741);
                    break;
                case 6:
                    class185.method4006("", "Error connecting to server.", "", 1987956097);
                    break;
                case 7:
                    class185.method4006("You must enter a valid login to proceed. For accounts",
                                        "created after 24th November 2010, please use your",
                                        "email address. Otherwise please use your username.",
                                        1985906573);
            }

        }
    }

    public abstract int vmethod3535(int var1, int var2, int var3);

    public abstract void vmethod3534(int var1);
}
