package jagex.osrs;

public class class267 extends class208 {

    static class202 field3413;
    static class249 field3411;

    static {
        field3413 = new class202(64);
    }

    class199 field3410;

    static final boolean method5220(char var0, int var1) {
        return var0 == 160 || var0 == ' ' || var0 == '_' || var0 == '-';
    }

    static final void method5221(Player var0, int var1, int var2, byte var3, int var4) {
        int var5 = var0.wx[0];
        int var6 = var0.wz[0];
        int var7 = var0.getSize();
        if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7) {
            if (var1 >= var7 && var1 < 104 - var7 && var2 >= var7 && var2 < 104 - var7) {
                int var9 = var0.getSize();
                client.field670.field2116 = var1;
                client.field670.field2112 = var2;
                client.field670.field2114 = 1;
                client.field670.field2115 = 1;
                class60 var10 = client.field670;
                class60 var11 = var10;
                class166 var12 = client.field701[var0.level];
                int[] var13 = client.field918;
                int[] var14 = client.field900;

                int var15;
                int var16;
                for (var15 = 0; var15 < 128; ++var15) {
                    for (var16 = 0; var16 < 128; ++var16) {
                        class167.field2105[var15][var16] = 0;
                        class167.field2103[var15][var16] = 99999999;
                    }
                }

                int var17;
                int var18;
                byte var19;
                byte var20;
                int var21;
                int var22;
                byte var23;
                int var24;
                int[][] var25;
                int var26;
                int var27;
                int var28;
                int var29;
                boolean var35;
                boolean var36;
                int var37;
                int var38;
                int var40;
                if (var9 == 1) {
                    var17 = var5;
                    var18 = var6;
                    var19 = 64;
                    var20 = 64;
                    var21 = var5 - var19;
                    var22 = var6 - var20;
                    class167.field2105[var19][var20] = 99;
                    class167.field2103[var19][var20] = 0;
                    var23 = 0;
                    var24 = 0;
                    class167.field2106[var23] = var5;
                    var40 = var23 + 1;
                    class167.field2110[var23] = var6;
                    var25 = var12.field2101;

                    while (true) {
                        if (var40 == var24) {
                            class233.field2809 = var17;
                            class167.field2107 = var18;
                            var36 = false;
                            break;
                        }

                        var17 = class167.field2106[var24];
                        var18 = class167.field2110[var24];
                        var24 = var24 + 1 & 4095;
                        var37 = var17 - var21;
                        var38 = var18 - var22;
                        var26 = var17 - var12.field2097;
                        var27 = var18 - var12.field2086;
                        if (var11.vmethod3646(1, var17, var18, var12, -526885180)) {
                            class233.field2809 = var17;
                            class167.field2107 = var18;
                            var36 = true;
                            break;
                        }

                        var28 = class167.field2103[var37][var38] + 1;
                        if (var37 > 0 && class167.field2105[var37 - 1][var38] == 0
                            && (var25[var26 - 1][var27] & 19136776) == 0) {
                            class167.field2106[var40] = var17 - 1;
                            class167.field2110[var40] = var18;
                            var40 = var40 + 1 & 4095;
                            class167.field2105[var37 - 1][var38] = 2;
                            class167.field2103[var37 - 1][var38] = var28;
                        }

                        if (var37 < 127 && class167.field2105[var37 + 1][var38] == 0
                            && (var25[var26 + 1][var27] & 19136896) == 0) {
                            class167.field2106[var40] = var17 + 1;
                            class167.field2110[var40] = var18;
                            var40 = var40 + 1 & 4095;
                            class167.field2105[var37 + 1][var38] = 8;
                            class167.field2103[var37 + 1][var38] = var28;
                        }

                        if (var38 > 0 && class167.field2105[var37][var38 - 1] == 0
                            && (var25[var26][var27 - 1] & 19136770) == 0) {
                            class167.field2106[var40] = var17;
                            class167.field2110[var40] = var18 - 1;
                            var40 = var40 + 1 & 4095;
                            class167.field2105[var37][var38 - 1] = 1;
                            class167.field2103[var37][var38 - 1] = var28;
                        }

                        if (var38 < 127 && class167.field2105[var37][var38 + 1] == 0
                            && (var25[var26][var27 + 1] & 19136800) == 0) {
                            class167.field2106[var40] = var17;
                            class167.field2110[var40] = var18 + 1;
                            var40 = var40 + 1 & 4095;
                            class167.field2105[var37][var38 + 1] = 4;
                            class167.field2103[var37][var38 + 1] = var28;
                        }

                        if (var37 > 0 && var38 > 0 && class167.field2105[var37 - 1][var38 - 1] == 0
                            && (var25[var26 - 1][var27 - 1] & 19136782) == 0
                            && (var25[var26 - 1][var27] & 19136776) == 0
                            && (var25[var26][var27 - 1] & 19136770) == 0) {
                            class167.field2106[var40] = var17 - 1;
                            class167.field2110[var40] = var18 - 1;
                            var40 = var40 + 1 & 4095;
                            class167.field2105[var37 - 1][var38 - 1] = 3;
                            class167.field2103[var37 - 1][var38 - 1] = var28;
                        }

                        if (var37 < 127 && var38 > 0
                            && class167.field2105[var37 + 1][var38 - 1] == 0
                            && (var25[var26 + 1][var27 - 1] & 19136899) == 0
                            && (var25[var26 + 1][var27] & 19136896) == 0
                            && (var25[var26][var27 - 1] & 19136770) == 0) {
                            class167.field2106[var40] = var17 + 1;
                            class167.field2110[var40] = var18 - 1;
                            var40 = var40 + 1 & 4095;
                            class167.field2105[var37 + 1][var38 - 1] = 9;
                            class167.field2103[var37 + 1][var38 - 1] = var28;
                        }

                        if (var37 > 0 && var38 < 127
                            && class167.field2105[var37 - 1][var38 + 1] == 0
                            && (var25[var26 - 1][var27 + 1] & 19136824) == 0
                            && (var25[var26 - 1][var27] & 19136776) == 0
                            && (var25[var26][var27 + 1] & 19136800) == 0) {
                            class167.field2106[var40] = var17 - 1;
                            class167.field2110[var40] = var18 + 1;
                            var40 = var40 + 1 & 4095;
                            class167.field2105[var37 - 1][var38 + 1] = 6;
                            class167.field2103[var37 - 1][var38 + 1] = var28;
                        }

                        if (var37 < 127 && var38 < 127
                            && class167.field2105[var37 + 1][var38 + 1] == 0
                            && (var25[var26 + 1][var27 + 1] & 19136992) == 0
                            && (var25[var26 + 1][var27] & 19136896) == 0
                            && (var25[var26][var27 + 1] & 19136800) == 0) {
                            class167.field2106[var40] = var17 + 1;
                            class167.field2110[var40] = var18 + 1;
                            var40 = var40 + 1 & 4095;
                            class167.field2105[var37 + 1][var38 + 1] = 12;
                            class167.field2103[var37 + 1][var38 + 1] = var28;
                        }
                    }

                    var35 = var36;
                } else if (var9 == 2) {
                    var35 = class144.method3342(var5, var6, var10, var12, -929669781);
                } else {
                    var17 = var5;
                    var18 = var6;
                    var19 = 64;
                    var20 = 64;
                    var21 = var5 - var19;
                    var22 = var6 - var20;
                    class167.field2105[var19][var20] = 99;
                    class167.field2103[var19][var20] = 0;
                    var23 = 0;
                    var24 = 0;
                    class167.field2106[var23] = var5;
                    var40 = var23 + 1;
                    class167.field2110[var23] = var6;
                    var25 = var12.field2101;

                    label641:
                    while (true) {
                        label639:
                        while (true) {
                            do {
                                do {
                                    do {
                                        label616:
                                        do {
                                            if (var24 == var40) {
                                                class233.field2809 = var17;
                                                class167.field2107 = var18;
                                                var36 = false;
                                                break label641;
                                            }

                                            var17 = class167.field2106[var24];
                                            var18 = class167.field2110[var24];
                                            var24 = var24 + 1 & 4095;
                                            var37 = var17 - var21;
                                            var38 = var18 - var22;
                                            var26 = var17 - var12.field2097;
                                            var27 = var18 - var12.field2086;
                                            if (var11.vmethod3646(var9, var17, var18, var12,
                                                                  528540028)) {
                                                class233.field2809 = var17;
                                                class167.field2107 = var18;
                                                var36 = true;
                                                break label641;
                                            }

                                            var28 = class167.field2103[var37][var38] + 1;
                                            if (var37 > 0
                                                && class167.field2105[var37 - 1][var38] == 0
                                                && (var25[var26 - 1][var27] & 19136782) == 0
                                                && (var25[var26 - 1][var27 + var9 - 1] & 19136824)
                                                == 0) {
                                                var29 = 1;

                                                while (true) {
                                                    if (var29 >= var9 - 1) {
                                                        class167.field2106[var40] = var17 - 1;
                                                        class167.field2110[var40] = var18;
                                                        var40 = var40 + 1 & 4095;
                                                        class167.field2105[var37 - 1][var38] = 2;
                                                        class167.field2103[var37
                                                            - 1][var38] = var28;
                                                        break;
                                                    }

                                                    if ((var25[var26 - 1][var29 + var27] & 19136830)
                                                        != 0) {
                                                        break;
                                                    }

                                                    ++var29;
                                                }
                                            }

                                            if (var37 < 128 - var9
                                                && class167.field2105[var37 + 1][var38] == 0
                                                && (var25[var26 + var9][var27] & 19136899) == 0 &&
                                                (var25[var9 + var26][var27 + var9 - 1] & 19136992)
                                                    == 0) {
                                                var29 = 1;

                                                while (true) {
                                                    if (var29 >= var9 - 1) {
                                                        class167.field2106[var40] = var17 + 1;
                                                        class167.field2110[var40] = var18;
                                                        var40 = var40 + 1 & 4095;
                                                        class167.field2105[var37 + 1][var38] = 8;
                                                        class167.field2103[var37
                                                            + 1][var38] = var28;
                                                        break;
                                                    }

                                                    if ((var25[var9 + var26][var27 + var29]
                                                        & 19136995) != 0) {
                                                        break;
                                                    }

                                                    ++var29;
                                                }
                                            }

                                            if (var38 > 0
                                                && class167.field2105[var37][var38 - 1] == 0
                                                && (var25[var26][var27 - 1] & 19136782) == 0
                                                && (var25[var26 + var9 - 1][var27 - 1] & 19136899)
                                                == 0) {
                                                var29 = 1;

                                                while (true) {
                                                    if (var29 >= var9 - 1) {
                                                        class167.field2106[var40] = var17;
                                                        class167.field2110[var40] = var18 - 1;
                                                        var40 = var40 + 1 & 4095;
                                                        class167.field2105[var37][var38 - 1] = 1;
                                                        class167.field2103[var37][var38
                                                            - 1] = var28;
                                                        break;
                                                    }

                                                    if ((var25[var29 + var26][var27 - 1] & 19136911)
                                                        != 0) {
                                                        break;
                                                    }

                                                    ++var29;
                                                }
                                            }

                                            if (var38 < 128 - var9
                                                && class167.field2105[var37][var38 + 1] == 0
                                                && (var25[var26][var9 + var27] & 19136824) == 0 &&
                                                (var25[var26 + var9 - 1][var9 + var27] & 19136992)
                                                    == 0) {
                                                var29 = 1;

                                                while (true) {
                                                    if (var29 >= var9 - 1) {
                                                        class167.field2106[var40] = var17;
                                                        class167.field2110[var40] = var18 + 1;
                                                        var40 = var40 + 1 & 4095;
                                                        class167.field2105[var37][var38 + 1] = 4;
                                                        class167.field2103[var37][var38
                                                            + 1] = var28;
                                                        break;
                                                    }

                                                    if ((var25[var29 + var26][var27 + var9]
                                                        & 19137016) != 0) {
                                                        break;
                                                    }

                                                    ++var29;
                                                }
                                            }

                                            if (var37 > 0 && var38 > 0
                                                && class167.field2105[var37 - 1][var38 - 1] == 0
                                                && (var25[var26 - 1][var27 - 1] & 19136782) == 0) {
                                                var29 = 1;

                                                while (true) {
                                                    if (var29 >= var9) {
                                                        class167.field2106[var40] = var17 - 1;
                                                        class167.field2110[var40] = var18 - 1;
                                                        var40 = var40 + 1 & 4095;
                                                        class167.field2105[var37 - 1][var38
                                                            - 1] = 3;
                                                        class167.field2103[var37 - 1][var38
                                                            - 1] = var28;
                                                        break;
                                                    }

                                                    if ((var25[var26 - 1][var29 + (var27 - 1)]
                                                        & 19136830) != 0 ||
                                                        (var25[var29 + (var26 - 1)][var27 - 1]
                                                            & 19136911) != 0) {
                                                        break;
                                                    }

                                                    ++var29;
                                                }
                                            }

                                            if (var37 < 128 - var9 && var38 > 0
                                                && class167.field2105[var37 + 1][var38 - 1] == 0
                                                && (var25[var26 + var9][var27 - 1] & 19136899)
                                                == 0) {
                                                var29 = 1;

                                                while (true) {
                                                    if (var29 >= var9) {
                                                        class167.field2106[var40] = var17 + 1;
                                                        class167.field2110[var40] = var18 - 1;
                                                        var40 = var40 + 1 & 4095;
                                                        class167.field2105[var37 + 1][var38
                                                            - 1] = 9;
                                                        class167.field2103[var37 + 1][var38
                                                            - 1] = var28;
                                                        break;
                                                    }

                                                    if ((var25[var26 + var9][var29 + (var27 - 1)]
                                                        & 19136995) != 0 ||
                                                        (var25[var26 + var29][var27 - 1] & 19136911)
                                                            != 0) {
                                                        break;
                                                    }

                                                    ++var29;
                                                }
                                            }

                                            if (var37 > 0 && var38 < 128 - var9
                                                && class167.field2105[var37 - 1][var38 + 1] == 0
                                                && (var25[var26 - 1][var9 + var27] & 19136824)
                                                == 0) {
                                                for (var29 = 1; var29 < var9; ++var29) {
                                                    if ((var25[var26 - 1][var27 + var29] & 19136830)
                                                        != 0 ||
                                                        (var25[var29 + (var26 - 1)][var27 + var9]
                                                            & 19137016) != 0) {
                                                        continue label616;
                                                    }
                                                }

                                                class167.field2106[var40] = var17 - 1;
                                                class167.field2110[var40] = var18 + 1;
                                                var40 = var40 + 1 & 4095;
                                                class167.field2105[var37 - 1][var38 + 1] = 6;
                                                class167.field2103[var37 - 1][var38 + 1] = var28;
                                            }
                                        } while (var37 >= 128 - var9);
                                    } while (var38 >= 128 - var9);
                                } while (class167.field2105[var37 + 1][var38 + 1] != 0);
                            } while ((var25[var26 + var9][var27 + var9] & 19136992) != 0);

                            for (var29 = 1; var29 < var9; ++var29) {
                                if ((var25[var26 + var29][var9 + var27] & 19137016) != 0
                                    || (var25[var9 + var26][var29 + var27] & 19136995) != 0) {
                                    continue label639;
                                }
                            }

                            class167.field2106[var40] = var17 + 1;
                            class167.field2110[var40] = var18 + 1;
                            var40 = var40 + 1 & 4095;
                            class167.field2105[var37 + 1][var38 + 1] = 12;
                            class167.field2103[var37 + 1][var38 + 1] = var28;
                        }
                    }

                    var35 = var36;
                }

                int var8;
                label697:
                {
                    var16 = var5 - 64;
                    var17 = var6 - 64;
                    var18 = class233.field2809;
                    var37 = class167.field2107;
                    if (!var35) {
                        var38 = Integer.MAX_VALUE;
                        var21 = Integer.MAX_VALUE;
                        byte var39 = 10;
                        var40 = var11.field2116;
                        var24 = var11.field2112;
                        int var34 = var11.field2114;
                        var26 = var11.field2115;

                        for (var27 = var40 - var39; var27 <= var40 + var39; ++var27) {
                            for (var28 = var24 - var39; var28 <= var24 + var39; ++var28) {
                                var29 = var27 - var16;
                                int var30 = var28 - var17;
                                if (var29 >= 0 && var30 >= 0 && var29 < 128 && var30 < 128
                                    && class167.field2103[var29][var30] < 100) {
                                    int var31 = 0;
                                    if (var27 < var40) {
                                        var31 = var40 - var27;
                                    } else if (var27 > var34 + var40 - 1) {
                                        var31 = var27 - (var40 + var34 - 1);
                                    }

                                    int var32 = 0;
                                    if (var28 < var24) {
                                        var32 = var24 - var28;
                                    } else if (var28 > var26 + var24 - 1) {
                                        var32 = var28 - (var24 + var26 - 1);
                                    }

                                    int var33 = var31 * var31 + var32 * var32;
                                    if (var33 < var38 || var33 == var38
                                        && class167.field2103[var29][var30] < var21) {
                                        var38 = var33;
                                        var21 = class167.field2103[var29][var30];
                                        var18 = var27;
                                        var37 = var28;
                                    }
                                }
                            }
                        }

                        if (var38 == Integer.MAX_VALUE) {
                            var8 = -1;
                            break label697;
                        }
                    }

                    if (var18 == var5 && var6 == var37) {
                        var8 = 0;
                    } else {
                        var20 = 0;
                        class167.field2106[var20] = var18;
                        var38 = var20 + 1;
                        class167.field2110[var20] = var37;

                        for (var21 = var22 = class167.field2105[var18 - var16][var37 - var17];
                             var18 != var5 || var37 != var6;
                             var21 = class167.field2105[var18 - var16][var37 - var17]) {
                            if (var22 != var21) {
                                var22 = var21;
                                class167.field2106[var38] = var18;
                                class167.field2110[var38++] = var37;
                            }

                            if ((var21 & 2) != 0) {
                                ++var18;
                            } else if ((var21 & 8) != 0) {
                                --var18;
                            }

                            if ((var21 & 1) != 0) {
                                ++var37;
                            } else if ((var21 & 4) != 0) {
                                --var37;
                            }
                        }

                        var40 = 0;

                        while (var38-- > 0) {
                            var13[var40] = class167.field2106[var38];
                            var14[var40++] = class167.field2110[var38];
                            if (var40 >= var13.length) {
                                break;
                            }
                        }

                        var8 = var40;
                    }
                }

                var15 = var8;
                if (var8 >= 1) {
                    for (var16 = 0; var16 < var15 - 1; ++var16) {
                        var0.method1195(client.field918[var16], client.field900[var16], var3,
                                        1910801327);
                    }

                }
            }
        }
    }

    void method5218(Buffer var1, int var2, byte var3) {
        if (var2 == 249) {
            this.field3410 = class226.method4634(var1, this.field3410, (short) -15741);
        }

    }

    public int method5195(int var1, int var2, int var3) {
        return class148.method3363(this.field3410, var1, var2, (byte) 89);
    }

    public String method5200(int var1, String var2, int var3) {
        return class148.method3369(this.field3410, var1, var2, (short) 3129);
    }

    void method5196(int var1) {
    }

    void method5199(Buffer var1, byte var2) {
        while (true) {
            int var3 = var1.getUByte();
            if (var3 == 0) {
                return;
            }

            this.method5218(var1, var3, (byte) 0);
        }
    }
}
