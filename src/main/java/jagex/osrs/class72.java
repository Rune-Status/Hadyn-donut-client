package jagex.osrs;

public class class72 extends Node {

    static int field1100;
    IterableDeque field1099;
    class263 field1097;

    class72(class263 var1) {
        this.field1099 = new IterableDeque();
        this.field1097 = var1;
    }

    public static void method1967(class249 var0, String var1, String var2, int var3, boolean var4,
                                  int var5) {
        int var6 = var0.method4825(var1, 1011742774);
        int var7 = var0.method4847(var6, var2, 1564791425);
        class161.method3528(var0, var6, var7, var3, var4, (byte) 0);
    }

    static final int method1958(int var0, int var1, byte var2) {
        int var3 = var0 + var1 * 57;
        var3 ^= var3 << 13;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 255;
    }

    void method1959(int var1, int var2, int var3, int var4, int var5) {
        class65 var6 = null;
        int var7 = 0;

        for (class65 var8 = (class65) this.field1099.method4250(); var8 != null;
             var8 = (class65) this.field1099.method4248()) {
            ++var7;
            if (var8.field1006 == var1) {
                var8.method1681(var1, var2, var3, var4, 242544624);
                return;
            }

            if (var8.field1006 <= var1) {
                var6 = var8;
            }
        }

        if (var6 == null) {
            if (var7 < 4) {
                this.field1099.method4246(new class65(var1, var2, var3, var4));
            }

        } else {
            IterableDeque.method4245(new class65(var1, var2, var3, var4), var6);
            if (var7 >= 4) {
                this.field1099.method4250().unlink();
            }

        }
    }

    class65 method1960(int var1, int var2) {
        class65 var3 = (class65) this.field1099.method4250();
        if (var3 != null && var3.field1006 <= var1) {
            for (class65 var4 = (class65) this.field1099.method4248();
                 var4 != null && var4.field1006 <= var1;
                 var4 = (class65) this.field1099.method4248()) {
                var3.unlink();
                var3 = var4;
            }

            if (this.field1097.field3387 + var3.field1003 + var3.field1006 > var1) {
                return var3;
            } else {
                var3.unlink();
                return null;
            }
        } else {
            return null;
        }
    }

    boolean method1965(int var1) {
        return this.field1099.isEmpty();
    }
}
