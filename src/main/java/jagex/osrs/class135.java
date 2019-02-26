package jagex.osrs;

public final class class135 {

    public long field1880;
    public class129 field1887;
    public class129 field1888;
    int field1889;
    int field1885;
    int field1881;
    int field1886;
    int field1890;
    int field1891;
    int field1883;
    int field1884;

    class135() {
        this.field1880 = 0L;
        this.field1889 = 0;
    }

    public static void method3266(int var0, byte var1) {
        if (class219.field2529 != 0) {
            class318.field3851 = var0;
        } else {
            class193.field2461.method4426(var0, (byte) -57);
        }

    }

    static int method3265(class66 var0, class66 var1, int var2, boolean var3, int var4) {
        if (var2 == 1) {
            int var5 = var0.field1020;
            int var6 = var1.field1020;
            if (!var3) {
                if (var5 == -1) {
                    var5 = 2001;
                }

                if (var6 == -1) {
                    var6 = 2001;
                }
            }

            return var5 - var6;
        } else {
            return var2 == 2 ? var0.field1021 - var1.field1021
                : (var2 == 3 ? (var0.field1022.equals("-") ? (var1.field1022.equals("-") ? 0
                    : (var3 ? -1 : 1)) : (var1.field1022.equals("-") ? (var3 ? 1 : -1)
                    : var0.field1022.compareTo(var1.field1022)))
                    : (var2 == 4 ? (var0.method1731(-1400916508) ? (var1.method1731(-1400916508) ? 0
                        : 1) : (var1.method1731(-1400916508) ? -1 : 0))
                        : (var2 == 5 ? (var0.method1734((short) 5159) ? (
                            var1.method1734((short) 7135) ? 0 : 1)
                            : (var1.method1734((short) 5472) ? -1 : 0))
                            : (var2 == 6 ? (var0.method1687((byte) -77) ? (
                                var1.method1687((byte) -85) ? 0 : 1)
                                : (var1.method1687((byte) 0) ? -1 : 0))
                                : (var2 == 7 ? (var0.method1684(-1158560872) ? (
                                    var1.method1684(-1158560872) ? 0 : 1)
                                    : (var1.method1684(-1158560872) ? -1 : 0))
                                    : var0.field1015 - var1.field1015)))));
        }
    }
}
