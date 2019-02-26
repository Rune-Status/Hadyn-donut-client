package jagex.osrs;

public class class284 implements Comparable {

    class293 field3693;
    class293 field3692;

    public static String method5558(CharSequence var0, int var1) {
        String var2 = class256.method5038(class228.method4645(var0, (byte) -32));
        if (var2 == null) {
            var2 = "";
        }

        return var2;
    }

    public int vmethod5729(class284 var1, int var2) {
        return this.field3692.method5710(var1.field3692, 762543036);
    }

    public class293 method5542(byte var1) {
        return this.field3692;
    }

    void method5545(class293 var1, class293 var2, byte var3) {
        if (var1 == null) {
            throw new NullPointerException();
        } else {
            this.field3692 = var1;
            this.field3693 = var2;
        }
    }

    public String method5548(int var1) {
        return this.field3692 == null ? "" : this.field3692.method5706(-165222639);
    }

    public String method5544(int var1) {
        return this.field3693 == null ? "" : this.field3693.method5706(-165222639);
    }

    public int compareTo(Object var1) {
        return this.vmethod5729((class284) var1, 889054617);
    }
}
