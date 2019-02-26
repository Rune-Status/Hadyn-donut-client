package jagex.osrs;

public class class87 extends class129 {

    class275 field1268;
    int field1266;
    int field1270;
    int field1263;
    int field1264;
    int field1265;
    int field1269;
    int field1262;
    int field1267;

    class87(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8,
            class129 var9) {
        this.field1266 = var1;
        this.field1263 = var2;
        this.field1264 = var3;
        this.field1265 = var4;
        this.field1262 = var5;
        this.field1267 = var6;
        if (var7 != -1) {
            this.field1268 = class29.method532(var7, -68537384);
            this.field1269 = 0;
            this.field1270 = client.field655 - 1;
            if (this.field1268.field3615 == 0 && var9 != null && var9 instanceof class87) {
                class87 var10 = (class87) var9;
                if (this.field1268 == var10.field1268) {
                    this.field1269 = var10.field1269;
                    this.field1270 = var10.field1270;
                    return;
                }
            }

            if (var8 && this.field1268.field3624 != -1) {
                this.field1269 = (int) (Math.random() * (double) this.field1268.field3623.length);
                this.field1270 -= (int) (Math.random()
                    * (double) this.field1268.field3630[this.field1269]);
            }
        }

    }

    static final void method2172(class232 var0, int var1, int var2, int var3, byte var4) {
        class226 var5 = var0.method4745(false, -748743892);
        if (var5 != null) {
            if (client.field876 < 3) {
                class55.field551
                    .method6180(var1, var2, var5.field2626, var5.field2621, 25, 25, client.field658,
                                256, var5.field2623, var5.field2622);
            } else {
                class319.method6058(var1, var2, 0, var5.field2623, var5.field2622);
            }

        }
    }

    static int method2168(int var0, class86 var1, boolean var2, int var3) {
        class232 var4 = var2 ? class10.field75 : class70.field1080;
        if (var0 == 1500) {
            class70.field1070[++class60.field600 - 1] = var4.field2680;
            return 1;
        } else if (var0 == 1501) {
            class70.field1070[++class60.field600 - 1] = var4.field2772;
            return 1;
        } else if (var0 == 1502) {
            class70.field1070[++class60.field600 - 1] = var4.field2682;
            return 1;
        } else if (var0 == 1503) {
            class70.field1070[++class60.field600 - 1] = var4.field2683;
            return 1;
        } else if (var0 == 1504) {
            class70.field1070[++class60.field600 - 1] = var4.field2704 ? 1 : 0;
            return 1;
        } else if (var0 == 1505) {
            class70.field1070[++class60.field600 - 1] = var4.field2700;
            return 1;
        } else {
            return 2;
        }
    }

    protected final class121 vmethod3236(int var1) {
        if (this.field1268 != null) {
            int var2 = client.field655 - this.field1270;
            if (var2 > 100 && this.field1268.field3624 > 0) {
                var2 = 100;
            }

            label53:
            {
                do {
                    do {
                        if (var2 <= this.field1268.field3630[this.field1269]) {
                            break label53;
                        }

                        var2 -= this.field1268.field3630[this.field1269];
                        ++this.field1269;
                    } while (this.field1269 < this.field1268.field3623.length);

                    this.field1269 -= this.field1268.field3624;
                } while (this.field1269 >= 0 && this.field1269 < this.field1268.field3623.length);

                this.field1268 = null;
            }

            this.field1270 = client.field655 - var2;
        }

        class270 var13 = class253.method4993(this.field1266, (byte) -74);
        if (var13.field3480 != null) {
            var13 = var13.method5279((byte) 92);
        }

        if (var13 == null) {
            return null;
        } else {
            int var3;
            int var4;
            if (this.field1264 != 1 && this.field1264 != 3) {
                var3 = var13.field3501;
                var4 = var13.field3475;
            } else {
                var3 = var13.field3475;
                var4 = var13.field3501;
            }

            int var5 = (var3 >> 1) + this.field1262;
            int var6 = (var3 + 1 >> 1) + this.field1262;
            int var7 = (var4 >> 1) + this.field1267;
            int var8 = (var4 + 1 >> 1) + this.field1267;
            int[][] var9 = class50.field506[this.field1265];
            int var10 =
                var9[var6][var8] + var9[var5][var7] + var9[var6][var7] + var9[var5][var8] >> 2;
            int var11 = (this.field1262 << 7) + (var3 << 6);
            int var12 = (this.field1267 << 7) + (var4 << 6);
            return var13.method5312(this.field1263, this.field1264, var9, var11, var10, var12,
                                    this.field1268, this.field1269, 2038224680);
        }
    }
}
