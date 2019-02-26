package jagex.osrs;

import java.applet.Applet;

public class class45 {

    public static Applet field419;
    public static String field420;
    static class329 field418;

    static {
        field419 = null;
        field420 = "";
    }

    static final void method828(int var0, int var1, int var2, int var3, int var4, int var5,
                                int var6, int var7, byte var8) {
        if (class189.method4028(var0, 753975138)) {
            class18.field165 = null;
            class97
                .method2367(class145.field1951[var0], -1, var1, var2, var3, var4, var5, var6, var7,
                            -1790322757);
            if (class18.field165 != null) {
                class97.method2367(class18.field165, -1412584499, var1, var2, var3, var4,
                                   class1.field12, class161.field2051, var7, -1899114964);
                class18.field165 = null;
            }

        } else {
            if (var7 != -1) {
                client.field848[var7] = true;
            } else {
                for (int var9 = 0; var9 < 100; ++var9) {
                    client.field848[var9] = true;
                }
            }

        }
    }

    static void method826(int var0, int var1, int var2) {
        class76 var3 = class51.field520;
        class15.method178(var3.field1125, var3.field1124, var3.field1123, var3.field1126,
                          var3.field1127, var3.field1127, var0, var1, -1692443790);
        class51.field520 = null;
    }

    static void method818(int var0, int var1, int var2) {
        int[] var3 = new int[4];
        int[] var4 = new int[4];
        var3[0] = var0;
        var4[0] = var1;
        int var5 = 1;

        for (int var6 = 0; var6 < 4; ++var6) {
            if (class66.field1016[var6] != var0) {
                var3[var5] = class66.field1016[var6];
                var4[var5] = class66.field1018[var6];
                ++var5;
            }
        }

        class66.field1016 = var3;
        class66.field1018 = var4;
        class305.method5919(class66.field1017, 0, class66.field1017.length - 1, class66.field1016,
                            class66.field1018, 1144312066);
    }

