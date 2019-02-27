package jagex.osrs;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

public class class268 extends class208 {

    static class202 field3414;
    static class249 field3419;

    static {
        field3414 = new class202(64);
    }

    public int field3420;
    public String field3421;
    public char field3425;
    public char field3417;
    public int field3415;
    public int[] field3416;
    public String[] field3423;
    public int[] field3422;

    class268() {
        this.field3421 = "null";
        this.field3420 = 0;
    }

    static void method5228(byte var0) {
        if (class69.localPlayer.x >> 7 == client.field722
            && class69.localPlayer.z >> 7 == client.field875) {
            client.field722 = 0;
        }

    }

    static long method5222(int var0) {
        try {
            URL var1 = new URL(
                class56.method1109("services", false, (byte) 0) + "m=accountappeal/login.ws");
            URLConnection var2 = var1.openConnection();
            var2.setRequestProperty("connection", "close");
            var2.setDoInput(true);
            var2.setDoOutput(true);
            var2.setConnectTimeout(5000);
            OutputStreamWriter var3 = new OutputStreamWriter(var2.getOutputStream());
            var3.write("data1=req");
            var3.flush();
            InputStream var4 = var2.getInputStream();
            Buffer var5 = new Buffer(new byte[1000]);

            do {
                int var6 = var4.read(var5.bytes, var5.offset, 1000 - var5.offset);
                if (var6 == -1) {
                    var5.offset = 0;
                    long var8 = var5.method3775((byte) 126);
                    return var8;
                }

                var5.offset += var6;
            } while (var5.offset < 1000);

            return 0L;
        } catch (Exception var10) {
            return 0L;
        }
    }

    void method5224(Buffer var1, int var2, int var3) {
        if (var2 == 1) {
            this.field3425 = (char) var1.readUint8();
        } else if (var2 == 2) {
            this.field3417 = (char) var1.readUint8();
        } else if (var2 == 3) {
            this.field3421 = var1.getString();
        } else if (var2 == 4) {
            this.field3415 = var1.getInt();
        } else {
            int var4;
            if (var2 == 5) {
                this.field3420 = var1.readUint16();
                this.field3416 = new int[this.field3420];
                this.field3423 = new String[this.field3420];

                for (var4 = 0; var4 < this.field3420; ++var4) {
                    this.field3416[var4] = var1.getInt();
                    this.field3423[var4] = var1.getString();
                }
            } else if (var2 == 6) {
                this.field3420 = var1.readUint16();
                this.field3416 = new int[this.field3420];
                this.field3422 = new int[this.field3420];

                for (var4 = 0; var4 < this.field3420; ++var4) {
                    this.field3416[var4] = var1.getInt();
                    this.field3422[var4] = var1.getInt();
                }
            }
        }

    }

    public int method5225(byte var1) {
        return this.field3420;
    }

    void method5223(Buffer var1, int var2) {
        while (true) {
            int var3 = var1.readUint8();
            if (var3 == 0) {
                return;
            }

            this.method5224(var1, var3, 1776134117);
        }
    }
}
