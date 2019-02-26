package jagex.osrs;

public class class270 extends class208 {

    public static class202 field3453;
    public static class202 field3473;
    public static class202 field3455;
    public static class202 field3457;
    static boolean field3454;
    static class249 field3452;
    static class249 field3450;
    static class115[] field3494;
    static class251 index15;

    static {
        field3454 = false;
        field3453 = new class202(4096);
        field3457 = new class202(500);
        field3455 = new class202(30);
        field3473 = new class202(30);
        field3494 = new class115[4];
    }

    public int field3470;
    public int[] field3480;
    public String field3461;
    public int field3491;
    public int field3464;
    public int field3469;
    public int field3479;
    public int[] field3499;
    public int field3501;
    public int field3495;
    public int field3475;
    public boolean field3468;
    public int field3496;
    public int field3497;
    public boolean field3467;
    public String[] field3478;
    public int field3498;
    public int field3474;
    public int field3458;
    public boolean field3482;
    public int field3466;
    public boolean field3489;
    class199 field3500;
    int field3492;
    int[] field3459;
    int[] field3460;
    int field3471;
    boolean field3493;
    boolean field3472;
    int field3488;
    int field3476;
    int field3483;
    int field3477;
    boolean field3490;
    int field3484;
    int field3486;
    short[] field3462;
    short[] field3451;
    short[] field3463;
    int field3485;
    short[] field3465;
    int field3487;
    int field3481;

    class270() {
        this.field3461 = "null";
        this.field3501 = 1;
        this.field3475 = 1;
        this.field3495 = 2;
        this.field3468 = true;
        this.field3470 = -1;
        this.field3488 = -1;
        this.field3472 = false;
        this.field3467 = false;
        this.field3474 = -1;
        this.field3458 = 16;
        this.field3476 = 0;
        this.field3477 = 0;
        this.field3478 = new String[5];
        this.field3479 = -1;
        this.field3466 = -1;
        this.field3493 = false;
        this.field3482 = true;
        this.field3483 = 128;
        this.field3484 = 128;
        this.field3485 = 128;
        this.field3486 = 0;
        this.field3487 = 0;
        this.field3481 = 0;
        this.field3489 = false;
        this.field3490 = false;
        this.field3464 = -1;
        this.field3492 = -1;
        this.field3471 = -1;
        this.field3491 = -1;
        this.field3496 = 0;
        this.field3497 = 0;
        this.field3498 = 0;
    }

    public final class270 method5279(byte var1) {
        int var2 = -1;
        if (this.field3492 != -1) {
            var2 = class97.method2405(this.field3492, (byte) 89);
        } else if (this.field3471 != -1) {
            var2 = class227.field2629[this.field3471];
        }

        int var3;
        if (var2 >= 0 && var2 < this.field3480.length - 1) {
            var3 = this.field3480[var2];
        } else {
            var3 = this.field3480[this.field3480.length - 1];
        }

        return var3 != -1 ? class253.method4993(var3, (byte) 13) : null;
    }

