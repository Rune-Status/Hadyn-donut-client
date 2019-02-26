package jagex.osrs;

public class class99 implements Runnable {

    volatile class97[] field1391;

    class99() {
        this.field1391 = new class97[2];
    }

    static char method2426(char var0, short var1) {
        switch (var0) {
            case ' ':
            case '-':
            case '_':
            case '\u00a0':
                return '_';
            case '#':
            case '[':
            case ']':
                return var0;
            case '\u00c0':
            case '\u00c1':
            case '\u00c2':
            case '\u00c3':
            case '\u00c4':
            case '\u00e0':
            case '\u00e1':
            case '\u00e2':
            case '\u00e3':
            case '\u00e4':
                return 'a';
            case '\u00c7':
            case '\u00e7':
                return 'c';
            case '\u00c8':
            case '\u00c9':
            case '\u00ca':
            case '\u00cb':
            case '\u00e8':
            case '\u00e9':
            case '\u00ea':
            case '\u00eb':
                return 'e';
            case '\u00cd':
            case '\u00ce':
            case '\u00cf':
            case '\u00ed':
            case '\u00ee':
            case '\u00ef':
                return 'i';
            case '\u00d1':
            case '\u00f1':
                return 'n';
            case '\u00d2':
            case '\u00d3':
            case '\u00d4':
            case '\u00d5':
            case '\u00d6':
            case '\u00f2':
            case '\u00f3':
            case '\u00f4':
            case '\u00f5':
            case '\u00f6':
                return 'o';
            case '\u00d9':
            case '\u00da':
            case '\u00db':
            case '\u00dc':
            case '\u00f9':
            case '\u00fa':
            case '\u00fb':
            case '\u00fc':
                return 'u';
            case '\u00df':
                return 'b';
            case '\u00ff':
            case '\u0178':
                return 'y';
            default:
                return Character.toLowerCase(var0);
        }
    }

    static char method2421(char var0, int var1, int var2) {
        if (var0 >= 192 && var0 <= 255) {
            if (var0 >= 192 && var0 <= 198) {
                return 'A';
            }

            if (var0 == 199) {
                return 'C';
            }

            if (var0 >= 200 && var0 <= 203) {
                return 'E';
            }

            if (var0 >= 204 && var0 <= 207) {
                return 'I';
            }

            if (var0 >= 210 && var0 <= 214) {
                return 'O';
            }

            if (var0 >= 217 && var0 <= 220) {
                return 'U';
            }

            if (var0 == 221) {
                return 'Y';
            }

            if (var0 == 223) {
                return 's';
            }

            if (var0 >= 224 && var0 <= 230) {
                return 'a';
            }

            if (var0 == 231) {
                return 'c';
            }

            if (var0 >= 232 && var0 <= 235) {
                return 'e';
            }

            if (var0 >= 236 && var0 <= 239) {
                return 'i';
            }

            if (var0 >= 242 && var0 <= 246) {
                return 'o';
            }

            if (var0 >= 249 && var0 <= 252) {
                return 'u';
            }

            if (var0 == 253 || var0 == 255) {
                return 'y';
            }
        }

        return var0 == 338 ? 'O' : (var0 == 339 ? 'o' : (var0 == 376 ? 'Y' : var0));
    }

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; ++var1) {
                class97 var2 = this.field1391[var1];
                if (var2 != null) {
                    var2.method2346((byte) -5);
                }
            }
        } catch (Exception var4) {
            class80.method2041((String) null, var4, 1672520275);
        }

    }
}
