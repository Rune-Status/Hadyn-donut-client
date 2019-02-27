package jagex.osrs;

public class class224 extends class107 {

    class90 field2617;
    class220 field2616;
    Deque field2615;

    class224(class220 var1) {
        this.field2615 = new Deque();
        this.field2617 = new class90();
        this.field2616 = var1;
    }

    static int method4625(int var0, class86 var1, boolean var2, byte var3) {
        String var4;
        if (var0 == 3100) {
            var4 = ScriptExecutor.field1065[--ScriptExecutor.field1072];
            class59.method1163(0, "", var4, -1483885983);
            return 1;
        } else if (var0 == 3101) {
            class60.field600 -= 2;
            class34.method617(class69.localPlayer, ScriptExecutor.field1070[class60.field600],
                              ScriptExecutor.field1070[class60.field600 + 1], -683909322);
            return 1;
        } else if (var0 == 3103) {
            if (!ScriptExecutor.field1079) {
                ScriptExecutor.field1078 = true;
            }

            return 1;
        } else {
            int var11;
            if (var0 == 3104) {
                var4 = ScriptExecutor.field1065[--ScriptExecutor.field1072];
                var11 = 0;
                if (class219.method4375(var4, (byte) -115)) {
                    var11 = HandshakePacket.method3663(var4, -2069553789);
                }

                OutboundPacket var13 = class131
                    .method3243(class171.field2260, client.field690.random, (byte) 100);
                var13.buffer.writeInt(var11);
                client.field690.method2193(var13, 669251899);
                return 1;
            } else {
                OutboundPacket var15;
                if (var0 == 3105) {
                    var4 = ScriptExecutor.field1065[--ScriptExecutor.field1072];
                    var15 = class131
                        .method3243(class171.field2302, client.field690.random, (byte) 72);
                    var15.buffer.writeByte(var4.length() + 1);
                    var15.buffer.writeString(var4);
                    client.field690.method2193(var15, -512529177);
                    return 1;
                } else if (var0 == 3106) {
                    var4 = ScriptExecutor.field1065[--ScriptExecutor.field1072];
                    var15 = class131
                        .method3243(class171.field2215, client.field690.random, (byte) 75);
                    var15.buffer.writeByte(var4.length() + 1);
                    var15.buffer.writeString(var4);
                    client.field690.method2193(var15, 1877628403);
                    return 1;
                } else {
                    String var8;
                    int var16;
                    if (var0 == 3107) {
                        var16 = ScriptExecutor.field1070[--class60.field600];
                        var8 = ScriptExecutor.field1065[--ScriptExecutor.field1072];
                        class36.method691(var16, var8, -1790829652);
                        return 1;
                    } else if (var0 == 3108) {
                        class60.field600 -= 3;
                        var16 = ScriptExecutor.field1070[class60.field600];
                        var11 = ScriptExecutor.field1070[class60.field600 + 1];
                        int var10 = ScriptExecutor.field1070[class60.field600 + 2];
                        class232 var14 = class18.method213(var10, -1792831098);
                        class134.method3262(var14, var16, var11, 468651930);
                        return 1;
                    } else if (var0 == 3109) {
                        class60.field600 -= 2;
                        var16 = ScriptExecutor.field1070[class60.field600];
                        var11 = ScriptExecutor.field1070[class60.field600 + 1];
                        class232 var12 = var2 ? class10.field75 : ScriptExecutor.field1080;
                        class134.method3262(var12, var16, var11, 1580750309);
                        return 1;
                    } else if (var0 == 3110) {
                        class14.field132 = ScriptExecutor.field1070[--class60.field600] == 1;
                        return 1;
                    } else if (var0 == 3111) {
                        ScriptExecutor.field1070[++class60.field600 - 1] =
                            GameApplet.field435.field1029 ? 1 : 0;
                        return 1;
                    } else if (var0 == 3112) {
                        GameApplet.field435.field1029 = ScriptExecutor.field1070[--class60.field600] == 1;
                        Player.writePreferences();
                        return 1;
                    } else if (var0 == 3113) {
                        var4 = ScriptExecutor.field1065[--ScriptExecutor.field1072];
                        boolean var5 = ScriptExecutor.field1070[--class60.field600] == 1;
                        class138.openUrl(var4, var5, false, (short) 2500);
                        return 1;
                    } else if (var0 == 3115) {
                        var16 = ScriptExecutor.field1070[--class60.field600];
                        var15 = class131
                            .method3243(class171.field2249, client.field690.random, (byte) 27);
                        var15.buffer.writeShort(var16);
                        client.field690.method2193(var15, 782614107);
                        return 1;
                    } else if (var0 == 3116) {
                        var16 = ScriptExecutor.field1070[--class60.field600];
                        ScriptExecutor.field1072 -= 2;
                        var8 = ScriptExecutor.field1065[ScriptExecutor.field1072];
                        String var6 = ScriptExecutor.field1065[ScriptExecutor.field1072 + 1];
                        if (var8.length() > 500) {
                            return 1;
                        } else if (var6.length() > 500) {
                            return 1;
                        } else {
                            OutboundPacket var7 = class131
                                .method3243(class171.field2223, client.field690.random,
                                            (byte) 66);
                            var7.buffer.writeShort(
                                1 + class97.method2404(var8, 1154977441) + class97
                                    .method2404(var6, 1034328621));
                            var7.buffer.writeString(var8);
                            var7.buffer.writeByte(var16);
                            var7.buffer.writeString(var6);
                            client.field690.method2193(var7, -1002251493);
                            return 1;
                        }
                    } else if (var0 == 3117) {
                        client.field789 = ScriptExecutor.field1070[--class60.field600] == 1;
                        return 1;
                    } else if (var0 == 3118) {
                        client.field791 = ScriptExecutor.field1070[--class60.field600] == 1;
                        return 1;
                    } else if (var0 == 3119) {
                        client.field762 = ScriptExecutor.field1070[--class60.field600] == 1;
                        return 1;
                    } else if (var0 == 3120) {
                        if (ScriptExecutor.field1070[--class60.field600] == 1) {
                            client.field676 |= 1;
                        } else {
                            client.field676 &= -2;
                        }

                        return 1;
                    } else if (var0 == 3121) {
                        if (ScriptExecutor.field1070[--class60.field600] == 1) {
                            client.field676 |= 2;
                        } else {
                            client.field676 &= -3;
                        }

                        return 1;
                    } else if (var0 == 3122) {
                        if (ScriptExecutor.field1070[--class60.field600] == 1) {
                            client.field676 |= 4;
                        } else {
                            client.field676 &= -5;
                        }

                        return 1;
                    } else if (var0 == 3123) {
                        if (ScriptExecutor.field1070[--class60.field600] == 1) {
                            client.field676 |= 8;
                        } else {
                            client.field676 &= -9;
                        }

                        return 1;
                    } else if (var0 == 3124) {
                        client.field676 = 0;
                        return 1;
                    } else if (var0 == 3125) {
                        client.field748 = ScriptExecutor.field1070[--class60.field600] == 1;
                        return 1;
                    } else if (var0 == 3126) {
                        client.field758 = ScriptExecutor.field1070[--class60.field600] == 1;
                        return 1;
                    } else if (var0 == 3127) {
                        class74.method1993(ScriptExecutor.field1070[--class60.field600] == 1, 1738595403);
                        return 1;
                    } else if (var0 == 3128) {
                        ScriptExecutor.field1070[++class60.field600 - 1] =
                            class59.method1164(16748608) ? 1 : 0;
                        return 1;
                    } else if (var0 == 3129) {
                        class60.field600 -= 2;
                        client.field723 = ScriptExecutor.field1070[class60.field600];
                        client.field724 = ScriptExecutor.field1070[class60.field600 + 1];
                        return 1;
                    } else if (var0 == 3130) {
                        class60.field600 -= 2;
                        return 1;
                    } else if (var0 == 3131) {
                        --class60.field600;
                        return 1;
                    } else if (var0 == 3132) {
                        ScriptExecutor.field1070[++class60.field600 - 1] = class68.windowWidth;
                        ScriptExecutor.field1070[++class60.field600 - 1] = class141.windowHeight;
                        return 1;
                    } else if (var0 == 3133) {
                        --class60.field600;
                        return 1;
                    } else if (var0 == 3134) {
                        return 1;
                    } else if (var0 == 3135) {
                        class60.field600 -= 2;
                        return 1;
                    } else if (var0 == 3136) {
                        client.field805 = 3;
                        client.field642 = ScriptExecutor.field1070[--class60.field600];
                        return 1;
                    } else if (var0 == 3137) {
                        client.field805 = 2;
                        client.field642 = ScriptExecutor.field1070[--class60.field600];
                        return 1;
                    } else if (var0 == 3138) {
                        client.field805 = 0;
                        return 1;
                    } else if (var0 == 3139) {
                        client.field805 = 1;
                        return 1;
                    } else if (var0 == 3140) {
                        client.field805 = 3;
                        client.field642 =
                            var2 ? class10.field75.field2770 : ScriptExecutor.field1080.field2770;
                        return 1;
                    } else {
                        boolean var9;
                        if (var0 == 3141) {
                            var9 = ScriptExecutor.field1070[--class60.field600] == 1;
                            GameApplet.field435.field1033 = var9;
                            Player.writePreferences();
                            return 1;
                        } else if (var0 == 3142) {
                            ScriptExecutor.field1070[++class60.field600 - 1] =
                                GameApplet.field435.field1033 ? 1 : 0;
                            return 1;
                        } else if (var0 == 3143) {
                            var9 = ScriptExecutor.field1070[--class60.field600] == 1;
                            client.field746 = var9;
                            if (!var9) {
                                GameApplet.field435.field1034 = "";
                                Player.writePreferences();
                            }

                            return 1;
                        } else if (var0 == 3144) {
                            ScriptExecutor.field1070[++class60.field600 - 1] = client.field746 ? 1 : 0;
                            return 1;
                        } else {
                            return var0 == 3145 ? 1 : 2;
                        }
                    }
                }
            }
        }
    }

