package jagex.osrs;

public class class295 extends class287 {

    final class290 field3728;
    final class330 field3727;
    public String field3726;
    public String field3730;
    public int field3732;
    public byte field3731;
    int field3729;

    public class295(class330 var1, class290 var2) {
        super(100);
        this.field3726 = null;
        this.field3730 = null;
        this.field3729 = 1;
        this.field3727 = var1;
        this.field3728 = var2;
    }

    static boolean method5758(CharSequence var0, int var1, boolean var2, int var3) {
        if (var1 >= 2 && var1 <= 36) {
            boolean var4 = false;
            boolean var5 = false;
            int var6 = 0;
            int var7 = var0.length();

            for (int var8 = 0; var8 < var7; ++var8) {
                char var9 = var0.charAt(var8);
                if (var8 == 0) {
                    if (var9 == '-') {
                        var4 = true;
                        continue;
                    }

                    if (var9 == '+') {
                        continue;
                    }
                }

                int var11;
                if (var9 >= '0' && var9 <= '9') {
                    var11 = var9 - '0';
                } else if (var9 >= 'A' && var9 <= 'Z') {
                    var11 = var9 - '7';
                } else {
                    if (var9 < 'a' || var9 > 'z') {
                        return false;
                    }

                    var11 = var9 - 'W';
                }

                if (var11 >= var1) {
                    return false;
                }

                if (var4) {
                    var11 = -var11;
                }

                int var10 = var11 + var6 * var1;
                if (var10 / var1 != var6) {
                    return false;
                }

                var6 = var10;
                var5 = true;
            }

            return var5;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    final void method5764(String var1, int var2) {
        this.field3730 = class284.method5558(var1, 463310943);
    }

    class284 vmethod5744(int var1) {
        return new class283();
    }

    final void method5740(String var1, int var2) {
        this.field3726 = class284.method5558(var1, -1613638118);
    }

    class284[] vmethod5760(int var1, int var2) {
        return new class283[var1];
    }

    public final void method5737(int var1) {
        for (int var2 = 0; var2 < this.method5586((byte) 1); ++var2) {
            ((class283) this.method5595(var2, -874553094)).method5521(-1236720127);
        }

    }

    public final void method5745(int var1) {
        for (int var2 = 0; var2 < this.method5586((byte) 1); ++var2) {
            ((class283) this.method5595(var2, -1858796022)).method5524(-134704911);
        }

    }

    final void method5746(class283 var1, byte var2) {
        if (var1.method5542((byte) -7).equals(this.field3728.vmethod5687(-1250806061))) {
            this.field3732 = var1.field3710;
        }

    }

    public final void method5743(Buffer var1, byte var2) {
        class293 var3 = new class293(var1.getString(), this.field3727);
        int var4 = var1.readUint16();
        byte var5 = var1.method3931(2011849020);
        boolean var6 = false;
        if (var5 == -128) {
            var6 = true;
        }

        class283 var7;
        if (var6) {
            if (this.method5586((byte) 1) == 0) {
                return;
            }

            var7 = (class283) this.method5590(var3, -266772152);
            if (var7 != null && var7.method5677((byte) 0) == var4) {
                this.method5641(var7, 1393453698);
            }
        } else {
            var1.getString();
            var7 = (class283) this.method5590(var3, -266772152);
            if (var7 == null) {
                if (this.method5586((byte) 1) > super.field3704) {
                    return;
                }

                var7 = (class283) this.method5663(var3, 1175028138);
            }

            var7.method5678(var4, ++this.field3729 - 1, 1946948981);
            var7.field3710 = var5;
            this.method5746(var7, (byte) 14);
        }

    }

    public final void method5742(Buffer var1, int var2) {
        this.method5764(var1.getString(), -48607896);
        long var3 = var1.method3775((byte) 127);
        this.method5740(class165.method3610(var3), -737489793);
        this.field3731 = var1.method3931(2040252202);
        int var5 = var1.readUint8();
        if (var5 != 255) {
            this.method5585(-591560482);

            for (int var6 = 0; var6 < var5; ++var6) {
                class283 var7 = (class283) this
                    .method5663(new class293(var1.getString(), this.field3727),
                                1175028138);
                int var8 = var1.readUint16();
                var7.method5678(var8, ++this.field3729 - 1, 213782216);
                var7.field3710 = var1.method3931(2092273478);
                var1.getString();
                this.method5746(var7, (byte) 14);
            }

        }
    }
}
