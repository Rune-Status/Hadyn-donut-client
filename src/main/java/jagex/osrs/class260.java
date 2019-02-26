package jagex.osrs;

public class class260 extends class208 {

    static class202 field3345;
    static class202 field3344;
    static class249 field3343;
    static class249 field3347;

    static {
        field3344 = new class202(64);
        field3345 = new class202(30);
    }

    public int field3348;
    int field3357;
    int field3342;
    int field3353;
    int field3354;
    int field3350;
    int field3356;
    int field3355;
    short[] field3349;
    short[] field3351;
    short[] field3346;
    short[] field3352;

    class260() {
        this.field3348 = -1;
        this.field3353 = 128;
        this.field3354 = 128;
        this.field3350 = 0;
        this.field3356 = 0;
        this.field3355 = 0;
    }

    static final void decodePlayerPositioning(PacketBuffer buffer) {
        buffer.startBitAccess();
        int localId = client.localPlayerId;
        Player local = class69.localPlayer = client.players[localId] = new Player();
        local.id = localId;
        int var4 = buffer.readBits(30);
        byte level = (byte) (var4 >> 28);
        int var6 = var4 >> 14 & 16383;
        int var7 = var4 & 16383;
        local.wx[0] = var6 - class49.sceneX;
        local.x = (local.wx[0] << 7) + (local.getSize() << 6);
        local.wz[0] = var7 - class11.sceneZ;
        local.z = (local.wz[0] << 7) + (local.getSize() << 6);
        class60.level = local.level = level;
        if (class83.playerConfigs[localId] != null) {
            local.decode(class83.playerConfigs[localId]);
        }
        class83.field1226 = 0;
        class83.field1222[++class83.field1226 - 1] = localId;
        class83.field1223[localId] = 0;
        class83.field1228 = 0;

        for (int id = 1; id < 2048; ++id) {
            if (id == localId) {
                continue;
            }
            int var9 = buffer.readBits(18);
            int var10 = var9 >> 16;
            int var11 = var9 >> 8 & 597;
            int var12 = var9 & 0x255;
            class83.field1230[id] = (var11 << 14) + var12 + (var10 << 28);
            class83.field1231[id] = 0;
            class83.field1232[id] = -1;
            class83.field1225[++class83.field1228 - 1] = id;
            class83.field1223[id] = 0;
        }

        buffer.endBitAccess();
    }

    static int method5103(int var0, class86 var1, boolean var2, int var3) {
        if (var0 == 6200) {
            class60.field600 -= 2;
            client.field649 = (short) class297
                .method5770(class70.field1070[class60.field600], -46607763);
            if (client.field649 <= 0) {
                client.field649 = 256;
            }

            client.field896 = (short) class297
                .method5770(class70.field1070[class60.field600 + 1], -771837646);
            if (client.field896 <= 0) {
                client.field896 = 256;
            }

            return 1;
        } else if (var0 == 6201) {
            class60.field600 -= 2;
            client.field897 = (short) class70.field1070[class60.field600];
            if (client.field897 <= 0) {
                client.field897 = 256;
            }

            client.field898 = (short) class70.field1070[class60.field600 + 1];
            if (client.field898 <= 0) {
                client.field898 = 320;
            }

            return 1;
        } else if (var0 == 6202) {
            class60.field600 -= 4;
            client.field899 = (short) class70.field1070[class60.field600];
            if (client.field899 <= 0) {
                client.field899 = 1;
            }

            client.field684 = (short) class70.field1070[class60.field600 + 1];
            if (client.field684 <= 0) {
                client.field684 = 32767;
            } else if (client.field684 < client.field899) {
                client.field684 = client.field899;
            }

            client.field901 = (short) class70.field1070[class60.field600 + 2];
            if (client.field901 <= 0) {
                client.field901 = 1;
            }

            client.field754 = (short) class70.field1070[class60.field600 + 3];
            if (client.field754 <= 0) {
                client.field754 = 32767;
            } else if (client.field754 < client.field901) {
                client.field754 = client.field901;
            }

            return 1;
        } else if (var0 == 6203) {
            if (client.field815 != null) {
                class3.method36(0, 0, client.field815.field2682, client.field815.field2683, false,
                                1255618077);
                class70.field1070[++class60.field600 - 1] = client.field644;
                class70.field1070[++class60.field600 - 1] = client.field764;
            } else {
                class70.field1070[++class60.field600 - 1] = -1;
                class70.field1070[++class60.field600 - 1] = -1;
            }

            return 1;
        } else if (var0 == 6204) {
            class70.field1070[++class60.field600 - 1] = client.field897;
            class70.field1070[++class60.field600 - 1] = client.field898;
            return 1;
        } else if (var0 == 6205) {
            class70.field1070[++class60.field600 - 1] = class252
                .method4978(client.field649, (byte) 104);
            class70.field1070[++class60.field600 - 1] = class252
                .method4978(client.field896, (byte) 3);
            return 1;
        } else {
            return 2;
        }
    }

