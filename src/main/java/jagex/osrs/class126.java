package jagex.osrs;

public class class126 extends Node {

    int field1763;
    int field1767;
    int[] field1764;
    int[][] field1765;

    class126(int var1, byte[] var2) {
        this.field1763 = var1;
        Buffer var3 = new Buffer(var2);
        this.field1767 = var3.readUint8();
        this.field1764 = new int[this.field1767];
        this.field1765 = new int[this.field1767][];

        int var4;
        for (var4 = 0; var4 < this.field1767; ++var4) {
            this.field1764[var4] = var3.readUint8();
        }

        for (var4 = 0; var4 < this.field1767; ++var4) {
            this.field1765[var4] = new int[var3.readUint8()];
        }

        for (var4 = 0; var4 < this.field1767; ++var4) {
            for (int var5 = 0; var5 < this.field1765[var4].length; ++var5) {
                this.field1765[var4][var5] = var3.readUint8();
            }
        }

    }

    public static class281[] method3054(byte var0) {
        return new class281[]{class281.field3669, class281.field3660, class281.field3676,
            class281.field3664, class281.field3667, class281.field3668, class281.field3666,
            class281.field3662, class281.field3670, class281.field3665, class281.field3659,
            class281.field3675, class281.field3674, class281.field3663, class281.field3673,
            class281.field3671, class281.field3672, class281.field3661};
    }

    static final void method3053(Buffer var0, int var1, int var2, int var3, int var4, int var5,
                                 int var6, byte var7) {
        int var8;
        if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
            class50.field492[var1][var2][var3] = 0;

            while (true) {
                var8 = var0.readUint8();
                if (var8 == 0) {
                    if (var1 == 0) {
                        class50.field506[0][var2][var3] = -class43
                            .method792(var4 + 932731 + var2, var5 + 556238 + var3, 776902865) * 8;
                    } else {
                        class50.field506[var1][var2][var3] =
                            class50.field506[var1 - 1][var2][var3] - 240;
                    }
                    break;
                }

                if (var8 == 1) {
                    int var9 = var0.readUint8();
                    if (var9 == 1) {
                        var9 = 0;
                    }

                    if (var1 == 0) {
                        class50.field506[0][var2][var3] = -var9 * 8;
                    } else {
                        class50.field506[var1][var2][var3] =
                            class50.field506[var1 - 1][var2][var3] - var9 * 8;
                    }
                    break;
                }

                if (var8 <= 49) {
                    class140.field1932[var1][var2][var3] = var0.method3931(2015441582);
                    class50.field494[var1][var2][var3] = (byte) ((var8 - 2) / 4);
                    class8.field64[var1][var2][var3] = (byte) (var8 - 2 + var6 & 3);
                } else if (var8 <= 81) {
                    class50.field492[var1][var2][var3] = (byte) (var8 - 49);
                } else {
                    class19.field188[var1][var2][var3] = (byte) (var8 - 81);
                }
            }
        } else {
            while (true) {
                var8 = var0.readUint8();
                if (var8 == 0) {
                    break;
                }

                if (var8 == 1) {
                    var0.readUint8();
                    break;
                }

                if (var8 <= 49) {
                    var0.readUint8();
                }
            }
        }

    }

    public static byte[] method3055(CharSequence var0, int var1) {
        int var2 = var0.length();
        byte[] var3 = new byte[var2];

        for (int var4 = 0; var4 < var2; ++var4) {
            char var5 = var0.charAt(var4);
            if (var5 > 0 && var5 < 128 || var5 >= 160 && var5 <= 255) {
                var3[var4] = (byte) var5;
            } else if (var5 == 8364) {
                var3[var4] = -128;
            } else if (var5 == 8218) {
                var3[var4] = -126;
            } else if (var5 == 402) {
                var3[var4] = -125;
            } else if (var5 == 8222) {
                var3[var4] = -124;
            } else if (var5 == 8230) {
                var3[var4] = -123;
            } else if (var5 == 8224) {
                var3[var4] = -122;
            } else if (var5 == 8225) {
                var3[var4] = -121;
            } else if (var5 == 710) {
                var3[var4] = -120;
            } else if (var5 == 8240) {
                var3[var4] = -119;
            } else if (var5 == 352) {
                var3[var4] = -118;
            } else if (var5 == 8249) {
                var3[var4] = -117;
            } else if (var5 == 338) {
                var3[var4] = -116;
            } else if (var5 == 381) {
                var3[var4] = -114;
            } else if (var5 == 8216) {
                var3[var4] = -111;
            } else if (var5 == 8217) {
                var3[var4] = -110;
            } else if (var5 == 8220) {
                var3[var4] = -109;
            } else if (var5 == 8221) {
                var3[var4] = -108;
            } else if (var5 == 8226) {
                var3[var4] = -107;
            } else if (var5 == 8211) {
                var3[var4] = -106;
            } else if (var5 == 8212) {
                var3[var4] = -105;
            } else if (var5 == 732) {
                var3[var4] = -104;
            } else if (var5 == 8482) {
                var3[var4] = -103;
            } else if (var5 == 353) {
                var3[var4] = -102;
            } else if (var5 == 8250) {
                var3[var4] = -101;
            } else if (var5 == 339) {
                var3[var4] = -100;
            } else if (var5 == 382) {
                var3[var4] = -98;
            } else if (var5 == 376) {
                var3[var4] = -97;
            } else {
                var3[var4] = 63;
            }
        }

        return var3;
    }
}
