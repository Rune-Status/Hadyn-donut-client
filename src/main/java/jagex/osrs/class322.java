package jagex.osrs;

public final class class322 extends class319 {

    public int field3874;
    public int[] field3871;
    public int field3872;
    public int field3875;
    public int field3873;
    public int field3877;
    public int field3876;
    public byte[] field3870;

    static void method6137(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5,
                           int var6, int var7, int var8) {
        int var9 = -(var5 >> 2);
        var5 = -(var5 & 3);

        for (int var10 = -var6; var10 < 0; ++var10) {
            int var11;
            byte var12;
            for (var11 = var9; var11 < 0; ++var11) {
                var12 = var1[var3++];
                if (var12 != 0) {
                    var0[var4++] = var2[var12 & 255];
                } else {
                    ++var4;
                }

                var12 = var1[var3++];
                if (var12 != 0) {
                    var0[var4++] = var2[var12 & 255];
                } else {
                    ++var4;
                }

                var12 = var1[var3++];
                if (var12 != 0) {
                    var0[var4++] = var2[var12 & 255];
                } else {
                    ++var4;
                }

                var12 = var1[var3++];
                if (var12 != 0) {
                    var0[var4++] = var2[var12 & 255];
                } else {
                    ++var4;
                }
            }

            for (var11 = var5; var11 < 0; ++var11) {
                var12 = var1[var3++];
                if (var12 != 0) {
                    var0[var4++] = var2[var12 & 255];
                } else {
                    ++var4;
                }
            }

            var4 += var7;
            var3 += var8;
        }

    }

    static void method6133(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5,
                           int var6, int var7, int var8, int var9, int var10, int var11) {
        int var12 = var3;

        for (int var13 = -var8; var13 < 0; ++var13) {
            int var14 = var11 * (var4 >> 16);

            for (int var15 = -var7; var15 < 0; ++var15) {
                byte var16 = var1[(var3 >> 16) + var14];
                if (var16 != 0) {
                    var0[var5++] = var2[var16 & 255];
                } else {
                    ++var5;
                }

                var3 += var9;
            }

            var4 += var10;
            var3 = var12;
            var5 += var6;
        }

    }

    public void method6134() {
        if (this.field3872 != this.field3875 || this.field3873 != this.field3876) {
            byte[] var1 = new byte[this.field3875 * this.field3876];
            int var2 = 0;

            for (int var3 = 0; var3 < this.field3873; ++var3) {
                for (int var4 = 0; var4 < this.field3872; ++var4) {
                    var1[var4 + (var3 + this.field3877) * this.field3875
                        + this.field3874] = this.field3870[var2++];
                }
            }

            this.field3870 = var1;
            this.field3872 = this.field3875;
            this.field3873 = this.field3876;
            this.field3874 = 0;
            this.field3877 = 0;
        }
    }

    public void method6143(int var1, int var2) {
        var1 += this.field3874;
        var2 += this.field3877;
        int var3 = var1 + var2 * class319.field3854;
        int var4 = 0;
        int var5 = this.field3873;
        int var6 = this.field3872;
        int var7 = class319.field3854 - var6;
        int var8 = 0;
        int var9;
        if (var2 < class319.field3858) {
            var9 = class319.field3858 - var2;
            var5 -= var9;
            var2 = class319.field3858;
            var4 += var9 * var6;
            var3 += var9 * class319.field3854;
        }

        if (var5 + var2 > class319.field3857) {
            var5 -= var5 + var2 - class319.field3857;
        }

        if (var1 < class319.field3853) {
            var9 = class319.field3853 - var1;
            var6 -= var9;
            var1 = class319.field3853;
            var4 += var9;
            var3 += var9;
            var8 += var9;
            var7 += var9;
        }

        if (var6 + var1 > class319.field3859) {
            var9 = var6 + var1 - class319.field3859;
            var6 -= var9;
            var8 += var9;
            var7 += var9;
        }

        if (var6 > 0 && var5 > 0) {
            method6137(class319.field3856, this.field3870, this.field3871, var4, var3, var6, var5,
                       var7, var8);
        }
    }

    public void method6138(int var1, int var2, int var3, int var4) {
        int var5 = this.field3872;
        int var6 = this.field3873;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field3875;
        int var10 = this.field3876;
        int var11 = (var9 << 16) / var3;
        int var12 = (var10 << 16) / var4;
        int var13;
        if (this.field3874 > 0) {
            var13 = (var11 + (this.field3874 << 16) - 1) / var11;
            var1 += var13;
            var7 += var13 * var11 - (this.field3874 << 16);
        }

        if (this.field3877 > 0) {
            var13 = (var12 + (this.field3877 << 16) - 1) / var12;
            var2 += var13;
            var8 += var13 * var12 - (this.field3877 << 16);
        }

        if (var5 < var9) {
            var3 = (var11 + ((var5 << 16) - var7) - 1) / var11;
        }

        if (var6 < var10) {
            var4 = (var12 + ((var6 << 16) - var8) - 1) / var12;
        }

        var13 = var1 + var2 * class319.field3854;
        int var14 = class319.field3854 - var3;
        if (var2 + var4 > class319.field3857) {
            var4 -= var2 + var4 - class319.field3857;
        }

        int var15;
        if (var2 < class319.field3858) {
            var15 = class319.field3858 - var2;
            var4 -= var15;
            var13 += var15 * class319.field3854;
            var8 += var12 * var15;
        }

        if (var3 + var1 > class319.field3859) {
            var15 = var3 + var1 - class319.field3859;
            var3 -= var15;
            var14 += var15;
        }

        if (var1 < class319.field3853) {
            var15 = class319.field3853 - var1;
            var3 -= var15;
            var13 += var15;
            var7 += var11 * var15;
            var14 += var15;
        }

        method6133(class319.field3856, this.field3870, this.field3871, var7, var8, var13, var14,
                   var3, var4, var11, var12, var5);
    }

    public void method6147(int var1, int var2, int var3) {
        for (int var4 = 0; var4 < this.field3871.length; ++var4) {
            int var5 = this.field3871[var4] >> 16 & 255;
            var5 += var1;
            if (var5 < 0) {
                var5 = 0;
            } else if (var5 > 255) {
                var5 = 255;
            }

            int var6 = this.field3871[var4] >> 8 & 255;
            var6 += var2;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }

            int var7 = this.field3871[var4] & 255;
            var7 += var3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 255) {
                var7 = 255;
            }

            this.field3871[var4] = var7 + (var6 << 8) + (var5 << 16);
        }

    }
}
