package jagex.osrs;

public class class220 extends class107 {

    int field2549;
    int[] field2553;
    int field2537;
    int[] field2543;
    class204 field2557;
    int[] field2542;
    int[] field2536;
    int[] field2539;
    int[] field2548;
    class221[][] field2554;
    class222 field2556;
    class224 field2562;
    int[] field2551;
    int field2559;
    int[] field2546;
    int[] field2544;
    long field2561;
    int[] field2540;
    int[] field2541;
    int field2538;
    boolean field2547;
    class221[][] field2555;
    int[] field2550;
    int[] field2558;
    long field2560;
    int[] field2552;
    int[] field2545;

    public class220() {
        this.field2537 = 256;
        this.field2538 = 1000000;
        this.field2551 = new int[16];
        this.field2536 = new int[16];
        this.field2541 = new int[16];
        this.field2542 = new int[16];
        this.field2539 = new int[16];
        this.field2544 = new int[16];
        this.field2543 = new int[16];
        this.field2552 = new int[16];
        this.field2558 = new int[16];
        this.field2548 = new int[16];
        this.field2545 = new int[16];
        this.field2550 = new int[16];
        this.field2540 = new int[16];
        this.field2553 = new int[16];
        this.field2546 = new int[16];
        this.field2554 = new class221[16][128];
        this.field2555 = new class221[16][128];
        this.field2556 = new class222();
        this.field2562 = new class224(this);
        this.field2557 = new class204(128);
        this.method4416(-859933411);
    }

    public static class162 method4523(int var0) {
        try {
            return new class151();
        } catch (Throwable var2) {
            return new class152();
        }
    }

    static void method4522(short var0) {
        for (class69 var1 = (class69) class69.field1051.getFirst(); var1 != null;
             var1 = (class69) class69.field1051.getNext()) {
            if (var1.field1061 != null) {
                var1.method1832(-720032025);
            }
        }

    }

    void method4483(int var1, int var2, int var3) {
        this.field2542[var1] = var2;
        this.field2544[var1] = var2 & -128;
        this.method4406(var1, var2, (byte) -119);
    }

    void method4478(int var1, int var2, int var3, byte var4) {
        class221 var5 = this.field2554[var1][var2];
        if (var5 != null) {
            this.field2554[var1][var2] = null;
            if ((this.field2548[var1] & 2) != 0) {
                for (class221 var6 = (class221) this.field2562.field2615.getFirst(); var6 != null;
                     var6 = (class221) this.field2562.field2615.getNext()) {
                    if (var5.field2585 == var6.field2585 && var6.field2577 < 0 && var5 != var6) {
                        var5.field2577 = 0;
                        break;
                    }
                }
            } else {
                var5.field2577 = 0;
            }

        }
    }

    void method4413(int var1, int var2) {
        for (class221 var3 = (class221) this.field2562.field2615.getFirst(); var3 != null;
             var3 = (class221) this.field2562.field2615.getNext()) {
            if (var1 < 0 || var3.field2585 == var1) {
                if (var3.field2581 != null) {
                    var3.field2581.method2482(class97.field1377 / 100);
                    if (var3.field2581.method2486()) {
                        this.field2562.field2617.method2215(var3.field2581);
                    }

                    var3.method4525(1830692633);
                }

                if (var3.field2577 < 0) {
                    this.field2554[var3.field2585][var3.field2568] = null;
                }

                var3.unlink();
            }
        }

    }

    public synchronized void method4521(byte var1) {
        this.field2556.method4582();
        this.method4416(1366988619);
    }

    void method4414(int var1, byte var2) {
        if (var1 >= 0) {
            this.field2551[var1] = 12800;
            this.field2536[var1] = 8192;
            this.field2541[var1] = 16383;
            this.field2543[var1] = 8192;
            this.field2552[var1] = 0;
            this.field2558[var1] = 8192;
            this.method4417(var1, -2032006285);
            this.method4418(var1, -1869804534);
            this.field2548[var1] = 0;
            this.field2545[var1] = 32767;
            this.field2550[var1] = 256;
            this.field2540[var1] = 0;
            this.method4420(var1, 8192, 999693395);
        } else {
            for (var1 = 0; var1 < 16; ++var1) {
                this.method4414(var1, (byte) -33);
            }

        }
    }

