package jagex.osrs;

import java.util.Comparator;

public class class62 implements Comparator {

    static int[] field640;
    boolean field636;

    static void method1233(int var0) {
        class83.field1226 = 0;

        for (int var1 = 0; var1 < 2048; ++var1) {
            class83.playerConfigs[var1] = null;
            class83.field1224[var1] = 1;
        }

    }

    static void method1232(int var0, int var1, int var2, int var3, byte var4) {
        class232 var5 = class9.method102(var0, var1, -1068793300);
        if (var5 != null && var5.field2764 != null) {
            class57 var6 = new class57();
            var6.field570 = var5;
            var6.field575 = var5.field2764;
            class53.method1076(var6, 56310942);
        }

        client.field734 = var3;
        client.field798 = true;
        class306.field3796 = var0;
        client.field799 = var1;
        class297.field3740 = var2;
        class37.method721(var5, 1238023037);
    }

    int method1223(class2 var1, class2 var2, byte var3) {
        if (var2.field17 == var1.field17) {
            return 0;
        } else {
            if (this.field636) {
                if (client.field691 == var1.field17) {
                    return -1;
                }

                if (var2.field17 == client.field691) {
                    return 1;
                }
            }

            return var1.field17 < var2.field17 ? -1 : 1;
        }
    }

    public boolean equals(Object var1) {
        return super.equals(var1);
    }

    public int compare(Object var1, Object var2) {
        return this.method1223((class2) var1, (class2) var2, (byte) -31);
    }
}
