package jagex.osrs;

public class class275 extends class208 {

    static class202 field3619;
    static class202 field3618;
    static class249 field3616;
    static class249 field3617;
    static class249 field3631;

    static {
        field3618 = new class202(64);
        field3619 = new class202(100);
    }

    public int field3622;
    public int[] field3623;
    public int field3632;
    public int field3624;
    public int[] field3630;
    public boolean field3626;
    public int field3628;
    public int field3627;
    public int field3629;
    public int field3633;
    public int field3615;
    public int[] field3620;
    int[] field3625;
    int[] field3621;

    class275() {
        this.field3624 = -1;
        this.field3626 = false;
        this.field3627 = 5;
        this.field3628 = -1;
        this.field3629 = -1;
        this.field3633 = 99;
        this.field3622 = -1;
        this.field3632 = -1;
        this.field3615 = 2;
    }

    static void method5474(int var0, int var1, int var2) {
        OutboundPacket var3 = class131
            .method3243(class171.field2207, client.field690.random, (byte) 22);
        var3.buffer.method3939(var0, -295803274);
        var3.buffer.method3887(var1, 289154243);
        client.field690.method2193(var3, 1719060221);
    }

    static int method5491(int var0, class86 var1, boolean var2, short var3) {
        if (var0 == 3200) {
            class60.field600 -= 3;
            class36.method693(ScriptExecutor.field1070[class60.field600],
                              ScriptExecutor.field1070[class60.field600 + 1],
                              ScriptExecutor.field1070[class60.field600 + 2], -557263979);
            return 1;
        } else if (var0 == 3201) {
            class69.method1841(ScriptExecutor.field1070[--class60.field600], (byte) 2);
            return 1;
        } else if (var0 == 3202) {
            class60.field600 -= 2;
            class254.method4994(ScriptExecutor.field1070[class60.field600],
                                ScriptExecutor.field1070[class60.field600 + 1], 1163401710);
            return 1;
        } else {
            return 2;
        }
    }

    void method5455(Buffer var1, int var2, int var3) {
        int var4;
        int var5;
        if (var2 == 1) {
            var4 = var1.readUint16();
            this.field3630 = new int[var4];

            for (var5 = 0; var5 < var4; ++var5) {
                this.field3630[var5] = var1.readUint16();
            }

            this.field3623 = new int[var4];

            for (var5 = 0; var5 < var4; ++var5) {
                this.field3623[var5] = var1.readUint16();
            }

            for (var5 = 0; var5 < var4; ++var5) {
                this.field3623[var5] += var1.readUint16() << 16;
            }
        } else if (var2 == 2) {
            this.field3624 = var1.readUint16();
        } else if (var2 == 3) {
            var4 = var1.readUint8();
            this.field3625 = new int[var4 + 1];

            for (var5 = 0; var5 < var4; ++var5) {
                this.field3625[var5] = var1.readUint8();
            }

            this.field3625[var4] = 9999999;
        } else if (var2 == 4) {
            this.field3626 = true;
        } else if (var2 == 5) {
            this.field3627 = var1.readUint8();
        } else if (var2 == 6) {
            this.field3628 = var1.readUint16();
        } else if (var2 == 7) {
            this.field3629 = var1.readUint16();
        } else if (var2 == 8) {
            this.field3633 = var1.readUint8();
        } else if (var2 == 9) {
            this.field3622 = var1.readUint8();
        } else if (var2 == 10) {
            this.field3632 = var1.readUint8();
        } else if (var2 == 11) {
            this.field3615 = var1.readUint8();
        } else if (var2 == 12) {
            var4 = var1.readUint8();
            this.field3621 = new int[var4];

            for (var5 = 0; var5 < var4; ++var5) {
                this.field3621[var5] = var1.readUint16();
            }

            for (var5 = 0; var5 < var4; ++var5) {
                this.field3621[var5] += var1.readUint16() << 16;
            }
        } else if (var2 == 13) {
            var4 = var1.readUint8();
            this.field3620 = new int[var4];

            for (var5 = 0; var5 < var4; ++var5) {
                this.field3620[var5] = var1.method3773(2039541860);
            }
        }

    }

