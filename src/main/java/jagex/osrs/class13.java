package jagex.osrs;

public class class13 {

    static class155 field106;
    static class232 field104;
    static int field103;
    int field108;
    class228 field109;

    class13(int var1, class228 var2) {
        this.field108 = var1;
        this.field109 = var2;
    }

    static final void method143(int var0) {
        if (class60.level != client.field661) {
            client.field661 = class60.level;
            int var1 = class60.level;
            int[] var2 = class3.field29.field3889;
            int var3 = var2.length;

            int var4;
            for (var4 = 0; var4 < var3; ++var4) {
                var2[var4] = 0;
            }

            int var5;
            int var6;
            for (var4 = 1; var4 < 103; ++var4) {
                var5 = (103 - var4) * 2048 + 24628;

                for (var6 = 1; var6 < 103; ++var6) {
                    if ((class50.field492[var1][var6][var4] & 24) == 0) {
                        class243.field3173.method3091(var2, var5, 512, var1, var6, var4);
                    }

                    if (var1 < 3 && (class50.field492[var1 + 1][var6][var4] & 8) != 0) {
                        class243.field3173.method3091(var2, var5, 512, var1 + 1, var6, var4);
                    }

                    var5 += 4;
                }
            }

            var4 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (
                238 + (int) (Math.random() * 20.0D) - 10 << 8) + (
                238 + (int) (Math.random() * 20.0D) - 10);
            var5 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
            class3.field29.method6155();

            int var7;
            for (var6 = 1; var6 < 103; ++var6) {
                for (var7 = 1; var7 < 103; ++var7) {
                    if ((class50.field492[var1][var7][var6] & 24) == 0) {
                        class136.method3269(var1, var7, var6, var4, var5, -1758684455);
                    }

                    if (var1 < 3 && (class50.field492[var1 + 1][var7][var6] & 8) != 0) {
                        class136.method3269(var1 + 1, var7, var6, var4, var5, 887536558);
                    }
                }
            }

            client.field820 = 0;

            for (var6 = 0; var6 < 104; ++var6) {
                for (var7 = 0; var7 < 104; ++var7) {
                    long var8 = class243.field3173.method3182(class60.level, var6, var7);
                    if (var8 != 0L) {
                        int var10 = class56.method1110(var8);
                        int var11 = class253.method4993(var10, (byte) 7).field3479;
                        if (var11 >= 0) {
                            client.field873[client.field820] = class162.method3533(var11, 32768)
                                                                       .method5064(false,
                                                                                   -1865508122);
                            client.field871[client.field820] = var6;
                            client.field872[client.field820] = var7;
                            ++client.field820;
                        }
                    }
                }
            }

            class30.field313.method6119((short) 2504);
        }

    }

    static final void method142(class232 var0, ItemConfig var1, int var2, int var3, boolean var4,
                                int var5) {
        String[] var6 = var1.field3541;
        byte var7 = -1;
        String var8 = null;
        if (var6 != null && var6[var3] != null) {
            if (var3 == 0) {
                var7 = 33;
            } else if (var3 == 1) {
                var7 = 34;
            } else if (var3 == 2) {
                var7 = 35;
            } else if (var3 == 3) {
                var7 = 36;
            } else {
                var7 = 37;
            }

            var8 = var6[var3];
        } else if (var3 == 4) {
            var7 = 37;
            var8 = "Drop";
        }

        if (var7 != -1 && var8 != null) {
            class183
                .method3749(var8, class128.method3233(16748608, 594427799) + var1.field3515, var7,
                            var1.field3557, var2, var0.field2770, var4, (byte) -121);
        }

    }

    static final void method144(int var0, int var1, int var2, int var3, int var4) {
        client.field680 = 0;
        int var5 = (class69.localPlayer.x >> 7) + class49.sceneX;
        int var6 = (class69.localPlayer.z >> 7) + class11.sceneZ;
        if (var5 >= 3053 && var5 <= 3156 && var6 >= 3056 && var6 <= 3136) {
            client.field680 = 1;
        }

        if (var5 >= 3072 && var5 <= 3118 && var6 >= 9492 && var6 <= 9535) {
            client.field680 = 1;
        }

        if (client.field680 == 1 && var5 >= 3139 && var5 <= 3199 && var6 >= 3008 && var6 <= 3062) {
            client.field680 = 0;
        }

    }
}
