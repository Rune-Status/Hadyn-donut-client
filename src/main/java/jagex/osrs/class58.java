package jagex.osrs;

public class class58 implements Runnable {

    static int[] field583;
    boolean field586;
    Object field581;
    int field580;
    int[] field585;
    int[] field584;
    long[] field582;

    class58() {
        this.field586 = true;
        this.field581 = new Object();
        this.field580 = 0;
        this.field585 = new int[500];
        this.field584 = new int[500];
        this.field582 = new long[500];
    }

    static final void method1130(class107 var0, int var1) {
        var0.field1445 = false;
        if (var0.field1442 != null) {
            var0.field1442.field1476 = 0;
        }

        for (class107 var2 = var0.vmethod4596(); var2 != null; var2 = var0.vmethod4598()) {
            method1130(var2, 892747353);
        }

    }

    static final void method1132(String var0, boolean var1, int var2) {
        if (client.field758) {
            byte var3 = 4;
            int var4 = var3 + 6;
            int var5 = var3 + 6;
            int var6 = class3.field25.method5795(var0, 250);
            int var7 = class3.field25.method5796(var0, 250) * 13;
            class319
                .method6047(var4 - var3, var5 - var3, var3 + var6 + var3, var3 + var7 + var3, 0);
            class319.method6116(var4 - var3, var5 - var3, var6 + var3 + var3, var3 + var3 + var7,
                                16777215);
            class3.field25.method5792(var0, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
            int var8 = var4 - var3;
            int var9 = var5 - var3;
            int var10 = var3 + var6 + var3;
            int var11 = var3 + var7 + var3;

            for (int var12 = 0; var12 < client.field853; ++var12) {
                if (client.field819[var12] + client.field763[var12] > var8
                    && client.field763[var12] < var10 + var8
                    && client.field854[var12] + client.field852[var12] > var9
                    && client.field852[var12] < var9 + var11) {
                    client.field848[var12] = true;
                }
            }

            if (var1) {
                class30.field313.vmethod6120(0, 0, 2014794570);
            } else {
                class227.method4641(var4, var5, var6, var7, (byte) 0);
            }

        }
    }

    public static void method1131(class249 var0, class249 var1, class249 var2, int var3) {
        class275.field3631 = var0;
        class275.field3616 = var1;
        class275.field3617 = var2;
    }

    public void run() {
        for (; this.field586; class272.method5390(50L)) {
            Object var1 = this.field581;
            synchronized (this.field581) {
                if (this.field580 < 500) {
                    this.field585[this.field580] = class48.field473;
                    this.field584[this.field580] = class48.field464 * -976212263;
                    this.field582[this.field580] = class48.field472;
                    ++this.field580;
                }
            }
        }

    }
}
