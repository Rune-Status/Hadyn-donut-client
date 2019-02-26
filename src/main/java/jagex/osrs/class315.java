package jagex.osrs;

public class class315 {

    public int y;
    public int height;
    public int x;
    public int width;

    public class315(int x, int y, int width, int height) {
        this.setPosition(x, y, 540610323);
        this.setDimensions(width, height, 1910396135);
    }

    public class315(int var1, int var2) {
        this(0, 0, var1, var2);
    }

    void method6022(class315 var1, class315 var2, byte var3) {
        var2.x = this.x;
        var2.width = this.width;
        if (this.x < var1.x) {
            var2.width -= var1.x - this.x;
            var2.x = var1.x;
        }

        if (var2.method5995(198370442) > var1.method5995(198370442)) {
            var2.width -= var2.method5995(198370442) - var1.method5995(198370442);
        }

        if (var2.width < 0) {
            var2.width = 0;
        }

    }

    public void setPosition(int var1, int var2, int var3) {
        this.x = var1;
        this.y = var2;
    }

    void method5994(class315 var1, class315 var2, int var3) {
        var2.y = this.y;
        var2.height = this.height;
        if (this.y < var1.y) {
            var2.height -= var1.y - this.y;
            var2.y = var1.y;
        }

        if (var2.method5996(978017217) > var1.method5996(1894333947)) {
            var2.height -= var2.method5996(-1068809269) - var1.method5996(-15961883);
        }

        if (var2.height < 0) {
            var2.height = 0;
        }

    }

    public void setDimensions(int var1, int var2, int var3) {
        this.width = var1;
        this.height = var2;
    }

    int method5995(int var1) {
        return this.width + this.x;
    }

    int method5996(int var1) {
        return this.height + this.y;
    }

    public void method5993(class315 var1, class315 var2, int var3) {
        this.method6022(var1, var2, (byte) -115);
        this.method5994(var1, var2, 587374040);
    }

    public String toString() {
        return null;
    }
}
