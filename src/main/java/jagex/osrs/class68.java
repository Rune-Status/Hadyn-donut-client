package jagex.osrs;

public class class68 {

    public static int windowWidth;
    public final class286 field1041;
    public final class292 field1040;
    final class330 field1043;
    int field1042;

    class68(class330 var1) {
        this.field1042 = 0;
        this.field1043 = var1;
        this.field1040 = new class292(var1);
        this.field1041 = new class286(var1);
    }

    static void method1827(int var0, byte[] var1, ArchiveCache var2, int var3) {
        class247 var4 = new class247();
        var4.field3213 = 0;
        var4.key = (long) var0;
        var4.field3212 = var1;
        var4.field3215 = var2;
        class207 var5 = class250.field3242;
        synchronized (class250.field3242) {
            class250.field3242.method4276(var4);
        }

        Object var10 = class250.field3241;
        synchronized (class250.field3241) {
            if (class250.field3243 == 0) {
                class250.field3245 = new Thread(new class250());
                class250.field3245.setDaemon(true);
                class250.field3245.start();
                class250.field3245.setPriority(5);
            }

            class250.field3243 = 600;
        }
    }

    public static class322 method1763(class249 var0, int var1, int var2) {
        byte[] var4 = var0.method4835(var1, (short) -4283);
        boolean var3;
        if (var4 == null) {
            var3 = false;
        } else {
            class125.method3051(var4, 1780365242);
            var3 = true;
        }

        return !var3 ? null : class274.method5439((byte) 28);
    }

    static void method1826(int var0) {
        class23.field235.method4219();
        class23.field232.method4219();
    }

    static final void method1798(class232 var0, int var1, int var2, int var3, int var4) {
        if (var0.field2765 == null) {
            throw new RuntimeException();
        } else {
            var0.field2765[var1] = var2;
            var0.field2745[var1] = var3;
        }
    }

