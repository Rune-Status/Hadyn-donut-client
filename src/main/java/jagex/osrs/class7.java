package jagex.osrs;

import java.io.File;
import java.io.IOException;
import java.util.Comparator;

final class class7 implements Comparator {

    public static SeekableFile getPreferencesFile(String var0, String var1, boolean var2, int var3) {
        File var4 = new File(class51.field519, "preferences" + var0 + ".dat");
        if (var4.exists()) {
            try {
                SeekableFile var11 = new SeekableFile(var4, "rw", 10000L);
                return var11;
            } catch (IOException var10) {
                ;
            }
        }

        String var5 = "";
        if (class157.field2033 == 33) {
            var5 = "_rc";
        } else if (class157.field2033 == 34) {
            var5 = "_wip";
        }

        File var6 = new File(class21.field206,
                             "jagex_" + var1 + "_preferences" + var0 + var5 + ".dat");
        SeekableFile var7;
        if (!var2 && var6.exists()) {
            try {
                var7 = new SeekableFile(var6, "rw", 10000L);
                return var7;
            } catch (IOException var9) {
                ;
            }
        }

        try {
            var7 = new SeekableFile(var4, "rw", 10000L);
            return var7;
        } catch (IOException var8) {
            throw new RuntimeException();
        }
    }

    static void method89(int var0) {
        if (class11.method121(-103983136)) {
            class79.field1176 = true;
        }

    }

