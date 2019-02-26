package jagex.osrs;

public class class247 extends Node {

    int field3213;
    ArchiveCache field3215;
    byte[] field3212;
    class251 field3214;

    public static GameType[] method4820(byte var0) {
        return new GameType[]{GameType.field3203, GameType.field3208, GameType.field3205,
            GameType.field3207, GameType.field3204, GameType.field3206};
    }

    public static String method4822(CharSequence var0, byte var1) {
        int var3 = var0.length();
        char[] var4 = new char[var3];

        for (int var5 = 0; var5 < var3; ++var5) {
            var4[var5] = '*';
        }

        String var2 = new String(var4);
        return var2;
    }

    public static void method4821(byte var0) {
        class318.field3852 = new class205();
    }
}
