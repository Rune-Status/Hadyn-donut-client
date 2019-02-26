package jagex.osrs;

public class GameType implements class190 {

    public static final GameType field3207;
    static final GameType field3208;
    static final GameType field3203;
    static final GameType field3204;
    static final GameType field3205;
    static final GameType field3206;
    static int[] field3210;

    static {
        field3208 = new GameType("runescape", "RuneScape", 0);
        field3203 = new GameType("stellardawn", "Stellar Dawn", 1);
        field3204 = new GameType("game3", "Game 3", 2);
        field3205 = new GameType("game4", "Game 4", 3);
        field3206 = new GameType("game5", "Game 5", 4);
        field3207 = new GameType("oldscape", "RuneScape 2007", 5);
    }

    public final String name;
    final int field3209;

    GameType(String var1, String var2, int var3) {
        this.name = var1;
        this.field3209 = var3;
    }

    public static void method4819(int[] var0, int[] var1, int var2) {
        if (var0 != null && var1 != null) {
            class25.field253 = var0;
            class185.field2411 = new int[var0.length];
            class296.field3737 = new byte[var0.length][][];

            for (int var3 = 0; var3 < class25.field253.length; ++var3) {
                class296.field3737[var3] = new byte[var1[var3]][];
            }

        } else {
            class25.field253 = null;
            class185.field2411 = null;
            class296.field3737 = null;
        }
    }

    public static int method4810(CharSequence var0, int var1, int var2, byte[] var3, int var4,
                                 byte var5) {
        int var6 = var2 - var1;

        for (int var7 = 0; var7 < var6; ++var7) {
            char var8 = var0.charAt(var7 + var1);
            if (var8 > 0 && var8 < 128 || var8 >= 160 && var8 <= 255) {
                var3[var7 + var4] = (byte) var8;
            } else if (var8 == 8364) {
                var3[var7 + var4] = -128;
            } else if (var8 == 8218) {
                var3[var7 + var4] = -126;
            } else if (var8 == 402) {
                var3[var7 + var4] = -125;
            } else if (var8 == 8222) {
                var3[var7 + var4] = -124;
            } else if (var8 == 8230) {
                var3[var7 + var4] = -123;
            } else if (var8 == 8224) {
                var3[var7 + var4] = -122;
            } else if (var8 == 8225) {
                var3[var7 + var4] = -121;
            } else if (var8 == 710) {
                var3[var7 + var4] = -120;
            } else if (var8 == 8240) {
                var3[var7 + var4] = -119;
            } else if (var8 == 352) {
                var3[var7 + var4] = -118;
            } else if (var8 == 8249) {
                var3[var7 + var4] = -117;
            } else if (var8 == 338) {
                var3[var7 + var4] = -116;
            } else if (var8 == 381) {
                var3[var7 + var4] = -114;
            } else if (var8 == 8216) {
                var3[var7 + var4] = -111;
            } else if (var8 == 8217) {
                var3[var7 + var4] = -110;
            } else if (var8 == 8220) {
                var3[var7 + var4] = -109;
            } else if (var8 == 8221) {
                var3[var7 + var4] = -108;
            } else if (var8 == 8226) {
                var3[var7 + var4] = -107;
            } else if (var8 == 8211) {
                var3[var7 + var4] = -106;
            } else if (var8 == 8212) {
                var3[var7 + var4] = -105;
            } else if (var8 == 732) {
                var3[var7 + var4] = -104;
            } else if (var8 == 8482) {
                var3[var7 + var4] = -103;
            } else if (var8 == 353) {
                var3[var7 + var4] = -102;
            } else if (var8 == 8250) {
                var3[var7 + var4] = -101;
            } else if (var8 == 339) {
                var3[var7 + var4] = -100;
            } else if (var8 == 382) {
                var3[var7 + var4] = -98;
            } else if (var8 == 376) {
                var3[var7 + var4] = -97;
            } else {
                var3[var7 + var4] = 63;
            }
        }

        return var6;
    }

    public static boolean method4817(char var0, byte var1) {
        return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
    }

    public int vmethod6130(byte var1) {
        return this.field3209;
    }
}
