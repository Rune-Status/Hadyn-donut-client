package jagex.osrs;

import java.io.DataInputStream;
import java.net.URL;

public final class class80 extends class129 {

    int field1196;
    boolean field1193;
    int field1206;
    int field1189;
    double field1185;
    double field1197;
    int field1205;
    int field1202;
    int field1198;
    int field1203;
    double field1191;
    double field1182;
    int field1195;
    int field1183;
    double field1184;
    double field1200;
    double field1201;
    int field1186;
    int field1188;
    double field1199;
    int field1190;
    int field1192;
    int field1194;
    int field1187;
    class275 field1204;

    class80(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8,
            int var9, int var10, int var11) {
        this.field1193 = false;
        this.field1205 = 0;
        this.field1198 = 0;
        this.field1196 = var1;
        this.field1183 = var2;
        this.field1206 = var3;
        this.field1202 = var4;
        this.field1186 = var5;
        this.field1188 = var6;
        this.field1189 = var7;
        this.field1190 = var8;
        this.field1195 = var9;
        this.field1192 = var10;
        this.field1187 = var11;
        this.field1193 = false;
        int var12 = class250.method4918(this.field1196, 1934404945).field3348;
        if (var12 != -1) {
            this.field1204 = class29.method532(var12, 56870308);
        } else {
            this.field1204 = null;
        }

    }

    public static void method2041(String var0, Throwable var1, int var2) {
        try {
            String var3 = "";
            if (var1 != null) {
                var3 = class113.method2767(var1, 899022447);
            }

            if (var0 != null) {
                if (var1 != null) {
                    var3 = var3 + " | ";
                }

                var3 = var3 + var0;
            }

            System.out.println("Error: " + var3);
            var3 = var3.replace(':', '.');
            var3 = var3.replace('@', '_');
            var3 = var3.replace('&', '_');
            var3 = var3.replace('#', '_');
            if (class154.field1999 == null) {
                return;
            }

            URL var4 = new URL(class154.field1999.getCodeBase(),
                               "clienterror.ws?c=" + class313.field3831 + "&u=" + class154.field1995
                                   + "&v1=" + class156.field2017 + "&v2=" + class156.field2013
                                   + "&ct=" + class25.field256 + "&e=" + var3);
            DataInputStream var5 = new DataInputStream(var4.openStream());
            var5.read();
            var5.close();
        } catch (Exception var6) {
            ;
        }

    }

    static final void method2053(int var0) {
        for (int var1 = 0; var1 < client.field686; ++var1) {
            int var2 = client.field687[var1];
            class73 var3 = client.field806[var2];
            if (var3 != null) {
                class148.method3370(var3, var3.field1102.field3600, (byte) 15);
            }
        }

    }

    static class86 method2052(byte[] var0, byte var1) {
        class86 var2 = new class86();
        Buffer var3 = new Buffer(var0);
        var3.offset = var3.bytes.length - 2;
        int var4 = var3.readUint16();
        int var5 = var3.bytes.length - 2 - var4 - 12;
        var3.offset = var5;
        int var6 = var3.getInt();
        var2.field1256 = var3.readUint16();
        var2.field1254 = var3.readUint16();
        var2.field1258 = var3.readUint16();
        var2.field1259 = var3.readUint16();
        int var7 = var3.getUByte();
        int var8;
        int var9;
        if (var7 > 0) {
            var2.field1253 = var2.method2151(var7, 1546112737);

            for (var8 = 0; var8 < var7; ++var8) {
                var9 = var3.readUint16();
                class199 var10 = new class199(var9 > 0 ? class3.method28(var9, 1511850448) : 1);
                var2.field1253[var8] = var10;

                while (var9-- > 0) {
                    int var11 = var3.getInt();
                    int var12 = var3.getInt();
                    var10.method4170(new class213(var12), (long) var11);
                }
            }
        }

        var3.offset = 0;
        var3.method3777(1899282554);
        var2.field1257 = new int[var6];
        var2.field1252 = new int[var6];
        var2.field1255 = new String[var6];

        for (var8 = 0; var3.offset < var5; var2.field1257[var8++] = var9) {
            var9 = var3.readUint16();
            if (var9 == 3) {
                var2.field1255[var8] = var3.method3778(-1705418709);
            } else if (var9 < 100 && var9 != 21 && var9 != 38 && var9 != 39) {
                var2.field1252[var8] = var3.getInt();
            } else {
                var2.field1252[var8] = var3.getUByte();
            }
        }

        return var2;
    }

    protected final class121 vmethod3236(int var1) {
        class260 var2 = class250.method4918(this.field1196, 818778075);
        class121 var3 = var2.method5088(this.field1205, -1937510565);
        if (var3 == null) {
            return null;
        } else {
            var3.method2938(this.field1203);
            return var3;
        }
    }

    final void method2048(int var1, int var2) {
        this.field1193 = true;
        this.field1185 += (double) var1 * this.field1197;
        this.field1191 += this.field1182 * (double) var1;
        this.field1184 +=
            this.field1200 * (double) var1 + (double) var1 * 0.5D * this.field1201 * (double) var1;
        this.field1200 += this.field1201 * (double) var1;
        this.field1194 =
            (int) (Math.atan2(this.field1197, this.field1182) * 325.949D) + 1024 & 2047;
        this.field1203 = (int) (Math.atan2(this.field1200, this.field1199) * 325.949D) & 2047;
        if (this.field1204 != null) {
            this.field1198 += var1;

            while (true) {
                do {
                    do {
                        if (this.field1198 <= this.field1204.field3630[this.field1205]) {
                            return;
                        }

                        this.field1198 -= this.field1204.field3630[this.field1205];
                        ++this.field1205;
                    } while (this.field1205 < this.field1204.field3623.length);

                    this.field1205 -= this.field1204.field3624;
                } while (this.field1205 >= 0 && this.field1205 < this.field1204.field3623.length);

                this.field1205 = 0;
            }
        }
    }

    final void method2042(int var1, int var2, int var3, int var4, int var5) {
        double var6;
        if (!this.field1193) {
            var6 = (double) (var1 - this.field1206);
            double var8 = (double) (var2 - this.field1202);
            double var10 = Math.sqrt(var8 * var8 + var6 * var6);
            this.field1185 = (double) this.field1206 + var6 * (double) this.field1195 / var10;
            this.field1191 = (double) this.field1202 + var8 * (double) this.field1195 / var10;
            this.field1184 = (double) this.field1186;
        }

        var6 = (double) (this.field1189 + 1 - var4);
        this.field1197 = ((double) var1 - this.field1185) / var6;
        this.field1182 = ((double) var2 - this.field1191) / var6;
        this.field1199 = Math
            .sqrt(this.field1197 * this.field1197 + this.field1182 * this.field1182);
        if (!this.field1193) {
            this.field1200 = -this.field1199 * Math.tan((double) this.field1190 * 0.02454369D);
        }

        this.field1201 =
            2.0D * ((double) var3 - this.field1184 - var6 * this.field1200) / (var6 * var6);
    }
}
