package jagex.osrs;

public final class class196 {

    class208 field2467;

    public class196() {
        this.field2467 = new class208();
        this.field2467.field2500 = this.field2467;
        this.field2467.field2502 = this.field2467;
    }

    static void method4151(class208 var0, class208 var1) {
        if (var0.field2502 != null) {
            var0.method4308();
        }

        var0.field2502 = var1;
        var0.field2500 = var1.field2500;
        var0.field2502.field2500 = var0;
        var0.field2500.field2502 = var0;
    }

    void method4145() {
        while (true) {
            class208 var1 = this.field2467.field2500;
            if (var1 == this.field2467) {
                return;
            }

            var1.method4308();
        }
    }

    class208 method4149() {
        class208 var1 = this.field2467.field2500;
        if (var1 == this.field2467) {
            return null;
        } else {
            var1.method4308();
            return var1;
        }
    }

    public void method4146(class208 var1) {
        if (var1.field2502 != null) {
            var1.method4308();
        }

        var1.field2502 = this.field2467.field2502;
        var1.field2500 = this.field2467;
        var1.field2502.field2500 = var1;
        var1.field2500.field2502 = var1;
    }

    public void method4147(class208 var1) {
        if (var1.field2502 != null) {
            var1.method4308();
        }

        var1.field2502 = this.field2467;
        var1.field2500 = this.field2467.field2500;
        var1.field2502.field2500 = var1;
        var1.field2500.field2502 = var1;
    }

    public class208 method4156() {
        class208 var1 = this.field2467.field2500;
        return var1 == this.field2467 ? null : var1;
    }
}
