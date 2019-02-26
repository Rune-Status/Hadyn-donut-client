package jagex.osrs;

public class class90 extends class107 {

    class207 field1297;
    class207 field1296;
    int field1299;
    int field1298;

    public class90() {
        this.field1297 = new class207();
        this.field1296 = new class207();
        this.field1298 = 0;
        this.field1299 = -1;
    }

    void method2221(int[] var1, int var2, int var3) {
        for (class107 var4 = (class107) this.field1297.method4298(); var4 != null;
             var4 = (class107) this.field1297.method4283()) {
            var4.method2654(var1, var2, var3);
        }

    }

    void method2241(int var1) {
        for (class107 var2 = (class107) this.field1297.method4298(); var2 != null;
             var2 = (class107) this.field1297.method4283()) {
            var2.vmethod4601(var1);
        }

    }

    public final synchronized void vmethod4620(int[] var1, int var2, int var3) {
        do {
            if (this.field1299 < 0) {
                this.method2221(var1, var2, var3);
                return;
            }

            if (var3 + this.field1298 < this.field1299) {
                this.field1298 += var3;
                this.method2221(var1, var2, var3);
                return;
            }

            int var4 = this.field1299 - this.field1298;
            this.method2221(var1, var2, var4);
            var2 += var4;
            var3 -= var4;
            this.field1298 += var4;
            this.method2216();
            class102 var5 = (class102) this.field1296.method4298();
            synchronized (var5) {
                int var7 = var5.method2438(this);
                if (var7 < 0) {
                    var5.field1401 = 0;
                    this.method2239(var5);
                } else {
                    var5.field1401 = var7;
                    this.method2213(var5.nextNode, var5);
                }
            }
        } while (var3 != 0);

    }

    public final synchronized void vmethod4601(int var1) {
        do {
            if (this.field1299 < 0) {
                this.method2241(var1);
                return;
            }

            if (this.field1298 + var1 < this.field1299) {
                this.field1298 += var1;
                this.method2241(var1);
                return;
            }

            int var2 = this.field1299 - this.field1298;
            this.method2241(var2);
            var1 -= var2;
            this.field1298 += var2;
            this.method2216();
            class102 var3 = (class102) this.field1296.method4298();
            synchronized (var3) {
                int var5 = var3.method2438(this);
                if (var5 < 0) {
                    var3.field1401 = 0;
                    this.method2239(var3);
                } else {
                    var3.field1401 = var5;
                    this.method2213(var3.nextNode, var3);
                }
            }
        } while (var1 != 0);

    }

    protected class107 vmethod4598() {
        return (class107) this.field1297.method4283();
    }

    void method2216() {
        if (this.field1298 > 0) {
            for (class102 var1 = (class102) this.field1296.method4298(); var1 != null;
                 var1 = (class102) this.field1296.method4283()) {
                var1.field1401 -= this.field1298;
            }

            this.field1299 -= this.field1298;
            this.field1298 = 0;
        }

    }

    public final synchronized void method2215(class107 var1) {
        this.field1297.method4277(var1);
    }

    protected class107 vmethod4596() {
        return (class107) this.field1297.method4298();
    }

    public final synchronized void method2214(class107 var1) {
        var1.unlink();
    }

    void method2239(class102 var1) {
        var1.unlink();
        var1.method2437();
        Node var2 = this.field1296.field2498.nextNode;
        if (var2 == this.field1296.field2498) {
            this.field1299 = -1;
        } else {
            this.field1299 = ((class102) var2).field1401;
        }

    }

    void method2213(Node var1, class102 var2) {
        while (this.field1296.field2498 != var1 && ((class102) var1).field1401 <= var2.field1401) {
            var1 = var1.nextNode;
        }

        class207.method4307(var2, var1);
        this.field1299 = ((class102) this.field1296.field2498.nextNode).field1401;
    }

    protected int vmethod4609() {
        return 0;
    }
}
