package jagex.osrs;

public class class152 extends class162 {

    static class36 field1985;
    static int field1983;
    int field1977;
    long[] field1976;
    int field1984;
    int field1981;
    long field1979;
    int field1978;

    class152() {
        this.field1976 = new long[10];
        this.field1977 = 256;
        this.field1984 = 1;
        this.field1981 = 0;
        this.field1979 = class120.method2866((short) 3133);

        for (int var1 = 0; var1 < 10; ++var1) {
            this.field1976[var1] = this.field1979;
        }

    }

    static final int method3394(int var0, int var1, int var2, byte var3) {
        int var4 = var0 >> 7;
        int var5 = var1 >> 7;
        if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
            int var6 = var2;
            if (var2 < 3 && (class50.field492[1][var4][var5] & 2) == 2) {
                var6 = var2 + 1;
            }

            int var7 = var0 & 127;
            int var8 = var1 & 127;
            int var9 = (128 - var7) * class50.field506[var6][var4][var5]
                + class50.field506[var6][var4 + 1][var5] * var7 >> 7;
            int var10 = var7 * class50.field506[var6][var4 + 1][var5 + 1]
                + class50.field506[var6][var4][var5 + 1] * (128 - var7) >> 7;
            return var10 * var8 + var9 * (128 - var8) >> 7;
        } else {
            return 0;
        }
    }

    public int vmethod3535(int var1, int var2, int var3) {
        int var4 = this.field1977;
        int var5 = this.field1984;
        this.field1977 = 300;
        this.field1984 = 1;
        this.field1979 = class120.method2866((short) 3133);
        if (this.field1976[this.field1978] == 0L) {
            this.field1977 = var4;
            this.field1984 = var5;
        } else if (this.field1979 > this.field1976[this.field1978]) {
            this.field1977 = (int) ((long) (var1 * 2560) / (this.field1979
                - this.field1976[this.field1978]));
        }

        if (this.field1977 < 25) {
            this.field1977 = 25;
        }

        if (this.field1977 > 256) {
            this.field1977 = 256;
            this.field1984 = (int) ((long) var1
                - (this.field1979 - this.field1976[this.field1978]) / 10L);
        }

        if (this.field1984 > var1) {
            this.field1984 = var1;
        }

        this.field1976[this.field1978] = this.field1979;
        this.field1978 = (this.field1978 + 1) % 10;
        int var6;
        if (this.field1984 > 1) {
            for (var6 = 0; var6 < 10; ++var6) {
                if (0L != this.field1976[var6]) {
                    this.field1976[var6] += (long) this.field1984;
                }
            }
        }

        if (this.field1984 < var2) {
            this.field1984 = var2;
        }

        class272.method5390((long) this.field1984);

        for (var6 = 0; this.field1981 < 256; this.field1981 += this.field1977) {
            ++var6;
        }

        this.field1981 &= 255;
        return var6;
    }

    public void vmethod3534(int var1) {
        for (int var2 = 0; var2 < 10; ++var2) {
            this.field1976[var2] = 0L;
        }

    }
}
