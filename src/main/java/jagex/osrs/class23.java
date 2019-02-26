package jagex.osrs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

public class class23 {

    static final class228 field240;
    static class203 field232;
    static class203 field235;

    static {
        field235 = new class203(37748736, 256);
        field232 = new class203(256, 256);
        field240 = new class228();
    }

    final HashMap field231;
    List field239;
    LinkedList field230;
    HashMap field241;
    int field233;
    class10 field236;
    int field238;
    int field234;
    int field237;

    class23(int var1, int var2, int var3, HashMap var4) {
        this.field233 = var1;
        this.field234 = var2;
        this.field230 = new LinkedList();
        this.field239 = new LinkedList();
        this.field241 = new HashMap();
        this.field237 = var3 | -16777216;
        this.field231 = var4;
    }

    public static void method342(byte var0) {
        class193.field2461.method4521((byte) 27);
        class219.field2529 = 1;
        class137.field1911 = null;
    }

    static final void method335(class232[] var0, int var1, int var2) {
        for (int var3 = 0; var3 < var0.length; ++var3) {
            class232 var4 = var0[var3];
            if (var4 != null) {
                if (var4.field2808 == 0) {
                    if (var4.field2791 != null) {
                        method335(var4.field2791, var1, 1644708717);
                    }

                    class56 var5 = (class56) client.field804.method4224((long) var4.field2770);
                    if (var5 != null) {
                        class33.method607(var5.field556, var1, 2104691117);
                    }
                }

                class57 var6;
                if (var1 == 0 && var4.field2789 != null) {
                    var6 = new class57();
                    var6.field570 = var4;
                    var6.field575 = var4.field2789;
                    class53.method1076(var6, -856957438);
                }

                if (var1 == 1 && var4.field2781 != null) {
                    if (var4.field2787 >= 0) {
                        class232 var7 = class18.method213(var4.field2770, -10045394);
                        if (var7 == null || var7.field2791 == null
                            || var4.field2787 >= var7.field2791.length
                            || var4 != var7.field2791[var4.field2787]) {
                            continue;
                        }
                    }

                    var6 = new class57();
                    var6.field570 = var4;
                    var6.field575 = var4.field2781;
                    class53.method1076(var6, -2007353271);
                }
            }
        }

    }

