package jagex.osrs;

import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Calendar;
import javax.imageio.ImageIO;

public class class70 {

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
}
