package jagex.osrs;

public class class282 {

    static class113 field3688;
    public boolean field3680;
    long field3682;
    long field3686;
    long field3678;
    int field3685;
    int field3683;
    long field3681;
    long field3679;
    int field3684;
    int field3687;

    public class282() {
        this.field3686 = -1L;
        this.field3678 = -1L;
        this.field3680 = false;
        this.field3681 = 0L;
        this.field3682 = 0L;
        this.field3679 = 0L;
        this.field3684 = 0;
        this.field3685 = 0;
        this.field3683 = 0;
        this.field3687 = 0;
    }

    public void method5504(int var1) {
        if (this.field3678 != -1L) {
            this.field3681 = class120.method2866((short) 3133) - this.field3678;
            this.field3678 = -1L;
        }

        ++this.field3683;
        this.field3680 = true;
    }

    public void method5502(int var1) {
        if (-1L != this.field3686) {
            this.field3682 = class120.method2866((short) 3133) - this.field3686;
            this.field3686 = -1L;
        }

    }

    public void method5503(int var1, byte var2) {
        this.field3678 = class120.method2866((short) 3133);
        this.field3684 = var1;
    }

    public void method5517(int var1) {
        this.field3686 = class120.method2866((short) 3133);
    }

    public void method5507(Buffer var1, byte var2) {
        long var3 = this.field3682;
        var3 /= 10L;
        if (var3 < 0L) {
            var3 = 0L;
        } else if (var3 > 65535L) {
            var3 = 65535L;
        }

        var1.writeShort((int) var3);
        long var5 = this.field3681;
        var5 /= 10L;
        if (var5 < 0L) {
            var5 = 0L;
        } else if (var5 > 65535L) {
            var5 = 65535L;
        }

        var1.writeShort((int) var5);
        long var7 = this.field3679;
        var7 /= 10L;
        if (var7 < 0L) {
            var7 = 0L;
        } else if (var7 > 65535L) {
            var7 = 65535L;
        }

        var1.writeShort((int) var7);
        var1.writeShort(this.field3684);
        var1.writeShort(this.field3685);
        var1.writeShort(this.field3683);
        var1.writeShort(this.field3687);
    }

    public void method5505(int var1) {
        this.field3680 = false;
        this.field3685 = 0;
    }

    public void method5501(byte var1) {
        this.method5504(-456553240);
    }
}
