package jagex.osrs;

public class class92 {

    float[][] field1304;
    int field1302;
    int[] field1305;
    int[] field1301;
    int field1300;
    int[] field1303;

    class92() {
        class94.method2287(24);
        this.field1300 = class94.method2287(16);
        this.field1302 = class94.method2287(24);
        this.field1301 = new int[this.field1302];
        boolean var1 = class94.method2302() != 0;
        int var2;
        int var3;
        int var5;
        if (var1) {
            var2 = 0;

            for (var3 = class94.method2287(5) + 1; var2 < this.field1302; ++var3) {
                int var4 = class94.method2287(class16.method206(this.field1302 - var2, 2143037911));

                for (var5 = 0; var5 < var4; ++var5) {
                    this.field1301[var2++] = var3;
                }
            }
        } else {
            boolean var14 = class94.method2302() != 0;

            for (var3 = 0; var3 < this.field1302; ++var3) {
                if (var14 && class94.method2302() == 0) {
                    this.field1301[var3] = 0;
                } else {
                    this.field1301[var3] = class94.method2287(5) + 1;
                }
            }
        }

        this.method2268();
        var2 = class94.method2287(4);
        if (var2 > 0) {
            float var15 = class94.method2289(class94.method2287(32));
            float var16 = class94.method2289(class94.method2287(32));
            var5 = class94.method2287(4) + 1;
            boolean var6 = class94.method2302() != 0;
            int var7;
            if (var2 == 1) {
                var7 = method2263(this.field1302, this.field1300);
            } else {
                var7 = this.field1302 * this.field1300;
            }

            this.field1303 = new int[var7];

            int var8;
            for (var8 = 0; var8 < var7; ++var8) {
                this.field1303[var8] = class94.method2287(var5);
            }

            this.field1304 = new float[this.field1302][this.field1300];
            float var9;
            int var10;
            int var11;
            if (var2 == 1) {
                for (var8 = 0; var8 < this.field1302; ++var8) {
                    var9 = 0.0F;
                    var10 = 1;

                    for (var11 = 0; var11 < this.field1300; ++var11) {
                        int var12 = var8 / var10 % var7;
                        float var13 = (float) this.field1303[var12] * var16 + var15 + var9;
                        this.field1304[var8][var11] = var13;
                        if (var6) {
                            var9 = var13;
                        }

                        var10 *= var7;
                    }
                }
            } else {
                for (var8 = 0; var8 < this.field1302; ++var8) {
                    var9 = 0.0F;
                    var10 = var8 * this.field1300;

                    for (var11 = 0; var11 < this.field1300; ++var11) {
                        float var17 = (float) this.field1303[var10] * var16 + var15 + var9;
                        this.field1304[var8][var11] = var17;
                        if (var6) {
                            var9 = var17;
                        }

                        ++var10;
                    }
                }
            }
        }

    }

    static int method2263(int var0, int var1) {
        int var2 = (int) Math.pow((double) var0, 1.0D / (double) var1) + 1;

        while (true) {
            int var4 = var2;
            int var5 = var1;

            int var6;
            for (var6 = 1; var5 > 1; var5 >>= 1) {
                if ((var5 & 1) != 0) {
                    var6 *= var4;
                }

                var4 *= var4;
            }

            int var3;
            if (var5 == 1) {
                var3 = var6 * var4;
            } else {
                var3 = var6;
            }

            if (var3 <= var0) {
                return var2;
            }

            --var2;
        }
    }

    int method2262() {
        int var1;
        for (var1 = 0; this.field1305[var1] >= 0;
             var1 = class94.method2302() != 0 ? this.field1305[var1] : var1 + 1) {
            ;
        }

        return ~this.field1305[var1];
    }

    float[] method2270() {
        return this.field1304[this.method2262()];
    }

    void method2268() {
        int[] var1 = new int[this.field1302];
        int[] var2 = new int[33];

        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var10;
        for (var3 = 0; var3 < this.field1302; ++var3) {
            var4 = this.field1301[var3];
            if (var4 != 0) {
                var5 = 1 << 32 - var4;
                var6 = var2[var4];
                var1[var3] = var6;
                int var12;
                if ((var6 & var5) != 0) {
                    var7 = var2[var4 - 1];
                } else {
                    var7 = var6 | var5;

                    for (var8 = var4 - 1; var8 >= 1; --var8) {
                        var12 = var2[var8];
                        if (var12 != var6) {
                            break;
                        }

                        var10 = 1 << 32 - var8;
                        if ((var12 & var10) != 0) {
                            var2[var8] = var2[var8 - 1];
                            break;
                        }

                        var2[var8] = var12 | var10;
                    }
                }

                var2[var4] = var7;

                for (var8 = var4 + 1; var8 <= 32; ++var8) {
                    var12 = var2[var8];
                    if (var12 == var6) {
                        var2[var8] = var7;
                    }
                }
            }
        }

        this.field1305 = new int[8];
        int var11 = 0;

        for (var3 = 0; var3 < this.field1302; ++var3) {
            var4 = this.field1301[var3];
            if (var4 != 0) {
                var5 = var1[var3];
                var6 = 0;

                for (var7 = 0; var7 < var4; ++var7) {
                    var8 = Integer.MIN_VALUE >>> var7;
                    if ((var5 & var8) != 0) {
                        if (this.field1305[var6] == 0) {
                            this.field1305[var6] = var11;
                        }

                        var6 = this.field1305[var6];
                    } else {
                        ++var6;
                    }

                    if (var6 >= this.field1305.length) {
                        int[] var9 = new int[this.field1305.length * 2];

                        for (var10 = 0; var10 < this.field1305.length; ++var10) {
                            var9[var10] = this.field1305[var10];
                        }

                        this.field1305 = var9;
                    }

                    var8 >>>= 1;
                }

                this.field1305[var6] = ~var3;
                if (var6 >= var11) {
                    var11 = var6 + 1;
                }
            }
        }

    }
}
