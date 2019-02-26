package jagex.osrs;

public abstract class class64 extends class129 {

    int field939;
    int field971;
    int[] wx;
    int[] field961;
    int field967;
    int field959;
    boolean field941;
    class205 field987;
    int[] wz;
    byte field938;
    int field955;
    int field998;
    int field972;
    int field964;
    int[] field960;
    int field944;
    int field986;
    int field945;
    int field969;
    int field957;
    int field942;
    byte[] field996;
    int field948;
    int x;
    int[] field992;
    int field949;
    int field950;
    int[] field962;
    int field951;
    int field946;
    int z;
    int[] field963;
    String field968;
    int field976;
    boolean field954;
    int field993;
    int field981;
    int field956;
    int field974;
    int field980;
    int field965;
    boolean field966;
    int field990;
    int field970;
    int field989;
    int field975;
    int field978;
    int field988;
    int field991;
    int field947;
    int field979;
    int field985;
    int field977;
    int field943;
    int field983;
    int field995;
    int field982;
    int field984;
    int field940;
    int field997;
    boolean field958;

    class64() {
        this.field941 = false;
        this.field964 = 1;
        this.field944 = -1;
        this.field945 = -1;
        this.field957 = -1;
        this.field942 = -1;
        this.field948 = -1;
        this.field949 = -1;
        this.field950 = -1;
        this.field951 = -1;
        this.field968 = null;
        this.field954 = false;
        this.field981 = 100;
        this.field956 = 0;
        this.field974 = 0;
        this.field938 = 0;
        this.field992 = new int[4];
        this.field960 = new int[4];
        this.field961 = new int[4];
        this.field962 = new int[4];
        this.field963 = new int[4];
        this.field987 = new class205();
        this.field965 = -1;
        this.field966 = false;
        this.field967 = -1;
        this.field972 = -1;
        this.field969 = 0;
        this.field970 = 0;
        this.field971 = -1;
        this.field986 = 0;
        this.field989 = 0;
        this.field998 = 0;
        this.field975 = 0;
        this.field976 = -1;
        this.field993 = 0;
        this.field978 = 0;
        this.field988 = 0;
        this.field946 = 200;
        this.field991 = 0;
        this.field947 = 32;
        this.field939 = 0;
        this.wx = new int[10];
        this.wz = new int[10];
        this.field996 = new byte[10];
        this.field955 = 0;
        this.field959 = 0;
    }

    static final int method1678(int var0) {
        return class122.field1715;
    }

    boolean vmethod1973(int var1) {
        return false;
    }

    final void method1675(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        boolean var8 = true;
        boolean var9 = true;

        int var10;
        for (var10 = 0; var10 < 4; ++var10) {
            if (this.field961[var10] > var5) {
                var8 = false;
            } else {
                var9 = false;
            }
        }

        var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (var1 >= 0) {
            class269 var13 = class221.method4528(var1, -1787572987);
            var11 = var13.field3445;
            var12 = var13.field3428;
        }

        int var15;
        if (var9) {
            if (var11 == -1) {
                return;
            }

            var10 = 0;
            var15 = 0;
            if (var11 == 0) {
                var15 = this.field961[0];
            } else if (var11 == 1) {
                var15 = this.field960[0];
            }

            for (int var14 = 1; var14 < 4; ++var14) {
                if (var11 == 0) {
                    if (this.field961[var14] < var15) {
                        var10 = var14;
                        var15 = this.field961[var14];
                    }
                } else if (var11 == 1 && this.field960[var14] < var15) {
                    var10 = var14;
                    var15 = this.field960[var14];
                }
            }

            if (var11 == 1 && var15 >= var2) {
                return;
            }
        } else {
            if (var8) {
                this.field938 = 0;
            }

            for (var15 = 0; var15 < 4; ++var15) {
                byte var16 = this.field938;
                this.field938 = (byte) ((this.field938 + 1) % 4);
                if (this.field961[var16] <= var5) {
                    var10 = var16;
                    break;
                }
            }
        }

        if (var10 >= 0) {
            this.field992[var10] = var1;
            this.field960[var10] = var2;
            this.field962[var10] = var3;
            this.field963[var10] = var4;
            this.field961[var10] = var5 + var12 + var6;
        }
    }

    final void method1663(int var1, int var2) {
        class263 var3 = class37.method698(var1, -1684545804);

        for (class72 var4 = (class72) this.field987.method4250(); var4 != null;
             var4 = (class72) this.field987.method4248()) {
            if (var3 == var4.field1097) {
                var4.unlink();
                return;
            }
        }

    }

    final void method1677(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        class263 var8 = class37.method698(var1, -1684545804);
        class72 var9 = null;
        class72 var10 = null;
        int var11 = var8.field3386;
        int var12 = 0;

        class72 var13;
        for (var13 = (class72) this.field987.method4250(); var13 != null;
             var13 = (class72) this.field987.method4248()) {
            ++var12;
            if (var13.field1097.field3383 == var8.field3383) {
                var13.method1959(var2 + var4, var5, var6, var3, -112883502);
                return;
            }

            if (var13.field1097.field3391 <= var8.field3391) {
                var9 = var13;
            }

            if (var13.field1097.field3386 > var11) {
                var10 = var13;
                var11 = var13.field1097.field3386;
            }
        }

        if (var10 != null || var12 < 4) {
            var13 = new class72(var8);
            if (var9 == null) {
                this.field987.method4246(var13);
            } else {
                class205.method4245(var13, var9);
            }

            var13.method1959(var2 + var4, var5, var6, var3, -18241211);
            if (var12 >= 4) {
                var10.unlink();
            }

        }
    }

    final void method1660(byte var1) {
        this.field939 = 0;
        this.field959 = 0;
    }
}
