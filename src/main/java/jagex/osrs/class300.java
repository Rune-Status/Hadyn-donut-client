package jagex.osrs;

public final class class300 extends class301 {

    public class300(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6,
                    byte[][] var7) {
        super(var1, var2, var3, var4, var5, var6, var7);
    }

    public class300(byte[] var1) {
        super(var1);
    }

    final void vmethod5811(byte[] var1, int var2, int var3, int var4, int var5, int var6) {
        int var7 = var3 * class319.field3854 + var2;
        int var8 = class319.field3854 - var4;
        int var9 = 0;
        int var10 = 0;
        int var11;
        if (var3 < class319.field3858) {
            var11 = class319.field3858 - var3;
            var5 -= var11;
            var3 = class319.field3858;
            var10 += var11 * var4;
            var7 += var11 * class319.field3854;
        }

        if (var3 + var5 > class319.field3857) {
            var5 -= var3 + var5 - class319.field3857;
        }

        if (var2 < class319.field3853) {
            var11 = class319.field3853 - var2;
            var4 -= var11;
            var2 = class319.field3853;
            var10 += var11;
            var7 += var11;
            var9 += var11;
            var8 += var11;
        }

        if (var2 + var4 > class319.field3859) {
            var11 = var2 + var4 - class319.field3859;
            var4 -= var11;
            var9 += var11;
            var8 += var11;
        }

        if (var4 > 0 && var5 > 0) {
            class301
                .method5814(class319.field3856, var1, var6, var10, var7, var4, var5, var8, var9);
        }
    }

    final void vmethod5812(byte[] var1, int var2, int var3, int var4, int var5, int var6,
                           int var7) {
        int var8 = var3 * class319.field3854 + var2;
        int var9 = class319.field3854 - var4;
        int var10 = 0;
        int var11 = 0;
        int var12;
        if (var3 < class319.field3858) {
            var12 = class319.field3858 - var3;
            var5 -= var12;
            var3 = class319.field3858;
            var11 += var12 * var4;
            var8 += var12 * class319.field3854;
        }

        if (var3 + var5 > class319.field3857) {
            var5 -= var3 + var5 - class319.field3857;
        }

        if (var2 < class319.field3853) {
            var12 = class319.field3853 - var2;
            var4 -= var12;
            var2 = class319.field3853;
            var11 += var12;
            var8 += var12;
            var10 += var12;
            var9 += var12;
        }

        if (var2 + var4 > class319.field3859) {
            var12 = var2 + var4 - class319.field3859;
            var4 -= var12;
            var10 += var12;
            var9 += var12;
        }

        if (var4 > 0 && var5 > 0) {
            class301
                .method5816(class319.field3856, var1, var6, var11, var8, var4, var5, var9, var10,
                            var7);
        }
    }
}
