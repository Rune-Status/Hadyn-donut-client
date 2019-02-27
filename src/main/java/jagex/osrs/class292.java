package jagex.osrs;

public class class292 extends class287 {

    static int field3719;
    final class330 field3716;
    public class210 field3717;
    int field3718;

    public class292(class330 var1) {
        super(400);
        this.field3718 = 1;
        this.field3717 = new class210();
        this.field3716 = var1;
    }

    static int method5695(int var0, class86 var1, boolean var2, int var3) {
        boolean var4 = true;
        class232 var5;
        if (var0 >= 2000) {
            var0 -= 1000;
            var5 = class18.method213(ScriptExecutor.field1070[--class60.field600], -1480946647);
            var4 = false;
        } else {
            var5 = var2 ? class10.field75 : ScriptExecutor.field1080;
        }

        int var12;
        if (var0 == 1300) {
            var12 = ScriptExecutor.field1070[--class60.field600] - 1;
            if (var12 >= 0 && var12 <= 9) {
                var5.method4711(var12, ScriptExecutor.field1065[--ScriptExecutor.field1072], (byte) 32);
                return 1;
            } else {
                --ScriptExecutor.field1072;
                return 1;
            }
        } else {
            int var7;
            if (var0 == 1301) {
                class60.field600 -= 2;
                var12 = ScriptExecutor.field1070[class60.field600];
                var7 = ScriptExecutor.field1070[class60.field600 + 1];
                var5.field2748 = class9.method102(var12, var7, 639929772);
                return 1;
            } else if (var0 == 1302) {
                var5.field2784 = ScriptExecutor.field1070[--class60.field600] == 1;
                return 1;
            } else if (var0 == 1303) {
                var5.field2749 = ScriptExecutor.field1070[--class60.field600];
                return 1;
            } else if (var0 == 1304) {
                var5.field2799 = ScriptExecutor.field1070[--class60.field600];
                return 1;
            } else if (var0 == 1305) {
                var5.field2697 = ScriptExecutor.field1065[--ScriptExecutor.field1072];
                return 1;
            } else if (var0 == 1306) {
                var5.field2752 = ScriptExecutor.field1065[--ScriptExecutor.field1072];
                return 1;
            } else if (var0 == 1307) {
                var5.field2731 = null;
                return 1;
            } else {
                int var8;
                byte[] var10;
                if (var0 != 1350) {
                    byte var6;
                    if (var0 == 1351) {
                        class60.field600 -= 2;
                        var6 = 10;
                        var10 = new byte[]{(byte) ScriptExecutor.field1070[class60.field600]};
                        byte[] var11 = new byte[]{(byte) ScriptExecutor.field1070[class60.field600 + 1]};
                        class52.method1071(var5, var6, var10, var11, 1837958195);
                        return 1;
                    } else if (var0 == 1352) {
                        class60.field600 -= 3;
                        var12 = ScriptExecutor.field1070[class60.field600] - 1;
                        var7 = ScriptExecutor.field1070[class60.field600 + 1];
                        var8 = ScriptExecutor.field1070[class60.field600 + 2];
                        if (var12 >= 0 && var12 <= 9) {
                            class68.method1798(var5, var12, var7, var8, -1972993007);
                            return 1;
                        } else {
                            throw new RuntimeException();
                        }
                    } else if (var0 == 1353) {
                        var6 = 10;
                        var7 = ScriptExecutor.field1070[--class60.field600];
                        var8 = ScriptExecutor.field1070[--class60.field600];
                        class68.method1798(var5, var6, var7, var8, -1773077018);
                        return 1;
                    } else if (var0 == 1354) {
                        --class60.field600;
                        var12 = ScriptExecutor.field1070[class60.field600] - 1;
                        if (var12 >= 0 && var12 <= 9) {
                            class12.method140(var5, var12, (short) -9547);
                            return 1;
                        } else {
                            throw new RuntimeException();
                        }
                    } else if (var0 == 1355) {
                        var6 = 10;
                        class12.method140(var5, var6, (short) -9770);
                        return 1;
                    } else {
                        return 2;
                    }
                } else {
                    byte[] var9 = null;
                    var10 = null;
                    if (var4) {
                        class60.field600 -= 10;

                        for (var8 = 0; var8 < 10 && ScriptExecutor.field1070[var8 + class60.field600] >= 0;
                             var8 += 2) {
                            ;
                        }

                        if (var8 > 0) {
                            var9 = new byte[var8 / 2];
                            var10 = new byte[var8 / 2];

                            for (var8 -= 2; var8 >= 0; var8 -= 2) {
                                var9[var8 / 2] = (byte) ScriptExecutor.field1070[var8 + class60.field600];
                                var10[var8 / 2] = (byte) ScriptExecutor.field1070[var8 + class60.field600
                                    + 1];
                            }
                        }
                    } else {
                        class60.field600 -= 2;
                        var9 = new byte[]{(byte) ScriptExecutor.field1070[class60.field600]};
                        var10 = new byte[]{(byte) ScriptExecutor.field1070[class60.field600 + 1]};
                    }

                    var8 = ScriptExecutor.field1070[--class60.field600] - 1;
                    if (var8 >= 0 && var8 <= 9) {
                        class52.method1071(var5, var8, var9, var10, 1736339352);
                        return 1;
                    } else {
                        throw new RuntimeException();
                    }
                }
            }
        }
    }

