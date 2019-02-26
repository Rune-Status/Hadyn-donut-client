package jagex.osrs;

public class class272 implements class190 {

    static final class272 field3563;
    static final class272 field3559;
    static final class272 field3560;

    static {
        field3563 = new class272(0, 0);
        field3559 = new class272(1, 1);
        field3560 = new class272(2, 2);
    }

    public final int field3562;
    final int field3561;

    class272(int var1, int var2) {
        this.field3562 = var1;
        this.field3561 = var2;
    }

    public static final void method5390(long var0) {
        if (var0 > 0L) {
            if (var0 % 10L == 0L) {
                long var2 = var0 - 1L;

                try {
                    Thread.sleep(var2);
                } catch (InterruptedException var8) {
                    ;
                }

                try {
                    Thread.sleep(1L);
                } catch (InterruptedException var7) {
                    ;
                }
            } else {
                try {
                    Thread.sleep(var0);
                } catch (InterruptedException var6) {
                    ;
                }
            }

        }
    }

    public int vmethod6130(byte var1) {
        return this.field3561;
    }
}
