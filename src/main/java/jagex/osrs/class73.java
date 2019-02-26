package jagex.osrs;

import java.io.IOException;

public final class class73 extends class64 {

    class273 field1102;

    public static int checksumIEEE(byte[] var0, int var1, int var2, byte var3) {
        int var4 = -1;

        for (int var5 = var1; var5 < var2; ++var5) {
            var4 = var4 >>> 8 ^ Buffer.field2406[(var4 ^ var0[var5]) & 255];
        }

        var4 = ~var4;
        return var4;
    }

    static final void method1983(boolean var0, int var1) {
        class160.method3502((byte) 68);
        ++client.field690.field1288;
        if (client.field690.field1288 >= 50 || var0) {
            client.field690.field1288 = 0;
            if (!client.field692 && client.field690.method2192((byte) 37) != null) {
                OutboundPacket var2 = class131
                    .method3243(class171.field2224, client.field690.random, (byte) 94);
                client.field690.method2193(var2, -847126258);

                try {
                    client.field690.method2187(2033479085);
                } catch (IOException var4) {
                    client.field692 = true;
                }
            }

        }
    }

    protected final class121 vmethod3236(int var1) {
        if (this.field1102 == null) {
            return null;
        } else {
            class275 var2 = super.field971 != -1 && super.field998 == 0 ? class29
                .method532(super.field971, -1552610333) : null;
            class275 var3 =
                super.field972 != -1 && (super.field944 != super.field972 || var2 == null) ? class29
                    .method532(super.field972, -767183228) : null;
            class121 var4 = this.field1102
                .method5414(var2, super.field986, var3, super.field969, 391625709);
            if (var4 == null) {
                return null;
            } else {
                var4.method2873();
                super.field946 = var4.field1840;
                if (super.field976 != -1 && super.field993 != -1) {
                    class121 var5 = class250.method4918(super.field976, 1359660159)
                                            .method5088(super.field993, -1255734612);
                    if (var5 != null) {
                        var5.method2885(0, -super.field980, 0);
                        class121[] var6 = new class121[]{var4, var5};
                        var4 = new class121(var6, 2);
                    }
                }

                if (this.field1102.field3600 == 1) {
                    var4.field1664 = true;
                }

                return var4;
            }
        }
    }

    final boolean vmethod1973(int var1) {
        return this.field1102 != null;
    }

    final void method1970(int var1, byte var2, int var3) {
        int var4 = super.wx[0];
        int var5 = super.wz[0];
        if (var1 == 0) {
            --var4;
            ++var5;
        }

        if (var1 == 1) {
            ++var5;
        }

        if (var1 == 2) {
            ++var4;
            ++var5;
        }

        if (var1 == 3) {
            --var4;
        }

        if (var1 == 4) {
            ++var4;
        }

        if (var1 == 5) {
            --var4;
            --var5;
        }

        if (var1 == 6) {
            --var5;
        }

        if (var1 == 7) {
            ++var4;
            --var5;
        }

        if (super.field971 != -1 && class29.method532(super.field971, 1830525594).field3632 == 1) {
            super.field971 = -1;
        }

        if (super.field939 < 9) {
            ++super.field939;
        }

        for (int var6 = super.field939; var6 > 0; --var6) {
            super.wx[var6] = super.wx[var6 - 1];
            super.wz[var6] = super.wz[var6 - 1];
            super.field996[var6] = super.field996[var6 - 1];
        }

        super.wx[0] = var4;
        super.wz[0] = var5;
        super.field996[0] = var2;
    }

    final void method1982(int var1, int var2, boolean var3, int var4) {
        if (super.field971 != -1 && class29.method532(super.field971, 962054886).field3632 == 1) {
            super.field971 = -1;
        }

        if (!var3) {
            int var5 = var1 - super.wx[0];
            int var6 = var2 - super.wz[0];
            if (var5 >= -8 && var5 <= 8 && var6 >= -8 && var6 <= 8) {
                if (super.field939 < 9) {
                    ++super.field939;
                }

                for (int var7 = super.field939; var7 > 0; --var7) {
                    super.wx[var7] = super.wx[var7 - 1];
                    super.wz[var7] = super.wz[var7 - 1];
                    super.field996[var7] = super.field996[var7 - 1];
                }

                super.wx[0] = var1;
                super.wz[0] = var2;
                super.field996[0] = 1;
                return;
            }
        }

        super.field939 = 0;
        super.field959 = 0;
        super.field955 = 0;
        super.wx[0] = var1;
        super.wz[0] = var2;
        super.x = super.field964 * 64 + super.wx[0] * 128;
        super.z = super.field964 * 64 + super.wz[0] * 128;
    }
}
