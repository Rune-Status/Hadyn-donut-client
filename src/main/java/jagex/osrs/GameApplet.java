package jagex.osrs;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.ImageObserver;
import java.net.URL;

public abstract class GameApplet extends Applet implements Runnable, FocusListener, WindowListener {

    protected static long[] field444;
    protected static long[] field429;
    protected static class156 field426;
    protected static class162 field433;
    protected static int field434;
    static volatile boolean field457;
    static GameApplet field427;
    static boolean field430;
    static int field428;
    static long field436;
    static class67 field435;
    static int field432;
    static int field438;
    static int field437;
    static int field450;
    static long field460;
    static long field459;
    static class323[] field461;

    static {
        field427 = null;
        field428 = 0;
        field436 = 0L;
        field430 = false;
        field432 = 20;
        field438 = 1;
        field434 = 0;
        field429 = new long[32];
        field444 = new long[32];
        field450 = 500;
        field457 = true;
        field460 = -1L;
        field459 = -1L;
    }

    final EventQueue field456;
    protected int field439;
    protected int field440;
    Clipboard field455;
    boolean field451;
    int maximumWidth;
    class38 field454;
    int field442;
    boolean field431;
    Frame field447;
    Canvas field448;
    int field441;
    int maximumHeight;
    volatile boolean field449;
    int minimumWidth;
    int minimumHeight;
    volatile long field453;
    volatile boolean field452;

    protected GameApplet() {
        this.field431 = false;
        this.field442 = 0;
        this.field441 = 0;
        this.field449 = true;
        this.field451 = false;
        this.field452 = false;
        this.field453 = 0L;
        EventQueue var1 = null;

        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
            ;
        }

