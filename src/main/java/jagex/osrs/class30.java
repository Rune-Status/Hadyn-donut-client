package jagex.osrs;

import java.awt.Component;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

public final class class30 {

    public static class320 field313;
    static int field314;
    final HashMap field307;
    public int field312;
    boolean field300;
    class323 field308;
    boolean field301;
    HashMap field303;
    class23[][] field304;
    int field310;
    int field309;
    HashMap field305;
    class322[] field306;
    class33 field302;
    int field299;
    int field311;

    public class30(class322[] var1, HashMap var2) {
        this.field301 = false;
        this.field300 = false;
        this.field305 = new HashMap();
        this.field312 = 0;
        this.field306 = var1;
        this.field307 = var2;
    }

    static void method579(Component var0, int var1) {
        var0.addMouseListener(class48.field470);
        var0.addMouseMotionListener(class48.field470);
        var0.addFocusListener(class48.field470);
    }

    static void method574(Component var0, int var1) {
        var0.setFocusTraversalKeysEnabled(false);
        var0.addKeyListener(class39.field386);
        var0.addFocusListener(class39.field386);
    }

    static final void method536(int var0, int var1, int var2, boolean var3, int var4) {
        if (class189.method4028(var0, 1607064456)) {
            class162.method3545(class145.field1951[var0], -1, var1, var2, var3, (byte) 100);
        }
    }

    static final void method577(boolean var0, int var1) {
        if (var0) {
            client.field681 = class79.field1172 ? class148.field1965 : class148.field1966;
        } else {
            LinkedHashMap var2 = GameApplet.field435.field1028;
            String var4 = class79.username;
            int var5 = var4.length();
            int var6 = 0;

            for (int var7 = 0; var7 < var5; ++var7) {
                var6 = (var6 << 5) - var6 + var4.charAt(var7);
            }

            client.field681 =
                var2.containsKey(Integer.valueOf(var6)) ? class148.field1967 : class148.field1964;
        }

    }

    static void method575(int var0, int var1) {
        class54 var2 = (class54) class54.field534.method4224((long) var0);
        if (var2 != null) {
            var2.unlink();
        }
    }

    static class86 method578(int var0, int var1, int var2, int var3) {
        int var4 = class219.method4393(var1, var0, -1928379558);
        class86 var5 = class86.method2153(var4, var0, (byte) 79);
        if (var5 != null) {
            return var5;
        } else {
            int var6 = var0 + (var2 + 40000 << 8);
            var5 = class86.method2153(var6, var0, (byte) 75);
            return var5 != null ? var5 : null;
        }
    }

    void method569(int var1) {
        if (this.field303 == null) {
            this.field303 = new HashMap();
        }

        this.field303.clear();

        for (int var2 = 0; var2 < this.field304.length; ++var2) {
            for (int var3 = 0; var3 < this.field304[var2].length; ++var3) {
                List var4 = this.field304[var2][var3].method406(-1441129299);
                Iterator var5 = var4.iterator();

                while (var5.hasNext()) {
                    class28 var6 = (class28) var5.next();
                    if (!this.field303.containsKey(Integer.valueOf(var6.field285))) {
                        LinkedList var7 = new LinkedList();
                        var7.add(var6);
                        this.field303.put(Integer.valueOf(var6.field285), var7);
                    } else {
                        List var8 = (List) this.field303.get(Integer.valueOf(var6.field285));
                        var8.add(var6);
                    }
                }
            }
        }

    }