    static final void method381(int var0, int var1, int var2, int var3, int var4, int var5,
                                class127 var6, class166 var7, byte var8) {
        if (!client.lowMemory || (class50.field492[0][var1][var2] & 2) != 0
            || (class50.field492[var0][var1][var2] & 16) == 0) {
            if (var0 < class50.field493) {
                class50.field493 = var0;
            }

            class270 var9 = class253.method4993(var3, (byte) 16);
            int var10;
            int var11;
            if (var4 != 1 && var4 != 3) {
                var10 = var9.field3501;
                var11 = var9.field3475;
            } else {
                var10 = var9.field3475;
                var11 = var9.field3501;
            }

            int var12;
            int var13;
            if (var10 + var1 <= 104) {
                var12 = (var10 >> 1) + var1;
                var13 = (var10 + 1 >> 1) + var1;
            } else {
                var12 = var1;
                var13 = var1 + 1;
            }

            int var14;
            int var15;
            if (var11 + var2 <= 104) {
                var14 = (var11 >> 1) + var2;
                var15 = var2 + (var11 + 1 >> 1);
            } else {
                var14 = var2;
                var15 = var2 + 1;
            }

            int[][] var16 = class50.field506[var0];
            int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15]
                + var16[var13][var15] >> 2;
            int var18 = (var1 << 7) + (var10 << 6);
            int var19 = (var2 << 7) + (var11 << 6);
            long var20 = class0.method12(var1, var2, 2, var9.field3470 == 0, var3, -332050576);
            int var22 = var5 + (var4 << 6);
            if (var9.field3464 == 1) {
                var22 += 256;
            }

            int var24;
            int var25;
            if (var9.method5282(-1361071379)) {
                class69 var23 = new class69();
                var23.field1048 = var0;
                var23.field1049 = var1 * 128;
                var23.field1059 = var2 * 128;
                var24 = var9.field3501;
                var25 = var9.field3475;
                if (var4 == 1 || var4 == 3) {
                    var24 = var9.field3475;
                    var25 = var9.field3501;
                }

                var23.field1062 = (var24 + var1) * 128;
                var23.field1052 = (var25 + var2) * 128;
                var23.field1054 = var9.field3491;
                var23.field1053 = var9.field3496 * 128;
                var23.field1056 = var9.field3497;
                var23.field1057 = var9.field3498;
                var23.field1058 = var9.field3499;
                if (var9.field3480 != null) {
                    var23.field1061 = var9;
                    var23.method1832(1885045120);
                }

                class69.field1051.method4276(var23);
                if (var23.field1058 != null) {
                    var23.field1055 =
                        var23.field1056 + (int) (Math.random() * (double) (var23.field1057
                            - var23.field1056));
                }
            }

            Object var35;
            if (var5 == 22) {
                if (!client.lowMemory || var9.field3470 != 0 || var9.field3495 == 1
                    || var9.field3489) {
                    if (var9.field3474 == -1 && var9.field3480 == null) {
                        var35 = var9.method5288(22, var4, var16, var18, var17, var19, -1207743094);
                    } else {
                        var35 = new class87(var3, 22, var4, var0, var1, var2, var9.field3474, true,
                                            (class129) null);
                    }

                    var6.method3063(var0, var1, var2, var17, (class129) var35, var20, var22);
                    if (var9.field3495 == 1 && var7 != null) {
                        var7.method3614(var1, var2, -1485077149);
                    }

                }
            } else if (var5 != 10 && var5 != 11) {
                if (var5 >= 12) {
                    if (var9.field3474 == -1 && var9.field3480 == null) {
                        var35 = var9
                            .method5288(var5, var4, var16, var18, var17, var19, -1318761153);
                    } else {
                        var35 = new class87(var3, var5, var4, var0, var1, var2, var9.field3474,
                                            true, (class129) null);
                    }

                    var6.method3067(var0, var1, var2, var17, 1, 1, (class129) var35, 0, var20,
                                    var22);
                    if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) {
                        class55.field553[var0][var1][var2] |= 2340;
                    }

                    if (var9.field3495 != 0 && var7 != null) {
                        var7.method3639(var1, var2, var10, var11, var9.field3468, -170376128);
                    }

                } else if (var5 == 0) {
                    if (var9.field3474 == -1 && var9.field3480 == null) {
                        var35 = var9.method5288(0, var4, var16, var18, var17, var19, -1916070437);
                    } else {
                        var35 = new class87(var3, 0, var4, var0, var1, var2, var9.field3474, true,
                                            (class129) null);
                    }

                    var6.method3065(var0, var1, var2, var17, (class129) var35, (class129) null,
                                    class50.field491[var4], 0, var20, var22);
                    if (var4 == 0) {
                        if (var9.field3482) {
                            class50.field503[var0][var1][var2] = 50;
                            class50.field503[var0][var1][var2 + 1] = 50;
                        }

                        if (var9.field3467) {
                            class55.field553[var0][var1][var2] |= 585;
                        }
                    } else if (var4 == 1) {
                        if (var9.field3482) {
                            class50.field503[var0][var1][var2 + 1] = 50;
                            class50.field503[var0][var1 + 1][var2 + 1] = 50;
                        }

                        if (var9.field3467) {
                            class55.field553[var0][var1][var2 + 1] |= 1170;
                        }
                    } else if (var4 == 2) {
                        if (var9.field3482) {
                            class50.field503[var0][var1 + 1][var2] = 50;
                            class50.field503[var0][var1 + 1][var2 + 1] = 50;
                        }

                        if (var9.field3467) {
                            class55.field553[var0][var1 + 1][var2] |= 585;
                        }
                    } else if (var4 == 3) {
                        if (var9.field3482) {
                            class50.field503[var0][var1][var2] = 50;
                            class50.field503[var0][var1 + 1][var2] = 50;
                        }

                        if (var9.field3467) {
                            class55.field553[var0][var1][var2] |= 1170;
                        }
                    }

                    if (var9.field3495 != 0 && var7 != null) {
                        var7.method3613(var1, var2, var5, var4, var9.field3468, -691898352);
                    }

                    if (var9.field3458 != 16) {
                        var6.method3073(var0, var1, var2, var9.field3458);
                    }

                } else if (var5 == 1) {
                    if (var9.field3474 == -1 && var9.field3480 == null) {
                        var35 = var9.method5288(1, var4, var16, var18, var17, var19, -1707991958);
                    } else {
                        var35 = new class87(var3, 1, var4, var0, var1, var2, var9.field3474, true,
                                            (class129) null);
                    }

                    var6.method3065(var0, var1, var2, var17, (class129) var35, (class129) null,
                                    class50.field499[var4], 0, var20, var22);
                    if (var9.field3482) {
                        if (var4 == 0) {
                            class50.field503[var0][var1][var2 + 1] = 50;
                        } else if (var4 == 1) {
                            class50.field503[var0][var1 + 1][var2 + 1] = 50;
                        } else if (var4 == 2) {
                            class50.field503[var0][var1 + 1][var2] = 50;
                        } else if (var4 == 3) {
                            class50.field503[var0][var1][var2] = 50;
                        }
                    }

                    if (var9.field3495 != 0 && var7 != null) {
                        var7.method3613(var1, var2, var5, var4, var9.field3468, 472290189);
                    }

                } else {
                    int var29;
                    if (var5 == 2) {
                        var29 = var4 + 1 & 3;
                        Object var30;
                        Object var31;
                        if (var9.field3474 == -1 && var9.field3480 == null) {
                            var30 = var9
                                .method5288(2, var4 + 4, var16, var18, var17, var19, -1545062884);
                            var31 = var9
                                .method5288(2, var29, var16, var18, var17, var19, -1372999268);
                        } else {
                            var30 = new class87(var3, 2, var4 + 4, var0, var1, var2, var9.field3474,
                                                true, (class129) null);
                            var31 = new class87(var3, 2, var29, var0, var1, var2, var9.field3474,
                                                true, (class129) null);
                        }

                        var6.method3065(var0, var1, var2, var17, (class129) var30, (class129) var31,
                                        class50.field491[var4], class50.field491[var29], var20,
                                        var22);
                        if (var9.field3467) {
                            if (var4 == 0) {
                                class55.field553[var0][var1][var2] |= 585;
                                class55.field553[var0][var1][1 + var2] |= 1170;
                            } else if (var4 == 1) {
                                class55.field553[var0][var1][var2 + 1] |= 1170;
                                class55.field553[var0][var1 + 1][var2] |= 585;
                            } else if (var4 == 2) {
                                class55.field553[var0][var1 + 1][var2] |= 585;
                                class55.field553[var0][var1][var2] |= 1170;
                            } else if (var4 == 3) {
                                class55.field553[var0][var1][var2] |= 1170;
                                class55.field553[var0][var1][var2] |= 585;
                            }
                        }

                        if (var9.field3495 != 0 && var7 != null) {
                            var7.method3613(var1, var2, var5, var4, var9.field3468, 1781688830);
                        }

                        if (var9.field3458 != 16) {
                            var6.method3073(var0, var1, var2, var9.field3458);
                        }

                    } else if (var5 == 3) {
                        if (var9.field3474 == -1 && var9.field3480 == null) {
                            var35 = var9
                                .method5288(3, var4, var16, var18, var17, var19, -1268224268);
                        } else {
                            var35 = new class87(var3, 3, var4, var0, var1, var2, var9.field3474,
                                                true, (class129) null);
                        }

                        var6.method3065(var0, var1, var2, var17, (class129) var35, (class129) null,
                                        class50.field499[var4], 0, var20, var22);
                        if (var9.field3482) {
                            if (var4 == 0) {
                                class50.field503[var0][var1][var2 + 1] = 50;
                            } else if (var4 == 1) {
                                class50.field503[var0][var1 + 1][var2 + 1] = 50;
                            } else if (var4 == 2) {
                                class50.field503[var0][var1 + 1][var2] = 50;
                            } else if (var4 == 3) {
                                class50.field503[var0][var1][var2] = 50;
                            }
                        }

                        if (var9.field3495 != 0 && var7 != null) {
                            var7.method3613(var1, var2, var5, var4, var9.field3468, -1569728628);
                        }

                    } else if (var5 == 9) {
                        if (var9.field3474 == -1 && var9.field3480 == null) {
                            var35 = var9
                                .method5288(var5, var4, var16, var18, var17, var19, -1419719214);
                        } else {
                            var35 = new class87(var3, var5, var4, var0, var1, var2, var9.field3474,
                                                true, (class129) null);
                        }

                        var6.method3067(var0, var1, var2, var17, 1, 1, (class129) var35, 0, var20,
                                        var22);
                        if (var9.field3495 != 0 && var7 != null) {
                            var7.method3639(var1, var2, var10, var11, var9.field3468, -827008301);
                        }

                        if (var9.field3458 != 16) {
                            var6.method3073(var0, var1, var2, var9.field3458);
                        }

                    } else if (var5 == 4) {
                        if (var9.field3474 == -1 && var9.field3480 == null) {
                            var35 = var9
                                .method5288(4, var4, var16, var18, var17, var19, -1961603160);
                        } else {
                            var35 = new class87(var3, 4, var4, var0, var1, var2, var9.field3474,
                                                true, (class129) null);
                        }

                        var6.method3066(var0, var1, var2, var17, (class129) var35, (class129) null,
                                        class50.field491[var4], 0, 0, 0, var20, var22);
                    } else {
                        long var32;
                        Object var34;
                        if (var5 == 5) {
                            var29 = 16;
                            var32 = var6.method3083(var0, var1, var2);
                            if (var32 != 0L) {
                                var29 = class253
                                    .method4993(class56.method1110(var32), (byte) -56).field3458;
                            }

                            if (var9.field3474 == -1 && var9.field3480 == null) {
                                var34 = var9
                                    .method5288(4, var4, var16, var18, var17, var19, -1898163871);
                            } else {
                                var34 = new class87(var3, 4, var4, var0, var1, var2, var9.field3474,
                                                    true, (class129) null);
                            }

                            var6.method3066(var0, var1, var2, var17, (class129) var34,
                                            (class129) null, class50.field491[var4], 0,
                                            var29 * class50.field497[var4],
                                            var29 * class50.field501[var4], var20, var22);
                        } else if (var5 == 6) {
                            var29 = 8;
                            var32 = var6.method3083(var0, var1, var2);
                            if (var32 != 0L) {
                                var29 = class253
                                    .method4993(class56.method1110(var32), (byte) 77).field3458 / 2;
                            }

                            if (var9.field3474 == -1 && var9.field3480 == null) {
                                var34 = var9.method5288(4, var4 + 4, var16, var18, var17, var19,
                                                        -1622337725);
                            } else {
                                var34 = new class87(var3, 4, var4 + 4, var0, var1, var2,
                                                    var9.field3474, true, (class129) null);
                            }

                            var6.method3066(var0, var1, var2, var17, (class129) var34,
                                            (class129) null, 256, var4,
                                            var29 * class50.field502[var4],
                                            var29 * class50.field507[var4], var20, var22);
                        } else if (var5 == 7) {
                            var24 = var4 + 2 & 3;
                            if (var9.field3474 == -1 && var9.field3480 == null) {
                                var35 = var9.method5288(4, var24 + 4, var16, var18, var17, var19,
                                                        -2106817575);
                            } else {
                                var35 = new class87(var3, 4, var24 + 4, var0, var1, var2,
                                                    var9.field3474, true, (class129) null);
                            }

                            var6.method3066(var0, var1, var2, var17, (class129) var35,
                                            (class129) null, 256, var24, 0, 0, var20, var22);
                        } else if (var5 == 8) {
                            var29 = 8;
                            var32 = var6.method3083(var0, var1, var2);
                            if (0L != var32) {
                                var29 = class253
                                    .method4993(class56.method1110(var32), (byte) 91).field3458 / 2;
                            }

                            int var28 = var4 + 2 & 3;
                            Object var27;
                            if (var9.field3474 == -1 && var9.field3480 == null) {
                                var34 = var9.method5288(4, var4 + 4, var16, var18, var17, var19,
                                                        -1955783031);
                                var27 = var9.method5288(4, var28 + 4, var16, var18, var17, var19,
                                                        -1627282457);
                            } else {
                                var34 = new class87(var3, 4, var4 + 4, var0, var1, var2,
                                                    var9.field3474, true, (class129) null);
                                var27 = new class87(var3, 4, var28 + 4, var0, var1, var2,
                                                    var9.field3474, true, (class129) null);
                            }

                            var6.method3066(var0, var1, var2, var17, (class129) var34,
                                            (class129) var27, 256, var4,
                                            var29 * class50.field502[var4],
                                            var29 * class50.field507[var4], var20, var22);
                        }
                    }
                }
            } else {
                if (var9.field3474 == -1 && var9.field3480 == null) {
                    var35 = var9.method5288(10, var4, var16, var18, var17, var19, -1835392987);
                } else {
                    var35 = new class87(var3, 10, var4, var0, var1, var2, var9.field3474, true,
                                        (class129) null);
                }

                if (var35 != null && var6
                    .method3067(var0, var1, var2, var17, var10, var11, (class129) var35,
                                var5 == 11 ? 256 : 0, var20, var22) && var9.field3482) {
                    var24 = 15;
                    if (var35 instanceof class121) {
                        var24 = ((class121) var35).method2875() / 4;
                        if (var24 > 30) {
                            var24 = 30;
                        }
                    }

                    for (var25 = 0; var25 <= var10; ++var25) {
                        for (int var26 = 0; var26 <= var11; ++var26) {
                            if (var24 > class50.field503[var0][var25 + var1][var26 + var2]) {
                                class50.field503[var0][var25 + var1][var26 + var2] = (byte) var24;
                            }
                        }
                    }
                }

                if (var9.field3495 != 0 && var7 != null) {
                    var7.method3639(var1, var2, var10, var11, var9.field3468, 355486723);
                }

            }
        }
    }

    void method356(int var1, int var2, class16 var3, int var4) {
        for (int var5 = 0; var5 < var3.field148; ++var5) {
            class19[] var6 = var3.field156[var5][var1][var2];
            if (var6 != null && var6.length != 0) {
                class19[] var7 = var6;

                for (int var8 = 0; var8 < var7.length; ++var8) {
                    class19 var9 = var7[var8];
                    int var11 = var9.field179;
                    boolean var10 = var11 >= class235.field2833.field2839
                        && var11 <= class235.field2841.field2839
                        || var11 == class235.field2818.field2839;
                    if (var10) {
                        class270 var12 = class253.method4993(var9.field184, (byte) 75);
                        int var13 = var12.field3470 != 0 ? -3407872 : -3355444;
                        if (var9.field179 == class235.field2833.field2839) {
                            this.method429(var1, var2, var9.field180, var13, (byte) -75);
                        }

                        if (var9.field179 == class235.field2830.field2839) {
                            this.method429(var1, var2, var9.field180, -3355444, (byte) -39);
                            this.method429(var1, var2, var9.field180 + 1, var13, (byte) 30);
                        }

                        if (var9.field179 == class235.field2841.field2839) {
                            if (var9.field180 == 0) {
                                class319
                                    .method6098(this.field238 * var1, this.field238 * (63 - var2),
                                                1, var13);
                            }

                            if (var9.field180 == 1) {
                                class319.method6098(this.field238 * var1 + this.field238 - 1,
                                                    this.field238 * (63 - var2), 1, var13);
                            }

                            if (var9.field180 == 2) {
                                class319.method6098(this.field238 + this.field238 * var1 - 1,
                                                    this.field238 * (63 - var2) + this.field238 - 1,
                                                    1, var13);
                            }

                            if (var9.field180 == 3) {
                                class319.method6098(this.field238 * var1,
                                                    this.field238 * (63 - var2) + this.field238 - 1,
                                                    1, var13);
                            }
                        }

                        if (var9.field179 == class235.field2818.field2839) {
                            int var14 = var9.field180 % 2;
                            int var15;
                            if (var14 == 0) {
                                for (var15 = 0; var15 < this.field238; ++var15) {
                                    class319.method6098(var15 + this.field238 * var1,
                                                        (64 - var2) * this.field238 - 1 - var15, 1,
                                                        var13);
                                }
                            } else {
                                for (var15 = 0; var15 < this.field238; ++var15) {
                                    class319.method6098(var15 + this.field238 * var1,
                                                        var15 + this.field238 * (63 - var2), 1,
                                                        var13);
                                }
                            }
                        }
                    }
                }
            }
        }

    }

    void method357(int var1, int var2, HashSet var3, int var4, int var5) {
        float var6 = (float) var4 / 64.0F;
        float var7 = var6 / 2.0F;
        Iterator var8 = this.field241.entrySet().iterator();

        while (var8.hasNext()) {
            Entry var9 = (Entry) var8.next();
            class228 var10 = (class228) var9.getKey();
            int var11 = (int) ((float) var10.field2632 * var6 + (float) var1 - var7);
            int var12 = (int) ((float) (var2 + var4) - var6 * (float) var10.field2633 - var7);
            class28 var13 = (class28) var9.getValue();
            if (var13 != null) {
                var13.field276 = var11;
                var13.field283 = var12;
                class257 var14 = class162.method3533(var13.field285, 32768);
                if (!var3.contains(Integer.valueOf(var14.method5046((byte) 4)))) {
                    this.method471(var13, var11, var12, var6, (short) -10117);
                }
            }
        }

    }

    void method355(int var1, int var2, class16 var3, class322[] var4, byte var5) {
        for (int var6 = 0; var6 < var3.field148; ++var6) {
            class19[] var7 = var3.field156[var6][var1][var2];
            if (var7 != null && var7.length != 0) {
                class19[] var8 = var7;

                for (int var9 = 0; var9 < var8.length; ++var9) {
                    class19 var10 = var8[var9];
                    if (class188.method4026(var10.field179, 2097154651) || class150
                        .method3373(var10.field179, 1919796182)) {
                        class270 var11 = class253.method4993(var10.field184, (byte) 22);
                        if (var11.field3466 != -1) {
                            if (var11.field3466 != 46 && var11.field3466 != 52) {
                                var4[var11.field3466]
                                    .method6138(this.field238 * var1, this.field238 * (63 - var2),
                                                this.field238 * 2, this.field238 * 2);
                            } else {
                                var4[var11.field3466]
                                    .method6138(this.field238 * var1, this.field238 * (63 - var2),
                                                this.field238 * 2 + 1, this.field238 * 2 + 1);
                            }
                        }
                    }
                }
            }
        }

    }

    void method363(int var1, int var2, HashSet var3, int var4, byte var5) {
        float var6 = (float) var4 / 64.0F;
        Iterator var7 = this.field239.iterator();

        while (var7.hasNext()) {
            class28 var8 = (class28) var7.next();
            int var9 = var8.field277.field2632 % 64;
            int var10 = var8.field277.field2633 % 64;
            var8.field276 = (int) (var6 * (float) var9 + (float) var1);
            var8.field283 = (int) (var6 * (float) (63 - var10) + (float) var2);
            if (!var3.contains(Integer.valueOf(var8.field285))) {
                this.method471(var8, var8.field276, var8.field283, var6, (short) -2302);
            }
        }

    }

    void method467(int var1, int var2, class16 var3, class35 var4, class21 var5, int var6) {
        int var7 = var3.field152[0][var1][var2] - 1;
        int var8 = var3.field153[0][var1][var2] - 1;
        if (var7 == -1 && var8 == -1) {
            class319.method6047(this.field238 * var1, this.field238 * (63 - var2), this.field238,
                                this.field238, this.field237);
        }

        int var9 = 16711935;
        int var10;
        if (var8 != -1) {
            int var11 = this.field237;
            class274 var12 = class218.method4369(var8, 1947262272);
            if (var12 == null) {
                var10 = var11;
            } else if (var12.field3606 >= 0) {
                var10 = var12.field3606 | -16777216;
            } else if (var12.field3604 >= 0) {
                int var13 = class123
                    .method2974(class124.field1752.vmethod3247(var12.field3604, -222148643), 96,
                                (byte) -17);
                var10 = class124.field1749[var13] | -16777216;
            } else if (var12.field3603 == 16711935) {
                var10 = var11;
            } else {
                int var14 = var12.field3607;
                int var15 = var12.field3608;
                int var16 = var12.field3610;
                if (var16 > 179) {
                    var15 /= 2;
                }

                if (var16 > 192) {
                    var15 /= 2;
                }

                if (var16 > 217) {
                    var15 /= 2;
                }

                if (var16 > 243) {
                    var15 /= 2;
                }

                int var17 = (var15 / 32 << 7) + var16 / 2 + (var14 / 4 << 10);
                int var18 = class123.method2974(var17, 96, (byte) -42);
                var10 = class124.field1749[var18] | -16777216;
            }

            var9 = var10;
        }

        if (var8 > -1 && var3.field154[0][var1][var2] == 0) {
            class319.method6047(this.field238 * var1, this.field238 * (63 - var2), this.field238,
                                this.field238, var9);
        } else {
            var10 = this.method354(var1, var2, var3, var5, 1397575589);
            if (var8 == -1) {
                class319
                    .method6047(this.field238 * var1, this.field238 * (63 - var2), this.field238,
                                this.field238, var10);
            } else {
                var4.method690(this.field238 * var1, this.field238 * (63 - var2), var10, var9,
                               this.field238, this.field238, var3.field154[0][var1][var2],
                               var3.field155[0][var1][var2], 1760882168);
            }
        }
    }

    void method382(class257 var1, int var2, int var3, int var4) {
        class323 var5 = var1.method5064(false, 44537551);
        if (var5 != null) {
            int var6 = this.method366(var5, var1.field3324, -393719013);
            int var7 = this.method367(var5, var1.field3328, (byte) -1);
            var5.method6164(var6 + var2, var3 + var7);
        }

    }

    int method366(class323 var1, class272 var2, int var3) {
        switch (var2.field3562) {
            case 0:
                return 0;
            case 1:
                return -var1.field3879 / 2;
            default:
                return -var1.field3879;
        }
    }

    int method374(int var1, int var2, int var3) {
        if (this.field236 != null) {
            return this.field236.method184(var1, var2, 710652770);
        } else {
            if (!this.field230.isEmpty()) {
                Iterator var4 = this.field230.iterator();

                while (var4.hasNext()) {
                    class34 var5 = (class34) var4.next();
                    if (var5.method618(var1, var2, 762092377)) {
                        return var5.method184(var1, var2, -1875697986);
                    }
                }
            }

            return -1;
        }
    }

    class21 method469(class23[] var1, int var2) {
        class32 var3 = new class32(64, 64);
        if (this.field236 != null) {
            this.method352(0, 0, 64, 64, this.field236, var3, 1934378079);
        } else {
            Iterator var4 = this.field230.iterator();

            while (var4.hasNext()) {
                class34 var5 = (class34) var4.next();
                this.method352(var5.method621(-1893232821) * 8, var5.method622(-941511141) * 8, 8,
                               8, var5, var3, 2058244174);
            }
        }

        this.method351(var1, var3, (byte) -111);
        class21 var6 = new class21();
        var6.method320(var3, 1027273501);
        return var6;
    }

    void method346(int var1, int var2, class16 var3, class35 var4, class322[] var5, int var6) {
        this.method356(var1, var2, var3, 181333957);
        this.method355(var1, var2, var3, var5, (byte) -78);
    }

    class22 method384(class257 var1, int var2) {
        if (var1.field3316 != null && this.field231 != null
            && this.field231.get(class12.field92) != null) {
            class12 var3 = class12.method124(var1.field3318, 2138411363);
            if (var3 == null) {
                return null;
            } else {
                class300 var4 = (class300) this.field231.get(var3);
                if (var4 == null) {
                    return null;
                } else {
                    int var5 = var4.method5796(var1.field3316, 1000000);
                    String[] var6 = new String[var5];
                    var4.method5794(var1.field3316, (int[]) null, var6);
                    int var7 = var6.length * var4.field3765 / 2;
                    int var8 = 0;
                    String[] var9 = var6;

                    for (int var10 = 0; var10 < var9.length; ++var10) {
                        String var11 = var9[var10];
                        int var12 = var4.method5793(var11);
                        if (var12 > var8) {
                            var8 = var12;
                        }
                    }

                    return new class22(var1.field3316, var8, var7, var3);
                }
            }
        } else {
            return null;
        }
    }

    void method358(HashSet var1, int var2, int var3, int var4) {
        Iterator var5 = this.field239.iterator();

        while (var5.hasNext()) {
            class28 var6 = (class28) var5.next();
            class257 var7 = class162.method3533(var6.field285, 32768);
            if (var7 != null && var1.contains(Integer.valueOf(var7.method5046((byte) 68)))) {
                this.method359(var7, var6.field276, var6.field283, var2, var3, -2107427718);
            }
        }

    }

    void method339(int var1, int var2, int var3, int var4, class16 var5, int var6) {
        for (int var7 = var1; var7 < var3 + var1; ++var7) {
            label56:
            for (int var8 = var2; var8 < var2 + var4; ++var8) {
                class228 var9 = new class228(0, var7, var8);

                for (int var10 = 0; var10 < var5.field148; ++var10) {
                    class19[] var11 = var5.field156[var10][var7][var8];
                    if (var11 != null && var11.length != 0) {
                        class19[] var12 = var11;

                        for (int var13 = 0; var13 < var12.length; ++var13) {
                            class19 var14 = var12[var13];
                            class257 var15 = this.method434(var14.field184, 1582513249);
                            if (var15 != null) {
                                class228 var16 = new class228(var10, this.field233 * 64 + var7,
                                                              this.field234 * 64 + var8);
                                class228 var17 = null;
                                if (this.field236 != null) {
                                    var17 = new class228(this.field236.field150 + var10,
                                                         var7 + this.field236.field146 * 64,
                                                         var8 + this.field236.field151 * 64);
                                } else {
                                    class34 var18 = (class34) var5;
                                    var17 = new class228(var10 + var18.field150,
                                                         var18.field146 * 64 + var7
                                                             + var18.method627(-288780430) * 8,
                                                         var8 + var18.field151 * 64
                                                             + var18.method620((byte) -19) * 8);
                                }

                                class28 var19 = new class28(var15.field3313, var17, var16,
                                                            this.method384(var15, 166000646));
                                this.field241.put(var9, var19);
                                continue label56;
                            }
                        }
                    }
                }
            }
        }

    }

    void method340(List var1, int var2) {
        Iterator var3 = var1.iterator();

        while (var3.hasNext()) {
            class13 var4 = (class13) var3.next();
            if (var4.field109.field2632 >> 6 == this.field233
                && var4.field109.field2633 >> 6 == this.field234) {
                class28 var5 = new class28(var4.field108, var4.field109, var4.field109,
                                           this.method369(var4.field108, -1617354438));
                this.field239.add(var5);
            }
        }

    }

    void method347(int var1, int var2, class16 var3, int var4) {
        field240.method4644(0, var1, var2, (byte) 33);

        for (int var5 = 0; var5 < var3.field148; ++var5) {
            class19[] var6 = var3.field156[var5][var1][var2];
            if (var6 != null && var6.length != 0) {
                class19[] var7 = var6;

                for (int var8 = 0; var8 < var7.length; ++var8) {
                    class19 var9 = var7[var8];
                    class257 var10 = this.method434(var9.field184, -610319487);
                    if (var10 != null) {
                        class28 var11 = (class28) this.field241.get(field240);
                        if (var11 != null) {
                            if (var11.field285 != var10.field3313) {
                                class28 var17 = new class28(var10.field3313, var11.field279,
                                                            var11.field277,
                                                            this.method384(var10, 166000646));
                                this.field241.put(new class228(field240), var17);
                                var11 = var17;
                            }

                            int var16 = var11.field279.field2634 - var11.field277.field2634;
                            var11.field277.field2634 = var5;
                            var11.field279.field2634 = var16 + var5;
                            return;
                        }

                        class228 var12 = new class228(var5, this.field233 * 64 + var1,
                                                      this.field234 * 64 + var2);
                        class228 var13 = null;
                        if (this.field236 != null) {
                            var13 = new class228(this.field236.field150 + var5,
                                                 this.field236.field146 * 64 + var1,
                                                 var2 + this.field236.field151 * 64);
                        } else {
                            Iterator var14 = this.field230.iterator();

                            while (var14.hasNext()) {
                                class34 var15 = (class34) var14.next();
                                if (var15.method618(var1, var2, 762092377)) {
                                    var13 = new class228(var5 + var15.field150,
                                                         var15.field146 * 64 + var1
                                                             + var15.method627(1456229387) * 8,
                                                         var15.field151 * 64 + var2
                                                             + var15.method620((byte) -6) * 8);
                                    break;
                                }
                            }
                        }

                        if (var13 != null) {
                            var11 = new class28(var10.field3313, var13, var12,
                                                this.method384(var10, 166000646));
                            this.field241.put(new class228(field240), var11);
                            return;
                        }
                    }
                }
            }
        }

        this.field241.remove(field240);
    }

    void method352(int var1, int var2, int var3, int var4, class16 var5, class32 var6, int var7) {
        for (int var8 = var1; var8 < var3 + var1; ++var8) {
            for (int var9 = var2; var9 < var2 + var4; ++var9) {
                int var10 = var5.field152[0][var8][var9] - 1;
                if (var10 != -1) {
                    class261 var11 = class24.method474(var10, -855287373);
                    var6.method602(var8, var9, 5, var11, (byte) 6);
                }
            }
        }

    }

    void method370(class28 var1, class257 var2, int var3, int var4, float var5, byte var6) {
        if (var1.field278 != null) {
            if (var1.field278.field216.method129(var5, 1643478829)) {
                class300 var7 = (class300) this.field231.get(var1.field278.field216);
                var7.method5792(var1.field278.field223, var3 - var1.field278.field214 / 2, var4,
                                var1.field278.field214, var1.field278.field215,
                                -16777216 | var2.field3327, 0, 1, 0, var7.field3765 / 2);
            }
        }
    }

    void method344(int var1, int var2, class16 var3, class35 var4, int var5) {
        for (int var6 = 1; var6 < var3.field148; ++var6) {
            int var7 = var3.field153[var6][var1][var2] - 1;
            if (var7 > -1) {
                int var8 = class65.method1683(var7, this.field237, (byte) -28);
                if (var3.field154[var6][var1][var2] == 0) {
                    class319.method6047(this.field238 * var1, this.field238 * (63 - var2),
                                        this.field238, this.field238, var8);
                } else {
                    var4.method690(this.field238 * var1, this.field238 * (63 - var2), 0, var8,
                                   this.field238, this.field238, var3.field154[var6][var1][var2],
                                   var3.field155[var6][var1][var2], -10382073);
                }
            }
        }

    }

    int method367(class323 var1, class254 var2, byte var3) {
        switch (var2.field3292) {
            case 1:
                return -var1.field3887 / 2;
            case 2:
                return 0;
            default:
                return -var1.field3887;
        }
    }

    void method351(class23[] var1, class32 var2, byte var3) {
        class242[] var4 = new class242[]{class242.field3166, class242.field3172, class242.field3162,
            class242.field3168, class242.field3169, class242.field3164, class242.field3163,
            class242.field3167};
        class242[] var6 = var4;

        for (int var7 = 0; var7 < var6.length; ++var7) {
            class242 var8 = var6[var7];
            if (var1[var8.vmethod6130((byte) 1)] != null) {
                byte var9 = 0;
                byte var10 = 0;
                byte var11 = 64;
                byte var12 = 64;
                byte var13 = 0;
                byte var14 = 0;
                switch (var8.field3170) {
                    case 0:
                        var14 = 59;
                        var12 = 5;
                        var9 = 59;
                        var11 = 5;
                        break;
                    case 1:
                        var9 = 59;
                        var11 = 5;
                        break;
                    case 2:
                        var13 = 59;
                        var11 = 5;
                        break;
                    case 3:
                        var13 = 59;
                        var14 = 59;
                        var11 = 5;
                        var12 = 5;
                        break;
                    case 4:
                        var14 = 59;
                        var12 = 5;
                        break;
                    case 5:
                        var10 = 59;
                        var12 = 5;
                        break;
                    case 6:
                        var10 = 59;
                        var12 = 5;
                        var9 = 59;
                        var11 = 5;
                        break;
                    case 7:
                        var10 = 59;
                        var12 = 5;
                        var13 = 59;
                        var11 = 5;
                }

                this.method353(var13, var14, var9, var10, var11, var12,
                               var1[var8.vmethod6130((byte) 1)], var2, -1853577400);
            }
        }

    }

    class21 method349(int var1, int var2, class23[] var3, int var4) {
        class203 var6 = field232;
        long var7 = (long) (0 | var1 << 8 | var2);
        class21 var5 = (class21) var6.method4214(var7);
        class21 var12 = var5;
        if (var5 == null) {
            var12 = this.method469(var3, 2088723965);
            class203 var11 = field232;
            long var9 = (long) (0 | var1 << 8 | var2);
            var11.method4212(var12, var9);
        }

        return var12;
    }

    int method354(int var1, int var2, class16 var3, class21 var4, int var5) {
        return var3.field152[0][var1][var2] == 0 ? this.field237
            : var4.method321(var1, var2, (byte) 70);
    }

    class257 method434(int var1, int var2) {
        class270 var3 = class253.method4993(var1, (byte) 28);
        if (var3.field3480 != null) {
            var3 = var3.method5279((byte) 83);
            if (var3 == null) {
                return null;
            }
        }

        return var3.field3479 != -1 ? class162.method3533(var3.field3479, 32768) : null;
    }

    List method406(int var1) {
        LinkedList var2 = new LinkedList();
        var2.addAll(this.field239);
        var2.addAll(this.field241.values());
        return var2;
    }

    class22 method369(int var1, int var2) {
        class257 var3 = class162.method3533(var1, 32768);
        return this.method384(var3, 166000646);
    }

    void method359(class257 var1, int var2, int var3, int var4, int var5, int var6) {
        class323 var7 = var1.method5064(false, -996325712);
        if (var7 != null) {
            var7.method6164(var2 - var7.field3879 / 2, var3 - var7.field3887 / 2);
            if (var4 % var5 < var5 / 2) {
                class319.method6095(var2, var3, 15, 16776960, 128);
                class319.method6095(var2, var3, 7, 16777215, 256);
            }

        }
    }

    void method360(class35 var1, class322[] var2, class21 var3, int var4) {
        Iterator var5 = this.field230.iterator();

        class34 var6;
        int var7;
        int var8;
        while (var5.hasNext()) {
            var6 = (class34) var5.next();

            for (var7 = var6.method621(-1995927229) * 8; var7 < var6.method621(-1910062247) * 8 + 8;
                 ++var7) {
                for (var8 = var6.method622(1832358609) * 8;
                     var8 < var6.method622(2146705870) * 8 + 8; ++var8) {
                    this.method467(var7, var8, var6, var1, var3, 2035897810);
                    this.method344(var7, var8, var6, var1, -227086239);
                }
            }
        }

        var5 = this.field230.iterator();

        while (var5.hasNext()) {
            var6 = (class34) var5.next();

            for (var7 = var6.method621(-2101343086) * 8; var7 < var6.method621(-1902703908) * 8 + 8;
                 ++var7) {
                for (var8 = var6.method622(1544925440) * 8;
                     var8 < var6.method622(-1535690614) * 8 + 8; ++var8) {
                    this.method346(var7, var8, var6, var1, var2, -1471683380);
                }
            }
        }

    }

    void method395(class35 var1, class23[] var2, class322[] var3, class21 var4, byte var5) {
        int var6;
        int var7;
        for (var6 = 0; var6 < 64; ++var6) {
            for (var7 = 0; var7 < 64; ++var7) {
                this.method467(var6, var7, this.field236, var1, var4, -378654210);
                this.method344(var6, var7, this.field236, var1, -227086239);
            }
        }

        for (var6 = 0; var6 < 64; ++var6) {
            for (var7 = 0; var7 < 64; ++var7) {
                this.method346(var6, var7, this.field236, var1, var3, -1918314592);
            }
        }

    }

    void method471(class28 var1, int var2, int var3, float var4, short var5) {
        class257 var6 = class162.method3533(var1.field285, 32768);
        this.method382(var6, var2, var3, 2112207294);
        this.method370(var1, var6, var2, var3, var4, (byte) -83);
    }

    void method436(byte var1) {
        if (this.field236 != null) {
            for (int var2 = 0; var2 < 64; ++var2) {
                for (int var3 = 0; var3 < 64; ++var3) {
                    this.method347(var2, var3, this.field236, -238497050);
                }
            }
        } else {
            Iterator var6 = this.field230.iterator();

            while (var6.hasNext()) {
                class34 var7 = (class34) var6.next();

                for (int var4 = var7.method621(-2118431832) * 8;
                     var4 < var7.method621(-1970700266) * 8 + 8; ++var4) {
                    for (int var5 = var7.method622(-1740087497) * 8;
                         var5 < var7.method622(-1115616144) * 8 + 8; ++var5) {
                        this.method347(var4, var5, var7, 1148945384);
                    }
                }
            }
        }

    }

    void method343(HashSet var1, int var2, int var3, byte var4) {
        Iterator var5 = this.field241.values().iterator();

        while (var5.hasNext()) {
            class28 var6 = (class28) var5.next();
            if (var1.contains(Integer.valueOf(var6.field285))) {
                class257 var7 = class162.method3533(var6.field285, 32768);
                this.method359(var7, var6.field276, var6.field283, var2, var3, -1301589807);
            }
        }

        this.method358(var1, var2, var3, -256903629);
    }

    void method429(int var1, int var2, int var3, int var4, byte var5) {
        var3 %= 4;
        if (var3 == 0) {
            class319
                .method6054(this.field238 * var1, this.field238 * (63 - var2), this.field238, var4);
        }

        if (var3 == 1) {
            class319
                .method6098(this.field238 * var1, this.field238 * (63 - var2), this.field238, var4);
        }

        if (var3 == 2) {
            class319
                .method6054(this.field238 + this.field238 * var1 - 1, this.field238 * (63 - var2),
                            this.field238, var4);
        }

        if (var3 == 3) {
            class319
                .method6098(this.field238 * var1, this.field238 * (63 - var2) + this.field238 - 1,
                            this.field238, var4);
        }

    }

    void method416(int var1, int var2, int var3, HashSet var4, int var5) {
        if (var4 == null) {
            var4 = new HashSet();
        }

        this.method357(var1, var2, var4, var3, 1985874821);
        this.method363(var1, var2, var4, var3, (byte) 122);
    }

    List method371(int var1, int var2, int var3, int var4, int var5, int var6) {
        LinkedList var7 = new LinkedList();
        if (var4 >= var1 && var5 >= var2) {
            if (var4 < var3 + var1 && var5 < var3 + var2) {
                Iterator var8 = this.field241.values().iterator();

                class28 var9;
                while (var8.hasNext()) {
                    var9 = (class28) var8.next();
                    if (var9.method523(var4, var5, -1318094050)) {
                        var7.add(var9);
                    }
                }

                var8 = this.field239.iterator();

                while (var8.hasNext()) {
                    var9 = (class28) var8.next();
                    if (var9.method523(var4, var5, -1437329551)) {
                        var7.add(var9);
                    }
                }

                return var7;
            } else {
                return var7;
            }
        } else {
            return var7;
        }
    }

    void method353(int var1, int var2, int var3, int var4, int var5, int var6, class23 var7,
                   class32 var8, int var9) {
        for (int var10 = 0; var10 < var5; ++var10) {
            for (int var11 = 0; var11 < var6; ++var11) {
                int var12 = var7.method374(var10 + var1, var11 + var2, -1843727904);
                if (var12 != -1) {
                    class261 var13 = class24.method474(var12, -855287373);
                    var8.method602(var3 + var10, var11 + var4, 5, var13, (byte) 6);
                }
            }
        }

    }

    void method341(int var1, class35 var2, class23[] var3, class322[] var4, int var5) {
        this.field238 = var1;
        if (this.field236 != null || !this.field230.isEmpty()) {
            int var7 = this.field233;
            int var8 = this.field234;
            class203 var9 = field235;
            long var10 = (long) (var1 << 16 | var7 << 8 | var8);
            class323 var6 = (class323) var9.method4214(var10);
            if (var6 == null) {
                class21 var13 = this.method349(this.field233, this.field234, var3, 1775981142);
                class323 var12 = new class323(this.field238 * 64, this.field238 * 64);
                var12.method6155();
                if (this.field236 != null) {
                    this.method395(var2, var3, var4, var13, (byte) 37);
                } else {
                    this.method360(var2, var4, var13, -1552107898);
                }

                class10.method114(var12, this.field233, this.field234, this.field238, -1368490287);
            }
        }
    }

    void method336(int var1, int var2, int var3, int var4) {
        int var6 = this.field233;
        int var7 = this.field234;
        int var8 = this.field238;
        class203 var9 = field235;
        long var10 = (long) (var8 << 16 | var6 << 8 | var7);
        class323 var5 = (class323) var9.method4214(var10);
        if (var5 != null) {
            if (var3 == this.field238 * 64) {
                var5.method6184(var1, var2);
            } else {
                var5.method6174(var1, var2, var3, var3);
            }

        }
    }

    void method337(class10 var1, List var2, byte var3) {
        this.field241.clear();
        this.field236 = var1;
        this.method339(0, 0, 64, 64, this.field236, -865879683);
        this.method340(var2, 439873852);
    }

    void method446(HashSet var1, List var2, int var3) {
        this.field241.clear();
        Iterator var4 = var1.iterator();

        while (var4.hasNext()) {
            class34 var5 = (class34) var4.next();
            if (var5.method204(836921053) == this.field233
                && var5.method180((byte) -38) == this.field234) {
                this.field230.add(var5);
                this.method339(var5.method621(-1977249711) * 8, var5.method622(-598334366) * 8, 8,
                               8, var5, -865879683);
            }
        }

        this.method340(var2, -200977302);
    }
}
