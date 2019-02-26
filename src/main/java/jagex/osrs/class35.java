package jagex.osrs;

public class class35 {

    byte[][][] field340;
    int field342;

    class35(int var1) {
        this.field342 = var1;
    }

    static void method688(int var0, int var1, int var2, int var3, String var4, short var5) {
        class232 var6 = class9.method102(var1, var2, -1387474084);
        if (var6 != null) {
            if (var6.field2773 != null) {
                class57 var7 = new class57();
                var7.field570 = var6;
                var7.field567 = var0;
                var7.field571 = var4;
                var7.field575 = var6.field2773;
                class53.method1076(var7, 1475267745);
            }

            boolean var12 = true;
            if (var6.field2741 > 0) {
                var12 = class14.method145(var6, -366696120);
            }

            if (var12) {
                int var9 = class254.method5000(var6, 2136279535);
                int var10 = var0 - 1;
                boolean var8 = (var9 >> var10 + 1 & 1) != 0;
                if (var8) {
                    OutboundPacket var11;
                    if (var0 == 1) {
                        var11 = class131
                            .method3243(class171.field2275, client.field690.random, (byte) 121);
                        var11.buffer.writeInt(var1);
                        var11.buffer.writeShort(var2);
                        var11.buffer.writeShort(var3);
                        client.field690.method2193(var11, -533726857);
                    }

                    if (var0 == 2) {
                        var11 = class131
                            .method3243(class171.field2228, client.field690.random, (byte) 11);
                        var11.buffer.writeInt(var1);
                        var11.buffer.writeShort(var2);
                        var11.buffer.writeShort(var3);
                        client.field690.method2193(var11, 507036334);
                    }

                    if (var0 == 3) {
                        var11 = class131
                            .method3243(class171.field2255, client.field690.random, (byte) 26);
                        var11.buffer.writeInt(var1);
                        var11.buffer.writeShort(var2);
                        var11.buffer.writeShort(var3);
                        client.field690.method2193(var11, -405420291);
                    }

                    if (var0 == 4) {
                        var11 = class131
                            .method3243(class171.field2226, client.field690.random, (byte) 121);
                        var11.buffer.writeInt(var1);
                        var11.buffer.writeShort(var2);
                        var11.buffer.writeShort(var3);
                        client.field690.method2193(var11, 226105153);
                    }

                    if (var0 == 5) {
                        var11 = class131
                            .method3243(class171.field2247, client.field690.random, (byte) 71);
                        var11.buffer.writeInt(var1);
                        var11.buffer.writeShort(var2);
                        var11.buffer.writeShort(var3);
                        client.field690.method2193(var11, 886732010);
                    }

                    if (var0 == 6) {
                        var11 = class131
                            .method3243(class171.field2273, client.field690.random, (byte) 53);
                        var11.buffer.writeInt(var1);
                        var11.buffer.writeShort(var2);
                        var11.buffer.writeShort(var3);
                        client.field690.method2193(var11, 897876117);
                    }

                    if (var0 == 7) {
                        var11 = class131
                            .method3243(class171.field2292, client.field690.random, (byte) 40);
                        var11.buffer.writeInt(var1);
                        var11.buffer.writeShort(var2);
                        var11.buffer.writeShort(var3);
                        client.field690.method2193(var11, -703658258);
                    }

                    if (var0 == 8) {
                        var11 = class131
                            .method3243(class171.field2221, client.field690.random, (byte) 113);
                        var11.buffer.writeInt(var1);
                        var11.buffer.writeShort(var2);
                        var11.buffer.writeShort(var3);
                        client.field690.method2193(var11, 385555513);
                    }

                    if (var0 == 9) {
                        var11 = class131
                            .method3243(class171.field2295, client.field690.random, (byte) 35);
                        var11.buffer.writeInt(var1);
                        var11.buffer.writeShort(var2);
                        var11.buffer.writeShort(var3);
                        client.field690.method2193(var11, 1659337071);
                    }

                    if (var0 == 10) {
                        var11 = class131
                            .method3243(class171.field2246, client.field690.random, (byte) 31);
                        var11.buffer.writeInt(var1);
                        var11.buffer.writeShort(var2);
                        var11.buffer.writeShort(var3);
                        client.field690.method2193(var11, -628549062);
                    }

                }
            }
        }
    }

    public static int method654(int var0, int var1) {
        long var3 = class122.field1714[var0];
        int var2 = (int) (var3 >>> 14 & 3L);
        return var2;
    }

