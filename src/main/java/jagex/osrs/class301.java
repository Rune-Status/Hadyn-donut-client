package jagex.osrs;

import java.util.Random;

public abstract class class301 extends class319 {

    public static class322[] field3760;
    static int field3770;
    static String[] field3775;
    static int field3773;
    static Random field3771;
    static int field3776;
    static int field3768;
    static int field3772;
    static int field3774;
    static int field3759;
    static int field3780;
    static int field3778;

    static {
        field3770 = -1;
        field3773 = -1;
        field3772 = -1;
        field3759 = -1;
        field3768 = 0;
        field3774 = 0;
        field3776 = 256;
        field3780 = 0;
        field3778 = 0;
        field3771 = new Random();
        field3775 = new String[100];
    }

    public int field3765;
    public int field3766;
    public int field3767;
    int[] field3779;
    byte[][] field3777;
    int[] field3763;
    int[] field3764;
    byte[] field3769;
    int[] field3761;
    int[] field3762;

    class301(byte[] var1) {
        this.field3777 = new byte[256][];
        this.field3765 = 0;
        this.method5790(var1);
    }

    class301(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6,
             byte[][] var7) {
        this.field3777 = new byte[256][];
        this.field3765 = 0;
        this.field3763 = var2;
        this.field3764 = var3;
        this.field3761 = var4;
        this.field3762 = var5;
        this.method5790(var1);
        this.field3777 = var7;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;

        for (int var10 = 0; var10 < 256; ++var10) {
            if (this.field3764[var10] < var8 && this.field3762[var10] != 0) {
                var8 = this.field3764[var10];
            }

            if (this.field3764[var10] + this.field3762[var10] > var9) {
                var9 = this.field3764[var10] + this.field3762[var10];
            }
        }

        this.field3766 = this.field3765 - var8;
        this.field3767 = var9 - this.field3765;
    }

    static int method5791(byte[][] var0, byte[][] var1, int[] var2, int[] var3, int[] var4,
                          int var5, int var6) {
        int var7 = var2[var5];
        int var8 = var7 + var4[var5];
        int var9 = var2[var6];
        int var10 = var9 + var4[var6];
        int var11 = var7;
        if (var9 > var7) {
            var11 = var9;
        }

        int var12 = var8;
        if (var10 < var8) {
            var12 = var10;
        }

        int var13 = var3[var5];
        if (var3[var6] < var13) {
            var13 = var3[var6];
        }

        byte[] var14 = var1[var5];
        byte[] var15 = var0[var6];
        int var16 = var11 - var7;
        int var17 = var11 - var9;

        for (int var18 = var11; var18 < var12; ++var18) {
            int var19 = var14[var16++] + var15[var17++];
            if (var19 < var13) {
                var13 = var19;
            }
        }

        return -var13;
    }

    static void method5813(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
        int var6 = var1 + var2 * class319.field3854;
        int var7 = class319.field3854 - var3;
        int var8 = 0;
        int var9 = 0;
        int var10;
        if (var2 < class319.field3858) {
            var10 = class319.field3858 - var2;
            var4 -= var10;
            var2 = class319.field3858;
            var9 += var3 * var10;
            var6 += var10 * class319.field3854;
        }

        if (var2 + var4 > class319.field3857) {
            var4 -= var2 + var4 - class319.field3857;
        }

        if (var1 < class319.field3853) {
            var10 = class319.field3853 - var1;
            var3 -= var10;
            var1 = class319.field3853;
            var9 += var10;
            var6 += var10;
            var8 += var10;
            var7 += var10;
        }

        if (var3 + var1 > class319.field3859) {
            var10 = var3 + var1 - class319.field3859;
            var3 -= var10;
            var8 += var10;
            var7 += var10;
        }

        if (var3 > 0 && var4 > 0) {
            method5814(class319.field3856, var0, var5, var9, var6, var3, var4, var7, var8);
        }
    }