    void method5090(Buffer var1, int var2, short var3) {
        if (var2 == 1) {
            this.field3342 = var1.readUint16();
        } else if (var2 == 2) {
            this.field3348 = var1.readUint16();
        } else if (var2 == 4) {
            this.field3353 = var1.readUint16();
        } else if (var2 == 5) {
            this.field3354 = var1.readUint16();
        } else if (var2 == 6) {
            this.field3350 = var1.readUint16();
        } else if (var2 == 7) {
            this.field3356 = var1.getUByte();
        } else if (var2 == 8) {
            this.field3355 = var1.getUByte();
        } else {
            int var4;
            int var5;
            if (var2 == 40) {
                var4 = var1.getUByte();
                this.field3349 = new short[var4];
                this.field3346 = new short[var4];

                for (var5 = 0; var5 < var4; ++var5) {
                    this.field3349[var5] = (short) var1.readUint16();
                    this.field3346[var5] = (short) var1.readUint16();
                }
            } else if (var2 == 41) {
                var4 = var1.getUByte();
                this.field3351 = new short[var4];
                this.field3352 = new short[var4];

                for (var5 = 0; var5 < var4; ++var5) {
                    this.field3351[var5] = (short) var1.readUint16();
                    this.field3352[var5] = (short) var1.readUint16();
                }
            }
        }

    }

    public final class121 method5088(int var1, int var2) {
        class121 var3 = (class121) field3345.method4198((long) this.field3357);
        if (var3 == null) {
            class115 var4 = class115.method2843(field3343, this.field3342, 0);
            if (var4 == null) {
                return null;
            }

            int var5;
            if (this.field3349 != null) {
                for (var5 = 0; var5 < this.field3349.length; ++var5) {
                    var4.method2775(this.field3349[var5], this.field3346[var5]);
                }
            }

            if (this.field3351 != null) {
                for (var5 = 0; var5 < this.field3351.length; ++var5) {
                    var4.method2785(this.field3351[var5], this.field3352[var5]);
                }
            }

            var3 = var4.method2772(this.field3356 + 64, this.field3355 + 850, -30, -50, -30);
            field3345.method4204(var3, (long) this.field3357);
        }

        class121 var6;
        if (this.field3348 != -1 && var1 != -1) {
            var6 = class29.method532(this.field3348, -1526848362)
                          .method5486(var3, var1, -358677299);
        } else {
            var6 = var3.method2881(true);
        }

        if (this.field3353 != 128 || this.field3354 != 128) {
            var6.method2878(this.field3353, this.field3354, this.field3353);
        }

        if (this.field3350 != 0) {
            if (this.field3350 == 90) {
                var6.method2880();
            }

            if (this.field3350 == 180) {
                var6.method2880();
                var6.method2880();
            }

            if (this.field3350 == 270) {
                var6.method2880();
                var6.method2880();
                var6.method2880();
            }
        }

        return var6;
    }

    void method5089(Buffer var1, int var2) {
        while (true) {
            int var3 = var1.getUByte();
            if (var3 == 0) {
                return;
            }

            this.method5090(var1, var3, (short) 3929);
        }
    }
}
