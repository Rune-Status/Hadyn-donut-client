package jagex.osrs;

public class class108 {

    int field1447;
    int field1449;
    int[] field1448;
    int[] field1446;

    class108() {
        class94.method2287(16);
        this.field1447 = class94.method2302() != 0 ? class94.method2287(4) + 1 : 1;
        if (class94.method2302() != 0) {
            class94.method2287(8);
        }

        class94.method2287(2);
        if (this.field1447 > 1) {
            this.field1449 = class94.method2287(4);
        }

        this.field1448 = new int[this.field1447];
        this.field1446 = new int[this.field1447];

        for (int var1 = 0; var1 < this.field1447; ++var1) {
            class94.method2287(8);
            this.field1448[var1] = class94.method2287(8);
            this.field1446[var1] = class94.method2287(8);
        }

    }
}
