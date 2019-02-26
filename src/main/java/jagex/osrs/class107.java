package jagex.osrs;

public abstract class class107 extends Node {

    volatile boolean field1445;
    class110 field1442;
    class107 field1444;
    int field1443;

    protected class107() {
        this.field1445 = true;
    }

    protected abstract void vmethod4620(int[] var1, int var2, int var3);

    protected abstract void vmethod4601(int var1);

    final void method2654(int[] var1, int var2, int var3) {
        if (this.field1445) {
            this.vmethod4620(var1, var2, var3);
        } else {
            this.vmethod4601(var3);
        }

    }

    protected abstract class107 vmethod4598();

    protected abstract class107 vmethod4596();

    int vmethod2661() {
        return 255;
    }

    protected abstract int vmethod4609();
}
