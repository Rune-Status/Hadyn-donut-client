package jagex.osrs;

import java.io.File;
import java.io.RandomAccessFile;

public abstract class class188 {

    static boolean field2437;
    static int field2438;

    static {
        field2437 = false;
    }

    public static boolean method4026(int var0, int var1) {
        return var0 >= class235.field2838.field2839 && var0 <= class235.field2820.field2839;
    }

    static boolean method4014(File var0, boolean var1, int var2) {
        try {
            RandomAccessFile var3 = new RandomAccessFile(var0, "rw");
            int var4 = var3.read();
            var3.seek(0L);
            var3.write(var4);
            var3.seek(0L);
            var3.close();
            if (var1) {
                var0.delete();
            }

            return true;
        } catch (Exception var5) {
            return false;
        }
    }

    abstract byte[] vmethod4013(short var1);

    abstract void vmethod4022(byte[] var1, int var2);
}
