package jagex.osrs;

public final class class125 {

    boolean field1760;
    int field1761;
    int field1756;
    int field1758;
    int field1755;
    int field1757;
    int field1759;

    class125(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
        this.field1760 = true;
        this.field1761 = var1;
        this.field1756 = var2;
        this.field1755 = var3;
        this.field1757 = var4;
        this.field1759 = var5;
        this.field1758 = var6;
        this.field1760 = var7;
    }

    public static void method3051(byte[] var0, int var1) {
        Buffer var2 = new Buffer(var0);
        var2.offset = var0.length - 2;
        class324.field3893 = var2.readUint16();
        class324.field3890 = new int[class324.field3893];
        class324.field3892 = new int[class324.field3893];
        class324.field3895 = new int[class324.field3893];
        class258.field3334 = new int[class324.field3893];
        class324.field3897 = new byte[class324.field3893][];
        var2.offset = var0.length - 7 - class324.field3893 * 8;
        class324.field3891 = var2.readUint16();
        class324.field3896 = var2.readUint16();
        int var3 = (var2.getUByte() & 255) + 1;

        int var4;
        for (var4 = 0; var4 < class324.field3893; ++var4) {
            class324.field3890[var4] = var2.readUint16();
        }

        for (var4 = 0; var4 < class324.field3893; ++var4) {
            class324.field3892[var4] = var2.readUint16();
        }

        for (var4 = 0; var4 < class324.field3893; ++var4) {
            class324.field3895[var4] = var2.readUint16();
        }

        for (var4 = 0; var4 < class324.field3893; ++var4) {
            class258.field3334[var4] = var2.readUint16();
        }

        var2.offset = var0.length - 7 - class324.field3893 * 8 - (var3 - 1) * 3;
        class324.field3894 = new int[var3];

        for (var4 = 1; var4 < var3; ++var4) {
            class324.field3894[var4] = var2.method3773(2062654558);
            if (class324.field3894[var4] == 0) {
                class324.field3894[var4] = 1;
            }
        }

        var2.offset = 0;

        for (var4 = 0; var4 < class324.field3893; ++var4) {
            int var5 = class324.field3895[var4];
            int var6 = class258.field3334[var4];
            int var7 = var5 * var6;
            byte[] var8 = new byte[var7];
            class324.field3897[var4] = var8;
            int var9 = var2.getUByte();
            int var10;
            if (var9 == 0) {
                for (var10 = 0; var10 < var7; ++var10) {
                    var8[var10] = var2.method3931(2043532631);
                }
            } else if (var9 == 1) {
                for (var10 = 0; var10 < var5; ++var10) {
                    for (int var11 = 0; var11 < var6; ++var11) {
                        var8[var10 + var5 * var11] = var2.method3931(2097695550);
                    }
                }
            }
        }

    }

    static final void method3052(int var0) {
        class48.method1021((byte) 52);
        class261.field3359.method4199();
        class17.method210(-2108105930);
        class270.field3453.method4199();
        class270.field3457.method4199();
        class270.field3455.method4199();
        class270.field3473.method4199();
        class273.field3566.method4199();
        class273.field3567.method4199();
        class89.method2200((byte) 15);
        class51.method1062(-1726630277);
        class186.method4008(1409681026);
        class265.field3396.method4199();
        class60.method1169(105487488);
        class269.field3429.method4199();
        class269.field3430.method4199();
        class269.field3434.method4199();
        class263.field3385.method4199();
        class263.field3382.method4199();
        class52.method1073(2095812020);
        class241.method4789(360182501);
        class257.field3314.method4199();
        class56.method1112((byte) -27);
        class232.field2661.method4199();
        class232.field2662.method4199();
        class232.field2663.method4199();
        class232.field2664.method4199();
        ((class113) class124.field1752).method2763(-1112951610);
        class86.field1261.method4199();
        class19.index0.method4844(1354114415);
        class42.index1.method4844(1643582393);
        class157.index3.method4844(1573779898);
        class9.index4.method4844(1211234569);
        class332.index5.method4844(1151853852);
        InboundPacketDescriptor.index6.method4844(1329288035);
        class10.index7.method4844(1509839723);
        class154.index8.method4844(1427205157);
        class17.index9.method4844(430674396);
        class12.index10.method4844(1153209169);
        IssacRandom.index11.method4844(1915764202);
        class137.index12.method4844(1139121717);
    }
}
