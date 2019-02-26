package jagex.osrs;

public abstract class class249 {

    static class177 gzip;
    static int maximumLength;

    static {
        gzip = new class177();
        maximumLength = 0;
    }

    public int checksum;
    int[][] field3240;
    int[] field3225;
    Object[] field3234;
    Object[][] field3235;
    boolean field3236;
    class200[] field3233;
    class200 field3227;
    int[] field3229;
    int[] field3230;
    boolean field3226;
    int[] field3228;
    int field3224;
    int[] field3238;
    int[][] field3232;

    class249(boolean var1, boolean var2) {
        this.field3236 = var1;
        this.field3226 = var2;
    }

    public int[] method4839(int var1, int var2) {
        return this.field3240[var1];
    }

    public byte[] method4869(int var1, int var2, int[] var3, int var4) {
        if (var1 >= 0 && var1 < this.field3235.length && this.field3235[var1] != null && var2 >= 0
            && var2 < this.field3235[var1].length) {
            if (this.field3235[var1][var2] == null) {
                boolean var5 = this.method4863(var1, var3, (byte) 0);
                if (!var5) {
                    this.vmethod4955(var1, 1000414175);
                    var5 = this.method4863(var1, var3, (byte) 0);
                    if (!var5) {
                        return null;
                    }
                }
            }

            byte[] var6 = class162.method3547(this.field3235[var1][var2], false, (byte) -89);
            if (this.field3226) {
                this.field3235[var1][var2] = null;
            }

            return var6;
        } else {
            return null;
        }
    }

    public int method4841(byte var1) {
        return this.field3235.length;
    }

    public byte[] method4835(int var1, short var2) {
        if (this.field3235.length == 1) {
            return this.method4831(0, var1, 1789634852);
        } else if (this.field3235[var1].length == 1) {
            return this.method4831(var1, 0, 1789634852);
        } else {
            throw new RuntimeException();
        }
    }

    public byte[] method4836(int var1, int var2, int var3) {
        if (var1 >= 0 && var1 < this.field3235.length && this.field3235[var1] != null && var2 >= 0
            && var2 < this.field3235[var1].length) {
            if (this.field3235[var1][var2] == null) {
                boolean var4 = this.method4863(var1, (int[]) null, (byte) 0);
                if (!var4) {
                    this.vmethod4955(var1, 1000414175);
                    var4 = this.method4863(var1, (int[]) null, (byte) 0);
                    if (!var4) {
                        return null;
                    }
                }
            }

            byte[] var5 = class162.method3547(this.field3235[var1][var2], false, (byte) -51);
            return var5;
        } else {
            return null;
        }
    }

    public boolean method4830(int var1, int var2, byte var3) {
        if (var1 >= 0 && var1 < this.field3235.length && this.field3235[var1] != null && var2 >= 0
            && var2 < this.field3235[var1].length) {
            if (this.field3235[var1][var2] != null) {
                return true;
            } else if (this.field3234[var1] != null) {
                return true;
            } else {
                this.vmethod4955(var1, 1000414175);
                return this.field3234[var1] != null;
            }
        } else {
            return false;
        }
    }

    public byte[] method4831(int var1, int var2, int var3) {
        return this.method4869(var1, var2, (int[]) null, -473032235);
    }

    void vmethod4955(int var1, int var2) {
    }

    public byte[] method4837(int var1, int var2) {
        if (this.field3235.length == 1) {
            return this.method4836(0, var1, 1047900059);
        } else if (this.field3235[var1].length == 1) {
            return this.method4836(var1, 0, 33985810);
        } else {
            throw new RuntimeException();
        }
    }

    public int method4889(int var1, int var2) {
        return this.field3235[var1].length;
    }

    int vmethod4932(int var1, int var2) {
        return this.field3234[var1] != null ? 100 : 0;
    }

