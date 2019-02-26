package jagex.osrs;

public class class18 implements class31 {

    static class232[] field165;
    static class300 field175;
    int field167;
    int field174;
    int field164;
    int field172;
    int field171;
    int field166;
    int field173;
    int field168;
    int field177;
    int field169;

    public static class232 method213(int var0, int var1) {
        int var2 = var0 >> 16;
        int var3 = var0 & 65535;
        if (class145.field1951[var2] == null || class145.field1951[var2][var3] == null) {
            boolean var4 = class189.method4028(var2, 1333062004);
            if (!var4) {
                return null;
            }
        }

        return class145.field1951[var2][var3];
    }

    static final void method237(String var0, int var1) {
        class34.method643(var0 + " is already on your friend list", 527422054);
    }

    static final boolean method239(class232 var0, int var1) {
        if (var0.field2786 == null) {
            return false;
        } else {
            for (int var2 = 0; var2 < var0.field2786.length; ++var2) {
                int var3 = class74.method1984(var0, var2, 1939527040);
                int var4 = var0.field2778[var2];
                if (var0.field2786[var2] == 2) {
                    if (var3 >= var4) {
                        return false;
                    }
                } else if (var0.field2786[var2] == 3) {
                    if (var3 <= var4) {
                        return false;
                    }
                } else if (var0.field2786[var2] == 4) {
                    if (var4 == var3) {
                        return false;
                    }
                } else if (var4 != var3) {
                    return false;
                }
            }

            return true;
        }
    }

    static int method238(int var0, class86 var1, boolean var2, byte var3) {
        class232 var4;
        if (var0 >= 2000) {
            var0 -= 1000;
            var4 = method213(class70.field1070[--class60.field600], -870883205);
        } else {
            var4 = var2 ? class10.field75 : class70.field1080;
        }

        String var5 = class70.field1065[--class70.field1072];
        int[] var6 = null;
        if (var5.length() > 0 && var5.charAt(var5.length() - 1) == 'Y') {
            int var7 = class70.field1070[--class60.field600];
            if (var7 > 0) {
                for (var6 = new int[var7]; var7-- > 0;
                     var6[var7] = class70.field1070[--class60.field600]) {
                    ;
                }
            }

            var5 = var5.substring(0, var5.length() - 1);
        }

        Object[] var9 = new Object[var5.length() + 1];

        int var8;
        for (var8 = var9.length - 1; var8 >= 1; --var8) {
            if (var5.charAt(var8 - 1) == 's') {
                var9[var8] = class70.field1065[--class70.field1072];
            } else {
                var9[var8] = new Integer(class70.field1070[--class60.field600]);
            }
        }

        var8 = class70.field1070[--class60.field600];
        if (var8 != -1) {
            var9[0] = new Integer(var8);
        } else {
            var9 = null;
        }

        if (var0 == 1400) {
            var4.field2656 = var9;
        } else if (var0 == 1401) {
            var4.field2758 = var9;
        } else if (var0 == 1402) {
            var4.field2756 = var9;
        } else if (var0 == 1403) {
            var4.field2759 = var9;
        } else if (var0 == 1404) {
            var4.field2761 = var9;
        } else if (var0 == 1405) {
            var4.field2712 = var9;
        } else if (var0 == 1406) {
            var4.field2742 = var9;
        } else if (var0 == 1407) {
            var4.field2766 = var9;
            var4.field2767 = var6;
        } else if (var0 == 1408) {
            var4.field2658 = var9;
        } else if (var0 == 1409) {
            var4.field2773 = var9;
        } else if (var0 == 1410) {
            var4.field2763 = var9;
        } else if (var0 == 1411) {
            var4.field2803 = var9;
        } else if (var0 == 1412) {
            var4.field2760 = var9;
        } else if (var0 == 1414) {
            var4.field2660 = var9;
            var4.field2769 = var6;
        } else if (var0 == 1415) {
            var4.field2667 = var9;
            var4.field2771 = var6;
        } else if (var0 == 1416) {
            var4.field2764 = var9;
        } else if (var0 == 1417) {
            var4.field2774 = var9;
        } else if (var0 == 1418) {
            var4.field2775 = var9;
        } else if (var0 == 1419) {
            var4.field2666 = var9;
        } else if (var0 == 1420) {
            var4.field2777 = var9;
        } else if (var0 == 1421) {
            var4.field2747 = var9;
        } else if (var0 == 1422) {
            var4.field2779 = var9;
        } else if (var0 == 1423) {
            var4.field2789 = var9;
        } else if (var0 == 1424) {
            var4.field2781 = var9;
        } else if (var0 == 1425) {
            var4.field2783 = var9;
        } else if (var0 == 1426) {
            var4.field2796 = var9;
        } else {
            if (var0 != 1427) {
                return 2;
            }

            var4.field2782 = var9;
        }

        var4.field2753 = true;
        return 1;
    }

    public boolean vmethod706(int var1, int var2, byte var3) {
        return var1 >> 6 >= this.field167 && var1 >> 6 <= this.field172
            && var2 >> 6 >= this.field171 && var2 >> 6 <= this.field173;
    }

    public boolean vmethod696(int var1, int var2, int var3, byte var4) {
        return var1 >= this.field174 && var1 < this.field164 + this.field174 ?
            var2 >> 6 >= this.field166 && var2 >> 6 <= this.field168 && var3 >> 6 >= this.field177
                && var3 >> 6 <= this.field169 : false;
    }

    public void vmethod697(class20 var1, byte var2) {
        if (var1.field198 > this.field167) {
            var1.field198 = this.field167;
        }

        if (var1.field199 < this.field172) {
            var1.field199 = this.field172;
        }

        if (var1.field194 > this.field171) {
            var1.field194 = this.field171;
        }

        if (var1.field203 < this.field173) {
            var1.field203 = this.field173;
        }

    }

    public class228 vmethod695(int var1, int var2, byte var3) {
        if (!this.vmethod706(var1, var2, (byte) 87)) {
            return null;
        } else {
            int var4 = this.field166 * 64 - this.field167 * 64 + var1;
            int var5 = this.field177 * 64 - this.field171 * 64 + var2;
            return new class228(this.field174, var4, var5);
        }
    }

    public int[] vmethod715(int var1, int var2, int var3, int var4) {
        if (!this.vmethod696(var1, var2, var3, (byte) -73)) {
            return null;
        } else {
            int[] var5 = new int[]{this.field167 * 64 - this.field166 * 64 + var2,
                var3 + (this.field171 * 64 - this.field177 * 64)};
            return var5;
        }
    }

    public void vmethod709(Buffer var1, int var2) {
        this.field174 = var1.getUByte();
        this.field164 = var1.getUByte();
        this.field166 = var1.readUint16();
        this.field177 = var1.readUint16();
        this.field168 = var1.readUint16();
        this.field169 = var1.readUint16();
        this.field167 = var1.readUint16();
        this.field171 = var1.readUint16();
        this.field172 = var1.readUint16();
        this.field173 = var1.readUint16();
        this.method234(753243796);
    }

    void method234(int var1) {
    }
}
