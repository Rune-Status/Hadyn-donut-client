package jagex.osrs;

import java.util.Random;

public class class109 {

    static int[] field1462;
    static int[] field1450;
    static int[] field1469;
    static int[] field1471;
    static int[] field1472;
    static int[] field1460;
    static int[] field1466;
    static int[] field1475;

    static {
        field1462 = new int['\u8000'];
        Random var0 = new Random(0L);

        int var1;
        for (var1 = 0; var1 < 32768; ++var1) {
            field1462[var1] = (var0.nextInt() & 2) - 1;
        }

        field1469 = new int['\u8000'];

        for (var1 = 0; var1 < 32768; ++var1) {
            field1469[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }

        field1450 = new int[220500];
        field1471 = new int[5];
        field1472 = new int[5];
        field1460 = new int[5];
        field1466 = new int[5];
        field1475 = new int[5];
    }

    class98 field1464;
    int[] field1458;
    int field1465;
    int field1468;
    class98 field1451;
    int[] field1459;
    class98 field1452;
    class98 field1454;
    class98 field1463;
    int[] field1453;
    class98 field1455;
    int field1461;
    int field1467;
    class98 field1456;
    class98 field1457;
    class106 field1474;
    class98 field1473;

    class109() {
        this.field1458 = new int[]{0, 0, 0, 0, 0};
        this.field1459 = new int[]{0, 0, 0, 0, 0};
        this.field1453 = new int[]{0, 0, 0, 0, 0};
        this.field1461 = 0;
        this.field1467 = 100;
        this.field1465 = 500;
        this.field1468 = 0;
    }

    final void method2676(Buffer var1) {
        this.field1464 = new class98();
        this.field1464.method2411(var1);
        this.field1451 = new class98();
        this.field1451.method2411(var1);
        int var2 = var1.getUByte();
        if (var2 != 0) {
            --var1.offset;
            this.field1452 = new class98();
            this.field1452.method2411(var1);
            this.field1463 = new class98();
            this.field1463.method2411(var1);
        }

        var2 = var1.getUByte();
        if (var2 != 0) {
            --var1.offset;
            this.field1454 = new class98();
            this.field1454.method2411(var1);
            this.field1455 = new class98();
            this.field1455.method2411(var1);
        }

        var2 = var1.getUByte();
        if (var2 != 0) {
            --var1.offset;
            this.field1456 = new class98();
            this.field1456.method2411(var1);
            this.field1457 = new class98();
            this.field1457.method2411(var1);
        }

        for (int var3 = 0; var3 < 10; ++var3) {
            int var4 = var1.method3783(2005766669);
            if (var4 == 0) {
                break;
            }

            this.field1458[var3] = var4;
            this.field1459[var3] = var1.method3782(1982278071);
            this.field1453[var3] = var1.method3783(1670861687);
        }

        this.field1461 = var1.method3783(1899437484);
        this.field1467 = var1.method3783(-707360890);
        this.field1465 = var1.readUint16();
        this.field1468 = var1.readUint16();
        this.field1474 = new class106();
        this.field1473 = new class98();
        this.field1474.method2636(var1, this.field1473);
    }

    final int[] method2678(int var1, int var2) {
        class195.method4110(field1450, 0, var1);
        if (var2 < 10) {
            return field1450;
        } else {
            double var3 = (double) var1 / ((double) var2 + 0.0D);
            this.field1464.method2409();
            this.field1451.method2409();
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            if (this.field1452 != null) {
                this.field1452.method2409();
                this.field1463.method2409();
                var5 = (int) (
                    (double) (this.field1452.field1380 - this.field1452.field1387) * 32.768D
                        / var3);
                var6 = (int) ((double) this.field1452.field1387 * 32.768D / var3);
            }

            int var8 = 0;
            int var9 = 0;
            int var10 = 0;
            if (this.field1454 != null) {
                this.field1454.method2409();
                this.field1455.method2409();
                var8 = (int) (
                    (double) (this.field1454.field1380 - this.field1454.field1387) * 32.768D
                        / var3);
                var9 = (int) ((double) this.field1454.field1387 * 32.768D / var3);
            }

            int var11;
            for (var11 = 0; var11 < 5; ++var11) {
                if (this.field1458[var11] != 0) {
                    field1471[var11] = 0;
                    field1472[var11] = (int) ((double) this.field1453[var11] * var3);
                    field1460[var11] = (this.field1458[var11] << 14) / 100;
                    field1466[var11] = (int) (
                        (double) (this.field1464.field1380 - this.field1464.field1387) * 32.768D
                            * Math.pow(1.0057929410678534D, (double) this.field1459[var11]) / var3);
                    field1475[var11] = (int) ((double) this.field1464.field1387 * 32.768D / var3);
                }
            }

            int var12;
            int var13;
            int var14;
            int var15;
            for (var11 = 0; var11 < var1; ++var11) {
                var12 = this.field1464.method2410(var1);
                var13 = this.field1451.method2410(var1);
                if (this.field1452 != null) {
                    var14 = this.field1452.method2410(var1);
                    var15 = this.field1463.method2410(var1);
                    var12 += this.method2674(var7, var15, this.field1452.field1385) >> 1;
                    var7 = var7 + var6 + (var14 * var5 >> 16);
                }

                if (this.field1454 != null) {
                    var14 = this.field1454.method2410(var1);
                    var15 = this.field1455.method2410(var1);
                    var13 = var13 * ((this.method2674(var10, var15, this.field1454.field1385) >> 1)
                        + 32768) >> 15;
                    var10 = var10 + var9 + (var14 * var8 >> 16);
                }

                for (var14 = 0; var14 < 5; ++var14) {
                    if (this.field1458[var14] != 0) {
                        var15 = field1472[var14] + var11;
                        if (var15 < var1) {
                            field1450[var15] += this
                                .method2674(field1471[var14], var13 * field1460[var14] >> 15,
                                            this.field1464.field1385);
                            field1471[var14] += (var12 * field1466[var14] >> 16) + field1475[var14];
                        }
                    }
                }
            }

            int var16;
            if (this.field1456 != null) {
                this.field1456.method2409();
                this.field1457.method2409();
                var11 = 0;
                boolean var19 = false;
                boolean var20 = true;

                for (var14 = 0; var14 < var1; ++var14) {
                    var15 = this.field1456.method2410(var1);
                    var16 = this.field1457.method2410(var1);
                    if (var20) {
                        var12 = (var15 * (this.field1456.field1380 - this.field1456.field1387) >> 8)
                            + this.field1456.field1387;
                    } else {
                        var12 = (var16 * (this.field1456.field1380 - this.field1456.field1387) >> 8)
                            + this.field1456.field1387;
                    }

                    var11 += 256;
                    if (var11 >= var12) {
                        var11 = 0;
                        var20 = !var20;
                    }

                    if (var20) {
                        field1450[var14] = 0;
                    }
                }
            }

            if (this.field1461 > 0 && this.field1467 > 0) {
                var11 = (int) ((double) this.field1461 * var3);

                for (var12 = var11; var12 < var1; ++var12) {
                    field1450[var12] += field1450[var12 - var11] * this.field1467 / 100;
                }
            }

            if (this.field1474.field1433[0] > 0 || this.field1474.field1433[1] > 0) {
                this.field1473.method2409();
                var11 = this.field1473.method2410(var1 + 1);
                var12 = this.field1474.method2648(0, (float) var11 / 65536.0F);
                var13 = this.field1474.method2648(1, (float) var11 / 65536.0F);
                if (var1 >= var12 + var13) {
                    var14 = 0;
                    var15 = var13;
                    if (var13 > var1 - var12) {
                        var15 = var1 - var12;
                    }

                    int var17;
                    while (var14 < var15) {
                        var16 = (int) ((long) field1450[var14 + var12] * (long) class106.field1438
                            >> 16);

                        for (var17 = 0; var17 < var12; ++var17) {
                            var16 += (int) ((long) field1450[var14 + var12 - 1 - var17]
                                * (long) class106.field1437[0][var17] >> 16);
                        }

                        for (var17 = 0; var17 < var14; ++var17) {
                            var16 -= (int) ((long) field1450[var14 - 1 - var17]
                                * (long) class106.field1437[1][var17] >> 16);
                        }

                        field1450[var14] = var16;
                        var11 = this.field1473.method2410(var1 + 1);
                        ++var14;
                    }

                    var15 = 128;

                    while (true) {
                        if (var15 > var1 - var12) {
                            var15 = var1 - var12;
                        }

                        int var18;
                        while (var14 < var15) {
                            var17 = (int) (
                                (long) field1450[var14 + var12] * (long) class106.field1438 >> 16);

                            for (var18 = 0; var18 < var12; ++var18) {
                                var17 += (int) ((long) field1450[var14 + var12 - 1 - var18]
                                    * (long) class106.field1437[0][var18] >> 16);
                            }

                            for (var18 = 0; var18 < var13; ++var18) {
                                var17 -= (int) ((long) field1450[var14 - 1 - var18]
                                    * (long) class106.field1437[1][var18] >> 16);
                            }

                            field1450[var14] = var17;
                            var11 = this.field1473.method2410(var1 + 1);
                            ++var14;
                        }

                        if (var14 >= var1 - var12) {
                            while (var14 < var1) {
                                var17 = 0;

                                for (var18 = var14 + var12 - var1; var18 < var12; ++var18) {
                                    var17 += (int) ((long) field1450[var14 + var12 - 1 - var18]
                                        * (long) class106.field1437[0][var18] >> 16);
                                }

                                for (var18 = 0; var18 < var13; ++var18) {
                                    var17 -= (int) ((long) field1450[var14 - 1 - var18]
                                        * (long) class106.field1437[1][var18] >> 16);
                                }

                                field1450[var14] = var17;
                                this.field1473.method2410(var1 + 1);
                                ++var14;
                            }
                            break;
                        }

                        var12 = this.field1474.method2648(0, (float) var11 / 65536.0F);
                        var13 = this.field1474.method2648(1, (float) var11 / 65536.0F);
                        var15 += 128;
                    }
                }
            }

            for (var11 = 0; var11 < var1; ++var11) {
                if (field1450[var11] < -32768) {
                    field1450[var11] = -32768;
                }

                if (field1450[var11] > 32767) {
                    field1450[var11] = 32767;
                }
            }

            return field1450;
        }
    }

    final int method2674(int var1, int var2, int var3) {
        return var3 == 1 ? ((var1 & 32767) < 16384 ? var2 : -var2)
            : (var3 == 2 ? field1469[var1 & 32767] * var2 >> 14
                : (var3 == 3 ? (var2 * (var1 & 32767) >> 14) - var2
                    : (var3 == 4 ? var2 * field1462[var1 / 2607 & 32767] : 0)));
    }
}
