package jagex.osrs;

import java.io.EOFException;

public class class84 {

    static int field1243;
    boolean field1241;
    String[] field1236;
    int[] field1239;
    long field1245;
    boolean[] field1238;
    boolean[] field1237;

    class84() {
        this.field1241 = false;
        this.field1239 = new int[class50.index2.method4889(19, 1064669026)];
        this.field1236 = new String[class50.index2.method4889(15, 1064669026)];
        this.field1237 = new boolean[this.field1239.length];

        int var1;
        for (var1 = 0; var1 < this.field1239.length; ++var1) {
            class258 var2 = class251.method4963(var1, -619599710);
            this.field1237[var1] = var2.field3337;
        }

        this.field1238 = new boolean[this.field1236.length];

        for (var1 = 0; var1 < this.field1236.length; ++var1) {
            class259 var3 = class0.method0(var1, (byte) 43);
            this.field1238[var1] = var3.field3341;
        }

        for (var1 = 0; var1 < this.field1239.length; ++var1) {
            this.field1239[var1] = -1;
        }

        this.method2093(-639739435);
    }

    public static class271 method2125(int var0, int var1) {
        class271 var2 = (class271) class271.field3507.method4198((long) var0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class271.field3506.method4831(10, var0, 1789634852);
            var2 = new class271();
            var2.field3557 = var0;
            if (var3 != null) {
                var2.method5375(new Buffer(var3), 1116128472);
            }

            var2.method5322(-1590833438);
            if (var2.field3552 != -1) {
                var2.method5325(method2125(var2.field3552, -205103429),
                                method2125(var2.field3549, -205103429), -1496668389);
            }

            if (var2.field3518 != -1) {
                var2.method5338(method2125(var2.field3518, -205103429),
                                method2125(var2.field3511, -205103429), (byte) 1);
            }

            if (var2.field3510 != -1) {
                var2.method5327(method2125(var2.field3510, -205103429),
                                method2125(var2.field3555, -205103429), (byte) 2);
            }

            if (!class229.field2648 && var2.field3512) {
                var2.field3515 = "Members object";
                var2.field3509 = false;
                var2.field3526 = null;
                var2.field3541 = null;
                var2.field3528 = -1;
                var2.field3540 = 0;
                if (var2.field3551 != null) {
                    boolean var4 = false;

                    for (Node var5 = var2.field3551.method4172(); var5 != null;
                         var5 = var2.field3551.method4173()) {
                        class266 var6 = class25.method479((int) var5.key, (byte) -25);
                        if (var6.field3404) {
                            var5.unlink();
                        } else {
                            var4 = true;
                        }
                    }

                    if (!var4) {
                        var2.field3551 = null;
                    }
                }
            }

            class271.field3507.method4204(var2, (long) var0);
            return var2;
        }
    }

    public static void method2124(class249 var0, int var1) {
        class268.field3419 = var0;
    }

    static int method2117(char var0, int var1, int var2) {
        int var3 = var0 << 4;
        if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
            var0 = Character.toLowerCase(var0);
            var3 = (var0 << 4) + 1;
        }