    static final void method1828(class64 var0, int var1, int var2, int var3, int var4, int var5,
                                 int var6) {
        if (var0 != null && var0.vmethod1973(1563766353)) {
            if (var0 instanceof class73) {
                class273 var7 = ((class73) var0).field1102;
                if (var7.field3595 != null) {
                    var7 = var7.method5397((byte) 97);
                }

                if (var7 == null) {
                    return;
                }
            }

            int var76 = class83.field1226;
            int[] var8 = class83.field1222;
            byte var9 = 0;
            if (var1 < var76 && var0.field943 == client.field655 && class157
                .method3456((Player) var0, (byte) -14)) {
                Player var10 = (Player) var0;
                if (var1 < var76) {
                    class33.method612(var0, var0.field946 + 15, 1751819809);
                    class301 var11 = (class301) client.field695.get(class297.field3738);
                    byte var12 = 9;
                    var11.method5880(var10.field625.method5706(-165222639), var2 + client.field652,
                                     var3 + client.field903 - var12, 16777215, 0);
                    var9 = 18;
                }
            }

            int var77 = -2;
            int var16;
            int var23;
            int var24;
            if (!var0.field987.isEmpty()) {
                class33.method612(var0, var0.field946 + 15, 1714550652);

                for (class72 var88 = (class72) var0.field987.method4250(); var88 != null;
                     var88 = (class72) var0.field987.method4248()) {
                    class65 var78 = var88.method1960(client.field655, 2056257489);
                    if (var78 == null) {
                        if (var88.method1965(-1640004367)) {
                            var88.unlink();
                        }
                    } else {
                        class263 var13 = var88.field1097;
                        class323 var14 = var13.method5150(-1057793537);
                        class323 var15 = var13.method5149(-1081176616);
                        int var17 = 0;
                        if (var14 != null && var15 != null) {
                            if (var13.field3393 * 2 < var15.field3879) {
                                var17 = var13.field3393;
                            }

                            var16 = var15.field3879 - var17 * 2;
                        } else {
                            var16 = var13.field3392;
                        }

                        int var18 = 255;
                        boolean var19 = true;
                        int var20 = client.field655 - var78.field1006;
                        int var21 = var16 * var78.field1002 / var13.field3392;
                        int var22;
                        int var93;
                        if (var78.field1003 > var20) {
                            var22 = var13.field3381 == 0 ? 0
                                : var13.field3381 * (var20 / var13.field3381);
                            var23 = var16 * var78.field1004 / var13.field3392;
                            var93 = var22 * (var21 - var23) / var78.field1003 + var23;
                        } else {
                            var93 = var21;
                            var22 = var78.field1003 + var13.field3387 - var20;
                            if (var13.field3394 >= 0) {
                                var18 = (var22 << 8) / (var13.field3387 - var13.field3394);
                            }
                        }

                        if (var78.field1002 > 0 && var93 < 1) {
                            var93 = 1;
                        }

                        if (var14 != null && var15 != null) {
                            if (var93 == var16) {
                                var93 += var17 * 2;
                            } else {
                                var93 += var17;
                            }

                            var22 = var14.field3887;
                            var77 += var22;
                            var23 = var2 + client.field652 - (var16 >> 1);
                            var24 = var3 + client.field903 - var77;
                            var23 -= var17;
                            if (var18 >= 0 && var18 < 255) {
                                var14.method6170(var23, var24, var18);
                                class319.method6041(var23, var24, var23 + var93, var22 + var24);
                                var15.method6170(var23, var24, var18);
                            } else {
                                var14.method6164(var23, var24);
                                class319.method6041(var23, var24, var23 + var93, var22 + var24);
                                var15.method6164(var23, var24);
                            }

                            class319.method6067(var2, var3, var2 + var4, var3 + var5);
                            var77 += 2;
                        } else {
                            var77 += 5;
                            if (client.field652 > -1) {
                                var22 = var2 + client.field652 - (var16 >> 1);
                                var23 = var3 + client.field903 - var77;
                                class319.method6047(var22, var23, var93, 5, 65280);
                                class319
                                    .method6047(var93 + var22, var23, var16 - var93, 5, 16711680);
                            }

                            var77 += 2;
                        }
                    }
                }
            }

            if (var77 == -2) {
                var77 += 7;
            }

            var77 += var9;
            if (var1 < var76) {
                Player var89 = (Player) var0;
                if (var89.field626) {
                    return;
                }

                if (var89.field629 != -1 || var89.field609 != -1) {
                    class33.method612(var0, var0.field946 + 15, 1465346128);
                    if (client.field652 > -1) {
                        if (var89.field629 != -1) {
                            var77 += 25;
                            Player.field635[var89.field629].method6164(var2 + client.field652 - 12,
                                                                       var3 + client.field903
                                                                            - var77);
                        }

                        if (var89.field609 != -1) {
                            var77 += 25;
                            class137.field1913[var89.field609]
                                .method6164(var2 + client.field652 - 12,
                                            var3 + client.field903 - var77);
                        }
                    }
                }

                if (var1 >= 0 && client.field663 == 10 && var8[var1] == client.field665) {
                    class33.method612(var0, var0.field946 + 15, 285063036);
                    if (client.field652 > -1) {
                        var77 += class49.field489[1].field3887;
                        class49.field489[1].method6164(var2 + client.field652 - 12,
                                                       var3 + client.field903 - var77);
                    }
                }
            } else {
                class273 var90 = ((class73) var0).field1102;
                if (var90.field3595 != null) {
                    var90 = var90.method5397((byte) 15);
                }

                if (var90.field3592 >= 0 && var90.field3592 < class137.field1913.length) {
                    class33.method612(var0, var0.field946 + 15, -140995181);
                    if (client.field652 > -1) {
                        class137.field1913[var90.field3592]
                            .method6164(var2 + client.field652 - 12, var3 + client.field903 - 30);
                    }
                }

                if (client.field663 == 1 && client.field687[var1 - var76] == client.field664
                    && client.field655 % 20 < 10) {
                    class33.method612(var0, var0.field946 + 15, -365035398);
                    if (client.field652 > -1) {
                        class49.field489[0]
                            .method6164(var2 + client.field652 - 12, var3 + client.field903 - 28);
                    }
                }
            }

            if (var0.field968 != null && (var1 >= var76 || !var0.field954 && (client.field730 == 4
                || !var0.field958 && (client.field730 == 0 || client.field730 == 3
                || client.field730 == 1 && ((Player) var0).method1173(-922368349))))) {
                class33.method612(var0, var0.field946, -2016884236);
                if (client.field652 > -1 && client.field912 < client.field731) {
                    client.field757[client.field912] =
                        class163.field2066.method5793(var0.field968) / 2;
                    client.field738[client.field912] = class163.field2066.field3765;
                    client.field732[client.field912] = client.field652;
                    client.field733[client.field912] = client.field903;
                    client.field736[client.field912] = var0.field956;
                    client.field737[client.field912] = var0.field974;
                    client.field818[client.field912] = var0.field981;
                    client.field739[client.field912] = var0.field968;
                    ++client.field912;
                }
            }

            for (int var79 = 0; var79 < 4; ++var79) {
                int var91 = var0.field961[var79];
                int var80 = var0.field992[var79];
                class269 var92 = null;
                int var81 = 0;
                if (var80 >= 0) {
                    if (var91 <= client.field655) {
                        continue;
                    }

                    var92 = class221.method4528(var0.field992[var79], -1189840038);
                    var81 = var92.field3428;
                    if (var92 != null && var92.field3443 != null) {
                        var92 = var92.method5268((byte) -37);
                        if (var92 == null) {
                            var0.field961[var79] = -1;
                            continue;
                        }
                    }
                } else if (var91 < 0) {
                    continue;
                }

                var16 = var0.field962[var79];
                class269 var82 = null;
                if (var16 >= 0) {
                    var82 = class221.method4528(var16, -1513240453);
                    if (var82 != null && var82.field3443 != null) {
                        var82 = var82.method5268((byte) -28);
                    }
                }

                if (var91 - var81 <= client.field655) {
                    if (var92 == null) {
                        var0.field961[var79] = -1;
                    } else {
                        class33.method612(var0, var0.field946 / 2, 569590845);
                        if (client.field652 > -1) {
                            if (var79 == 1) {
                                client.field903 -= 20;
                            }

                            if (var79 == 2) {
                                client.field652 -= 15;
                                client.field903 -= 10;
                            }

                            if (var79 == 3) {
                                client.field652 += 15;
                                client.field903 -= 10;
                            }

                            class323 var83 = null;
                            class323 var84 = null;
                            class323 var85 = null;
                            class323 var86 = null;
                            var23 = 0;
                            var24 = 0;
                            int var25 = 0;
                            int var26 = 0;
                            int var27 = 0;
                            int var28 = 0;
                            int var29 = 0;
                            int var30 = 0;
                            class323 var31 = null;
                            class323 var32 = null;
                            class323 var33 = null;
                            class323 var34 = null;
                            int var35 = 0;
                            int var36 = 0;
                            int var37 = 0;
                            int var38 = 0;
                            int var39 = 0;
                            int var40 = 0;
                            int var41 = 0;
                            int var42 = 0;
                            int var43 = 0;
                            var83 = var92.method5266(2113084260);
                            int var44;
                            if (var83 != null) {
                                var23 = var83.field3879;
                                var44 = var83.field3887;
                                if (var44 > var43) {
                                    var43 = var44;
                                }

                                var27 = var83.field3881;
                            }

                            var84 = var92.method5236(876183082);
                            if (var84 != null) {
                                var24 = var84.field3879;
                                var44 = var84.field3887;
                                if (var44 > var43) {
                                    var43 = var44;
                                }

                                var28 = var84.field3881;
                            }

                            var85 = var92.method5243(-1228964338);
                            if (var85 != null) {
                                var25 = var85.field3879;
                                var44 = var85.field3887;
                                if (var44 > var43) {
                                    var43 = var44;
                                }

                                var29 = var85.field3881;
                            }

                            var86 = var92.method5241(1564627351);
                            if (var86 != null) {
                                var26 = var86.field3879;
                                var44 = var86.field3887;
                                if (var44 > var43) {
                                    var43 = var44;
                                }

                                var30 = var86.field3881;
                            }

                            if (var82 != null) {
                                var31 = var82.method5266(2107277884);
                                if (var31 != null) {
                                    var35 = var31.field3879;
                                    var44 = var31.field3887;
                                    if (var44 > var43) {
                                        var43 = var44;
                                    }

                                    var39 = var31.field3881;
                                }

                                var32 = var82.method5236(-473047057);
                                if (var32 != null) {
                                    var36 = var32.field3879;
                                    var44 = var32.field3887;
                                    if (var44 > var43) {
                                        var43 = var44;
                                    }

                                    var40 = var32.field3881;
                                }

                                var33 = var82.method5243(-1102084250);
                                if (var33 != null) {
                                    var37 = var33.field3879;
                                    var44 = var33.field3887;
                                    if (var44 > var43) {
                                        var43 = var44;
                                    }

                                    var41 = var33.field3881;
                                }

                                var34 = var82.method5241(-186631925);
                                if (var34 != null) {
                                    var38 = var34.field3879;
                                    var44 = var34.field3887;
                                    if (var44 > var43) {
                                        var43 = var44;
                                    }

                                    var42 = var34.field3881;
                                }
                            }

                            class300 var87 = var92.method5257(-1086243540);
                            if (var87 == null) {
                                var87 = class18.field175;
                            }

                            class300 var45;
                            if (var82 != null) {
                                var45 = var82.method5257(1811235336);
                                if (var45 == null) {
                                    var45 = class18.field175;
                                }
                            } else {
                                var45 = class18.field175;
                            }

                            String var46 = null;
                            String var47 = null;
                            boolean var48 = false;
                            int var49 = 0;
                            var46 = var92.method5252(var0.field960[var79], 193568958);
                            int var94 = var87.method5793(var46);
                            if (var82 != null) {
                                var47 = var82.method5252(var0.field963[var79], 193568958);
                                var49 = var45.method5793(var47);
                            }

                            int var50 = 0;
                            int var51 = 0;
                            if (var24 > 0) {
                                if (var85 == null && var86 == null) {
                                    var50 = 1;
                                } else {
                                    var50 = var94 / var24 + 1;
                                }
                            }

                            if (var82 != null && var36 > 0) {
                                if (var33 == null && var34 == null) {
                                    var51 = 1;
                                } else {
                                    var51 = var49 / var36 + 1;
                                }
                            }

                            int var52 = 0;
                            int var53 = var52;
                            if (var23 > 0) {
                                var52 += var23;
                            }

                            var52 += 2;
                            int var54 = var52;
                            if (var25 > 0) {
                                var52 += var25;
                            }

                            int var55 = var52;
                            int var56 = var52;
                            int var57;
                            if (var24 > 0) {
                                var57 = var50 * var24;
                                var52 += var57;
                                var56 += (var57 - var94) / 2;
                            } else {
                                var52 += var94;
                            }

                            var57 = var52;
                            if (var26 > 0) {
                                var52 += var26;
                            }

                            int var58 = 0;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            int var62 = 0;
                            int var63;
                            if (var82 != null) {
                                var52 += 2;
                                var58 = var52;
                                if (var35 > 0) {
                                    var52 += var35;
                                }

                                var52 += 2;
                                var59 = var52;
                                if (var37 > 0) {
                                    var52 += var37;
                                }

                                var60 = var52;
                                var62 = var52;
                                if (var36 > 0) {
                                    var63 = var51 * var36;
                                    var52 += var63;
                                    var62 += (var63 - var49) / 2;
                                } else {
                                    var52 += var49;
                                }

                                var61 = var52;
                                if (var38 > 0) {
                                    var52 += var38;
                                }
                            }

                            var63 = var0.field961[var79] - client.field655;
                            int var64 = var92.field3441 - var63 * var92.field3441 / var92.field3428;
                            int var65 =
                                var63 * var92.field3431 / var92.field3428 + -var92.field3431;
                            int var66 = var64 + (var2 + client.field652 - (var52 >> 1));
                            int var67 = var65 + (var3 + client.field903 - 12);
                            int var68 = var67;
                            int var69 = var67 + var43;
                            int var70 = var67 + var92.field3446 + 15;
                            int var71 = var70 - var87.field3766;
                            int var72 = var70 + var87.field3767;
                            if (var71 < var67) {
                                var68 = var71;
                            }

                            if (var72 > var69) {
                                var69 = var72;
                            }

                            int var73 = 0;
                            int var74;
                            int var75;
                            if (var82 != null) {
                                var73 = var67 + var82.field3446 + 15;
                                var74 = var73 - var45.field3766;
                                var75 = var73 + var45.field3767;
                                if (var74 < var68) {
                                    ;
                                }

                                if (var75 > var69) {
                                    ;
                                }
                            }

                            var74 = 255;
                            if (var92.field3442 >= 0) {
                                var74 = (var63 << 8) / (var92.field3428 - var92.field3442);
                            }

                            if (var74 >= 0 && var74 < 255) {
                                if (var83 != null) {
                                    var83.method6170(var53 + var66 - var27, var67, var74);
                                }

                                if (var85 != null) {
                                    var85.method6170(var54 + var66 - var29, var67, var74);
                                }

                                if (var84 != null) {
                                    for (var75 = 0; var75 < var50; ++var75) {
                                        var84.method6170(var75 * var24 + (var66 + var55 - var28),
                                                         var67, var74);
                                    }
                                }

                                if (var86 != null) {
                                    var86.method6170(var66 + var57 - var30, var67, var74);
                                }

                                var87.method5864(var46, var66 + var56, var70, var92.field3435, 0,
                                                 var74);
                                if (var82 != null) {
                                    if (var31 != null) {
                                        var31.method6170(var58 + var66 - var39, var67, var74);
                                    }

                                    if (var33 != null) {
                                        var33.method6170(var59 + var66 - var41, var67, var74);
                                    }

                                    if (var32 != null) {
                                        for (var75 = 0; var75 < var51; ++var75) {
                                            var32
                                                .method6170(var75 * var36 + (var60 + var66 - var40),
                                                            var67, var74);
                                        }
                                    }

                                    if (var34 != null) {
                                        var34.method6170(var61 + var66 - var42, var67, var74);
                                    }

                                    var45
                                        .method5864(var47, var62 + var66, var73, var82.field3435, 0,
                                                    var74);
                                }
                            } else {
                                if (var83 != null) {
                                    var83.method6164(var53 + var66 - var27, var67);
                                }

                                if (var85 != null) {
                                    var85.method6164(var54 + var66 - var29, var67);
                                }

                                if (var84 != null) {
                                    for (var75 = 0; var75 < var50; ++var75) {
                                        var84.method6164(var75 * var24 + (var55 + var66 - var28),
                                                         var67);
                                    }
                                }

                                if (var86 != null) {
                                    var86.method6164(var57 + var66 - var30, var67);
                                }

                                var87.method5846(var46, var56 + var66, var70,
                                                 var92.field3435 | -16777216, 0);
                                if (var82 != null) {
                                    if (var31 != null) {
                                        var31.method6164(var58 + var66 - var39, var67);
                                    }

                                    if (var33 != null) {
                                        var33.method6164(var59 + var66 - var41, var67);
                                    }

                                    if (var32 != null) {
                                        for (var75 = 0; var75 < var51; ++var75) {
                                            var32
                                                .method6164(var75 * var36 + (var66 + var60 - var40),
                                                            var67);
                                        }
                                    }

                                    if (var34 != null) {
                                        var34.method6164(var66 + var61 - var42, var67);
                                    }

                                    var45.method5846(var47, var66 + var62, var73,
                                                     var82.field3435 | -16777216, 0);
                                }
                            }
                        }
                    }
                }
            }

        }
    }