    protected void vmethod4620(int[] var1, int var2, int var3) {
        this.field2617.vmethod4620(var1, var2, var3);

        for (class221 var6 = (class221) this.field2615.getFirst(); var6 != null;
             var6 = (class221) this.field2615.getNext()) {
            if (!this.field2616.method4429(var6, 1540281522)) {
                int var4 = var2;
                int var5 = var3;

                do {
                    if (var5 <= var6.field2576) {
                        this.method4600(var6, var1, var4, var5, var4 + var5, 617494299);
                        var6.field2576 -= var5;
                        break;
                    }

                    this.method4600(var6, var1, var4, var6.field2576, var4 + var5, 617494299);
                    var4 += var6.field2576;
                    var5 -= var6.field2576;
                } while (!this.field2616.method4508(var6, var1, var4, var5, 976951054));
            }
        }

    }

    protected void vmethod4601(int var1) {
        this.field2617.vmethod4601(var1);

        for (class221 var3 = (class221) this.field2615.getFirst(); var3 != null;
             var3 = (class221) this.field2615.getNext()) {
            if (!this.field2616.method4429(var3, 1414307274)) {
                int var2 = var1;

                do {
                    if (var2 <= var3.field2576) {
                        this.method4603(var3, var2, -1874042593);
                        var3.field2576 -= var2;
                        break;
                    }

                    this.method4603(var3, var3.field2576, -1802288935);
                    var2 -= var3.field2576;
                } while (!this.field2616.method4508(var3, (int[]) null, 0, var2, -625274437));
            }
        }

    }

