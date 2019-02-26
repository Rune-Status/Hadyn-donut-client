package jagex.osrs;

public class class330 {

    public static final class330 field4002;
    public static final class330 field4009;
    static final class330 field4008;
    static final class330 field4003;
    static final class330 field4000;
    static final class330 field4004;
    static final class330 field4005;
    static final class330 field4006;
    static final class330 field4007;

    static {
        field4002 = new class330(0, 0, "", "");
        field4008 = new class330(8, 1, "", "");
        field4003 = new class330(5, 2, "", "");
        field4000 = new class330(2, 3, "", "");
        field4004 = new class330(6, 4, "", "");
        field4005 = new class330(3, 5, "", "");
        field4006 = new class330(4, 6, "", "");
        field4007 = new class330(7, 7, "", "");
        field4009 = new class330(1, -1, "", "", true,
                                 new class330[]{field4002, field4008, field4003, field4004,
                                     field4000});
    }

    public final int field4001;
    final String field4010;

    class330(int var1, int var2, String var3, String var4) {
        this.field4001 = var1;
        this.field4010 = var4;
    }

    class330(int var1, int var2, String var3, String var4, boolean var5, class330[] var6) {
        this.field4001 = var1;
        this.field4010 = var4;
    }

    public String toString() {
        return this.field4010;
    }
}
