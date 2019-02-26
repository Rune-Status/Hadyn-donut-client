package jagex.osrs;

import java.util.Iterator;

public class class250 implements Runnable {

    public static Object field3241;
    public static int field3243;
    static class207 field3242;
    static class207 field3244;
    static Thread field3245;
    static int[][] field3247;
    static boolean field3246;

    static {
        field3242 = new class207();
        field3244 = new class207();
        field3243 = 0;
        field3241 = new Object();
    }

    public static class260 method4918(int var0, int var1) {
        class260 var2 = (class260) class260.field3344.method4198((long) var0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class260.field3347.method4831(13, var0, 1789634852);
            var2 = new class260();
            var2.field3357 = var0;
            if (var3 != null) {
                var2.method5089(new Buffer(var3), -1499812191);
            }

            class260.field3344.method4204(var2, (long) var0);
            return var2;
        }
    }

    static final void method4920(int var0) {
        for (int var1 = 0; var1 < class83.field1226; ++var1) {
            Player var2 = client.players[class83.field1222[var1]];
            var2.method1174((byte) 9);
        }

        Iterator var3 = class85.field1249.iterator();

        while (var3.hasNext()) {
            class59 var4 = (class59) var3.next();
            var4.method1143((short) 27658);
        }

        if (class3.field26 != null) {
            class3.field26.method5737(-1219113165);
        }

    }

    public void run() {
        try {
            while (true) {
                class207 var2 = field3242;
                class247 var1;
                synchronized (field3242) {
                    var1 = (class247) field3242.method4298();
                }

                Object var14;
                if (var1 != null) {
                    if (var1.field3213 == 0) {
                        var1.field3215
                            .method3587((int) var1.key, var1.field3212, var1.field3212.length,
                                        (byte) 2);
                        var2 = field3242;
                        synchronized (field3242) {
                            var1.unlink();
                        }
                    } else if (var1.field3213 == 1) {
                        var1.field3212 = var1.field3215
                            .get((int) var1.key);
                        var2 = field3242;
                        synchronized (field3242) {
                            field3244.method4276(var1);
                        }
                    }

                    var14 = field3241;
                    synchronized (field3241) {
                        if (field3243 <= 1) {
                            field3243 = 0;
                            field3241.notifyAll();
                            return;
                        }

                        field3243 = 600;
                    }
                } else {
                    class272.method5390(100L);
                    var14 = field3241;
                    synchronized (field3241) {
                        if (field3243 <= 1) {
                            field3243 = 0;
                            field3241.notifyAll();
                            return;
                        }

                        --field3243;
                    }
                }
            }
        } catch (Exception var13) {
            class80.method2041((String) null, var13, 1652089565);
        }
    }
}