    public void method5693(Buffer var1, int var2, byte var3) {
        while (true) {
            if (var1.offset < var2) {
                boolean var4 = var1.readUint8() == 1;
                class293 var5 = new class293(var1.getString(), this.field3716);
                class293 var6 = new class293(var1.getString(), this.field3716);
                int var7 = var1.readUint16();
                int var8 = var1.readUint8();
                int var9 = var1.readUint8();
                boolean var10 = (var9 & 2) != 0;
                boolean var11 = (var9 & 1) != 0;
                if (var7 > 0) {
                    var1.getString();
                    var1.readUint8();
                    var1.getInt();
                }

                var1.getString();
                if (var5 != null && var5.method5707(778130052)) {
                    class294 var12 = (class294) this.method5590(var5, -266772152);
                    if (var4) {
                        class294 var13 = (class294) this.method5590(var6, -266772152);
                        if (var13 != null && var13 != var12) {
                            if (var12 != null) {
                                this.method5641(var13, 1982430356);
                            } else {
                                var12 = var13;
                            }
                        }
                    }

                    if (var12 != null) {
                        this.method5591(var12, var5, var6, -1123176763);
                        if (var7 != var12.field3708) {
                            boolean var15 = true;

                            for (class296 var14 = (class296) this.field3717.method4317();
                                 var14 != null; var14 = (class296) this.field3717.method4318()) {
                                if (var14.field3734.equals(var5)) {
                                    if (var7 != 0 && var14.field3735 == 0) {
                                        var14.method4323();
                                        var15 = false;
                                    } else if (var7 == 0 && var14.field3735 != 0) {
                                        var14.method4323();
                                        var15 = false;
                                    }
                                }
                            }

                            if (var15) {
                                this.field3717.method4316(new class296(var5, var7));
                            }
                        }
                    } else {
                        if (this.method5586((byte) 1) >= 400) {
                            continue;
                        }

                        var12 = (class294) this.method5594(var5, var6, (byte) -57);
                    }

                    if (var7 != var12.field3708) {
                        var12.field3706 = ++this.field3718 - 1;
                        if (var12.field3708 == -1 && var7 == 0) {
                            var12.field3706 = -(var12.field3706 * -602300361) * 845682055;
                        }

                        var12.field3708 = var7;
                    }

                    var12.field3710 = var8;
                    var12.field3723 = var10;
                    var12.field3724 = var11;
                    continue;
                }

                throw new IllegalStateException();
            }

            this.method5601((short) 710);
            return;
        }
    }

    class284 vmethod5744(int var1) {
        return new class294();
    }

    public boolean method5692(class293 var1, boolean var2, int var3) {
        class294 var4 = (class294) this.method5589(var1, 2037062881);
        return var4 == null ? false : !var2 || var4.field3708 != 0;
    }

    class284[] vmethod5760(int var1, int var2) {
        return new class294[var1];
    }
}
