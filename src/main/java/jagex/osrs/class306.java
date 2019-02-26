package jagex.osrs;

public class class306 {

    static char[] field3800;
    static char[] field3795;
    static char[] field3797;
    static int[] field3798;
    static int field3796;

    static {
        field3800 = new char[64];

        int var0;
        for (var0 = 0; var0 < 26; ++var0) {
            field3800[var0] = (char) (var0 + 65);
        }

        for (var0 = 26; var0 < 52; ++var0) {
            field3800[var0] = (char) (var0 + 97 - 26);
        }

        for (var0 = 52; var0 < 62; ++var0) {
            field3800[var0] = (char) (var0 + 48 - 52);
        }

        field3800[62] = '+';
        field3800[63] = '/';
        field3795 = new char[64];

        for (var0 = 0; var0 < 26; ++var0) {
            field3795[var0] = (char) (var0 + 65);
        }

        for (var0 = 26; var0 < 52; ++var0) {
            field3795[var0] = (char) (var0 + 97 - 26);
        }

        for (var0 = 52; var0 < 62; ++var0) {
            field3795[var0] = (char) (var0 + 48 - 52);
        }

        field3795[62] = '*';
        field3795[63] = '-';
        field3797 = new char[64];

        for (var0 = 0; var0 < 26; ++var0) {
            field3797[var0] = (char) (var0 + 65);
        }

        for (var0 = 26; var0 < 52; ++var0) {
            field3797[var0] = (char) (var0 + 97 - 26);
        }

        for (var0 = 52; var0 < 62; ++var0) {
            field3797[var0] = (char) (var0 + 48 - 52);
        }

        field3797[62] = '-';
        field3797[63] = '_';
        field3798 = new int[128];

        for (var0 = 0; var0 < field3798.length; ++var0) {
            field3798[var0] = -1;
        }

        for (var0 = 65; var0 <= 90; ++var0) {
            field3798[var0] = var0 - 65;
        }

        for (var0 = 97; var0 <= 122; ++var0) {
            field3798[var0] = var0 - 97 + 26;
        }

        for (var0 = 48; var0 <= 57; ++var0) {
            field3798[var0] = var0 - 48 + 52;
        }

        int[] var2 = field3798;
        field3798[43] = 62;
        var2[42] = 62;
        int[] var1 = field3798;
        field3798[47] = 63;
        var1[45] = 63;
    }
}