    public class121 method5457(class121 var1, int var2, int var3) {
        var2 = this.field3623[var2];
        class132 var4 = class24.method475(var2 >> 16, (byte) 116);
        var2 &= 65535;
        if (var4 == null) {
            return var1.method2869(true);
        } else {
            class121 var5 = var1.method2869(!var4.method3244(var2, 1511950076));
            var5.method2870(var4, var2);
            return var5;
        }
    }

    public class121 method5459(class121 var1, int var2, class275 var3, int var4, int var5) {
        var2 = this.field3623[var2];
        class132 var6 = class24.method475(var2 >> 16, (byte) 99);
        var2 &= 65535;
        if (var6 == null) {
            return var3.method5457(var1, var4, -1140097691);
        } else {
            var4 = var3.field3623[var4];
            class132 var7 = class24.method475(var4 >> 16, (byte) 111);
            var4 &= 65535;
            class121 var8;
            if (var7 == null) {
                var8 = var1.method2869(!var6.method3244(var2, 929319360));
                var8.method2870(var6, var2);
                return var8;
            } else {
                var8 = var1.method2869(
                    !var6.method3244(var2, 811533793) & !var7.method3244(var4, 1278540791));
                var8.method2886(var6, var2, var7, var4, this.field3625);
                return var8;
            }
        }
    }

    class121 method5458(class121 var1, int var2, int var3, int var4) {
        var2 = this.field3623[var2];
        class132 var5 = class24.method475(var2 >> 16, (byte) 63);
        var2 &= 65535;
        if (var5 == null) {
            return var1.method2869(true);
        } else {
            class121 var6 = var1.method2869(!var5.method3244(var2, -1277706266));
            var3 &= 3;
            if (var3 == 1) {
                var6.method2896();
            } else if (var3 == 2) {
                var6.method2884();
            } else if (var3 == 3) {
                var6.method2880();
            }

            var6.method2870(var5, var2);
            if (var3 == 1) {
                var6.method2880();
            } else if (var3 == 2) {
                var6.method2884();
            } else if (var3 == 3) {
                var6.method2896();
            }

            return var6;
        }
    }

    class121 method5486(class121 var1, int var2, int var3) {
        var2 = this.field3623[var2];
        class132 var4 = class24.method475(var2 >> 16, (byte) 38);
        var2 &= 65535;
        if (var4 == null) {
            return var1.method2881(true);
        } else {
            class121 var5 = var1.method2881(!var4.method3244(var2, -210132170));
            var5.method2870(var4, var2);
            return var5;
        }
    }

    public class121 method5453(class121 var1, int var2, int var3) {
        int var4 = this.field3623[var2];
        class132 var5 = class24.method475(var4 >> 16, (byte) 93);
        var4 &= 65535;
        if (var5 == null) {
            return var1.method2869(true);
        } else {
            class132 var6 = null;
            int var7 = 0;
            if (this.field3621 != null && var2 < this.field3621.length) {
                var7 = this.field3621[var2];
                var6 = class24.method475(var7 >> 16, (byte) 93);
                var7 &= 65535;
            }

            class121 var8;
            if (var6 != null && var7 != 65535) {
                var8 = var1.method2869(
                    !var5.method3244(var4, 1861328292) & !var6.method3244(var7, 2102376508));
                var8.method2870(var5, var4);
                var8.method2870(var6, var7);
                return var8;
            } else {
                var8 = var1.method2869(!var5.method3244(var4, 110398069));
                var8.method2870(var5, var4);
                return var8;
            }
        }
    }

    void method5456(int var1) {
        if (this.field3622 == -1) {
            if (this.field3625 != null) {
                this.field3622 = 2;
            } else {
                this.field3622 = 0;
            }
        }

        if (this.field3632 == -1) {
            if (this.field3625 != null) {
                this.field3632 = 2;
            } else {
                this.field3632 = 0;
            }
        }

    }

    void method5464(Buffer var1, int var2) {
        while (true) {
            int var3 = var1.readUint8();
            if (var3 == 0) {
                return;
            }

            this.method5455(var1, var3, 1917758889);
        }
    }
}
