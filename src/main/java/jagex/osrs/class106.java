package jagex.osrs;

public class class106 {

    static float[][] field1435;
    static int[][] field1437;
    static float field1434;
    static int field1438;

    static {
        field1435 = new float[2][8];
        field1437 = new int[2][8];
    }

    int[][][] field1436;
    int[][][] field1440;
    int[] field1432;
    int[] field1433;

    class106() {
        this.field1433 = new int[2];
        this.field1440 = new int[2][2][4];
        this.field1436 = new int[2][2][4];
        this.field1432 = new int[2];
    }

    static float method2647(float var0) {
        float var1 = 32.703197F * (float) Math.pow(2.0D, (double) var0);
        return var1 * 3.1415927F / 11025.0F;
    }

    float method2632(int var1, int var2, float var3) {
        float var4 =
            (float) this.field1436[var1][0][var2] + var3 * (float) (this.field1436[var1][1][var2]
                - this.field1436[var1][0][var2]);
        var4 *= 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var4 / 20.0F));
    }

    float method2634(int var1, int var2, float var3) {
        float var4 =
            (float) this.field1440[var1][0][var2] + var3 * (float) (this.field1440[var1][1][var2]
                - this.field1440[var1][0][var2]);
        var4 *= 1.2207031E-4F;
        return method2647(var4);
    }

    int method2648(int var1, float var2) {
        float var3;
        if (var1 == 0) {
            var3 =
                (float) this.field1432[0] + (float) (this.field1432[1] - this.field1432[0]) * var2;
            var3 *= 0.0030517578F;
            field1434 = (float) Math.pow(0.1D, (double) (var3 / 20.0F));
            field1438 = (int) (field1434 * 65536.0F);
        }

        if (this.field1433[var1] == 0) {
            return 0;
        } else {
            var3 = this.method2632(var1, 0, var2);
            field1435[var1][0] =
                -2.0F * var3 * (float) Math.cos((double) this.method2634(var1, 0, var2));
            field1435[var1][1] = var3 * var3;

            int var4;
            for (var4 = 1; var4 < this.field1433[var1]; ++var4) {
                var3 = this.method2632(var1, var4, var2);
                float var5 =
                    -2.0F * var3 * (float) Math.cos((double) this.method2634(var1, var4, var2));
                float var6 = var3 * var3;
                field1435[var1][var4 * 2 + 1] = field1435[var1][var4 * 2 - 1] * var6;
                field1435[var1][var4 * 2] =
                    field1435[var1][var4 * 2 - 1] * var5 + field1435[var1][var4 * 2 - 2] * var6;

                for (int var7 = var4 * 2 - 1; var7 >= 2; --var7) {
                    field1435[var1][var7] +=
                        field1435[var1][var7 - 1] * var5 + field1435[var1][var7 - 2] * var6;
                }

                field1435[var1][1] += field1435[var1][0] * var5 + var6;
                field1435[var1][0] += var5;
            }

            if (var1 == 0) {
                for (var4 = 0; var4 < this.field1433[0] * 2; ++var4) {
                    field1435[0][var4] *= field1434;
                }
            }

            for (var4 = 0; var4 < this.field1433[var1] * 2; ++var4) {
                field1437[var1][var4] = (int) (field1435[var1][var4] * 65536.0F);
            }

            return this.field1433[var1] * 2;
        }
    }

    final void method2636(Buffer var1, class98 var2) {
        int var3 = var1.readUint8();
        this.field1433[0] = var3 >> 4;
        this.field1433[1] = var3 & 15;
        if (var3 != 0) {
            this.field1432[0] = var1.readUint16();
            this.field1432[1] = var1.readUint16();
            int var4 = var1.readUint8();

            int var5;
            int var6;
            for (var5 = 0; var5 < 2; ++var5) {
                for (var6 = 0; var6 < this.field1433[var5]; ++var6) {
                    this.field1440[var5][0][var6] = var1.readUint16();
                    this.field1436[var5][0][var6] = var1.readUint16();
                }
            }

            for (var5 = 0; var5 < 2; ++var5) {
                for (var6 = 0; var6 < this.field1433[var5]; ++var6) {
                    if ((var4 & 1 << var5 * 4 << var6) != 0) {
                        this.field1440[var5][1][var6] = var1.readUint16();
                        this.field1436[var5][1][var6] = var1.readUint16();
                    } else {
                        this.field1440[var5][1][var6] = this.field1440[var5][0][var6];
                        this.field1436[var5][1][var6] = this.field1436[var5][0][var6];
                    }
                }
            }

            if (var4 != 0 || this.field1432[1] != this.field1432[0]) {
                var2.method2408(var1);
            }
        } else {
            int[] var7 = this.field1432;
            this.field1432[1] = 0;
            var7[0] = 0;
        }

    }
}
