package jagex.osrs;

public class class257 extends class208 {

    public static class202 field3314;
    public static class257[] field3310;
    public static int field3331;
    public static class249 field3309;

    static {
        field3314 = new class202(256);
    }

    public final int field3313;
    public int field3315;
    public String field3316;
    public class272 field3324;
    public int field3327;
    public class254 field3328;
    public int field3318;
    public String[] field3320;
    public String field3321;
    public int field3317;
    int[] field3322;
    int field3311;
    int field3323;
    int field3325;
    int field3326;
    int field3332;
    int[] field3329;
    byte[] field3330;

    public class257(int var1) {
        this.field3315 = -1;
        this.field3311 = -1;
        this.field3318 = 0;
        this.field3320 = new String[5];
        this.field3323 = Integer.MAX_VALUE;
        this.field3326 = Integer.MAX_VALUE;
        this.field3325 = Integer.MIN_VALUE;
        this.field3332 = Integer.MIN_VALUE;
        this.field3324 = class272.field3559;
        this.field3328 = class254.field3291;
        this.field3317 = -1;
        this.field3313 = var1;
    }

    public static void method5066(class249 var0, class249 var1, boolean var2, short var3) {
        class270.field3450 = var0;
        class270.field3452 = var1;
        class270.field3454 = var2;
    }

    public static class322 method5047(class249 var0, String var1, String var2, int var3) {
        int var4 = var0.method4825(var1, 1011742774);
        int var5 = var0.method4847(var4, var2, -455492789);
        return class156.method3443(var0, var4, var5, -1799882533);
    }

    static final void method5065(int var0, int var1, int var2, int var3, class323 var4,
                                 class226 var5, byte var6) {
        int var7 = var3 * var3 + var2 * var2;
        if (var7 > 4225 && var7 < 90000) {
            int var8 = client.field658 & 2047;
            int var9 = class124.field1747[var8];
            int var10 = class124.field1754[var8];
            int var11 = var10 * var2 + var3 * var9 >> 16;
            int var12 = var3 * var10 - var9 * var2 >> 16;
            double var13 = Math.atan2((double) var11, (double) var12);
            int var15 = var5.field2626 / 2 - 25;
            int var16 = (int) (Math.sin(var13) * (double) var15);
            int var17 = (int) (Math.cos(var13) * (double) var15);
            byte var18 = 20;
            class12.field98.method6167(var16 + (var0 + var5.field2626 / 2 - var18 / 2),
                                       var5.field2621 / 2 + var1 - var18 / 2 - var17 - 10, var18,
                                       var18, 15, 15, var13, 256);
        } else {
            class56.method1111(var0, var1, var2, var3, var4, var5, -55556837);
        }

    }

    public class323 method5064(boolean var1, int var2) {
        int var3 = this.field3315;
        return this.method5045(var3, 1381751159);
    }

    class323 method5045(int var1, int var2) {
        if (var1 < 0) {
            return null;
        } else {
            class323 var3 = (class323) field3314.method4198((long) var1);
            if (var3 != null) {
                return var3;
            } else {
                var3 = class145.method3349(field3309, var1, 0, (byte) 47);
                if (var3 != null) {
                    field3314.method4204(var3, (long) var1);
                }

                return var3;
            }
        }
    }

    void method5044(Buffer var1, int var2, int var3) {
        if (var2 == 1) {
            this.field3315 = var1.method3898((byte) -64);
        } else if (var2 == 2) {
            this.field3311 = var1.method3898((byte) -118);
        } else if (var2 == 3) {
            this.field3316 = var1.method3778(-906025237);
        } else if (var2 == 4) {
            this.field3327 = var1.method3773(31798142);
        } else if (var2 == 5) {
            var1.method3773(-587115775);
        } else if (var2 == 6) {
            this.field3318 = var1.getUByte();
        } else {
            int var4;
            if (var2 == 7) {
                var4 = var1.getUByte();
                if ((var4 & 1) == 0) {
                    ;
                }

                if ((var4 & 2) == 2) {
                    ;
                }
            } else if (var2 == 8) {
                var1.getUByte();
            } else if (var2 >= 10 && var2 <= 14) {
                this.field3320[var2 - 10] = var1.method3778(-1150134762);
            } else if (var2 == 15) {
                var4 = var1.getUByte();
                this.field3322 = new int[var4 * 2];

                int var5;
                for (var5 = 0; var5 < var4 * 2; ++var5) {
                    this.field3322[var5] = var1.method3814((byte) -1);
                }

                var1.getInt();
                var5 = var1.getUByte();
                this.field3329 = new int[var5];

                int var6;
                for (var6 = 0; var6 < this.field3329.length; ++var6) {
                    this.field3329[var6] = var1.getInt();
                }

                this.field3330 = new byte[var4];

                for (var6 = 0; var6 < var4; ++var6) {
                    this.field3330[var6] = var1.method3931(2066272055);
                }
            } else if (var2 != 16) {
                if (var2 == 17) {
                    this.field3321 = var1.method3778(-812622843);
                } else if (var2 == 18) {
                    var1.method3898((byte) -111);
                } else if (var2 == 19) {
                    this.field3317 = var1.readUint16();
                } else if (var2 == 21) {
                    var1.getInt();
                } else if (var2 == 22) {
                    var1.getInt();
                } else if (var2 == 23) {
                    var1.getUByte();
                    var1.getUByte();
                    var1.getUByte();
                } else if (var2 == 24) {
                    var1.method3814((byte) -1);
                    var1.method3814((byte) -1);
                } else if (var2 == 25) {
                    var1.method3898((byte) -91);
                } else if (var2 == 28) {
                    var1.getUByte();
                } else if (var2 == 29) {
                    this.field3324 = (class272) class43
                        .method791(class243.method4797((byte) 112), var1.getUByte(),
                                   1443720514);
                } else if (var2 == 30) {
                    class254[] var7 = new class254[]{class254.field3296, class254.field3291,
                        class254.field3290};
                    this.field3328 = (class254) class43
                        .method791(var7, var1.getUByte(), 1443720514);
                }
            }
        }

    }

    public int method5046(byte var1) {
        return this.field3313;
    }

    public void method5053(Buffer var1, byte var2) {
        while (true) {
            int var3 = var1.getUByte();
            if (var3 == 0) {
                return;
            }

            this.method5044(var1, var3, -1977714961);
        }
    }

    public void method5043(byte var1) {
        if (this.field3322 != null) {
            for (int var2 = 0; var2 < this.field3322.length; var2 += 2) {
                if (this.field3322[var2] < this.field3323) {
                    this.field3323 = this.field3322[var2];
                } else if (this.field3322[var2] > this.field3325) {
                    this.field3325 = this.field3322[var2];
                }

                if (this.field3322[var2 + 1] < this.field3326) {
                    this.field3326 = this.field3322[var2 + 1];
                } else if (this.field3322[var2 + 1] > this.field3332) {
                    this.field3332 = this.field3322[var2 + 1];
                }
            }
        }

    }
}
