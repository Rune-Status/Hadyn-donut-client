package jagex.osrs;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class class67 {

    public static class91 field1036;
    static int field1030;
    static int field1027;

    static {
        field1030 = 6;
    }

    int field1031;
    String field1034;
    boolean field1029;
    boolean field1033;
    LinkedHashMap field1028;
    boolean field1035;

    class67() {
        this.field1031 = 1;
        this.field1034 = null;
        this.field1033 = false;
        this.field1028 = new LinkedHashMap();
        this.method1739(true, (byte) 54);
    }

    class67(Buffer var1) {
        this.field1031 = 1;
        this.field1034 = null;
        this.field1033 = false;
        this.field1028 = new LinkedHashMap();
        if (var1 != null && var1.bytes != null) {
            int var2 = var1.readUint8();
            if (var2 >= 0 && var2 <= field1030) {
                if (var1.readUint8() == 1) {
                    this.field1029 = true;
                }

                if (var2 > 1) {
                    this.field1035 = var1.readUint8() == 1;
                }

                if (var2 > 3) {
                    this.field1031 = var1.readUint8();
                }

                if (var2 > 2) {
                    int var3 = var1.readUint8();

                    for (int var4 = 0; var4 < var3; ++var4) {
                        int var5 = var1.getInt();
                        int var6 = var1.getInt();
                        this.field1028.put(Integer.valueOf(var5), Integer.valueOf(var6));
                    }
                }

                if (var2 > 4) {
                    this.field1034 = var1.method3777(1414776804);
                }

                if (var2 > 5) {
                    this.field1033 = var1.method3776((byte) -43);
                }
            } else {
                this.method1739(true, (byte) 88);
            }
        } else {
            this.method1739(true, (byte) 55);
        }

    }

    public static boolean method1749(byte var0) {
        class317 var1 = (class317) class318.field3852.method4250();
        return var1 != null;
    }

    static final void method1748(PacketBuffer var0, int var1, int var2) {
        int var3 = var0.offset;
        class83.field1227 = 0;
        class10.method115(var0, 274930270);
        class153.method3412(var0, -1494980532);
        if (var0.offset - var3 != var1) {
            throw new RuntimeException(var0.offset - var3 + " " + var1);
        }
    }

    static void method1745(GameApplet var0, int var1) {
        int var5;
        if (class79.field1176) {
            if (class48.field477 == 1 || !class14.field132 && class48.field477 == 4) {
                int var2 = class79.field1143 + 280;
                if (class48.field478 >= var2 && class48.field478 <= var2 + 14
                    && class48.field467 >= 4 && class48.field467 <= 18) {
                    class45.method818(0, 0, 613916939);
                } else if (class48.field478 >= var2 + 15 && class48.field478 <= var2 + 80
                    && class48.field467 >= 4 && class48.field467 <= 18) {
                    class45.method818(0, 1, 613916939);
                } else {
                    int var3 = class79.field1143 + 390;
                    if (class48.field478 >= var3 && class48.field478 <= var3 + 14
                        && class48.field467 >= 4 && class48.field467 <= 18) {
                        class45.method818(1, 0, 613916939);
                    } else if (class48.field478 >= var3 + 15 && class48.field478 <= var3 + 80
                        && class48.field467 >= 4 && class48.field467 <= 18) {
                        class45.method818(1, 1, 613916939);
                    } else {
                        int var18 = class79.field1143 + 500;
                        if (class48.field478 >= var18 && class48.field478 <= var18 + 14
                            && class48.field467 >= 4 && class48.field467 <= 18) {
                            class45.method818(2, 0, 613916939);
                        } else if (class48.field478 >= var18 + 15 && class48.field478 <= var18 + 80
                            && class48.field467 >= 4 && class48.field467 <= 18) {
                            class45.method818(2, 1, 613916939);
                        } else {
                            var5 = class79.field1143 + 610;
                            if (class48.field478 >= var5 && class48.field478 <= var5 + 14
                                && class48.field467 >= 4 && class48.field467 <= 18) {
                                class45.method818(3, 0, 613916939);
                            } else if (class48.field478 >= var5 + 15
                                && class48.field478 <= var5 + 80 && class48.field467 >= 4
                                && class48.field467 <= 18) {
                                class45.method818(3, 1, 613916939);
                            } else if (class48.field478 >= class79.field1143 + 708
                                && class48.field467 >= 4
                                && class48.field478 <= class79.field1143 + 708 + 50
                                && class48.field467 <= 20) {
                                class79.field1176 = false;
                                class79.field1145.method6184(class79.field1143, 0);
                                class79.field1146.method6184(class79.field1143 + 382, 0);
                                class265.field3401.method6143(
                                    class79.field1143 + 382 - class265.field3401.field3872 / 2, 18);
                            } else if (class79.field1164 != -1) {
                                class66 var6 = class66.field1017[class79.field1164];
                                class138.method3292(var6, -555531433);
                                class79.field1176 = false;
                                class79.field1145.method6184(class79.field1143, 0);
                                class79.field1146.method6184(class79.field1143 + 382, 0);
                                class265.field3401.method6143(
                                    class79.field1143 + 382 - class265.field3401.field3872 / 2, 18);
                            }
                        }
                    }
                }
            }

        } else {
            if ((class48.field477 == 1 || !class14.field132 && class48.field477 == 4)
                && class48.field478 >= class79.field1143 + 765 - 50 && class48.field467 >= 453) {
                GameApplet.field435.field1035 = !GameApplet.field435.field1035;
                Player.writePreferences();
                if (!GameApplet.field435.field1035) {
                    class72.method1967(InboundPacketDescriptor.index6, "scape main", "", 255, false, 124316333);
                } else {
                    class23.method342((byte) 1);
                }
            }

            if (client.state != 5) {
                if (-1L == class79.field1178) {
                    class79.field1178 = Time.currentTimeMillis() + 1000L;
                }

                long var13 = Time.currentTimeMillis();
                boolean var4;
                if (client.field915 != null && client.field765 < client.field915.size()) {
                    while (true) {
                        if (client.field765 >= client.field915.size()) {
                            var4 = true;
                            break;
                        }

                        class53 var16 = (class53) client.field915.get(client.field765);
                        if (!var16.method1075(-1238623850)) {
                            var4 = false;
                            break;
                        }

                        ++client.field765;
                    }
                } else {
                    var4 = true;
                }

                if (var4 && class79.field1179 == -1L) {
                    class79.field1179 = var13;
                    if (class79.field1179 > class79.field1178) {
                        class79.field1178 = class79.field1179;
                    }
                }

                ++class79.field1156;
                if (client.state == 10 || client.state == 11) {
                    if (client.field785 == 0) {
                        if (class48.field477 == 1 || !class14.field132 && class48.field477 == 4) {
                            var5 = class79.field1143 + 5;
                            short var15 = 463;
                            byte var7 = 100;
                            byte var8 = 35;
                            if (class48.field478 >= var5 && class48.field478 <= var7 + var5
                                && class48.field467 >= var15 && class48.field467 <= var15 + var8) {
                                class7.method89(467437481);
                                return;
                            }
                        }

                        if (class66.field1010 != null) {
                            class7.method89(1551450939);
                        }
                    }

                    var5 = class48.field477;
                    int var26 = class48.field478;
                    int var19 = class48.field467;
                    if (var5 == 0) {
                        var26 = class48.field473;
                        var19 = class48.field464 * -976212263;
                    }

                    if (!class14.field132 && var5 == 4) {
                        var5 = 1;
                    }

                    int var9;
                    short var10;
                    if (class79.field1163 == 0) {
                        boolean var20 = false;

                        while (class283.method5540(-206655980)) {
                            if (class59.field598 == 84) {
                                var20 = true;
                            }
                        }

                        var9 = class13.field103 - 80;
                        var10 = 291;
                        if (var5 == 1 && var26 >= var9 - 75 && var26 <= var9 + 75
                            && var19 >= var10 - 20 && var19 <= var10 + 20) {
                            class138.openUrl(class56.method1109("secure", true, (byte) 0)
                                                    + "m=account-creation/g=oldscape/create_account_funnel.ws",
                                                true, false, (short) 2500);
                        }

                        var9 = class13.field103 + 80;
                        if (var5 == 1 && var26 >= var9 - 75 && var26 <= var9 + 75
                            && var19 >= var10 - 20 && var19 <= var10 + 20 || var20) {
                            if ((client.field660 & 33554432) != 0) {
                                class79.field1168 = "";
                                class79.field1165 = "This is a <col=00ffff>Beta<col=ffffff> world.";
                                class79.field1166 = "Your normal account will not be affected.";
                                class79.field1167 = "";
                                class79.field1163 = 1;
                                if (client.field746 && class79.username != null
                                    && class79.username.length() > 0) {
                                    class79.field1150 = 1;
                                } else {
                                    class79.field1150 = 0;
                                }
                            } else if ((client.field660 & 4) != 0) {
                                if ((client.field660 & 1024) != 0) {
                                    class79.field1165 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world.";
                                    class79.field1166 = "Players can attack each other almost everywhere";
                                    class79.field1167 = "and the Protect Item prayer won\'t work.";
                                } else {
                                    class79.field1165 = "This is a <col=ff0000>PvP<col=ffffff> world.";
                                    class79.field1166 = "Players can attack each other";
                                    class79.field1167 = "almost everywhere.";
                                }

                                class79.field1168 = "Warning!";
                                class79.field1163 = 1;
                                if (client.field746 && class79.username != null
                                    && class79.username.length() > 0) {
                                    class79.field1150 = 1;
                                } else {
                                    class79.field1150 = 0;
                                }
                            } else if ((client.field660 & 1024) != 0) {
                                class79.field1165 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
                                class79.field1166 = "The Protect Item prayer will";
                                class79.field1167 = "not work on this world.";
                                class79.field1168 = "Warning!";
                                class79.field1163 = 1;
                                if (client.field746 && class79.username != null
                                    && class79.username.length() > 0) {
                                    class79.field1150 = 1;
                                } else {
                                    class79.field1150 = 0;
                                }
                            } else {
                                class49.method1024(false, -724213512);
                            }
                        }
                    } else {
                        int var21;
                        short var23;
                        if (class79.field1163 != 1) {
                            short var22;
                            if (class79.field1163 == 2) {
                                var22 = 201;
                                var21 = var22 + 52;
                                if (var5 == 1 && var19 >= var21 - 12 && var19 < var21 + 2) {
                                    class79.field1150 = 0;
                                }

                                var21 += 15;
                                if (var5 == 1 && var19 >= var21 - 12 && var19 < var21 + 2) {
                                    class79.field1150 = 1;
                                }

                                var21 += 15;
                                var22 = 361;
                                if (class79.field1177 != null) {
                                    var9 = class79.field1177.width / 2;
                                    if (var5 == 1 && var26 >= class79.field1177.x - var9
                                        && var26 <= var9 + class79.field1177.x
                                        && var19 >= var22 - 15 && var19 < var22) {
                                        switch (class79.field1161) {
                                            case 1:
                                                class185.method4006("Please enter your username.",
                                                                    "If you created your account after November",
                                                                    "2010, this will be the creation email address.",
                                                                    2045906432);
                                                class79.field1163 = 5;
                                                return;
                                            case 2:
                                                class138.openUrl(
                                                    "https://support.runescape.com/hc/en-gb", true,
                                                    false, (short) 2500);
                                        }
                                    }
                                }

                                var9 = class13.field103 - 80;
                                var10 = 321;
                                if (var5 == 1 && var26 >= var9 - 75 && var26 <= var9 + 75
                                    && var19 >= var10 - 20 && var19 <= var10 + 20) {
                                    class79.username = class79.username.trim();
                                    if (class79.username.length() == 0) {
                                        class185.method4006("",
                                                            "Please enter your username/email address.",
                                                            "", 2133533907);
                                        return;
                                    }

                                    if (class79.password.length() == 0) {
                                        class185.method4006("", "Please enter your password.", "",
                                                            1473821635);
                                        return;
                                    }

                                    class185
                                        .method4006("", "Connecting to server...", "", 2095206915);
                                    class30.method577(false, -2107322233);
                                    client.setState(20);
                                    return;
                                }

                                var9 = class79.field1144 + 180 + 80;
                                if (var5 == 1 && var26 >= var9 - 75 && var26 <= var9 + 75
                                    && var19 >= var10 - 20 && var19 <= var10 + 20) {
                                    class79.field1163 = 0;
                                    class79.username = "";
                                    class79.password = "";
                                    class60.field604 = 0;
                                    class10.field82 = "";
                                    class79.field1172 = true;
                                }

                                var9 = class13.field103 + -117;
                                var10 = 277;
                                class79.field1170 =
                                    var26 >= var9 && var26 < var9 + class69.field1050
                                        && var19 >= var10 && var19 < var10 + class42.field405;
                                if (var5 == 1 && class79.field1170) {
                                    client.field746 = !client.field746;
                                    if (!client.field746 && GameApplet.field435.field1034 != null) {
                                        GameApplet.field435.field1034 = null;
                                        Player.writePreferences();
                                    }
                                }

                                var9 = class13.field103 + 24;
                                var10 = 277;
                                class79.field1171 =
                                    var26 >= var9 && var26 < var9 + class69.field1050
                                        && var19 >= var10 && var19 < var10 + class42.field405;
                                if (var5 == 1 && class79.field1171) {
                                    GameApplet.field435.field1033 = !GameApplet.field435.field1033;
                                    if (!GameApplet.field435.field1033) {
                                        class79.username = "";
                                        GameApplet.field435.field1034 = null;
                                        if (client.field746 && class79.username != null
                                            && class79.username.length() > 0) {
                                            class79.field1150 = 1;
                                        } else {
                                            class79.field1150 = 0;
                                        }
                                    }

                                    Player.writePreferences();
                                }

                                while (true) {
                                    while (class283.method5540(-206655980)) {
                                        boolean var11 = false;

                                        for (int var12 = 0; var12
                                            < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| "
                                            .length(); ++var12) {
                                            if (class131.field1856
                                                == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| "
                                                .charAt(var12)) {
                                                var11 = true;
                                                break;
                                            }
                                        }

                                        if (class59.field598 == 13) {
                                            class79.field1163 = 0;
                                            class79.username = "";
                                            class79.password = "";
                                            class60.field604 = 0;
                                            class10.field82 = "";
                                            class79.field1172 = true;
                                        } else if (class79.field1150 == 0) {
                                            if (class59.field598 == 85
                                                && class79.username.length() > 0) {
                                                class79.username = class79.username
                                                    .substring(0, class79.username.length() - 1);
                                            }

                                            if (class59.field598 == 84 || class59.field598 == 80) {
                                                class79.field1150 = 1;
                                            }

                                            if (var11 && class79.username.length() < 320) {
                                                class79.username =
                                                    class79.username + class131.field1856;
                                            }
                                        } else if (class79.field1150 == 1) {
                                            if (class59.field598 == 85
                                                && class79.password.length() > 0) {
                                                class79.password = class79.password
                                                    .substring(0, class79.password.length() - 1);
                                            }

                                            if (class59.field598 == 84 || class59.field598 == 80) {
                                                class79.field1150 = 0;
                                            }

                                            if (class59.field598 == 84) {
                                                class79.username = class79.username.trim();
                                                if (class79.username.length() == 0) {
                                                    class185.method4006("",
                                                                        "Please enter your username/email address.",
                                                                        "", 1640174066);
                                                    return;
                                                }

                                                if (class79.password.length() == 0) {
                                                    class185.method4006("",
                                                                        "Please enter your password.",
                                                                        "", 1354891729);
                                                    return;
                                                }

                                                class185
                                                    .method4006("", "Connecting to server...", "",
                                                                1766495890);
                                                class30.method577(false, -2147423235);
                                                client.setState(20);
                                                return;
                                            }

                                            if (var11 && class79.password.length() < 20) {
                                                class79.password =
                                                    class79.password + class131.field1856;
                                            }
                                        }
                                    }

                                    return;
                                }
                            } else if (class79.field1163 == 3) {
                                var21 = class79.field1144 + 180;
                                var23 = 276;
                                if (var5 == 1 && var26 >= var21 - 75 && var26 <= var21 + 75
                                    && var19 >= var23 - 20 && var19 <= var23 + 20) {
                                    class49.method1024(false, -1863344656);
                                }

                                var21 = class79.field1144 + 180;
                                var23 = 326;
                                if (var5 == 1 && var26 >= var21 - 75 && var26 <= var21 + 75
                                    && var19 >= var23 - 20 && var19 <= var23 + 20) {
                                    class185.method4006("Please enter your username.",
                                                        "If you created your account after November",
                                                        "2010, this will be the creation email address.",
                                                        1774055558);
                                    class79.field1163 = 5;
                                    return;
                                }
                            } else {
                                boolean var24;
                                int var25;
                                if (class79.field1163 == 4) {
                                    var21 = class79.field1144 + 180 - 80;
                                    var23 = 321;
                                    if (var5 == 1 && var26 >= var21 - 75 && var26 <= var21 + 75
                                        && var19 >= var23 - 20 && var19 <= var23 + 20) {
                                        class10.field82.trim();
                                        if (class10.field82.length() != 6) {
                                            class185
                                                .method4006("", "Please enter a 6-digit PIN.", "",
                                                            1682974263);
                                            return;
                                        }

                                        class60.field604 = Integer.parseInt(class10.field82);
                                        class10.field82 = "";
                                        class30.method577(true, -2073251868);
                                        class185.method4006("", "Connecting to server...", "",
                                                            1656147388);
                                        client.setState(20);
                                        return;
                                    }

                                    if (var5 == 1 && var26 >= class79.field1144 + 180 - 9
                                        && var26 <= class79.field1144 + 180 + 130 && var19 >= 263
                                        && var19 <= 296) {
                                        class79.field1172 = !class79.field1172;
                                    }

                                    if (var5 == 1 && var26 >= class79.field1144 + 180 - 34
                                        && var26 <= class79.field1144 + 34 + 180 && var19 >= 351
                                        && var19 <= 363) {
                                        class138.openUrl(
                                            class56.method1109("secure", true, (byte) 0)
                                                + "m=totp-authenticator/disableTOTPRequest", true,
                                            false, (short) 2500);
                                    }

                                    var21 = class79.field1144 + 180 + 80;
                                    if (var5 == 1 && var26 >= var21 - 75 && var26 <= var21 + 75
                                        && var19 >= var23 - 20 && var19 <= var23 + 20) {
                                        class79.field1163 = 0;
                                        class79.username = "";
                                        class79.password = "";
                                        class60.field604 = 0;
                                        class10.field82 = "";
                                    }

                                    while (class283.method5540(-206655980)) {
                                        var24 = false;

                                        for (var25 = 0; var25 < "1234567890".length(); ++var25) {
                                            if (class131.field1856 == "1234567890".charAt(var25)) {
                                                var24 = true;
                                                break;
                                            }
                                        }

                                        if (class59.field598 == 13) {
                                            class79.field1163 = 0;
                                            class79.username = "";
                                            class79.password = "";
                                            class60.field604 = 0;
                                            class10.field82 = "";
                                        } else {
                                            if (class59.field598 == 85
                                                && class10.field82.length() > 0) {
                                                class10.field82 = class10.field82
                                                    .substring(0, class10.field82.length() - 1);
                                            }

                                            if (class59.field598 == 84) {
                                                class10.field82.trim();
                                                if (class10.field82.length() != 6) {
                                                    class185.method4006("",
                                                                        "Please enter a 6-digit PIN.",
                                                                        "", 1811213571);
                                                    return;
                                                }

                                                class60.field604 = Integer
                                                    .parseInt(class10.field82);
                                                class10.field82 = "";
                                                class30.method577(true, -2055467756);
                                                class185
                                                    .method4006("", "Connecting to server...", "",
                                                                2056426348);
                                                client.setState(20);
                                                return;
                                            }

                                            if (var24 && class10.field82.length() < 6) {
                                                class10.field82 =
                                                    class10.field82 + class131.field1856;
                                            }
                                        }
                                    }
                                } else if (class79.field1163 == 5) {
                                    var21 = class79.field1144 + 180 - 80;
                                    var23 = 321;
                                    if (var5 == 1 && var26 >= var21 - 75 && var26 <= var21 + 75
                                        && var19 >= var23 - 20 && var19 <= var23 + 20) {
                                        class162.method3548(1145854110);
                                        return;
                                    }

                                    var21 = class79.field1144 + 180 + 80;
                                    if (var5 == 1 && var26 >= var21 - 75 && var26 <= var21 + 75
                                        && var19 >= var23 - 20 && var19 <= var23 + 20) {
                                        class49.method1024(true, 2102584104);
                                    }

                                    while (class283.method5540(-206655980)) {
                                        var24 = false;

                                        for (var25 = 0; var25
                                            < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| "
                                            .length(); ++var25) {
                                            if (class131.field1856
                                                == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| "
                                                .charAt(var25)) {
                                                var24 = true;
                                                break;
                                            }
                                        }

                                        if (class59.field598 == 13) {
                                            class49.method1024(true, -807523520);
                                        } else {
                                            if (class59.field598 == 85
                                                && class79.username.length() > 0) {
                                                class79.username = class79.username
                                                    .substring(0, class79.username.length() - 1);
                                            }

                                            if (class59.field598 == 84) {
                                                class162.method3548(62868703);
                                                return;
                                            }

                                            if (var24 && class79.username.length() < 320) {
                                                class79.username =
                                                    class79.username + class131.field1856;
                                            }
                                        }
                                    }
                                } else if (class79.field1163 == 6) {
                                    while (true) {
                                        do {
                                            if (!class283.method5540(-206655980)) {
                                                var22 = 321;
                                                if (var5 == 1 && var19 >= var22 - 20
                                                    && var19 <= var22 + 20) {
                                                    class49.method1024(true, 246166916);
                                                }

                                                return;
                                            }
                                        } while (class59.field598 != 84 && class59.field598 != 13);

                                        class49.method1024(true, 1036556447);
                                    }
                                } else if (class79.field1163 == 7) {
                                    var21 = class79.field1144 + 180 - 80;
                                    var23 = 321;
                                    if (var5 == 1 && var26 >= var21 - 75 && var26 <= var21 + 75
                                        && var19 >= var23 - 20 && var19 <= var23 + 20) {
                                        class138.openUrl(
                                            class56.method1109("secure", true, (byte) 0)
                                                + "m=dob/set_dob.ws", true, false, (short) 2500);
                                        class185.method4006("", "Page has opened in a new window.",
                                                            "(Please check your popup blocker.)",
                                                            1846079156);
                                        class79.field1163 = 6;
                                        return;
                                    }

                                    var21 = class79.field1144 + 180 + 80;
                                    if (var5 == 1 && var26 >= var21 - 75 && var26 <= var21 + 75
                                        && var19 >= var23 - 20 && var19 <= var23 + 20) {
                                        class49.method1024(true, 2136939602);
                                    }
                                } else if (class79.field1163 == 8) {
                                    var21 = class79.field1144 + 180 - 80;
                                    var23 = 321;
                                    if (var5 == 1 && var26 >= var21 - 75 && var26 <= var21 + 75
                                        && var19 >= var23 - 20 && var19 <= var23 + 20) {
                                        class138.openUrl(
                                            "https://www.jagex.com/terms/privacy/#eight", true,
                                            false, (short) 2500);
                                        class185.method4006("", "Page has opened in a new window.",
                                                            "(Please check your popup blocker.)",
                                                            2120954780);
                                        class79.field1163 = 6;
                                        return;
                                    }

                                    var21 = class79.field1144 + 180 + 80;
                                    if (var5 == 1 && var26 >= var21 - 75 && var26 <= var21 + 75
                                        && var19 >= var23 - 20 && var19 <= var23 + 20) {
                                        class49.method1024(true, 1074712622);
                                    }
                                } else if (class79.field1163 == 12) {
                                    String var17 = "";
                                    switch (class79.field1142) {
                                        case 0:
                                            var17 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
                                            break;
                                        case 1:
                                            var17 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
                                            break;
                                        default:
                                            class49.method1024(false, -94570813);
                                    }

                                    var9 = class79.field1144 + 180;
                                    var10 = 276;
                                    if (var5 == 1 && var26 >= var9 - 75 && var26 <= var9 + 75
                                        && var19 >= var10 - 20 && var19 <= var10 + 20) {
                                        class138.openUrl(var17, true, false, (short) 2500);
                                        class185.method4006("", "Page has opened in a new window.",
                                                            "(Please check your popup blocker.)",
                                                            1600098501);
                                        class79.field1163 = 6;
                                        return;
                                    }

                                    var9 = class79.field1144 + 180;
                                    var10 = 326;
                                    if (var5 == 1 && var26 >= var9 - 75 && var26 <= var9 + 75
                                        && var19 >= var10 - 20 && var19 <= var10 + 20) {
                                        class49.method1024(false, -1150118958);
                                    }
                                }
                            }
                        } else {
                            while (class283.method5540(-206655980)) {
                                if (class59.field598 == 84) {
                                    class49.method1024(false, -739710107);
                                } else if (class59.field598 == 13) {
                                    class79.field1163 = 0;
                                }
                            }

                            var21 = class13.field103 - 80;
                            var23 = 321;
                            if (var5 == 1 && var26 >= var21 - 75 && var26 <= var21 + 75
                                && var19 >= var23 - 20 && var19 <= var23 + 20) {
                                class49.method1024(false, -1659776451);
                            }

                            var21 = class13.field103 + 80;
                            if (var5 == 1 && var26 >= var21 - 75 && var26 <= var21 + 75
                                && var19 >= var23 - 20 && var19 <= var23 + 20) {
                                class79.field1163 = 0;
                            }
                        }
                    }

                }
            }
        }
    }

    static final void method1741(class273 var0, int var1, int var2, int var3, int var4) {
        if (client.field780 < 400) {
            if (var0.field3595 != null) {
                var0 = var0.method5397((byte) 40);
            }

            if (var0 != null) {
                if (var0.field3589) {
                    if (!var0.field3586 || client.field813 == var1) {
                        String var5 = var0.field3569;
                        int var8;
                        int var9;
                        if (var0.field3576 != 0) {
                            var8 = var0.field3576;
                            var9 = class69.localPlayer.field611;
                            int var10 = var9 - var8;
                            String var7;
                            if (var10 < -9) {
                                var7 = class128.method3233(16711680, 1137216236);
                            } else if (var10 < -6) {
                                var7 = class128.method3233(16723968, 1747645455);
                            } else if (var10 < -3) {
                                var7 = class128.method3233(16740352, 789192397);
                            } else if (var10 < 0) {
                                var7 = class128.method3233(16756736, 1454153350);
                            } else if (var10 > 9) {
                                var7 = class128.method3233(65280, 1754459815);
                            } else if (var10 > 6) {
                                var7 = class128.method3233(4259584, 1445600180);
                            } else if (var10 > 3) {
                                var7 = class128.method3233(8453888, 461919906);
                            } else if (var10 > 0) {
                                var7 = class128.method3233(12648192, 1470533038);
                            } else {
                                var7 = class128.method3233(16776960, 1799886463);
                            }

                            var5 = var5 + var7 + " " + " (" + "level-" + var0.field3576 + ")";
                        }

                        if (var0.field3586 && client.field788) {
                            class79.method2039("Examine",
                                               class128.method3233(16776960, 641941410) + var5,
                                               1003, var1, var2, var3, -1643582738);
                        }

                        if (client.field796 == 1) {
                            class79.method2039("Use", client.field766 + " " + "->" + " " + class128
                                                   .method3233(16776960, 1027340461) + var5, 7, var1, var2, var3,
                                               -187044306);
                        } else if (client.field798) {
                            if ((class297.field3740 & 2) == 2) {
                                class79.method2039(client.field801,
                                                   client.field716 + " " + "->" + " " + class128
                                                       .method3233(16776960, 2109367381) + var5, 8,
                                                   var1, var2, var3, -687621401);
                            }
                        } else {
                            int var11 = var0.field3586 && client.field788 ? 2000 : 0;
                            String[] var12 = var0.field3565;
                            if (var12 != null) {
                                for (var8 = 4; var8 >= 0; --var8) {
                                    if (var12[var8] != null && !var12[var8]
                                        .equalsIgnoreCase("Attack")) {
                                        var9 = 0;
                                        if (var8 == 0) {
                                            var9 = var11 + 9;
                                        }

                                        if (var8 == 1) {
                                            var9 = var11 + 10;
                                        }

                                        if (var8 == 2) {
                                            var9 = var11 + 11;
                                        }

                                        if (var8 == 3) {
                                            var9 = var11 + 12;
                                        }

                                        if (var8 == 4) {
                                            var9 = var11 + 13;
                                        }

                                        class79.method2039(var12[var8],
                                                           class128.method3233(16776960, 1536724331)
                                                               + var5, var9, var1, var2, var3,
                                                           1058951530);
                                    }
                                }
                            }

                            if (var12 != null) {
                                for (var8 = 4; var8 >= 0; --var8) {
                                    if (var12[var8] != null && var12[var8]
                                        .equalsIgnoreCase("Attack")) {
                                        short var13 = 0;
                                        if (client.field672 != class78.field1134) {
                                            if (client.field672 == class78.field1139
                                                || client.field672 == class78.field1141
                                                && var0.field3576 > class69.localPlayer.field611) {
                                                var13 = 2000;
                                            }

                                            var9 = 0;
                                            if (var8 == 0) {
                                                var9 = var13 + 9;
                                            }

                                            if (var8 == 1) {
                                                var9 = var13 + 10;
                                            }

                                            if (var8 == 2) {
                                                var9 = var13 + 11;
                                            }

                                            if (var8 == 3) {
                                                var9 = var13 + 12;
                                            }

                                            if (var8 == 4) {
                                                var9 = var13 + 13;
                                            }

                                            class79.method2039(var12[var8], class128
                                                                   .method3233(16776960, 1617326115) + var5, var9,
                                                               var1, var2, var3, -1078532439);
                                        }
                                    }
                                }
                            }

                            if (!var0.field3586 || !client.field788) {
                                class79.method2039("Examine",
                                                   class128.method3233(16776960, 1959909312) + var5,
                                                   1003, var1, var2, var3, 450308836);
                            }
                        }

                    }
                }
            }
        }
    }

    void method1739(boolean var1, byte var2) {
    }

    Buffer method1740(int var1) {
        Buffer var2 = new Buffer(100);
        var2.writeByte(field1030);
        var2.writeByte(this.field1029 ? 1 : 0);
        var2.writeByte(this.field1035 ? 1 : 0);
        var2.writeByte(this.field1031);
        var2.writeByte(this.field1028.size());
        Iterator var3 = this.field1028.entrySet().iterator();

        while (var3.hasNext()) {
            Entry var4 = (Entry) var3.next();
            var2.writeInt(((Integer) var4.getKey()).intValue());
            var2.writeInt(((Integer) var4.getValue()).intValue());
        }

        var2.writeString(this.field1034 != null ? this.field1034 : "");
        var2.method3818(this.field1033, (short) 10410);
        return var2;
    }
}
