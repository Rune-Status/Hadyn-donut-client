package jagex.osrs;

public class class325 implements class326 {

    public class327 vmethod6292(byte var1) {
        byte var2;
        if (class28.field284.startsWith("win")) {
            var2 = 1;
        } else if (class28.field284.startsWith("mac")) {
            var2 = 2;
        } else if (class28.field284.startsWith("linux")) {
            var2 = 3;
        } else {
            var2 = 4;
        }

        String var3;
        try {
            var3 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var36) {
            var3 = "";
        }

        String var4;
        try {
            var4 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var35) {
            var4 = "";
        }

        String var5 = "Unknown";
        String var6 = "1.1";

        try {
            var5 = System.getProperty("java.vendor");
            var6 = System.getProperty("java.version");
        } catch (Exception var34) {
            ;
        }

        boolean var30;
        if (!var3.startsWith("amd64") && !var3.startsWith("x86_64")) {
            var30 = false;
        } else {
            var30 = true;
        }

        byte var8 = 0;
        if (var2 == 1) {
            if (var4.indexOf("4.0") != -1) {
                var8 = 1;
            } else if (var4.indexOf("4.1") != -1) {
                var8 = 2;
            } else if (var4.indexOf("4.9") != -1) {
                var8 = 3;
            } else if (var4.indexOf("5.0") != -1) {
                var8 = 4;
            } else if (var4.indexOf("5.1") != -1) {
                var8 = 5;
            } else if (var4.indexOf("5.2") != -1) {
                var8 = 8;
            } else if (var4.indexOf("6.0") != -1) {
                var8 = 6;
            } else if (var4.indexOf("6.1") != -1) {
                var8 = 7;
            } else if (var4.indexOf("6.2") != -1) {
                var8 = 9;
            } else if (var4.indexOf("6.3") != -1) {
                var8 = 10;
            } else if (var4.indexOf("10.0") != -1) {
                var8 = 11;
            }
        } else if (var2 == 2) {
            if (var4.indexOf("10.4") != -1) {
                var8 = 20;
            } else if (var4.indexOf("10.5") != -1) {
                var8 = 21;
            } else if (var4.indexOf("10.6") != -1) {
                var8 = 22;
            } else if (var4.indexOf("10.7") != -1) {
                var8 = 23;
            } else if (var4.indexOf("10.8") != -1) {
                var8 = 24;
            } else if (var4.indexOf("10.9") != -1) {
                var8 = 25;
            } else if (var4.indexOf("10.10") != -1) {
                var8 = 26;
            } else if (var4.indexOf("10.11") != -1) {
                var8 = 27;
            } else if (var4.indexOf("10.12") != -1) {
                var8 = 28;
            } else if (var4.indexOf("10.13") != -1) {
                var8 = 29;
            }
        }

        byte var9;
        if (var5.toLowerCase().indexOf("sun") != -1) {
            var9 = 1;
        } else if (var5.toLowerCase().indexOf("microsoft") != -1) {
            var9 = 2;
        } else if (var5.toLowerCase().indexOf("apple") != -1) {
            var9 = 3;
        } else if (var5.toLowerCase().indexOf("oracle") != -1) {
            var9 = 5;
        } else {
            var9 = 4;
        }

        int var10 = 2;
        int var11 = 0;

        try {
            while (var10 < var6.length()) {
                char var12 = var6.charAt(var10);
                if (var12 < '0' || var12 > '9') {
                    break;
                }

                var11 = var11 * 10 + (var12 - '0');
                ++var10;
            }
        } catch (Exception var39) {
            ;
        }

        int var40 = var11;
        var10 = var6.indexOf(46, 2) + 1;
        var11 = 0;

        try {
            while (var10 < var6.length()) {
                char var13 = var6.charAt(var10);
                if (var13 < '0' || var13 > '9') {
                    break;
                }

                var11 = var11 * 10 + (var13 - '0');
                ++var10;
            }
        } catch (Exception var38) {
            ;
        }

        int var41 = var11;
        var10 = var6.indexOf(95, 4) + 1;
        var11 = 0;

        try {
            while (var10 < var6.length()) {
                char var14 = var6.charAt(var10);
                if (var14 < '0' || var14 > '9') {
                    break;
                }

                var11 = var11 * 10 + (var14 - '0');
                ++var10;
            }
        } catch (Exception var37) {
            ;
        }

        int var16 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
        int var17;
        if (var40 > 3) {
            var17 = Runtime.getRuntime().availableProcessors();
        } else {
            var17 = 0;
        }

        byte var18 = 0;
        String var19 = "";
        String var20 = "";
        String var21 = "";
        String var22 = "";
        String var23 = "";
        String var24 = "";
        int[] var29 = new int[3];
        return new class327(var2, var30, var8, var9, var40, var41, var11, false, var16, var17,
                            var18, 0, var19, var20, var21, var22, 0, 0, 0, 0, var23, var24, var29,
                            0, "");
    }
}
