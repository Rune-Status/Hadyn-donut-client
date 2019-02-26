package jagex.osrs;

public class class36 {

    static class84 field348;
    static class58 field347;
    static class322[] field350;
    public int field343;
    public class228 field344;
    public class228 field345;

    public class36(int var1, class228 var2, class228 var3) {
        this.field343 = var1;
        this.field344 = var2;
        this.field345 = var3;
    }

    static void method693(int var0, int var1, int var2, int var3) {
        if (client.field888 != 0 && var1 != 0 && client.field905 < 50) {
            client.field884[client.field905] = var0;
            client.field885[client.field905] = var1;
            client.field793[client.field905] = var2;
            client.field710[client.field905] = null;
            client.field887[client.field905] = 0;
            ++client.field905;
        }

    }

    static String method692(String var0, class232 var1, int var2) {
        if (var0.indexOf("%") != -1) {
            for (int var3 = 1; var3 <= 5; ++var3) {
                while (true) {
                    int var4 = var0.indexOf("%" + var3);
                    if (var4 == -1) {
                        break;
                    }

                    var0 = var0.substring(0, var4) + Buffer
                        .method3994(class74.method1984(var1, var3 - 1, 1939527040), 1596556073)
                        + var0.substring(var4 + 2);
                }
            }
        }

        return var0;
    }

    static void method691(int var0, String var1, int var2) {
        int var3 = class83.field1226;
        int[] var4 = class83.field1222;
        boolean var5 = false;
        class293 var6 = new class293(var1, client.field920);

        for (int var7 = 0; var7 < var3; ++var7) {
            Player var8 = client.players[var4[var7]];
            if (var8 != null && var8 != class69.localPlayer && var8.field625 != null && var8.field625
                .equals(var6)) {
                OutboundPacket var9;
                if (var0 == 1) {
                    var9 = class131
                        .method3243(class171.field2308, client.field690.random, (byte) 53);
                    var9.buffer.writeShort(var4[var7]);
                    var9.buffer.method3796(0, -291762063);
                    client.field690.method2193(var9, 974172654);
                } else if (var0 == 4) {
                    var9 = class131
                        .method3243(class171.field2236, client.field690.random, (byte) 98);
                    var9.buffer.method3806(var4[var7], -431751117);
                    var9.buffer.method3796(0, 845521782);
                    client.field690.method2193(var9, 1929030786);
                } else if (var0 == 6) {
                    var9 = class131
                        .method3243(class171.field2300, client.field690.random, (byte) 23);
                    var9.buffer.method3887(var4[var7], 289154243);
                    var9.buffer.method3797(0, -1552670719);
                    client.field690.method2193(var9, -342509021);
                } else if (var0 == 7) {
                    var9 = class131
                        .method3243(class171.field2282, client.field690.random, (byte) 107);
                    var9.buffer.method3797(0, -1441418903);
                    var9.buffer.method3869(var4[var7], (byte) 1);
                    client.field690.method2193(var9, -754235942);
                }

                var5 = true;
                break;
            }
        }

        if (!var5) {
            class59.method1163(4, "", "Unable to find " + var1, -1483885983);
        }

    }
}
