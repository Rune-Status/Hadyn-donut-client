package jagex.osrs;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public final class class39 implements KeyListener, FocusListener {

    public static class39 field386;
    public static int field383;
    public static boolean[] field380;
    public static int[] field381;
    public static int field374;
    public static int field389;
    public static int field388;
    public static short[] field385;
    public static int[] field377;
    public static int field387;
    public static volatile int field391;
    public static int field390;
    static int[] field392;
    static int[] field369;
    static char[] field384;

    static {
        field386 = new class39();
        field380 = new boolean[112];
        field381 = new int[128];
        field374 = 0;
        field383 = 0;
        field384 = new char[128];
        field369 = new int[128];
        field377 = new int[128];
        field387 = 0;
        field388 = 0;
        field389 = 0;
        field390 = 0;
        field391 = 0;
        field392 = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82,
            86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98,
            97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1,
            -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35,
            49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225,
            230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1,
            -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
            -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    }

    static final void method759(class64 var0, short var1) {
        if (var0.field947 != 0) {
            if (var0.field965 != -1) {
                Object var2 = null;
                if (var0.field965 < 32768) {
                    var2 = client.field806[var0.field965];
                } else if (var0.field965 >= 32768) {
                    var2 = client.players[var0.field965 - 32768];
                }

                if (var2 != null) {
                    int var3 = var0.x - ((class64) var2).x;
                    int var4 = var0.z - ((class64) var2).z;
                    if (var3 != 0 || var4 != 0) {
                        var0.field990 =
                            (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 2047;
                    }
                } else if (var0.field966) {
                    var0.field965 = -1;
                    var0.field966 = false;
                }
            }

            if (var0.field967 != -1 && (var0.field939 == 0 || var0.field955 > 0)) {
                var0.field990 = var0.field967;
                var0.field967 = -1;
            }

            int var5 = var0.field990 - var0.field940 & 2047;
            if (var5 == 0 && var0.field966) {
                var0.field965 = -1;
                var0.field966 = false;
            }

            if (var5 != 0) {
                ++var0.field991;
                boolean var7;
                if (var5 > 1024) {
                    var0.field940 -= var0.field947;
                    var7 = true;
                    if (var5 < var0.field947 || var5 > 2048 - var0.field947) {
                        var0.field940 = var0.field990;
                        var7 = false;
                    }

                    if (var0.field972 == var0.field944 && (var0.field991 > 25 || var7)) {
                        if (var0.field945 != -1) {
                            var0.field972 = var0.field945;
                        } else {
                            var0.field972 = var0.field942;
                        }
                    }
                } else {
                    var0.field940 += var0.field947;
                    var7 = true;
                    if (var5 < var0.field947 || var5 > 2048 - var0.field947) {
                        var0.field940 = var0.field990;
                        var7 = false;
                    }

                    if (var0.field972 == var0.field944 && (var0.field991 > 25 || var7)) {
                        if (var0.field957 != -1) {
                            var0.field972 = var0.field957;
                        } else {
                            var0.field972 = var0.field942;
                        }
                    }
                }

                var0.field940 &= 2047;
            } else {
                var0.field991 = 0;
            }

        }
    }

    public final synchronized void keyPressed(KeyEvent var1) {
        if (field386 != null) {
            int var2 = var1.getKeyCode();
            if (var2 >= 0 && var2 < field392.length) {
                var2 = field392[var2];
                if ((var2 & 128) != 0) {
                    var2 = -1;
                }
            } else {
                var2 = -1;
            }

            if (field383 >= 0 && var2 >= 0) {
                field381[field383] = var2;
                field383 = field383 + 1 & 127;
                if (field383 == field374) {
                    field383 = -1;
                }
            }

            int var3;
            if (var2 >= 0) {
                var3 = field389 + 1 & 127;
                if (var3 != field388) {
                    field369[field389] = var2;
                    field384[field389] = 0;
                    field389 = var3;
                }
            }

            var3 = var1.getModifiers();
            if ((var3 & 10) != 0 || var2 == 85 || var2 == 10) {
                var1.consume();
            }
        }

    }

    public final synchronized void keyReleased(KeyEvent var1) {
        if (field386 != null) {
            int var2 = var1.getKeyCode();
            if (var2 >= 0 && var2 < field392.length) {
                var2 = field392[var2] & -129;
            } else {
                var2 = -1;
            }

            if (field383 >= 0 && var2 >= 0) {
                field381[field383] = ~var2;
                field383 = field383 + 1 & 127;
                if (field374 == field383) {
                    field383 = -1;
                }
            }
        }

        var1.consume();
    }

    public final void keyTyped(KeyEvent var1) {
        if (field386 != null) {
            char var2 = var1.getKeyChar();
            if (var2 != 0 && var2 != '\uffff') {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label60:
                    {
                        if (var2 != 0) {
                            char[] var7 = class303.field3785;

                            for (int var5 = 0; var5 < var7.length; ++var5) {
                                char var6 = var7[var5];
                                if (var6 == var2) {
                                    var3 = true;
                                    break label60;
                                }
                            }
                        }

                        var3 = false;
                    }
                }

                if (var3) {
                    int var4 = field389 + 1 & 127;
                    if (var4 != field388) {
                        field369[field389] = -1;
                        field384[field389] = var2;
                        field389 = var4;
                    }
                }
            }
        }

        var1.consume();
    }

    public final synchronized void focusLost(FocusEvent var1) {
        if (field386 != null) {
            field383 = -1;
        }

    }

    public final void focusGained(FocusEvent var1) {
    }
}