    void method4407(int var1, int var2, int var3, byte var4) {
        this.method4478(var1, var2, 64, (byte) 47);
        if ((this.field2548[var1] & 2) != 0) {
            for (class221 var5 = (class221) this.field2562.field2615.method4274(); var5 != null;
                 var5 = (class221) this.field2562.field2615.method4295()) {
                if (var5.field2585 == var1 && var5.field2577 < 0) {
                    this.field2554[var1][var5.field2568] = null;
                    this.field2554[var1][var2] = var5;
                    int var6 = (var5.field2572 * var5.field2573 >> 12) + var5.field2586;
                    var5.field2586 += var2 - var5.field2568 << 8;
                    var5.field2572 = var6 - var5.field2586;
                    var5.field2573 = 4096;
                    var5.field2568 = var2;
                    return;
                }
            }
        }

        class223 var10 = (class223) this.field2557.method4224((long) this.field2539[var1]);
        if (var10 != null) {
            class95 var9 = var10.field2602[var2];
            if (var9 != null) {
                class221 var7 = new class221();
                var7.field2585 = var1;
                var7.field2571 = var10;
                var7.field2565 = var9;
                var7.field2566 = var10.field2606[var2];
                var7.field2583 = var10.field2607[var2];
                var7.field2568 = var2;
                var7.field2570 = var3 * var3 * var10.field2604[var2] * var10.field2603 + 1024 >> 11;
                var7.field2569 = var10.field2612[var2] & 255;
                var7.field2586 = (var2 << 8) - (var10.field2601[var2] & 32767);
                var7.field2574 = 0;
                var7.field2575 = 0;
                var7.field2564 = 0;
                var7.field2577 = -1;
                var7.field2578 = 0;
                if (this.field2540[var1] == 0) {
                    var7.field2581 = class105.method2469(var9, this.method4421(var7, -1198966093),
                                                         this.method4422(var7, 2060651687),
                                                         this.method4423(var7, -386561631));
                } else {
                    var7.field2581 = class105.method2469(var9, this.method4421(var7, -399478636), 0,
                                                         this.method4423(var7, 120249780));
                    this.method4408(var7, var10.field2601[var2] < 0, (byte) 63);
                }

                if (var10.field2601[var2] < 0) {
                    var7.field2581.method2471(-1);
                }

                if (var7.field2583 >= 0) {
                    class221 var8 = this.field2555[var1][var7.field2583];
                    if (var8 != null && var8.field2577 < 0) {
                        this.field2554[var1][var8.field2568] = null;
                        var8.field2577 = 0;
                    }

                    this.field2555[var1][var7.field2583] = var7;
                }

                this.field2562.field2615.addLast(var7);
                this.field2554[var1][var2] = var7;
            }
        }
    }

    void method4410(int var1, int var2, int var3, int var4) {
    }

    void method4416(int var1) {
        this.method4413(-1, -428564190);
        this.method4414(-1, (byte) -57);

        int var2;
        for (var2 = 0; var2 < 16; ++var2) {
            this.field2539[var2] = this.field2542[var2];
        }

        for (var2 = 0; var2 < 16; ++var2) {
            this.field2544[var2] = this.field2542[var2] & -128;
        }

    }

    void method4406(int var1, int var2, byte var3) {
        if (var2 != this.field2539[var1]) {
            this.field2539[var1] = var2;

            for (int var4 = 0; var4 < 128; ++var4) {
                this.field2555[var1][var4] = null;
            }
        }

    }

