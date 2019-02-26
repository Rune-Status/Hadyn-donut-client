package jagex.osrs;

import java.util.Comparator;

public abstract class class285 implements Comparator {

    Comparator field3694;

    protected final int method5566(class284 var1, class284 var2, byte var3) {
        return this.field3694 == null ? 0 : this.field3694.compare(var1, var2);
    }

    final void method5562(Comparator var1, int var2) {
        if (this.field3694 == null) {
            this.field3694 = var1;
        } else if (this.field3694 instanceof class285) {
            ((class285) this.field3694).method5562(var1, 1461286313);
        }

    }

    public boolean equals(Object var1) {
        return super.equals(var1);
    }
}