    static void method5814(int[] var0, byte[] var1, int var2, int var3, int var4, int var5,
                           int var6, int var7, int var8) {
        int var9 = -(var5 >> 2);
        var5 = -(var5 & 3);

        for (int var10 = -var6; var10 < 0; ++var10) {
            int var11;
            for (var11 = var9; var11 < 0; ++var11) {
                if (var1[var3++] != 0) {
                    var0[var4++] = var2;
                } else {
                    ++var4;
                }

                if (var1[var3++] != 0) {
                    var0[var4++] = var2;
                } else {
                    ++var4;
                }

                if (var1[var3++] != 0) {
                    var0[var4++] = var2;
                } else {
                    ++var4;
                }

                if (var1[var3++] != 0) {
                    var0[var4++] = var2;
                } else {
                    ++var4;
                }
            }

            for (var11 = var5; var11 < 0; ++var11) {
                if (var1[var3++] != 0) {
                    var0[var4++] = var2;
                } else {
                    ++var4;
                }
            }

            var4 += var7;
            var3 += var8;
        }

    }

    static void method5816(int[] var0, byte[] var1, int var2, int var3, int var4, int var5,
                           int var6, int var7, int var8, int var9) {
        var2 = ((var2 & 65280) * var9 & 16711680) + (var9 * (var2 & 16711935) & -16711936) >> 8;
        var9 = 256 - var9;

        for (int var10 = -var6; var10 < 0; ++var10) {
            for (int var11 = -var5; var11 < 0; ++var11) {
                if (var1[var3++] != 0) {
                    int var12 = var0[var4];
                    var0[var4++] = (((var12 & 65280) * var9 & 16711680) + ((var12 & 16711935) * var9
                        & -16711936) >> 8) + var2;
                } else {
                    ++var4;
                }
            }

            var4 += var7;
            var3 += var8;
        }

    }

    static void method5867(byte[] var0, int var1, int var2, int var3, int var4, int var5,
                           int var6) {
        int var7 = var1 + var2 * class319.field3854;
        int var8 = class319.field3854 - var3;
        int var9 = 0;
        int var10 = 0;
        int var11;
        if (var2 < class319.field3858) {
            var11 = class319.field3858 - var2;
            var4 -= var11;
            var2 = class319.field3858;
            var10 += var3 * var11;
            var7 += var11 * class319.field3854;
        }

        if (var2 + var4 > class319.field3857) {
            var4 -= var2 + var4 - class319.field3857;
        }

        if (var1 < class319.field3853) {
            var11 = class319.field3853 - var1;
            var3 -= var11;
            var1 = class319.field3853;
            var10 += var11;
            var7 += var11;
            var9 += var11;
            var8 += var11;
        }

        if (var3 + var1 > class319.field3859) {
            var11 = var3 + var1 - class319.field3859;
            var3 -= var11;
            var9 += var11;
            var8 += var11;
        }

        if (var3 > 0 && var4 > 0) {
            method5816(class319.field3856, var0, var5, var10, var7, var3, var4, var8, var9, var6);
        }
    }

    public static String method5797(String var0) {
        int var1 = var0.length();
        int var2 = 0;

        for (int var3 = 0; var3 < var1; ++var3) {
            char var4 = var0.charAt(var3);
            if (var4 == '<' || var4 == '>') {
                var2 += 3;
            }
        }

        StringBuilder var6 = new StringBuilder(var1 + var2);

        for (int var7 = 0; var7 < var1; ++var7) {
            char var5 = var0.charAt(var7);
            if (var5 == '<') {
                var6.append("<lt>");
            } else if (var5 == '>') {
                var6.append("<gt>");
            } else {
                var6.append(var5);
            }
        }

        return var6.toString();
    }

    void method5806(int var1, int var2) {
        field3770 = -1;
        field3773 = -1;
        field3772 = var2;
        field3759 = var2;
        field3768 = var1;
        field3774 = var1;
        field3776 = 256;
        field3780 = 0;
        field3778 = 0;
    }

