package jagex.osrs;

public class class193 {

    public static class220 field2461;
    static class248 field2460;

    static final boolean method4099(byte[] var0, int var1, int var2, byte var3) {
        boolean var4 = true;
        Buffer var5 = new Buffer(var0);
        int var6 = -1;

        label68:
        while (true) {
            int var7 = var5.method3784(2135142169);
            if (var7 == 0) {
                return var4;
            }

            var6 += var7;
            int var8 = 0;
            boolean var9 = false;

            while (true) {
                int var10;
                while (!var9) {
                    var10 = var5.method3783(-1132618777);
                    if (var10 == 0) {
                        continue label68;
                    }

                    var8 += var10 - 1;
                    int var11 = var8 & 63;
                    int var12 = var8 >> 6 & 63;
                    int var13 = var5.getUByte() >> 2;
                    int var14 = var12 + var1;
                    int var15 = var11 + var2;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class270 var16 = class253.method4993(var6, (byte) 47);
                        if (var13 != 22 || !client.lowMemory || var16.field3470 != 0
                            || var16.field3495 == 1 || var16.field3489) {
                            if (!var16.method5274(-1968694969)) {
                                ++client.field753;
                                var4 = false;
                            }

                            var9 = true;
                        }
                    }
                }

                var10 = var5.method3783(2039064446);
                if (var10 == 0) {
                    break;
                }

                var5.getUByte();
            }
        }
    }
}
