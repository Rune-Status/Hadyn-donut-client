package jagex.osrs;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class class82 {

    public static class100 field1218;
    Future field1216;
    ExecutorService field1219;

    class82() {
        this.field1219 = Executors.newSingleThreadExecutor();
        this.field1216 = this.field1219.submit(new class52());
    }

    static void method2068(byte var0) {
        int var1;
        if (client.field902 == 0) {
            class243.field3173 = new class127(4, 104, 104, class50.field506);

            for (var1 = 0; var1 < 4; ++var1) {
                client.field701[var1] = new class166(104, 104);
            }

            class3.field29 = new class323(512, 512);
            class79.field1159 = "Starting game engine...";
            class79.field1158 = 5;
            client.field902 = 20;
        } else if (client.field902 == 20) {
            class79.field1159 = "Prepared visibility map";
            class79.field1158 = 10;
            client.field902 = 30;
        } else if (client.field902 == 30) {
            class19.index0 = class134.method3261(0, false, true, true, (byte) 79);
            class42.index1 = class134.method3261(1, false, true, true, (byte) 57);
            class50.index2 = class134.method3261(2, true, false, true, (byte) 107);
            class157.index3 = class134.method3261(3, false, true, true, (byte) 46);
            class9.index4 = class134.method3261(4, false, true, true, (byte) 14);
            class332.index5 = class134.method3261(5, true, true, true, (byte) 61);
            InboundPacketDescriptor.index6 = class134.method3261(6, true, true, true, (byte) 59);
            class10.index7 = class134.method3261(7, false, true, true, (byte) 78);
            class154.index8 = class134.method3261(8, false, true, true, (byte) 123);
            class17.index9 = class134.method3261(9, false, true, true, (byte) 123);
            class12.index10 = class134.method3261(10, false, true, true, (byte) 126);
            IssacRandom.index11 = class134.method3261(11, false, true, true, (byte) 33);
            class137.index12 = class134.method3261(12, false, true, true, (byte) 25);
            class71.index13 = class134.method3261(13, true, false, true, (byte) 40);
            class27.index14 = class134.method3261(14, false, true, true, (byte) 104);
            class270.index15 = class134.method3261(15, false, true, true, (byte) 81);
            AbstractSocket.index16 = class134.method3261(16, true, true, true, (byte) 10);
            class145.index17 = class134.method3261(17, true, true, true, (byte) 71);
            class79.field1159 = "Connecting to update server";
            class79.field1158 = 20;
            client.field902 = 40;
        } else if (client.field902 == 40) {
            byte var29 = 0;
            var1 = var29 + class19.index0.method4923((byte) 12) * 4 / 100;
            var1 += class42.index1.method4923((byte) 34) * 4 / 100;
            var1 += class50.index2.method4923((byte) 74) * 2 / 100;
            var1 += class157.index3.method4923((byte) 15) * 2 / 100;
            var1 += class9.index4.method4923((byte) -19) * 6 / 100;
            var1 += class332.index5.method4923((byte) -74) * 4 / 100;
            var1 += InboundPacketDescriptor.index6.method4923((byte) -24) * 2 / 100;
            var1 += class10.index7.method4923((byte) 7) * 57 / 100;
            var1 += class154.index8.method4923((byte) 12) * 2 / 100;
            var1 += class17.index9.method4923((byte) 77) * 2 / 100;
            var1 += class12.index10.method4923((byte) 47) * 2 / 100;
            var1 += IssacRandom.index11.method4923((byte) -9) * 2 / 100;
            var1 += class137.index12.method4923((byte) -17) * 2 / 100;
            var1 += class71.index13.method4923((byte) -12) * 2 / 100;
            var1 += class27.index14.method4923((byte) 13) * 2 / 100;
            var1 += class270.index15.method4923((byte) 46) * 2 / 100;
            var1 += AbstractSocket.index16.method4923((byte) -29) * 2 / 100;
            var1 +=
                class145.index17.method4922(1719349983) && class145.index17.method4904((byte) 5)
                    ? 1 : 0;
            if (var1 != 100) {
                if (var1 != 0) {
                    class79.field1159 = "Checking for updates - " + var1 + "%";
                }

                class79.field1158 = 30;
            } else {
                class233.method4754(class19.index0, "Animations", 1972806857);
                class233.method4754(class42.index1, "Skeletons", -1170366280);
                class233.method4754(class9.index4, "Sound FX", 1875303743);
                class233.method4754(class332.index5, "Maps", 1667822292);
                class233.method4754(InboundPacketDescriptor.index6, "Music Tracks", -2083661783);
                class233.method4754(class10.index7, "Models", -1444055501);
                class233.method4754(class154.index8, "Sprites", 808225528);
                class233.method4754(IssacRandom.index11, "Music Jingles", 1846815080);
                class233.method4754(class27.index14, "Music Samples", 1480794421);
                class233.method4754(class270.index15, "Music Patches", 1454399212);
                class233.method4754(AbstractSocket.index16, "World Map", 794108251);
                class1.field8 = new class311();
                class1.field8.method5954(class145.index17, 1175740462);
                class79.field1159 = "Loaded update list";
                class79.field1158 = 30;
                client.field902 = 45;
            }
        } else if (client.field902 == 45) {
            class65.method1682(22050, !client.lowMemory, 2, 935134680);
            class220 var35 = new class220();
            var35.method4404(9, 128, (byte) 21);
            client.field882 = class69.method1840(GameApplet.field426, 0, 22050, (byte) -11);
            client.field882.method2396(var35, 1719730838);
            class137
                .method3280(class270.index15, class27.index14, class9.index4, var35, (byte) 84);
            class6.field46 = class69.method1840(GameApplet.field426, 1, 2048, (byte) 1);
            class43.field413 = new class90();
            class6.field46.method2396(class43.field413, 1719730838);
            class286.field3697 = new class104(22050, class97.field1377);
            class79.field1159 = "Prepared sound engine";
            class79.field1158 = 35;
            client.field902 = 50;
            class297.field3747 = new class298(class154.index8, class71.index13);
        } else {
            int var2;
            if (client.field902 == 50) {
                class297[] var34 = new class297[]{class297.field3738, class297.field3746,
                    class297.field3741, class297.field3743, class297.field3742, class297.field3744};
                var2 = var34.length;
                class298 var26 = class297.field3747;
                class297[] var25 = new class297[]{class297.field3738, class297.field3746,
                    class297.field3741, class297.field3743, class297.field3742, class297.field3744};
                client.field695 = var26.method5771(var25, -1974155434);
                if (client.field695.size() < var2) {
                    class79.field1159 =
                        "Loading fonts - " + client.field695.size() * 100 / var2 + "%";
                    class79.field1158 = 40;
                } else {
                    class18.field175 = (class300) client.field695.get(class297.field3744);
                    class3.field25 = (class300) client.field695.get(class297.field3738);
                    class163.field2066 = (class300) client.field695.get(class297.field3746);
                    Player.computerInfo = client.field911.vmethod6292((byte) 11);
                    class79.field1159 = "Loaded fonts";
                    class79.field1158 = 40;
                    client.field902 = 60;
                }
            } else {
                class251 var3;
                int var19;
                int var32;
                class251 var37;
                if (client.field902 == 60) {
                    var37 = class12.index10;
                    var3 = class154.index8;
                    var19 = 0;
                    if (var37.method4853("title.jpg", "", 331727990)) {
                        ++var19;
                    }

                    if (var3.method4853("logo", "", -1709312759)) {
                        ++var19;
                    }

                    if (var3.method4853("logo_deadman_mode", "", -1800637856)) {
                        ++var19;
                    }

                    if (var3.method4853("titlebox", "", -271952838)) {
                        ++var19;
                    }

                    if (var3.method4853("titlebutton", "", -1821422335)) {
                        ++var19;
                    }

                    if (var3.method4853("runes", "", 558697440)) {
                        ++var19;
                    }

                    if (var3.method4853("title_mute", "", -669557419)) {
                        ++var19;
                    }

                    if (var3.method4853("options_radio_buttons,0", "", -1980569863)) {
                        ++var19;
                    }

                    if (var3.method4853("options_radio_buttons,2", "", -1521895066)) {
                        ++var19;
                    }

                    if (var3.method4853("options_radio_buttons,4", "", -455640621)) {
                        ++var19;
                    }

                    if (var3.method4853("options_radio_buttons,6", "", -1820571446)) {
                        ++var19;
                    }

                    var3.method4853("sl_back", "", -1547782004);
                    var3.method4853("sl_flags", "", -815715953);
                    var3.method4853("sl_arrows", "", -99931745);
                    var3.method4853("sl_stars", "", -54897373);
                    var3.method4853("sl_button", "", -1760965905);
                    var32 = class77.method2005(-533880111);
                    if (var19 < var32) {
                        class79.field1159 = "Loading title screen - " + var19 * 100 / var32 + "%";
                        class79.field1158 = 50;
                    } else {
                        class79.field1159 = "Loaded title screen";
                        class79.field1158 = 50;
                        client.setState(5);
                        client.field902 = 70;
                    }
                } else if (client.field902 == 70) {
                    if (!class50.index2.method4904((byte) 26)) {
                        class79.field1159 =
                            "Loading config - " + class50.index2.method4933(408946940) + "%";
                        class79.field1158 = 60;
                    } else {
                        class251 var33 = class50.index2;
                        class274.field3611 = var33;
                        var37 = class50.index2;
                        class261.field3365 = var37;
                        var3 = class50.index2;
                        class251 var4 = class10.index7;
                        class262.field3378 = var3;
                        class262.field3367 = var4;
                        class262.field3368 = class262.field3378.method4889(3, 1064669026);
                        class257.method5066(class50.index2, class10.index7, client.lowMemory,
                                            (short) 12625);
                        class175.method3679(class50.index2, class10.index7, (byte) 60);
                        class136.method3268(class50.index2, -1614523838);
                        class27.method517(class50.index2, class10.index7, client.field647,
                                          class18.field175, (byte) 31);
                        class58.method1131(class50.index2, class19.index0, class42.index1,
                                           -1827132090);
                        class85.method2146(class50.index2, class10.index7, (byte) -99);
                        class168.method3650(class50.index2, 1423625373);
                        class157.method3462(class50.index2, -1103470235);
                        class219.method4372(class157.index3, class10.index7, class154.index8,
                                            class71.index13, -1953204466);
                        class251 var20 = class50.index2;
                        class255.field3301 = var20;
                        class84.method2124(class50.index2, -604810430);
                        class251 var27 = class50.index2;
                        class258.field3336 = var27;
                        class245.method4809(class50.index2, -1712592106);
                        class251 var28 = class50.index2;
                        class6.field49 = var28;
                        class36.field348 = new class84();
                        class251 var8 = class50.index2;
                        class251 var30 = class154.index8;
                        class251 var10 = class71.index13;
                        class179.field2355 = var8;
                        class269.field3447 = var30;
                        class269.field3439 = var10;
                        class251 var31 = class50.index2;
                        class251 var12 = class154.index8;
                        class263.field3389 = var31;
                        class263.field3380 = var12;
                        class251 var13 = class50.index2;
                        class251 var14 = class154.index8;
                        class257.field3309 = var14;
                        if (var13.method4904((byte) 106)) {
                            class257.field3331 = var13.method4889(35, 1064669026);
                            class257.field3310 = new class257[class257.field3331];

                            for (int var15 = 0; var15 < class257.field3331; ++var15) {
                                byte[] var16 = var13.method4831(35, var15, 1789634852);
                                class257.field3310[var15] = new class257(var15);
                                if (var16 != null) {
                                    class257.field3310[var15]
                                        .method5053(new Buffer(var16), (byte) 15);
                                    class257.field3310[var15].method5043((byte) 2);
                                }
                            }
                        }

                        class79.field1159 = "Loaded config";
                        class79.field1158 = 60;
                        client.field902 = 80;
                    }
                } else if (client.field902 == 80) {
                    var1 = 0;
                    if (class55.field551 == null) {
                        class55.field551 = class145
                            .method3349(class154.index8, class1.field8.field3816, 0, (byte) -19);
                    } else {
                        ++var1;
                    }

                    if (class12.field98 == null) {
                        class12.field98 = class145
                            .method3349(class154.index8, class1.field8.field3817, 0, (byte) 47);
                    } else {
                        ++var1;
                    }

                    class322[] var18;
                    if (class278.field3642 == null) {
                        var3 = class154.index8;
                        var19 = class1.field8.field3815;
                        if (!class17.method212(var3, var19, 0, (byte) 1)) {
                            var18 = null;
                        } else {
                            var18 = class311.method5957(-1791356129);
                        }

                        class278.field3642 = var18;
                    } else {
                        ++var1;
                    }

                    boolean var5;
                    byte[] var6;
                    class323[] var7;
                    class323 var9;
                    byte[] var11;
                    int var21;
                    int var22;
                    int var23;
                    class323[] var36;
                    if (Player.field635 == null) {
                        var3 = class154.index8;
                        var19 = class1.field8.field3818;
                        var6 = var3.method4831(var19, 0, 1789634852);
                        if (var6 == null) {
                            var5 = false;
                        } else {
                            class125.method3051(var6, 1926576474);
                            var5 = true;
                        }

                        if (!var5) {
                            var36 = null;
                        } else {
                            var7 = new class323[class324.field3893];
                            var21 = 0;

                            while (true) {
                                if (var21 >= class324.field3893) {
                                    class324.field3890 = null;
                                    class324.field3892 = null;
                                    class324.field3895 = null;
                                    class258.field3334 = null;
                                    class324.field3894 = null;
                                    class324.field3897 = null;
                                    var36 = var7;
                                    break;
                                }

                                var9 = var7[var21] = new class323();
                                var9.field3883 = class324.field3891;
                                var9.field3884 = class324.field3896;
                                var9.field3881 = class324.field3890[var21];
                                var9.field3882 = class324.field3892[var21];
                                var9.field3879 = class324.field3895[var21];
                                var9.field3887 = class258.field3334[var21];
                                var22 = var9.field3887 * var9.field3879;
                                var11 = class324.field3897[var21];
                                var9.field3889 = new int[var22];

                                for (var23 = 0; var23 < var22; ++var23) {
                                    var9.field3889[var23] = class324.field3894[var11[var23] & 255];
                                }

                                ++var21;
                            }
                        }

                        Player.field635 = var36;
                    } else {
                        ++var1;
                    }

                    if (class137.field1913 == null) {
                        var3 = class154.index8;
                        var19 = class1.field8.field3813;
                        var6 = var3.method4831(var19, 0, 1789634852);
                        if (var6 == null) {
                            var5 = false;
                        } else {
                            class125.method3051(var6, 1922915002);
                            var5 = true;
                        }

                        if (!var5) {
                            var36 = null;
                        } else {
                            var7 = new class323[class324.field3893];
                            var21 = 0;

                            while (true) {
                                if (var21 >= class324.field3893) {
                                    class324.field3890 = null;
                                    class324.field3892 = null;
                                    class324.field3895 = null;
                                    class258.field3334 = null;
                                    class324.field3894 = null;
                                    class324.field3897 = null;
                                    var36 = var7;
                                    break;
                                }

                                var9 = var7[var21] = new class323();
                                var9.field3883 = class324.field3891;
                                var9.field3884 = class324.field3896;
                                var9.field3881 = class324.field3890[var21];
                                var9.field3882 = class324.field3892[var21];
                                var9.field3879 = class324.field3895[var21];
                                var9.field3887 = class258.field3334[var21];
                                var22 = var9.field3887 * var9.field3879;
                                var11 = class324.field3897[var21];
                                var9.field3889 = new int[var22];

                                for (var23 = 0; var23 < var22; ++var23) {
                                    var9.field3889[var23] = class324.field3894[var11[var23] & 255];
                                }

                                ++var21;
                            }
                        }

                        class137.field1913 = var36;
                    } else {
                        ++var1;
                    }

                    if (class49.field489 == null) {
                        var3 = class154.index8;
                        var19 = class1.field8.field3814;
                        var6 = var3.method4831(var19, 0, 1789634852);
                        if (var6 == null) {
                            var5 = false;
                        } else {
                            class125.method3051(var6, 2147272539);
                            var5 = true;
                        }

                        if (!var5) {
                            var36 = null;
                        } else {
                            var7 = new class323[class324.field3893];
                            var21 = 0;

                            while (true) {
                                if (var21 >= class324.field3893) {
                                    class324.field3890 = null;
                                    class324.field3892 = null;
                                    class324.field3895 = null;
                                    class258.field3334 = null;
                                    class324.field3894 = null;
                                    class324.field3897 = null;
                                    var36 = var7;
                                    break;
                                }

                                var9 = var7[var21] = new class323();
                                var9.field3883 = class324.field3891;
                                var9.field3884 = class324.field3896;
                                var9.field3881 = class324.field3890[var21];
                                var9.field3882 = class324.field3892[var21];
                                var9.field3879 = class324.field3895[var21];
                                var9.field3887 = class258.field3334[var21];
                                var22 = var9.field3887 * var9.field3879;
                                var11 = class324.field3897[var21];
                                var9.field3889 = new int[var22];

                                for (var23 = 0; var23 < var22; ++var23) {
                                    var9.field3889[var23] = class324.field3894[var11[var23] & 255];
                                }

                                ++var21;
                            }
                        }

                        class49.field489 = var36;
                    } else {
                        ++var1;
                    }

                    if (Time.field2421 == null) {
                        var3 = class154.index8;
                        var19 = class1.field8.field3819;
                        var6 = var3.method4831(var19, 0, 1789634852);
                        if (var6 == null) {
                            var5 = false;
                        } else {
                            class125.method3051(var6, 1748325441);
                            var5 = true;
                        }

                        if (!var5) {
                            var36 = null;
                        } else {
                            var7 = new class323[class324.field3893];
                            var21 = 0;

                            while (true) {
                                if (var21 >= class324.field3893) {
                                    class324.field3890 = null;
                                    class324.field3892 = null;
                                    class324.field3895 = null;
                                    class258.field3334 = null;
                                    class324.field3894 = null;
                                    class324.field3897 = null;
                                    var36 = var7;
                                    break;
                                }

                                var9 = var7[var21] = new class323();
                                var9.field3883 = class324.field3891;
                                var9.field3884 = class324.field3896;
                                var9.field3881 = class324.field3890[var21];
                                var9.field3882 = class324.field3892[var21];
                                var9.field3879 = class324.field3895[var21];
                                var9.field3887 = class258.field3334[var21];
                                var22 = var9.field3887 * var9.field3879;
                                var11 = class324.field3897[var21];
                                var9.field3889 = new int[var22];

                                for (var23 = 0; var23 < var22; ++var23) {
                                    var9.field3889[var23] = class324.field3894[var11[var23] & 255];
                                }

                                ++var21;
                            }
                        }

                        Time.field2421 = var36;
                    } else {
                        ++var1;
                    }

                    if (class144.field1945 == null) {
                        var3 = class154.index8;
                        var19 = class1.field8.field3820;
                        var6 = var3.method4831(var19, 0, 1789634852);
                        if (var6 == null) {
                            var5 = false;
                        } else {
                            class125.method3051(var6, 1784561855);
                            var5 = true;
                        }

                        if (!var5) {
                            var36 = null;
                        } else {
                            var7 = new class323[class324.field3893];
                            var21 = 0;

                            while (true) {
                                if (var21 >= class324.field3893) {
                                    class324.field3890 = null;
                                    class324.field3892 = null;
                                    class324.field3895 = null;
                                    class258.field3334 = null;
                                    class324.field3894 = null;
                                    class324.field3897 = null;
                                    var36 = var7;
                                    break;
                                }

                                var9 = var7[var21] = new class323();
                                var9.field3883 = class324.field3891;
                                var9.field3884 = class324.field3896;
                                var9.field3881 = class324.field3890[var21];
                                var9.field3882 = class324.field3892[var21];
                                var9.field3879 = class324.field3895[var21];
                                var9.field3887 = class258.field3334[var21];
                                var22 = var9.field3879 * var9.field3887;
                                var11 = class324.field3897[var21];
                                var9.field3889 = new int[var22];

                                for (var23 = 0; var23 < var22; ++var23) {
                                    var9.field3889[var23] = class324.field3894[var11[var23] & 255];
                                }

                                ++var21;
                            }
                        }

                        class144.field1945 = var36;
                    } else {
                        ++var1;
                    }

                    if (GameApplet.field461 == null) {
                        var3 = class154.index8;
                        var19 = class1.field8.field3821;
                        var6 = var3.method4831(var19, 0, 1789634852);
                        if (var6 == null) {
                            var5 = false;
                        } else {
                            class125.method3051(var6, 1837375698);
                            var5 = true;
                        }

                        if (!var5) {
                            var36 = null;
                        } else {
                            var7 = new class323[class324.field3893];
                            var21 = 0;

                            while (true) {
                                if (var21 >= class324.field3893) {
                                    class324.field3890 = null;
                                    class324.field3892 = null;
                                    class324.field3895 = null;
                                    class258.field3334 = null;
                                    class324.field3894 = null;
                                    class324.field3897 = null;
                                    var36 = var7;
                                    break;
                                }

                                var9 = var7[var21] = new class323();
                                var9.field3883 = class324.field3891;
                                var9.field3884 = class324.field3896;
                                var9.field3881 = class324.field3890[var21];
                                var9.field3882 = class324.field3892[var21];
                                var9.field3879 = class324.field3895[var21];
                                var9.field3887 = class258.field3334[var21];
                                var22 = var9.field3887 * var9.field3879;
                                var11 = class324.field3897[var21];
                                var9.field3889 = new int[var22];

                                for (var23 = 0; var23 < var22; ++var23) {
                                    var9.field3889[var23] = class324.field3894[var11[var23] & 255];
                                }

                                ++var21;
                            }
                        }

                        GameApplet.field461 = var36;
                    } else {
                        ++var1;
                    }

                    if (class194.field2465 == null) {
                        var3 = class154.index8;
                        var19 = class1.field8.field3822;
                        var6 = var3.method4831(var19, 0, 1789634852);
                        if (var6 == null) {
                            var5 = false;
                        } else {
                            class125.method3051(var6, 1696468505);
                            var5 = true;
                        }

                        if (!var5) {
                            var18 = null;
                        } else {
                            var18 = class311.method5957(-172083306);
                        }

                        class194.field2465 = var18;
                    } else {
                        ++var1;
                    }

                    if (class36.field350 == null) {
                        var3 = class154.index8;
                        var19 = class1.field8.field3823;
                        var6 = var3.method4831(var19, 0, 1789634852);
                        if (var6 == null) {
                            var5 = false;
                        } else {
                            class125.method3051(var6, 1970806762);
                            var5 = true;
                        }

                        if (!var5) {
                            var18 = null;
                        } else {
                            var18 = class311.method5957(-1090786183);
                        }

                        class36.field350 = var18;
                    } else {
                        ++var1;
                    }

                    if (var1 < 11) {
                        class79.field1159 = "Loading sprites - " + var1 * 100 / 12 + "%";
                        class79.field1158 = 70;
                    } else {
                        class301.field3760 = class36.field350;
                        class12.field98.method6222();
                        var2 = (int) (Math.random() * 21.0D) - 10;
                        int var24 = (int) (Math.random() * 21.0D) - 10;
                        var19 = (int) (Math.random() * 21.0D) - 10;
                        var32 = (int) (Math.random() * 41.0D) - 20;
                        class278.field3642[0]
                            .method6147(var32 + var2, var24 + var32, var19 + var32);
                        class79.field1159 = "Loaded sprites";
                        class79.field1158 = 70;
                        client.field902 = 90;
                    }
                } else if (client.field902 == 90) {
                    if (!class17.index9.method4904((byte) 30)) {
                        class79.field1159 = "Loading textures - " + "0%";
                        class79.field1158 = 90;
                    } else {
                        class282.field3688 = new class113(class17.index9, class154.index8, 20,
                                                          0.8D, client.lowMemory ? 64 : 128);
                        class124.method2980(class282.field3688);
                        class124.method2981(0.8D);
                        client.field902 = 100;
                    }
                } else if (client.field902 == 100) {
                    var1 = class282.field3688.method2742(1447723466);
                    if (var1 < 100) {
                        class79.field1159 = "Loading textures - " + var1 + "%";
                        class79.field1158 = 90;
                    } else {
                        class79.field1159 = "Loaded textures";
                        class79.field1158 = 90;
                        client.field902 = 110;
                    }
                } else if (client.field902 == 110) {
                    class36.field347 = new class58();
                    GameApplet.field426.method3439(class36.field347, 10, (byte) -61);
                    class79.field1159 = "Loaded input handler";
                    class79.field1158 = 92;
                    client.field902 = 120;
                } else if (client.field902 == 120) {
                    if (!class12.index10.method4853("huffman", "", -1582669021)) {
                        class79.field1159 = "Loading wordpack - " + 0 + "%";
                        class79.field1158 = 94;
                    } else {
                        class176 var17 = new class176(
                            class12.index10.method4849("huffman", "", 821665515));
                        class256.method5039(var17, 1598346725);
                        class79.field1159 = "Loaded wordpack";
                        class79.field1158 = 94;
                        client.field902 = 130;
                    }
                } else if (client.field902 == 130) {
                    if (!class157.index3.method4904((byte) 14)) {
                        class79.field1159 = "Loading interfaces - "
                            + class157.index3.method4933(1673648693) * 4 / 5 + "%";
                        class79.field1158 = 96;
                    } else if (!class137.index12.method4904((byte) 83)) {
                        class79.field1159 = "Loading interfaces - " + (80
                            + class137.index12.method4933(1145779416) / 6) + "%";
                        class79.field1158 = 96;
                    } else if (!class71.index13.method4904((byte) 77)) {
                        class79.field1159 = "Loading interfaces - " + (96
                            + class71.index13.method4933(-406024742) / 50) + "%";
                        class79.field1158 = 96;
                    } else {
                        class79.field1159 = "Loaded interfaces";
                        class79.field1158 = 98;
                        client.field902 = 140;
                    }
                } else if (client.field902 == 140) {
                    class79.field1158 = 100;
                    if (!AbstractSocket.index16.method4851(class29.field291.field298, -2107594785)) {
                        class79.field1159 = "Loading world map - "
                            + AbstractSocket.index16.method4845(class29.field291.field298, 29775380)
                            / 10 + "%";
                    } else {
                        if (class45.field418 == null) {
                            class45.field418 = new class329();
                            class45.field418
                                .method6317(AbstractSocket.index16, class163.field2066, client.field695,
                                            class278.field3642, -428996887);
                        }

                        var1 = class45.field418.method6321((byte) 92);
                        if (var1 < 100) {
                            class79.field1159 = "Loading world map - " + (var1 * 9 / 10 + 10) + "%";
                        } else {
                            class79.field1159 = "Loaded world map";
                            client.field902 = 150;
                        }
                    }
                } else if (client.field902 == 150) {
                    client.setState(10);
                }
            }
        }
    }

    boolean method2058(byte var1) {
        return this.field1216.isDone();
    }

    SecureRandom method2059(byte var1) {
        try {
            return (SecureRandom) this.field1216.get();
        } catch (Exception var5) {
            SecureRandom var4 = new SecureRandom();
            var4.nextInt();
            return var4;
        }
    }

    void method2057(int var1) {
        this.field1219.shutdown();
        this.field1219 = null;
    }
}