    public int method5793(String var1) {
        if (var1 == null) {
            return 0;
        } else {
            int var2 = -1;
            int var3 = -1;
            int var4 = 0;

            for (int var5 = 0; var5 < var1.length(); ++var5) {
                char var6 = var1.charAt(var5);
                if (var6 == '<') {
                    var2 = var5;
                } else {
                    if (var6 == '>' && var2 != -1) {
                        String var7 = var1.substring(var2 + 1, var5);
                        var2 = -1;
                        if (var7.equals("lt")) {
                            var6 = '<';
                        } else {
                            if (!var7.equals("gt")) {
                                if (var7.startsWith("img=")) {
                                    try {
                                        int var8 = HandshakePacket
                                            .method3663(var7.substring(4), -2136199180);
                                        var4 += field3760[var8].field3875;
                                        var3 = -1;
                                    } catch (Exception var10) {
                                        ;
                                    }
                                }
                                continue;
                            }

                            var6 = '>';
                        }
                    }

                    if (var6 == 160) {
                        var6 = ' ';
                    }

                    if (var2 == -1) {
                        var4 += this.field3779[(char) (class131.method3242(var6, (byte) 0) & 255)];
                        if (this.field3769 != null && var3 != -1) {
                            var4 += this.field3769[var6 + (var3 << 8)];
                        }

                        var3 = var6;
                    }
                }
            }

            return var4;
        }
    }

    public int method5794(String var1, int[] var2, String[] var3) {
        if (var1 == null) {
            return 0;
        } else {
            int var4 = 0;
            int var5 = 0;
            StringBuilder var6 = new StringBuilder(100);
            int var7 = -1;
            int var8 = 0;
            byte var9 = 0;
            int var10 = -1;
            char var11 = 0;
            int var12 = 0;
            int var13 = var1.length();

            for (int var14 = 0; var14 < var13; ++var14) {
                char var15 = var1.charAt(var14);
                if (var15 == '<') {
                    var10 = var14;
                } else {
                    if (var15 == '>' && var10 != -1) {
                        String var16 = var1.substring(var10 + 1, var14);
                        var10 = -1;
                        var6.append('<');
                        var6.append(var16);
                        var6.append('>');
                        if (var16.equals("br")) {
                            var3[var12] = var6.toString().substring(var5, var6.length());
                            ++var12;
                            var5 = var6.length();
                            var4 = 0;
                            var7 = -1;
                            var11 = 0;
                        } else if (var16.equals("lt")) {
                            var4 += this.method5825('<');
                            if (this.field3769 != null && var11 != -1) {
                                var4 += this.field3769[(var11 << '\b') + 60];
                            }

                            var11 = '<';
                        } else if (var16.equals("gt")) {
                            var4 += this.method5825('>');
                            if (this.field3769 != null && var11 != -1) {
                                var4 += this.field3769[(var11 << '\b') + 62];
                            }

                            var11 = '>';
                        } else if (var16.startsWith("img=")) {
                            try {
                                int var17 = HandshakePacket
                                    .method3663(var16.substring(4), -1977240723);
                                var4 += field3760[var17].field3875;
                                var11 = 0;
                            } catch (Exception var20) {
                                ;
                            }
                        }

                        var15 = 0;
                    }

                    if (var10 == -1) {
                        if (var15 != 0) {
                            var6.append(var15);
                            var4 += this.method5825(var15);
                            if (this.field3769 != null && var11 != -1) {
                                var4 += this.field3769[var15 + (var11 << '\b')];
                            }

                            var11 = var15;
                        }

                        if (var15 == ' ') {
                            var7 = var6.length();
                            var8 = var4;
                            var9 = 1;
                        }

                        if (var2 != null && var4 > var2[var12 < var2.length ? var12
                            : var2.length - 1] && var7 >= 0) {
                            var3[var12] = var6.toString().substring(var5, var7 - var9);
                            ++var12;
                            var5 = var7;
                            var7 = -1;
                            var4 -= var8;
                            var11 = 0;
                        }

                        if (var15 == '-') {
                            var7 = var6.length();
                            var8 = var4;
                            var9 = 0;
                        }
                    }
                }
            }

            String var19 = var6.toString();
            if (var19.length() > var5) {
                var3[var12++] = var19.substring(var5, var19.length());
            }

            return var12;
        }
    }

