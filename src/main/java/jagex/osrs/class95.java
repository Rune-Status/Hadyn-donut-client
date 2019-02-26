package jagex.osrs;

public class class95 extends class110 {

    public byte[] field1345;
    public int field1347;
    public boolean field1344;
    public int field1346;
    int field1348;

    class95(int var1, byte[] var2, int var3, int var4) {
        this.field1347 = var1;
        this.field1345 = var2;
        this.field1346 = var3;
        this.field1348 = var4;
    }

    class95(int var1, byte[] var2, int var3, int var4, boolean var5) {
        this.field1347 = var1;
        this.field1345 = var2;
        this.field1346 = var3;
        this.field1348 = var4;
        this.field1344 = var5;
    }

    public class95 method2322(class104 var1) {
        this.field1345 = var1.method2452(this.field1345, (byte) -13);
        this.field1347 = var1.method2457(this.field1347, -290238046);
        if (this.field1346 == this.field1348) {
            this.field1346 = this.field1348 = var1.method2453(this.field1346, -1606165885);
        } else {
            this.field1346 = var1.method2453(this.field1346, -35548488);
            this.field1348 = var1.method2453(this.field1348, -1278244888);
            if (this.field1346 == this.field1348) {
                --this.field1346;
            }
        }

        return this;
    }
}
