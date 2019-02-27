package jagex.osrs;

public class class37 implements class31 {

    static class137 field352;
    static int[] field367;
    int field361;
    int field359;
    int field356;
    int field360;
    int field358;
    int field354;
    int field353;
    int field364;
    int field355;
    int field357;

    public static class263 method698(int var0, int var1) {
        class263 var2 = (class263) class263.field3385.method4198((long) var0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class263.field3389.method4831(33, var0, 1789634852);
            var2 = new class263();
            if (var3 != null) {
                var2.method5147(new Buffer(var3), (byte) -97);
            }

            class263.field3385.method4204(var2, (long) var0);
            return var2;
        }
    }

    static void method721(class232 var0, int var1) {
        if (var0.field2805 == client.field847) {
            client.field848[var0.field2804] = true;
        }

    }

    static final void method719(class232 var0, int var1) {
        int var2 = var0.field2741;
        if (var2 == 324) {
            if (client.field874 == -1) {
                client.field874 = var0.field2702;
                client.field910 = var0.field2703;
            }

            if (client.field908.field2637) {
                var0.field2702 = client.field874;
            } else {
                var0.field2702 = client.field910;
            }

        } else if (var2 == 325) {
            if (client.field874 == -1) {
                client.field874 = var0.field2702;
                client.field910 = var0.field2703;
            }

            if (client.field908.field2637) {
                var0.field2702 = client.field910;
            } else {
                var0.field2702 = client.field874;
            }

        } else if (var2 == 327) {
            var0.field2732 = 150;
            var0.field2719 = (int) (Math.sin((double) client.field655 / 40.0D) * 256.0D) & 2047;
            var0.field2740 = 5;
            var0.field2755 = 0;
        } else if (var2 == 328) {
            var0.field2732 = 150;
            var0.field2719 = (int) (Math.sin((double) client.field655 / 40.0D) * 256.0D) & 2047;
            var0.field2740 = 5;
            var0.field2755 = 1;
        }
    }

    public boolean vmethod706(int var1, int var2, byte var3) {
        return var1 >= (this.field356 << 6) + (this.field359 << 3)
            && var1 <= (this.field356 << 6) + (this.field359 << 3) + 7
            && var2 >= (this.field353 << 6) + (this.field364 << 3)
            && var2 <= (this.field353 << 6) + (this.field364 << 3) + 7;
    }

    public boolean vmethod696(int var1, int var2, int var3, byte var4) {
        return var1 >= this.field361 && var1 < this.field360 + this.field361 ?
            var2 >= (this.field354 << 6) + (this.field358 << 3) && var2 <= (this.field354 << 6) + (
                this.field358 << 3) + 7 && var3 >= (this.field355 << 6) + (this.field357 << 3)
                && var3 <= (this.field355 << 6) + (this.field357 << 3) + 7 : false;
    }

    public void vmethod697(class20 var1, byte var2) {
        if (var1.field198 > this.field356) {
            var1.field198 = this.field356;
        }

        if (var1.field199 < this.field356) {
            var1.field199 = this.field356;
        }

        if (var1.field194 > this.field353) {
            var1.field194 = this.field353;
        }

        if (var1.field203 < this.field353) {
            var1.field203 = this.field353;
        }

    }

    public class228 vmethod695(int var1, int var2, byte var3) {
        if (!this.vmethod706(var1, var2, (byte) 91)) {
            return null;
        } else {
            int var4 =
                this.field354 * 64 - this.field356 * 64 + (this.field358 * 8 - this.field359 * 8)
                    + var1;
            int var5 = this.field355 * 64 - this.field353 * 64 + var2 + (this.field357 * 8
                - this.field364 * 8);
            return new class228(this.field361, var4, var5);
        }
    }

    public int[] vmethod715(int var1, int var2, int var3, int var4) {
        if (!this.vmethod696(var1, var2, var3, (byte) -5)) {
            return null;
        } else {
            int[] var5 = new int[]{
                this.field356 * 64 - this.field354 * 64 + var2 + (this.field359 * 8
                    - this.field358 * 8),
                var3 + (this.field353 * 64 - this.field355 * 64) + (this.field364 * 8
                    - this.field357 * 8)};
            return var5;
        }
    }

    public void vmethod709(Buffer var1, int var2) {
        this.field361 = var1.readUint8();
        this.field360 = var1.readUint8();
        this.field354 = var1.readUint16();
        this.field358 = var1.readUint8();
        this.field355 = var1.readUint16();
        this.field357 = var1.readUint8();
        this.field356 = var1.readUint16();
        this.field359 = var1.readUint8();
        this.field353 = var1.readUint16();
        this.field364 = var1.readUint8();
        this.method700(857882639);
    }

    void method700(int var1) {
    }
}