    void method5884(String var1, int var2, int var3) {
        var3 -= this.field3765;
        int var4 = -1;
        int var5 = -1;

        for (int var6 = 0; var6 < var1.length(); ++var6) {
            if (var1.charAt(var6) != 0) {
                char var7 = (char) (class131.method3242(var1.charAt(var6), (byte) 0) & 255);
                if (var7 == '<') {
                    var4 = var6;
                } else {
                    int var9;
                    if (var7 == '>' && var4 != -1) {
                        String var8 = var1.substring(var4 + 1, var6);
                        var4 = -1;
                        if (var8.equals("lt")) {
                            var7 = '<';
                        } else {
                            if (!var8.equals("gt")) {
                                if (var8.startsWith("img=")) {
                                    try {
                                        var9 = HandshakePacket
                                            .method3663(var8.substring(4), -1896894955);
                                        class322 var10 = field3760[var9];
                                        var10.method6143(var2,
                                                         var3 + this.field3765 - var10.field3876);
                                        var2 += var10.field3875;
                                        var5 = -1;
                                    } catch (Exception var14) {
                                        ;
                                    }
                                } else {
                                    this.method5807(var8);
                                }
                                continue;
                            }

                            var7 = '>';
                        }
                    }

                    if (var7 == 160) {
                        var7 = ' ';
                    }

                    if (var4 == -1) {
                        if (this.field3769 != null && var5 != -1) {
                            var2 += this.field3769[var7 + (var5 << 8)];
                        }

                        int var12 = this.field3761[var7];
                        var9 = this.field3762[var7];
                        if (var7 != ' ') {
                            if (field3776 == 256) {
                                if (field3759 != -1) {
                                    method5813(this.field3777[var7],
                                               var2 + this.field3763[var7] + 1,
                                               var3 + this.field3764[var7] + 1, var12, var9,
                                               field3759);
                                }

                                this.vmethod5811(this.field3777[var7], var2 + this.field3763[var7],
                                                 var3 + this.field3764[var7], var12, var9,
                                                 field3774);
                            } else {
                                if (field3759 != -1) {
                                    method5867(this.field3777[var7],
                                               var2 + this.field3763[var7] + 1,
                                               var3 + this.field3764[var7] + 1, var12, var9,
                                               field3759, field3776);
                                }

                                this.vmethod5812(this.field3777[var7], var2 + this.field3763[var7],
                                                 var3 + this.field3764[var7], var12, var9,
                                                 field3774, field3776);
                            }
                        } else if (field3780 > 0) {
                            field3778 += field3780;
                            var2 += field3778 >> 8;
                            field3778 &= 255;
                        }

                        int var13 = this.field3779[var7];
                        if (field3770 != -1) {
                            class319.method6098(var2, var3 + (int) ((double) this.field3765 * 0.7D),
                                                var13, field3770);
                        }

                        if (field3773 != -1) {
                            class319.method6098(var2, var3 + this.field3765 + 1, var13, field3773);
                        }

                        var2 += var13;
                        var5 = var7;
                    }
                }
            }
        }

    }

    void method5790(byte[] var1) {
        this.field3779 = new int[256];
        int var2;
        if (var1.length == 257) {
            for (var2 = 0; var2 < this.field3779.length; ++var2) {
                this.field3779[var2] = var1[var2] & 255;
            }

            this.field3765 = var1[256] & 255;
        } else {
            var2 = 0;

            for (int var3 = 0; var3 < 256; ++var3) {
                this.field3779[var3] = var1[var2++] & 255;
            }

            int[] var10 = new int[256];
            int[] var4 = new int[256];

            int var5;
            for (var5 = 0; var5 < 256; ++var5) {
                var10[var5] = var1[var2++] & 255;
            }

            for (var5 = 0; var5 < 256; ++var5) {
                var4[var5] = var1[var2++] & 255;
            }

            byte[][] var11 = new byte[256][];

            int var8;
            for (int var6 = 0; var6 < 256; ++var6) {
                var11[var6] = new byte[var10[var6]];
                byte var7 = 0;

                for (var8 = 0; var8 < var11[var6].length; ++var8) {
                    var7 += var1[var2++];
                    var11[var6][var8] = var7;
                }
            }

            byte[][] var12 = new byte[256][];

            int var13;
            for (var13 = 0; var13 < 256; ++var13) {
                var12[var13] = new byte[var10[var13]];
                byte var14 = 0;

                for (int var9 = 0; var9 < var12[var13].length; ++var9) {
                    var14 += var1[var2++];
                    var12[var13][var9] = var14;
                }
            }

            this.field3769 = new byte[65536];

            for (var13 = 0; var13 < 256; ++var13) {
                if (var13 != 32 && var13 != 160) {
                    for (var8 = 0; var8 < 256; ++var8) {
                        if (var8 != 32 && var8 != 160) {
                            this.field3769[var8 + (var13 << 8)] = (byte) method5791(var11, var12,
                                                                                    var4,
                                                                                    this.field3779,
                                                                                    var10, var13,
                                                                                    var8);
                        }
                    }
                }
            }

            this.field3765 = var4[32] + var10[32];
        }

    }

