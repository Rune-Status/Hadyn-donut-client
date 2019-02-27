package jagex.osrs;

import java.util.zip.CRC32;

public class class251 extends class249 {

    static CRC32 crc;

    static {
        crc = new CRC32();
    }

    ArchiveCache manifests;
    ArchiveCache field3255;
    int expectedChecksum;
    volatile boolean field3251;
    volatile boolean[] field3253;
    int id;
    int expectedVersion;
    int field3257;
    boolean field3252;

    public class251(ArchiveCache var1, ArchiveCache manifests, int id, boolean var4, boolean var5,
                    boolean var6) {
        super(var4, var5);
        this.field3251 = false;
        this.field3252 = false;
        this.field3257 = -1;
        this.field3255 = var1;
        this.manifests = manifests;
        this.id = id;
        this.field3252 = var6;
        int _id = this.id;
        if (class79.releaseManifest != null) {
            class79.releaseManifest.offset = _id * 8 + 5;
            int var9 = class79.releaseManifest.getInt();
            int var10 = class79.releaseManifest.getInt();
            this.initialize(var9, var10);
        } else {
            ScriptExecutor.method1947((class251) null, 255, 255, 0, (byte) 0, true, 87474936);
            class252.field3275[_id] = this;
        }

    }

    public static class258 method4963(int var0, int var1) {
        class258 var2 = (class258) class258.field3335.method4198((long) var0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class258.field3336.method4831(19, var0, 1789634852);
            var2 = new class258();
            if (var3 != null) {
                var2.method5068(new Buffer(var3), 1124634790);
            }

            class258.field3335.method4204(var2, (long) var0);
            return var2;
        }
    }

    void vmethod4955(int var1, int var2) {
        if (this.field3255 != null && this.field3253 != null && this.field3253[var1]) {
            ArchiveCache var3 = this.field3255;
            byte[] var5 = null;
            Deque var6 = class250.field3242;
            synchronized (class250.field3242) {
                for (class247 var7 = (class247) class250.field3242.getFirst(); var7 != null;
                     var7 = (class247) class250.field3242.getNext()) {
                    if ((long) var1 == var7.key && var3 == var7.field3215
                        && var7.field3213 == 0) {
                        var5 = var7.field3212;
                        break;
                    }
                }
            }

            if (var5 != null) {
                this.method4928(var3, var1, var5, true, (byte) -13);
            } else {
                byte[] var10 = var3.get(var1);
                this.method4928(var3, var1, var10, true, (byte) -105);
            }
        } else {
            ScriptExecutor.method1947(this, this.id, var1, super.field3228[var1], (byte) 2, true,
                               87474936);
        }

    }

    public boolean method4961(int var1, int var2) {
        return this.method4839(var1, -2049951387) != null;
    }

    int vmethod4932(int var1, int var2) {
        return super.field3234[var1] != null ? 100
            : (this.field3253[var1] ? 100 : class154.method3415(this.id, var1, (byte) 116));
    }

    void method4926(int var1) {
        this.field3253 = new boolean[super.field3234.length];

        int var2;
        for (var2 = 0; var2 < this.field3253.length; ++var2) {
            this.field3253[var2] = false;
        }

        if (this.field3255 == null) {
            this.field3251 = true;
        } else {
            this.field3257 = -1;

            for (var2 = 0; var2 < this.field3253.length; ++var2) {
                if (super.field3230[var2] > 0) {
                    ArchiveCache var3 = this.field3255;
                    class247 var5 = new class247();
                    var5.field3213 = 1;
                    var5.key = (long) var2;
                    var5.field3215 = var3;
                    var5.field3214 = this;
                    Deque var6 = class250.field3242;
                    synchronized (class250.field3242) {
                        class250.field3242.addLast(var5);
                    }

                    Object var11 = class250.field3241;
                    synchronized (class250.field3241) {
                        if (class250.field3243 == 0) {
                            class250.field3245 = new Thread(new class250());
                            class250.field3245.setDaemon(true);
                            class250.field3245.start();
                            class250.field3245.setPriority(5);
                        }

                        class250.field3243 = 600;
                    }

                    this.field3257 = var2;
                }
            }

            if (this.field3257 == -1) {
                this.field3251 = true;
            }

        }
    }

    void vmethod4936(int var1, int var2) {
        int var3 = this.id;
        long var4 = (long) ((var3 << 16) + var1);
        class248 var6 = (class248) class252.field3266.method4224(var4);
        if (var6 != null) {
            class252.field3265.method4147(var6);
        }

    }

    public boolean method4931(int var1, int var2) {
        return this.field3253[var1];
    }

