package jagex.osrs;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

public class class156 implements Runnable {

    public static String field2017;
    public static String field2013;
    boolean field2015;
    class155 field2014;
    Thread field2016;
    class155 field2012;

    public class156() {
        this.field2014 = null;
        this.field2012 = null;
        this.field2015 = false;
        field2017 = "Unknown";
        field2013 = "1.6";

        try {
            field2017 = System.getProperty("java.vendor");
            field2013 = System.getProperty("java.version");
        } catch (Exception var2) {
            ;
        }

        this.field2015 = false;
        this.field2016 = new Thread(this);
        this.field2016.setPriority(10);
        this.field2016.setDaemon(true);
        this.field2016.start();
    }

    static final void method3442(int var0, int var1, boolean var2, byte var3) {
        if (!var2 || var0 != class123.field1727 || ArchiveCache.field2075 != var1) {
            class123.field1727 = var0;
            ArchiveCache.field2075 = var1;
            client.setState(25);
            class58.method1132("Loading - please wait.", true, 1433030338);
            int var4 = class49.sceneX;
            int var5 = class11.sceneZ;
            class49.sceneX = (var0 - 6) * 8;
            class11.sceneZ = (var1 - 6) * 8;
            int var6 = class49.sceneX - var4;
            int var7 = class11.sceneZ - var5;
            var4 = class49.sceneX;
            var5 = class11.sceneZ;

            int var8;
            int var10;
            for (var8 = 0; var8 < 32768; ++var8) {
                class73 var9 = client.field806[var8];
                if (var9 != null) {
                    for (var10 = 0; var10 < 10; ++var10) {
                        var9.wx[var10] -= var6;
                        var9.wz[var10] -= var7;
                    }

                    var9.x -= var6 * 128;
                    var9.z -= var7 * 128;
                }
            }

            for (var8 = 0; var8 < 2048; ++var8) {
                Player var22 = client.players[var8];
                if (var22 != null) {
                    for (var10 = 0; var10 < 10; ++var10) {
                        var22.wx[var10] -= var6;
                        var22.wz[var10] -= var7;
                    }

                    var22.x -= var6 * 128;
                    var22.z -= var7 * 128;
                }
            }

            byte var21 = 0;
            byte var19 = 104;
            byte var23 = 1;
            if (var6 < 0) {
                var21 = 103;
                var19 = -1;
                var23 = -1;
            }

            byte var11 = 0;
            byte var12 = 104;
            byte var13 = 1;
            if (var7 < 0) {
                var11 = 103;
                var12 = -1;
                var13 = -1;
            }

            int var15;
            for (int var14 = var21; var14 != var19; var14 += var23) {
                for (var15 = var11; var15 != var12; var15 += var13) {
                    int var16 = var14 + var6;
                    int var17 = var15 + var7;

                    for (int var18 = 0; var18 < 4; ++var18) {
                        if (var16 >= 0 && var17 >= 0 && var16 < 104 && var17 < 104) {
                            client.itemStacks[var18][var14][var15] = client.itemStacks[var18][var16][var17];
                        } else {
                            client.itemStacks[var18][var14][var15] = null;
                        }
                    }
                }
            }

            for (class63 var20 = (class63) client.field688.getFirst(); var20 != null;
                 var20 = (class63) client.field688.getNext()) {
                var20.field922 -= var6;
                var20.field925 -= var7;
                if (var20.field922 < 0 || var20.field925 < 0 || var20.field922 >= 104
                    || var20.field925 >= 104) {
                    var20.unlink();
                }
            }

            if (client.field722 != 0) {
                client.field722 -= var6;
                client.field875 -= var7;
            }

            client.field905 = 0;
            client.field889 = false;
            class157.field2036 -= var6 << 7;
            class50.field508 -= var7 << 7;
            class9.field68 -= var6 << 7;
            class9.field70 -= var7 << 7;
            client.field661 = -1;
            client.field711.method4275();
            client.field773.method4275();

            for (var15 = 0; var15 < 4; ++var15) {
                client.field701[var15].method3612(-1613750531);
            }

        }
    }

    static class322 method3443(class249 var0, int var1, int var2, int var3) {
        byte[] var5 = var0.method4831(var1, var2, 1789634852);
        boolean var4;
        if (var5 == null) {
            var4 = false;
        } else {
            class125.method3051(var5, 1917049215);
            var4 = true;
        }

        return !var4 ? null : class274.method5439((byte) -8);
    }

    final class155 method3428(int var1, int var2, int var3, Object var4, int var5) {
        class155 var6 = new class155();
        var6.field2008 = var1;
        var6.field2009 = var2;
        var6.field2003 = var4;
        synchronized (this) {
            if (this.field2012 != null) {
                this.field2012.field2004 = var6;
                this.field2012 = var6;
            } else {
                this.field2012 = this.field2014 = var6;
            }

            this.notify();
            return var6;
        }
    }

    public final class155 method3439(Runnable var1, int var2, byte var3) {
        return this.method3428(2, var2, 0, var1, 1997676403);
    }

    public final class155 method3426(String var1, int var2, int var3) {
        return this.method3428(1, var2, 0, var1, 1771051631);
    }

    public final void method3429(int var1) {
        synchronized (this) {
            this.field2015 = true;
            this.notifyAll();
        }

        try {
            this.field2016.join();
        } catch (InterruptedException var4) {
            ;
        }

    }

    public final void run() {
        while (true) {
            class155 var1;
            synchronized (this) {
                while (true) {
                    if (this.field2015) {
                        return;
                    }

                    if (this.field2014 != null) {
                        var1 = this.field2014;
                        this.field2014 = this.field2014.field2004;
                        if (this.field2014 == null) {
                            this.field2012 = null;
                        }
                        break;
                    }

                    try {
                        this.wait();
                    } catch (InterruptedException var8) {
                        ;
                    }
                }
            }

            try {
                int var5 = var1.field2008;
                if (var5 == 1) {
                    var1.field2011 = new Socket(InetAddress.getByName((String) var1.field2003),
                                                var1.field2009);
                } else if (var5 == 2) {
                    Thread var3 = new Thread((Runnable) var1.field2003);
                    var3.setDaemon(true);
                    var3.start();
                    var3.setPriority(var1.field2009);
                    var1.field2011 = var3;
                } else if (var5 == 4) {
                    var1.field2011 = new DataInputStream(((URL) var1.field2003).openStream());
                }

                var1.field2007 = 1;
            } catch (ThreadDeath var6) {
                throw var6;
            } catch (Throwable var7) {
                var1.field2007 = 2;
            }
        }
    }
}
