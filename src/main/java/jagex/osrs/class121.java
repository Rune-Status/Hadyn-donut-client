package jagex.osrs;

public class class121 extends class129 {

    static boolean[] field1678;
    static int[] field1686;
    static int[] field1702;
    static class121 field1640;
    static byte[] field1675;
    static class121 field1641;
    static int field1645;
    static byte[] field1639;
    static int[] field1703;
    static int field1697;
    static int field1687;
    static int[] field1672;
    static boolean[] field1677;
    static int[] field1688;
    static int[] field1692;
    static int[][] field1689;
    static int[] field1643;
    static int[] field1680;
    static int[] field1693;
    static int[] field1682;
    static int[] field1681;
    static int[] field1683;
    static int[] field1698;
    static int[][] field1670;
    static int[] field1705;
    static int[] field1695;
    static int[] field1690;
    static int[] field1652;
    static int[] field1704;
    static boolean field1699;

    static {
        field1641 = new class121();
        field1639 = new byte[1];
        field1640 = new class121();
        field1675 = new byte[1];
        field1677 = new boolean[4700];
        field1678 = new boolean[4700];
        field1643 = new int[4700];
        field1680 = new int[4700];
        field1681 = new int[4700];
        field1682 = new int[4700];
        field1683 = new int[4700];
        field1672 = new int[4700];
        field1686 = new int[1600];
        field1689 = new int[1600][512];
        field1688 = new int[12];
        field1670 = new int[12][2000];
        field1690 = new int[2000];
        field1652 = new int[2000];
        field1692 = new int[12];
        field1693 = new int[10];
        field1698 = new int[10];
        field1695 = new int[10];
        field1699 = true;
        field1702 = class124.field1747;
        field1703 = class124.field1754;
        field1704 = class124.field1749;
        field1705 = class124.field1744;
    }

    public boolean field1664;
    int field1649;
    int field1673;
    int field1665;
    int[][] field1662;
    int field1663;
    int[] field1647;
    int field1667;
    int field1646;
    int[] field1694;
    int[] field1656;
    int[] field1648;
    int[][] field1679;
    byte field1657;
    int[] field1696;
    int field1666;
    int field1684;
    int[] field1654;
    byte[] field1653;
    byte[] field1642;
    int[] field1668;
    int[] field1650;
    int field1676;
    int[] field1706;
    int field1671;
    int field1674;
    int field1669;
    int field1691;
    short[] field1644;
    int field1658;
    byte[] field1655;
    int[] field1659;
    int[] field1660;
    int[] field1661;

    class121() {
        this.field1663 = 0;
        this.field1646 = 0;
        this.field1657 = 0;
        this.field1684 = 0;
        this.field1664 = false;
        this.field1673 = -1;
        this.field1674 = -1;
        this.field1691 = -1;
    }

    public class121(class121[] var1, int var2) {
        this.field1663 = 0;
        this.field1646 = 0;
        this.field1657 = 0;
        this.field1684 = 0;
        this.field1664 = false;
        this.field1673 = -1;
        this.field1674 = -1;
        this.field1691 = -1;
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1663 = 0;
        this.field1646 = 0;
        this.field1684 = 0;
        this.field1657 = -1;

        int var7;
        class121 var8;
        for (var7 = 0; var7 < var2; ++var7) {
            var8 = var1[var7];
            if (var8 != null) {
                this.field1663 += var8.field1663;
                this.field1646 += var8.field1646;
                this.field1684 += var8.field1684;
                if (var8.field1653 != null) {
                    var3 = true;
                } else {
                    if (this.field1657 == -1) {
                        this.field1657 = var8.field1657;
                    }

                    if (this.field1657 != var8.field1657) {
                        var3 = true;
                    }
                }

                var4 |= var8.field1642 != null;
                var5 |= var8.field1644 != null;
                var6 |= var8.field1655 != null;
            }
        }

        this.field1694 = new int[this.field1663];
        this.field1654 = new int[this.field1663];
        this.field1656 = new int[this.field1663];
        this.field1647 = new int[this.field1646];
        this.field1648 = new int[this.field1646];
        this.field1696 = new int[this.field1646];
        this.field1650 = new int[this.field1646];
        this.field1706 = new int[this.field1646];
        this.field1668 = new int[this.field1646];
        if (var3) {
            this.field1653 = new byte[this.field1646];
        }

        if (var4) {
            this.field1642 = new byte[this.field1646];
        }

        if (var5) {
            this.field1644 = new short[this.field1646];
        }

        if (var6) {
            this.field1655 = new byte[this.field1646];
        }

        if (this.field1684 > 0) {
            this.field1659 = new int[this.field1684];
            this.field1660 = new int[this.field1684];
            this.field1661 = new int[this.field1684];
        }

        this.field1663 = 0;
        this.field1646 = 0;
        this.field1684 = 0;

        for (var7 = 0; var7 < var2; ++var7) {
            var8 = var1[var7];
            if (var8 != null) {
                int var9;
                for (var9 = 0; var9 < var8.field1646; ++var9) {
                    this.field1647[this.field1646] = this.field1663 + var8.field1647[var9];
                    this.field1648[this.field1646] = this.field1663 + var8.field1648[var9];
                    this.field1696[this.field1646] = this.field1663 + var8.field1696[var9];
                    this.field1650[this.field1646] = var8.field1650[var9];
                    this.field1706[this.field1646] = var8.field1706[var9];
                    this.field1668[this.field1646] = var8.field1668[var9];
                    if (var3) {
                        if (var8.field1653 != null) {
                            this.field1653[this.field1646] = var8.field1653[var9];
                        } else {
                            this.field1653[this.field1646] = var8.field1657;
                        }
                    }

                    if (var4 && var8.field1642 != null) {
                        this.field1642[this.field1646] = var8.field1642[var9];
                    }

                    if (var5) {
                        if (var8.field1644 != null) {
                            this.field1644[this.field1646] = var8.field1644[var9];
                        } else {
                            this.field1644[this.field1646] = -1;
                        }
                    }

                    if (var6) {
                        if (var8.field1655 != null && var8.field1655[var9] != -1) {
                            this.field1655[this.field1646] = (byte) (this.field1684
                                + var8.field1655[var9]);
                        } else {
                            this.field1655[this.field1646] = -1;
                        }
                    }

                    ++this.field1646;
                }

                for (var9 = 0; var9 < var8.field1684; ++var9) {
                    this.field1659[this.field1684] = this.field1663 + var8.field1659[var9];
                    this.field1660[this.field1684] = this.field1663 + var8.field1660[var9];
                    this.field1661[this.field1684] = this.field1663 + var8.field1661[var9];
                    ++this.field1684;
                }

                for (var9 = 0; var9 < var8.field1663; ++var9) {
                    this.field1694[this.field1663] = var8.field1694[var9];
                    this.field1654[this.field1663] = var8.field1654[var9];
                    this.field1656[this.field1663] = var8.field1656[var9];
                    ++this.field1663;
                }
            }
        }

    }

