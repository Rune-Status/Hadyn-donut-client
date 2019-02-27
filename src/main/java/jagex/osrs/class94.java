package jagex.osrs;

public class class94 extends Node {

    static boolean field1322;
    static byte[] field1326;
    static int field1331;
    static int field1318;
    static class92[] field1321;
    static int field1320;
    static int[] field1324;
    static int field1338;
    static float[] field1332;
    static boolean[] field1336;
    static class108[] field1327;
    static float[] field1316;
    static float[] field1333;
    static float[] field1334;
    static float[] field1337;
    static float[] field1335;
    static float[] field1325;
    static class96[] field1339;
    static int[] field1310;
    static int[] field1340;
    static class103[] field1323;

    static {
        field1322 = false;
    }

    byte[][] field1319;
    byte[] field1341;
    int field1329;
    int field1343;
    int field1311;
    float[] field1328;
    int field1312;
    int field1342;
    int field1313;
    int field1314;
    boolean field1317;
    boolean field1315;
    int field1330;

    class94(byte[] var1) {
        this.method2285(var1);
    }

    static int method2302() {
        int var0 = field1326[field1331] >> field1318 & 1;
        ++field1318;
        field1331 += field1318 >> 3;
        field1318 &= 7;
        return var0;
    }

    static int method2287(int var0) {
        int var1 = 0;

        int var2;
        int var3;
        for (var2 = 0; var0 >= 8 - field1318; var0 -= var3) {
            var3 = 8 - field1318;
            int var4 = (1 << var3) - 1;
            var1 += (field1326[field1331] >> field1318 & var4) << var2;
            field1318 = 0;
            ++field1331;
            var2 += var3;
        }

        if (var0 > 0) {
            var3 = (1 << var0) - 1;
            var1 += (field1326[field1331] >> field1318 & var3) << var2;
            field1318 += var0;
        }

        return var1;
    }

    static void method2300(byte[] var0, int var1) {
        field1326 = var0;
        field1331 = var1;
        field1318 = 0;
    }

    static boolean method2298(class249 var0) {
        if (!field1322) {
            byte[] var1 = var0.method4831(0, 0, 1789634852);
            if (var1 == null) {
                return false;
            }

            method2291(var1);
            field1322 = true;
        }

        return true;
    }

    static class94 method2292(class249 var0, int var1, int var2) {
        if (!method2298(var0)) {
            var0.method4830(var1, var2, (byte) -25);
            return null;
        } else {
            byte[] var3 = var0.method4831(var1, var2, 1789634852);
            return var3 == null ? null : new class94(var3);
        }
    }

    static void method2291(byte[] var0) {
        method2300(var0, 0);
        field1338 = 1 << method2287(4);
        field1320 = 1 << method2287(4);
        field1332 = new float[field1320];

        int var1;
        int var2;
        int var3;
        int var4;
        int var5;
        for (var1 = 0; var1 < 2; ++var1) {
            var2 = var1 != 0 ? field1320 : field1338;
            var3 = var2 >> 1;
            var4 = var2 >> 2;
            var5 = var2 >> 3;
            float[] var6 = new float[var3];

            for (int var7 = 0; var7 < var4; ++var7) {
                var6[var7 * 2] = (float) Math
                    .cos((double) (var7 * 4) * 3.141592653589793D / (double) var2);
                var6[var7 * 2 + 1] = -((float) Math
                    .sin((double) (var7 * 4) * 3.141592653589793D / (double) var2));
            }

            float[] var18 = new float[var3];

            for (int var8 = 0; var8 < var4; ++var8) {
                var18[var8 * 2] = (float) Math
                    .cos((double) (var8 * 2 + 1) * 3.141592653589793D / (double) (var2 * 2));
                var18[var8 * 2 + 1] = (float) Math
                    .sin((double) (var8 * 2 + 1) * 3.141592653589793D / (double) (var2 * 2));
            }

            float[] var19 = new float[var4];

            for (int var9 = 0; var9 < var5; ++var9) {
                var19[var9 * 2] = (float) Math
                    .cos((double) (var9 * 4 + 2) * 3.141592653589793D / (double) var2);
                var19[var9 * 2 + 1] = -((float) Math
                    .sin((double) (var9 * 4 + 2) * 3.141592653589793D / (double) var2));
            }

            int[] var20 = new int[var5];
            int var10 = class16.method206(var5 - 1, 2138205798);

            for (int var11 = 0; var11 < var5; ++var11) {
                int var15 = var11;
                int var16 = var10;

                int var17;
                for (var17 = 0; var16 > 0; --var16) {
                    var17 = var17 << 1 | var15 & 1;
                    var15 >>>= 1;
                }

                var20[var11] = var17;
            }

            if (var1 != 0) {
                field1316 = var6;
                field1337 = var18;
                field1325 = var19;
                field1340 = var20;
            } else {
                field1333 = var6;
                field1334 = var18;
                field1335 = var19;
                field1310 = var20;
            }
        }

        var1 = method2287(8) + 1;
        field1321 = new class92[var1];

        for (var2 = 0; var2 < var1; ++var2) {
            field1321[var2] = new class92();
        }

        var2 = method2287(6) + 1;

        for (var3 = 0; var3 < var2; ++var3) {
            method2287(16);
        }

        var2 = method2287(6) + 1;
        field1339 = new class96[var2];

        for (var3 = 0; var3 < var2; ++var3) {
            field1339[var3] = new class96();
        }

        var3 = method2287(6) + 1;
        field1323 = new class103[var3];

        for (var4 = 0; var4 < var3; ++var4) {
            field1323[var4] = new class103();
        }

        var4 = method2287(6) + 1;
        field1327 = new class108[var4];

        for (var5 = 0; var5 < var4; ++var5) {
            field1327[var5] = new class108();
        }

        var5 = method2287(6) + 1;
        field1336 = new boolean[var5];
        field1324 = new int[var5];

        for (int var21 = 0; var21 < var5; ++var21) {
            field1336[var21] = method2302() != 0;
            method2287(16);
            method2287(16);
            field1324[var21] = method2287(8);
        }

    }

