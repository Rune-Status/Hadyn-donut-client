package jagex.osrs;

public class class131 {

    public static char field1856;
    int field1852;
    int field1853;
    int field1854;

    public static byte method3242(char var0, byte var1) {
        byte var2;
        if (var0 > 0 && var0 < 128 || var0 >= 160 && var0 <= 255) {
            var2 = (byte) var0;
        } else if (var0 == 8364) {
            var2 = -128;
        } else if (var0 == 8218) {
            var2 = -126;
        } else if (var0 == 402) {
            var2 = -125;
        } else if (var0 == 8222) {
            var2 = -124;
        } else if (var0 == 8230) {
            var2 = -123;
        } else if (var0 == 8224) {
            var2 = -122;
        } else if (var0 == 8225) {
            var2 = -121;
        } else if (var0 == 710) {
            var2 = -120;
        } else if (var0 == 8240) {
            var2 = -119;
        } else if (var0 == 352) {
            var2 = -118;
        } else if (var0 == 8249) {
            var2 = -117;
        } else if (var0 == 338) {
            var2 = -116;
        } else if (var0 == 381) {
            var2 = -114;
        } else if (var0 == 8216) {
            var2 = -111;
        } else if (var0 == 8217) {
            var2 = -110;
        } else if (var0 == 8220) {
            var2 = -109;
        } else if (var0 == 8221) {
            var2 = -108;
        } else if (var0 == 8226) {
            var2 = -107;
        } else if (var0 == 8211) {
            var2 = -106;
        } else if (var0 == 8212) {
            var2 = -105;
        } else if (var0 == 732) {
            var2 = -104;
        } else if (var0 == 8482) {
            var2 = -103;
        } else if (var0 == 353) {
            var2 = -102;
        } else if (var0 == 8250) {
            var2 = -101;
        } else if (var0 == 339) {
            var2 = -100;
        } else if (var0 == 382) {
            var2 = -98;
        } else if (var0 == 376) {
            var2 = -97;
        } else {
            var2 = 63;
        }

        return var2;
    }

    public static OutboundPacket method3243(class171 var0, IssacRandom var1, byte var2) {
        OutboundPacket var3 = class171.method3655(-312010891);
        var3.field2331 = var0;
        var3.field2330 = var0.field2280;
        if (var3.field2330 == -1) {
            var3.buffer = new PacketBuffer(260);
        } else if (var3.field2330 == -2) {
            var3.buffer = new PacketBuffer(10000);
        } else if (var3.field2330 <= 18) {
            var3.buffer = new PacketBuffer(20);
        } else if (var3.field2330 <= 98) {
            var3.buffer = new PacketBuffer(100);
        } else {
            var3.buffer = new PacketBuffer(260);
        }

        var3.buffer.method4046(var1, (short) 29081);
        var3.buffer.method4047(var3.field2331.field2307, (byte) 104);
        var3.field2333 = 0;
        return var3;
    }
}
