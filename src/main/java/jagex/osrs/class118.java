package jagex.osrs;

public class class118 extends Node {

    static int[] field1603;
    int[] field1595;
    int[] field1592;
    boolean field1602;
    int field1599;
    boolean field1589;
    int field1593;
    int field1591;
    int[] field1598;
    int[] field1596;
    int[] field1597;

    class118(Buffer var1) {
        this.field1589 = false;
        this.field1593 = var1.readUint16();
        this.field1602 = var1.getUByte() == 1;
        int var2 = var1.getUByte();
        if (var2 >= 1 && var2 <= 4) {
            this.field1595 = new int[var2];

            int var3;
            for (var3 = 0; var3 < var2; ++var3) {
                this.field1595[var3] = var1.readUint16();
            }

            if (var2 > 1) {
                this.field1596 = new int[var2 - 1];

                for (var3 = 0; var3 < var2 - 1; ++var3) {
                    this.field1596[var3] = var1.getUByte();
                }
            }

            if (var2 > 1) {
                this.field1597 = new int[var2 - 1];

                for (var3 = 0; var3 < var2 - 1; ++var3) {
                    this.field1597[var3] = var1.getUByte();
                }
            }

            this.field1598 = new int[var2];

            for (var3 = 0; var3 < var2; ++var3) {
                this.field1598[var3] = var1.getInt();
            }

            this.field1599 = var1.getUByte();
            this.field1591 = var1.getUByte();
            this.field1592 = null;
        } else {
            throw new RuntimeException();
        }
    }

    void method2855() {
        this.field1592 = null;
    }

    boolean method2854(double var1, int var3, class249 var4) {
        int var5;
        for (var5 = 0; var5 < this.field1595.length; ++var5) {
            if (var4.method4837(this.field1595[var5], -2072591117) == null) {
                return false;
            }
        }

        var5 = var3 * var3;
        this.field1592 = new int[var5];

        for (int var6 = 0; var6 < this.field1595.length; ++var6) {
            class322 var7 = class68.method1763(var4, this.field1595[var6], 11017437);
            var7.method6134();
            byte[] var8 = var7.field3870;
            int[] var9 = var7.field3871;
            int var10 = this.field1598[var6];
            if ((var10 & -16777216) == 16777216) {
                ;
            }

            if ((var10 & -16777216) == 33554432) {
                ;
            }

            int var11;
            int var12;
            int var13;
            int var14;
            if ((var10 & -16777216) == 50331648) {
                var11 = var10 & 16711935;
                var12 = var10 >> 8 & 255;

                for (var13 = 0; var13 < var9.length; ++var13) {
                    var14 = var9[var13];
                    if (var14 >> 8 == (var14 & 65535)) {
                        var14 &= 255;
                        var9[var13] = var11 * var14 >> 8 & 16711935 | var12 * var14 & 65280;
                    }
                }
            }

            for (var11 = 0; var11 < var9.length; ++var11) {
                var9[var11] = class124.method3044(var9[var11], var1);
            }

            if (var6 == 0) {
                var11 = 0;
            } else {
                var11 = this.field1596[var6 - 1];
            }

            if (var11 == 0) {
                if (var3 == var7.field3872) {
                    for (var12 = 0; var12 < var5; ++var12) {
                        this.field1592[var12] = var9[var8[var12] & 255];
                    }
                } else if (var7.field3872 == 64 && var3 == 128) {
                    var12 = 0;

                    for (var13 = 0; var13 < var3; ++var13) {
                        for (var14 = 0; var14 < var3; ++var14) {
                            this.field1592[var12++] = var9[var8[(var13 >> 1 << 6) + (var14 >> 1)]
                                & 255];
                        }
                    }
                } else {
                    if (var7.field3872 != 128 || var3 != 64) {
                        throw new RuntimeException();
                    }

                    var12 = 0;

                    for (var13 = 0; var13 < var3; ++var13) {
                        for (var14 = 0; var14 < var3; ++var14) {
                            this.field1592[var12++] = var9[var8[(var14 << 1) + (var13 << 1 << 7)]
                                & 255];
                        }
                    }
                }
            }

            if (var11 == 1) {
                ;
            }

            if (var11 == 2) {
                ;
            }

            if (var11 == 3) {
                ;
            }
        }

        return true;
    }

    void method2856(int var1) {
        if (this.field1592 != null) {
            short var2;
            int var3;
            int var4;
            int var5;
            int var6;
            int var7;
            int[] var10;
            if (this.field1599 == 1 || this.field1599 == 3) {
                if (field1603 == null || field1603.length < this.field1592.length) {
                    field1603 = new int[this.field1592.length];
                }

                if (this.field1592.length == 4096) {
                    var2 = 64;
                } else {
                    var2 = 128;
                }

                var3 = this.field1592.length;
                var4 = var2 * this.field1591 * var1;
                var5 = var3 - 1;
                if (this.field1599 == 1) {
                    var4 = -var4;
                }

                for (var6 = 0; var6 < var3; ++var6) {
                    var7 = var6 + var4 & var5;
                    field1603[var6] = this.field1592[var7];
                }

                var10 = this.field1592;
                this.field1592 = field1603;
                field1603 = var10;
            }

            if (this.field1599 == 2 || this.field1599 == 4) {
                if (field1603 == null || field1603.length < this.field1592.length) {
                    field1603 = new int[this.field1592.length];
                }

                if (this.field1592.length == 4096) {
                    var2 = 64;
                } else {
                    var2 = 128;
                }

                var3 = this.field1592.length;
                var4 = this.field1591 * var1;
                var5 = var2 - 1;
                if (this.field1599 == 2) {
                    var4 = -var4;
                }

                for (var6 = 0; var6 < var3; var6 += var2) {
                    for (var7 = 0; var7 < var2; ++var7) {
                        int var8 = var6 + var7;
                        int var9 = var6 + (var7 + var4 & var5);
                        field1603[var8] = this.field1592[var9];
                    }
                }

                var10 = this.field1592;
                this.field1592 = field1603;
                field1603 = var10;
            }

        }
    }
}
