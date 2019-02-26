package jagex.osrs;

public class class311 {

    public int field3816;
    public int field3817;
    public int field3815;
    public int field3818;
    public int field3813;
    public int field3814;
    public int field3819;
    public int field3820;
    public int field3821;
    public int field3822;
    public int field3823;

    public class311() {
        this.field3816 = -1;
        this.field3817 = -1;
        this.field3815 = -1;
        this.field3818 = -1;
        this.field3813 = -1;
        this.field3814 = -1;
        this.field3819 = -1;
        this.field3820 = -1;
        this.field3821 = -1;
        this.field3822 = -1;
        this.field3823 = -1;
    }

    public static class322[] method5957(int var0) {
        class322[] var1 = new class322[class324.field3893];

        for (int var2 = 0; var2 < class324.field3893; ++var2) {
            class322 var3 = var1[var2] = new class322();
            var3.field3875 = class324.field3891;
            var3.field3876 = class324.field3896;
            var3.field3874 = class324.field3890[var2];
            var3.field3877 = class324.field3892[var2];
            var3.field3872 = class324.field3895[var2];
            var3.field3873 = class258.field3334[var2];
            var3.field3871 = class324.field3894;
            var3.field3870 = class324.field3897[var2];
        }

        class324.field3890 = null;
        class324.field3892 = null;
        class324.field3895 = null;
        class258.field3334 = null;
        class324.field3894 = null;
        class324.field3897 = null;
        return var1;
    }

    public void method5954(class249 var1, int var2) {
        byte[] var3 = var1.method4835(class310.field3812.field3811, (short) -4997);
        Buffer var4 = new Buffer(var3);

        while (true) {
            int var5 = var4.getUByte();
            if (var5 == 0) {
                return;
            }

            switch (var5) {
                case 1:
                    var4.method3773(1666946241);
                    break;
                case 2:
                    this.field3816 = var4.method3898((byte) -39);
                    this.field3817 = var4.method3898((byte) -55);
                    this.field3815 = var4.method3898((byte) -60);
                    this.field3818 = var4.method3898((byte) -18);
                    this.field3813 = var4.method3898((byte) -75);
                    this.field3814 = var4.method3898((byte) -116);
                    this.field3819 = var4.method3898((byte) -48);
                    this.field3820 = var4.method3898((byte) -19);
                    this.field3821 = var4.method3898((byte) -11);
                    this.field3822 = var4.method3898((byte) -21);
                    this.field3823 = var4.method3898((byte) -35);
            }
        }
    }
}
