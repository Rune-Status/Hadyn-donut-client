package jagex.osrs;

public class class235 implements class190 {

    public static final class235 field2833;
    public static final class235 field2830;
    public static final class235 field2841;
    public static final class235 field2818;
    static final class235 field2835;
    static final class235 field2838;
    static final class235 field2820;
    static final class235 field2840;
    static final class235 field2823;
    static final class235 field2824;
    static final class235 field2825;
    static final class235 field2826;
    static final class235 field2827;
    static final class235 field2828;
    static final class235 field2821;
    static final class235 field2836;
    static final class235 field2831;
    static final class235 field2832;
    static final class235 field2822;
    static final class235 field2834;
    static final class235 field2829;
    static final class235 field2837;
    static final class235 field2819;

    static {
        field2833 = new class235(0, 0);
        field2835 = new class235(1, 0);
        field2830 = new class235(2, 0);
        field2841 = new class235(3, 0);
        field2818 = new class235(9, 2);
        field2823 = new class235(4, 1);
        field2824 = new class235(5, 1);
        field2825 = new class235(6, 1);
        field2826 = new class235(7, 1);
        field2827 = new class235(8, 1);
        field2828 = new class235(12, 2);
        field2821 = new class235(13, 2);
        field2836 = new class235(14, 2);
        field2831 = new class235(15, 2);
        field2832 = new class235(16, 2);
        field2822 = new class235(17, 2);
        field2834 = new class235(18, 2);
        field2829 = new class235(19, 2);
        field2837 = new class235(20, 2);
        field2819 = new class235(21, 2);
        field2838 = new class235(10, 2);
        field2820 = new class235(11, 2);
        field2840 = new class235(22, 3);
    }

    public final int field2839;

    class235(int var1, int var2) {
        this.field2839 = var1;
    }

    public static String method4782(String var0, int var1) {
        int var2 = var0.length();
        char[] var3 = new char[var2];
        byte var4 = 2;

        for (int var5 = 0; var5 < var2; ++var5) {
            char var6 = var0.charAt(var5);
            if (var4 == 0) {
                var6 = Character.toLowerCase(var6);
            } else if (var4 == 2 || Character.isUpperCase(var6)) {
                char var7;
                if (var6 != 181 && var6 != 131) {
                    var7 = Character.toTitleCase(var6);
                } else {
                    var7 = var6;
                }

                var6 = var7;
            }

            if (Character.isLetter(var6)) {
                var4 = 0;
            } else if (var6 != '.' && var6 != '?' && var6 != '!') {
                if (Character.isSpaceChar(var6)) {
                    if (var4 != 2) {
                        var4 = 1;
                    }
                } else {
                    var4 = 1;
                }
            } else {
                var4 = 2;
            }

            var3[var5] = var6;
        }

        return new String(var3);
    }

    public int vmethod6130(byte var1) {
        return this.field2839;
    }
}
