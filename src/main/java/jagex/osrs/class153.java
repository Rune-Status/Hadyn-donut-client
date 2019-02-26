package jagex.osrs;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class class153 implements Runnable {

    static class232 field1993;
    IOException field1992;
    int field1991;
    int field1987;
    int field1990;
    byte[] field1989;
    InputStream field1986;
    Thread field1988;

    class153(InputStream var1, int var2) {
        this.field1987 = 0;
        this.field1991 = 0;
        this.field1986 = var1;
        this.field1990 = var2 + 1;
        this.field1989 = new byte[this.field1990];
        this.field1988 = new Thread(this);
        this.field1988.setDaemon(true);
        this.field1988.start();
    }

    static final void method3412(PacketBuffer var0, int var1) {
        for (int var2 = 0; var2 < class83.field1227; ++var2) {
            int var3 = class83.field1234[var2];
            Player var4 = client.players[var3];
            int var5 = var0.getUByte();
            if ((var5 & 8) != 0) {
                var5 += var0.getUByte() << 8;
            }

            byte var6 = -1;
            int var7;
            int var8;
            int var10;
            int var11;
            int var14;
            if ((var5 & 64) != 0) {
                var7 = var0.method3883((byte) 53);
                int var9;
                int var12;
                int var13;
                if (var7 > 0) {
                    for (var8 = 0; var8 < var7; ++var8) {
                        var10 = -1;
                        var11 = -1;
                        var12 = -1;
                        var9 = var0.method3783(1915822765);
                        if (var9 == 32767) {
                            var9 = var0.method3783(-1398914522);
                            var11 = var0.method3783(-935649920);
                            var10 = var0.method3783(-1454214375);
                            var12 = var0.method3783(742501996);
                        } else if (var9 != 32766) {
                            var11 = var0.method3783(766020957);
                        } else {
                            var9 = -1;
                        }

                        var13 = var0.method3783(2102952310);
                        var4.method1675(var9, var11, var10, var12, client.field655, var13,
                                        873938021);
                    }
                }

                var8 = var0.method3799(-1841158467);
                if (var8 > 0) {
                    for (var9 = 0; var9 < var8; ++var9) {
                        var10 = var0.method3783(-390048038);
                        var11 = var0.method3783(797496173);
                        if (var11 != 32767) {
                            var12 = var0.method3783(-646327830);
                            var13 = var0.method3883((byte) 54);
                            var14 = var11 > 0 ? var0.getUByte() : var13;
                            var4.method1677(var10, client.field655, var11, var12, var13, var14,
                                            -962990836);
                        } else {
                            var4.method1663(var10, -171357995);
                        }
                    }
                }
            }

            if ((var5 & 512) != 0) {
                var4.field976 = var0.method3792(1511442963);
                var7 = var0.method3964(287627655);
                var4.field980 = var7 >> 16;
                var4.field979 = (var7 & 65535) + client.field655;
                var4.field993 = 0;
                var4.field978 = 0;
                if (var4.field979 > client.field655) {
                    var4.field993 = -1;
                }

                if (var4.field976 == 65535) {
                    var4.field976 = -1;
                }
            }

            if ((var5 & 4096) != 0) {
                var6 = var0.method3968(1240278984);
            }

            if ((var5 & 1024) != 0) {
                var4.field983 = var0.method3803((byte) 44);
                var4.field995 = var0.method3968(-700238249);
                var4.field982 = var0.method3968(1087393087);
                var4.field984 = var0.method3803((byte) 104);
                var4.field985 = var0.method3808(-1377952443) + client.field655;
                var4.field977 = var0.method3807(964649540) + client.field655;
                var4.field997 = var0.readUint16();
                if (var4.field631) {
                    var4.field983 += var4.field632;
                    var4.field995 += var4.field633;
                    var4.field982 += var4.field632;
                    var4.field984 += var4.field633;
                    var4.field939 = 0;
                } else {
                    var4.field983 += var4.wx[0];
                    var4.field995 += var4.wz[0];
                    var4.field982 += var4.wx[0];
                    var4.field984 += var4.wz[0];
                    var4.field939 = 1;
                }

                var4.field959 = 0;
            }

            if ((var5 & 32) != 0) {
                var4.field968 = var0.method3778(-1559420360);
                if (var4.field968.charAt(0) == '~') {
                    var4.field968 = var4.field968.substring(1);
                    class59.method1163(2, var4.field625.method5706(-165222639), var4.field968,
                                       -1483885983);
                } else if (var4 == class69.localPlayer) {
                    class59.method1163(2, var4.field625.method5706(-165222639), var4.field968,
                                       -1483885983);
                }

                var4.field958 = false;
                var4.field956 = 0;
                var4.field974 = 0;
                var4.field981 = 150;
            }

            if ((var5 & 4) != 0) {
                var4.field967 = var0.method3807(1841844258);
                if (var4.field939 == 0) {
                    var4.field990 = var4.field967;
                    var4.field967 = -1;
                }
            }

            if ((var5 & 1) != 0) {
                var7 = var0.method3891((byte) 0);
                byte[] var15 = new byte[var7];
                Buffer var16 = new Buffer(var15);
                var0.method3919(var15, 0, var7, (byte) 121);
                class83.playerConfigs[var3] = var16;
                var4.decode(var16);
            }

            if ((var5 & 2) != 0) {
                var4.field965 = var0.method3808(-1660066921);
                if (var4.field965 == 65535) {
                    var4.field965 = -1;
                }
            }

            if ((var5 & 2048) != 0) {
                class83.field1224[var3] = var0.method3968(580651894);
            }

            if ((var5 & 16) != 0) {
                var7 = var0.method3808(-1767020862);
                class244 var21 = (class244) class43
                    .method791(class6.method80(-1062474475), var0.getUByte(),
                               1443720514);
                boolean var19 = var0.method3799(-616675794) == 1;
                var10 = var0.getUByte();
                var11 = var0.offset;
                if (var4.field625 != null && var4.field630 != null) {
                    boolean var20 = false;
                    if (var21.field3190 && InboundPacketDescriptor.field2150
                        .method1803(var4.field625, 1440386847)) {
                        var20 = true;
                    }

                    if (!var20 && client.field680 == 0 && !var4.field626) {
                        class83.field1235.offset = 0;
                        var0.method3781(class83.field1235.bytes, 0, var10, (byte) 5);
                        class83.field1235.offset = 0;
                        String var17 = class301.method5797(class235.method4782(
                            class22.method332(class83.field1235, (byte) 48), -2028936754));
                        var4.field968 = var17.trim();
                        var4.field956 = var7 >> 8;
                        var4.field974 = var7 & 255;
                        var4.field981 = 150;
                        var4.field958 = var19;
                        var4.field954 =
                            var4 != class69.localPlayer && var21.field3190 && "" != client.field862
                                && var17.toLowerCase().indexOf(client.field862) == -1;
                        if (var21.field3188) {
                            var14 = var19 ? 91 : 1;
                        } else {
                            var14 = var19 ? 90 : 2;
                        }

                        if (var21.field3185 != -1) {
                            class59.method1163(var14, class19.method243(var21.field3185, 1164159478)
                                + var4.field625.method5706(-165222639), var17, -1483885983);
                        } else {
                            class59.method1163(var14, var4.field625.method5706(-165222639), var17,
                                               -1483885983);
                        }
                    }
                }

                var0.offset = var11 + var10;
            }

            if ((var5 & 256) != 0) {
                for (var7 = 0; var7 < 3; ++var7) {
                    var4.field627[var7] = var0.method3778(-1603824245);
                }
            }

            if ((var5 & 128) != 0) {
                var7 = var0.readUint16();
                if (var7 == 65535) {
                    var7 = -1;
                }

                var8 = var0.getUByte();
                class34.method617(var4, var7, var8, 1513609761);
            }

            if (var4.field631) {
                if (var6 == 127) {
                    var4.method1210(var4.field632, var4.field633, 1367949802);
                } else {
                    byte var18;
                    if (var6 != -1) {
                        var18 = var6;
                    } else {
                        var18 = class83.field1224[var3];
                    }

                    var4.method1180(var4.field632, var4.field633, var18, (byte) 50);
                }
            }
        }

    }

    static int method3396(int var0, class86 var1, boolean var2, int var3) {
        int var4;
        if (var0 == 5504) {
            class60.field600 -= 2;
            var4 = class70.field1070[class60.field600];
            int var5 = class70.field1070[class60.field600 + 1];
            if (!client.field889) {
                client.field712 = var4;
                client.field658 = var5;
            }

            return 1;
        } else if (var0 == 5505) {
            class70.field1070[++class60.field600 - 1] = client.field712;
            return 1;
        } else if (var0 == 5506) {
            class70.field1070[++class60.field600 - 1] = client.field658;
            return 1;
        } else if (var0 == 5530) {
            var4 = class70.field1070[--class60.field600];
            if (var4 < 0) {
                var4 = 0;
            }

            client.field719 = var4;
            return 1;
        } else if (var0 == 5531) {
            class70.field1070[++class60.field600 - 1] = client.field719;
            return 1;
        } else {
            return 2;
        }
    }

    boolean isReadable(int var1) throws IOException {
        if (var1 == 0) {
            return true;
        } else if (var1 > 0 && var1 < this.field1990) {
            synchronized (this) {
                int var4;
                if (this.field1987 <= this.field1991) {
                    var4 = this.field1991 - this.field1987;
                } else {
                    var4 = this.field1990 - this.field1987 + this.field1991;
                }

                if (var4 < var1) {
                    if (this.field1992 != null) {
                        throw new IOException(this.field1992.toString());
                    } else {
                        this.notifyAll();
                        return false;
                    }
                } else {
                    return true;
                }
            }
        } else {
            throw new IOException();
        }
    }

    int method3398(int var1) throws IOException {
        synchronized (this) {
            if (this.field1991 == this.field1987) {
                if (this.field1992 != null) {
                    throw new IOException(this.field1992.toString());
                } else {
                    return -1;
                }
            } else {
                int var3 = this.field1989[this.field1987] & 255;
                this.field1987 = (this.field1987 + 1) % this.field1990;
                this.notifyAll();
                return var3;
            }
        }
    }

    int method3407(byte[] var1, int var2, int var3, int var4) throws IOException {
        if (var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
            synchronized (this) {
                int var6;
                if (this.field1987 <= this.field1991) {
                    var6 = this.field1991 - this.field1987;
                } else {
                    var6 = this.field1990 - this.field1987 + this.field1991;
                }

                if (var3 > var6) {
                    var3 = var6;
                }

                if (var3 == 0 && this.field1992 != null) {
                    throw new IOException(this.field1992.toString());
                } else {
                    if (var3 + this.field1987 <= this.field1990) {
                        System.arraycopy(this.field1989, this.field1987, var1, var2, var3);
                    } else {
                        int var7 = this.field1990 - this.field1987;
                        System.arraycopy(this.field1989, this.field1987, var1, var2, var7);
                        System.arraycopy(this.field1989, 0, var1, var7 + var2, var3 - var7);
                    }

                    this.field1987 = (var3 + this.field1987) % this.field1990;
                    this.notifyAll();
                    return var3;
                }
            }
        } else {
            throw new IOException();
        }
    }

    int method3397(int var1) throws IOException {
        synchronized (this) {
            int var3;
            if (this.field1987 <= this.field1991) {
                var3 = this.field1991 - this.field1987;
            } else {
                var3 = this.field1990 - this.field1987 + this.field1991;
            }

            if (var3 <= 0 && this.field1992 != null) {
                throw new IOException(this.field1992.toString());
            } else {
                this.notifyAll();
                return var3;
            }
        }
    }

    void method3405(int var1) {
        synchronized (this) {
            if (this.field1992 == null) {
                this.field1992 = new IOException("");
            }

            this.notifyAll();
        }

        try {
            this.field1988.join();
        } catch (InterruptedException var4) {
            ;
        }

    }

    public void run() {
        while (true) {
            int var1;
            synchronized (this) {
                while (true) {
                    if (this.field1992 != null) {
                        return;
                    }

                    if (this.field1987 == 0) {
                        var1 = this.field1990 - this.field1991 - 1;
                    } else if (this.field1987 <= this.field1991) {
                        var1 = this.field1990 - this.field1991;
                    } else {
                        var1 = this.field1987 - this.field1991 - 1;
                    }

                    if (var1 > 0) {
                        break;
                    }

                    try {
                        this.wait();
                    } catch (InterruptedException var10) {
                        ;
                    }
                }
            }

            int var7;
            try {
                var7 = this.field1986.read(this.field1989, this.field1991, var1);
                if (var7 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var11) {
                IOException var3 = var11;
                synchronized (this) {
                    this.field1992 = var3;
                    return;
                }
            }

            synchronized (this) {
                this.field1991 = (var7 + this.field1991) % this.field1990;
            }
        }
    }
}
