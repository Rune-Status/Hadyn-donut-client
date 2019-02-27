package jagex.osrs;

public class class59 extends class208 {

    public static int field598;
    static class1 field590;
    class291 field593;
    String field591;
    class291 field594;
    class293 field592;
    int field595;
    int field589;
    int field597;
    String field596;
    String field588;

    class59(int var1, String var2, String var3, String var4) {
        this.field593 = class291.field3713;
        this.field594 = class291.field3713;
        int var5 = ++class85.field1246 - 1;
        this.field595 = var5;
        this.field589 = client.field655;
        this.field597 = var1;
        this.field591 = var2;
        this.method1141(-1866478842);
        this.field596 = var3;
        this.field588 = var4;
    }

    static void method1163(int var0, String var1, String var2, int var3) {
        class9.method104(var0, var1, var2, (String) null, (byte) -97);
    }

    static int method1144(int var0, class86 var1, boolean var2, int var3) {
        class232 var4 = var2 ? class10.field75 : ScriptExecutor.field1080;
        if (var0 == 1700) {
            ScriptExecutor.field1070[++class60.field600 - 1] = var4.field2793;
            return 1;
        } else if (var0 == 1701) {
            if (var4.field2793 != -1) {
                ScriptExecutor.field1070[++class60.field600 - 1] = var4.field2794;
            } else {
                ScriptExecutor.field1070[++class60.field600 - 1] = 0;
            }

            return 1;
        } else if (var0 == 1702) {
            ScriptExecutor.field1070[++class60.field600 - 1] = var4.field2787;
            return 1;
        } else {
            return 2;
        }
    }

    static boolean method1164(int var0) {
        return client.field790;
    }

    void method1137(byte var1) {
        this.field593 =
            InboundPacketDescriptor.field2150.field1040.method5608(this.field592, (byte) 40) ? class291.field3712
                : class291.field3711;
    }

    void method1140(int var1) {
        this.field594 =
            InboundPacketDescriptor.field2150.field1041.method5608(this.field592, (byte) 40) ? class291.field3712
                : class291.field3711;
    }

    void method1134(int var1, String var2, String var3, String var4, int var5) {
        int var6 = ++class85.field1246 - 1;
        this.field595 = var6;
        this.field589 = client.field655;
        this.field597 = var1;
        this.field591 = var2;
        this.method1141(1769924909);
        this.field596 = var3;
        this.field588 = var4;
    }

    void method1143(short var1) {
        this.field593 = class291.field3713;
    }

    final void method1141(int var1) {
        if (this.field591 != null) {
            this.field592 = new class293(class85.method2145(this.field591, -2068040101),
                                         client.field920);
        } else {
            this.field592 = null;
        }

    }

    void method1138(byte var1) {
        this.field594 = class291.field3713;
    }

    final boolean method1136(int var1) {
        if (this.field593 == class291.field3713) {
            this.method1137((byte) 114);
        }

        return this.field593 == class291.field3712;
    }

    final boolean method1133(byte var1) {
        if (this.field594 == class291.field3713) {
            this.method1140(5682924);
        }

        return this.field594 == class291.field3712;
    }
}