    public void method2873() {
        if (this.field1665 != 1) {
            this.field1665 = 1;
            super.field1840 = 0;
            this.field1666 = 0;
            this.field1667 = 0;

            for (int var1 = 0; var1 < this.field1663; ++var1) {
                int var2 = this.field1694[var1];
                int var3 = this.field1654[var1];
                int var4 = this.field1656[var1];
                if (-var3 > super.field1840) {
                    super.field1840 = -var3;
                }

                if (var3 > this.field1666) {
                    this.field1666 = var3;
                }

                int var5 = var2 * var2 + var4 * var4;
                if (var5 > this.field1667) {
                    this.field1667 = var5;
                }
            }

            this.field1667 = (int) (Math.sqrt((double) this.field1667) + 0.99D);
            this.field1669 = (int) (Math.sqrt(
                (double) (this.field1667 * this.field1667 + super.field1840 * super.field1840))
                + 0.99D);
            this.field1649 = this.field1669 + (int) (Math.sqrt(
                (double) (this.field1667 * this.field1667 + this.field1666 * this.field1666))
                + 0.99D);
        }
    }

    public void method2870(class132 var1, int var2) {
        if (this.field1662 != null) {
            if (var2 != -1) {
                class119 var3 = var1.field1859[var2];
                class126 var4 = var3.field1608;
                field1645 = 0;
                field1697 = 0;
                field1687 = 0;

                for (int var5 = 0; var5 < var3.field1609; ++var5) {
                    int var6 = var3.field1610[var5];
                    this.method2879(var4.field1764[var6], var4.field1765[var6],
                                    var3.field1613[var5], var3.field1604[var5],
                                    var3.field1611[var5]);
                }

                this.method2876();
            }
        }
    }

    void method2876() {
        this.field1665 = 0;
        this.field1673 = -1;
    }

    final void method2891(int var1) {
        int var2 = class124.field1739;
        int var3 = class124.field1730;
        int var4 = 0;
        int var5 = this.field1647[var1];
        int var6 = this.field1648[var1];
        int var7 = this.field1696[var1];
        int var8 = field1672[var5];
        int var9 = field1672[var6];
        int var10 = field1672[var7];
        if (this.field1642 == null) {
            class124.field1732 = 0;
        } else {
            class124.field1732 = this.field1642[var1] & 255;
        }

        int var11;
        int var12;
        int var13;
        int var14;
        if (var8 >= 50) {
            field1693[var4] = field1643[var5];
            field1698[var4] = field1680[var5];
            field1695[var4++] = this.field1650[var1];
        } else {
            var11 = field1682[var5];
            var12 = field1683[var5];
            var13 = this.field1650[var1];
            if (var10 >= 50) {
                var14 = field1705[var10 - var8] * (50 - var8);
                field1693[var4] = var2
                    + class124.field1741 * (var11 + ((field1682[var7] - var11) * var14 >> 16)) / 50;
                field1698[var4] = var3
                    + class124.field1741 * (var12 + ((field1683[var7] - var12) * var14 >> 16)) / 50;
                field1695[var4++] = var13 + ((this.field1668[var1] - var13) * var14 >> 16);
            }

            if (var9 >= 50) {
                var14 = field1705[var9 - var8] * (50 - var8);
                field1693[var4] = var2
                    + class124.field1741 * (var11 + ((field1682[var6] - var11) * var14 >> 16)) / 50;
                field1698[var4] = var3
                    + class124.field1741 * (var12 + ((field1683[var6] - var12) * var14 >> 16)) / 50;
                field1695[var4++] = var13 + ((this.field1706[var1] - var13) * var14 >> 16);
            }
        }

        if (var9 >= 50) {
            field1693[var4] = field1643[var6];
            field1698[var4] = field1680[var6];
            field1695[var4++] = this.field1706[var1];
        } else {
            var11 = field1682[var6];
            var12 = field1683[var6];
            var13 = this.field1706[var1];
            if (var8 >= 50) {
                var14 = field1705[var8 - var9] * (50 - var9);
                field1693[var4] = var2
                    + class124.field1741 * (var11 + ((field1682[var5] - var11) * var14 >> 16)) / 50;
                field1698[var4] = var3
                    + class124.field1741 * (var12 + ((field1683[var5] - var12) * var14 >> 16)) / 50;
                field1695[var4++] = var13 + ((this.field1650[var1] - var13) * var14 >> 16);
            }

            if (var10 >= 50) {
                var14 = field1705[var10 - var9] * (50 - var9);
                field1693[var4] = var2
                    + class124.field1741 * (var11 + ((field1682[var7] - var11) * var14 >> 16)) / 50;
                field1698[var4] = var3
                    + class124.field1741 * (var12 + ((field1683[var7] - var12) * var14 >> 16)) / 50;
                field1695[var4++] = var13 + ((this.field1668[var1] - var13) * var14 >> 16);
            }
        }

        if (var10 >= 50) {
            field1693[var4] = field1643[var7];
            field1698[var4] = field1680[var7];
            field1695[var4++] = this.field1668[var1];
        } else {
            var11 = field1682[var7];
            var12 = field1683[var7];
            var13 = this.field1668[var1];
            if (var9 >= 50) {
                var14 = field1705[var9 - var10] * (50 - var10);
                field1693[var4] = var2
                    + class124.field1741 * (var11 + ((field1682[var6] - var11) * var14 >> 16)) / 50;
                field1698[var4] = var3
                    + class124.field1741 * (var12 + ((field1683[var6] - var12) * var14 >> 16)) / 50;
                field1695[var4++] = var13 + ((this.field1706[var1] - var13) * var14 >> 16);
            }

            if (var8 >= 50) {
                var14 = field1705[var8 - var10] * (50 - var10);
                field1693[var4] = var2
                    + class124.field1741 * (var11 + ((field1682[var5] - var11) * var14 >> 16)) / 50;
                field1698[var4] = var3
                    + class124.field1741 * (var12 + ((field1683[var5] - var12) * var14 >> 16)) / 50;
                field1695[var4++] = var13 + ((this.field1650[var1] - var13) * var14 >> 16);
            }
        }

        var11 = field1693[0];
        var12 = field1693[1];
        var13 = field1693[2];
        var14 = field1698[0];
        int var15 = field1698[1];
        int var16 = field1698[2];
        class124.field1753 = false;
        int var17;
        int var18;
        int var19;
        int var20;
        if (var4 == 3) {
            if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > class124.field1742
                || var12 > class124.field1742 || var13 > class124.field1742) {
                class124.field1753 = true;
            }

            if (this.field1644 != null && this.field1644[var1] != -1) {
                if (this.field1655 != null && this.field1655[var1] != -1) {
                    var20 = this.field1655[var1] & 255;
                    var17 = this.field1659[var20];
                    var18 = this.field1660[var20];
                    var19 = this.field1661[var20];
                } else {
                    var17 = var5;
                    var18 = var6;
                    var19 = var7;
                }

                if (this.field1668[var1] == -1) {
                    class124
                        .method2989(var14, var15, var16, var11, var12, var13, this.field1650[var1],
                                    this.field1650[var1], this.field1650[var1], field1682[var17],
                                    field1682[var18], field1682[var19], field1683[var17],
                                    field1683[var18], field1683[var19], field1672[var17],
                                    field1672[var18], field1672[var19], this.field1644[var1]);
                } else {
                    class124.method2989(var14, var15, var16, var11, var12, var13, field1695[0],
                                        field1695[1], field1695[2], field1682[var17],
                                        field1682[var18], field1682[var19], field1683[var17],
                                        field1683[var18], field1683[var19], field1672[var17],
                                        field1672[var18], field1672[var19], this.field1644[var1]);
                }
            } else if (this.field1668[var1] == -1) {
                class124.method2987(var14, var15, var16, var11, var12, var13,
                                    field1704[this.field1650[var1]]);
            } else {
                class124.method2985(var14, var15, var16, var11, var12, var13, field1695[0],
                                    field1695[1], field1695[2]);
            }
        }