        return var3;
    }

    SeekableFile method2095(boolean var1, int var2) {
        return class7.getPreferencesFile("2", client.gameType.name, var1, -1657603693);
    }

    boolean method2099(byte var1) {
        return this.field1241;
    }

    void method2096(int var1) {
        SeekableFile var2 = this.method2095(true, -1669314567);
        boolean var17 = false;

        label198:
        {
            label197:
            {
                try {
                    var17 = true;
                    int var3 = 3;
                    int var4 = 0;

                    int var5;
                    for (var5 = 0; var5 < this.field1239.length; ++var5) {
                        if (this.field1237[var5] && this.field1239[var5] != -1) {
                            var3 += 6;
                            ++var4;
                        }
                    }

                    var3 += 2;
                    var5 = 0;

                    for (int var6 = 0; var6 < this.field1236.length; ++var6) {
                        if (this.field1238[var6] && this.field1236[var6] != null) {
                            var3 += 2 + class97.method2404(this.field1236[var6], 1465458826);
                            ++var5;
                        }
                    }

                    Buffer var10 = new Buffer(var3);
                    var10.writeByte(1);
                    var10.writeShort(var4);

                    int var7;
                    for (var7 = 0; var7 < this.field1239.length; ++var7) {
                        if (this.field1237[var7] && this.field1239[var7] != -1) {
                            var10.writeShort(var7);
                            var10.writeInt(this.field1239[var7]);
                        }
                    }

                    var10.writeShort(var5);

                    for (var7 = 0; var7 < this.field1236.length; ++var7) {
                        if (this.field1238[var7] && this.field1236[var7] != null) {
                            var10.writeShort(var7);
                            var10.writeString(this.field1236[var7]);
                        }
                    }

                    var2.write(var10.bytes, 0, var10.offset);
                    var17 = false;
                    break label197;
                } catch (Exception var21) {
                    var17 = false;
                } finally {
                    if (var17) {
                        try {
                            var2.method2717(-1616454754);
                        } catch (Exception var18) {
                            ;
                        }

                    }
                }

                try {
                    var2.method2717(-1932469078);
                } catch (Exception var19) {
                    ;
                }
                break label198;
            }

            try {
                var2.method2717(319454738);
            } catch (Exception var20) {
                ;
            }
        }

        this.field1241 = false;
        this.field1245 = class120.method2866((short) 3133);
    }

    void method2093(int var1) {
        SeekableFile var2 = this.method2095(false, -632037386);
        boolean var24 = false;

        label220:
        {
            label221:
            {
                label214:
                {
                    label213:
                    {
                        try {
                            var24 = true;
                            byte[] var3 = new byte[(int) var2.method2719(-2095698017)];

                            int var5;
                            for (int var4 = 0; var4 < var3.length; var4 += var5) {
                                var5 = var2.method2720(var3, var4, var3.length - var4, 969271903);
                                if (var5 == -1) {
                                    throw new EOFException();
                                }
                            }

                            Buffer var14 = new Buffer(var3);
                            if (var14.bytes.length - var14.offset < 1) {
                                var24 = false;
                                break label214;
                            }

                            int var15 = var14.getUByte();
                            if (var15 < 0) {
                                var24 = false;
                                break label221;
                            }

                            if (var15 > 1) {
                                var24 = false;
                                break label221;
                            }

                            int var16 = var14.readUint16();

                            int var8;
                            int var9;
                            int var10;
                            for (var8 = 0; var8 < var16; ++var8) {
                                var9 = var14.readUint16();
                                var10 = var14.getInt();
                                if (this.field1237[var9]) {
                                    this.field1239[var9] = var10;
                                }
                            }

                            var8 = var14.readUint16();

                            for (var9 = 0; var9 < var8; ++var9) {
                                var10 = var14.readUint16();
                                String var11 = var14.method3778(-1506716105);
                                if (this.field1238[var10]) {
                                    this.field1236[var10] = var11;
                                }
                            }

                            var24 = false;
                            break label213;
                        } catch (Exception var30) {
                            var24 = false;
                        } finally {
                            if (var24) {
                                try {
                                    var2.method2717(642710186);
                                } catch (Exception var25) {
                                    ;
                                }

                            }
                        }

                        try {
                            var2.method2717(186943061);
                        } catch (Exception var27) {
                            ;
                        }
                        break label220;
                    }

                    try {
                        var2.method2717(583995472);
                    } catch (Exception var28) {
                        ;
                    }
                    break label220;
                }

                try {
                    var2.method2717(278629158);
                } catch (Exception var26) {
                    ;
                }

                return;
            }

            try {
                var2.method2717(-1957411456);
            } catch (Exception var29) {
                ;
            }

            return;
        }

        this.field1241 = false;
    }

    String method2089(int var1, int var2) {
        return this.field1236[var1];
    }

    int method2091(int var1, int var2) {
        return this.field1239[var1];
    }

    void method2114(int var1, int var2, int var3) {
        this.field1239[var1] = var2;
        if (this.field1237[var1]) {
            this.field1241 = true;
        }

    }

    void method2106(int var1, String var2, byte var3) {
        this.field1236[var1] = var2;
        if (this.field1238[var1]) {
            this.field1241 = true;
        }

    }

    void method2108(int var1) {
        int var2;
        for (var2 = 0; var2 < this.field1239.length; ++var2) {
            if (!this.field1237[var2]) {
                this.field1239[var2] = -1;
            }
        }

        for (var2 = 0; var2 < this.field1236.length; ++var2) {
            if (!this.field1238[var2]) {
                this.field1236[var2] = null;
            }
        }

    }

    void method2090(int var1) {
        if (this.field1241 && this.field1245 < class120.method2866((short) 3133) - 60000L) {
            this.method2096(-1622305950);
        }

    }
}
