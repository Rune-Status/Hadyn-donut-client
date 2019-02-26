package jagex.osrs;

public final class IssacRandom {

    static byte[][] field2458;
    static class251 index11;
    int field2451;
    int field2455;
    int field2449;
    int[] field2453;
    int[] field2457;
    int field2454;

    public IssacRandom(int[] var1) {
        this.field2453 = new int[256];
        this.field2457 = new int[256];

        for (int var2 = 0; var2 < var1.length; ++var2) {
            this.field2457[var2] = var1[var2];
        }

        this.method4088(818623933);
    }

    public static String method4091(byte[] var0, int var1, int var2, int var3) {
        char[] var4 = new char[var2];
        int var5 = 0;

        for (int var6 = 0; var6 < var2; ++var6) {
            int var7 = var0[var6 + var1] & 255;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class303.field3785[var7 - 128];
                    if (var8 == 0) {
                        var8 = '?';
                    }

                    var7 = var8;
                }

                var4[var5++] = (char) var7;
            }
        }

        return new String(var4, 0, var5);
    }

    final void method4087(int var1) {
        this.field2455 += ++this.field2449;

        for (int var2 = 0; var2 < 256; ++var2) {
            int var3 = this.field2453[var2];
            if ((var2 & 2) == 0) {
                if ((var2 & 1) == 0) {
                    this.field2454 ^= this.field2454 << 13;
                } else {
                    this.field2454 ^= this.field2454 >>> 6;
                }
            } else if ((var2 & 1) == 0) {
                this.field2454 ^= this.field2454 << 2;
            } else {
                this.field2454 ^= this.field2454 >>> 16;
            }

            this.field2454 += this.field2453[var2 + 128 & 255];
            int var4;
            this.field2453[var2] = var4 =
                this.field2453[(var3 & 1020) >> 2] + this.field2454 + this.field2455;
            this.field2457[var2] = this.field2455 = this.field2453[(var4 >> 8 & 1020) >> 2] + var3;
        }

    }

    final int method4084(byte var1) {
        if (this.field2451 == 0) {
            this.method4087(-1984089559);
            this.field2451 = 256;
        }

        return this.field2457[this.field2451 - 1];
    }

    final void method4088(int var1) {
        int var10 = -1640531527;
        int var9 = -1640531527;
        int var8 = -1640531527;
        int var7 = -1640531527;
        int var6 = -1640531527;
        int var5 = -1640531527;
        int var4 = -1640531527;
        int var3 = -1640531527;

        int var2;
        for (var2 = 0; var2 < 4; ++var2) {
            var3 ^= var4 << 11;
            var6 += var3;
            var4 += var5;
            var4 ^= var5 >>> 2;
            var7 += var4;
            var5 += var6;
            var5 ^= var6 << 8;
            var8 += var5;
            var6 += var7;
            var6 ^= var7 >>> 16;
            var9 += var6;
            var7 += var8;
            var7 ^= var8 << 10;
            var10 += var7;
            var8 += var9;
            var8 ^= var9 >>> 4;
            var3 += var8;
            var9 += var10;
            var9 ^= var10 << 8;
            var4 += var9;
            var10 += var3;
            var10 ^= var3 >>> 9;
            var5 += var10;
            var3 += var4;
        }

        for (var2 = 0; var2 < 256; var2 += 8) {
            var3 += this.field2457[var2];
            var4 += this.field2457[var2 + 1];
            var5 += this.field2457[var2 + 2];
            var6 += this.field2457[var2 + 3];
            var7 += this.field2457[var2 + 4];
            var8 += this.field2457[var2 + 5];
            var9 += this.field2457[var2 + 6];
            var10 += this.field2457[var2 + 7];
            var3 ^= var4 << 11;
            var6 += var3;
            var4 += var5;
            var4 ^= var5 >>> 2;
            var7 += var4;
            var5 += var6;
            var5 ^= var6 << 8;
            var8 += var5;
            var6 += var7;
            var6 ^= var7 >>> 16;
            var9 += var6;
            var7 += var8;
            var7 ^= var8 << 10;
            var10 += var7;
            var8 += var9;
            var8 ^= var9 >>> 4;
            var3 += var8;
            var9 += var10;
            var9 ^= var10 << 8;
            var4 += var9;
            var10 += var3;
            var10 ^= var3 >>> 9;
            var5 += var10;
            var3 += var4;
            this.field2453[var2] = var3;
            this.field2453[var2 + 1] = var4;
            this.field2453[var2 + 2] = var5;
            this.field2453[var2 + 3] = var6;
            this.field2453[var2 + 4] = var7;
            this.field2453[var2 + 5] = var8;
            this.field2453[var2 + 6] = var9;
            this.field2453[var2 + 7] = var10;
        }

        for (var2 = 0; var2 < 256; var2 += 8) {
            var3 += this.field2453[var2];
            var4 += this.field2453[var2 + 1];
            var5 += this.field2453[var2 + 2];
            var6 += this.field2453[var2 + 3];
            var7 += this.field2453[var2 + 4];
            var8 += this.field2453[var2 + 5];
            var9 += this.field2453[var2 + 6];
            var10 += this.field2453[var2 + 7];
            var3 ^= var4 << 11;
            var6 += var3;
            var4 += var5;
            var4 ^= var5 >>> 2;
            var7 += var4;
            var5 += var6;
            var5 ^= var6 << 8;
            var8 += var5;
            var6 += var7;
            var6 ^= var7 >>> 16;
            var9 += var6;
            var7 += var8;
            var7 ^= var8 << 10;
            var10 += var7;
            var8 += var9;
            var8 ^= var9 >>> 4;
            var3 += var8;
            var9 += var10;
            var9 ^= var10 << 8;
            var4 += var9;
            var10 += var3;
            var10 ^= var3 >>> 9;
            var5 += var10;
            var3 += var4;
            this.field2453[var2] = var3;
            this.field2453[var2 + 1] = var4;
            this.field2453[var2 + 2] = var5;
            this.field2453[var2 + 3] = var6;
            this.field2453[var2 + 4] = var7;
            this.field2453[var2 + 5] = var8;
            this.field2453[var2 + 6] = var9;
            this.field2453[var2 + 7] = var10;
        }

        this.method4087(-1984089559);
        this.field2451 = 256;
    }

    final int next() {
        if (0 == --this.field2451 + 1) {
            this.method4087(-1984089559);
            this.field2451 = 255;
        }

        return this.field2457[this.field2451];
    }
}