        if (var4 == 4) {
            if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > class124.field1742
                || var12 > class124.field1742 || var13 > class124.field1742 || field1693[3] < 0
                || field1693[3] > class124.field1742) {
                class124.field1753 = true;
            }

            if (this.field1644 != null && this.field1644[var1] != -1) {
                if (this.field1655 != null && this.field1655[var1] != -1) {
                    var20 = this.field1655[var1] & 255;
                    var17 = this.field1659[var20];
                    var18 = this.field1660[var20];
                    var19 = this.field1661[var20];
                } else {
                    var17 = var5;
                    var18 = var6;
                    var19 = var7;
                }

                short var21 = this.field1644[var1];
                if (this.field1668[var1] == -1) {
                    class124
                        .method2989(var14, var15, var16, var11, var12, var13, this.field1650[var1],
                                    this.field1650[var1], this.field1650[var1], field1682[var17],
                                    field1682[var18], field1682[var19], field1683[var17],
                                    field1683[var18], field1683[var19], field1672[var17],
                                    field1672[var18], field1672[var19], var21);
                    class124.method2989(var14, var16, field1698[3], var11, var13, field1693[3],
                                        this.field1650[var1], this.field1650[var1],
                                        this.field1650[var1], field1682[var17], field1682[var18],
                                        field1682[var19], field1683[var17], field1683[var18],
                                        field1683[var19], field1672[var17], field1672[var18],
                                        field1672[var19], var21);
                } else {
                    class124.method2989(var14, var15, var16, var11, var12, var13, field1695[0],
                                        field1695[1], field1695[2], field1682[var17],
                                        field1682[var18], field1682[var19], field1683[var17],
                                        field1683[var18], field1683[var19], field1672[var17],
                                        field1672[var18], field1672[var19], var21);
                    class124.method2989(var14, var16, field1698[3], var11, var13, field1693[3],
                                        field1695[0], field1695[2], field1695[3], field1682[var17],
                                        field1682[var18], field1682[var19], field1683[var17],
                                        field1683[var18], field1683[var19], field1672[var17],
                                        field1672[var18], field1672[var19], var21);
                }
            } else if (this.field1668[var1] == -1) {
                var17 = field1704[this.field1650[var1]];
                class124.method2987(var14, var15, var16, var11, var12, var13, var17);
                class124.method2987(var14, var16, field1698[3], var11, var13, field1693[3], var17);
            } else {
                class124.method2985(var14, var15, var16, var11, var12, var13, field1695[0],
                                    field1695[1], field1695[2]);
                class124.method2985(var14, var16, field1698[3], var11, var13, field1693[3],
                                    field1695[0], field1695[2], field1695[3]);
            }
        }

    }

    class121 method2871(boolean var1, class121 var2, byte[] var3) {
        var2.field1663 = this.field1663;
        var2.field1646 = this.field1646;
        var2.field1684 = this.field1684;
        if (var2.field1694 == null || var2.field1694.length < this.field1663) {
            var2.field1694 = new int[this.field1663 + 100];
            var2.field1654 = new int[this.field1663 + 100];
            var2.field1656 = new int[this.field1663 + 100];
        }

        int var4;
        for (var4 = 0; var4 < this.field1663; ++var4) {
            var2.field1694[var4] = this.field1694[var4];
            var2.field1654[var4] = this.field1654[var4];
            var2.field1656[var4] = this.field1656[var4];
        }

        if (var1) {
            var2.field1642 = this.field1642;
        } else {
            var2.field1642 = var3;
            if (this.field1642 == null) {
                for (var4 = 0; var4 < this.field1646; ++var4) {
                    var2.field1642[var4] = 0;
                }
            } else {
                for (var4 = 0; var4 < this.field1646; ++var4) {
                    var2.field1642[var4] = this.field1642[var4];
                }
            }
        }

        var2.field1647 = this.field1647;
        var2.field1648 = this.field1648;
        var2.field1696 = this.field1696;
        var2.field1650 = this.field1650;
        var2.field1706 = this.field1706;
        var2.field1668 = this.field1668;
        var2.field1653 = this.field1653;
        var2.field1655 = this.field1655;
        var2.field1644 = this.field1644;
        var2.field1657 = this.field1657;
        var2.field1659 = this.field1659;
        var2.field1660 = this.field1660;
        var2.field1661 = this.field1661;
        var2.field1662 = this.field1662;
        var2.field1679 = this.field1679;
        var2.field1664 = this.field1664;
        var2.method2876();
        return var2;
    }

    void method2872(int var1) {
        if (this.field1673 == -1) {
            int var2 = 0;
            int var3 = 0;
            int var4 = 0;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = field1703[var1];
            int var9 = field1702[var1];

            for (int var10 = 0; var10 < this.field1663; ++var10) {
                int var11 = class124
                    .method2978(this.field1694[var10], this.field1656[var10], var8, var9);
                int var12 = this.field1654[var10];
                int var13 = class124
                    .method2995(this.field1694[var10], this.field1656[var10], var8, var9);
                if (var11 < var2) {
                    var2 = var11;
                }

                if (var11 > var5) {
                    var5 = var11;
                }

                if (var12 < var3) {
                    var3 = var12;
                }

                if (var12 > var6) {
                    var6 = var12;
                }

                if (var13 < var4) {
                    var4 = var13;
                }

                if (var13 > var7) {
                    var7 = var13;
                }
            }

            this.field1676 = (var5 + var2) / 2;
            this.field1671 = (var6 + var3) / 2;
            this.field1658 = (var7 + var4) / 2;
            this.field1673 = (var5 - var2 + 1) / 2;
            this.field1674 = (var6 - var3 + 1) / 2;
            this.field1691 = (var7 - var4 + 1) / 2;
            if (this.field1673 < 32) {
                this.field1673 = 32;
            }

            if (this.field1691 < 32) {
                this.field1691 = 32;
            }

            if (this.field1664) {
                this.field1673 += 8;
                this.field1691 += 8;
            }

        }
    }

    public class121 method2869(boolean var1) {
        if (!var1 && field1639.length < this.field1646) {
            field1639 = new byte[this.field1646 + 100];
        }

        return this.method2871(var1, field1641, field1639);
    }

    void method2874() {
        if (this.field1665 != 2) {
            this.field1665 = 2;
            this.field1667 = 0;

            for (int var1 = 0; var1 < this.field1663; ++var1) {
                int var2 = this.field1694[var1];
                int var3 = this.field1654[var1];
                int var4 = this.field1656[var1];
                int var5 = var2 * var2 + var4 * var4 + var3 * var3;
                if (var5 > this.field1667) {
                    this.field1667 = var5;
                }
            }

            this.field1667 = (int) (Math.sqrt((double) this.field1667) + 0.99D);
            this.field1669 = this.field1667;
            this.field1649 = this.field1667 + this.field1667;
        }
    }

    public class121 method2881(boolean var1) {
        if (!var1 && field1675.length < this.field1646) {
            field1675 = new byte[this.field1646 + 100];
        }

        return this.method2871(var1, field1640, field1675);
    }

    public void method2938(int var1) {
        int var2 = field1702[var1];
        int var3 = field1703[var1];

        for (int var4 = 0; var4 < this.field1663; ++var4) {
            int var5 = var3 * this.field1654[var4] - var2 * this.field1656[var4] >> 16;
            this.field1656[var4] = var2 * this.field1654[var4] + var3 * this.field1656[var4] >> 16;
            this.field1654[var4] = var5;
        }

        this.method2876();
    }

    public class121 method2868(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
        this.method2873();
        int var7 = var2 - this.field1667;
        int var8 = var2 + this.field1667;
        int var9 = var4 - this.field1667;
        int var10 = var4 + this.field1667;
        if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0
            && var10 + 128 >> 7 < var1[0].length) {
            var7 >>= 7;
            var8 = var8 + 127 >> 7;
            var9 >>= 7;
            var10 = var10 + 127 >> 7;
            if (var3 == var1[var7][var9] && var3 == var1[var8][var9] && var3 == var1[var7][var10]
                && var3 == var1[var8][var10]) {
                return this;
            } else {
                class121 var11;
                if (var5) {
                    var11 = new class121();
                    var11.field1663 = this.field1663;
                    var11.field1646 = this.field1646;
                    var11.field1684 = this.field1684;
                    var11.field1694 = this.field1694;
                    var11.field1656 = this.field1656;
                    var11.field1647 = this.field1647;
                    var11.field1648 = this.field1648;
                    var11.field1696 = this.field1696;
                    var11.field1650 = this.field1650;
                    var11.field1706 = this.field1706;
                    var11.field1668 = this.field1668;
                    var11.field1653 = this.field1653;
                    var11.field1642 = this.field1642;
                    var11.field1655 = this.field1655;
                    var11.field1644 = this.field1644;
                    var11.field1657 = this.field1657;
                    var11.field1659 = this.field1659;
                    var11.field1660 = this.field1660;
                    var11.field1661 = this.field1661;
                    var11.field1662 = this.field1662;
                    var11.field1679 = this.field1679;
                    var11.field1664 = this.field1664;
                    var11.field1654 = new int[var11.field1663];
                } else {
                    var11 = this;
                }

                int var12;
                int var13;
                int var14;
                int var15;
                int var16;
                int var17;
                int var18;
                int var19;
                int var20;
                int var21;
                if (var6 == 0) {
                    for (var12 = 0; var12 < var11.field1663; ++var12) {
                        var13 = var2 + this.field1694[var12];
                        var14 = var4 + this.field1656[var12];
                        var15 = var13 & 127;
                        var16 = var14 & 127;
                        var17 = var13 >> 7;
                        var18 = var14 >> 7;
                        var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15
                            >> 7;
                        var20 =
                            var1[var17][var18 + 1] * (128 - var15) + var15 * var1[var17 + 1][var18
                                + 1] >> 7;
                        var21 = var19 * (128 - var16) + var20 * var16 >> 7;
                        var11.field1654[var12] = var21 + this.field1654[var12] - var3;
                    }
                } else {
                    for (var12 = 0; var12 < var11.field1663; ++var12) {
                        var13 = (-this.field1654[var12] << 16) / super.field1840;
                        if (var13 < var6) {
                            var14 = var2 + this.field1694[var12];
                            var15 = var4 + this.field1656[var12];
                            var16 = var14 & 127;
                            var17 = var15 & 127;
                            var18 = var14 >> 7;
                            var19 = var15 >> 7;
                            var20 =
                                var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16
                                    >> 7;
                            var21 =
                                var1[var18][var19 + 1] * (128 - var16) + var16 * var1[var18 + 1][
                                    var19 + 1] >> 7;
                            int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
                            var11.field1654[var12] =
                                (var6 - var13) * (var22 - var3) / var6 + this.field1654[var12];
                        }
                    }
                }

                var11.method2876();
                return var11;
            }
        } else {
            return this;
        }
    }

    void vmethod3239(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8,
                     long var9) {
        field1686[0] = -1;
        if (this.field1665 != 1) {
            this.method2873();
        }

        this.method2872(var1);
        int var11 = var5 * var8 - var4 * var6 >> 16;
        int var12 = var2 * var7 + var3 * var11 >> 16;
        int var13 = var3 * this.field1667 >> 16;
        int var14 = var12 + var13;
        if (var14 > 50 && var12 < 3500) {
            int var15 = var8 * var4 + var5 * var6 >> 16;
            int var16 = (var15 - this.field1667) * class124.field1741;
            if (var16 / var14 < class124.field1745) {
                int var17 = (var15 + this.field1667) * class124.field1741;
                if (var17 / var14 > class124.field1728) {
                    int var18 = var3 * var7 - var11 * var2 >> 16;
                    int var19 = var2 * this.field1667 >> 16;
                    int var20 = (var18 + var19) * class124.field1741;
                    if (var20 / var14 > class124.field1746) {
                        int var21 = (var3 * super.field1840 >> 16) + var19;
                        int var22 = (var18 - var21) * class124.field1741;
                        if (var22 / var14 < class124.field1740) {
                            int var23 = var13 + (var2 * super.field1840 >> 16);
                            boolean var24 = false;
                            boolean var25 = false;
                            if (var12 - var23 <= 50) {
                                var25 = true;
                            }

                            boolean var26 = var25 || this.field1684 > 0;
                            int var27 = class122.field1712;
                            int var29 = class64.method1678(701091352);
                            boolean var30 = class122.field1711;
                            boolean var32 = class19.method244(var9);
                            boolean var33 = false;
                            int var35;
                            int var36;
                            int var37;
                            if (var32 && var30) {
                                boolean var34 = false;
                                if (field1699) {
                                    var34 = class51.method1061(this, var6, var7, var8, (byte) 5);
                                } else {
                                    var35 = var12 - var13;
                                    if (var35 <= 50) {
                                        var35 = 50;
                                    }

                                    if (var15 > 0) {
                                        var16 /= var14;
                                        var17 /= var35;
                                    } else {
                                        var17 /= var14;
                                        var16 /= var35;
                                    }

                                    if (var18 > 0) {
                                        var22 /= var14;
                                        var20 /= var35;
                                    } else {
                                        var20 /= var14;
                                        var22 /= var35;
                                    }

                                    var36 = var27 - class124.field1739;
                                    var37 = var29 - class124.field1730;
                                    if (var36 > var16 && var36 < var17 && var37 > var22
                                        && var37 < var20) {
                                        var34 = true;
                                    }
                                }

                                if (var34) {
                                    if (this.field1664) {
                                        class122.field1714[++class122.field1713 - 1] = var9;
                                    } else {
                                        var33 = true;
                                    }
                                }
                            }

                            int var47 = class124.field1739;
                            var35 = class124.field1730;
                            var36 = 0;
                            var37 = 0;
                            if (var1 != 0) {
                                var36 = field1702[var1];
                                var37 = field1703[var1];
                            }

                            for (int var38 = 0; var38 < this.field1663; ++var38) {
                                int var39 = this.field1694[var38];
                                int var40 = this.field1654[var38];
                                int var41 = this.field1656[var38];
                                int var42;
                                if (var1 != 0) {
                                    var42 = var41 * var36 + var39 * var37 >> 16;
                                    var41 = var41 * var37 - var39 * var36 >> 16;
                                    var39 = var42;
                                }

                                var39 += var6;
                                var40 += var7;
                                var41 += var8;
                                var42 = var41 * var4 + var5 * var39 >> 16;
                                var41 = var5 * var41 - var39 * var4 >> 16;
                                var39 = var42;
                                var42 = var3 * var40 - var41 * var2 >> 16;
                                var41 = var40 * var2 + var3 * var41 >> 16;
                                field1681[var38] = var41 - var12;
                                if (var41 >= 50) {
                                    field1643[var38] = var39 * class124.field1741 / var41 + var47;
                                    field1680[var38] = var42 * class124.field1741 / var41 + var35;
                                } else {
                                    field1643[var38] = -5000;
                                    var24 = true;
                                }

                                if (var26) {
                                    field1682[var38] = var39;
                                    field1683[var38] = var42;
                                    field1672[var38] = var41;
                                }
                            }

                            try {
                                this.method2889(var24, var33, this.field1664, var9);
                            } catch (Exception var46) {
                                ;
                            }

                        }
                    }
                }
            }
        }
    }

    public void method2896() {
        for (int var1 = 0; var1 < this.field1663; ++var1) {
            int var2 = this.field1656[var1];
            this.field1656[var1] = this.field1694[var1];
            this.field1694[var1] = -var2;
        }

        this.method2876();
    }

    public void method2878(int var1, int var2, int var3) {
        for (int var4 = 0; var4 < this.field1663; ++var4) {
            this.field1694[var4] = this.field1694[var4] * var1 / 128;
            this.field1654[var4] = var2 * this.field1654[var4] / 128;
            this.field1656[var4] = var3 * this.field1656[var4] / 128;
        }

        this.method2876();
    }

    public void method2884() {
        for (int var1 = 0; var1 < this.field1663; ++var1) {
            this.field1694[var1] = -this.field1694[var1];
            this.field1656[var1] = -this.field1656[var1];
        }

        this.method2876();
    }

    public void method2880() {
        for (int var1 = 0; var1 < this.field1663; ++var1) {
            int var2 = this.field1694[var1];
            this.field1694[var1] = this.field1656[var1];
            this.field1656[var1] = -var2;
        }

        this.method2876();
    }

    final void method2890(int var1) {
        if (field1678[var1]) {
            this.method2891(var1);
        } else {
            int var2 = this.field1647[var1];
            int var3 = this.field1648[var1];
            int var4 = this.field1696[var1];
            class124.field1753 = field1677[var1];
            if (this.field1642 == null) {
                class124.field1732 = 0;
            } else {
                class124.field1732 = this.field1642[var1] & 255;
            }

            if (this.field1644 != null && this.field1644[var1] != -1) {
                int var5;
                int var6;
                int var7;
                if (this.field1655 != null && this.field1655[var1] != -1) {
                    int var8 = this.field1655[var1] & 255;
                    var5 = this.field1659[var8];
                    var6 = this.field1660[var8];
                    var7 = this.field1661[var8];
                } else {
                    var5 = var2;
                    var6 = var3;
                    var7 = var4;
                }

                if (this.field1668[var1] == -1) {
                    class124.method2989(field1680[var2], field1680[var3], field1680[var4],
                                        field1643[var2], field1643[var3], field1643[var4],
                                        this.field1650[var1], this.field1650[var1],
                                        this.field1650[var1], field1682[var5], field1682[var6],
                                        field1682[var7], field1683[var5], field1683[var6],
                                        field1683[var7], field1672[var5], field1672[var6],
                                        field1672[var7], this.field1644[var1]);
                } else {
                    class124.method2989(field1680[var2], field1680[var3], field1680[var4],
                                        field1643[var2], field1643[var3], field1643[var4],
                                        this.field1650[var1], this.field1706[var1],
                                        this.field1668[var1], field1682[var5], field1682[var6],
                                        field1682[var7], field1683[var5], field1683[var6],
                                        field1683[var7], field1672[var5], field1672[var6],
                                        field1672[var7], this.field1644[var1]);
                }
            } else if (this.field1668[var1] == -1) {
                class124
                    .method2987(field1680[var2], field1680[var3], field1680[var4], field1643[var2],
                                field1643[var3], field1643[var4], field1704[this.field1650[var1]]);
            } else {
                class124
                    .method2985(field1680[var2], field1680[var3], field1680[var4], field1643[var2],
                                field1643[var3], field1643[var4], this.field1650[var1],
                                this.field1706[var1], this.field1668[var1]);
            }

        }
    }

    public void method2886(class132 var1, int var2, class132 var3, int var4, int[] var5) {
        if (var2 != -1) {
            if (var5 != null && var4 != -1) {
                class119 var6 = var1.field1859[var2];
                class119 var7 = var3.field1859[var4];
                class126 var8 = var6.field1608;
                field1645 = 0;
                field1697 = 0;
                field1687 = 0;
                byte var9 = 0;
                int var13 = var9 + 1;
                int var10 = var5[var9];

                int var11;
                int var12;
                for (var11 = 0; var11 < var6.field1609; ++var11) {
                    for (var12 = var6.field1610[var11]; var12 > var10; var10 = var5[var13++]) {
                        ;
                    }

                    if (var12 != var10 || var8.field1764[var12] == 0) {
                        this.method2879(var8.field1764[var12], var8.field1765[var12],
                                        var6.field1613[var11], var6.field1604[var11],
                                        var6.field1611[var11]);
                    }
                }

                field1645 = 0;
                field1697 = 0;
                field1687 = 0;
                var9 = 0;
                var13 = var9 + 1;
                var10 = var5[var9];

                for (var11 = 0; var11 < var7.field1609; ++var11) {
                    for (var12 = var7.field1610[var11]; var12 > var10; var10 = var5[var13++]) {
                        ;
                    }

                    if (var12 == var10 || var8.field1764[var12] == 0) {
                        this.method2879(var8.field1764[var12], var8.field1765[var12],
                                        var7.field1613[var11], var7.field1604[var11],
                                        var7.field1611[var11]);
                    }
                }

                this.method2876();
            } else {
                this.method2870(var1, var2);
            }
        }
    }

    void method2879(int var1, int[] var2, int var3, int var4, int var5) {
        int var6 = var2.length;
        int var7;
        int var8;
        int var11;
        int var12;
        if (var1 == 0) {
            var7 = 0;
            field1645 = 0;
            field1697 = 0;
            field1687 = 0;

            for (var8 = 0; var8 < var6; ++var8) {
                int var9 = var2[var8];
                if (var9 < this.field1662.length) {
                    int[] var10 = this.field1662[var9];

                    for (var11 = 0; var11 < var10.length; ++var11) {
                        var12 = var10[var11];
                        field1645 += this.field1694[var12];
                        field1697 += this.field1654[var12];
                        field1687 += this.field1656[var12];
                        ++var7;
                    }
                }
            }

            if (var7 > 0) {
                field1645 = var3 + field1645 / var7;
                field1697 = var4 + field1697 / var7;
                field1687 = var5 + field1687 / var7;
            } else {
                field1645 = var3;
                field1697 = var4;
                field1687 = var5;
            }

        } else {
            int[] var18;
            int var19;
            if (var1 == 1) {
                for (var7 = 0; var7 < var6; ++var7) {
                    var8 = var2[var7];
                    if (var8 < this.field1662.length) {
                        var18 = this.field1662[var8];

                        for (var19 = 0; var19 < var18.length; ++var19) {
                            var11 = var18[var19];
                            this.field1694[var11] += var3;
                            this.field1654[var11] += var4;
                            this.field1656[var11] += var5;
                        }
                    }
                }

            } else if (var1 == 2) {
                for (var7 = 0; var7 < var6; ++var7) {
                    var8 = var2[var7];
                    if (var8 < this.field1662.length) {
                        var18 = this.field1662[var8];

                        for (var19 = 0; var19 < var18.length; ++var19) {
                            var11 = var18[var19];
                            this.field1694[var11] -= field1645;
                            this.field1654[var11] -= field1697;
                            this.field1656[var11] -= field1687;
                            var12 = (var3 & 255) * 8;
                            int var13 = (var4 & 255) * 8;
                            int var14 = (var5 & 255) * 8;
                            int var15;
                            int var16;
                            int var17;
                            if (var14 != 0) {
                                var15 = field1702[var14];
                                var16 = field1703[var14];
                                var17 =
                                    var15 * this.field1654[var11] + var16 * this.field1694[var11]
                                        >> 16;
                                this.field1654[var11] =
                                    var16 * this.field1654[var11] - var15 * this.field1694[var11]
                                        >> 16;
                                this.field1694[var11] = var17;
                            }

                            if (var12 != 0) {
                                var15 = field1702[var12];
                                var16 = field1703[var12];
                                var17 =
                                    var16 * this.field1654[var11] - var15 * this.field1656[var11]
                                        >> 16;
                                this.field1656[var11] =
                                    var15 * this.field1654[var11] + var16 * this.field1656[var11]
                                        >> 16;
                                this.field1654[var11] = var17;
                            }

                            if (var13 != 0) {
                                var15 = field1702[var13];
                                var16 = field1703[var13];
                                var17 =
                                    var15 * this.field1656[var11] + var16 * this.field1694[var11]
                                        >> 16;
                                this.field1656[var11] =
                                    var16 * this.field1656[var11] - var15 * this.field1694[var11]
                                        >> 16;
                                this.field1694[var11] = var17;
                            }

                            this.field1694[var11] += field1645;
                            this.field1654[var11] += field1697;
                            this.field1656[var11] += field1687;
                        }
                    }
                }

            } else if (var1 == 3) {
                for (var7 = 0; var7 < var6; ++var7) {
                    var8 = var2[var7];
                    if (var8 < this.field1662.length) {
                        var18 = this.field1662[var8];

                        for (var19 = 0; var19 < var18.length; ++var19) {
                            var11 = var18[var19];
                            this.field1694[var11] -= field1645;
                            this.field1654[var11] -= field1697;
                            this.field1656[var11] -= field1687;
                            this.field1694[var11] = var3 * this.field1694[var11] / 128;
                            this.field1654[var11] = var4 * this.field1654[var11] / 128;
                            this.field1656[var11] = var5 * this.field1656[var11] / 128;
                            this.field1694[var11] += field1645;
                            this.field1654[var11] += field1697;
                            this.field1656[var11] += field1687;
                        }
                    }
                }

            } else if (var1 == 5) {
                if (this.field1679 != null && this.field1642 != null) {
                    for (var7 = 0; var7 < var6; ++var7) {
                        var8 = var2[var7];
                        if (var8 < this.field1679.length) {
                            var18 = this.field1679[var8];

                            for (var19 = 0; var19 < var18.length; ++var19) {
                                var11 = var18[var19];
                                var12 = (this.field1642[var11] & 255) + var3 * 8;
                                if (var12 < 0) {
                                    var12 = 0;
                                } else if (var12 > 255) {
                                    var12 = 255;
                                }

                                this.field1642[var11] = (byte) var12;
                            }
                        }
                    }
                }

            }
        }
    }

    final void method2889(boolean var1, boolean var2, boolean var3, long var4) {
        if (this.field1649 < 1600) {
            int var6;
            for (var6 = 0; var6 < this.field1649; ++var6) {
                field1686[var6] = 0;
            }

            var6 = var3 ? 20 : 5;

            int var7;
            int var8;
            int var9;
            int var10;
            int var11;
            int var12;
            int var13;
            int var15;
            int var16;
            int var18;
            for (var7 = 0; var7 < this.field1646; ++var7) {
                if (this.field1668[var7] != -2) {
                    var8 = this.field1647[var7];
                    var9 = this.field1648[var7];
                    var10 = this.field1696[var7];
                    var11 = field1643[var8];
                    var12 = field1643[var9];
                    var13 = field1643[var10];
                    int var14;
                    if (!var1 || var11 != -5000 && var12 != -5000 && var13 != -5000) {
                        if (var2 && class5
                            .method66(field1680[var8], field1680[var9], field1680[var10], var11,
                                      var12, var13, var6, 2110516595)) {
                            class122.field1714[++class122.field1713 - 1] = var4;
                            var2 = false;
                        }

                        if ((var11 - var12) * (field1680[var10] - field1680[var9])
                            - (var13 - var12) * (field1680[var8] - field1680[var9]) > 0) {
                            field1678[var7] = false;
                            if (var11 >= 0 && var12 >= 0 && var13 >= 0
                                && var11 <= class124.field1742 && var12 <= class124.field1742
                                && var13 <= class124.field1742) {
                                field1677[var7] = false;
                            } else {
                                field1677[var7] = true;
                            }

                            var14 = (field1681[var8] + field1681[var9] + field1681[var10]) / 3
                                + this.field1669;
                            field1689[var14][field1686[var14]++] = var7;
                        }
                    } else {
                        var14 = field1682[var8];
                        var15 = field1682[var9];
                        var16 = field1682[var10];
                        int var17 = field1683[var8];
                        var18 = field1683[var9];
                        int var19 = field1683[var10];
                        int var20 = field1672[var8];
                        int var21 = field1672[var9];
                        int var22 = field1672[var10];
                        var14 -= var15;
                        var16 -= var15;
                        var17 -= var18;
                        var19 -= var18;
                        var20 -= var21;
                        var22 -= var21;
                        int var23 = var17 * var22 - var20 * var19;
                        int var24 = var20 * var16 - var14 * var22;
                        int var25 = var14 * var19 - var17 * var16;
                        if (var15 * var23 + var18 * var24 + var21 * var25 > 0) {
                            field1678[var7] = true;
                            int var26 = (field1681[var8] + field1681[var9] + field1681[var10]) / 3
                                + this.field1669;
                            field1689[var26][field1686[var26]++] = var7;
                        }
                    }
                }
            }

            int[] var27;
            if (this.field1653 == null) {
                for (var7 = this.field1649 - 1; var7 >= 0; --var7) {
                    var8 = field1686[var7];
                    if (var8 > 0) {
                        var27 = field1689[var7];

                        for (var10 = 0; var10 < var8; ++var10) {
                            this.method2890(var27[var10]);
                        }
                    }
                }

            } else {
                for (var7 = 0; var7 < 12; ++var7) {
                    field1688[var7] = 0;
                    field1692[var7] = 0;
                }

                for (var7 = this.field1649 - 1; var7 >= 0; --var7) {
                    var8 = field1686[var7];
                    if (var8 > 0) {
                        var27 = field1689[var7];

                        for (var10 = 0; var10 < var8; ++var10) {
                            var11 = var27[var10];
                            byte var33 = this.field1653[var11];
                            var13 = field1688[var33]++;
                            field1670[var33][var13] = var11;
                            if (var33 < 10) {
                                field1692[var33] += var7;
                            } else if (var33 == 10) {
                                field1690[var13] = var7;
                            } else {
                                field1652[var13] = var7;
                            }
                        }
                    }
                }

                var7 = 0;
                if (field1688[1] > 0 || field1688[2] > 0) {
                    var7 = (field1692[1] + field1692[2]) / (field1688[1] + field1688[2]);
                }

                var8 = 0;
                if (field1688[3] > 0 || field1688[4] > 0) {
                    var8 = (field1692[3] + field1692[4]) / (field1688[3] + field1688[4]);
                }

                var9 = 0;
                if (field1688[6] > 0 || field1688[8] > 0) {
                    var9 = (field1692[8] + field1692[6]) / (field1688[8] + field1688[6]);
                }

                var11 = 0;
                var12 = field1688[10];
                int[] var30 = field1670[10];
                int[] var31 = field1690;
                if (var11 == var12) {
                    var11 = 0;
                    var12 = field1688[11];
                    var30 = field1670[11];
                    var31 = field1652;
                }

                if (var11 < var12) {
                    var10 = var31[var11];
                } else {
                    var10 = -1000;
                }

                for (var15 = 0; var15 < 10; ++var15) {
                    while (var15 == 0 && var10 > var7) {
                        this.method2890(var30[var11++]);
                        if (var11 == var12 && var30 != field1670[11]) {
                            var11 = 0;
                            var12 = field1688[11];
                            var30 = field1670[11];
                            var31 = field1652;
                        }

                        if (var11 < var12) {
                            var10 = var31[var11];
                        } else {
                            var10 = -1000;
                        }
                    }

                    while (var15 == 3 && var10 > var8) {
                        this.method2890(var30[var11++]);
                        if (var11 == var12 && var30 != field1670[11]) {
                            var11 = 0;
                            var12 = field1688[11];
                            var30 = field1670[11];
                            var31 = field1652;
                        }

                        if (var11 < var12) {
                            var10 = var31[var11];
                        } else {
                            var10 = -1000;
                        }
                    }

                    while (var15 == 5 && var10 > var9) {
                        this.method2890(var30[var11++]);
                        if (var11 == var12 && var30 != field1670[11]) {
                            var11 = 0;
                            var12 = field1688[11];
                            var30 = field1670[11];
                            var31 = field1652;
                        }

                        if (var11 < var12) {
                            var10 = var31[var11];
                        } else {
                            var10 = -1000;
                        }
                    }

                    var16 = field1688[var15];
                    int[] var32 = field1670[var15];

                    for (var18 = 0; var18 < var16; ++var18) {
                        this.method2890(var32[var18]);
                    }
                }

                while (var10 != -1000) {
                    this.method2890(var30[var11++]);
                    if (var11 == var12 && var30 != field1670[11]) {
                        var11 = 0;
                        var30 = field1670[11];
                        var12 = field1688[11];
                        var31 = field1652;
                    }

                    if (var11 < var12) {
                        var10 = var31[var11];
                    } else {
                        var10 = -1000;
                    }
                }

            }
        }
    }

    public void method2885(int var1, int var2, int var3) {
        for (int var4 = 0; var4 < this.field1663; ++var4) {
            this.field1694[var4] += var1;
            this.field1654[var4] += var2;
            this.field1656[var4] += var3;
        }

        this.method2876();
    }

    public final void method2925(int var1, int var2, int var3, int var4, int var5, int var6,
                                 int var7) {
        field1686[0] = -1;
        if (this.field1665 != 2 && this.field1665 != 1) {
            this.method2874();
        }

        int var8 = class124.field1739;
        int var9 = class124.field1730;
        int var10 = field1702[var1];
        int var11 = field1703[var1];
        int var12 = field1702[var2];
        int var13 = field1703[var2];
        int var14 = field1702[var3];
        int var15 = field1703[var3];
        int var16 = field1702[var4];
        int var17 = field1703[var4];
        int var18 = var16 * var6 + var17 * var7 >> 16;

        for (int var19 = 0; var19 < this.field1663; ++var19) {
            int var20 = this.field1694[var19];
            int var21 = this.field1654[var19];
            int var22 = this.field1656[var19];
            int var23;
            if (var3 != 0) {
                var23 = var21 * var14 + var20 * var15 >> 16;
                var21 = var21 * var15 - var20 * var14 >> 16;
                var20 = var23;
            }

            if (var1 != 0) {
                var23 = var21 * var11 - var22 * var10 >> 16;
                var22 = var21 * var10 + var22 * var11 >> 16;
                var21 = var23;
            }

            if (var2 != 0) {
                var23 = var22 * var12 + var20 * var13 >> 16;
                var22 = var22 * var13 - var20 * var12 >> 16;
                var20 = var23;
            }

            var20 += var5;
            var21 += var6;
            var22 += var7;
            var23 = var21 * var17 - var22 * var16 >> 16;
            var22 = var21 * var16 + var22 * var17 >> 16;
            field1681[var19] = var22 - var18;
            field1643[var19] = var20 * class124.field1741 / var22 + var8;
            field1680[var19] = var23 * class124.field1741 / var22 + var9;
            if (this.field1684 > 0) {
                field1682[var19] = var20;
                field1683[var19] = var23;
                field1672[var19] = var22;
            }
        }

        try {
            this.method2889(false, false, false, 0L);
        } catch (Exception var25) {
            ;
        }

    }

    public final void method2887(int var1, int var2, int var3, int var4, int var5, int var6,
                                 int var7, int var8) {
        field1686[0] = -1;
        if (this.field1665 != 2 && this.field1665 != 1) {
            this.method2874();
        }

        int var9 = class124.field1739;
        int var10 = class124.field1730;
        int var11 = field1702[var1];
        int var12 = field1703[var1];
        int var13 = field1702[var2];
        int var14 = field1703[var2];
        int var15 = field1702[var3];
        int var16 = field1703[var3];
        int var17 = field1702[var4];
        int var18 = field1703[var4];
        int var19 = var17 * var6 + var18 * var7 >> 16;

        for (int var20 = 0; var20 < this.field1663; ++var20) {
            int var21 = this.field1694[var20];
            int var22 = this.field1654[var20];
            int var23 = this.field1656[var20];
            int var24;
            if (var3 != 0) {
                var24 = var22 * var15 + var21 * var16 >> 16;
                var22 = var22 * var16 - var21 * var15 >> 16;
                var21 = var24;
            }

            if (var1 != 0) {
                var24 = var22 * var12 - var23 * var11 >> 16;
                var23 = var22 * var11 + var23 * var12 >> 16;
                var22 = var24;
            }

            if (var2 != 0) {
                var24 = var23 * var13 + var21 * var14 >> 16;
                var23 = var23 * var14 - var21 * var13 >> 16;
                var21 = var24;
            }

            var21 += var5;
            var22 += var6;
            var23 += var7;
            var24 = var22 * var18 - var23 * var17 >> 16;
            var23 = var22 * var17 + var23 * var18 >> 16;
            field1681[var20] = var23 - var19;
            field1643[var20] = var9 + var21 * class124.field1741 / var8;
            field1680[var20] = var10 + var24 * class124.field1741 / var8;
            if (this.field1684 > 0) {
                field1682[var20] = var21;
                field1683[var20] = var24;
                field1672[var20] = var23;
            }
        }

        try {
            this.method2889(false, false, false, 0L);
        } catch (Exception var26) {
            ;
        }

    }

    public int method2875() {
        this.method2873();
        return this.field1667;
    }
}
