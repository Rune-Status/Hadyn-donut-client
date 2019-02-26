package jagex.osrs;

public class class9 {

    static class251 index4;
    static int field68;
    static int field70;
    static int field69;

    static void method104(int var0, String var1, String var2, String var3, byte var4) {
        class88 var5 = (class88) class85.field1248.get(Integer.valueOf(var0));
        if (var5 == null) {
            var5 = new class88();
            class85.field1248.put(Integer.valueOf(var0), var5);
        }

        class59 var6 = var5.method2174(var0, var1, var2, var3, 1852825408);
        class85.field1249.method4170(var6, (long) var6.field595);
        class85.field1247.method4356(var6);
        client.field835 = client.field828;
    }

    static class86 method99(int var0, byte var1) {
        class86 var2 = (class86) class86.field1261.method4198((long) var0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class137.index12.method4831(var0, 0, 1789634852);
            if (var3 == null) {
                return null;
            } else {
                var2 = class80.method2052(var3, (byte) 117);
                class86.field1261.method4204(var2, (long) var0);
                return var2;
            }
        }
    }

    public static class232 method102(int var0, int var1, int var2) {
        class232 var3 = class18.method213(var0, -1631303516);
        return var1 == -1 ? var3
            : (var3 != null && var3.field2791 != null && var1 < var3.field2791.length
                ? var3.field2791[var1] : null);
    }

    public static int method98(int var0, byte var1) {
        return var0 >> 11 & 63;
    }

    static char method100(char var0, int var1) {
        return (char) (var0 == 198 ? 69 : (var0 == 230 ? 101
            : (var0 == 223 ? 115 : (var0 == 338 ? 69 : (var0 == 339 ? 'e' : '\u0000')))));
    }
}
