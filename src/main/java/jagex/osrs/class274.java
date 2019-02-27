package jagex.osrs;

public class class274 extends class208 {

    public static class202 field3601;
    public static class249 field3611;
    static class309 field3613;

    static {
        field3601 = new class202(64);
    }

    public int field3606;
    public int field3603;
    public boolean field3602;
    public int field3604;
    public int field3607;
    public int field3605;
    public int field3608;
    public int field3609;
    public int field3610;
    public int field3612;

    public class274() {
        this.field3603 = 0;
        this.field3604 = -1;
        this.field3602 = true;
        this.field3606 = -1;
    }

    static class322 method5439(byte var0) {
        class322 var1 = new class322();
        var1.field3875 = class324.field3891;
        var1.field3876 = class324.field3896;
        var1.field3874 = class324.field3890[0];
        var1.field3877 = class324.field3892[0];
        var1.field3872 = class324.field3895[0];
        var1.field3873 = class258.field3334[0];
        var1.field3871 = class324.field3894;
        var1.field3870 = class324.field3897[0];
        class324.field3890 = null;
        class324.field3892 = null;
        class324.field3895 = null;
        class258.field3334 = null;
        class324.field3894 = null;
        class324.field3897 = null;
        return var1;
    }

    void method5434(Buffer var1, int var2, int var3, int var4) {
        if (var2 == 1) {
            this.field3603 = var1.method3773(-561198457);
        } else if (var2 == 2) {
            this.field3604 = var1.readUint8();
        } else if (var2 == 5) {
            this.field3602 = false;
        } else if (var2 == 7) {
            this.field3606 = var1.method3773(599502817);
        } else if (var2 == 8) {
            ;
        }

    }

    void method5438(int var1, int var2) {
        double var3 = (double) (var1 >> 16 & 255) / 256.0D;
        double var5 = (double) (var1 >> 8 & 255) / 256.0D;
        double var7 = (double) (var1 & 255) / 256.0D;
        double var9 = var3;
        if (var5 < var3) {
            var9 = var5;
        }

        if (var7 < var9) {
            var9 = var7;
        }

        double var11 = var3;
        if (var5 > var3) {
            var11 = var5;
        }

        if (var7 > var11) {
            var11 = var7;
        }

        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var11 + var9) / 2.0D;
        if (var11 != var9) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }

            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }

            if (var11 == var3) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
        }

        var13 /= 6.0D;
        this.field3607 = (int) (var13 * 256.0D);
        this.field3608 = (int) (var15 * 256.0D);
        this.field3610 = (int) (var17 * 256.0D);
        if (this.field3608 < 0) {
            this.field3608 = 0;
        } else if (this.field3608 > 255) {
            this.field3608 = 255;
        }

        if (this.field3610 < 0) {
            this.field3610 = 0;
        } else if (this.field3610 > 255) {
            this.field3610 = 255;
        }

    }

    public void method5432(short var1) {
        if (this.field3606 != -1) {
            this.method5438(this.field3606, -1600281127);
            this.field3605 = this.field3607;
            this.field3609 = this.field3608;
            this.field3612 = this.field3610;
        }

        this.method5438(this.field3603, -1869096046);
    }

    public void method5452(Buffer var1, int var2, byte var3) {
        while (true) {
            int var4 = var1.readUint8();
            if (var4 == 0) {
                return;
            }

            this.method5434(var1, var4, var2, -1380971442);
        }
    }
}
