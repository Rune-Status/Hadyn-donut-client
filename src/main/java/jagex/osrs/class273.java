package jagex.osrs;

import java.security.SecureRandom;

public class class273 extends class208 {

    public static class202 field3567;
    public static class202 field3566;
    static class249 field3570;
    static class249 field3597;

    static {
        field3566 = new class202(64);
        field3567 = new class202(50);
    }

    public int[] field3595;
    public String field3569;
    public int field3568;
    public int field3600;
    public int field3573;
    public int field3593;
    public int field3580;
    public int field3575;
    public String[] field3565;
    public boolean field3585;
    public int field3577;
    public int field3578;
    public int field3576;
    public boolean field3572;
    public int field3579;
    public int field3592;
    public int field3599;
    public boolean field3589;
    public boolean field3598;
    public boolean field3586;
    class199 field3584;
    int field3594;
    int field3596;
    int[] field3574;
    int[] field3571;
    int field3587;
    short[] field3564;
    int field3588;
    short[] field3582;
    short[] field3581;
    short[] field3583;
    int field3590;
    int field3591;

    class273() {
        this.field3569 = "null";
        this.field3600 = 1;
        this.field3573 = -1;
        this.field3580 = -1;
        this.field3575 = -1;
        this.field3593 = -1;
        this.field3577 = -1;
        this.field3578 = -1;
        this.field3579 = -1;
        this.field3565 = new String[5];
        this.field3585 = true;
        this.field3576 = -1;
        this.field3587 = 128;
        this.field3588 = 128;
        this.field3572 = false;
        this.field3590 = 0;
        this.field3591 = 0;
        this.field3592 = -1;
        this.field3599 = 32;
        this.field3594 = -1;
        this.field3596 = -1;
        this.field3589 = true;
        this.field3598 = true;
        this.field3586 = false;
    }

    static SecureRandom method5403(int var0) {
        SecureRandom var1 = new SecureRandom();
        var1.nextInt();
        return var1;
    }

    public final class273 method5397(byte var1) {
        int var2 = -1;
        if (this.field3594 != -1) {
            var2 = class97.method2405(this.field3594, (byte) 95);
        } else if (this.field3596 != -1) {
            var2 = class227.field2629[this.field3596];
        }

        int var3;
        if (var2 >= 0 && var2 < this.field3595.length - 1) {
            var3 = this.field3595[var2];
        } else {
            var3 = this.field3595[this.field3595.length - 1];
        }

        return var3 != -1 ? class248.method4823(var3, 1668113928) : null;
    }

    void method5394(Buffer var1, int var2, int var3) {
        int var4;
        int var5;
        if (var2 == 1) {
            var4 = var1.getUByte();
            this.field3571 = new int[var4];

            for (var5 = 0; var5 < var4; ++var5) {
                this.field3571[var5] = var1.readUint16();
            }
        } else if (var2 == 2) {
            this.field3569 = var1.method3778(-1794499100);
        } else if (var2 == 12) {
            this.field3600 = var1.getUByte();
        } else if (var2 == 13) {
            this.field3573 = var1.readUint16();
        } else if (var2 == 14) {
            this.field3593 = var1.readUint16();
        } else if (var2 == 15) {
            this.field3580 = var1.readUint16();
        } else if (var2 == 16) {
            this.field3575 = var1.readUint16();
        } else if (var2 == 17) {
            this.field3593 = var1.readUint16();
            this.field3577 = var1.readUint16();
            this.field3578 = var1.readUint16();
            this.field3579 = var1.readUint16();
        } else if (var2 >= 30 && var2 < 35) {
            this.field3565[var2 - 30] = var1.method3778(-82771701);
            if (this.field3565[var2 - 30].equalsIgnoreCase("Hidden")) {
                this.field3565[var2 - 30] = null;
            }
        } else if (var2 == 40) {
            var4 = var1.getUByte();
            this.field3564 = new short[var4];
            this.field3581 = new short[var4];

            for (var5 = 0; var5 < var4; ++var5) {
                this.field3564[var5] = (short) var1.readUint16();
                this.field3581[var5] = (short) var1.readUint16();
            }
        } else if (var2 == 41) {
            var4 = var1.getUByte();
            this.field3582 = new short[var4];
            this.field3583 = new short[var4];

            for (var5 = 0; var5 < var4; ++var5) {
                this.field3582[var5] = (short) var1.readUint16();
                this.field3583[var5] = (short) var1.readUint16();
            }
        } else if (var2 == 60) {
            var4 = var1.getUByte();
            this.field3574 = new int[var4];

            for (var5 = 0; var5 < var4; ++var5) {
                this.field3574[var5] = var1.readUint16();
            }
        } else if (var2 == 93) {
            this.field3585 = false;
        } else if (var2 == 95) {
            this.field3576 = var1.readUint16();
        } else if (var2 == 97) {
            this.field3587 = var1.readUint16();
        } else if (var2 == 98) {
            this.field3588 = var1.readUint16();
        } else if (var2 == 99) {
            this.field3572 = true;
        } else if (var2 == 100) {
            this.field3590 = var1.method3931(2109697136);
        } else if (var2 == 101) {
            this.field3591 = var1.method3931(2120121739) * 5;
        } else if (var2 == 102) {
            this.field3592 = var1.readUint16();
        } else if (var2 == 103) {
            this.field3599 = var1.readUint16();
        } else if (var2 != 106 && var2 != 118) {
            if (var2 == 107) {
                this.field3589 = false;
            } else if (var2 == 109) {
                this.field3598 = false;
            } else if (var2 == 111) {
                this.field3586 = true;
            } else if (var2 == 249) {
                this.field3584 = class226.method4634(var1, this.field3584, (short) -14915);
            }
        } else {
            this.field3594 = var1.readUint16();
            if (this.field3594 == 65535) {
                this.field3594 = -1;
            }

            this.field3596 = var1.readUint16();
            if (this.field3596 == 65535) {
                this.field3596 = -1;
            }

            var4 = -1;
            if (var2 == 118) {
                var4 = var1.readUint16();
                if (var4 == 65535) {
                    var4 = -1;
                }
            }

            var5 = var1.getUByte();
            this.field3595 = new int[var5 + 2];

            for (int var6 = 0; var6 <= var5; ++var6) {
                this.field3595[var6] = var1.readUint16();
                if (this.field3595[var6] == 65535) {
                    this.field3595[var6] = -1;
                }
            }

            this.field3595[var5 + 1] = var4;
        }

    }

