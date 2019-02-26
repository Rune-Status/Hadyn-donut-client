package jagex.osrs;

public class class4 {

    public static class225 field39;
    static class249 field32;
    public int field31;
    public int field33;
    public int field30;
    public int field38;
    public int field35;
    byte field40;

    public class4() {
    }

    public class4(Buffer var1, boolean var2) {
        this.field40 = var1.method3931(2042484382);
        this.field30 = var1.readUint16();
        this.field31 = var1.getInt();
        this.field33 = var1.getInt();
        this.field38 = var1.getInt();
        this.field35 = var1.getInt();
    }

    static int method55(int var0, int var1, int var2) {
        class54 var3 = (class54) class54.field534.method4224((long) var0);
        return var3 == null ? -1
            : (var1 >= 0 && var1 < var3.field533.length ? var3.field533[var1] : -1);
    }

    static final void method43(String var0, int var1) {
        if (class3.field26 != null) {
            OutboundPacket var2 = class131
                .method3243(class171.field2220, client.field690.random, (byte) 50);
            var2.buffer.writeByte(class97.method2404(var0, -2099318662));
            var2.buffer.writeString(var0);
            client.field690.method2193(var2, 1469048902);
        }
    }

    void method56(int var1, int var2) {
        this.field40 &= -8;
        this.field40 = (byte) (this.field40 | var1 & 7);
    }

    void method38(int var1, byte var2) {
        this.field40 &= -9;
        if (var1 == 1) {
            this.field40 = (byte) (this.field40 | 8);
        }

    }

    public int method41(int var1) {
        return (this.field40 & 8) == 8 ? 1 : 0;
    }

    public int method40(byte var1) {
        return this.field40 & 7;
    }
}
