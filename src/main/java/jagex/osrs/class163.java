package jagex.osrs;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public final class class163 extends class159 implements Runnable {

    static class300 field2066;
    static int field2067;
    final int field2064;
    final int field2065;
    int field2060;
    boolean field2057;
    int field2058;
    boolean field2063;
    InputStream field2055;
    byte[] field2062;
    class155 field2061;
    OutputStream field2054;
    class156 field2059;
    Socket field2056;

    public class163(Socket var1, class156 var2, int var3) throws IOException {
        this.field2057 = false;
        this.field2058 = 0;
        this.field2060 = 0;
        this.field2063 = false;
        this.field2059 = var2;
        this.field2056 = var1;
        this.field2064 = var3;
        this.field2065 = var3 - 100;
        this.field2056.setSoTimeout(30000);
        this.field2056.setTcpNoDelay(true);
        this.field2056.setReceiveBufferSize(65536);
        this.field2056.setSendBufferSize(65536);
        this.field2055 = this.field2056.getInputStream();
        this.field2054 = this.field2056.getOutputStream();
    }

    void method3556(byte[] var1, int var2, int var3, byte var4) throws IOException {
        if (!this.field2057) {
            if (this.field2063) {
                this.field2063 = false;
                throw new IOException();
            } else {
                if (this.field2062 == null) {
                    this.field2062 = new byte[this.field2064];
                }

                synchronized (this) {
                    for (int var6 = 0; var6 < var3; ++var6) {
                        this.field2062[this.field2060] = var1[var6 + var2];
                        this.field2060 = (this.field2060 + 1) % this.field2064;
                        if ((this.field2058 + this.field2065) % this.field2064 == this.field2060) {
                            throw new IOException();
                        }
                    }

                    if (this.field2061 == null) {
                        this.field2061 = this.field2059.method3439(this, 3, (byte) -52);
                    }

                    this.notifyAll();
                }
            }
        }
    }

    public void vmethod3558(int var1) {
        if (!this.field2057) {
            synchronized (this) {
                this.field2057 = true;
                this.notifyAll();
            }

            if (this.field2061 != null) {
                while (this.field2061.field2007 == 0) {
                    class272.method5390(1L);
                }

                if (this.field2061.field2007 == 1) {
                    try {
                        ((Thread) this.field2061.field2011).join();
                    } catch (InterruptedException var4) {
                        ;
                    }
                }
            }

            this.field2061 = null;
        }
    }

    public boolean isReadable(int var1, int var2) throws IOException {
        return this.field2057 ? false : this.field2055.available() >= var1;
    }

    public int read(byte[] var1, int var2, int var3) throws IOException {
        if (this.field2057) {
            return 0;
        } else {
            int var5;
            int var6;
            for (var5 = var3; var3 > 0; var3 -= var6) {
                var6 = this.field2055.read(var1, var2, var3);
                if (var6 <= 0) {
                    throw new EOFException();
                }

                var2 += var6;
            }

            return var5;
        }
    }

    public void vmethod3578(byte[] var1, int var2, int var3, int var4) throws IOException {
        this.method3556(var1, var2, var3, (byte) 75);
    }

    public int available(byte var1) throws IOException {
        return this.field2057 ? 0 : this.field2055.available();
    }

    public int read() throws IOException {
        return this.field2057 ? 0 : this.field2055.read();
    }

    protected void finalize() {
        this.vmethod3558(-1550100423);
    }

    public void run() {
        try {
            while (true) {
                label84:
                {
                    int var1;
                    int var2;
                    synchronized (this) {
                        if (this.field2060 == this.field2058) {
                            if (this.field2057) {
                                break label84;
                            }

                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                                ;
                            }
                        }

                        var2 = this.field2058;
                        if (this.field2060 >= this.field2058) {
                            var1 = this.field2060 - this.field2058;
                        } else {
                            var1 = this.field2064 - this.field2058;
                        }
                    }

                    if (var1 <= 0) {
                        continue;
                    }

                    try {
                        this.field2054.write(this.field2062, var2, var1);
                    } catch (IOException var9) {
                        this.field2063 = true;
                    }

                    this.field2058 = (var1 + this.field2058) % this.field2064;

                    try {
                        if (this.field2058 == this.field2060) {
                            this.field2054.flush();
                        }
                    } catch (IOException var8) {
                        this.field2063 = true;
                    }
                    continue;
                }

                try {
                    if (this.field2055 != null) {
                        this.field2055.close();
                    }

                    if (this.field2054 != null) {
                        this.field2054.close();
                    }

                    if (this.field2056 != null) {
                        this.field2056.close();
                    }
                } catch (IOException var7) {
                    ;
                }

                this.field2062 = null;
                break;
            }
        } catch (Exception var12) {
            class80.method2041((String) null, var12, 1685178833);
        }

    }
}
