package jagex.osrs;

public class class258 extends class208 {

    public static int[] field3334;
    public static class249 field3336;
    static class202 field3335;

    static {
        field3335 = new class202(64);
    }

    public boolean field3337;

    class258() {
        this.field3337 = false;
    }

    static int method5073(int var0, class86 var1, boolean var2, int var3) {
        if (var0 == 5000) {
            ScriptExecutor.field1070[++class60.field600 - 1] = client.field730;
            return 1;
        } else if (var0 == 5001) {
            class60.field600 -= 3;
            client.field730 = ScriptExecutor.field1070[class60.field600];
            class274.field3613 = class51
                .method1060(ScriptExecutor.field1070[class60.field600 + 1], -897441396);
            if (class274.field3613 == null) {
                class274.field3613 = class309.field3805;
            }

            client.field861 = ScriptExecutor.field1070[class60.field600 + 2];
            OutboundPacket var19 = class131
                .method3243(class171.field2253, client.field690.random, (byte) 20);
            var19.buffer.writeByte(client.field730);
            var19.buffer.writeByte(class274.field3613.field3807);
            var19.buffer.writeByte(client.field861);
            client.field690.method2193(var19, -427581266);
            return 1;
        } else {
            String var4;
            int var5;
            if (var0 == 5002) {
                var4 = ScriptExecutor.field1065[--ScriptExecutor.field1072];
                class60.field600 -= 2;
                var5 = ScriptExecutor.field1070[class60.field600];
                int var6 = ScriptExecutor.field1070[class60.field600 + 1];
                OutboundPacket var7 = class131
                    .method3243(class171.field2245, client.field690.random, (byte) 40);
                var7.buffer.writeByte(class97.method2404(var4, 778687306) + 2);
                var7.buffer.writeString(var4);
                var7.buffer.writeByte(var5 - 1);
                var7.buffer.writeByte(var6);
                client.field690.method2193(var7, 2131647930);
                return 1;
            } else {
                int var11;
                if (var0 == 5003) {
                    class60.field600 -= 2;
                    var11 = ScriptExecutor.field1070[class60.field600];
                    var5 = ScriptExecutor.field1070[class60.field600 + 1];
                    class59 var16 = class48.method989(var11, var5, -489490626);
                    if (var16 != null) {
                        ScriptExecutor.field1070[++class60.field600 - 1] = var16.field595;
                        ScriptExecutor.field1070[++class60.field600 - 1] = var16.field589;
                        ScriptExecutor.field1065[++ScriptExecutor.field1072 - 1] =
                            var16.field591 != null ? var16.field591 : "";
                        ScriptExecutor.field1065[++ScriptExecutor.field1072 - 1] =
                            var16.field596 != null ? var16.field596 : "";
                        ScriptExecutor.field1065[++ScriptExecutor.field1072 - 1] =
                            var16.field588 != null ? var16.field588 : "";
                        ScriptExecutor.field1070[++class60.field600 - 1] =
                            var16.method1136(-1029850765) ? 1
                                : (var16.method1133((byte) 40) ? 2 : 0);
                    } else {
                        ScriptExecutor.field1070[++class60.field600 - 1] = -1;
                        ScriptExecutor.field1070[++class60.field600 - 1] = 0;
                        ScriptExecutor.field1065[++ScriptExecutor.field1072 - 1] = "";
                        ScriptExecutor.field1065[++ScriptExecutor.field1072 - 1] = "";
                        ScriptExecutor.field1065[++ScriptExecutor.field1072 - 1] = "";
                        ScriptExecutor.field1070[++class60.field600 - 1] = 0;
                    }

                    return 1;
                } else if (var0 == 5004) {
                    var11 = ScriptExecutor.field1070[--class60.field600];
                    class59 var17 = class11.method119(var11, (byte) -102);
                    if (var17 != null) {
                        ScriptExecutor.field1070[++class60.field600 - 1] = var17.field597;
                        ScriptExecutor.field1070[++class60.field600 - 1] = var17.field589;
                        ScriptExecutor.field1065[++ScriptExecutor.field1072 - 1] =
                            var17.field591 != null ? var17.field591 : "";
                        ScriptExecutor.field1065[++ScriptExecutor.field1072 - 1] =
                            var17.field596 != null ? var17.field596 : "";
                        ScriptExecutor.field1065[++ScriptExecutor.field1072 - 1] =
                            var17.field588 != null ? var17.field588 : "";
                        ScriptExecutor.field1070[++class60.field600 - 1] =
                            var17.method1136(90493046) ? 1 : (var17.method1133((byte) 115) ? 2 : 0);
                    } else {
                        ScriptExecutor.field1070[++class60.field600 - 1] = -1;
                        ScriptExecutor.field1070[++class60.field600 - 1] = 0;
                        ScriptExecutor.field1065[++ScriptExecutor.field1072 - 1] = "";
                        ScriptExecutor.field1065[++ScriptExecutor.field1072 - 1] = "";
                        ScriptExecutor.field1065[++ScriptExecutor.field1072 - 1] = "";
                        ScriptExecutor.field1070[++class60.field600 - 1] = 0;
                    }

                    return 1;
                } else if (var0 == 5005) {
                    if (class274.field3613 == null) {
                        ScriptExecutor.field1070[++class60.field600 - 1] = -1;
                    } else {
                        ScriptExecutor.field1070[++class60.field600 - 1] = class274.field3613.field3807;
                    }

                    return 1;
                } else if (var0 == 5008) {
                    var4 = ScriptExecutor.field1065[--ScriptExecutor.field1072];
                    var5 = ScriptExecutor.field1070[--class60.field600];
                    String var15 = var4.toLowerCase();
                    byte var18 = 0;
                    if (var15.startsWith("yellow:")) {
                        var18 = 0;
                        var4 = var4.substring("yellow:".length());
                    } else if (var15.startsWith("red:")) {
                        var18 = 1;
                        var4 = var4.substring("red:".length());
                    } else if (var15.startsWith("green:")) {
                        var18 = 2;
                        var4 = var4.substring("green:".length());
                    } else if (var15.startsWith("cyan:")) {
                        var18 = 3;
                        var4 = var4.substring("cyan:".length());
                    } else if (var15.startsWith("purple:")) {
                        var18 = 4;
                        var4 = var4.substring("purple:".length());
                    } else if (var15.startsWith("white:")) {
                        var18 = 5;
                        var4 = var4.substring("white:".length());
                    } else if (var15.startsWith("flash1:")) {
                        var18 = 6;
                        var4 = var4.substring("flash1:".length());
                    } else if (var15.startsWith("flash2:")) {
                        var18 = 7;
                        var4 = var4.substring("flash2:".length());
                    } else if (var15.startsWith("flash3:")) {
                        var18 = 8;
                        var4 = var4.substring("flash3:".length());
                    } else if (var15.startsWith("glow1:")) {
                        var18 = 9;
                        var4 = var4.substring("glow1:".length());
                    } else if (var15.startsWith("glow2:")) {
                        var18 = 10;
                        var4 = var4.substring("glow2:".length());
                    } else if (var15.startsWith("glow3:")) {
                        var18 = 11;
                        var4 = var4.substring("glow3:".length());
                    } else if (client.field785 != 0) {
                        if (var15.startsWith("yellow:")) {
                            var18 = 0;
                            var4 = var4.substring("yellow:".length());
                        } else if (var15.startsWith("red:")) {
                            var18 = 1;
                            var4 = var4.substring("red:".length());
                        } else if (var15.startsWith("green:")) {
                            var18 = 2;
                            var4 = var4.substring("green:".length());
                        } else if (var15.startsWith("cyan:")) {
                            var18 = 3;
                            var4 = var4.substring("cyan:".length());
                        } else if (var15.startsWith("purple:")) {
                            var18 = 4;
                            var4 = var4.substring("purple:".length());
                        } else if (var15.startsWith("white:")) {
                            var18 = 5;
                            var4 = var4.substring("white:".length());
                        } else if (var15.startsWith("flash1:")) {
                            var18 = 6;
                            var4 = var4.substring("flash1:".length());
                        } else if (var15.startsWith("flash2:")) {
                            var18 = 7;
                            var4 = var4.substring("flash2:".length());
                        } else if (var15.startsWith("flash3:")) {
                            var18 = 8;
                            var4 = var4.substring("flash3:".length());
                        } else if (var15.startsWith("glow1:")) {
                            var18 = 9;
                            var4 = var4.substring("glow1:".length());
                        } else if (var15.startsWith("glow2:")) {
                            var18 = 10;
                            var4 = var4.substring("glow2:".length());
                        } else if (var15.startsWith("glow3:")) {
                            var18 = 11;
                            var4 = var4.substring("glow3:".length());
                        }
                    }

                    var15 = var4.toLowerCase();
                    byte var8 = 0;
                    if (var15.startsWith("wave:")) {
                        var8 = 1;
                        var4 = var4.substring("wave:".length());
                    } else if (var15.startsWith("wave2:")) {
                        var8 = 2;
                        var4 = var4.substring("wave2:".length());
                    } else if (var15.startsWith("shake:")) {
                        var8 = 3;
                        var4 = var4.substring("shake:".length());
                    } else if (var15.startsWith("scroll:")) {
                        var8 = 4;
                        var4 = var4.substring("scroll:".length());
                    } else if (var15.startsWith("slide:")) {
                        var8 = 5;
                        var4 = var4.substring("slide:".length());
                    } else if (client.field785 != 0) {
                        if (var15.startsWith("wave:")) {
                            var8 = 1;
                            var4 = var4.substring("wave:".length());
                        } else if (var15.startsWith("wave2:")) {
                            var8 = 2;
                            var4 = var4.substring("wave2:".length());
                        } else if (var15.startsWith("shake:")) {
                            var8 = 3;
                            var4 = var4.substring("shake:".length());
                        } else if (var15.startsWith("scroll:")) {
                            var8 = 4;
                            var4 = var4.substring("scroll:".length());
                        } else if (var15.startsWith("slide:")) {
                            var8 = 5;
                            var4 = var4.substring("slide:".length());
                        }
                    }

                    OutboundPacket var9 = class131
                        .method3243(class171.field2230, client.field690.random, (byte) 20);
                    var9.buffer.writeByte(0);
                    int var10 = var9.buffer.offset;
                    var9.buffer.writeByte(var5);
                    var9.buffer.writeByte(var18);
                    var9.buffer.writeByte(var8);
                    class150.method3372(var9.buffer, var4, -1488886735);
                    var9.buffer.method3766(var9.buffer.offset - var10, (byte) -67);
                    client.field690.method2193(var9, -562081941);
                    return 1;
                } else if (var0 == 5009) {
                    ScriptExecutor.field1072 -= 2;
                    var4 = ScriptExecutor.field1065[ScriptExecutor.field1072];
                    String var13 = ScriptExecutor.field1065[ScriptExecutor.field1072 + 1];
                    OutboundPacket var12 = class131
                        .method3243(class171.field2232, client.field690.random, (byte) 112);
                    var12.buffer.writeShort(0);
                    int var14 = var12.buffer.offset;
                    var12.buffer.writeString(var4);
                    class150.method3372(var12.buffer, var13, 713888619);
                    var12.buffer.writeLengthShort(var12.buffer.offset - var14);
                    client.field690.method2193(var12, -931678814);
                    return 1;
                } else if (var0 != 5015) {
                    if (var0 == 5016) {
                        ScriptExecutor.field1070[++class60.field600 - 1] = client.field861;
                        return 1;
                    } else if (var0 == 5017) {
                        var11 = ScriptExecutor.field1070[--class60.field600];
                        ScriptExecutor.field1070[++class60.field600 - 1] = class85
                            .method2148(var11, -1475978689);
                        return 1;
                    } else if (var0 == 5018) {
                        var11 = ScriptExecutor.field1070[--class60.field600];
                        ScriptExecutor.field1070[++class60.field600 - 1] = class32
                            .method606(var11, -1545928521);
                        return 1;
                    } else if (var0 == 5019) {
                        var11 = ScriptExecutor.field1070[--class60.field600];
                        ScriptExecutor.field1070[++class60.field600 - 1] = ScriptCall
                            .method1125(var11, -296833582);
                        return 1;
                    } else if (var0 == 5020) {
                        var4 = ScriptExecutor.field1065[--ScriptExecutor.field1072];
                        class40.method761(var4, (short) 17668);
                        return 1;
                    } else if (var0 == 5021) {
                        client.field862 = ScriptExecutor.field1065[--ScriptExecutor.field1072].toLowerCase()
                                                                                .trim();
                        return 1;
                    } else if (var0 == 5022) {
                        ScriptExecutor.field1065[++ScriptExecutor.field1072 - 1] = client.field862;
                        return 1;
                    } else {
                        return 2;
                    }
                } else {
                    if (class69.localPlayer != null && class69.localPlayer.field625 != null) {
                        var4 = class69.localPlayer.field625.method5706(-165222639);
                    } else {
                        var4 = "";
                    }

                    ScriptExecutor.field1065[++ScriptExecutor.field1072 - 1] = var4;
                    return 1;
                }
            }
        }
    }

    void method5069(Buffer var1, int var2, int var3) {
        if (var2 == 2) {
            this.field3337 = true;
        }

    }

    void method5068(Buffer var1, int var2) {
        while (true) {
            int var3 = var1.readUint8();
            if (var3 == 0) {
                return;
            }

            this.method5069(var1, var3, 465607737);
        }
    }
}