    void method5810(String var1, int var2, int var3, int[] var4, int[] var5) {
        var3 -= this.field3765;
        int var6 = -1;
        int var7 = -1;
        int var8 = 0;

        for (int var9 = 0; var9 < var1.length(); ++var9) {
            if (var1.charAt(var9) != 0) {
                char var10 = (char) (class131.method3242(var1.charAt(var9), (byte) 0) & 255);
                if (var10 == '<') {
                    var6 = var9;
                } else {
                    int var12;
                    int var13;
                    int var14;
                    if (var10 == '>' && var6 != -1) {
                        String var11 = var1.substring(var6 + 1, var9);
                        var6 = -1;
                        if (var11.equals("lt")) {
                            var10 = '<';
                        } else {
                            if (!var11.equals("gt")) {
                                if (var11.startsWith("img=")) {
                                    try {
                                        if (var4 != null) {
                                            var12 = var4[var8];
                                        } else {
                                            var12 = 0;
                                        }

                                        if (var5 != null) {
                                            var13 = var5[var8];
                                        } else {
                                            var13 = 0;
                                        }

                                        ++var8;
                                        var14 = HandshakePacket
                                            .method3663(var11.substring(4), -2071068850);
                                        class322 var15 = field3760[var14];
                                        var15.method6143(var12 + var2,
                                                         var13 + (var3 + this.field3765
                                                             - var15.field3876));
                                        var2 += var15.field3875;
                                        var7 = -1;
                                    } catch (Exception var19) {
                                        ;
                                    }
                                } else {
                                    this.method5807(var11);
                                }
                                continue;
                            }

                            var10 = '>';
                        }
                    }

                    if (var10 == 160) {
                        var10 = ' ';
                    }

                    if (var6 == -1) {
                        if (this.field3769 != null && var7 != -1) {
                            var2 += this.field3769[var10 + (var7 << 8)];
                        }

                        int var17 = this.field3761[var10];
                        var12 = this.field3762[var10];
                        if (var4 != null) {
                            var13 = var4[var8];
                        } else {
                            var13 = 0;
                        }

                        if (var5 != null) {
                            var14 = var5[var8];
                        } else {
                            var14 = 0;
                        }

                        ++var8;
                        if (var10 != ' ') {
                            if (field3776 == 256) {
                                if (field3759 != -1) {
                                    method5813(this.field3777[var10],
                                               var13 + var2 + this.field3763[var10] + 1,
                                               var3 + var14 + this.field3764[var10] + 1, var17,
                                               var12, field3759);
                                }

                                this.vmethod5811(this.field3777[var10],
                                                 var13 + var2 + this.field3763[var10],
                                                 var3 + var14 + this.field3764[var10], var17, var12,
                                                 field3774);
                            } else {
                                if (field3759 != -1) {
                                    method5867(this.field3777[var10],
                                               var13 + var2 + this.field3763[var10] + 1,
                                               var3 + var14 + this.field3764[var10] + 1, var17,
                                               var12, field3759, field3776);
                                }

                                this.vmethod5812(this.field3777[var10],
                                                 var13 + var2 + this.field3763[var10],
                                                 var3 + var14 + this.field3764[var10], var17, var12,
                                                 field3774, field3776);
                            }
                        } else if (field3780 > 0) {
                            field3778 += field3780;
                            var2 += field3778 >> 8;
                            field3778 &= 255;
                        }

                        int var18 = this.field3779[var10];
                        if (field3770 != -1) {
                            class319.method6098(var2, var3 + (int) ((double) this.field3765 * 0.7D),
                                                var18, field3770);
                        }

                        if (field3773 != -1) {
                            class319.method6098(var2, var3 + this.field3765, var18, field3773);
                        }

                        var2 += var18;
                        var7 = var10;
                    }
                }
            }
        }

    }

