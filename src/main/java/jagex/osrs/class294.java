package jagex.osrs;

public class class294 extends class289 {

    static int field3725;
    boolean field3723;
    boolean field3724;

    public static int method5727(int var0, int var1) {
        return class22.method334(class122.field1714[var0]);
    }

    int method5728(class294 var1, int var2) {
        return super.field3708 == client.field691 && client.field691 != var1.field3708 ? -1
            : (client.field691 == var1.field3708 && super.field3708 != client.field691 ? 1
                : (super.field3708 != 0 && var1.field3708 == 0 ? -1
                    : (var1.field3708 != 0 && super.field3708 == 0 ? 1
                        : (this.field3723 && !var1.field3723 ? -1
                            : (!this.field3723 && var1.field3723 ? 1
                                : (this.field3724 && !var1.field3724 ? -1
                                    : (!this.field3724 && var1.field3724 ? 1
                                        : (super.field3708 != 0 ? super.field3706 - var1.field3706
                                            : var1.field3706 - super.field3706))))))));
    }

    public int vmethod5729(class284 var1, int var2) {
        return this.method5728((class294) var1, -1595207569);
    }

    public int compareTo(Object var1) {
        return this.method5728((class294) var1, 1165791195);
    }
}