    public final class115 method5430(int var1) {
        if (this.field3595 != null) {
            class273 var2 = this.method5397((byte) 14);
            return var2 == null ? null : var2.method5430(-796345821);
        } else if (this.field3574 == null) {
            return null;
        } else {
            boolean var6 = false;

            for (int var3 = 0; var3 < this.field3574.length; ++var3) {
                if (!field3570.method4830(this.field3574[var3], 0, (byte) -5)) {
                    var6 = true;
                }
            }

            if (var6) {
                return null;
            } else {
                class115[] var7 = new class115[this.field3574.length];

                for (int var4 = 0; var4 < this.field3574.length; ++var4) {
                    var7[var4] = class115.method2843(field3570, this.field3574[var4], 0);
                }

                class115 var8;
                if (var7.length == 1) {
                    var8 = var7[0];
                } else {
                    var8 = new class115(var7, var7.length);
                }

                int var5;
                if (this.field3564 != null) {
                    for (var5 = 0; var5 < this.field3564.length; ++var5) {
                        var8.method2775(this.field3564[var5], this.field3581[var5]);
                    }
                }

                if (this.field3582 != null) {
                    for (var5 = 0; var5 < this.field3582.length; ++var5) {
                        var8.method2785(this.field3582[var5], this.field3583[var5]);
                    }
                }

                return var8;
            }
        }
    }

    public final class121 method5414(class275 var1, int var2, class275 var3, int var4, int var5) {
        if (this.field3595 != null) {
            class273 var13 = this.method5397((byte) 33);
            return var13 == null ? null : var13.method5414(var1, var2, var3, var4, -1018682293);
        } else {
            class121 var6 = (class121) field3567.method4198((long) this.field3568);
            if (var6 == null) {
                boolean var7 = false;

                for (int var8 = 0; var8 < this.field3571.length; ++var8) {
                    if (!field3570.method4830(this.field3571[var8], 0, (byte) -99)) {
                        var7 = true;
                    }
                }

                if (var7) {
                    return null;
                }

                class115[] var9 = new class115[this.field3571.length];

                int var10;
                for (var10 = 0; var10 < this.field3571.length; ++var10) {
                    var9[var10] = class115.method2843(field3570, this.field3571[var10], 0);
                }

                class115 var12;
                if (var9.length == 1) {
                    var12 = var9[0];
                } else {
                    var12 = new class115(var9, var9.length);
                }

                if (this.field3564 != null) {
                    for (var10 = 0; var10 < this.field3564.length; ++var10) {
                        var12.method2775(this.field3564[var10], this.field3581[var10]);
                    }
                }

                if (this.field3582 != null) {
                    for (var10 = 0; var10 < this.field3582.length; ++var10) {
                        var12.method2785(this.field3582[var10], this.field3583[var10]);
                    }
                }

                var6 = var12.method2772(this.field3590 + 64, this.field3591 + 850, -30, -50, -30);
                field3567.method4204(var6, (long) this.field3568);
            }

            class121 var11;
            if (var1 != null && var3 != null) {
                var11 = var1.method5459(var6, var2, var3, var4, -2120673223);
            } else if (var1 != null) {
                var11 = var1.method5457(var6, var2, -1140097691);
            } else if (var3 != null) {
                var11 = var3.method5457(var6, var4, -1140097691);
            } else {
                var11 = var6.method2869(true);
            }

            if (this.field3587 != 128 || this.field3588 != 128) {
                var11.method2878(this.field3587, this.field3588, this.field3587);
            }

            return var11;
        }
    }

    void method5392(byte var1) {
    }

    void method5417(Buffer var1, int var2) {
        while (true) {
            int var3 = var1.getUByte();
            if (var3 == 0) {
                return;
            }

            this.method5394(var1, var3, 2023890200);
        }
    }

    public boolean method5398(int var1) {
        if (this.field3595 == null) {
            return true;
        } else {
            int var2 = -1;
            if (this.field3594 != -1) {
                var2 = class97.method2405(this.field3594, (byte) 37);
            } else if (this.field3596 != -1) {
                var2 = class227.field2629[this.field3596];
            }

            return var2 >= 0 && var2 < this.field3595.length ? this.field3595[var2] != -1
                : this.field3595[this.field3595.length - 1] != -1;
        }
    }

    public int method5399(int var1, int var2, int var3) {
        return class148.method3363(this.field3584, var1, var2, (byte) 55);
    }

    public String method5400(int var1, String var2, int var3) {
        return class148.method3369(this.field3584, var1, var2, (short) 3129);
    }
}
