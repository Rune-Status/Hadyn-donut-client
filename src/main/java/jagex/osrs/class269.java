package jagex.osrs;

public class class269 extends class208 {

    public static class202 field3434;
    public static class202 field3429;
    public static class202 field3430;
    public static class249 field3447;
    public static class249 field3439;

    static {
        field3429 = new class202(64);
        field3430 = new class202(64);
        field3434 = new class202(20);
    }

    public int field3445;
    public int field3435;
    public int field3428;
    public int[] field3443;
    public int field3441;
    public int field3442;
    public int field3431;
    public int field3446;
    String field3444;
    int field3448;
    int field3427;
    int field3436;
    int field3437;
    int field3438;
    int field3440;
    int field3449;

    class269() {
        this.field3440 = -1;
        this.field3435 = 16777215;
        this.field3428 = 70;
        this.field3437 = -1;
        this.field3438 = -1;
        this.field3427 = -1;
        this.field3436 = -1;
        this.field3441 = 0;
        this.field3431 = 0;
        this.field3442 = -1;
        this.field3444 = "";
        this.field3445 = -1;
        this.field3446 = 0;
        this.field3448 = -1;
        this.field3449 = -1;
    }

    static double method5267(double var0) {
        return Math.exp(-var0 * var0 / 2.0D) / Math.sqrt(6.283185307179586D);
    }

    static final void method5255(String var0, byte var1) {
        if (!var0.equals("")) {
            OutboundPacket var2 = class131
                .method3243(class171.field2291, client.field690.random, (byte) 75);
            var2.buffer.writeByte(class97.method2404(var0, -1857540668));
            var2.buffer.writeString(var0);
            client.field690.method2193(var2, 513984112);
        }
    }

    static final int method5238(int var0, int var1, int var2, int var3) {
        if (var2 > 179) {
            var1 /= 2;
        }

        if (var2 > 192) {
            var1 /= 2;
        }

        if (var2 > 217) {
            var1 /= 2;
        }

        if (var2 > 243) {
            var1 /= 2;
        }

        int var4 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
        return var4;
    }

    void method5235(Buffer var1, int var2, int var3) {
        if (var2 == 1) {
            this.field3440 = var1.method3898((byte) -32);
        } else if (var2 == 2) {
            this.field3435 = var1.method3773(457376091);
        } else if (var2 == 3) {
            this.field3437 = var1.method3898((byte) -40);
        } else if (var2 == 4) {
            this.field3427 = var1.method3898((byte) -88);
        } else if (var2 == 5) {
            this.field3438 = var1.method3898((byte) -116);
        } else if (var2 == 6) {
            this.field3436 = var1.method3898((byte) -67);
        } else if (var2 == 7) {
            this.field3441 = var1.method3814((byte) -1);
        } else if (var2 == 8) {
            this.field3444 = var1.method3779(2000566156);
        } else if (var2 == 9) {
            this.field3428 = var1.readUint16();
        } else if (var2 == 10) {
            this.field3431 = var1.method3814((byte) -1);
        } else if (var2 == 11) {
            this.field3442 = 0;
        } else if (var2 == 12) {
            this.field3445 = var1.readUint8();
        } else if (var2 == 13) {
            this.field3446 = var1.method3814((byte) -1);
        } else if (var2 == 14) {
            this.field3442 = var1.readUint16();
        } else if (var2 == 17 || var2 == 18) {
            this.field3448 = var1.readUint16();
            if (this.field3448 == 65535) {
                this.field3448 = -1;
            }

            this.field3449 = var1.readUint16();
            if (this.field3449 == 65535) {
                this.field3449 = -1;
            }

            int var4 = -1;
            if (var2 == 18) {
                var4 = var1.readUint16();
                if (var4 == 65535) {
                    var4 = -1;
                }
            }

            int var5 = var1.readUint8();
            this.field3443 = new int[var5 + 2];

            for (int var6 = 0; var6 <= var5; ++var6) {
                this.field3443[var6] = var1.readUint16();
                if (this.field3443[var6] == 65535) {
                    this.field3443[var6] = -1;
                }
            }

            this.field3443[var5 + 1] = var4;
        }

    }

