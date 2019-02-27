package jagex.osrs;

import java.awt.Image;

public final class class136 {

    static Image field1892;
    public long field1904;
    public class129 field1896;
    int field1898;
    int field1903;
    int field1906;
    int field1900;
    int field1901;
    int field1899;
    int field1894;
    int field1907;
    int field1895;
    int field1897;
    int field1905;
    int field1902;

    class136() {
        this.field1904 = 0L;
        this.field1906 = 0;
    }

    static void method3270(class232 var0, int var1, int var2, boolean var3, byte var4) {
        int var5 = var0.field2682;
        int var6 = var0.field2683;
        if (var0.field2736 == 0) {
            var0.field2682 = var0.field2678;
        } else if (var0.field2736 == 1) {
            var0.field2682 = var1 - var0.field2678;
        } else if (var0.field2736 == 2) {
            var0.field2682 = var0.field2678 * var1 >> 14;
        }

        if (var0.field2675 == 0) {
            var0.field2683 = var0.field2679;
        } else if (var0.field2675 == 1) {
            var0.field2683 = var2 - var0.field2679;
        } else if (var0.field2675 == 2) {
            var0.field2683 = var2 * var0.field2679 >> 14;
        }

        if (var0.field2736 == 4) {
            var0.field2682 = var0.field2683 * var0.field2684 / var0.field2668;
        }

        if (var0.field2675 == 4) {
            var0.field2683 = var0.field2682 * var0.field2668 / var0.field2684;
        }

        if (var0.field2741 == 1337) {
            client.field815 = var0;
        }

        if (var3 && var0.field2782 != null && (var5 != var0.field2682 || var6 != var0.field2683)) {
            ScriptCall var7 = new ScriptCall();
            var7.field570 = var0;
            var7.arguments = var0.field2782;
            client.field842.addLast(var7);
        }

    }

