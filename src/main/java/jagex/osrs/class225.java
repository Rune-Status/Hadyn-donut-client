package jagex.osrs;

public class class225 extends Node {

    class204 field2619;
    byte[] field2620;

    class225(Buffer var1) {
        var1.offset = var1.bytes.length - 3;
        int var2 = var1.getUByte();
        int var3 = var1.readUint16();
        int var4 = var2 * 10 + 14;
        var1.offset = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;

        int var13;
        int var14;
        int var15;
        for (var13 = 0; var13 < var2; ++var13) {
            var14 = -1;

            while (true) {
                var15 = var1.getUByte();
                if (var15 != var14) {
                    ++var4;
                }

                var14 = var15 & 15;
                if (var15 == 7) {
                    break;
                }

                if (var15 == 23) {
                    ++var5;
                } else if (var14 == 0) {
                    ++var7;
                } else if (var14 == 1) {
                    ++var8;
                } else if (var14 == 2) {
                    ++var6;
                } else if (var14 == 3) {
                    ++var9;
                } else if (var14 == 4) {
                    ++var10;
                } else if (var14 == 5) {
                    ++var11;
                } else {
                    if (var14 != 6) {
                        throw new RuntimeException();
                    }

                    ++var12;
                }
            }
        }

        var4 += var5 * 5;
        var4 += (var7 + var8 + var6 + var9 + var11) * 2;
        var4 = var4 + var10 + var12;
        var13 = var1.offset;
        var14 = var2 + var5 + var6 + var7 + var8 + var9 + var10 + var11 + var12;

        for (var15 = 0; var15 < var14; ++var15) {
            var1.method3787((byte) 2);
        }

        var4 += var1.offset - var13;
        var15 = var1.offset;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;

        int var29;
        for (var29 = 0; var29 < var6; ++var29) {
            var28 = var28 + var1.getUByte() & 127;
            if (var28 != 0 && var28 != 32) {
                if (var28 == 1) {
                    ++var16;
                } else if (var28 == 33) {
                    ++var17;
                } else if (var28 == 7) {
                    ++var18;
                } else if (var28 == 39) {
                    ++var19;
                } else if (var28 == 10) {
                    ++var20;
                } else if (var28 == 42) {
                    ++var21;
                } else if (var28 == 99) {
                    ++var22;
                } else if (var28 == 98) {
                    ++var23;
                } else if (var28 == 101) {
                    ++var24;
                } else if (var28 == 100) {
                    ++var25;
                } else if (var28 != 64 && var28 != 65 && var28 != 120 && var28 != 121
                    && var28 != 123) {
                    ++var27;
                } else {
                    ++var26;
                }
            } else {
                ++var12;
            }
        }

        var29 = 0;
        int var30 = var1.offset;
        var1.offset += var26;
        int var31 = var1.offset;
        var1.offset += var11;
        int var32 = var1.offset;
        var1.offset += var10;
        int var33 = var1.offset;
        var1.offset += var9;
        int var34 = var1.offset;
        var1.offset += var16;
        int var35 = var1.offset;
        var1.offset += var18;
        int var36 = var1.offset;
        var1.offset += var20;
        int var37 = var1.offset;
        var1.offset += var7 + var8 + var11;
        int var38 = var1.offset;
        var1.offset += var7;
        int var39 = var1.offset;
        var1.offset += var27;
        int var40 = var1.offset;
        var1.offset += var8;
        int var41 = var1.offset;
        var1.offset += var17;
        int var42 = var1.offset;
        var1.offset += var19;
        int var43 = var1.offset;
        var1.offset += var21;
        int var44 = var1.offset;
        var1.offset += var12;
        int var45 = var1.offset;
        var1.offset += var9;
        int var46 = var1.offset;
        var1.offset += var22;
        int var47 = var1.offset;
        var1.offset += var23;
        int var48 = var1.offset;
        var1.offset += var24;
        int var49 = var1.offset;
        var1.offset += var25;
        int var50 = var1.offset;
        var1.offset += var5 * 3;
        this.field2620 = new byte[var4];
        Buffer var51 = new Buffer(this.field2620);
        var51.writeInt(1297377380);
        var51.writeInt(6);
        var51.writeShort(var2 > 1 ? 1 : 0);
        var51.writeShort(var2);
        var51.writeShort(var3);
        var1.offset = var13;
        int var52 = 0;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        int var57 = 0;
        int var58 = 0;
        int[] var59 = new int[128];
        var28 = 0;

        label221:
        for (int var60 = 0; var60 < var2; ++var60) {
            var51.writeInt(1297379947);
            var51.offset += 4;
            int var61 = var51.offset;
            int var62 = -1;

            while (true) {
                while (true) {
                    int var63 = var1.method3787((byte) 2);
                    var51.method3768(var63, (byte) -79);
                    int var64 = var1.bytes[var29++] & 255;
                    boolean var65 = var64 != var62;
                    var62 = var64 & 15;
                    if (var64 == 7) {
                        if (var65) {
                            var51.writeByte(255);
                        }

                        var51.writeByte(47);
                        var51.writeByte(0);
                        var51.method3764(var51.offset - var61, (byte) 0);
                        continue label221;
                    }

                    if (var64 == 23) {
                        if (var65) {
                            var51.writeByte(255);
                        }

                        var51.writeByte(81);
                        var51.writeByte(3);
                        var51.writeByte(var1.bytes[var50++]);
                        var51.writeByte(var1.bytes[var50++]);
                        var51.writeByte(var1.bytes[var50++]);
                    } else {
                        var52 ^= var64 >> 4;
                        if (var62 == 0) {
                            if (var65) {
                                var51.writeByte(var52 + 144);
                            }

                            var53 += var1.bytes[var37++];
                            var54 += var1.bytes[var38++];
                            var51.writeByte(var53 & 127);
                            var51.writeByte(var54 & 127);
                        } else if (var62 == 1) {
                            if (var65) {
                                var51.writeByte(var52 + 128);
                            }

                            var53 += var1.bytes[var37++];
                            var55 += var1.bytes[var40++];
                            var51.writeByte(var53 & 127);
                            var51.writeByte(var55 & 127);
                        } else if (var62 == 2) {
                            if (var65) {
                                var51.writeByte(var52 + 176);
                            }

                            var28 = var28 + var1.bytes[var15++] & 127;
                            var51.writeByte(var28);
                            byte var66;
                            if (var28 != 0 && var28 != 32) {
                                if (var28 == 1) {
                                    var66 = var1.bytes[var34++];
                                } else if (var28 == 33) {
                                    var66 = var1.bytes[var41++];
                                } else if (var28 == 7) {
                                    var66 = var1.bytes[var35++];
                                } else if (var28 == 39) {
                                    var66 = var1.bytes[var42++];
                                } else if (var28 == 10) {
                                    var66 = var1.bytes[var36++];
                                } else if (var28 == 42) {
                                    var66 = var1.bytes[var43++];
                                } else if (var28 == 99) {
                                    var66 = var1.bytes[var46++];
                                } else if (var28 == 98) {
                                    var66 = var1.bytes[var47++];
                                } else if (var28 == 101) {
                                    var66 = var1.bytes[var48++];
                                } else if (var28 == 100) {
                                    var66 = var1.bytes[var49++];
                                } else if (var28 != 64 && var28 != 65 && var28 != 120
                                    && var28 != 121 && var28 != 123) {
                                    var66 = var1.bytes[var39++];
                                } else {
                                    var66 = var1.bytes[var30++];
                                }
                            } else {
                                var66 = var1.bytes[var44++];
                            }

                            int var67 = var66 + var59[var28];
                            var59[var28] = var67;
                            var51.writeByte(var67 & 127);
                        } else if (var62 == 3) {
                            if (var65) {
                                var51.writeByte(var52 + 224);
                            }

                            var56 += var1.bytes[var45++];
                            var56 += var1.bytes[var33++] << 7;
                            var51.writeByte(var56 & 127);
                            var51.writeByte(var56 >> 7 & 127);
                        } else if (var62 == 4) {
                            if (var65) {
                                var51.writeByte(var52 + 208);
                            }

                            var57 += var1.bytes[var32++];
                            var51.writeByte(var57 & 127);
                        } else if (var62 == 5) {
                            if (var65) {
                                var51.writeByte(var52 + 160);
                            }

                            var53 += var1.bytes[var37++];
                            var58 += var1.bytes[var31++];
                            var51.writeByte(var53 & 127);
                            var51.writeByte(var58 & 127);
                        } else {
                            if (var62 != 6) {
                                throw new RuntimeException();
                            }

                            if (var65) {
                                var51.writeByte(var52 + 192);
                            }

                            var51.writeByte(var1.bytes[var44++]);
                        }
                    }
                }
            }
        }

    }

