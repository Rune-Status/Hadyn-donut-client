package jagex.osrs;

import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Calendar;
import javax.imageio.ImageIO;

public class ScriptExecutor {

    static final String[] field1071;
    static final double field1081;
    static int[] field1068;
    static int[][] field1069;
    static int[] field1070;
    static String[] field1065;
    static int field1083;
    static class51[] field1074;
    static Calendar field1076;
    static boolean field1078;
    static boolean field1079;
    static int field1075;
    static int field1072;
    static int[] field1077;
    static String[] field1067;
    static class232 field1080;

    static {
        field1068 = new int[5];
        field1069 = new int[5][5000];
        field1070 = new int[1000];
        field1065 = new String[1000];
        field1083 = 0;
        field1074 = new class51[50];
        field1076 = Calendar.getInstance();
        field1071 = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep",
            "Oct", "Nov", "Dec"};
        field1078 = false;
        field1079 = false;
        field1075 = 0;
        field1081 = Math.log(2.0D);
    }

    static void method1949(int var0) {
        if (class156.field2017.toLowerCase().indexOf("microsoft") != -1) {
            class39.field392[186] = 57;
            class39.field392[187] = 27;
            class39.field392[188] = 71;
            class39.field392[189] = 26;
            class39.field392[190] = 72;
            class39.field392[191] = 73;
            class39.field392[192] = 58;
            class39.field392[219] = 42;
            class39.field392[220] = 74;
            class39.field392[221] = 43;
            class39.field392[222] = 59;
            class39.field392[223] = 28;
        } else {
            class39.field392[44] = 71;
            class39.field392[45] = 26;
            class39.field392[46] = 72;
            class39.field392[47] = 73;
            class39.field392[59] = 57;
            class39.field392[61] = 27;
            class39.field392[91] = 42;
            class39.field392[92] = 74;
            class39.field392[93] = 43;
            class39.field392[192] = 28;
            class39.field392[222] = 58;
            class39.field392[520] = 59;
        }

    }

    static void method1947(class251 var0, int var1, int var2, int var3, byte var4, boolean var5,
                           int var6) {
        long var7 = (long) ((var1 << 16) + var2);
        class248 var9 = (class248) class252.field3270.method4224(var7);
        if (var9 == null) {
            var9 = (class248) class252.field3261.method4224(var7);
            if (var9 == null) {
                var9 = (class248) class252.field3266.method4224(var7);
                if (var9 != null) {
                    if (var5) {
                        var9.method4308();
                        class252.field3270.method4226(var9, var7);
                        --class252.field3267;
                        ++class252.field3262;
                    }

                } else {
                    if (!var5) {
                        var9 = (class248) class252.field3268.method4224(var7);
                        if (var9 != null) {
                            return;
                        }
                    }

                    var9 = new class248();
                    var9.field3219 = var0;
                    var9.field3220 = var3;
                    var9.field3221 = var4;
                    if (var5) {
                        class252.field3270.method4226(var9, var7);
                        ++class252.field3262;
                    } else {
                        class252.field3265.method4146(var9);
                        class252.field3266.method4226(var9, var7);
                        ++class252.field3267;
                    }

                }
            }
        }
    }

    static void method1948(int var0) {
        OutboundPacket var1 = class131
            .method3243(class171.field2242, client.field690.random, (byte) 111);
        var1.buffer.writeByte(class17.getWindowMode());
        var1.buffer.writeShort(class68.windowWidth);
        var1.buffer.writeShort(class141.windowHeight);
        client.field690.method2193(var1, 1443399958);
    }

    public static final class323 method1946(byte[] var0, int var1) {
        BufferedImage var2 = null;

        try {
            var2 = ImageIO.read(new ByteArrayInputStream(var0));
            int var3 = var2.getWidth();
            int var4 = var2.getHeight();
            int[] var5 = new int[var4 * var3];
            PixelGrabber var6 = new PixelGrabber(var2, 0, 0, var3, var4, var5, 0, var3);
            var6.grabPixels();
            return new class323(var5, var3, var4);
        } catch (IOException var8) {
            ;
        } catch (InterruptedException var9) {
            ;
        }

        return new class323(0, 0);
    }

    static void execute(ScriptCall call, int var1) {
        Object[] args = call.arguments;
        class86 var4;
        int var18;
        if (class128.method3234(call.field573, -1048301153)) {
            class152.field1985 = (class36) args[0];
            class257 var5 = class162.method3533(class152.field1985.field343, 32768);
            var4 = class30.method578(call.field573, var5.field3313, var5.field3317, -69024650);
        } else {
            var18 = ((Integer) args[0]).intValue();
            var4 = class9.method99(var18, (byte) 0);
        }

        if (var4 != null) {
            class60.field600 = 0;
            field1072 = 0;
            var18 = -1;
            int[] var6 = var4.field1257;
            int[] var7 = var4.field1252;
            byte var8 = -1;
            field1083 = 0;
            field1078 = false;

            try {
                int var11;
                try {
                    field1077 = new int[var4.field1256];
                    int var9 = 0;
                    field1067 = new String[var4.field1254];
                    int var10 = 0;

                    int var12;
                    String var19;
                    for (var11 = 1; var11 < args.length; ++var11) {
                        if (args[var11] instanceof Integer) {
                            var12 = ((Integer) args[var11]).intValue();
                            if (var12 == -2147483647) {
                                var12 = call.field565;
                            }

                            if (var12 == -2147483646) {
                                var12 = call.field566;
                            }

                            if (var12 == -2147483645) {
                                var12 = call.field570 != null ? call.field570.field2770 : -1;
                            }

                            if (var12 == -2147483644) {
                                var12 = call.field567;
                            }

                            if (var12 == -2147483643) {
                                var12 = call.field570 != null ? call.field570.field2787 : -1;
                            }

                            if (var12 == -2147483642) {
                                var12 = call.field568 != null ? call.field568.field2770 : -1;
                            }

                            if (var12 == -2147483641) {
                                var12 = call.field568 != null ? call.field568.field2787 : -1;
                            }

                            if (var12 == -2147483640) {
                                var12 = call.field569;
                            }

                            if (var12 == -2147483639) {
                                var12 = call.field562;
                            }

                            field1077[var9++] = var12;
                        } else if (args[var11] instanceof String) {
                            var19 = (String) args[var11];
                            if (var19.equals("event_opbase")) {
                                var19 = call.field571;
                            }

                            field1067[var10++] = var19;
                        }
                    }

                    var11 = 0;
                    field1075 = call.field572;

                    while (true) {
                        ++var11;
                        if (var11 > var1) {
                            throw new RuntimeException();
                        }

                        ++var18;
                        int var30 = var6[var18];
                        int var21;
                        if (var30 >= 100) {
                            boolean var34;
                            if (var4.field1252[var18] == 1) {
                                var34 = true;
                            } else {
                                var34 = false;
                            }

                            var21 = class140.method3311(var30, var4, var34, 49958749);
                            switch (var21) {
                                case 0:
                                    return;
                                case 1:
                                default:
                                    break;
                                case 2:
                                    throw new IllegalStateException();
                            }
                        } else if (var30 == 0) {
                            field1070[++class60.field600 - 1] = var7[var18];
                        } else if (var30 == 1) {
                            var12 = var7[var18];
                            field1070[++class60.field600 - 1] = class227.field2629[var12];
                        } else if (var30 == 2) {
                            var12 = var7[var18];
                            class227.field2629[var12] = field1070[--class60.field600];
                            class223.method4595(var12, -1750193407);
                        } else if (var30 == 3) {
                            field1065[++field1072 - 1] = var4.field1255[var18];
                        } else if (var30 == 6) {
                            var18 += var7[var18];
                        } else if (var30 == 7) {
                            class60.field600 -= 2;
                            if (field1070[class60.field600] != field1070[
                                class60.field600 + 1]) {
                                var18 += var7[var18];
                            }
                        } else if (var30 == 8) {
                            class60.field600 -= 2;
                            if (field1070[class60.field600] == field1070[
                                class60.field600 + 1]) {
                                var18 += var7[var18];
                            }
                        } else if (var30 == 9) {
                            class60.field600 -= 2;
                            if (field1070[class60.field600] < field1070[
                                class60.field600 + 1]) {
                                var18 += var7[var18];
                            }
                        } else if (var30 == 10) {
                            class60.field600 -= 2;
                            if (field1070[class60.field600] > field1070[
                                class60.field600 + 1]) {
                                var18 += var7[var18];
                            }
                        } else if (var30 == 21) {
                            if (field1083 == 0) {
                                return;
                            }

                            class51 var35 = field1074[--field1083];
                            var4 = var35.field521;
                            var6 = var4.field1257;
                            var7 = var4.field1252;
                            var18 = var35.field523;
                            field1077 = var35.field514;
                            field1067 = var35.field517;
                        } else if (var30 == 25) {
                            var12 = var7[var18];
                            field1070[++class60.field600 - 1] = class97
                                .method2405(var12, (byte) 116);
                        } else if (var30 == 27) {
                            var12 = var7[var18];
                            class40.method766(var12, field1070[--class60.field600],
                                              1551244815);
                        } else if (var30 == 31) {
                            class60.field600 -= 2;
                            if (field1070[class60.field600] <= field1070[
                                class60.field600 + 1]) {
                                var18 += var7[var18];
                            }
                        } else if (var30 == 32) {
                            class60.field600 -= 2;
                            if (field1070[class60.field600] >= field1070[
                                class60.field600 + 1]) {
                                var18 += var7[var18];
                            }
                        } else if (var30 == 33) {
                            field1070[++class60.field600
                                - 1] = field1077[var7[var18]];
                        } else if (var30 == 34) {
                            field1077[var7[var18]] = field1070[--class60.field600];
                        } else if (var30 == 35) {
                            field1065[++field1072
                                - 1] = field1067[var7[var18]];
                        } else if (var30 == 36) {
                            field1067[var7[var18]] = field1065[--field1072];
                        } else if (var30 == 37) {
                            var12 = var7[var18];
                            field1072 -= var12;
                            String var32 = class25
                                .method477(field1065, field1072, var12, 922841529);
                            field1065[++field1072 - 1] = var32;
                        } else if (var30 == 38) {
                            --class60.field600;
                        } else if (var30 == 39) {
                            --field1072;
                        } else {
                            int var16;
                            if (var30 != 40) {
                                if (var30 == 42) {
                                    field1070[++class60.field600 - 1] = class36.field348
                                        .method2091(var7[var18], -193547956);
                                } else if (var30 == 43) {
                                    class36.field348.method2114(var7[var18],
                                                                field1070[--class60.field600],
                                                                -1482826901);
                                } else if (var30 == 44) {
                                    var12 = var7[var18] >> 16;
                                    var21 = var7[var18] & 65535;
                                    int var22 = field1070[--class60.field600];
                                    if (var22 < 0 || var22 > 5000) {
                                        throw new RuntimeException();
                                    }

                                    field1068[var12] = var22;
                                    byte var23 = -1;
                                    if (var21 == 105) {
                                        var23 = 0;
                                    }

                                    for (var16 = 0; var16 < var22; ++var16) {
                                        field1069[var12][var16] = var23;
                                    }
                                } else if (var30 == 45) {
                                    var12 = var7[var18];
                                    var21 = field1070[--class60.field600];
                                    if (var21 < 0 || var21 >= field1068[var12]) {
                                        throw new RuntimeException();
                                    }

                                    field1070[++class60.field600
                                        - 1] = field1069[var12][var21];
                                } else if (var30 == 46) {
                                    var12 = var7[var18];
                                    class60.field600 -= 2;
                                    var21 = field1070[class60.field600];
                                    if (var21 < 0 || var21 >= field1068[var12]) {
                                        throw new RuntimeException();
                                    }

                                    field1069[var12][var21] = field1070[
                                        class60.field600 + 1];
                                } else if (var30 == 47) {
                                    var19 = class36.field348.method2089(var7[var18], 1425514174);
                                    if (var19 == null) {
                                        var19 = "null";
                                    }

                                    field1065[++field1072 - 1] = var19;
                                } else if (var30 == 48) {
                                    class36.field348.method2106(var7[var18],
                                                                field1065[--field1072],
                                                                (byte) 39);
                                } else {
                                    if (var30 != 60) {
                                        throw new IllegalStateException();
                                    }

                                    class199 var33 = var4.field1253[var7[var18]];
                                    class213 var31 = (class213) var33
                                        .method4185((long) field1070[--class60.field600]);
                                    if (var31 != null) {
                                        var18 += var31.field2512;
                                    }
                                }
                            } else {
                                var12 = var7[var18];
                                class86 var13 = class9.method99(var12, (byte) 0);
                                int[] var14 = new int[var13.field1256];
                                String[] var15 = new String[var13.field1254];

                                for (var16 = 0; var16 < var13.field1258; ++var16) {
                                    var14[var16] = field1070[var16 + (class60.field600
                                        - var13.field1258)];
                                }

                                for (var16 = 0; var16 < var13.field1259; ++var16) {
                                    var15[var16] = field1065[var16 + (field1072
                                        - var13.field1259)];
                                }

                                class60.field600 -= var13.field1258;
                                field1072 -= var13.field1259;
                                class51 var20 = new class51();
                                var20.field521 = var4;
                                var20.field523 = var18;
                                var20.field514 = field1077;
                                var20.field517 = field1067;
                                field1074[++field1083 - 1] = var20;
                                var4 = var13;
                                var6 = var13.field1257;
                                var7 = var13.field1252;
                                var18 = -1;
                                field1077 = var14;
                                field1067 = var15;
                            }
                        }
                    }
                } catch (Exception var28) {
                    StringBuilder var25 = new StringBuilder(30);
                    var25.append("").append(var4.key).append(" ");

                    for (var11 = field1083 - 1; var11 >= 0; --var11) {
                        var25.append("").append(field1074[var11].field521.key)
                             .append(" ");
                    }

                    var25.append("").append(var8);
                    class80.method2041(var25.toString(), var28, 1721189784);
                }
            } finally {
                if (field1078) {
                    field1079 = true;
                    class42.method783(1952311603);
                    field1079 = false;
                    field1078 = false;
                }

            }
        }
    }

    public static void execute(ScriptCall call) {
        execute(call, 500000);
    }
}