    void method4846(byte[] var1, byte var2) {
        int var4 = var1.length;
        this.checksum = class73.checksumIEEE(var1, 0, var4, (byte) -11);
        Buffer var5 = new Buffer(class234.unpack(var1));
        int format = var5.getUByte();
        if (format < 5 || format > 7) {
            throw new RuntimeException("");
        }

        if (format >= 6) {
            var5.getInt();
        }

        int var7 = var5.getUByte();
        if (format >= 7) {
            this.field3224 = var5.method3785(130636952);
        } else {
            this.field3224 = var5.readUint16();
        }

        int var8 = 0;
        int var9 = -1;
        this.field3225 = new int[this.field3224];
        int var10;
        if (format >= 7) {
            for (var10 = 0; var10 < this.field3224; ++var10) {
                this.field3225[var10] = var8 += var5.method3785(-1986609939);
                if (this.field3225[var10] > var9) {
                    var9 = this.field3225[var10];
                }
            }
        } else {
            for (var10 = 0; var10 < this.field3224; ++var10) {
                this.field3225[var10] = var8 += var5.readUint16();
                if (this.field3225[var10] > var9) {
                    var9 = this.field3225[var10];
                }
            }
        }

        this.field3228 = new int[var9 + 1];
        this.field3229 = new int[var9 + 1];
        this.field3230 = new int[var9 + 1];
        this.field3240 = new int[var9 + 1][];
        this.field3234 = new Object[var9 + 1];
        this.field3235 = new Object[var9 + 1][];
        if (var7 != 0) {
            this.field3238 = new int[var9 + 1];

            for (var10 = 0; var10 < this.field3224; ++var10) {
                this.field3238[this.field3225[var10]] = var5.getInt();
            }

            this.field3227 = new class200(this.field3238);
        }

        for (var10 = 0; var10 < this.field3224; ++var10) {
            this.field3228[this.field3225[var10]] = var5.getInt();
        }

        for (var10 = 0; var10 < this.field3224; ++var10) {
            this.field3229[this.field3225[var10]] = var5.getInt();
        }

        for (var10 = 0; var10 < this.field3224; ++var10) {
            this.field3230[this.field3225[var10]] = var5.readUint16();
        }

        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        if (format >= 7) {
            for (var10 = 0; var10 < this.field3224; ++var10) {
                var11 = this.field3225[var10];
                var12 = this.field3230[var11];
                var8 = 0;
                var13 = -1;
                this.field3240[var11] = new int[var12];

                for (var14 = 0; var14 < var12; ++var14) {
                    var15 = this.field3240[var11][var14] = var8 += var5.method3785(2046433549);
                    if (var15 > var13) {
                        var13 = var15;
                    }
                }

                this.field3235[var11] = new Object[var13 + 1];
            }
        } else {
            for (var10 = 0; var10 < this.field3224; ++var10) {
                var11 = this.field3225[var10];
                var12 = this.field3230[var11];
                var8 = 0;
                var13 = -1;
                this.field3240[var11] = new int[var12];

                for (var14 = 0; var14 < var12; ++var14) {
                    var15 = this.field3240[var11][var14] = var8 += var5.readUint16();
                    if (var15 > var13) {
                        var13 = var15;
                    }
                }

                this.field3235[var11] = new Object[var13 + 1];
            }
        }

        if (var7 != 0) {
            this.field3232 = new int[var9 + 1][];
            this.field3233 = new class200[var9 + 1];

            for (var10 = 0; var10 < this.field3224; ++var10) {
                var11 = this.field3225[var10];
                var12 = this.field3230[var11];
                this.field3232[var11] = new int[this.field3235[var11].length];

                for (var13 = 0; var13 < var12; ++var13) {
                    this.field3232[var11][this.field3240[var11][var13]] = var5
                        .getInt();
                }

                this.field3233[var11] = new class200(this.field3232[var11]);
            }
        }

    }

    public boolean method4853(String var1, String var2, int var3) {
        var1 = var1.toLowerCase();
        var2 = var2.toLowerCase();
        int var4 = this.field3227.method4186(class54.method1088(var1, 782909435));
        int var5 = this.field3233[var4].method4186(class54.method1088(var2, 1133662004));
        return this.method4830(var4, var5, (byte) 72);
    }

    void vmethod4936(int var1, int var2) {
    }

    public boolean method4832(int var1, byte var2) {
        if (this.field3234[var1] != null) {
            return true;
        } else {
            this.vmethod4955(var1, 1000414175);
            return this.field3234[var1] != null;
        }
    }

    public int method4825(String var1, int var2) {
        var1 = var1.toLowerCase();
        return this.field3227.method4186(class54.method1088(var1, 1214608407));
    }

    public boolean method4848(String var1, String var2, short var3) {
        var1 = var1.toLowerCase();
        var2 = var2.toLowerCase();
        int var4 = this.field3227.method4186(class54.method1088(var1, 601787967));
        if (var4 < 0) {
            return false;
        } else {
            int var5 = this.field3233[var4].method4186(class54.method1088(var2, 450628628));
            return var5 >= 0;
        }
    }

    public int method4847(int var1, String var2, int var3) {
        var2 = var2.toLowerCase();
        return this.field3233[var1].method4186(class54.method1088(var2, 491481317));
    }

    public boolean method4829(int var1, int var2) {
        if (this.field3235.length == 1) {
            return this.method4830(0, var1, (byte) 3);
        } else if (this.field3235[var1].length == 1) {
            return this.method4830(var1, 0, (byte) -10);
        } else {
            throw new RuntimeException();
        }
    }

