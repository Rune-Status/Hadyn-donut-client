package jagex.osrs;

import java.util.HashMap;

public class class253 {

    static int field3289;
    final HashMap field3284;
    int field3285;
    int[] field3281;
    int[] field3286;
    class315 field3282;

    public class253() {
        this.field3284 = new HashMap();
        this.field3282 = new class315(0, 0);
        this.field3281 = new int[2048];
        this.field3286 = new int[2048];
        this.field3285 = 0;
        class21.field209 = new int[2000];
        int var1 = 0;
        int var2 = 240;

        int var4;
        for (byte var3 = 12; var1 < 16; var2 -= var3) {
            var4 = class6.method79((double) ((float) var2 / 360.0F), 0.9998999834060669D,
                                   (double) (0.075F + 0.425F * (float) var1 / 16.0F));
            class21.field209[var1] = var4;
            ++var1;
        }

        var2 = 48;

        for (int var6 = var2 / 6; var1 < class21.field209.length; var2 -= var6) {
            var4 = var1 * 2;

            for (int var5 = class6
                .method79((double) ((float) var2 / 360.0F), 0.9998999834060669D, 0.5D);
                 var1 < var4 && var1 < class21.field209.length; ++var1) {
                class21.field209[var1] = var5;
            }
        }

    }

    public static class270 method4993(int var0, byte var1) {
        class270 var2 = (class270) class270.field3453.method4198((long) var0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class270.field3450.method4831(6, var0, 1789634852);
            var2 = new class270();
            var2.field3469 = var0;
            if (var3 != null) {
                var2.method5271(new Buffer(var3), -386492996);
            }

            var2.method5300(-343160721);
            if (var2.field3490) {
                var2.field3495 = 0;
                var2.field3468 = false;
            }

            class270.field3453.method4204(var2, (long) var0);
            return var2;
        }
    }

    class323 method4981(int var1, short var2) {
        if (!this.field3284.containsKey(Integer.valueOf(var1))) {
            this.method4980(var1, -67983406);
        }

        return (class323) this.field3284.get(Integer.valueOf(var1));
    }

    void method4980(int var1, int var2) {
        int var3 = var1 * 2 + 1;
        double[] var4 = class314
            .method5987(0.0D, (double) ((float) var1 / 3.0F), var1, -1180705805);
        double var5 = var4[var1] * var4[var1];
        int[] var7 = new int[var3 * var3];
        boolean var8 = false;

        for (int var9 = 0; var9 < var3; ++var9) {
            for (int var10 = 0; var10 < var3; ++var10) {
                int var11 = var7[var10 + var3 * var9] = (int) (var4[var10] * var4[var9] / var5
                    * 256.0D);
                if (!var8 && var11 > 0) {
                    var8 = true;
                }
            }
        }

        class323 var12 = new class323(var7, var3, var3);
        this.field3284.put(Integer.valueOf(var1), var12);
    }

    void method4988(class323 var1, class323 var2, class315 var3, int var4) {
        if (var3.width != 0 && var3.height != 0) {
            int var5 = 0;
            int var6 = 0;
            if (var3.x == 0) {
                var5 = var1.field3879 - var3.width;
            }

            if (var3.y == 0) {
                var6 = var1.field3887 - var3.height;
            }

            int var7 = var5 + var6 * var1.field3879;
            int var8 = var2.field3879 * var3.y + var3.x;

            for (int var9 = 0; var9 < var3.height; ++var9) {
                for (int var10 = 0; var10 < var3.width; ++var10) {
                    int var10001 = var8++;
                    var2.field3889[var10001] += var1.field3889[var7++];
                }

                var7 += var1.field3879 - var3.width;
                var8 += var2.field3879 - var3.width;
            }

        }
    }

    public final void method4984(int var1, int var2, class323 var3, float var4, byte var5) {
        int var6 = (int) (var4 * 18.0F);
        class323 var7 = this.method4981(var6, (short) 18593);
        int var8 = var6 * 2 + 1;
        class315 var9 = new class315(0, 0, var3.field3879, var3.field3887);
        class315 var10 = new class315(0, 0);
        this.field3282.setDimensions(var8, var8, 1814009011);
        System.nanoTime();

        int var11;
        int var12;
        int var13;
        for (var11 = 0; var11 < this.field3285; ++var11) {
            var12 = this.field3281[var11];
            var13 = this.field3286[var11];
            int var14 = (int) (var4 * (float) (var12 - var1)) - var6;
            int var15 = (int) ((float) var3.field3887 - (float) (var13 - var2) * var4) - var6;
            this.field3282.setPosition(var14, var15, -396296211);
            this.field3282.method5993(var9, var10, -683882211);
            this.method4988(var7, var3, var10, 2145334866);
        }

        System.nanoTime();
        System.nanoTime();

        for (var11 = 0; var11 < var3.field3889.length; ++var11) {
            if (var3.field3889[var11] == 0) {
                var3.field3889[var11] = -16777216;
            } else {
                var12 = (var3.field3889[var11] + 64 - 1) / 256;
                if (var12 <= 0) {
                    var3.field3889[var11] = -16777216;
                } else {
                    if (var12 > class21.field209.length) {
                        var12 = class21.field209.length;
                    }

                    var13 = class21.field209[var12 - 1];
                    var3.field3889[var11] = -16777216 | var13;
                }
            }
        }

        System.nanoTime();
    }

    public final void method4983(int var1) {
        this.field3285 = 0;
    }

    public final void method4982(int var1, int var2, int var3) {
        if (this.field3285 < this.field3281.length) {
            this.field3281[this.field3285] = var1;
            this.field3286[this.field3285] = var2;
            ++this.field3285;
        }
    }
}
