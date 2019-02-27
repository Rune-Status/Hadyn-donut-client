package jagex.osrs;

public class class88 {

    static int field1276;
    class59[] field1273;
    int field1275;

    class88() {
        this.field1273 = new class59[100];
    }

    static synchronized byte[] method2184(int var0, int var1) {
        return class185.method3999(var0, false, 136372879);
    }

    static final void method2185(class232 var0, int var1, int var2, int var3, byte var4) {
        class160.method3502((byte) 72);
        class226 var5 = var0.method4745(false, -748743892);
        if (var5 != null) {
            class319.method6067(var1, var2, var5.field2626 + var1, var2 + var5.field2621);
            if (client.field876 != 2 && client.field876 != 5) {
                int var6 = client.field658 & 2047;
                int var7 = class69.localPlayer.x / 32 + 48;
                int var8 = 464 - class69.localPlayer.z / 32;
                class3.field29
                    .method6180(var1, var2, var5.field2626, var5.field2621, var7, var8, var6, 256,
                                var5.field2623, var5.field2622);

                int var9;
                int var10;
                int var11;
                for (var9 = 0; var9 < client.field820; ++var9) {
                    var10 = client.field871[var9] * 4 + 2 - class69.localPlayer.x / 32;
                    var11 = client.field872[var9] * 4 + 2 - class69.localPlayer.z / 32;
                    class56.method1111(var1, var2, var10, var11, client.field873[var9], var5,
                                       1982591191);
                }

                int var12;
                int var13;
                for (var9 = 0; var9 < 104; ++var9) {
                    for (var10 = 0; var10 < 104; ++var10) {
                        Deque var16 = client.itemStacks[class60.level][var9][var10];
                        if (var16 != null) {
                            var12 = var9 * 4 + 2 - class69.localPlayer.x / 32;
                            var13 = var10 * 4 + 2 - class69.localPlayer.z / 32;
                            class56.method1111(var1, var2, var12, var13, GameApplet.field461[0], var5,
                                               1961215754);
                        }
                    }
                }

                for (var9 = 0; var9 < client.field686; ++var9) {
                    class73 var17 = client.field806[client.field687[var9]];
                    if (var17 != null && var17.vmethod1973(1563766353)) {
                        class273 var19 = var17.field1102;
                        if (var19 != null && var19.field3595 != null) {
                            var19 = var19.method5397((byte) 10);
                        }

                        if (var19 != null && var19.field3585 && var19.field3589) {
                            var12 = var17.x / 32 - class69.localPlayer.x / 32;
                            var13 = var17.z / 32 - class69.localPlayer.z / 32;
                            class56.method1111(var1, var2, var12, var13, GameApplet.field461[1], var5,
                                               -780620787);
                        }
                    }
                }

                var9 = class83.field1226;
                int[] var20 = class83.field1222;

                for (var11 = 0; var11 < var9; ++var11) {
                    Player var18 = client.players[var20[var11]];
                    if (var18 != null && var18.vmethod1973(1563766353) && !var18.field626
                        && var18 != class69.localPlayer) {
                        var13 = var18.x / 32 - class69.localPlayer.x / 32;
                        int var14 = var18.z / 32 - class69.localPlayer.z / 32;
                        boolean var15 = false;
                        if (class69.localPlayer.field622 != 0 && var18.field622 != 0
                            && var18.field622 == class69.localPlayer.field622) {
                            var15 = true;
                        }

                        if (var18.method1173(-922368349)) {
                            class56.method1111(var1, var2, var13, var14, GameApplet.field461[3], var5,
                                               -30639276);
                        } else if (var15) {
                            class56.method1111(var1, var2, var13, var14, GameApplet.field461[4], var5,
                                               -1627246687);
                        } else if (var18.method1176((byte) 0)) {
                            class56.method1111(var1, var2, var13, var14, GameApplet.field461[5], var5,
                                               -1853350157);
                        } else {
                            class56.method1111(var1, var2, var13, var14, GameApplet.field461[2], var5,
                                               -466654138);
                        }
                    }
                }

                if (client.field663 != 0 && client.field655 % 20 < 10) {
                    if (client.field663 == 1 && client.field664 >= 0
                        && client.field664 < client.field806.length) {
                        class73 var21 = client.field806[client.field664];
                        if (var21 != null) {
                            var12 = var21.x / 32 - class69.localPlayer.x / 32;
                            var13 = var21.z / 32 - class69.localPlayer.z / 32;
                            class257
                                .method5065(var1, var2, var12, var13, Time.field2421[1], var5,
                                            (byte) -10);
                        }
                    }

                    if (client.field663 == 2) {
                        var11 = client.field666 * 4 - class49.sceneX * 4 + 2
                            - class69.localPlayer.x / 32;
                        var12 = client.field667 * 4 - class11.sceneZ * 4 + 2
                            - class69.localPlayer.z / 32;
                        class257.method5065(var1, var2, var11, var12, Time.field2421[1], var5,
                                            (byte) -25);
                    }

                    if (client.field663 == 10 && client.field665 >= 0
                        && client.field665 < client.players.length) {
                        Player var22 = client.players[client.field665];
                        if (var22 != null) {
                            var12 = var22.x / 32 - class69.localPlayer.x / 32;
                            var13 = var22.z / 32 - class69.localPlayer.z / 32;
                            class257
                                .method5065(var1, var2, var12, var13, Time.field2421[1], var5,
                                            (byte) -125);
                        }
                    }
                }

                if (client.field722 != 0) {
                    var11 = client.field722 * 4 + 2 - class69.localPlayer.x / 32;
                    var12 = client.field875 * 4 + 2 - class69.localPlayer.z / 32;
                    class56.method1111(var1, var2, var11, var12, Time.field2421[0], var5,
                                       -759341551);
                }

                if (!class69.localPlayer.field626) {
                    class319
                        .method6047(var5.field2626 / 2 + var1 - 1, var5.field2621 / 2 + var2 - 1, 3,
                                    3, 16777215);
                }
            } else {
                class319.method6058(var1, var2, 0, var5.field2623, var5.field2622);
            }

            client.field849[var3] = true;
        }
    }