    void method5272(Buffer var1, int var2, int var3) {
        int var4;
        int var5;
        if (var2 == 1) {
            var4 = var1.getUByte();
            if (var4 > 0) {
                if (this.field3459 != null && !field3454) {
                    var1.offset += var4 * 3;
                } else {
                    this.field3460 = new int[var4];
                    this.field3459 = new int[var4];

                    for (var5 = 0; var5 < var4; ++var5) {
                        this.field3459[var5] = var1.readUint16();
                        this.field3460[var5] = var1.getUByte();
                    }
                }
            }
        } else if (var2 == 2) {
            this.field3461 = var1.method3778(-478007038);
        } else if (var2 == 5) {
            var4 = var1.getUByte();
            if (var4 > 0) {
                if (this.field3459 != null && !field3454) {
                    var1.offset += var4 * 2;
                } else {
                    this.field3460 = null;
                    this.field3459 = new int[var4];

                    for (var5 = 0; var5 < var4; ++var5) {
                        this.field3459[var5] = var1.readUint16();
                    }
                }
            }
        } else if (var2 == 14) {
            this.field3501 = var1.getUByte();
        } else if (var2 == 15) {
            this.field3475 = var1.getUByte();
        } else if (var2 == 17) {
            this.field3495 = 0;
            this.field3468 = false;
        } else if (var2 == 18) {
            this.field3468 = false;
        } else if (var2 == 19) {
            this.field3470 = var1.getUByte();
        } else if (var2 == 21) {
            this.field3488 = 0;
        } else if (var2 == 22) {
            this.field3472 = true;
        } else if (var2 == 23) {
            this.field3467 = true;
        } else if (var2 == 24) {
            this.field3474 = var1.readUint16();
            if (this.field3474 == 65535) {
                this.field3474 = -1;
            }
        } else if (var2 == 27) {
            this.field3495 = 1;
        } else if (var2 == 28) {
            this.field3458 = var1.getUByte();
        } else if (var2 == 29) {
            this.field3476 = var1.method3931(2133571664);
        } else if (var2 == 39) {
            this.field3477 = var1.method3931(2038290378) * 25;
        } else if (var2 >= 30 && var2 < 35) {
            this.field3478[var2 - 30] = var1.method3778(-201841220);
            if (this.field3478[var2 - 30].equalsIgnoreCase("Hidden")) {
                this.field3478[var2 - 30] = null;
            }
        } else if (var2 == 40) {
            var4 = var1.getUByte();
            this.field3462 = new short[var4];
            this.field3463 = new short[var4];

            for (var5 = 0; var5 < var4; ++var5) {
                this.field3462[var5] = (short) var1.readUint16();
                this.field3463[var5] = (short) var1.readUint16();
            }
        } else if (var2 == 41) {
            var4 = var1.getUByte();
            this.field3451 = new short[var4];
            this.field3465 = new short[var4];

            for (var5 = 0; var5 < var4; ++var5) {
                this.field3451[var5] = (short) var1.readUint16();
                this.field3465[var5] = (short) var1.readUint16();
            }
        } else if (var2 == 62) {
            this.field3493 = true;
        } else if (var2 == 64) {
            this.field3482 = false;
        } else if (var2 == 65) {
            this.field3483 = var1.readUint16();
        } else if (var2 == 66) {
            this.field3484 = var1.readUint16();
        } else if (var2 == 67) {
            this.field3485 = var1.readUint16();
        } else if (var2 == 68) {
            this.field3466 = var1.readUint16();
        } else if (var2 == 69) {
            var1.getUByte();
        } else if (var2 == 70) {
            this.field3486 = var1.method3814((byte) -1);
        } else if (var2 == 71) {
            this.field3487 = var1.method3814((byte) -1);
        } else if (var2 == 72) {
            this.field3481 = var1.method3814((byte) -1);
        } else if (var2 == 73) {
            this.field3489 = true;
        } else if (var2 == 74) {
            this.field3490 = true;
        } else if (var2 == 75) {
            this.field3464 = var1.getUByte();
        } else if (var2 != 77 && var2 != 92) {
            if (var2 == 78) {
                this.field3491 = var1.readUint16();
                this.field3496 = var1.getUByte();
            } else if (var2 == 79) {
                this.field3497 = var1.readUint16();
                this.field3498 = var1.readUint16();
                this.field3496 = var1.getUByte();
                var4 = var1.getUByte();
                this.field3499 = new int[var4];

                for (var5 = 0; var5 < var4; ++var5) {
                    this.field3499[var5] = var1.readUint16();
                }
            } else if (var2 == 81) {
                this.field3488 = var1.getUByte() * 256;
            } else if (var2 == 82) {
                this.field3479 = var1.readUint16();
            } else if (var2 == 249) {
                this.field3500 = class226.method4634(var1, this.field3500, (short) -23839);
            }
        } else {
            this.field3492 = var1.readUint16();
            if (this.field3492 == 65535) {
                this.field3492 = -1;
            }

            this.field3471 = var1.readUint16();
            if (this.field3471 == 65535) {
                this.field3471 = -1;
            }

            var4 = -1;
            if (var2 == 92) {
                var4 = var1.readUint16();
                if (var4 == 65535) {
                    var4 = -1;
                }
            }

            var5 = var1.getUByte();
            this.field3480 = new int[var5 + 2];

            for (int var6 = 0; var6 <= var5; ++var6) {
                this.field3480[var6] = var1.readUint16();
                if (this.field3480[var6] == 65535) {
                    this.field3480[var6] = -1;
                }
            }

            this.field3480[var5 + 1] = var4;
        }

    }

