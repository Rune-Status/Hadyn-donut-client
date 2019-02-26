package jagex.osrs;

import java.nio.ByteBuffer;

public class class182 extends class188 {

    ByteBuffer field2365;

    byte[] vmethod4013(short var1) {
        byte[] var2 = new byte[this.field2365.capacity()];
        this.field2365.position(0);
        this.field2365.get(var2);
        return var2;
    }

    void vmethod4022(byte[] var1, int var2) {
        this.field2365 = ByteBuffer.allocateDirect(var1.length);
        this.field2365.position(0);
        this.field2365.put(var1);
    }
}
