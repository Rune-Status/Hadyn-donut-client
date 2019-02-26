package jagex.osrs;

public class class123 {

    static int field1727;
    int field1725;
    int field1721;
    int field1722;
    int field1724;

    class123() {
    }

    class123(class123 var1) {
        this.field1725 = var1.field1725;
        this.field1721 = var1.field1721;
        this.field1722 = var1.field1722;
        this.field1724 = var1.field1724;
    }

    static int method2974(int var0, int var1, byte var2) {
        if (var0 == -2) {
            return 12345678;
        } else if (var0 == -1) {
            if (var1 < 0) {
                var1 = 0;
            } else if (var1 > 127) {
                var1 = 127;
            }

            var1 = 127 - var1;
            return var1;
        } else {
            var1 = (var0 & 127) * var1 / 128;
            if (var1 < 2) {
                var1 = 2;
            } else if (var1 > 126) {
                var1 = 126;
            }

            return (var0 & 65408) + var1;
        }
    }
}
