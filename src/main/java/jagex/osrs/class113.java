package jagex.osrs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

public class class113 implements class133 {

    static long field1511;
    int field1506;
    double field1505;
    class118[] field1508;
    Deque field1502;
    int field1503;
    int field1510;
    class249 field1507;

    public class113(class249 var1, class249 var2, int var3, double var4, int var6) {
        this.field1502 = new Deque();
        this.field1503 = 0;
        this.field1505 = 1.0D;
        this.field1506 = 128;
        this.field1507 = var2;
        this.field1510 = var3;
        this.field1503 = this.field1510;
        this.field1505 = var4;
        this.field1506 = var6;
        int[] var7 = var1.method4839(0, -1044390459);
        int var8 = var7.length;
        this.field1508 = new class118[var1.method4889(0, 1064669026)];

        for (int var9 = 0; var9 < var8; ++var9) {
            Buffer var10 = new Buffer(var1.method4831(0, var7[var9], 1789634852));
            this.field1508[var7[var9]] = new class118(var10);
        }

    }

    static String method2767(Throwable var0, int var1) throws IOException {
        String var2;
        if (var0 instanceof class154) {
            class154 var3 = (class154) var0;
            var2 = var3.field2001 + " | ";
            var0 = var3.field1998;
        } else {
            var2 = "";
        }

        StringWriter var13 = new StringWriter();
        PrintWriter var4 = new PrintWriter(var13);
        var0.printStackTrace(var4);
        var4.close();
        String var5 = var13.toString();
        BufferedReader var6 = new BufferedReader(new StringReader(var5));
        String var7 = var6.readLine();

        while (true) {
            while (true) {
                String var8 = var6.readLine();
                if (var8 == null) {
                    var2 = var2 + "| " + var7;
                    return var2;
                }

                int var9 = var8.indexOf(40);
                int var10 = var8.indexOf(41, var9 + 1);
                if (var9 >= 0 && var10 >= 0) {
                    String var11 = var8.substring(var9 + 1, var10);
                    int var12 = var11.indexOf(".java:");
                    if (var12 >= 0) {
                        var11 = var11.substring(0, var12) + var11.substring(var12 + 5);
                        var2 = var2 + var11 + ' ';
                        continue;
                    }

                    var8 = var8.substring(0, var9);
                }

                var8 = var8.trim();
                var8 = var8.substring(var8.lastIndexOf(32) + 1);
                var8 = var8.substring(var8.lastIndexOf(9) + 1);
                var2 = var2 + var8 + ' ';
            }
        }
    }

    public void method2763(int var1) {
        for (int var2 = 0; var2 < this.field1508.length; ++var2) {
            if (this.field1508[var2] != null) {
                this.field1508[var2].method2855();
            }
        }

        this.field1502 = new Deque();
        this.field1503 = this.field1510;
    }

    public int vmethod3247(int var1, int var2) {
        return this.field1508[var1] != null ? this.field1508[var1].field1593 : 0;
    }

    public int[] vmethod3259(int var1, byte var2) {
        class118 var3 = this.field1508[var1];
        if (var3 != null) {
            if (var3.field1592 != null) {
                this.field1502.addFirst(var3);
                var3.field1589 = true;
                return var3.field1592;
            }

            boolean var4 = var3.method2854(this.field1505, this.field1506, this.field1507);
            if (var4) {
                if (this.field1503 == 0) {
                    class118 var5 = (class118) this.field1502.method4280();
                    var5.method2855();
                } else {
                    --this.field1503;
                }

                this.field1502.addFirst(var3);
                var3.field1589 = true;
                return var3.field1592;
            }
        }

        return null;
    }

    public boolean vmethod3248(int var1, int var2) {
        return this.field1506 == 64;
    }

    public boolean vmethod3250(int var1, byte var2) {
        return this.field1508[var1].field1602;
    }

    public int method2742(int var1) {
        int var2 = 0;
        int var3 = 0;
        class118[] var4 = this.field1508;

        for (int var5 = 0; var5 < var4.length; ++var5) {
            class118 var6 = var4[var5];
            if (var6 != null && var6.field1595 != null) {
                var2 += var6.field1595.length;
                int[] var7 = var6.field1595;

                for (int var8 = 0; var8 < var7.length; ++var8) {
                    int var9 = var7[var8];
                    if (this.field1507.method4829(var9, -1629304314)) {
                        ++var3;
                    }
                }
            }
        }

        if (var2 == 0) {
            return 0;
        } else {
            return var3 * 100 / var2;
        }
    }

    public void method2743(double var1) {
        this.field1505 = var1;
        this.method2763(-1398303545);
    }

    public void method2748(int var1, byte var2) {
        for (int var3 = 0; var3 < this.field1508.length; ++var3) {
            class118 var4 = this.field1508[var3];
            if (var4 != null && var4.field1599 != 0 && var4.field1589) {
                var4.method2856(var1);
                var4.field1589 = false;
            }
        }

    }
}
