package jagex.osrs;

public class class53 {

    final int field529;
    final class251 field528;
    int field530;

    class53(class251 var1, String var2) {
        this.field530 = 0;
        this.field528 = var1;
        this.field529 = var1.method4841((byte) 41);
    }

    public static void method1076(class57 var0, int var1) {
        client.method1655(var0, 500000, 296778373);
    }

    static final void method1077(class232[] var0, int var1, byte var2) {
        for (int var3 = 0; var3 < var0.length; ++var3) {
            class232 var4 = var0[var3];
            if (var4 != null && var4.field2700 == var1 && (!var4.field2685 || !class42
                .method784(var4, -217422136))) {
                int var6;
                if (var4.field2808 == 0) {
                    if (!var4.field2685 && class42.method784(var4, -99870599)
                        && var4 != class153.field1993) {
                        continue;
                    }

                    method1077(var0, var4.field2770, (byte) 9);
                    if (var4.field2791 != null) {
                        method1077(var4.field2791, var4.field2770, (byte) 22);
                    }

                    class56 var5 = (class56) client.field804.method4224((long) var4.field2770);
                    if (var5 != null) {
                        var6 = var5.field556;
                        if (class189.method4028(var6, 1804235997)) {
                            method1077(class145.field1951[var6], -1, (byte) 29);
                        }
                    }
                }

                if (var4.field2808 == 6) {
                    if (var4.field2714 != -1 || var4.field2715 != -1) {
                        boolean var8 = class18.method239(var4, -2079901496);
                        if (var8) {
                            var6 = var4.field2715;
                        } else {
                            var6 = var4.field2714;
                        }

                        if (var6 != -1) {
                            class275 var7 = class29.method532(var6, -505413349);

                            for (var4.field2750 += client.field705;
                                 var4.field2750 > var7.field3630[var4.field2795];
                                 class37.method721(var4, 1238023037)) {
                                var4.field2750 -= var7.field3630[var4.field2795];
                                ++var4.field2795;
                                if (var4.field2795 >= var7.field3623.length) {
                                    var4.field2795 -= var7.field3624;
                                    if (var4.field2795 < 0
                                        || var4.field2795 >= var7.field3623.length) {
                                        var4.field2795 = 0;
                                    }
                                }
                            }
                        }
                    }

                    if (var4.field2723 != 0 && !var4.field2685) {
                        int var9 = var4.field2723 >> 16;
                        var6 = var4.field2723 << 16 >> 16;
                        var9 *= client.field705;
                        var6 *= client.field705;
                        var4.field2732 = var9 + var4.field2732 & 2047;
                        var4.field2719 = var6 + var4.field2719 & 2047;
                        class37.method721(var4, 1238023037);
                    }
                }
            }
        }

    }

