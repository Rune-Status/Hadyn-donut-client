package jagex.osrs;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class class33 extends class20 {

    static short[] field325;
    List field326;
    HashSet field327;
    HashSet field324;

    public static String method616(int var0, boolean var1, int var2) {
        if (var1 && var0 >= 0) {
            int var4 = var0;
            String var3;
            if (var1 && var0 >= 0) {
                int var5 = 2;

                for (int var6 = var0 / 10; var6 != 0; ++var5) {
                    var6 /= 10;
                }

                char[] var7 = new char[var5];
                var7[0] = '+';

                for (int var8 = var5 - 1; var8 > 0; --var8) {
                    int var9 = var4;
                    var4 /= 10;
                    int var10 = var9 - var4 * 10;
                    if (var10 >= 10) {
                        var7[var8] = (char) (var10 + 87);
                    } else {
                        var7[var8] = (char) (var10 + 48);
                    }
                }

                var3 = new String(var7);
            } else {
                var3 = Integer.toString(var0, 10);
            }

            return var3;
        } else {
            return Integer.toString(var0);
        }
    }

    static final void method607(int var0, int var1, int var2) {
        if (class189.method4028(var0, 2142768270)) {
            class23.method335(class145.field1951[var0], var1, 1644708717);
        }
    }

    static final void method612(class64 var0, int var1, int var2) {
        class157.method3463(var0.x, var0.z, var1, -1023661486);
    }

    void method609(Buffer var1, boolean var2, byte var3) {
        this.field326 = new LinkedList();
        int var4 = var1.readUint16();

        for (int var5 = 0; var5 < var4; ++var5) {
            int var6 = var1.method3898((byte) -111);
            class228 var7 = new class228(var1.getInt());
            boolean var8 = var1.readUint8() == 1;
            if (var2 || !var8) {
                this.field326.add(new class13(var6, var7));
            }
        }

    }

    void method608(Buffer var1, Buffer var2, Buffer var3, int var4, boolean var5, int var6) {
        this.method262(var1, var4, -1677569493);
        int var7 = var3.readUint16();
        this.field327 = new HashSet(var7);

        int var8;
        for (var8 = 0; var8 < var7; ++var8) {
            class10 var9 = new class10();

            try {
                var9.method106(var2, var3, 1266482310);
            } catch (IllegalStateException var14) {
                continue;
            }

            this.field327.add(var9);
        }

        var8 = var3.readUint16();
        this.field324 = new HashSet(var8);

        for (int var12 = 0; var12 < var8; ++var12) {
            class34 var10 = new class34();

            try {
                var10.method631(var2, var3, 1833285735);
            } catch (IllegalStateException var13) {
                continue;
            }

            this.field324.add(var10);
        }

        this.method609(var2, var5, (byte) 101);
    }
}