    void method665(int var1) {
        byte[] var2 = new byte[this.field342 * this.field342];
        int var3 = 0;

        int var4;
        int var5;
        for (var4 = 0; var4 < this.field342; ++var4) {
            for (var5 = 0; var5 < this.field342; ++var5) {
                if (var5 <= var4) {
                    var2[var3] = -1;
                }

                ++var3;
            }
        }

        this.field340[0][0] = var2;
        var2 = new byte[this.field342 * this.field342];
        var3 = 0;

        for (var4 = this.field342 - 1; var4 >= 0; --var4) {
            for (var5 = 0; var5 < this.field342; ++var5) {
                if (var5 <= var4) {
                    var2[var3] = -1;
                }

                ++var3;
            }
        }

        this.field340[0][1] = var2;
        var2 = new byte[this.field342 * this.field342];
        var3 = 0;

        for (var4 = 0; var4 < this.field342; ++var4) {
            for (var5 = 0; var5 < this.field342; ++var5) {
                if (var5 >= var4) {
                    var2[var3] = -1;
                }

                ++var3;
            }
        }

        this.field340[0][2] = var2;
        var2 = new byte[this.field342 * this.field342];
        var3 = 0;

        for (var4 = this.field342 - 1; var4 >= 0; --var4) {
            for (var5 = 0; var5 < this.field342; ++var5) {
                if (var5 >= var4) {
                    var2[var3] = -1;
                }

                ++var3;
            }
        }

        this.field340[0][3] = var2;
    }

    int method651(int var1, int var2, int var3) {
        if (var2 == 9) {
            var1 = var1 + 1 & 3;
        }

        if (var2 == 10) {
            var1 = var1 + 3 & 3;
        }

        if (var2 == 11) {
            var1 = var1 + 3 & 3;
        }

        return var1;
    }

    void method649(int var1) {
        byte[] var2 = new byte[this.field342 * this.field342];
        int var3 = 0;

        int var4;
        int var5;
        for (var4 = this.field342 - 1; var4 >= 0; --var4) {
            for (var5 = 0; var5 < this.field342; ++var5) {
                if (var5 <= var4 >> 1) {
                    var2[var3] = -1;
                }

                ++var3;
            }
        }

        this.field340[1][0] = var2;
        var2 = new byte[this.field342 * this.field342];
        var3 = 0;

        for (var4 = 0; var4 < this.field342; ++var4) {
            for (var5 = 0; var5 < this.field342; ++var5) {
                if (var3 >= 0 && var3 < var2.length) {
                    if (var5 >= var4 << 1) {
                        var2[var3] = -1;
                    }

                    ++var3;
                } else {
                    ++var3;
                }
            }
        }

        this.field340[1][1] = var2;
        var2 = new byte[this.field342 * this.field342];
        var3 = 0;

        for (var4 = 0; var4 < this.field342; ++var4) {
            for (var5 = this.field342 - 1; var5 >= 0; --var5) {
                if (var5 <= var4 >> 1) {
                    var2[var3] = -1;
                }

                ++var3;
            }
        }

        this.field340[1][2] = var2;
        var2 = new byte[this.field342 * this.field342];
        var3 = 0;

        for (var4 = this.field342 - 1; var4 >= 0; --var4) {
            for (var5 = this.field342 - 1; var5 >= 0; --var5) {
                if (var5 >= var4 << 1) {
                    var2[var3] = -1;
                }

                ++var3;
            }
        }

        this.field340[1][3] = var2;
    }

    int method675(int var1, short var2) {
        return var1 != 9 && var1 != 10 ? (var1 == 11 ? 8 : var1) : 1;
    }

    void method674(int var1) {
        byte[] var2 = new byte[this.field342 * this.field342];
        int var3 = 0;

        int var4;
        int var5;
        for (var4 = this.field342 - 1; var4 >= 0; --var4) {
            for (var5 = this.field342 - 1; var5 >= 0; --var5) {
                if (var5 <= var4 >> 1) {
                    var2[var3] = -1;
                }

                ++var3;
            }
        }

        this.field340[2][0] = var2;
        var2 = new byte[this.field342 * this.field342];
        var3 = 0;

        for (var4 = this.field342 - 1; var4 >= 0; --var4) {
            for (var5 = 0; var5 < this.field342; ++var5) {
                if (var5 >= var4 << 1) {
                    var2[var3] = -1;
                }

                ++var3;
            }
        }

        this.field340[2][1] = var2;
        var2 = new byte[this.field342 * this.field342];
        var3 = 0;

        for (var4 = 0; var4 < this.field342; ++var4) {
            for (var5 = 0; var5 < this.field342; ++var5) {
                if (var5 <= var4 >> 1) {
                    var2[var3] = -1;
                }

                ++var3;
            }
        }

        this.field340[2][2] = var2;
        var2 = new byte[this.field342 * this.field342];
        var3 = 0;

        for (var4 = 0; var4 < this.field342; ++var4) {
            for (var5 = this.field342 - 1; var5 >= 0; --var5) {
                if (var5 >= var4 << 1) {
                    var2[var3] = -1;
                }

                ++var3;
            }
        }

        this.field340[2][3] = var2;
    }