    public int method4845(String var1, int var2) {
        var1 = var1.toLowerCase();
        int var3 = this.field3227.method4186(class54.method1088(var1, 1097159747));
        return this.vmethod4932(var3, -1578999847);
    }

    boolean method4863(int var1, int[] var2, byte var3) {
        if (this.field3234[var1] == null) {
            return false;
        } else {
            int var4 = this.field3230[var1];
            int[] var5 = this.field3240[var1];
            Object[] var6 = this.field3235[var1];
            boolean var7 = true;

            for (int var8 = 0; var8 < var4; ++var8) {
                if (var6[var5[var8]] == null) {
                    var7 = false;
                    break;
                }
            }

            if (var7) {
                return true;
            } else {
                byte[] var19;
                if (var2 == null || var2[0] == 0 && var2[1] == 0 && var2[2] == 0 && var2[3] == 0) {
                    var19 = class162.method3547(this.field3234[var1], false, (byte) -91);
                } else {
                    var19 = class162.method3547(this.field3234[var1], true, (byte) -8);
                    Buffer var9 = new Buffer(var19);
                    var9.method3791(var2, 5, var9.bytes.length, 1256882832);
                }

                byte[] var21 = class234.unpack(var19);
                if (this.field3236) {
                    this.field3234[var1] = null;
                }

                if (var4 > 1) {
                    int var10 = var21.length;
                    --var10;
                    int var11 = var21[var10] & 255;
                    var10 -= var11 * var4 * 4;
                    Buffer var12 = new Buffer(var21);
                    int[] var13 = new int[var4];
                    var12.offset = var10;

                    int var15;
                    int var16;
                    for (int var14 = 0; var14 < var11; ++var14) {
                        var15 = 0;

                        for (var16 = 0; var16 < var4; ++var16) {
                            var15 += var12.getInt();
                            var13[var16] += var15;
                        }
                    }

                    byte[][] var20 = new byte[var4][];

                    for (var15 = 0; var15 < var4; ++var15) {
                        var20[var15] = new byte[var13[var15]];
                        var13[var15] = 0;
                    }

                    var12.offset = var10;
                    var15 = 0;

                    for (var16 = 0; var16 < var11; ++var16) {
                        int var17 = 0;

                        for (int var18 = 0; var18 < var4; ++var18) {
                            var17 += var12.getInt();
                            System.arraycopy(var21, var15, var20[var18], var13[var18], var17);
                            var13[var18] += var17;
                            var15 += var17;
                        }
                    }

                    for (var16 = 0; var16 < var4; ++var16) {
                        if (!this.field3226) {
                            var6[var5[var16]] = class21.method330(var20[var16], false, 276957012);
                        } else {
                            var6[var5[var16]] = var20[var16];
                        }
                    }
                } else if (!this.field3226) {
                    var6[var5[0]] = class21.method330(var21, false, -1957451003);
                } else {
                    var6[var5[0]] = var21;
                }

                return true;
            }
        }
    }

    public byte[] method4849(String var1, String var2, int var3) {
        var1 = var1.toLowerCase();
        var2 = var2.toLowerCase();
        int var4 = this.field3227.method4186(class54.method1088(var1, 1733897394));
        int var5 = this.field3233[var4].method4186(class54.method1088(var2, 1271389126));
        return this.method4831(var4, var5, 1789634852);
    }

    public boolean method4904(byte var1) {
        boolean var2 = true;

        for (int var3 = 0; var3 < this.field3225.length; ++var3) {
            int var4 = this.field3225[var3];
            if (this.field3234[var4] == null) {
                this.vmethod4955(var4, 1000414175);
                if (this.field3234[var4] == null) {
                    var2 = false;
                }
            }
        }

        return var2;
    }

    public void method4842(int var1) {
        for (int var2 = 0; var2 < this.field3234.length; ++var2) {
            this.field3234[var2] = null;
        }

    }

    public void method4844(int var1) {
        for (int var2 = 0; var2 < this.field3235.length; ++var2) {
            if (this.field3235[var2] != null) {
                for (int var3 = 0; var3 < this.field3235[var2].length; ++var3) {
                    this.field3235[var2][var3] = null;
                }
            }
        }

    }

    public boolean method4851(String var1, int var2) {
        var1 = var1.toLowerCase();
        int var3 = this.field3227.method4186(class54.method1088(var1, 1648298277));
        return this.method4832(var3, (byte) -121);
    }

    public void method4843(int var1, int var2) {
        for (int var3 = 0; var3 < this.field3235[var1].length; ++var3) {
            this.field3235[var1][var3] = null;
        }

    }

    public void method4828(String var1, int var2) {
        var1 = var1.toLowerCase();
        int var3 = this.field3227.method4186(class54.method1088(var1, 1557015604));
        if (var3 >= 0) {
            this.vmethod4936(var3, -894037768);
        }
    }
}
