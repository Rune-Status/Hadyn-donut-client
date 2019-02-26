package jagex.osrs;

public class HandshakePacket implements class169 {

    public static final HandshakePacket field2313;
    public static final HandshakePacket field2311;
    public static final HandshakePacket field2312;
    static final HandshakePacket field2310;
    static final HandshakePacket field2315;
    static final HandshakePacket[] field2309;

    static {
        field2313 = new HandshakePacket(14, 0);
        field2310 = new HandshakePacket(15, 4);
        field2311 = new HandshakePacket(16, -2);
        field2312 = new HandshakePacket(18, -2);
        field2315 = new HandshakePacket(27, 0);
        field2309 = new HandshakePacket[32];
        HandshakePacket[] var0 = class6.method70((byte) -90);

        for (int var1 = 0; var1 < var0.length; ++var1) {
            field2309[var0[var1].field2314] = var0[var1];
        }

    }

    public final int field2314;

    HandshakePacket(int var1, int var2) {
        this.field2314 = var1;
    }

    public static int method3663(CharSequence var0, int var1) {
        return class161.method3532(var0, 10, true, 2110567404);
    }

    static final void method3664(String var0, int var1) {
        class34.method643(var0 + " is already on your ignore list", 54526995);
    }

    static class245[] method3658(int var0) {
        return new class245[]{class245.field3194, class245.field3199, class245.field3195,
            class245.field3201};
    }

    public static boolean method3662(int var0, byte var1) {
        return (var0 >> 30 & 1) != 0;
    }
}
