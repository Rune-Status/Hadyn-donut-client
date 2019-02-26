package jagex.osrs;

public class class105 extends class107 {

    int field1418;
    int field1417;
    int field1416;
    int field1422;
    int field1426;
    int field1415;
    int field1423;
    int field1420;
    int field1425;
    int field1421;
    int field1424;
    int field1427;
    int field1428;
    boolean field1419;
    int field1429;

    class105(class95 var1, int var2, int var3, int var4) {
        super.field1442 = var1;
        this.field1425 = var1.field1346;
        this.field1424 = var1.field1348;
        this.field1419 = var1.field1344;
        this.field1415 = var2;
        this.field1417 = var3;
        this.field1418 = var4;
        this.field1423 = 0;
        this.method2470();
    }

    class105(class95 var1, int var2, int var3) {
        super.field1442 = var1;
        this.field1425 = var1.field1346;
        this.field1424 = var1.field1348;
        this.field1419 = var1.field1344;
        this.field1415 = var2;
        this.field1417 = var3;
        this.field1418 = 8192;
        this.field1423 = 0;
        this.method2470();
    }

    static int method2585(int var0, int var1) {
        return var1 < 0 ? var0
            : (int) ((double) var0 * Math.sqrt((double) (16384 - var1) * 1.220703125E-4D) + 0.5D);
    }

    static int method2541(int var0, int var1) {
        return var1 < 0 ? -var0
            : (int) ((double) var0 * Math.sqrt((double) var1 * 1.220703125E-4D) + 0.5D);
    }