    public static String method2173(byte[] var0, int var1, int var2, int var3) {
        StringBuilder var4 = new StringBuilder();

        for (int var5 = var1; var5 < var2 + var1; var5 += 3) {
            int var6 = var0[var5] & 255;
            var4.append(class306.field3800[var6 >>> 2]);
            if (var5 < var2 - 1) {
                int var7 = var0[var5 + 1] & 255;
                var4.append(class306.field3800[(var6 & 3) << 4 | var7 >>> 4]);
                if (var5 < var2 - 2) {
                    int var8 = var0[var5 + 2] & 255;
                    var4.append(class306.field3800[(var7 & 15) << 2 | var8 >>> 6])
                        .append(class306.field3800[var8 & 63]);
                } else {
                    var4.append(class306.field3800[(var7 & 15) << 2]).append("=");
                }
            } else {
                var4.append(class306.field3800[(var6 & 3) << 4]).append("==");
            }
        }

        return var4.toString();
    }

    class59 method2174(int var1, String var2, String var3, String var4, int var5) {
        class59 var6 = this.field1273[99];

        for (int var7 = this.field1275; var7 > 0; --var7) {
            if (var7 != 100) {
                this.field1273[var7] = this.field1273[var7 - 1];
            }
        }

        if (var6 == null) {
            var6 = new class59(var1, var2, var4, var3);
        } else {
            var6.unlink();
            var6.method4308();
            var6.method1134(var1, var2, var4, var3, -1677696048);
        }

        this.field1273[0] = var6;
        if (this.field1275 < 100) {
            ++this.field1275;
        }

        return var6;
    }

    class59 method2176(int var1, int var2) {
        return var1 >= 0 && var1 < this.field1275 ? this.field1273[var1] : null;
    }

    int method2180(int var1) {
        return this.field1275;
    }
}
