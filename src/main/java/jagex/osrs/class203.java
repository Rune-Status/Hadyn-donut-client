package jagex.osrs;

public final class class203 {

    int field2486;
    class199 field2487;
    class217 field2484;
    int field2485;

    public class203(int var1, int var2) {
        this.field2484 = new class217();
        this.field2486 = var1;
        this.field2485 = var1;

        int var3;
        for (var3 = 1; var3 + var3 < var1 && var3 < var2; var3 += var3) {
            ;
        }

        this.field2487 = new class199(var3);
    }

    public void method4213(Object var1, long var2, int var4) {
        if (var4 > this.field2486) {
            throw new IllegalStateException();
        } else {
            this.method4210(var2);
            this.field2485 -= var4;

            while (this.field2485 < 0) {
                class214 var5 = (class214) this.field2484.method4358();
                this.method4211(var5);
            }

            class198 var6 = new class198(var1, var4);
            this.field2487.method4170(var6, var2);
            this.field2484.method4356(var6);
            var6.field2501 = 0L;
        }
    }

    public void method4216(int var1) {
        for (class214 var2 = (class214) this.field2484.method4351(); var2 != null;
             var2 = (class214) this.field2484.method4355()) {
            if (var2.vmethod4338()) {
                if (var2.vmethod4337() == null) {
                    var2.unlink();
                    var2.method4308();
                    this.field2485 += var2.field2513;
                }
            } else if (++var2.field2501 > (long) var1) {
                class209 var3 = new class209(var2.vmethod4337(), var2.field2513);
                this.field2487.method4170(var3, var2.key);
                class196.method4151(var3, var2);
                var2.unlink();
                var2.method4308();
            }
        }

    }

    public Object method4214(long var1) {
        class214 var3 = (class214) this.field2487.method4185(var1);
        if (var3 == null) {
            return null;
        } else {
            Object var4 = var3.vmethod4337();
            if (var4 == null) {
                var3.unlink();
                var3.method4308();
                this.field2485 += var3.field2513;
                return null;
            } else {
                if (var3.vmethod4338()) {
                    class198 var5 = new class198(var4, var3.field2513);
                    this.field2487.method4170(var5, var3.key);
                    this.field2484.method4356(var5);
                    var5.field2501 = 0L;
                    var3.unlink();
                    var3.method4308();
                } else {
                    this.field2484.method4356(var3);
                    var3.field2501 = 0L;
                }

                return var4;
            }
        }
    }

    void method4210(long var1) {
        class214 var3 = (class214) this.field2487.method4185(var1);
        this.method4211(var3);
    }

    void method4211(class214 var1) {
        if (var1 != null) {
            var1.unlink();
            var1.method4308();
            this.field2485 += var1.field2513;
        }

    }

    public void method4212(Object var1, long var2) {
        this.method4213(var1, var2, 1);
    }

    public void method4219() {
        this.field2484.method4350();
        this.field2487.method4178();
        this.field2485 = this.field2486;
    }
}
