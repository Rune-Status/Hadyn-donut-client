package jagex.osrs;

import java.util.Comparator;

public class class314 implements Comparator {

    final boolean field3834;

    public class314(boolean var1) {
        this.field3834 = var1;
    }

    public static double[] method5987(double var0, double var2, int var4, int var5) {
        int var6 = var4 * 2 + 1;
        double[] var7 = new double[var6];
        int var8 = -var4;

        for (int var9 = 0; var8 <= var4; ++var9) {
            double var12 = class269.method5267(((double) var8 - var0) / var2) / var2;
            var7[var9] = var12;
            ++var8;
        }

        return var7;
    }

    int method5988(class284 var1, class284 var2, byte var3) {
        return this.field3834 ? var1.method5542((byte) 8)
                                    .method5710(var2.method5542((byte) -23), 397869421)
            : var2.method5542((byte) 109).method5710(var1.method5542((byte) -113), 645596672);
    }

    public int compare(Object var1, Object var2) {
        return this.method5988((class284) var1, (class284) var2, (byte) 117);
    }

    public boolean equals(Object var1) {
        return super.equals(var1);
    }
}