    final boolean method1764(class293 var1, byte var2) {
        class294 var3 = (class294) this.field1040.method5589(var1, 1077203769);
        return var3 != null && var3.method5681(-1699750405);
    }

    final boolean method1759(int var1) {
        return this.field1040.method5587((byte) 1)
            || this.field1040.method5586((byte) 1) >= 200 && client.field761 != 1;
    }

    final boolean method1761(byte var1) {
        return this.field1041.method5587((byte) 1)
            || this.field1041.method5586((byte) 1) >= 100 && client.field761 != 1;
    }

    final boolean method1776(class293 var1, boolean var2, byte var3) {
        return var1 == null ? false : (var1.equals(class69.localPlayer.field625) ? true
            : this.field1040.method5692(var1, var2, -709116424));
    }

    final boolean method1803(class293 var1, int var2) {
        return var1 == null ? false : this.field1041.method5608(var1, (byte) 40);
    }

    final void method1804(short var1) {
        this.field1042 = 1;
    }

    final void method1753(Buffer var1, int var2, byte var3) {
        this.field1040.method5693(var1, var2, (byte) 113);
        this.field1042 = 2;
        class250.method4920(16711935);
    }

    boolean method1751(int var1) {
        return this.field1042 == 2;
    }

    final void method1758(String var1, byte var2) {
        if (var1 != null) {
            class293 var3 = new class293(var1, this.field1043);
            if (var3.method5707(838850399)) {
                if (this.method1759(-831196560)) {
                    class221.method4527(1474359120);
                } else if (class69.localPlayer.field625.equals(var3)) {
                    class223.method4593((short) -16713);
                } else if (this.method1776(var3, false, (byte) 68)) {
                    class18.method237(var1, 2131882265);
                } else if (this.method1803(var3, 1440386847)) {
                    class34.method643("Please remove " + var1 + " from your ignore list first",
                                      1475323091);
                } else {
                    class255.method5016(var1, (byte) 0);
                }
            }
        }
    }

