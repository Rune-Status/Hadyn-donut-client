package jagex.osrs;

public final class class202 {

    int field2479;
    class204 field2482;
    class196 field2483;
    class208 field2481;
    int field2480;

    public class202(int var1) {
        this.field2481 = new class208();
        this.field2483 = new class196();
        this.field2480 = var1;
        this.field2479 = var1;

        int var2;
        for (var2 = 1; var2 + var2 < var1; var2 += var2) {
            ;
        }

        this.field2482 = new class204(var2);
    }

    public class208 method4198(long var1) {
        class208 var3 = (class208) this.field2482.method4224(var1);
        if (var3 != null) {
            this.field2483.method4146(var3);
        }

        return var3;
    }

    public void method4204(class208 var1, long var2) {
        if (this.field2479 == 0) {
            class208 var4 = this.field2483.method4149();
            var4.unlink();
            var4.method4308();
            if (var4 == this.field2481) {
                var4 = this.field2483.method4149();
                var4.unlink();
                var4.method4308();
            }
        } else {
            --this.field2479;
        }

        this.field2482.method4226(var1, var2);
        this.field2483.method4146(var1);
    }

    public void method4199() {
        this.field2483.method4145();
        this.field2482.method4227();
        this.field2481 = new class208();
        this.field2479 = this.field2480;
    }

    public void method4197(long var1) {
        class208 var3 = (class208) this.field2482.method4224(var1);
        if (var3 != null) {
            var3.unlink();
            var3.method4308();
            ++this.field2479;
        }

    }
}