    final class115 method5278(int var1, int var2, byte var3) {
        class115 var4 = null;
        boolean var5;
        int var6;
        int var8;
        if (this.field3460 == null) {
            if (var1 != 10) {
                return null;
            }

            if (this.field3459 == null) {
                return null;
            }

            var5 = this.field3493;
            if (var1 == 2 && var2 > 3) {
                var5 = !var5;
            }

            var6 = this.field3459.length;

            for (int var7 = 0; var7 < var6; ++var7) {
                var8 = this.field3459[var7];
                if (var5) {
                    var8 += 65536;
                }

                var4 = (class115) field3457.method4198((long) var8);
                if (var4 == null) {
                    var4 = class115.method2843(field3452, var8 & 65535, 0);
                    if (var4 == null) {
                        return null;
                    }

                    if (var5) {
                        var4.method2806();
                    }

                    field3457.method4204(var4, (long) var8);
                }

                if (var6 > 1) {
                    field3494[var7] = var4;
                }
            }

            if (var6 > 1) {
                var4 = new class115(field3494, var6);
            }
        } else {
            int var10 = -1;

            for (var6 = 0; var6 < this.field3460.length; ++var6) {
                if (this.field3460[var6] == var1) {
                    var10 = var6;
                    break;
                }
            }

            if (var10 == -1) {
                return null;
            }

            var6 = this.field3459[var10];
            boolean var11 = this.field3493 ^ var2 > 3;
            if (var11) {
                var6 += 65536;
            }

            var4 = (class115) field3457.method4198((long) var6);
            if (var4 == null) {
                var4 = class115.method2843(field3452, var6 & 65535, 0);
                if (var4 == null) {
                    return null;
                }

                if (var11) {
                    var4.method2806();
                }

                field3457.method4204(var4, (long) var6);
            }
        }

        if (this.field3483 == 128 && this.field3484 == 128 && this.field3485 == 128) {
            var5 = false;
        } else {
            var5 = true;
        }

        boolean var12;
        if (this.field3486 == 0 && this.field3487 == 0 && this.field3481 == 0) {
            var12 = false;
        } else {
            var12 = true;
        }

        class115 var9 = new class115(var4, var2 == 0 && !var5 && !var12, null == this.field3462,
                                     null == this.field3451, true);
        if (var1 == 4 && var2 > 3) {
            var9.method2781(256);
            var9.method2827(45, 0, -45);
        }

        var2 &= 3;
        if (var2 == 1) {
            var9.method2804();
        } else if (var2 == 2) {
            var9.method2779();
        } else if (var2 == 3) {
            var9.method2780();
        }

        if (this.field3462 != null) {
            for (var8 = 0; var8 < this.field3462.length; ++var8) {
                var9.method2775(this.field3462[var8], this.field3463[var8]);
            }
        }

        if (this.field3451 != null) {
            for (var8 = 0; var8 < this.field3451.length; ++var8) {
                var9.method2785(this.field3451[var8], this.field3465[var8]);
            }
        }

        if (var5) {
            var9.method2783(this.field3483, this.field3484, this.field3485);
        }

        if (var12) {
            var9.method2827(this.field3486, this.field3487, this.field3481);
        }

        return var9;
    }

    void method5300(int var1) {
        if (this.field3470 == -1) {
            this.field3470 = 0;
            if (this.field3459 != null && (this.field3460 == null || this.field3460[0] == 10)) {
                this.field3470 = 1;
            }

            for (int var2 = 0; var2 < 5; ++var2) {
                if (this.field3478[var2] != null) {
                    this.field3470 = 1;
                }
            }
        }

        if (this.field3464 == -1) {
            this.field3464 = this.field3495 != 0 ? 1 : 0;
        }

    }

    void method5271(Buffer var1, int var2) {
        while (true) {
            int var3 = var1.getUByte();
            if (var3 == 0) {
                return;
            }

            this.method5272(var1, var3, -1639838333);
        }
    }

    public final class121 method5312(int var1, int var2, int[][] var3, int var4, int var5, int var6,
                                     class275 var7, int var8, int var9) {
        long var10;
        if (this.field3460 == null) {
            var10 = (long) (var2 + (this.field3469 << 10));
        } else {
            var10 = (long) (var2 + (var1 << 3) + (this.field3469 << 10));
        }

        class121 var12 = (class121) field3473.method4198(var10);
        if (var12 == null) {
            class115 var13 = this.method5278(var1, var2, (byte) 8);
            if (var13 == null) {
                return null;
            }

            var12 = var13.method2772(this.field3476 + 64, this.field3477 + 768, -50, -10, -50);
            field3473.method4204(var12, var10);
        }

        if (var7 == null && this.field3488 == -1) {
            return var12;
        } else {
            if (var7 != null) {
                var12 = var7.method5458(var12, var8, var2, 1960875541);
            } else {
                var12 = var12.method2869(true);
            }

            if (this.field3488 >= 0) {
                var12 = var12.method2868(var3, var4, var5, var6, false, this.field3488);
            }

            return var12;
        }
    }

