package jagex.osrs;

public class class286 extends class287 {

    static class104 field3697;
    final class330 field3696;

    public class286(class330 var1) {
        super(400);
        this.field3696 = var1;
    }

    class284 vmethod5744(int var1) {
        return new class288();
    }

    class284[] vmethod5760(int var1, int var2) {
        return new class288[var1];
    }

    public void method5574(Buffer var1, int var2, int var3) {
        while (true) {
            if (var1.offset < var2) {
                int var4 = var1.getUByte();
                boolean var5 = (var4 & 1) == 1;
                class293 var6 = new class293(var1.method3778(-1524526756), this.field3696);
                class293 var7 = new class293(var1.method3778(-930436478), this.field3696);
                var1.method3778(467724342);
                if (var6 != null && var6.method5707(1368750553)) {
                    class288 var8 = (class288) this.method5590(var6, -266772152);
                    if (var5) {
                        class288 var9 = (class288) this.method5590(var7, -266772152);
                        if (var9 != null && var8 != var9) {
                            if (var8 != null) {
                                this.method5641(var9, -53516150);
                            } else {
                                var8 = var9;
                            }
                        }
                    }

                    if (var8 != null) {
                        this.method5591(var8, var6, var7, -998867252);
                        continue;
                    }

                    if (this.method5586((byte) 1) < 400) {
                        int var10 = this.method5586((byte) 1);
                        var8 = (class288) this.method5594(var6, var7, (byte) -12);
                        var8.field3705 = var10;
                    }
                    continue;
                }

                throw new IllegalStateException();
            }

            return;
        }
    }
}
