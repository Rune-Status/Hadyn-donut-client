package jagex.osrs;

public class class234 {

    static int field2817;

    static final byte[] unpack(byte[] bytes) {
        Buffer var2 = new Buffer(bytes);
        int compression = var2.getUByte();
        int compressedLength = var2.getInt();
        if (compressedLength < 0 || class249.maximumLength
            != 0 && compressedLength > class249.maximumLength) {
            throw new RuntimeException();
        }

        if (compression == 0) {
            byte[] var5 = new byte[compressedLength];
            var2.method3781(var5, 0, compressedLength, (byte) 30);
            return var5;
        }

        int uncompressedLength = var2.getInt();
        if (uncompressedLength < 0 || class249.maximumLength
            != 0 && uncompressedLength > class249.maximumLength) {
            throw new RuntimeException();
        }

        byte[] var6 = new byte[uncompressedLength];
        if (compression == 1) {
            Bzip2.decompress(var6, uncompressedLength, bytes, compressedLength, 9);
        } else {
            class249.gzip.decompress(var2, var6, (byte) 4);
        }

        return var6;
    }

    static final void method4770(int var0, int var1, int var2, int var3, int var4, int var5,
                                 int var6, int var7, int var8, int var9) {
        class63 var10 = null;

        for (class63 var11 = (class63) client.field688.method4298(); var11 != null;
             var11 = (class63) client.field688.method4283()) {
            if (var0 == var11.field934 && var11.field922 == var1 && var2 == var11.field925
                && var3 == var11.field926) {
                var10 = var11;
                break;
            }
        }

        if (var10 == null) {
            var10 = new class63();
            var10.field934 = var0;
            var10.field926 = var3;
            var10.field922 = var1;
            var10.field925 = var2;
            class43.method790(var10, (short) 13600);
            client.field688.method4276(var10);
        }

        var10.field929 = var4;
        var10.field931 = var5;
        var10.field930 = var6;
        var10.field932 = var7;
        var10.field933 = var8;
    }

    static boolean method4768(int var0) {
        return (client.field676 & 8) != 0;
    }
}
