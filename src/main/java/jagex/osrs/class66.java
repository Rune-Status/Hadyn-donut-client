package jagex.osrs;

public class class66 {

    static int field1013;
    static class232 field1025;
    static int field1014;
    static int[] field1018;
    static int[] field1016;
    static class66[] field1017;
    static class138 field1010;
    static int field1026;

    static {
        field1013 = 0;
        field1014 = 0;
        field1018 = new int[]{1, 1, 1, 1};
        field1016 = new int[]{0, 1, 2, 3};
    }

    int field1008;
    String field1019;
    int field1015;
    int field1024;
    int field1020;
    String field1022;
    int field1021;

    static void method1735(byte var0) {
        if (client.field762) {
            Player.method1207(class69.localPlayer, false, (byte) -4);
        }

    }

    public static class173[] method1733(int var0) {
        return new class173[]{class173.field2323, class173.field2316, class173.field2318,
            class173.field2319, class173.field2320, class173.field2321, class173.field2322,
            class173.field2317, class173.field2329, class173.field2325};
    }

    static final void method1696(int var0) {
        int var1 = class83.field1226;
        int[] var2 = class83.field1222;

        for (int var3 = 0; var3 < var1; ++var3) {
            Player var4 = client.players[var2[var3]];
            if (var4 != null) {
                class148.method3370(var4, 1, (byte) 7);
            }
        }

    }