    static void method3267(class300 var0, class300 var1, class300 var2, boolean var3, byte var4) {
        if (var3) {
            class79.field1143 = (class68.windowWidth - 765) / 2;
            class79.field1144 = class79.field1143 + 202;
            class13.field103 = class79.field1144 + 180;
        }

        int var8;
        int var13;
        int var14;
        boolean var16;
        int var17;
        byte var23;
        int var24;
        int var27;
        int var33;
        int var35;
        int var36;
        int var37;
        int var39;
        int var41;
        if (class79.field1176) {
            if (class78.field1137 == null) {
                class78.field1137 = class279
                    .method5496(class154.index8, "sl_back", "", -2027075443);
            }

            class322[] var9;
            class251 var32;
            if (BufferedFile.field1490 == null) {
                var32 = class154.index8;
                var33 = var32.method4825("sl_flags", 1011742774);
                var8 = var32.method4847(var33, "", 2107503174);
                if (!class17.method212(var32, var33, var8, (byte) 1)) {
                    var9 = null;
                } else {
                    var9 = class311.method5957(-464367205);
                }

                BufferedFile.field1490 = var9;
            }

            if (class10.field81 == null) {
                var32 = class154.index8;
                var33 = var32.method4825("sl_arrows", 1011742774);
                var8 = var32.method4847(var33, "", -849196060);
                if (!class17.method212(var32, var33, var8, (byte) 1)) {
                    var9 = null;
                } else {
                    var9 = class311.method5957(-1062142513);
                }

                class10.field81 = var9;
            }

            if (class50.field513 == null) {
                var32 = class154.index8;
                var33 = var32.method4825("sl_stars", 1011742774);
                var8 = var32.method4847(var33, "", 1378021831);
                if (!class17.method212(var32, var33, var8, (byte) 1)) {
                    var9 = null;
                } else {
                    var9 = class311.method5957(365424801);
                }

                class50.field513 = var9;
            }

            class319.method6047(class79.field1143, 23, 765, 480, 0);
            class319.method6052(class79.field1143, 0, 125, 23, 12425273, 9135624);
            class319.method6052(class79.field1143 + 125, 0, 640, 23, 5197647, 2697513);
            var0.method5880("Select a world", class79.field1143 + 62, 15, 0, -1);
            if (class50.field513 != null) {
                class50.field513[1].method6143(class79.field1143 + 140, 1);
                var1.method5846("Members only world", class79.field1143 + 152, 10, 16777215, -1);
                class50.field513[0].method6143(class79.field1143 + 140, 12);
                var1.method5846("Free world", class79.field1143 + 152, 21, 16777215, -1);
            }

            if (class10.field81 != null) {
                var41 = class79.field1143 + 280;
                if (class66.field1016[0] == 0 && class66.field1018[0] == 0) {
                    class10.field81[2].method6143(var41, 4);
                } else {
                    class10.field81[0].method6143(var41, 4);
                }

                if (class66.field1016[0] == 0 && class66.field1018[0] == 1) {
                    class10.field81[3].method6143(var41 + 15, 4);
                } else {
                    class10.field81[1].method6143(var41 + 15, 4);
                }

                var0.method5846("World", var41 + 32, 17, 16777215, -1);
                var24 = class79.field1143 + 390;
                if (class66.field1016[0] == 1 && class66.field1018[0] == 0) {
                    class10.field81[2].method6143(var24, 4);
                } else {
                    class10.field81[0].method6143(var24, 4);
                }

                if (class66.field1016[0] == 1 && class66.field1018[0] == 1) {
                    class10.field81[3].method6143(var24 + 15, 4);
                } else {
                    class10.field81[1].method6143(var24 + 15, 4);
                }

                var0.method5846("Players", var24 + 32, 17, 16777215, -1);
                var33 = class79.field1143 + 500;
                if (class66.field1016[0] == 2 && class66.field1018[0] == 0) {
                    class10.field81[2].method6143(var33, 4);
                } else {
                    class10.field81[0].method6143(var33, 4);
                }

                if (class66.field1016[0] == 2 && class66.field1018[0] == 1) {
                    class10.field81[3].method6143(var33 + 15, 4);
                } else {
                    class10.field81[1].method6143(var33 + 15, 4);
                }

                var0.method5846("Location", var33 + 32, 17, 16777215, -1);
                var8 = class79.field1143 + 610;
                if (class66.field1016[0] == 3 && class66.field1018[0] == 0) {
                    class10.field81[2].method6143(var8, 4);
                } else {
                    class10.field81[0].method6143(var8, 4);
                }

                if (class66.field1016[0] == 3 && class66.field1018[0] == 1) {
                    class10.field81[3].method6143(var8 + 15, 4);
                } else {
                    class10.field81[1].method6143(var8 + 15, 4);
                }

                var0.method5846("Type", var8 + 32, 17, 16777215, -1);
            }

            class319.method6047(class79.field1143 + 708, 4, 50, 16, 0);
            var1.method5880("Cancel", class79.field1143 + 708 + 25, 16, 16777215, -1);
            class79.field1164 = -1;
            if (class78.field1137 != null) {
                var23 = 88;
                byte var45 = 19;
                var33 = 765 / (var23 + 1);
                var8 = 480 / (var45 + 1);

                do {
                    var27 = var8;
                    var35 = var33;
                    if (var8 * (var33 - 1) >= class66.field1013) {
                        --var33;
                    }

                    if (var33 * (var8 - 1) >= class66.field1013) {
                        --var8;
                    }

                    if (var33 * (var8 - 1) >= class66.field1013) {
                        --var8;
                    }
                } while (var27 != var8 || var35 != var33);

                var27 = (765 - var33 * var23) / (var33 + 1);
                if (var27 > 5) {
                    var27 = 5;
                }

                var35 = (480 - var45 * var8) / (var8 + 1);
                if (var35 > 5) {
                    var35 = 5;
                }

                var36 = (765 - var23 * var33 - var27 * (var33 - 1)) / 2;
                var37 = (480 - var45 * var8 - var35 * (var8 - 1)) / 2;
                var13 = var37 + 23;
                var14 = var36 + class79.field1143;
                var39 = 0;
                var16 = false;

                for (var17 = 0; var17 < class66.field1013; ++var17) {
                    class66 var18 = class66.field1017[var17];
                    boolean var19 = true;
                    String var20 = Integer.toString(var18.field1020);
                    if (var18.field1020 == -1) {
                        var20 = "OFF";
                        var19 = false;
                    } else if (var18.field1020 > 1980) {
                        var20 = "FULL";
                        var19 = false;
                    }

                    int var22 = 0;
                    byte var21;
                    if (var18.method1686(-1365937152)) {
                        if (var18.method1684(-1158560872)) {
                            var21 = 7;
                        } else {
                            var21 = 6;
                        }
                    } else if (var18.method1689(1605624169)) {
                        var22 = 16711680;
                        if (var18.method1684(-1158560872)) {
                            var21 = 5;
                        } else {
                            var21 = 4;
                        }
                    } else if (var18.method1687((byte) -96)) {
                        if (var18.method1684(-1158560872)) {
                            var21 = 3;
                        } else {
                            var21 = 2;
                        }
                    } else if (var18.method1684(-1158560872)) {
                        var21 = 1;
                    } else {
                        var21 = 0;
                    }

                    if (class48.field473 >= var14 && class48.field464 * -976212263 >= var13
                        && class48.field473 < var23 + var14
                        && class48.field464 * -976212263 < var45 + var13 && var19) {
                        class79.field1164 = var17;
                        class78.field1137[var21].method6199(var14, var13, 128, 16777215);
                        var16 = true;
                    } else {
                        class78.field1137[var21].method6184(var14, var13);
                    }

                    if (BufferedFile.field1490 != null) {
                        BufferedFile.field1490[(var18.method1684(-1158560872) ? 8 : 0)
                            + var18.field1021].method6143(var14 + 29, var13);
                    }

                    var0.method5880(Integer.toString(var18.field1015), var14 + 15,
                                    var45 / 2 + var13 + 5, var22, -1);
                    var1.method5880(var20, var14 + 60, var45 / 2 + var13 + 5, 268435455, -1);
                    var13 = var13 + var35 + var45;
                    ++var39;
                    if (var39 >= var8) {
                        var13 = var37 + 23;
                        var14 = var14 + var23 + var27;
                        var39 = 0;
                    }
                }

                if (var16) {
                    var17 = var1.method5793(class66.field1017[class79.field1164].field1022) + 6;
                    int var44 = var1.field3765 + 8;
                    class319.method6047(class48.field473 - var17 / 2,
                                        class48.field464 * -976212263 + 20 + 5, var17, var44,
                                        16777120);
                    class319.method6116(class48.field473 - var17 / 2,
                                        class48.field464 * -976212263 + 20 + 5, var17, var44, 0);
                    var1.method5880(class66.field1017[class79.field1164].field1022,
                                    class48.field473,
                                    class48.field464 * -976212263 + var1.field3765 + 20 + 5 + 4, 0,
                                    -1);
                }
            }

            class30.field313.vmethod6120(0, 0, 1929102086);
        } else {
            if (var3) {
                class79.field1145.method6184(class79.field1143, 0);
                class79.field1146.method6184(class79.field1143 + 382, 0);
                class265.field3401
                    .method6143(class79.field1143 + 382 - class265.field3401.field3872 / 2, 18);
            }

            if (client.state == 0 || client.state == 5) {
                var23 = 20;
                var0.method5880("RuneScape is loading - please wait...", class79.field1144 + 180,
                                245 - var23, 16777215, -1);
                var24 = 253 - var23;
                class319.method6116(class79.field1144 + 180 - 152, var24, 304, 34, 9179409);
                class319.method6116(class79.field1144 + 180 - 151, var24 + 1, 302, 32, 0);
                class319
                    .method6047(class79.field1144 + 180 - 150, var24 + 2, class79.field1158 * 3, 30,
                                9179409);
                class319
                    .method6047(class79.field1158 * 3 + (class79.field1144 + 180 - 150), var24 + 2,
                                300 - class79.field1158 * 3, 30, 0);
                var0.method5880(class79.field1159, class79.field1144 + 180, 276 - var23, 16777215,
                                -1);
            }

            String var25;
            String var26;
            short var40;
            short var42;
            if (client.state == 20) {
                class79.field1149
                    .method6143(class79.field1144 + 180 - class79.field1149.field3872 / 2,
                                271 - class79.field1149.field3873 / 2);
                var40 = 201;
                var0.method5880(class79.field1165, class79.field1144 + 180, var40, 16776960, 0);
                var41 = var40 + 15;
                var0.method5880(class79.field1166, class79.field1144 + 180, var41, 16776960, 0);
                var41 += 15;
                var0.method5880(class79.field1167, class79.field1144 + 180, var41, 16776960, 0);
                var41 += 15;
                var41 += 7;
                if (class79.field1163 != 4) {
                    var0.method5846("Login: ", class79.field1144 + 180 - 110, var41, 16777215, 0);
                    var42 = 200;
                    var25 = GameApplet.field435.field1033 ? class247
                        .method4822(class79.username, (byte) 57) : class79.username;

                    for (var26 = var25; var0.method5793(var26) > var42;
                         var26 = var26.substring(0, var26.length() - 1)) {
                        ;
                    }

                    var0.method5846(class301.method5797(var26), class79.field1144 + 180 - 70, var41,
                                    16777215, 0);
                    var41 += 15;
                    var0.method5846(
                        "Password: " + class247.method4822(class79.password, (byte) 127),
                        class79.field1144 + 180 - 108, var41, 16777215, 0);
                    var41 += 15;
                }
            }

            if (client.state == 10 || client.state == 11) {
                class79.field1149.method6143(class79.field1144, 171);
                short var7;
                if (class79.field1163 == 0) {
                    var40 = 251;
                    var0.method5880("Welcome to RuneScape", class79.field1144 + 180, var40,
                                    16776960, 0);
                    var41 = var40 + 30;
                    var24 = class79.field1144 + 180 - 80;
                    var7 = 291;
                    class307.field3801.method6143(var24 - 73, var7 - 20);
                    var0.method5792("New User", var24 - 73, var7 - 20, 144, 40, 16777215, 0, 1, 1,
                                    0);
                    var24 = class79.field1144 + 180 + 80;
                    class307.field3801.method6143(var24 - 73, var7 - 20);
                    var0.method5792("Existing User", var24 - 73, var7 - 20, 144, 40, 16777215, 0, 1,
                                    1, 0);
                } else if (class79.field1163 == 1) {
                    var0.method5880(class79.field1168, class79.field1144 + 180, 201, 16776960, 0);
                    var40 = 236;
                    var0.method5880(class79.field1165, class79.field1144 + 180, var40, 16777215, 0);
                    var41 = var40 + 15;
                    var0.method5880(class79.field1166, class79.field1144 + 180, var41, 16777215, 0);
                    var41 += 15;
                    var0.method5880(class79.field1167, class79.field1144 + 180, var41, 16777215, 0);
                    var41 += 15;
                    var24 = class79.field1144 + 180 - 80;
                    var7 = 321;
                    class307.field3801.method6143(var24 - 73, var7 - 20);
                    var0.method5880("Continue", var24, var7 + 5, 16777215, 0);
                    var24 = class79.field1144 + 180 + 80;
                    class307.field3801.method6143(var24 - 73, var7 - 20);
                    var0.method5880("Cancel", var24, var7 + 5, 16777215, 0);
                } else if (class79.field1163 == 2) {
                    var40 = 201;
                    var0.method5880(class79.field1165, class13.field103, var40, 16776960, 0);
                    var41 = var40 + 15;
                    var0.method5880(class79.field1166, class13.field103, var41, 16776960, 0);
                    var41 += 15;
                    var0.method5880(class79.field1167, class13.field103, var41, 16776960, 0);
                    var41 += 15;
                    var41 += 7;
                    var0.method5846("Login: ", class13.field103 - 110, var41, 16777215, 0);
                    var42 = 200;
                    var25 = GameApplet.field435.field1033 ? class247
                        .method4822(class79.username, (byte) 51) : class79.username;

                    for (var26 = var25; var0.method5793(var26) > var42;
                         var26 = var26.substring(1)) {
                        ;
                    }

                    var0.method5846(class301.method5797(var26) + (
                                        class79.field1150 == 0 & client.field655 % 40 < 20 ?
                                            class128.method3233(16776960, 1527763809) + "|" : ""),
                                    class13.field103 - 70, var41, 16777215, 0);
                    var41 += 15;
                    var0.method5846(
                        "Password: " + class247.method4822(class79.password, (byte) 95) + (
                            class79.field1150 == 1 & client.field655 % 40 < 20 ?
                                class128.method3233(16776960, 1735372625) + "|" : ""),
                        class13.field103 - 108, var41, 16777215, 0);
                    var41 += 15;
                    var40 = 277;
                    var27 = class13.field103 + -117;
                    boolean var11 = client.field746;
                    boolean var12 = class79.field1170;
                    class322 var29 = var11 ? (var12 ? class138.field1925 : class132.field1861)
                        : (var12 ? class79.field1148 : class185.field2417);
                    var29.method6143(var27, var40);
                    var27 = var27 + var29.field3872 + 5;
                    var1.method5846("Remember username", var27, var40 + 13, 16776960, 0);
                    var27 = class13.field103 + 24;
                    boolean var15 = GameApplet.field435.field1033;
                    var16 = class79.field1171;
                    class322 var31 = var15 ? (var16 ? class138.field1925 : class132.field1861)
                        : (var16 ? class79.field1148 : class185.field2417);
                    var31.method6143(var27, var40);
                    var27 = var27 + var31.field3872 + 5;
                    var1.method5846("Hide username", var27, var40 + 13, 16776960, 0);
                    var41 = var40 + 15;
                    var17 = class13.field103 - 80;
                    short var28 = 321;
                    class307.field3801.method6143(var17 - 73, var28 - 20);
                    var0.method5880("Login", var17, var28 + 5, 16777215, 0);
                    var17 = class13.field103 + 80;
                    class307.field3801.method6143(var17 - 73, var28 - 20);
                    var0.method5880("Cancel", var17, var28 + 5, 16777215, 0);
                    var40 = 357;
                    switch (class79.field1161) {
                        case 2:
                            class226.field2624 = "Having trouble logging in?";
                            break;
                        default:
                            class226.field2624 = "Forgotten your password? <col=ffffff>Click here.";
                    }

                    class79.field1177 = new class315(class13.field103, var40,
                                                     var1.method5793(class226.field2624), 11);
                    var1.method5880(class226.field2624, class13.field103, var40, 16777215, 0);
                } else if (class79.field1163 == 3) {
                    var40 = 201;
                    var0.method5880("Invalid username or password.", class79.field1144 + 180, var40,
                                    16776960, 0);
                    var41 = var40 + 20;
                    var1.method5880(
                        "For accounts created after 24th November 2010, please use your",
                        class79.field1144 + 180, var41, 16776960, 0);
                    var41 += 15;
                    var1.method5880(
                        "email address to login. Otherwise please login with your username.",
                        class79.field1144 + 180, var41, 16776960, 0);
                    var41 += 15;
                    var24 = class79.field1144 + 180;
                    var7 = 276;
                    class307.field3801.method6143(var24 - 73, var7 - 20);
                    var2.method5880("Try again", var24, var7 + 5, 16777215, 0);
                    var24 = class79.field1144 + 180;
                    var7 = 326;
                    class307.field3801.method6143(var24 - 73, var7 - 20);
                    var2.method5880("Forgotten password?", var24, var7 + 5, 16777215, 0);
                } else {
                    short var10;
                    if (class79.field1163 == 4) {
                        var0.method5880("Authenticator", class79.field1144 + 180, 201, 16776960, 0);
                        var40 = 236;
                        var0.method5880(class79.field1165, class79.field1144 + 180, var40, 16777215,
                                        0);
                        var41 = var40 + 15;
                        var0.method5880(class79.field1166, class79.field1144 + 180, var41, 16777215,
                                        0);
                        var41 += 15;
                        var0.method5880(class79.field1167, class79.field1144 + 180, var41, 16777215,
                                        0);
                        var41 += 15;
                        var0.method5846(
                            "PIN: " + class247.method4822(class10.field82, (byte) 93) + (
                                client.field655 % 40 < 20 ?
                                    class128.method3233(16776960, 1704134812) + "|" : ""),
                            class79.field1144 + 180 - 108, var41, 16777215, 0);
                        var41 -= 8;
                        var0.method5846("Trust this computer", class79.field1144 + 180 - 9, var41,
                                        16776960, 0);
                        var41 += 15;
                        var0.method5846("for 30 days: ", class79.field1144 + 180 - 9, var41,
                                        16776960, 0);
                        var24 = class79.field1144 + 180 - 9 + var0.method5793("for 30 days: ") + 15;
                        var33 = var41 - var0.field3765;
                        class322 var43;
                        if (class79.field1172) {
                            var43 = class132.field1861;
                        } else {
                            var43 = class185.field2417;
                        }

                        var43.method6143(var24, var33);
                        var41 += 15;
                        var27 = class79.field1144 + 180 - 80;
                        var10 = 321;
                        class307.field3801.method6143(var27 - 73, var10 - 20);
                        var0.method5880("Continue", var27, var10 + 5, 16777215, 0);
                        var27 = class79.field1144 + 180 + 80;
                        class307.field3801.method6143(var27 - 73, var10 - 20);
                        var0.method5880("Cancel", var27, var10 + 5, 16777215, 0);
                        var1.method5880("<u=ff>Can\'t Log In?</u>", class79.field1144 + 180,
                                        var10 + 36, 255, 0);
                    } else if (class79.field1163 == 5) {
                        var0.method5880("Forgotten your password?", class79.field1144 + 180, 201,
                                        16776960, 0);
                        var40 = 221;
                        var2.method5880(class79.field1165, class79.field1144 + 180, var40, 16776960,
                                        0);
                        var41 = var40 + 15;
                        var2.method5880(class79.field1166, class79.field1144 + 180, var41, 16776960,
                                        0);
                        var41 += 15;
                        var2.method5880(class79.field1167, class79.field1144 + 180, var41, 16776960,
                                        0);
                        var41 += 15;
                        var41 += 14;
                        var0.method5846("Username/email: ", class79.field1144 + 180 - 145, var41,
                                        16777215, 0);
                        var42 = 174;
                        var25 = GameApplet.field435.field1033 ? class247
                            .method4822(class79.username, (byte) 61) : class79.username;

                        for (var26 = var25; var0.method5793(var26) > var42;
                             var26 = var26.substring(1)) {
                            ;
                        }

                        var0.method5846(class301.method5797(var26) + (client.field655 % 40 < 20 ?
                                            class128.method3233(16776960, 398020236) + "|" : ""),
                                        class79.field1144 + 180 - 34, var41, 16777215, 0);
                        var41 += 15;
                        var27 = class79.field1144 + 180 - 80;
                        var10 = 321;
                        class307.field3801.method6143(var27 - 73, var10 - 20);
                        var0.method5880("Recover", var27, var10 + 5, 16777215, 0);
                        var27 = class79.field1144 + 180 + 80;
                        class307.field3801.method6143(var27 - 73, var10 - 20);
                        var0.method5880("Back", var27, var10 + 5, 16777215, 0);
                    } else if (class79.field1163 == 6) {
                        var40 = 201;
                        var0.method5880(class79.field1165, class79.field1144 + 180, var40, 16776960,
                                        0);
                        var41 = var40 + 15;
                        var0.method5880(class79.field1166, class79.field1144 + 180, var41, 16776960,
                                        0);
                        var41 += 15;
                        var0.method5880(class79.field1167, class79.field1144 + 180, var41, 16776960,
                                        0);
                        var41 += 15;
                        var24 = class79.field1144 + 180;
                        var7 = 321;
                        class307.field3801.method6143(var24 - 73, var7 - 20);
                        var0.method5880("Back", var24, var7 + 5, 16777215, 0);
                    } else if (class79.field1163 == 7) {
                        var40 = 216;
                        var0.method5880("Your date of birth isn\'t set.", class79.field1144 + 180,
                                        var40, 16776960, 0);
                        var41 = var40 + 15;
                        var2.method5880("Please verify your account status by",
                                        class79.field1144 + 180, var41, 16776960, 0);
                        var41 += 15;
                        var2.method5880("setting your date of birth.", class79.field1144 + 180,
                                        var41, 16776960, 0);
                        var41 += 15;
                        var24 = class79.field1144 + 180 - 80;
                        var7 = 321;
                        class307.field3801.method6143(var24 - 73, var7 - 20);
                        var0.method5880("Set Date of Birth", var24, var7 + 5, 16777215, 0);
                        var24 = class79.field1144 + 180 + 80;
                        class307.field3801.method6143(var24 - 73, var7 - 20);
                        var0.method5880("Back", var24, var7 + 5, 16777215, 0);
                    } else if (class79.field1163 == 8) {
                        var40 = 216;
                        var0.method5880("Sorry, but your account is not eligible to play.",
                                        class79.field1144 + 180, var40, 16776960, 0);
                        var41 = var40 + 15;
                        var2.method5880("For more information, please take a look at",
                                        class79.field1144 + 180, var41, 16776960, 0);
                        var41 += 15;
                        var2.method5880("our privacy policy.", class79.field1144 + 180, var41,
                                        16776960, 0);
                        var41 += 15;
                        var24 = class79.field1144 + 180 - 80;
                        var7 = 321;
                        class307.field3801.method6143(var24 - 73, var7 - 20);
                        var0.method5880("Privacy Policy", var24, var7 + 5, 16777215, 0);
                        var24 = class79.field1144 + 180 + 80;
                        class307.field3801.method6143(var24 - 73, var7 - 20);
                        var0.method5880("Back", var24, var7 + 5, 16777215, 0);
                    } else if (class79.field1163 == 12) {
                        var40 = 201;
                        String var6 = "";
                        var25 = "";
                        var26 = "";
                        switch (class79.field1142) {
                            case 0:
                                var6 = "Your account has been disabled.";
                                var25 = class239.field2909;
                                var26 = "";
                                break;
                            case 1:
                                var6 = "Account locked as we suspect it has been stolen.";
                                var25 = class239.field2948;
                                var26 = "";
                                break;
                            default:
                                class49.method1024(false, 608178305);
                        }

                        var0.method5880(var6, class79.field1144 + 180, var40, 16776960, 0);
                        var41 = var40 + 15;
                        var2.method5880(var25, class79.field1144 + 180, var41, 16776960, 0);
                        var41 += 15;
                        var2.method5880(var26, class79.field1144 + 180, var41, 16776960, 0);
                        var41 += 15;
                        var27 = class79.field1144 + 180;
                        var10 = 276;
                        class307.field3801.method6143(var27 - 73, var10 - 20);
                        var0.method5880("Support Page", var27, var10 + 5, 16777215, 0);
                        var27 = class79.field1144 + 180;
                        var10 = 326;
                        class307.field3801.method6143(var27 - 73, var10 - 20);
                        var0.method5880("Back", var27, var10 + 5, 16777215, 0);
                    }
                }
            }

            if (class79.field1156 > 0) {
                var41 = class79.field1156;
                var42 = 256;
                class79.field1160 += var41 * 128;
                if (class79.field1160 > class62.field640.length) {
                    class79.field1160 -= class62.field640.length;
                    var33 = (int) (Math.random() * 12.0D);
                    class278.method5494(class6.field44[var33], 1227975411);
                }

                var33 = 0;
                var8 = var41 * 128;
                var27 = (var42 - var41) * 128;

                for (var35 = 0; var35 < var27; ++var35) {
                    var36 = class19.field182[var8 + var33] -
                        class62.field640[var33 + class79.field1160 & class62.field640.length - 1]
                            * var41 / 6;
                    if (var36 < 0) {
                        var36 = 0;
                    }

                    class19.field182[var33++] = var36;
                }

                for (var35 = var42 - var41; var35 < var42; ++var35) {
                    var36 = var35 * 128;

                    for (var37 = 0; var37 < 128; ++var37) {
                        var13 = (int) (Math.random() * 100.0D);
                        if (var13 < 50 && var37 > 10 && var37 < 118) {
                            class19.field182[var37 + var36] = 255;
                        } else {
                            class19.field182[var36 + var37] = 0;
                        }
                    }
                }

                if (class79.field1152 > 0) {
                    class79.field1152 -= var41 * 4;
                }

                if (class79.field1153 > 0) {
                    class79.field1153 -= var41 * 4;
                }

                if (class79.field1152 == 0 && class79.field1153 == 0) {
                    var35 = (int) (Math.random() * (double) (2000 / var41));
                    if (var35 == 0) {
                        class79.field1152 = 1024;
                    }

                    if (var35 == 1) {
                        class79.field1153 = 1024;
                    }
                }

                for (var35 = 0; var35 < var42 - var41; ++var35) {
                    class79.field1162[var35] = class79.field1162[var35 + var41];
                }

                for (var35 = var42 - var41; var35 < var42; ++var35) {
                    class79.field1162[var35] = (int) (
                        Math.sin((double) class79.field1157 / 14.0D) * 16.0D
                            + Math.sin((double) class79.field1157 / 15.0D) * 14.0D
                            + Math.sin((double) class79.field1157 / 16.0D) * 12.0D);
                    ++class79.field1157;
                }

                class79.field1173 += var41;
                var35 = (var41 + (client.field655 & 1)) / 2;
                if (var35 > 0) {
                    for (var36 = 0; var36 < class79.field1173 * 100; ++var36) {
                        var37 = (int) (Math.random() * 124.0D) + 2;
                        var13 = (int) (Math.random() * 128.0D) + 128;
                        class19.field182[var37 + (var13 << 7)] = 192;
                    }

                    class79.field1173 = 0;
                    var36 = 0;

                    label744:
                    while (true) {
                        if (var36 >= var42) {
                            var36 = 0;

                            while (true) {
                                if (var36 >= 128) {
                                    break label744;
                                }

                                var37 = 0;

                                for (var13 = -var35; var13 < var42; ++var13) {
                                    var14 = var13 * 128;
                                    if (var35 + var13 < var42) {
                                        var37 += class19.field183[var36 + var14 + var35 * 128];
                                    }

                                    if (var13 - (var35 + 1) >= 0) {
                                        var37 -= class19.field183[var14 + var36
                                            - (var35 + 1) * 128];
                                    }

                                    if (var13 >= 0) {
                                        class19.field182[var36 + var14] = var37 / (var35 * 2 + 1);
                                    }
                                }

                                ++var36;
                            }
                        }

                        var37 = 0;
                        var13 = var36 * 128;

                        for (var14 = -var35; var14 < 128; ++var14) {
                            if (var35 + var14 < 128) {
                                var37 += class19.field182[var14 + var13 + var35];
                            }

                            if (var14 - (var35 + 1) >= 0) {
                                var37 -= class19.field182[var13 + var14 - (var35 + 1)];
                            }

                            if (var14 >= 0) {
                                class19.field183[var14 + var13] = var37 / (var35 * 2 + 1);
                            }
                        }

                        ++var36;
                    }
                }

                class79.field1156 = 0;
            }

            var40 = 256;
            if (class79.field1152 > 0) {
                for (var24 = 0; var24 < 256; ++var24) {
                    if (class79.field1152 > 768) {
                        class69.field1047[var24] = class79
                            .method2040(class79.field1151[var24], class58.field583[var24],
                                        1024 - class79.field1152, -747992457);
                    } else if (class79.field1152 > 256) {
                        class69.field1047[var24] = class58.field583[var24];
                    } else {
                        class69.field1047[var24] = class79
                            .method2040(class58.field583[var24], class79.field1151[var24],
                                        256 - class79.field1152, -747992457);
                    }
                }
            } else if (class79.field1153 > 0) {
                for (var24 = 0; var24 < 256; ++var24) {
                    if (class79.field1153 > 768) {
                        class69.field1047[var24] = class79
                            .method2040(class79.field1151[var24], class161.field2048[var24],
                                        1024 - class79.field1153, -747992457);
                    } else if (class79.field1153 > 256) {
                        class69.field1047[var24] = class161.field2048[var24];
                    } else {
                        class69.field1047[var24] = class79
                            .method2040(class161.field2048[var24], class79.field1151[var24],
                                        256 - class79.field1153, -747992457);
                    }
                }
            } else {
                for (var24 = 0; var24 < 256; ++var24) {
                    class69.field1047[var24] = class79.field1151[var24];
                }
            }

            class319.method6067(class79.field1143, 9, class79.field1143 + 128, var40 + 7);
            class79.field1145.method6184(class79.field1143, 0);
            class319.method6037();
            var24 = 0;
            var33 = class30.field313.field3864 * 9 + class79.field1143;

            for (var8 = 1; var8 < var40 - 1; ++var8) {
                var27 = class79.field1162[var8] * (var40 - var8) / var40;
                var35 = var27 + 22;
                if (var35 < 0) {
                    var35 = 0;
                }

                var24 += var35;

                for (var36 = var35; var36 < 128; ++var36) {
                    var37 = class19.field182[var24++];
                    if (var37 != 0) {
                        var13 = var37;
                        var14 = 256 - var37;
                        var37 = class69.field1047[var37];
                        var39 = class30.field313.field3862[var33];
                        class30.field313.field3862[var33++] =
                            ((var37 & 16711935) * var13 + (var39 & 16711935) * var14 & -16711936)
                                + (var14 * (var39 & 65280) + var13 * (var37 & 65280) & 16711680)
                                >> 8;
                    } else {
                        ++var33;
                    }
                }

                var33 += var35 + class30.field313.field3864 - 128;
            }

            class319
                .method6067(class79.field1143 + 765 - 128, 9, class79.field1143 + 765, var40 + 7);
            class79.field1146.method6184(class79.field1143 + 382, 0);
            class319.method6037();
            var24 = 0;
            var33 = class30.field313.field3864 * 9 + class79.field1143 + 637 + 24;

            for (var8 = 1; var8 < var40 - 1; ++var8) {
                var27 = class79.field1162[var8] * (var40 - var8) / var40;
                var35 = 103 - var27;
                var33 += var27;

                for (var36 = 0; var36 < var35; ++var36) {
                    var37 = class19.field182[var24++];
                    if (var37 != 0) {
                        var13 = var37;
                        var14 = 256 - var37;
                        var37 = class69.field1047[var37];
                        var39 = class30.field313.field3862[var33];
                        class30.field313.field3862[var33++] =
                            (var14 * (var39 & 65280) + var13 * (var37 & 65280) & 16711680) + (
                                (var39 & 16711935) * var14 + (var37 & 16711935) * var13 & -16711936)
                                >> 8;
                    } else {
                        ++var33;
                    }
                }

                var24 += 128 - var35;
                var33 += class30.field313.field3864 - var35 - var27;
            }

            class79.field1147[GameApplet.field435.field1035 ? 1 : 0]
                .method6143(class79.field1143 + 765 - 40, 463);
            if (client.state > 5 && client.field785 == 0) {
                if (class10.field77 != null) {
                    var41 = class79.field1143 + 5;
                    var42 = 463;
                    byte var38 = 100;
                    byte var34 = 35;
                    class10.field77.method6143(var41, var42);
                    var0.method5880("World" + " " + client.field691, var38 / 2 + var41,
                                    var34 / 2 + var42 - 2, 16777215, 0);
                    if (class66.field1010 != null) {
                        var1.method5880("Loading...", var38 / 2 + var41, var34 / 2 + var42 + 12,
                                        16777215, 0);
                    } else {
                        var1.method5880("Click to switch", var38 / 2 + var41,
                                        var34 / 2 + var42 + 12, 16777215, 0);
                    }
                } else {
                    class10.field77 = class257
                        .method5047(class154.index8, "sl_button", "", 1918616421);
                }
            }

        }
    }

