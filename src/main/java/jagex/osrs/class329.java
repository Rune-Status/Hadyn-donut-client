package jagex.osrs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class class329 {

    static final class297 field3945;
    static final class297 field3946;
    static final class297 field3947;

    static {
        field3945 = class297.field3741;
        field3946 = class297.field3742;
        field3947 = class297.field3743;
    }

    final int[] field3989;
    public boolean field3994;
    class322[] field3950;
    boolean field3969;
    HashSet field3996;
    int field3959;
    int field3967;
    HashSet field3973;
    int field3952;
    int field3964;
    boolean field3987;
    HashSet field3965;
    class249 field3944;
    int field3983;
    HashMap field3982;
    HashSet field3940;
    Iterator field3991;
    class328 field3985;
    int field3976;
    float field3962;
    class323 field3957;
    int field3968;
    class20 field3953;
    class20 field3951;
    int field3975;
    int field3960;
    class228 field3993;
    int field3980;
    float field3942;
    class30 field3955;
    HashMap field3949;
    int field3998;
    int field3971;
    class20 field3954;
    class300 field3984;
    int field3974;
    int field3972;
    int field3986;
    HashSet field3958;
    int field3961;
    int field3966;
    int field3999;
    List field3990;
    int field3997;
    int field3956;
    boolean field3988;
    HashSet field3992;
    int field3970;
    int field3979;
    int field3995;
    long field3977;

    public class329() {
        this.field3976 = -1;
        this.field3960 = -1;
        this.field3952 = -1;
        this.field3964 = -1;
        this.field3998 = -1;
        this.field3966 = -1;
        this.field3967 = 3;
        this.field3983 = 50;
        this.field3969 = false;
        this.field3940 = null;
        this.field3971 = -1;
        this.field3972 = -1;
        this.field3986 = -1;
        this.field3974 = -1;
        this.field3975 = -1;
        this.field3959 = -1;
        this.field3988 = true;
        this.field3973 = new HashSet();
        this.field3996 = new HashSet();
        this.field3958 = new HashSet();
        this.field3965 = new HashSet();
        this.field3987 = false;
        this.field3995 = 0;
        this.field3989 = new int[]{1008, 1009, 1010, 1011, 1012};
        this.field3992 = new HashSet();
        this.field3993 = null;
        this.field3994 = false;
        this.field3997 = -1;
        this.field3956 = -1;
        this.field3999 = -1;
    }

    public class20 method6328(int var1, int var2, int var3, byte var4) {
        Iterator var5 = this.field3982.values().iterator();

        class20 var6;
        do {
            if (!var5.hasNext()) {
                return null;
            }

            var6 = (class20) var5.next();
        } while (!var6.method248(var1, var2, var3, 37007514));

        return var6;
    }

    boolean method6477(int var1) {
        return this.field3976 != -1 && this.field3960 != -1;
    }

    float method6343(int var1, int var2) {
        return var1 == 25 ? 1.0F : (var1 == 37 ? 1.5F
            : (var1 == 50 ? 2.0F : (var1 == 75 ? 3.0F : (var1 == 100 ? 4.0F : 8.0F))));
    }

    public class20 method6347(int var1, int var2) {
        Iterator var3 = this.field3982.values().iterator();

        class20 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }

            var4 = (class20) var3.next();
        } while (var4.method253((byte) 66) != var1);

        return var4;
    }

    void method6385(class20 var1, int var2) {
        this.field3953 = var1;
        this.field3955 = new class30(this.field3950, this.field3949);
        this.field3985.method6304(this.field3953.method264((byte) -67), -94401394);
    }

    void method6333(class20 var1, int var2) {
        if (this.field3953 == null || var1 != this.field3953) {
            this.method6385(var1, -611236054);
            this.method6334(-1, -1, -1, (byte) 94);
        }
    }

    public int method6367(byte var1) {
        return this.field3953 == null ? -1
            : this.field3968 + this.field3953.method280((byte) 117) * 64;
    }

    void method6415(byte var1) {
        if (class140.field1933 != null) {
            this.field3942 = this.field3962;
        } else {
            if (this.field3942 < this.field3962) {
                this.field3942 = Math.min(this.field3962, this.field3942 / 30.0F + this.field3942);
            }

            if (this.field3942 > this.field3962) {
                this.field3942 = Math.max(this.field3962, this.field3942 - this.field3942 / 30.0F);
            }

        }
    }

    void method6371(byte var1) {
        this.field3965.clear();
        this.field3965.addAll(this.field3973);
        this.field3965.addAll(this.field3958);
    }

    void method6334(int var1, int var2, int var3, byte var4) {
        if (this.field3953 != null) {
            int[] var5 = this.field3953.method250(var1, var2, var3, -1997378006);
            if (var5 == null) {
                var5 = this.field3953.method250(this.field3953.method256(1114907635),
                                                this.field3953.method303(85718924),
                                                this.field3953.method265(1882739851), -1276243905);
            }

            this.method6325(var5[0] - this.field3953.method280((byte) 127) * 64,
                            var5[1] - this.field3953.method251((byte) 122) * 64, true, (byte) -52);
            this.field3976 = -1;
            this.field3960 = -1;
            this.field3942 = this.method6343(this.field3953.method258((byte) 86), -580159189);
            this.field3962 = this.field3942;
            this.field3990 = null;
            this.field3991 = null;
            this.field3955.method547(-756795179);
        }
    }

    public int method6355(int var1) {
        return this.field3952;
    }

    public int method6353(int var1) {
        return this.field3953 == null ? -1
            : this.field3980 + this.field3953.method251((byte) 5) * 64;
    }

    void method6403(byte var1) {
        if (this.method6477(-1503482807)) {
            int var2 = this.field3976 - this.field3968;
            int var3 = this.field3960 - this.field3980;
            if (var2 != 0) {
                var2 /= Math.min(8, Math.abs(var2));
            }

            if (var3 != 0) {
                var3 /= Math.min(8, Math.abs(var3));
            }

            this.method6325(var2 + this.field3968, var3 + this.field3980, true, (byte) -24);
            if (this.field3976 == this.field3968 && this.field3960 == this.field3980) {
                this.field3976 = -1;
                this.field3960 = -1;
            }

        }
    }

    final void method6331(short var1) {
        this.field3959 = -1;
        this.field3975 = -1;
        this.field3974 = -1;
        this.field3986 = -1;
    }

    public void method6437(int var1, int var2, int var3) {
        if (this.field3953 != null) {
            this.method6325(var1 - this.field3953.method280((byte) 108) * 64,
                            var2 - this.field3953.method251((byte) 67) * 64, true, (byte) -26);
            this.field3976 = -1;
            this.field3960 = -1;
        }
    }

    public void method6486(int var1, int var2, byte var3) {
        if (this.field3953 != null && this.field3953.method249(var1, var2, (byte) -9)) {
            this.field3976 = var1 - this.field3953.method280((byte) 115) * 64;
            this.field3960 = var2 - this.field3953.method251((byte) 26) * 64;
        }
    }

    void method6322(int var1, int var2, boolean var3, long var4) {
        if (this.field3953 != null) {
            int var6 = (int) ((float) this.field3968 + ((float) (var1 - this.field3998)
                - (float) this.method6355(1256483564) * this.field3942 / 2.0F) / this.field3942);
            int var7 = (int) ((float) this.field3980 - ((float) (var2 - this.field3966)
                - (float) this.method6356(2107652609) * this.field3942 / 2.0F) / this.field3942);
            this.field3993 = this.field3953
                .method279(var6 + this.field3953.method280((byte) 119) * 64,
                           var7 + this.field3953.method251((byte) 81) * 64, 448159729);
            if (this.field3993 != null && var3) {
                if (class52.method1072((byte) -128) && class39.field380[82]
                    && class39.field380[81]) {
                    class49.method1023(this.field3993.field2632, this.field3993.field2633,
                                       this.field3993.field2634, false, -1122915677);
                } else {
                    boolean var8 = true;
                    if (this.field3988) {
                        int var9 = var1 - this.field3970;
                        int var10 = var2 - this.field3979;
                        if (var4 - this.field3977 > 500L || var9 < -25 || var9 > 25 || var10 < -25
                            || var10 > 25) {
                            var8 = false;
                        }
                    }

                    if (var8) {
                        OutboundPacket var11 = class131
                            .method3243(class171.field2229, client.field690.random, (byte) 46);
                        var11.buffer
                            .method3893(this.field3993.method4646(2028709446), (byte) 114);
                        client.field690.method2193(var11, -926857997);
                        this.field3977 = 0L;
                    }
                }
            }
        } else {
            this.field3993 = null;
        }

    }

    final void method6325(int var1, int var2, boolean var3, byte var4) {
        this.field3968 = var1;
        this.field3980 = var2;
        class120.method2866((short) 3133);
        if (var3) {
            this.method6331((short) -24130);
        }

    }

    public int method6356(int var1) {
        return this.field3964;
    }

    public class28 method6376(int var1) {
        return this.field3991 == null ? null
            : (!this.field3991.hasNext() ? null : (class28) this.field3991.next());
    }

    boolean method6338(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        return this.field3957 == null ? true
            : (this.field3957.field3879 == var1 && this.field3957.field3887 == var2 ? (
                this.field3955.field312 != this.field3961 ? true
                    : (this.field3999 != client.field914 ? true
                        : (var3 <= 0 && var4 <= 0 ? var3 + var1 < var5 || var2 + var4 < var6
                            : true))) : true);
    }

    void method6342(int var1, int var2, int var3, int var4, int var5, int var6) {
        byte var7 = 20;
        int var8 = var3 / 2 + var1;
        int var9 = var4 / 2 + var2 - 18 - var7;
        class319.method6047(var1, var2, var3, var4, -16777216);
        class319.method6116(var8 - 152, var9, 304, 34, -65536);
        class319.method6047(var8 - 150, var9 + 2, var5 * 3, 30, -65536);
        this.field3984.method5880("Loading...", var8, var9 + var7, -1, -1);
    }

    void method6369(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        if (class140.field1933 != null) {
            int var8 = 512 / (this.field3955.field312 * 2);
            int var9 = var3 + 512;
            int var10 = var4 + 512;
            float var11 = 1.0F;
            var9 = (int) ((float) var9 / var11);
            var10 = (int) ((float) var10 / var11);
            int var12 = this.method6367((byte) -93) - var5 / 2 - var8;
            int var13 = this.method6353(-604820934) - var6 / 2 - var8;
            int var14 = var1 - (var12 + var8 - this.field3997) * this.field3955.field312;
            int var15 = var2 - this.field3955.field312 * (var8 - (var13 - this.field3956));
            if (this.method6338(var9, var10, var14, var15, var3, var4, 2067598860)) {
                if (this.field3957 != null && this.field3957.field3879 == var9
                    && this.field3957.field3887 == var10) {
                    Arrays.fill(this.field3957.field3889, 0);
                } else {
                    this.field3957 = new class323(var9, var10);
                }

                this.field3997 = this.method6367((byte) -125) - var5 / 2 - var8;
                this.field3956 = this.method6353(1020114700) - var6 / 2 - var8;
                this.field3961 = this.field3955.field312;
                class140.field1933.method4984(this.field3997, this.field3956, this.field3957,
                                              (float) this.field3961 / var11, (byte) 42);
                this.field3999 = client.field914;
                var14 = var1 - (var12 + var8 - this.field3997) * this.field3955.field312;
                var15 = var2 - this.field3955.field312 * (var8 - (var13 - this.field3956));
            }

            class319.method6046(var1, var2, var3, var4, 0, 128);
            if (var11 == 1.0F) {
                this.field3957.method6186(var14, var15, 192);
            } else {
                this.field3957.method6245(var14, var15, (int) (var11 * (float) var9),
                                          (int) ((float) var10 * var11), 192);
            }
        }

    }

    public void method6374(int var1, int var2, class228 var3, class228 var4, int var5) {
        class57 var6 = new class57();
        class36 var7 = new class36(var2, var3, var4);
        var6.method1114(new Object[]{var7}, (byte) 1);
        switch (var1) {
            case 1008:
                var6.method1116(10, -1103064193);
                break;
            case 1009:
                var6.method1116(11, -245064799);
                break;
            case 1010:
                var6.method1116(12, 1501162302);
                break;
            case 1011:
                var6.method1116(13, -934246155);
                break;
            case 1012:
                var6.method1116(14, -495667114);
        }

        class53.method1076(var6, -1225442608);
    }

    public void method6337(int var1, int var2, int var3, int var4, int var5, int var6) {
        int[] var7 = new int[4];
        class319.method6110(var7);
        class319.method6067(var1, var2, var3 + var1, var2 + var4);
        class319.method6047(var1, var2, var3, var4, -16777216);
        int var8 = this.field3985.method6315(-1854239508);
        if (var8 < 100) {
            this.method6342(var1, var2, var3, var4, var8, -9546892);
        } else {
            if (!this.field3955.method543(1498151219)) {
                this.field3955.method535(this.field3944, this.field3953.method264((byte) -46),
                                         client.field647, 1999096986);
                if (!this.field3955.method543(1232112358)) {
                    return;
                }
            }

            if (this.field3940 != null) {
                ++this.field3972;
                if (this.field3972 % this.field3983 == 0) {
                    this.field3972 = 0;
                    ++this.field3971;
                }

                if (this.field3971 >= this.field3967 && !this.field3969) {
                    this.field3940 = null;
                }
            }

            int var9 = (int) Math.ceil((double) ((float) var3 / this.field3942));
            int var10 = (int) Math.ceil((double) ((float) var4 / this.field3942));
            this.field3955.method537(this.field3968 - var9 / 2, this.field3980 - var10 / 2,
                                     var9 / 2 + this.field3968, var10 / 2 + this.field3980, var1,
                                     var2, var3 + var1, var2 + var4, -619943859);
            if (!this.field3987) {
                boolean var11 = false;
                if (var5 - this.field3995 > 100) {
                    this.field3995 = var5;
                    var11 = true;
                }

                this.field3955.method549(this.field3968 - var9 / 2, this.field3980 - var10 / 2,
                                         var9 / 2 + this.field3968, var10 / 2 + this.field3980,
                                         var1, var2, var3 + var1, var2 + var4, this.field3965,
                                         this.field3940, this.field3972, this.field3983, var11,
                                         -747039163);
            }

            this.method6369(var1, var2, var3, var4, var9, var10, 1873392112);
            if (class52.method1072((byte) -126) && this.field3994 && this.field3993 != null) {
                this.field3984.method5846("Coord: " + this.field3993, class319.field3853 + 10,
                                          class319.field3858 + 20, 16776960, -1);
            }

            this.field3952 = var9;
            this.field3964 = var10;
            this.field3998 = var1;
            this.field3966 = var2;
            class319.method6050(var7);
        }
    }

    public void method6490(int var1, int var2, int var3, int var4, byte var5) {
        if (this.field3985.method6306((byte) 1)) {
            if (!this.field3955.method543(-2140364808)) {
                this.field3955.method535(this.field3944, this.field3953.method264((byte) -68),
                                         client.field647, -1373530824);
                if (!this.field3955.method543(-1109353944)) {
                    return;
                }
            }

            this.field3955
                .method540(var1, var2, var3, var4, this.field3940, this.field3972, this.field3983,
                           1068522909);
        }
    }

    public void method6352(int var1) {
        class180.method3734(-1136890378);
    }

    public int method6321(byte var1) {
        return this.field3944
            .method4853(this.field3951.method264((byte) -38), class29.field290.field298, -527380243)
            ? 100 : this.field3944.method4845(this.field3951.method264((byte) 80), 29775380);
    }

    public void method6317(class249 var1, class300 var2, HashMap var3, class322[] var4, int var5) {
        this.field3950 = var4;
        this.field3944 = var1;
        this.field3984 = var2;
        this.field3949 = new HashMap();
        this.field3949.put(class12.field92, var3.get(field3945));
        this.field3949.put(class12.field93, var3.get(field3946));
        this.field3949.put(class12.field94, var3.get(field3947));
        this.field3985 = new class328(var1);
        int var6 = this.field3944.method4825(class29.field291.field298, 1011742774);
        int[] var7 = this.field3944.method4839(var6, -1341186274);
        this.field3982 = new HashMap(var7.length);

        for (int var8 = 0; var8 < var7.length; ++var8) {
            Buffer var9 = new Buffer(this.field3944.method4831(var6, var7[var8], 1789634852));
            class20 var10 = new class20();
            var10.method262(var9, var7[var8], -1579235046);
            this.field3982.put(var10.method264((byte) 30), var10);
            if (var10.method254(1654111669)) {
                this.field3951 = var10;
            }
        }

        this.method6333(this.field3951, -2121373129);
        this.field3954 = null;
    }

    public void method6329(int var1, int var2, int var3, boolean var4, byte var5) {
        class20 var6 = this.method6328(var1, var2, var3, (byte) 0);
        if (var6 == null) {
            if (!var4) {
                return;
            }

            var6 = this.field3951;
        }

        boolean var7 = false;
        if (var6 != this.field3954 || var4) {
            this.field3954 = var6;
            this.method6333(var6, -1997243291);
            var7 = true;
        }

        if (var7 || var4) {
            this.method6334(var1, var2, var3, (byte) 3);
        }

    }

    public void method6345(int var1) {
        this.field3985.method6305(-831040829);
    }

    public void method6319(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7,
                           int var8) {
        if (this.field3985.method6306((byte) 1)) {
            this.method6415((byte) -59);
            this.method6403((byte) 85);
            if (var3) {
                int var9 = (int) Math.ceil((double) ((float) var6 / this.field3942));
                int var10 = (int) Math.ceil((double) ((float) var7 / this.field3942));
                List var11 = this.field3955
                    .method541(this.field3968 - var9 / 2 - 1, this.field3980 - var10 / 2 - 1,
                               var9 / 2 + this.field3968 + 1, var10 / 2 + this.field3980 + 1, var4,
                               var5, var6, var7, var1, var2, -475715480);
                HashSet var12 = new HashSet();

                Iterator var13;
                class28 var14;
                class57 var15;
                class36 var16;
                for (var13 = var11.iterator(); var13.hasNext();
                     class53.method1076(var15, -190791705)) {
                    var14 = (class28) var13.next();
                    var12.add(var14);
                    var15 = new class57();
                    var16 = new class36(var14.field285, var14.field279, var14.field277);
                    var15.method1114(
                        new Object[]{var16, Integer.valueOf(var1), Integer.valueOf(var2)},
                        (byte) 1);
                    if (this.field3992.contains(var14)) {
                        var15.method1116(17, 626403119);
                    } else {
                        var15.method1116(15, -887936095);
                    }
                }

                var13 = this.field3992.iterator();

                while (var13.hasNext()) {
                    var14 = (class28) var13.next();
                    if (!var12.contains(var14)) {
                        var15 = new class57();
                        var16 = new class36(var14.field285, var14.field279, var14.field277);
                        var15.method1114(
                            new Object[]{var16, Integer.valueOf(var1), Integer.valueOf(var2)},
                            (byte) 1);
                        var15.method1116(16, 1836364318);
                        class53.method1076(var15, -1243890360);
                    }
                }

                this.field3992 = var12;
            }
        }
    }

    public void method6418(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        if (this.field3985.method6306((byte) 1)) {
            int var8 = (int) Math.ceil((double) ((float) var3 / this.field3942));
            int var9 = (int) Math.ceil((double) ((float) var4 / this.field3942));
            List var10 = this.field3955
                .method541(this.field3968 - var8 / 2 - 1, this.field3980 - var9 / 2 - 1,
                           var8 / 2 + this.field3968 + 1, var9 / 2 + this.field3980 + 1, var1, var2,
                           var3, var4, var5, var6, 434402956);
            if (!var10.isEmpty()) {
                Iterator var11 = var10.iterator();

                boolean var14;
                do {
                    if (!var11.hasNext()) {
                        return;
                    }

                    class28 var12 = (class28) var11.next();
                    class257 var13 = class162.method3533(var12.field285, 32768);
                    var14 = false;

                    for (int var15 = this.field3989.length - 1; var15 >= 0; --var15) {
                        if (var13.field3320[var15] != null) {
                            class79.method2039(var13.field3320[var15], var13.field3321,
                                               this.field3989[var15], var12.field285,
                                               var12.field279.method4646(1212340834),
                                               var12.field277.method4646(2053508408), -1507147658);
                            var14 = true;
                        }
                    }
                } while (!var14);

            }
        }
    }

    public void method6330(int var1, int var2) {
        class20 var3 = this.method6347(var1, -1981785099);
        if (var3 != null) {
            this.method6333(var3, -2000400825);
        }

    }

    public int method6389(int var1) {
        return 1.0D == (double) this.field3962 ? 25 : ((double) this.field3962 == 1.5D ? 37
            : (2.0D == (double) this.field3962 ? 50 : (3.0D == (double) this.field3962 ? 75
                : (4.0D == (double) this.field3962 ? 100 : 200))));
    }

    public void method6324(int var1, int var2) {
        this.field3962 = this.method6343(var1, -1849574830);
    }

    public boolean method6326(int var1) {
        return this.field3985.method6306((byte) 1);
    }

    public void method6479(int var1, int var2, boolean var3, boolean var4, byte var5) {
        long var6 = class120.method2866((short) 3133);
        this.method6322(var1, var2, var4, var6);
        if (!this.method6477(-1503482807) && (var4 || var3)) {
            if (var4) {
                this.field3975 = var1;
                this.field3959 = var2;
                this.field3986 = this.field3968;
                this.field3974 = this.field3980;
            }

            if (this.field3986 != -1) {
                int var8 = var1 - this.field3975;
                int var9 = var2 - this.field3959;
                this.method6325(this.field3986 - (int) ((float) var8 / this.field3962),
                                (int) ((float) var9 / this.field3962) + this.field3974, false,
                                (byte) 39);
            }
        } else {
            this.method6331((short) -27475);
        }

        if (var4) {
            this.field3977 = var6;
            this.field3970 = var1;
            this.field3979 = var2;
        }

    }

    public class228 method6354(int var1) {
        return this.field3953 == null ? null : this.field3953
            .method279(this.method6367((byte) -115), this.method6353(-1634323543), -1388637761);
    }

    public void method6350(int var1, int var2, int var3, int var4) {
        if (this.field3953 != null) {
            int[] var5 = this.field3953.method250(var1, var2, var3, -533977642);
            if (var5 != null) {
                this.method6486(var5[0], var5[1], (byte) 28);
            }

        }
    }

    public void method6351(int var1, int var2, int var3, byte var4) {
        if (this.field3953 != null) {
            int[] var5 = this.field3953.method250(var1, var2, var3, -2029790503);
            if (var5 != null) {
                this.method6437(var5[0], var5[1], 1873156848);
            }

        }
    }

    public int method6336(int var1) {
        return this.field3953 == null ? -1 : this.field3953.method253((byte) 117);
    }

    public void method6358(byte var1) {
        this.field3967 = 3;
    }

    public class20 method6332(int var1) {
        return this.field3953;
    }

    public void method6360(int var1) {
        this.field3983 = 50;
    }

    public void method6357(int var1, byte var2) {
        if (var1 >= 1) {
            this.field3967 = var1;
        }

    }

    public void method6364(int var1) {
        this.field3940 = null;
    }

    public void method6359(int var1, int var2) {
        if (var1 >= 1) {
            this.field3983 = var1;
        }

    }

    public void method6375(int var1, byte var2) {
        this.field3940 = new HashSet();
        this.field3940.add(Integer.valueOf(var1));
        this.field3971 = 0;
        this.field3972 = 0;
    }

    public void method6414(boolean var1, int var2) {
        this.field3969 = var1;
    }

    public void method6363(int var1, int var2) {
        this.field3940 = new HashSet();
        this.field3971 = 0;
        this.field3972 = 0;

        for (int var3 = 0; var3 < class257.field3331; ++var3) {
            if (class162.method3533(var3, 32768) != null
                && class162.method3533(var3, 32768).field3317 == var1) {
                this.field3940.add(Integer.valueOf(class162.method3533(var3, 32768).field3313));
            }
        }

    }

    public class28 method6506(int var1) {
        if (!this.field3985.method6306((byte) 1)) {
            return null;
        } else if (!this.field3955.method543(-1268339978)) {
            return null;
        } else {
            HashMap var2 = this.field3955.method544(-1471305673);
            this.field3990 = new LinkedList();
            Iterator var3 = var2.values().iterator();

            while (var3.hasNext()) {
                List var4 = (List) var3.next();
                this.field3990.addAll(var4);
            }

            this.field3991 = this.field3990.iterator();
            return this.method6376(1212776046);
        }
    }

    public void method6492(boolean var1, byte var2) {
        this.field3987 = !var1;
    }

    public boolean method6368(int var1) {
        return !this.field3987;
    }

    public void method6323(int var1, boolean var2, byte var3) {
        if (!var2) {
            this.field3973.add(Integer.valueOf(var1));
        } else {
            this.field3973.remove(Integer.valueOf(var1));
        }

        this.method6371((byte) 62);
    }

    public void method6320(int var1, boolean var2, byte var3) {
        if (!var2) {
            this.field3996.add(Integer.valueOf(var1));
        } else {
            this.field3996.remove(Integer.valueOf(var1));
        }

        for (int var4 = 0; var4 < class257.field3331; ++var4) {
            if (class162.method3533(var4, 32768) != null
                && class162.method3533(var4, 32768).field3317 == var1) {
                int var5 = class162.method3533(var4, 32768).field3313;
                if (!var2) {
                    this.field3958.add(Integer.valueOf(var5));
                } else {
                    this.field3958.remove(Integer.valueOf(var5));
                }
            }
        }

        this.method6371((byte) 78);
    }

    public boolean method6370(int var1, int var2) {
        return !this.field3973.contains(Integer.valueOf(var1));
    }

    public void method6335(class20 var1, class228 var2, class228 var3, boolean var4, byte var5) {
        if (var1 != null) {
            if (this.field3953 == null || var1 != this.field3953) {
                this.method6385(var1, -611236054);
            }

            if (!var4 && this.field3953
                .method248(var2.field2634, var2.field2632, var2.field2633, 37007514)) {
                this.method6334(var2.field2634, var2.field2632, var2.field2633, (byte) 94);
            } else {
                this.method6334(var3.field2634, var3.field2632, var3.field2633, (byte) 104);
            }

        }
    }

    public boolean method6372(int var1, byte var2) {
        return !this.field3996.contains(Integer.valueOf(var1));
    }

    public class228 method6373(int var1, class228 var2, int var3) {
        if (!this.field3985.method6306((byte) 1)) {
            return null;
        } else if (!this.field3955.method543(-1670807775)) {
            return null;
        } else if (!this.field3953.method249(var2.field2632, var2.field2633, (byte) -85)) {
            return null;
        } else {
            HashMap var4 = this.field3955.method544(1356369007);
            List var5 = (List) var4.get(Integer.valueOf(var1));
            if (var5 != null && !var5.isEmpty()) {
                class28 var6 = null;
                int var7 = -1;
                Iterator var8 = var5.iterator();

                while (true) {
                    class28 var9;
                    int var12;
                    do {
                        if (!var8.hasNext()) {
                            return var6.field277;
                        }

                        var9 = (class28) var8.next();
                        int var10 = var9.field277.field2632 - var2.field2632;
                        int var11 = var9.field277.field2633 - var2.field2633;
                        var12 = var11 * var11 + var10 * var10;
                        if (var12 == 0) {
                            return var9.field277;
                        }
                    } while (var12 >= var7 && var6 != null);

                    var6 = var9;
                    var7 = var12;
                }
            } else {
                return null;
            }
        }
    }
}