    static final void method1082(boolean var0, PacketBuffer var1, byte var2) {
        client.field850 = 0;
        client.field779 = 0;
        PacketBuffer var3 = client.field690.field1283;
        var3.startBitAccess();
        int var4 = var3.readBits(8);
        int var5;
        if (var4 < client.field686) {
            for (var5 = var4; var5 < client.field686; ++var5) {
                client.field743[++client.field850 - 1] = client.field687[var5];
            }
        }

        if (var4 > client.field686) {
            throw new RuntimeException("");
        } else {
            client.field686 = 0;

            int var6;
            int var8;
            int var9;
            int var10;
            int var11;
            int var12;
            for (var5 = 0; var5 < var4; ++var5) {
                var6 = client.field687[var5];
                class73 var7 = client.field806[var6];
                var8 = var3.readBits(1);
                if (var8 == 0) {
                    client.field687[++client.field686 - 1] = var6;
                    var7.field988 = client.field655;
                } else {
                    var9 = var3.readBits(2);
                    if (var9 == 0) {
                        client.field687[++client.field686 - 1] = var6;
                        var7.field988 = client.field655;
                        client.field689[++client.field779 - 1] = var6;
                    } else if (var9 == 1) {
                        client.field687[++client.field686 - 1] = var6;
                        var7.field988 = client.field655;
                        var10 = var3.readBits(3);
                        var7.method1970(var10, (byte) 1, -2016432421);
                        var11 = var3.readBits(1);
                        if (var11 == 1) {
                            client.field689[++client.field779 - 1] = var6;
                        }
                    } else if (var9 == 2) {
                        client.field687[++client.field686 - 1] = var6;
                        var7.field988 = client.field655;
                        var10 = var3.readBits(3);
                        var7.method1970(var10, (byte) 2, -1755514279);
                        var11 = var3.readBits(3);
                        var7.method1970(var11, (byte) 2, -2134460727);
                        var12 = var3.readBits(1);
                        if (var12 == 1) {
                            client.field689[++client.field779 - 1] = var6;
                        }
                    } else if (var9 == 3) {
                        client.field743[++client.field850 - 1] = var6;
                    }
                }
            }

            int var15;
            class73 var16;
            int var17;
            while (var1.method4054(client.field690.packetLength, 66410185) >= 27) {
                var15 = var1.readBits(15);
                if (var15 == 32767) {
                    break;
                }

                boolean var18 = false;
                if (client.field806[var15] == null) {
                    client.field806[var15] = new class73();
                    var18 = true;
                }

                var16 = client.field806[var15];
                client.field687[++client.field686 - 1] = var15;
                var16.field988 = client.field655;
                if (var0) {
                    var6 = var1.readBits(8);
                    if (var6 > 127) {
                        var6 -= 256;
                    }
                } else {
                    var6 = var1.readBits(5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                }

                var17 = var1.readBits(1);
                var8 = client.field699[var1.readBits(3)];
                if (var18) {
                    var16.field990 = var16.field940 = var8;
                }

                var9 = var1.readBits(1);
                if (var9 == 1) {
                    client.field689[++client.field779 - 1] = var15;
                }

                if (var0) {
                    var10 = var1.readBits(8);
                    if (var10 > 127) {
                        var10 -= 256;
                    }
                } else {
                    var10 = var1.readBits(5);
                    if (var10 > 15) {
                        var10 -= 32;
                    }
                }

                var16.field1102 = class248
                    .method4823(var1.readBits(14), -1806003631);
                var16.field964 = var16.field1102.field3600;
                var16.field947 = var16.field1102.field3599;
                if (var16.field947 == 0) {
                    var16.field940 = 0;
                }

                var16.field942 = var16.field1102.field3593;
                var16.field948 = var16.field1102.field3577;
                var16.field949 = var16.field1102.field3578;
                var16.field950 = var16.field1102.field3579;
                var16.field944 = var16.field1102.field3573;
                var16.field945 = var16.field1102.field3580;
                var16.field957 = var16.field1102.field3575;
                var16.method1982(class69.localPlayer.wx[0] + var6,
                                 class69.localPlayer.wz[0] + var10, var17 == 1, 1165000296);
            }

            var1.endBitAccess();

            for (var15 = 0; var15 < client.field779; ++var15) {
                var4 = client.field689[var15];
                var16 = client.field806[var4];
                var6 = var1.getUByte();
                if ((var6 & 1) != 0) {
                    var16.field965 = var1.method3807(728802659);
                    if (var16.field965 == 65535) {
                        var16.field965 = -1;
                    }
                }

                if ((var6 & 64) != 0) {
                    var17 = var1.method3792(1750981734);
                    var8 = var1.method3792(951172637);
                    var9 = var16.x - (var17 - class49.sceneX - class49.sceneX) * 64;
                    var10 = var16.z - (var8 - class11.sceneZ - class11.sceneZ) * 64;
                    if (var9 != 0 || var10 != 0) {
                        var16.field967 =
                            (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 2047;
                    }
                }

                if ((var6 & 32) != 0) {
                    var17 = var1.readUint16();
                    if (var17 == 65535) {
                        var17 = -1;
                    }

                    var8 = var1.method3891((byte) 0);
                    if (var17 == var16.field971 && var17 != -1) {
                        var9 = class29.method532(var17, 2090578347).field3615;
                        if (var9 == 1) {
                            var16.field986 = 0;
                            var16.field989 = 0;
                            var16.field998 = var8;
                            var16.field975 = 0;
                        }

                        if (var9 == 2) {
                            var16.field975 = 0;
                        }
                    } else if (var17 == -1 || var16.field971 == -1
                        || class29.method532(var17, -506814260).field3627 >= class29
                        .method532(var16.field971, 1589949731).field3627) {
                        var16.field971 = var17;
                        var16.field986 = 0;
                        var16.field989 = 0;
                        var16.field998 = var8;
                        var16.field975 = 0;
                        var16.field959 = var16.field939;
                    }
                }

                if ((var6 & 4) != 0) {
                    var16.field1102 = class248.method4823(var1.readUint16(), 313219182);
                    var16.field964 = var16.field1102.field3600;
                    var16.field947 = var16.field1102.field3599;
                    var16.field942 = var16.field1102.field3593;
                    var16.field948 = var16.field1102.field3577;
                    var16.field949 = var16.field1102.field3578;
                    var16.field950 = var16.field1102.field3579;
                    var16.field944 = var16.field1102.field3573;
                    var16.field945 = var16.field1102.field3580;
                    var16.field957 = var16.field1102.field3575;
                }

                if ((var6 & 16) != 0) {
                    var17 = var1.method3799(-983952165);
                    int var13;
                    if (var17 > 0) {
                        for (var8 = 0; var8 < var17; ++var8) {
                            var10 = -1;
                            var11 = -1;
                            var12 = -1;
                            var9 = var1.method3783(1266853767);
                            if (var9 == 32767) {
                                var9 = var1.method3783(-1323214728);
                                var11 = var1.method3783(2132606137);
                                var10 = var1.method3783(1999115608);
                                var12 = var1.method3783(325186625);
                            } else if (var9 != 32766) {
                                var11 = var1.method3783(1716136208);
                            } else {
                                var9 = -1;
                            }

                            var13 = var1.method3783(1221090400);
                            var16.method1675(var9, var11, var10, var12, client.field655, var13,
                                             1556935178);
                        }
                    }

                    var8 = var1.method3883((byte) 70);
                    if (var8 > 0) {
                        for (var9 = 0; var9 < var8; ++var9) {
                            var10 = var1.method3783(-1670994095);
                            var11 = var1.method3783(-1399177794);
                            if (var11 != 32767) {
                                var12 = var1.method3783(-1247300896);
                                var13 = var1.getUByte();
                                int var14 = var11 > 0 ? var1.method3891((byte) 0) : var13;
                                var16.method1677(var10, client.field655, var11, var12, var13, var14,
                                                 -49087894);
                            } else {
                                var16.method1663(var10, -171357995);
                            }
                        }
                    }
                }

                if ((var6 & 8) != 0) {
                    var16.field976 = var1.method3807(1223520005);
                    var17 = var1.method3964(287627655);
                    var16.field980 = var17 >> 16;
                    var16.field979 = (var17 & 65535) + client.field655;
                    var16.field993 = 0;
                    var16.field978 = 0;
                    if (var16.field979 > client.field655) {
                        var16.field993 = -1;
                    }

                    if (var16.field976 == 65535) {
                        var16.field976 = -1;
                    }
                }

                if ((var6 & 2) != 0) {
                    var16.field968 = var1.method3778(-1133013925);
                    var16.field981 = 100;
                }
            }

            for (var15 = 0; var15 < client.field850; ++var15) {
                var4 = client.field743[var15];
                if (client.field806[var4].field988 != client.field655) {
                    client.field806[var4].field1102 = null;
                    client.field806[var4] = null;
                }
            }

            if (var1.offset != client.field690.packetLength) {
                throw new RuntimeException(var1.offset + "," + client.field690.packetLength);
            } else {
                for (var15 = 0; var15 < client.field686; ++var15) {
                    if (client.field806[client.field687[var15]] == null) {
                        throw new RuntimeException(var15 + "," + client.field686);
                    }
                }

            }
        }
    }

    static final void method1080(class232 var0, int var1, int var2, int var3, int var4, int var5,
                                 int var6, int var7) {
        if (client.field694) {
            client.field802 = 32;
        } else {
            client.field802 = 0;
        }

        client.field694 = false;
        int var8;
        if (class48.field469 == 1 || !class14.field132 && class48.field469 == 4) {
            if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) {
                var0.field2689 -= 4;
                class37.method721(var0, 1238023037);
            } else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16
                && var6 < var3 + var2) {
                var0.field2689 += 4;
                class37.method721(var0, 1238023037);
            } else if (var5 >= var1 - client.field802 && var5 < client.field802 + var1 + 16
                && var6 >= var2 + 16 && var6 < var3 + var2 - 16) {
                var8 = var3 * (var3 - 32) / var4;
                if (var8 < 8) {
                    var8 = 8;
                }

                int var9 = var6 - var2 - 16 - var8 / 2;
                int var10 = var3 - 32 - var8;
                var0.field2689 = var9 * (var4 - var3) / var10;
                class37.method721(var0, 1238023037);
                client.field694 = true;
            }
        }

        if (client.field841 != 0) {
            var8 = var0.field2682;
            if (var5 >= var1 - var8 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) {
                var0.field2689 += client.field841 * 45;
                class37.method721(var0, 1238023037);
            }
        }

    }

    boolean method1075(int var1) {
        this.field530 = 0;

        for (int var2 = 0; var2 < this.field529; ++var2) {
            if (!this.field528.method4961(var2, -1464037685) || this.field528
                .method4931(var2, -506355403)) {
                ++this.field530;
            }
        }

        return this.field530 >= this.field529;
    }
}
