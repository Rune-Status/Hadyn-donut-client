package jagex.osrs;

public final class PacketBuffer extends Buffer {

    static final int[] field2445;

    static {
        field2445 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383,
            32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215,
            33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
    }

    IssacRandom field2446;
    int bitOffset;

    public PacketBuffer(int var1) {
        super(var1);
    }

    public boolean method4048(byte var1) {
        int var2 = super.bytes[super.offset] - this.field2446.method4084((byte) -38) & 255;
        return var2 >= 128;
    }

    public void method4046(IssacRandom var1, short var2) {
        this.field2446 = var1;
    }

    public void method4047(int var1, byte var2) {
        super.bytes[++super.offset - 1] = (byte) (var1 + this.field2446
            .next());
    }

    public void startBitAccess() {
        this.bitOffset = super.offset * 8;
    }

    public void endBitAccess() {
        super.offset = (this.bitOffset + 7) / 8;
    }

    public int readBits(int var1) {
        int var3 = this.bitOffset >> 3;
        int var4 = 8 - (this.bitOffset & 7);
        int var5 = 0;

        for (this.bitOffset += var1; var1 > var4; var4 = 8) {
            var5 += (super.bytes[var3++] & field2445[var4]) << var1 - var4;
            var1 -= var4;
        }

        if (var4 == var1) {
            var5 += super.bytes[var3] & field2445[var4];
        } else {
            var5 += super.bytes[var3] >> var4 - var1 & field2445[var1];
        }

        return var5;
    }

    public int method4054(int var1, int var2) {
        return var1 * 8 - this.bitOffset;
    }

    public int readEncipheredUInt8(byte var1) {
        return super.bytes[++super.offset - 1] - this.field2446.next() & 255;
    }

    public int readEncipheredShort(int var1) {
        int var2 =
            super.bytes[++super.offset - 1] - this.field2446.next() & 255;
        return var2 < 128 ? var2 : (var2 - 128 << 8) + (
            super.bytes[++super.offset - 1] - this.field2446.next() & 255);
    }

    public void method4058(byte[] var1, int var2, int var3, int var4) {
        for (int var5 = 0; var5 < var3; ++var5) {
            var1[var5 + var2] = (byte) (super.bytes[++super.offset - 1] - this.field2446
                .next());
        }

    }

    public void initializeRandom(int[] var1, byte var2) {
        this.field2446 = new IssacRandom(var1);
    }
}