    static int method2499(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6,
                          int var7, int var8, int var9, class105 var10, int var11, int var12) {
        if (var11 == 0 || (var7 = var5 + (var11 + (var9 - var4) - 257) / var11) > var8) {
            var7 = var8;
        }

        byte var13;
        int var10001;
        while (var5 < var7) {
            var1 = var4 >> 8;
            var13 = var2[var1];
            var10001 = var5++;
            var3[var10001] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 255)) * var6 >> 6;
            var4 += var11;
        }

        if (var11 == 0 || (var7 = var5 + (var11 + (var9 - var4) - 1) / var11) > var8) {
            var7 = var8;
        }

        for (var1 = var12; var5 < var7; var4 += var11) {
            var13 = var2[var4 >> 8];
            var10001 = var5++;
            var3[var10001] += ((var13 << 8) + (var1 - var13) * (var4 & 255)) * var6 >> 6;
        }

        var10.field1423 = var4;
        return var5;
    }

    static int method2501(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6,
                          int var7, int var8, int var9, class105 var10, int var11, int var12) {
        if (var11 == 0 || (var7 = var5 + (var11 + (var9 + 256 - var4)) / var11) > var8) {
            var7 = var8;
        }

        int var10001;
        while (var5 < var7) {
            var1 = var4 >> 8;
            byte var13 = var2[var1 - 1];
            var10001 = var5++;
            var3[var10001] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 255)) * var6 >> 6;
            var4 += var11;
        }

        if (var11 == 0 || (var7 = var5 + (var11 + (var9 - var4)) / var11) > var8) {
            var7 = var8;
        }

        var0 = var12;

        for (var1 = var11; var5 < var7; var4 += var1) {
            var10001 = var5++;
            var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
        }

        var10.field1423 = var4;
        return var5;
    }

    static int method2504(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6,
                          int var7, class105 var8) {
        var2 >>= 8;
        var7 >>= 8;
        var4 <<= 2;
        if ((var5 = var3 + var7 - var2) > var6) {
            var5 = var6;
        }

        int var10001;
        for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
            var10001 = var3++;
            var1[var10001] += var0[var2++] * var4;
            var10001 = var3++;
            var1[var10001] += var0[var2++] * var4;
            var10001 = var3++;
            var1[var10001] += var0[var2++] * var4;
            var10001 = var3++;
        }

        for (var5 += 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
            var10001 = var3++;
        }

        var8.field1423 = var2 << 8;
        return var3;
    }

    static int method2497(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6,
                          int var7, class105 var8) {
        var2 >>= 8;
        var7 >>= 8;
        var4 <<= 2;
        if ((var5 = var3 + var2 - (var7 - 1)) > var6) {
            var5 = var6;
        }

        int var10001;
        for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
            var10001 = var3++;
            var1[var10001] += var0[var2--] * var4;
            var10001 = var3++;
            var1[var10001] += var0[var2--] * var4;
            var10001 = var3++;
            var1[var10001] += var0[var2--] * var4;
            var10001 = var3++;
        }

        for (var5 += 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
            var10001 = var3++;
        }

        var8.field1423 = var2 << 8;
        return var3;
    }

    static int method2570(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6,
                          int var7, int var8, int var9, int var10, class105 var11, int var12,
                          int var13) {
        if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
            var8 = var9;
        }

        var5 <<= 1;

        byte var14;
        int var10001;
        for (var8 <<= 1; var5 < var8; var4 += var12) {
            var1 = var4 >> 8;
            var14 = var2[var1];
            var0 = (var14 << 8) + (var4 & 255) * (var2[var1 + 1] - var14);
            var10001 = var5++;
            var3[var10001] += var0 * var6 >> 6;
            var10001 = var5++;
            var3[var10001] += var0 * var7 >> 6;
        }

        if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
            var8 = var9;
        }

        var8 <<= 1;

        for (var1 = var13; var5 < var8; var4 += var12) {
            var14 = var2[var4 >> 8];
            var0 = (var14 << 8) + (var1 - var14) * (var4 & 255);
            var10001 = var5++;
            var3[var10001] += var0 * var6 >> 6;
            var10001 = var5++;
            var3[var10001] += var0 * var7 >> 6;
        }

        var11.field1423 = var4;
        return var5 >> 1;
    }

    static int method2525(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6,
                          int var7, int var8, int var9, int var10, class105 var11, int var12,
                          int var13) {
        if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
            var8 = var9;
        }

        var5 <<= 1;

        int var10001;
        for (var8 <<= 1; var5 < var8; var4 += var12) {
            var1 = var4 >> 8;
            byte var14 = var2[var1 - 1];
            var0 = (var2[var1] - var14) * (var4 & 255) + (var14 << 8);
            var10001 = var5++;
            var3[var10001] += var0 * var6 >> 6;
            var10001 = var5++;
            var3[var10001] += var0 * var7 >> 6;
        }

        if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
            var8 = var9;
        }

        var8 <<= 1;

        for (var1 = var13; var5 < var8; var4 += var12) {
            var0 = (var1 << 8) + (var4 & 255) * (var2[var4 >> 8] - var1);
            var10001 = var5++;
            var3[var10001] += var0 * var6 >> 6;
            var10001 = var5++;
            var3[var10001] += var0 * var7 >> 6;
        }

        var11.field1423 = var4;
        return var5 >> 1;
    }

    static int method2496(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6,
                          int var7, int var8, int var9, class105 var10) {
        var3 >>= 8;
        var9 >>= 8;
        var5 <<= 2;
        var6 <<= 2;
        if ((var7 = var4 + var9 - var3) > var8) {
            var7 = var8;
        }

        var4 <<= 1;
        var7 <<= 1;

        int var10001;
        byte var11;
        for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
            var11 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
            var2[var10001] += var11 * var6;
            var11 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
            var2[var10001] += var11 * var6;
            var11 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
            var2[var10001] += var11 * var6;
            var11 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
        }

        for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
            var11 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
        }

        var10.field1423 = var3 << 8;
        return var4 >> 1;
    }

    static int method2498(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6,
                          int var7, int var8, int var9, class105 var10) {
        var3 >>= 8;
        var9 >>= 8;
        var5 <<= 2;
        var6 <<= 2;
        if ((var7 = var3 + var4 - (var9 - 1)) > var8) {
            var7 = var8;
        }

        var4 <<= 1;
        var7 <<= 1;

        int var10001;
        byte var11;
        for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
            var11 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
            var2[var10001] += var11 * var6;
            var11 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
            var2[var10001] += var11 * var6;
            var11 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
            var2[var10001] += var11 * var6;
            var11 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
        }

        for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
            var11 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
        }

        var10.field1423 = var3 << 8;
        return var4 >> 1;
    }

    static int method2507(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6,
                          int var7, int var8, int var9, int var10, class105 var11, int var12,
                          int var13) {
        var11.field1420 -= var11.field1428 * var5;
        var11.field1421 -= var11.field1429 * var5;
        if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
            var8 = var9;
        }

        byte var14;
        int var10001;
        while (var5 < var8) {
            var1 = var4 >> 8;
            var14 = var2[var1];
            var10001 = var5++;
            var3[var10001] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255)) * var6 >> 6;
            var6 += var7;
            var4 += var12;
        }

        if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
            var8 = var9;
        }

        for (var1 = var13; var5 < var8; var4 += var12) {
            var14 = var2[var4 >> 8];
            var10001 = var5++;
            var3[var10001] += ((var14 << 8) + (var1 - var14) * (var4 & 255)) * var6 >> 6;
            var6 += var7;
        }

        var11.field1420 += var11.field1428 * var5;
        var11.field1421 += var11.field1429 * var5;
        var11.field1416 = var6;
        var11.field1423 = var4;
        return var5;
    }

    static int method2561(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6,
                          int var7, int var8, int var9, int var10, class105 var11, int var12,
                          int var13) {
        var11.field1420 -= var11.field1428 * var5;
        var11.field1421 -= var11.field1429 * var5;
        if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
            var8 = var9;
        }

        int var10001;
        while (var5 < var8) {
            var1 = var4 >> 8;
            byte var14 = var2[var1 - 1];
            var10001 = var5++;
            var3[var10001] += ((var14 << 8) + (var2[var1] - var14) * (var4 & 255)) * var6 >> 6;
            var6 += var7;
            var4 += var12;
        }

        if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
            var8 = var9;
        }

        var0 = var13;

        for (var1 = var12; var5 < var8; var4 += var1) {
            var10001 = var5++;
            var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
            var6 += var7;
        }

        var11.field1420 += var11.field1428 * var5;
        var11.field1421 += var11.field1429 * var5;
        var11.field1416 = var6;
        var11.field1423 = var4;
        return var5;
    }

    static int method2503(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6,
                          int var7, int var8, class105 var9) {
        var2 >>= 8;
        var8 >>= 8;
        var4 <<= 2;
        var5 <<= 2;
        if ((var6 = var3 + var8 - var2) > var7) {
            var6 = var7;
        }

        var9.field1420 += var9.field1428 * (var6 - var3);
        var9.field1421 += var9.field1429 * (var6 - var3);

        int var10001;
        for (var6 -= 3; var3 < var6; var4 += var5) {
            var10001 = var3++;
            var1[var10001] += var0[var2++] * var4;
            var4 += var5;
            var10001 = var3++;
            var1[var10001] += var0[var2++] * var4;
            var4 += var5;
            var10001 = var3++;
            var1[var10001] += var0[var2++] * var4;
            var4 += var5;
            var10001 = var3++;
            var1[var10001] += var0[var2++] * var4;
        }

        for (var6 += 3; var3 < var6; var4 += var5) {
            var10001 = var3++;
            var1[var10001] += var0[var2++] * var4;
        }

        var9.field1416 = var4 >> 2;
        var9.field1423 = var2 << 8;
        return var3;
    }

    static int method2558(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6,
                          int var7, int var8, class105 var9) {
        var2 >>= 8;
        var8 >>= 8;
        var4 <<= 2;
        var5 <<= 2;
        if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
            var6 = var7;
        }

        var9.field1420 += var9.field1428 * (var6 - var3);
        var9.field1421 += var9.field1429 * (var6 - var3);

        int var10001;
        for (var6 -= 3; var3 < var6; var4 += var5) {
            var10001 = var3++;
            var1[var10001] += var0[var2--] * var4;
            var4 += var5;
            var10001 = var3++;
            var1[var10001] += var0[var2--] * var4;
            var4 += var5;
            var10001 = var3++;
            var1[var10001] += var0[var2--] * var4;
            var4 += var5;
            var10001 = var3++;
            var1[var10001] += var0[var2--] * var4;
        }

        for (var6 += 3; var3 < var6; var4 += var5) {
            var10001 = var3++;
            var1[var10001] += var0[var2--] * var4;
        }

        var9.field1416 = var4 >> 2;
        var9.field1423 = var2 << 8;
        return var3;
    }

    static int method2508(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6,
                          int var7, int var8, int var9, int var10, int var11, int var12,
                          class105 var13, int var14, int var15) {
        var13.field1416 -= var5 * var13.field1427;
        if (var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
            var10 = var11;
        }

        var5 <<= 1;

        byte var16;
        int var10001;
        for (var10 <<= 1; var5 < var10; var4 += var14) {
            var1 = var4 >> 8;
            var16 = var2[var1];
            var0 = (var16 << 8) + (var4 & 255) * (var2[var1 + 1] - var16);
            var10001 = var5++;
            var3[var10001] += var0 * var6 >> 6;
            var6 += var8;
            var10001 = var5++;
            var3[var10001] += var0 * var7 >> 6;
            var7 += var9;
        }

        if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
            var10 = var11;
        }

        var10 <<= 1;

        for (var1 = var15; var5 < var10; var4 += var14) {
            var16 = var2[var4 >> 8];
            var0 = (var16 << 8) + (var1 - var16) * (var4 & 255);
            var10001 = var5++;
            var3[var10001] += var0 * var6 >> 6;
            var6 += var8;
            var10001 = var5++;
            var3[var10001] += var0 * var7 >> 6;
            var7 += var9;
        }

        var5 >>= 1;
        var13.field1416 += var13.field1427 * var5;
        var13.field1420 = var6;
        var13.field1421 = var7;
        var13.field1423 = var4;
        return var5;
    }

    static int method2510(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6,
                          int var7, int var8, int var9, int var10, int var11, int var12,
                          class105 var13, int var14, int var15) {
        var13.field1416 -= var5 * var13.field1427;
        if (var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
            var10 = var11;
        }

        var5 <<= 1;

        int var10001;
        for (var10 <<= 1; var5 < var10; var4 += var14) {
            var1 = var4 >> 8;
            byte var16 = var2[var1 - 1];
            var0 = (var2[var1] - var16) * (var4 & 255) + (var16 << 8);
            var10001 = var5++;
            var3[var10001] += var0 * var6 >> 6;
            var6 += var8;
            var10001 = var5++;
            var3[var10001] += var0 * var7 >> 6;
            var7 += var9;
        }

        if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) {
            var10 = var11;
        }

        var10 <<= 1;

        for (var1 = var15; var5 < var10; var4 += var14) {
            var0 = (var1 << 8) + (var4 & 255) * (var2[var4 >> 8] - var1);
            var10001 = var5++;
            var3[var10001] += var0 * var6 >> 6;
            var6 += var8;
            var10001 = var5++;
            var3[var10001] += var0 * var7 >> 6;
            var7 += var9;
        }

        var5 >>= 1;
        var13.field1416 += var13.field1427 * var5;
        var13.field1420 = var6;
        var13.field1421 = var7;
        var13.field1423 = var4;
        return var5;
    }

    static int method2509(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6,
                          int var7, int var8, int var9, int var10, int var11, class105 var12) {
        var3 >>= 8;
        var11 >>= 8;
        var5 <<= 2;
        var6 <<= 2;
        var7 <<= 2;
        var8 <<= 2;
        if ((var9 = var11 + var4 - var3) > var10) {
            var9 = var10;
        }

        var12.field1416 += var12.field1427 * (var9 - var4);
        var4 <<= 1;
        var9 <<= 1;

        byte var13;
        int var10001;
        for (var9 -= 6; var4 < var9; var6 += var8) {
            var13 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
            var6 += var8;
            var13 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
            var6 += var8;
            var13 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
            var6 += var8;
            var13 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
        }

        for (var9 += 6; var4 < var9; var6 += var8) {
            var13 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
        }

        var12.field1420 = var5 >> 2;
        var12.field1421 = var6 >> 2;
        var12.field1423 = var3 << 8;
        return var4 >> 1;
    }

    static int method2607(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6,
                          int var7, int var8, int var9, int var10, int var11, class105 var12) {
        var3 >>= 8;
        var11 >>= 8;
        var5 <<= 2;
        var6 <<= 2;
        var7 <<= 2;
        var8 <<= 2;
        if ((var9 = var3 + var4 - (var11 - 1)) > var10) {
            var9 = var10;
        }

        var12.field1416 += var12.field1427 * (var9 - var4);
        var4 <<= 1;
        var9 <<= 1;

        byte var13;
        int var10001;
        for (var9 -= 6; var4 < var9; var6 += var8) {
            var13 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
            var6 += var8;
            var13 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
            var6 += var8;
            var13 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
            var6 += var8;
            var13 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
        }

        for (var9 += 6; var4 < var9; var6 += var8) {
            var13 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
        }

        var12.field1420 = var5 >> 2;
        var12.field1421 = var6 >> 2;
        var12.field1423 = var3 << 8;
        return var4 >> 1;
    }

    public static class105 method2469(class95 var0, int var1, int var2, int var3) {
        return var0.field1345 != null && var0.field1345.length != 0 ? new class105(var0, var1, var2,
                                                                                   var3) : null;
    }

    public static class105 method2479(class95 var0, int var1, int var2) {
        return var0.field1345 != null && var0.field1345.length != 0 ? new class105(var0, (int) (
            (long) var0.field1347 * 256L * (long) var1 / (long) (class97.field1377 * 100)),
                                                                                   var2 << 6)
            : null;
    }

    public synchronized int method2476() {
        return this.field1418 < 0 ? -1 : this.field1418;
    }

    synchronized void method2612(int var1, int var2) {
        this.field1417 = var1;
        this.field1418 = var2;
        this.field1426 = 0;
        this.method2470();
    }

    synchronized void method2473(int var1) {
        this.method2612(var1, this.method2476());
    }

    public synchronized void method2481(int var1, int var2, int var3) {
        if (var1 == 0) {
            this.method2612(var2, var3);
        } else {
            int var4 = method2585(var2, var3);
            int var5 = method2541(var2, var3);
            if (var4 == this.field1420 && var5 == this.field1421) {
                this.field1426 = 0;
            } else {
                int var6 = var2 - this.field1416;
                if (this.field1416 - var2 > var6) {
                    var6 = this.field1416 - var2;
                }

                if (var4 - this.field1420 > var6) {
                    var6 = var4 - this.field1420;
                }

                if (this.field1420 - var4 > var6) {
                    var6 = this.field1420 - var4;
                }

                if (var5 - this.field1421 > var6) {
                    var6 = var5 - this.field1421;
                }

                if (this.field1421 - var5 > var6) {
                    var6 = this.field1421 - var5;
                }

                if (var1 > var6) {
                    var1 = var6;
                }

                this.field1426 = var1;
                this.field1417 = var2;
                this.field1418 = var3;
                this.field1427 = (var2 - this.field1416) / var1;
                this.field1428 = (var4 - this.field1420) / var1;
                this.field1429 = (var5 - this.field1421) / var1;
            }
        }
    }

    public synchronized void vmethod4620(int[] var1, int var2, int var3) {
        if (this.field1417 == 0 && this.field1426 == 0) {
            this.vmethod4601(var3);
        } else {
            class95 var4 = (class95) super.field1442;
            int var5 = this.field1425 << 8;
            int var6 = this.field1424 << 8;
            int var7 = var4.field1345.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field1422 = 0;
            }

            int var9 = var2;
            var3 += var2;
            if (this.field1423 < 0) {
                if (this.field1415 <= 0) {
                    this.method2617();
                    this.unlink();
                    return;
                }

                this.field1423 = 0;
            }

            if (this.field1423 >= var7) {
                if (this.field1415 >= 0) {
                    this.method2617();
                    this.unlink();
                    return;
                }

                this.field1423 = var7 - 1;
            }

            if (this.field1422 < 0) {
                if (this.field1419) {
                    if (this.field1415 < 0) {
                        var9 = this
                            .method2493(var1, var2, var5, var3, var4.field1345[this.field1425]);
                        if (this.field1423 >= var5) {
                            return;
                        }

                        this.field1423 = var5 + var5 - 1 - this.field1423;
                        this.field1415 = -this.field1415;
                    }

                    while (true) {
                        var9 = this
                            .method2492(var1, var9, var6, var3, var4.field1345[this.field1424 - 1]);
                        if (this.field1423 < var6) {
                            return;
                        }

                        this.field1423 = var6 + var6 - 1 - this.field1423;
                        this.field1415 = -this.field1415;
                        var9 = this
                            .method2493(var1, var9, var5, var3, var4.field1345[this.field1425]);
                        if (this.field1423 >= var5) {
                            return;
                        }

                        this.field1423 = var5 + var5 - 1 - this.field1423;
                        this.field1415 = -this.field1415;
                    }
                } else if (this.field1415 < 0) {
                    while (true) {
                        var9 = this
                            .method2493(var1, var9, var5, var3, var4.field1345[this.field1424 - 1]);
                        if (this.field1423 >= var5) {
                            return;
                        }

                        this.field1423 = var6 - 1 - (var6 - 1 - this.field1423) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this
                            .method2492(var1, var9, var6, var3, var4.field1345[this.field1425]);
                        if (this.field1423 < var6) {
                            return;
                        }

                        this.field1423 = var5 + (this.field1423 - var5) % var8;
                    }
                }
            } else {
                if (this.field1422 > 0) {
                    if (this.field1419) {
                        label158:
                        {
                            if (this.field1415 < 0) {
                                var9 = this.method2493(var1, var2, var5, var3,
                                                       var4.field1345[this.field1425]);
                                if (this.field1423 >= var5) {
                                    return;
                                }

                                this.field1423 = var5 + var5 - 1 - this.field1423;
                                this.field1415 = -this.field1415;
                                if (--this.field1422 == 0) {
                                    break label158;
                                }
                            }

                            do {
                                var9 = this.method2492(var1, var9, var6, var3,
                                                       var4.field1345[this.field1424 - 1]);
                                if (this.field1423 < var6) {
                                    return;
                                }

                                this.field1423 = var6 + var6 - 1 - this.field1423;
                                this.field1415 = -this.field1415;
                                if (--this.field1422 == 0) {
                                    break;
                                }

                                var9 = this.method2493(var1, var9, var5, var3,
                                                       var4.field1345[this.field1425]);
                                if (this.field1423 >= var5) {
                                    return;
                                }

                                this.field1423 = var5 + var5 - 1 - this.field1423;
                                this.field1415 = -this.field1415;
                            } while (--this.field1422 != 0);
                        }
                    } else {
                        int var10;
                        if (this.field1415 < 0) {
                            while (true) {
                                var9 = this.method2493(var1, var9, var5, var3,
                                                       var4.field1345[this.field1424 - 1]);
                                if (this.field1423 >= var5) {
                                    return;
                                }

                                var10 = (var6 - 1 - this.field1423) / var8;
                                if (var10 >= this.field1422) {
                                    this.field1423 += var8 * this.field1422;
                                    this.field1422 = 0;
                                    break;
                                }

                                this.field1423 += var8 * var10;
                                this.field1422 -= var10;
                            }
                        } else {
                            while (true) {
                                var9 = this.method2492(var1, var9, var6, var3,
                                                       var4.field1345[this.field1425]);
                                if (this.field1423 < var6) {
                                    return;
                                }

                                var10 = (this.field1423 - var5) / var8;
                                if (var10 >= this.field1422) {
                                    this.field1423 -= var8 * this.field1422;
                                    this.field1422 = 0;
                                    break;
                                }

                                this.field1423 -= var8 * var10;
                                this.field1422 -= var10;
                            }
                        }
                    }
                }

                if (this.field1415 < 0) {
                    this.method2493(var1, var9, 0, var3, 0);
                    if (this.field1423 < 0) {
                        this.field1423 = -1;
                        this.method2617();
                        this.unlink();
                    }
                } else {
                    this.method2492(var1, var9, var7, var3, 0);
                    if (this.field1423 >= var7) {
                        this.field1423 = var7;
                        this.method2617();
                        this.unlink();
                    }
                }

            }
        }
    }

    public synchronized void vmethod4601(int var1) {
        if (this.field1426 > 0) {
            if (var1 >= this.field1426) {
                if (this.field1417 == Integer.MIN_VALUE) {
                    this.field1417 = 0;
                    this.field1421 = 0;
                    this.field1420 = 0;
                    this.field1416 = 0;
                    this.unlink();
                    var1 = this.field1426;
                }

                this.field1426 = 0;
                this.method2470();
            } else {
                this.field1416 += this.field1427 * var1;
                this.field1420 += this.field1428 * var1;
                this.field1421 += this.field1429 * var1;
                this.field1426 -= var1;
            }
        }

        class95 var2 = (class95) super.field1442;
        int var3 = this.field1425 << 8;
        int var4 = this.field1424 << 8;
        int var5 = var2.field1345.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1422 = 0;
        }

        if (this.field1423 < 0) {
            if (this.field1415 <= 0) {
                this.method2617();
                this.unlink();
                return;
            }

            this.field1423 = 0;
        }

        if (this.field1423 >= var5) {
            if (this.field1415 >= 0) {
                this.method2617();
                this.unlink();
                return;
            }

            this.field1423 = var5 - 1;
        }

        this.field1423 += this.field1415 * var1;
        if (this.field1422 < 0) {
            if (!this.field1419) {
                if (this.field1415 < 0) {
                    if (this.field1423 >= var3) {
                        return;
                    }

                    this.field1423 = var4 - 1 - (var4 - 1 - this.field1423) % var6;
                } else {
                    if (this.field1423 < var4) {
                        return;
                    }

                    this.field1423 = var3 + (this.field1423 - var3) % var6;
                }

            } else {
                if (this.field1415 < 0) {
                    if (this.field1423 >= var3) {
                        return;
                    }

                    this.field1423 = var3 + var3 - 1 - this.field1423;
                    this.field1415 = -this.field1415;
                }

                while (this.field1423 >= var4) {
                    this.field1423 = var4 + var4 - 1 - this.field1423;
                    this.field1415 = -this.field1415;
                    if (this.field1423 >= var3) {
                        return;
                    }

                    this.field1423 = var3 + var3 - 1 - this.field1423;
                    this.field1415 = -this.field1415;
                }

            }
        } else {
            if (this.field1422 > 0) {
                if (this.field1419) {
                    label136:
                    {
                        if (this.field1415 < 0) {
                            if (this.field1423 >= var3) {
                                return;
                            }

                            this.field1423 = var3 + var3 - 1 - this.field1423;
                            this.field1415 = -this.field1415;
                            if (--this.field1422 == 0) {
                                break label136;
                            }
                        }

                        do {
                            if (this.field1423 < var4) {
                                return;
                            }

                            this.field1423 = var4 + var4 - 1 - this.field1423;
                            this.field1415 = -this.field1415;
                            if (--this.field1422 == 0) {
                                break;
                            }

                            if (this.field1423 >= var3) {
                                return;
                            }

                            this.field1423 = var3 + var3 - 1 - this.field1423;
                            this.field1415 = -this.field1415;
                        } while (--this.field1422 != 0);
                    }
                } else {
                    label168:
                    {
                        int var7;
                        if (this.field1415 < 0) {
                            if (this.field1423 >= var3) {
                                return;
                            }

                            var7 = (var4 - 1 - this.field1423) / var6;
                            if (var7 >= this.field1422) {
                                this.field1423 += var6 * this.field1422;
                                this.field1422 = 0;
                                break label168;
                            }

                            this.field1423 += var6 * var7;
                            this.field1422 -= var7;
                        } else {
                            if (this.field1423 < var4) {
                                return;
                            }

                            var7 = (this.field1423 - var3) / var6;
                            if (var7 >= this.field1422) {
                                this.field1423 -= var6 * this.field1422;
                                this.field1422 = 0;
                                break label168;
                            }

                            this.field1423 -= var6 * var7;
                            this.field1422 -= var7;
                        }

                        return;
                    }
                }
            }

            if (this.field1415 < 0) {
                if (this.field1423 < 0) {
                    this.field1423 = -1;
                    this.method2617();
                    this.unlink();
                }
            } else if (this.field1423 >= var5) {
                this.field1423 = var5;
                this.method2617();
                this.unlink();
            }

        }
    }

    void method2470() {
        this.field1416 = this.field1417;
        this.field1420 = method2585(this.field1417, this.field1418);
        this.field1421 = method2541(this.field1417, this.field1418);
    }

    public synchronized void method2477(int var1) {
        int var2 = ((class95) super.field1442).field1345.length << 8;
        if (var1 < -1) {
            var1 = -1;
        }

        if (var1 > var2) {
            var1 = var2;
        }

        this.field1423 = var1;
    }

    protected class107 vmethod4598() {
        return null;
    }

    public boolean method2485() {
        return this.field1423 < 0
            || this.field1423 >= ((class95) super.field1442).field1345.length << 8;
    }

    public synchronized void method2480(int var1) {
        if (this.field1415 < 0) {
            this.field1415 = -var1;
        } else {
            this.field1415 = var1;
        }

    }

    public synchronized void method2482(int var1) {
        if (var1 == 0) {
            this.method2473(0);
            this.unlink();
        } else if (this.field1420 == 0 && this.field1421 == 0) {
            this.field1426 = 0;
            this.field1417 = 0;
            this.field1416 = 0;
            this.unlink();
        } else {
            int var2 = -this.field1416;
            if (this.field1416 > var2) {
                var2 = this.field1416;
            }

            if (-this.field1420 > var2) {
                var2 = -this.field1420;
            }

            if (this.field1420 > var2) {
                var2 = this.field1420;
            }

            if (-this.field1421 > var2) {
                var2 = -this.field1421;
            }

            if (this.field1421 > var2) {
                var2 = this.field1421;
            }

            if (var1 > var2) {
                var1 = var2;
            }

            this.field1426 = var1;
            this.field1417 = Integer.MIN_VALUE;
            this.field1427 = -this.field1416 / var1;
            this.field1428 = -this.field1420 / var1;
            this.field1429 = -this.field1421 / var1;
        }
    }

    void method2617() {
        if (this.field1426 != 0) {
            if (this.field1417 == Integer.MIN_VALUE) {
                this.field1417 = 0;
            }

            this.field1426 = 0;
            this.method2470();
        }

    }

    public boolean method2486() {
        return this.field1426 != 0;
    }

    public synchronized void method2478(boolean var1) {
        this.field1415 = (this.field1415 ^ this.field1415 >> 31) + (this.field1415 >>> 31);
        this.field1415 = -this.field1415;
    }

    protected class107 vmethod4596() {
        return null;
    }

    int vmethod2661() {
        int var1 = this.field1416 * 3 >> 6;
        var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
        if (this.field1422 == 0) {
            var1 -= var1 * this.field1423 / (((class95) super.field1442).field1345.length << 8);
        } else if (this.field1422 >= 0) {
            var1 -= var1 * this.field1425 / ((class95) super.field1442).field1345.length;
        }

        return var1 > 255 ? 255 : var1;
    }

    public synchronized int method2466() {
        return this.field1415 < 0 ? -this.field1415 : this.field1415;
    }

    boolean method2494() {
        int var1 = this.field1417;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var3 = 0;
            var2 = 0;
            var1 = 0;
        } else {
            var2 = method2585(var1, this.field1418);
            var3 = method2541(var1, this.field1418);
        }

        if (var1 == this.field1416 && var2 == this.field1420 && var3 == this.field1421) {
            if (this.field1417 == Integer.MIN_VALUE) {
                this.field1417 = 0;
                this.field1421 = 0;
                this.field1420 = 0;
                this.field1416 = 0;
                this.unlink();
                return true;
            } else {
                this.method2470();
                return false;
            }
        } else {
            if (this.field1416 < var1) {
                this.field1427 = 1;
                this.field1426 = var1 - this.field1416;
            } else if (this.field1416 > var1) {
                this.field1427 = -1;
                this.field1426 = this.field1416 - var1;
            } else {
                this.field1427 = 0;
            }

            if (this.field1420 < var2) {
                this.field1428 = 1;
                if (this.field1426 == 0 || this.field1426 > var2 - this.field1420) {
                    this.field1426 = var2 - this.field1420;
                }
            } else if (this.field1420 > var2) {
                this.field1428 = -1;
                if (this.field1426 == 0 || this.field1426 > this.field1420 - var2) {
                    this.field1426 = this.field1420 - var2;
                }
            } else {
                this.field1428 = 0;
            }

            if (this.field1421 < var3) {
                this.field1429 = 1;
                if (this.field1426 == 0 || this.field1426 > var3 - this.field1421) {
                    this.field1426 = var3 - this.field1421;
                }
            } else if (this.field1421 > var3) {
                this.field1429 = -1;
                if (this.field1426 == 0 || this.field1426 > this.field1421 - var3) {
                    this.field1426 = this.field1421 - var3;
                }
            } else {
                this.field1429 = 0;
            }

            return false;
        }
    }

    int method2493(int[] var1, int var2, int var3, int var4, int var5) {
        while (true) {
            if (this.field1426 > 0) {
                int var6 = var2 + this.field1426;
                if (var6 > var4) {
                    var6 = var4;
                }

                this.field1426 += var2;
                if (this.field1415 == -256 && (this.field1423 & 255) == 0) {
                    if (class26.field264) {
                        var2 = method2607(0, ((class95) super.field1442).field1345, var1,
                                          this.field1423, var2, this.field1420, this.field1421,
                                          this.field1428, this.field1429, 0, var6, var3, this);
                    } else {
                        var2 = method2558(((class95) super.field1442).field1345, var1,
                                          this.field1423, var2, this.field1416, this.field1427, 0,
                                          var6, var3, this);
                    }
                } else if (class26.field264) {
                    var2 = method2510(0, 0, ((class95) super.field1442).field1345, var1,
                                      this.field1423, var2, this.field1420, this.field1421,
                                      this.field1428, this.field1429, 0, var6, var3, this,
                                      this.field1415, var5);
                } else {
                    var2 = method2561(0, 0, ((class95) super.field1442).field1345, var1,
                                      this.field1423, var2, this.field1416, this.field1427, 0, var6,
                                      var3, this, this.field1415, var5);
                }

                this.field1426 -= var2;
                if (this.field1426 != 0) {
                    return var2;
                }

                if (!this.method2494()) {
                    continue;
                }

                return var4;
            }

            if (this.field1415 == -256 && (this.field1423 & 255) == 0) {
                if (class26.field264) {
                    return method2498(0, ((class95) super.field1442).field1345, var1,
                                      this.field1423, var2, this.field1420, this.field1421, 0, var4,
                                      var3, this);
                }

                return method2497(((class95) super.field1442).field1345, var1, this.field1423, var2,
                                  this.field1416, 0, var4, var3, this);
            }

            if (class26.field264) {
                return method2525(0, 0, ((class95) super.field1442).field1345, var1, this.field1423,
                                  var2, this.field1420, this.field1421, 0, var4, var3, this,
                                  this.field1415, var5);
            }

            return method2501(0, 0, ((class95) super.field1442).field1345, var1, this.field1423,
                              var2, this.field1416, 0, var4, var3, this, this.field1415, var5);
        }
    }

    int method2492(int[] var1, int var2, int var3, int var4, int var5) {
        while (true) {
            if (this.field1426 > 0) {
                int var6 = var2 + this.field1426;
                if (var6 > var4) {
                    var6 = var4;
                }

                this.field1426 += var2;
                if (this.field1415 == 256 && (this.field1423 & 255) == 0) {
                    if (class26.field264) {
                        var2 = method2509(0, ((class95) super.field1442).field1345, var1,
                                          this.field1423, var2, this.field1420, this.field1421,
                                          this.field1428, this.field1429, 0, var6, var3, this);
                    } else {
                        var2 = method2503(((class95) super.field1442).field1345, var1,
                                          this.field1423, var2, this.field1416, this.field1427, 0,
                                          var6, var3, this);
                    }
                } else if (class26.field264) {
                    var2 = method2508(0, 0, ((class95) super.field1442).field1345, var1,
                                      this.field1423, var2, this.field1420, this.field1421,
                                      this.field1428, this.field1429, 0, var6, var3, this,
                                      this.field1415, var5);
                } else {
                    var2 = method2507(0, 0, ((class95) super.field1442).field1345, var1,
                                      this.field1423, var2, this.field1416, this.field1427, 0, var6,
                                      var3, this, this.field1415, var5);
                }

                this.field1426 -= var2;
                if (this.field1426 != 0) {
                    return var2;
                }

                if (!this.method2494()) {
                    continue;
                }

                return var4;
            }

            if (this.field1415 == 256 && (this.field1423 & 255) == 0) {
                if (class26.field264) {
                    return method2496(0, ((class95) super.field1442).field1345, var1,
                                      this.field1423, var2, this.field1420, this.field1421, 0, var4,
                                      var3, this);
                }

                return method2504(((class95) super.field1442).field1345, var1, this.field1423, var2,
                                  this.field1416, 0, var4, var3, this);
            }

            if (class26.field264) {
                return method2570(0, 0, ((class95) super.field1442).field1345, var1, this.field1423,
                                  var2, this.field1420, this.field1421, 0, var4, var3, this,
                                  this.field1415, var5);
            }

            return method2499(0, 0, ((class95) super.field1442).field1345, var1, this.field1423,
                              var2, this.field1416, 0, var4, var3, this, this.field1415, var5);
        }
    }

    public synchronized int method2475() {
        return this.field1417 == Integer.MIN_VALUE ? 0 : this.field1417;
    }

    public synchronized void method2471(int var1) {
        this.field1422 = var1;
    }

    protected int vmethod4609() {
        return this.field1417 == 0 && this.field1426 == 0 ? 0 : 1;
    }

    public synchronized void method2572(int var1, int var2) {
        this.method2481(var1, var2, this.method2476());
    }

    public synchronized void method2472(int var1) {
        this.method2612(var1 << 6, this.method2476());
    }
}
