package jagex.osrs;

public class class14 implements class31 {

    static boolean field132;
    int field125;
    int field120;
    int field126;
    int field117;
    int field131;
    int field122;
    int field118;
    int field130;
    int field129;
    int field121;
    int field133;
    int field123;
    int field119;
    int field124;

    static void method163(int var0) {
        client.field780 = 0;
        client.field833 = false;
        client.field916[0] = "Cancel";
        client.field786[0] = "";
        client.field783[0] = 1006;
        client.field772[0] = false;
        client.field780 = 1;
    }

    static final boolean method145(class232 var0, int var1) {
        int var2 = var0.field2741;
        if (var2 == 205) {
            client.field725 = 250;
            return true;
        } else {
            int var3;
            int var4;
            if (var2 >= 300 && var2 <= 313) {
                var3 = (var2 - 300) / 2;
                var4 = var2 & 1;
                client.field908.method4665(var3, var4 == 1, (byte) 33);
            }

            if (var2 >= 314 && var2 <= 323) {
                var3 = (var2 - 314) / 2;
                var4 = var2 & 1;
                client.field908.method4666(var3, var4 == 1, 272980366);
            }

            if (var2 == 324) {
                client.field908.method4667(false, 1010932829);
            }

            if (var2 == 325) {
                client.field908.method4667(true, -1901751614);
            }

            if (var2 == 326) {
                OutboundPacket var5 = class131
                    .method3243(class171.field2219, client.field690.random, (byte) 68);
                client.field908.method4668(var5.buffer, -1388801683);
                client.field690.method2193(var5, 1933144112);
                return true;
            } else {
                return false;
            }
        }
    }

    public boolean vmethod706(int var1, int var2, byte var3) {
        return var1 >= (this.field120 << 6) + (this.field126 << 3)
            && var1 <= (this.field120 << 6) + (this.field131 << 3) + 7
            && var2 >= (this.field130 << 6) + (this.field121 << 3)
            && var2 <= (this.field130 << 6) + (this.field133 << 3) + 7;
    }

    public boolean vmethod696(int var1, int var2, int var3, byte var4) {
        return var1 >= this.field125 && var1 < this.field117 + this.field125 ?
            var2 >= (this.field118 << 6) + (this.field122 << 3) && var2 <= (this.field118 << 6) + (
                this.field129 << 3) + 7 && var3 >= (this.field119 << 6) + (this.field123 << 3)
                && var3 <= (this.field119 << 6) + (this.field124 << 3) + 7 : false;
    }

    public void vmethod697(class20 var1, byte var2) {
        if (var1.field198 > this.field120) {
            var1.field198 = this.field120;
        }

        if (var1.field199 < this.field120) {
            var1.field199 = this.field120;
        }

        if (var1.field194 > this.field130) {
            var1.field194 = this.field130;
        }

        if (var1.field203 < this.field130) {
            var1.field203 = this.field130;
        }

    }

    public class228 vmethod695(int var1, int var2, byte var3) {
        if (!this.vmethod706(var1, var2, (byte) 70)) {
            return null;
        } else {
            int var4 =
                this.field118 * 64 - this.field120 * 64 + (this.field122 * 8 - this.field126 * 8)
                    + var1;
            int var5 = this.field119 * 64 - this.field130 * 64 + var2 + (this.field123 * 8
                - this.field121 * 8);
            return new class228(this.field125, var4, var5);
        }
    }

    public int[] vmethod715(int var1, int var2, int var3, int var4) {
        if (!this.vmethod696(var1, var2, var3, (byte) -41)) {
            return null;
        } else {
            int[] var5 = new int[]{
                this.field120 * 64 - this.field118 * 64 + var2 + (this.field126 * 8
                    - this.field122 * 8),
                var3 + (this.field130 * 64 - this.field119 * 64) + (this.field121 * 8
                    - this.field123 * 8)};
            return var5;
        }
    }

    public void vmethod709(Buffer var1, int var2) {
        this.field125 = var1.readUint8();
        this.field117 = var1.readUint8();
        this.field118 = var1.readUint16();
        this.field122 = var1.readUint8();
        this.field129 = var1.readUint8();
        this.field119 = var1.readUint16();
        this.field123 = var1.readUint8();
        this.field124 = var1.readUint8();
        this.field120 = var1.readUint16();
        this.field126 = var1.readUint8();
        this.field131 = var1.readUint8();
        this.field130 = var1.readUint16();
        this.field121 = var1.readUint8();
        this.field133 = var1.readUint8();
        this.method168(-414697091);
    }

    void method168(int var1) {
    }
}
