package jagex.osrs;

public class class98 {

    int field1386;
    int field1390;
    int field1383;
    int field1385;
    int field1381;
    int[] field1384;
    int[] field1382;
    int field1389;
    int field1388;
    int field1387;
    int field1380;

    class98() {
        this.field1383 = 2;
        this.field1384 = new int[2];
        this.field1382 = new int[2];
        this.field1384[0] = 0;
        this.field1384[1] = 65535;
        this.field1382[0] = 0;
        this.field1382[1] = 65535;
    }

    final void method2411(Buffer var1) {
        this.field1385 = var1.getUByte();
        this.field1387 = var1.getInt();
        this.field1380 = var1.getInt();
        this.method2408(var1);
    }

    final void method2409() {
        this.field1386 = 0;
        this.field1381 = 0;
        this.field1388 = 0;
        this.field1389 = 0;
        this.field1390 = 0;
    }

    final void method2408(Buffer var1) {
        this.field1383 = var1.getUByte();
        this.field1384 = new int[this.field1383];
        this.field1382 = new int[this.field1383];

        for (int var2 = 0; var2 < this.field1383; ++var2) {
            this.field1384[var2] = var1.readUint16();
            this.field1382[var2] = var1.readUint16();
        }

    }

    final int method2410(int var1) {
        if (this.field1390 >= this.field1386) {
            this.field1389 = this.field1382[this.field1381++] << 15;
            if (this.field1381 >= this.field1383) {
                this.field1381 = this.field1383 - 1;
            }

            this.field1386 = (int) ((double) this.field1384[this.field1381] / 65536.0D
                * (double) var1);
            if (this.field1386 > this.field1390) {
                this.field1388 =
                    ((this.field1382[this.field1381] << 15) - this.field1389) / (this.field1386
                        - this.field1390);
            }
        }

        this.field1389 += this.field1388;
        ++this.field1390;
        return this.field1389 - this.field1388 >> 15;
    }
}
