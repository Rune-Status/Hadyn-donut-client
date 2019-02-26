package jagex.osrs;

public final class class71 extends class129 {

    static class251 index13;
    int field1092;
    boolean field1093;
    int field1094;
    int field1084;
    class275 field1090;
    int field1086;
    int field1087;
    int field1088;
    int field1089;
    int field1085;

    class71(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        this.field1084 = 0;
        this.field1094 = 0;
        this.field1093 = false;
        this.field1092 = var1;
        this.field1086 = var2;
        this.field1087 = var3;
        this.field1088 = var4;
        this.field1089 = var5;
        this.field1085 = var7 + var6;
        int var8 = class250.method4918(this.field1092, 1271109313).field3348;
        if (var8 != -1) {
            this.field1093 = false;
            this.field1090 = class29.method532(var8, 1818635637);
        } else {
            this.field1093 = true;
        }

    }

    static void method1957(int var0, byte var1) {
        class54 var2 = (class54) class54.field534.method4224((long) var0);
        if (var2 != null) {
            for (int var3 = 0; var3 < var2.field533.length; ++var3) {
                var2.field533[var3] = -1;
                var2.field532[var3] = 0;
            }

        }
    }

    static final void method1950(class232 var0, int var1, int var2, int var3) {
        if (var0.field2670 == 1) {
            class79.method2039(var0.field2790, "", 24, 0, 0, var0.field2770, -1524083554);
        }

        String var4;
        if (var0.field2670 == 2 && !client.field798) {
            var4 = class86.method2167(var0, 1568686310);
            if (var4 != null) {
                class79
                    .method2039(var4, class128.method3233(65280, 632689960) + var0.field2677, 25, 0,
                                -1, var0.field2770, -1065147031);
            }
        }

        if (var0.field2670 == 3) {
            class79.method2039("Close", "", 26, 0, 0, var0.field2770, 842899662);
        }

        if (var0.field2670 == 4) {
            class79.method2039(var0.field2790, "", 28, 0, 0, var0.field2770, -1236184904);
        }

        if (var0.field2670 == 5) {
            class79.method2039(var0.field2790, "", 29, 0, 0, var0.field2770, 740020812);
        }

        if (var0.field2670 == 6 && client.field880 == null) {
            class79.method2039(var0.field2790, "", 30, 0, -1, var0.field2770, -269733615);
        }

        int var5;
        int var6;
        int var7;
        int var8;
        int var16;
        if (var0.field2808 == 2) {
            var16 = 0;

            for (var5 = 0; var5 < var0.field2683; ++var5) {
                for (var6 = 0; var6 < var0.field2682; ++var6) {
                    var7 = (var0.field2734 + 32) * var6;
                    var8 = (var0.field2708 + 32) * var5;
                    if (var16 < 20) {
                        var7 += var0.field2726[var16];
                        var8 += var0.field2737[var16];
                    }

                    if (var1 >= var7 && var2 >= var8 && var1 < var7 + 32 && var2 < var8 + 32) {
                        client.field797 = var16;
                        class13.field104 = var0;
                        if (var0.field2762[var16] > 0) {
                            class271 var9 = class84
                                .method2125(var0.field2762[var16] - 1, -205103429);
                            if (client.field796 == 1 && HandshakePacket
                                .method3662(class254.method5000(var0, 2110168672), (byte) 8)) {
                                if (var0.field2770 != class88.field1276
                                    || var16 != class22.field220) {
                                    class79.method2039("Use",
                                                       client.field766 + " " + "->" + " " + class128
                                                           .method3233(16748608, 1991375137)
                                                           + var9.field3515, 31, var9.field3557,
                                                       var16, var0.field2770, -1550455804);
                                }
                            } else if (client.field798 && HandshakePacket
                                .method3662(class254.method5000(var0, 2130746748), (byte) 8)) {
                                if ((class297.field3740 & 16) == 16) {
                                    class79.method2039(client.field801,
                                                       client.field716 + " " + "->" + " " + class128
                                                           .method3233(16748608, 1627450880)
                                                           + var9.field3515, 32, var9.field3557,
                                                       var16, var0.field2770, -580945294);
                                }
                            } else {
                                String[] var10 = var9.field3541;
                                int var11 = -1;
                                boolean var12;
                                if (client.field789) {
                                    var12 = client.field790 || class39.field380[81];
                                    if (var12) {
                                        var11 = var9.method5336(982890618);
                                    }
                                }

                                if (HandshakePacket
                                    .method3662(class254.method5000(var0, 2117150038), (byte) 8)) {
                                    for (int var23 = 4; var23 >= 3; --var23) {
                                        if (var11 != var23) {
                                            class13.method142(var0, var9, var16, var23, false,
                                                              1716253145);
                                        }
                                    }
                                }

                                int var13 = class254.method5000(var0, 2110985087);
                                var12 = (var13 >> 31 & 1) != 0;
                                if (var12) {
                                    class79.method2039("Use",
                                                       class128.method3233(16748608, 1019621412)
                                                           + var9.field3515, 38, var9.field3557,
                                                       var16, var0.field2770, 277175512);
                                }

                                Object var10000 = null;
                                int var14;
                                if (HandshakePacket
                                    .method3662(class254.method5000(var0, 2131327608), (byte) 8)) {
                                    for (var14 = 2; var14 >= 0; --var14) {
                                        if (var14 != var11) {
                                            class13.method142(var0, var9, var16, var14, false,
                                                              1663975168);
                                        }
                                    }

                                    if (var11 >= 0) {
                                        class13
                                            .method142(var0, var9, var16, var11, true, 1420380181);
                                    }
                                }

                                var10 = var0.field2739;
                                if (var10 != null) {
                                    for (var14 = 4; var14 >= 0; --var14) {
                                        if (var10[var14] != null) {
                                            byte var15 = 0;
                                            if (var14 == 0) {
                                                var15 = 39;
                                            }

                                            if (var14 == 1) {
                                                var15 = 40;
                                            }

                                            if (var14 == 2) {
                                                var15 = 41;
                                            }

                                            if (var14 == 3) {
                                                var15 = 42;
                                            }

                                            if (var14 == 4) {
                                                var15 = 43;
                                            }

                                            class79.method2039(var10[var14], class128
                                                                   .method3233(16748608, 1620674896) + var9.field3515,
                                                               var15, var9.field3557, var16,
                                                               var0.field2770, 322422706);
                                        }
                                    }
                                }

                                class79.method2039("Examine",
                                                   class128.method3233(16748608, 1207973196)
                                                       + var9.field3515, 1005, var9.field3557,
                                                   var16, var0.field2770, -691789188);
                            }
                        }
                    }

                    ++var16;
                }
            }
        }

        if (var0.field2685) {
            if (client.field798) {
                var5 = class254.method5000(var0, 2104117363);
                boolean var24 = (var5 >> 21 & 1) != 0;
                if (var24 && (class297.field3740 & 32) == 32) {
                    class79.method2039(client.field801,
                                       client.field716 + " " + "->" + " " + var0.field2697, 58, 0,
                                       var0.field2787, var0.field2770, -308252655);
                }
            } else {
                for (var16 = 9; var16 >= 5; --var16) {
                    var7 = class254.method5000(var0, 2141304884);
                    boolean var20 = (var7 >> var16 + 1 & 1) != 0;
                    String var17;
                    if (!var20 && var0.field2773 == null) {
                        var17 = null;
                    } else if (var0.field2731 != null && var0.field2731.length > var16
                        && var0.field2731[var16] != null
                        && var0.field2731[var16].trim().length() != 0) {
                        var17 = var0.field2731[var16];
                    } else {
                        var17 = null;
                    }

                    if (var17 != null) {
                        class79.method2039(var17, var0.field2697, 1007, var16 + 1, var0.field2787,
                                           var0.field2770, -779325860);
                    }
                }

                var4 = class86.method2167(var0, 1043758442);
                if (var4 != null) {
                    class79.method2039(var4, var0.field2697, 25, 0, var0.field2787, var0.field2770,
                                       -658080356);
                }

                for (var5 = 4; var5 >= 0; --var5) {
                    var8 = class254.method5000(var0, 2126403090);
                    boolean var22 = (var8 >> var5 + 1 & 1) != 0;
                    String var18;
                    if (!var22 && var0.field2773 == null) {
                        var18 = null;
                    } else if (var0.field2731 != null && var0.field2731.length > var5
                        && var0.field2731[var5] != null
                        && var0.field2731[var5].trim().length() != 0) {
                        var18 = var0.field2731[var5];
                    } else {
                        var18 = null;
                    }

                    if (var18 != null) {
                        class79.method2039(var18, var0.field2697, 57, var5 + 1, var0.field2787,
                                           var0.field2770, -851258426);
                    }
                }

                var6 = class254.method5000(var0, 2120730383);
                boolean var21 = (var6 & 1) != 0;
                if (var21) {
                    class79.method2039("Continue", "", 30, 0, var0.field2787, var0.field2770,
                                       -1150611608);
                }
            }
        }

    }

    protected final class121 vmethod3236(int var1) {
        class260 var2 = class250.method4918(this.field1092, 1198723990);
        class121 var3;
        if (!this.field1093) {
            var3 = var2.method5088(this.field1084, -254350739);
        } else {
            var3 = var2.method5088(-1, -1132145650);
        }

        return var3 == null ? null : var3;
    }

    final void method1954(int var1, byte var2) {
        if (!this.field1093) {
            this.field1094 += var1;

            while (this.field1094 > this.field1090.field3630[this.field1084]) {
                this.field1094 -= this.field1090.field3630[this.field1084];
                ++this.field1084;
                if (this.field1084 >= this.field1090.field3623.length) {
                    this.field1093 = true;
                    break;
                }
            }

        }
    }
}