    void method5234(Buffer var1, byte var2) {
        while (true) {
            int var3 = var1.readUint8();
            if (var3 == 0) {
                return;
            }

            this.method5235(var1, var3, -90164519);
        }
    }

    public final class269 method5268(byte var1) {
        int var2 = -1;
        if (this.field3448 != -1) {
            var2 = class97.method2405(this.field3448, (byte) 102);
        } else if (this.field3449 != -1) {
            var2 = class227.field2629[this.field3449];
        }

        int var3;
        if (var2 >= 0 && var2 < this.field3443.length - 1) {
            var3 = this.field3443[var2];
        } else {
            var3 = this.field3443[this.field3443.length - 1];
        }

        return var3 != -1 ? class221.method4528(var3, -1536720517) : null;
    }

    public class323 method5266(int var1) {
        if (this.field3437 < 0) {
            return null;
        } else {
            class323 var2 = (class323) field3430.method4198((long) this.field3437);
            if (var2 != null) {
                return var2;
            } else {
                var2 = class145.method3349(field3447, this.field3437, 0, (byte) -118);
                if (var2 != null) {
                    field3430.method4204(var2, (long) this.field3437);
                }

                return var2;
            }
        }
    }

    public class323 method5236(int var1) {
        if (this.field3438 < 0) {
            return null;
        } else {
            class323 var2 = (class323) field3430.method4198((long) this.field3438);
            if (var2 != null) {
                return var2;
            } else {
                var2 = class145.method3349(field3447, this.field3438, 0, (byte) 11);
                if (var2 != null) {
                    field3430.method4204(var2, (long) this.field3438);
                }

                return var2;
            }
        }
    }

    public class323 method5243(int var1) {
        if (this.field3427 < 0) {
            return null;
        } else {
            class323 var2 = (class323) field3430.method4198((long) this.field3427);
            if (var2 != null) {
                return var2;
            } else {
                var2 = class145.method3349(field3447, this.field3427, 0, (byte) -96);
                if (var2 != null) {
                    field3430.method4204(var2, (long) this.field3427);
                }

                return var2;
            }
        }
    }

    public class323 method5241(int var1) {
        if (this.field3436 < 0) {
            return null;
        } else {
            class323 var2 = (class323) field3430.method4198((long) this.field3436);
            if (var2 != null) {
                return var2;
            } else {
                var2 = class145.method3349(field3447, this.field3436, 0, (byte) -105);
                if (var2 != null) {
                    field3430.method4204(var2, (long) this.field3436);
                }

                return var2;
            }
        }
    }

    public class300 method5257(int var1) {
        if (this.field3440 == -1) {
            return null;
        } else {
            class300 var2 = (class300) field3434.method4198((long) this.field3440);
            if (var2 != null) {
                return var2;
            } else {
                class249 var4 = field3447;
                class249 var5 = field3439;
                int var6 = this.field3440;
                class300 var3;
                if (!class17.method212(var4, var6, 0, (byte) 1)) {
                    var3 = null;
                } else {
                    byte[] var8 = var5.method4831(var6, 0, 1789634852);
                    class300 var7;
                    if (var8 == null) {
                        var7 = null;
                    } else {
                        class300 var9 = new class300(var8, class324.field3890, class324.field3892,
                                                     class324.field3895, class258.field3334,
                                                     class324.field3894, class324.field3897);
                        class324.field3890 = null;
                        class324.field3892 = null;
                        class324.field3895 = null;
                        class258.field3334 = null;
                        class324.field3894 = null;
                        class324.field3897 = null;
                        var7 = var9;
                    }

                    var3 = var7;
                }

                if (var3 != null) {
                    field3434.method4204(var3, (long) this.field3440);
                }

                return var3;
            }
        }
    }

    public String method5252(int var1, int var2) {
        String var3 = this.field3444;

        while (true) {
            int var4 = var3.indexOf("%1");
            if (var4 < 0) {
                return var3;
            }

            var3 = var3.substring(0, var4) + class33.method616(var1, false, -1872629249) + var3
                .substring(var4 + 2);
        }
    }
}
