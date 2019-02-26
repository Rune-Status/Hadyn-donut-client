package jagex.osrs;

import java.awt.Font;

public class class147 extends class285 {

    static Font field1963;
    final boolean field1961;

    public class147(boolean var1) {
        this.field1961 = var1;
    }

    int method3357(class289 var1, class289 var2, int var3) {
        return var1.field3708 != 0 && var2.field3708 != 0 ? (this.field1961 ? var1
            .method5542((byte) -40).method5710(var2.method5542((byte) 14), -2009665568)
            : var2.method5542((byte) -107).method5710(var1.method5542((byte) 51), -2146361115))
            : this.method5566(var1, var2, (byte) -23);
    }

    public int compare(Object var1, Object var2) {
        return this.method3357((class289) var1, (class289) var2, -1463350425);
    }
}
