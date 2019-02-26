package jagex.osrs;

import java.net.MalformedURLException;
import java.net.URL;

public final class Player extends class64 {

    static class323[] field635;
    static class327 computerInfo;
    class291 field618;
    class229 field630;
    class291 field607;
    class293 field625;
    int field629;
    int field609;
    boolean field624;
    String[] field627;
    int field611;
    int field617;
    int field622;
    int field614;
    int field615;
    boolean field626;
    boolean field631;
    class121 field619;
    int field616;
    int field610;
    int field613;
    int field612;
    int level;
    int field632;
    int field633;
    int id;
    int field608;
    int field606;
    int field621;
    int field623;

    Player() {
        this.field629 = -1;
        this.field609 = -1;
        this.field627 = new String[3];

        for (int var1 = 0; var1 < 3; ++var1) {
            this.field627[var1] = "";
        }

        this.field611 = 0;
        this.field617 = 0;
        this.field614 = 0;
        this.field615 = 0;
        this.field624 = false;
        this.field622 = 0;
        this.field626 = false;
        this.field607 = class291.field3713;
        this.field618 = class291.field3713;
        this.field631 = false;
    }

    static void writePreferences() {
        SeekableFile var1 = null;

        try {
            var1 = class7.getPreferencesFile("", client.gameType.name, true, -1657603693);
            Buffer var2 = GameApplet.field435.method1740(-1976129490);
            var1.write(var2.bytes, 0, var2.offset);
        } catch (Exception var4) {
            ;
        }

        try {
            if (var1 != null) {
                var1.close(true);
            }
        } catch (Exception var3) {
            ;
        }

    }