    static float method2289(int var0) {
        int var1 = var0 & 2097151;
        int var2 = var0 & Integer.MIN_VALUE;
        int var3 = (var0 & 2145386496) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }

        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    void method2285(byte[] var1) {
        Buffer var2 = new Buffer(var1);
        this.field1311 = var2.getInt();
        this.field1312 = var2.getInt();
        this.field1313 = var2.getInt();
        this.field1314 = var2.getInt();
        if (this.field1314 < 0) {
            this.field1314 = ~this.field1314;
            this.field1317 = true;
        }

        int var3 = var2.getInt();
        this.field1319 = new byte[var3][];

        for (int var4 = 0; var4 < var3; ++var4) {
            int var5 = 0;

            int var6;
            do {
                var6 = var2.readUint8();
                var5 += var6;
            } while (var6 >= 255);

            byte[] var7 = new byte[var5];
            var2.method3781(var7, 0, var5, (byte) 33);
            this.field1319[var4] = var7;
        }

    }

    class95 method2293(int[] var1) {
        if (var1 != null && var1[0] <= 0) {
            return null;
        } else {
            if (this.field1341 == null) {
                this.field1329 = 0;
                this.field1328 = new float[field1320];
                this.field1341 = new byte[this.field1312];
                this.field1342 = 0;
                this.field1343 = 0;
            }

            for (; this.field1343 < this.field1319.length; ++this.field1343) {
                if (var1 != null && var1[0] <= 0) {
                    return null;
                }

                float[] var2 = this.method2290(this.field1343);
                if (var2 != null) {
                    int var3 = this.field1342;
                    int var4 = var2.length;
                    if (var4 > this.field1312 - var3) {
                        var4 = this.field1312 - var3;
                    }

                    for (int var5 = 0; var5 < var4; ++var5) {
                        int var6 = (int) (128.0F + var2[var5] * 128.0F);
                        if ((var6 & -256) != 0) {
                            var6 = ~var6 >> 31;
                        }

                        this.field1341[var3++] = (byte) (var6 - 128);
                    }

                    if (var1 != null) {
                        var1[0] -= var3 - this.field1342;
                    }

                    this.field1342 = var3;
                }
            }

            this.field1328 = null;
            byte[] var7 = this.field1341;
            this.field1341 = null;
            return new class95(this.field1311, var7, this.field1313, this.field1314,
                               this.field1317);
        }
    }

