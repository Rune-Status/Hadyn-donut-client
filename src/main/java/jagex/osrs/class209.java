package jagex.osrs;

import java.lang.ref.SoftReference;

public class class209 extends class214 {

    SoftReference field2503;

    class209(Object var1, int var2) {
        super(var2);
        this.field2503 = new SoftReference(var1);
    }

    boolean vmethod4338() {
        return true;
    }

    Object vmethod4337() {
        return this.field2503.get();
    }
}