    static class225 method4626(class249 var0, int var1, int var2) {
        byte[] var3 = var0.method4831(var1, var2, 1789634852);
        return var3 == null ? null : new class225(new Buffer(var3));
    }

    void method4628() {
        if (this.field2619 == null) {
            this.field2619 = new class204(16);
            int[] var1 = new int[16];
            int[] var2 = new int[16];
            var2[9] = 128;
            var1[9] = 128;
            class222 var4 = new class222(this.field2620);
            int var5 = var4.method4572();

            int var6;
            for (var6 = 0; var6 < var5; ++var6) {
                var4.method4568(var6);
                var4.method4537(var6);
                var4.method4535(var6);
            }

            label53:
            do {
                while (true) {
                    var6 = var4.method4573();
                    int var7 = var4.field2591[var6];

                    while (var7 == var4.field2591[var6]) {
                        var4.method4568(var6);
                        int var8 = var4.method4538(var6);
                        if (var8 == 1) {
                            var4.method4536();
                            var4.method4535(var6);
                            continue label53;
                        }

                        int var9 = var8 & 240;
                        int var10;
                        int var11;
                        int var12;
                        if (var9 == 176) {
                            var10 = var8 & 15;
                            var11 = var8 >> 8 & 127;
                            var12 = var8 >> 16 & 127;
                            if (var11 == 0) {
                                var1[var10] = (var12 << 14) + (var1[var10] & -2080769);
                            }

                            if (var11 == 32) {
                                var1[var10] = (var1[var10] & -16257) + (var12 << 7);
                            }
                        }

                        if (var9 == 192) {
                            var10 = var8 & 15;
                            var11 = var8 >> 8 & 127;
                            var2[var10] = var11 + var1[var10];
                        }

                        if (var9 == 144) {
                            var10 = var8 & 15;
                            var11 = var8 >> 8 & 127;
                            var12 = var8 >> 16 & 127;
                            if (var12 > 0) {
                                int var13 = var2[var10];
                                class215 var14 = (class215) this.field2619.method4224((long) var13);
                                if (var14 == null) {
                                    var14 = new class215(new byte[128]);
                                    this.field2619.method4226(var14, (long) var13);
                                }

                                var14.field2514[var11] = 1;
                            }
                        }

                        var4.method4537(var6);
                        var4.method4535(var6);
                    }
                }
            } while (!var4.method4543());

        }
    }

    void method4633() {
        this.field2619 = null;
    }
}
