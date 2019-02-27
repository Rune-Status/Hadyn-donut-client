package jagex.osrs;

public class class166 {

    public int field2097;
    public int[][] field2101;
    public int field2086;
    int field2089;
    int field2096;

    public class166(int var1, int var2) {
        this.field2097 = 0;
        this.field2086 = 0;
        this.field2089 = var1;
        this.field2096 = var2;
        this.field2101 = new int[this.field2089][this.field2096];
        this.method3612(-1613750531);
    }

    static int method3641(int var0, class86 var1, boolean var2, int var3) {
        int var4 = -1;
        class232 var5;
        if (var0 >= 2000) {
            var0 -= 1000;
            var4 = ScriptExecutor.field1070[--class60.field600];
            var5 = class18.method213(var4, -1050374823);
        } else {
            var5 = var2 ? class10.field75 : ScriptExecutor.field1080;
        }

        if (var0 == 1000) {
            class60.field600 -= 4;
            var5.field2676 = ScriptExecutor.field1070[class60.field600];
            var5.field2751 = ScriptExecutor.field1070[class60.field600 + 1];
            var5.field2672 = ScriptExecutor.field1070[class60.field600 + 2];
            var5.field2673 = ScriptExecutor.field1070[class60.field600 + 3];
            class37.method721(var5, 1238023037);
            class157.field2037.method1577(var5, -794294536);
            if (var4 != -1 && var5.field2808 == 0) {
                class223.method4594(class145.field1951[var4 >> 16], var5, false, 1658306306);
            }

            return 1;
        } else if (var0 == 1001) {
            class60.field600 -= 4;
            var5.field2678 = ScriptExecutor.field1070[class60.field600];
            var5.field2679 = ScriptExecutor.field1070[class60.field600 + 1];
            var5.field2736 = ScriptExecutor.field1070[class60.field600 + 2];
            var5.field2675 = ScriptExecutor.field1070[class60.field600 + 3];
            class37.method721(var5, 1238023037);
            class157.field2037.method1577(var5, -794294536);
            if (var4 != -1 && var5.field2808 == 0) {
                class223.method4594(class145.field1951[var4 >> 16], var5, false, 1658306306);
            }

            return 1;
        } else if (var0 == 1003) {
            boolean var6 = ScriptExecutor.field1070[--class60.field600] == 1;
            if (var6 != var5.field2704) {
                var5.field2704 = var6;
                class37.method721(var5, 1238023037);
            }

            return 1;
        } else if (var0 == 1005) {
            var5.field2807 = ScriptExecutor.field1070[--class60.field600] == 1;
            return 1;
        } else if (var0 == 1006) {
            var5.field2746 = ScriptExecutor.field1070[--class60.field600] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    void method3619(int var1, int var2, int var3, int var4) {
        this.field2101[var1][var2] &= ~var3;
    }

    void method3635(int var1, int var2, int var3, int var4) {
        this.field2101[var1][var2] |= var3;
    }

    public void method3612(int var1) {
        for (int var2 = 0; var2 < this.field2089; ++var2) {
            for (int var3 = 0; var3 < this.field2096; ++var3) {
                if (var2 != 0 && var3 != 0 && var2 < this.field2089 - 5
                    && var3 < this.field2096 - 5) {
                    this.field2101[var2][var3] = 16777216;
                } else {
                    this.field2101[var2][var3] = 16777215;
                }
            }
        }

    }

    public void method3617(int var1, int var2, int var3, int var4, boolean var5, int var6) {
        var1 -= this.field2097;
        var2 -= this.field2086;
        if (var3 == 0) {
            if (var4 == 0) {
                this.method3619(var1, var2, 128, -1422883307);
                this.method3619(var1 - 1, var2, 8, -1422883307);
            }

            if (var4 == 1) {
                this.method3619(var1, var2, 2, -1422883307);
                this.method3619(var1, var2 + 1, 32, -1422883307);
            }

            if (var4 == 2) {
                this.method3619(var1, var2, 8, -1422883307);
                this.method3619(var1 + 1, var2, 128, -1422883307);
            }

            if (var4 == 3) {
                this.method3619(var1, var2, 32, -1422883307);
                this.method3619(var1, var2 - 1, 2, -1422883307);
            }
        }

        if (var3 == 1 || var3 == 3) {
            if (var4 == 0) {
                this.method3619(var1, var2, 1, -1422883307);
                this.method3619(var1 - 1, var2 + 1, 16, -1422883307);
            }

            if (var4 == 1) {
                this.method3619(var1, var2, 4, -1422883307);
                this.method3619(var1 + 1, var2 + 1, 64, -1422883307);
            }

            if (var4 == 2) {
                this.method3619(var1, var2, 16, -1422883307);
                this.method3619(var1 + 1, var2 - 1, 1, -1422883307);
            }

            if (var4 == 3) {
                this.method3619(var1, var2, 64, -1422883307);
                this.method3619(var1 - 1, var2 - 1, 4, -1422883307);
            }
        }

        if (var3 == 2) {
            if (var4 == 0) {
                this.method3619(var1, var2, 130, -1422883307);
                this.method3619(var1 - 1, var2, 8, -1422883307);
                this.method3619(var1, var2 + 1, 32, -1422883307);
            }

            if (var4 == 1) {
                this.method3619(var1, var2, 10, -1422883307);
                this.method3619(var1, var2 + 1, 32, -1422883307);
                this.method3619(var1 + 1, var2, 128, -1422883307);
            }

            if (var4 == 2) {
                this.method3619(var1, var2, 40, -1422883307);
                this.method3619(var1 + 1, var2, 128, -1422883307);
                this.method3619(var1, var2 - 1, 2, -1422883307);
            }

            if (var4 == 3) {
                this.method3619(var1, var2, 160, -1422883307);
                this.method3619(var1, var2 - 1, 2, -1422883307);
                this.method3619(var1 - 1, var2, 8, -1422883307);
            }
        }

        if (var5) {
            if (var3 == 0) {
                if (var4 == 0) {
                    this.method3619(var1, var2, 65536, -1422883307);
                    this.method3619(var1 - 1, var2, 4096, -1422883307);
                }

                if (var4 == 1) {
                    this.method3619(var1, var2, 1024, -1422883307);
                    this.method3619(var1, var2 + 1, 16384, -1422883307);
                }

                if (var4 == 2) {
                    this.method3619(var1, var2, 4096, -1422883307);
                    this.method3619(var1 + 1, var2, 65536, -1422883307);
                }

                if (var4 == 3) {
                    this.method3619(var1, var2, 16384, -1422883307);
                    this.method3619(var1, var2 - 1, 1024, -1422883307);
                }
            }

            if (var3 == 1 || var3 == 3) {
                if (var4 == 0) {
                    this.method3619(var1, var2, 512, -1422883307);
                    this.method3619(var1 - 1, var2 + 1, 8192, -1422883307);
                }

                if (var4 == 1) {
                    this.method3619(var1, var2, 2048, -1422883307);
                    this.method3619(var1 + 1, var2 + 1, 32768, -1422883307);
                }

                if (var4 == 2) {
                    this.method3619(var1, var2, 8192, -1422883307);
                    this.method3619(var1 + 1, var2 - 1, 512, -1422883307);
                }

                if (var4 == 3) {
                    this.method3619(var1, var2, 32768, -1422883307);
                    this.method3619(var1 - 1, var2 - 1, 2048, -1422883307);
                }
            }

            if (var3 == 2) {
                if (var4 == 0) {
                    this.method3619(var1, var2, 66560, -1422883307);
                    this.method3619(var1 - 1, var2, 4096, -1422883307);
                    this.method3619(var1, var2 + 1, 16384, -1422883307);
                }

                if (var4 == 1) {
                    this.method3619(var1, var2, 5120, -1422883307);
                    this.method3619(var1, var2 + 1, 16384, -1422883307);
                    this.method3619(var1 + 1, var2, 65536, -1422883307);
                }

                if (var4 == 2) {
                    this.method3619(var1, var2, 20480, -1422883307);
                    this.method3619(var1 + 1, var2, 65536, -1422883307);
                    this.method3619(var1, var2 - 1, 1024, -1422883307);
                }

                if (var4 == 3) {
                    this.method3619(var1, var2, 81920, -1422883307);
                    this.method3619(var1, var2 - 1, 1024, -1422883307);
                    this.method3619(var1 - 1, var2, 4096, -1422883307);
                }
            }
        }

    }

    public void method3620(int var1, int var2, byte var3) {
        var1 -= this.field2097;
        var2 -= this.field2086;
        this.field2101[var1][var2] &= -262145;
    }

    public void method3618(int var1, int var2, int var3, int var4, int var5, boolean var6,
                           int var7) {
        int var8 = 256;
        if (var6) {
            var8 += 131072;
        }

        var1 -= this.field2097;
        var2 -= this.field2086;
        int var9;
        if (var5 == 1 || var5 == 3) {
            var9 = var3;
            var3 = var4;
            var4 = var9;
        }

        for (var9 = var1; var9 < var3 + var1; ++var9) {
            if (var9 >= 0 && var9 < this.field2089) {
                for (int var10 = var2; var10 < var2 + var4; ++var10) {
                    if (var10 >= 0 && var10 < this.field2096) {
                        this.method3619(var9, var10, var8, -1422883307);
                    }
                }
            }
        }

    }

    public void method3614(int var1, int var2, int var3) {
        var1 -= this.field2097;
        var2 -= this.field2086;
        this.field2101[var1][var2] |= 262144;
    }

    public void method3639(int var1, int var2, int var3, int var4, boolean var5, int var6) {
        int var7 = 256;
        if (var5) {
            var7 += 131072;
        }

        var1 -= this.field2097;
        var2 -= this.field2086;

        for (int var8 = var1; var8 < var3 + var1; ++var8) {
            if (var8 >= 0 && var8 < this.field2089) {
                for (int var9 = var2; var9 < var2 + var4; ++var9) {
                    if (var9 >= 0 && var9 < this.field2096) {
                        this.method3635(var8, var9, var7, -1379765951);
                    }
                }
            }
        }

    }

    public void method3613(int var1, int var2, int var3, int var4, boolean var5, int var6) {
        var1 -= this.field2097;
        var2 -= this.field2086;
        if (var3 == 0) {
            if (var4 == 0) {
                this.method3635(var1, var2, 128, 1605144467);
                this.method3635(var1 - 1, var2, 8, 1443046584);
            }

            if (var4 == 1) {
                this.method3635(var1, var2, 2, -1421632159);
                this.method3635(var1, var2 + 1, 32, 1524925309);
            }

            if (var4 == 2) {
                this.method3635(var1, var2, 8, -1582528855);
                this.method3635(var1 + 1, var2, 128, -14117650);
            }

            if (var4 == 3) {
                this.method3635(var1, var2, 32, 1019436302);
                this.method3635(var1, var2 - 1, 2, -1179588981);
            }
        }

        if (var3 == 1 || var3 == 3) {
            if (var4 == 0) {
                this.method3635(var1, var2, 1, -298837889);
                this.method3635(var1 - 1, var2 + 1, 16, -1679852185);
            }

            if (var4 == 1) {
                this.method3635(var1, var2, 4, 651661063);
                this.method3635(var1 + 1, var2 + 1, 64, 1989843578);
            }

            if (var4 == 2) {
                this.method3635(var1, var2, 16, -1995302497);
                this.method3635(var1 + 1, var2 - 1, 1, -1557761038);
            }

            if (var4 == 3) {
                this.method3635(var1, var2, 64, -1992968707);
                this.method3635(var1 - 1, var2 - 1, 4, 790573953);
            }
        }

        if (var3 == 2) {
            if (var4 == 0) {
                this.method3635(var1, var2, 130, -653363867);
                this.method3635(var1 - 1, var2, 8, 1932691885);
                this.method3635(var1, var2 + 1, 32, -138606476);
            }

            if (var4 == 1) {
                this.method3635(var1, var2, 10, 1960650276);
                this.method3635(var1, var2 + 1, 32, 220215290);
                this.method3635(var1 + 1, var2, 128, -1855625977);
            }

            if (var4 == 2) {
                this.method3635(var1, var2, 40, 325786302);
                this.method3635(var1 + 1, var2, 128, -661552837);
                this.method3635(var1, var2 - 1, 2, 1205262424);
            }

            if (var4 == 3) {
                this.method3635(var1, var2, 160, -2060674115);
                this.method3635(var1, var2 - 1, 2, -914634499);
                this.method3635(var1 - 1, var2, 8, -850204691);
            }
        }

        if (var5) {
            if (var3 == 0) {
                if (var4 == 0) {
                    this.method3635(var1, var2, 65536, -531971509);
                    this.method3635(var1 - 1, var2, 4096, -911061793);
                }

                if (var4 == 1) {
                    this.method3635(var1, var2, 1024, 450650403);
                    this.method3635(var1, var2 + 1, 16384, -1234056273);
                }

                if (var4 == 2) {
                    this.method3635(var1, var2, 4096, -1789321106);
                    this.method3635(var1 + 1, var2, 65536, -414778676);
                }

                if (var4 == 3) {
                    this.method3635(var1, var2, 16384, 1796869364);
                    this.method3635(var1, var2 - 1, 1024, 1466295880);
                }
            }

            if (var3 == 1 || var3 == 3) {
                if (var4 == 0) {
                    this.method3635(var1, var2, 512, 2093934122);
                    this.method3635(var1 - 1, var2 + 1, 8192, -93543119);
                }

                if (var4 == 1) {
                    this.method3635(var1, var2, 2048, 317946881);
                    this.method3635(var1 + 1, var2 + 1, 32768, 1647375312);
                }

                if (var4 == 2) {
                    this.method3635(var1, var2, 8192, 86710713);
                    this.method3635(var1 + 1, var2 - 1, 512, -1016388853);
                }

                if (var4 == 3) {
                    this.method3635(var1, var2, 32768, 1337314733);
                    this.method3635(var1 - 1, var2 - 1, 2048, 94284972);
                }
            }

            if (var3 == 2) {
                if (var4 == 0) {
                    this.method3635(var1, var2, 66560, -1918869977);
                    this.method3635(var1 - 1, var2, 4096, -833241939);
                    this.method3635(var1, var2 + 1, 16384, -1517503700);
                }

                if (var4 == 1) {
                    this.method3635(var1, var2, 5120, 566886291);
                    this.method3635(var1, var2 + 1, 16384, -453132978);
                    this.method3635(var1 + 1, var2, 65536, 1483343283);
                }

                if (var4 == 2) {
                    this.method3635(var1, var2, 20480, 1743651198);
                    this.method3635(var1 + 1, var2, 65536, 776965003);
                    this.method3635(var1, var2 - 1, 1024, 1831252440);
                }

                if (var4 == 3) {
                    this.method3635(var1, var2, 81920, 1286600459);
                    this.method3635(var1, var2 - 1, 1024, 1481116535);
                    this.method3635(var1 - 1, var2, 4096, -493528597);
                }
            }
        }

    }

    public void method3615(int var1, int var2, int var3) {
        var1 -= this.field2097;
        var2 -= this.field2086;
        this.field2101[var1][var2] |= 2097152;
    }
}
