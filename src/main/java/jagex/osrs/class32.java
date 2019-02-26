package jagex.osrs;

public class class32 {

    static int[] field322;
    int field317;
    int field320;
    int[][] field315;
    int[][] field316;
    int[][] field318;
    int[][] field319;

    class32(int var1, int var2) {
        this.field317 = var1;
        this.field320 = var2;
        this.field315 = new int[var1][var2];
        this.field318 = new int[var1][var2];
        this.field316 = new int[var1][var2];
        this.field319 = new int[var1][var2];
    }

    static int method606(int var0, int var1) {
        class59 var2 = (class59) class85.field1249.method4185((long) var0);
        return var2 == null ? -1 : (var2.field2500 == class85.field1247.field2518 ? -1
            : ((class59) var2.field2500).field595);
    }

    int method600(int var1, int var2, int var3) {
        if (var1 >= 0 && var2 >= 0 && var1 < this.field317 && var2 < this.field320) {
            if (this.field316[var1][var2] == 0) {
                return 0;
            } else {
                int var4 = this.field315[var1][var2] / this.field319[var1][var2];
                int var5 = this.field318[var1][var2] / this.field319[var1][var2];
                int var6 = this.field316[var1][var2] / this.field319[var1][var2];
                return class6.method79((double) var4 / 256.0D, (double) var5 / 256.0D,
                                       (double) var6 / 256.0D);
            }
        } else {
            return 0;
        }
    }

    void method602(int var1, int var2, int var3, class261 var4, byte var5) {
        if (var4 != null) {
            if (var3 + var1 >= 0 && var3 + var2 >= 0) {
                if (var1 - var3 <= this.field317 && var2 - var3 <= this.field320) {
                    int var6 = Math.max(0, var1 - var3);
                    int var7 = Math.min(this.field317, var3 + var1);
                    int var8 = Math.max(0, var2 - var3);
                    int var9 = Math.min(this.field320, var3 + var2);

                    for (int var10 = var6; var10 < var7; ++var10) {
                        for (int var11 = var8; var11 < var9; ++var11) {
                            this.field315[var10][var11] += var4.field3361 * 256 / var4.field3360;
                            this.field318[var10][var11] += var4.field3364;
                            this.field316[var10][var11] += var4.field3363;
                            ++this.field319[var10][var11];
                        }
                    }

                }
            }
        }
    }
}