    class17 method542(int var1, int var2, int var3, int var4, int var5) {
        class17 var6 = new class17(this);
        int var7 = this.field310 + var1;
        int var8 = var2 + this.field309;
        int var9 = var3 + this.field310;
        int var10 = var4 + this.field309;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        int var14 = var10 / 64;
        var6.field163 = var13 - var11 + 1;
        var6.field157 = var14 - var12 + 1;
        var6.field159 = var11 - this.field302.method280((byte) 106);
        var6.field160 = var12 - this.field302.method251((byte) 75);
        if (var6.field159 < 0) {
            var6.field163 += var6.field159;
            var6.field159 = 0;
        }

        if (var6.field159 > this.field304.length - var6.field163) {
            var6.field163 = this.field304.length - var6.field159;
        }

        if (var6.field160 < 0) {
            var6.field157 += var6.field160;
            var6.field160 = 0;
        }

        if (var6.field160 > this.field304[0].length - var6.field157) {
            var6.field157 = this.field304[0].length - var6.field160;
        }

        var6.field163 = Math.min(var6.field163, this.field304.length);
        var6.field157 = Math.min(var6.field157, this.field304[0].length);
        return var6;
    }

    float method562(int var1, int var2, int var3) {
        float var4 = (float) var1 / (float) var2;
        if (var4 > 8.0F) {
            return 8.0F;
        } else if (var4 < 1.0F) {
            return 1.0F;
        } else {
            int var5 = Math.round(var4);
            return Math.abs((float) var5 - var4) < 0.05F ? (float) var5 : var4;
        }
    }

    public boolean method543(int var1) {
        return this.field301;
    }

    public HashMap method544(int var1) {
        this.method569(-2131106684);
        return this.field303;
    }

    public void method540(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7,
                          int var8) {
        if (this.field308 != null) {
            this.field308.method6166(var1, var2, var3, var4);
            if (var6 > 0 && var6 % var7 < var7 / 2) {
                if (this.field303 == null) {
                    this.method569(691373863);
                }

                Iterator var9 = var5.iterator();

                while (true) {
                    List var11;
                    do {
                        if (!var9.hasNext()) {
                            return;
                        }

                        int var10 = ((Integer) var9.next()).intValue();
                        var11 = (List) this.field303.get(Integer.valueOf(var10));
                    } while (var11 == null);

                    Iterator var12 = var11.iterator();

                    while (var12.hasNext()) {
                        class28 var13 = (class28) var12.next();
                        int var14 =
                            var3 * (var13.field277.field2632 - this.field310) / this.field299;
                        int var15 = var4
                            - (var13.field277.field2633 - this.field309) * var4 / this.field311;
                        class319.method6095(var14 + var1, var15 + var2, 2, 16776960, 256);
                    }
                }
            }
        }
    }

