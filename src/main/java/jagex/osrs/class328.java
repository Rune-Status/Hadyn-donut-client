package jagex.osrs;

public class class328 {

    boolean field3938;
    int field3937;
    class249 field3936;
    String field3939;

    class328(class249 var1) {
        this.field3937 = 0;
        this.field3938 = false;
        this.field3936 = var1;
    }

    static int method6311(int var0, class86 var1, boolean var2, int var3) {
        int var4;
        int var5;
        int var7;
        if (var0 == 3400) {
            class60.field600 -= 2;
            var4 = class70.field1070[class60.field600];
            var5 = class70.field1070[class60.field600 + 1];
            class268 var6 = class86.method2166(var4, 1801855127);
            if (var6.field3417 != 's') {
                ;
            }

            for (var7 = 0; var7 < var6.field3420; ++var7) {
                if (var5 == var6.field3416[var7]) {
                    class70.field1065[++class70.field1072 - 1] = var6.field3423[var7];
                    var6 = null;
                    break;
                }
            }

            if (var6 != null) {
                class70.field1065[++class70.field1072 - 1] = var6.field3421;
            }

            return 1;
        } else if (var0 != 3408) {
            if (var0 == 3411) {
                var4 = class70.field1070[--class60.field600];
                class268 var11 = class86.method2166(var4, 1915362488);
                class70.field1070[++class60.field600 - 1] = var11.method5225((byte) 2);
                return 1;
            } else {
                return 2;
            }
        } else {
            class60.field600 -= 4;
            var4 = class70.field1070[class60.field600];
            var5 = class70.field1070[class60.field600 + 1];
            int var10 = class70.field1070[class60.field600 + 2];
            var7 = class70.field1070[class60.field600 + 3];
            class268 var8 = class86.method2166(var10, 1042323579);
            if (var4 == var8.field3425 && var5 == var8.field3417) {
                for (int var9 = 0; var9 < var8.field3420; ++var9) {
                    if (var7 == var8.field3416[var9]) {
                        if (var5 == 115) {
                            class70.field1065[++class70.field1072 - 1] = var8.field3423[var9];
                        } else {
                            class70.field1070[++class60.field600 - 1] = var8.field3422[var9];
                        }

                        var8 = null;
                        break;
                    }
                }

                if (var8 != null) {
                    if (var5 == 115) {
                        class70.field1065[++class70.field1072 - 1] = var8.field3421;
                    } else {
                        class70.field1070[++class60.field600 - 1] = var8.field3415;
                    }
                }

                return 1;
            } else {
                if (var5 == 115) {
                    class70.field1065[++class70.field1072 - 1] = "null";
                } else {
                    class70.field1070[++class60.field600 - 1] = 0;
                }

                return 1;
            }
        }
    }

    int method6305(int var1) {
        if (this.field3937 < 25) {
            if (!this.field3936.method4853(class29.field288.field298, this.field3939, 441648010)) {
                return this.field3937;
            }

            this.field3937 = 25;
        }

        if (this.field3937 == 25) {
            if (!this.field3936
                .method4853(this.field3939, class29.field290.field298, -1830520025)) {
                return 25 + this.field3936.method4845(this.field3939, 29775380) * 25 / 100;
            }

            this.field3937 = 50;
        }

        if (this.field3937 == 50) {
            if (this.field3936.method4848(class29.field289.field298, this.field3939, (short) -6199)
                && !this.field3936
                .method4853(class29.field289.field298, this.field3939, -1584194847)) {
                return 50;
            }

            this.field3937 = 75;
        }

        if (this.field3937 == 75) {
            if (!this.field3936.method4853(this.field3939, class29.field292.field298, 298111493)) {
                return 75;
            }

            this.field3937 = 100;
            this.field3938 = true;
        }

        return this.field3937;
    }

    boolean method6306(byte var1) {
        return this.field3938;
    }

    void method6304(String var1, int var2) {
        if (var1 != null && !var1.isEmpty()) {
            if (var1 != this.field3939) {
                this.field3939 = var1;
                this.field3937 = 0;
                this.field3938 = false;
                this.method6305(-831040829);
            }
        }
    }

    int method6315(int var1) {
        return this.field3937;
    }
}