    public final boolean method5301(int var1, int var2) {
        if (this.field3460 != null) {
            for (int var5 = 0; var5 < this.field3460.length; ++var5) {
                if (this.field3460[var5] == var1) {
                    return field3452.method4830(this.field3459[var5] & 65535, 0, (byte) 51);
                }
            }

            return true;
        } else if (this.field3459 == null) {
            return true;
        } else if (var1 != 10) {
            return true;
        } else {
            boolean var3 = true;

            for (int var4 = 0; var4 < this.field3459.length; ++var4) {
                var3 &= field3452.method4830(this.field3459[var4] & 65535, 0, (byte) -3);
            }

            return var3;
        }
    }

    public final boolean method5274(int var1) {
        if (this.field3459 == null) {
            return true;
        } else {
            boolean var2 = true;

            for (int var3 = 0; var3 < this.field3459.length; ++var3) {
                var2 &= field3452.method4830(this.field3459[var3] & 65535, 0, (byte) -93);
            }

            return var2;
        }
    }

    public final class121 method5276(int var1, int var2, int[][] var3, int var4, int var5, int var6,
                                     int var7) {
        long var8;
        if (this.field3460 == null) {
            var8 = (long) (var2 + (this.field3469 << 10));
        } else {
            var8 = (long) (var2 + (var1 << 3) + (this.field3469 << 10));
        }

        class121 var10 = (class121) field3473.method4198(var8);
        if (var10 == null) {
            class115 var11 = this.method5278(var1, var2, (byte) 8);
            if (var11 == null) {
                return null;
            }

            var10 = var11.method2772(this.field3476 + 64, this.field3477 + 768, -50, -10, -50);
            field3473.method4204(var10, var8);
        }

        if (this.field3488 >= 0) {
            var10 = var10.method2868(var3, var4, var5, var6, true, this.field3488);
        }

        return var10;
    }

    public boolean method5282(int var1) {
        if (this.field3480 == null) {
            return this.field3491 != -1 || this.field3499 != null;
        } else {
            for (int var2 = 0; var2 < this.field3480.length; ++var2) {
                if (this.field3480[var2] != -1) {
                    class270 var3 = class253.method4993(this.field3480[var2], (byte) -18);
                    if (var3.field3491 != -1 || var3.field3499 != null) {
                        return true;
                    }
                }
            }

            return false;
        }
    }

    public int method5280(int var1, int var2, byte var3) {
        return class148.method3363(this.field3500, var1, var2, (byte) 52);
    }

    public String method5281(int var1, String var2, int var3) {
        return class148.method3369(this.field3500, var1, var2, (short) 3129);
    }

    public final class129 method5288(int var1, int var2, int[][] var3, int var4, int var5, int var6,
                                     int var7) {
        long var8;
        if (this.field3460 == null) {
            var8 = (long) (var2 + (this.field3469 << 10));
        } else {
            var8 = (long) (var2 + (var1 << 3) + (this.field3469 << 10));
        }

        Object var10 = (class129) field3455.method4198(var8);
        if (var10 == null) {
            class115 var11 = this.method5278(var1, var2, (byte) 8);
            if (var11 == null) {
                return null;
            }

            if (!this.field3472) {
                var10 = var11.method2772(this.field3476 + 64, this.field3477 + 768, -50, -10, -50);
            } else {
                var11.field1548 = (short) (this.field3476 + 64);
                var11.field1549 = (short) (this.field3477 + 768);
                var11.method2802();
                var10 = var11;
            }

            field3455.method4204((class208) var10, var8);
        }

        if (this.field3472) {
            var10 = ((class115) var10).method2782();
        }

        if (this.field3488 >= 0) {
            if (var10 instanceof class121) {
                var10 = ((class121) var10).method2868(var3, var4, var5, var6, true, this.field3488);
            } else if (var10 instanceof class115) {
                var10 = ((class115) var10).method2791(var3, var4, var5, var6, true, this.field3488);
            }
        }

        return (class129) var10;
    }
}
