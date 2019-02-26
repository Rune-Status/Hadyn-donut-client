package jagex.osrs;

public class class97 {

    public static int field1377;
    protected int[] field1362;
    class107[] field1376;
    class107 field1363;
    int field1379;
    boolean field1374;
    int field1365;
    int field1364;
    class107[] field1366;
    long field1369;
    long field1361;
    int field1370;
    int field1372;
    int field1371;
    int field1367;
    long field1375;
    int field1368;

    protected class97() {
        this.field1364 = 32;
        this.field1361 = class120.method2866((short) 3133);
        this.field1369 = 0L;
        this.field1370 = 0;
        this.field1371 = 0;
        this.field1372 = 0;
        this.field1375 = 0L;
        this.field1374 = true;
        this.field1379 = 0;
        this.field1366 = new class107[8];
        this.field1376 = new class107[8];
    }

    public static int method2405(int var0, byte var1) {
        class265 var2 = class77.method2004(var0, (byte) 72);
        int var3 = var2.field3397;
        int var4 = var2.field3399;
        int var5 = var2.field3398;
        int var6 = class227.field2627[var5 - var4];
        return class227.field2629[var3] >> var4 & var6;
    }

    public static int method2404(String var0, int var1) {
        return var0.length() + 1;
    }

    static final void method2367(class232[] var0, int var1, int var2, int var3, int var4, int var5,
                                 int var6, int var7, int var8, int var9) {
        class319.method6067(var2, var3, var4, var5);
        class124.method3000();

        for (int var10 = 0; var10 < var0.length; ++var10) {
            class232 var11 = var0[var10];
            if (var11 != null && (var11.field2700 == var1
                || var1 == -1412584499 && var11 == client.field816)) {
                int var12;
                if (var8 == -1) {
                    client.field763[client.field853] = var11.field2680 + var6;
                    client.field852[client.field853] = var7 + var11.field2772;
                    client.field819[client.field853] = var11.field2682;
                    client.field854[client.field853] = var11.field2683;
                    var12 = ++client.field853 - 1;
                } else {
                    var12 = var8;
                }

                var11.field2804 = var12;
                var11.field2805 = client.field655;
                if (!var11.field2685 || !class42.method784(var11, 378253656)) {
                    if (var11.field2741 > 0) {
                        class37.method719(var11, -93485703);
                    }

                    int var13 = var11.field2680 + var6;
                    int var14 = var7 + var11.field2772;
                    int var15 = var11.field2698;
                    int var16;
                    int var17;
                    if (var11 == client.field816) {
                        if (var1 != -1412584499 && !var11.field2784) {
                            class18.field165 = var0;
                            class1.field12 = var6;
                            class161.field2051 = var7;
                            continue;
                        }

                        if (client.field827 && client.field821) {
                            var16 = class48.field473;
                            var17 = class48.field464 * -976212263;
                            var16 -= client.field906;
                            var17 -= client.field838;
                            if (var16 < client.field713) {
                                var16 = client.field713;
                            }

                            if (var16 + var11.field2682
                                > client.field713 + client.field817.field2682) {
                                var16 =
                                    client.field713 + client.field817.field2682 - var11.field2682;
                            }

                            if (var17 < client.field823) {
                                var17 = client.field823;
                            }

                            if (var17 + var11.field2683
                                > client.field823 + client.field817.field2683) {
                                var17 =
                                    client.field823 + client.field817.field2683 - var11.field2683;
                            }

                            var13 = var16;
                            var14 = var17;
                        }

                        if (!var11.field2784) {
                            var15 = 128;
                        }
                    }

                    int var18;
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field2808 == 2) {
                        var16 = var2;
                        var17 = var3;
                        var18 = var4;
                        var19 = var5;
                    } else if (var11.field2808 == 9) {
                        var20 = var13;
                        var21 = var14;
                        var22 = var13 + var11.field2682;
                        var23 = var14 + var11.field2683;
                        if (var22 < var13) {
                            var20 = var22;
                            var22 = var13;
                        }

                        if (var23 < var14) {
                            var21 = var23;
                            var23 = var14;
                        }

                        ++var22;
                        ++var23;
                        var16 = var20 > var2 ? var20 : var2;
                        var17 = var21 > var3 ? var21 : var3;
                        var18 = var22 < var4 ? var22 : var4;
                        var19 = var23 < var5 ? var23 : var5;
                    } else {
                        var20 = var13 + var11.field2682;
                        var21 = var14 + var11.field2683;
                        var16 = var13 > var2 ? var13 : var2;
                        var17 = var14 > var3 ? var14 : var3;
                        var18 = var20 < var4 ? var20 : var4;
                        var19 = var21 < var5 ? var21 : var5;
                    }

                    if (!var11.field2685 || var16 < var18 && var17 < var19) {
                        if (var11.field2741 != 0) {
                            if (var11.field2741 == 1336) {
                                if (client.field886) {
                                    var14 += 15;
                                    class3.field25.method5799("Fps:" + GameApplet.field434,
                                                              var13 + var11.field2682, var14,
                                                              16776960, -1);
                                    var14 += 15;
                                    Runtime var43 = Runtime.getRuntime();
                                    var21 = (int) ((var43.totalMemory() - var43.freeMemory())
                                        / 1024L);
                                    var22 = 16776960;
                                    if (var21 > 327680 && !client.lowMemory) {
                                        var22 = 16711680;
                                    }

                                    class3.field25
                                        .method5799("Mem:" + var21 + "k", var13 + var11.field2682,
                                                    var14, var22, -1);
                                    var14 += 15;
                                }
                                continue;
                            }

                            if (var11.field2741 == 1337) {
                                client.field792 = var13;
                                client.field860 = var14;
                                class34.method624(var13, var14, var11.field2682, var11.field2683,
                                                  (byte) 57);
                                client.field848[var11.field2804] = true;
                                class319.method6067(var2, var3, var4, var5);
                                continue;
                            }

                            if (var11.field2741 == 1338) {
                                class88.method2185(var11, var13, var14, var12, (byte) 2);
                                class319.method6067(var2, var3, var4, var5);
                                continue;
                            }

                            if (var11.field2741 == 1339) {
                                class87.method2172(var11, var13, var14, var12, (byte) 106);
                                class319.method6067(var2, var3, var4, var5);
                                continue;
                            }

                            if (var11.field2741 == 1400) {
                                class45.field418
                                    .method6337(var13, var14, var11.field2682, var11.field2683,
                                                client.field655, 1291841987);
                            }

                            if (var11.field2741 == 1401) {
                                class45.field418
                                    .method6490(var13, var14, var11.field2682, var11.field2683,
                                                (byte) 114);
                            }
                        }

                        if (var11.field2808 == 0) {
                            if (!var11.field2685 && class42.method784(var11, 500628681)
                                && var11 != class153.field1993) {
                                continue;
                            }

                            if (!var11.field2685) {
                                if (var11.field2689 > var11.field2691 - var11.field2683) {
                                    var11.field2689 = var11.field2691 - var11.field2683;
                                }

                                if (var11.field2689 < 0) {
                                    var11.field2689 = 0;
                                }
                            }

                            method2367(var0, var11.field2770, var16, var17, var18, var19,
                                       var13 - var11.field2711, var14 - var11.field2689, var12,
                                       -290401634);
                            if (var11.field2791 != null) {
                                method2367(var11.field2791, var11.field2770, var16, var17, var18,
                                           var19, var13 - var11.field2711, var14 - var11.field2689,
                                           var12, -2068019035);
                            }

                            class56 var31 = (class56) client.field804
                                .method4224((long) var11.field2770);
                            if (var31 != null) {
                                class45.method828(var31.field556, var16, var17, var18, var19, var13,
                                                  var14, var12, (byte) 25);
                            }

                            class319.method6067(var2, var3, var4, var5);
                            class124.method3000();
                        }

                        if (!client.resizable && !client.field706[var12] && client.field855 <= 1) {
                            continue;
                        }
                        if (var11.field2808 == 0 && !var11.field2685
                            && var11.field2691 > var11.field2683) {
                            class16.method203(var13 + var11.field2682, var14, var11.field2689,
                                              var11.field2683, var11.field2691, -2056806993);
                        }

                        if (var11.field2808 != 1) {
                            int var24;
                            int var25;
                            int var26;
                            int var27;
                            if (var11.field2808 == 2) {
                                var20 = 0;

                                for (var21 = 0; var21 < var11.field2679; ++var21) {
                                    for (var22 = 0; var22 < var11.field2678; ++var22) {
                                        var23 = var22 * (var11.field2734 + 32) + var13;
                                        var24 = var14 + var21 * (var11.field2708 + 32);
                                        if (var20 < 20) {
                                            var23 += var11.field2726[var20];
                                            var24 += var11.field2737[var20];
                                        }

                                        if (var11.field2762[var20] <= 0) {
                                            if (var11.field2738 != null && var20 < 20) {
                                                class323 var47 = var11
                                                    .method4709(var20, 214380669);
                                                if (var47 != null) {
                                                    var47.method6164(var23, var24);
                                                } else if (class232.field2665) {
                                                    class37.method721(var11, 1238023037);
                                                }
                                            }
                                        } else {
                                            boolean var38 = false;
                                            boolean var39 = false;
                                            var27 = var11.field2762[var20] - 1;
                                            if (var23 + 32 > var2 && var23 < var4
                                                && var24 + 32 > var3 && var24 < var5
                                                || var11 == class66.field1025
                                                && var20 == client.field751) {
                                                class323 var28;
                                                if (client.field796 == 1
                                                    && var20 == class22.field220
                                                    && var11.field2770 == class88.field1276) {
                                                    var28 = class29.method531(var27,
                                                                              var11.field2792[var20],
                                                                              2, 0, 2, false,
                                                                              -1711011641);
                                                } else {
                                                    var28 = class29.method531(var27,
                                                                              var11.field2792[var20],
                                                                              1, 3153952, 2,
                                                                              false,
                                                                              1325257214);
                                                }

                                                if (var28 != null) {
                                                    if (var11 == class66.field1025
                                                        && var20 == client.field751) {
                                                        var25 =
                                                            class48.field473 - client.field752;
                                                        var26 = class48.field464 * -976212263
                                                            - client.field845;
                                                        if (var25 < 5 && var25 > -5) {
                                                            var25 = 0;
                                                        }

                                                        if (var26 < 5 && var26 > -5) {
                                                            var26 = 0;
                                                        }

                                                        if (client.field756 < 5) {
                                                            var25 = 0;
                                                            var26 = 0;
                                                        }

                                                        var28.method6170(var23 + var25,
                                                                         var26 + var24, 128);
                                                        if (var1 != -1) {
                                                            class232 var29 = var0[var1 & 65535];
                                                            int var30;
                                                            if (var26 + var24
                                                                < class319.field3858
                                                                && var29.field2689 > 0) {
                                                                var30 =
                                                                    (class319.field3858 - var24
                                                                        - var26)
                                                                        * client.field705 / 3;
                                                                if (var30
                                                                    > client.field705 * 10) {
                                                                    var30 =
                                                                        client.field705 * 10;
                                                                }

                                                                if (var30 > var29.field2689) {
                                                                    var30 = var29.field2689;
                                                                }

                                                                var29.field2689 -= var30;
                                                                client.field845 += var30;
                                                                class37.method721(var29,
                                                                                  1238023037);
                                                            }

                                                            if (var26 + var24 + 32
                                                                > class319.field3857
                                                                && var29.field2689
                                                                < var29.field2691
                                                                - var29.field2683) {
                                                                var30 = (var24 + var26 + 32
                                                                    - class319.field3857)
                                                                    * client.field705 / 3;
                                                                if (var30
                                                                    > client.field705 * 10) {
                                                                    var30 =
                                                                        client.field705 * 10;
                                                                }

                                                                if (var30 > var29.field2691
                                                                    - var29.field2683
                                                                    - var29.field2689) {
                                                                    var30 = var29.field2691
                                                                        - var29.field2683
                                                                        - var29.field2689;
                                                                }

                                                                var29.field2689 += var30;
                                                                client.field845 -= var30;
                                                                class37.method721(var29,
                                                                                  1238023037);
                                                            }
                                                        }
                                                    } else if (var11 == class179.field2357
                                                        && var20 == client.field750) {
                                                        var28.method6170(var23, var24, 128);
                                                    } else {
                                                        var28.method6164(var23, var24);
                                                    }
                                                } else {
                                                    class37.method721(var11, 1238023037);
                                                }
                                            }
                                        }

                                        ++var20;
                                    }
                                }
                            } else if (var11.field2808 == 3) {
                                if (class18.method239(var11, 1259459506)) {
                                    var20 = var11.field2693;
                                    if (var11 == class153.field1993 && var11.field2695 != 0) {
                                        var20 = var11.field2695;
                                    }
                                } else {
                                    var20 = var11.field2686;
                                    if (var11 == class153.field1993 && var11.field2694 != 0) {
                                        var20 = var11.field2694;
                                    }
                                }

                                if (var11.field2696) {
                                    switch (var11.field2744.field3868) {
                                        case 1:
                                            class319.method6052(var13, var14, var11.field2682,
                                                                var11.field2683,
                                                                var11.field2686,
                                                                var11.field2693);
                                            break;
                                        case 2:
                                            class319.method6039(var13, var14, var11.field2682,
                                                                var11.field2683,
                                                                var11.field2686,
                                                                var11.field2693,
                                                                255 - (var11.field2698 & 255),
                                                                255 - (var11.field2699 & 255));
                                            break;
                                        default:
                                            if (var15 == 0) {
                                                class319
                                                    .method6047(var13, var14, var11.field2682,
                                                                var11.field2683, var20);
                                            } else {
                                                class319
                                                    .method6046(var13, var14, var11.field2682,
                                                                var11.field2683, var20,
                                                                256 - (var15 & 255));
                                            }
                                    }
                                } else if (var15 == 0) {
                                    class319.method6116(var13, var14, var11.field2682,
                                                        var11.field2683, var20);
                                } else {
                                    class319.method6051(var13, var14, var11.field2682,
                                                        var11.field2683, var20,
                                                        256 - (var15 & 255));
                                }
                            } else {
                                class300 var40;
                                if (var11.field2808 == 4) {
                                    var40 = var11.method4708(-600287239);
                                    if (var40 == null) {
                                        if (class232.field2665) {
                                            class37.method721(var11, 1238023037);
                                        }
                                    } else {
                                        String var45 = var11.field2728;
                                        if (class18.method239(var11, -1337758639)) {
                                            var21 = var11.field2693;
                                            if (var11 == class153.field1993
                                                && var11.field2695 != 0) {
                                                var21 = var11.field2695;
                                            }

                                            if (var11.field2729.length() > 0) {
                                                var45 = var11.field2729;
                                            }
                                        } else {
                                            var21 = var11.field2686;
                                            if (var11 == class153.field1993
                                                && var11.field2694 != 0) {
                                                var21 = var11.field2694;
                                            }
                                        }

                                        if (var11.field2685 && var11.field2793 != -1) {
                                            class271 var48 = class84
                                                .method2125(var11.field2793, -205103429);
                                            var45 = var48.field3515;
                                            if (var45 == null) {
                                                var45 = "null";
                                            }

                                            if ((var48.field3523 == 1 || var11.field2794 != 1)
                                                && var11.field2794 != -1) {
                                                var45 =
                                                    class128.method3233(16748608, 1260690938)
                                                        + var45 + "</col>" + " " + 'x' + class8
                                                        .method96(var11.field2794, 1676983438);
                                            }
                                        }

                                        if (var11 == client.field880) {
                                            var45 = "Please wait...";
                                            var21 = var11.field2686;
                                        }

                                        if (!var11.field2685) {
                                            var45 = class36.method692(var45, var11, -403261630);
                                        }

                                        var40.method5792(var45, var13, var14, var11.field2682,
                                                         var11.field2683, var21,
                                                         var11.field2716 ? 0 : -1,
                                                         var11.field2681, var11.field2776,
                                                         var11.field2730);
                                    }
                                } else if (var11.field2808 == 5) {
                                    class323 var41;
                                    if (!var11.field2685) {
                                        var41 = var11
                                            .method4741(class18.method239(var11, -404451200),
                                                        2110349);
                                        if (var41 != null) {
                                            var41.method6164(var13, var14);
                                        } else if (class232.field2665) {
                                            class37.method721(var11, 1238023037);
                                        }
                                    } else {
                                        if (var11.field2793 != -1) {
                                            var41 = class29
                                                .method531(var11.field2793, var11.field2794,
                                                           var11.field2706, var11.field2707,
                                                           var11.field2797, false, -692346063);
                                        } else {
                                            var41 = var11.method4741(false, -1150352216);
                                        }

                                        if (var41 == null) {
                                            if (class232.field2665) {
                                                class37.method721(var11, 1238023037);
                                            }
                                        } else {
                                            var21 = var41.field3883;
                                            var22 = var41.field3884;
                                            if (!var11.field2705) {
                                                var23 = var11.field2682 * 4096 / var21;
                                                if (var11.field2780 != 0) {
                                                    var41
                                                        .method6182(var11.field2682 / 2 + var13,
                                                                    var11.field2683 / 2 + var14,
                                                                    var11.field2780, var23);
                                                } else if (var15 != 0) {
                                                    var41.method6172(var13, var14,
                                                                     var11.field2682,
                                                                     var11.field2683,
                                                                     256 - (var15 & 255));
                                                } else if (var21 == var11.field2682
                                                    && var22 == var11.field2683) {
                                                    var41.method6164(var13, var14);
                                                } else {
                                                    var41.method6166(var13, var14,
                                                                     var11.field2682,
                                                                     var11.field2683);
                                                }
                                            } else {
                                                class319.method6041(var13, var14,
                                                                    var13 + var11.field2682,
                                                                    var14 + var11.field2683);
                                                var23 = (var21 - 1 + var11.field2682) / var21;
                                                var24 = (var22 - 1 + var11.field2683) / var22;

                                                for (var25 = 0; var25 < var23; ++var25) {
                                                    for (var26 = 0; var26 < var24; ++var26) {
                                                        if (var11.field2780 != 0) {
                                                            var41.method6182(var21 / 2 + var13
                                                                                 + var25
                                                                * var21, var22 / 2 + var14
                                                                                 + var22
                                                                * var26, var11.field2780, 4096);
                                                        } else if (var15 != 0) {
                                                            var41.method6170(
                                                                var13 + var21 * var25,
                                                                var14 + var26 * var22,
                                                                256 - (var15 & 255));
                                                        } else {
                                                            var41.method6164(
                                                                var13 + var21 * var25,
                                                                var14 + var22 * var26);
                                                        }
                                                    }
                                                }

                                                class319.method6067(var2, var3, var4, var5);
                                            }
                                        }
                                    }
                                } else {
                                    class271 var33;
                                    if (var11.field2808 == 6) {
                                        boolean var37 = class18.method239(var11, -1755473021);
                                        if (var37) {
                                            var21 = var11.field2715;
                                        } else {
                                            var21 = var11.field2714;
                                        }

                                        class121 var42 = null;
                                        var23 = 0;
                                        if (var11.field2793 != -1) {
                                            var33 = class84
                                                .method2125(var11.field2793, -205103429);
                                            if (var33 != null) {
                                                var33 = var33
                                                    .method5373(var11.field2794, -1362689437);
                                                var42 = var33.method5350(1, 1169268292);
                                                if (var42 != null) {
                                                    var42.method2873();
                                                    var23 = var42.field1840 / 2;
                                                } else {
                                                    class37.method721(var11, 1238023037);
                                                }
                                            }
                                        } else if (var11.field2740 == 5) {
                                            if (var11.field2755 == 0) {
                                                var42 = client.field908
                                                    .method4670((class275) null, -1,
                                                                (class275) null, -1, (byte) 9);
                                            } else {
                                                var42 = class69.localPlayer
                                                    .vmethod3236(-2070069362);
                                            }
                                        } else if (var21 == -1) {
                                            var42 = var11.method4710((class275) null, -1, var37,
                                                                     class69.localPlayer.field630,
                                                                     (byte) 70);
                                            if (var42 == null && class232.field2665) {
                                                class37.method721(var11, 1238023037);
                                            }
                                        } else {
                                            class275 var46 = class29
                                                .method532(var21, -1997591994);
                                            var42 = var11
                                                .method4710(var46, var11.field2795, var37,
                                                            class69.localPlayer.field630,
                                                            (byte) 10);
                                            if (var42 == null && class232.field2665) {
                                                class37.method721(var11, 1238023037);
                                            }
                                        }

                                        class124.method2986(var11.field2682 / 2 + var13,
                                                            var11.field2683 / 2 + var14);
                                        var24 = class124.field1747[var11.field2732]
                                            * var11.field2721 >> 16;
                                        var25 = class124.field1754[var11.field2732]
                                            * var11.field2721 >> 16;
                                        if (var42 != null) {
                                            if (!var11.field2685) {
                                                var42.method2925(0, var11.field2719, 0,
                                                                 var11.field2732, 0, var24,
                                                                 var25);
                                            } else {
                                                var42.method2873();
                                                if (var11.field2688) {
                                                    var42.method2887(0, var11.field2719,
                                                                     var11.field2720,
                                                                     var11.field2732,
                                                                     var11.field2718,
                                                                     var23 + var24
                                                                         + var11.field2717,
                                                                     var25 + var11.field2717,
                                                                     var11.field2721);
                                                } else {
                                                    var42.method2925(0, var11.field2719,
                                                                     var11.field2720,
                                                                     var11.field2732,
                                                                     var11.field2718,
                                                                     var24 + var23
                                                                         + var11.field2717,
                                                                     var25 + var11.field2717);
                                                }
                                            }
                                        }

                                        class124.method3014();
                                    } else {
                                        if (var11.field2808 == 7) {
                                            var40 = var11.method4708(-1803491367);
                                            if (var40 == null) {
                                                if (class232.field2665) {
                                                    class37.method721(var11, 1238023037);
                                                }
                                                continue;
                                            }

                                            var21 = 0;

                                            for (var22 = 0; var22 < var11.field2679; ++var22) {
                                                for (var23 = 0; var23 < var11.field2678;
                                                     ++var23) {
                                                    if (var11.field2762[var21] > 0) {
                                                        var33 = class84.method2125(
                                                            var11.field2762[var21] - 1,
                                                            -205103429);
                                                        String var35;
                                                        if (var33.field3523 != 1
                                                            && var11.field2792[var21] == 1) {
                                                            var35 = class128
                                                                .method3233(16748608,
                                                                            2091796743)
                                                                + var33.field3515 + "</col>";
                                                        } else {
                                                            var35 = class128
                                                                .method3233(16748608, 422503986)
                                                                + var33.field3515 + "</col>"
                                                                + " " + 'x' + class8.method96(
                                                                var11.field2792[var21],
                                                                67484369);
                                                        }

                                                        var26 = var13 + var23 * (var11.field2734
                                                            + 115);
                                                        var27 = var22 * (var11.field2708 + 12)
                                                            + var14;
                                                        if (var11.field2681 == 0) {
                                                            var40
                                                                .method5846(var35, var26, var27,
                                                                            var11.field2686,
                                                                            var11.field2716 ? 0
                                                                                : -1);
                                                        } else if (var11.field2681 == 1) {
                                                            var40.method5880(var35,
                                                                             var11.field2682 / 2
                                                                                 + var26, var27,
                                                                             var11.field2686,
                                                                             var11.field2716 ? 0
                                                                                 : -1);
                                                        } else {
                                                            var40.method5799(var35, var26
                                                                                 + var11.field2682 - 1, var27,
                                                                             var11.field2686,
                                                                             var11.field2716 ? 0
                                                                                 : -1);
                                                        }
                                                    }

                                                    ++var21;
                                                }
                                            }
                                        }

                                        if (var11.field2808 == 8 && var11 == class50.field495
                                            && client.field795 == client.field794) {
                                            var20 = 0;
                                            var21 = 0;
                                            class300 var32 = class3.field25;
                                            String var34 = var11.field2728;

                                            String var44;
                                            for (var34 = class36
                                                .method692(var34, var11, -614678746);
                                                 var34.length() > 0;
                                                 var21 = var21 + var32.field3765 + 1) {
                                                var25 = var34.indexOf("<br>");
                                                if (var25 != -1) {
                                                    var44 = var34.substring(0, var25);
                                                    var34 = var34.substring(var25 + 4);
                                                } else {
                                                    var44 = var34;
                                                    var34 = "";
                                                }

                                                var26 = var32.method5793(var44);
                                                if (var26 > var20) {
                                                    var20 = var26;
                                                }
                                            }

                                            var20 += 6;
                                            var21 += 7;
                                            var25 = var13 + var11.field2682 - 5 - var20;
                                            var26 = var14 + var11.field2683 + 5;
                                            if (var25 < var13 + 5) {
                                                var25 = var13 + 5;
                                            }

                                            if (var20 + var25 > var4) {
                                                var25 = var4 - var20;
                                            }

                                            if (var26 + var21 > var5) {
                                                var26 = var5 - var21;
                                            }

                                            class319.method6047(var25, var26, var20, var21,
                                                                16777120);
                                            class319.method6116(var25, var26, var20, var21, 0);
                                            var34 = var11.field2728;
                                            var27 = var26 + var32.field3765 + 2;

                                            for (var34 = class36
                                                .method692(var34, var11, -254971319);
                                                 var34.length() > 0;
                                                 var27 = var27 + var32.field3765 + 1) {
                                                int var36 = var34.indexOf("<br>");
                                                if (var36 != -1) {
                                                    var44 = var34.substring(0, var36);
                                                    var34 = var34.substring(var36 + 4);
                                                } else {
                                                    var44 = var34;
                                                    var34 = "";
                                                }

                                                var32
                                                    .method5846(var44, var25 + 3, var27, 0, -1);
                                            }
                                        }

                                        if (var11.field2808 == 9) {
                                            if (var11.field2701) {
                                                var20 = var13;
                                                var21 = var14 + var11.field2683;
                                                var22 = var13 + var11.field2682;
                                                var23 = var14;
                                            } else {
                                                var20 = var13;
                                                var21 = var14;
                                                var22 = var13 + var11.field2682;
                                                var23 = var14 + var11.field2683;
                                            }

                                            if (var11.field2768 == 1) {
                                                class319.method6055(var20, var21, var22, var23,
                                                                    var11.field2686);
                                            } else {
                                                class171.method3657(var20, var21, var22, var23,
                                                                    var11.field2686,
                                                                    var11.field2768,
                                                                    2085182278);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

    }

    protected void vmethod2358(int var1) throws Exception {
    }

    protected void vmethod2357(int var1) {
    }

    public final synchronized void method2346(byte var1) {
        if (this.field1362 != null) {
            long var2 = class120.method2866((short) 3133);

            try {
                if (0L != this.field1369) {
                    if (var2 < this.field1369) {
                        return;
                    }

                    this.vmethod2354(this.field1365, (byte) -82);
                    this.field1369 = 0L;
                    this.field1374 = true;
                }

                int var4 = this.vmethod2355(-1047007902);
                if (this.field1372 - var4 > this.field1370) {
                    this.field1370 = this.field1372 - var4;
                }

                int var5 = this.field1367 + this.field1368;
                if (var5 + 256 > 16384) {
                    var5 = 16128;
                }

                if (var5 + 256 > this.field1365) {
                    this.field1365 += 1024;
                    if (this.field1365 > 16384) {
                        this.field1365 = 16384;
                    }

                    this.vmethod2357(-1170197019);
                    this.vmethod2354(this.field1365, (byte) -66);
                    var4 = 0;
                    this.field1374 = true;
                    if (var5 + 256 > this.field1365) {
                        var5 = this.field1365 - 256;
                        this.field1368 = var5 - this.field1367;
                    }
                }

                while (var4 < var5) {
                    this.method2351(this.field1362, 256);
                    this.vmethod2356();
                    var4 += 256;
                }

                if (var2 > this.field1375) {
                    if (!this.field1374) {
                        if (this.field1370 == 0 && this.field1371 == 0) {
                            this.vmethod2357(-226847255);
                            this.field1369 = var2 + 2000L;
                            return;
                        }

                        this.field1368 = Math.min(this.field1371, this.field1370);
                        this.field1371 = this.field1370;
                    } else {
                        this.field1374 = false;
                    }

                    this.field1370 = 0;
                    this.field1375 = 2000L + var2;
                }

                this.field1372 = var4;
            } catch (Exception var8) {
                this.vmethod2357(-1506242428);
                this.field1369 = var2 + 2000L;
            }

            try {
                if (var2 > 500000L + this.field1361) {
                    var2 = this.field1361;
                }

                while (var2 > this.field1361 + 5000L) {
                    this.method2350(256, -1972649285);
                    this.field1361 += (long) (256000 / field1377);
                }
            } catch (Exception var7) {
                this.field1361 = var2;
            }

        }
    }

    protected void vmethod2354(int var1, byte var2) throws Exception {
    }

    protected int vmethod2355(int var1) throws Exception {
        return this.field1365;
    }

    public final synchronized void method2348(int var1) {
        this.field1374 = true;

        try {
            this.vmethod2358(1925463504);
        } catch (Exception var3) {
            this.vmethod2357(-1615379202);
            this.field1369 = class120.method2866((short) 3133) + 2000L;
        }

    }

    final void method2350(int var1, int var2) {
        this.field1379 -= var1;
        if (this.field1379 < 0) {
            this.field1379 = 0;
        }

        if (this.field1363 != null) {
            this.field1363.vmethod4601(var1);
        }

    }

    public final synchronized void method2403(int var1) {
        if (class236.field2846 != null) {
            boolean var2 = true;

            for (int var3 = 0; var3 < 2; ++var3) {
                if (this == class236.field2846.field1391[var3]) {
                    class236.field2846.field1391[var3] = null;
                }

                if (class236.field2846.field1391[var3] != null) {
                    var2 = false;
                }
            }

            if (var2) {
                class79.field1155.shutdownNow();
                class79.field1155 = null;
                class236.field2846 = null;
            }
        }

        this.vmethod2357(-219693489);
        this.field1362 = null;
    }

    final void method2352(class107 var1, int var2, int var3) {
        int var4 = var2 >> 5;
        class107 var5 = this.field1376[var4];
        if (var5 == null) {
            this.field1366[var4] = var1;
        } else {
            var5.field1444 = var1;
        }

        this.field1376[var4] = var1;
        var1.field1443 = var2;
    }

    public final void method2347(int var1) {
        this.field1374 = true;
    }

    final void method2351(int[] var1, int var2) {
        int var3 = var2;
        if (class26.field264) {
            var3 = var2 << 1;
        }

        class195.method4110(var1, 0, var3);
        this.field1379 -= var2;
        if (this.field1363 != null && this.field1379 <= 0) {
            this.field1379 += field1377 >> 4;
            class58.method1130(this.field1363, 1477606347);
            this.method2352(this.field1363, this.field1363.vmethod2661(), 1263311551);
            int var4 = 0;
            int var5 = 255;

            int var6;
            class107 var10;
            label104:
            for (var6 = 7; var5 != 0; --var6) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }

                for (int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) {
                    if ((var9 & 1) != 0) {
                        var5 &= ~(1 << var7);
                        var10 = null;
                        class107 var11 = this.field1366[var7];

                        label98:
                        while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label98;
                                }

                                class110 var12 = var11.field1442;
                                if (var12 != null && var12.field1476 > var8) {
                                    var5 |= 1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1444;
                                } else {
                                    var11.field1445 = true;
                                    int var13 = var11.vmethod4609();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1476 += var13;
                                    }

                                    if (var4 >= this.field1364) {
                                        break label104;
                                    }

                                    class107 var14 = var11.vmethod4596();
                                    if (var14 != null) {
                                        for (int var15 = var11.field1443; var14 != null;
                                             var14 = var11.vmethod4598()) {
                                            this.method2352(var14, var15 * var14.vmethod2661() >> 8,
                                                            -468272893);
                                        }
                                    }

                                    class107 var18 = var11.field1444;
                                    var11.field1444 = null;
                                    if (var10 == null) {
                                        this.field1366[var7] = var18;
                                    } else {
                                        var10.field1444 = var18;
                                    }

                                    if (var18 == null) {
                                        this.field1376[var7] = var10;
                                    }

                                    var11 = var18;
                                }
                            }
                        }
                    }

                    var7 += 4;
                    ++var8;
                }
            }

            for (var6 = 0; var6 < 8; ++var6) {
                class107 var16 = this.field1366[var6];
                class107[] var17 = this.field1366;
                this.field1376[var6] = null;

                for (var17[var6] = null; var16 != null; var16 = var10) {
                    var10 = var16.field1444;
                    var16.field1444 = null;
                }
            }
        }

        if (this.field1379 < 0) {
            this.field1379 = 0;
        }

        if (this.field1363 != null) {
            this.field1363.vmethod4620(var1, 0, var2);
        }

        this.field1361 = class120.method2866((short) 3133);
    }

    protected void vmethod2356() throws Exception {
    }

    public final synchronized void method2396(class107 var1, int var2) {
        this.field1363 = var1;
    }

    protected void vmethod2353(int var1) throws Exception {
    }
}
