package jagex.osrs;

import java.util.zip.CRC32;

public class class252 {

    public static int field3277;
    public static int field3278;
    public static AbstractSocket field3263;
    static int field3272;
    static class204 field3266;
    static class204 field3270;
    static class196 field3265;
    static int field3262;
    static class204 field3261;
    static long field3260;
    static int field3264;
    static Buffer field3271;
    static class204 field3268;
    static int field3269;
    static int field3267;
    static class251[] field3275;
    static Buffer field3258;
    static int chunkOffset;
    static CRC32 field3274;
    static byte field3279;

    static {
        field3272 = 0;
        field3270 = new class204(4096);
        field3262 = 0;
        field3261 = new class204(32);
        field3264 = 0;
        field3265 = new class196();
        field3266 = new class204(4096);
        field3267 = 0;
        field3268 = new class204(4096);
        field3269 = 0;
        field3258 = new Buffer(8);
        chunkOffset = 0;
        field3274 = new CRC32();
        field3275 = new class251[256];
        field3279 = 0;
        field3277 = 0;
        field3278 = 0;
    }

    static int method4978(int var0, byte var1) {
        return (int) ((Math.log((double) var0) / ScriptExecutor.field1081 - 7.0D) * 256.0D);
    }
}