    static final void method827(class232[] var0, int var1, int var2, int var3, int var4, int var5,
                                int var6, int var7, int var8) {
        for (int var9 = 0; var9 < var0.length; ++var9) {
            class232 var10 = var0[var9];
            if (var10 != null && var10.field2700 == var1 && (!var10.field2685
                || var10.field2808 == 0 || var10.field2753
                || class254.method5000(var10, 2129432944) != 0 || var10 == client.field817
                || var10.field2741 == 1338)) {
                if (var10.field2685) {
                    if (class42.method784(var10, -550397284)) {
                        continue;
                    }
                } else if (var10.field2808 == 0 && var10 != class153.field1993 && class42
                    .method784(var10, 1486391619)) {
                    continue;
                }

                int var11 = var10.field2680 + var6;
                int var12 = var7 + var10.field2772;
                int var13;
                int var14;
                int var15;
                int var16;
                int var18;
                int var19;
                if (var10.field2808 == 2) {
                    var13 = var2;
                    var14 = var3;
                    var15 = var4;
                    var16 = var5;
                } else {
                    int var17;
                    if (var10.field2808 == 9) {
                        var17 = var11;
                        var18 = var12;
                        var19 = var11 + var10.field2682;
                        int var20 = var12 + var10.field2683;
                        if (var19 < var11) {
                            var17 = var19;
                            var19 = var11;
                        }

                        if (var20 < var12) {
                            var18 = var20;
                            var20 = var12;
                        }

                        ++var19;
                        ++var20;
                        var13 = var17 > var2 ? var17 : var2;
                        var14 = var18 > var3 ? var18 : var3;
                        var15 = var19 < var4 ? var19 : var4;
                        var16 = var20 < var5 ? var20 : var5;
                    } else {
                        var17 = var11 + var10.field2682;
                        var18 = var12 + var10.field2683;
                        var13 = var11 > var2 ? var11 : var2;
                        var14 = var12 > var3 ? var12 : var3;
                        var15 = var17 < var4 ? var17 : var4;
                        var16 = var18 < var5 ? var18 : var5;
                    }
                }

                if (var10 == client.field816) {
                    client.field824 = true;
                    client.field825 = var11;
                    client.field826 = var12;
                }

                boolean var33 = false;
                if (var10.field2724) {
                    switch (client.field805) {
                        case 0:
                            var33 = true;
                        case 1:
                        default:
                            break;
                        case 2:
                            if (client.field642 == var10.field2770 >>> 16) {
                                var33 = true;
                            }
                            break;
                        case 3:
                            if (var10.field2770 == client.field642) {
                                var33 = true;
                            }
                    }
                }

                if (var33 || !var10.field2685 || var13 < var15 && var14 < var16) {
                    if (var10.field2685) {
                        class57 var27;
                        if (var10.field2807) {
                            if (class48.field473 >= var13 && class48.field464 * -976212263 >= var14
                                && class48.field473 < var15
                                && class48.field464 * -976212263 < var16) {
                                for (var27 = (class57) client.field842.method4298(); var27 != null;
                                     var27 = (class57) client.field842.method4283()) {
                                    if (var27.field563) {
                                        var27.unlink();
                                        var27.field570.field2798 = false;
                                    }
                                }

                                if (class234.field2817 == 0) {
                                    client.field816 = null;
                                    client.field817 = null;
                                }

                                if (!client.field833) {
                                    class14.method163(-1882914855);
                                }
                            }
                        } else if (var10.field2746 && class48.field473 >= var13
                            && class48.field464 * -976212263 >= var14 && class48.field473 < var15
                            && class48.field464 * -976212263 < var16) {
                            for (var27 = (class57) client.field842.method4298(); var27 != null;
                                 var27 = (class57) client.field842.method4283()) {
                                if (var27.field563 && var27.field570.field2774 == var27.field575) {
                                    var27.unlink();
                                }
                            }
                        }
                    }

                    var18 = class48.field473;
                    var19 = class48.field464 * -976212263;
                    if (class48.field477 != 0) {
                        var18 = class48.field478;
                        var19 = class48.field467;
                    }

                    boolean var34 =
                        var18 >= var13 && var19 >= var14 && var18 < var15 && var19 < var16;
                    if (var10.field2741 == 1337) {
                        if (!client.field654 && !client.field833 && var34) {
                            class66.method1707(var18, var19, var13, var14, -1629270818);
                        }
                    } else if (var10.field2741 == 1338) {
                        class218.method4368(var10, var11, var12, 1104472161);
                    } else {
                        if (var10.field2741 == 1400) {
                            field418
                                .method6319(class48.field473, class48.field464 * -976212263, var34,
                                            var11, var12, var10.field2682, var10.field2683,
                                            2005243957);
                        }

                        if (!client.field833 && var34) {
                            if (var10.field2741 == 1400) {
                                field418.method6418(var11, var12, var10.field2682, var10.field2683,
                                                    var18, var19, -1438573796);
                            } else {
                                class71.method1950(var10, var18 - var11, var19 - var12, 754256415);
                            }
                        }

                        boolean var22;
                        int var24;
                        if (var33) {
                            for (int var21 = 0; var21 < var10.field2710.length; ++var21) {
                                var22 = false;
                                boolean var23 = false;
                                if (!var22 && var10.field2710[var21] != null) {
                                    for (var24 = 0; var24 < var10.field2710[var21].length;
                                         ++var24) {
                                        boolean var25 = false;
                                        if (var10.field2806 != null) {
                                            var25 = class39.field380[var10.field2710[var21][var24]];
                                        }

                                        if (class19
                                            .method242(var10.field2710[var21][var24], 67572877)
                                            || var25) {
                                            var22 = true;
                                            if (var10.field2806 != null
                                                && var10.field2806[var21] > client.field655) {
                                                break;
                                            }

                                            byte var26 = var10.field2743[var21][var24];
                                            if (var26 == 0 || ((var26 & 8) == 0
                                                || !class39.field380[86] && !class39.field380[82]
                                                && !class39.field380[81]) && ((var26 & 2) == 0
                                                || class39.field380[86]) && ((var26 & 1) == 0
                                                || class39.field380[82]) && ((var26 & 4) == 0
                                                || class39.field380[81])) {
                                                var23 = true;
                                                break;
                                            }
                                        }
                                    }
                                }

                                if (var23) {
                                    if (var21 < 10) {
                                        class35
                                            .method688(var21 + 1, var10.field2770, var10.field2787,
                                                       var10.field2793, "", (short) 251);
                                    } else if (var21 == 10) {
                                        class134.method3264(1496356643);
                                        class62.method1232(var10.field2770, var10.field2787, class9
                                            .method98(class254.method5000(var10, 2130785817),
                                                      (byte) -61), var10.field2793, (byte) 74);
                                        client.field801 = class86.method2167(var10, 1045577092);
                                        if (client.field801 == null) {
                                            client.field801 = "null";
                                        }

                                        client.field716 = var10.field2697 + class128
                                            .method3233(16777215, 1965128465);
                                    }

                                    var24 = var10.field2765[var21];
                                    if (var10.field2806 == null) {
                                        var10.field2806 = new int[var10.field2710.length];
                                    }

                                    if (var10.field2745 == null) {
                                        var10.field2745 = new int[var10.field2710.length];
                                    }

                                    if (var24 != 0) {
                                        if (var10.field2806[var21] == 0) {
                                            var10.field2806[var21] =
                                                var24 + client.field655 + var10.field2745[var21];
                                        } else {
                                            var10.field2806[var21] = var24 + client.field655;
                                        }
                                    } else {
                                        var10.field2806[var21] = Integer.MAX_VALUE;
                                    }
                                }

                                if (!var22 && var10.field2806 != null) {
                                    var10.field2806[var21] = 0;
                                }
                            }
                        }

                        if (var10.field2685) {
                            if (class48.field473 >= var13 && class48.field464 * -976212263 >= var14
                                && class48.field473 < var15
                                && class48.field464 * -976212263 < var16) {
                                var34 = true;
                            } else {
                                var34 = false;
                            }

                            boolean var35 = false;
                            if ((class48.field469 == 1
                                || !class14.field132 && class48.field469 == 4) && var34) {
                                var35 = true;
                            }

                            var22 = false;
                            if ((class48.field477 == 1
                                || !class14.field132 && class48.field477 == 4)
                                && class48.field478 >= var13 && class48.field467 >= var14
                                && class48.field478 < var15 && class48.field467 < var16) {
                                var22 = true;
                            }

                            if (var22) {
                                class134.method3262(var10, class48.field478 - var11,
                                                    class48.field467 - var12, 1446531534);
                            }

                            if (var10.field2741 == 1400) {
                                field418.method6479(var18, var19, var34 & var35, var34 & var22,
                                                    (byte) 10);
                            }

                            if (client.field816 != null && var10 != client.field816 && var34
                                && class186
                                .method4010(class254.method5000(var10, 2110400581), (short) 256)) {
                                client.field811 = var10;
                            }

                            if (var10 == client.field817) {
                                client.field821 = true;
                                client.field713 = var11;
                                client.field823 = var12;
                            }

                            if (var10.field2753) {
                                class57 var28;
                                if (var34 && client.field841 != 0 && var10.field2774 != null) {
                                    var28 = new class57();
                                    var28.field563 = true;
                                    var28.field570 = var10;
                                    var28.field566 = client.field841;
                                    var28.field575 = var10.field2774;
                                    client.field842.method4276(var28);
                                }

                                if (client.field816 != null || class66.field1025 != null
                                    || client.field833) {
                                    var22 = false;
                                    var35 = false;
                                    var34 = false;
                                }

                                if (!var10.field2669 && var22) {
                                    var10.field2669 = true;
                                    if (var10.field2656 != null) {
                                        var28 = new class57();
                                        var28.field563 = true;
                                        var28.field570 = var10;
                                        var28.field565 = class48.field478 - var11;
                                        var28.field566 = class48.field467 - var12;
                                        var28.field575 = var10.field2656;
                                        client.field842.method4276(var28);
                                    }
                                }

                                if (var10.field2669 && var35 && var10.field2803 != null) {
                                    var28 = new class57();
                                    var28.field563 = true;
                                    var28.field570 = var10;
                                    var28.field565 = class48.field473 - var11;
                                    var28.field566 = class48.field464 * -976212263 - var12;
                                    var28.field575 = var10.field2803;
                                    client.field842.method4276(var28);
                                }

                                if (var10.field2669 && !var35) {
                                    var10.field2669 = false;
                                    if (var10.field2756 != null) {
                                        var28 = new class57();
                                        var28.field563 = true;
                                        var28.field570 = var10;
                                        var28.field565 = class48.field473 - var11;
                                        var28.field566 = class48.field464 * -976212263 - var12;
                                        var28.field575 = var10.field2756;
                                        client.field844.method4276(var28);
                                    }
                                }

                                if (var35 && var10.field2758 != null) {
                                    var28 = new class57();
                                    var28.field563 = true;
                                    var28.field570 = var10;
                                    var28.field565 = class48.field473 - var11;
                                    var28.field566 = class48.field464 * -976212263 - var12;
                                    var28.field575 = var10.field2758;
                                    client.field842.method4276(var28);
                                }

                                if (!var10.field2798 && var34) {
                                    var10.field2798 = true;
                                    if (var10.field2759 != null) {
                                        var28 = new class57();
                                        var28.field563 = true;
                                        var28.field570 = var10;
                                        var28.field565 = class48.field473 - var11;
                                        var28.field566 = class48.field464 * -976212263 - var12;
                                        var28.field575 = var10.field2759;
                                        client.field842.method4276(var28);
                                    }
                                }

                                if (var10.field2798 && var34 && var10.field2760 != null) {
                                    var28 = new class57();
                                    var28.field563 = true;
                                    var28.field570 = var10;
                                    var28.field565 = class48.field473 - var11;
                                    var28.field566 = class48.field464 * -976212263 - var12;
                                    var28.field575 = var10.field2760;
                                    client.field842.method4276(var28);
                                }

                                if (var10.field2798 && !var34) {
                                    var10.field2798 = false;
                                    if (var10.field2761 != null) {
                                        var28 = new class57();
                                        var28.field563 = true;
                                        var28.field570 = var10;
                                        var28.field565 = class48.field473 - var11;
                                        var28.field566 = class48.field464 * -976212263 - var12;
                                        var28.field575 = var10.field2761;
                                        client.field844.method4276(var28);
                                    }
                                }

                                if (var10.field2658 != null) {
                                    var28 = new class57();
                                    var28.field570 = var10;
                                    var28.field575 = var10.field2658;
                                    client.field843.method4276(var28);
                                }

                                class57 var29;
                                int var36;
                                int var37;
                                if (var10.field2766 != null && client.field830 > var10.field2801) {
                                    if (var10.field2767 != null
                                        && client.field830 - var10.field2801 <= 32) {
                                        label873:
                                        for (var36 = var10.field2801; var36 < client.field830;
                                             ++var36) {
                                            var24 = client.field653[var36 & 31];

                                            for (var37 = 0; var37 < var10.field2767.length;
                                                 ++var37) {
                                                if (var24 == var10.field2767[var37]) {
                                                    var29 = new class57();
                                                    var29.field570 = var10;
                                                    var29.field575 = var10.field2766;
                                                    client.field842.method4276(var29);
                                                    break label873;
                                                }
                                            }
                                        }
                                    } else {
                                        var28 = new class57();
                                        var28.field570 = var10;
                                        var28.field575 = var10.field2766;
                                        client.field842.method4276(var28);
                                    }

                                    var10.field2801 = client.field830;
                                }

                                if (var10.field2660 != null && client.field832 > var10.field2802) {
                                    if (var10.field2769 != null
                                        && client.field832 - var10.field2802 <= 32) {
                                        label849:
                                        for (var36 = var10.field2802; var36 < client.field832;
                                             ++var36) {
                                            var24 = client.field831[var36 & 31];

                                            for (var37 = 0; var37 < var10.field2769.length;
                                                 ++var37) {
                                                if (var24 == var10.field2769[var37]) {
                                                    var29 = new class57();
                                                    var29.field570 = var10;
                                                    var29.field575 = var10.field2660;
                                                    client.field842.method4276(var29);
                                                    break label849;
                                                }
                                            }
                                        }
                                    } else {
                                        var28 = new class57();
                                        var28.field570 = var10;
                                        var28.field575 = var10.field2660;
                                        client.field842.method4276(var28);
                                    }

                                    var10.field2802 = client.field832;
                                }

                                if (var10.field2667 != null && client.field834 > var10.field2735) {
                                    if (var10.field2771 != null
                                        && client.field834 - var10.field2735 <= 32) {
                                        label825:
                                        for (var36 = var10.field2735; var36 < client.field834;
                                             ++var36) {
                                            var24 = client.field774[var36 & 31];

                                            for (var37 = 0; var37 < var10.field2771.length;
                                                 ++var37) {
                                                if (var24 == var10.field2771[var37]) {
                                                    var29 = new class57();
                                                    var29.field570 = var10;
                                                    var29.field575 = var10.field2667;
                                                    client.field842.method4276(var29);
                                                    break label825;
                                                }
                                            }
                                        }
                                    } else {
                                        var28 = new class57();
                                        var28.field570 = var10;
                                        var28.field575 = var10.field2667;
                                        client.field842.method4276(var28);
                                    }

                                    var10.field2735 = client.field834;
                                }

                                if (client.field835 > var10.field2800 && var10.field2775 != null) {
                                    var28 = new class57();
                                    var28.field570 = var10;
                                    var28.field575 = var10.field2775;
                                    client.field842.method4276(var28);
                                }

                                if (client.field836 > var10.field2800 && var10.field2777 != null) {
                                    var28 = new class57();
                                    var28.field570 = var10;
                                    var28.field575 = var10.field2777;
                                    client.field842.method4276(var28);
                                }

                                if (client.field837 > var10.field2800 && var10.field2747 != null) {
                                    var28 = new class57();
                                    var28.field570 = var10;
                                    var28.field575 = var10.field2747;
                                    client.field842.method4276(var28);
                                }

                                if (client.field858 > var10.field2800 && var10.field2783 != null) {
                                    var28 = new class57();
                                    var28.field570 = var10;
                                    var28.field575 = var10.field2783;
                                    client.field842.method4276(var28);
                                }

                                if (client.field839 > var10.field2800 && var10.field2796 != null) {
                                    var28 = new class57();
                                    var28.field570 = var10;
                                    var28.field575 = var10.field2796;
                                    client.field842.method4276(var28);
                                }

                                if (client.field685 > var10.field2800 && var10.field2779 != null) {
                                    var28 = new class57();
                                    var28.field570 = var10;
                                    var28.field575 = var10.field2779;
                                    client.field842.method4276(var28);
                                }

                                var10.field2800 = client.field828;
                                if (var10.field2666 != null) {
                                    for (var36 = 0; var36 < client.field865; ++var36) {
                                        class57 var32 = new class57();
                                        var32.field570 = var10;
                                        var32.field569 = client.field867[var36];
                                        var32.field562 = client.field846[var36];
                                        var32.field575 = var10.field2666;
                                        client.field842.method4276(var32);
                                    }
                                }
                            }
                        }

                        if (!var10.field2685) {
                            if (client.field816 != null || class66.field1025 != null
                                || client.field833) {
                                continue;
                            }

                            if ((var10.field2788 >= 0 || var10.field2694 != 0)
                                && class48.field473 >= var13
                                && class48.field464 * -976212263 >= var14
                                && class48.field473 < var15
                                && class48.field464 * -976212263 < var16) {
                                if (var10.field2788 >= 0) {
                                    class153.field1993 = var0[var10.field2788];
                                } else {
                                    class153.field1993 = var10;
                                }
                            }

                            if (var10.field2808 == 8 && class48.field473 >= var13
                                && class48.field464 * -976212263 >= var14
                                && class48.field473 < var15
                                && class48.field464 * -976212263 < var16) {
                                class50.field495 = var10;
                            }

                            if (var10.field2691 > var10.field2683) {
                                class53.method1080(var10, var11 + var10.field2682, var12,
                                                   var10.field2683, var10.field2691,
                                                   class48.field473, class48.field464 * -976212263,
                                                   130276367);
                            }
                        }

                        if (var10.field2808 == 0) {
                            method827(var0, var10.field2770, var13, var14, var15, var16,
                                      var11 - var10.field2711, var12 - var10.field2689, 741072302);
                            if (var10.field2791 != null) {
                                method827(var10.field2791, var10.field2770, var13, var14, var15,
                                          var16, var11 - var10.field2711, var12 - var10.field2689,
                                          -1659565207);
                            }

                            class56 var30 = (class56) client.field804
                                .method4224((long) var10.field2770);
                            if (var30 != null) {
                                if (var30.field560 == 0 && class48.field473 >= var13
                                    && class48.field464 * -976212263 >= var14
                                    && class48.field473 < var15
                                    && class48.field464 * -976212263 < var16 && !client.field833) {
                                    for (class57 var31 = (class57) client.field842.method4298();
                                         var31 != null;
                                         var31 = (class57) client.field842.method4283()) {
                                        if (var31.field563) {
                                            var31.unlink();
                                            var31.field570.field2798 = false;
                                        }
                                    }

                                    if (class234.field2817 == 0) {
                                        client.field816 = null;
                                        client.field817 = null;
                                    }

                                    if (!client.field833) {
                                        class14.method163(1678579082);
                                    }
                                }

                                class6.method82(var30.field556, var13, var14, var15, var16, var11,
                                                var12, 1188891119);
                            }
                        }
                    }
                }
            }
        }

    }
}