    final void method1762(String var1, int var2) {
        if (var1 != null) {
            class293 var3 = new class293(var1, this.field1043);
            if (var3.method5707(1164996468)) {
                if (this.field1040.method5592(var3, (short) 11715)) {
                    client.field836 = client.field828;
                    OutboundPacket var4 = class131
                        .method3243(class171.field2231, client.field690.random, (byte) 29);
                    var4.buffer.writeByte(class97.method2404(var1, -327297376));
                    var4.buffer.writeString(var1);
                    client.field690.method2193(var4, 214707399);
                }

                class250.method4920(16711935);
            }
        }
    }

    final void method1760(String var1, int var2) {
        if (var1 != null) {
            class293 var3 = new class293(var1, this.field1043);
            if (var3.method5707(1281533379)) {
                if (this.method1761((byte) 114)) {
                    class34.method643(
                        "Your ignore list is full. Max of 100 for free users, and 400 for members",
                        1738652676);
                } else if (class69.localPlayer.field625.equals(var3)) {
                    class34
                        .method643("You can\'t add yourself to your own ignore list", -1582686575);
                } else if (this.method1803(var3, 1440386847)) {
                    HandshakePacket.method3664(var1, 681449749);
                } else if (this.method1776(var3, false, (byte) 124)) {
                    class20.method318(var1, (byte) -100);
                } else {
                    OutboundPacket var4 = class131
                        .method3243(class171.field2297, client.field690.random, (byte) 74);
                    var4.buffer.writeByte(class97.method2404(var1, -487237264));
                    var4.buffer.writeString(var1);
                    client.field690.method2193(var4, 967468303);
                }
            }
        }
    }

