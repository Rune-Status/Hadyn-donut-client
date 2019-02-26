package jagex.osrs;

import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public final class client extends GameApplet implements class290 {

    public static final class89 field690;
    static final class60 field670;
    static final int[] field704;
    static final int[] field742;
    public static int field691;
    public static boolean field647;
    public static int field914;
    static boolean field856;
    static int field662;
    static GameType gameType;
    static int field803;
    static class232 field816;
    static int field780;
    static int field655;
    static int state;
    static int field866;
    static int field853;
    static int field847;
    static int field725;
    static long field870;
    static int field682;
    static boolean field879;
    static int field674;
    static int field660;
    static int[] field783;
    static boolean[] field848;
    static class330 field920;
    static int loginStage;
    static boolean field833;
    static int field645;
    static int field679;
    static class282 field904;
    static boolean[] field706;
    static int field792;
    static boolean[] field849;
    static Player[] players;
    static int field761;
    static boolean field824;
    static boolean field692;
    static int field860;
    static class82 field683;
    static boolean[] field772;
    static boolean field821;
    static boolean lowMemory;
    static String[] field786;
    static int field828;
    static boolean resizable;
    static int field836;
    static int field785;
    static int field787;
    static int field678;
    static int unknown0;
    static boolean field770;
    static class97 field882;
    static int field906;
    static int[] field781;
    static int field838;
    static boolean field654;
    static String[] field916;
    static int[] field782;
    static int field713;
    static long field656;
    static class204 field800;
    static boolean field748;
    static int field735;
    static boolean field822;
    static class232 field817;
    static int field759;
    static int field643;
    static int[] field784;
    static class232 field815;
    static int[] field763;
    static class204 field804;
    static long field814;
    static int field809;
    static boolean field673;
    static int[] field819;
    static int field705;
    static boolean field919;
    static int field823;
    static int field756;
    static int field744;
    static boolean field886;
    static int field745;
    static int field855;
    static int field700;
    static int[] field775;
    static int field752;
    static int field663;
    static int field696;
    static int[] field854;
    static int field845;
    static int field664;
    static int rights;
    static int field697;
    static int[] field852;
    static int field665;
    static int[] field776;
    static boolean instancedScene;
    static int field753;
    static int field666;
    static boolean field758;
    static class73[] field806;
    static int field909;
    static int field751;
    static int[] field777;
    static int field667;
    static int field668;
    static int affiliateId;
    static class207 field842;
    static int field825;
    static int field669;
    static int field826;
    static int field755;
    static int field810;
    static class166[] field701;
    static class78 field671;
    static int field851;
    static int field685;
    static int field878;
    static class78 field672;
    static boolean field791;
    static int field749;
    static int field796;
    static int field902;
    static boolean field798;
    static int field659;
    static int[][][] field703;
    static int[] field918;
    static int[] field900;
    static int field750;
    static boolean field827;
    static String field766;
    static int field888;
    static String field801;
    static int[] field831;
    static int field760;
    static String field716;
    static int field905;
    static int field832;
    static int[] field884;
    static class148 field681;
    static int[] field885;
    static boolean field746;
    static int field722;
    static int[] field793;
    static int field875;
    static byte[] field708;
    static class93[] field710;
    static int field874;
    static int[] field887;
    static class229 field908;
    static int field686;
    static int field727;
    static int field881;
    static class207 field688;
    static int[] field687;
    static int field910;
    static int field779;
    static int field841;
    static class232 field811;
    static class207[][][] field829;
    static int[] field689;
    static boolean field728;
    static class207 field711;
    static int field877;
    static int field830;
    static int field741;
    static int localPlayerId;
    static int field876;
    static HashMap field695;
    static int field658;
    static ArrayList field915;
    static int field765;
    static int field769;
    static boolean field762;
    static int field795;
    static boolean field889;
    static int field794;
    static int field661;
    static int field917;
    static int field839;
    static long field868;
    static int field850;
    static class232 field880;
    static int field718;
    static class207 field773;
    static int[] field743;
    static int field712;
    static short field649;
    static int[][] field740;
    static int field820;
    static short field896;
    static short field901;
    static class326 field911;
    static short field754;
    static short field684;
    static int field778;
    static int[] field871;
    static int field907;
    static short field899;
    static int field644;
    static int field883;
    static int field709;
    static boolean field694;
    static int[] field872;
    static class323[] field873;
    static int field802;
    static int[] field653;
    static int field714;
    static int field715;
    static int field869;
    static int[] field699;
    static int field717;
    static int field764;
    static int field657;
    static int field865;
    static int field719;
    static int field693;
    static int field861;
    static int field707;
    static int field721;
    static int field730;
    static int field857;
    static short field898;
    static int field723;
    static short field897;
    static int field724;
    static int[] field867;
    static boolean field726;
    static int[] field846;
    static class207 field843;
    static boolean[] field890;
    static int field729;
    static boolean field863;
    static class207 field844;
    static int field912;
    static int field731;
    static int[] field732;
    static int field837;
    static int[] field733;
    static int[] field738;
    static int[] field757;
    static int[] field736;
    static int[] field892;
    static int[] field737;
    static int[] field818;
    static int[] field774;
    static class4[] field895;
    static int field834;
    static String[] field739;
    static int[] field891;
    static int field805;
    static int field642;
    static int field652;
    static int[] field893;
    static int field858;
    static int field807;
    static int field903;
    static int[] field894;
    static int field808;
    static int field797;
    static int field813;
    static String[] field767;
    static boolean[] field768;
    static int field680;
    static long[] field840;
    static int field799;
    static int field676;
    static int field864;
    static int field835;
    static int field734;
    static boolean field789;
    static boolean field788;
    static String field862;
    static class62 field913;
    static boolean field790;
    static int[] field859;

    static {
        field856 = true;
        field691 = 1;
        field660 = 0;
        field645 = 0;
        field647 = false;
        lowMemory = false;
        field785 = 0;
        unknown0 = -1;
        field770 = false;
        state = 0;
        field654 = true;
        field655 = 0;
        field656 = -1L;
        field735 = -1;
        field643 = -1;
        field814 = -1L;
        field919 = true;
        field886 = false;
        field662 = 0;
        field663 = 0;
        field664 = 0;
        field665 = 0;
        field666 = 0;
        field667 = 0;
        field668 = 0;
        field669 = 0;
        field755 = 0;
        field671 = class78.field1134;
        field672 = class78.field1134;
        field902 = 0;
        field674 = 0;
        field682 = 0;
        field787 = 0;
        loginStage = 0;
        field678 = 0;
        field679 = 0;
        field760 = 0;
        field681 = class148.field1964;
        field746 = false;
        field683 = new class82();
        field708 = null;
        field806 = new class73['\u8000'];
        field686 = 0;
        field687 = new int['\u8000'];
        field779 = 0;
        field689 = new int[250];
        field690 = new class89();
        field725 = 0;
        field692 = false;
        field822 = true;
        field904 = new class282();
        field695 = new HashMap();
        field696 = 0;
        field697 = 1;
        field753 = 0;
        field909 = 1;
        field700 = 0;
        field701 = new class166[4];
        instancedScene = false;
        field703 = new int[4][13][13];
        field704 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
        field705 = 0;
        field917 = 2301979;
        field778 = 5063219;
        field883 = 3353893;
        field709 = 7759444;
        field694 = false;
        field802 = 0;
        field712 = 128;
        field658 = 0;
        field714 = 0;
        field715 = 0;
        field869 = 0;
        field717 = 0;
        field718 = 0;
        field719 = 50;
        field707 = 0;
        field721 = 0;
        field857 = 0;
        field723 = 12;
        field724 = 6;
        field659 = 0;
        field726 = false;
        field727 = 0;
        field728 = false;
        field729 = 0;
        field912 = 0;
        field731 = 50;
        field732 = new int[field731];
        field733 = new int[field731];
        field738 = new int[field731];
        field757 = new int[field731];
        field736 = new int[field731];
        field737 = new int[field731];
        field818 = new int[field731];
        field739 = new String[field731];
        field740 = new int[104][104];
        field741 = 0;
        field652 = -1;
        field903 = -1;
        field744 = 0;
        field745 = 0;
        field809 = 0;
        field759 = 0;
        field748 = true;
        field749 = 0;
        field750 = 0;
        field751 = 0;
        field752 = 0;
        field845 = 0;
        field797 = 0;
        field673 = false;
        field756 = 0;
        field680 = 0;
        field758 = true;
        players = new Player[2048];
        localPlayerId = -1;
        field761 = 0;
        field762 = true;
        field676 = 0;
        field850 = 0;
        field743 = new int[1000];
        field742 = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
        field767 = new String[8];
        field768 = new boolean[8];
        field699 = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
        field769 = -1;
        field829 = new class207[4][104][104];
        field688 = new class207();
        field773 = new class207();
        field711 = new class207();
        field775 = new int[25];
        field776 = new int[25];
        field777 = new int[25];
        field866 = 0;
        field833 = false;
        field780 = 0;
        field781 = new int[500];
        field782 = new int[500];
        field783 = new int[500];
        field784 = new int[500];
        field916 = new String[500];
        field786 = new String[500];
        field772 = new boolean[500];
        field788 = false;
        field789 = false;
        field790 = false;
        field791 = true;
        field792 = -1;
        field860 = -1;
        field794 = 0;
        field795 = 50;
        field796 = 0;
        field766 = null;
        field798 = false;
        field799 = -1;
        field734 = -1;
        field801 = null;
        field716 = null;
        field803 = -1;
        field804 = new class204(8);
        field805 = 0;
        field642 = -1;
        field807 = 0;
        field808 = 0;
        field880 = null;
        field810 = 0;
        field851 = 0;
        rights = 0;
        field813 = -1;
        field863 = false;
        field815 = null;
        field816 = null;
        field817 = null;
        field906 = 0;
        field838 = 0;
        field811 = null;
        field821 = false;
        field713 = -1;
        field823 = -1;
        field824 = false;
        field825 = -1;
        field826 = -1;
        field827 = false;
        field828 = 1;
        field653 = new int[32];
        field830 = 0;
        field831 = new int[32];
        field832 = 0;
        field774 = new int[32];
        field834 = 0;
        field835 = 0;
        field836 = 0;
        field837 = 0;
        field858 = 0;
        field839 = 0;
        field685 = 0;
        field841 = 0;
        field842 = new class207();
        field843 = new class207();
        field844 = new class207();
        field800 = new class204(512);
        field853 = 0;
        field847 = -2;
        field848 = new boolean[100];
        field849 = new boolean[100];
        field706 = new boolean[100];
        field763 = new int[100];
        field852 = new int[100];
        field819 = new int[100];
        field854 = new int[100];
        field855 = 0;
        field870 = 0L;
        resizable = true;
        field859 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
        field730 = 0;
        field861 = 0;
        field862 = "";
        field840 = new long[100];
        field864 = 0;
        field865 = 0;
        field846 = new int[128];
        field867 = new int[128];
        field868 = -1L;
        field661 = -1;
        field820 = 0;
        field871 = new int[1000];
        field872 = new int[1000];
        field873 = new class323[1000];
        field722 = 0;
        field875 = 0;
        field876 = 0;
        field877 = 255;
        field878 = -1;
        field879 = false;
        field888 = 127;
        field881 = 127;
        field905 = 0;
        field884 = new int[50];
        field885 = new int[50];
        field793 = new int[50];
        field887 = new int[50];
        field710 = new class93[50];
        field889 = false;
        field890 = new boolean[5];
        field891 = new int[5];
        field892 = new int[5];
        field893 = new int[5];
        field894 = new int[5];
        field649 = 256;
        field896 = 205;
        field897 = 256;
        field898 = 320;
        field899 = 1;
        field684 = 32767;
        field901 = 1;
        field754 = 32767;
        field657 = 0;
        field693 = 0;
        field644 = 0;
        field764 = 0;
        field907 = 0;
        field908 = new class229();
        field874 = -1;
        field910 = -1;
        field911 = new class325();
        field895 = new class4[8];
        field913 = new class62();
        field914 = -1;
        field915 = new ArrayList(10);
        field765 = 0;
        field670 = new class60();
        field918 = new int[50];
        field900 = new int[50];
    }

    static void method1655(class57 var0, int var1, int var2) {
        Object[] var3 = var0.field575;
        class86 var4;
        int var18;
        if (class128.method3234(var0.field573, -1048301153)) {
            class152.field1985 = (class36) var3[0];
            class257 var5 = class162.method3533(class152.field1985.field343, 32768);
            var4 = class30.method578(var0.field573, var5.field3313, var5.field3317, -69024650);
        } else {
            var18 = ((Integer) var3[0]).intValue();
            var4 = class9.method99(var18, (byte) 0);
        }

        if (var4 != null) {
            class60.field600 = 0;
            class70.field1072 = 0;
            var18 = -1;
            int[] var6 = var4.field1257;
            int[] var7 = var4.field1252;
            byte var8 = -1;
            class70.field1083 = 0;
            class70.field1078 = false;

            try {
                int var11;
                try {
                    class70.field1077 = new int[var4.field1256];
                    int var9 = 0;
                    class70.field1067 = new String[var4.field1254];
                    int var10 = 0;

                    int var12;
                    String var19;
                    for (var11 = 1; var11 < var3.length; ++var11) {
                        if (var3[var11] instanceof Integer) {
                            var12 = ((Integer) var3[var11]).intValue();
                            if (var12 == -2147483647) {
                                var12 = var0.field565;
                            }

                            if (var12 == -2147483646) {
                                var12 = var0.field566;
                            }

                            if (var12 == -2147483645) {
                                var12 = var0.field570 != null ? var0.field570.field2770 : -1;
                            }

                            if (var12 == -2147483644) {
                                var12 = var0.field567;
                            }

                            if (var12 == -2147483643) {
                                var12 = var0.field570 != null ? var0.field570.field2787 : -1;
                            }

                            if (var12 == -2147483642) {
                                var12 = var0.field568 != null ? var0.field568.field2770 : -1;
                            }

                            if (var12 == -2147483641) {
                                var12 = var0.field568 != null ? var0.field568.field2787 : -1;
                            }

                            if (var12 == -2147483640) {
                                var12 = var0.field569;
                            }

                            if (var12 == -2147483639) {
                                var12 = var0.field562;
                            }

                            class70.field1077[var9++] = var12;
                        } else if (var3[var11] instanceof String) {
                            var19 = (String) var3[var11];
                            if (var19.equals("event_opbase")) {
                                var19 = var0.field571;
                            }

                            class70.field1067[var10++] = var19;
                        }
                    }

                    var11 = 0;
                    class70.field1075 = var0.field572;

                    while (true) {
                        ++var11;
                        if (var11 > var1) {
                            throw new RuntimeException();
                        }

                        ++var18;
                        int var30 = var6[var18];
                        int var21;
                        if (var30 >= 100) {
                            boolean var34;
                            if (var4.field1252[var18] == 1) {
                                var34 = true;
                            } else {
                                var34 = false;
                            }

                            var21 = class140.method3311(var30, var4, var34, 49958749);
                            switch (var21) {
                                case 0:
                                    return;
                                case 1:
                                default:
                                    break;
                                case 2:
                                    throw new IllegalStateException();
                            }
                        } else if (var30 == 0) {
                            class70.field1070[++class60.field600 - 1] = var7[var18];
                        } else if (var30 == 1) {
                            var12 = var7[var18];
                            class70.field1070[++class60.field600 - 1] = class227.field2629[var12];
                        } else if (var30 == 2) {
                            var12 = var7[var18];
                            class227.field2629[var12] = class70.field1070[--class60.field600];
                            class223.method4595(var12, -1750193407);
                        } else if (var30 == 3) {
                            class70.field1065[++class70.field1072 - 1] = var4.field1255[var18];
                        } else if (var30 == 6) {
                            var18 += var7[var18];
                        } else if (var30 == 7) {
                            class60.field600 -= 2;
                            if (class70.field1070[class60.field600] != class70.field1070[
                                class60.field600 + 1]) {
                                var18 += var7[var18];
                            }
                        } else if (var30 == 8) {
                            class60.field600 -= 2;
                            if (class70.field1070[class60.field600] == class70.field1070[
                                class60.field600 + 1]) {
                                var18 += var7[var18];
                            }
                        } else if (var30 == 9) {
                            class60.field600 -= 2;
                            if (class70.field1070[class60.field600] < class70.field1070[
                                class60.field600 + 1]) {
                                var18 += var7[var18];
                            }
                        } else if (var30 == 10) {
                            class60.field600 -= 2;
                            if (class70.field1070[class60.field600] > class70.field1070[
                                class60.field600 + 1]) {
                                var18 += var7[var18];
                            }
                        } else if (var30 == 21) {
                            if (class70.field1083 == 0) {
                                return;
                            }

                            class51 var35 = class70.field1074[--class70.field1083];
                            var4 = var35.field521;
                            var6 = var4.field1257;
                            var7 = var4.field1252;
                            var18 = var35.field523;
                            class70.field1077 = var35.field514;
                            class70.field1067 = var35.field517;
                        } else if (var30 == 25) {
                            var12 = var7[var18];
                            class70.field1070[++class60.field600 - 1] = class97
                                .method2405(var12, (byte) 116);
                        } else if (var30 == 27) {
                            var12 = var7[var18];
                            class40.method766(var12, class70.field1070[--class60.field600],
                                              1551244815);
                        } else if (var30 == 31) {
                            class60.field600 -= 2;
                            if (class70.field1070[class60.field600] <= class70.field1070[
                                class60.field600 + 1]) {
                                var18 += var7[var18];
                            }
                        } else if (var30 == 32) {
                            class60.field600 -= 2;
                            if (class70.field1070[class60.field600] >= class70.field1070[
                                class60.field600 + 1]) {
                                var18 += var7[var18];
                            }
                        } else if (var30 == 33) {
                            class70.field1070[++class60.field600
                                - 1] = class70.field1077[var7[var18]];
                        } else if (var30 == 34) {
                            class70.field1077[var7[var18]] = class70.field1070[--class60.field600];
                        } else if (var30 == 35) {
                            class70.field1065[++class70.field1072
                                - 1] = class70.field1067[var7[var18]];
                        } else if (var30 == 36) {
                            class70.field1067[var7[var18]] = class70.field1065[--class70.field1072];
                        } else if (var30 == 37) {
                            var12 = var7[var18];
                            class70.field1072 -= var12;
                            String var32 = class25
                                .method477(class70.field1065, class70.field1072, var12, 922841529);
                            class70.field1065[++class70.field1072 - 1] = var32;
                        } else if (var30 == 38) {
                            --class60.field600;
                        } else if (var30 == 39) {
                            --class70.field1072;
                        } else {
                            int var16;
                            if (var30 != 40) {
                                if (var30 == 42) {
                                    class70.field1070[++class60.field600 - 1] = class36.field348
                                        .method2091(var7[var18], -193547956);
                                } else if (var30 == 43) {
                                    class36.field348.method2114(var7[var18],
                                                                class70.field1070[--class60.field600],
                                                                -1482826901);
                                } else if (var30 == 44) {
                                    var12 = var7[var18] >> 16;
                                    var21 = var7[var18] & 65535;
                                    int var22 = class70.field1070[--class60.field600];
                                    if (var22 < 0 || var22 > 5000) {
                                        throw new RuntimeException();
                                    }

                                    class70.field1068[var12] = var22;
                                    byte var23 = -1;
                                    if (var21 == 105) {
                                        var23 = 0;
                                    }

                                    for (var16 = 0; var16 < var22; ++var16) {
                                        class70.field1069[var12][var16] = var23;
                                    }
                                } else if (var30 == 45) {
                                    var12 = var7[var18];
                                    var21 = class70.field1070[--class60.field600];
                                    if (var21 < 0 || var21 >= class70.field1068[var12]) {
                                        throw new RuntimeException();
                                    }

                                    class70.field1070[++class60.field600
                                        - 1] = class70.field1069[var12][var21];
                                } else if (var30 == 46) {
                                    var12 = var7[var18];
                                    class60.field600 -= 2;
                                    var21 = class70.field1070[class60.field600];
                                    if (var21 < 0 || var21 >= class70.field1068[var12]) {
                                        throw new RuntimeException();
                                    }

                                    class70.field1069[var12][var21] = class70.field1070[
                                        class60.field600 + 1];
                                } else if (var30 == 47) {
                                    var19 = class36.field348.method2089(var7[var18], 1425514174);
                                    if (var19 == null) {
                                        var19 = "null";
                                    }

                                    class70.field1065[++class70.field1072 - 1] = var19;
                                } else if (var30 == 48) {
                                    class36.field348.method2106(var7[var18],
                                                                class70.field1065[--class70.field1072],
                                                                (byte) 39);
                                } else {
                                    if (var30 != 60) {
                                        throw new IllegalStateException();
                                    }

                                    class199 var33 = var4.field1253[var7[var18]];
                                    class213 var31 = (class213) var33
                                        .method4185((long) class70.field1070[--class60.field600]);
                                    if (var31 != null) {
                                        var18 += var31.field2512;
                                    }
                                }
                            } else {
                                var12 = var7[var18];
                                class86 var13 = class9.method99(var12, (byte) 0);
                                int[] var14 = new int[var13.field1256];
                                String[] var15 = new String[var13.field1254];

                                for (var16 = 0; var16 < var13.field1258; ++var16) {
                                    var14[var16] = class70.field1070[var16 + (class60.field600
                                        - var13.field1258)];
                                }

                                for (var16 = 0; var16 < var13.field1259; ++var16) {
                                    var15[var16] = class70.field1065[var16 + (class70.field1072
                                        - var13.field1259)];
                                }

                                class60.field600 -= var13.field1258;
                                class70.field1072 -= var13.field1259;
                                class51 var20 = new class51();
                                var20.field521 = var4;
                                var20.field523 = var18;
                                var20.field514 = class70.field1077;
                                var20.field517 = class70.field1067;
                                class70.field1074[++class70.field1083 - 1] = var20;
                                var4 = var13;
                                var6 = var13.field1257;
                                var7 = var13.field1252;
                                var18 = -1;
                                class70.field1077 = var14;
                                class70.field1067 = var15;
                            }
                        }
                    }
                } catch (Exception var28) {
                    StringBuilder var25 = new StringBuilder(30);
                    var25.append("").append(var4.key).append(" ");

                    for (var11 = class70.field1083 - 1; var11 >= 0; --var11) {
                        var25.append("").append(class70.field1074[var11].field521.key)
                             .append(" ");
                    }

                    var25.append("").append(var8);
                    class80.method2041(var25.toString(), var28, 1721189784);
                }
            } finally {
                if (class70.field1078) {
                    class70.field1079 = true;
                    class42.method783(1952311603);
                    class70.field1079 = false;
                    class70.field1078 = false;
                }

            }
        }
    }

    void method1241(byte var1) {
        if (state != 1000) {
            boolean var2 = class130.method3241((byte) 42);
            if (!var2) {
                this.method1242(1511323397);
            }

        }
    }

    public class293 vmethod5687(int var1) {
        return class69.localPlayer != null ? class69.localPlayer.field625 : null;
    }

    void method1359(int var1) {
        int var2 = class68.windowWidth;
        int var3 = class141.windowHeight;
        if (super.field439 < var2) {
            var2 = super.field439;
        }

        if (super.field440 < var3) {
            var3 = super.field440;
        }

        if (GameApplet.field435 != null) {
            try {
                Javascript.call(class157.field2037, "resize",
                                new Object[]{Integer.valueOf(class17.getWindowMode())}
                               );
            } catch (Throwable var5) {
                ;
            }
        }

    }

    protected final void vmethod1240(int var1) {
        if (class36.field348.method2099((byte) 1)) {
            class36.field348.method2096(-788552448);
        }

        if (class36.field347 != null) {
            class36.field347.field586 = false;
        }

        class36.field347 = null;
        field690.method2190((byte) 63);
        class238.method4785(2129784942);
        if (class48.field470 != null) {
            class48 var2 = class48.field470;
            synchronized (class48.field470) {
                class48.field470 = null;
            }
        }

        ArchiveCache.field2076 = null;
        if (field882 != null) {
            field882.method2403(1899838514);
        }

        if (class6.field46 != null) {
            class6.field46.method2403(1855008070);
        }

        if (class252.field3263 != null) {
            class252.field3263.vmethod3558(-1681877056);
        }

        Object var8 = class250.field3241;
        synchronized (class250.field3241) {
            if (class250.field3243 != 0) {
                class250.field3243 = 1;

                try {
                    class250.field3241.wait();
                } catch (InterruptedException var5) {
                    ;
                }
            }
        }

        if (class37.field352 != null) {
            class37.field352.method3274(1163748948);
            class37.field352 = null;
        }

        SeekableFile.method2723(-1059456455);
    }

    protected final void vmethod1483(int var1) {
        GameType.method4819(new int[]{20, 260, 10000}, new int[]{1000, 100, 500}, -131664052);
        class139.field1928 = field645 == 0 ? 43594 : field691 + 40000;
        class2.field23 = field645 == 0 ? 443 : field691 + 50000;
        class144.field1947 = class139.field1928;
        class39.field385 = class230.field2650;
        class256.field3306 = class230.field2649;
        class229.field2642 = class230.field2651;
        class229.field2638 = class230.field2652;
        class37.field352 = new class137();
        this.method844(1411045424);
        this.method850(487807714);
        ArchiveCache.field2076 = this.method848((byte) 0);
        class55.manifests = new ArchiveCache(255, class157.blocksFile, class157.manifestIndexFile, 500000);
        SeekableFile var3 = null;
        class67 var4 = new class67();

        try {
            var3 = class7.getPreferencesFile("", gameType.name, false, -1657603693);
            byte[] var5 = new byte[(int) var3.method2719(-1043811706)];

            int var7;
            for (int var6 = 0; var6 < var5.length; var6 += var7) {
                var7 = var3.method2720(var5, var6, var5.length - var6, 376444320);
                if (var7 == -1) {
                    throw new IOException();
                }
            }

            var4 = new class67(new Buffer(var5));
        } catch (Exception var9) {
            ;
        }

        try {
            if (var3 != null) {
                var3.method2717(860941921);
            }
        } catch (Exception var8) {
            ;
        }

        GameApplet.field435 = var4;
        this.method918(641500723);
        String var10 = class22.field222;
        class45.field419 = this;
        if (var10 != null) {
            class45.field420 = var10;
        }

        if (field645 != 0) {
            field886 = true;
        }

        class27.method513(GameApplet.field435.field1031);
        InboundPacketDescriptor.field2150 = new class68(field920);
    }

    final void method1253(boolean var1, int var2) {
        class30.method536(field803, class68.windowWidth, class141.windowHeight, var1, 1707233119);
    }

    void method1243(int var1, int var2) {
        class13.field106 = null;
        BufferedFile.field1489 = null;
        field674 = 0;
        if (class144.field1947 == class139.field1928) {
            class144.field1947 = class2.field23;
        } else {
            class144.field1947 = class139.field1928;
        }

        ++field787;
        if (field787 >= 2 && (var1 == 7 || var1 == 9)) {
            if (state <= 5) {
                this.method874("js5connect_full", -769459642);
                state = 1000;
            } else {
                field682 = 3000;
            }
        } else if (field787 >= 2 && var1 == 6) {
            this.method874("js5connect_outofdate", -788143193);
            state = 1000;
        } else if (field787 >= 4) {
            if (state <= 5) {
                this.method874("js5connect", -264827688);
                state = 1000;
            } else {
                field682 = 3000;
            }
        }

    }

    final boolean method1251(int var1) {
        int var2 = field780 - 1;
        boolean var4 = field866 == 1 && field780 > 2;
        if (!var4) {
            boolean var5;
            if (var2 < 0) {
                var5 = false;
            } else {
                int var6 = field783[var2];
                if (var6 >= 2000) {
                    var6 -= 2000;
                }

                if (var6 == 1007) {
                    var5 = true;
                } else {
                    var5 = false;
                }
            }

            var4 = var5;
        }

        return var4 && !field772[var2];
    }

    protected final void vmethod1465(short var1) {
    }

    final boolean method1249(class89 var1, int var2) {
        class159 var3 = var1.method2192((byte) -4);
        PacketBuffer var4 = var1.field1283;
        if (var3 == null) {
            return false;
        } else {
            String var18;
            int var19;
            try {
                int var6;
                if (var1.packetDescriptor == null) {
                    if (var1.field1286) {
                        if (!var3.isReadable(1, -1333943190)) {
                            return false;
                        }

                        var3.read(var1.field1283.bytes, 0, 1);
                        var1.field1287 = 0;
                        var1.field1286 = false;
                    }

                    var4.offset = 0;
                    if (var4.method4048((byte) -52)) {
                        if (!var3.isReadable(1, -933878687)) {
                            return false;
                        }

                        var3.read(var1.field1283.bytes, 1, 1);
                        var1.field1287 = 0;
                    }

                    var1.field1286 = true;
                    InboundPacketDescriptor[] var5 = class63.getInboundPackets(1512368041);
                    var6 = var4.readEncipheredShort(-170613268);
                    if (var6 < 0 || var6 >= var5.length) {
                        throw new IOException(var6 + " " + var4.offset);
                    }

                    var1.packetDescriptor = var5[var6];
                    var1.packetLength = var1.packetDescriptor.length;
                }

                if (var1.packetLength == -1) {
                    if (!var3.isReadable(1, 1612700317)) {
                        return false;
                    }

                    var1.method2192((byte) 27).read(var4.bytes, 0, 1);
                    var1.packetLength = var4.bytes[0] & 255;
                }

                if (var1.packetLength == -2) {
                    if (!var3.isReadable(2, 1552915171)) {
                        return false;
                    }

                    var1.method2192((byte) 1).read(var4.bytes, 0, 2);
                    var4.offset = 0;
                    var1.packetLength = var4.readUint16();
                }

                if (!var3.isReadable(var1.packetLength, -87054583)) {
                    return false;
                }

                var4.offset = 0;
                var3.read(var4.bytes, 0, var1.packetLength);
                var1.field1287 = 0;
                field904.method5517(-1610452923);
                var1.field1278 = var1.field1284;
                var1.field1284 = var1.field1295;
                var1.field1295 = var1.packetDescriptor;
                if (InboundPacketDescriptor.field2178 == var1.packetDescriptor) {
                    class11.decodeSceneRebuild(false, var1.field1283);
                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2159 == var1.packetDescriptor) {
                    class74.method1987(-2100056555);
                    var1.packetDescriptor = null;
                    return false;
                }

                if (InboundPacketDescriptor.field2177 == var1.packetDescriptor) {
                    class0.method11(1200659683);
                    field810 = var4.getUByte();
                    field685 = field828;
                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2188 == var1.packetDescriptor) {
                    class0.method11(1200659683);
                    field851 = var4.method3814((byte) -1);
                    field685 = field828;
                    var1.packetDescriptor = null;
                    return true;
                }

                class232 var7;
                int var8;
                int var9;
                int var10;
                int var11;
                int var17;
                if (InboundPacketDescriptor.field2196 == var1.packetDescriptor) {
                    var17 = var4.getInt();
                    var6 = var4.readUint16();
                    if (var17 < -70000) {
                        var6 += 32768;
                    }

                    if (var17 >= 0) {
                        var7 = class18.method213(var17, -2060739794);
                    } else {
                        var7 = null;
                    }

                    if (var7 != null) {
                        for (var8 = 0; var8 < var7.field2762.length; ++var8) {
                            var7.field2762[var8] = 0;
                            var7.field2792[var8] = 0;
                        }
                    }

                    class71.method1957(var6, (byte) 42);
                    var8 = var4.readUint16();

                    for (var9 = 0; var9 < var8; ++var9) {
                        var10 = var4.readUint16();
                        var11 = var4.getUByte();
                        if (var11 == 255) {
                            var11 = var4.method3772(-854436441);
                        }

                        if (var7 != null && var9 < var7.field2762.length) {
                            var7.field2762[var9] = var10;
                            var7.field2792[var9] = var11;
                        }

                        class27.method492(var6, var9, var10 - 1, var11, (byte) -42);
                    }

                    if (var7 != null) {
                        class37.method721(var7, 1238023037);
                    }

                    class0.method11(1200659683);
                    field831[++field832 - 1 & 31] = var6 & 32767;
                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2148 == var1.packetDescriptor) {
                    var17 = var4.method3772(1534204633);
                    var6 = var4.method3792(128671456);
                    var7 = class18.method213(var17, -1691960496);
                    if (var7.field2740 != 1 || var6 != var7.field2755) {
                        var7.field2740 = 1;
                        var7.field2755 = var6;
                        class37.method721(var7, 1238023037);
                    }

                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2136 == var1.packetDescriptor) {
                    var17 = var4.getInt();
                    var18 = var4.method3778(-1773674715);
                    var7 = class18.method213(var17, -1198151199);
                    if (!var18.equals(var7.field2728)) {
                        var7.field2728 = var18;
                        class37.method721(var7, 1238023037);
                    }

                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2145 == var1.packetDescriptor) {
                    for (var17 = 0; var17 < players.length; ++var17) {
                        if (players[var17] != null) {
                            players[var17].field971 = -1;
                        }
                    }

                    for (var17 = 0; var17 < field806.length; ++var17) {
                        if (field806[var17] != null) {
                            field806[var17].field971 = -1;
                        }
                    }

                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2182 == var1.packetDescriptor) {
                    var17 = var4.readUint16();
                    var6 = var4.getUByte();
                    var19 = var4.readUint16();
                    class36.method693(var17, var6, var19, -557263979);
                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2129 == var1.packetDescriptor) {
                    class160.method3500(class173.field2321, (byte) 85);
                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2125 == var1.packetDescriptor) {
                    class160.method3500(class173.field2319, (byte) 17);
                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2201 == var1.packetDescriptor) {
                    class67.method1748(var4, var1.packetLength, 1408100742);
                    class16.method182(1877553034);
                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2164 == var1.packetDescriptor) {
                    class66 var42 = new class66();
                    var42.field1019 = var4.method3778(-1209316729);
                    var42.field1015 = var4.readUint16();
                    var6 = var4.getInt();
                    var42.field1008 = var6;
                    class16.method202(45, -1194677662);
                    var3.vmethod3558(-730422622);
                    var3 = null;
                    class138.method3292(var42, -555531433);
                    var1.packetDescriptor = null;
                    return false;
                }

                if (InboundPacketDescriptor.field2161 == var1.packetDescriptor) {
                    var17 = var4.getInt();
                    var6 = var4.readUint16();
                    if (var17 < -70000) {
                        var6 += 32768;
                    }

                    if (var17 >= 0) {
                        var7 = class18.method213(var17, -1399206472);
                    } else {
                        var7 = null;
                    }

                    for (; var4.offset < var1.packetLength;
                         class27.method492(var6, var8, var9 - 1, var10, (byte) -15)) {
                        var8 = var4.method3783(-429753275);
                        var9 = var4.readUint16();
                        var10 = 0;
                        if (var9 != 0) {
                            var10 = var4.getUByte();
                            if (var10 == 255) {
                                var10 = var4.getInt();
                            }
                        }

                        if (var7 != null && var8 >= 0 && var8 < var7.field2762.length) {
                            var7.field2762[var8] = var9;
                            var7.field2792[var8] = var10;
                        }
                    }

                    if (var7 != null) {
                        class37.method721(var7, 1238023037);
                    }

                    class0.method11(1200659683);
                    field831[++field832 - 1 & 31] = var6 & 32767;
                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2172 == var1.packetDescriptor) {
                    class187.field2433 = var4.method3799(-106999200);
                    class72.field1100 = var4.method3891((byte) 0);
                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2163 == var1.packetDescriptor) {
                    var17 = var4.method3807(64801268);
                    class30.method575(var17, 2145588800);
                    field831[++field832 - 1 & 31] = var17 & 32767;
                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2174 == var1.packetDescriptor) {
                    var4.offset += 28;
                    if (var4.method3786((byte) 66)) {
                        class86.method2163(var4, var4.offset - 28, 1427407129);
                    }

                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2140 == var1.packetDescriptor) {
                    var17 = var4.method3792(92958702);
                    if (var17 == 65535) {
                        var17 = -1;
                    }

                    class69.method1841(var17, (byte) 2);
                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2157 == var1.packetDescriptor) {
                    var17 = var4.method3812(1652165997);
                    var6 = var4.method3808(-1599744535);
                    if (var6 == 65535) {
                        var6 = -1;
                    }

                    class254.method4994(var6, var17, 1163401710);
                    var1.packetDescriptor = null;
                    return true;
                }

                class232 var57;
                if (InboundPacketDescriptor.field2176 == var1.packetDescriptor) {
                    var17 = var4.method3964(287627655);
                    var6 = var4.method3811(-1831644342);
                    var19 = var4.method3810(1308083007);
                    var57 = class18.method213(var17, -351223324);
                    if (var19 != var57.field2676 || var6 != var57.field2751 || var57.field2672 != 0
                        || var57.field2673 != 0) {
                        var57.field2676 = var19;
                        var57.field2751 = var6;
                        var57.field2672 = 0;
                        var57.field2673 = 0;
                        class37.method721(var57, 1238023037);
                        this.method1577(var57, -794294536);
                        if (var57.field2808 == 0) {
                            class223.method4594(class145.field1951[var17 >> 16], var57, false,
                                                1658306306);
                        }
                    }

                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2131 == var1.packetDescriptor) {
                    for (var17 = 0; var17 < class256.field3302; ++var17) {
                        class256 var56 = class142.method3328(var17, (byte) 58);
                        if (var56 != null) {
                            class227.field2630[var17] = 0;
                            class227.field2629[var17] = 0;
                        }
                    }

                    class0.method11(1200659683);
                    field830 += 32;
                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2149 == var1.packetDescriptor) {
                    InboundPacketDescriptor.field2150.field1041.method5574(var4, var1.packetLength, 451663299);
                    class2.method20((byte) 0);
                    field836 = field828;
                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2134 == var1.packetDescriptor) {
                    class72.field1100 = var4.method3891((byte) 0);
                    class187.field2433 = var4.method3799(594389036);

                    while (var4.offset < var1.packetLength) {
                        var17 = var4.getUByte();
                        class173 var55 = class66.method1733(2144968091)[var17];
                        class160.method3500(var55, (byte) 22);
                    }

                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2190 == var1.packetDescriptor) {
                    if (field803 != -1) {
                        class33.method607(field803, 0, 209337126);
                    }

                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2170 == var1.packetDescriptor) {
                    class12.method141(var4, var1.packetLength, (byte) 96);
                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2138 == var1.packetDescriptor) {
                    var17 = var4.method3814((byte) -1);
                    var6 = var4.method3772(-1292175866);
                    var7 = class18.method213(var6, 213302743);
                    if (var17 != var7.field2714 || var17 == -1) {
                        var7.field2714 = var17;
                        var7.field2795 = 0;
                        var7.field2750 = 0;
                        class37.method721(var7, 1238023037);
                    }

                    var1.packetDescriptor = null;
                    return true;
                }

                boolean var52;
                if (InboundPacketDescriptor.field2181 == var1.packetDescriptor) {
                    var52 = var4.getUByte() == 1;
                    if (var52) {
                        class113.field1511 =
                            class120.method2866((short) 3133) - var4.method3775((byte) 126);
                        class59.field590 = new class1(var4, true);
                    } else {
                        class59.field590 = null;
                    }

                    field839 = field828;
                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2192 == var1.packetDescriptor) {
                    field889 = true;
                    class27.field266 = var4.getUByte();
                    class180.field2361 = var4.getUByte();
                    class138.field1926 = var4.readUint16();
                    InboundPacketDescriptor.field2206 = var4.getUByte();
                    class30.field314 = var4.getUByte();
                    if (class30.field314 >= 100) {
                        class157.field2036 = class27.field266 * 128 + 64;
                        class50.field508 = class180.field2361 * 128 + 64;
                        Buffer.field2409 = class152
                            .method3394(class157.field2036, class50.field508, class60.level,
                                        (byte) 23) - class138.field1926;
                    }

                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2194 == var1.packetDescriptor) {
                    class160.method3500(class173.field2320, (byte) 78);
                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2175 == var1.packetDescriptor) {
                    class53.method1082(false, var4, (byte) 4);
                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2203 == var1.packetDescriptor) {
                    class160.method3500(class173.field2318, (byte) 111);
                    var1.packetDescriptor = null;
                    return true;
                }

                class56 var20;
                class232 var21;
                if (InboundPacketDescriptor.field2142 == var1.packetDescriptor) {
                    var17 = var4.getInt();
                    var6 = var4.getInt();
                    class56 var45 = (class56) field804.method4224((long) var6);
                    var20 = (class56) field804.method4224((long) var17);
                    if (var20 != null) {
                        class6.method67(var20, var45 == null || var20.field556 != var45.field556,
                                        (short) 180);
                    }

                    if (var45 != null) {
                        var45.unlink();
                        field804.method4226(var45, (long) var17);
                    }

                    var21 = class18.method213(var6, -1995320984);
                    if (var21 != null) {
                        class37.method721(var21, 1238023037);
                    }

                    var21 = class18.method213(var17, -1546696403);
                    if (var21 != null) {
                        class37.method721(var21, 1238023037);
                        class223.method4594(class145.field1951[var21.field2770 >>> 16], var21, true,
                                            1658306306);
                    }

                    if (field803 != -1) {
                        class33.method607(field803, 1, 944464657);
                    }

                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2144 == var1.packetDescriptor) {
                    var17 = var4.getUByte();
                    class24.method472(var17, -1864650036);
                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2153 == var1.packetDescriptor) {
                    field663 = var4.getUByte();
                    if (field663 == 1) {
                        field664 = var4.readUint16();
                    }

                    if (field663 >= 2 && field663 <= 6) {
                        if (field663 == 2) {
                            field669 = 64;
                            field755 = 64;
                        }

                        if (field663 == 3) {
                            field669 = 0;
                            field755 = 64;
                        }

                        if (field663 == 4) {
                            field669 = 128;
                            field755 = 64;
                        }

                        if (field663 == 5) {
                            field669 = 64;
                            field755 = 0;
                        }

                        if (field663 == 6) {
                            field669 = 64;
                            field755 = 128;
                        }

                        field663 = 2;
                        field666 = var4.readUint16();
                        field667 = var4.readUint16();
                        field668 = var4.getUByte();
                    }

                    if (field663 == 10) {
                        field665 = var4.readUint16();
                    }

                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2184 == var1.packetDescriptor) {
                    field722 = var4.getUByte();
                    if (field722 == 255) {
                        field722 = 0;
                    }

                    field875 = var4.getUByte();
                    if (field875 == 255) {
                        field875 = 0;
                    }

                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2126 == var1.packetDescriptor) {
                    var17 = var4.getInt();
                    class56 var53 = (class56) field804.method4224((long) var17);
                    if (var53 != null) {
                        class6.method67(var53, true, (short) 180);
                    }

                    if (field880 != null) {
                        class37.method721(field880, 1238023037);
                        field880 = null;
                    }

                    var1.packetDescriptor = null;
                    return true;
                }

                class232 var50;
                if (InboundPacketDescriptor.field2147 == var1.packetDescriptor) {
                    var17 = var4.method3772(575506974);
                    var50 = class18.method213(var17, 152645935);
                    var50.field2740 = 3;
                    var50.field2755 = class69.localPlayer.field630.method4672(-1098490940);
                    class37.method721(var50, 1238023037);
                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2121 == var1.packetDescriptor) {
                    var17 = var4.readUint16();
                    var6 = var4.getInt();
                    class227.field2630[var17] = var6;
                    if (class227.field2629[var17] != var6) {
                        class227.field2629[var17] = var6;
                    }

                    class223.method4595(var17, -1750193407);
                    field653[++field830 - 1 & 31] = var17;
                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2158 == var1.packetDescriptor) {
                    var17 = var4.method3808(-2018401159);
                    var6 = var4.method3807(-1586416145);
                    var19 = var4.method3964(287627655);
                    var57 = class18.method213(var19, -1140705979);
                    var57.field2723 = var17 + (var6 << 16);
                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2128 == var1.packetDescriptor) {
                    class160.method3500(class173.field2316, (byte) 114);
                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2152 == var1.packetDescriptor) {
                    var17 = var4.method3792(252179005);
                    var6 = var4.method3772(-143203232);
                    var7 = class18.method213(var6, -408988183);
                    if (var7.field2740 != 2 || var17 != var7.field2755) {
                        var7.field2740 = 2;
                        var7.field2755 = var17;
                        class37.method721(var7, 1238023037);
                    }

                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2124 == var1.packetDescriptor) {
                    var17 = var4.getInt();
                    var6 = var4.readUint16();
                    if (var6 == 65535) {
                        var6 = -1;
                    }

                    var19 = var4.method3772(-1429167805);
                    var57 = class18.method213(var17, -1338232778);
                    class271 var59;
                    if (!var57.field2685) {
                        if (var6 == -1) {
                            var57.field2740 = 0;
                            var1.packetDescriptor = null;
                            return true;
                        }

                        var59 = class84.method2125(var6, -205103429);
                        var57.field2740 = 4;
                        var57.field2755 = var6;
                        var57.field2732 = var59.field3524;
                        var57.field2719 = var59.field3519;
                        var57.field2721 = var59.field3517 * 100 / var19;
                        class37.method721(var57, 1238023037);
                    } else {
                        var57.field2793 = var6;
                        var57.field2794 = var19;
                        var59 = class84.method2125(var6, -205103429);
                        var57.field2732 = var59.field3524;
                        var57.field2719 = var59.field3519;
                        var57.field2720 = var59.field3520;
                        var57.field2718 = var59.field3521;
                        var57.field2717 = var59.field3522;
                        var57.field2721 = var59.field3517;
                        if (var59.field3523 == 1) {
                            var57.field2797 = 1;
                        } else {
                            var57.field2797 = 2;
                        }

                        if (var57.field2722 > 0) {
                            var57.field2721 = var57.field2721 * 32 / var57.field2722;
                        } else if (var57.field2678 > 0) {
                            var57.field2721 = var57.field2721 * 32 / var57.field2678;
                        }

                        class37.method721(var57, 1238023037);
                    }

                    var1.packetDescriptor = null;
                    return true;
                }

                String var41;
                boolean var44;
                if (InboundPacketDescriptor.field2187 == var1.packetDescriptor) {
                    var17 = var4.method3783(-169177407);
                    var44 = var4.getUByte() == 1;
                    var41 = "";
                    boolean var46 = false;
                    if (var44) {
                        var41 = var4.method3778(324350744);
                        if (InboundPacketDescriptor.field2150
                            .method1803(new class293(var41, field920), 1440386847)) {
                            var46 = true;
                        }
                    }

                    String var58 = var4.method3778(-433872729);
                    if (!var46) {
                        class59.method1163(var17, var41, var58, -1483885983);
                    }

                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2166 == var1.packetDescriptor) {
                    field889 = true;
                    class67.field1027 = var4.getUByte();
                    class141.field1939 = var4.getUByte();
                    class21.field208 = var4.readUint16();
                    class66.field1026 = var4.getUByte();
                    class253.field3289 = var4.getUByte();
                    if (class253.field3289 >= 100) {
                        var17 = class67.field1027 * 128 + 64;
                        var6 = class141.field1939 * 128 + 64;
                        var19 = class152.method3394(var17, var6, class60.level, (byte) 86)
                            - class21.field208;
                        var8 = var17 - class157.field2036;
                        var9 = var19 - Buffer.field2409;
                        var10 = var6 - class50.field508;
                        var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
                        class57.field576 =
                            (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 2047;
                        class15.field143 =
                            (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 2047;
                        if (class57.field576 < 128) {
                            class57.field576 = 128;
                        }

                        if (class57.field576 > 383) {
                            class57.field576 = 383;
                        }
                    }

                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2120 == var1.packetDescriptor) {
                    var17 = var4.method3772(1494306421);
                    var6 = var4.method3792(986168560);
                    var7 = class18.method213(var17, 77705851);
                    if (var7 != null && var7.field2808 == 0) {
                        if (var6 > var7.field2691 - var7.field2683) {
                            var6 = var7.field2691 - var7.field2683;
                        }

                        if (var6 < 0) {
                            var6 = 0;
                        }

                        if (var6 != var7.field2689) {
                            var7.field2689 = var6;
                            class37.method721(var7, 1238023037);
                        }
                    }

                    var1.packetDescriptor = null;
                    return true;
                }

                String var39;
                if (InboundPacketDescriptor.field2179 == var1.packetDescriptor) {
                    var39 = var4.method3778(-226701352);
                    Object[] var51 = new Object[var39.length() + 1];

                    for (var19 = var39.length() - 1; var19 >= 0; --var19) {
                        if (var39.charAt(var19) == 's') {
                            var51[var19 + 1] = var4.method3778(106955705);
                        } else {
                            var51[var19 + 1] = new Integer(var4.getInt());
                        }
                    }

                    var51[0] = new Integer(var4.getInt());
                    class57 var43 = new class57();
                    var43.field575 = var51;
                    class53.method1076(var43, -196178885);
                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2199 == var1.packetDescriptor) {
                    var17 = var4.method3964(287627655);
                    var50 = class18.method213(var17, 35313060);

                    for (var19 = 0; var19 < var50.field2762.length; ++var19) {
                        var50.field2762[var19] = -1;
                        var50.field2762[var19] = 0;
                    }

                    class37.method721(var50, 1238023037);
                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2197 == var1.packetDescriptor) {
                    field861 = var4.method3799(-1806195762);
                    field730 = var4.method3799(-451429880);
                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2167 == var1.packetDescriptor) {
                    var17 = var4.method3792(458005929);
                    var6 = var4.method3792(1199235065);
                    var19 = var4.method3792(573947425);
                    var8 = var4.method3772(-1844927980);
                    var21 = class18.method213(var8, -1008760965);
                    if (var17 != var21.field2732 || var19 != var21.field2719
                        || var6 != var21.field2721) {
                        var21.field2732 = var17;
                        var21.field2719 = var19;
                        var21.field2721 = var6;
                        class37.method721(var21, 1238023037);
                    }

                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2123 == var1.packetDescriptor) {
                    class160.method3500(class173.field2325, (byte) 80);
                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2191 == var1.packetDescriptor) {
                    field876 = var4.getUByte();
                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2141 == var1.packetDescriptor) {
                    var17 = var4.method3964(287627655);
                    var6 = var4.method3808(-1445929193);
                    var19 = var6 >> 10 & 31;
                    var8 = var6 >> 5 & 31;
                    var9 = var6 & 31;
                    var10 = (var8 << 11) + (var19 << 19) + (var9 << 3);
                    class232 var60 = class18.method213(var17, -152844609);
                    if (var10 != var60.field2686) {
                        var60.field2686 = var10;
                        class37.method721(var60, 1238023037);
                    }

                    var1.packetDescriptor = null;
                    return true;
                }

                long var13;
                if (InboundPacketDescriptor.field2173 == var1.packetDescriptor) {
                    var17 = var4.offset + var1.packetLength;
                    var6 = var4.readUint16();
                    var19 = var4.readUint16();
                    if (var6 != field803) {
                        field803 = var6;
                        this.method1253(false, -1736803607);
                        class160.method3504(field803, 30895243);
                        class25.method480(field803, -1869692911);

                        for (var8 = 0; var8 < 100; ++var8) {
                            field848[var8] = true;
                        }
                    }

                    class56 var22;
                    for (; var19-- > 0; var22.field555 = true) {
                        var8 = var4.getInt();
                        var9 = var4.readUint16();
                        var10 = var4.getUByte();
                        var22 = (class56) field804.method4224((long) var8);
                        if (var22 != null && var9 != var22.field556) {
                            class6.method67(var22, true, (short) 180);
                            var22 = null;
                        }

                        if (var22 == null) {
                            var22 = class17.method209(var8, var9, var10, (byte) 68);
                        }
                    }

                    for (var20 = (class56) field804.method4235(); var20 != null;
                         var20 = (class56) field804.method4229()) {
                        if (var20.field555) {
                            var20.field555 = false;
                        } else {
                            class6.method67(var20, true, (short) 180);
                        }
                    }

                    field800 = new class204(512);

                    while (var4.offset < var17) {
                        var8 = var4.getInt();
                        var9 = var4.readUint16();
                        var10 = var4.readUint16();
                        var11 = var4.getInt();

                        for (int var12 = var9; var12 <= var10; ++var12) {
                            var13 = (long) var12 + ((long) var8 << 32);
                            field800.method4226(new class213(var11), var13);
                        }
                    }

                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2119 == var1.packetDescriptor) {
                    field889 = false;

                    for (var17 = 0; var17 < 5; ++var17) {
                        field890[var17] = false;
                    }

                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2118 == var1.packetDescriptor) {
                    class160.method3500(class173.field2317, (byte) 9);
                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2204 == var1.packetDescriptor) {
                    var17 = var4.method3792(322022840);
                    field803 = var17;
                    this.method1253(false, -1513331989);
                    class160.method3504(var17, 30895243);
                    class25.method480(field803, 1048567657);

                    for (var6 = 0; var6 < 100; ++var6) {
                        field848[var6] = true;
                    }

                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2162 == var1.packetDescriptor) {
                    if (class3.field26 != null) {
                        class3.field26.method5743(var4, (byte) 0);
                    }

                    class40.method760((byte) 99);
                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2139 == var1.packetDescriptor) {
                    class0.method11(1200659683);
                    var17 = var4.method3816((byte) 8);
                    var6 = var4.method3799(-1338629347);
                    var19 = var4.getUByte();
                    field777[var6] = var17;
                    field775[var6] = var19;
                    field776[var6] = 1;

                    for (var8 = 0; var8 < 98; ++var8) {
                        if (var17 >= class236.field2844[var8]) {
                            field776[var6] = var8 + 2;
                        }
                    }

                    field774[++field834 - 1 & 31] = var6;
                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2200 == var1.packetDescriptor) {
                    class277.method5493(var4.method3778(757967067), (byte) 110);
                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2156 == var1.packetDescriptor) {
                    if (var1.packetLength == 0) {
                        class3.field26 = null;
                    } else {
                        if (class3.field26 == null) {
                            class3.field26 = new class295(field920, class157.field2037);
                        }

                        class3.field26.method5742(var4, -1049135699);
                    }

                    class40.method760((byte) 89);
                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2169 == var1.packetDescriptor) {
                    byte[] var40 = new byte[var1.packetLength];
                    var4.method4058(var40, 0, var40.length, 479364060);
                    Buffer var48 = new Buffer(var40);
                    var41 = var48.method3778(87188092);
                    class138.method3291(var41, true, false, (short) 2500);
                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2160 == var1.packetDescriptor) {
                    var17 = var4.getUByte();
                    if (var4.getUByte() == 0) {
                        field895[var17] = new class4();
                        var4.offset += 18;
                    } else {
                        --var4.offset;
                        field895[var17] = new class4(var4, false);
                    }

                    field858 = field828;
                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2146 == var1.packetDescriptor) {
                    InboundPacketDescriptor.field2150.method1804((short) 22193);
                    field836 = field828;
                    var1.packetDescriptor = null;
                    return true;
                }

                long var23;
                long var25;
                if (InboundPacketDescriptor.field2127 == var1.packetDescriptor) {
                    var39 = var4.method3778(450809842);
                    var23 = (long) var4.readUint16();
                    var25 = (long) var4.method3773(-1119445886);
                    class244 var27 = (class244) class43
                        .method791(class6.method80(1865104037), var4.getUByte(),
                                   1443720514);
                    long var28 = (var23 << 32) + var25;
                    boolean var30 = false;

                    for (int var14 = 0; var14 < 100; ++var14) {
                        if (field840[var14] == var28) {
                            var30 = true;
                            break;
                        }
                    }

                    if (InboundPacketDescriptor.field2150.method1803(new class293(var39, field920), 1440386847)) {
                        var30 = true;
                    }

                    if (!var30 && field680 == 0) {
                        field840[field864] = var28;
                        field864 = (field864 + 1) % 100;
                        String var31 = class301.method5797(
                            class235.method4782(class22.method332(var4, (byte) 36), -438189605));
                        byte var47;
                        if (var27.field3188) {
                            var47 = 7;
                        } else {
                            var47 = 3;
                        }

                        if (var27.field3185 != -1) {
                            class59.method1163(var47, class19.method243(var27.field3185, -658064207)
                                + var39, var31, -1483885983);
                        } else {
                            class59.method1163(var47, var39, var31, -1483885983);
                        }
                    }

                    var1.packetDescriptor = null;
                    return true;
                }

                long var32;
                if (InboundPacketDescriptor.field2171 == var1.packetDescriptor) {
                    var39 = var4.method3778(-1715657417);
                    var23 = var4.method3775((byte) 127);
                    var25 = (long) var4.readUint16();
                    var32 = (long) var4.method3773(1345695968);
                    class244 var61 = (class244) class43
                        .method791(class6.method80(1462467692), var4.getUByte(),
                                   1443720514);
                    var13 = (var25 << 32) + var32;
                    boolean var15 = false;

                    for (int var16 = 0; var16 < 100; ++var16) {
                        if (field840[var16] == var13) {
                            var15 = true;
                            break;
                        }
                    }

                    if (var61.field3190 && InboundPacketDescriptor.field2150
                        .method1803(new class293(var39, field920), 1440386847)) {
                        var15 = true;
                    }

                    if (!var15 && field680 == 0) {
                        field840[field864] = var13;
                        field864 = (field864 + 1) % 100;
                        String var35 = class301.method5797(
                            class235.method4782(class22.method332(var4, (byte) 40), -888027686));
                        if (var61.field3185 != -1) {
                            class9.method104(9,
                                             class19.method243(var61.field3185, 1221265579) + var39,
                                             var35, class256.method5038(var23), (byte) 38);
                        } else {
                            class9
                                .method104(9, var39, var35, class256.method5038(var23), (byte) -35);
                        }
                    }

                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2155 == var1.packetDescriptor) {
                    var39 = var4.method3778(-221390434);
                    var18 = class301.method5797(
                        class235.method4782(class22.method332(var4, (byte) 41), -810357555));
                    class59.method1163(6, var39, var18, -1483885983);
                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2154 == var1.packetDescriptor) {
                    for (var17 = 0; var17 < class227.field2629.length; ++var17) {
                        if (class227.field2630[var17] != class227.field2629[var17]) {
                            class227.field2629[var17] = class227.field2630[var17];
                            class223.method4595(var17, -1750193407);
                            field653[++field830 - 1 & 31] = var17;
                        }
                    }

                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2122 == var1.packetDescriptor) {
                    var17 = var4.getInt();
                    if (var17 != field659) {
                        field659 = var17;
                        class12.method139(86433056);
                    }

                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2133 == var1.packetDescriptor) {
                    var52 = var4.method3776((byte) -86);
                    if (var52) {
                        if (class140.field1933 == null) {
                            class140.field1933 = new class253();
                        }
                    } else {
                        class140.field1933 = null;
                    }

                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2186 == var1.packetDescriptor) {
                    var17 = var4.getInt();
                    var6 = var4.getInt();
                    var19 = class177.method3695(-450458343);
                    OutboundPacket var54 = class131
                        .method3243(class171.field2218, field690.random, (byte) 10);
                    var54.buffer.method3796(var19, 255878030);
                    var54.buffer.writeByte(GameApplet.field434);
                    var54.buffer.method3893(var17, (byte) 101);
                    var54.buffer.method3813(var6, (byte) -65);
                    field690.method2193(var54, 1184581843);
                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2183 == var1.packetDescriptor) {
                    var17 = var4.method3883((byte) 54);
                    var6 = var4.method3883((byte) 34);
                    var41 = var4.method3778(-1360459030);
                    if (var6 >= 1 && var6 <= 8) {
                        if (var41.equalsIgnoreCase("null")) {
                            var41 = null;
                        }

                        field767[var6 - 1] = var41;
                        field768[var6 - 1] = var17 == 0;
                    }

                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2180 == var1.packetDescriptor) {
                    byte var49 = var4.method3968(1003182180);
                    var6 = var4.method3808(-2009327179);
                    class227.field2630[var6] = var49;
                    if (class227.field2629[var6] != var49) {
                        class227.field2629[var6] = var49;
                    }

                    class223.method4595(var6, -1750193407);
                    field653[++field830 - 1 & 31] = var6;
                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2193 == var1.packetDescriptor) {
                    InboundPacketDescriptor.field2150.method1753(var4, var1.packetLength, (byte) 2);
                    field836 = field828;
                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2132 == var1.packetDescriptor) {
                    class160.method3500(class173.field2323, (byte) 103);
                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2130 == var1.packetDescriptor) {
                    class160.method3500(class173.field2322, (byte) 19);
                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2165 == var1.packetDescriptor) {
                    var17 = var4.getInt();
                    var44 = var4.getUByte() == 1;
                    var7 = class18.method213(var17, -202720248);
                    if (var44 != var7.field2704) {
                        var7.field2704 = var44;
                        class37.method721(var7, 1238023037);
                    }

                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2137 == var1.packetDescriptor) {
                    var17 = var4.method3883((byte) 96);
                    var6 = var4.method3964(287627655);
                    var19 = var4.method3792(1220273656);
                    var20 = (class56) field804.method4224((long) var6);
                    if (var20 != null) {
                        class6.method67(var20, var19 != var20.field556, (short) 180);
                    }

                    class17.method209(var6, var19, var17, (byte) 76);
                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2143 == var1.packetDescriptor) {
                    class160.method3500(class173.field2329, (byte) 11);
                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2168 == var1.packetDescriptor) {
                    class11.decodeSceneRebuild(true, var1.field1283);
                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2189 == var1.packetDescriptor) {
                    field662 = var4.readUint16() * 30;
                    field685 = field828;
                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2205 == var1.packetDescriptor) {
                    var17 = var4.getUByte();
                    var6 = var4.getUByte();
                    var19 = var4.getUByte();
                    var8 = var4.getUByte();
                    field890[var17] = true;
                    field891[var17] = var6;
                    field892[var17] = var19;
                    field893[var17] = var8;
                    field894[var17] = 0;
                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2135 == var1.packetDescriptor) {
                    class53.method1082(true, var4, (byte) 41);
                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2185 == var1.packetDescriptor) {
                    class274.field3613 = class51
                        .method1060(var4.getUByte(), -1623033394);
                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2195 == var1.packetDescriptor) {
                    var17 = var4.method3816((byte) 8);
                    var6 = var4.method3808(-1465605393);
                    if (var6 == 65535) {
                        var6 = -1;
                    }

                    var19 = var4.method3772(464137265);
                    var8 = var4.readUint16();
                    if (var8 == 65535) {
                        var8 = -1;
                    }

                    for (var9 = var8; var9 <= var6; ++var9) {
                        var32 = ((long) var19 << 32) + (long) var9;
                        Node var34 = field800.method4224(var32);
                        if (var34 != null) {
                            var34.unlink();
                        }

                        field800.method4226(new class213(var17), var32);
                    }

                    var1.packetDescriptor = null;
                    return true;
                }

                if (InboundPacketDescriptor.field2198 == var1.packetDescriptor) {
                    class72.field1100 = var4.method3799(-1643157288);
                    class187.field2433 = var4.getUByte();

                    for (var17 = class187.field2433; var17 < class187.field2433 + 8; ++var17) {
                        for (var6 = class72.field1100; var6 < class72.field1100 + 8; ++var6) {
                            if (field829[class60.level][var17][var6] != null) {
                                field829[class60.level][var17][var6] = null;
                                class238.method4784(var17, var6, 1243558325);
                            }
                        }
                    }

                    for (class63 var38 = (class63) field688.method4298(); var38 != null;
                         var38 = (class63) field688.method4283()) {
                        if (var38.field922 >= class187.field2433
                            && var38.field922 < class187.field2433 + 8
                            && var38.field925 >= class72.field1100
                            && var38.field925 < class72.field1100 + 8
                            && var38.field934 == class60.level) {
                            var38.field933 = 0;
                        }
                    }

                    var1.packetDescriptor = null;
                    return true;
                }

                class80.method2041(
                    "" + (var1.packetDescriptor != null ? var1.packetDescriptor.field2202 : -1) + "," + (
                        var1.field1284 != null ? var1.field1284.field2202 : -1) + "," + (
                        var1.field1278 != null ? var1.field1278.field2202 : -1) + ","
                        + var1.packetLength, (Throwable) null, 1999033063);
                class74.method1987(-1932880481);
            } catch (IOException var36) {
                class19.method241(133898311);
            } catch (Exception var37) {
                var18 = "" + (var1.packetDescriptor != null ? var1.packetDescriptor.field2202 : -1) + "," + (
                    var1.field1284 != null ? var1.field1284.field2202 : -1) + "," + (
                    var1.field1278 != null ? var1.field1278.field2202 : -1) + "," + var1.packetLength
                    + "," + (class69.localPlayer.wx[0] + class49.sceneX) + "," + (
                    class69.localPlayer.wz[0] + class11.sceneZ) + ",";

                for (var19 = 0; var19 < var1.packetLength && var19 < 50; ++var19) {
                    var18 = var18 + var4.bytes[var19] + ",";
                }

                class80.method2041(var18, var37, 1974395110);
                class74.method1987(1460705646);
            }

            return true;
        }
    }

    final void method1620(int var1, int var2, int var3) {
        class56.method1108(var1, var2, -2031458819);
        class243.field3173.method3080(class60.level, var1, var2, false);
        field833 = true;
    }

    protected final void vmethod1238(int var1) {
        ++field655;
        this.method1241((byte) 94);
        class48.method1019((byte) 24);

        int var2;
        try {
            if (class219.field2529 == 1) {
                var2 = class193.field2461.method4403(1703023185);
                if (var2 > 0 && class193.field2461.method4492(-460345433)) {
                    var2 -= class0.field0;
                    if (var2 < 0) {
                        var2 = 0;
                    }

                    class193.field2461.method4426(var2, (byte) -86);
                } else {
                    class193.field2461.method4521((byte) 27);
                    class193.field2461.method4476((byte) 0);
                    if (class137.field1911 != null) {
                        class219.field2529 = 2;
                    } else {
                        class219.field2529 = 0;
                    }

                    class4.field39 = null;
                    class82.field1218 = null;
                }
            }
        } catch (Exception var65) {
            var65.printStackTrace();
            class193.field2461.method4521((byte) 27);
            class219.field2529 = 0;
            class4.field39 = null;
            class82.field1218 = null;
            class137.field1911 = null;
        }

        class160.method3502((byte) 102);
        class39 var48 = class39.field386;
        int var3;
        synchronized (class39.field386) {
            ++class39.field391;
            class39.field388 = class39.field390;
            class39.field387 = 0;
            if (class39.field383 >= 0) {
                while (class39.field374 != class39.field383) {
                    var3 = class39.field381[class39.field374];
                    class39.field374 = class39.field374 + 1 & 127;
                    if (var3 < 0) {
                        class39.field380[~var3] = false;
                    } else {
                        if (!class39.field380[var3]
                            && class39.field387 < class39.field377.length - 1) {
                            class39.field377[++class39.field387 - 1] = var3;
                        }

                        class39.field380[var3] = true;
                    }
                }
            } else {
                for (var3 = 0; var3 < 112; ++var3) {
                    class39.field380[var3] = false;
                }

                class39.field383 = class39.field374;
            }

            if (class39.field387 > 0) {
                class39.field391 = 0;
            }

            class39.field390 = class39.field389;
        }

        class48 var76 = class48.field470;
        synchronized (class48.field470) {
            class48.field469 = class48.field481;
            class48.field473 = class48.field466;
            class48.field464 = class48.field463 * -1727565463;
            class48.field472 = class48.field468;
            class48.field477 = class48.field471;
            class48.field478 = class48.field474;
            class48.field467 = class48.field475;
            class48.field465 = class48.field476;
            class48.field471 = 0;
        }

        if (ArchiveCache.field2076 != null) {
            var2 = ArchiveCache.field2076.vmethod3464((byte) 49);
            field841 = var2;
        }

        if (state == 0) {
            class82.method2068((byte) -41);
            GameApplet.field433.vmethod3534(2124397224);

            for (var2 = 0; var2 < 32; ++var2) {
                GameApplet.field429[var2] = 0L;
            }

            for (var2 = 0; var2 < 32; ++var2) {
                GameApplet.field444[var2] = 0L;
            }

            class181.field2363 = 0;
        } else if (state == 5) {
            class67.method1745(this, -1578974438);
            class82.method2068((byte) -55);
            GameApplet.field433.vmethod3534(494835073);

            for (var2 = 0; var2 < 32; ++var2) {
                GameApplet.field429[var2] = 0L;
            }

            for (var2 = 0; var2 < 32; ++var2) {
                GameApplet.field444[var2] = 0L;
            }

            class181.field2363 = 0;
        } else if (state != 10 && state != 11) {
            if (state == 20) {
                class67.method1745(this, -1578974438);
                this.method1244((byte) -101);
            } else if (state == 25) {
                class73.method1983(false, 1157110077);
                field696 = 0;
                boolean var68 = true;

                for (var3 = 0; var3 < IssacRandom.field2458.length; ++var3) {
                    if (class219.field2532[var3] != -1 && IssacRandom.field2458[var3] == null) {
                        IssacRandom.field2458[var3] = class332.index5
                            .method4831(class219.field2532[var3], 0, 1789634852);
                        if (IssacRandom.field2458[var3] == null) {
                            var68 = false;
                            ++field696;
                        }
                    }

                    if (class29.field295[var3] != -1 && BufferedFile.field1487[var3] == null) {
                        BufferedFile.field1487[var3] = class332.index5
                            .method4869(class29.field295[var3], 0, class250.field3247[var3],
                                        -1713663311);
                        if (BufferedFile.field1487[var3] == null) {
                            var68 = false;
                            ++field696;
                        }
                    }
                }

                if (!var68) {
                    field700 = 1;
                } else {
                    field753 = 0;
                    var68 = true;

                    int var6;
                    int var49;
                    for (var3 = 0; var3 < IssacRandom.field2458.length; ++var3) {
                        byte[] var4 = BufferedFile.field1487[var3];
                        if (var4 != null) {
                            var49 = (class37.field367[var3] >> 8) * 64 - class49.sceneX;
                            var6 = (class37.field367[var3] & 255) * 64 - class11.sceneZ;
                            if (instancedScene) {
                                var49 = 10;
                                var6 = 10;
                            }

                            var68 &= class193.method4099(var4, var49, var6, (byte) -42);
                        }
                    }

                    if (!var68) {
                        field700 = 2;
                    } else {
                        if (field700 != 0) {
                            class58.method1132(
                                "Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true,
                                1736315477);
                        }

                        class160.method3502((byte) 46);
                        class243.field3173.method3057();

                        for (var3 = 0; var3 < 4; ++var3) {
                            field701[var3].method3612(-1613750531);
                        }

                        int var50;
                        for (var3 = 0; var3 < 4; ++var3) {
                            for (var50 = 0; var50 < 104; ++var50) {
                                for (var49 = 0; var49 < 104; ++var49) {
                                    class50.field492[var3][var50][var49] = 0;
                                }
                            }
                        }

                        class160.method3502((byte) 112);
                        class50.field493 = 99;
                        class19.field188 = new byte[4][104][104];
                        class140.field1932 = new byte[4][104][104];
                        class50.field494 = new byte[4][104][104];
                        class8.field64 = new byte[4][104][104];
                        class55.field553 = new int[4][105][105];
                        class50.field503 = new byte[4][105][105];
                        class50.field496 = new int[105][105];
                        GameType.field3210 = new int[104];
                        class50.field510 = new int[104];
                        Buffer.field2408 = new int[104];
                        class297.field3739 = new int[104];
                        class289.field3707 = new int[104];
                        var3 = IssacRandom.field2458.length;
                        class148.method3368(-1407192095);
                        class73.method1983(true, 1157110077);
                        int var8;
                        int var9;
                        int var11;
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
                        int var22;
                        int var23;
                        int var52;
                        if (!instancedScene) {
                            var50 = 0;

                            label1352:
                            while (true) {
                                byte[] var7;
                                if (var50 >= var3) {
                                    for (var50 = 0; var50 < var3; ++var50) {
                                        var49 =
                                            (class37.field367[var50] >> 8) * 64 - class49.sceneX;
                                        var6 =
                                            (class37.field367[var50] & 255) * 64 - class11.sceneZ;
                                        var7 = IssacRandom.field2458[var50];
                                        if (var7 == null && ArchiveCache.field2075 < 800) {
                                            class160.method3502((byte) 42);
                                            class180.method3731(var49, var6, 64, 64, 2028470741);
                                        }
                                    }

                                    class73.method1983(true, 1157110077);
                                    var50 = 0;

                                    while (true) {
                                        if (var50 >= var3) {
                                            break label1352;
                                        }

                                        byte[] var5 = BufferedFile.field1487[var50];
                                        if (var5 != null) {
                                            var6 = (class37.field367[var50] >> 8) * 64
                                                - class49.sceneX;
                                            var52 = (class37.field367[var50] & 255) * 64
                                                - class11.sceneZ;
                                            class160.method3502((byte) 99);
                                            class127 var53 = class243.field3173;
                                            class166[] var54 = field701;
                                            Buffer var72 = new Buffer(var5);
                                            var11 = -1;

                                            while (true) {
                                                var12 = var72.method3784(-145581161);
                                                if (var12 == 0) {
                                                    break;
                                                }

                                                var11 += var12;
                                                var13 = 0;

                                                while (true) {
                                                    var14 = var72.method3783(-1628080529);
                                                    if (var14 == 0) {
                                                        break;
                                                    }

                                                    var13 += var14 - 1;
                                                    var15 = var13 & 63;
                                                    var16 = var13 >> 6 & 63;
                                                    var17 = var13 >> 12;
                                                    var18 = var72.getUByte();
                                                    var19 = var18 >> 2;
                                                    var20 = var18 & 3;
                                                    var21 = var16 + var6;
                                                    var22 = var52 + var15;
                                                    if (var21 > 0 && var22 > 0 && var21 < 103
                                                        && var22 < 103) {
                                                        var23 = var17;
                                                        if ((class50.field492[1][var21][var22] & 2)
                                                            == 2) {
                                                            var23 = var17 - 1;
                                                        }

                                                        class166 var24 = null;
                                                        if (var23 >= 0) {
                                                            var24 = var54[var23];
                                                        }

                                                        class23
                                                            .method381(var17, var21, var22, var11,
                                                                       var20, var19, var53, var24,
                                                                       (byte) 17);
                                                    }
                                                }
                                            }
                                        }

                                        ++var50;
                                    }
                                }

                                var49 = (class37.field367[var50] >> 8) * 64 - class49.sceneX;
                                var6 = (class37.field367[var50] & 255) * 64 - class11.sceneZ;
                                var7 = IssacRandom.field2458[var50];
                                if (var7 != null) {
                                    class160.method3502((byte) 59);
                                    var8 = class123.field1727 * 8 - 48;
                                    var9 = ArchiveCache.field2075 * 8 - 48;
                                    class166[] var10 = field701;
                                    var11 = 0;

                                    label1349:
                                    while (true) {
                                        if (var11 >= 4) {
                                            Buffer var51 = new Buffer(var7);
                                            var12 = 0;

                                            while (true) {
                                                if (var12 >= 4) {
                                                    break label1349;
                                                }

                                                for (var13 = 0; var13 < 64; ++var13) {
                                                    for (var14 = 0; var14 < 64; ++var14) {
                                                        class126
                                                            .method3053(var51, var12, var49 + var13,
                                                                        var6 + var14, var8, var9, 0,
                                                                        (byte) -41);
                                                    }
                                                }

                                                ++var12;
                                            }
                                        }

                                        for (var12 = 0; var12 < 64; ++var12) {
                                            for (var13 = 0; var13 < 64; ++var13) {
                                                if (var12 + var49 > 0 && var12 + var49 < 103
                                                    && var6 + var13 > 0 && var13 + var6 < 103) {
                                                    var10[var11].field2101[var12 + var49][var13
                                                        + var6] &= -16777217;
                                                }
                                            }
                                        }

                                        ++var11;
                                    }
                                }

                                ++var50;
                            }
                        }

                        int var55;
                        if (instancedScene) {
                            var50 = 0;

                            label1285:
                            while (true) {
                                if (var50 >= 4) {
                                    for (var50 = 0; var50 < 13; ++var50) {
                                        for (var49 = 0; var49 < 13; ++var49) {
                                            var6 = field703[0][var50][var49];
                                            if (var6 == -1) {
                                                class180.method3731(var50 * 8, var49 * 8, 8, 8,
                                                                    2054229378);
                                            }
                                        }
                                    }

                                    class73.method1983(true, 1157110077);
                                    var50 = 0;

                                    while (true) {
                                        if (var50 >= 4) {
                                            break label1285;
                                        }

                                        class160.method3502((byte) 117);

                                        for (var49 = 0; var49 < 13; ++var49) {
                                            for (var6 = 0; var6 < 13; ++var6) {
                                                var52 = field703[var50][var49][var6];
                                                if (var52 != -1) {
                                                    var8 = var52 >> 24 & 3;
                                                    var9 = var52 >> 1 & 3;
                                                    var55 = var52 >> 14 & 1023;
                                                    var11 = var52 >> 3 & 2047;
                                                    var12 = (var55 / 8 << 8) + var11 / 8;

                                                    for (var13 = 0; var13 < class37.field367.length;
                                                         ++var13) {
                                                        if (class37.field367[var13] == var12
                                                            && BufferedFile.field1487[var13] != null) {
                                                            class255.method5017(
                                                                BufferedFile.field1487[var13], var50,
                                                                var49 * 8, var6 * 8, var8,
                                                                (var55 & 7) * 8, (var11 & 7) * 8,
                                                                var9, class243.field3173, field701,
                                                                537434701);
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                        }

                                        ++var50;
                                    }
                                }

                                class160.method3502((byte) 121);

                                for (var49 = 0; var49 < 13; ++var49) {
                                    for (var6 = 0; var6 < 13; ++var6) {
                                        boolean var77 = false;
                                        var8 = field703[var50][var49][var6];
                                        if (var8 != -1) {
                                            var9 = var8 >> 24 & 3;
                                            var55 = var8 >> 1 & 3;
                                            var11 = var8 >> 14 & 1023;
                                            var12 = var8 >> 3 & 2047;
                                            var13 = (var11 / 8 << 8) + var12 / 8;

                                            for (var14 = 0; var14 < class37.field367.length;
                                                 ++var14) {
                                                if (class37.field367[var14] == var13
                                                    && IssacRandom.field2458[var14] != null) {
                                                    class262.method5145(IssacRandom.field2458[var14],
                                                                        var50, var49 * 8, var6 * 8,
                                                                        var9, (var11 & 7) * 8,
                                                                        (var12 & 7) * 8, var55,
                                                                        field701, (byte) 69);
                                                    var77 = true;
                                                    break;
                                                }
                                            }
                                        }

                                        if (!var77) {
                                            var9 = var50;
                                            var55 = var49 * 8;
                                            var11 = var6 * 8;

                                            for (var12 = 0; var12 < 8; ++var12) {
                                                for (var13 = 0; var13 < 8; ++var13) {
                                                    class50.field506[var9][var55 + var12][var13
                                                        + var11] = 0;
                                                }
                                            }

                                            if (var55 > 0) {
                                                for (var12 = 1; var12 < 8; ++var12) {
                                                    class50.field506[var9][var55][var12
                                                        + var11] = class50.field506[var9][var55
                                                        - 1][var12 + var11];
                                                }
                                            }

                                            if (var11 > 0) {
                                                for (var12 = 1; var12 < 8; ++var12) {
                                                    class50.field506[var9][var55
                                                        + var12][var11] = class50.field506[var9][
                                                        var12 + var55][var11 - 1];
                                                }
                                            }

                                            if (var55 > 0
                                                && class50.field506[var9][var55 - 1][var11] != 0) {
                                                class50.field506[var9][var55][var11] = class50.field506[var9][
                                                    var55 - 1][var11];
                                            } else if (var11 > 0
                                                && class50.field506[var9][var55][var11 - 1] != 0) {
                                                class50.field506[var9][var55][var11] = class50.field506[var9][var55][
                                                    var11 - 1];
                                            } else if (var55 > 0 && var11 > 0
                                                && class50.field506[var9][var55 - 1][var11 - 1]
                                                != 0) {
                                                class50.field506[var9][var55][var11] = class50.field506[var9][
                                                    var55 - 1][var11 - 1];
                                            }
                                        }
                                    }
                                }

                                ++var50;
                            }
                        }

                        class73.method1983(true, 1157110077);
                        class160.method3502((byte) 86);
                        class127 var66 = class243.field3173;
                        class166[] var67 = field701;

                        for (var6 = 0; var6 < 4; ++var6) {
                            for (var52 = 0; var52 < 104; ++var52) {
                                for (var8 = 0; var8 < 104; ++var8) {
                                    if ((class50.field492[var6][var52][var8] & 1) == 1) {
                                        var9 = var6;
                                        if ((class50.field492[1][var52][var8] & 2) == 2) {
                                            var9 = var6 - 1;
                                        }

                                        if (var9 >= 0) {
                                            var67[var9].method3615(var52, var8, -2092847794);
                                        }
                                    }
                                }
                            }
                        }

                        class50.field504 += (int) (Math.random() * 5.0D) - 2;
                        if (class50.field504 < -8) {
                            class50.field504 = -8;
                        }

                        if (class50.field504 > 8) {
                            class50.field504 = 8;
                        }

                        class50.field498 += (int) (Math.random() * 5.0D) - 2;
                        if (class50.field498 < -16) {
                            class50.field498 = -16;
                        }

                        if (class50.field498 > 16) {
                            class50.field498 = 16;
                        }

                        for (var6 = 0; var6 < 4; ++var6) {
                            byte[][] var69 = class50.field503[var6];
                            var13 = (int) Math.sqrt(5100.0D);
                            var14 = var13 * 768 >> 8;

                            int var56;
                            for (var15 = 1; var15 < 103; ++var15) {
                                for (var16 = 1; var16 < 103; ++var16) {
                                    var17 = class50.field506[var6][var16 + 1][var15]
                                        - class50.field506[var6][var16 - 1][var15];
                                    var18 = class50.field506[var6][var16][var15 + 1]
                                        - class50.field506[var6][var16][var15 - 1];
                                    var19 = (int) Math
                                        .sqrt((double) (var18 * var18 + var17 * var17 + 65536));
                                    var20 = (var17 << 8) / var19;
                                    var21 = 65536 / var19;
                                    var22 = (var18 << 8) / var19;
                                    var23 = (var20 * -50 + var22 * -50 + var21 * -10) / var14 + 96;
                                    var56 =
                                        (var69[var16 - 1][var15] >> 2) + (var69[var16][var15 - 1]
                                            >> 2) + (var69[var16 + 1][var15] >> 3) + (
                                            var69[var16][var15 + 1] >> 3) + (var69[var16][var15]
                                            >> 1);
                                    class50.field496[var16][var15] = var23 - var56;
                                }
                            }

                            for (var15 = 0; var15 < 104; ++var15) {
                                GameType.field3210[var15] = 0;
                                class50.field510[var15] = 0;
                                Buffer.field2408[var15] = 0;
                                class297.field3739[var15] = 0;
                                class289.field3707[var15] = 0;
                            }

                            for (var15 = -5; var15 < 109; ++var15) {
                                for (var16 = 0; var16 < 104; ++var16) {
                                    var17 = var15 + 5;
                                    if (var17 >= 0 && var17 < 104) {
                                        var18 = class19.field188[var6][var17][var16] & 255;
                                        if (var18 > 0) {
                                            class261 var57 = class24
                                                .method474(var18 - 1, -855287373);
                                            GameType.field3210[var16] += var57.field3361;
                                            class50.field510[var16] += var57.field3364;
                                            Buffer.field2408[var16] += var57.field3363;
                                            class297.field3739[var16] += var57.field3360;
                                            ++class289.field3707[var16];
                                        }
                                    }

                                    var18 = var15 - 5;
                                    if (var18 >= 0 && var18 < 104) {
                                        var19 = class19.field188[var6][var18][var16] & 255;
                                        if (var19 > 0) {
                                            class261 var58 = class24
                                                .method474(var19 - 1, -855287373);
                                            GameType.field3210[var16] -= var58.field3361;
                                            class50.field510[var16] -= var58.field3364;
                                            Buffer.field2408[var16] -= var58.field3363;
                                            class297.field3739[var16] -= var58.field3360;
                                            --class289.field3707[var16];
                                        }
                                    }
                                }

                                if (var15 >= 1 && var15 < 103) {
                                    var16 = 0;
                                    var17 = 0;
                                    var18 = 0;
                                    var19 = 0;
                                    var20 = 0;

                                    for (var21 = -5; var21 < 109; ++var21) {
                                        var22 = var21 + 5;
                                        if (var22 >= 0 && var22 < 104) {
                                            var16 += GameType.field3210[var22];
                                            var17 += class50.field510[var22];
                                            var18 += Buffer.field2408[var22];
                                            var19 += class297.field3739[var22];
                                            var20 += class289.field3707[var22];
                                        }

                                        var23 = var21 - 5;
                                        if (var23 >= 0 && var23 < 104) {
                                            var16 -= GameType.field3210[var23];
                                            var17 -= class50.field510[var23];
                                            var18 -= Buffer.field2408[var23];
                                            var19 -= class297.field3739[var23];
                                            var20 -= class289.field3707[var23];
                                        }

                                        if (var21 >= 1 && var21 < 103 && (!lowMemory
                                            || (class50.field492[0][var15][var21] & 2) != 0
                                            || (class50.field492[var6][var15][var21] & 16) == 0)) {
                                            if (var6 < class50.field493) {
                                                class50.field493 = var6;
                                            }

                                            var56 = class19.field188[var6][var15][var21] & 255;
                                            int var25 =
                                                class140.field1932[var6][var15][var21] & 255;
                                            if (var56 > 0 || var25 > 0) {
                                                int var26 = class50.field506[var6][var15][var21];
                                                int var27 = class50.field506[var6][var15
                                                    + 1][var21];
                                                int var28 = class50.field506[var6][var15 + 1][var21
                                                    + 1];
                                                int var29 = class50.field506[var6][var15][var21
                                                    + 1];
                                                int var30 = class50.field496[var15][var21];
                                                int var31 = class50.field496[var15 + 1][var21];
                                                int var32 = class50.field496[var15 + 1][var21 + 1];
                                                int var33 = class50.field496[var15][var21 + 1];
                                                int var34 = -1;
                                                int var35 = -1;
                                                int var36;
                                                int var37;
                                                int var38;
                                                if (var56 > 0) {
                                                    var36 = var16 * 256 / var19;
                                                    var37 = var17 / var20;
                                                    var38 = var18 / var20;
                                                    var34 = class269.method5238(var36, var37, var38,
                                                                                1434790423);
                                                    var36 = var36 + class50.field504 & 255;
                                                    var38 += class50.field498;
                                                    if (var38 < 0) {
                                                        var38 = 0;
                                                    } else if (var38 > 255) {
                                                        var38 = 255;
                                                    }

                                                    var35 = class269.method5238(var36, var37, var38,
                                                                                -1638053627);
                                                }

                                                class274 var39;
                                                if (var6 > 0) {
                                                    boolean var74 = true;
                                                    if (var56 == 0
                                                        && class50.field494[var6][var15][var21]
                                                        != 0) {
                                                        var74 = false;
                                                    }

                                                    if (var25 > 0) {
                                                        var38 = var25 - 1;
                                                        var39 = (class274) class274.field3601
                                                            .method4198((long) var38);
                                                        class274 var59;
                                                        if (var39 != null) {
                                                            var59 = var39;
                                                        } else {
                                                            byte[] var40 = class274.field3611
                                                                .method4831(4, var38, 1789634852);
                                                            var39 = new class274();
                                                            if (var40 != null) {
                                                                var39
                                                                    .method5452(new Buffer(var40),
                                                                                var38, (byte) -98);
                                                            }

                                                            var39.method5432((short) -32333);
                                                            class274.field3601
                                                                .method4204(var39, (long) var38);
                                                            var59 = var39;
                                                        }

                                                        if (!var59.field3602) {
                                                            var74 = false;
                                                        }
                                                    }

                                                    if (var74 && var27 == var26 && var26 == var28
                                                        && var29 == var26) {
                                                        class55.field553[var6][var15][var21] |= 2340;
                                                    }
                                                }

                                                var36 = 0;
                                                if (var35 != -1) {
                                                    var36 = class124.field1749[class236
                                                        .method4783(var35, 96, -1049257367)];
                                                }

                                                if (var25 == 0) {
                                                    var66.method3062(var6, var15, var21, 0, 0, -1,
                                                                     var26, var27, var28, var29,
                                                                     class236
                                                                         .method4783(var34, var30,
                                                                                     -294014886),
                                                                     class236
                                                                         .method4783(var34, var31,
                                                                                     -205045059),
                                                                     class236
                                                                         .method4783(var34, var32,
                                                                                     -399010109),
                                                                     class236
                                                                         .method4783(var34, var33,
                                                                                     -225194585), 0,
                                                                     0, 0, 0, var36, 0);
                                                } else {
                                                    var37 =
                                                        class50.field494[var6][var15][var21] + 1;
                                                    byte var75 = class8.field64[var6][var15][var21];
                                                    int var60 = var25 - 1;
                                                    class274 var41 = (class274) class274.field3601
                                                        .method4198((long) var60);
                                                    if (var41 != null) {
                                                        var39 = var41;
                                                    } else {
                                                        byte[] var42 = class274.field3611
                                                            .method4831(4, var60, 1789634852);
                                                        var41 = new class274();
                                                        if (var42 != null) {
                                                            var41.method5452(new Buffer(var42),
                                                                             var60, (byte) -47);
                                                        }

                                                        var41.method5432((short) 2206);
                                                        class274.field3601
                                                            .method4204(var41, (long) var60);
                                                        var39 = var41;
                                                    }

                                                    int var61 = var39.field3604;
                                                    int var43;
                                                    int var44;
                                                    int var45;
                                                    int var46;
                                                    if (var61 >= 0) {
                                                        var44 = class124.field1752
                                                            .vmethod3247(var61, -1482874371);
                                                        var43 = -1;
                                                    } else if (var39.field3603 == 16711935) {
                                                        var43 = -2;
                                                        var61 = -1;
                                                        var44 = -2;
                                                    } else {
                                                        var43 = class269.method5238(var39.field3607,
                                                                                    var39.field3608,
                                                                                    var39.field3610,
                                                                                    -1682274279);
                                                        var45 = var39.field3607 + class50.field504
                                                            & 255;
                                                        var46 = var39.field3610 + class50.field498;
                                                        if (var46 < 0) {
                                                            var46 = 0;
                                                        } else if (var46 > 255) {
                                                            var46 = 255;
                                                        }

                                                        var44 = class269
                                                            .method5238(var45, var39.field3608,
                                                                        var46, 1153106303);
                                                    }

                                                    var45 = 0;
                                                    if (var44 != -2) {
                                                        var45 = class124.field1749[class42
                                                            .method785(var44, 96, -2058004406)];
                                                    }

                                                    if (var39.field3606 != -1) {
                                                        var46 = var39.field3605 + class50.field504
                                                            & 255;
                                                        int var47 =
                                                            var39.field3612 + class50.field498;
                                                        if (var47 < 0) {
                                                            var47 = 0;
                                                        } else if (var47 > 255) {
                                                            var47 = 255;
                                                        }

                                                        var44 = class269
                                                            .method5238(var46, var39.field3609,
                                                                        var47, -2034041383);
                                                        var45 = class124.field1749[class42
                                                            .method785(var44, 96, -2079405032)];
                                                    }

                                                    var66.method3062(var6, var15, var21, var37,
                                                                     var75, var61, var26, var27,
                                                                     var28, var29, class236
                                                                         .method4783(var34, var30,
                                                                                     -473677528),
                                                                     class236
                                                                         .method4783(var34, var31,
                                                                                     -15181012),
                                                                     class236
                                                                         .method4783(var34, var32,
                                                                                     -1073267165),
                                                                     class236
                                                                         .method4783(var34, var33,
                                                                                     -1307831943),
                                                                     class42.method785(var43, var30,
                                                                                       -1846353187),
                                                                     class42.method785(var43, var31,
                                                                                       -1886125301),
                                                                     class42.method785(var43, var32,
                                                                                       -2131333828),
                                                                     class42.method785(var43, var33,
                                                                                       -1928538218),
                                                                     var36, var45);
                                                }
                                            }
                                        }
                                    }
                                }
                            }

                            for (var15 = 1; var15 < 103; ++var15) {
                                for (var16 = 1; var16 < 103; ++var16) {
                                    if ((class50.field492[var6][var16][var15] & 8) != 0) {
                                        var21 = 0;
                                    } else if (var6 > 0
                                        && (class50.field492[1][var16][var15] & 2) != 0) {
                                        var21 = var6 - 1;
                                    } else {
                                        var21 = var6;
                                    }

                                    var66.method3061(var6, var16, var15, var21);
                                }
                            }

                            class19.field188[var6] = null;
                            class140.field1932[var6] = null;
                            class50.field494[var6] = null;
                            class8.field64[var6] = null;
                            class50.field503[var6] = null;
                        }

                        var66.method3157(-50, -10, -50);

                        for (var6 = 0; var6 < 104; ++var6) {
                            for (var52 = 0; var52 < 104; ++var52) {
                                if ((class50.field492[1][var6][var52] & 2) == 2) {
                                    var66.method3059(var6, var52);
                                }
                            }
                        }

                        var6 = 1;
                        var52 = 2;
                        var8 = 4;

                        for (var9 = 0; var9 < 4; ++var9) {
                            if (var9 > 0) {
                                var6 <<= 3;
                                var52 <<= 3;
                                var8 <<= 3;
                            }

                            for (var55 = 0; var55 <= var9; ++var55) {
                                for (var11 = 0; var11 <= 104; ++var11) {
                                    for (var12 = 0; var12 <= 104; ++var12) {
                                        short var73;
                                        if ((class55.field553[var55][var12][var11] & var6) != 0) {
                                            var13 = var11;
                                            var14 = var11;
                                            var15 = var55;

                                            for (var16 = var55; var13 > 0 &&
                                                (class55.field553[var55][var12][var13 - 1] & var6)
                                                    != 0; --var13) {
                                                ;
                                            }

                                            while (var14 < 104 &&
                                                (class55.field553[var55][var12][var14 + 1] & var6)
                                                    != 0) {
                                                ++var14;
                                            }

                                            label936:
                                            while (var15 > 0) {
                                                for (var17 = var13; var17 <= var14; ++var17) {
                                                    if ((class55.field553[var15 - 1][var12][var17]
                                                        & var6) == 0) {
                                                        break label936;
                                                    }
                                                }

                                                --var15;
                                            }

                                            label925:
                                            while (var16 < var9) {
                                                for (var17 = var13; var17 <= var14; ++var17) {
                                                    if ((class55.field553[var16 + 1][var12][var17]
                                                        & var6) == 0) {
                                                        break label925;
                                                    }
                                                }

                                                ++var16;
                                            }

                                            var17 = (var14 - var13 + 1) * (var16 + 1 - var15);
                                            if (var17 >= 8) {
                                                var73 = 240;
                                                var19 =
                                                    class50.field506[var16][var12][var13] - var73;
                                                var20 = class50.field506[var15][var12][var13];
                                                class127
                                                    .method3060(var9, 1, var12 * 128, var12 * 128,
                                                                var13 * 128, var14 * 128 + 128,
                                                                var19, var20);

                                                for (var21 = var15; var21 <= var16; ++var21) {
                                                    for (var22 = var13; var22 <= var14; ++var22) {
                                                        class55.field553[var21][var12][var22] &= ~var6;
                                                    }
                                                }
                                            }
                                        }

                                        if ((class55.field553[var55][var12][var11] & var52) != 0) {
                                            var13 = var12;
                                            var14 = var12;
                                            var15 = var55;

                                            for (var16 = var55; var13 > 0 &&
                                                (class55.field553[var55][var13 - 1][var11] & var52)
                                                    != 0; --var13) {
                                                ;
                                            }

                                            while (var14 < 104 &&
                                                (class55.field553[var55][var14 + 1][var11] & var52)
                                                    != 0) {
                                                ++var14;
                                            }

                                            label989:
                                            while (var15 > 0) {
                                                for (var17 = var13; var17 <= var14; ++var17) {
                                                    if ((class55.field553[var15 - 1][var17][var11]
                                                        & var52) == 0) {
                                                        break label989;
                                                    }
                                                }

                                                --var15;
                                            }

                                            label978:
                                            while (var16 < var9) {
                                                for (var17 = var13; var17 <= var14; ++var17) {
                                                    if ((class55.field553[var16 + 1][var17][var11]
                                                        & var52) == 0) {
                                                        break label978;
                                                    }
                                                }

                                                ++var16;
                                            }

                                            var17 = (var14 - var13 + 1) * (var16 + 1 - var15);
                                            if (var17 >= 8) {
                                                var73 = 240;
                                                var19 =
                                                    class50.field506[var16][var13][var11] - var73;
                                                var20 = class50.field506[var15][var13][var11];
                                                class127.method3060(var9, 2, var13 * 128,
                                                                    var14 * 128 + 128, var11 * 128,
                                                                    var11 * 128, var19, var20);

                                                for (var21 = var15; var21 <= var16; ++var21) {
                                                    for (var22 = var13; var22 <= var14; ++var22) {
                                                        class55.field553[var21][var22][var11] &= ~var52;
                                                    }
                                                }
                                            }
                                        }

                                        if ((class55.field553[var55][var12][var11] & var8) != 0) {
                                            var13 = var12;
                                            var14 = var12;
                                            var15 = var11;

                                            for (var16 = var11; var15 > 0 &&
                                                (class55.field553[var55][var12][var15 - 1] & var8)
                                                    != 0; --var15) {
                                                ;
                                            }

                                            while (var16 < 104 &&
                                                (class55.field553[var55][var12][var16 + 1] & var8)
                                                    != 0) {
                                                ++var16;
                                            }

                                            label1042:
                                            while (var13 > 0) {
                                                for (var17 = var15; var17 <= var16; ++var17) {
                                                    if ((class55.field553[var55][var13 - 1][var17]
                                                        & var8) == 0) {
                                                        break label1042;
                                                    }
                                                }

                                                --var13;
                                            }

                                            label1031:
                                            while (var14 < 104) {
                                                for (var17 = var15; var17 <= var16; ++var17) {
                                                    if ((class55.field553[var55][var14 + 1][var17]
                                                        & var8) == 0) {
                                                        break label1031;
                                                    }
                                                }

                                                ++var14;
                                            }

                                            if ((var14 - var13 + 1) * (var16 - var15 + 1) >= 4) {
                                                var17 = class50.field506[var55][var13][var15];
                                                class127.method3060(var9, 4, var13 * 128,
                                                                    var14 * 128 + 128, var15 * 128,
                                                                    var16 * 128 + 128, var17,
                                                                    var17);

                                                for (var18 = var13; var18 <= var14; ++var18) {
                                                    for (var19 = var15; var19 <= var16; ++var19) {
                                                        class55.field553[var55][var18][var19] &= ~var8;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }

                        class73.method1983(true, 1157110077);
                        var6 = class50.field493;
                        if (var6 > class60.level) {
                            var6 = class60.level;
                        }

                        if (var6 < class60.level - 1) {
                            var6 = class60.level - 1;
                        }

                        if (lowMemory) {
                            class243.field3173.method3056(class50.field493);
                        } else {
                            class243.field3173.method3056(0);
                        }

                        for (var52 = 0; var52 < 104; ++var52) {
                            for (var8 = 0; var8 < 104; ++var8) {
                                class238.method4784(var52, var8, 1423162969);
                            }
                        }

                        class160.method3502((byte) 87);

                        for (class63 var70 = (class63) field688.method4298(); var70 != null;
                             var70 = (class63) field688.method4283()) {
                            if (var70.field933 == -1) {
                                var70.field932 = 0;
                                class43.method790(var70, (short) 24128);
                            } else {
                                var70.unlink();
                            }
                        }

                        class270.field3457.method4199();
                        OutboundPacket var71;
                        if (class157.field2037.method877(-1185681992)) {
                            var71 = class131
                                .method3243(class171.field2234, field690.random, (byte) 52);
                            var71.buffer.writeInt(1057001181);
                            field690.method2193(var71, -836706309);
                        }

                        if (!instancedScene) {
                            var52 = (class123.field1727 - 6) / 8;
                            var8 = (class123.field1727 + 6) / 8;
                            var9 = (ArchiveCache.field2075 - 6) / 8;
                            var55 = (ArchiveCache.field2075 + 6) / 8;

                            for (var11 = var52 - 1; var11 <= var8 + 1; ++var11) {
                                for (var12 = var9 - 1; var12 <= var55 + 1; ++var12) {
                                    if (var11 < var52 || var11 > var8 || var12 < var9
                                        || var12 > var55) {
                                        class332.index5
                                            .method4828("m" + var11 + "_" + var12, -883235884);
                                        class332.index5
                                            .method4828("l" + var11 + "_" + var12, -1421980957);
                                    }
                                }
                            }
                        }

                        class16.method202(30, -1194677662);
                        class160.method3502((byte) 15);
                        class19.field188 = null;
                        class140.field1932 = null;
                        class50.field494 = null;
                        class8.field64 = null;
                        class55.field553 = null;
                        class50.field503 = null;
                        class50.field496 = null;
                        GameType.field3210 = null;
                        class50.field510 = null;
                        Buffer.field2408 = null;
                        class297.field3739 = null;
                        class289.field3707 = null;
                        var71 = class131
                            .method3243(class171.field2283, field690.random, (byte) 26);
                        field690.method2193(var71, 144481344);
                        GameApplet.field433.vmethod3534(1516169808);

                        for (var8 = 0; var8 < 32; ++var8) {
                            GameApplet.field429[var8] = 0L;
                        }

                        for (var8 = 0; var8 < 32; ++var8) {
                            GameApplet.field444[var8] = 0L;
                        }

                        class181.field2363 = 0;
                    }
                }
            }
        } else {
            class67.method1745(this, -1578974438);
        }

        if (state == 30) {
            this.method1245(-1444491960);
        } else if (state == 40 || state == 45) {
            this.method1244((byte) -115);
        }

    }

    void method1242(int var1) {
        if (class252.field3277 >= 4) {
            this.method874("js5crc", -1814771923);
            state = 1000;
        } else {
            if (class252.field3278 >= 4) {
                if (state <= 5) {
                    this.method874("js5io", -1473957390);
                    state = 1000;
                    return;
                }

                field682 = 3000;
                class252.field3278 = 3;
            }

            if (--field682 + 1 <= 0) {
                try {
                    if (field674 == 0) {
                        class13.field106 = GameApplet.field426
                            .method3426(class10.field79, class144.field1947, 1279574555);
                        ++field674;
                    }

                    if (field674 == 1) {
                        if (class13.field106.field2007 == 2) {
                            this.method1243(-1, 645098888);
                            return;
                        }

                        if (class13.field106.field2007 == 1) {
                            ++field674;
                        }
                    }

                    if (field674 == 2) {
                        if (field822) {
                            BufferedFile.field1489 = class63
                                .method1657((Socket) class13.field106.field2011, 40000, 5000,
                                            -1134752844);
                        } else {
                            BufferedFile.field1489 = new class163((Socket) class13.field106.field2011,
                                                                  GameApplet.field426, 5000);
                        }

                        Buffer var2 = new Buffer(5);
                        var2.writeByte(15);
                        var2.writeInt(177);
                        BufferedFile.field1489.vmethod3578(var2.bytes, 0, 5, 1232195949);
                        ++field674;
                        class43.field411 = class120.method2866((short) 3133);
                    }

                    if (field674 == 3) {
                        if (BufferedFile.field1489.available((byte) 97) > 0
                            || !field822 && state <= 5) {
                            int var3 = BufferedFile.field1489.read();
                            if (var3 != 0) {
                                this.method1243(var3, -1053338686);
                                return;
                            }

                            ++field674;
                        } else if (class120.method2866((short) 3133) - class43.field411 > 30000L) {
                            this.method1243(-2, -48715008);
                            return;
                        }
                    }

                    if (field674 == 4) {
                        class16.method207(BufferedFile.field1489, state > 20, 61138025);
                        class13.field106 = null;
                        BufferedFile.field1489 = null;
                        field674 = 0;
                        field787 = 0;
                    }
                } catch (IOException var4) {
                    this.method1243(-3, 1016468132);
                }

            }
        }
    }

    final void method1433(int var1) {
        int var2;
        if (field803 != -1) {
            var2 = field803;
            if (class189.method4028(var2, 737442871)) {
                class53.method1077(class145.field1951[var2], -1, (byte) 35);
            }
        }

        for (var2 = 0; var2 < field853; ++var2) {
            if (field848[var2]) {
                field849[var2] = true;
            }

            field706[var2] = field848[var2];
            field848[var2] = false;
        }

        field847 = field655;
        field792 = -1;
        field860 = -1;
        class13.field104 = null;
        if (field803 != -1) {
            field853 = 0;
            class45.method828(field803, 0, 0, class68.windowWidth, class141.windowHeight, 0, 0, -1,
                              (byte) 105);
        }

        class319.method6037();
        if (field748) {
            if (field759 == 1) {
                class144.field1945[field809 / 100].method6164(field744 - 8, field745 - 8);
            }

            if (field759 == 2) {
                class144.field1945[field809 / 100 + 4].method6164(field744 - 8, field745 - 8);
            }
        }

        int var3;
        int var4;
        if (!field833) {
            if (field792 != -1) {
                var2 = field792;
                var3 = field860;
                if ((field780 >= 2 || field796 != 0 || field798) && field791) {
                    var4 = field780 - 1;
                    String var6;
                    if (field796 == 1 && field780 < 2) {
                        var6 = "Use" + " " + field766 + " " + "->";
                    } else if (field798 && field780 < 2) {
                        var6 = field801 + " " + field716 + " " + "->";
                    } else {
                        var6 = class34.method644(var4, (byte) -28);
                    }

                    if (field780 > 2) {
                        var6 = var6 + class128.method3233(16777215, 389618335) + " " + '/' + " " + (
                            field780 - 2) + " more options";
                    }

                    class163.field2066
                        .method5828(var6, var2 + 4, var3 + 15, 16777215, 0, field655 / 1000);
                }
            }
        } else {
            var2 = class163.field2067;
            var3 = class86.field1260;
            var4 = class74.field1113;
            int var5 = class128.field1838;
            int var12 = 6116423;
            class319.method6047(var2, var3, var4, var5, var12);
            class319.method6047(var2 + 1, var3 + 1, var4 - 2, 16, 0);
            class319.method6116(var2 + 1, var3 + 18, var4 - 2, var5 - 19, 0);
            class163.field2066.method5846("Choose Option", var2 + 3, var3 + 14, var12, -1);
            int var7 = class48.field473;
            int var8 = class48.field464 * -976212263;

            for (int var9 = 0; var9 < field780; ++var9) {
                int var10 = var3 + (field780 - 1 - var9) * 15 + 31;
                int var11 = 16777215;
                if (var7 > var2 && var7 < var4 + var2 && var8 > var10 - 13 && var8 < var10 + 3) {
                    var11 = 16776960;
                }

                class163.field2066
                    .method5846(class34.method644(var9, (byte) -117), var2 + 3, var10, var11, 0);
            }

            class227.method4641(class163.field2067, class86.field1260, class74.field1113,
                                class128.field1838, (byte) 0);
        }

        if (field855 == 3) {
            for (var2 = 0; var2 < field853; ++var2) {
                if (field706[var2]) {
                    class319
                        .method6046(field763[var2], field852[var2], field819[var2], field854[var2],
                                    16711935, 128);
                } else if (field849[var2]) {
                    class319
                        .method6046(field763[var2], field852[var2], field819[var2], field854[var2],
                                    16711680, 128);
                }
            }
        }

        class21.method322(class60.level, class69.localPlayer.x, class69.localPlayer.z,
                          field705, 671784664);
        field705 = 0;
    }

    protected final void vmethod1248(int var1) {
        field870 = class120.method2866((short) 3133) + 500L;
        this.method1359(-1117322195);
        if (field803 != -1) {
            this.method1253(true, -1412898674);
        }

    }

    protected final void vmethod1239(boolean var1, int var2) {
        boolean var3 = class180.method3733(-1861885701);
        if (var3 && field879 && field882 != null) {
            field882.method2348(-455003753);
        }

        if ((state == 10 || state == 20 || state == 30) && 0L != field870
            && class120.method2866((short) 3133) > field870) {
            class27.method513(class17.getWindowMode());
        }

        int var4;
        if (var1) {
            for (var4 = 0; var4 < 100; ++var4) {
                field848[var4] = true;
            }
        }

        if (state == 0) {
            this.method872(class79.field1158, class79.field1159, var1, 6388472);
        } else if (state == 5) {
            class136
                .method3267(class163.field2066, class18.field175, class3.field25, var1, (byte) -30);
        } else if (state != 10 && state != 11) {
            if (state == 20) {
                class136.method3267(class163.field2066, class18.field175, class3.field25, var1,
                                    (byte) 33);
            } else if (state == 25) {
                if (field700 == 1) {
                    if (field696 > field697) {
                        field697 = field696;
                    }

                    var4 = (field697 * 50 - field696 * 50) / field697;
                    class58.method1132("Loading - please wait." + "<br>" + " (" + var4 + "%" + ")",
                                       false, 1607335939);
                } else if (field700 == 2) {
                    if (field753 > field909) {
                        field909 = field753;
                    }

                    var4 = (field909 * 50 - field753 * 50) / field909 + 50;
                    class58.method1132("Loading - please wait." + "<br>" + " (" + var4 + "%" + ")",
                                       false, 2065954488);
                } else {
                    class58.method1132("Loading - please wait.", false, 1776678419);
                }
            } else if (state == 30) {
                this.method1433(-1609657926);
            } else if (state == 40) {
                class58.method1132(
                    "Connection lost" + "<br>" + "Please wait - attempting to reestablish", false,
                    1486743673);
            } else if (state == 45) {
                class58.method1132("Please wait...", false, 2032487175);
            }
        } else {
            class136
                .method3267(class163.field2066, class18.field175, class3.field25, var1, (byte) 23);
        }

        if (state == 30 && field855 == 0 && !var1 && !resizable) {
            for (var4 = 0; var4 < field853; ++var4) {
                if (field849[var4]) {
                    class30.field313
                        .vmethod6123(field763[var4], field852[var4], field819[var4], field854[var4],
                                     -1234412621);
                    field849[var4] = false;
                }
            }
        } else if (state > 0) {
            class30.field313.vmethod6120(0, 0, 1823224425);

            for (var4 = 0; var4 < field853; ++var4) {
                field849[var4] = false;
            }
        }

    }

    final void method1245(int var1) {
        if (field662 > 1) {
            --field662;
        }

        if (field725 > 0) {
            --field725;
        }

        if (field692) {
            field692 = false;
            class19.method241(-904767418);
        } else {
            if (!field833) {
                class14.method163(103740146);
            }

            int var2;
            for (var2 = 0; var2 < 100 && this.method1249(field690, -1570039626); ++var2) {
                ;
            }

            if (state == 30) {
                int var3;
                OutboundPacket var15;
                while (class67.method1749((byte) 72)) {
                    var15 = class131.method3243(class171.field2298, field690.random, (byte) 47);
                    var15.buffer.writeByte(0);
                    var3 = var15.buffer.offset;
                    class218.method4370(var15.buffer, (byte) 38);
                    var15.buffer.method3766(var15.buffer.offset - var3, (byte) -83);
                    field690.method2193(var15, 176546216);
                }

                if (field904.field3680) {
                    var15 = class131.method3243(class171.field2257, field690.random, (byte) 40);
                    var15.buffer.writeByte(0);
                    var3 = var15.buffer.offset;
                    field904.method5507(var15.buffer, (byte) 110);
                    var15.buffer.method3766(var15.buffer.offset - var3, (byte) -19);
                    field690.method2193(var15, 1022413819);
                    field904.method5505(1613481433);
                }

                Object var33 = class36.field347.field581;
                int var4;
                int var5;
                int var6;
                int var7;
                int var8;
                int var9;
                int var10;
                int var11;
                int var12;
                int var13;
                synchronized (class36.field347.field581) {
                    if (!field856) {
                        class36.field347.field580 = 0;
                    } else if (class48.field477 != 0 || class36.field347.field580 >= 40) {
                        OutboundPacket var16 = null;
                        var4 = 0;
                        var5 = 0;
                        var6 = 0;
                        var7 = 0;

                        for (var8 = 0; var8 < class36.field347.field580 && (var16 == null
                            || var16.buffer.offset - var4 < 246); ++var8) {
                            var5 = var8;
                            var9 = class36.field347.field584[var8];
                            if (var9 < -1) {
                                var9 = -1;
                            } else if (var9 > 65534) {
                                var9 = 65534;
                            }

                            var10 = class36.field347.field585[var8];
                            if (var10 < -1) {
                                var10 = -1;
                            } else if (var10 > 65534) {
                                var10 = 65534;
                            }

                            if (var10 != field735 || var9 != field643) {
                                if (var16 == null) {
                                    var16 = class131
                                        .method3243(class171.field2272, field690.random,
                                                    (byte) 30);
                                    var16.buffer.writeByte(0);
                                    var4 = var16.buffer.offset;
                                    var16.buffer.offset += 2;
                                    var6 = 0;
                                    var7 = 0;
                                }

                                if (-1L != field814) {
                                    var11 = var10 - field735;
                                    var12 = var9 - field643;
                                    var13 = (int) ((class36.field347.field582[var8] - field814)
                                        / 20L);
                                    var6 = (int) ((long) var6
                                        + (class36.field347.field582[var8] - field814) % 20L);
                                } else {
                                    var11 = var10;
                                    var12 = var9;
                                    var13 = Integer.MAX_VALUE;
                                }

                                field735 = var10;
                                field643 = var9;
                                if (var13 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32
                                    && var12 <= 31) {
                                    var11 += 32;
                                    var12 += 32;
                                    var16.buffer.writeShort((var13 << 12) + var12 + (var11 << 6)
                                                           );
                                } else if (var13 < 32 && var11 >= -128 && var11 <= 127
                                    && var12 >= -128 && var12 <= 127) {
                                    var11 += 128;
                                    var12 += 128;
                                    var16.buffer.writeByte(var13 + 128);
                                    var16.buffer.writeShort(var12 + (var11 << 8));
                                } else if (var13 < 32) {
                                    var16.buffer.writeByte(var13 + 192);
                                    if (var10 != -1 && var9 != -1) {
                                        var16.buffer.writeInt(var10 | var9 << 16);
                                    } else {
                                        var16.buffer.writeInt(Integer.MIN_VALUE);
                                    }
                                } else {
                                    var16.buffer.writeShort((var13 & 8191) + 57344);
                                    if (var10 != -1 && var9 != -1) {
                                        var16.buffer.writeInt(var10 | var9 << 16);
                                    } else {
                                        var16.buffer.writeInt(Integer.MIN_VALUE);
                                    }
                                }

                                ++var7;
                                field814 = class36.field347.field582[var8];
                            }
                        }

                        if (var16 != null) {
                            var16.buffer
                                .method3766(var16.buffer.offset - var4, (byte) -43);
                            var8 = var16.buffer.offset;
                            var16.buffer.offset = var4;
                            var16.buffer.writeByte(var6 / var7);
                            var16.buffer.writeByte(var6 % var7);
                            var16.buffer.offset = var8;
                            field690.method2193(var16, 1924442555);
                        }

                        if (var5 >= class36.field347.field580) {
                            class36.field347.field580 = 0;
                        } else {
                            class36.field347.field580 -= var5;
                            System.arraycopy(class36.field347.field585, var5,
                                             class36.field347.field585, 0,
                                             class36.field347.field580);
                            System.arraycopy(class36.field347.field584, var5,
                                             class36.field347.field584, 0,
                                             class36.field347.field580);
                            System.arraycopy(class36.field347.field582, var5,
                                             class36.field347.field582, 0,
                                             class36.field347.field580);
                        }
                    }
                }

                if (class48.field477 == 1 || !class14.field132 && class48.field477 == 4
                    || class48.field477 == 2) {
                    long var17 = (class48.field465 - field656) / 50L;
                    if (var17 > 4095L) {
                        var17 = 4095L;
                    }

                    field656 = class48.field465;
                    var4 = class48.field467;
                    if (var4 < 0) {
                        var4 = 0;
                    } else if (var4 > class141.windowHeight) {
                        var4 = class141.windowHeight;
                    }

                    var5 = class48.field478;
                    if (var5 < 0) {
                        var5 = 0;
                    } else if (var5 > class68.windowWidth) {
                        var5 = class68.windowWidth;
                    }

                    var6 = (int) var17;
                    OutboundPacket var19 = class131
                        .method3243(class171.field2303, field690.random, (byte) 91);
                    var19.buffer
                        .writeShort((class48.field477 == 2 ? 1 : 0) + (var6 << 1));
                    var19.buffer.writeShort(var5);
                    var19.buffer.writeShort(var4);
                    field690.method2193(var19, 1283896706);
                }

                if (class39.field387 > 0) {
                    var15 = class131.method3243(class171.field2274, field690.random, (byte) 114);
                    var15.buffer.writeShort(0);
                    var3 = var15.buffer.offset;
                    long var20 = class120.method2866((short) 3133);

                    for (var6 = 0; var6 < class39.field387; ++var6) {
                        long var22 = var20 - field868;
                        if (var22 > 16777215L) {
                            var22 = 16777215L;
                        }

                        field868 = var20;
                        var15.buffer.method3796(class39.field377[var6], -497003256);
                        var15.buffer.method3755((int) var22, -2039192361);
                    }

                    var15.buffer.writeLengthShort(var15.buffer.offset - var3);
                    field690.method2193(var15, -361978414);
                }

                if (field727 > 0) {
                    --field727;
                }

                if (class39.field380[96] || class39.field380[97] || class39.field380[98]
                    || class39.field380[99]) {
                    field728 = true;
                }

                if (field728 && field727 <= 0) {
                    field727 = 20;
                    field728 = false;
                    var15 = class131.method3243(class171.field2269, field690.random, (byte) 85);
                    var15.buffer.method3806(field712, -963832924);
                    var15.buffer.method3869(field658, (byte) 1);
                    field690.method2193(var15, 2015684064);
                }

                if (class167.field2111 && !field919) {
                    field919 = true;
                    var15 = class131.method3243(class171.field2241, field690.random, (byte) 77);
                    var15.buffer.writeByte(1);
                    field690.method2193(var15, 513944186);
                }

                if (!class167.field2111 && field919) {
                    field919 = false;
                    var15 = class131.method3243(class171.field2241, field690.random, (byte) 55);
                    var15.buffer.writeByte(0);
                    field690.method2193(var15, 224703724);
                }

                if (class45.field418 != null) {
                    class45.field418.method6352(2102363020);
                }

                if (class22.field221) {
                    if (class3.field26 != null) {
                        class3.field26.method5601((short) 710);
                    }

                    for (var2 = 0; var2 < class83.field1226; ++var2) {
                        Player var36 = players[class83.field1222[var2]];
                        var36.method1186((byte) 3);
                    }

                    class22.field221 = false;
                }

                class13.method143(1754378417);
                if (state == 30) {
                    class25.method476(1527680135);

                    for (var2 = 0; var2 < field905; ++var2) {
                        --field793[var2];
                        if (field793[var2] >= -10) {
                            class93 var37 = field710[var2];
                            if (var37 == null) {
                                Object var10000 = null;
                                var37 = class93.method2275(class9.index4, field884[var2], 0);
                                if (var37 == null) {
                                    continue;
                                }

                                field793[var2] += var37.method2274();
                                field710[var2] = var37;
                            }

                            if (field793[var2] < 0) {
                                if (field887[var2] != 0) {
                                    var5 = (field887[var2] & 255) * 128;
                                    var6 = field887[var2] >> 16 & 255;
                                    var7 = var6 * 128 + 64 - class69.localPlayer.x;
                                    if (var7 < 0) {
                                        var7 = -var7;
                                    }

                                    var8 = field887[var2] >> 8 & 255;
                                    var9 = var8 * 128 + 64 - class69.localPlayer.z;
                                    if (var9 < 0) {
                                        var9 = -var9;
                                    }

                                    var10 = var9 + var7 - 128;
                                    if (var10 > var5) {
                                        field793[var2] = -100;
                                        continue;
                                    }

                                    if (var10 < 0) {
                                        var10 = 0;
                                    }

                                    var4 = (var5 - var10) * field881 / var5;
                                } else {
                                    var4 = field888;
                                }

                                if (var4 > 0) {
                                    class95 var24 = var37.method2281()
                                                         .method2322(class286.field3697);
                                    class105 var25 = class105.method2479(var24, 100, var4);
                                    var25.method2471(field885[var2] - 1);
                                    class43.field413.method2215(var25);
                                }

                                field793[var2] = -100;
                            }
                        } else {
                            --field905;

                            for (var3 = var2; var3 < field905; ++var3) {
                                field884[var3] = field884[var3 + 1];
                                field710[var3] = field710[var3 + 1];
                                field885[var3] = field885[var3 + 1];
                                field793[var3] = field793[var3 + 1];
                                field887[var3] = field887[var3 + 1];
                            }

                            --var2;
                        }
                    }

                    if (field879 && !class10.method117(1304326593)) {
                        if (field877 != 0 && field878 != -1) {
                            class161.method3528(InboundPacketDescriptor.index6, field878, 0, field877, false,
                                                (byte) 0);
                        }

                        field879 = false;
                    }

                    ++field690.field1287;
                    if (field690.field1287 > 750) {
                        class19.method241(-821283074);
                    } else {
                        class66.method1696(668319697);
                        class80.method2053(-48774980);
                        int[] var34 = class83.field1222;

                        for (var3 = 0; var3 < class83.field1226; ++var3) {
                            Player var26 = players[var34[var3]];
                            if (var26 != null && var26.field981 > 0) {
                                --var26.field981;
                                if (var26.field981 == 0) {
                                    var26.field968 = null;
                                }
                            }
                        }

                        for (var3 = 0; var3 < field686; ++var3) {
                            var4 = field687[var3];
                            class73 var40 = field806[var4];
                            if (var40 != null && var40.field981 > 0) {
                                --var40.field981;
                                if (var40.field981 == 0) {
                                    var40.field968 = null;
                                }
                            }
                        }

                        ++field705;
                        if (field759 != 0) {
                            field809 += 20;
                            if (field809 >= 400) {
                                field759 = 0;
                            }
                        }

                        if (class179.field2357 != null) {
                            ++field749;
                            if (field749 >= 15) {
                                class37.method721(class179.field2357, 1238023037);
                                class179.field2357 = null;
                            }
                        }

                        class232 var35 = class153.field1993;
                        class232 var38 = class50.field495;
                        class153.field1993 = null;
                        class50.field495 = null;
                        field811 = null;
                        field824 = false;
                        field821 = false;
                        field865 = 0;

                        while (class283.method5540(-206655980) && field865 < 128) {
                            if (rights >= 2 && class39.field380[82] && class59.field598 == 66) {
                                String var41 = "";

                                class59 var39;
                                for (Iterator var42 = class85.field1249.iterator(); var42.hasNext();
                                     var41 = var41 + var39.field591 + ':' + var39.field588 + '\n') {
                                    var39 = (class59) var42.next();
                                }

                                class157.field2037.method863(var41, -1782360205);
                            } else if (field718 != 1 || class131.field1856 <= 0) {
                                field867[field865] = class59.field598;
                                field846[field865] = class131.field1856;
                                ++field865;
                            }
                        }

                        if (class52.method1072((byte) -45) && class39.field380[82]
                            && class39.field380[81] && field841 != 0) {
                            var4 = class69.localPlayer.level - field841;
                            if (var4 < 0) {
                                var4 = 0;
                            } else if (var4 > 3) {
                                var4 = 3;
                            }

                            if (var4 != class69.localPlayer.level) {
                                class49.method1023(class69.localPlayer.wx[0] + class49.sceneX,
                                                   class69.localPlayer.wz[0] + class11.sceneZ,
                                                   var4, false, -1440028749);
                            }

                            field841 = 0;
                        }

                        if (field803 != -1) {
                            class6
                                .method82(field803, 0, 0, class68.windowWidth, class141.windowHeight, 0,
                                          0, 1188891119);
                        }

                        ++field828;

                        while (true) {
                            class232 var43;
                            class232 var44;
                            class57 var45;
                            do {
                                var45 = (class57) field843.method4279();
                                if (var45 == null) {
                                    while (true) {
                                        do {
                                            var45 = (class57) field844.method4279();
                                            if (var45 == null) {
                                                while (true) {
                                                    do {
                                                        var45 = (class57) field842.method4279();
                                                        if (var45 == null) {
                                                            this.method1334((byte) 6);
                                                            class168.method3649(1248667532);
                                                            if (field816 != null) {
                                                                this.method1350(1017314199);
                                                            }

                                                            OutboundPacket var46;
                                                            if (class66.field1025 != null) {
                                                                class37.method721(class66.field1025,
                                                                                  1238023037);
                                                                ++field756;
                                                                if (class48.field469 == 0) {
                                                                    if (field673) {
                                                                        if (class66.field1025
                                                                            == class13.field104
                                                                            && field797
                                                                            != field751) {
                                                                            class232 var47 = class66.field1025;
                                                                            byte var30 = 0;
                                                                            if (field808 == 1
                                                                                && var47.field2741
                                                                                == 206) {
                                                                                var30 = 1;
                                                                            }

                                                                            if (var47.field2762[field797]
                                                                                <= 0) {
                                                                                var30 = 0;
                                                                            }

                                                                            if (InboundPacketDescriptor
                                                                                .method3653(
                                                                                class254.method5000(
                                                                                    var47,
                                                                                    2114912176),
                                                                                -2038382372)) {
                                                                                var6 = field751;
                                                                                var7 = field797;
                                                                                var47.field2762[var7] = var47.field2762[var6];
                                                                                var47.field2792[var7] = var47.field2792[var6];
                                                                                var47.field2762[var6] = -1;
                                                                                var47.field2792[var6] = 0;
                                                                            } else if (var30 == 1) {
                                                                                var6 = field751;
                                                                                var7 = field797;

                                                                                while (var6
                                                                                    != var7) {
                                                                                    if (var6
                                                                                        > var7) {
                                                                                        var47
                                                                                            .method4706(
                                                                                                var6
                                                                                                    - 1,
                                                                                                var6,
                                                                                                (byte) -106);
                                                                                        --var6;
                                                                                    } else if (var6
                                                                                        < var7) {
                                                                                        var47
                                                                                            .method4706(
                                                                                                var6
                                                                                                    + 1,
                                                                                                var6,
                                                                                                (byte) -91);
                                                                                        ++var6;
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                var47.method4706(
                                                                                    field797,
                                                                                    field751,
                                                                                    (byte) -100);
                                                                            }

                                                                            var46 = class131
                                                                                .method3243(
                                                                                    class171.field2287,
                                                                                    field690.random,
                                                                                    (byte) 84);
                                                                            var46.buffer
                                                                                .writeShort(
                                                                                    field797
                                                                                           );
                                                                            var46.buffer
                                                                                .method3869(
                                                                                    field751,
                                                                                    (byte) 1);
                                                                            var46.buffer
                                                                                .writeInt(
                                                                                    class66.field1025.field2770
                                                                                         );
                                                                            var46.buffer
                                                                                .method3796(var30,
                                                                                            1622174450);
                                                                            field690
                                                                                .method2193(var46,
                                                                                            227554983);
                                                                        }
                                                                    } else if (this
                                                                        .method1251(-975793761)) {
                                                                        this.method1620(field752,
                                                                                        field845,
                                                                                        -1045755197);
                                                                    } else if (field780 > 0) {
                                                                        class45.method826(field752,
                                                                                          field845,
                                                                                          -1259821027);
                                                                    }

                                                                    field749 = 10;
                                                                    class48.field477 = 0;
                                                                    class66.field1025 = null;
                                                                } else if (field756 >= 5 && (
                                                                    class48.field473 > field752 + 5
                                                                        || class48.field473
                                                                        < field752 - 5 ||
                                                                        class48.field464
                                                                            * -976212263
                                                                            > field845 + 5 ||
                                                                        class48.field464
                                                                            * -976212263
                                                                            < field845 - 5)) {
                                                                    field673 = true;
                                                                }
                                                            }

                                                            if (class127.method3109()) {
                                                                var4 = class127.field1785;
                                                                var5 = class127.field1805;
                                                                var46 = class131
                                                                    .method3243(class171.field2222,
                                                                                field690.random,
                                                                                (byte) 22);
                                                                var46.buffer
                                                                    .writeByte(5);
                                                                var46.buffer.method3887(
                                                                    var5 + class11.sceneZ,
                                                                    289154243);
                                                                var46.buffer.method3887(
                                                                    var4 + class49.sceneX,
                                                                    289154243);
                                                                var46.buffer.method3795(
                                                                    class39.field380[82] ? (
                                                                        class39.field380[81] ? 2
                                                                            : 1) : 0, 506308590);
                                                                field690
                                                                    .method2193(var46, 1656137107);
                                                                class127.method3097();
                                                                field744 = class48.field478;
                                                                field745 = class48.field467;
                                                                field759 = 1;
                                                                field809 = 0;
                                                                field722 = var4;
                                                                field875 = var5;
                                                            }

                                                            if (var35 != class153.field1993) {
                                                                if (var35 != null) {
                                                                    class37.method721(var35,
                                                                                      1238023037);
                                                                }

                                                                if (class153.field1993 != null) {
                                                                    class37.method721(
                                                                        class153.field1993,
                                                                        1238023037);
                                                                }
                                                            }

                                                            if (var38 != class50.field495
                                                                && field795 == field794) {
                                                                if (var38 != null) {
                                                                    class37.method721(var38,
                                                                                      1238023037);
                                                                }

                                                                if (class50.field495 != null) {
                                                                    class37
                                                                        .method721(class50.field495,
                                                                                   1238023037);
                                                                }
                                                            }

                                                            if (class50.field495 != null) {
                                                                if (field794 < field795) {
                                                                    ++field794;
                                                                    if (field795 == field794) {
                                                                        class37.method721(
                                                                            class50.field495,
                                                                            1238023037);
                                                                    }
                                                                }
                                                            } else if (field794 > 0) {
                                                                --field794;
                                                            }

                                                            if (field718 == 0) {
                                                                var4 = class69.localPlayer.x;
                                                                var5 = class69.localPlayer.z;
                                                                if (class9.field68 - var4 < -500
                                                                    || class9.field68 - var4 > 500
                                                                    || class9.field70 - var5 < -500
                                                                    || class9.field70 - var5
                                                                    > 500) {
                                                                    class9.field68 = var4;
                                                                    class9.field70 = var5;
                                                                }

                                                                if (var4 != class9.field68) {
                                                                    class9.field68 +=
                                                                        (var4 - class9.field68)
                                                                            / 16;
                                                                }

                                                                if (var5 != class9.field70) {
                                                                    class9.field70 +=
                                                                        (var5 - class9.field70)
                                                                            / 16;
                                                                }

                                                                var6 = class9.field68 >> 7;
                                                                var7 = class9.field70 >> 7;
                                                                var8 = class152
                                                                    .method3394(class9.field68,
                                                                                class9.field70,
                                                                                class60.level,
                                                                                (byte) 22);
                                                                var9 = 0;
                                                                if (var6 > 3 && var7 > 3
                                                                    && var6 < 100 && var7 < 100) {
                                                                    for (var10 = var6 - 4;
                                                                         var10 <= var6 + 4;
                                                                         ++var10) {
                                                                        for (var11 = var7 - 4;
                                                                             var11 <= var7 + 4;
                                                                             ++var11) {
                                                                            var12 = class60.level;
                                                                            if (var12 < 3 &&
                                                                                (class50.field492[1][var10][var11]
                                                                                    & 2) == 2) {
                                                                                ++var12;
                                                                            }

                                                                            var13 = var8
                                                                                - class50.field506[var12][var10][var11];
                                                                            if (var13 > var9) {
                                                                                var9 = var13;
                                                                            }
                                                                        }
                                                                    }
                                                                }

                                                                var10 = var9 * 192;
                                                                if (var10 > 98048) {
                                                                    var10 = 98048;
                                                                }

                                                                if (var10 < 32768) {
                                                                    var10 = 32768;
                                                                }

                                                                if (var10 > field729) {
                                                                    field729 +=
                                                                        (var10 - field729) / 24;
                                                                } else if (var10 < field729) {
                                                                    field729 +=
                                                                        (var10 - field729) / 80;
                                                                }

                                                                class122.field1717 = class152
                                                                    .method3394(
                                                                        class69.localPlayer.x,
                                                                        class69.localPlayer.z,
                                                                        class60.level, (byte) 32)
                                                                    - field719;
                                                            } else if (field718 == 1) {
                                                                if (field726
                                                                    && class69.localPlayer != null) {
                                                                    var4 = class69.localPlayer.wx[0];
                                                                    var5 = class69.localPlayer.wz[0];
                                                                    if (var4 >= 0 && var5 >= 0
                                                                        && var4 < 104
                                                                        && var5 < 104) {
                                                                        class9.field68 = class69.localPlayer.x;
                                                                        var6 = class152.method3394(
                                                                            class69.localPlayer.x,
                                                                            class69.localPlayer.z,
                                                                            class60.level,
                                                                            (byte) 91) - field719;
                                                                        if (var6
                                                                            < class122.field1717) {
                                                                            class122.field1717 = var6;
                                                                        }

                                                                        class9.field70 = class69.localPlayer.z;
                                                                        field726 = false;
                                                                    }
                                                                }

                                                                short var31 = -1;
                                                                if (class39.field380[33]) {
                                                                    var31 = 0;
                                                                } else if (class39.field380[49]) {
                                                                    var31 = 1024;
                                                                }

                                                                if (class39.field380[48]) {
                                                                    if (var31 == 0) {
                                                                        var31 = 1792;
                                                                    } else if (var31 == 1024) {
                                                                        var31 = 1280;
                                                                    } else {
                                                                        var31 = 1536;
                                                                    }
                                                                } else if (class39.field380[50]) {
                                                                    if (var31 == 0) {
                                                                        var31 = 256;
                                                                    } else if (var31 == 1024) {
                                                                        var31 = 768;
                                                                    } else {
                                                                        var31 = 512;
                                                                    }
                                                                }

                                                                byte var32 = 0;
                                                                if (class39.field380[35]) {
                                                                    var32 = -1;
                                                                } else if (class39.field380[51]) {
                                                                    var32 = 1;
                                                                }

                                                                var6 = 0;
                                                                if (var31 >= 0 || var32 != 0) {
                                                                    var6 = class39.field380[81]
                                                                        ? field724 : field723;
                                                                    var6 *= 16;
                                                                    field721 = var31;
                                                                    field857 = var32;
                                                                }

                                                                if (field707 < var6) {
                                                                    field707 += var6 / 8;
                                                                    if (field707 > var6) {
                                                                        field707 = var6;
                                                                    }
                                                                } else if (field707 > var6) {
                                                                    field707 = field707 * 9 / 10;
                                                                }

                                                                if (field707 > 0) {
                                                                    var7 = field707 / 16;
                                                                    if (field721 >= 0) {
                                                                        var4 = field721
                                                                            - class15.field143
                                                                            & 2047;
                                                                        var8 = class124.field1747[var4];
                                                                        var9 = class124.field1754[var4];
                                                                        class9.field68 +=
                                                                            var7 * var8 / 65536;
                                                                        class9.field70 +=
                                                                            var7 * var9 / 65536;
                                                                    }

                                                                    if (field857 != 0) {
                                                                        class122.field1717 +=
                                                                            var7 * field857;
                                                                        if (class122.field1717
                                                                            > 0) {
                                                                            class122.field1717 = 0;
                                                                        }
                                                                    }
                                                                } else {
                                                                    field721 = -1;
                                                                    field857 = -1;
                                                                }

                                                                if (class39.field380[13]) {
                                                                    field690.method2193(class131
                                                                                            .method3243(
                                                                                                class171.field2285,
                                                                                                field690.random,
                                                                                                (byte) 66),
                                                                                        -267179244);
                                                                    field718 = 0;
                                                                }
                                                            }

                                                            if (class48.field469 == 4
                                                                && class14.field132) {
                                                                var4 = class48.field464 * -976212263
                                                                    - field717;
                                                                field715 = var4 * 2;
                                                                field717 = var4 != -1 && var4 != 1 ?
                                                                    (class48.field464 * -976212263
                                                                        + field717) / 2
                                                                    : class48.field464 * -976212263;
                                                                var5 = field869 - class48.field473;
                                                                field714 = var5 * 2;
                                                                field869 = var5 != -1 && var5 != 1 ?
                                                                    (field869 + class48.field473)
                                                                        / 2 : class48.field473;
                                                            } else {
                                                                if (class39.field380[96]) {
                                                                    field714 +=
                                                                        (-24 - field714) / 2;
                                                                } else if (class39.field380[97]) {
                                                                    field714 += (24 - field714) / 2;
                                                                } else {
                                                                    field714 /= 2;
                                                                }

                                                                if (class39.field380[98]) {
                                                                    field715 += (12 - field715) / 2;
                                                                } else if (class39.field380[99]) {
                                                                    field715 +=
                                                                        (-12 - field715) / 2;
                                                                } else {
                                                                    field715 /= 2;
                                                                }

                                                                field717 =
                                                                    class48.field464 * -976212263;
                                                                field869 = class48.field473;
                                                            }

                                                            field658 =
                                                                field714 / 2 + field658 & 2047;
                                                            field712 += field715 / 2;
                                                            if (field712 < 128) {
                                                                field712 = 128;
                                                            }

                                                            if (field712 > 383) {
                                                                field712 = 383;
                                                            }

                                                            if (field889) {
                                                                class12.method136(761124161);
                                                            }

                                                            for (var4 = 0; var4 < 5; ++var4) {
                                                                ++field894[var4];
                                                            }

                                                            class36.field348
                                                                .method2090(-1253575751);
                                                            var4 = ++class48.field484 - 1;
                                                            var6 = class39.field391;
                                                            OutboundPacket var27;
                                                            if (var4 > 15000 && var6 > 15000) {
                                                                field725 = 250;
                                                                class86
                                                                    .method2165(14500, -1005276116);
                                                                var27 = class131
                                                                    .method3243(class171.field2256,
                                                                                field690.random,
                                                                                (byte) 35);
                                                                field690
                                                                    .method2193(var27, -975321643);
                                                            }

                                                            InboundPacketDescriptor.field2150
                                                                .method1823(337164100);
                                                            ++field690.field1288;
                                                            if (field690.field1288 > 50) {
                                                                var27 = class131
                                                                    .method3243(class171.field2224,
                                                                                field690.random,
                                                                                (byte) 52);
                                                                field690
                                                                    .method2193(var27, 2076546194);
                                                            }

                                                            try {
                                                                field690.method2187(-954705971);
                                                            } catch (IOException var28) {
                                                                class19.method241(-1318760553);
                                                            }

                                                            return;
                                                        }

                                                        var43 = var45.field570;
                                                        if (var43.field2787 < 0) {
                                                            break;
                                                        }

                                                        var44 = class18.method213(var43.field2700,
                                                                                  -2109758774);
                                                    } while (var44 == null
                                                        || var44.field2791 == null
                                                        || var43.field2787 >= var44.field2791.length
                                                        || var43
                                                        != var44.field2791[var43.field2787]);

                                                    class53.method1076(var45, -1980099112);
                                                }
                                            }

                                            var43 = var45.field570;
                                            if (var43.field2787 < 0) {
                                                break;
                                            }

                                            var44 = class18.method213(var43.field2700, -1239309703);
                                        } while (var44 == null || var44.field2791 == null
                                            || var43.field2787 >= var44.field2791.length
                                            || var43 != var44.field2791[var43.field2787]);

                                        class53.method1076(var45, -1735307479);
                                    }
                                }

                                var43 = var45.field570;
                                if (var43.field2787 < 0) {
                                    break;
                                }

                                var44 = class18.method213(var43.field2700, -65414404);
                            } while (var44 == null || var44.field2791 == null
                                || var43.field2787 >= var44.field2791.length
                                || var43 != var44.field2791[var43.field2787]);

                            class53.method1076(var45, -1105771219);
                        }
                    }
                }
            }
        }
    }

    final void method1244(byte var1) {
        class159 var2 = field690.method2192((byte) 110);
        PacketBuffer var3 = field690.field1283;

        try {
            if (loginStage == 0) {
                if (class12.random == null && (field683.method2058((byte) 16)
                    || field678 > 250)) {
                    class12.random = field683.method2059((byte) 11);
                    field683.method2057(-1772925853);
                    field683 = null;
                }

                if (class12.random != null) {
                    if (var2 != null) {
                        var2.vmethod3558(-1280846470);
                        var2 = null;
                    }

                    class138.field1924 = null;
                    field692 = false;
                    field678 = 0;
                    loginStage = 1;
                }
            }

            if (loginStage == 1) {
                if (class138.field1924 == null) {
                    class138.field1924 = GameApplet.field426
                        .method3426(class10.field79, class144.field1947, 1279574555);
                }

                if (class138.field1924.field2007 == 2) {
                    throw new IOException();
                }

                if (class138.field1924.field2007 == 1) {
                    if (field822) {
                        Socket var5 = (Socket) class138.field1924.field2011;
                        class161 var4 = new class161(var5, 40000, 5000);
                        var2 = var4;
                    } else {
                        var2 = new class163((Socket) class138.field1924.field2011, GameApplet.field426,
                                            5000);
                    }

                    field690.method2189(var2, -2117622518);
                    class138.field1924 = null;
                    loginStage = 2;
                }
            }

            if (loginStage == 2) {
                field690.method2194();
                OutboundPacket var22 = class150.method3375(-1430107657);
                var22.buffer.writeByte(HandshakePacket.field2313.field2314);
                field690.method2193(var22, 435901602);
                field690.method2187(674114064);
                var3.offset = 0;
                loginStage = 3;
            }

            boolean var13;
            int var14;
            if (loginStage == 3) {
                if (field882 != null) {
                    field882.method2347(2091249766);
                }

                if (class6.field46 != null) {
                    class6.field46.method2347(-323052465);
                }

                var13 = true;
                if (field822 && !var2.isReadable(1, -1086705871)) {
                    var13 = false;
                }

                if (var13) {
                    var14 = var2.read();
                    if (field882 != null) {
                        field882.method2347(-1786198214);
                    }

                    if (class6.field46 != null) {
                        class6.field46.method2347(1470942608);
                    }

                    if (var14 != 0) {
                        BufferedFile.method2713(var14, -710973299);
                        return;
                    }

                    var3.offset = 0;
                    loginStage = 4;
                }
            }

            int var34;
            if (loginStage == 4) {
                if (var3.offset < 8) {
                    var34 = var2.available((byte) 106);
                    if (var34 > 8 - var3.offset) {
                        var34 = 8 - var3.offset;
                    }

                    if (var34 > 0) {
                        var2
                            .read(var3.bytes, var3.offset, var34);
                        var3.offset += var34;
                    }
                }

                if (var3.offset == 8) {
                    var3.offset = 0;
                    class1.key = var3.method3775((byte) 127);
                    loginStage = 5;
                }
            }

            int var8;
            int var10;
            int start;
            if (loginStage == 5) {
                field690.field1283.offset = 0;
                field690.method2194();
                PacketBuffer encrypted = new PacketBuffer(500);
                int[] keys = new int[]{
                    class12.random.nextInt(),
                    class12.random.nextInt(),
                    class12.random.nextInt(),
                    class12.random.nextInt()
                };
                encrypted.offset = 0;
                //encrypted.writeByte(1);
                encrypted.writeInt(keys[0]);
                encrypted.writeInt(keys[1]);
                encrypted.writeInt(keys[2]);
                encrypted.writeInt(keys[3]);
                encrypted.writeLong(class1.key);
                int var11;
                if (state == 40) {
                    //encrypted.writeInt(class85.field1251[0]);
                    //encrypted.writeInt(class85.field1251[1]);
                    //encrypted.writeInt(class85.field1251[2]);
                    //encrypted.writeInt(class85.field1251[3]);
                } else {
                    /*
                    encrypted.writeByte(field681.vmethod6130((byte) 1));
                    switch (field681.field1968) {
                        case 0:
                        case 3:
                            encrypted.method3755(class60.field604, -1616226405);
                            ++encrypted.offset;
                            break;
                        case 1:
                            encrypted.offset += 4;
                            break;
                        case 2:
                            LinkedHashMap var7 = class47.field435.field1028;
                            String var9 = class79.username;
                            var10 = var9.length();
                            var11 = 0;

                            for (int var12 = 0; var12 < var10; ++var12) {
                                var11 = (var11 << 5) - var11 + var9.charAt(var12);
                            }

                            encrypted
                                .writeInt(((Integer) var7.get(Integer.valueOf(var11))).intValue()
                                         );
                    }
                    */

                    //encrypted.writeByte(class312.field3828.vmethod6130((byte) 1));
                    encrypted.writeString(class79.password);
                }

                encrypted.encipherRsa(class77.EXPONENT_RSA, class77.MODULUS_RSA);

                class85.encryptionKey = keys;
                OutboundPacket var6 = class150.method3375(129097749);
                var6.buffer.offset = 0;
                if (state == 40) {
                    var6.buffer.writeByte(HandshakePacket.field2312.field2314);
                } else {
                    var6.buffer.writeByte(HandshakePacket.field2311.field2314);
                }

                var6.buffer.writeShort(0);
                start = var6.buffer.offset;
                var6.buffer.writeInt(177);
                //var6.buffer.writeInt(1);
                //var6.buffer.writeByte(unknown0);
                var6.buffer.writeBytes(encrypted.bytes, 0, encrypted.offset);
                var8 = var6.buffer.offset;
                var6.buffer.writeString(class79.username);
                var6.buffer.writeByte((resizable ? 1 : 0) << 1 | (lowMemory ? 1 : 0));
                //var6.buffer.writeShort(class68.windowWidth);
                //var6.buffer.writeShort(class141.windowHeight);
                //class256.writeUid(var6.buffer);
                //var6.buffer.writeString(class6.parameters);
                //var6.buffer.writeInt(affiliateId);
                //Buffer var32 = new Buffer(class61.computerInfo.length(767632853)); TODO
                //class61.computerInfo.write(var32, 1328377164);
                //var6.buffer.writeBytes(var32.bytes, 0, var32.bytes.length);
                //var6.buffer.writeByte(unknown0);
                //var6.buffer.writeInt(0);
                var6.buffer.writeInt(class19.index0.checksum);
                var6.buffer.writeInt(class42.index1.checksum);
                var6.buffer.writeInt(class50.index2.checksum);
                var6.buffer.writeInt(class157.index3.checksum);
                var6.buffer.writeInt(class9.index4.checksum);
                var6.buffer.writeInt(class332.index5.checksum);
                var6.buffer.writeInt(InboundPacketDescriptor.index6.checksum);
                var6.buffer.writeInt(class10.index7.checksum);
                var6.buffer.writeInt(class154.index8.checksum);
                var6.buffer.writeInt(class17.index9.checksum);
                var6.buffer.writeInt(class12.index10.checksum);
                var6.buffer.writeInt(IssacRandom.index11.checksum);
                var6.buffer.writeInt(class137.index12.checksum);
                var6.buffer.writeInt(class71.index13.checksum);
                var6.buffer.writeInt(class27.index14.checksum);
                var6.buffer.writeInt(class270.index15.checksum);
                var6.buffer.writeInt(class159.index16.checksum);
                var6.buffer.writeInt(class145.index17.checksum);
                // var6.buffer.encipherXtea(keys, var8, var6.buffer.offset, (byte) 0); TODO
                var6.buffer.writeLengthShort(var6.buffer.offset - start);
                field690.method2193(var6, -905846558);
                field690.method2187(-726591838);
                field690.random = new IssacRandom(keys);
                int[] var16 = new int[4];

                for (var11 = 0; var11 < 4; ++var11) {
                    var16[var11] = keys[var11] + 50;
                }

                var3.initializeRandom(var16, (byte) -27);
                loginStage = 6;
            }

            if (loginStage == 6 && var2.available((byte) 11) > 0) {
                int status = var2.read();
                if (status == 21 && state == 20) {
                    loginStage = 9;
                } else if (status == 2) {
                    loginStage = 11;
                } else if (status == 15 && state == 40) {
                    field690.packetLength = -1;
                    loginStage = 16;
                } else if (status == 64) {
                    loginStage = 7;
                } else if (status == 23 && field679 < 1) {
                    ++field679;
                    loginStage = 0;
                } else {
                    if (status != 29) {
                        BufferedFile.method2713(status, 128048600);
                        return;
                    }

                    loginStage = 14;
                }
            }

            if (loginStage == 7 && var2.available((byte) 112) > 0) {
                class188.field2438 = var2.read();
                loginStage = 8;
            }

            if (loginStage == 8 && var2.available((byte) 12) >= class188.field2438) {
                var2.read(var3.bytes, 0, class188.field2438);
                var3.offset = 0;
                loginStage = 6;
            }

            if (loginStage == 9 && var2.available((byte) 56) > 0) {
                field760 = (var2.read() + 3) * 60;
                loginStage = 10;
            }

            if (loginStage == 10) {
                field678 = 0;
                class185.method4006("You have only just left another world.",
                                    "Your profile will be transferred in:",
                                    field760 / 60 + " seconds.", 2013199226);
                if (--field760 <= 0) {
                    loginStage = 0;
                }

            } else {
                if (loginStage == 11 && var2.available((byte) 78) >= 1) {
                    class271.len = var2.read();
                    loginStage = 12;
                }

                boolean var35;
                if (loginStage == 12 && var2.available((byte) 81) >= class271.len) {
                    //boolean zzz = var2.read(-803995166) == 1;
                    //var2.read(var3.bytes, 0, 4, -887854775);
                    var3.offset = 0;
                    var35 = false;
                    /*if (zzz) {
                        var14 = var3.readEncipheredUInt8((byte) -32) << 24;
                        var14 |= var3.readEncipheredUInt8((byte) -80) << 16;
                        var14 |= var3.readEncipheredUInt8((byte) -19) << 8;
                        var14 |= var3.readEncipheredUInt8((byte) 12);
                        String var31 = class79.username;
                        var8 = var31.length();
                        int var17 = 0;
                        var10 = 0;

                        while (true) {
                            if (var10 >= var8) {
                                if (GameApplet.field435.field1028.size() >= 10
                                    && !GameApplet.field435.field1028
                                    .containsKey(Integer.valueOf(var17))) {
                                    Iterator var33 = GameApplet.field435.field1028.entrySet()
                                                                                  .iterator();
                                    var33.next();
                                    var33.remove();
                                }

                                GameApplet.field435.field1028
                                    .put(Integer.valueOf(var17), Integer.valueOf(var14));
                                break;
                            }

                            var17 = (var17 << 5) - var17 + var31.charAt(var10);
                            ++var10;
                        }
                    }*/

                    if (field746) {
                        GameApplet.field435.field1034 = class79.username;
                    } else {
                        GameApplet.field435.field1034 = null;
                    }

                    Player.writePreferences();
                    rights = var2.read();
                    field863 = var2.read() == 1;
                    localPlayerId = var2.read();
                    localPlayerId <<= 8;
                    localPlayerId += var2.read();
                    field761 = var2.read();
                    var2.read(var3.bytes, 0, 1);
                    var3.offset = 0;
                    InboundPacketDescriptor[] packets = class63.getInboundPackets(816105871);
                    int packetId = var3.readEncipheredShort(-711467529);
                    if (packetId < 0 || packetId >= packets.length) {
                        throw new IOException(packetId + " " + var3.offset);
                    }

                    field690.packetDescriptor = packets[packetId];
                    field690.packetLength = field690.packetDescriptor.length;
                    var2.read(var3.bytes, 0, 2);
                    var3.offset = 0;
                    field690.packetLength = var3.readUint16();

                    try {
                        Javascript.call(class157.field2037, "zap");
                    } catch (Throwable var20) {
                        ;
                    }

                    loginStage = 13;
                }

                if (loginStage == 13) {
                    if (var2.available((byte) 9) < field690.packetLength) {
                        return;
                    }
                    var3.offset = 0;
                    var2.read(var3.bytes, 0, field690.packetLength);
                    field904.method5504(701070702);
                    field656 = -1L;
                    class36.field347.field580 = 0;
                    class167.field2111 = true;
                    field919 = true;
                    field868 = -1L;
                    class247.method4821((byte) 102);
                    field690.method2194();
                    field690.field1283.offset = 0;
                    field690.packetDescriptor = null;
                    field690.field1295 = null;
                    field690.field1284 = null;
                    field690.field1278 = null;
                    field690.packetLength = 0;
                    field690.field1287 = 0;
                    field662 = 0;
                    field725 = 0;
                    field663 = 0;
                    field780 = 0;
                    field833 = false;
                    class86.method2165(0, -1830031577);
                    class85.field1248.clear();
                    class85.field1249.method4178();
                    class85.field1247.method4350();
                    class85.field1246 = 0;
                    field796 = 0;
                    field798 = false;
                    field905 = 0;
                    field658 = 0;
                    field718 = 0;
                    class140.field1933 = null;
                    field876 = 0;
                    field661 = -1;
                    field722 = 0;
                    field875 = 0;
                    field671 = class78.field1134;
                    field672 = class78.field1134;
                    field686 = 0;
                    class62.method1233(1078004710);

                    for (var34 = 0; var34 < 2048; ++var34) {
                        players[var34] = null;
                    }

                    for (var34 = 0; var34 < 32768; ++var34) {
                        field806[var34] = null;
                    }

                    field769 = -1;
                    field773.method4275();
                    field711.method4275();

                    int var18;
                    for (var34 = 0; var34 < 4; ++var34) {
                        for (var14 = 0; var14 < 104; ++var14) {
                            for (var18 = 0; var18 < 104; ++var18) {
                                field829[var34][var14][var18] = null;
                            }
                        }
                    }

                    field688 = new class207();
                    InboundPacketDescriptor.field2150.method1755(-1601565488);

                    for (var34 = 0; var34 < class256.field3302; ++var34) {
                        class256 var27 = class142.method3328(var34, (byte) -9);
                        if (var27 != null) {
                            class227.field2630[var34] = 0;
                            class227.field2629[var34] = 0;
                        }
                    }

                    class36.field348.method2108(-1414439942);
                    field813 = -1;
                    if (field803 != -1) {
                        var34 = field803;
                        if (var34 != -1 && class148.field1970[var34]) {
                            class232.field2757.method4843(var34, -2078847420);
                            if (class145.field1951[var34] != null) {
                                var35 = true;

                                for (var18 = 0; var18 < class145.field1951[var34].length;
                                     ++var18) {
                                    if (class145.field1951[var34][var18] != null) {
                                        if (class145.field1951[var34][var18].field2808 != 2) {
                                            class145.field1951[var34][var18] = null;
                                        } else {
                                            var35 = false;
                                        }
                                    }
                                }

                                if (var35) {
                                    class145.field1951[var34] = null;
                                }

                                class148.field1970[var34] = false;
                            }
                        }
                    }

                    for (class56 var24 = (class56) field804.method4235(); var24 != null;
                         var24 = (class56) field804.method4229()) {
                        class6.method67(var24, true, (short) 180);
                    }

                    field803 = -1;
                    field804 = new class204(8);
                    field880 = null;
                    field780 = 0;
                    field833 = false;
                    field908.method4664((int[]) null, new int[]{0, 0, 0, 0, 0}, false, -1,
                                        978549285);

                    for (var34 = 0; var34 < 8; ++var34) {
                        field767[var34] = null;
                        field768[var34] = false;
                    }

                    class12.method125(1775551761);
                    field654 = true;

                    for (var34 = 0; var34 < 100; ++var34) {
                        field848[var34] = true;
                    }

                    class70.method1948(1280140142);
                    class3.field26 = null;

                    for (var34 = 0; var34 < 8; ++var34) {
                        field895[var34] = new class4();
                    }

                    class59.field590 = null;
                    class260.decodePlayerPositioning(var3);
                    class123.field1727 = -1;
                    class11.decodeSceneRebuild(false, var3);
                    field690.packetDescriptor = null;

                } else {
                    if (loginStage == 14 && var2.available((byte) 91) >= 2) {
                        var3.offset = 0;
                        var2.read(var3.bytes, 0, 2);
                        var3.offset = 0;
                        class1.field5 = var3.readUint16();
                        loginStage = 15;
                    }

                    if (loginStage == 15
                        && var2.available((byte) 105) >= class1.field5) {
                        var3.offset = 0;
                        var2.read(var3.bytes, 0, class1.field5);
                        var3.offset = 0;
                        String var26 = var3.method3778(-1049738239);
                        String var28 = var3.method3778(586497954);
                        String var30 = var3.method3778(-1430474982);
                        class185.method4006(var26, var28, var30, 1843693184);
                        class16.method202(10, -1194677662);
                    }

                    if (loginStage == 16) {
                        if (field690.packetLength == -1) {
                            if (var2.available((byte) 121) < 2) {
                                return;
                            }

                            var2.read(var3.bytes, 0, 2);
                            var3.offset = 0;
                            field690.packetLength = var3.readUint16();
                        }

                        if (var2.available((byte) 14) >= field690.packetLength) {
                            var2
                                .read(var3.bytes, 0, field690.packetLength);
                            var3.offset = 0;
                            var34 = field690.packetLength;
                            field904.method5501((byte) 1);
                            class2.method24(613630657);
                            class260.decodePlayerPositioning(var3);
                            if (var34 != var3.offset) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        ++field678;
                        if (field678 > 2000) {
                            if (field679 < 1) {
                                if (class139.field1928 == class144.field1947) {
                                    class144.field1947 = class2.field23;
                                } else {
                                    class144.field1947 = class139.field1928;
                                }

                                ++field679;
                                loginStage = 0;
                            } else {
                                BufferedFile.method2713(-3, 182188095);
                            }
                        }
                    }
                }
            }
        } catch (IOException var21) {
            if (field679 < 1) {
                if (class144.field1947 == class139.field1928) {
                    class144.field1947 = class2.field23;
                } else {
                    class144.field1947 = class139.field1928;
                }

                ++field679;
                loginStage = 0;
            } else {
                BufferedFile.method2713(-2, -88617379);
            }
        }
    }

    void method1577(class232 var1, int var2) {
        class232 var3 =
            var1.field2700 == -1 ? null : class18.method213(var1.field2700, -1432478539);
        int var4;
        int var5;
        if (var3 == null) {
            var4 = class68.windowWidth;
            var5 = class141.windowHeight;
        } else {
            var4 = var3.field2682;
            var5 = var3.field2683;
        }

        class136.method3270(var1, var4, var5, false, (byte) 58);
        class117.method2852(var1, var4, var5, -1195551250);
    }

    final void method1334(byte var1) {
        boolean var2 = false;

        int var3;
        int var6;
        while (!var2) {
            var2 = true;

            for (var3 = 0; var3 < field780 - 1; ++var3) {
                if (field783[var3] < 1000 && field783[var3 + 1] > 1000) {
                    String var4 = field786[var3];
                    field786[var3] = field786[var3 + 1];
                    field786[var3 + 1] = var4;
                    String var5 = field916[var3];
                    field916[var3] = field916[var3 + 1];
                    field916[var3 + 1] = var5;
                    var6 = field783[var3];
                    field783[var3] = field783[var3 + 1];
                    field783[var3 + 1] = var6;
                    var6 = field781[var3];
                    field781[var3] = field781[var3 + 1];
                    field781[var3 + 1] = var6;
                    var6 = field782[var3];
                    field782[var3] = field782[var3 + 1];
                    field782[var3 + 1] = var6;
                    var6 = field784[var3];
                    field784[var3] = field784[var3 + 1];
                    field784[var3 + 1] = var6;
                    boolean var7 = field772[var3];
                    field772[var3] = field772[var3 + 1];
                    field772[var3 + 1] = var7;
                    var2 = false;
                }
            }
        }

        if (class66.field1025 == null) {
            if (field816 == null) {
                int var18;
                label318:
                {
                    int var17 = class48.field477;
                    int var10;
                    int var15;
                    if (field833) {
                        int var8;
                        int var14;
                        int var19;
                        if (var17 != 1 && (class14.field132 || var17 != 4)) {
                            var3 = class48.field473;
                            var14 = class48.field464 * -976212263;
                            if (var3 < class163.field2067 - 10
                                || var3 > class163.field2067 + class74.field1113 + 10
                                || var14 < class86.field1260 - 10
                                || var14 > class128.field1838 + class86.field1260 + 10) {
                                field833 = false;
                                var15 = class163.field2067;
                                var6 = class86.field1260;
                                var18 = class74.field1113;
                                var8 = class128.field1838;

                                for (var19 = 0; var19 < field853; ++var19) {
                                    if (field819[var19] + field763[var19] > var15
                                        && field763[var19] < var18 + var15
                                        && field852[var19] + field854[var19] > var6
                                        && field852[var19] < var6 + var8) {
                                        field848[var19] = true;
                                    }
                                }
                            }
                        }

                        if (var17 == 1 || !class14.field132 && var17 == 4) {
                            var3 = class163.field2067;
                            var14 = class86.field1260;
                            var15 = class74.field1113;
                            var6 = class48.field478;
                            var18 = class48.field467;
                            var8 = -1;

                            for (var19 = 0; var19 < field780; ++var19) {
                                var10 = var14 + (field780 - 1 - var19) * 15 + 31;
                                if (var6 > var3 && var6 < var3 + var15 && var18 > var10 - 13
                                    && var18 < var10 + 3) {
                                    var8 = var19;
                                }
                            }

                            if (var8 != -1) {
                                class34.method647(var8, -662307425);
                            }

                            field833 = false;
                            var19 = class163.field2067;
                            var10 = class86.field1260;
                            int var11 = class74.field1113;
                            int var12 = class128.field1838;

                            for (int var13 = 0; var13 < field853; ++var13) {
                                if (field763[var13] + field819[var13] > var19
                                    && field763[var13] < var19 + var11
                                    && field854[var13] + field852[var13] > var10
                                    && field852[var13] < var12 + var10) {
                                    field848[var13] = true;
                                }
                            }
                        }
                    } else {
                        var3 = field780 - 1;
                        if ((var17 == 1 || !class14.field132 && var17 == 4) && var3 >= 0) {
                            var15 = field783[var3];
                            if (var15 == 39 || var15 == 40 || var15 == 41 || var15 == 42
                                || var15 == 43 || var15 == 33 || var15 == 34 || var15 == 35
                                || var15 == 36 || var15 == 37 || var15 == 38 || var15 == 1005) {
                                var6 = field781[var3];
                                var18 = field782[var3];
                                class232 var16 = class18.method213(var18, -950016857);
                                var10 = class254.method5000(var16, 2102612154);
                                boolean var9 = (var10 >> 28 & 1) != 0;
                                if (var9) {
                                    break label318;
                                }

                                Object var10000 = null;
                                if (InboundPacketDescriptor
                                    .method3653(class254.method5000(var16, 2111618568),
                                                -1787642157)) {
                                    break label318;
                                }
                            }
                        }

                        if ((var17 == 1 || !class14.field132 && var17 == 4) && this
                            .method1251(440979574)) {
                            var17 = 2;
                        }

                        if ((var17 == 1 || !class14.field132 && var17 == 4) && field780 > 0) {
                            class34.method647(var3, 702125233);
                        }

                        if (var17 == 2 && field780 > 0) {
                            this.method1620(class48.field478, class48.field467, -1443197552);
                        }
                    }

                    return;
                }

                if (class66.field1025 != null && !field673 && field780 > 0 && !this
                    .method1251(-2072816976)) {
                    class45.method826(field752, field845, -1259821027);
                }

                field673 = false;
                field756 = 0;
                if (class66.field1025 != null) {
                    class37.method721(class66.field1025, 1238023037);
                }

                class66.field1025 = class18.method213(var18, -510941165);
                field751 = var6;
                field752 = class48.field478;
                field845 = class48.field467;
                if (var3 >= 0) {
                    class0.method10(var3, -1389110339);
                }

                class37.method721(class66.field1025, 1238023037);
            }
        }
    }

    final void method1350(int var1) {
        class37.method721(field816, 1238023037);
        ++class234.field2817;
        if (field824 && field821) {
            int var2 = class48.field473;
            int var3 = class48.field464 * -976212263;
            var2 -= field906;
            var3 -= field838;
            if (var2 < field713) {
                var2 = field713;
            }

            if (var2 + field816.field2682 > field713 + field817.field2682) {
                var2 = field713 + field817.field2682 - field816.field2682;
            }

            if (var3 < field823) {
                var3 = field823;
            }

            if (var3 + field816.field2683 > field823 + field817.field2683) {
                var3 = field823 + field817.field2683 - field816.field2683;
            }

            int var4 = var2 - field825;
            int var5 = var3 - field826;
            int var6 = field816.field2749;
            if (class234.field2817 > field816.field2799 && (var4 > var6 || var4 < -var6
                || var5 > var6 || var5 < -var6)) {
                field827 = true;
            }

            int var7 = var2 - field713 + field817.field2711;
            int var8 = var3 - field823 + field817.field2689;
            class57 var9;
            if (field816.field2712 != null && field827) {
                var9 = new class57();
                var9.field570 = field816;
                var9.field565 = var7;
                var9.field566 = var8;
                var9.field575 = field816.field2712;
                class53.method1076(var9, -92078767);
            }

            if (class48.field469 == 0) {
                if (field827) {
                    if (field816.field2763 != null) {
                        var9 = new class57();
                        var9.field570 = field816;
                        var9.field565 = var7;
                        var9.field566 = var8;
                        var9.field568 = field811;
                        var9.field575 = field816.field2763;
                        class53.method1076(var9, 1218727997);
                    }

                    if (field811 != null && class244.method4799(field816, -1411794273) != null) {
                        OutboundPacket var10 = class131
                            .method3243(class171.field2264, field690.random, (byte) 72);
                        var10.buffer.method3887(field816.field2787, 289154243);
                        var10.buffer.method3887(field811.field2793, 289154243);
                        var10.buffer.writeShort(field811.field2787);
                        var10.buffer.method3813(field816.field2770, (byte) 34);
                        var10.buffer.method3893(field811.field2770, (byte) 113);
                        var10.buffer.writeShort(field816.field2793);
                        field690.method2193(var10, 1045042583);
                    }
                } else if (this.method1251(170175048)) {
                    this.method1620(field906 + field825, field826 + field838, -1998012151);
                } else if (field780 > 0) {
                    class45.method826(field906 + field825, field838 + field826, -1259821027);
                }

                field816 = null;
            }

        } else {
            if (class234.field2817 > 1) {
                field816 = null;
            }

        }
    }

    public final void init() {
        if (this.method857(-774884881)) {
            class281[] var1 = class126.method3054((byte) 40);

            for (int var2 = 0; var2 < var1.length; ++var2) {
                class281 var3 = var1[var2];
                String var4 = this.getParameter(var3.field3677);
                if (var4 != null) {
                    switch (Integer.parseInt(var3.field3677)) {
                        case 1:
                            field822 = Integer.parseInt(var4) != 0;
                        case 2:
                        case 11:
                        case 13:
                        case 16:
                        default:
                            break;
                        case 3:
                            if (var4.equalsIgnoreCase("true")) {
                                field647 = true;
                            } else {
                                field647 = false;
                            }
                            break;
                        case 4:
                            if (unknown0 == -1) {
                                unknown0 = Integer.parseInt(var4);
                            }
                            break;
                        case 5:
                            field660 = Integer.parseInt(var4);
                            break;
                        case 6:
                            field785 = Integer.parseInt(var4);
                            break;
                        case 7:
                            class189.field2441 = class75
                                .method2001(Integer.parseInt(var4), 1828989608);
                            break;
                        case 8:
                            if (var4.equalsIgnoreCase("true")) {
                                ;
                            }
                            break;
                        case 9:
                            class6.parameters = var4;
                            break;
                        case 10:
                            gameType = (GameType) class43
                                .method791(class247.method4820((byte) -99), Integer.parseInt(var4),
                                           1443720514);
                            if (GameType.field3207 == gameType) {
                                field920 = class330.field4002;
                            } else {
                                field920 = class330.field4009;
                            }
                            break;
                        case 12:
                            field691 = Integer.parseInt(var4);
                            break;
                        case 14:
                            affiliateId = Integer.parseInt(var4);
                            break;
                        case 15:
                            field645 = Integer.parseInt(var4);
                            break;
                        case 17:
                            SeekableFile.field1496 = var4;
                    }
                }
            }

            class171.method3654(-1116658046);
            class10.field79 = "127.0.0.1"; // TAG
            String var6 = class189.field2441.field3196;
            byte var7 = 0;

            try {
                class55.method1106("oldschool", var6, var7, 18, -1664343996);
            } catch (Exception var5) {
                class80.method2041((String) null, var5, 2103817937);
            }

            class157.field2037 = this;
            class25.field256 = unknown0;
            this.method855(765, 503, 177, 2108469264);
        }
    }
}
