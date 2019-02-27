package jagex.osrs;

public class class261 extends class208 {

    public static class202 field3359;
    public static class249 field3365;

    static {
        field3359 = new class202(64);
    }

    public int field3364;
    public int field3363;
    public int field3361;
    public int field3360;
    int field3358;

    class261() {
        this.field3358 = 0;
    }

    static final void method5118(class64 var0, int var1) {
        var0.field972 = var0.field944;
        if (var0.field939 == 0) {
            var0.field955 = 0;
        } else {
            if (var0.field971 != -1 && var0.field998 == 0) {
                class275 var2 = class29.method532(var0.field971);
                if (var0.field959 > 0 && var2.field3622 == 0) {
                    ++var0.field955;
                    return;
                }

                if (var0.field959 <= 0 && var2.field3632 == 0) {
                    ++var0.field955;
                    return;
                }
            }

            int var11 = var0.x;
            int var3 = var0.z;
            int var4 = var0.wx[var0.field939 - 1] * 128 + var0.field964 * 64;
            int var5 = var0.wz[var0.field939 - 1] * 128 + var0.field964 * 64;
            if (var11 < var4) {
                if (var3 < var5) {
                    var0.field990 = 1280;
                } else if (var3 > var5) {
                    var0.field990 = 1792;
                } else {
                    var0.field990 = 1536;
                }
            } else if (var11 > var4) {
                if (var3 < var5) {
                    var0.field990 = 768;
                } else if (var3 > var5) {
                    var0.field990 = 256;
                } else {
                    var0.field990 = 512;
                }
            } else if (var3 < var5) {
                var0.field990 = 1024;
            } else if (var3 > var5) {
                var0.field990 = 0;
            }

            byte var6 = var0.field996[var0.field939 - 1];
            if (var4 - var11 <= 256 && var4 - var11 >= -256 && var5 - var3 <= 256
                && var5 - var3 >= -256) {
                int var7 = var0.field990 - var0.field940 & 2047;
                if (var7 > 1024) {
                    var7 -= 2048;
                }

                int var8 = var0.field948;
                if (var7 >= -256 && var7 <= 256) {
                    var8 = var0.field942;
                } else if (var7 >= 256 && var7 < 768) {
                    var8 = var0.field950;
                } else if (var7 >= -768 && var7 <= -256) {
                    var8 = var0.field949;
                }

                if (var8 == -1) {
                    var8 = var0.field942;
                }

                var0.field972 = var8;
                int var9 = 4;
                boolean var10 = true;
                if (var0 instanceof class73) {
                    var10 = ((class73) var0).field1102.field3598;
                }

                if (var10) {
                    if (var0.field940 != var0.field990 && var0.field965 == -1
                        && var0.field947 != 0) {
                        var9 = 2;
                    }

                    if (var0.field939 > 2) {
                        var9 = 6;
                    }

                    if (var0.field939 > 3) {
                        var9 = 8;
                    }

                    if (var0.field955 > 0 && var0.field939 > 1) {
                        var9 = 8;
                        --var0.field955;
                    }
                } else {
                    if (var0.field939 > 1) {
                        var9 = 6;
                    }

                    if (var0.field939 > 2) {
                        var9 = 8;
                    }

                    if (var0.field955 > 0 && var0.field939 > 1) {
                        var9 = 8;
                        --var0.field955;
                    }
                }

                if (var6 == 2) {
                    var9 <<= 1;
                }

                if (var9 >= 8 && var0.field972 == var0.field942 && var0.field951 != -1) {
                    var0.field972 = var0.field951;
                }

                if (var11 != var4 || var5 != var3) {
                    if (var11 < var4) {
                        var0.x += var9;
                        if (var0.x > var4) {
                            var0.x = var4;
                        }
                    } else if (var11 > var4) {
                        var0.x -= var9;
                        if (var0.x < var4) {
                            var0.x = var4;
                        }
                    }

                    if (var3 < var5) {
                        var0.z += var9;
                        if (var0.z > var5) {
                            var0.z = var5;
                        }
                    } else if (var3 > var5) {
                        var0.z -= var9;
                        if (var0.z < var5) {
                            var0.z = var5;
                        }
                    }
                }

                if (var4 == var0.x && var5 == var0.z) {
                    --var0.field939;
                    if (var0.field959 > 0) {
                        --var0.field959;
                    }
                }

            } else {
                var0.x = var4;
                var0.z = var5;
                --var0.field939;
                if (var0.field959 > 0) {
                    --var0.field959;
                }

            }
        }
    }

    void method5114(int var1, int var2) {
        double var3 = (double) (var1 >> 16 & 255) / 256.0D;
        double var5 = (double) (var1 >> 8 & 255) / 256.0D;
        double var7 = (double) (var1 & 255) / 256.0D;
        double var9 = var3;
        if (var5 < var3) {
            var9 = var5;
        }

        if (var7 < var9) {
            var9 = var7;
        }

        double var11 = var3;
        if (var5 > var3) {
            var11 = var5;
        }

        if (var7 > var11) {
            var11 = var7;
        }

        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var11 + var9);
            }

            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }

            if (var11 == var3) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = 2.0D + (var7 - var3) / (var11 - var9);
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
        }

        var13 /= 6.0D;
        this.field3364 = (int) (256.0D * var15);
        this.field3363 = (int) (var17 * 256.0D);
        if (this.field3364 < 0) {
            this.field3364 = 0;
        } else if (this.field3364 > 255) {
            this.field3364 = 255;
        }

        if (this.field3363 < 0) {
            this.field3363 = 0;
        } else if (this.field3363 > 255) {
            this.field3363 = 255;
        }

        if (var17 > 0.5D) {
            this.field3360 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field3360 = (int) (512.0D * var15 * var17);
        }

        if (this.field3360 < 1) {
            this.field3360 = 1;
        }

        this.field3361 = (int) ((double) this.field3360 * var13);
    }

    void method5113(Buffer var1, int var2, int var3, int var4) {
        if (var2 == 1) {
            this.field3358 = var1.method3773(1410772571);
        }

    }

    void method5111(byte var1) {
        this.method5114(this.field3358, -2085846449);
    }

    void method5126(Buffer var1, int var2, byte var3) {
        while (true) {
            int var4 = var1.readUint8();
            if (var4 == 0) {
                return;
            }

            this.method5113(var1, var4, var2, -325585794);
        }
    }
}
