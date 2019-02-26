package jagex.osrs;

import java.text.DecimalFormat;
import java.util.concurrent.ScheduledExecutorService;

public class class79 {

    static int field1143;
    static ScheduledExecutorService field1155;
    static int field1144;
    static int[] field1162;
    static int field1152;
    static int field1153;
    static int field1160;
    static int field1163;
    static int field1173;
    static int field1161;
    static int field1142;
    static int field1156;
    static Buffer releaseManifest;
    static int field1157;
    static int field1158;
    static String field1159;
    static String field1168;
    static String field1165;
    static String field1166;
    static boolean field1176;
    static String field1167;
    static String username;
    static String password;
    static boolean field1170;
    static boolean field1171;
    static boolean field1172;
    static int field1150;
    static int field1164;
    static class323 field1145;
    static class323 field1146;
    static long field1178;
    static long field1179;
    static boolean field1174;
    static class322 field1149;
    static class322[] field1147;
    static int[] field1151;
    static class322 field1148;
    static class315 field1177;

    static {
        field1143 = 0;
        field1144 = field1143 + 202;
        field1162 = new int[256];
        field1152 = 0;
        field1153 = 0;
        field1160 = 0;
        field1173 = 0;
        field1156 = 0;
        field1157 = 0;
        field1158 = 10;
        field1159 = "";
        field1142 = -1;
        field1161 = 1;
        field1163 = 0;
        field1168 = "";
        field1165 = "";
        field1166 = "";
        field1167 = "";
        username = "";
        password = "";
        field1170 = false;
        field1171 = false;
        field1172 = true;
        field1150 = 0;
        field1176 = false;
        field1164 = -1;
        new DecimalFormat("##0.00");
        new class150();
        field1178 = -1L;
        field1179 = -1L;
    }

    public static final void method2039(String var0, String var1, int var2, int var3, int var4,
                                        int var5, int var6) {
        class183.method3749(var0, var1, var2, var3, var4, var5, false, (byte) -75);
    }

    static final int method2040(int var0, int var1, int var2, int var3) {
        int var4 = 256 - var2;
        return ((var1 & 65280) * var2 + (var0 & 65280) * var4 & 16711680) + (
            (var1 & 16711935) * var2 + var4 * (var0 & 16711935) & -16711936) >> 8;
    }

    public static void method2036(int var0, int var1) {
        if (var0 != -1) {
            if (class148.field1970[var0]) {
                class232.field2757.method4843(var0, -1595456400);
                if (class145.field1951[var0] != null) {
                    boolean var2 = true;

                    for (int var3 = 0; var3 < class145.field1951[var0].length; ++var3) {
                        if (class145.field1951[var0][var3] != null) {
                            if (class145.field1951[var0][var3].field2808 != 2) {
                                class145.field1951[var0][var3] = null;
                            } else {
                                var2 = false;
                            }
                        }
                    }

                    if (var2) {
                        class145.field1951[var0] = null;
                    }

                    class148.field1970[var0] = false;
                }
            }
        }
    }
}