    int method5825(char var1) {
        if (var1 == 160) {
            var1 = ' ';
        }

        return this.field3779[class131.method3242(var1, (byte) 0) & 255];
    }

    public int method5796(String var1, int var2) {
        return this.method5794(var1, new int[]{var2}, field3775);
    }

    void method5807(String var1) {
        try {
            int var2;
            String var3;
            if (var1.startsWith("col=")) {
                var3 = var1.substring(4);
                var2 = class161.method3532(var3, 16, true, 2094875558);
                field3774 = var2;
            } else if (var1.equals("/col")) {
                field3774 = field3768;
            } else if (var1.startsWith("str=")) {
                var3 = var1.substring(4);
                var2 = class161.method3532(var3, 16, true, 1771531498);
                field3770 = var2;
            } else if (var1.equals("str")) {
                field3770 = 8388608;
            } else if (var1.equals("/str")) {
                field3770 = -1;
            } else if (var1.startsWith("u=")) {
                var3 = var1.substring(2);
                var2 = class161.method3532(var3, 16, true, 2112192274);
                field3773 = var2;
            } else if (var1.equals("u")) {
                field3773 = 0;
            } else if (var1.equals("/u")) {
                field3773 = -1;
            } else if (var1.startsWith("shad=")) {
                var3 = var1.substring(5);
                var2 = class161.method3532(var3, 16, true, 1822504336);
                field3759 = var2;
            } else if (var1.equals("shad")) {
                field3759 = 0;
            } else if (var1.equals("/shad")) {
                field3759 = field3772;
            } else if (var1.equals("br")) {
                this.method5806(field3768, field3772);
            }
        } catch (Exception var5) {
            ;
        }

    }

    public int method5792(String var1, int var2, int var3, int var4, int var5, int var6, int var7,
                          int var8, int var9, int var10) {
        if (var1 == null) {
            return 0;
        } else {
            this.method5806(var6, var7);
            if (var10 == 0) {
                var10 = this.field3765;
            }

            int[] var11 = new int[]{var4};
            if (var5 < var10 + this.field3766 + this.field3767 && var5 < var10 + var10) {
                var11 = null;
            }

            int var12 = this.method5794(var1, var11, field3775);
            if (var9 == 3 && var12 == 1) {
                var9 = 1;
            }

            int var13;
            int var14;
            if (var9 == 0) {
                var13 = var3 + this.field3766;
            } else if (var9 == 1) {
                var13 = var3 + (var5 - this.field3766 - this.field3767 - var10 * (var12 - 1)) / 2
                    + this.field3766;
            } else if (var9 == 2) {
                var13 = var3 + var5 - this.field3767 - var10 * (var12 - 1);
            } else {
                var14 =
                    (var5 - this.field3766 - this.field3767 - var10 * (var12 - 1)) / (var12 + 1);
                if (var14 < 0) {
                    var14 = 0;
                }

                var13 = var3 + var14 + this.field3766;
                var10 += var14;
            }

            for (var14 = 0; var14 < var12; ++var14) {
                if (var8 == 0) {
                    this.method5884(field3775[var14], var2, var13);
                } else if (var8 == 1) {
                    this.method5884(field3775[var14],
                                    var2 + (var4 - this.method5793(field3775[var14])) / 2, var13);
                } else if (var8 == 2) {
                    this.method5884(field3775[var14],
                                    var2 + var4 - this.method5793(field3775[var14]), var13);
                } else if (var14 == var12 - 1) {
                    this.method5884(field3775[var14], var2, var13);
                } else {
                    this.method5808(field3775[var14], var4);
                    this.method5884(field3775[var14], var2, var13);
                    field3780 = 0;
                }

                var13 += var10;
            }

            return var12;
        }
    }