    protected synchronized void vmethod4620(int[] var1, int var2, int var3) {
        if (this.field2556.method4529()) {
            int var4 = this.field2556.field2588 * this.field2538 / class97.field1377;

            do {
                long var5 = this.field2560 + (long) var4 * (long) var3;
                if (this.field2561 - var5 >= 0L) {
                    this.field2560 = var5;
                    break;
                }

                int var7 = (int) ((this.field2561 - this.field2560 + (long) var4 - 1L)
                    / (long) var4);
                this.field2560 += (long) var7 * (long) var4;
                this.field2562.vmethod4620(var1, var2, var7);
                var2 += var7;
                var3 -= var7;
                this.method4435(-546966059);
            } while (this.field2556.method4529());
        }

        this.field2562.vmethod4620(var1, var2, var3);
    }

    protected synchronized void vmethod4601(int var1) {
        if (this.field2556.method4529()) {
            int var2 = this.field2556.field2588 * this.field2538 / class97.field1377;

            do {
                long var3 = this.field2560 + (long) var1 * (long) var2;
                if (this.field2561 - var3 >= 0L) {
                    this.field2560 = var3;
                    break;
                }

                int var5 = (int) ((this.field2561 - this.field2560 + (long) var2 - 1L)
                    / (long) var2);
                this.field2560 += (long) var2 * (long) var5;
                this.field2562.vmethod4601(var5);
                var1 -= var5;
                this.method4435(553866713);
            } while (this.field2556.method4529());
        }

        this.field2562.vmethod4601(var1);
    }

    void method4396(int var1, int var2, byte var3) {
    }

    void method4412(int var1, int var2, byte var3) {
        this.field2543[var1] = var2;
    }

    int method4421(class221 var1, int var2) {
        int var3 = (var1.field2573 * var1.field2572 >> 12) + var1.field2586;
        var3 += (this.field2543[var1.field2585] - 8192) * this.field2550[var1.field2585] >> 12;
        class218 var4 = var1.field2566;
        int var5;
        if (var4.field2523 > 0 && (var4.field2526 > 0 || this.field2552[var1.field2585] > 0)) {
            var5 = var4.field2526 << 2;
            int var6 = var4.field2520 << 1;
            if (var1.field2579 < var6) {
                var5 = var5 * var1.field2579 / var6;
            }

            var5 += this.field2552[var1.field2585] >> 7;
            double var7 = Math.sin(0.01227184630308513D * (double) (var1.field2580 & 511));
            var3 += (int) (var7 * (double) var5);
        }

        var5 = (int) ((double) (var1.field2565.field1347 * 256) * Math
            .pow(2.0D, 3.255208333333333E-4D * (double) var3) / (double) class97.field1377 + 0.5D);
        return var5 < 1 ? 1 : var5;
    }

    protected synchronized class107 vmethod4598() {
        return null;
    }

    synchronized boolean method4398(class225 var1, class249 var2, class100 var3, int var4,
                                    int var5) {
        var1.method4628();
        boolean var6 = true;
        int[] var7 = null;
        if (var4 > 0) {
            var7 = new int[]{var4};
        }

        for (class215 var8 = (class215) var1.field2619.method4235(); var8 != null;
             var8 = (class215) var1.field2619.method4229()) {
            int var9 = (int) var8.key;
            class223 var10 = (class223) this.field2557.method4224((long) var9);
            if (var10 == null) {
                var10 = class26.method490(var2, var9, -779833062);
                if (var10 == null) {
                    var6 = false;
                    continue;
                }

                this.field2557.method4226(var10, (long) var9);
            }

            if (!var10.method4584(var3, var8.field2514, var7, 939473631)) {
                var6 = false;
            }
        }

        if (var6) {
            var1.method4633();
        }

        return var6;
    }

    boolean method4429(class221 var1, int var2) {
        if (var1.field2581 == null) {
            if (var1.field2577 >= 0) {
                var1.unlink();
                if (var1.field2583 > 0 && var1 == this.field2555[var1.field2585][var1.field2583]) {
                    this.field2555[var1.field2585][var1.field2583] = null;
                }
            }

            return true;
        } else {
            return false;
        }
    }

