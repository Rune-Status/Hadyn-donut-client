package jagex.osrs;

public class class60 extends class168 {

    static int level;
    static int field605;
    static int field604;
    static int field600;

    public static void method1169(int var0) {
        class256.field3304.method4199();
    }

    static int method1170(int var0, class86 var1, boolean var2, int var3) {
        int var4;
        if (var0 == 4200) {
            var4 = ScriptExecutor.field1070[--field600];
            ScriptExecutor.field1065[++ScriptExecutor.field1072 - 1] = ItemConfig
                .get(var4).field3515;
            return 1;
        } else {
            int var5;
            ItemConfig var6;
            if (var0 == 4201) {
                field600 -= 2;
                var4 = ScriptExecutor.field1070[field600];
                var5 = ScriptExecutor.field1070[field600 + 1];
                var6 = ItemConfig.get(var4);
                if (var5 >= 1 && var5 <= 5 && var6.field3526[var5 - 1] != null) {
                    ScriptExecutor.field1065[++ScriptExecutor.field1072 - 1] = var6.field3526[var5 - 1];
                } else {
                    ScriptExecutor.field1065[++ScriptExecutor.field1072 - 1] = "";
                }

                return 1;
            } else if (var0 == 4202) {
                field600 -= 2;
                var4 = ScriptExecutor.field1070[field600];
                var5 = ScriptExecutor.field1070[field600 + 1];
                var6 = ItemConfig.get(var4);
                if (var5 >= 1 && var5 <= 5 && var6.field3541[var5 - 1] != null) {
                    ScriptExecutor.field1065[++ScriptExecutor.field1072 - 1] = var6.field3541[var5 - 1];
                } else {
                    ScriptExecutor.field1065[++ScriptExecutor.field1072 - 1] = "";
                }

                return 1;
            } else if (var0 == 4203) {
                var4 = ScriptExecutor.field1070[--field600];
                ScriptExecutor.field1070[++field600 - 1] = ItemConfig.get(var4).value;
                return 1;
            } else if (var0 == 4204) {
                var4 = ScriptExecutor.field1070[--field600];
                ScriptExecutor.field1070[++field600 - 1] =
                    ItemConfig.get(var4).stackable == 1 ? 1 : 0;
                return 1;
            } else {
                ItemConfig var7;
                if (var0 == 4205) {
                    var4 = ScriptExecutor.field1070[--field600];
                    var7 = ItemConfig.get(var4);
                    if (var7.field3552 == -1 && var7.field3549 >= 0) {
                        ScriptExecutor.field1070[++field600 - 1] = var7.field3549;
                    } else {
                        ScriptExecutor.field1070[++field600 - 1] = var4;
                    }

                    return 1;
                } else if (var0 == 4206) {
                    var4 = ScriptExecutor.field1070[--field600];
                    var7 = ItemConfig.get(var4);
                    if (var7.field3552 >= 0 && var7.field3549 >= 0) {
                        ScriptExecutor.field1070[++field600 - 1] = var7.field3549;
                    } else {
                        ScriptExecutor.field1070[++field600 - 1] = var4;
                    }

                    return 1;
                } else if (var0 == 4207) {
                    var4 = ScriptExecutor.field1070[--field600];
                    ScriptExecutor.field1070[++field600 - 1] =
                        ItemConfig.get(var4).field3512 ? 1 : 0;
                    return 1;
                } else if (var0 == 4208) {
                    var4 = ScriptExecutor.field1070[--field600];
                    var7 = ItemConfig.get(var4);
                    if (var7.field3510 == -1 && var7.field3555 >= 0) {
                        ScriptExecutor.field1070[++field600 - 1] = var7.field3555;
                    } else {
                        ScriptExecutor.field1070[++field600 - 1] = var4;
                    }

                    return 1;
                } else if (var0 == 4209) {
                    var4 = ScriptExecutor.field1070[--field600];
                    var7 = ItemConfig.get(var4);
                    if (var7.field3510 >= 0 && var7.field3555 >= 0) {
                        ScriptExecutor.field1070[++field600 - 1] = var7.field3555;
                    } else {
                        ScriptExecutor.field1070[++field600 - 1] = var4;
                    }

                    return 1;
                } else if (var0 == 4210) {
                    String var8 = ScriptExecutor.field1065[--ScriptExecutor.field1072];
                    var5 = ScriptExecutor.field1070[--field600];
                    class48.method1017(var8, var5 == 1, (byte) -114);
                    ScriptExecutor.field1070[++field600 - 1] = class152.field1983;
                    return 1;
                } else if (var0 != 4211) {
                    if (var0 == 4212) {
                        class9.field69 = 0;
                        return 1;
                    } else {
                        return 2;
                    }
                } else {
                    if (class33.field325 != null && class9.field69 < class152.field1983) {
                        ScriptExecutor.field1070[++field600 - 1] =
                            class33.field325[++class9.field69 - 1] & '\uffff';
                    } else {
                        ScriptExecutor.field1070[++field600 - 1] = -1;
                    }

                    return 1;
                }
            }
        }
    }

    public boolean vmethod3646(int var1, int var2, int var3, class166 var4, int var5) {
        return var2 == super.field2116 && var3 == super.field2112;
    }
}
