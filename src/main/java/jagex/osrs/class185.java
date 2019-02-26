package jagex.osrs;

public class class185 {

    static int field2415;
    static int field2412;
    static int field2413;
    static byte[][] field2414;
    static byte[][] field2418;
    static byte[][] field2416;
    static int[] field2411;
    static class322 field2417;

    static {
        field2415 = 0;
        field2412 = 0;
        field2413 = 0;
        field2414 = new byte[1000][];
        field2418 = new byte[250][];
        field2416 = new byte[50][];
    }

    static synchronized byte[] method3999(int var0, boolean var1, int var2) {
        byte[] var3;
        if (var0 != 100) {
            if (var0 < 100) {
                ;
            }
        } else if (field2415 > 0) {
            var3 = field2414[--field2415];
            field2414[field2415] = null;
            return var3;
        }

        if (var0 != 5000) {
            if (var0 < 5000) {
                ;
            }
        } else if (field2412 > 0) {
            var3 = field2418[--field2412];
            field2418[field2412] = null;
            return var3;
        }

        if (var0 != 30000) {
            if (var0 < 30000) {
                ;
            }
        } else if (field2413 > 0) {
            var3 = field2416[--field2413];
            field2416[field2413] = null;
            return var3;
        }

        if (class296.field3737 != null) {
            for (int var5 = 0; var5 < class25.field253.length; ++var5) {
                if (class25.field253[var5] != var0) {
                    if (var0 < class25.field253[var5]) {
                        ;
                    }
                } else if (field2411[var5] > 0) {
                    byte[] var4 = class296.field3737[var5][--field2411[var5]];
                    class296.field3737[var5][field2411[var5]] = null;
                    return var4;
                }
            }
        }

        return new byte[var0];
    }

    static void method4006(String var0, String var1, String var2, int var3) {
        class79.field1165 = var0;
        class79.field1166 = var1;
        class79.field1167 = var2;
    }
}
