package jagex.osrs;

public class class127 {

    static final int[] field1815;
    static final int[] field1776;
    static final int[] field1817;
    static final int[] field1818;
    static final int[] field1819;
    static final int[] field1788;
    static final int[] field1821;
    public static boolean field1777;
    public static int field1785;
    public static int field1805;
    static boolean field1806;
    static int[] field1829;
    static int field1789;
    static int field1792;
    static class207 field1814;
    static int field1784;
    static int field1809;
    static int field1783;
    static class134[] field1774;
    static int field1794;
    static class134[][] field1803;
    static boolean field1800;
    static int field1816;
    static class136[] field1831;
    static int field1801;
    static int field1793;
    static int field1802;
    static int field1769;
    static int field1795;
    static int field1812;
    static int field1796;
    static int field1791;
    static int field1797;
    static int field1786;
    static int field1798;
    static boolean[][][][] field1828;
    static int field1823;
    static int field1790;
    static int field1832;
    static boolean[][] field1820;
    static int field1804;
    static int field1833;
    static int field1834;
    static int field1835;
    static int field1830;
    static int field1773;

    static {
        field1777 = true;
        field1783 = 0;
        field1784 = 0;
        field1831 = new class136[100];
        field1800 = false;
        field1801 = 0;
        field1802 = 0;
        field1795 = 0;
        field1785 = -1;
        field1805 = -1;
        field1806 = false;
        field1809 = 4;
        field1829 = new int[field1809];
        field1803 = new class134[field1809][500];
        field1789 = 0;
        field1774 = new class134[500];
        field1814 = new class207();
        field1815 = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
        field1776 = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160};
        field1817 = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19};
        field1818 = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0};
        field1819 = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4};
        field1788 = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0};
        field1821 = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8};
        field1828 = new boolean[8][32][51][51];
    }

    int field1775;
    int field1813;
    int[][][] field1811;
    int field1787;
    int field1770;
    class120[][][] field1810;
    class136[] field1826;
    int field1772;
    int[][][] field1778;
    int[][] field1771;
    int[][] field1827;

    public class127(int var1, int var2, int var3, int[][][] var4) {
        this.field1775 = 0;
        this.field1813 = 0;
        this.field1826 = new class136[5000];
        this.field1771 = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1},
            {1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0},
            {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1},
            {0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0},
            {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1},
            {1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}};
        this.field1827 = new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15},
            {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3},
            {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0},
            {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}};
        this.field1770 = var1;
        this.field1787 = var2;
        this.field1772 = var3;
        this.field1810 = new class120[var1][var2][var3];
        this.field1811 = new int[var1][var2 + 1][var3 + 1];
        this.field1778 = var4;
        this.method3057();
    }

    public static boolean method3109() {
        return field1806 && field1785 != -1;
    }

    static boolean method3181(int var0, int var1, int var2, int var3, int var4, int var5, int var6,
                              int var7) {
        if (var1 < var2 && var1 < var3 && var1 < var4) {
            return false;
        } else if (var1 > var2 && var1 > var3 && var1 > var4) {
            return false;
        } else if (var0 < var5 && var0 < var6 && var0 < var7) {
            return false;
        } else if (var0 > var5 && var0 > var6 && var0 > var7) {
            return false;
        } else {
            int var8 = (var1 - var2) * (var6 - var5) - (var0 - var5) * (var3 - var2);
            int var9 = (var7 - var6) * (var1 - var3) - (var0 - var6) * (var4 - var3);
            int var10 = (var5 - var7) * (var1 - var4) - (var2 - var4) * (var0 - var7);
            return var8 == 0 ? (var9 != 0 ? (var9 < 0 ? var10 <= 0 : var10 >= 0) : true)
                : (var8 < 0 ? var9 <= 0 && var10 <= 0 : var9 >= 0 && var10 >= 0);
        }
    }

    static final int method3102(int var0, int var1) {
        var1 = (var0 & 127) * var1 >> 7;
        if (var1 < 2) {
            var1 = 2;
        } else if (var1 > 126) {
            var1 = 126;
        }

        return (var0 & 65408) + var1;
    }

    public static void method3168(int[] var0, int var1, int var2, int var3, int var4) {
        field1804 = 0;
        field1833 = 0;
        field1834 = var3;
        field1835 = var4;
        field1830 = var3 / 2;
        field1773 = var4 / 2;
        boolean[][][][] var5 = new boolean[var0.length][32][53][53];

        int var6;
        int var7;
        int var8;
        int var9;
        int var11;
        int var12;
        for (var6 = 128; var6 <= 383; var6 += 32) {
            for (var7 = 0; var7 < 2048; var7 += 64) {
                field1769 = class124.field1747[var6];
                field1796 = class124.field1754[var6];
                field1797 = class124.field1747[var7];
                field1798 = class124.field1754[var7];
                var8 = (var6 - 128) / 32;
                var9 = var7 / 64;

                for (int var10 = -26; var10 < 26; ++var10) {
                    for (var11 = -26; var11 < 26; ++var11) {
                        var12 = var10 * 128;
                        int var13 = var11 * 128;
                        boolean var14 = false;

                        for (int var15 = -var1; var15 <= var2; var15 += 128) {
                            if (method3068(var12, var0[var8] + var15, var13)) {
                                var14 = true;
                                break;
                            }
                        }

                        var5[var8][var9][var10 + 1 + 25][var11 + 1 + 25] = var14;
                    }
                }
            }
        }

        for (var6 = 0; var6 < 8; ++var6) {
            for (var7 = 0; var7 < 32; ++var7) {
                for (var8 = -25; var8 < 25; ++var8) {
                    for (var9 = -25; var9 < 25; ++var9) {
                        boolean var16 = false;

                        label76:
                        for (var11 = -1; var11 <= 1; ++var11) {
                            for (var12 = -1; var12 <= 1; ++var12) {
                                if (var5[var6][var7][var8 + var11 + 1 + 25][var9 + var12 + 1
                                    + 25]) {
                                    var16 = true;
                                    break label76;
                                }

                                if (var5[var6][(var7 + 1) % 31][var8 + var11 + 1 + 25][var9 + var12
                                    + 1 + 25]) {
                                    var16 = true;
                                    break label76;
                                }

                                if (var5[var6 + 1][var7][var8 + var11 + 1 + 25][var9 + var12 + 1
                                    + 25]) {
                                    var16 = true;
                                    break label76;
                                }

                                if (var5[var6 + 1][(var7 + 1) % 31][var8 + var11 + 1 + 25][var9
                                    + var12 + 1 + 25]) {
                                    var16 = true;
                                    break label76;
                                }
                            }
                        }

                        field1828[var6][var7][var8 + 25][var9 + 25] = var16;
                    }
                }
            }
        }

    }

    public static void method3097() {
        field1785 = -1;
        field1806 = false;
    }

    public static void method3060(int var0, int var1, int var2, int var3, int var4, int var5,
                                  int var6, int var7) {
        class134 var8 = new class134();
        var8.field1868 = var2 / 128;
        var8.field1869 = var3 / 128;
        var8.field1862 = var4 / 128;
        var8.field1865 = var5 / 128;
        var8.field1864 = var1;
        var8.field1867 = var2;
        var8.field1866 = var3;
        var8.field1878 = var4;
        var8.field1870 = var5;
        var8.field1871 = var6;
        var8.field1872 = var7;
        field1803[var0][field1829[var0]++] = var8;
    }

    static boolean method3068(int var0, int var1, int var2) {
        int var3 = var0 * field1798 + var2 * field1797 >> 16;
        int var4 = var2 * field1798 - var0 * field1797 >> 16;
        int var5 = var4 * field1796 + field1769 * var1 >> 16;
        int var6 = field1796 * var1 - var4 * field1769 >> 16;
        if (var5 >= 50 && var5 <= 3500) {
            int var7 = var3 * 128 / var5 + field1830;
            int var8 = var6 * 128 / var5 + field1773;
            return var7 >= field1804 && var7 <= field1834 && var8 >= field1833 && var8 <= field1835;
        } else {
            return false;
        }
    }

    boolean method3153(int var1, int var2, int var3) {
        int var4 = this.field1811[var1][var2][var3];
        if (var4 == -field1816) {
            return false;
        } else if (var4 == field1816) {
            return true;
        } else {
            int var5 = var2 << 7;
            int var6 = var3 << 7;
            if (this.method3165(var5 + 1, this.field1778[var1][var2][var3], var6 + 1) && this
                .method3165(var5 + 128 - 1, this.field1778[var1][var2 + 1][var3], var6 + 1) && this
                .method3165(var5 + 128 - 1, this.field1778[var1][var2 + 1][var3 + 1],
                            var6 + 128 - 1) && this
                .method3165(var5 + 1, this.field1778[var1][var2][var3 + 1], var6 + 128 - 1)) {
                this.field1811[var1][var2][var3] = field1816;
                return true;
            } else {
                this.field1811[var1][var2][var3] = -field1816;
                return false;
            }
        }
    }

    boolean method3070(int var1, int var2, int var3, int var4, int var5, int var6, int var7,
                       int var8, class129 var9, int var10, boolean var11, long var12, int var14) {
        int var16;
        for (int var15 = var2; var15 < var2 + var4; ++var15) {
            for (var16 = var3; var16 < var3 + var5; ++var16) {
                if (var15 < 0 || var16 < 0 || var15 >= this.field1787 || var16 >= this.field1772) {
                    return false;
                }

                class120 var17 = this.field1810[var1][var15][var16];
                if (var17 != null && var17.field1625 >= 5) {
                    return false;
                }
            }
        }

        class136 var21 = new class136();
        var21.field1904 = var12;
        var21.field1906 = var14;
        var21.field1899 = var1;
        var21.field1894 = var6;
        var21.field1907 = var7;
        var21.field1895 = var8;
        var21.field1896 = var9;
        var21.field1897 = var10;
        var21.field1898 = var2;
        var21.field1900 = var3;
        var21.field1903 = var2 + var4 - 1;
        var21.field1901 = var3 + var5 - 1;

        for (var16 = var2; var16 < var2 + var4; ++var16) {
            for (int var22 = var3; var22 < var3 + var5; ++var22) {
                int var18 = 0;
                if (var16 > var2) {
                    ++var18;
                }

                if (var16 < var2 + var4 - 1) {
                    var18 += 4;
                }

                if (var22 > var3) {
                    var18 += 8;
                }

                if (var22 < var3 + var5 - 1) {
                    var18 += 2;
                }

                for (int var19 = var1; var19 >= 0; --var19) {
                    if (this.field1810[var19][var16][var22] == null) {
                        this.field1810[var19][var16][var22] = new class120(var19, var16, var22);
                    }
                }

                class120 var23 = this.field1810[var1][var16][var22];
                var23.field1626[var23.field1625] = var21;
                var23.field1627[var23.field1625] = var18;
                var23.field1628 |= var18;
                ++var23.field1625;
            }
        }

        if (var11) {
            this.field1826[this.field1813++] = var21;
        }

        return true;
    }

    void method3072(class136 var1) {
        for (int var2 = var1.field1898; var2 <= var1.field1903; ++var2) {
            for (int var3 = var1.field1900; var3 <= var1.field1901; ++var3) {
                class120 var4 = this.field1810[var1.field1899][var2][var3];
                if (var4 != null) {
                    int var5;
                    for (var5 = 0; var5 < var4.field1625; ++var5) {
                        if (var4.field1626[var5] == var1) {
                            --var4.field1625;

                            for (int var6 = var5; var6 < var4.field1625; ++var6) {
                                var4.field1626[var6] = var4.field1626[var6 + 1];
                                var4.field1627[var6] = var4.field1627[var6 + 1];
                            }

                            var4.field1626[var4.field1625] = null;
                            break;
                        }
                    }

                    var4.field1628 = 0;

                    for (var5 = 0; var5 < var4.field1625; ++var5) {
                        var4.field1628 |= var4.field1627[var5];
                    }
                }
            }
        }

    }

    public void method3080(int var1, int var2, int var3, boolean var4) {
        if (!method3109() || var4) {
            field1800 = true;
            field1806 = var4;
            field1801 = var1;
            field1802 = var2;
            field1795 = var3;
            field1785 = -1;
            field1805 = -1;
        }
    }

    boolean method3165(int var1, int var2, int var3) {
        for (int var4 = 0; var4 < field1789; ++var4) {
            class134 var5 = field1774[var4];
            int var6;
            int var7;
            int var8;
            int var9;
            int var10;
            if (var5.field1873 == 1) {
                var6 = var5.field1867 - var1;
                if (var6 > 0) {
                    var7 = (var6 * var5.field1876 >> 8) + var5.field1878;
                    var8 = (var6 * var5.field1877 >> 8) + var5.field1870;
                    var9 = (var6 * var5.field1874 >> 8) + var5.field1871;
                    var10 = (var6 * var5.field1879 >> 8) + var5.field1872;
                    if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                        return true;
                    }
                }
            } else if (var5.field1873 == 2) {
                var6 = var1 - var5.field1867;
                if (var6 > 0) {
                    var7 = (var6 * var5.field1876 >> 8) + var5.field1878;
                    var8 = (var6 * var5.field1877 >> 8) + var5.field1870;
                    var9 = (var6 * var5.field1874 >> 8) + var5.field1871;
                    var10 = (var6 * var5.field1879 >> 8) + var5.field1872;
                    if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                        return true;
                    }
                }
            } else if (var5.field1873 == 3) {
                var6 = var5.field1878 - var3;
                if (var6 > 0) {
                    var7 = (var6 * var5.field1863 >> 8) + var5.field1867;
                    var8 = (var6 * var5.field1875 >> 8) + var5.field1866;
                    var9 = (var6 * var5.field1874 >> 8) + var5.field1871;
                    var10 = (var6 * var5.field1879 >> 8) + var5.field1872;
                    if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                        return true;
                    }
                }
            } else if (var5.field1873 == 4) {
                var6 = var3 - var5.field1878;
                if (var6 > 0) {
                    var7 = (var6 * var5.field1863 >> 8) + var5.field1867;
                    var8 = (var6 * var5.field1875 >> 8) + var5.field1866;
                    var9 = (var6 * var5.field1874 >> 8) + var5.field1871;
                    var10 = (var6 * var5.field1879 >> 8) + var5.field1872;
                    if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                        return true;
                    }
                }
            } else if (var5.field1873 == 5) {
                var6 = var2 - var5.field1871;
                if (var6 > 0) {
                    var7 = (var6 * var5.field1863 >> 8) + var5.field1867;
                    var8 = (var6 * var5.field1875 >> 8) + var5.field1866;
                    var9 = (var6 * var5.field1876 >> 8) + var5.field1878;
                    var10 = (var6 * var5.field1877 >> 8) + var5.field1870;
                    if (var1 >= var7 && var1 <= var8 && var3 >= var9 && var3 <= var10) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    void method3205(class115 var1, int var2, int var3, int var4, int var5, int var6) {
        boolean var7 = true;
        int var8 = var3;
        int var9 = var3 + var5;
        int var10 = var4 - 1;
        int var11 = var4 + var6;

        for (int var12 = var2; var12 <= var2 + 1; ++var12) {
            if (var12 != this.field1770) {
                for (int var13 = var8; var13 <= var9; ++var13) {
                    if (var13 >= 0 && var13 < this.field1787) {
                        for (int var14 = var10; var14 <= var11; ++var14) {
                            if (var14 >= 0 && var14 < this.field1772 && (!var7 || var13 >= var9
                                || var14 >= var11 || var14 < var4 && var3 != var13)) {
                                class120 var15 = this.field1810[var12][var13][var14];
                                if (var15 != null) {
                                    int var16 = (this.field1778[var12][var13 + 1][var14]
                                        + this.field1778[var12][var13 + 1][var14 + 1]
                                        + this.field1778[var12][var13][var14]
                                        + this.field1778[var12][var13][var14 + 1]) / 4 -
                                        (this.field1778[var2][var3 + 1][var4]
                                            + this.field1778[var2][var3][var4]
                                            + this.field1778[var2][var3 + 1][var4 + 1]
                                            + this.field1778[var2][var3][var4 + 1]) / 4;
                                    class130 var17 = var15.field1637;
                                    if (var17 != null) {
                                        class115 var18;
                                        if (var17.field1846 instanceof class115) {
                                            var18 = (class115) var17.field1846;
                                            class115.method2790(var1, var18, (1 - var5) * 64
                                                + (var13 - var3) * 128, var16, (var14 - var4) * 128
                                                                    + (1 - var6) * 64, var7);
                                        }

                                        if (var17.field1847 instanceof class115) {
                                            var18 = (class115) var17.field1847;
                                            class115.method2790(var1, var18, (1 - var5) * 64
                                                + (var13 - var3) * 128, var16, (var14 - var4) * 128
                                                                    + (1 - var6) * 64, var7);
                                        }
                                    }

                                    for (int var23 = 0; var23 < var15.field1625; ++var23) {
                                        class136 var19 = var15.field1626[var23];
                                        if (var19 != null && var19.field1896 instanceof class115) {
                                            class115 var20 = (class115) var19.field1896;
                                            int var21 = var19.field1903 - var19.field1898 + 1;
                                            int var22 = var19.field1901 - var19.field1900 + 1;
                                            class115.method2790(var1, var20, (var21 - var5) * 64
                                                                    + (var19.field1898 - var3) * 128, var16,
                                                                (var19.field1900 - var4) * 128
                                                                    + (var22 - var6) * 64, var7);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                --var8;
                var7 = false;
            }
        }

    }

    boolean method3096(int var1, int var2, int var3, int var4) {
        if (!this.method3153(var1, var2, var3)) {
            return false;
        } else {
            int var5 = var2 << 7;
            int var6 = var3 << 7;
            int var7 = this.field1778[var1][var2][var3] - 1;
            int var8 = var7 - 120;
            int var9 = var7 - 230;
            int var10 = var7 - 238;
            if (var4 < 16) {
                if (var4 == 1) {
                    if (var5 > field1792) {
                        if (!this.method3165(var5, var7, var6)) {
                            return false;
                        }

                        if (!this.method3165(var5, var7, var6 + 128)) {
                            return false;
                        }
                    }

                    if (var1 > 0) {
                        if (!this.method3165(var5, var8, var6)) {
                            return false;
                        }

                        if (!this.method3165(var5, var8, var6 + 128)) {
                            return false;
                        }
                    }

                    if (!this.method3165(var5, var9, var6)) {
                        return false;
                    }

                    if (!this.method3165(var5, var9, var6 + 128)) {
                        return false;
                    }

                    return true;
                }

                if (var4 == 2) {
                    if (var6 < field1794) {
                        if (!this.method3165(var5, var7, var6 + 128)) {
                            return false;
                        }

                        if (!this.method3165(var5 + 128, var7, var6 + 128)) {
                            return false;
                        }
                    }

                    if (var1 > 0) {
                        if (!this.method3165(var5, var8, var6 + 128)) {
                            return false;
                        }

                        if (!this.method3165(var5 + 128, var8, var6 + 128)) {
                            return false;
                        }
                    }

                    if (!this.method3165(var5, var9, var6 + 128)) {
                        return false;
                    }

                    if (!this.method3165(var5 + 128, var9, var6 + 128)) {
                        return false;
                    }

                    return true;
                }

                if (var4 == 4) {
                    if (var5 < field1792) {
                        if (!this.method3165(var5 + 128, var7, var6)) {
                            return false;
                        }

                        if (!this.method3165(var5 + 128, var7, var6 + 128)) {
                            return false;
                        }
                    }

                    if (var1 > 0) {
                        if (!this.method3165(var5 + 128, var8, var6)) {
                            return false;
                        }

                        if (!this.method3165(var5 + 128, var8, var6 + 128)) {
                            return false;
                        }
                    }

                    if (!this.method3165(var5 + 128, var9, var6)) {
                        return false;
                    }

                    if (!this.method3165(var5 + 128, var9, var6 + 128)) {
                        return false;
                    }

                    return true;
                }

                if (var4 == 8) {
                    if (var6 > field1794) {
                        if (!this.method3165(var5, var7, var6)) {
                            return false;
                        }

                        if (!this.method3165(var5 + 128, var7, var6)) {
                            return false;
                        }
                    }

                    if (var1 > 0) {
                        if (!this.method3165(var5, var8, var6)) {
                            return false;
                        }

                        if (!this.method3165(var5 + 128, var8, var6)) {
                            return false;
                        }
                    }

                    if (!this.method3165(var5, var9, var6)) {
                        return false;
                    }

                    if (!this.method3165(var5 + 128, var9, var6)) {
                        return false;
                    }

                    return true;
                }
            }

            return !this.method3165(var5 + 64, var10, var6 + 64) ? false
                : (var4 == 16 ? this.method3165(var5, var9, var6 + 128)
                    : (var4 == 32 ? this.method3165(var5 + 128, var9, var6 + 128)
                        : (var4 == 64 ? this.method3165(var5 + 128, var9, var6)
                            : (var4 == 128 ? this.method3165(var5, var9, var6) : true))));
        }
    }

    void method3100(class125 var1, int var2, int var3, int var4, int var5, int var6, int var7,
                    int var8) {
        int var9;
        int var10 = var9 = (var7 << 7) - field1792;
        int var11;
        int var12 = var11 = (var8 << 7) - field1794;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = this.field1778[var2][var7][var8] - field1793;
        int var18 = this.field1778[var2][var7 + 1][var8] - field1793;
        int var19 = this.field1778[var2][var7 + 1][var8 + 1] - field1793;
        int var20 = this.field1778[var2][var7][var8 + 1] - field1793;
        int var21 = var10 * var6 + var5 * var12 >> 16;
        var12 = var12 * var6 - var5 * var10 >> 16;
        var10 = var21;
        var21 = var17 * var4 - var3 * var12 >> 16;
        var12 = var3 * var17 + var12 * var4 >> 16;
        var17 = var21;
        if (var12 >= 50) {
            var21 = var14 * var6 + var5 * var11 >> 16;
            var11 = var11 * var6 - var5 * var14 >> 16;
            var14 = var21;
            var21 = var18 * var4 - var3 * var11 >> 16;
            var11 = var3 * var18 + var11 * var4 >> 16;
            var18 = var21;
            if (var11 >= 50) {
                var21 = var13 * var6 + var5 * var16 >> 16;
                var16 = var16 * var6 - var5 * var13 >> 16;
                var13 = var21;
                var21 = var19 * var4 - var3 * var16 >> 16;
                var16 = var3 * var19 + var16 * var4 >> 16;
                var19 = var21;
                if (var16 >= 50) {
                    var21 = var9 * var6 + var5 * var15 >> 16;
                    var15 = var15 * var6 - var5 * var9 >> 16;
                    var9 = var21;
                    var21 = var20 * var4 - var3 * var15 >> 16;
                    var15 = var3 * var20 + var15 * var4 >> 16;
                    if (var15 >= 50) {
                        int var22 = var10 * class124.field1741 / var12 + class124.field1739;
                        int var23 = var17 * class124.field1741 / var12 + class124.field1730;
                        int var24 = var14 * class124.field1741 / var11 + class124.field1739;
                        int var25 = var18 * class124.field1741 / var11 + class124.field1730;
                        int var26 = var13 * class124.field1741 / var16 + class124.field1739;
                        int var27 = var19 * class124.field1741 / var16 + class124.field1730;
                        int var28 = var9 * class124.field1741 / var15 + class124.field1739;
                        int var29 = var21 * class124.field1741 / var15 + class124.field1730;
                        class124.field1732 = 0;
                        int var30;
                        if ((var26 - var28) * (var25 - var29) - (var27 - var29) * (var24 - var28)
                            > 0) {
                            class124.field1753 = false;
                            if (var26 < 0 || var28 < 0 || var24 < 0 || var26 > class124.field1742
                                || var28 > class124.field1742 || var24 > class124.field1742) {
                                class124.field1753 = true;
                            }

                            if (field1800 && method3181(field1802, field1795, var27, var29, var25,
                                                        var26, var28, var24)) {
                                field1785 = var7;
                                field1805 = var8;
                            }

                            if (var1.field1759 == -1) {
                                if (var1.field1755 != 12345678) {
                                    class124.method2985(var27, var29, var25, var26, var28, var24,
                                                        var1.field1755, var1.field1757,
                                                        var1.field1756);
                                }
                            } else if (!field1777) {
                                if (var1.field1760) {
                                    class124.method2991(var27, var29, var25, var26, var28, var24,
                                                        var1.field1755, var1.field1757,
                                                        var1.field1756, var10, var14, var9, var17,
                                                        var18, var21, var12, var11, var15,
                                                        var1.field1759);
                                } else {
                                    class124.method2991(var27, var29, var25, var26, var28, var24,
                                                        var1.field1755, var1.field1757,
                                                        var1.field1756, var13, var9, var14, var19,
                                                        var21, var18, var16, var15, var11,
                                                        var1.field1759);
                                }
                            } else {
                                var30 = class124.field1752.vmethod3247(var1.field1759, 1901823043);
                                class124.method2985(var27, var29, var25, var26, var28, var24,
                                                    method3102(var30, var1.field1755),
                                                    method3102(var30, var1.field1757),
                                                    method3102(var30, var1.field1756));
                            }
                        }

                        if ((var22 - var24) * (var29 - var25) - (var23 - var25) * (var28 - var24)
                            > 0) {
                            class124.field1753 = false;
                            if (var22 < 0 || var24 < 0 || var28 < 0 || var22 > class124.field1742
                                || var24 > class124.field1742 || var28 > class124.field1742) {
                                class124.field1753 = true;
                            }

                            if (field1800 && method3181(field1802, field1795, var23, var25, var29,
                                                        var22, var24, var28)) {
                                field1785 = var7;
                                field1805 = var8;
                            }

                            if (var1.field1759 == -1) {
                                if (var1.field1761 != 12345678) {
                                    class124.method2985(var23, var25, var29, var22, var24, var28,
                                                        var1.field1761, var1.field1756,
                                                        var1.field1757);
                                }
                            } else if (!field1777) {
                                class124.method2991(var23, var25, var29, var22, var24, var28,
                                                    var1.field1761, var1.field1756, var1.field1757,
                                                    var10, var14, var9, var17, var18, var21, var12,
                                                    var11, var15, var1.field1759);
                            } else {
                                var30 = class124.field1752.vmethod3247(var1.field1759, -1075989489);
                                class124.method2985(var23, var25, var29, var22, var24, var28,
                                                    method3102(var30, var1.field1761),
                                                    method3102(var30, var1.field1756),
                                                    method3102(var30, var1.field1757));
                            }
                        }

                    }
                }
            }
        }
    }

    void method3101(class116 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        int var8 = var1.field1571.length;

        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        for (var9 = 0; var9 < var8; ++var9) {
            var10 = var1.field1571[var9] - field1792;
            var11 = var1.field1570[var9] - field1793;
            var12 = var1.field1563[var9] - field1794;
            var13 = var12 * var4 + var5 * var10 >> 16;
            var12 = var5 * var12 - var10 * var4 >> 16;
            var10 = var13;
            var13 = var3 * var11 - var12 * var2 >> 16;
            var12 = var11 * var2 + var3 * var12 >> 16;
            if (var12 < 50) {
                return;
            }

            if (var1.field1561 != null) {
                class116.field1578[var9] = var10;
                class116.field1579[var9] = var13;
                class116.field1580[var9] = var12;
            }

            class116.field1576[var9] = var10 * class124.field1741 / var12 + class124.field1739;
            class116.field1562[var9] = var13 * class124.field1741 / var12 + class124.field1730;
        }

        class124.field1732 = 0;
        var8 = var1.field1569.length;

        for (var9 = 0; var9 < var8; ++var9) {
            var10 = var1.field1569[var9];
            var11 = var1.field1568[var9];
            var12 = var1.field1567[var9];
            var13 = class116.field1576[var10];
            int var14 = class116.field1576[var11];
            int var15 = class116.field1576[var12];
            int var16 = class116.field1562[var10];
            int var17 = class116.field1562[var11];
            int var18 = class116.field1562[var12];
            if ((var13 - var14) * (var18 - var17) - (var16 - var17) * (var15 - var14) > 0) {
                class124.field1753 = false;
                if (var13 < 0 || var14 < 0 || var15 < 0 || var13 > class124.field1742
                    || var14 > class124.field1742 || var15 > class124.field1742) {
                    class124.field1753 = true;
                }

                if (field1800 && method3181(field1802, field1795, var16, var17, var18, var13, var14,
                                            var15)) {
                    field1785 = var6;
                    field1805 = var7;
                }

                if (var1.field1561 != null && var1.field1561[var9] != -1) {
                    if (!field1777) {
                        if (var1.field1572) {
                            class124.method2991(var16, var17, var18, var13, var14, var15,
                                                var1.field1564[var9], var1.field1565[var9],
                                                var1.field1566[var9], class116.field1578[0],
                                                class116.field1578[1], class116.field1578[3],
                                                class116.field1579[0], class116.field1579[1],
                                                class116.field1579[3], class116.field1580[0],
                                                class116.field1580[1], class116.field1580[3],
                                                var1.field1561[var9]);
                        } else {
                            class124.method2991(var16, var17, var18, var13, var14, var15,
                                                var1.field1564[var9], var1.field1565[var9],
                                                var1.field1566[var9], class116.field1578[var10],
                                                class116.field1578[var11],
                                                class116.field1578[var12],
                                                class116.field1579[var10],
                                                class116.field1579[var11],
                                                class116.field1579[var12],
                                                class116.field1580[var10],
                                                class116.field1580[var11],
                                                class116.field1580[var12], var1.field1561[var9]);
                        }
                    } else {
                        int var19 = class124.field1752
                            .vmethod3247(var1.field1561[var9], -1338552621);
                        class124.method2985(var16, var17, var18, var13, var14, var15,
                                            method3102(var19, var1.field1564[var9]),
                                            method3102(var19, var1.field1565[var9]),
                                            method3102(var19, var1.field1566[var9]));
                    }
                } else if (var1.field1564[var9] != 12345678) {
                    class124
                        .method2985(var16, var17, var18, var13, var14, var15, var1.field1564[var9],
                                    var1.field1565[var9], var1.field1566[var9]);
                }
            }
        }

    }

    void method3089(class115 var1, int var2, int var3, int var4) {
        class120 var5;
        class115 var6;
        if (var3 < this.field1787) {
            var5 = this.field1810[var2][var3 + 1][var4];
            if (var5 != null && var5.field1629 != null
                && var5.field1629.field1586 instanceof class115) {
                var6 = (class115) var5.field1629.field1586;
                class115.method2790(var1, var6, 128, 0, 0, true);
            }
        }

        if (var4 < this.field1787) {
            var5 = this.field1810[var2][var3][var4 + 1];
            if (var5 != null && var5.field1629 != null
                && var5.field1629.field1586 instanceof class115) {
                var6 = (class115) var5.field1629.field1586;
                class115.method2790(var1, var6, 0, 0, 128, true);
            }
        }

        if (var3 < this.field1787 && var4 < this.field1772) {
            var5 = this.field1810[var2][var3 + 1][var4 + 1];
            if (var5 != null && var5.field1629 != null
                && var5.field1629.field1586 instanceof class115) {
                var6 = (class115) var5.field1629.field1586;
                class115.method2790(var1, var6, 128, 0, 128, true);
            }
        }

        if (var3 < this.field1787 && var4 > 0) {
            var5 = this.field1810[var2][var3 + 1][var4 - 1];
            if (var5 != null && var5.field1629 != null
                && var5.field1629.field1586 instanceof class115) {
                var6 = (class115) var5.field1629.field1586;
                class115.method2790(var1, var6, 128, 0, -128, true);
            }
        }

    }

    public void method3057() {
        int var1;
        int var2;
        for (var1 = 0; var1 < this.field1770; ++var1) {
            for (var2 = 0; var2 < this.field1787; ++var2) {
                for (int var3 = 0; var3 < this.field1772; ++var3) {
                    this.field1810[var1][var2][var3] = null;
                }
            }
        }

        for (var1 = 0; var1 < field1809; ++var1) {
            for (var2 = 0; var2 < field1829[var1]; ++var2) {
                field1803[var1][var2] = null;
            }

            field1829[var1] = 0;
        }

        for (var1 = 0; var1 < this.field1813; ++var1) {
            this.field1826[var1] = null;
        }

        this.field1813 = 0;

        for (var1 = 0; var1 < field1831.length; ++var1) {
            field1831[var1] = null;
        }

    }

    boolean method3116(int var1, int var2, int var3, int var4) {
        if (!this.method3153(var1, var2, var3)) {
            return false;
        } else {
            int var5 = var2 << 7;
            int var6 = var3 << 7;
            return this.method3165(var5 + 1, this.field1778[var1][var2][var3] - var4, var6 + 1)
                && this
                .method3165(var5 + 128 - 1, this.field1778[var1][var2 + 1][var3] - var4, var6 + 1)
                && this.method3165(var5 + 128 - 1, this.field1778[var1][var2 + 1][var3 + 1] - var4,
                                   var6 + 128 - 1) && this
                .method3165(var5 + 1, this.field1778[var1][var2][var3 + 1] - var4, var6 + 128 - 1);
        }
    }

    boolean method3108(int var1, int var2, int var3, int var4, int var5, int var6) {
        int var7;
        int var8;
        if (var3 == var2 && var5 == var4) {
            if (!this.method3153(var1, var2, var4)) {
                return false;
            } else {
                var7 = var2 << 7;
                var8 = var4 << 7;
                return this.method3165(var7 + 1, this.field1778[var1][var2][var4] - var6, var8 + 1)
                    && this.method3165(var7 + 128 - 1, this.field1778[var1][var2 + 1][var4] - var6,
                                       var8 + 1) && this
                    .method3165(var7 + 128 - 1, this.field1778[var1][var2 + 1][var4 + 1] - var6,
                                var8 + 128 - 1) && this
                    .method3165(var7 + 1, this.field1778[var1][var2][var4 + 1] - var6,
                                var8 + 128 - 1);
            }
        } else {
            for (var7 = var2; var7 <= var3; ++var7) {
                for (var8 = var4; var8 <= var5; ++var8) {
                    if (this.field1811[var1][var7][var8] == -field1816) {
                        return false;
                    }
                }
            }

            var7 = (var2 << 7) + 1;
            var8 = (var4 << 7) + 2;
            int var9 = this.field1778[var1][var2][var4] - var6;
            if (!this.method3165(var7, var9, var8)) {
                return false;
            } else {
                int var10 = (var3 << 7) - 1;
                if (!this.method3165(var10, var9, var8)) {
                    return false;
                } else {
                    int var11 = (var5 << 7) - 1;
                    if (!this.method3165(var7, var9, var11)) {
                        return false;
                    } else if (!this.method3165(var10, var9, var11)) {
                        return false;
                    } else {
                        return true;
                    }
                }
            }
        }
    }

    void method3104() {
        int var1 = field1829[field1784];
        class134[] var2 = field1803[field1784];
        field1789 = 0;

        for (int var3 = 0; var3 < var1; ++var3) {
            class134 var4 = var2[var3];
            int var5;
            int var6;
            int var7;
            int var9;
            boolean var13;
            if (var4.field1864 == 1) {
                var5 = var4.field1868 - field1812 + 25;
                if (var5 >= 0 && var5 <= 50) {
                    var6 = var4.field1862 - field1791 + 25;
                    if (var6 < 0) {
                        var6 = 0;
                    }

                    var7 = var4.field1865 - field1791 + 25;
                    if (var7 > 50) {
                        var7 = 50;
                    }

                    var13 = false;

                    while (var6 <= var7) {
                        if (field1820[var5][var6++]) {
                            var13 = true;
                            break;
                        }
                    }

                    if (var13) {
                        var9 = field1792 - var4.field1867;
                        if (var9 > 32) {
                            var4.field1873 = 1;
                        } else {
                            if (var9 >= -32) {
                                continue;
                            }

                            var4.field1873 = 2;
                            var9 = -var9;
                        }

                        var4.field1876 = (var4.field1878 - field1794 << 8) / var9;
                        var4.field1877 = (var4.field1870 - field1794 << 8) / var9;
                        var4.field1874 = (var4.field1871 - field1793 << 8) / var9;
                        var4.field1879 = (var4.field1872 - field1793 << 8) / var9;
                        field1774[field1789++] = var4;
                    }
                }
            } else if (var4.field1864 == 2) {
                var5 = var4.field1862 - field1791 + 25;
                if (var5 >= 0 && var5 <= 50) {
                    var6 = var4.field1868 - field1812 + 25;
                    if (var6 < 0) {
                        var6 = 0;
                    }

                    var7 = var4.field1869 - field1812 + 25;
                    if (var7 > 50) {
                        var7 = 50;
                    }

                    var13 = false;

                    while (var6 <= var7) {
                        if (field1820[var6++][var5]) {
                            var13 = true;
                            break;
                        }
                    }

                    if (var13) {
                        var9 = field1794 - var4.field1878;
                        if (var9 > 32) {
                            var4.field1873 = 3;
                        } else {
                            if (var9 >= -32) {
                                continue;
                            }

                            var4.field1873 = 4;
                            var9 = -var9;
                        }

                        var4.field1863 = (var4.field1867 - field1792 << 8) / var9;
                        var4.field1875 = (var4.field1866 - field1792 << 8) / var9;
                        var4.field1874 = (var4.field1871 - field1793 << 8) / var9;
                        var4.field1879 = (var4.field1872 - field1793 << 8) / var9;
                        field1774[field1789++] = var4;
                    }
                }
            } else if (var4.field1864 == 4) {
                var5 = var4.field1871 - field1793;
                if (var5 > 128) {
                    var6 = var4.field1862 - field1791 + 25;
                    if (var6 < 0) {
                        var6 = 0;
                    }

                    var7 = var4.field1865 - field1791 + 25;
                    if (var7 > 50) {
                        var7 = 50;
                    }

                    if (var6 <= var7) {
                        int var8 = var4.field1868 - field1812 + 25;
                        if (var8 < 0) {
                            var8 = 0;
                        }

                        var9 = var4.field1869 - field1812 + 25;
                        if (var9 > 50) {
                            var9 = 50;
                        }

                        boolean var10 = false;

                        label162:
                        for (int var11 = var8; var11 <= var9; ++var11) {
                            for (int var12 = var6; var12 <= var7; ++var12) {
                                if (field1820[var11][var12]) {
                                    var10 = true;
                                    break label162;
                                }
                            }
                        }

                        if (var10) {
                            var4.field1873 = 5;
                            var4.field1863 = (var4.field1867 - field1792 << 8) / var5;
                            var4.field1875 = (var4.field1866 - field1792 << 8) / var5;
                            var4.field1876 = (var4.field1878 - field1794 << 8) / var5;
                            var4.field1877 = (var4.field1870 - field1794 << 8) / var5;
                            field1774[field1789++] = var4;
                        }
                    }
                }
            }
        }

    }

    public void method3078(int var1, int var2, int var3) {
        class120 var4 = this.field1810[var1][var2][var3];
        if (var4 != null) {
            var4.field1623 = null;
        }
    }

    void method3099(class120 var1, boolean var2) {
        field1814.method4276(var1);

        while (true) {
            class120 var3;
            int var4;
            int var5;
            int var6;
            int var7;
            class120[][] var8;
            class120 var9;
            int var11;
            int var14;
            int var15;
            int var16;
            int var24;
            int var25;
            do {
                do {
                    do {
                        do {
                            do {
                                do {
                                    while (true) {
                                        class130 var10;
                                        class136 var12;
                                        int var17;
                                        int var18;
                                        boolean var20;
                                        int var21;
                                        class120 var36;
                                        while (true) {
                                            do {
                                                var3 = (class120) field1814.method4279();
                                                if (var3 == null) {
                                                    return;
                                                }
                                            } while (!var3.field1631);

                                            var4 = var3.field1616;
                                            var5 = var3.field1617;
                                            var6 = var3.field1621;
                                            var7 = var3.field1618;
                                            var8 = this.field1810[var6];
                                            if (!var3.field1624) {
                                                break;
                                            }

                                            if (var2) {
                                                if (var6 > 0) {
                                                    var9 = this.field1810[var6 - 1][var4][var5];
                                                    if (var9 != null && var9.field1631) {
                                                        continue;
                                                    }
                                                }

                                                if (var4 <= field1812 && var4 > field1786) {
                                                    var9 = var8[var4 - 1][var5];
                                                    if (var9 != null && var9.field1631 && (
                                                        var9.field1624
                                                            || (var3.field1628 & 1) == 0)) {
                                                        continue;
                                                    }
                                                }

                                                if (var4 >= field1812 && var4 < field1823 - 1) {
                                                    var9 = var8[var4 + 1][var5];
                                                    if (var9 != null && var9.field1631 && (
                                                        var9.field1624
                                                            || (var3.field1628 & 4) == 0)) {
                                                        continue;
                                                    }
                                                }

                                                if (var5 <= field1791 && var5 > field1790) {
                                                    var9 = var8[var4][var5 - 1];
                                                    if (var9 != null && var9.field1631 && (
                                                        var9.field1624
                                                            || (var3.field1628 & 8) == 0)) {
                                                        continue;
                                                    }
                                                }

                                                if (var5 >= field1791 && var5 < field1832 - 1) {
                                                    var9 = var8[var4][var5 + 1];
                                                    if (var9 != null && var9.field1631 && (
                                                        var9.field1624
                                                            || (var3.field1628 & 2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                var2 = true;
                                            }

                                            var3.field1624 = false;
                                            if (var3.field1630 != null) {
                                                var9 = var3.field1630;
                                                if (var9.field1619 != null) {
                                                    if (!this.method3153(0, var4, var5)) {
                                                        this.method3100(var9.field1619, 0,
                                                                        field1769, field1796,
                                                                        field1797, field1798, var4,
                                                                        var5);
                                                    }
                                                } else if (var9.field1620 != null && !this
                                                    .method3153(0, var4, var5)) {
                                                    this.method3101(var9.field1620, field1769,
                                                                    field1796, field1797, field1798,
                                                                    var4, var5);
                                                }

                                                var10 = var9.field1637;
                                                if (var10 != null) {
                                                    var10.field1846
                                                        .vmethod3239(0, field1769, field1796,
                                                                     field1797, field1798,
                                                                     var10.field1842 - field1792,
                                                                     var10.field1843 - field1793,
                                                                     var10.field1849 - field1794,
                                                                     var10.field1848);
                                                }

                                                for (var11 = 0; var11 < var9.field1625; ++var11) {
                                                    var12 = var9.field1626[var11];
                                                    if (var12 != null) {
                                                        var12.field1896
                                                            .vmethod3239(var12.field1897, field1769,
                                                                         field1796, field1797,
                                                                         field1798, var12.field1894
                                                                             - field1792,
                                                                         var12.field1895
                                                                             - field1793,
                                                                         var12.field1907
                                                                             - field1794,
                                                                         var12.field1904);
                                                    }
                                                }
                                            }

                                            var20 = false;
                                            if (var3.field1619 != null) {
                                                if (!this.method3153(var7, var4, var5)) {
                                                    var20 = true;
                                                    if (var3.field1619.field1755 != 12345678
                                                        || field1800 && var6 <= field1801) {
                                                        this.method3100(var3.field1619, var7,
                                                                        field1769, field1796,
                                                                        field1797, field1798, var4,
                                                                        var5);
                                                    }
                                                }
                                            } else if (var3.field1620 != null && !this
                                                .method3153(var7, var4, var5)) {
                                                var20 = true;
                                                this.method3101(var3.field1620, field1769,
                                                                field1796, field1797, field1798,
                                                                var4, var5);
                                            }

                                            var21 = 0;
                                            var11 = 0;
                                            class130 var31 = var3.field1637;
                                            class135 var13 = var3.field1622;
                                            if (var31 != null || var13 != null) {
                                                if (var4 == field1812) {
                                                    ++var21;
                                                } else if (field1812 < var4) {
                                                    var21 += 2;
                                                }

                                                if (var5 == field1791) {
                                                    var21 += 3;
                                                } else if (field1791 > var5) {
                                                    var21 += 6;
                                                }

                                                var11 = field1815[var21];
                                                var3.field1636 = field1817[var21];
                                            }

                                            if (var31 != null) {
                                                if ((var31.field1844 & field1776[var21]) != 0) {
                                                    if (var31.field1844 == 16) {
                                                        var3.field1635 = 3;
                                                        var3.field1634 = field1818[var21];
                                                        var3.field1615 = 3 - var3.field1634;
                                                    } else if (var31.field1844 == 32) {
                                                        var3.field1635 = 6;
                                                        var3.field1634 = field1819[var21];
                                                        var3.field1615 = 6 - var3.field1634;
                                                    } else if (var31.field1844 == 64) {
                                                        var3.field1635 = 12;
                                                        var3.field1634 = field1788[var21];
                                                        var3.field1615 = 12 - var3.field1634;
                                                    } else {
                                                        var3.field1635 = 9;
                                                        var3.field1634 = field1821[var21];
                                                        var3.field1615 = 9 - var3.field1634;
                                                    }
                                                } else {
                                                    var3.field1635 = 0;
                                                }

                                                if ((var31.field1844 & var11) != 0 && !this
                                                    .method3096(var7, var4, var5,
                                                                var31.field1844)) {
                                                    var31.field1846
                                                        .vmethod3239(0, field1769, field1796,
                                                                     field1797, field1798,
                                                                     var31.field1842 - field1792,
                                                                     var31.field1843 - field1793,
                                                                     var31.field1849 - field1794,
                                                                     var31.field1848);
                                                }

                                                if ((var31.field1845 & var11) != 0 && !this
                                                    .method3096(var7, var4, var5,
                                                                var31.field1845)) {
                                                    var31.field1847
                                                        .vmethod3239(0, field1769, field1796,
                                                                     field1797, field1798,
                                                                     var31.field1842 - field1792,
                                                                     var31.field1843 - field1793,
                                                                     var31.field1849 - field1794,
                                                                     var31.field1848);
                                                }
                                            }

                                            if (var13 != null && !this.method3116(var7, var4, var5,
                                                                                  var13.field1887.field1840)) {
                                                if ((var13.field1883 & var11) != 0) {
                                                    var13.field1887
                                                        .vmethod3239(0, field1769, field1796,
                                                                     field1797, field1798,
                                                                     var13.field1881 - field1792
                                                                         + var13.field1885,
                                                                     var13.field1891 - field1793,
                                                                     var13.field1886 - field1794
                                                                         + var13.field1890,
                                                                     var13.field1880);
                                                } else if (var13.field1883 == 256) {
                                                    var14 = var13.field1881 - field1792;
                                                    var15 = var13.field1891 - field1793;
                                                    var16 = var13.field1886 - field1794;
                                                    var17 = var13.field1884;
                                                    if (var17 != 1 && var17 != 2) {
                                                        var18 = var14;
                                                    } else {
                                                        var18 = -var14;
                                                    }

                                                    int var19;
                                                    if (var17 != 2 && var17 != 3) {
                                                        var19 = var16;
                                                    } else {
                                                        var19 = -var16;
                                                    }

                                                    if (var19 < var18) {
                                                        var13.field1887
                                                            .vmethod3239(0, field1769, field1796,
                                                                         field1797, field1798,
                                                                         var14 + var13.field1885,
                                                                         var15,
                                                                         var16 + var13.field1890,
                                                                         var13.field1880);
                                                    } else if (var13.field1888 != null) {
                                                        var13.field1888
                                                            .vmethod3239(0, field1769, field1796,
                                                                         field1797, field1798,
                                                                         var14, var15, var16,
                                                                         var13.field1880);
                                                    }
                                                }
                                            }

                                            if (var20) {
                                                class117 var22 = var3.field1629;
                                                if (var22 != null) {
                                                    var22.field1586
                                                        .vmethod3239(0, field1769, field1796,
                                                                     field1797, field1798,
                                                                     var22.field1584 - field1792,
                                                                     var22.field1583 - field1793,
                                                                     var22.field1585 - field1794,
                                                                     var22.field1587);
                                                }

                                                class114 var23 = var3.field1623;
                                                if (var23 != null && var23.field1519 == 0) {
                                                    if (var23.field1520 != null) {
                                                        var23.field1520
                                                            .vmethod3239(0, field1769, field1796,
                                                                         field1797, field1798,
                                                                         var23.field1516
                                                                             - field1792,
                                                                         var23.field1515
                                                                             - field1793,
                                                                         var23.field1514
                                                                             - field1794,
                                                                         var23.field1518);
                                                    }

                                                    if (var23.field1517 != null) {
                                                        var23.field1517
                                                            .vmethod3239(0, field1769, field1796,
                                                                         field1797, field1798,
                                                                         var23.field1516
                                                                             - field1792,
                                                                         var23.field1515
                                                                             - field1793,
                                                                         var23.field1514
                                                                             - field1794,
                                                                         var23.field1518);
                                                    }

                                                    if (var23.field1512 != null) {
                                                        var23.field1512
                                                            .vmethod3239(0, field1769, field1796,
                                                                         field1797, field1798,
                                                                         var23.field1516
                                                                             - field1792,
                                                                         var23.field1515
                                                                             - field1793,
                                                                         var23.field1514
                                                                             - field1794,
                                                                         var23.field1518);
                                                    }
                                                }
                                            }

                                            var14 = var3.field1628;
                                            if (var14 != 0) {
                                                if (var4 < field1812 && (var14 & 4) != 0) {
                                                    var36 = var8[var4 + 1][var5];
                                                    if (var36 != null && var36.field1631) {
                                                        field1814.method4276(var36);
                                                    }
                                                }

                                                if (var5 < field1791 && (var14 & 2) != 0) {
                                                    var36 = var8[var4][var5 + 1];
                                                    if (var36 != null && var36.field1631) {
                                                        field1814.method4276(var36);
                                                    }
                                                }

                                                if (var4 > field1812 && (var14 & 1) != 0) {
                                                    var36 = var8[var4 - 1][var5];
                                                    if (var36 != null && var36.field1631) {
                                                        field1814.method4276(var36);
                                                    }
                                                }

                                                if (var5 > field1791 && (var14 & 8) != 0) {
                                                    var36 = var8[var4][var5 - 1];
                                                    if (var36 != null && var36.field1631) {
                                                        field1814.method4276(var36);
                                                    }
                                                }
                                            }
                                            break;
                                        }

                                        if (var3.field1635 != 0) {
                                            var20 = true;

                                            for (var21 = 0; var21 < var3.field1625; ++var21) {
                                                if (var3.field1626[var21].field1905 != field1816
                                                    && (var3.field1627[var21] & var3.field1635)
                                                    == var3.field1634) {
                                                    var20 = false;
                                                    break;
                                                }
                                            }

                                            if (var20) {
                                                var10 = var3.field1637;
                                                if (!this.method3096(var7, var4, var5,
                                                                     var10.field1844)) {
                                                    var10.field1846
                                                        .vmethod3239(0, field1769, field1796,
                                                                     field1797, field1798,
                                                                     var10.field1842 - field1792,
                                                                     var10.field1843 - field1793,
                                                                     var10.field1849 - field1794,
                                                                     var10.field1848);
                                                }

                                                var3.field1635 = 0;
                                            }
                                        }

                                        if (!var3.field1632) {
                                            break;
                                        }

                                        try {
                                            int var34 = var3.field1625;
                                            var3.field1632 = false;
                                            var21 = 0;

                                            label563:
                                            for (var11 = 0; var11 < var34; ++var11) {
                                                var12 = var3.field1626[var11];
                                                if (var12.field1905 != field1816) {
                                                    for (var24 = var12.field1898;
                                                         var24 <= var12.field1903; ++var24) {
                                                        for (var14 = var12.field1900;
                                                             var14 <= var12.field1901; ++var14) {
                                                            var36 = var8[var24][var14];
                                                            if (var36.field1624) {
                                                                var3.field1632 = true;
                                                                continue label563;
                                                            }

                                                            if (var36.field1635 != 0) {
                                                                var16 = 0;
                                                                if (var24 > var12.field1898) {
                                                                    ++var16;
                                                                }

                                                                if (var24 < var12.field1903) {
                                                                    var16 += 4;
                                                                }

                                                                if (var14 > var12.field1900) {
                                                                    var16 += 8;
                                                                }

                                                                if (var14 < var12.field1901) {
                                                                    var16 += 2;
                                                                }

                                                                if ((var16 & var36.field1635)
                                                                    == var3.field1615) {
                                                                    var3.field1632 = true;
                                                                    continue label563;
                                                                }
                                                            }
                                                        }
                                                    }

                                                    field1831[var21++] = var12;
                                                    var24 = field1812 - var12.field1898;
                                                    var14 = var12.field1903 - field1812;
                                                    if (var14 > var24) {
                                                        var24 = var14;
                                                    }

                                                    var15 = field1791 - var12.field1900;
                                                    var16 = var12.field1901 - field1791;
                                                    if (var16 > var15) {
                                                        var12.field1902 = var24 + var16;
                                                    } else {
                                                        var12.field1902 = var24 + var15;
                                                    }
                                                }
                                            }

                                            while (var21 > 0) {
                                                var11 = -50;
                                                var25 = -1;

                                                for (var24 = 0; var24 < var21; ++var24) {
                                                    class136 var35 = field1831[var24];
                                                    if (var35.field1905 != field1816) {
                                                        if (var35.field1902 > var11) {
                                                            var11 = var35.field1902;
                                                            var25 = var24;
                                                        } else if (var11 == var35.field1902) {
                                                            var15 = var35.field1894 - field1792;
                                                            var16 = var35.field1907 - field1794;
                                                            var17 = field1831[var25].field1894
                                                                - field1792;
                                                            var18 = field1831[var25].field1907
                                                                - field1794;
                                                            if (var15 * var15 + var16 * var16
                                                                > var17 * var17 + var18 * var18) {
                                                                var25 = var24;
                                                            }
                                                        }
                                                    }
                                                }

                                                if (var25 == -1) {
                                                    break;
                                                }

                                                class136 var33 = field1831[var25];
                                                var33.field1905 = field1816;
                                                if (!this.method3108(var7, var33.field1898,
                                                                     var33.field1903,
                                                                     var33.field1900,
                                                                     var33.field1901,
                                                                     var33.field1896.field1840)) {
                                                    var33.field1896
                                                        .vmethod3239(var33.field1897, field1769,
                                                                     field1796, field1797,
                                                                     field1798,
                                                                     var33.field1894 - field1792,
                                                                     var33.field1895 - field1793,
                                                                     var33.field1907 - field1794,
                                                                     var33.field1904);
                                                }

                                                for (var14 = var33.field1898;
                                                     var14 <= var33.field1903; ++var14) {
                                                    for (var15 = var33.field1900;
                                                         var15 <= var33.field1901; ++var15) {
                                                        class120 var26 = var8[var14][var15];
                                                        if (var26.field1635 != 0) {
                                                            field1814.method4276(var26);
                                                        } else if ((var14 != var4 || var15 != var5)
                                                            && var26.field1631) {
                                                            field1814.method4276(var26);
                                                        }
                                                    }
                                                }
                                            }

                                            if (!var3.field1632) {
                                                break;
                                            }
                                        } catch (Exception var28) {
                                            var3.field1632 = false;
                                            break;
                                        }
                                    }
                                } while (!var3.field1631);
                            } while (var3.field1635 != 0);

                            if (var4 > field1812 || var4 <= field1786) {
                                break;
                            }

                            var9 = var8[var4 - 1][var5];
                        } while (var9 != null && var9.field1631);

                        if (var4 < field1812 || var4 >= field1823 - 1) {
                            break;
                        }

                        var9 = var8[var4 + 1][var5];
                    } while (var9 != null && var9.field1631);

                    if (var5 > field1791 || var5 <= field1790) {
                        break;
                    }

                    var9 = var8[var4][var5 - 1];
                } while (var9 != null && var9.field1631);

                if (var5 < field1791 || var5 >= field1832 - 1) {
                    break;
                }

                var9 = var8[var4][var5 + 1];
            } while (var9 != null && var9.field1631);

            var3.field1631 = false;
            --field1783;
            class114 var32 = var3.field1623;
            if (var32 != null && var32.field1519 != 0) {
                if (var32.field1520 != null) {
                    var32.field1520.vmethod3239(0, field1769, field1796, field1797, field1798,
                                                var32.field1516 - field1792,
                                                var32.field1515 - field1793 - var32.field1519,
                                                var32.field1514 - field1794, var32.field1518);
                }

                if (var32.field1517 != null) {
                    var32.field1517.vmethod3239(0, field1769, field1796, field1797, field1798,
                                                var32.field1516 - field1792,
                                                var32.field1515 - field1793 - var32.field1519,
                                                var32.field1514 - field1794, var32.field1518);
                }

                if (var32.field1512 != null) {
                    var32.field1512.vmethod3239(0, field1769, field1796, field1797, field1798,
                                                var32.field1516 - field1792,
                                                var32.field1515 - field1793 - var32.field1519,
                                                var32.field1514 - field1794, var32.field1518);
                }
            }

            if (var3.field1636 != 0) {
                class135 var29 = var3.field1622;
                if (var29 != null && !this
                    .method3116(var7, var4, var5, var29.field1887.field1840)) {
                    if ((var29.field1883 & var3.field1636) != 0) {
                        var29.field1887.vmethod3239(0, field1769, field1796, field1797, field1798,
                                                    var29.field1881 - field1792 + var29.field1885,
                                                    var29.field1891 - field1793,
                                                    var29.field1886 - field1794 + var29.field1890,
                                                    var29.field1880);
                    } else if (var29.field1883 == 256) {
                        var11 = var29.field1881 - field1792;
                        var25 = var29.field1891 - field1793;
                        var24 = var29.field1886 - field1794;
                        var14 = var29.field1884;
                        if (var14 != 1 && var14 != 2) {
                            var15 = var11;
                        } else {
                            var15 = -var11;
                        }

                        if (var14 != 2 && var14 != 3) {
                            var16 = var24;
                        } else {
                            var16 = -var24;
                        }

                        if (var16 >= var15) {
                            var29.field1887
                                .vmethod3239(0, field1769, field1796, field1797, field1798,
                                             var11 + var29.field1885, var25,
                                             var24 + var29.field1890, var29.field1880);
                        } else if (var29.field1888 != null) {
                            var29.field1888
                                .vmethod3239(0, field1769, field1796, field1797, field1798, var11,
                                             var25, var24, var29.field1880);
                        }
                    }
                }

                class130 var27 = var3.field1637;
                if (var27 != null) {
                    if ((var27.field1845 & var3.field1636) != 0 && !this
                        .method3096(var7, var4, var5, var27.field1845)) {
                        var27.field1847.vmethod3239(0, field1769, field1796, field1797, field1798,
                                                    var27.field1842 - field1792,
                                                    var27.field1843 - field1793,
                                                    var27.field1849 - field1794, var27.field1848);
                    }

                    if ((var27.field1844 & var3.field1636) != 0 && !this
                        .method3096(var7, var4, var5, var27.field1844)) {
                        var27.field1846.vmethod3239(0, field1769, field1796, field1797, field1798,
                                                    var27.field1842 - field1792,
                                                    var27.field1843 - field1793,
                                                    var27.field1849 - field1794, var27.field1848);
                    }
                }
            }

            class120 var30;
            if (var6 < this.field1770 - 1) {
                var30 = this.field1810[var6 + 1][var4][var5];
                if (var30 != null && var30.field1631) {
                    field1814.method4276(var30);
                }
            }

            if (var4 < field1812) {
                var30 = var8[var4 + 1][var5];
                if (var30 != null && var30.field1631) {
                    field1814.method4276(var30);
                }
            }

            if (var5 < field1791) {
                var30 = var8[var4][var5 + 1];
                if (var30 != null && var30.field1631) {
                    field1814.method4276(var30);
                }
            }

            if (var4 > field1812) {
                var30 = var8[var4 - 1][var5];
                if (var30 != null && var30.field1631) {
                    field1814.method4276(var30);
                }
            }

            if (var5 > field1791) {
                var30 = var8[var4][var5 - 1];
                if (var30 != null && var30.field1631) {
                    field1814.method4276(var30);
                }
            }
        }
    }

    public long method3083(int var1, int var2, int var3) {
        class120 var4 = this.field1810[var1][var2][var3];
        return var4 != null && var4.field1637 != null ? var4.field1637.field1848 : 0L;
    }

    public long method3084(int var1, int var2, int var3) {
        class120 var4 = this.field1810[var1][var2][var3];
        return var4 != null && var4.field1622 != null ? var4.field1622.field1880 : 0L;
    }

    public void method3064(int var1, int var2, int var3, int var4, class129 var5, long var6,
                           class129 var8, class129 var9) {
        class114 var10 = new class114();
        var10.field1512 = var5;
        var10.field1516 = var2 * 128 + 64;
        var10.field1514 = var3 * 128 + 64;
        var10.field1515 = var4;
        var10.field1518 = var6;
        var10.field1520 = var8;
        var10.field1517 = var9;
        int var11 = 0;
        class120 var12 = this.field1810[var1][var2][var3];
        if (var12 != null) {
            for (int var13 = 0; var13 < var12.field1625; ++var13) {
                if ((var12.field1626[var13].field1906 & 256) == 256
                    && var12.field1626[var13].field1896 instanceof class121) {
                    class121 var14 = (class121) var12.field1626[var13].field1896;
                    var14.method2873();
                    if (var14.field1840 > var11) {
                        var11 = var14.field1840;
                    }
                }
            }
        }

        var10.field1519 = var11;
        if (this.field1810[var1][var2][var3] == null) {
            this.field1810[var1][var2][var3] = new class120(var1, var2, var3);
        }

        this.field1810[var1][var2][var3].field1623 = var10;
    }

    public long method3085(int var1, int var2, int var3) {
        class120 var4 = this.field1810[var1][var2][var3];
        if (var4 == null) {
            return 0L;
        } else {
            for (int var5 = 0; var5 < var4.field1625; ++var5) {
                class136 var6 = var4.field1626[var5];
                if (class29.method533(var6.field1904) && var2 == var6.field1898
                    && var3 == var6.field1900) {
                    return var6.field1904;
                }
            }

            return 0L;
        }
    }

    public void method3091(int[] var1, int var2, int var3, int var4, int var5, int var6) {
        class120 var7 = this.field1810[var4][var5][var6];
        if (var7 != null) {
            class125 var8 = var7.field1619;
            int var10;
            if (var8 != null) {
                int var9 = var8.field1758;
                if (var9 != 0) {
                    for (var10 = 0; var10 < 4; ++var10) {
                        var1[var2] = var9;
                        var1[var2 + 1] = var9;
                        var1[var2 + 2] = var9;
                        var1[var2 + 3] = var9;
                        var2 += var3;
                    }

                }
            } else {
                class116 var18 = var7.field1620;
                if (var18 != null) {
                    var10 = var18.field1577;
                    int var11 = var18.field1573;
                    int var12 = var18.field1574;
                    int var13 = var18.field1575;
                    int[] var14 = this.field1771[var10];
                    int[] var15 = this.field1827[var11];
                    int var16 = 0;
                    int var17;
                    if (var12 != 0) {
                        for (var17 = 0; var17 < 4; ++var17) {
                            var1[var2] = var14[var15[var16++]] == 0 ? var12 : var13;
                            var1[var2 + 1] = var14[var15[var16++]] == 0 ? var12 : var13;
                            var1[var2 + 2] = var14[var15[var16++]] == 0 ? var12 : var13;
                            var1[var2 + 3] = var14[var15[var16++]] == 0 ? var12 : var13;
                            var2 += var3;
                        }
                    } else {
                        for (var17 = 0; var17 < 4; ++var17) {
                            if (var14[var15[var16++]] != 0) {
                                var1[var2] = var13;
                            }

                            if (var14[var15[var16++]] != 0) {
                                var1[var2 + 1] = var13;
                            }

                            if (var14[var15[var16++]] != 0) {
                                var1[var2 + 2] = var13;
                            }

                            if (var14[var15[var16++]] != 0) {
                                var1[var2 + 3] = var13;
                            }

                            var2 += var3;
                        }
                    }

                }
            }
        }
    }

    public long method3182(int var1, int var2, int var3) {
        class120 var4 = this.field1810[var1][var2][var3];
        return var4 != null && var4.field1629 != null ? var4.field1629.field1587 : 0L;
    }

    public int method3087(int var1, int var2, int var3, long var4) {
        class120 var6 = this.field1810[var1][var2][var3];
        if (var6 == null) {
            return -1;
        } else if (var6.field1637 != null && var6.field1637.field1848 == var4) {
            return var6.field1637.field1841 & 255;
        } else if (var6.field1622 != null && var6.field1622.field1880 == var4) {
            return var6.field1622.field1889 & 255;
        } else if (var6.field1629 != null && var6.field1629.field1587 == var4) {
            return var6.field1629.field1588 & 255;
        } else {
            for (int var7 = 0; var7 < var6.field1625; ++var7) {
                if (var6.field1626[var7].field1904 == var4) {
                    return var6.field1626[var7].field1906 & 255;
                }
            }

            return -1;
        }
    }

    public class130 method3107(int var1, int var2, int var3) {
        class120 var4 = this.field1810[var1][var2][var3];
        return var4 == null ? null : var4.field1637;
    }

    public class135 method3230(int var1, int var2, int var3) {
        class120 var4 = this.field1810[var1][var2][var3];
        return var4 == null ? null : var4.field1622;
    }

    public boolean method3092(int var1, int var2, int var3, int var4, int var5, class129 var6,
                              int var7, long var8, boolean var10) {
        if (var6 == null) {
            return true;
        } else {
            int var11 = var2 - var5;
            int var12 = var3 - var5;
            int var13 = var5 + var2;
            int var14 = var3 + var5;
            if (var10) {
                if (var7 > 640 && var7 < 1408) {
                    var14 += 128;
                }

                if (var7 > 1152 && var7 < 1920) {
                    var13 += 128;
                }

                if (var7 > 1664 || var7 < 384) {
                    var12 -= 128;
                }

                if (var7 > 128 && var7 < 896) {
                    var11 -= 128;
                }
            }

            var11 /= 128;
            var12 /= 128;
            var13 /= 128;
            var14 /= 128;
            return this
                .method3070(var1, var11, var12, var13 - var11 + 1, var14 - var12 + 1, var2, var3,
                            var4, var6, var7, true, var8, 0);
        }
    }

    public class136 method3081(int var1, int var2, int var3) {
        class120 var4 = this.field1810[var1][var2][var3];
        if (var4 == null) {
            return null;
        } else {
            for (int var5 = 0; var5 < var4.field1625; ++var5) {
                class136 var6 = var4.field1626[var5];
                if (class29.method533(var6.field1904) && var2 == var6.field1898
                    && var3 == var6.field1900) {
                    return var6;
                }
            }

            return null;
        }
    }

    public class117 method3117(int var1, int var2, int var3) {
        class120 var4 = this.field1810[var1][var2][var3];
        return var4 != null && var4.field1629 != null ? var4.field1629 : null;
    }

    public void method3074(int var1, int var2, int var3) {
        class120 var4 = this.field1810[var1][var2][var3];
        if (var4 != null) {
            var4.field1637 = null;
        }
    }

    public boolean method3069(int var1, int var2, int var3, int var4, int var5, class129 var6,
                              int var7, long var8, int var10, int var11, int var12, int var13) {
        return var6 == null ? true : this
            .method3070(var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4,
                        var6, var7, true, var8, 0);
    }

    public void method3075(int var1, int var2, int var3) {
        class120 var4 = this.field1810[var1][var2][var3];
        if (var4 != null) {
            var4.field1622 = null;
        }
    }

    public void method3076(int var1, int var2, int var3) {
        class120 var4 = this.field1810[var1][var2][var3];
        if (var4 != null) {
            for (int var5 = 0; var5 < var4.field1625; ++var5) {
                class136 var6 = var4.field1626[var5];
                if (class29.method533(var6.field1904) && var2 == var6.field1898
                    && var3 == var6.field1900) {
                    this.method3072(var6);
                    return;
                }
            }

        }
    }

    public void method3077(int var1, int var2, int var3) {
        class120 var4 = this.field1810[var1][var2][var3];
        if (var4 != null) {
            var4.field1629 = null;
        }
    }

    public void method3063(int var1, int var2, int var3, int var4, class129 var5, long var6,
                           int var8) {
        if (var5 != null) {
            class117 var9 = new class117();
            var9.field1586 = var5;
            var9.field1584 = var2 * 128 + 64;
            var9.field1585 = var3 * 128 + 64;
            var9.field1583 = var4;
            var9.field1587 = var6;
            var9.field1588 = var8;
            if (this.field1810[var1][var2][var3] == null) {
                this.field1810[var1][var2][var3] = new class120(var1, var2, var3);
            }

            this.field1810[var1][var2][var3].field1629 = var9;
        }
    }

    public boolean method3067(int var1, int var2, int var3, int var4, int var5, int var6,
                              class129 var7, int var8, long var9, int var11) {
        if (var7 == null) {
            return true;
        } else {
            int var12 = var5 * 64 + var2 * 128;
            int var13 = var6 * 64 + var3 * 128;
            return this
                .method3070(var1, var2, var3, var5, var6, var12, var13, var4, var7, var8, false,
                            var9, var11);
        }
    }

    public void method3065(int var1, int var2, int var3, int var4, class129 var5, class129 var6,
                           int var7, int var8, long var9, int var11) {
        if (var5 != null || var6 != null) {
            class130 var12 = new class130();
            var12.field1848 = var9;
            var12.field1841 = var11;
            var12.field1842 = var2 * 128 + 64;
            var12.field1849 = var3 * 128 + 64;
            var12.field1843 = var4;
            var12.field1846 = var5;
            var12.field1847 = var6;
            var12.field1844 = var7;
            var12.field1845 = var8;

            for (int var13 = var1; var13 >= 0; --var13) {
                if (this.field1810[var13][var2][var3] == null) {
                    this.field1810[var13][var2][var3] = new class120(var13, var2, var3);
                }
            }

            this.field1810[var1][var2][var3].field1637 = var12;
        }
    }

    public void method3066(int var1, int var2, int var3, int var4, class129 var5, class129 var6,
                           int var7, int var8, int var9, int var10, long var11, int var13) {
        if (var5 != null) {
            class135 var14 = new class135();
            var14.field1880 = var11;
            var14.field1889 = var13;
            var14.field1881 = var2 * 128 + 64;
            var14.field1886 = var3 * 128 + 64;
            var14.field1891 = var4;
            var14.field1887 = var5;
            var14.field1888 = var6;
            var14.field1883 = var7;
            var14.field1884 = var8;
            var14.field1885 = var9;
            var14.field1890 = var10;

            for (int var15 = var1; var15 >= 0; --var15) {
                if (this.field1810[var15][var2][var3] == null) {
                    this.field1810[var15][var2][var3] = new class120(var15, var2, var3);
                }
            }

            this.field1810[var1][var2][var3].field1622 = var14;
        }
    }

    public void method3157(int var1, int var2, int var3) {
        for (int var4 = 0; var4 < this.field1770; ++var4) {
            for (int var5 = 0; var5 < this.field1787; ++var5) {
                for (int var6 = 0; var6 < this.field1772; ++var6) {
                    class120 var7 = this.field1810[var4][var5][var6];
                    if (var7 != null) {
                        class130 var8 = var7.field1637;
                        class115 var10;
                        if (var8 != null && var8.field1846 instanceof class115) {
                            class115 var9 = (class115) var8.field1846;
                            this.method3205(var9, var4, var5, var6, 1, 1);
                            if (var8.field1847 instanceof class115) {
                                var10 = (class115) var8.field1847;
                                this.method3205(var10, var4, var5, var6, 1, 1);
                                class115.method2790(var9, var10, 0, 0, 0, false);
                                var8.field1847 = var10
                                    .method2772(var10.field1548, var10.field1549, var1, var2, var3);
                            }

                            var8.field1846 = var9
                                .method2772(var9.field1548, var9.field1549, var1, var2, var3);
                        }

                        for (int var12 = 0; var12 < var7.field1625; ++var12) {
                            class136 var14 = var7.field1626[var12];
                            if (var14 != null && var14.field1896 instanceof class115) {
                                class115 var11 = (class115) var14.field1896;
                                this.method3205(var11, var4, var5, var6,
                                                var14.field1903 - var14.field1898 + 1,
                                                var14.field1901 - var14.field1900 + 1);
                                var14.field1896 = var11
                                    .method2772(var11.field1548, var11.field1549, var1, var2, var3);
                            }
                        }

                        class117 var13 = var7.field1629;
                        if (var13 != null && var13.field1586 instanceof class115) {
                            var10 = (class115) var13.field1586;
                            this.method3089(var10, var4, var5, var6);
                            var13.field1586 = var10
                                .method2772(var10.field1548, var10.field1549, var1, var2, var3);
                        }
                    }
                }
            }
        }

    }

    public void method3059(int var1, int var2) {
        class120 var3 = this.field1810[0][var1][var2];

        for (int var4 = 0; var4 < 3; ++var4) {
            class120 var5 = this.field1810[var4][var1][var2] = this.field1810[var4 + 1][var1][var2];
            if (var5 != null) {
                --var5.field1621;

                for (int var6 = 0; var6 < var5.field1625; ++var6) {
                    class136 var7 = var5.field1626[var6];
                    if (class29.method533(var7.field1904) && var7.field1898 == var1
                        && var2 == var7.field1900) {
                        --var7.field1899;
                    }
                }
            }
        }

        if (this.field1810[0][var1][var2] == null) {
            this.field1810[0][var1][var2] = new class120(0, var1, var2);
        }

        this.field1810[0][var1][var2].field1630 = var3;
        this.field1810[3][var1][var2] = null;
    }

    public void method3095() {
        field1806 = true;
    }

    public void method3061(int var1, int var2, int var3, int var4) {
        class120 var5 = this.field1810[var1][var2][var3];
        if (var5 != null) {
            this.field1810[var1][var2][var3].field1633 = var4;
        }
    }

    public void method3056(int var1) {
        this.field1775 = var1;

        for (int var2 = 0; var2 < this.field1787; ++var2) {
            for (int var3 = 0; var3 < this.field1772; ++var3) {
                if (this.field1810[var1][var2][var3] == null) {
                    this.field1810[var1][var2][var3] = new class120(var1, var2, var3);
                }
            }
        }

    }

    public void method3098(int var1, int var2, int var3, int var4, int var5, int var6) {
        if (var1 < 0) {
            var1 = 0;
        } else if (var1 >= this.field1787 * 128) {
            var1 = this.field1787 * 128 - 1;
        }

        if (var3 < 0) {
            var3 = 0;
        } else if (var3 >= this.field1772 * 128) {
            var3 = this.field1772 * 128 - 1;
        }

        if (var4 < 128) {
            var4 = 128;
        } else if (var4 > 383) {
            var4 = 383;
        }

        ++field1816;
        field1769 = class124.field1747[var4];
        field1796 = class124.field1754[var4];
        field1797 = class124.field1747[var5];
        field1798 = class124.field1754[var5];
        field1820 = field1828[(var4 - 128) / 32][var5 / 64];
        field1792 = var1;
        field1793 = var2;
        field1794 = var3;
        field1812 = var1 / 128;
        field1791 = var3 / 128;
        field1784 = var6;
        field1786 = field1812 - 25;
        if (field1786 < 0) {
            field1786 = 0;
        }

        field1790 = field1791 - 25;
        if (field1790 < 0) {
            field1790 = 0;
        }

        field1823 = field1812 + 25;
        if (field1823 > this.field1787) {
            field1823 = this.field1787;
        }

        field1832 = field1791 + 25;
        if (field1832 > this.field1772) {
            field1832 = this.field1772;
        }

        this.method3104();
        field1783 = 0;

        int var7;
        class120[][] var8;
        int var9;
        int var10;
        for (var7 = this.field1775; var7 < this.field1770; ++var7) {
            var8 = this.field1810[var7];

            for (var9 = field1786; var9 < field1823; ++var9) {
                for (var10 = field1790; var10 < field1832; ++var10) {
                    class120 var11 = var8[var9][var10];
                    if (var11 != null) {
                        if (var11.field1633 > var6
                            || !field1820[var9 - field1812 + 25][var10 - field1791 + 25]
                            && this.field1778[var7][var9][var10] - var2 < 2000) {
                            var11.field1624 = false;
                            var11.field1631 = false;
                            var11.field1635 = 0;
                        } else {
                            var11.field1624 = true;
                            var11.field1631 = true;
                            if (var11.field1625 > 0) {
                                var11.field1632 = true;
                            } else {
                                var11.field1632 = false;
                            }

                            ++field1783;
                        }
                    }
                }
            }
        }

        int var12;
        int var13;
        int var14;
        class120 var15;
        int var16;
        for (var7 = this.field1775; var7 < this.field1770; ++var7) {
            var8 = this.field1810[var7];

            for (var9 = -25; var9 <= 0; ++var9) {
                var10 = var9 + field1812;
                var16 = field1812 - var9;
                if (var10 >= field1786 || var16 < field1823) {
                    for (var12 = -25; var12 <= 0; ++var12) {
                        var13 = var12 + field1791;
                        var14 = field1791 - var12;
                        if (var10 >= field1786) {
                            if (var13 >= field1790) {
                                var15 = var8[var10][var13];
                                if (var15 != null && var15.field1624) {
                                    this.method3099(var15, true);
                                }
                            }

                            if (var14 < field1832) {
                                var15 = var8[var10][var14];
                                if (var15 != null && var15.field1624) {
                                    this.method3099(var15, true);
                                }
                            }
                        }

                        if (var16 < field1823) {
                            if (var13 >= field1790) {
                                var15 = var8[var16][var13];
                                if (var15 != null && var15.field1624) {
                                    this.method3099(var15, true);
                                }
                            }

                            if (var14 < field1832) {
                                var15 = var8[var16][var14];
                                if (var15 != null && var15.field1624) {
                                    this.method3099(var15, true);
                                }
                            }
                        }

                        if (field1783 == 0) {
                            field1800 = false;
                            return;
                        }
                    }
                }
            }
        }

        for (var7 = this.field1775; var7 < this.field1770; ++var7) {
            var8 = this.field1810[var7];

            for (var9 = -25; var9 <= 0; ++var9) {
                var10 = var9 + field1812;
                var16 = field1812 - var9;
                if (var10 >= field1786 || var16 < field1823) {
                    for (var12 = -25; var12 <= 0; ++var12) {
                        var13 = var12 + field1791;
                        var14 = field1791 - var12;
                        if (var10 >= field1786) {
                            if (var13 >= field1790) {
                                var15 = var8[var10][var13];
                                if (var15 != null && var15.field1624) {
                                    this.method3099(var15, false);
                                }
                            }

                            if (var14 < field1832) {
                                var15 = var8[var10][var14];
                                if (var15 != null && var15.field1624) {
                                    this.method3099(var15, false);
                                }
                            }
                        }

                        if (var16 < field1823) {
                            if (var13 >= field1790) {
                                var15 = var8[var16][var13];
                                if (var15 != null && var15.field1624) {
                                    this.method3099(var15, false);
                                }
                            }

                            if (var14 < field1832) {
                                var15 = var8[var16][var14];
                                if (var15 != null && var15.field1624) {
                                    this.method3099(var15, false);
                                }
                            }
                        }

                        if (field1783 == 0) {
                            field1800 = false;
                            return;
                        }
                    }
                }
            }
        }

        field1800 = false;
    }

    public void method3071() {
        for (int var1 = 0; var1 < this.field1813; ++var1) {
            class136 var2 = this.field1826[var1];
            this.method3072(var2);
            this.field1826[var1] = null;
        }

        this.field1813 = 0;
    }

    public void method3073(int var1, int var2, int var3, int var4) {
        class120 var5 = this.field1810[var1][var2][var3];
        if (var5 != null) {
            class135 var6 = var5.field1622;
            if (var6 != null) {
                var6.field1885 = var4 * var6.field1885 / 16;
                var6.field1890 = var4 * var6.field1890 / 16;
            }
        }
    }

    public void method3062(int var1, int var2, int var3, int var4, int var5, int var6, int var7,
                           int var8, int var9, int var10, int var11, int var12, int var13,
                           int var14, int var15, int var16, int var17, int var18, int var19,
                           int var20) {
        class125 var21;
        int var22;
        if (var4 == 0) {
            var21 = new class125(var11, var12, var13, var14, -1, var19, false);

            for (var22 = var1; var22 >= 0; --var22) {
                if (this.field1810[var22][var2][var3] == null) {
                    this.field1810[var22][var2][var3] = new class120(var22, var2, var3);
                }
            }

            this.field1810[var1][var2][var3].field1619 = var21;
        } else if (var4 != 1) {
            class116 var23 = new class116(var4, var5, var6, var2, var3, var7, var8, var9, var10,
                                          var11, var12, var13, var14, var15, var16, var17, var18,
                                          var19, var20);

            for (var22 = var1; var22 >= 0; --var22) {
                if (this.field1810[var22][var2][var3] == null) {
                    this.field1810[var22][var2][var3] = new class120(var22, var2, var3);
                }
            }

            this.field1810[var1][var2][var3].field1620 = var23;
        } else {
            var21 = new class125(var15, var16, var17, var18, var6, var20,
                                 var8 == var7 && var7 == var9 && var10 == var7);

            for (var22 = var1; var22 >= 0; --var22) {
                if (this.field1810[var22][var2][var3] == null) {
                    this.field1810[var22][var2][var3] = new class120(var22, var2, var3);
                }
            }

            this.field1810[var1][var2][var3].field1619 = var21;
        }
    }
}
