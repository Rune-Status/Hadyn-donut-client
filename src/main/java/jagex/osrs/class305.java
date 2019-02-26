package jagex.osrs;

public final class class305 {

    static final char[] field3791;

    static {
        field3791 = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
            'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3',
            '4', '5', '6', '7', '8', '9'};
    }

    static void method5919(class66[] var0, int var1, int var2, int[] var3, int[] var4, int var5) {
        if (var1 < var2) {
            int var6 = var1 - 1;
            int var7 = var2 + 1;
            int var8 = (var2 + var1) / 2;
            class66 var9 = var0[var8];
            var0[var8] = var0[var1];
            var0[var1] = var9;

            while (var6 < var7) {
                boolean var10 = true;

                int var11;
                int var12;
                int var13;
                do {
                    --var7;

                    for (var11 = 0; var11 < 4; ++var11) {
                        if (var3[var11] == 2) {
                            var12 = var0[var7].field1024;
                            var13 = var9.field1024;
                        } else if (var3[var11] == 1) {
                            var12 = var0[var7].field1020;
                            var13 = var9.field1020;
                            if (var12 == -1 && var4[var11] == 1) {
                                var12 = 2001;
                            }

                            if (var13 == -1 && var4[var11] == 1) {
                                var13 = 2001;
                            }
                        } else if (var3[var11] == 3) {
                            var12 = var0[var7].method1684(-1158560872) ? 1 : 0;
                            var13 = var9.method1684(-1158560872) ? 1 : 0;
                        } else {
                            var12 = var0[var7].field1015;
                            var13 = var9.field1015;
                        }

                        if (var12 != var13) {
                            if ((var4[var11] != 1 || var12 <= var13) && (var4[var11] != 0
                                || var12 >= var13)) {
                                var10 = false;
                            }
                            break;
                        }

                        if (var11 == 3) {
                            var10 = false;
                        }
                    }
                } while (var10);

                var10 = true;

                do {
                    ++var6;

                    for (var11 = 0; var11 < 4; ++var11) {
                        if (var3[var11] == 2) {
                            var12 = var0[var6].field1024;
                            var13 = var9.field1024;
                        } else if (var3[var11] == 1) {
                            var12 = var0[var6].field1020;
                            var13 = var9.field1020;
                            if (var12 == -1 && var4[var11] == 1) {
                                var12 = 2001;
                            }

                            if (var13 == -1 && var4[var11] == 1) {
                                var13 = 2001;
                            }
                        } else if (var3[var11] == 3) {
                            var12 = var0[var6].method1684(-1158560872) ? 1 : 0;
                            var13 = var9.method1684(-1158560872) ? 1 : 0;
                        } else {
                            var12 = var0[var6].field1015;
                            var13 = var9.field1015;
                        }

                        if (var12 != var13) {
                            if ((var4[var11] != 1 || var12 >= var13) && (var4[var11] != 0
                                || var12 <= var13)) {
                                var10 = false;
                            }
                            break;
                        }

                        if (var11 == 3) {
                            var10 = false;
                        }
                    }
                } while (var10);

                if (var6 < var7) {
                    class66 var14 = var0[var6];
                    var0[var6] = var0[var7];
                    var0[var7] = var14;
                }
            }

            method5919(var0, var1, var7, var3, var4, -599409831);
            method5919(var0, var7 + 1, var2, var3, var4, -1110210009);
        }

    }
}