    void method5808(String var1, int var2) {
        int var3 = 0;
        boolean var4 = false;

        for (int var5 = 0; var5 < var1.length(); ++var5) {
            char var6 = var1.charAt(var5);
            if (var6 == '<') {
                var4 = true;
            } else if (var6 == '>') {
                var4 = false;
            } else if (!var4 && var6 == ' ') {
                ++var3;
            }
        }

        if (var3 > 0) {
            field3780 = (var2 - this.method5793(var1) << 8) / var3;
        }

    }

    abstract void vmethod5811(byte[] var1, int var2, int var3, int var4, int var5, int var6);

    abstract void vmethod5812(byte[] var1, int var2, int var3, int var4, int var5, int var6,
                              int var7);

    public int method5795(String var1, int var2) {
        int var3 = this.method5794(var1, new int[]{var2}, field3775);
        int var4 = 0;

        for (int var5 = 0; var5 < var3; ++var5) {
            int var6 = this.method5793(field3775[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }

        return var4;
    }

    public void method5880(String var1, int var2, int var3, int var4, int var5) {
        if (var1 != null) {
            this.method5806(var4, var5);
            this.method5884(var1, var2 - this.method5793(var1) / 2, var3);
        }
    }

    public void method5828(String var1, int var2, int var3, int var4, int var5, int var6) {
        if (var1 != null) {
            this.method5806(var4, var5);
            field3771.setSeed((long) var6);
            field3776 = 192 + (field3771.nextInt() & 31);
            int[] var7 = new int[var1.length()];
            int var8 = 0;

            for (int var9 = 0; var9 < var1.length(); ++var9) {
                var7[var9] = var8;
                if ((field3771.nextInt() & 3) == 0) {
                    ++var8;
                }
            }

            this.method5810(var1, var2, var3, var7, (int[]) null);
        }
    }

    public void method5846(String var1, int var2, int var3, int var4, int var5) {
        if (var1 != null) {
            this.method5806(var4, var5);
            this.method5884(var1, var2, var3);
        }
    }

    public void method5799(String var1, int var2, int var3, int var4, int var5) {
        if (var1 != null) {
            this.method5806(var4, var5);
            this.method5884(var1, var2 - this.method5793(var1), var3);
        }
    }

    public void method5802(String var1, int var2, int var3, int var4, int var5, int var6) {
        if (var1 != null) {
            this.method5806(var4, var5);
            int[] var7 = new int[var1.length()];

            for (int var8 = 0; var8 < var1.length(); ++var8) {
                var7[var8] = (int) (Math.sin((double) var8 / 2.0D + (double) var6 / 5.0D) * 5.0D);
            }

            this.method5810(var1, var2 - this.method5793(var1) / 2, var3, (int[]) null, var7);
        }
    }

    public void method5803(String var1, int var2, int var3, int var4, int var5, int var6) {
        if (var1 != null) {
            this.method5806(var4, var5);
            int[] var7 = new int[var1.length()];
            int[] var8 = new int[var1.length()];

            for (int var9 = 0; var9 < var1.length(); ++var9) {
                var7[var9] = (int) (Math.sin((double) var9 / 5.0D + (double) var6 / 5.0D) * 5.0D);
                var8[var9] = (int) (Math.sin((double) var9 / 3.0D + (double) var6 / 5.0D) * 5.0D);
            }

            this.method5810(var1, var2 - this.method5793(var1) / 2, var3, var7, var8);
        }
    }

    public void method5820(String var1, int var2, int var3, int var4, int var5, int var6,
                           int var7) {
        if (var1 != null) {
            this.method5806(var4, var5);
            double var8 = 7.0D - (double) var7 / 8.0D;
            if (var8 < 0.0D) {
                var8 = 0.0D;
            }

            int[] var10 = new int[var1.length()];

            for (int var11 = 0; var11 < var1.length(); ++var11) {
                var10[var11] = (int) (Math.sin((double) var11 / 1.5D + (double) var6 / 1.0D)
                    * var8);
            }

            this.method5810(var1, var2 - this.method5793(var1) / 2, var3, (int[]) null, var10);
        }
    }

    public void method5864(String var1, int var2, int var3, int var4, int var5, int var6) {
        if (var1 != null) {
            this.method5806(var4, var5);
            field3776 = var6;
            this.method5884(var1, var2, var3);
        }
    }
}
