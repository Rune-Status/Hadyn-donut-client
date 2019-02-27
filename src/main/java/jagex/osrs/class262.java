package jagex.osrs;

public class class262 extends class208 {

    public static int field3368;
    public static class249 field3367;
    public static class249 field3378;
    static class202 field3369;

    static {
        field3369 = new class202(64);
    }

    public int field3366;
    public boolean field3377;
    int[] field3371;
    int[] field3376;
    short[] field3370;
    short[] field3374;
    short[] field3373;
    short[] field3372;

    class262() {
        this.field3366 = -1;
        this.field3376 = new int[]{-1, -1, -1, -1, -1};
        this.field3377 = false;
    }

    static final void method5145(byte[] var0, int var1, int var2, int var3, int var4, int var5,
                                 int var6, int var7, class166[] var8, byte var9) {
        int var11;
        for (int var10 = 0; var10 < 8; ++var10) {
            for (var11 = 0; var11 < 8; ++var11) {
                if (var10 + var2 > 0 && var10 + var2 < 103 && var3 + var11 > 0
                    && var3 + var11 < 103) {
                    var8[var1].field2101[var10 + var2][var3 + var11] &= -16777217;
                }
            }
        }

        Buffer var29 = new Buffer(var0);

        for (var11 = 0; var11 < 4; ++var11) {
            for (int var12 = 0; var12 < 64; ++var12) {
                for (int var13 = 0; var13 < 64; ++var13) {
                    if (var11 == var4 && var12 >= var5 && var12 < var5 + 8 && var13 >= var6
                        && var13 < var6 + 8) {
                        int var18 = var12 & 7;
                        int var19 = var13 & 7;
                        int var20 = var7 & 3;
                        int var17;
                        if (var20 == 0) {
                            var17 = var18;
                        } else if (var20 == 1) {
                            var17 = var19;
                        } else if (var20 == 2) {
                            var17 = 7 - var18;
                        } else {
                            var17 = 7 - var19;
                        }

                        int var23 = var2 + var17;
                        int var26 = var12 & 7;
                        int var27 = var13 & 7;
                        int var28 = var7 & 3;
                        int var25;
                        if (var28 == 0) {
                            var25 = var27;
                        } else if (var28 == 1) {
                            var25 = 7 - var26;
                        } else if (var28 == 2) {
                            var25 = 7 - var27;
                        } else {
                            var25 = var26;
                        }

                        class126
                            .method3053(var29, var1, var23, var3 + var25, 0, 0, var7, (byte) -53);
                    } else {
                        class126.method3053(var29, 0, -1, -1, 0, 0, 0, (byte) -32);
                    }
                }
            }
        }

    }

    void method5133(Buffer var1, int var2, int var3) {
        if (var2 == 1) {
            this.field3366 = var1.readUint8();
        } else {
            int var4;
            int var5;
            if (var2 == 2) {
                var4 = var1.readUint8();
                this.field3371 = new int[var4];

                for (var5 = 0; var5 < var4; ++var5) {
                    this.field3371[var5] = var1.readUint16();
                }
            } else if (var2 == 3) {
                this.field3377 = true;
            } else if (var2 == 40) {
                var4 = var1.readUint8();
                this.field3370 = new short[var4];
                this.field3373 = new short[var4];

                for (var5 = 0; var5 < var4; ++var5) {
                    this.field3370[var5] = (short) var1.readUint16();
                    this.field3373[var5] = (short) var1.readUint16();
                }
            } else if (var2 == 41) {
                var4 = var1.readUint8();
                this.field3374 = new short[var4];
                this.field3372 = new short[var4];

                for (var5 = 0; var5 < var4; ++var5) {
                    this.field3374[var5] = (short) var1.readUint16();
                    this.field3372[var5] = (short) var1.readUint16();
                }
            } else if (var2 >= 60 && var2 < 70) {
                this.field3376[var2 - 60] = var1.readUint16();
            }
        }

    }

    public boolean method5131(int var1) {
        boolean var2 = true;

        for (int var3 = 0; var3 < 5; ++var3) {
            if (this.field3376[var3] != -1 && !field3367
                .method4830(this.field3376[var3], 0, (byte) 9)) {
                var2 = false;
            }
        }

        return var2;
    }

    public class115 method5132(int var1) {
        class115[] var2 = new class115[5];
        int var3 = 0;

        for (int var4 = 0; var4 < 5; ++var4) {
            if (this.field3376[var4] != -1) {
                var2[var3++] = class115.method2843(field3367, this.field3376[var4], 0);
            }
        }

        class115 var6 = new class115(var2, var3);
        int var5;
        if (this.field3370 != null) {
            for (var5 = 0; var5 < this.field3370.length; ++var5) {
                var6.method2775(this.field3370[var5], this.field3373[var5]);
            }
        }

        if (this.field3374 != null) {
            for (var5 = 0; var5 < this.field3374.length; ++var5) {
                var6.method2785(this.field3374[var5], this.field3372[var5]);
            }
        }

        return var6;
    }

    public boolean method5130(int var1) {
        if (this.field3371 == null) {
            return true;
        } else {
            boolean var2 = true;

            for (int var3 = 0; var3 < this.field3371.length; ++var3) {
                if (!field3367.method4830(this.field3371[var3], 0, (byte) -107)) {
                    var2 = false;
                }
            }

            return var2;
        }
    }

    void method5128(Buffer var1, int var2) {
        while (true) {
            int var3 = var1.readUint8();
            if (var3 == 0) {
                return;
            }

            this.method5133(var1, var3, -671766700);
        }
    }

    public class115 method5127(byte var1) {
        if (this.field3371 == null) {
            return null;
        } else {
            class115[] var2 = new class115[this.field3371.length];

            for (int var3 = 0; var3 < this.field3371.length; ++var3) {
                var2[var3] = class115.method2843(field3367, this.field3371[var3], 0);
            }

            class115 var5;
            if (var2.length == 1) {
                var5 = var2[0];
            } else {
                var5 = new class115(var2, var2.length);
            }

            int var4;
            if (this.field3370 != null) {
                for (var4 = 0; var4 < this.field3370.length; ++var4) {
                    var5.method2775(this.field3370[var4], this.field3373[var4]);
                }
            }

            if (this.field3374 != null) {
                for (var4 = 0; var4 < this.field3374.length; ++var4) {
                    var5.method2785(this.field3374[var4], this.field3372[var4]);
                }
            }

            return var5;
        }
    }
}
