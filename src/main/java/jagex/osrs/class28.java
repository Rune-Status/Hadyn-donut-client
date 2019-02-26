package jagex.osrs;

public class class28 {

    public static String field284;
    static class249 field282;
    public final int field285;
    public final class228 field279;
    public final class228 field277;
    final class22 field278;
    final int field281;
    final int field280;
    int field276;
    int field283;

    class28(int var1, class228 var2, class228 var3, class22 var4) {
        this.field285 = var1;
        this.field279 = var2;
        this.field277 = var3;
        this.field278 = var4;
        class257 var5 = class162.method3533(this.field285, 32768);
        class323 var6 = var5.method5064(false, -288269009);
        if (var6 != null) {
            this.field281 = var6.field3879;
            this.field280 = var6.field3887;
        } else {
            this.field281 = 0;
            this.field280 = 0;
        }

    }

    boolean method518(int var1, int var2, int var3) {
        class257 var4 = class162.method3533(this.field285, 32768);
        switch (var4.field3324.field3562) {
            case 0:
                if (var1 > this.field276 - this.field281 && var1 <= this.field276) {
                    break;
                }

                return false;
            case 1:
                if (var1 >= this.field276 - this.field281 / 2
                    && var1 <= this.field281 / 2 + this.field276) {
                    break;
                }

                return false;
            case 2:
                if (var1 < this.field276 || var1 >= this.field281 + this.field276) {
                    return false;
                }
        }

        switch (var4.field3328.field3292) {
            case 0:
                if (var2 >= this.field283 && var2 < this.field283 + this.field280) {
                    break;
                }

                return false;
            case 1:
                if (var2 < this.field283 - this.field280 / 2
                    || var2 > this.field280 / 2 + this.field283) {
                    return false;
                }
                break;
            case 2:
                if (var2 <= this.field283 - this.field280 || var2 > this.field283) {
                    return false;
                }
        }

        return true;
    }

    boolean method520(int var1, int var2, byte var3) {
        return this.field278 == null ? false : (var1 >= this.field276 - this.field278.field214 / 2
            && var1 <= this.field278.field214 / 2 + this.field276 ? var2 >= this.field283
            && var2 <= this.field278.field215 + this.field283 : false);
    }

    boolean method523(int var1, int var2, int var3) {
        return this.method518(var1, var2, 2058981001) ? true
            : this.method520(var1, var2, (byte) 34);
    }
}
