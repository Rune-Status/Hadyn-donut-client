package jagex.osrs;

public final class class21 {

    static String field206;
    static int[] field209;
    static int field208;
    final int[] field207;

    class21() {
        this.field207 = new int[4096];
    }

    public static Object method330(byte[] var0, boolean var1, int var2) {
        if (var0 == null) {
            return null;
        } else {
            if (var0.length > 136 && !class188.field2437) {
                try {
                    class182 var3 = new class182();
                    var3.vmethod4022(var0, -2095923979);
                    return var3;
                } catch (Throwable var4) {
                    class188.field2437 = true;
                }
            }

            return var0;
        }
    }

    static void method322(int var0, int var1, int var2, int var3, int var4) {
        for (class69 var5 = (class69) class69.field1051.getFirst(); var5 != null;
             var5 = (class69) class69.field1051.getNext()) {
            if (var5.field1054 != -1 || var5.field1058 != null) {
                int var6 = 0;
                if (var1 > var5.field1062) {
                    var6 += var1 - var5.field1062;
                } else if (var1 < var5.field1049) {
                    var6 += var5.field1049 - var1;
                }

                if (var2 > var5.field1052) {
                    var6 += var2 - var5.field1052;
                } else if (var2 < var5.field1059) {
                    var6 += var5.field1059 - var2;
                }

                if (var6 - 64 <= var5.field1053 && client.field881 != 0 && var0 == var5.field1048) {
                    var6 -= 64;
                    if (var6 < 0) {
                        var6 = 0;
                    }

                    int var7 = (var5.field1053 - var6) * client.field881 / var5.field1053;
                    if (var5.field1064 == null) {
                        if (var5.field1054 >= 0) {
                            class93 var8 = class93.method2275(class9.index4, var5.field1054, 0);
                            if (var8 != null) {
                                class95 var9 = var8.method2281().method2322(class286.field3697);
                                class105 var10 = class105.method2479(var9, 100, var7);
                                var10.method2471(-1);
                                class43.field413.method2215(var10);
                                var5.field1064 = var10;
                            }
                        }
                    } else {
                        var5.field1064.method2472(var7);
                    }

                    if (var5.field1060 == null) {
                        if (var5.field1058 != null && (var5.field1055 -= var3) <= 0) {
                            int var12 = (int) (Math.random() * (double) var5.field1058.length);
                            class93 var13 = class93
                                .method2275(class9.index4, var5.field1058[var12], 0);
                            if (var13 != null) {
                                class95 var14 = var13.method2281().method2322(class286.field3697);
                                class105 var11 = class105.method2479(var14, 100, var7);
                                var11.method2471(0);
                                class43.field413.method2215(var11);
                                var5.field1060 = var11;
                                var5.field1055 =
                                    var5.field1056 + (int) (Math.random() * (double) (var5.field1057
                                        - var5.field1056));
                            }
                        }
                    } else {
                        var5.field1060.method2472(var7);
                        if (!var5.field1060.isLinked()) {
                            var5.field1060 = null;
                        }
                    }
                } else {
                    if (var5.field1064 != null) {
                        class43.field413.method2214(var5.field1064);
                        var5.field1064 = null;
                    }

                    if (var5.field1060 != null) {
                        class43.field413.method2214(var5.field1060);
                        var5.field1060 = null;
                    }
                }
            }
        }

    }

    static int method319(int var0, class86 var1, boolean var2, int var3) {
        if (var0 == 5306) {
            ScriptExecutor.field1070[++class60.field600 - 1] = class17.getWindowMode();
            return 1;
        } else {
            int var4;
            if (var0 == 5307) {
                var4 = ScriptExecutor.field1070[--class60.field600];
                if (var4 == 1 || var4 == 2) {
                    class27.method513(var4);
                }

                return 1;
            } else if (var0 == 5308) {
                ScriptExecutor.field1070[++class60.field600 - 1] = GameApplet.field435.field1031;
                return 1;
            } else if (var0 != 5309) {
                return 2;
            } else {
                var4 = ScriptExecutor.field1070[--class60.field600];
                if (var4 == 1 || var4 == 2) {
                    GameApplet.field435.field1031 = var4;
                    Player.writePreferences();
                }

                return 1;
            }
        }
    }

    final int method321(int var1, int var2, byte var3) {
        return this.field207[var1 * 64 + var2];
    }

    final void method320(class32 var1, int var2) {
        for (int var3 = 0; var3 < 64; ++var3) {
            for (int var4 = 0; var4 < 64; ++var4) {
                this.field207[var3 * 64 + var4] =
                    var1.method600(var3, var4, -928050166) | -16777216;
            }
        }

    }
}