        this.field456 = var1;
        class40 var2 = new class40();
        class67.field1036 = var2;
    }

    protected final boolean method857(int var1) {
        /*
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (!var2.equals("jagex.com") && !var2.endsWith(".jagex.com")) {
            if (!var2.equals("runescape.com") && !var2.endsWith(".runescape.com")) {
                if (var2.endsWith("127.0.0.1")) {
                    return true;
                } else {
                    while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0'
                        && var2.charAt(var2.length() - 1) <= '9') {
                        var2 = var2.substring(0, var2.length() - 1);
                    }

                    if (var2.endsWith("192.168.1.")) {
                        return true;
                    } else {
                        this.method874("invalidhost", -937061970);
                        return false;
                    }
                }
            } else {
                return true;
            }
        } else {
            return true;
        }
        */
        return true;
    }

    public final synchronized void paint(Graphics var1) {
        if (this == field427 && !field430) {
            this.field449 = true;
            if (class120.method2866((short) 3133) - this.field453 > 1000L) {
                Rectangle var2 = var1.getClipBounds();
                if (var2 == null
                    || var2.width >= class68.windowWidth && var2.height >= class141.windowHeight) {
                    this.field452 = true;
                }
            }

        }
    }

    public final void destroy() {
        if (this == field427 && !field430) {
            field436 = class120.method2866((short) 3133);
            class272.method5390(5000L);
            this.method862(-365773934);
        }
    }

    class315 getContainerDimensions(int var1) {
        Container var2 = this.getContainer(1227532105);
        int var3 = Math.max(var2.getWidth(), this.minimumWidth);
        int var4 = Math.max(var2.getHeight(), this.minimumHeight);
        if (this.field447 != null) {
            Insets var5 = this.field447.getInsets();
            var3 -= var5.left + var5.right;
            var4 -= var5.bottom + var5.top;
        }

        return new class315(var3, var4);
    }

    Container getContainer(int var1) {
        return (Container) (this.field447 != null ? this.field447 : this);
    }

    protected void method874(String var1, int var2) {
        if (!this.field431) {
            this.field431 = true;
            System.out.println("error_game_" + var1);

            try {
                this.getAppletContext()
                    .showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"),
                                  "_self");
            } catch (Exception var4) {
                ;
            }

        }
    }

    final void method867(byte var1) {
        this.field451 = true;
    }

    final synchronized void method862(int var1) {
        if (!field430) {
            field430 = true;

            try {
                this.field448.removeFocusListener(this);
            } catch (Exception var6) {
                ;
            }

            try {
                this.vmethod1240(-287340265);
            } catch (Exception var5) {
                ;
            }

            if (this.field447 != null) {
                try {
                    System.exit(0);
                } catch (Throwable var4) {
                    ;
                }
            }

            if (field426 != null) {
                try {
                    field426.method3429(-2140513690);
                } catch (Exception var3) {
                    ;
                }
            }

            this.vmethod1465((short) -475);
        }
    }

    final synchronized void method931(int var1) {
        Container var2 = this.getContainer(-1267542948);
        if (this.field448 != null) {
            this.field448.removeFocusListener(this);
            var2.remove(this.field448);
        }

        class68.windowWidth = Math.max(var2.getWidth(), this.minimumWidth);
        class141.windowHeight = Math.max(var2.getHeight(), this.minimumHeight);
        Insets var3;
        if (this.field447 != null) {
            var3 = this.field447.getInsets();
            class68.windowWidth -= var3.right + var3.left;
            class141.windowHeight -= var3.bottom + var3.top;
        }

        this.field448 = new class42(this);
        var2.setBackground(Color.BLACK);
        var2.setLayout((LayoutManager) null);
        var2.add(this.field448);
        this.field448.setSize(class68.windowWidth, class141.windowHeight);
        this.field448.setVisible(true);
        this.field448.setBackground(Color.BLACK);
        if (var2 == this.field447) {
            var3 = this.field447.getInsets();
            this.field448.setLocation(var3.left + this.field442, this.field441 + var3.top);
        } else {
            this.field448.setLocation(this.field442, this.field441);
        }

        this.field448.addFocusListener(this);
        this.field448.requestFocus();
        this.field449 = true;
        if (class30.field313 != null && class68.windowWidth == class30.field313.field3864
            && class141.windowHeight == class30.field313.field3861) {
            ((class46) class30.field313).method830(this.field448, (byte) -29);
            class30.field313.vmethod6120(0, 0, 1963091958);
        } else {
            class30.field313 = new class46(class68.windowWidth, class141.windowHeight, this.field448);
        }

        this.field452 = false;
        this.field453 = class120.method2866((short) 3133);
    }

    protected abstract void vmethod1240(int var1);

    final void method935(byte var1) {
        Container var2 = this.getContainer(-1208313330);
        if (var2 == null) {
            return;
        }
        class315 var3 = this.getContainerDimensions(1778052188);
        this.field439 = Math.max(var3.width, this.minimumWidth);
        this.field440 = Math.max(var3.height, this.minimumHeight);
        if (this.field439 <= 0) {
            this.field439 = 1;
        }

        if (this.field440 <= 0) {
            this.field440 = 1;
        }

        class68.windowWidth = Math.min(this.field439, this.maximumWidth);
        class141.windowHeight = Math.min(this.field440, this.maximumHeight);
        this.field442 = (this.field439 - class68.windowWidth) / 2;
        this.field441 = 0;
        this.field448.setSize(class68.windowWidth, class141.windowHeight);
        class30.field313 = new class46(class68.windowWidth, class141.windowHeight, this.field448);
        if (var2 == this.field447) {
            Insets var4 = this.field447.getInsets();
            this.field448.setLocation(this.field442 + var4.left, var4.top + this.field441);
        } else {
            this.field448.setLocation(this.field442, this.field441);
        }

        this.field449 = true;
        this.vmethod1248(-2048042933);
    }

    protected abstract void vmethod1483(int var1);

    protected abstract void vmethod1465(short var1);

    protected final void method873(int var1) {
        class136.field1892 = null;
        class147.field1963 = null;
        class137.field1917 = null;
    }

    void method859(byte var1) {
        Container var2 = this.getContainer(1469560962);
        long var3 = class120.method2866((short) 3133);
        long var5 = field429[field437];
        field429[field437] = var3;
        field437 = field437 + 1 & 31;
        if (0L != var5 && var3 > var5) {
            int var7 = (int) (var3 - var5);
            field434 = ((var7 >> 1) + 32000) / var7;
        }

        if (++field450 - 1 > 50) {
            field450 -= 50;
            this.field449 = true;
            this.field448.setSize(class68.windowWidth, class141.windowHeight);
            this.field448.setVisible(true);
            if (var2 == this.field447) {
                Insets var8 = this.field447.getInsets();
                this.field448.setLocation(var8.left + this.field442, var8.top + this.field441);
            } else {
                this.field448.setLocation(this.field442, this.field441);
            }
        }

        if (this.field452) {
            this.method854((byte) 82);
        }

        this.method851((byte) 0);
        this.vmethod1239(this.field449, 874565984);
        if (this.field449) {
            this.method981(-439442551);
        }

        this.field449 = false;
    }

    protected abstract void vmethod1238(int var1);

    protected final void method872(int var1, String var2, boolean var3, int var4) {
        try {
            Graphics var5 = this.field448.getGraphics();
            if (class147.field1963 == null) {
                class147.field1963 = new Font("Helvetica", 1, 13);
                class137.field1917 = this.field448.getFontMetrics(class147.field1963);
            }

            if (var3) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class68.windowWidth, class141.windowHeight);
            }

            Color var6 = new Color(140, 17, 17);

            try {
                if (class136.field1892 == null) {
                    class136.field1892 = this.field448.createImage(304, 34);
                }

                Graphics var7 = class136.field1892.getGraphics();
                var7.setColor(var6);
                var7.drawRect(0, 0, 303, 33);
                var7.fillRect(2, 2, var1 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(1, 1, 301, 31);
                var7.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30);
                var7.setFont(class147.field1963);
                var7.setColor(Color.white);
                var7.drawString(var2, (304 - class137.field1917.stringWidth(var2)) / 2, 22);
                var5.drawImage(class136.field1892, class68.windowWidth / 2 - 152,
                               class141.windowHeight / 2 - 18, (ImageObserver) null);
            } catch (Exception var10) {
                int var8 = class68.windowWidth / 2 - 152;
                int var9 = class141.windowHeight / 2 - 18;
                var5.setColor(var6);
                var5.drawRect(var8, var9, 303, 33);
                var5.fillRect(var8 + 2, var9 + 2, var1 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var8 + 1, var9 + 1, 301, 31);
                var5.fillRect(var1 * 3 + var8 + 2, var9 + 2, 300 - var1 * 3, 30);
                var5.setFont(class147.field1963);
                var5.setColor(Color.white);
                var5.drawString(var2, var8 + (304 - class137.field1917.stringWidth(var2)) / 2,
                                var9 + 22);
            }
        } catch (Exception var11) {
            this.field448.repaint();
        }

    }

    void method858(byte var1) {
        long var2 = class120.method2866((short) 3133);
        long var4 = field444[class320.field3863];
        field444[class320.field3863] = var2;
        class320.field3863 = class320.field3863 + 1 & 31;
        if (0L != var4 && var2 > var4) {
            ;
        }

        synchronized (this) {
            class167.field2111 = field457;
        }

        this.vmethod1238(886624104);
    }

    final void method845(Object var1, int var2) {
        if (this.field456 != null) {
            for (int var3 = 0; var3 < 50 && this.field456.peekEvent() != null; ++var3) {
                class272.method5390(1L);
            }

            if (var1 != null) {
                this.field456.postEvent(new ActionEvent(var1, 1001, "dummy"));
            }

        }
    }

    protected final void method844(int var1) {
        class70.method1949(1145405442);
        class30.method574(this.field448, 1302375733);
    }

    protected final void method850(int var1) {
        class30.method579(this.field448, 1654789779);
    }

    protected class158 method848(byte var1) {
        if (this.field454 == null) {
            this.field454 = new class38();
            this.field454.method722(this.field448, 1285201948);
        }

        return this.field454;
    }

    protected void method918(int var1) {
        this.field455 = this.getToolkit().getSystemClipboard();
    }

    protected final void method855(int var1, int var2, int var3, int var4) {
        try {
            if (field427 != null) {
                ++field428;
                if (field428 >= 3) {
                    this.method874("alreadyloaded", 687324310);
                    return;
                }

                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }

            field427 = this;
            class68.windowWidth = var1;
            class141.windowHeight = var2;
            class313.field3831 = var3;
            class154.field1999 = this;
            if (field426 == null) {
                field426 = new class156();
            }

            field426.method3439(this, 1, (byte) -104);
        } catch (Exception var6) {
            class80.method2041((String) null, var6, 1787681899);
            this.method874("crash", -582316656);
        }

    }

    protected abstract void vmethod1248(int var1);

    protected final void setMaximumDimensions(int var1, int var2) {
        if (this.maximumWidth != var1 || var2 != this.maximumHeight) {
            this.method867((byte) 73);
        }

        this.maximumWidth = var1;
        this.maximumHeight = var2;
    }

    final void method854(byte var1) {
        class85.method2144(this.field448, -1487164387);
        Canvas var2 = this.field448;
        var2.removeMouseListener(class48.field470);
        var2.removeMouseMotionListener(class48.field470);
        var2.removeFocusListener(class48.field470);
        class48.field481 = 0;
        if (this.field454 != null) {
            this.field454.method728(this.field448, (short) 1300);
        }

        this.method931(-2093790396);
        class30.method574(this.field448, 1842913468);
        class30.method579(this.field448, 1654789779);
        if (this.field454 != null) {
            this.field454.method722(this.field448, 624658255);
        }

        this.method867((byte) 2);
    }

    final void method851(byte var1) {
        class315 var2 = this.getContainerDimensions(1720972776);
        if (var2.width != this.field439 || var2.height != this.field440 || this.field451) {
            this.method935((byte) -41);
            this.field451 = false;
        }

    }

    protected abstract void vmethod1239(boolean var1, int var2);

    void method981(int var1) {
        int var2 = this.field442;
        int var3 = this.field441;
        int var4 = this.field439 - class68.windowWidth - var2;
        int var5 = this.field440 - class141.windowHeight - var3;
        if (var2 > 0 || var4 > 0 || var3 > 0 || var5 > 0) {
            try {
                Container var6 = this.getContainer(373408902);
                int var7 = 0;
                int var8 = 0;
                if (var6 == this.field447) {
                    Insets var9 = this.field447.getInsets();
                    var7 = var9.left;
                    var8 = var9.top;
                }

                Graphics var11 = var6.getGraphics();
                var11.setColor(Color.black);
                if (var2 > 0) {
                    var11.fillRect(var7, var8, var2, this.field440);
                }

                if (var3 > 0) {
                    var11.fillRect(var7, var8, this.field439, var3);
                }

                if (var4 > 0) {
                    var11.fillRect(var7 + this.field439 - var4, var8, var4, this.field440);
                }

                if (var5 > 0) {
                    var11.fillRect(var7, var8 + this.field440 - var5, this.field439, var5);
                }
            } catch (Exception var10) {
                ;
            }
        }

    }

    protected void method863(String var1, int var2) {
        this.field455.setContents(new StringSelection(var1), (ClipboardOwner) null);
    }

    protected final boolean method877(int var1) {
        return this.field447 != null;
    }

    public void run() {
        try {
            if (class156.field2017 != null) {
                String var1 = class156.field2017.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class156.field2013;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2
                        .startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2
                        .equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2
                        .startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method874("wrongjava", -958117475);
                        return;
                    }

                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class239
                            .method4788(var2.charAt(var3), 192287727); ++var3) {
                            ;
                        }

                        String var4 = var2.substring(6, var3);
                        if (class219.method4375(var4, (byte) -14)
                            && HandshakePacket.method3663(var4, -2035507757) < 10) {
                            this.method874("wrongjava", -1752866141);
                            return;
                        }
                    }

                    field438 = 5;
                }
            }

            this.setFocusCycleRoot(true);
            this.method931(-363224551);
            this.vmethod1483(-1626847641);
            field433 = class220.method4523(-805510551);

            while (0L == field436 || class120.method2866((short) 3133) < field436) {
                class181.field2363 = field433.vmethod3535(field432, field438, -191189521);

                for (int var5 = 0; var5 < class181.field2363; ++var5) {
                    this.method858((byte) 19);
                }

                this.method859((byte) 0);
                this.method845(this.field448, 1314283977);
            }
        } catch (Exception var6) {
            class80.method2041((String) null, var6, 2020977669);
            this.method874("crash", 437647510);
        }

        this.method862(65591887);
    }

    public final void start() {
        if (this == field427 && !field430) {
            field436 = 0L;
        }
    }

    public final void focusGained(FocusEvent var1) {
        field457 = true;
        this.field449 = true;
    }

    public final void focusLost(FocusEvent var1) {
        field457 = false;
    }

    public final void windowActivated(WindowEvent var1) {
    }

    public final void windowClosed(WindowEvent var1) {
    }

    public final void windowClosing(WindowEvent var1) {
        this.destroy();
    }

    public final void windowDeiconified(WindowEvent var1) {
    }

    public final void windowIconified(WindowEvent var1) {
    }

    public final void windowOpened(WindowEvent var1) {
    }

    public abstract void init();

    public final void update(Graphics var1) {
        this.paint(var1);
    }

    public final void stop() {
        if (this == field427 && !field430) {
            field436 = class120.method2866((short) 3133) + 4000L;
        }
    }

    public final void windowDeactivated(WindowEvent var1) {
    }
}
