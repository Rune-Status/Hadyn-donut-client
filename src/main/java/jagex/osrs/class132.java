package jagex.osrs;

public class class132 extends class208 {

    static class249 field1858;
    static class322 field1861;
    class119[] field1859;

    public class132(class249 var1, class249 var2, int var3, boolean var4) {
        Deque var5 = new Deque();
        int var6 = var1.method4889(var3, 1064669026);
        this.field1859 = new class119[var6];
        int[] var7 = var1.method4839(var3, -1279246396);

        for (int var8 = 0; var8 < var7.length; ++var8) {
            byte[] var9 = var1.method4831(var3, var7[var8], 1789634852);
            class126 var10 = null;
            int var11 = (var9[0] & 255) << 8 | var9[1] & 255;

            for (class126 var12 = (class126) var5.getFirst(); var12 != null;
                 var12 = (class126) var5.getNext()) {
                if (var11 == var12.field1763) {
                    var10 = var12;
                    break;
                }
            }

            if (var10 == null) {
                byte[] var13 = var2.method4836(var11, 0, 1272633714);
                var10 = new class126(var11, var13);
                var5.addLast(var10);
            }

            this.field1859[var7[var8]] = new class119(var9, var10);
        }

    }

    public boolean method3244(int var1, int var2) {
        return this.field1859[var1].field1614;
    }
}
