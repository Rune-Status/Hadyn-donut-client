package jagex.osrs;

public class class327 extends Node {

    String field3919;
    int field3907;
    int[] field3929;
    String field3920;
    boolean field3908;
    int field3924;
    String field3909;
    int field3910;
    int field3911;
    String field3922;
    int field3903;
    int field3913;
    String field3926;
    boolean field3914;
    int field3915;
    String field3928;
    int field3916;
    String field3912;
    int field3917;
    int field3923;
    int field3921;
    int field3900;
    int field3925;
    int field3927;
    int field3930;

    class327(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8,
             int var9, int var10, int var11, int var12, String var13, String var14, String var15,
             String var16, int var17, int var18, int var19, int var20, String var21, String var22,
             int[] var23, int var24, String var25) {
        this.field3929 = new int[3];
        this.field3907 = var1;
        this.field3908 = var2;
        this.field3924 = var3;
        this.field3910 = var4;
        this.field3911 = var5;
        this.field3903 = var6;
        this.field3913 = var7;
        this.field3914 = var8;
        this.field3915 = var9;
        this.field3916 = var10;
        this.field3917 = var11;
        this.field3923 = var12;
        this.field3919 = var13;
        this.field3920 = var14;
        this.field3909 = var15;
        this.field3922 = var16;
        this.field3921 = var17;
        this.field3900 = var18;
        this.field3925 = var19;
        this.field3927 = var20;
        this.field3926 = var21;
        this.field3928 = var22;
        this.field3929 = var23;
        this.field3930 = var24;
        this.field3912 = var25;
    }

    public int length(int var1) {
        byte var2 = 38;
        String var5 = this.field3919;
        int var4 = var5.length() + 2;
        int var24 = var2 + var4;
        String var8 = this.field3920;
        int var7 = var8.length() + 2;
        var24 += var7;
        String var11 = this.field3909;
        int var10 = var11.length() + 2;
        var24 += var10;
        String var14 = this.field3922;
        int var13 = var14.length() + 2;
        var24 += var13;
        String var17 = this.field3926;
        int var16 = var17.length() + 2;
        var24 += var16;
        String var20 = this.field3928;
        int var19 = var20.length() + 2;
        var24 += var19;
        String var23 = this.field3912;
        int var22 = var23.length() + 2;
        var24 += var22;
        return var24;
    }

    public void write(Buffer var1, int var2) {
        var1.writeByte(7);
        var1.writeByte(this.field3907);
        var1.writeByte(this.field3908 ? 1 : 0);
        var1.writeByte(this.field3924);
        var1.writeByte(this.field3910);
        var1.writeByte(this.field3911);
        var1.writeByte(this.field3903);
        var1.writeByte(this.field3913);
        var1.writeByte(this.field3914 ? 1 : 0);
        var1.writeShort(this.field3915);
        var1.writeByte(this.field3916);
        var1.method3755(this.field3917, -1585094168);
        var1.writeShort(this.field3923);
        var1.method3956(this.field3919, (byte) -1);
        var1.method3956(this.field3920, (byte) 99);
        var1.method3956(this.field3909, (byte) -29);
        var1.method3956(this.field3922, (byte) 59);
        var1.writeByte(this.field3900);
        var1.writeShort(this.field3921);
        var1.method3956(this.field3926, (byte) 15);
        var1.method3956(this.field3928, (byte) -34);
        var1.writeByte(this.field3925);
        var1.writeByte(this.field3927);

        for (int var3 = 0; var3 < this.field3929.length; ++var3) {
            var1.writeInt(this.field3929[var3]);
        }

        var1.writeInt(this.field3930);
        var1.method3956(this.field3912, (byte) -44);
    }
}
