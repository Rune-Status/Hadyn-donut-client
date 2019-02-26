package jagex.osrs;

import java.util.Iterator;

public class class217 implements Iterable {

    public class208 field2518;
    class208 field2519;

    public class217() {
        this.field2518 = new class208();
        this.field2518.field2500 = this.field2518;
        this.field2518.field2502 = this.field2518;
    }

    class208 method4352(class208 var1) {
        class208 var2;
        if (var1 == null) {
            var2 = this.field2518.field2500;
        } else {
            var2 = var1;
        }

        if (var2 == this.field2518) {
            this.field2519 = null;
            return null;
        } else {
            this.field2519 = var2.field2500;
            return var2;
        }
    }

    class208 method4351() {
        return this.method4352((class208) null);
    }

    public void method4350() {
        while (this.field2518.field2500 != this.field2518) {
            this.field2518.field2500.method4308();
        }

    }

    class208 method4358() {
        class208 var1 = this.field2518.field2500;
        if (var1 == this.field2518) {
            return null;
        } else {
            var1.method4308();
            return var1;
        }
    }

    class208 method4355() {
        class208 var1 = this.field2519;
        if (var1 == this.field2518) {
            this.field2519 = null;
            return null;
        } else {
            this.field2519 = var1.field2500;
            return var1;
        }
    }

    public void method4356(class208 var1) {
        if (var1.field2502 != null) {
            var1.method4308();
        }

        var1.field2502 = this.field2518.field2502;
        var1.field2500 = this.field2518;
        var1.field2502.field2500 = var1;
        var1.field2500.field2502 = var1;
    }

    public Iterator iterator() {
        return new class216(this);
    }
}
