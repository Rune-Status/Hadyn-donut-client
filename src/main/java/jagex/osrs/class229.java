package jagex.osrs;

public class class229 {

    static final int[] field2644;
    public static short[][] field2638;
    public static short[] field2642;
    public static boolean field2648;
    static class202 field2636;
    static String[] field2646;

    static {
        field2644 = new int[]{8, 11, 4, 6, 9, 7, 10};
        field2636 = new class202(260);
    }

    public int field2639;
    public boolean field2637;
    int[] field2643;
    long field2640;
    int[] field2641;
    long field2645;

    public void method4664(int[] var1, int[] var2, boolean var3, int var4, int var5) {
        if (var1 == null) {
            var1 = new int[12];

            for (int var6 = 0; var6 < 7; ++var6) {
                for (int var7 = 0; var7 < class262.field3368; ++var7) {
                    class262 var8 = class171.method3656(var7, -270002449);
                    if (var8 != null && !var8.field3377 && var8.field3366 == var6 + (var3 ? 7
                        : 0)) {
                        var1[field2644[var6]] = var7 + 256;
                        break;
                    }
                }
            }
        }

        this.field2641 = var1;
        this.field2643 = var2;
        this.field2637 = var3;
        this.field2639 = var4;
        this.method4669(666329766);
    }

    public class121 method4670(class275 var1, int var2, class275 var3, int var4, byte var5) {
        if (this.field2639 != -1) {
            return class248.method4823(this.field2639, 4942164)
                           .method5414(var1, var2, var3, var4, -146752969);
        } else {
            long var6 = this.field2640;
            int[] var8 = this.field2641;
            if (var1 != null && (var1.field3628 >= 0 || var1.field3629 >= 0)) {
                var8 = new int[12];

                for (int var19 = 0; var19 < 12; ++var19) {
                    var8[var19] = this.field2641[var19];
                }

                if (var1.field3628 >= 0) {
                    var6 += (long) (var1.field3628 - this.field2641[5] << 40);
                    var8[5] = var1.field3628;
                }

                if (var1.field3629 >= 0) {
                    var6 += (long) (var1.field3629 - this.field2641[3] << 48);
                    var8[3] = var1.field3629;
                }
            }

            class121 var9 = (class121) field2636.method4198(var6);
            if (var9 == null) {
                boolean var10 = false;

                int var12;
                for (int var11 = 0; var11 < 12; ++var11) {
                    var12 = var8[var11];
                    if (var12 >= 256 && var12 < 512 && !class171.method3656(var12 - 256, -270002449)
                                                                .method5130(-1058310311)) {
                        var10 = true;
                    }

                    if (var12 >= 512 && !class84.method2125(var12 - 512, -205103429)
                                                .method5331(this.field2637, 1586509307)) {
                        var10 = true;
                    }
                }

                if (var10) {
                    if (this.field2645 != -1L) {
                        var9 = (class121) field2636.method4198(this.field2645);
                    }

                    if (var9 == null) {
                        return null;
                    }
                }

                if (var9 == null) {
                    class115[] var16 = new class115[12];
                    var12 = 0;

                    int var14;
                    for (int var13 = 0; var13 < 12; ++var13) {
                        var14 = var8[var13];
                        class115 var15;
                        if (var14 >= 256 && var14 < 512) {
                            var15 = class171.method3656(var14 - 256, -270002449)
                                            .method5127((byte) 0);
                            if (var15 != null) {
                                var16[var12++] = var15;
                            }
                        }

                        if (var14 >= 512) {
                            var15 = class84.method2125(var14 - 512, -205103429)
                                           .method5332(this.field2637, (byte) 10);
                            if (var15 != null) {
                                var16[var12++] = var15;
                            }
                        }
                    }

                    class115 var18 = new class115(var16, var12);

                    for (var14 = 0; var14 < 5; ++var14) {
                        if (this.field2643[var14] < class256.field3306[var14].length) {
                            var18.method2775(class39.field385[var14],
                                             class256.field3306[var14][this.field2643[var14]]);
                        }

                        if (this.field2643[var14] < field2638[var14].length) {
                            var18.method2775(field2642[var14],
                                             field2638[var14][this.field2643[var14]]);
                        }
                    }

                    var9 = var18.method2772(64, 850, -30, -50, -30);
                    field2636.method4204(var9, var6);
                    this.field2645 = var6;
                }
            }

            if (var1 == null && var3 == null) {
                return var9;
            } else {
                class121 var17;
                if (var1 != null && var3 != null) {
                    var17 = var1.method5459(var9, var2, var3, var4, -2120673223);
                } else if (var1 != null) {
                    var17 = var1.method5457(var9, var2, -1140097691);
                } else {
                    var17 = var3.method5457(var9, var4, -1140097691);
                }

                return var17;
            }
        }
    }