    static final void method1707(int var0, int var1, int var2, int var3, int var4) {
        if (client.field796 == 0 && !client.field798) {
            class79.method2039("Walk here", "", 23, 0, var0 - var2, var1 - var3, 736184686);
        }

        long var5 = -1L;
        long var7 = -1L;
        int var9 = 0;

        while (true) {
            int var11 = class122.field1713;
            if (var9 >= var11) {
                if (-1L != var5) {
                    var9 = class22.method334(var5);
                    int var10 = class85.method2126(var5);
                    Player var27 = client.players[client.field769];
                    class141.method3314(var27, client.field769, var9, var10, (byte) 99);
                }

                return;
            }

            long var12 = class122.field1714[var9];
            if (var7 != var12) {
                label333:
                {
                    var7 = var12;
                    int var16 = class294.method5727(var9, -1048301153);
                    int var17 = class85.method2126(class122.field1714[var9]);
                    int var18 = var17;
                    int var19 = class35.method654(var9, -1426711154);
                    int var20 = class15.method179(var9, (byte) -29);
                    if (var19 == 2
                        && class243.field3173.method3087(class60.level, var16, var17, var12)
                        >= 0) {
                        class270 var21 = class253.method4993(var20, (byte) -43);
                        if (var21.field3480 != null) {
                            var21 = var21.method5279((byte) 98);
                        }

                        if (var21 == null) {
                            break label333;
                        }

                        if (client.field796 == 1) {
                            class79.method2039("Use", client.field766 + " " + "->" + " " + class128
                                                   .method3233(65535, 896743730) + var21.field3461, 1, var20, var16,
                                               var17, 1086709315);
                        } else if (client.field798) {
                            if ((class297.field3740 & 4) == 4) {
                                class79.method2039(client.field801,
                                                   client.field716 + " " + "->" + " " + class128
                                                       .method3233(65535, 1924949786)
                                                       + var21.field3461, 2, var20, var16, var17,
                                                   -2113794728);
                            }
                        } else {
                            String[] var28 = var21.field3478;
                            if (var28 != null) {
                                for (int var29 = 4; var29 >= 0; --var29) {
                                    if (var28[var29] != null) {
                                        short var24 = 0;
                                        if (var29 == 0) {
                                            var24 = 3;
                                        }

                                        if (var29 == 1) {
                                            var24 = 4;
                                        }

                                        if (var29 == 2) {
                                            var24 = 5;
                                        }

                                        if (var29 == 3) {
                                            var24 = 6;
                                        }

                                        if (var29 == 4) {
                                            var24 = 1001;
                                        }

                                        class79.method2039(var28[var29],
                                                           class128.method3233(65535, 628285512)
                                                               + var21.field3461, var24, var20,
                                                           var16, var18, 26567557);
                                    }
                                }
                            }

                            class79.method2039("Examine", class128.method3233(65535, 1720971805)
                                                   + var21.field3461, 1002, var21.field3469, var16, var18,
                                               -1813395939);
                        }
                    }

                    int var22;
                    class73 var23;
                    Player var25;
                    int[] var35;
                    int var37;
                    if (var19 == 1) {
                        class73 var32 = client.field806[var20];
                        if (var32 == null) {
                            break label333;
                        }

                        if (var32.field1102.field3600 == 1 && (var32.x & 127) == 64
                            && (var32.z & 127) == 64) {
                            for (var22 = 0; var22 < client.field686; ++var22) {
                                var23 = client.field806[client.field687[var22]];
                                if (var23 != null && var23 != var32
                                    && var23.field1102.field3600 == 1
                                    && var23.x == var32.x
                                    && var23.z == var32.z) {
                                    class67
                                        .method1741(var23.field1102, client.field687[var22], var16,
                                                    var18, -1805799058);
                                }
                            }

                            var22 = class83.field1226;
                            var35 = class83.field1222;

                            for (var37 = 0; var37 < var22; ++var37) {
                                var25 = client.players[var35[var37]];
                                if (var25 != null && var25.x == var32.x
                                    && var32.z == var25.z) {
                                    class141
                                        .method3314(var25, var35[var37], var16, var18, (byte) 37);
                                }
                            }
                        }

                        class67.method1741(var32.field1102, var20, var16, var18, 464897222);
                    }

                    if (var19 == 0) {
                        Player var33 = client.players[var20];
                        if (var33 == null) {
                            break label333;
                        }

                        if ((var33.x & 127) == 64 && (var33.z & 127) == 64) {
                            for (var22 = 0; var22 < client.field686; ++var22) {
                                var23 = client.field806[client.field687[var22]];
                                if (var23 != null && var23.field1102.field3600 == 1
                                    && var33.x == var23.x
                                    && var33.z == var23.z) {
                                    class67
                                        .method1741(var23.field1102, client.field687[var22], var16,
                                                    var18, 223122158);
                                }
                            }

                            var22 = class83.field1226;
                            var35 = class83.field1222;

                            for (var37 = 0; var37 < var22; ++var37) {
                                var25 = client.players[var35[var37]];
                                if (var25 != null && var33 != var25
                                    && var25.x == var33.x
                                    && var25.z == var33.z) {
                                    class141
                                        .method3314(var25, var35[var37], var16, var18, (byte) 61);
                                }
                            }
                        }

                        if (var20 != client.field769) {
                            class141.method3314(var33, var20, var16, var18, (byte) 74);
                        } else {
                            var5 = var12;
                        }
                    }

                    if (var19 == 3) {
                        class207 var34 = client.field829[class60.level][var16][var18];
                        if (var34 != null) {
                            for (class81 var38 = (class81) var34.method4274(); var38 != null;
                                 var38 = (class81) var34.method4295()) {
                                class271 var36 = class84.method2125(var38.field1213, -205103429);
                                if (client.field796 == 1) {
                                    class79.method2039("Use",
                                                       client.field766 + " " + "->" + " " + class128
                                                           .method3233(16748608, 1208596387)
                                                           + var36.field3515, 16, var38.field1213,
                                                       var16, var18, 663926568);
                                } else if (client.field798) {
                                    if ((class297.field3740 & 1) == 1) {
                                        class79.method2039(client.field801,
                                                           client.field716 + " " + "->" + " "
                                                               + class128
                                                               .method3233(16748608, 647318773)
                                                               + var36.field3515, 17,
                                                           var38.field1213, var16, var18,
                                                           730743665);
                                    }
                                } else {
                                    String[] var30 = var36.field3526;

                                    for (int var31 = 4; var31 >= 0; --var31) {
                                        if (var30 != null && var30[var31] != null) {
                                            byte var26 = 0;
                                            if (var31 == 0) {
                                                var26 = 18;
                                            }

                                            if (var31 == 1) {
                                                var26 = 19;
                                            }

                                            if (var31 == 2) {
                                                var26 = 20;
                                            }

                                            if (var31 == 3) {
                                                var26 = 21;
                                            }

                                            if (var31 == 4) {
                                                var26 = 22;
                                            }

                                            class79.method2039(var30[var31], class128
                                                                   .method3233(16748608, 1129836141) + var36.field3515,
                                                               var26, var38.field1213, var16, var18,
                                                               -880668230);
                                        } else if (var31 == 2) {
                                            class79.method2039("Take", class128
                                                                   .method3233(16748608, 624263243) + var36.field3515,
                                                               20, var38.field1213, var16, var18,
                                                               611667838);
                                        }
                                    }

                                    class79.method2039("Examine",
                                                       class128.method3233(16748608, 383506485)
                                                           + var36.field3515, 1004, var38.field1213,
                                                       var16, var18, -1135588096);
                                }
                            }
                        }
                    }
                }
            }

            ++var9;
        }
    }

    static boolean method1727(byte var0) {
        return (client.field676 & 4) != 0;
    }

    boolean method1684(int var1) {
        return (1 & this.field1008) != 0;
    }

    boolean method1686(int var1) {
        return (33554432 & this.field1008) != 0;
    }

    boolean method1689(int var1) {
        return (536870912 & this.field1008) != 0;
    }

    boolean method1687(byte var1) {
        return (4 & this.field1008) != 0;
    }

    boolean method1731(int var1) {
        return (8 & this.field1008) != 0;
    }

    boolean method1734(short var1) {
        return (2 & this.field1008) != 0;
    }
}
