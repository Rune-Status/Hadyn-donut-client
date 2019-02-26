package jagex.osrs;

public class class100 {

    class249 field1394;
    class249 field1397;
    class204 field1396;
    class204 field1395;

    public class100(class249 var1, class249 var2) {
        this.field1395 = new class204(256);
        this.field1396 = new class204(256);
        this.field1397 = var1;
        this.field1394 = var2;
    }

    class95 method2428(int var1, int var2, int[] var3, int var4) {
        int var5 = var2 ^ (var1 << 4 & 65535 | var1 >>> 12);
        var5 |= var1 << 16;
        long var6 = (long) var5;
        class95 var8 = (class95) this.field1396.method4224(var6);
        if (var8 != null) {
            return var8;
        } else if (var3 != null && var3[0] <= 0) {
            return null;
        } else {
            class93 var9 = class93.method2275(this.field1397, var1, var2);
            if (var9 == null) {
                return null;
            } else {
                var8 = var9.method2281();
                this.field1396.method4226(var8, var6);
                if (var3 != null) {
                    var3[0] -= var8.field1345.length;
                }

                return var8;
            }
        }
    }

    class95 method2429(int var1, int var2, int[] var3, byte var4) {
        int var5 = var2 ^ (var1 << 4 & 65535 | var1 >>> 12);
        var5 |= var1 << 16;
        long var6 = (long) var5 ^ 4294967296L;
        class95 var8 = (class95) this.field1396.method4224(var6);
        if (var8 != null) {
            return var8;
        } else if (var3 != null && var3[0] <= 0) {
            return null;
        } else {
            class94 var9 = (class94) this.field1395.method4224(var6);
            if (var9 == null) {
                var9 = class94.method2292(this.field1394, var1, var2);
                if (var9 == null) {
                    return null;
                }

                this.field1395.method4226(var9, var6);
            }

            var8 = var9.method2293(var3);
            if (var8 == null) {
                return null;
            } else {
                var9.unlink();
                this.field1396.method4226(var8, var6);
                return var8;
            }
        }
    }

    public class95 method2432(int var1, int[] var2, int var3) {
        if (this.field1397.method4841((byte) 113) == 1) {
            return this.method2428(0, var1, var2, 1531393813);
        } else if (this.field1397.method4889(var1, 1064669026) == 1) {
            return this.method2428(var1, 0, var2, -1474920778);
        } else {
            throw new RuntimeException();
        }
    }

    public class95 method2435(int var1, int[] var2, int var3) {
        if (this.field1394.method4841((byte) 13) == 1) {
            return this.method2429(0, var1, var2, (byte) 7);
        } else if (this.field1394.method4889(var1, 1064669026) == 1) {
            return this.method2429(var1, 0, var2, (byte) 7);
        } else {
            throw new RuntimeException();
        }
    }
}