    protected class107 vmethod4598() {
        class221 var1;
        do {
            var1 = (class221) this.field2615.getNext();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2581 == null);

        return var1.field2581;
    }

    void method4603(class221 var1, int var2, int var3) {
        if ((this.field2616.field2548[var1.field2585] & 4) != 0 && var1.field2577 < 0) {
            int var4 = this.field2616.field2546[var1.field2585] / class97.field1377;
            int var5 = (var4 + 1048575 - var1.field2567) / var4;
            var1.field2567 = var4 * var2 + var1.field2567 & 1048575;
            if (var5 <= var2) {
                if (this.field2616.field2540[var1.field2585] == 0) {
                    var1.field2581 = class105
                        .method2469(var1.field2565, var1.field2581.method2466(),
                                    var1.field2581.method2475(), var1.field2581.method2476());
                } else {
                    var1.field2581 = class105
                        .method2469(var1.field2565, var1.field2581.method2466(), 0,
                                    var1.field2581.method2476());
                    this.field2616
                        .method4408(var1, var1.field2571.field2601[var1.field2568] < 0, (byte) 2);
                }

                if (var1.field2571.field2601[var1.field2568] < 0) {
                    var1.field2581.method2471(-1);
                }

                var2 = var1.field2567 / var4;
            }
        }

        var1.field2581.vmethod4601(var2);
    }

    void method4600(class221 var1, int[] var2, int var3, int var4, int var5, int var6) {
        if ((this.field2616.field2548[var1.field2585] & 4) != 0 && var1.field2577 < 0) {
            int var7 = this.field2616.field2546[var1.field2585] / class97.field1377;

            while (true) {
                int var8 = (var7 + 1048575 - var1.field2567) / var7;
                if (var8 > var4) {
                    var1.field2567 += var7 * var4;
                    break;
                }

                var1.field2581.vmethod4620(var2, var3, var8);
                var3 += var8;
                var4 -= var8;
                var1.field2567 += var8 * var7 - 1048576;
                int var9 = class97.field1377 / 100;
                int var10 = 262144 / var7;
                if (var10 < var9) {
                    var9 = var10;
                }

                class105 var11 = var1.field2581;
                if (this.field2616.field2540[var1.field2585] == 0) {
                    var1.field2581 = class105
                        .method2469(var1.field2565, var11.method2466(), var11.method2475(),
                                    var11.method2476());
                } else {
                    var1.field2581 = class105
                        .method2469(var1.field2565, var11.method2466(), 0, var11.method2476());
                    this.field2616
                        .method4408(var1, var1.field2571.field2601[var1.field2568] < 0, (byte) 23);
                    var1.field2581.method2572(var9, var11.method2475());
                }

                if (var1.field2571.field2601[var1.field2568] < 0) {
                    var1.field2581.method2471(-1);
                }

                var11.method2482(var9);
                var11.vmethod4620(var2, var3, var5 - var3);
                if (var11.method2486()) {
                    this.field2617.method2215(var11);
                }
            }
        }

        var1.field2581.vmethod4620(var2, var3, var4);
    }

    protected class107 vmethod4596() {
        class221 var1 = (class221) this.field2615.getFirst();
        return (class107) (var1 == null ? null
            : (var1.field2581 != null ? var1.field2581 : this.vmethod4598()));
    }

    protected int vmethod4609() {
        return 0;
    }
}