    static void method1207(Player var0, boolean var1, byte var2) {
        if (var0 != null && var0.vmethod1973(1563766353) && !var0.field626) {
            var0.field624 = false;
            if ((client.lowMemory && class83.field1226 > 50 || class83.field1226 > 200) && var1
                && var0.field972 == var0.field944) {
                var0.field624 = true;
            }

            int var3 = var0.x >> 7;
            int var4 = var0.z >> 7;
            if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
                long var5 = class0.method12(0, 0, 0, false, var0.id, 2048789964);
                if (var0.field619 != null && client.field655 >= var0.field614
                    && client.field655 < var0.field615) {
                    var0.field624 = false;
                    var0.field613 = class152
                        .method3394(var0.x, var0.z, class60.level, (byte) 67);
                    var0.field943 = client.field655;
                    class243.field3173
                        .method3069(class60.level, var0.x, var0.z, var0.field613,
                                    60, var0, var0.field940, var5, var0.field608, var0.field606,
                                    var0.field621, var0.field623);
                } else {
                    if ((var0.x & 127) == 64 && (var0.z & 127) == 64) {
                        if (client.field740[var3][var4] == client.field741) {
                            return;
                        }

                        client.field740[var3][var4] = client.field741;
                    }

                    var0.field613 = class152
                        .method3394(var0.x, var0.z, class60.level, (byte) 45);
                    var0.field943 = client.field655;
                    class243.field3173
                        .method3092(class60.level, var0.x, var0.z, var0.field613,
                                    60, var0, var0.field940, var5, var0.field941);
                }
            }
        }

    }

    static int method1219(int var0, int var1, int var2) {
        class54 var3 = (class54) class54.field534.method4224((long) var0);
        if (var3 == null) {
            return 0;
        } else if (var1 == -1) {
            return 0;
        } else {
            int var4 = 0;

            for (int var5 = 0; var5 < var3.field532.length; ++var5) {
                if (var3.field533[var5] == var1) {
                    var4 += var3.field532[var5];
                }
            }

            return var4;
        }
    }

    static boolean method1218(String var0, int var1) {
        if (var0 == null) {
            return false;
        } else {
            try {
                new URL(var0);
                return true;
            } catch (MalformedURLException var3) {
                return false;
            }
        }
    }

    protected final class121 vmethod3236(int var1) {
        if (this.field630 == null) {
            return null;
        } else {
            class275 var2 = super.field971 != -1 && super.field998 == 0 ? class29
                .method532(super.field971, 608224247) : null;
            class275 var3 =
                super.field972 != -1 && !this.field624 && (super.field944 != super.field972
                    || var2 == null) ? class29.method532(super.field972, 1023631636) : null;
            class121 var4 = this.field630
                .method4670(var2, super.field986, var3, super.field969, (byte) 9);
            if (var4 == null) {
                return null;
            } else {
                var4.method2873();
                super.field946 = var4.field1840;
                class121 var5;
                class121[] var6;
                if (!this.field624 && super.field976 != -1 && super.field993 != -1) {
                    var5 = class250.method4918(super.field976, 1696153614)
                                   .method5088(super.field993, -618328925);
                    if (var5 != null) {
                        var5.method2885(0, -super.field980, 0);
                        var6 = new class121[]{var4, var5};
                        var4 = new class121(var6, 2);
                    }
                }

                if (!this.field624 && this.field619 != null) {
                    if (client.field655 >= this.field615) {
                        this.field619 = null;
                    }

                    if (client.field655 >= this.field614 && client.field655 < this.field615) {
                        var5 = this.field619;
                        var5.method2885(this.field616 - super.x,
                                        this.field610 - this.field613,
                                        this.field612 - super.z);
                        if (super.field990 == 512) {
                            var5.method2880();
                            var5.method2880();
                            var5.method2880();
                        } else if (super.field990 == 1024) {
                            var5.method2880();
                            var5.method2880();
                        } else if (super.field990 == 1536) {
                            var5.method2880();
                        }

                        var6 = new class121[]{var4, var5};
                        var4 = new class121(var6, 2);
                        if (super.field990 == 512) {
                            var5.method2880();
                        } else if (super.field990 == 1024) {
                            var5.method2880();
                            var5.method2880();
                        } else if (super.field990 == 1536) {
                            var5.method2880();
                            var5.method2880();
                            var5.method2880();
                        }

                        var5.method2885(super.x - this.field616,
                                        this.field613 - this.field610,
                                        super.z - this.field612);
                    }
                }

                var4.field1664 = true;
                return var4;
            }
        }
    }

    void method1177(int var1) {
        this.field618 =
            class3.field26 != null && class3.field26.method5608(this.field625, (byte) 40)
                ? class291.field3712 : class291.field3711;
    }

    void method1175(int var1) {
        this.field607 =
            InboundPacketDescriptor.field2150.method1764(this.field625, (byte) -26) ? class291.field3712
                : class291.field3711;
    }

    void method1210(int var1, int var2, int var3) {
        super.field939 = 0;
        super.field959 = 0;
        super.field955 = 0;
        super.wx[0] = var1;
        super.wz[0] = var2;
        int var4 = this.getSize();
        super.x = super.wx[0] * 128 + var4 * 64;
        super.z = var4 * 64 + super.wz[0] * 128;
    }

    int getSize() {
        return this.field630 != null && this.field630.field2639 != -1 ? class248
            .method4823(this.field630.field2639, -203232767).field3600 : 1;
    }

    void method1174(byte var1) {
        this.field607 = class291.field3713;
    }

    final void method1195(int var1, int var2, byte var3, int var4) {
        if (super.field939 < 9) {
            ++super.field939;
        }

        for (int var5 = super.field939; var5 > 0; --var5) {
            super.wx[var5] = super.wx[var5 - 1];
            super.wz[var5] = super.wz[var5 - 1];
            super.field996[var5] = super.field996[var5 - 1];
        }

        super.wx[0] = var1;
        super.wz[0] = var2;
        super.field996[0] = var3;
    }

    void method1186(byte var1) {
        this.field618 = class291.field3713;
    }

    final void method1180(int var1, int var2, byte var3, byte var4) {
        if (super.field971 != -1 && class29.method532(super.field971, 1190724859).field3632 == 1) {
            super.field971 = -1;
        }

        super.field967 = -1;
        if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) {
            if (super.wx[0] >= 0 && super.wx[0] < 104 && super.wz[0] >= 0
                && super.wz[0] < 104) {
                if (var3 == 2) {
                    class267.method5221(this, var1, var2, (byte) 2, -1140391296);
                }

                this.method1195(var1, var2, var3, 1910801327);
            } else {
                this.method1210(var1, var2, -141164880);
            }
        } else {
            this.method1210(var1, var2, 1788586950);
        }

    }

    final boolean vmethod1973(int var1) {
        return this.field630 != null;
    }

    final void decode(Buffer var1) {
        var1.offset = 0;
        int var3 = var1.getUByte();
        this.field629 = var1.method3931(2042493487);
        this.field609 = var1.method3931(2098655484);
        int var4 = -1;
        this.field622 = 0;
        int[] var5 = new int[12];

        int var7;
        int var8;
        for (int var6 = 0; var6 < 12; ++var6) {
            var7 = var1.getUByte();
            if (var7 == 0) {
                var5[var6] = 0;
            } else {
                var8 = var1.getUByte();
                var5[var6] = var8 + (var7 << 8);
                if (var6 == 0 && var5[0] == 65535) {
                    var4 = var1.readUint16();
                    break;
                }

                if (var5[var6] >= 512) {
                    int var9 = class84.method2125(var5[var6] - 512, -205103429).field3540;
                    if (var9 != 0) {
                        this.field622 = var9;
                    }
                }
            }
        }

        int[] var10 = new int[5];

        for (var7 = 0; var7 < 5; ++var7) {
            var8 = var1.getUByte();
            if (var8 < 0 || var8 >= class256.field3306[var7].length) {
                var8 = 0;
            }

            var10[var7] = var8;
        }

        super.field944 = var1.readUint16();
        if (super.field944 == 65535) {
            super.field944 = -1;
        }

        super.field945 = var1.readUint16();
        if (super.field945 == 65535) {
            super.field945 = -1;
        }

        super.field957 = super.field945;
        super.field942 = var1.readUint16();
        if (super.field942 == 65535) {
            super.field942 = -1;
        }

        super.field948 = var1.readUint16();
        if (super.field948 == 65535) {
            super.field948 = -1;
        }

        super.field949 = var1.readUint16();
        if (super.field949 == 65535) {
            super.field949 = -1;
        }

        super.field950 = var1.readUint16();
        if (super.field950 == 65535) {
            super.field950 = -1;
        }

        super.field951 = var1.readUint16();
        if (super.field951 == 65535) {
            super.field951 = -1;
        }

        this.field625 = new class293(var1.method3778(-1302426604), client.field920);
        this.method1174((byte) -9);
        this.method1186((byte) 3);
        if (this == class69.localPlayer) {
            class154.field1995 = this.field625.method5706(-165222639);
        }

        this.field611 = var1.getUByte();
        this.field617 = var1.readUint16();
        this.field626 = var1.getUByte() == 1;
        if (client.field645 == 0 && client.rights >= 2) {
            this.field626 = false;
        }

        if (this.field630 == null) {
            this.field630 = new class229();
        }

        this.field630.method4664(var5, var10, var3 == 1, var4, 978549285);
    }

    boolean method1173(int var1) {
        if (this.field607 == class291.field3713) {
            this.method1175(-1489578028);
        }

        return this.field607 == class291.field3712;
    }

    boolean method1176(byte var1) {
        if (this.field618 == class291.field3713) {
            this.method1177(972255123);
        }

        return this.field618 == class291.field3712;
    }
}
