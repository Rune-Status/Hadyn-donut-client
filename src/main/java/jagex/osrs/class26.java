package jagex.osrs;

public class class26 {

    protected static boolean field264;

    static class223 method490(class249 var0, int var1, int var2) {
        byte[] var3 = var0.method4835(var1, (short) -31442);
        return var3 == null ? null : new class223(var3);
    }

    public static int method491(byte[] var0, int var1, CharSequence var2, int var3) {
        int var4 = var2.length();
        int var5 = var1;

        for (int var6 = 0; var6 < var4; ++var6) {
            char var7 = var2.charAt(var6);
            if (var7 <= 127) {
                var0[var5++] = (byte) var7;
            } else if (var7 <= 2047) {
                var0[var5++] = (byte) (192 | var7 >> 6);
                var0[var5++] = (byte) (128 | var7 & '?');
            } else {
                var0[var5++] = (byte) (224 | var7 >> '\f');
                var0[var5++] = (byte) (128 | var7 >> 6 & 63);
                var0[var5++] = (byte) (128 | var7 & '?');
            }
        }

        return var5 - var1;
    }

    static int method489(int var0, class86 var1, boolean var2, int var3) {
        int var5 = -1;
        class232 var4;
        if (var0 >= 2000) {
            var0 -= 1000;
            var5 = ScriptExecutor.field1070[--class60.field600];
            var4 = class18.method213(var5, -417096583);
        } else {
            var4 = var2 ? class10.field75 : ScriptExecutor.field1080;
        }

        if (var0 == 1100) {
            class60.field600 -= 2;
            var4.field2711 = ScriptExecutor.field1070[class60.field600];
            if (var4.field2711 > var4.field2690 - var4.field2682) {
                var4.field2711 = var4.field2690 - var4.field2682;
            }

            if (var4.field2711 < 0) {
                var4.field2711 = 0;
            }

            var4.field2689 = ScriptExecutor.field1070[class60.field600 + 1];
            if (var4.field2689 > var4.field2691 - var4.field2683) {
                var4.field2689 = var4.field2691 - var4.field2683;
            }

            if (var4.field2689 < 0) {
                var4.field2689 = 0;
            }

            class37.method721(var4, 1238023037);
            return 1;
        } else if (var0 == 1101) {
            var4.field2686 = ScriptExecutor.field1070[--class60.field600];
            class37.method721(var4, 1238023037);
            return 1;
        } else if (var0 == 1102) {
            var4.field2696 = ScriptExecutor.field1070[--class60.field600] == 1;
            class37.method721(var4, 1238023037);
            return 1;
        } else if (var0 == 1103) {
            var4.field2698 = ScriptExecutor.field1070[--class60.field600];
            class37.method721(var4, 1238023037);
            return 1;
        } else if (var0 == 1104) {
            var4.field2768 = ScriptExecutor.field1070[--class60.field600];
            class37.method721(var4, 1238023037);
            return 1;
        } else if (var0 == 1105) {
            var4.field2702 = ScriptExecutor.field1070[--class60.field600];
            class37.method721(var4, 1238023037);
            return 1;
        } else if (var0 == 1106) {
            var4.field2780 = ScriptExecutor.field1070[--class60.field600];
            class37.method721(var4, 1238023037);
            return 1;
        } else if (var0 == 1107) {
            var4.field2705 = ScriptExecutor.field1070[--class60.field600] == 1;
            class37.method721(var4, 1238023037);
            return 1;
        } else if (var0 == 1108) {
            var4.field2740 = 1;
            var4.field2755 = ScriptExecutor.field1070[--class60.field600];
            class37.method721(var4, 1238023037);
            return 1;
        } else if (var0 == 1109) {
            class60.field600 -= 6;
            var4.field2718 = ScriptExecutor.field1070[class60.field600];
            var4.field2717 = ScriptExecutor.field1070[class60.field600 + 1];
            var4.field2732 = ScriptExecutor.field1070[class60.field600 + 2];
            var4.field2719 = ScriptExecutor.field1070[class60.field600 + 3];
            var4.field2720 = ScriptExecutor.field1070[class60.field600 + 4];
            var4.field2721 = ScriptExecutor.field1070[class60.field600 + 5];
            class37.method721(var4, 1238023037);
            return 1;
        } else {
            int var9;
            if (var0 == 1110) {
                var9 = ScriptExecutor.field1070[--class60.field600];
                if (var9 != var4.field2714) {
                    var4.field2714 = var9;
                    var4.field2795 = 0;
                    var4.field2750 = 0;
                    class37.method721(var4, 1238023037);
                }

                return 1;
            } else if (var0 == 1111) {
                var4.field2688 = ScriptExecutor.field1070[--class60.field600] == 1;
                class37.method721(var4, 1238023037);
                return 1;
            } else if (var0 == 1112) {
                String var8 = ScriptExecutor.field1065[--ScriptExecutor.field1072];
                if (!var8.equals(var4.field2728)) {
                    var4.field2728 = var8;
                    class37.method721(var4, 1238023037);
                }

                return 1;
            } else if (var0 == 1113) {
                var4.field2727 = ScriptExecutor.field1070[--class60.field600];
                class37.method721(var4, 1238023037);
                return 1;
            } else if (var0 == 1114) {
                class60.field600 -= 3;
                var4.field2681 = ScriptExecutor.field1070[class60.field600];
                var4.field2776 = ScriptExecutor.field1070[class60.field600 + 1];
                var4.field2730 = ScriptExecutor.field1070[class60.field600 + 2];
                class37.method721(var4, 1238023037);
                return 1;
            } else if (var0 == 1115) {
                var4.field2716 = ScriptExecutor.field1070[--class60.field600] == 1;
                class37.method721(var4, 1238023037);
                return 1;
            } else if (var0 == 1116) {
                var4.field2706 = ScriptExecutor.field1070[--class60.field600];
                class37.method721(var4, 1238023037);
                return 1;
            } else if (var0 == 1117) {
                var4.field2707 = ScriptExecutor.field1070[--class60.field600];
                class37.method721(var4, 1238023037);
                return 1;
            } else if (var0 == 1118) {
                var4.field2671 = ScriptExecutor.field1070[--class60.field600] == 1;
                class37.method721(var4, 1238023037);
                return 1;
            } else if (var0 == 1119) {
                var4.field2709 = ScriptExecutor.field1070[--class60.field600] == 1;
                class37.method721(var4, 1238023037);
                return 1;
            } else if (var0 == 1120) {
                class60.field600 -= 2;
                var4.field2690 = ScriptExecutor.field1070[class60.field600];
                var4.field2691 = ScriptExecutor.field1070[class60.field600 + 1];
                class37.method721(var4, 1238023037);
                if (var5 != -1 && var4.field2808 == 0) {
                    class223.method4594(class145.field1951[var5 >> 16], var4, false, 1658306306);
                }

                return 1;
            } else if (var0 == 1121) {
                class275.method5474(var4.field2770, var4.field2787, -1324695219);
                client.field880 = var4;
                class37.method721(var4, 1238023037);
                return 1;
            } else if (var0 == 1122) {
                var4.field2703 = ScriptExecutor.field1070[--class60.field600];
                class37.method721(var4, 1238023037);
                return 1;
            } else if (var0 == 1123) {
                var4.field2693 = ScriptExecutor.field1070[--class60.field600];
                class37.method721(var4, 1238023037);
                return 1;
            } else if (var0 == 1124) {
                var4.field2699 = ScriptExecutor.field1070[--class60.field600];
                class37.method721(var4, 1238023037);
                return 1;
            } else if (var0 == 1125) {
                var9 = ScriptExecutor.field1070[--class60.field600];
                class321 var7 = (class321) class43
                    .method791(class136.method3271(-535730210), var9, 1443720514);
                if (var7 != null) {
                    var4.field2744 = var7;
                    class37.method721(var4, 1238023037);
                }

                return 1;
            } else {
                boolean var6;
                if (var0 == 1126) {
                    var6 = ScriptExecutor.field1070[--class60.field600] == 1;
                    var4.field2701 = var6;
                    return 1;
                } else if (var0 == 1127) {
                    var6 = ScriptExecutor.field1070[--class60.field600] == 1;
                    var4.field2725 = var6;
                    return 1;
                } else {
                    return 2;
                }
            }
        }
    }
}
