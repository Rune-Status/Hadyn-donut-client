package jagex.osrs;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

public final class SeekableFile {

    static String field1496;
    long field1493;
    RandomAccessFile file;
    long field1494;

    public SeekableFile(File var1, String var2, long var3) throws IOException {
        if (-1L == var3) {
            var3 = Long.MAX_VALUE;
        }

        if (var1.length() >= var3) {
            var1.delete();
        }

        this.file = new RandomAccessFile(var1, var2);
        this.field1494 = var3;
        this.field1493 = 0L;
        int var5 = this.file.read();
        if (var5 != -1 && !var2.equals("r")) {
            this.file.seek(0L);
            this.file.write(var5);
        }

        this.file.seek(0L);
    }

    public static void method2723(int var0) {
        try {
            class157.blocksFile.method2682(203747601);

            for (int var1 = 0; var1 < class157.field2024; ++var1) {
                class157.indexFiles[var1].method2682(203747601);
            }

            class157.manifestIndexFile.method2682(203747601);
            class157.field2038.method2682(203747601);
        } catch (Exception var3) {
            ;
        }

    }

    public final void close(boolean sync) throws IOException {
        if (this.file == null) {
            return;
        }
        if (sync) {
            try {
                this.file.getFD().sync();
            } catch (SyncFailedException var4) {
                ;
            }
        }

        this.file.close();
        this.file = null;

    }

    public final long method2719(int var1) throws IOException {
        return this.file.length();
    }

    public final void method2717(int var1) throws IOException {
        this.close(false);
    }

    public final int method2720(byte[] var1, int var2, int var3, int var4) throws IOException {
        int var5 = this.file.read(var1, var2, var3);
        if (var5 > 0) {
            this.field1493 += (long) var5;
        }

        return var5;
    }

    final void method2718(long var1) throws IOException {
        this.file.seek(var1);
        this.field1493 = var1;
    }

    public final void write(byte[] var1, int var2, int var3) throws IOException {
        if ((long) var3 + this.field1493 > this.field1494) {
            this.file.seek(1L + this.field1494);
            this.file.write(1);
            throw new EOFException();
        } else {
            this.file.write(var1, var2, var3);
            this.field1493 += (long) var3;
        }
    }

    protected void finalize() throws Throwable {
        if (this.file != null) {
            System.out.println("");
            this.method2717(-1374671575);
        }

    }
}
