package jagex.osrs;

public class class27 implements class31 {

    static int field266;
    static class251 index14;
    int field270;
    int field271;
    int field272;
    int field267;
    int field268;
    int field269;

    static synchronized void method515(byte[] var0, int var1) {
        if (var0.length == 100 && class185.field2415 < 1000) {
            class185.field2414[++class185.field2415 - 1] = var0;
        } else if (var0.length == 5000 && class185.field2412 < 250) {
            class185.field2418[++class185.field2412 - 1] = var0;
        } else if (var0.length == 30000 && class185.field2413 < 50) {
            class185.field2416[++class185.field2413 - 1] = var0;
        } else {
            if (class296.field3737 != null) {
                for (int var2 = 0; var2 < class25.field253.length; ++var2) {
                    if (var0.length == class25.field253[var2]
                        && class185.field2411[var2] < class296.field3737[var2].length) {
                        class296.field3737[var2][class185.field2411[var2]++] = var0;
                        return;
                    }
                }
            }

        }
    }

    static void method513(int var0) {
        client.field870 = 0L;
        if (var0 >= 2) {
            client.resizable = true;
        } else {
            client.resizable = false;
        }

        if (class17.getWindowMode() == 1) {
            class157.field2037.setMaximumDimensions(765, 503);
        } else {
            class157.field2037.setMaximumDimensions(7680, 2160);
        }

        if (client.state >= 25) {
            ScriptExecutor.method1948(-904353438);
        }

    }

    static void method492(int var0, int var1, int var2, int var3, byte var4) {
        class54 var5 = (class54) class54.field534.method4224((long) var0);
        if (var5 == null) {
            var5 = new class54();
            class54.field534.method4226(var5, (long) var0);
        }

        if (var5.field533.length <= var1) {
            int[] var6 = new int[var1 + 1];
            int[] var7 = new int[var1 + 1];

            int var8;
            for (var8 = 0; var8 < var5.field533.length; ++var8) {
                var6[var8] = var5.field533[var8];
                var7[var8] = var5.field532[var8];
            }

            for (var8 = var5.field533.length; var8 < var1; ++var8) {
                var6[var8] = -1;
                var7[var8] = 0;
            }

            var5.field533 = var6;
            var5.field532 = var7;
        }

        var5.field533[var1] = var2;
        var5.field532[var1] = var3;
    }

    public static void method517(class249 var0, class249 var1, boolean var2, class300 var3,
                                 byte var4) {
        ItemConfig.field3506 = var0;
        class4.field32 = var1;
        class229.field2648 = var2;
        class316.field3840 = ItemConfig.field3506.method4889(10, 1064669026);
        class140.field1931 = var3;
    }

    public static void method516(int var0, class249 var1, String var2, String var3, int var4,
                                 boolean var5, int var6) {
        int var7 = var1.method4825(var2, 1011742774);
        int var8 = var1.method4847(var7, var3, 1520713105);
        class25.method478(var0, var1, var7, var8, var4, var5, 319266207);
    }

    public boolean vmethod706(int var1, int var2, byte var3) {
        return var1 >> 6 == this.field270 && var2 >> 6 == this.field272;
    }

    public boolean vmethod696(int var1, int var2, int var3, byte var4) {
        return var1 >= this.field271 && var1 < this.field271 + this.field267 ?
            var2 >> 6 == this.field268 && var3 >> 6 == this.field269 : false;
    }

    public void vmethod697(class20 var1, byte var2) {
        if (var1.field198 > this.field270) {
            var1.field198 = this.field270;
        }

        if (var1.field199 < this.field270) {
            var1.field199 = this.field270;
        }

        if (var1.field194 > this.field272) {
            var1.field194 = this.field272;
        }

        if (var1.field203 < this.field272) {
            var1.field203 = this.field272;
        }

    }

    public class228 vmethod695(int var1, int var2, byte var3) {
        if (!this.vmethod706(var1, var2, (byte) 70)) {
            return null;
        } else {
            int var4 = this.field268 * 64 - this.field270 * 64 + var1;
            int var5 = this.field269 * 64 - this.field272 * 64 + var2;
            return new class228(this.field271, var4, var5);
        }
    }

    public int[] vmethod715(int var1, int var2, int var3, int var4) {
        if (!this.vmethod696(var1, var2, var3, (byte) -107)) {
            return null;
        } else {
            int[] var5 = new int[]{this.field270 * 64 - this.field268 * 64 + var2,
                var3 + (this.field272 * 64 - this.field269 * 64)};
            return var5;
        }
    }

    void method498(int var1) {
    }

    public void vmethod709(Buffer var1, int var2) {
        this.field271 = var1.readUint8();
        this.field267 = var1.readUint8();
        this.field268 = var1.readUint16();
        this.field269 = var1.readUint16();
        this.field270 = var1.readUint16();
        this.field272 = var1.readUint16();
        this.method498(-1802894795);
    }
}
