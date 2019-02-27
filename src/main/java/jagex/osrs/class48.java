package jagex.osrs;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class class48 implements MouseListener, MouseMotionListener, FocusListener {

    public static class48 field470;
    public static volatile int field481;
    public static volatile int field484;
    public static volatile int field466;
    public static volatile int field474;
    public static int field477;
    public static volatile int field463;
    public static int field473;
    public static volatile int field475;
    public static volatile long field468;
    public static int field464;
    public static int field469;
    public static long field472;
    public static int field478;
    public static int field467;
    public static volatile long field476;
    public static volatile int field471;
    public static long field465;

    static {
        field470 = new class48();
        field484 = 0;
        field481 = 0;
        field466 = -1;
        field463 = -1;
        field468 = -1L;
        field469 = 0;
        field473 = 0;
        field464 = 0;
        field472 = 0L;
        field471 = 0;
        field474 = 0;
        field475 = 0;
        field476 = 0L;
        field477 = 0;
        field478 = 0;
        field467 = 0;
        field465 = 0L;
    }

    public static void method1019(byte var0) {
        while (true) {
            Deque var2 = class250.field3242;
            class247 var1;
            synchronized (class250.field3242) {
                var1 = (class247) class250.field3244.method4279();
            }

            if (var1 == null) {
                return;
            }

            var1.field3214
                .method4928(var1.field3215, (int) var1.key, var1.field3212, false, (byte) 29);
        }
    }

    public static void method1021(byte var0) {
        class274.field3601.method4199();
    }

    static class59 method989(int var0, int var1, int var2) {
        class88 var3 = (class88) class85.field1248.get(Integer.valueOf(var0));
        return var3.method2176(var1, -914643719);
    }

    static void method1017(String var0, boolean var1, byte var2) {
        var0 = var0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;

        for (int var5 = 0; var5 < class316.field3840; ++var5) {
            ItemConfig var6 = ItemConfig.get(var5);
            if ((!var1 || var6.field3509) && var6.field3552 == -1
                && var6.field3515.toLowerCase().indexOf(var0) != -1) {
                if (var4 >= 250) {
                    class152.field1983 = -1;
                    class33.field325 = null;
                    return;
                }

                if (var4 >= var3.length) {
                    short[] var7 = new short[var3.length * 2];

                    for (int var8 = 0; var8 < var4; ++var8) {
                        var7[var8] = var3[var8];
                    }

                    var3 = var7;
                }

                var3[var4++] = (short) var5;
            }
        }

        class33.field325 = var3;
        class9.field69 = 0;
        class152.field1983 = var4;
        String[] var9 = new String[class152.field1983];

        for (int var10 = 0; var10 < class152.field1983; ++var10) {
            var9[var10] = ItemConfig.get(var3[var10]).field3515;
        }

        short[] var11 = class33.field325;
        class177.method3696(var9, var11, 0, var9.length - 1, 1917868403);
    }

    public final synchronized void mouseMoved(MouseEvent var1) {
        if (field470 != null) {
            field484 = 0;
            field466 = var1.getX();
            field463 = var1.getY();
            field468 = var1.getWhen();
        }

    }

    final int method985(MouseEvent var1, int var2) {
        int var3 = var1.getButton();
        return !var1.isAltDown() && var3 != 2 ? (!var1.isMetaDown() && var3 != 3 ? 1 : 2) : 4;
    }

    public final synchronized void mousePressed(MouseEvent var1) {
        if (field470 != null) {
            field484 = 0;
            field474 = var1.getX();
            field475 = var1.getY();
            field476 = Time.currentTimeMillis();
            field471 = this.method985(var1, -1173032679);
            if (field471 != 0) {
                field481 = field471;
            }
        }

        if (var1.isPopupTrigger()) {
            var1.consume();
        }

    }

    public final synchronized void mouseReleased(MouseEvent var1) {
        if (field470 != null) {
            field484 = 0;
            field481 = 0;
        }

        if (var1.isPopupTrigger()) {
            var1.consume();
        }

    }

    public final void mouseClicked(MouseEvent var1) {
        if (var1.isPopupTrigger()) {
            var1.consume();
        }

    }

    public final synchronized void mouseEntered(MouseEvent var1) {
        this.mouseMoved(var1);
    }

    public final synchronized void mouseExited(MouseEvent var1) {
        if (field470 != null) {
            field484 = 0;
            field466 = -1;
            field463 = -1;
            field468 = var1.getWhen();
        }

    }

    public final synchronized void mouseDragged(MouseEvent var1) {
        this.mouseMoved(var1);
    }

    public final synchronized void focusLost(FocusEvent var1) {
        if (field470 != null) {
            field481 = 0;
        }

    }

    public final void focusGained(FocusEvent var1) {
    }
}