    void method656(int var1) {
        byte[] var2 = new byte[this.field342 * this.field342];
        int var3 = 0;

        int var4;
        int var5;
        for (var4 = this.field342 - 1; var4 >= 0; --var4) {
            for (var5 = 0; var5 < this.field342; ++var5) {
                if (var5 >= var4 >> 1) {
                    var2[var3] = -1;
                }

                ++var3;
            }
        }

        this.field340[3][0] = var2;
        var2 = new byte[this.field342 * this.field342];
        var3 = 0;

        for (var4 = 0; var4 < this.field342; ++var4) {
            for (var5 = 0; var5 < this.field342; ++var5) {
                if (var5 <= var4 << 1) {
                    var2[var3] = -1;
                }

                ++var3;
            }
        }

        this.field340[3][1] = var2;
        var2 = new byte[this.field342 * this.field342];
        var3 = 0;

        for (var4 = 0; var4 < this.field342; ++var4) {
            for (var5 = this.field342 - 1; var5 >= 0; --var5) {
                if (var5 >= var4 >> 1) {
                    var2[var3] = -1;
                }

                ++var3;
            }
        }

        this.field340[3][2] = var2;
        var2 = new byte[this.field342 * this.field342];
        var3 = 0;

        for (var4 = this.field342 - 1; var4 >= 0; --var4) {
            for (var5 = this.field342 - 1; var5 >= 0; --var5) {
                if (var5 <= var4 << 1) {
                    var2[var3] = -1;
                }

                ++var3;
            }
        }

        this.field340[3][3] = var2;
    }

    void method657(byte var1) {
        byte[] var2 = new byte[this.field342 * this.field342];
        int var3 = 0;

        int var4;
        int var5;
        for (var4 = this.field342 - 1; var4 >= 0; --var4) {
            for (var5 = this.field342 - 1; var5 >= 0; --var5) {
                if (var5 >= var4 >> 1) {
                    var2[var3] = -1;
                }

                ++var3;
            }
        }

        this.field340[4][0] = var2;
        var2 = new byte[this.field342 * this.field342];
        var3 = 0;

        for (var4 = this.field342 - 1; var4 >= 0; --var4) {
            for (var5 = 0; var5 < this.field342; ++var5) {
                if (var5 <= var4 << 1) {
                    var2[var3] = -1;
                }

                ++var3;
            }
        }

        this.field340[4][1] = var2;
        var2 = new byte[this.field342 * this.field342];
        var3 = 0;

        for (var4 = 0; var4 < this.field342; ++var4) {
            for (var5 = 0; var5 < this.field342; ++var5) {
                if (var5 >= var4 >> 1) {
                    var2[var3] = -1;
                }

                ++var3;
            }
        }

        this.field340[4][2] = var2;
        var2 = new byte[this.field342 * this.field342];
        var3 = 0;

        for (var4 = 0; var4 < this.field342; ++var4) {
            for (var5 = this.field342 - 1; var5 >= 0; --var5) {
                if (var5 <= var4 << 1) {
                    var2[var3] = -1;
                }

                ++var3;
            }
        }

        this.field340[4][3] = var2;
    }

    void method662(byte var1) {
        byte[] var2 = new byte[this.field342 * this.field342];
        boolean var3 = false;
        var2 = new byte[this.field342 * this.field342];
        int var6 = 0;

        int var4;
        int var5;
        for (var4 = 0; var4 < this.field342; ++var4) {
            for (var5 = 0; var5 < this.field342; ++var5) {
                if (var5 <= this.field342 / 2) {
                    var2[var6] = -1;
                }

                ++var6;
            }
        }

        this.field340[5][0] = var2;
        var2 = new byte[this.field342 * this.field342];
        var6 = 0;

        for (var4 = 0; var4 < this.field342; ++var4) {
            for (var5 = 0; var5 < this.field342; ++var5) {
                if (var4 <= this.field342 / 2) {
                    var2[var6] = -1;
                }

                ++var6;
            }
        }

        this.field340[5][1] = var2;
        var2 = new byte[this.field342 * this.field342];
        var6 = 0;

        for (var4 = 0; var4 < this.field342; ++var4) {
            for (var5 = 0; var5 < this.field342; ++var5) {
                if (var5 >= this.field342 / 2) {
                    var2[var6] = -1;
                }

                ++var6;
            }
        }

        this.field340[5][2] = var2;
        var2 = new byte[this.field342 * this.field342];
        var6 = 0;

        for (var4 = 0; var4 < this.field342; ++var4) {
            for (var5 = 0; var5 < this.field342; ++var5) {
                if (var4 >= this.field342 / 2) {
                    var2[var6] = -1;
                }

                ++var6;
            }
        }

        this.field340[5][3] = var2;
    }

