package jagex.osrs;

public class OutboundPacket extends Node {

    static OutboundPacket[] field2334;
    static int field2335;

    static {
        field2334 = new OutboundPacket[300];
        field2335 = 0;
    }

    public PacketBuffer buffer;
    public int field2333;
    class171 field2331;
    int field2330;

    static void method3670(PacketBuffer var0, int var1, byte var2) {
        boolean var3 = var0.readBits(1) == 1;
        if (var3) {
            class83.field1234[++class83.field1227 - 1] = var1;
        }

        int var4 = var0.readBits(2);
        Player var5 = client.players[var1];
        if (var4 == 0) {
            if (var3) {
                var5.field631 = false;
            } else if (client.localPlayerId == var1) {
                throw new RuntimeException();
            } else {
                class83.field1230[var1] =
                    (var5.level << 28) + (class11.sceneZ + var5.wz[0] >> 13) + (
                        class49.sceneX + var5.wx[0] >> 13 << 14);
                if (var5.field967 != -1) {
                    class83.field1231[var1] = var5.field967;
                } else {
                    class83.field1231[var1] = var5.field990;
                }

                class83.field1232[var1] = var5.field965;
                client.players[var1] = null;
                if (var0.readBits(1) != 0) {
                    class86.method2162(var0, var1, -202222013);
                }

            }
        } else {
            int var6;
            int var7;
            int var8;
            if (var4 == 1) {
                var6 = var0.readBits(3);
                var7 = var5.wx[0];
                var8 = var5.wz[0];
                if (var6 == 0) {
                    --var7;
                    --var8;
                } else if (var6 == 1) {
                    --var8;
                } else if (var6 == 2) {
                    ++var7;
                    --var8;
                } else if (var6 == 3) {
                    --var7;
                } else if (var6 == 4) {
                    ++var7;
                } else if (var6 == 5) {
                    --var7;
                    ++var8;
                } else if (var6 == 6) {
                    ++var8;
                } else if (var6 == 7) {
                    ++var7;
                    ++var8;
                }

                if (client.localPlayerId != var1
                    || var5.x >= 1536 && var5.z >= 1536 && var5.x < 11776
                    && var5.z < 11776) {
                    if (var3) {
                        var5.field631 = true;
                        var5.field632 = var7;
                        var5.field633 = var8;
                    } else {
                        var5.field631 = false;
                        var5.method1180(var7, var8, class83.field1224[var1], (byte) 10);
                    }
                } else {
                    var5.method1210(var7, var8, 1423492211);
                    var5.field631 = false;
                }

            } else if (var4 == 2) {
                var6 = var0.readBits(4);
                var7 = var5.wx[0];
                var8 = var5.wz[0];
                if (var6 == 0) {
                    var7 -= 2;
                    var8 -= 2;
                } else if (var6 == 1) {
                    --var7;
                    var8 -= 2;
                } else if (var6 == 2) {
                    var8 -= 2;
                } else if (var6 == 3) {
                    ++var7;
                    var8 -= 2;
                } else if (var6 == 4) {
                    var7 += 2;
                    var8 -= 2;
                } else if (var6 == 5) {
                    var7 -= 2;
                    --var8;
                } else if (var6 == 6) {
                    var7 += 2;
                    --var8;
                } else if (var6 == 7) {
                    var7 -= 2;
                } else if (var6 == 8) {
                    var7 += 2;
                } else if (var6 == 9) {
                    var7 -= 2;
                    ++var8;
                } else if (var6 == 10) {
                    var7 += 2;
                    ++var8;
                } else if (var6 == 11) {
                    var7 -= 2;
                    var8 += 2;
                } else if (var6 == 12) {
                    --var7;
                    var8 += 2;
                } else if (var6 == 13) {
                    var8 += 2;
                } else if (var6 == 14) {
                    ++var7;
                    var8 += 2;
                } else if (var6 == 15) {
                    var7 += 2;
                    var8 += 2;
                }

                if (client.localPlayerId == var1 && (var5.x < 1536 || var5.z < 1536
                    || var5.x >= 11776 || var5.z >= 11776)) {
                    var5.method1210(var7, var8, -646274015);
                    var5.field631 = false;
                } else if (var3) {
                    var5.field631 = true;
                    var5.field632 = var7;
                    var5.field633 = var8;
                } else {
                    var5.field631 = false;
                    var5.method1180(var7, var8, class83.field1224[var1], (byte) 116);
                }

            } else {
                var6 = var0.readBits(1);
                int var9;
                int var10;
                int var11;
                int var12;
                if (var6 == 0) {
                    var7 = var0.readBits(12);
                    var8 = var7 >> 10;
                    var9 = var7 >> 5 & 31;
                    if (var9 > 15) {
                        var9 -= 32;
                    }

                    var10 = var7 & 31;
                    if (var10 > 15) {
                        var10 -= 32;
                    }

                    var11 = var9 + var5.wx[0];
                    var12 = var10 + var5.wz[0];
                    if (client.localPlayerId != var1
                        || var5.x >= 1536 && var5.z >= 1536 && var5.x < 11776
                        && var5.z < 11776) {
                        if (var3) {
                            var5.field631 = true;
                            var5.field632 = var11;
                            var5.field633 = var12;
                        } else {
                            var5.field631 = false;
                            var5.method1180(var11, var12, class83.field1224[var1], (byte) 78);
                        }
                    } else {
                        var5.method1210(var11, var12, 2066358275);
                        var5.field631 = false;
                    }

                    var5.level = (byte) (var8 + var5.level & 3);
                    if (client.localPlayerId == var1) {
                        class60.level = var5.level;
                    }

                } else {
                    var7 = var0.readBits(30);
                    var8 = var7 >> 28;
                    var9 = var7 >> 14 & 16383;
                    var10 = var7 & 16383;
                    var11 = (var9 + class49.sceneX + var5.wx[0] & 16383) - class49.sceneX;
                    var12 = (var10 + class11.sceneZ + var5.wz[0] & 16383) - class11.sceneZ;
                    if (client.localPlayerId != var1
                        || var5.x >= 1536 && var5.z >= 1536 && var5.x < 11776
                        && var5.z < 11776) {
                        if (var3) {
                            var5.field631 = true;
                            var5.field632 = var11;
                            var5.field633 = var12;
                        } else {
                            var5.field631 = false;
                            var5.method1180(var11, var12, class83.field1224[var1], (byte) 41);
                        }
                    } else {
                        var5.method1210(var11, var12, -1263439258);
                        var5.field631 = false;
                    }

                    var5.level = (byte) (var8 + var5.level & 3);
                    if (client.localPlayerId == var1) {
                        class60.level = var5.level;
                    }

                }
            }
        }
    }

    public void method3668(short var1) {
        if (field2335 < field2334.length) {
            field2334[++field2335 - 1] = this;
        }
    }
}