    final void method1755(int var1) {
        this.field1042 = 0;
        this.field1040.method5585(-591560482);
        this.field1041.method5585(-591560482);
    }

    final void method1780(String var1, byte var2) {
        if (var1 != null) {
            class293 var3 = new class293(var1, this.field1043);
            if (var3.method5707(1181226196)) {
                if (this.field1041.method5592(var3, (short) 14736)) {
                    client.field836 = client.field828;
                    OutboundPacket var4 = class131
                        .method3243(class171.field2235, client.field690.random, (byte) 113);
                    var4.buffer.writeByte(class97.method2404(var1, -305651468));
                    var4.buffer.writeString(var1);
                    client.field690.method2193(var4, 1862972902);
                }

                class2.method20((byte) 0);
            }
        }
    }

    final void method1823(int var1) {
        for (class296 var2 = (class296) this.field1040.field3717.method4317(); var2 != null;
             var2 = (class296) this.field1040.field3717.method4318()) {
            if ((long) var2.field3736 < class120.method2866((short) 3133) / 1000L - 5L) {
                if (var2.field3735 > 0) {
                    class59.method1163(5, "", var2.field3734 + " has logged in.", -1483885983);
                }

                if (var2.field3735 == 0) {
                    class59.method1163(5, "", var2.field3734 + " has logged out.", -1483885983);
                }

                var2.method4323();
            }
        }

    }
}
