package jagex.osrs;

import java.io.EOFException;
import java.io.IOException;

public final class ArchiveCache {

    static byte[] buffer;
    static int field2073;
    static class158 field2076;
    static int field2075;

    static {
        buffer = new byte[520];
    }

    BufferedFile blocks;
    BufferedFile index;
    int maximumLength;
    int pack;

    public ArchiveCache(int var1, BufferedFile var2, BufferedFile index, int var4) {
        this.blocks = null;
        this.index = null;
        this.maximumLength = 65000;
        this.pack = var1;
        this.blocks = var2;
        this.index = index;
        this.maximumLength = var4;
    }

    boolean method3588(int var1, byte[] var2, int var3, boolean var4, int var5) {
        BufferedFile var6 = this.blocks;
        synchronized (this.blocks) {
            try {
                int var7;
                boolean var10000;
                if (var4) {
                    if (this.index.length() < (long) (var1 * 6 + 6)) {
                        var10000 = false;
                        return var10000;
                    }

                    this.index.seek((long) (var1 * 6));
                    this.index.read(buffer, 0, 6, 749697465);
                    var7 =
                        (buffer[5] & 255) + ((buffer[3] & 255) << 16) + ((buffer[4] & 255)
                            << 8);
                    if (var7 <= 0 || (long) var7 > this.blocks.length() / 520L) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var7 = (int) ((this.blocks.length() + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }

                buffer[0] = (byte) (var3 >> 16);
                buffer[1] = (byte) (var3 >> 8);
                buffer[2] = (byte) var3;
                buffer[3] = (byte) (var7 >> 16);
                buffer[4] = (byte) (var7 >> 8);
                buffer[5] = (byte) var7;
                this.index.seek((long) (var1 * 6));
                this.index.method2692(buffer, 0, 6, (byte) -1);
                int var8 = 0;
                int var9 = 0;

                while (true) {
                    if (var8 < var3) {
                        label143:
                        {
                            int var10 = 0;
                            int var15;
                            if (var4) {
                                this.blocks.seek((long) (var7 * 520));

                                try {
                                    this.blocks.read(buffer, 0, 8, 749697465);
                                } catch (EOFException var17) {
                                    break label143;
                                }

                                var15 = (buffer[1] & 255) + ((buffer[0] & 255) << 8);
                                int var12 = (buffer[3] & 255) + ((buffer[2] & 255) << 8);
                                var10 =
                                    ((buffer[5] & 255) << 8) + ((buffer[4] & 255) << 16) + (
                                        buffer[6] & 255);
                                int var13 = buffer[7] & 255;
                                if (var15 != var1 || var9 != var12 || var13 != this.pack) {
                                    var10000 = false;
                                    return var10000;
                                }

                                if (var10 < 0
                                    || (long) var10 > this.blocks.length() / 520L) {
                                    var10000 = false;
                                    return var10000;
                                }
                            }

                            if (var10 == 0) {
                                var4 = false;
                                var10 = (int) ((this.blocks.length() + 519L) / 520L);
                                if (var10 == 0) {
                                    ++var10;
                                }

                                if (var7 == var10) {
                                    ++var10;
                                }
                            }

                            if (var3 - var8 <= 512) {
                                var10 = 0;
                            }

                            buffer[0] = (byte) (var1 >> 8);
                            buffer[1] = (byte) var1;
                            buffer[2] = (byte) (var9 >> 8);
                            buffer[3] = (byte) var9;
                            buffer[4] = (byte) (var10 >> 16);
                            buffer[5] = (byte) (var10 >> 8);
                            buffer[6] = (byte) var10;
                            buffer[7] = (byte) this.pack;
                            this.blocks.seek((long) (var7 * 520));
                            this.blocks.method2692(buffer, 0, 8, (byte) -113);
                            var15 = var3 - var8;
                            if (var15 > 512) {
                                var15 = 512;
                            }

                            this.blocks.method2692(var2, var8, var15, (byte) -86);
                            var8 += var15;
                            var7 = var10;
                            ++var9;
                            continue;
                        }
                    }

                    var10000 = true;
                    return var10000;
                }
            } catch (IOException var18) {
                return false;
            }
        }
    }

    public boolean method3587(int var1, byte[] var2, int var3, byte var4) {
        BufferedFile var5 = this.blocks;
        synchronized (this.blocks) {
            if (var3 >= 0 && var3 <= this.maximumLength) {
                boolean var6 = this.method3588(var1, var2, var3, true, -1448378756);
                if (!var6) {
                    var6 = this.method3588(var1, var2, var3, false, -359047553);
                }

                return var6;
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    public byte[] get(int id) {
        synchronized (this.blocks) {
            try {
                Object var10000;
                if (this.index.length() < (long) (id * 6 + 6)) {
                    return null;
                }

                this.index.seek((long) (id * 6));
                this.index.read(buffer, 0, 6, 749697465);
                int length = ((buffer[0] & 255) << 16) + (buffer[2] & 255) + ((buffer[1] & 255) << 8);
                int block =
                    (buffer[5] & 255) + ((buffer[3] & 255) << 16) + ((buffer[4] & 255)
                        << 8);
                if (length < 0 || length > this.maximumLength) {
                    var10000 = null;
                    return (byte[]) null;
                }

                if (block <= 0 || (long) block > this.blocks.length() / 520L) {
                    var10000 = null;
                    return (byte[]) var10000;
                }

                byte[] var6 = new byte[length];
                int var7 = 0;
                int var8 = 0;

                while (var7 < length) {
                    if (block == 0) {
                        var10000 = null;
                        return (byte[]) var10000;
                    }

                    this.blocks.seek((long) (block * 520));
                    int read = length - var7;
                    if (read > 512) {
                        read = 512;
                    }

                    this.blocks.read(buffer, 0, read + 8, 749697465);
                    int blockArchiveId = (buffer[1] & 255) + ((buffer[0] & 255) << 8);
                    int blockPart = (buffer[3] & 255) + ((buffer[2] & 255) << 8);
                    int nextBlock =
                        ((buffer[5] & 255) << 8) + ((buffer[4] & 255) << 16) + (
                            buffer[6] & 255);
                    int pack = buffer[7] & 255;
                    if (blockArchiveId == id && blockPart == var8 && pack == this.pack) {
                        if (nextBlock >= 0
                            && (long) nextBlock <= this.blocks.length() / 520L) {
                            for (int var14 = 0; var14 < read; ++var14) {
                                var6[var7++] = buffer[var14 + 8];
                            }

                            block = nextBlock;
                            ++var8;
                            continue;
                        }

                        var10000 = null;
                        return (byte[]) var10000;
                    }

                    var10000 = null;
                    return (byte[]) var10000;
                }

                byte[] var19 = var6;
                return var19;
            } catch (IOException var17) {
                return null;
            }
        }
    }
}
