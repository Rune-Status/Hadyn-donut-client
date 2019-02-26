package jagex.osrs;

public class class148 implements class190 {

    public static final class148 field1967;
    public static final class148 field1965;
    public static final class148 field1964;
    public static final class148 field1966;
    public static boolean[] field1970;

    static {
        field1967 = new class148(2, 0);
        field1965 = new class148(0, 1);
        field1964 = new class148(1, 2);
        field1966 = new class148(3, 3);
    }

    public final int field1968;
    final int field1969;

    class148(int var1, int var2) {
        this.field1968 = var1;
        this.field1969 = var2;
    }

    static int method3363(class199 var0, int var1, int var2, byte var3) {
        if (var0 == null) {
            return var2;
        } else {
            class213 var4 = (class213) var0.method4185((long) var1);
            return var4 == null ? var2 : var4.field2512;
        }
    }

    static String method3369(class199 var0, int var1, String var2, short var3) {
        if (var0 == null) {
            return var2;
        } else {
            class197 var4 = (class197) var0.method4185((long) var1);
            return var4 == null ? var2 : (String) var4.field2468;
        }
    }

    static void method3368(int var0) {
        for (class69 var1 = (class69) class69.field1051.method4298(); var1 != null;
             var1 = (class69) class69.field1051.method4283()) {
            if (var1.field1064 != null) {
                class43.field413.method2214(var1.field1064);
                var1.field1064 = null;
            }

            if (var1.field1060 != null) {
                class43.field413.method2214(var1.field1060);
                var1.field1060 = null;
            }
        }

        class69.field1051.method4275();
    }

    static final void method3370(class64 var0, int var1, byte var2) {
        int var3;
        int var4;
        int var5;
        if (var0.field985 > client.field655) {
            var3 = var0.field985 - client.field655;
            var4 = var0.field983 * 128 + var0.field964 * 64;
            var5 = var0.field995 * 128 + var0.field964 * 64;
            var0.x += (var4 - var0.x) / var3;
            var0.z += (var5 - var0.z) / var3;
            var0.field955 = 0;
            var0.field990 = var0.field997;
        } else if (var0.field977 >= client.field655) {
            if (var0.field977 == client.field655 || var0.field971 == -1 || var0.field998 != 0
                || var0.field989 + 1 > class29
                .method532(var0.field971, -742560655).field3630[var0.field986]) {
                var3 = var0.field977 - var0.field985;
                var4 = client.field655 - var0.field985;
                var5 = var0.field983 * 128 + var0.field964 * 64;
                int var6 = var0.field995 * 128 + var0.field964 * 64;
                int var7 = var0.field982 * 128 + var0.field964 * 64;
                int var8 = var0.field984 * 128 + var0.field964 * 64;
                var0.x = (var7 * var4 + var5 * (var3 - var4)) / var3;
                var0.z = (var8 * var4 + var6 * (var3 - var4)) / var3;
            }

            var0.field955 = 0;
            var0.field990 = var0.field997;
            var0.field940 = var0.field990;
        } else {
            class261.method5118(var0, -1658114909);
        }

        if (var0.x < 128 || var0.z < 128 || var0.x >= 13184
            || var0.z >= 13184) {
            var0.field971 = -1;
            var0.field976 = -1;
            var0.field985 = 0;
            var0.field977 = 0;
            var0.x = var0.wx[0] * 128 + var0.field964 * 64;
            var0.z = var0.wz[0] * 128 + var0.field964 * 64;
            var0.method1660((byte) 1);
        }

        if (class69.localPlayer == var0 && (var0.x < 1536 || var0.z < 1536
            || var0.x >= 11776 || var0.z >= 11776)) {
            var0.field971 = -1;
            var0.field976 = -1;
            var0.field985 = 0;
            var0.field977 = 0;
            var0.x = var0.wx[0] * 128 + var0.field964 * 64;
            var0.z = var0.wz[0] * 128 + var0.field964 * 64;
            var0.method1660((byte) 1);
        }

        class39.method759(var0, (short) -5111);
        var0.field941 = false;
        class275 var9;
        if (var0.field972 != -1) {
            var9 = class29.method532(var0.field972, 68039901);
            if (var9 != null && var9.field3623 != null) {
                ++var0.field970;
                if (var0.field969 < var9.field3623.length
                    && var0.field970 > var9.field3630[var0.field969]) {
                    var0.field970 = 1;
                    ++var0.field969;
                    class176
                        .method3692(var9, var0.field969, var0.x, var0.z, -154189101);
                }

                if (var0.field969 >= var9.field3623.length) {
                    var0.field970 = 0;
                    var0.field969 = 0;
                    class176
                        .method3692(var9, var0.field969, var0.x, var0.z, -154189101);
                }
            } else {
                var0.field972 = -1;
            }
        }

        if (var0.field976 != -1 && client.field655 >= var0.field979) {
            if (var0.field993 < 0) {
                var0.field993 = 0;
            }

            var3 = class250.method4918(var0.field976, 1855125780).field3348;
            if (var3 != -1) {
                class275 var10 = class29.method532(var3, -1996134519);
                if (var10 != null && var10.field3623 != null) {
                    ++var0.field978;
                    if (var0.field993 < var10.field3623.length
                        && var0.field978 > var10.field3630[var0.field993]) {
                        var0.field978 = 1;
                        ++var0.field993;
                        class176.method3692(var10, var0.field993, var0.x, var0.z,
                                            -154189101);
                    }

                    if (var0.field993 >= var10.field3623.length && (var0.field993 < 0
                        || var0.field993 >= var10.field3623.length)) {
                        var0.field976 = -1;
                    }
                } else {
                    var0.field976 = -1;
                }
            } else {
                var0.field976 = -1;
            }
        }

        if (var0.field971 != -1 && var0.field998 <= 1) {
            var9 = class29.method532(var0.field971, 1313990379);
            if (var9.field3622 == 1 && var0.field959 > 0 && var0.field985 <= client.field655
                && var0.field977 < client.field655) {
                var0.field998 = 1;
                return;
            }
        }

        if (var0.field971 != -1 && var0.field998 == 0) {
            var9 = class29.method532(var0.field971, 1343612858);
            if (var9 != null && var9.field3623 != null) {
                ++var0.field989;
                if (var0.field986 < var9.field3623.length
                    && var0.field989 > var9.field3630[var0.field986]) {
                    var0.field989 = 1;
                    ++var0.field986;
                    class176
                        .method3692(var9, var0.field986, var0.x, var0.z, -154189101);
                }

                if (var0.field986 >= var9.field3623.length) {
                    var0.field986 -= var9.field3624;
                    ++var0.field975;
                    if (var0.field975 >= var9.field3633) {
                        var0.field971 = -1;
                    } else if (var0.field986 >= 0 && var0.field986 < var9.field3623.length) {
                        class176.method3692(var9, var0.field986, var0.x, var0.z,
                                            -154189101);
                    } else {
                        var0.field971 = -1;
                    }
                }

                var0.field941 = var9.field3626;
            } else {
                var0.field971 = -1;
            }
        }

        if (var0.field998 > 0) {
            --var0.field998;
        }

    }

    public int vmethod6130(byte var1) {
        return this.field1969;
    }
}
