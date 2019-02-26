package jagex.osrs;

public class class210 {

    class211 field2505;
    class211 field2504;

    public class210() {
        this.field2505 = new class211();
        this.field2505.field2507 = this.field2505;
        this.field2505.field2506 = this.field2505;
    }

    public class211 method4317() {
        class211 var1 = this.field2505.field2507;
        if (var1 == this.field2505) {
            this.field2504 = null;
            return null;
        } else {
            this.field2504 = var1.field2507;
            return var1;
        }
    }

    public class211 method4318() {
        class211 var1 = this.field2504;
        if (var1 == this.field2505) {
            this.field2504 = null;
            return null;
        } else {
            this.field2504 = var1.field2507;
            return var1;
        }
    }

    public void method4316(class211 var1) {
        if (var1.field2506 != null) {
            var1.method4323();
        }

        var1.field2506 = this.field2505.field2506;
        var1.field2507 = this.field2505;
        var1.field2506.field2507 = var1;
        var1.field2507.field2506 = var1;
    }
}