    public static void method3268(class249 var0, int var1) {
        class267.field3411 = var0;
    }

    static final void method3269(int var0, int var1, int var2, int var3, int var4, int var5) {
        long var6 = class243.field3173.method3083(var0, var1, var2);
        int var8;
        int var9;
        int var10;
        int var11;
        int var13;
        int var14;
        if (0L != var6) {
            var8 = class243.field3173.method3087(var0, var1, var2, var6);
            var9 = var8 >> 6 & 3;
            var10 = var8 & 31;
            var11 = var3;
            if (class19.method244(var6)) {
                var11 = var4;
            }

            int[] var12 = class3.field29.field3889;
            var13 = var1 * 4 + (103 - var2) * 2048 + 24624;
            var14 = class56.method1110(var6);
            class270 var15 = class253.method4993(var14, (byte) 44);
            if (var15.field3466 != -1) {
                class322 var16 = class278.field3642[var15.field3466];
                if (var16 != null) {
                    int var17 = (var15.field3501 * 4 - var16.field3872) / 2;
                    int var18 = (var15.field3475 * 4 - var16.field3873) / 2;
                    var16.method6143(var17 + var1 * 4 + 48,
                                     (104 - var2 - var15.field3475) * 4 + var18 + 48);
                }
            } else {
                if (var10 == 0 || var10 == 2) {
                    if (var9 == 0) {
                        var12[var13] = var11;
                        var12[var13 + 512] = var11;
                        var12[var13 + 1024] = var11;
                        var12[var13 + 1536] = var11;
                    } else if (var9 == 1) {
                        var12[var13] = var11;
                        var12[var13 + 1] = var11;
                        var12[var13 + 2] = var11;
                        var12[var13 + 3] = var11;
                    } else if (var9 == 2) {
                        var12[var13 + 3] = var11;
                        var12[var13 + 512 + 3] = var11;
                        var12[var13 + 1024 + 3] = var11;
                        var12[var13 + 1536 + 3] = var11;
                    } else if (var9 == 3) {
                        var12[var13 + 1536] = var11;
                        var12[var13 + 1536 + 1] = var11;
                        var12[var13 + 1536 + 2] = var11;
                        var12[var13 + 1536 + 3] = var11;
                    }
                }

                if (var10 == 3) {
                    if (var9 == 0) {
                        var12[var13] = var11;
                    } else if (var9 == 1) {
                        var12[var13 + 3] = var11;
                    } else if (var9 == 2) {
                        var12[var13 + 1536 + 3] = var11;
                    } else if (var9 == 3) {
                        var12[var13 + 1536] = var11;
                    }
                }

                if (var10 == 2) {
                    if (var9 == 3) {
                        var12[var13] = var11;
                        var12[var13 + 512] = var11;
                        var12[var13 + 1024] = var11;
                        var12[var13 + 1536] = var11;
                    } else if (var9 == 0) {
                        var12[var13] = var11;
                        var12[var13 + 1] = var11;
                        var12[var13 + 2] = var11;
                        var12[var13 + 3] = var11;
                    } else if (var9 == 1) {
                        var12[var13 + 3] = var11;
                        var12[var13 + 512 + 3] = var11;
                        var12[var13 + 1024 + 3] = var11;
                        var12[var13 + 1536 + 3] = var11;
                    } else if (var9 == 2) {
                        var12[var13 + 1536] = var11;
                        var12[var13 + 1536 + 1] = var11;
                        var12[var13 + 1536 + 2] = var11;
                        var12[var13 + 1536 + 3] = var11;
                    }
                }
            }
        }

        var6 = class243.field3173.method3085(var0, var1, var2);
        if (var6 != 0L) {
            var8 = class243.field3173.method3087(var0, var1, var2, var6);
            var9 = var8 >> 6 & 3;
            var10 = var8 & 31;
            var11 = class56.method1110(var6);
            class270 var25 = class253.method4993(var11, (byte) -56);
            int var20;
            if (var25.field3466 != -1) {
                class322 var19 = class278.field3642[var25.field3466];
                if (var19 != null) {
                    var14 = (var25.field3501 * 4 - var19.field3872) / 2;
                    var20 = (var25.field3475 * 4 - var19.field3873) / 2;
                    var19.method6143(var14 + var1 * 4 + 48,
                                     var20 + (104 - var2 - var25.field3475) * 4 + 48);
                }
            } else if (var10 == 9) {
                var13 = 15658734;
                if (class19.method244(var6)) {
                    var13 = 15597568;
                }

                int[] var24 = class3.field29.field3889;
                var20 = var1 * 4 + (103 - var2) * 2048 + 24624;
                if (var9 != 0 && var9 != 2) {
                    var24[var20] = var13;
                    var24[var20 + 1 + 512] = var13;
                    var24[var20 + 1024 + 2] = var13;
                    var24[var20 + 1536 + 3] = var13;
                } else {
                    var24[var20 + 1536] = var13;
                    var24[var20 + 1 + 1024] = var13;
                    var24[var20 + 512 + 2] = var13;
                    var24[var20 + 3] = var13;
                }
            }
        }

        var6 = class243.field3173.method3182(var0, var1, var2);
        if (var6 != 0L) {
            var8 = class56.method1110(var6);
            class270 var21 = class253.method4993(var8, (byte) -7);
            if (var21.field3466 != -1) {
                class322 var22 = class278.field3642[var21.field3466];
                if (var22 != null) {
                    var11 = (var21.field3501 * 4 - var22.field3872) / 2;
                    int var23 = (var21.field3475 * 4 - var22.field3873) / 2;
                    var22.method6143(var1 * 4 + var11 + 48,
                                     var23 + (104 - var2 - var21.field3475) * 4 + 48);
                }
            }
        }

    }

    public static class321[] method3271(int var0) {
        return new class321[]{class321.field3865, class321.field3866, class321.field3867};
    }
}
