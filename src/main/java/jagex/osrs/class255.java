package jagex.osrs;

public class class255 extends class208 {

    public static class249 field3301;
    static class202 field3298;

    static {
        field3298 = new class202(64);
    }

    public int field3299;

    class255() {
        this.field3299 = 0;
    }

    static final void method5016(String var0, byte var1) {
        OutboundPacket var2 = class131
            .method3243(class171.field2278, client.field690.random, (byte) 50);
        var2.buffer.writeByte(class97.method2404(var0, 512621699));
        var2.buffer.writeString(var0);
        client.field690.method2193(var2, 278005400);
    }

    static final void method5017(byte[] var0, int var1, int var2, int var3, int var4, int var5,
                                 int var6, int var7, class127 var8, class166[] var9, int var10) {
        Buffer var11 = new Buffer(var0);
        int var12 = -1;

        while (true) {
            int var13 = var11.method3784(-474874286);
            if (var13 == 0) {
                return;
            }

            var12 += var13;
            int var14 = 0;

            while (true) {
                int var15 = var11.method3783(1116842334);
                if (var15 == 0) {
                    break;
                }

                var14 += var15 - 1;
                int var16 = var14 & 63;
                int var17 = var14 >> 6 & 63;
                int var18 = var14 >> 12;
                int var19 = var11.readUint8();
                int var20 = var19 >> 2;
                int var21 = var19 & 3;
                if (var18 == var4 && var17 >= var5 && var17 < var5 + 8 && var16 >= var6
                    && var16 < var6 + 8) {
                    class270 var22 = class253.method4993(var12, (byte) 7);
                    int var25 = var17 & 7;
                    int var26 = var16 & 7;
                    int var28 = var22.field3501;
                    int var29 = var22.field3475;
                    int var30;
                    if ((var21 & 1) == 1) {
                        var30 = var28;
                        var28 = var29;
                        var29 = var30;
                    }

                    int var27 = var7 & 3;
                    int var24;
                    if (var27 == 0) {
                        var24 = var25;
                    } else if (var27 == 1) {
                        var24 = var26;
                    } else if (var27 == 2) {
                        var24 = 7 - var25 - (var28 - 1);
                    } else {
                        var24 = 7 - var26 - (var29 - 1);
                    }

                    var30 = var2 + var24;
                    int var33 = var17 & 7;
                    int var34 = var16 & 7;
                    int var36 = var22.field3501;
                    int var37 = var22.field3475;
                    int var38;
                    if ((var21 & 1) == 1) {
                        var38 = var36;
                        var36 = var37;
                        var37 = var38;
                    }

                    int var35 = var7 & 3;
                    int var32;
                    if (var35 == 0) {
                        var32 = var34;
                    } else if (var35 == 1) {
                        var32 = 7 - var33 - (var36 - 1);
                    } else if (var35 == 2) {
                        var32 = 7 - var34 - (var37 - 1);
                    } else {
                        var32 = var33;
                    }

                    var38 = var3 + var32;
                    if (var30 > 0 && var38 > 0 && var30 < 103 && var38 < 103) {
                        int var39 = var1;
                        if ((class50.field492[1][var30][var38] & 2) == 2) {
                            var39 = var1 - 1;
                        }

                        class166 var40 = null;
                        if (var39 >= 0) {
                            var40 = var9[var39];
                        }

                        class23.method381(var1, var30, var38, var12, var21 + var7 & 3, var20, var8,
                                          var40, (byte) 76);
                    }
                }
            }
        }
    }

    void method5006(Buffer var1, int var2, int var3) {
        if (var2 == 2) {
            this.field3299 = var1.readUint16();
        }

    }

    void method5004(Buffer var1, int var2) {
        while (true) {
            int var3 = var1.readUint8();
            if (var3 == 0) {
                return;
            }

            this.method5006(var1, var3, 1767209492);
        }
    }
}
