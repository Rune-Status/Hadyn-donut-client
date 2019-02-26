package jagex.osrs;

public class class150 implements class149 {

    public static boolean method3373(int var0, int var1) {
        return var0 == class235.field2840.field2839;
    }

    public static OutboundPacket method3375(int var0) {
        OutboundPacket var1 = class171.method3655(-808455708);
        var1.field2331 = null;
        var1.field2330 = 0;
        var1.buffer = new PacketBuffer(5000);
        return var1;
    }

    static int method3374(int var0, class86 var1, boolean var2, byte var3) {
        int var4;
        if (var0 == 3903) {
            var4 = class70.field1070[--class60.field600];
            class70.field1070[++class60.field600 - 1] = client.field895[var4].method41(-87060706);
            return 1;
        } else if (var0 == 3904) {
            var4 = class70.field1070[--class60.field600];
            class70.field1070[++class60.field600 - 1] = client.field895[var4].field30;
            return 1;
        } else if (var0 == 3905) {
            var4 = class70.field1070[--class60.field600];
            class70.field1070[++class60.field600 - 1] = client.field895[var4].field31;
            return 1;
        } else if (var0 == 3906) {
            var4 = class70.field1070[--class60.field600];
            class70.field1070[++class60.field600 - 1] = client.field895[var4].field33;
            return 1;
        } else if (var0 == 3907) {
            var4 = class70.field1070[--class60.field600];
            class70.field1070[++class60.field600 - 1] = client.field895[var4].field38;
            return 1;
        } else if (var0 == 3908) {
            var4 = class70.field1070[--class60.field600];
            class70.field1070[++class60.field600 - 1] = client.field895[var4].field35;
            return 1;
        } else {
            int var13;
            if (var0 == 3910) {
                var4 = class70.field1070[--class60.field600];
                var13 = client.field895[var4].method40((byte) 33);
                class70.field1070[++class60.field600 - 1] = var13 == 0 ? 1 : 0;
                return 1;
            } else if (var0 == 3911) {
                var4 = class70.field1070[--class60.field600];
                var13 = client.field895[var4].method40((byte) 5);
                class70.field1070[++class60.field600 - 1] = var13 == 2 ? 1 : 0;
                return 1;
            } else if (var0 == 3912) {
                var4 = class70.field1070[--class60.field600];
                var13 = client.field895[var4].method40((byte) 17);
                class70.field1070[++class60.field600 - 1] = var13 == 5 ? 1 : 0;
                return 1;
            } else if (var0 == 3913) {
                var4 = class70.field1070[--class60.field600];
                var13 = client.field895[var4].method40((byte) 29);
                class70.field1070[++class60.field600 - 1] = var13 == 1 ? 1 : 0;
                return 1;
            } else {
                boolean var14;
                if (var0 == 3914) {
                    var14 = class70.field1070[--class60.field600] == 1;
                    if (class59.field590 != null) {
                        class59.field590.method15(class1.field10, var14, -2022263480);
                    }

                    return 1;
                } else if (var0 == 3915) {
                    var14 = class70.field1070[--class60.field600] == 1;
                    if (class59.field590 != null) {
                        class59.field590.method15(class1.field3, var14, -314584601);
                    }

                    return 1;
                } else if (var0 == 3916) {
                    class60.field600 -= 2;
                    var14 = class70.field1070[class60.field600] == 1;
                    boolean var5 = class70.field1070[class60.field600 + 1] == 1;
                    if (class59.field590 != null) {
                        client.field913.field636 = var5;
                        class59.field590.method15(client.field913, var14, -68926513);
                    }

                    return 1;
                } else if (var0 == 3917) {
                    var14 = class70.field1070[--class60.field600] == 1;
                    if (class59.field590 != null) {
                        class59.field590.method15(class1.field4, var14, -494308648);
                    }

                    return 1;
                } else if (var0 == 3918) {
                    var14 = class70.field1070[--class60.field600] == 1;
                    if (class59.field590 != null) {
                        class59.field590.method15(class1.field7, var14, -1527962543);
                    }

                    return 1;
                } else if (var0 == 3919) {
                    class70.field1070[++class60.field600 - 1] =
                        class59.field590 == null ? 0 : class59.field590.field14.size();
                    return 1;
                } else {
                    class2 var12;
                    if (var0 == 3920) {
                        var4 = class70.field1070[--class60.field600];
                        var12 = (class2) class59.field590.field14.get(var4);
                        class70.field1070[++class60.field600 - 1] = var12.field17;
                        return 1;
                    } else if (var0 == 3921) {
                        var4 = class70.field1070[--class60.field600];
                        var12 = (class2) class59.field590.field14.get(var4);
                        class70.field1065[++class70.field1072 - 1] = var12.method18(-1999497745);
                        return 1;
                    } else if (var0 == 3922) {
                        var4 = class70.field1070[--class60.field600];
                        var12 = (class2) class59.field590.field14.get(var4);
                        class70.field1065[++class70.field1072 - 1] = var12.method19(-1458167475);
                        return 1;
                    } else if (var0 == 3923) {
                        var4 = class70.field1070[--class60.field600];
                        var12 = (class2) class59.field590.field14.get(var4);
                        long var6 =
                            class120.method2866((short) 3133) - class113.field1511 - var12.field16;
                        int var8 = (int) (var6 / 3600000L);
                        int var9 = (int) ((var6 - (long) (var8 * 3600000)) / 60000L);
                        int var10 = (int) ((var6 - (long) (var8 * 3600000) - (long) (var9 * 60000))
                            / 1000L);
                        String var11 =
                            var8 + ":" + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10;
                        class70.field1065[++class70.field1072 - 1] = var11;
                        return 1;
                    } else if (var0 == 3924) {
                        var4 = class70.field1070[--class60.field600];
                        var12 = (class2) class59.field590.field14.get(var4);
                        class70.field1070[++class60.field600 - 1] = var12.field19.field33;
                        return 1;
                    } else if (var0 == 3925) {
                        var4 = class70.field1070[--class60.field600];
                        var12 = (class2) class59.field590.field14.get(var4);
                        class70.field1070[++class60.field600 - 1] = var12.field19.field31;
                        return 1;
                    } else if (var0 == 3926) {
                        var4 = class70.field1070[--class60.field600];
                        var12 = (class2) class59.field590.field14.get(var4);
                        class70.field1070[++class60.field600 - 1] = var12.field19.field30;
                        return 1;
                    } else {
                        return 2;
                    }
                }
            }
        }
    }

    public static int method3372(Buffer var0, String var1, int var2) {
        int var3 = var0.offset;
        byte[] var4 = class126.method3055(var1, -1473228892);
        var0.method3759(var4.length, (byte) -76);
        var0.offset += class302.field3784
            .method3693(var4, 0, var4.length, var0.bytes, var0.offset, (byte) 1);
        return var0.offset - var3;
    }
}