    void method4928(ArchiveCache var1, int var2, byte[] bytes, boolean var4, byte var5) {
        int var6;
        if (var1 == this.manifests) {
            if (this.field3251) {
                throw new RuntimeException();
            } else if (bytes == null) {
                ScriptExecutor.method1947(this, 255, this.id, this.expectedChecksum, (byte) 0, true,
                                   87474936);
            } else {
                crc.reset();
                crc.update(bytes, 0, bytes.length);
                var6 = (int) crc.getValue();
                if (var6 != this.expectedChecksum) {
                    ScriptExecutor
                        .method1947(this, 255, this.id, this.expectedChecksum, (byte) 0, true,
                                       87474936);
                } else {
                    Buffer buffer = new Buffer(class234.unpack(bytes));
                    int protocol = buffer.readUint8();
                    if (protocol != 5 && protocol != 6) {
                        throw new RuntimeException(protocol + "," + this.id + "," + var2);
                    }

                    int version = 0;
                    if (protocol >= 6) {
                        version = buffer.getInt();
                    }

                    if (version != this.expectedVersion) {
                        ScriptExecutor
                            .method1947(this, 255, this.id, this.expectedChecksum, (byte) 0, true, 87474936);
                    } else {
                        this.method4846(bytes, (byte) -119);
                        this.method4926(-1874473815);
                    }
                }
            }
        } else {
            if (!var4 && var2 == this.field3257) {
                this.field3251 = true;
            }

            if (bytes != null && bytes.length > 2) {
                crc.reset();
                crc.update(bytes, 0, bytes.length - 2);
                var6 = (int) crc.getValue();
                int var7 = ((bytes[bytes.length - 2] & 255) << 8) + (bytes[bytes.length - 1] & 255);
                if (var6 == super.field3228[var2] && var7 == super.field3229[var2]) {
                    this.field3253[var2] = true;
                    if (var4) {
                        super.field3234[var2] = class21.method330(bytes, false, 603937953);
                    }

                } else {
                    this.field3253[var2] = false;
                    if (this.field3252 || var4) {
                        ScriptExecutor
                            .method1947(this, this.id, var2, super.field3228[var2], (byte) 2,
                                        var4, 87474936);
                    }

                }
            } else {
                this.field3253[var2] = false;
                if (this.field3252 || var4) {
                    ScriptExecutor.method1947(this, this.id, var2, super.field3228[var2], (byte) 2,
                                       var4, 87474936);
                }

            }
        }
    }

    void initialize(int var1, int var2) {
        this.expectedChecksum = var1;
        this.expectedVersion = var2;
        if (this.manifests != null) {
            int var4 = this.id;
            ArchiveCache var5 = this.manifests;
            byte[] var7 = null;
            Deque var8 = class250.field3242;
            synchronized (class250.field3242) {
                for (class247 var9 = (class247) class250.field3242.getFirst(); var9 != null;
                     var9 = (class247) class250.field3242.getNext()) {
                    if ((long) var4 == var9.key && var5 == var9.field3215
                        && var9.field3213 == 0) {
                        var7 = var9.field3212;
                        break;
                    }
                }
            }

            if (var7 != null) {
                this.method4928(var5, var4, var7, true, (byte) -56);
            } else {
                byte[] var12 = var5.get(var4);
                this.method4928(var5, var4, var12, true, (byte) -11);
            }
        } else {
            ScriptExecutor
                .method1947(this, 255, this.id, this.expectedChecksum, (byte) 0, true, 87474936);
        }

    }

    public int method4923(byte var1) {
        if (this.field3251) {
            return 100;
        } else if (super.field3234 != null) {
            return 99;
        } else {
            int var2 = class154.method3415(255, this.id, (byte) 45);
            if (var2 >= 100) {
                var2 = 99;
            }

            return var2;
        }
    }

    void method4927(int var1, byte[] var2, boolean var3, boolean var4, byte var5) {
        if (var3) {
            if (this.field3251) {
                throw new RuntimeException();
            }

            if (this.manifests != null) {
                class68.method1827(this.id, var2, this.manifests, 946140861);
            }

            this.method4846(var2, (byte) -72);
            this.method4926(-1252966477);
        } else {
            var2[var2.length - 2] = (byte) (super.field3229[var1] >> 8);
            var2[var2.length - 1] = (byte) super.field3229[var1];
            if (this.field3255 != null) {
                class68.method1827(var1, var2, this.field3255, -1064325267);
                this.field3253[var1] = true;
            }

            if (var4) {
                super.field3234[var1] = class21.method330(var2, false, 2006579653);
            }
        }

    }

    public int method4933(int var1) {
        int var2 = 0;
        int var3 = 0;

        int var4;
        for (var4 = 0; var4 < super.field3234.length; ++var4) {
            if (super.field3230[var4] > 0) {
                var2 += 100;
                var3 += this.vmethod4932(var4, 1670694109);
            }
        }

        if (var2 == 0) {
            return 100;
        } else {
            var4 = var3 * 100 / var2;
            return var4;
        }
    }

    public boolean method4922(int var1) {
        return this.field3251;
    }
}
