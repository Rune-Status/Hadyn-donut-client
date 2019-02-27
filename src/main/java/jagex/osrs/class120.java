package jagex.osrs;

public final class class120 extends Node {

    class136[] field1626;
    int[] field1627;
    class114 field1623;
    class125 field1619;
    class135 field1622;
    class130 field1637;
    class117 field1629;
    int field1625;
    int field1628;
    class116 field1620;
    boolean field1631;
    int field1621;
    int field1633;
    int field1616;
    int field1617;
    int field1618;
    class120 field1630;
    boolean field1624;
    int field1635;
    boolean field1632;
    int field1634;
    int field1636;
    int field1615;

    class120(int var1, int var2, int var3) {
        this.field1626 = new class136[5];
        this.field1627 = new int[5];
        this.field1628 = 0;
        this.field1618 = this.field1621 = var1;
        this.field1616 = var2;
        this.field1617 = var3;
    }

    static String method2865(Buffer var0, int var1, short var2) {
        try {
            int var3 = var0.method3783(-1545915386);
            if (var3 > var1) {
                var3 = var1;
            }

            byte[] var4 = new byte[var3];
            var0.offset += class302.field3784
                .method3691(var0.bytes, var0.offset, var4, 0, var3, (byte) -64);
            String var5 = IssacRandom.method4091(var4, 0, var3, 1997589635);
            return var5;
        } catch (Exception var7) {
            return "Cabbage";
        }
    }
}