    void method4417(int var1, int var2) {
        if ((this.field2548[var1] & 2) != 0) {
            for (class221 var3 = (class221) this.field2562.field2615.getFirst(); var3 != null;
                 var3 = (class221) this.field2562.field2615.getNext()) {
                if (var3.field2585 == var1 && this.field2554[var1][var3.field2568] == null
                    && var3.field2577 < 0) {
                    var3.field2577 = 0;
                }
            }
        }

    }

    public int method4403(int var1) {
        return this.field2537;
    }

    void method4418(int var1, int var2) {
        if ((this.field2548[var1] & 4) != 0) {
            for (class221 var3 = (class221) this.field2562.field2615.getFirst(); var3 != null;
                 var3 = (class221) this.field2562.field2615.getNext()) {
                if (var3.field2585 == var1) {
                    var3.field2567 = 0;
                }
            }
        }

    }

    void method4471(int var1, int var2) {
        int var3 = var1 & 240;
        int var4;
        int var5;
        int var6;
        if (var3 == 128) {
            var4 = var1 & 15;
            var5 = var1 >> 8 & 127;
            var6 = var1 >> 16 & 127;
            this.method4478(var4, var5, var6, (byte) 104);
        } else if (var3 == 144) {
            var4 = var1 & 15;
            var5 = var1 >> 8 & 127;
            var6 = var1 >> 16 & 127;
            if (var6 > 0) {
                this.method4407(var4, var5, var6, (byte) -90);
            } else {
                this.method4478(var4, var5, 64, (byte) 119);
            }

        } else if (var3 == 160) {
            var4 = var1 & 15;
            var5 = var1 >> 8 & 127;
            var6 = var1 >> 16 & 127;
            this.method4410(var4, var5, var6, 913950898);
        } else if (var3 == 176) {
            var4 = var1 & 15;
            var5 = var1 >> 8 & 127;
            var6 = var1 >> 16 & 127;
            if (var5 == 0) {
                this.field2544[var4] = (var6 << 14) + (this.field2544[var4] & -2080769);
            }

            if (var5 == 32) {
                this.field2544[var4] = (var6 << 7) + (this.field2544[var4] & -16257);
            }

            if (var5 == 1) {
                this.field2552[var4] = (var6 << 7) + (this.field2552[var4] & -16257);
            }

            if (var5 == 33) {
                this.field2552[var4] = var6 + (this.field2552[var4] & -128);
            }

            if (var5 == 5) {
                this.field2558[var4] = (var6 << 7) + (this.field2558[var4] & -16257);
            }

            if (var5 == 37) {
                this.field2558[var4] = var6 + (this.field2558[var4] & -128);
            }

            if (var5 == 7) {
                this.field2551[var4] = (var6 << 7) + (this.field2551[var4] & -16257);
            }

            if (var5 == 39) {
                this.field2551[var4] = var6 + (this.field2551[var4] & -128);
            }

            if (var5 == 10) {
                this.field2536[var4] = (var6 << 7) + (this.field2536[var4] & -16257);
            }

            if (var5 == 42) {
                this.field2536[var4] = var6 + (this.field2536[var4] & -128);
            }

            if (var5 == 11) {
                this.field2541[var4] = (var6 << 7) + (this.field2541[var4] & -16257);
            }

            if (var5 == 43) {
                this.field2541[var4] = var6 + (this.field2541[var4] & -128);
            }

            if (var5 == 64) {
                if (var6 >= 64) {
                    this.field2548[var4] |= 1;
                } else {
                    this.field2548[var4] &= -2;
                }
            }

            if (var5 == 65) {
                if (var6 >= 64) {
                    this.field2548[var4] |= 2;
                } else {
                    this.method4417(var4, -2032006285);
                    this.field2548[var4] &= -3;
                }
            }

            if (var5 == 99) {
                this.field2545[var4] = (var6 << 7) + (this.field2545[var4] & 127);
            }

            if (var5 == 98) {
                this.field2545[var4] = (this.field2545[var4] & 16256) + var6;
            }

            if (var5 == 101) {
                this.field2545[var4] = (var6 << 7) + (this.field2545[var4] & 127) + 16384;
            }

            if (var5 == 100) {
                this.field2545[var4] = (this.field2545[var4] & 16256) + var6 + 16384;
            }

            if (var5 == 120) {
                this.method4413(var4, 38452024);
            }

            if (var5 == 121) {
                this.method4414(var4, (byte) 13);
            }

            if (var5 == 123) {
                this.method4496(var4, -1811422661);
            }

            int var7;
            if (var5 == 6) {
                var7 = this.field2545[var4];
                if (var7 == 16384) {
                    this.field2550[var4] = (var6 << 7) + (this.field2550[var4] & -16257);
                }
            }

            if (var5 == 38) {
                var7 = this.field2545[var4];
                if (var7 == 16384) {
                    this.field2550[var4] = var6 + (this.field2550[var4] & -128);
                }
            }

            if (var5 == 16) {
                this.field2540[var4] = (var6 << 7) + (this.field2540[var4] & -16257);
            }

            if (var5 == 48) {
                this.field2540[var4] = var6 + (this.field2540[var4] & -128);
            }

            if (var5 == 81) {
                if (var6 >= 64) {
                    this.field2548[var4] |= 4;
                } else {
                    this.method4418(var4, -1869804534);
                    this.field2548[var4] &= -5;
                }
            }

            if (var5 == 17) {
                this.method4420(var4, (var6 << 7) + (this.field2553[var4] & -16257), 999693395);
            }

            if (var5 == 49) {
                this.method4420(var4, var6 + (this.field2553[var4] & -128), 999693395);
            }

        } else if (var3 == 192) {
            var4 = var1 & 15;
            var5 = var1 >> 8 & 127;
            this.method4406(var4, var5 + this.field2544[var4], (byte) -63);
        } else if (var3 == 208) {
            var4 = var1 & 15;
            var5 = var1 >> 8 & 127;
            this.method4396(var4, var5, (byte) 115);
        } else if (var3 == 224) {
            var4 = var1 & 15;
            var5 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
            this.method4412(var4, var5, (byte) -10);
        } else {
            var3 = var1 & 255;
            if (var3 == 255) {
                this.method4416(1069637224);
            }
        }
    }

