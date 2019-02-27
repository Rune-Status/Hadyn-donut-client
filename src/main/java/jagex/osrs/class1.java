package jagex.osrs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class class1 {

    public static Comparator field4;
    public static Comparator field3;
    public static Comparator field10;
    public static Comparator field7;
    static int field12;
    static long key;
    static class311 field8;
    static int field5;

    static {
        field4 = new class7();
        new class0();
        field3 = new class5();
        field10 = new class6();
        field7 = new class3();
    }

    public final List field14;

    public class1(Buffer var1, boolean var2) {
        int var3 = var1.readUint16();
        boolean var4 = var1.readUint8() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }

        int var6 = var1.readUint16();
        this.field14 = new ArrayList(var6);

        for (int var7 = 0; var7 < var6; ++var7) {
            this.field14.add(new class2(var1, var5, var3));
        }

    }

    static final void method17(int var0, int var1, int var2, int var3, int var4, int var5, int var6,
                               class127 var7, class166 var8, int var9) {
        class270 var10 = class253.method4993(var4, (byte) 55);
        int var11;
        int var12;
        if (var5 != 1 && var5 != 3) {
            var11 = var10.field3501;
            var12 = var10.field3475;
        } else {
            var11 = var10.field3475;
            var12 = var10.field3501;
        }

        int var13;
        int var14;
        if (var11 + var2 <= 104) {
            var13 = (var11 >> 1) + var2;
            var14 = var2 + (var11 + 1 >> 1);
        } else {
            var13 = var2;
            var14 = var2 + 1;
        }

        int var15;
        int var16;
        if (var3 + var12 <= 104) {
            var15 = var3 + (var12 >> 1);
            var16 = var3 + (var12 + 1 >> 1);
        } else {
            var15 = var3;
            var16 = var3 + 1;
        }

        int[][] var17 = class50.field506[var1];
        int var18 =
            var17[var14][var16] + var17[var13][var16] + var17[var13][var15] + var17[var14][var15]
                >> 2;
        int var19 = (var2 << 7) + (var11 << 6);
        int var20 = (var3 << 7) + (var12 << 6);
        long var21 = class0.method12(var2, var3, 2, var10.field3470 == 0, var4, -1381376510);
        int var23 = (var5 << 6) + var6;
        if (var10.field3464 == 1) {
            var23 += 256;
        }

        Object var24;
        if (var6 == 22) {
            if (var10.field3474 == -1 && var10.field3480 == null) {
                var24 = var10.method5276(22, var5, var17, var19, var18, var20, -1727193832);
            } else {
                var24 = new class87(var4, 22, var5, var1, var2, var3, var10.field3474, true,
                                    (class129) null);
            }

            var7.method3063(var0, var2, var3, var18, (class129) var24, var21, var23);
            if (var10.field3495 == 1) {
                var8.method3614(var2, var3, -1789763578);
            }

        } else if (var6 != 10 && var6 != 11) {
            if (var6 >= 12) {
                if (var10.field3474 == -1 && var10.field3480 == null) {
                    var24 = var10.method5276(var6, var5, var17, var19, var18, var20, -1621824928);
                } else {
                    var24 = new class87(var4, var6, var5, var1, var2, var3, var10.field3474, true,
                                        (class129) null);
                }

                var7.method3067(var0, var2, var3, var18, 1, 1, (class129) var24, 0, var21, var23);
                if (var10.field3495 != 0) {
                    var8.method3639(var2, var3, var11, var12, var10.field3468, 2052450258);
                }

            } else if (var6 == 0) {
                if (var10.field3474 == -1 && var10.field3480 == null) {
                    var24 = var10.method5276(0, var5, var17, var19, var18, var20, -2073686545);
                } else {
                    var24 = new class87(var4, 0, var5, var1, var2, var3, var10.field3474, true,
                                        (class129) null);
                }

                var7.method3065(var0, var2, var3, var18, (class129) var24, (class129) null,
                                class50.field491[var5], 0, var21, var23);
                if (var10.field3495 != 0) {
                    var8.method3613(var2, var3, var6, var5, var10.field3468, 643268824);
                }

            } else if (var6 == 1) {
                if (var10.field3474 == -1 && var10.field3480 == null) {
                    var24 = var10.method5276(1, var5, var17, var19, var18, var20, -1850156072);
                } else {
                    var24 = new class87(var4, 1, var5, var1, var2, var3, var10.field3474, true,
                                        (class129) null);
                }

                var7.method3065(var0, var2, var3, var18, (class129) var24, (class129) null,
                                class50.field499[var5], 0, var21, var23);
                if (var10.field3495 != 0) {
                    var8.method3613(var2, var3, var6, var5, var10.field3468, 1403838347);
                }

            } else {
                int var30;
                if (var6 == 2) {
                    var30 = var5 + 1 & 3;
                    Object var25;
                    Object var26;
                    if (var10.field3474 == -1 && var10.field3480 == null) {
                        var25 = var10
                            .method5276(2, var5 + 4, var17, var19, var18, var20, -1633341133);
                        var26 = var10.method5276(2, var30, var17, var19, var18, var20, -1897562763);
                    } else {
                        var25 = new class87(var4, 2, var5 + 4, var1, var2, var3, var10.field3474,
                                            true, (class129) null);
                        var26 = new class87(var4, 2, var30, var1, var2, var3, var10.field3474, true,
                                            (class129) null);
                    }

                    var7.method3065(var0, var2, var3, var18, (class129) var25, (class129) var26,
                                    class50.field491[var5], class50.field491[var30], var21, var23);
                    if (var10.field3495 != 0) {
                        var8.method3613(var2, var3, var6, var5, var10.field3468, -1456648936);
                    }

                } else if (var6 == 3) {
                    if (var10.field3474 == -1 && var10.field3480 == null) {
                        var24 = var10.method5276(3, var5, var17, var19, var18, var20, -2081785501);
                    } else {
                        var24 = new class87(var4, 3, var5, var1, var2, var3, var10.field3474, true,
                                            (class129) null);
                    }

                    var7.method3065(var0, var2, var3, var18, (class129) var24, (class129) null,
                                    class50.field499[var5], 0, var21, var23);
                    if (var10.field3495 != 0) {
                        var8.method3613(var2, var3, var6, var5, var10.field3468, -793333191);
                    }

                } else if (var6 == 9) {
                    if (var10.field3474 == -1 && var10.field3480 == null) {
                        var24 = var10
                            .method5276(var6, var5, var17, var19, var18, var20, -2072500051);
                    } else {
                        var24 = new class87(var4, var6, var5, var1, var2, var3, var10.field3474,
                                            true, (class129) null);
                    }

                    var7.method3067(var0, var2, var3, var18, 1, 1, (class129) var24, 0, var21,
                                    var23);
                    if (var10.field3495 != 0) {
                        var8.method3639(var2, var3, var11, var12, var10.field3468, 262468642);
                    }

                } else if (var6 == 4) {
                    if (var10.field3474 == -1 && var10.field3480 == null) {
                        var24 = var10.method5276(4, var5, var17, var19, var18, var20, -1873373994);
                    } else {
                        var24 = new class87(var4, 4, var5, var1, var2, var3, var10.field3474, true,
                                            (class129) null);
                    }

                    var7.method3066(var0, var2, var3, var18, (class129) var24, (class129) null,
                                    class50.field491[var5], 0, 0, 0, var21, var23);
                } else {
                    Object var27;
                    long var31;
                    if (var6 == 5) {
                        var30 = 16;
                        var31 = var7.method3083(var0, var2, var3);
                        if (0L != var31) {
                            var30 = class253
                                .method4993(class56.method1110(var31), (byte) -26).field3458;
                        }

                        if (var10.field3474 == -1 && var10.field3480 == null) {
                            var27 = var10
                                .method5276(4, var5, var17, var19, var18, var20, -1700842215);
                        } else {
                            var27 = new class87(var4, 4, var5, var1, var2, var3, var10.field3474,
                                                true, (class129) null);
                        }

                        var7.method3066(var0, var2, var3, var18, (class129) var27, (class129) null,
                                        class50.field491[var5], 0, var30 * class50.field497[var5],
                                        var30 * class50.field501[var5], var21, var23);
                    } else if (var6 == 6) {
                        var30 = 8;
                        var31 = var7.method3083(var0, var2, var3);
                        if (var31 != 0L) {
                            var30 =
                                class253.method4993(class56.method1110(var31), (byte) -20).field3458
                                    / 2;
                        }

                        if (var10.field3474 == -1 && var10.field3480 == null) {
                            var27 = var10
                                .method5276(4, var5 + 4, var17, var19, var18, var20, -2080371388);
                        } else {
                            var27 = new class87(var4, 4, var5 + 4, var1, var2, var3,
                                                var10.field3474, true, (class129) null);
                        }

                        var7.method3066(var0, var2, var3, var18, (class129) var27, (class129) null,
                                        256, var5, var30 * class50.field502[var5],
                                        var30 * class50.field507[var5], var21, var23);
                    } else if (var6 == 7) {
                        int var33 = var5 + 2 & 3;
                        if (var10.field3474 == -1 && var10.field3480 == null) {
                            var24 = var10
                                .method5276(4, var33 + 4, var17, var19, var18, var20, -1732082263);
                        } else {
                            var24 = new class87(var4, 4, var33 + 4, var1, var2, var3,
                                                var10.field3474, true, (class129) null);
                        }

                        var7.method3066(var0, var2, var3, var18, (class129) var24, (class129) null,
                                        256, var33, 0, 0, var21, var23);
                    } else if (var6 == 8) {
                        var30 = 8;
                        var31 = var7.method3083(var0, var2, var3);
                        if (0L != var31) {
                            var30 =
                                class253.method4993(class56.method1110(var31), (byte) -23).field3458
                                    / 2;
                        }

                        int var29 = var5 + 2 & 3;
                        Object var28;
                        if (var10.field3474 == -1 && var10.field3480 == null) {
                            var27 = var10
                                .method5276(4, var5 + 4, var17, var19, var18, var20, -1832650418);
                            var28 = var10
                                .method5276(4, var29 + 4, var17, var19, var18, var20, -1772692511);
                        } else {
                            var27 = new class87(var4, 4, var5 + 4, var1, var2, var3,
                                                var10.field3474, true, (class129) null);
                            var28 = new class87(var4, 4, var29 + 4, var1, var2, var3,
                                                var10.field3474, true, (class129) null);
                        }

                        var7.method3066(var0, var2, var3, var18, (class129) var27, (class129) var28,
                                        256, var5, var30 * class50.field502[var5],
                                        var30 * class50.field507[var5], var21, var23);
                    }
                }
            }
        } else {
            if (var10.field3474 == -1 && var10.field3480 == null) {
                var24 = var10.method5276(10, var5, var17, var19, var18, var20, -1812829840);
            } else {
                var24 = new class87(var4, 10, var5, var1, var2, var3, var10.field3474, true,
                                    (class129) null);
            }

            if (var24 != null) {
                var7.method3067(var0, var2, var3, var18, var11, var12, (class129) var24,
                                var6 == 11 ? 256 : 0, var21, var23);
            }

            if (var10.field3495 != 0) {
                var8.method3639(var2, var3, var11, var12, var10.field3468, -1785878441);
            }

        }
    }

    public void method15(Comparator var1, boolean var2, int var3) {
        if (var2) {
            Collections.sort(this.field14, var1);
        } else {
            Collections.sort(this.field14, Collections.reverseOrder(var1));
        }

    }
}
