package jagex.osrs;

public class class119 {

    static int[] field1612;
    static int[] field1605;
    static int[] field1606;
    static int[] field1607;

    static {
        field1612 = new int[500];
        field1605 = new int[500];
        field1606 = new int[500];
        field1607 = new int[500];
    }

    class126 field1608;
    boolean field1614;
    int field1609;
    int[] field1610;
    int[] field1613;
    int[] field1604;
    int[] field1611;

    class119(byte[] var1, class126 var2) {
        this.field1608 = null;
        this.field1609 = -1;
        this.field1614 = false;
        this.field1608 = var2;
        Buffer var3 = new Buffer(var1);
        Buffer var4 = new Buffer(var1);
        var3.offset = 2;
        int var5 = var3.readUint8();
        int var6 = -1;
        int var7 = 0;
        var4.offset = var5 + var3.offset;

        int var8;
        for (var8 = 0; var8 < var5; ++var8) {
            int var9 = var3.readUint8();
            if (var9 > 0) {
                if (this.field1608.field1764[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; --var10) {
                        if (this.field1608.field1764[var10] == 0) {
                            field1612[var7] = var10;
                            field1605[var7] = 0;
                            field1606[var7] = 0;
                            field1607[var7] = 0;
                            ++var7;
                            break;
                        }
                    }
                }

                field1612[var7] = var8;
                short var11 = 0;
                if (this.field1608.field1764[var8] == 3) {
                    var11 = 128;
                }

                if ((var9 & 1) != 0) {
                    field1605[var7] = var4.method3782(1982278071);
                } else {
                    field1605[var7] = var11;
                }

                if ((var9 & 2) != 0) {
                    field1606[var7] = var4.method3782(1982278071);
                } else {
                    field1606[var7] = var11;
                }

                if ((var9 & 4) != 0) {
                    field1607[var7] = var4.method3782(1982278071);
                } else {
                    field1607[var7] = var11;
                }

                var6 = var8;
                ++var7;
                if (this.field1608.field1764[var8] == 5) {
                    this.field1614 = true;
                }
            }
        }

        if (var1.length != var4.offset) {
            throw new RuntimeException();
        } else {
            this.field1609 = var7;
            this.field1610 = new int[var7];
            this.field1613 = new int[var7];
            this.field1604 = new int[var7];
            this.field1611 = new int[var7];

            for (var8 = 0; var8 < var7; ++var8) {
                this.field1610[var8] = field1612[var8];
                this.field1613[var8] = field1605[var8];
                this.field1604[var8] = field1606[var8];
                this.field1611[var8] = field1607[var8];
            }

        }
    }
}
