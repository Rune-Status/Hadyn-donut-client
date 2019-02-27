package jagex.osrs;

public class class15 implements class190 {

    static final class15 field136;
    static final class15 field144;
    static final class15 field135;
    static final class15 field141;
    static int field143;

    static {
        field136 = new class15(3, (byte) 0);
        field135 = new class15(1, (byte) 1);
        field144 = new class15(0, (byte) 2);
        field141 = new class15(2, (byte) 3);
    }

    final byte field139;
    final int field137;

    class15(int var1, byte var2) {
        this.field137 = var1;
        this.field139 = var2;
    }

    static class15[] method170(short var0) {
        return new class15[]{field136, field144, field141, field135};
    }

    static final void method178(int var0, int var1, int var2, int var3, String var4, String var5,
                                int var6, int var7, int var8) {
        if (var2 >= 2000) {
            var2 -= 2000;
        }

        OutboundPacket var9;
        if (var2 == 1) {
            client.field744 = var6;
            client.field745 = var7;
            client.field759 = 2;
            client.field809 = 0;
            client.field722 = var0;
            client.field875 = var1;
            var9 = class131.method3243(class171.field2252, client.field690.random, (byte) 71);
            var9.buffer.method3806(class11.sceneZ + var1, 306692943);
            var9.buffer.method3869(class22.field220, (byte) 1);
            var9.buffer.method3795(class39.field380[82] ? 1 : 0, 506308590);
            var9.buffer.method3813(class88.field1276, (byte) -24);
            var9.buffer.method3806(var0 + class49.sceneX, -1535054511);
            var9.buffer.writeShort(var3);
            var9.buffer.method3869(class6.field51, (byte) 1);
            client.field690.method2193(var9, -606975537);
        } else if (var2 == 2) {
            client.field744 = var6;
            client.field745 = var7;
            client.field759 = 2;
            client.field809 = 0;
            client.field722 = var0;
            client.field875 = var1;
            var9 = class131.method3243(class171.field2299, client.field690.random, (byte) 120);
            var9.buffer.writeByte(class39.field380[82] ? 1 : 0);
            var9.buffer.writeShort(var0 + class49.sceneX);
            var9.buffer.method3887(var3, 289154243);
            var9.buffer.method3939(class306.field3796, -295803274);
            var9.buffer.writeShort(client.field799);
            var9.buffer.method3869(class11.sceneZ + var1, (byte) 1);
            client.field690.method2193(var9, 1200394337);
        } else if (var2 == 3) {
            client.field744 = var6;
            client.field745 = var7;
            client.field759 = 2;
            client.field809 = 0;
            client.field722 = var0;
            client.field875 = var1;
            var9 = class131.method3243(class171.field2304, client.field690.random, (byte) 49);
            var9.buffer.writeShort(class11.sceneZ + var1);
            var9.buffer.method3797(class39.field380[82] ? 1 : 0, -1608402500);
            var9.buffer.method3887(var3, 289154243);
            var9.buffer.method3806(var0 + class49.sceneX, 304969554);
            client.field690.method2193(var9, -138431211);
        } else if (var2 == 4) {
            client.field744 = var6;
            client.field745 = var7;
            client.field759 = 2;
            client.field809 = 0;
            client.field722 = var0;
            client.field875 = var1;
            var9 = class131.method3243(class171.field2286, client.field690.random, (byte) 118);
            var9.buffer.method3795(class39.field380[82] ? 1 : 0, 506308590);
            var9.buffer.writeShort(var3);
            var9.buffer.writeShort(class11.sceneZ + var1);
            var9.buffer.writeShort(var0 + class49.sceneX);
            client.field690.method2193(var9, 403687782);
        } else if (var2 == 5) {
            client.field744 = var6;
            client.field745 = var7;
            client.field759 = 2;
            client.field809 = 0;
            client.field722 = var0;
            client.field875 = var1;
            var9 = class131.method3243(class171.field2259, client.field690.random, (byte) 86);
            var9.buffer.method3806(var0 + class49.sceneX, -857855362);
            var9.buffer.method3887(var3, 289154243);
            var9.buffer.method3806(class11.sceneZ + var1, -578484661);
            var9.buffer.method3795(class39.field380[82] ? 1 : 0, 506308590);
            client.field690.method2193(var9, 242675773);
        } else if (var2 == 6) {
            client.field744 = var6;
            client.field745 = var7;
            client.field759 = 2;
            client.field809 = 0;
            client.field722 = var0;
            client.field875 = var1;
            var9 = class131.method3243(class171.field2210, client.field690.random, (byte) 92);
            var9.buffer.method3795(class39.field380[82] ? 1 : 0, 506308590);
            var9.buffer.method3887(class11.sceneZ + var1, 289154243);
            var9.buffer.method3887(var0 + class49.sceneX, 289154243);
            var9.buffer.method3869(var3, (byte) 1);
            client.field690.method2193(var9, 1152428288);
        } else {
            OutboundPacket var10;
            class73 var14;
            if (var2 == 7) {
                var14 = client.field806[var3];
                if (var14 != null) {
                    client.field744 = var6;
                    client.field745 = var7;
                    client.field759 = 2;
                    client.field809 = 0;
                    client.field722 = var0;
                    client.field875 = var1;
                    var10 = class131
                        .method3243(class171.field2217, client.field690.random, (byte) 57);
                    var10.buffer.method3806(class6.field51, 62422773);
                    var10.buffer.writeShort(class22.field220);
                    var10.buffer.method3806(var3, -1532045054);
                    var10.buffer.method3796(class39.field380[82] ? 1 : 0, 1292848374);
                    var10.buffer.writeInt(class88.field1276);
                    client.field690.method2193(var10, 298440507);
                }
            } else if (var2 == 8) {
                var14 = client.field806[var3];
                if (var14 != null) {
                    client.field744 = var6;
                    client.field745 = var7;
                    client.field759 = 2;
                    client.field809 = 0;
                    client.field722 = var0;
                    client.field875 = var1;
                    var10 = class131
                        .method3243(class171.field2213, client.field690.random, (byte) 72);
                    var10.buffer.method3806(var3, -2048537206);
                    var10.buffer.method3796(class39.field380[82] ? 1 : 0, 315242026);
                    var10.buffer.method3813(class306.field3796, (byte) 28);
                    var10.buffer.method3887(client.field799, 289154243);
                    client.field690.method2193(var10, 2095602589);
                }
            } else if (var2 == 9) {
                var14 = client.field806[var3];
                if (var14 != null) {
                    client.field744 = var6;
                    client.field745 = var7;
                    client.field759 = 2;
                    client.field809 = 0;
                    client.field722 = var0;
                    client.field875 = var1;
                    var10 = class131
                        .method3243(class171.field2212, client.field690.random, (byte) 31);
                    var10.buffer.method3796(class39.field380[82] ? 1 : 0, -1645531027);
                    var10.buffer.method3869(var3, (byte) 1);
                    client.field690.method2193(var10, -773344946);
                }
            } else if (var2 == 10) {
                var14 = client.field806[var3];
                if (var14 != null) {
                    client.field744 = var6;
                    client.field745 = var7;
                    client.field759 = 2;
                    client.field809 = 0;
                    client.field722 = var0;
                    client.field875 = var1;
                    var10 = class131
                        .method3243(class171.field2208, client.field690.random, (byte) 91);
                    var10.buffer.method3887(var3, 289154243);
                    var10.buffer.writeByte(class39.field380[82] ? 1 : 0);
                    client.field690.method2193(var10, 1656901790);
                }
            } else if (var2 == 11) {
                var14 = client.field806[var3];
                if (var14 != null) {
                    client.field744 = var6;
                    client.field745 = var7;
                    client.field759 = 2;
                    client.field809 = 0;
                    client.field722 = var0;
                    client.field875 = var1;
                    var10 = class131
                        .method3243(class171.field2277, client.field690.random, (byte) 14);
                    var10.buffer.method3806(var3, -648298335);
                    var10.buffer.writeByte(class39.field380[82] ? 1 : 0);
                    client.field690.method2193(var10, -674974055);
                }
            } else if (var2 == 12) {
                var14 = client.field806[var3];
                if (var14 != null) {
                    client.field744 = var6;
                    client.field745 = var7;
                    client.field759 = 2;
                    client.field809 = 0;
                    client.field722 = var0;
                    client.field875 = var1;
                    var10 = class131
                        .method3243(class171.field2266, client.field690.random, (byte) 122);
                    var10.buffer.writeShort(var3);
                    var10.buffer.method3795(class39.field380[82] ? 1 : 0, 506308590);
                    client.field690.method2193(var10, -117554521);
                }
            } else if (var2 == 13) {
                var14 = client.field806[var3];
                if (var14 != null) {
                    client.field744 = var6;
                    client.field745 = var7;
                    client.field759 = 2;
                    client.field809 = 0;
                    client.field722 = var0;
                    client.field875 = var1;
                    var10 = class131
                        .method3243(class171.field2262, client.field690.random, (byte) 124);
                    var10.buffer.writeByte(class39.field380[82] ? 1 : 0);
                    var10.buffer.method3887(var3, 289154243);
                    client.field690.method2193(var10, -860337217);
                }
            } else {
                Player var16;
                if (var2 == 14) {
                    var16 = client.players[var3];
                    if (var16 != null) {
                        client.field744 = var6;
                        client.field745 = var7;
                        client.field759 = 2;
                        client.field809 = 0;
                        client.field722 = var0;
                        client.field875 = var1;
                        var10 = class131
                            .method3243(class171.field2288, client.field690.random, (byte) 94);
                        var10.buffer.method3806(class22.field220, -1224941199);
                        var10.buffer.method3797(class39.field380[82] ? 1 : 0, -2125890607);
                        var10.buffer.method3893(class88.field1276, (byte) 56);
                        var10.buffer.writeShort(var3);
                        var10.buffer.writeShort(class6.field51);
                        client.field690.method2193(var10, 1052111778);
                    }
                } else if (var2 == 15) {
                    var16 = client.players[var3];
                    if (var16 != null) {
                        client.field744 = var6;
                        client.field745 = var7;
                        client.field759 = 2;
                        client.field809 = 0;
                        client.field722 = var0;
                        client.field875 = var1;
                        var10 = class131
                            .method3243(class171.field2244, client.field690.random, (byte) 44);
                        var10.buffer.method3939(class306.field3796, -295803274);
                        var10.buffer.method3797(class39.field380[82] ? 1 : 0, -1978948631);
                        var10.buffer.method3887(client.field799, 289154243);
                        var10.buffer.writeShort(var3);
                        client.field690.method2193(var10, 858585927);
                    }
                } else if (var2 == 16) {
                    client.field744 = var6;
                    client.field745 = var7;
                    client.field759 = 2;
                    client.field809 = 0;
                    client.field722 = var0;
                    client.field875 = var1;
                    var9 = class131
                        .method3243(class171.field2225, client.field690.random, (byte) 78);
                    var9.buffer.method3893(class88.field1276, (byte) 96);
                    var9.buffer.method3806(class6.field51, -529736150);
                    var9.buffer.method3795(class39.field380[82] ? 1 : 0, 506308590);
                    var9.buffer.method3869(class22.field220, (byte) 1);
                    var9.buffer.method3806(var3, -891611384);
                    var9.buffer.method3806(var0 + class49.sceneX, 33661201);
                    var9.buffer.method3869(class11.sceneZ + var1, (byte) 1);
                    client.field690.method2193(var9, -330497594);
                } else if (var2 == 17) {
                    client.field744 = var6;
                    client.field745 = var7;
                    client.field759 = 2;
                    client.field809 = 0;
                    client.field722 = var0;
                    client.field875 = var1;
                    var9 = class131
                        .method3243(class171.field2251, client.field690.random, (byte) 35);
                    var9.buffer.method3893(class306.field3796, (byte) 70);
                    var9.buffer.writeShort(client.field799);
                    var9.buffer.method3887(class11.sceneZ + var1, 289154243);
                    var9.buffer.method3887(var0 + class49.sceneX, 289154243);
                    var9.buffer.method3795(class39.field380[82] ? 1 : 0, 506308590);
                    var9.buffer.method3869(var3, (byte) 1);
                    client.field690.method2193(var9, 1947276571);
                } else if (var2 == 18) {
                    client.field744 = var6;
                    client.field745 = var7;
                    client.field759 = 2;
                    client.field809 = 0;
                    client.field722 = var0;
                    client.field875 = var1;
                    var9 = class131
                        .method3243(class171.field2216, client.field690.random, (byte) 20);
                    var9.buffer.method3806(class11.sceneZ + var1, -1329888075);
                    var9.buffer.method3869(var3, (byte) 1);
                    var9.buffer.method3869(var0 + class49.sceneX, (byte) 1);
                    var9.buffer.writeByte(class39.field380[82] ? 1 : 0);
                    client.field690.method2193(var9, 1427836537);
                } else if (var2 == 19) {
                    client.field744 = var6;
                    client.field745 = var7;
                    client.field759 = 2;
                    client.field809 = 0;
                    client.field722 = var0;
                    client.field875 = var1;
                    var9 = class131
                        .method3243(class171.field2281, client.field690.random, (byte) 104);
                    var9.buffer.method3806(var3, -1866617835);
                    var9.buffer.method3887(var0 + class49.sceneX, 289154243);
                    var9.buffer.writeShort(class11.sceneZ + var1);
                    var9.buffer.writeByte(class39.field380[82] ? 1 : 0);
                    client.field690.method2193(var9, -1032363250);
                } else if (var2 == 20) {
                    client.field744 = var6;
                    client.field745 = var7;
                    client.field759 = 2;
                    client.field809 = 0;
                    client.field722 = var0;
                    client.field875 = var1;
                    var9 = class131
                        .method3243(class171.field2279, client.field690.random, (byte) 78);
                    var9.buffer.method3869(class11.sceneZ + var1, (byte) 1);
                    var9.buffer.method3797(class39.field380[82] ? 1 : 0, -1423717030);
                    var9.buffer.method3869(var0 + class49.sceneX, (byte) 1);
                    var9.buffer.method3869(var3, (byte) 1);
                    client.field690.method2193(var9, -398513032);
                } else if (var2 == 21) {
                    client.field744 = var6;
                    client.field745 = var7;
                    client.field759 = 2;
                    client.field809 = 0;
                    client.field722 = var0;
                    client.field875 = var1;
                    var9 = class131
                        .method3243(class171.field2293, client.field690.random, (byte) 54);
                    var9.buffer.method3887(class11.sceneZ + var1, 289154243);
                    var9.buffer.method3869(var3, (byte) 1);
                    var9.buffer.writeShort(var0 + class49.sceneX);
                    var9.buffer.method3797(class39.field380[82] ? 1 : 0, -1771673323);
                    client.field690.method2193(var9, 156306335);
                } else if (var2 == 22) {
                    client.field744 = var6;
                    client.field745 = var7;
                    client.field759 = 2;
                    client.field809 = 0;
                    client.field722 = var0;
                    client.field875 = var1;
                    var9 = class131
                        .method3243(class171.field2258, client.field690.random, (byte) 98);
                    var9.buffer.writeByte(class39.field380[82] ? 1 : 0);
                    var9.buffer.method3806(var3, -2122676503);
                    var9.buffer.method3887(class11.sceneZ + var1, 289154243);
                    var9.buffer.writeShort(var0 + class49.sceneX);
                    client.field690.method2193(var9, 1040295098);
                } else if (var2 == 23) {
                    if (client.field833) {
                        class243.field3173.method3095();
                    } else {
                        class243.field3173.method3080(class60.level, var0, var1, true);
                    }
                } else {
                    OutboundPacket var11;
                    class232 var17;
                    if (var2 == 24) {
                        var17 = class18.method213(var1, -1390771173);
                        boolean var12 = true;
                        if (var17.field2741 > 0) {
                            var12 = class14.method145(var17, -925112087);
                        }

                        if (var12) {
                            var11 = class131
                                .method3243(class171.field2276, client.field690.random,
                                            (byte) 5);
                            var11.buffer.writeInt(var1);
                            client.field690.method2193(var11, 1686903844);
                        }
                    } else {
                        if (var2 == 25) {
                            var17 = class9.method102(var1, var0, -83403454);
                            if (var17 != null) {
                                class134.method3264(1996217068);
                                class62.method1232(var1, var0, class9
                                                       .method98(class254.method5000(var17, 2134482714), (byte) 19),
                                                   var17.field2793, (byte) -85);
                                client.field796 = 0;
                                client.field801 = class86.method2167(var17, 1875176643);
                                if (client.field801 == null) {
                                    client.field801 = "null";
                                }

                                if (var17.field2685) {
                                    client.field716 =
                                        var17.field2697 + class128.method3233(16777215, 2025168103);
                                } else {
                                    client.field716 =
                                        class128.method3233(65280, 555180979) + var17.field2677
                                            + class128.method3233(16777215, 1523439764);
                                }
                            }

                            return;
                        }

                        if (var2 == 26) {
                            class42.method783(1952311603);
                        } else {
                            int var13;
                            class232 var15;
                            if (var2 == 28) {
                                var9 = class131
                                    .method3243(class171.field2276, client.field690.random,
                                                (byte) 56);
                                var9.buffer.writeInt(var1);
                                client.field690.method2193(var9, -954901716);
                                var15 = class18.method213(var1, -1502854988);
                                if (var15.field2785 != null && var15.field2785[0][0] == 5) {
                                    var13 = var15.field2785[0][1];
                                    class227.field2629[var13] = 1 - class227.field2629[var13];
                                    class223.method4595(var13, -1750193407);
                                }
                            } else if (var2 == 29) {
                                var9 = class131
                                    .method3243(class171.field2276, client.field690.random,
                                                (byte) 107);
                                var9.buffer.writeInt(var1);
                                client.field690.method2193(var9, 744207457);
                                var15 = class18.method213(var1, -1839300423);
                                if (var15.field2785 != null && var15.field2785[0][0] == 5) {
                                    var13 = var15.field2785[0][1];
                                    if (class227.field2629[var13] != var15.field2778[0]) {
                                        class227.field2629[var13] = var15.field2778[0];
                                        class223.method4595(var13, -1750193407);
                                    }
                                }
                            } else if (var2 == 30) {
                                if (client.field880 == null) {
                                    class275.method5474(var1, var0, -719831937);
                                    client.field880 = class9.method102(var1, var0, -1832191649);
                                    class37.method721(client.field880, 1238023037);
                                }
                            } else if (var2 == 31) {
                                var9 = class131
                                    .method3243(class171.field2270, client.field690.random,
                                                (byte) 41);
                                var9.buffer.method3893(var1, (byte) 75);
                                var9.buffer.method3939(class88.field1276, -295803274);
                                var9.buffer.method3806(class22.field220, -342647995);
                                var9.buffer.method3869(class6.field51, (byte) 1);
                                var9.buffer.method3869(var0, (byte) 1);
                                var9.buffer.method3806(var3, -1727715053);
                                client.field690.method2193(var9, -708531292);
                                client.field749 = 0;
                                class179.field2357 = class18.method213(var1, -298072491);
                                client.field750 = var0;
                            } else if (var2 == 32) {
                                var9 = class131
                                    .method3243(class171.field2209, client.field690.random,
                                                (byte) 20);
                                var9.buffer.method3893(class306.field3796, (byte) 19);
                                var9.buffer.writeInt(var1);
                                var9.buffer.writeShort(var0);
                                var9.buffer.method3869(var3, (byte) 1);
                                var9.buffer.method3869(client.field799, (byte) 1);
                                client.field690.method2193(var9, 1925658993);
                                client.field749 = 0;
                                class179.field2357 = class18.method213(var1, -669932486);
                                client.field750 = var0;
                            } else if (var2 == 33) {
                                var9 = class131
                                    .method3243(class171.field2294, client.field690.random,
                                                (byte) 6);
                                var9.buffer.method3869(var3, (byte) 1);
                                var9.buffer.method3893(var1, (byte) 124);
                                var9.buffer.writeShort(var0);
                                client.field690.method2193(var9, 1957953058);
                                client.field749 = 0;
                                class179.field2357 = class18.method213(var1, -1152219891);
                                client.field750 = var0;
                            } else if (var2 == 34) {
                                var9 = class131
                                    .method3243(class171.field2305, client.field690.random,
                                                (byte) 78);
                                var9.buffer.method3887(var3, 289154243);
                                var9.buffer.method3939(var1, -295803274);
                                var9.buffer.method3806(var0, 593630343);
                                client.field690.method2193(var9, 1322592791);
                                client.field749 = 0;
                                class179.field2357 = class18.method213(var1, -685796575);
                                client.field750 = var0;
                            } else if (var2 == 35) {
                                var9 = class131
                                    .method3243(class171.field2296, client.field690.random,
                                                (byte) 42);
                                var9.buffer.method3813(var1, (byte) 105);
                                var9.buffer.method3806(var0, -1127922584);
                                var9.buffer.method3806(var3, -1000629307);
                                client.field690.method2193(var9, 1939322470);
                                client.field749 = 0;
                                class179.field2357 = class18.method213(var1, -1593665769);
                                client.field750 = var0;
                            } else if (var2 == 36) {
                                var9 = class131
                                    .method3243(class171.field2240, client.field690.random,
                                                (byte) 28);
                                var9.buffer.method3806(var3, -1625403708);
                                var9.buffer.writeInt(var1);
                                var9.buffer.method3806(var0, -937845578);
                                client.field690.method2193(var9, 160222977);
                                client.field749 = 0;
                                class179.field2357 = class18.method213(var1, -2142830244);
                                client.field750 = var0;
                            } else if (var2 == 37) {
                                var9 = class131
                                    .method3243(class171.field2265, client.field690.random,
                                                (byte) 83);
                                var9.buffer.writeInt(var1);
                                var9.buffer.writeShort(var0);
                                var9.buffer.writeShort(var3);
                                client.field690.method2193(var9, 515258763);
                                client.field749 = 0;
                                class179.field2357 = class18.method213(var1, -1921456081);
                                client.field750 = var0;
                            } else {
                                if (var2 == 38) {
                                    class134.method3264(1424678820);
                                    var17 = class18.method213(var1, -1761723768);
                                    client.field796 = 1;
                                    class22.field220 = var0;
                                    class88.field1276 = var1;
                                    class6.field51 = var3;
                                    class37.method721(var17, 1238023037);
                                    client.field766 =
                                        class128.method3233(16748608, 1839432392) + ItemConfig
                                            .get(var3).field3515 + class128
                                            .method3233(16777215, 1739387188);
                                    if (client.field766 == null) {
                                        client.field766 = "null";
                                    }

                                    return;
                                }

                                if (var2 == 39) {
                                    var9 = class131
                                        .method3243(class171.field2254, client.field690.random,
                                                    (byte) 70);
                                    var9.buffer.method3806(var3, -1124941315);
                                    var9.buffer.method3939(var1, -295803274);
                                    var9.buffer.method3869(var0, (byte) 1);
                                    client.field690.method2193(var9, 2112710172);
                                    client.field749 = 0;
                                    class179.field2357 = class18.method213(var1, -2145897103);
                                    client.field750 = var0;
                                } else if (var2 == 40) {
                                    var9 = class131
                                        .method3243(class171.field2233, client.field690.random,
                                                    (byte) 50);
                                    var9.buffer.method3939(var1, -295803274);
                                    var9.buffer.method3869(var0, (byte) 1);
                                    var9.buffer.method3887(var3, 289154243);
                                    client.field690.method2193(var9, -963694463);
                                    client.field749 = 0;
                                    class179.field2357 = class18.method213(var1, -653850903);
                                    client.field750 = var0;
                                } else if (var2 == 41) {
                                    var9 = class131
                                        .method3243(class171.field2268, client.field690.random,
                                                    (byte) 35);
                                    var9.buffer.method3813(var1, (byte) -14);
                                    var9.buffer.method3887(var0, 289154243);
                                    var9.buffer.writeShort(var3);
                                    client.field690.method2193(var9, 303339207);
                                    client.field749 = 0;
                                    class179.field2357 = class18.method213(var1, -76964929);
                                    client.field750 = var0;
                                } else if (var2 == 42) {
                                    var9 = class131
                                        .method3243(class171.field2271, client.field690.random,
                                                    (byte) 35);
                                    var9.buffer.writeInt(var1);
                                    var9.buffer.method3887(var0, 289154243);
                                    var9.buffer.writeShort(var3);
                                    client.field690.method2193(var9, -799086353);
                                    client.field749 = 0;
                                    class179.field2357 = class18.method213(var1, -2072336047);
                                    client.field750 = var0;
                                } else if (var2 == 43) {
                                    var9 = class131
                                        .method3243(class171.field2239, client.field690.random,
                                                    (byte) 87);
                                    var9.buffer.writeShort(var3);
                                    var9.buffer.method3893(var1, (byte) 82);
                                    var9.buffer.writeShort(var0);
                                    client.field690.method2193(var9, 1356874427);
                                    client.field749 = 0;
                                    class179.field2357 = class18.method213(var1, -1083605555);
                                    client.field750 = var0;
                                } else if (var2 == 44) {
                                    var16 = client.players[var3];
                                    if (var16 != null) {
                                        client.field744 = var6;
                                        client.field745 = var7;
                                        client.field759 = 2;
                                        client.field809 = 0;
                                        client.field722 = var0;
                                        client.field875 = var1;
                                        var10 = class131.method3243(class171.field2308,
                                                                    client.field690.random,
                                                                    (byte) 58);
                                        var10.buffer.writeShort(var3);
                                        var10.buffer
                                            .method3796(class39.field380[82] ? 1 : 0, -1339375024);
                                        client.field690.method2193(var10, -370932638);
                                    }
                                } else if (var2 == 45) {
                                    var16 = client.players[var3];
                                    if (var16 != null) {
                                        client.field744 = var6;
                                        client.field745 = var7;
                                        client.field759 = 2;
                                        client.field809 = 0;
                                        client.field722 = var0;
                                        client.field875 = var1;
                                        var10 = class131.method3243(class171.field2263,
                                                                    client.field690.random,
                                                                    (byte) 13);
                                        var10.buffer
                                            .method3795(class39.field380[82] ? 1 : 0, 506308590);
                                        var10.buffer.method3887(var3, 289154243);
                                        client.field690.method2193(var10, 118266402);
                                    }
                                } else if (var2 == 46) {
                                    var16 = client.players[var3];
                                    if (var16 != null) {
                                        client.field744 = var6;
                                        client.field745 = var7;
                                        client.field759 = 2;
                                        client.field809 = 0;
                                        client.field722 = var0;
                                        client.field875 = var1;
                                        var10 = class131.method3243(class171.field2248,
                                                                    client.field690.random,
                                                                    (byte) 100);
                                        var10.buffer.method3887(var3, 289154243);
                                        var10.buffer
                                            .writeByte(class39.field380[82] ? 1 : 0);
                                        client.field690.method2193(var10, -642453267);
                                    }
                                } else if (var2 == 47) {
                                    var16 = client.players[var3];
                                    if (var16 != null) {
                                        client.field744 = var6;
                                        client.field745 = var7;
                                        client.field759 = 2;
                                        client.field809 = 0;
                                        client.field722 = var0;
                                        client.field875 = var1;
                                        var10 = class131.method3243(class171.field2236,
                                                                    client.field690.random,
                                                                    (byte) 37);
                                        var10.buffer.method3806(var3, -972026653);
                                        var10.buffer
                                            .method3796(class39.field380[82] ? 1 : 0, 1932439877);
                                        client.field690.method2193(var10, -242687310);
                                    }
                                } else if (var2 == 48) {
                                    var16 = client.players[var3];
                                    if (var16 != null) {
                                        client.field744 = var6;
                                        client.field745 = var7;
                                        client.field759 = 2;
                                        client.field809 = 0;
                                        client.field722 = var0;
                                        client.field875 = var1;
                                        var10 = class131.method3243(class171.field2290,
                                                                    client.field690.random,
                                                                    (byte) 96);
                                        var10.buffer
                                            .method3795(class39.field380[82] ? 1 : 0, 506308590);
                                        var10.buffer.method3887(var3, 289154243);
                                        client.field690.method2193(var10, -534466346);
                                    }
                                } else if (var2 == 49) {
                                    var16 = client.players[var3];
                                    if (var16 != null) {
                                        client.field744 = var6;
                                        client.field745 = var7;
                                        client.field759 = 2;
                                        client.field809 = 0;
                                        client.field722 = var0;
                                        client.field875 = var1;
                                        var10 = class131.method3243(class171.field2300,
                                                                    client.field690.random,
                                                                    (byte) 123);
                                        var10.buffer.method3887(var3, 289154243);
                                        var10.buffer
                                            .method3797(class39.field380[82] ? 1 : 0, -1814380288);
                                        client.field690.method2193(var10, 563920046);
                                    }
                                } else if (var2 == 50) {
                                    var16 = client.players[var3];
                                    if (var16 != null) {
                                        client.field744 = var6;
                                        client.field745 = var7;
                                        client.field759 = 2;
                                        client.field809 = 0;
                                        client.field722 = var0;
                                        client.field875 = var1;
                                        var10 = class131.method3243(class171.field2282,
                                                                    client.field690.random,
                                                                    (byte) 100);
                                        var10.buffer
                                            .method3797(class39.field380[82] ? 1 : 0, -1424409003);
                                        var10.buffer.method3869(var3, (byte) 1);
                                        client.field690.method2193(var10, -187193772);
                                    }
                                } else if (var2 == 51) {
                                    var16 = client.players[var3];
                                    if (var16 != null) {
                                        client.field744 = var6;
                                        client.field745 = var7;
                                        client.field759 = 2;
                                        client.field809 = 0;
                                        client.field722 = var0;
                                        client.field875 = var1;
                                        var10 = class131.method3243(class171.field2261,
                                                                    client.field690.random,
                                                                    (byte) 8);
                                        var10.buffer
                                            .method3796(class39.field380[82] ? 1 : 0, 1986386046);
                                        var10.buffer.method3806(var3, -1166318730);
                                        client.field690.method2193(var10, 929724499);
                                    }
                                } else {
                                    label1001:
                                    {
                                        if (var2 != 57) {
                                            if (var2 == 58) {
                                                var17 = class9.method102(var1, var0, 1652662766);
                                                if (var17 != null) {
                                                    var10 = class131.method3243(class171.field2289,
                                                                                client.field690.random,
                                                                                (byte) 121);
                                                    var10.buffer
                                                        .method3869(client.field799, (byte) 1);
                                                    var10.buffer.method3939(var1, -295803274);
                                                    var10.buffer
                                                        .method3869(client.field734, (byte) 1);
                                                    var10.buffer.method3806(var0, -1446547043);
                                                    var10.buffer
                                                        .writeInt(class306.field3796);
                                                    var10.buffer
                                                        .method3806(var17.field2793, -753736673);
                                                    client.field690.method2193(var10, 249210222);
                                                }
                                                break label1001;
                                            }

                                            if (var2 == 1001) {
                                                client.field744 = var6;
                                                client.field745 = var7;
                                                client.field759 = 2;
                                                client.field809 = 0;
                                                client.field722 = var0;
                                                client.field875 = var1;
                                                var9 = class131.method3243(class171.field2301,
                                                                           client.field690.random,
                                                                           (byte) 118);
                                                var9.buffer.writeShort(var3);
                                                var9.buffer
                                                    .method3795(class39.field380[82] ? 1 : 0,
                                                                506308590);
                                                var9.buffer
                                                    .method3887(var0 + class49.sceneX, 289154243);
                                                var9.buffer.method3806(class11.sceneZ + var1,
                                                                       -1913214142);
                                                client.field690.method2193(var9, 1050600395);
                                                break label1001;
                                            }

                                            if (var2 == 1002) {
                                                client.field744 = var6;
                                                client.field745 = var7;
                                                client.field759 = 2;
                                                client.field809 = 0;
                                                var9 = class131.method3243(class171.field2243,
                                                                           client.field690.random,
                                                                           (byte) 49);
                                                var9.buffer.method3887(var3, 289154243);
                                                client.field690.method2193(var9, 251486381);
                                                break label1001;
                                            }

                                            if (var2 == 1003) {
                                                client.field744 = var6;
                                                client.field745 = var7;
                                                client.field759 = 2;
                                                client.field809 = 0;
                                                var14 = client.field806[var3];
                                                if (var14 != null) {
                                                    class273 var18 = var14.field1102;
                                                    if (var18.field3595 != null) {
                                                        var18 = var18.method5397((byte) 70);
                                                    }

                                                    if (var18 != null) {
                                                        var11 = class131
                                                            .method3243(class171.field2237,
                                                                        client.field690.random,
                                                                        (byte) 40);
                                                        var11.buffer
                                                            .method3887(var18.field3568, 289154243);
                                                        client.field690.method2193(var11, 90032456);
                                                    }
                                                }
                                                break label1001;
                                            }

                                            if (var2 == 1004) {
                                                client.field744 = var6;
                                                client.field745 = var7;
                                                client.field759 = 2;
                                                client.field809 = 0;
                                                var9 = class131.method3243(class171.field2214,
                                                                           client.field690.random,
                                                                           (byte) 89);
                                                var9.buffer.method3869(var3, (byte) 1);
                                                client.field690.method2193(var9, 567888365);
                                                break label1001;
                                            }

                                            if (var2 == 1005) {
                                                var17 = class18.method213(var1, -1406142973);
                                                if (var17 != null
                                                    && var17.field2792[var0] >= 100000) {
                                                    class59.method1163(27, "",
                                                                       var17.field2792[var0] + " x "
                                                                           + ItemConfig
                                                                           .get(var3
                                                                           ).field3515,
                                                                       -1483885983);
                                                } else {
                                                    var10 = class131.method3243(class171.field2214,
                                                                                client.field690.random,
                                                                                (byte) 13);
                                                    var10.buffer.method3869(var3, (byte) 1);
                                                    client.field690.method2193(var10, -1041341969);
                                                }

                                                client.field749 = 0;
                                                class179.field2357 = class18
                                                    .method213(var1, -1789523850);
                                                client.field750 = var0;
                                                break label1001;
                                            }

                                            if (var2 != 1007) {
                                                if (var2 == 1010 || var2 == 1009 || var2 == 1008
                                                    || var2 == 1011 || var2 == 1012) {
                                                    class45.field418
                                                        .method6374(var2, var3, new class228(var0),
                                                                    new class228(var1), 1273108680);
                                                }
                                                break label1001;
                                            }
                                        }

                                        var17 = class9.method102(var1, var0, 1223095851);
                                        if (var17 != null) {
                                            class35
                                                .method688(var3, var1, var0, var17.field2793, var5,
                                                           (short) 251);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        if (client.field796 != 0) {
            client.field796 = 0;
            class37.method721(class18.method213(class88.field1276, -682983009), 1238023037);
        }

        if (client.field798) {
            class134.method3264(1552833000);
        }

        if (class179.field2357 != null && client.field749 == 0) {
            class37.method721(class179.field2357, 1238023037);
        }

    }

    public static int method179(int var0, byte var1) {
        return class56.method1110(class122.field1714[var0]);
    }

    public int vmethod6130(byte var1) {
        return this.field139;
    }
}