    public void method535(class249 var1, String var2, boolean var3, int var4) {
        if (!this.field300) {
            this.field301 = false;
            this.field300 = true;
            System.nanoTime();
            int var5 = var1.method4825(class29.field291.field298, 1011742774);
            int var6 = var1.method4847(var5, var2, -952762458);
            Buffer var7 = new Buffer(
                var1.method4849(class29.field291.field298, var2, 223876925));
            Buffer var8 = new Buffer(
                var1.method4849(class29.field288.field298, var2, -926285461));
            Buffer var9 = new Buffer(
                var1.method4849(var2, class29.field290.field298, -1607202069));
            System.nanoTime();
            System.nanoTime();
            this.field302 = new class33();

            try {
                this.field302.method608(var7, var9, var8, var6, var3, 674403176);
            } catch (IllegalStateException var21) {
                return;
            }

            this.field302.method303(187807458);
            this.field302.method256(1114907635);
            this.field302.method265(2028530318);
            this.field310 = this.field302.method280((byte) 124) * 64;
            this.field309 = this.field302.method251((byte) 60) * 64;
            this.field299 =
                (this.field302.method260(-940980070) - this.field302.method280((byte) 117) + 1)
                    * 64;
            this.field311 =
                (this.field302.method271((byte) -55) - this.field302.method251((byte) 76) + 1) * 64;
            int var18 =
                this.field302.method260(-1464258468) - this.field302.method280((byte) 109) + 1;
            int var11 = this.field302.method271((byte) 8) - this.field302.method251((byte) 25) + 1;
            System.nanoTime();
            System.nanoTime();
            class68.method1826(777647557);
            this.field304 = new class23[var18][var11];
            Iterator var12 = this.field302.field327.iterator();

            while (var12.hasNext()) {
                class10 var13 = (class10) var12.next();
                int var14 = var13.field146;
                int var15 = var13.field151;
                int var16 = var14 - this.field302.method280((byte) 125);
                int var17 = var15 - this.field302.method251((byte) 54);
                this.field304[var16][var17] = new class23(var14, var15,
                                                          this.field302.method257(-1730655048),
                                                          this.field307);
                this.field304[var16][var17].method337(var13, this.field302.field326, (byte) 23);
            }

            for (int var19 = 0; var19 < var18; ++var19) {
                for (int var20 = 0; var20 < var11; ++var20) {
                    if (this.field304[var19][var20] == null) {
                        this.field304[var19][var20] = new class23(
                            this.field302.method280((byte) 118) + var19,
                            this.field302.method251((byte) 98) + var20,
                            this.field302.method257(-1587342654), this.field307);
                        this.field304[var19][var20]
                            .method446(this.field302.field324, this.field302.field326, 2030058438);
                    }
                }
            }

            System.nanoTime();
            System.nanoTime();
            if (var1.method4848(class29.field289.field298, var2, (short) -16695)) {
                byte[] var22 = var1.method4849(class29.field289.field298, var2, -1174587453);
                this.field308 = ScriptExecutor.method1946(var22, -2026803712);
            }

            System.nanoTime();
            var1.method4842(2131555798);
            var1.method4844(1751873766);
            this.field301 = true;
        }
    }

    public List method541(int var1, int var2, int var3, int var4, int var5, int var6, int var7,
                          int var8, int var9, int var10, int var11) {
        LinkedList var12 = new LinkedList();
        if (!this.field301) {
            return var12;
        } else {
            class17 var13 = this.method542(var1, var2, var3, var4, -1371716593);
            float var14 = this.method562(var7, var3 - var1, -503418480);
            int var15 = (int) (64.0F * var14);
            int var16 = this.field310 + var1;
            int var17 = var2 + this.field309;

            for (int var18 = var13.field159; var18 < var13.field159 + var13.field163; ++var18) {
                for (int var19 = var13.field160; var19 < var13.field157 + var13.field160; ++var19) {
                    List var20 = this.field304[var18][var19].method371(
                        var5 + var15 * (this.field304[var18][var19].field233 * 64 - var16) / 64,
                        var8 + var6
                            - var15 * (this.field304[var18][var19].field234 * 64 - var17 + 64) / 64,
                        var15, var9, var10, 1735993427);
                    if (!var20.isEmpty()) {
                        var12.addAll(var20);
                    }
                }
            }

            return var12;
        }
    }

    public final void method547(int var1) {
        this.field303 = null;
    }

    void method534(int var1, int var2, class23[] var3, byte var4) {
        boolean var5 = var1 <= 0;
        boolean var6 = var1 >= this.field304.length - 1;
        boolean var7 = var2 <= 0;
        boolean var8 = var2 >= this.field304[0].length - 1;
        if (var8) {
            var3[class242.field3172.vmethod6130((byte) 1)] = null;
        } else {
            var3[class242.field3172.vmethod6130((byte) 1)] = this.field304[var1][var2 + 1];
        }

        var3[class242.field3163.vmethod6130((byte) 1)] =
            !var8 && !var6 ? this.field304[var1 + 1][var2 + 1] : null;
        var3[class242.field3167.vmethod6130((byte) 1)] =
            !var8 && !var5 ? this.field304[var1 - 1][var2 + 1] : null;
        var3[class242.field3164.vmethod6130((byte) 1)] =
            var6 ? null : this.field304[var1 + 1][var2];
        var3[class242.field3168.vmethod6130((byte) 1)] =
            var5 ? null : this.field304[var1 - 1][var2];
        var3[class242.field3166.vmethod6130((byte) 1)] =
            var7 ? null : this.field304[var1][var2 - 1];
        var3[class242.field3162.vmethod6130((byte) 1)] =
            !var7 && !var6 ? this.field304[var1 + 1][var2 - 1] : null;
        var3[class242.field3169.vmethod6130((byte) 1)] =
            !var7 && !var5 ? this.field304[var1 - 1][var2 - 1] : null;
    }

