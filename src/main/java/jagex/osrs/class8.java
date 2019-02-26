package jagex.osrs;

public class class8 {

    static String[] field66;
    static byte[][][] field64;

    static final int method97(class330 var0, byte var1) {
        if (var0 == null) {
            return 12;
        } else {
            switch (var0.field4001) {
                case 3:
                    return 20;
                default:
                    return 12;
            }
        }
    }

    static final String method96(int var0, int var1) {
        String var2 = Integer.toString(var0);

        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }

        return var2.length() > 9 ? " " + class128.method3233(65408, 916260389) + var2
            .substring(0, var2.length() - 8) + "M" + " " + " (" + var2 + ")" + "</col>"
            : (var2.length() > 6 ? " " + class128.method3233(16777215, 967016724) + var2
                .substring(0, var2.length() - 4) + "K" + " " + " (" + var2 + ")" + "</col>"
                : " " + class128.method3233(16776960, 2091169480) + var2 + "</col>");
    }
}