    static int method95(int var0, class86 var1, boolean var2, int var3) {
        int var4;
        if (var0 == 6600) {
            var4 = class60.level;
            int var10 = (class69.localPlayer.x >> 7) + class49.sceneX;
            int var6 = (class69.localPlayer.z >> 7) + class11.sceneZ;
            method88(-1184928285).method6329(var4, var10, var6, true, (byte) -28);
            return 1;
        } else {
            class20 var12;
            if (var0 == 6601) {
                var4 = ScriptExecutor.field1070[--class60.field600];
                String var17 = "";
                var12 = method88(-1545011863).method6347(var4, -408063967);
                if (var12 != null) {
                    var17 = var12.method267(-367314643);
                }

                ScriptExecutor.field1065[++ScriptExecutor.field1072 - 1] = var17;
                return 1;
            } else if (var0 == 6602) {
                var4 = ScriptExecutor.field1070[--class60.field600];
                method88(559076250).method6330(var4, -356648505);
                return 1;
            } else if (var0 == 6603) {
                ScriptExecutor.field1070[++class60.field600 - 1] = method88(33236223)
                    .method6389(-1272691340);
                return 1;
            } else if (var0 == 6604) {
                var4 = ScriptExecutor.field1070[--class60.field600];
                method88(72856577).method6324(var4, 2052488028);
                return 1;
            } else if (var0 == 6605) {
                ScriptExecutor.field1070[++class60.field600 - 1] =
                    method88(104876930).method6326(2082620146) ? 1 : 0;
                return 1;
            } else {
                class228 var16;
                if (var0 == 6606) {
                    var16 = new class228(ScriptExecutor.field1070[--class60.field600]);
                    method88(-529561186).method6486(var16.field2632, var16.field2633, (byte) 37);
                    return 1;
                } else if (var0 == 6607) {
                    var16 = new class228(ScriptExecutor.field1070[--class60.field600]);
                    method88(-1009638272).method6437(var16.field2632, var16.field2633, 1599454875);
                    return 1;
                } else if (var0 == 6608) {
                    var16 = new class228(ScriptExecutor.field1070[--class60.field600]);
                    method88(-1494900824)
                        .method6350(var16.field2634, var16.field2632, var16.field2633, 2063693495);
                    return 1;
                } else if (var0 == 6609) {
                    var16 = new class228(ScriptExecutor.field1070[--class60.field600]);
                    method88(-26117139)
                        .method6351(var16.field2634, var16.field2632, var16.field2633, (byte) 0);
                    return 1;
                } else if (var0 == 6610) {
                    ScriptExecutor.field1070[++class60.field600 - 1] = method88(640095862)
                        .method6367((byte) -95);
                    ScriptExecutor.field1070[++class60.field600 - 1] = method88(182230626)
                        .method6353(-1581762126);
                    return 1;
                } else {
                    class20 var14;
                    if (var0 == 6611) {
                        var4 = ScriptExecutor.field1070[--class60.field600];
                        var14 = method88(409045179).method6347(var4, -1604522313);
                        if (var14 == null) {
                            ScriptExecutor.field1070[++class60.field600 - 1] = 0;
                        } else {
                            ScriptExecutor.field1070[++class60.field600 - 1] = var14.method266((byte) -97)
                                                                             .method4646(
                                                                                 2019284759);
                        }

                        return 1;
                    } else if (var0 == 6612) {
                        var4 = ScriptExecutor.field1070[--class60.field600];
                        var14 = method88(231257210).method6347(var4, -1601558174);
                        if (var14 == null) {
                            ScriptExecutor.field1070[++class60.field600 - 1] = 0;
                            ScriptExecutor.field1070[++class60.field600 - 1] = 0;
                        } else {
                            ScriptExecutor.field1070[++class60.field600 - 1] =
                                (var14.method260(-232468976) - var14.method280((byte) 107) + 1)
                                    * 64;
                            ScriptExecutor.field1070[++class60.field600 - 1] =
                                (var14.method271((byte) 100) - var14.method251((byte) 14) + 1) * 64;
                        }

                        return 1;
                    } else if (var0 == 6613) {
                        var4 = ScriptExecutor.field1070[--class60.field600];
                        var14 = method88(-576111409).method6347(var4, -1782079310);
                        if (var14 == null) {
                            ScriptExecutor.field1070[++class60.field600 - 1] = 0;
                            ScriptExecutor.field1070[++class60.field600 - 1] = 0;
                            ScriptExecutor.field1070[++class60.field600 - 1] = 0;
                            ScriptExecutor.field1070[++class60.field600 - 1] = 0;
                        } else {
                            ScriptExecutor.field1070[++class60.field600 - 1] =
                                var14.method280((byte) 124) * 64;
                            ScriptExecutor.field1070[++class60.field600 - 1] =
                                var14.method251((byte) 11) * 64;
                            ScriptExecutor.field1070[++class60.field600 - 1] =
                                var14.method260(-1201003956) * 64 + 64 - 1;
                            ScriptExecutor.field1070[++class60.field600 - 1] =
                                var14.method271((byte) 72) * 64 + 64 - 1;
                        }

                        return 1;
                    } else if (var0 == 6614) {
                        var4 = ScriptExecutor.field1070[--class60.field600];
                        var14 = method88(-752551900).method6347(var4, 1044988056);
                        if (var14 == null) {
                            ScriptExecutor.field1070[++class60.field600 - 1] = -1;
                        } else {
                            ScriptExecutor.field1070[++class60.field600 - 1] = var14.method258((byte) 41);
                        }

                        return 1;
                    } else if (var0 == 6615) {
                        var16 = method88(-1343044044).method6354(-1345452263);
                        if (var16 == null) {
                            ScriptExecutor.field1070[++class60.field600 - 1] = -1;
                            ScriptExecutor.field1070[++class60.field600 - 1] = -1;
                        } else {
                            ScriptExecutor.field1070[++class60.field600 - 1] = var16.field2632;
                            ScriptExecutor.field1070[++class60.field600 - 1] = var16.field2633;
                        }

                        return 1;
                    } else if (var0 == 6616) {
                        ScriptExecutor.field1070[++class60.field600 - 1] = method88(-322953723)
                            .method6336(1223065204);
                        return 1;
                    } else if (var0 == 6617) {
                        var16 = new class228(ScriptExecutor.field1070[--class60.field600]);
                        var14 = method88(614982985).method6332(1494601904);
                        if (var14 == null) {
                            ScriptExecutor.field1070[++class60.field600 - 1] = -1;
                            ScriptExecutor.field1070[++class60.field600 - 1] = -1;
                            return 1;
                        } else {
                            int[] var15 = var14
                                .method250(var16.field2634, var16.field2632, var16.field2633,
                                           -1422622969);
                            if (var15 == null) {
                                ScriptExecutor.field1070[++class60.field600 - 1] = -1;
                                ScriptExecutor.field1070[++class60.field600 - 1] = -1;
                            } else {
                                ScriptExecutor.field1070[++class60.field600 - 1] = var15[0];
                                ScriptExecutor.field1070[++class60.field600 - 1] = var15[1];
                            }

                            return 1;
                        }
                    } else {
                        class228 var8;
                        if (var0 == 6618) {
                            var16 = new class228(ScriptExecutor.field1070[--class60.field600]);
                            var14 = method88(1071956566).method6332(1494601904);
                            if (var14 == null) {
                                ScriptExecutor.field1070[++class60.field600 - 1] = -1;
                                ScriptExecutor.field1070[++class60.field600 - 1] = -1;
                                return 1;
                            } else {
                                var8 = var14
                                    .method279(var16.field2632, var16.field2633, -795573811);
                                if (var8 == null) {
                                    ScriptExecutor.field1070[++class60.field600 - 1] = -1;
                                } else {
                                    ScriptExecutor.field1070[++class60.field600 - 1] = var8
                                        .method4646(1870098838);
                                }

                                return 1;
                            }
                        } else {
                            class228 var13;
                            if (var0 == 6619) {
                                class60.field600 -= 2;
                                var4 = ScriptExecutor.field1070[class60.field600];
                                var13 = new class228(ScriptExecutor.field1070[class60.field600 + 1]);
                                class55.method1107(var4, var13, false, (byte) 1);
                                return 1;
                            } else if (var0 == 6620) {
                                class60.field600 -= 2;
                                var4 = ScriptExecutor.field1070[class60.field600];
                                var13 = new class228(ScriptExecutor.field1070[class60.field600 + 1]);
                                class55.method1107(var4, var13, true, (byte) 1);
                                return 1;
                            } else if (var0 == 6621) {
                                class60.field600 -= 2;
                                var4 = ScriptExecutor.field1070[class60.field600];
                                var13 = new class228(ScriptExecutor.field1070[class60.field600 + 1]);
                                var12 = method88(-1080529566).method6347(var4, -127123289);
                                if (var12 == null) {
                                    ScriptExecutor.field1070[++class60.field600 - 1] = 0;
                                    return 1;
                                } else {
                                    ScriptExecutor.field1070[++class60.field600 - 1] = var12
                                        .method248(var13.field2634, var13.field2632,
                                                   var13.field2633, 37007514) ? 1 : 0;
                                    return 1;
                                }
                            } else if (var0 == 6622) {
                                ScriptExecutor.field1070[++class60.field600 - 1] = method88(-276833664)
                                    .method6355(1256483564);
                                ScriptExecutor.field1070[++class60.field600 - 1] = method88(74327844)
                                    .method6356(2139444004);
                                return 1;
                            } else if (var0 == 6623) {
                                var16 = new class228(ScriptExecutor.field1070[--class60.field600]);
                                var14 = method88(36566751)
                                    .method6328(var16.field2634, var16.field2632, var16.field2633,
                                                (byte) 0);
                                if (var14 == null) {
                                    ScriptExecutor.field1070[++class60.field600 - 1] = -1;
                                } else {
                                    ScriptExecutor.field1070[++class60.field600 - 1] = var14
                                        .method253((byte) 41);
                                }

                                return 1;
                            } else if (var0 == 6624) {
                                method88(-1978038685)
                                    .method6357(ScriptExecutor.field1070[--class60.field600], (byte) 61);
                                return 1;
                            } else if (var0 == 6625) {
                                method88(-320994166).method6358((byte) 100);
                                return 1;
                            } else if (var0 == 6626) {
                                method88(312392223)
                                    .method6359(ScriptExecutor.field1070[--class60.field600], -1614324548);
                                return 1;
                            } else if (var0 == 6627) {
                                method88(1460795202).method6360(598934438);
                                return 1;
                            } else {
                                boolean var11;
                                if (var0 == 6628) {
                                    var11 = ScriptExecutor.field1070[--class60.field600] == 1;
                                    method88(617586233).method6414(var11, -743906747);
                                    return 1;
                                } else if (var0 == 6629) {
                                    var4 = ScriptExecutor.field1070[--class60.field600];
                                    method88(-460725137).method6375(var4, (byte) 80);
                                    return 1;
                                } else if (var0 == 6630) {
                                    var4 = ScriptExecutor.field1070[--class60.field600];
                                    method88(-1897214271).method6363(var4, -1317188494);
                                    return 1;
                                } else if (var0 == 6631) {
                                    method88(1237036260).method6364(-1612049656);
                                    return 1;
                                } else if (var0 == 6632) {
                                    var11 = ScriptExecutor.field1070[--class60.field600] == 1;
                                    method88(1329183375).method6492(var11, (byte) 22);
                                    return 1;
                                } else {
                                    boolean var5;
                                    if (var0 == 6633) {
                                        class60.field600 -= 2;
                                        var4 = ScriptExecutor.field1070[class60.field600];
                                        var5 = ScriptExecutor.field1070[class60.field600 + 1] == 1;
                                        method88(-633564864).method6323(var4, var5, (byte) 4);
                                        return 1;
                                    } else if (var0 == 6634) {
                                        class60.field600 -= 2;
                                        var4 = ScriptExecutor.field1070[class60.field600];
                                        var5 = ScriptExecutor.field1070[class60.field600 + 1] == 1;
                                        method88(-2013677162).method6320(var4, var5, (byte) 1);
                                        return 1;
                                    } else if (var0 == 6635) {
                                        ScriptExecutor.field1070[++class60.field600 - 1] =
                                            method88(291877766).method6368(-1835460833) ? 1 : 0;
                                        return 1;
                                    } else if (var0 == 6636) {
                                        var4 = ScriptExecutor.field1070[--class60.field600];
                                        ScriptExecutor.field1070[++class60.field600 - 1] =
                                            method88(659807046).method6370(var4, 1501070545) ? 1
                                                : 0;
                                        return 1;
                                    } else if (var0 == 6637) {
                                        var4 = ScriptExecutor.field1070[--class60.field600];
                                        ScriptExecutor.field1070[++class60.field600 - 1] =
                                            method88(-1369505887).method6372(var4, (byte) -82) ? 1
                                                : 0;
                                        return 1;
                                    } else if (var0 == 6638) {
                                        class60.field600 -= 2;
                                        var4 = ScriptExecutor.field1070[class60.field600];
                                        var13 = new class228(
                                            ScriptExecutor.field1070[class60.field600 + 1]);
                                        var8 = method88(510993114)
                                            .method6373(var4, var13, 1298266560);
                                        if (var8 == null) {
                                            ScriptExecutor.field1070[++class60.field600 - 1] = -1;
                                        } else {
                                            ScriptExecutor.field1070[++class60.field600 - 1] = var8
                                                .method4646(1579916375);
                                        }

                                        return 1;
                                    } else {
                                        class28 var9;
                                        if (var0 == 6639) {
                                            var9 = method88(329927844).method6506(42744814);
                                            if (var9 == null) {
                                                ScriptExecutor.field1070[++class60.field600 - 1] = -1;
                                                ScriptExecutor.field1070[++class60.field600 - 1] = -1;
                                            } else {
                                                ScriptExecutor.field1070[++class60.field600
                                                    - 1] = var9.field285;
                                                ScriptExecutor.field1070[++class60.field600
                                                    - 1] = var9.field277.method4646(1185745152);
                                            }

                                            return 1;
                                        } else if (var0 == 6640) {
                                            var9 = method88(987947524).method6376(2003183733);
                                            if (var9 == null) {
                                                ScriptExecutor.field1070[++class60.field600 - 1] = -1;
                                                ScriptExecutor.field1070[++class60.field600 - 1] = -1;
                                            } else {
                                                ScriptExecutor.field1070[++class60.field600
                                                    - 1] = var9.field285;
                                                ScriptExecutor.field1070[++class60.field600
                                                    - 1] = var9.field277.method4646(1296533690);
                                            }

                                            return 1;
                                        } else {
                                            class257 var7;
                                            if (var0 == 6693) {
                                                var4 = ScriptExecutor.field1070[--class60.field600];
                                                var7 = class162.method3533(var4, 32768);
                                                if (var7.field3316 == null) {
                                                    ScriptExecutor.field1065[++ScriptExecutor.field1072 - 1] = "";
                                                } else {
                                                    ScriptExecutor.field1065[++ScriptExecutor.field1072
                                                        - 1] = var7.field3316;
                                                }

                                                return 1;
                                            } else if (var0 == 6694) {
                                                var4 = ScriptExecutor.field1070[--class60.field600];
                                                var7 = class162.method3533(var4, 32768);
                                                ScriptExecutor.field1070[++class60.field600
                                                    - 1] = var7.field3318;
                                                return 1;
                                            } else if (var0 == 6695) {
                                                var4 = ScriptExecutor.field1070[--class60.field600];
                                                var7 = class162.method3533(var4, 32768);
                                                if (var7 == null) {
                                                    ScriptExecutor.field1070[++class60.field600 - 1] = -1;
                                                } else {
                                                    ScriptExecutor.field1070[++class60.field600
                                                        - 1] = var7.field3317;
                                                }

                                                return 1;
                                            } else if (var0 == 6696) {
                                                var4 = ScriptExecutor.field1070[--class60.field600];
                                                var7 = class162.method3533(var4, 32768);
                                                if (var7 == null) {
                                                    ScriptExecutor.field1070[++class60.field600 - 1] = -1;
                                                } else {
                                                    ScriptExecutor.field1070[++class60.field600
                                                        - 1] = var7.field3315;
                                                }

                                                return 1;
                                            } else if (var0 == 6697) {
                                                ScriptExecutor.field1070[++class60.field600
                                                    - 1] = class152.field1985.field343;
                                                return 1;
                                            } else if (var0 == 6698) {
                                                ScriptExecutor.field1070[++class60.field600
                                                    - 1] = class152.field1985.field344
                                                    .method4646(2121051186);
                                                return 1;
                                            } else if (var0 == 6699) {
                                                ScriptExecutor.field1070[++class60.field600
                                                    - 1] = class152.field1985.field345
                                                    .method4646(1892873171);
                                                return 1;
                                            } else {
                                                return 2;
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

    static class329 method88(int var0) {
        return class45.field418;
    }

    int method84(class2 var1, class2 var2, int var3) {
        return var1.field16 < var2.field16 ? -1 : (var1.field16 == var2.field16 ? 0 : 1);
    }

    public boolean equals(Object var1) {
        return super.equals(var1);
    }

    public int compare(Object var1, Object var2) {
        return this.method84((class2) var1, (class2) var2, -681698410);
    }
}
