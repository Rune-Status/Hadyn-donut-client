package jagex.osrs;

import java.util.Iterator;

public class class216 implements Iterator {

    class208 field2515;
    class208 field2517;
    class217 field2516;

    class216(class217 var1) {
        this.field2517 = null;
        this.field2516 = var1;
        this.field2515 = this.field2516.field2518.field2500;
        this.field2517 = null;
    }

    public Object next() {
        class208 var1 = this.field2515;
        if (var1 == this.field2516.field2518) {
            var1 = null;
            this.field2515 = null;
        } else {
            this.field2515 = var1.field2500;
        }

        this.field2517 = var1;
        return var1;
    }

    public void remove() {
        this.field2517.method4308();
        this.field2517 = null;
    }

    public boolean hasNext() {
        return this.field2516.field2518 != this.field2515;
    }
}