    public final void method537(int var1, int var2, int var3, int var4, int var5, int var6,
                                int var7, int var8, int var9) {
        int[] var10 = class319.field3856;
        int var11 = class319.field3854;
        int var12 = class319.field3855;
        int[] var13 = new int[4];
        class319.method6110(var13);
        class17 var14 = this.method542(var1, var2, var3, var4, -1873335392);
        float var15 = this.method562(var7 - var5, var3 - var1, -1233579325);
        int var16 = (int) Math.ceil((double) var15);
        this.field312 = var16;
        if (!this.field305.containsKey(Integer.valueOf(var16))) {
            class35 var17 = new class35(var16);
            var17.method652(721557946);
            this.field305.put(Integer.valueOf(var16), var17);
        }

        class23[] var23 = new class23[8];

        int var18;
        int var19;
        for (var18 = var14.field159; var18 < var14.field159 + var14.field163; ++var18) {
            for (var19 = var14.field160; var19 < var14.field157 + var14.field160; ++var19) {
                this.method534(var18, var19, var23, (byte) 36);
                this.field304[var18][var19]
                    .method341(var16, (class35) this.field305.get(Integer.valueOf(var16)), var23,
                               this.field306, -2006576570);
            }
        }

        class319.method6038(var10, var11, var12);
        class319.method6050(var13);
        var18 = (int) (var15 * 64.0F);
        var19 = this.field310 + var1;
        int var20 = var2 + this.field309;

        for (int var21 = var14.field159; var21 < var14.field159 + var14.field163; ++var21) {
            for (int var22 = var14.field160; var22 < var14.field160 + var14.field157; ++var22) {
                this.field304[var21][var22].method336(
                    var5 + var18 * (this.field304[var21][var22].field233 * 64 - var19) / 64,
                    var8 - var18 * (this.field304[var21][var22].field234 * 64 - var20 + 64) / 64,
                    var18, 114823708);
            }
        }

    }

    public final void method549(int var1, int var2, int var3, int var4, int var5, int var6,
                                int var7, int var8, HashSet var9, HashSet var10, int var11,
                                int var12, boolean var13, int var14) {
        class17 var15 = this.method542(var1, var2, var3, var4, -1279881835);
        float var16 = this.method562(var7 - var5, var3 - var1, -2127158118);
        int var17 = (int) (64.0F * var16);
        int var18 = this.field310 + var1;
        int var19 = var2 + this.field309;

        int var20;
        int var21;
        for (var20 = var15.field159; var20 < var15.field159 + var15.field163; ++var20) {
            for (var21 = var15.field160; var21 < var15.field160 + var15.field157; ++var21) {
                if (var13) {
                    this.field304[var20][var21].method436((byte) -26);
                }

                this.field304[var20][var21].method416(
                    var5 + var17 * (this.field304[var20][var21].field233 * 64 - var18) / 64,
                    var8 - var17 * (this.field304[var20][var21].field234 * 64 - var19 + 64) / 64,
                    var17, var9, 431492400);
            }
        }

        if (var10 != null && var11 > 0) {
            for (var20 = var15.field159; var20 < var15.field159 + var15.field163; ++var20) {
                for (var21 = var15.field160; var21 < var15.field160 + var15.field157; ++var21) {
                    this.field304[var20][var21].method343(var10, var11, var12, (byte) 72);
                }
            }
        }

    }
}
