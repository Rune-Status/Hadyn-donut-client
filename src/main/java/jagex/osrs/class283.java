package jagex.osrs;

public class class283 extends class289 {

    class291 field3689;
    class291 field3690;

    class283() {
        this.field3689 = class291.field3713;
        this.field3690 = class291.field3713;
    }

    public static final boolean method5540(int var0) {
        class39 var1 = class39.field386;
        synchronized (class39.field386) {
            if (class39.field388 == class39.field390) {
                return false;
            } else {
                class59.field598 = class39.field369[class39.field388];
                class131.field1856 = class39.field384[class39.field388];
                class39.field388 = class39.field388 + 1 & 127;
                return true;
            }
        }
    }

    void method5535(int var1) {
        this.field3690 =
            InboundPacketDescriptor.field2150.field1041.method5608(super.field3692, (byte) 40) ? class291.field3712
                : class291.field3711;
    }

    void method5537(int var1) {
        this.field3689 =
            InboundPacketDescriptor.field2150.field1040.method5608(super.field3692, (byte) 40) ? class291.field3712
                : class291.field3711;
    }

    void method5524(int var1) {
        this.field3690 = class291.field3713;
    }

    void method5521(int var1) {
        this.field3689 = class291.field3713;
    }

    public final boolean method5522(int var1) {
        if (this.field3689 == class291.field3713) {
            this.method5537(955248941);
        }

        return this.field3689 == class291.field3712;
    }

    public final boolean method5525(byte var1) {
        if (this.field3690 == class291.field3713) {
            this.method5535(478358640);
        }

        return this.field3690 == class291.field3712;
    }
}
