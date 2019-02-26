package jagex.osrs;

public class class141 extends class285 {

    public static int windowHeight;
    static int field1939;
    final boolean field1936;

    public class141(boolean var1) {
        this.field1936 = var1;
    }

    static final void method3314(Player var0, int var1, int var2, int var3, byte var4) {
        if (class69.localPlayer != var0) {
            if (client.field780 < 400) {
                String var5;
                int var8;
                if (var0.field617 == 0) {
                    String var6 = var0.field627[0] + var0.field625 + var0.field627[1];
                    var8 = var0.field611;
                    int var9 = class69.localPlayer.field611;
                    int var10 = var9 - var8;
                    String var7;
                    if (var10 < -9) {
                        var7 = class128.method3233(16711680, 666156603);
                    } else if (var10 < -6) {
                        var7 = class128.method3233(16723968, 2018561338);
                    } else if (var10 < -3) {
                        var7 = class128.method3233(16740352, 1860902041);
                    } else if (var10 < 0) {
                        var7 = class128.method3233(16756736, 1321773363);
                    } else if (var10 > 9) {
                        var7 = class128.method3233(65280, 2061621162);
                    } else if (var10 > 6) {
                        var7 = class128.method3233(4259584, 860853582);
                    } else if (var10 > 3) {
                        var7 = class128.method3233(8453888, 1107821433);
                    } else if (var10 > 0) {
                        var7 = class128.method3233(12648192, 1501794056);
                    } else {
                        var7 = class128.method3233(16776960, 562756225);
                    }

                    var5 = var6 + var7 + " " + " (" + "level-" + var0.field611 + ")"
                        + var0.field627[2];
                } else {
                    var5 =
                        var0.field627[0] + var0.field625 + var0.field627[1] + " " + " (" + "skill-"
                            + var0.field617 + ")" + var0.field627[2];
                }

                int var11;
                if (client.field796 == 1) {
                    class79.method2039("Use", client.field766 + " " + "->" + " " + class128
                        .method3233(16777215, 1672942161) + var5, 14, var1, var2, var3, 114078933);
                } else if (client.field798) {
                    if ((class297.field3740 & 8) == 8) {
                        class79.method2039(client.field801,
                                           client.field716 + " " + "->" + " " + class128
                                               .method3233(16777215, 928658580) + var5, 15, var1,
                                           var2, var3, -1107617512);
                    }
                } else {
                    for (var11 = 7; var11 >= 0; --var11) {
                        if (client.field767[var11] != null) {
                            short var12 = 0;
                            if (client.field767[var11].equalsIgnoreCase("Attack")) {
                                if (class78.field1134 == client.field671) {
                                    continue;
                                }

                                if (class78.field1139 == client.field671
                                    || client.field671 == class78.field1141
                                    && var0.field611 > class69.localPlayer.field611) {
                                    var12 = 2000;
                                }

                                if (class69.localPlayer.field622 != 0 && var0.field622 != 0) {
                                    if (var0.field622 == class69.localPlayer.field622) {
                                        var12 = 2000;
                                    } else {
                                        var12 = 0;
                                    }
                                }
                            } else if (client.field768[var11]) {
                                var12 = 2000;
                            }

                            boolean var13 = false;
                            var8 = client.field742[var11] + var12;
                            class79.method2039(client.field767[var11],
                                               class128.method3233(16777215, 893393642) + var5,
                                               var8, var1, var2, var3, -829746987);
                        }
                    }
                }

                for (var11 = 0; var11 < client.field780; ++var11) {
                    if (client.field783[var11] == 23) {
                        client.field786[var11] = class128.method3233(16777215, 471873110) + var5;
                        break;
                    }
                }

            }
        }
    }

    int method3312(class289 var1, class289 var2, int var3) {
        if (client.field691 == var1.field3708) {
            if (var2.field3708 != client.field691) {
                return this.field1936 ? -1 : 1;
            }
        } else if (var2.field3708 == client.field691) {
            return this.field1936 ? 1 : -1;
        }

        return this.method5566(var1, var2, (byte) 114);
    }

    public int compare(Object var1, Object var2) {
        return this.method3312((class289) var1, (class289) var2, 1276746081);
    }
}
