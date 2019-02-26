package jagex.osrs;

import java.util.Comparator;

public class class139 implements Comparator {

    static int field1928;
    final boolean field1929;

    public class139(boolean var1) {
        this.field1929 = var1;
    }

    public static class267 method3299(int var0, int var1) {
        class267 var2 = (class267) class267.field3413.method4198((long) var0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class267.field3411.method4831(34, var0, 1789634852);
            var2 = new class267();
            if (var3 != null) {
                var2.method5199(new Buffer(var3), (byte) 17);
            }

            var2.method5196(-440344671);
            class267.field3413.method4204(var2, (long) var0);
            return var2;
        }
    }

    int method3295(class289 var1, class289 var2, byte var3) {
        return this.field1929 ? var1.field3706 - var2.field3706 : var2.field3706 - var1.field3706;
    }

    public int compare(Object var1, Object var2) {
        return this.method3295((class289) var1, (class289) var2, (byte) -43);
    }

    public boolean equals(Object var1) {
        return super.equals(var1);
    }
}
