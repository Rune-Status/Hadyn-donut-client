package jagex.osrs;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

public final class class114 {

    static int field1513;
    class129 field1512;
    int field1516;
    int field1514;
    int field1515;
    long field1518;
    class129 field1520;
    class129 field1517;
    int field1519;

    static final boolean method2769(int var0, int var1, int var2) {
        class270 var3 = class253.method4993(var0, (byte) -73);
        if (var1 == 11) {
            var1 = 10;
        }

        if (var1 >= 5 && var1 <= 8) {
            var1 = 4;
        }

        return var3.method5301(var1, 150186764);
    }

    static final int method2768(long var0, String var2, int var3) {
        Random var4 = new Random();
        Buffer var5 = new Buffer(128);
        Buffer var6 = new Buffer(128);
        int[] var7 = new int[]{var4.nextInt(), var4.nextInt(), (int) (var0 >> 32), (int) var0};
        var5.writeByte(10);

        int var8;
        for (var8 = 0; var8 < 4; ++var8) {
            var5.writeInt(var4.nextInt());
        }

        var5.writeInt(var7[0]);
        var5.writeInt(var7[1]);
        var5.writeLong(var0);
        var5.writeLong(0L);

        for (var8 = 0; var8 < 4; ++var8) {
            var5.writeInt(var4.nextInt());
        }

        var5.encipherRsa(class74.field1104, class74.field1109);
        var6.writeByte(10);

        for (var8 = 0; var8 < 3; ++var8) {
            var6.writeInt(var4.nextInt());
        }

        var6.writeLong(var4.nextLong());
        var6.method3757(var4.nextLong());
        class256.writeUid(var6);
        var6.writeLong(var4.nextLong());
        var6.encipherRsa(class74.field1104, class74.field1109);
        var8 = class97.method2404(var2, -1088172994);
        if (var8 % 8 != 0) {
            var8 += 8 - var8 % 8;
        }

        Buffer var9 = new Buffer(var8);
        var9.writeString(var2);
        var9.offset = var8;
        var9.method3788(var7, (short) 334);
        Buffer var10 = new Buffer(var6.offset + var5.offset + var9.offset + 5);
        var10.writeByte(2);
        var10.writeByte(var5.offset);
        var10.writeBytes(var5.bytes, 0, var5.offset);
        var10.writeByte(var6.offset);
        var10.writeBytes(var6.bytes, 0, var6.offset);
        var10.writeShort(var9.offset);
        var10.writeBytes(var9.bytes, 0, var9.offset);
        byte[] var12 = var10.bytes;
        String var11 = class88.method2173(var12, 0, var12.length, 1245513971);
        String var13 = var11;

        try {
            URL var14 = new URL(
                class56.method1109("services", false, (byte) 0) + "m=accountappeal/login.ws");
            URLConnection var15 = var14.openConnection();
            var15.setDoInput(true);
            var15.setDoOutput(true);
            var15.setConnectTimeout(5000);
            OutputStreamWriter var16 = new OutputStreamWriter(var15.getOutputStream());
            var16.write("data2=" + class74.method1996(var13, 2126661525) + "&dest=" + class74
                .method1996("passwordchoice.ws", 1150749248));
            var16.flush();
            InputStream var17 = var15.getInputStream();
            var10 = new Buffer(new byte[1000]);

            do {
                int var18 = var17.read(var10.bytes, var10.offset, 1000 - var10.offset);
                if (var18 == -1) {
                    var16.close();
                    var17.close();
                    String var19 = new String(var10.bytes);
                    if (var19.startsWith("OFFLINE")) {
                        return 4;
                    } else if (var19.startsWith("WRONG")) {
                        return 7;
                    } else if (var19.startsWith("RELOAD")) {
                        return 3;
                    } else if (var19.startsWith("Not permitted for social network accounts.")) {
                        return 6;
                    } else {
                        var10.method3918(var7, 34938715);

                        while (var10.offset > 0 && var10.bytes[var10.offset - 1] == 0) {
                            --var10.offset;
                        }

                        var19 = new String(var10.bytes, 0, var10.offset);
                        if (Player.method1218(var19, -1938910227)) {
                            class138.openUrl(var19, true, false, (short) 2500);
                            return 2;
                        } else {
                            return 5;
                        }
                    }
                }

                var10.offset += var18;
            } while (var10.offset < 1000);

            return 5;
        } catch (Throwable var20) {
            var20.printStackTrace();
            return 5;
        }
    }
}
