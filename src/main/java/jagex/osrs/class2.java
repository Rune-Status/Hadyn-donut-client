package jagex.osrs;

public class class2 {

    static int field23;
    public final long field16;
    public final int field17;
    public final class4 field19;
    String field20;
    String field18;

    class2(Buffer var1, byte var2, int var3) {
        this.field18 = var1.method3778(-1758603792);
        this.field20 = var1.method3778(-659653692);
        this.field17 = var1.readUint16();
        this.field16 = var1.method3775((byte) 127);
        int var4 = var1.getInt();
        int var5 = var1.getInt();
        this.field19 = new class4();
        this.field19.method56(2, -2026990615);
        this.field19.method38(var2, (byte) -95);
        this.field19.field31 = var4;
        this.field19.field33 = var5;
        this.field19.field38 = 0;
        this.field19.field35 = 0;
        this.field19.field30 = var3;
    }

    static final void method20(byte var0) {
        class157.method3460(-408591114);
        if (class3.field26 != null) {
            class3.field26.method5745(-2054970382);
        }

    }

    static void method24(int var0) {
        client.field690.method2194();
        client.field690.field1283.offset = 0;
        client.field690.packetDescriptor = null;
        client.field690.field1295 = null;
        client.field690.field1284 = null;
        client.field690.field1278 = null;
        client.field690.packetLength = 0;
        client.field690.field1287 = 0;
        client.field662 = 0;
        client.field780 = 0;
        client.field833 = false;
        client.field876 = 0;
        client.field722 = 0;

        int var1;
        for (var1 = 0; var1 < 2048; ++var1) {
            client.players[var1] = null;
        }

        class69.localPlayer = null;

        for (var1 = 0; var1 < client.field806.length; ++var1) {
            class73 var2 = client.field806[var1];
            if (var2 != null) {
                var2.field965 = -1;
                var2.field966 = false;
            }
        }

        class12.method125(2097878590);
        class16.method202(30, -1194677662);

        for (var1 = 0; var1 < 100; ++var1) {
            client.field848[var1] = true;
        }

        class70.method1948(402508794);
    }

    public String method18(int var1) {
        return this.field18;
    }

    public String method19(int var1) {
        return this.field20;
    }
}