    public synchronized boolean method4492(int var1) {
        return this.field2556.method4529();
    }

    synchronized void method4399(int var1) {
        for (class223 var2 = (class223) this.field2557.method4235(); var2 != null;
             var2 = (class223) this.field2557.method4229()) {
            var2.method4585(-659155621);
        }

    }

    public synchronized void method4476(byte var1) {
        for (class223 var2 = (class223) this.field2557.method4235(); var2 != null;
             var2 = (class223) this.field2557.method4229()) {
            var2.unlink();
        }

    }

    boolean method4508(class221 var1, int[] var2, int var3, int var4, int var5) {
        var1.field2576 = class97.field1377 / 100;
        if (var1.field2577 < 0 || var1.field2581 != null && !var1.field2581.method2485()) {
            int var6 = var1.field2573;
            if (var6 > 0) {
                var6 -= (int) (16.0D * Math
                    .pow(2.0D, 4.921259842519685E-4D * (double) this.field2558[var1.field2585])
                    + 0.5D);
                if (var6 < 0) {
                    var6 = 0;
                }

                var1.field2573 = var6;
            }

            var1.field2581.method2480(this.method4421(var1, -333629023));
            class218 var7 = var1.field2566;
            boolean var8 = false;
            ++var1.field2579;
            var1.field2580 += var7.field2523;
            double var9 = 5.086263020833333E-6D * (double) ((var1.field2568 - 60 << 8) + (
                var1.field2572 * var1.field2573 >> 12));
            if (var7.field2522 > 0) {
                if (var7.field2525 > 0) {
                    var1.field2574 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2525 * var9)
                        + 0.5D);
                } else {
                    var1.field2574 += 128;
                }
            }