    void method689(int var1) {
        byte[] var2 = new byte[this.field342 * this.field342];
        boolean var3 = false;
        var2 = new byte[this.field342 * this.field342];
        int var6 = 0;

        int var4;
        int var5;
        for (var4 = 0; var4 < this.field342; ++var4) {
            for (var5 = 0; var5 < this.field342; ++var5) {
                if (var5 <= var4 - this.field342 / 2) {
                    var2[var6] = -1;
                }

                ++var6;
            }
        }

        this.field340[6][0] = var2;
        var2 = new byte[this.field342 * this.field342];
        var6 = 0;

        for (var4 = this.field342 - 1; var4 >= 0; --var4) {
            for (var5 = 0; var5 < this.field342; ++var5) {
                if (var5 <= var4 - this.field342 / 2) {
                    var2[var6] = -1;
                }

                ++var6;
            }
        }

        this.field340[6][1] = var2;
        var2 = new byte[this.field342 * this.field342];
        var6 = 0;

        for (var4 = this.field342 - 1; var4 >= 0; --var4) {
            for (var5 = this.field342 - 1; var5 >= 0; --var5) {
                if (var5 <= var4 - this.field342 / 2) {
                    var2[var6] = -1;
                }

                ++var6;
            }
        }

        this.field340[6][2] = var2;
        var2 = new byte[this.field342 * this.field342];
        var6 = 0;

        for (var4 = 0; var4 < this.field342; ++var4) {
            for (var5 = this.field342 - 1; var5 >= 0; --var5) {
                if (var5 <= var4 - this.field342 / 2) {
                    var2[var6] = -1;
                }

                ++var6;
            }
        }

        this.field340[6][3] = var2;
    }

    void method660(int var1) {
        byte[] var2 = new byte[this.field342 * this.field342];
        boolean var3 = false;
        var2 = new byte[this.field342 * this.field342];
        int var6 = 0;

        int var4;
        int var5;
        for (var4 = 0; var4 < this.field342; ++var4) {
            for (var5 = 0; var5 < this.field342; ++var5) {
                if (var5 >= var4 - this.field342 / 2) {
                    var2[var6] = -1;
                }

                ++var6;
            }
        }

        this.field340[7][0] = var2;
        var2 = new byte[this.field342 * this.field342];
        var6 = 0;

        for (var4 = this.field342 - 1; var4 >= 0; --var4) {
            for (var5 = 0; var5 < this.field342; ++var5) {
                if (var5 >= var4 - this.field342 / 2) {
                    var2[var6] = -1;
                }

                ++var6;
            }
        }

        this.field340[7][1] = var2;
        var2 = new byte[this.field342 * this.field342];
        var6 = 0;

        for (var4 = this.field342 - 1; var4 >= 0; --var4) {
            for (var5 = this.field342 - 1; var5 >= 0; --var5) {
                if (var5 >= var4 - this.field342 / 2) {
                    var2[var6] = -1;
                }

                ++var6;
            }
        }

        this.field340[7][2] = var2;
        var2 = new byte[this.field342 * this.field342];
        var6 = 0;

        for (var4 = 0; var4 < this.field342; ++var4) {
            for (var5 = this.field342 - 1; var5 >= 0; --var5) {
                if (var5 >= var4 - this.field342 / 2) {
                    var2[var6] = -1;
                }

                ++var6;
            }
        }

        this.field340[7][3] = var2;
    }

    void method652(int var1) {
        if (this.field340 == null) {
            this.field340 = new byte[8][4][];
            this.method665(1640638568);
            this.method649(-676844424);
            this.method674(-1570917245);
            this.method656(1036338620);
            this.method657((byte) -48);
            this.method662((byte) 37);
            this.method689(1335590161);
            this.method660(1102634812);
        }
    }

    void method690(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8,
                   int var9) {
        if (var7 != 0 && this.field342 != 0 && this.field340 != null) {
            var8 = this.method651(var8, var7, -1104372319);
            var7 = this.method675(var7, (short) 18077);
            class319.method6049(var1, var2, var5, var6, var3, var4, this.field340[var7 - 1][var8],
                                this.field342, true);
        }
    }
}
