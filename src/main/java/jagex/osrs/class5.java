package jagex.osrs;

import java.util.Comparator;

final class class5 implements Comparator {

    static final boolean method66(int var0, int var1, int var2, int var3, int var4, int var5,
                                  int var6, int var7) {
        int var8 = class122.field1715 + var6;
        if (var8 < var0 && var8 < var1 && var8 < var2) {
            return false;
        } else {
            var8 = class122.field1715 - var6;
            if (var8 > var0 && var8 > var1 && var8 > var2) {
                return false;
            } else {
                var8 = class122.field1712 + var6;
                if (var8 < var3 && var8 < var4 && var8 < var5) {
                    return false;
                } else {
                    var8 = class122.field1712 - var6;
                    return var8 <= var3 || var8 <= var4 || var8 <= var5;
                }
            }
        }
    }

    int method58(class2 var1, class2 var2, byte var3) {
        return var1.field19.field31 < var2.field19.field31 ? -1
            : (var2.field19.field31 == var1.field19.field31 ? 0 : 1);
    }

    public int compare(Object var1, Object var2) {
        return this.method58((class2) var1, (class2) var2, (byte) 117);
    }

    public boolean equals(Object var1) {
        return super.equals(var1);
    }
}