    float[] method2290(int var1) {
        method2300(this.field1319[var1], 0);
        method2302();
        int var2 = method2287(class16.method206(field1324.length - 1, 2146209267));
        boolean var3 = field1336[var2];
        int var4 = var3 ? field1320 : field1338;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method2302() != 0;
            var6 = method2302() != 0;
        }

        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field1338 >> 2);
            var9 = (field1338 >> 2) + (var4 >> 2);
            var10 = field1338 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }

        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field1338 >> 2);
            var12 = (field1338 >> 2) + (var4 - (var4 >> 2));
            var13 = field1338 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }

        class108 var14 = field1327[field1324[var2]];
        int var16 = var14.field1449;
        int var17 = var14.field1448[var16];
        boolean var15 = !field1339[var17].method2339();
        boolean var45 = var15;

        for (var17 = 0; var17 < var14.field1447; ++var17) {
            class103 var18 = field1323[var14.field1446[var17]];
            float[] var19 = field1332;
            var18.method2446(var19, var4 >> 1, var45);
        }

        int var40;
        if (!var15) {
            var17 = var14.field1449;
            var40 = var14.field1448[var17];
            field1339[var40].method2341(field1332, var4 >> 1);
        }

        int var42;
        if (var15) {
            for (var17 = var4 >> 1; var17 < var4; ++var17) {
                field1332[var17] = 0.0F;
            }
        } else {
            var17 = var4 >> 1;
            var40 = var4 >> 2;
            var42 = var4 >> 3;
            float[] var43 = field1332;

            int var21;
            for (var21 = 0; var21 < var17; ++var21) {
                var43[var21] *= 0.5F;
            }

            for (var21 = var17; var21 < var4; ++var21) {
                var43[var21] = -var43[var4 - var21 - 1];
            }

            float[] var44 = var3 ? field1316 : field1333;
            float[] var22 = var3 ? field1337 : field1334;
            float[] var23 = var3 ? field1325 : field1335;
            int[] var24 = var3 ? field1340 : field1310;

            int var25;
            float var26;
            float var27;
            float var28;
            float var29;
            for (var25 = 0; var25 < var40; ++var25) {
                var26 = var43[var25 * 4] - var43[var4 - var25 * 4 - 1];
                var27 = var43[var25 * 4 + 2] - var43[var4 - var25 * 4 - 3];
                var28 = var44[var25 * 2];
                var29 = var44[var25 * 2 + 1];
                var43[var4 - var25 * 4 - 1] = var26 * var28 - var27 * var29;
                var43[var4 - var25 * 4 - 3] = var26 * var29 + var27 * var28;
            }

            float var30;
            float var31;
            for (var25 = 0; var25 < var42; ++var25) {
                var26 = var43[var17 + var25 * 4 + 3];
                var27 = var43[var17 + var25 * 4 + 1];
                var28 = var43[var25 * 4 + 3];
                var29 = var43[var25 * 4 + 1];
                var43[var17 + var25 * 4 + 3] = var26 + var28;
                var43[var17 + var25 * 4 + 1] = var27 + var29;
                var30 = var44[var17 - 4 - var25 * 4];
                var31 = var44[var17 - 3 - var25 * 4];
                var43[var25 * 4 + 3] = (var26 - var28) * var30 - (var27 - var29) * var31;
                var43[var25 * 4 + 1] = (var27 - var29) * var30 + (var26 - var28) * var31;
            }

            var25 = class16.method206(var4 - 1, 2146679993);

            int var47;
            int var48;
            int var49;
            int var50;
            for (var47 = 0; var47 < var25 - 3; ++var47) {
                var48 = var4 >> var47 + 2;
                var49 = 8 << var47;

                for (var50 = 0; var50 < 2 << var47; ++var50) {
                    int var51 = var4 - var48 * var50 * 2;
                    int var52 = var4 - var48 * (var50 * 2 + 1);

                    for (int var32 = 0; var32 < var4 >> var47 + 4; ++var32) {
                        int var33 = var32 * 4;
                        float var34 = var43[var51 - 1 - var33];
                        float var35 = var43[var51 - 3 - var33];
                        float var36 = var43[var52 - 1 - var33];
                        float var37 = var43[var52 - 3 - var33];
                        var43[var51 - 1 - var33] = var34 + var36;
                        var43[var51 - 3 - var33] = var35 + var37;
                        float var38 = var44[var32 * var49];
                        float var39 = var44[var32 * var49 + 1];
                        var43[var52 - 1 - var33] =
                            (var34 - var36) * var38 - (var35 - var37) * var39;
                        var43[var52 - 3 - var33] =
                            (var35 - var37) * var38 + (var34 - var36) * var39;
                    }
                }
            }

            for (var47 = 1; var47 < var42 - 1; ++var47) {
                var48 = var24[var47];
                if (var47 < var48) {
                    var49 = var47 * 8;
                    var50 = var48 * 8;
                    var30 = var43[var49 + 1];
                    var43[var49 + 1] = var43[var50 + 1];
                    var43[var50 + 1] = var30;
                    var30 = var43[var49 + 3];
                    var43[var49 + 3] = var43[var50 + 3];
                    var43[var50 + 3] = var30;
                    var30 = var43[var49 + 5];
                    var43[var49 + 5] = var43[var50 + 5];
                    var43[var50 + 5] = var30;
                    var30 = var43[var49 + 7];
                    var43[var49 + 7] = var43[var50 + 7];
                    var43[var50 + 7] = var30;
                }
            }

            for (var47 = 0; var47 < var17; ++var47) {
                var43[var47] = var43[var47 * 2 + 1];
            }

            for (var47 = 0; var47 < var42; ++var47) {
                var43[var4 - 1 - var47 * 2] = var43[var47 * 4];
                var43[var4 - 2 - var47 * 2] = var43[var47 * 4 + 1];
                var43[var4 - var40 - 1 - var47 * 2] = var43[var47 * 4 + 2];
                var43[var4 - var40 - 2 - var47 * 2] = var43[var47 * 4 + 3];
            }

            for (var47 = 0; var47 < var42; ++var47) {
                var27 = var23[var47 * 2];
                var28 = var23[var47 * 2 + 1];
                var29 = var43[var17 + var47 * 2];
                var30 = var43[var17 + var47 * 2 + 1];
                var31 = var43[var4 - 2 - var47 * 2];
                float var53 = var43[var4 - 1 - var47 * 2];
                float var54 = var28 * (var29 - var31) + var27 * (var30 + var53);
                var43[var17 + var47 * 2] = (var29 + var31 + var54) * 0.5F;
                var43[var4 - 2 - var47 * 2] = (var29 + var31 - var54) * 0.5F;
                var54 = var28 * (var30 + var53) - var27 * (var29 - var31);
                var43[var17 + var47 * 2 + 1] = (var30 - var53 + var54) * 0.5F;
                var43[var4 - 1 - var47 * 2] = (-var30 + var53 + var54) * 0.5F;
            }

            for (var47 = 0; var47 < var40; ++var47) {
                var43[var47] = var43[var17 + var47 * 2] * var22[var47 * 2]
                    + var43[var17 + var47 * 2 + 1] * var22[var47 * 2 + 1];
                var43[var17 - 1 - var47] = var43[var17 + var47 * 2] * var22[var47 * 2 + 1]
                    - var43[var17 + var47 * 2 + 1] * var22[var47 * 2];
            }

            for (var47 = 0; var47 < var40; ++var47) {
                var43[var47 + (var4 - var40)] = -var43[var47];
            }

            for (var47 = 0; var47 < var40; ++var47) {
                var43[var47] = var43[var40 + var47];
            }

            for (var47 = 0; var47 < var40; ++var47) {
                var43[var40 + var47] = -var43[var40 - var47 - 1];
            }

            for (var47 = 0; var47 < var40; ++var47) {
                var43[var17 + var47] = var43[var4 - var47 - 1];
            }

            for (var47 = var8; var47 < var9; ++var47) {
                var27 = (float) Math.sin(
                    ((double) (var47 - var8) + 0.5D) / (double) var10 * 0.5D * 3.141592653589793D);
                field1332[var47] *= (float) Math
                    .sin(1.5707963267948966D * (double) var27 * (double) var27);
            }

            for (var47 = var11; var47 < var12; ++var47) {
                var27 = (float) Math.sin(
                    ((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D
                        + 1.5707963267948966D);
                field1332[var47] *= (float) Math
                    .sin(1.5707963267948966D * (double) var27 * (double) var27);
            }
        }

        float[] var41 = null;
        if (this.field1329 > 0) {
            var40 = var4 + this.field1329 >> 2;
            var41 = new float[var40];
            int var20;
            if (!this.field1315) {
                for (var42 = 0; var42 < this.field1330; ++var42) {
                    var20 = var42 + (this.field1329 >> 1);
                    var41[var42] += this.field1328[var20];
                }
            }

            if (!var15) {
                for (var42 = var8; var42 < var4 >> 1; ++var42) {
                    var20 = var41.length - (var4 >> 1) + var42;
                    var41[var20] += field1332[var42];
                }
            }
        }

        float[] var46 = this.field1328;
        this.field1328 = field1332;
        field1332 = var46;
        this.field1329 = var4;
        this.field1330 = var12 - (var4 >> 1);
        this.field1315 = var15;
        return var41;
    }
}
