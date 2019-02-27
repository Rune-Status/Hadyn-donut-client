package jagex.osrs;

public class class226 extends class208 {

    static String field2624;
    public final int[] field2623;
    public final int field2626;
    public final int field2621;
    public final int[] field2622;

    class226(int var1, int var2, int[] var3, int[] var4, int var5) {
        this.field2626 = var1;
        this.field2621 = var2;
        this.field2622 = var3;
        this.field2623 = var4;
    }

    static final class199 method4634(Buffer var0, class199 var1, short var2) {
        int var3 = var0.readUint8();
        int var4;
        if (var1 == null) {
            var4 = class3.method28(var3, -464680238);
            var1 = new class199(var4);
        }

        for (var4 = 0; var4 < var3; ++var4) {
            boolean var5 = var0.readUint8() == 1;
            int var6 = var0.method3773(857671803);
            Object var7;
            if (var5) {
                var7 = new class197(var0.getString());
            } else {
                var7 = new class213(var0.getInt());
            }

            var1.method4170((Node) var7, (long) var6);
        }

        return var1;
    }

    public boolean method4635(int var1, int var2, int var3) {
        if (var2 >= 0 && var2 < this.field2623.length) {
            int var4 = this.field2623[var2];
            if (var1 >= var4 && var1 <= var4 + this.field2622[var2]) {
                return true;
            }
        }

        return false;
    }
}