            if (var7.field2521 != null) {
                if (var7.field2528 > 0) {
                    var1.field2575 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2528 * var9)
                        + 0.5D);
                } else {
                    var1.field2575 += 128;
                }

                while (var1.field2564 < var7.field2521.length - 2
                    && var1.field2575 > (var7.field2521[var1.field2564 + 2] & 255) << 8) {
                    var1.field2564 += 2;
                }

                if (var7.field2521.length - 2 == var1.field2564
                    && var7.field2521[var1.field2564 + 1] == 0) {
                    var8 = true;
                }
            }

            if (var1.field2577 >= 0 && var7.field2524 != null
                && (this.field2548[var1.field2585] & 1) == 0 && (var1.field2583 < 0
                || var1 != this.field2555[var1.field2585][var1.field2583])) {
                if (var7.field2527 > 0) {
                    var1.field2577 += (int) (128.0D * Math.pow(2.0D, var9 * (double) var7.field2527)
                        + 0.5D);
                } else {
                    var1.field2577 += 128;
                }

                while (var1.field2578 < var7.field2524.length - 2
                    && var1.field2577 > (var7.field2524[var1.field2578 + 2] & 255) << 8) {
                    var1.field2578 += 2;
                }

                if (var7.field2524.length - 2 == var1.field2578) {
                    var8 = true;
                }
            }

            if (var8) {
                var1.field2581.method2482(var1.field2576);
                if (var2 != null) {
                    var1.field2581.vmethod4620(var2, var3, var4);
                } else {
                    var1.field2581.vmethod4601(var4);
                }

                if (var1.field2581.method2486()) {
                    this.field2562.field2617.method2215(var1.field2581);
                }

                var1.method4525(1830692633);
                if (var1.field2577 >= 0) {
                    var1.unlink();
                    if (var1.field2583 > 0
                        && var1 == this.field2555[var1.field2585][var1.field2583]) {
                        this.field2555[var1.field2585][var1.field2583] = null;
                    }
                }

                return true;
            } else {
                var1.field2581.method2481(var1.field2576, this.method4422(var1, 2145976483),
                                          this.method4423(var1, 1203682086));
                return false;
            }
        } else {
            var1.method4525(1830692633);
            var1.unlink();
            if (var1.field2583 > 0 && var1 == this.field2555[var1.field2585][var1.field2583]) {
                this.field2555[var1.field2585][var1.field2583] = null;
            }

            return true;
        }
    }

    public synchronized void method4426(int var1, byte var2) {
        this.field2537 = var1;
    }

    void method4420(int var1, int var2, int var3) {
        this.field2553[var1] = var2;
        this.field2546[var1] = (int) (2097152.0D * Math.pow(2.0D, 5.4931640625E-4D * (double) var2)
            + 0.5D);
    }

    protected synchronized class107 vmethod4596() {
        return this.field2562;
    }

    synchronized void method4401(class225 var1, boolean var2, int var3) {
        this.method4521((byte) 27);
        this.field2556.method4531(var1.field2620);
        this.field2547 = var2;
        this.field2560 = 0L;
        int var4 = this.field2556.method4572();

        for (int var5 = 0; var5 < var4; ++var5) {
            this.field2556.method4568(var5);
            this.field2556.method4537(var5);
            this.field2556.method4535(var5);
        }

        this.field2549 = this.field2556.method4573();
        this.field2559 = this.field2556.field2591[this.field2549];
        this.field2561 = this.field2556.method4541(this.field2559);
    }

    void method4435(int var1) {
        int var2 = this.field2549;
        int var3 = this.field2559;

        long var4;
        for (var4 = this.field2561; var3 == this.field2559;
             var4 = this.field2556.method4541(var3)) {
            while (var3 == this.field2556.field2591[var2]) {
                this.field2556.method4568(var2);
                int var6 = this.field2556.method4538(var2);
                if (var6 == 1) {
                    this.field2556.method4536();
                    this.field2556.method4535(var2);
                    if (this.field2556.method4543()) {
                        if (!this.field2547 || var3 == 0) {
                            this.method4416(-797036929);
                            this.field2556.method4582();
                            return;
                        }

                        this.field2556.method4534(var4);
                    }
                    break;
                }

                if ((var6 & 128) != 0) {
                    this.method4471(var6, 1491002908);
                }

                this.field2556.method4537(var2);
                this.field2556.method4535(var2);
            }

            var2 = this.field2556.method4573();
            var3 = this.field2556.field2591[var2];
        }

        this.field2549 = var2;
        this.field2559 = var3;
        this.field2561 = var4;
    }

    void method4408(class221 var1, boolean var2, byte var3) {
        int var4 = var1.field2565.field1345.length;
        int var5;
        if (var2 && var1.field2565.field1344) {
            int var6 = var4 + var4 - var1.field2565.field1346;
            var5 = (int) ((long) var6 * (long) this.field2540[var1.field2585] >> 6);
            var4 <<= 8;
            if (var5 >= var4) {
                var5 = var4 + var4 - 1 - var5;
                var1.field2581.method2478(true);
            }
        } else {
            var5 = (int) ((long) var4 * (long) this.field2540[var1.field2585] >> 6);
        }

        var1.field2581.method2477(var5);
    }

    protected synchronized int vmethod4609() {
        return 0;
    }

    int method4422(class221 var1, int var2) {
        class218 var3 = var1.field2566;
        int var4 = this.field2551[var1.field2585] * this.field2541[var1.field2585] + 4096 >> 13;
        var4 = var4 * var4 + 16384 >> 15;
        var4 = var4 * var1.field2570 + 16384 >> 15;
        var4 = var4 * this.field2537 + 128 >> 8;
        if (var3.field2522 > 0) {
            var4 = (int) ((double) var4 * Math
                .pow(0.5D, (double) var3.field2522 * 1.953125E-5D * (double) var1.field2574)
                + 0.5D);
        }

        int var5;
        int var6;
        int var7;
        int var8;
        if (var3.field2521 != null) {
            var5 = var1.field2575;
            var6 = var3.field2521[var1.field2564 + 1];
            if (var1.field2564 < var3.field2521.length - 2) {
                var7 = (var3.field2521[var1.field2564] & 255) << 8;
                var8 = (var3.field2521[var1.field2564 + 2] & 255) << 8;
                var6 += (var5 - var7) * (var3.field2521[var1.field2564 + 3] - var6) / (var8 - var7);
            }

            var4 = var6 * var4 + 32 >> 6;
        }

        if (var1.field2577 > 0 && var3.field2524 != null) {
            var5 = var1.field2577;
            var6 = var3.field2524[var1.field2578 + 1];
            if (var1.field2578 < var3.field2524.length - 2) {
                var7 = (var3.field2524[var1.field2578] & 255) << 8;
                var8 = (var3.field2524[var1.field2578 + 2] & 255) << 8;
                var6 += (var3.field2524[var1.field2578 + 3] - var6) * (var5 - var7) / (var8 - var7);
            }

            var4 = var6 * var4 + 32 >> 6;
        }

        return var4;
    }

    int method4423(class221 var1, int var2) {
        int var3 = this.field2536[var1.field2585];
        return var3 < 8192 ? var3 * var1.field2569 + 32 >> 6
            : 16384 - ((128 - var1.field2569) * (16384 - var3) + 32 >> 6);
    }

    void method4496(int var1, int var2) {
        for (class221 var3 = (class221) this.field2562.field2615.getFirst(); var3 != null;
             var3 = (class221) this.field2562.field2615.getNext()) {
            if ((var1 < 0 || var3.field2585 == var1) && var3.field2577 < 0) {
                this.field2554[var3.field2585][var3.field2568] = null;
                var3.field2577 = 0;
            }
        }

    }

    public synchronized void method4404(int var1, int var2, byte var3) {
        this.method4483(var1, var2, 726768352);
    }
}
