package jagex.osrs;

import java.math.BigInteger;

public class class74 {

    static final BigInteger field1104;
    static final BigInteger field1109;
    static int field1113;

    static {
        field1104 = new BigInteger(
            "80782894952180643741752986186714059433953886149239752893425047584684715842049");
        field1109 = new BigInteger(
            "7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");
    }

    static void logout() {
        client.field690.method2190((byte) -31);
        class125.method3052(-1338888273);
        class243.field3173.method3057();

        for (int var1 = 0; var1 < 4; ++var1) {
            client.field701[var1].method3612(-1613750531);
        }

        System.gc();
        class180.method3732(2);
        client.field878 = -1;
        client.field879 = false;
        class148.method3368(-1980257067);
        client.setState(10);
    }

    static final int method1984(class232 var0, int var1, int var2) {
        if (var0.field2785 != null && var1 < var0.field2785.length) {
            try {
                int[] var3 = var0.field2785[var1];
                int var4 = 0;
                int var5 = 0;
                byte var6 = 0;

                while (true) {
                    int var7 = var3[var5++];
                    int var8 = 0;
                    byte var9 = 0;
                    if (var7 == 0) {
                        return var4;
                    }

                    if (var7 == 1) {
                        var8 = client.field775[var3[var5++]];
                    }

                    if (var7 == 2) {
                        var8 = client.field776[var3[var5++]];
                    }

                    if (var7 == 3) {
                        var8 = client.field777[var3[var5++]];
                    }

                    int var10;
                    class232 var11;
                    int var12;
                    int var13;
                    if (var7 == 4) {
                        var10 = var3[var5++] << 16;
                        var10 += var3[var5++];
                        var11 = class18.method213(var10, -1683045115);
                        var12 = var3[var5++];
                        if (var12 != -1 && (!ItemConfig.get(var12).field3512
                            || client.field647)) {
                            for (var13 = 0; var13 < var11.field2762.length; ++var13) {
                                if (var12 + 1 == var11.field2762[var13]) {
                                    var8 += var11.field2792[var13];
                                }
                            }
                        }
                    }

                    if (var7 == 5) {
                        var8 = class227.field2629[var3[var5++]];
                    }

                    if (var7 == 6) {
                        var8 = class236.field2844[client.field776[var3[var5++]] - 1];
                    }

                    if (var7 == 7) {
                        var8 = class227.field2629[var3[var5++]] * 100 / 46875;
                    }

                    if (var7 == 8) {
                        var8 = class69.localPlayer.field611;
                    }

                    if (var7 == 9) {
                        for (var10 = 0; var10 < 25; ++var10) {
                            if (class236.field2842[var10]) {
                                var8 += client.field776[var10];
                            }
                        }
                    }

                    if (var7 == 10) {
                        var10 = var3[var5++] << 16;
                        var10 += var3[var5++];
                        var11 = class18.method213(var10, -490736277);
                        var12 = var3[var5++];
                        if (var12 != -1 && (!ItemConfig.get(var12).field3512
                            || client.field647)) {
                            for (var13 = 0; var13 < var11.field2762.length; ++var13) {
                                if (var12 + 1 == var11.field2762[var13]) {
                                    var8 = 999999999;
                                    break;
                                }
                            }
                        }
                    }

                    if (var7 == 11) {
                        var8 = client.field810;
                    }

                    if (var7 == 12) {
                        var8 = client.field851;
                    }

                    if (var7 == 13) {
                        var10 = class227.field2629[var3[var5++]];
                        int var14 = var3[var5++];
                        var8 = (var10 & 1 << var14) != 0 ? 1 : 0;
                    }

                    if (var7 == 14) {
                        var10 = var3[var5++];
                        var8 = class97.method2405(var10, (byte) 85);
                    }

                    if (var7 == 15) {
                        var9 = 1;
                    }

                    if (var7 == 16) {
                        var9 = 2;
                    }

                    if (var7 == 17) {
                        var9 = 3;
                    }

                    if (var7 == 18) {
                        var8 = (class69.localPlayer.x >> 7) + class49.sceneX;
                    }

                    if (var7 == 19) {
                        var8 = (class69.localPlayer.z >> 7) + class11.sceneZ;
                    }

                    if (var7 == 20) {
                        var8 = var3[var5++];
                    }

                    if (var9 == 0) {
                        if (var6 == 0) {
                            var4 += var8;
                        }

                        if (var6 == 1) {
                            var4 -= var8;
                        }

                        if (var6 == 2 && var8 != 0) {
                            var4 /= var8;
                        }

                        if (var6 == 3) {
                            var4 *= var8;
                        }

                        var6 = 0;
                    } else {
                        var6 = var9;
                    }
                }
            } catch (Exception var15) {
                return -1;
            }
        } else {
            return -2;
        }
    }

    static int method1994(int var0, class86 var1, boolean var2, int var3) {
        if (var0 == 5630) {
            client.field725 = 250;
            return 1;
        } else {
            return 2;
        }
    }

    static void method1993(boolean var0, int var1) {
        client.field790 = var0;
    }

    public static String method1996(CharSequence var0, int var1) {
        int var2 = var0.length();
        StringBuilder var3 = new StringBuilder(var2);

        for (int var4 = 0; var4 < var2; ++var4) {
            char var5 = var0.charAt(var4);
            if ((var5 < 'a' || var5 > 'z') && (var5 < 'A' || var5 > 'Z') && (var5 < '0'
                || var5 > '9') && var5 != '.' && var5 != '-' && var5 != '*' && var5 != '_') {
                if (var5 == ' ') {
                    var3.append('+');
                } else {
                    byte var6 = class131.method3242(var5, (byte) 0);
                    var3.append('%');
                    int var7 = var6 >> 4 & 15;
                    if (var7 >= 10) {
                        var3.append((char) (var7 + 55));
                    } else {
                        var3.append((char) (var7 + 48));
                    }

                    var7 = var6 & 15;
                    if (var7 >= 10) {
                        var3.append((char) (var7 + 55));
                    } else {
                        var3.append((char) (var7 + 48));
                    }
                }
            } else {
                var3.append(var5);
            }
        }

        return var3.toString();
    }
}