    void method4669(int var1) {
        long var2 = this.field2640;
        int var4 = this.field2641[5];
        int var5 = this.field2641[9];
        this.field2641[5] = var5;
        this.field2641[9] = var4;
        this.field2640 = 0L;

        int var6;
        for (var6 = 0; var6 < 12; ++var6) {
            this.field2640 <<= 4;
            if (this.field2641[var6] >= 256) {
                this.field2640 += (long) (this.field2641[var6] - 256);
            }
        }

        if (this.field2641[0] >= 256) {
            this.field2640 += (long) (this.field2641[0] - 256 >> 4);
        }

        if (this.field2641[1] >= 256) {
            this.field2640 += (long) (this.field2641[1] - 256 >> 8);
        }

        for (var6 = 0; var6 < 5; ++var6) {
            this.field2640 <<= 3;
            this.field2640 += (long) this.field2643[var6];
        }

        this.field2640 <<= 1;
        this.field2640 += (long) (this.field2637 ? 1 : 0);
        this.field2641[5] = var4;
        this.field2641[9] = var5;
        if (var2 != 0L && var2 != this.field2640) {
            field2636.method4197(var2);
        }

    }

    class115 method4671(int var1) {
        if (this.field2639 != -1) {
            return class248.method4823(this.field2639, 1524146393).method5430(2131419921);
        } else {
            boolean var2 = false;

            int var4;
            for (int var3 = 0; var3 < 12; ++var3) {
                var4 = this.field2641[var3];
                if (var4 >= 256 && var4 < 512 && !class171.method3656(var4 - 256, -270002449)
                                                          .method5131(275237055)) {
                    var2 = true;
                }

                if (var4 >= 512 && !class84.method2125(var4 - 512, -205103429)
                                           .method5333(this.field2637, -601287689)) {
                    var2 = true;
                }
            }

            if (var2) {
                return null;
            } else {
                class115[] var8 = new class115[12];
                var4 = 0;

                int var6;
                for (int var5 = 0; var5 < 12; ++var5) {
                    var6 = this.field2641[var5];
                    class115 var7;
                    if (var6 >= 256 && var6 < 512) {
                        var7 = class171.method3656(var6 - 256, -270002449).method5132(-1790881696);
                        if (var7 != null) {
                            var8[var4++] = var7;
                        }
                    }

                    if (var6 >= 512) {
                        var7 = class84.method2125(var6 - 512, -205103429)
                                      .method5365(this.field2637, (short) 13056);
                        if (var7 != null) {
                            var8[var4++] = var7;
                        }
                    }
                }

                class115 var9 = new class115(var8, var4);

                for (var6 = 0; var6 < 5; ++var6) {
                    if (this.field2643[var6] < class256.field3306[var6].length) {
                        var9.method2775(class39.field385[var6],
                                        class256.field3306[var6][this.field2643[var6]]);
                    }

                    if (this.field2643[var6] < field2638[var6].length) {
                        var9.method2775(field2642[var6], field2638[var6][this.field2643[var6]]);
                    }
                }

                return var9;
            }
        }
    }

    public int method4672(int var1) {
        return this.field2639 == -1 ? (this.field2641[0] << 15) + this.field2641[1] + (
            this.field2641[11] << 5) + (this.field2641[8] << 10) + (this.field2643[0] << 25) + (
            this.field2643[4] << 20)
            : 305419896 + class248.method4823(this.field2639, -1784511468).field3568;
    }

    public void method4665(int var1, boolean var2, byte var3) {
        if (var1 != 1 || !this.field2637) {
            int var4 = this.field2641[field2644[var1]];
            if (var4 != 0) {
                var4 -= 256;

                class262 var5;
                do {
                    if (!var2) {
                        --var4;
                        if (var4 < 0) {
                            var4 = class262.field3368 - 1;
                        }
                    } else {
                        ++var4;
                        if (var4 >= class262.field3368) {
                            var4 = 0;
                        }
                    }

                    var5 = class171.method3656(var4, -270002449);
                } while (var5 == null || var5.field3377
                    || var5.field3366 != (this.field2637 ? 7 : 0) + var1);

                this.field2641[field2644[var1]] = var4 + 256;
                this.method4669(2042711414);
            }
        }
    }

    public void method4666(int var1, boolean var2, int var3) {
        int var4 = this.field2643[var1];
        boolean var5;
        if (!var2) {
            do {
                --var4;
                if (var4 < 0) {
                    var4 = class256.field3306[var1].length - 1;
                }

                if (var1 == 4 && var4 >= 8) {
                    var5 = false;
                } else {
                    var5 = true;
                }
            } while (!var5);
        } else {
            do {
                ++var4;
                if (var4 >= class256.field3306[var1].length) {
                    var4 = 0;
                }

                if (var1 == 4 && var4 >= 8) {
                    var5 = false;
                } else {
                    var5 = true;
                }
            } while (!var5);
        }

        this.field2643[var1] = var4;
        this.method4669(-1352300503);
    }

    public void method4667(boolean var1, int var2) {
        if (this.field2637 != var1) {
            this.method4664((int[]) null, this.field2643, var1, -1, 978549285);
        }
    }

    public void method4668(Buffer var1, int var2) {
        var1.writeByte(this.field2637 ? 1 : 0);

        int var3;
        for (var3 = 0; var3 < 7; ++var3) {
            int var4 = this.field2641[field2644[var3]];
            if (var4 == 0) {
                var1.writeByte(-1);
            } else {
                var1.writeByte(var4 - 256);
            }
        }

        for (var3 = 0; var3 < 5; ++var3) {
            var1.writeByte(this.field2643[var3]);
        }

    }
}
