package jagex.osrs;

import java.math.BigInteger;

public class Buffer extends Node {

    static int[] field2406;
    static long[] field2407;
    static int field2409;
    static int[] field2408;

    static {
        field2406 = new int[256];

        int var2;
        for (int var1 = 0; var1 < 256; ++var1) {
            int var0 = var1;

            for (var2 = 0; var2 < 8; ++var2) {
                if ((var0 & 1) == 1) {
                    var0 = var0 >>> 1 ^ -306674912;
                } else {
                    var0 >>>= 1;
                }
            }

            field2406[var1] = var0;
        }

        field2407 = new long[256];

        for (var2 = 0; var2 < 256; ++var2) {
            long var4 = (long) var2;

            for (int var3 = 0; var3 < 8; ++var3) {
                if (1L == (var4 & 1L)) {
                    var4 = var4 >>> 1 ^ -3932672073523589310L;
                } else {
                    var4 >>>= 1;
                }
            }

            field2407[var2] = var4;
        }

    }

    public byte[] bytes;
    public int offset;

    public Buffer(int var1) {
        this.bytes = class88.method2184(var1, 936861169);
        this.offset = 0;
    }

    public Buffer(byte[] var1) {
        this.bytes = var1;
        this.offset = 0;
    }

    static final String method3994(int var0, int var1) {
        return var0 < 999999999 ? Integer.toString(var0) : "*";
    }

    public int method3783(int var1) {
        int var2 = this.bytes[this.offset] & 255;
        return var2 < 128 ? this.readUint8() : this.readUint16() - 32768;
    }

    public String getString() {
        int var2 = this.offset;

        while (this.bytes[++this.offset - 1] != 0) {
        }

        int var3 = this.offset - var2 - 1;
        return var3 == 0 ? "" : IssacRandom.method4091(this.bytes, var2, var3, 188483581);
    }

    public int getInt() {
        this.offset += 4;
        return ((this.bytes[this.offset - 3] & 255) << 16) + (
            this.bytes[this.offset - 1] & 255) + ((this.bytes[this.offset - 2] & 255)
            << 8) + ((this.bytes[this.offset - 4] & 255) << 24);
    }

    public void writeByte(int var1) {
        this.bytes[++this.offset - 1] = (byte) var1;
    }

    public int readUint8() {
        return this.bytes[++this.offset - 1] & 255;
    }

    public int method3898(byte var1) {
        if (this.bytes[this.offset] < 0) {
            return this.getInt() & Integer.MAX_VALUE;
        } else {
            int var2 = this.readUint16();
            return var2 == 32767 ? -1 : var2;
        }
    }

    public int method3787(byte var1) {
        byte var2 = this.bytes[++this.offset - 1];

        int var3;
        for (var3 = 0; var2 < 0; var2 = this.bytes[++this.offset - 1]) {
            var3 = (var3 | var2 & 127) << 7;
        }

        return var3 | var2;
    }

    public int method3773(int var1) {
        this.offset += 3;
        return ((this.bytes[this.offset - 3] & 255) << 16) + (
            this.bytes[this.offset - 1] & 255) + ((this.bytes[this.offset - 2] & 255)
            << 8);
    }

    public byte method3931(int var1) {
        return this.bytes[++this.offset - 1];
    }

    public int readUint16() {
        this.offset += 2;
        return (this.bytes[this.offset - 1] & 255) + (
            (this.bytes[this.offset - 2] & 255) << 8);
    }

    public void method3781(byte[] var1, int var2, int var3, byte var4) {
        for (int var5 = var2; var5 < var3 + var2; ++var5) {
            var1[var5] = this.bytes[++this.offset - 1];
        }

    }

    public long method3775(byte var1) {
        long var2 = (long) this.getInt() & 4294967295L;
        long var4 = (long) this.getInt() & 4294967295L;
        return (var2 << 32) + var4;
    }

    public void writeInt(int var1) {
        this.bytes[++this.offset - 1] = (byte) (var1 >> 24);
        this.bytes[++this.offset - 1] = (byte) (var1 >> 16);
        this.bytes[++this.offset - 1] = (byte) (var1 >> 8);
        this.bytes[++this.offset - 1] = (byte) var1;
    }

    public void writeShort(int var1) {
        this.bytes[++this.offset - 1] = (byte) (var1 >> 8);
        this.bytes[++this.offset - 1] = (byte) var1;
    }

    public int method3814(byte var1) {
        this.offset += 2;
        int var2 =
            (this.bytes[this.offset - 1] & 255) + ((this.bytes[this.offset - 2] & 255)
                << 8);
        if (var2 > 32767) {
            var2 -= 65536;
        }

        return var2;
    }

    public String method3779(int var1) {
        byte var2 = this.bytes[++this.offset - 1];
        if (var2 != 0) {
            throw new IllegalStateException("");
        } else {
            int var3 = this.offset;

            while (this.bytes[++this.offset - 1] != 0) {
                ;
            }

            int var4 = this.offset - var3 - 1;
            return var4 == 0 ? "" : IssacRandom.method4091(this.bytes, var3, var4, 1880571754);
        }
    }

    public void method3768(int var1, byte var2) {
        if ((var1 & -128) != 0) {
            if ((var1 & -16384) != 0) {
                if ((var1 & -2097152) != 0) {
                    if ((var1 & -268435456) != 0) {
                        this.writeByte(var1 >>> 28 | 128);
                    }

                    this.writeByte(var1 >>> 21 | 128);
                }

                this.writeByte(var1 >>> 14 | 128);
            }

            this.writeByte(var1 >>> 7 | 128);
        }

        this.writeByte(var1 & 127);
    }

    public void writeBytes(byte[] src, int off, int len) {
        for (int var5 = off; var5 < len + off; ++var5) {
            this.bytes[++this.offset - 1] = src[var5];
        }

    }

    public int method3785(int var1) {
        return this.bytes[this.offset] < 0 ? this.getInt() & Integer.MAX_VALUE
            : this.readUint16();
    }

    public void method3791(int[] var1, int var2, int var3, int var4) {
        int var5 = this.offset;
        this.offset = var2;
        int var6 = (var3 - var2) / 8;

        for (int var7 = 0; var7 < var6; ++var7) {
            int var8 = this.getInt();
            int var9 = this.getInt();
            int var10 = -957401312;
            int var11 = -1640531527;

            for (int var12 = 32; var12-- > 0;
                 var8 -= var9 + (var9 << 4 ^ var9 >>> 5) ^ var10 + var1[var10 & 3]) {
                var9 -= var8 + (var8 << 4 ^ var8 >>> 5) ^ var1[var10 >>> 11 & 3] + var10;
                var10 -= var11;
            }

            this.offset -= 8;
            this.writeInt(var8);
            this.writeInt(var9);
        }

        this.offset = var5;
    }

    public void writeString(String var1) {
        int var3 = var1.indexOf(0);
        if (var3 >= 0) {
            throw new IllegalArgumentException("");
        } else {
            this.offset += GameType
                .method4810(var1, 0, var1.length(), this.bytes, this.offset, (byte) -86);
            this.bytes[++this.offset - 1] = 0;
        }
    }

    public void method3818(boolean var1, short var2) {
        this.writeByte(var1 ? 1 : 0);
    }

    public void method3752(byte var1) {
        if (this.bytes != null) {
            class27.method515(this.bytes, 996931143);
        }

        this.bytes = null;
    }

    public void method3755(int var1, int var2) {
        this.bytes[++this.offset - 1] = (byte) (var1 >> 16);
        this.bytes[++this.offset - 1] = (byte) (var1 >> 8);
        this.bytes[++this.offset - 1] = (byte) var1;
    }

    public String method3777(int var1) {
        if (this.bytes[this.offset] == 0) {
            ++this.offset;
            return null;
        } else {
            return this.getString();
        }
    }

    public boolean method3776(byte var1) {
        return (this.readUint8() & 1) == 1;
    }

    public int method3782(int var1) {
        int var2 = this.bytes[this.offset] & 255;
        return var2 < 128 ? this.readUint8() - 64 : this.readUint16() - 49152;
    }

    public void method3956(String var1, byte var2) {
        int var3 = var1.indexOf(0);
        if (var3 >= 0) {
            throw new IllegalArgumentException("");
        } else {
            this.bytes[++this.offset - 1] = 0;
            this.offset += GameType
                .method4810(var1, 0, var1.length(), this.bytes, this.offset, (byte) -84);
            this.bytes[++this.offset - 1] = 0;
        }
    }

    public int method3808(int var1) {
        this.offset += 2;
        return (this.bytes[this.offset - 1] - 128 & 255) + (
            (this.bytes[this.offset - 2] & 255) << 8);
    }

    public int method3792(int var1) {
        this.offset += 2;
        return ((this.bytes[this.offset - 1] & 255) << 8) + (
            this.bytes[this.offset - 2] - 128 & 255);
    }

    public void method3766(int var1, byte var2) {
        this.bytes[this.offset - var1 - 1] = (byte) var1;
    }

    public int method3750(int var1, int var2) {
        int var3 = class73.checksumIEEE(this.bytes, var1, this.offset, (byte) 87);
        this.writeInt(var3);
        return var3;
    }

    public void method3887(int var1, int var2) {
        this.bytes[++this.offset - 1] = (byte) (var1 >> 8);
        this.bytes[++this.offset - 1] = (byte) (var1 + 128);
    }

    public int method3772(int var1) {
        this.offset += 4;
        return ((this.bytes[this.offset - 1] & 255) << 8) + (
            (this.bytes[this.offset - 4] & 255) << 16) + (this.bytes[this.offset - 2]
            & 255) + ((this.bytes[this.offset - 3] & 255) << 24);
    }

    public void method3893(int var1, byte var2) {
        this.bytes[++this.offset - 1] = (byte) (var1 >> 8);
        this.bytes[++this.offset - 1] = (byte) var1;
        this.bytes[++this.offset - 1] = (byte) (var1 >> 24);
        this.bytes[++this.offset - 1] = (byte) (var1 >> 16);
    }

    public void method3869(int var1, byte var2) {
        this.bytes[++this.offset - 1] = (byte) var1;
        this.bytes[++this.offset - 1] = (byte) (var1 >> 8);
    }

    public void method3796(int var1, int var2) {
        this.bytes[++this.offset - 1] = (byte) (0 - var1);
    }

    public void writeLong(long var1) {
        this.bytes[++this.offset - 1] = (byte) ((int) (var1 >> 56));
        this.bytes[++this.offset - 1] = (byte) ((int) (var1 >> 48));
        this.bytes[++this.offset - 1] = (byte) ((int) (var1 >> 40));
        this.bytes[++this.offset - 1] = (byte) ((int) (var1 >> 32));
        this.bytes[++this.offset - 1] = (byte) ((int) (var1 >> 24));
        this.bytes[++this.offset - 1] = (byte) ((int) (var1 >> 16));
        this.bytes[++this.offset - 1] = (byte) ((int) (var1 >> 8));
        this.bytes[++this.offset - 1] = (byte) ((int) var1);
    }

    public int method3891(byte var1) {
        return 128 - this.bytes[++this.offset - 1] & 255;
    }

    public int method3883(byte var1) {
        return this.bytes[++this.offset - 1] - 128 & 255;
    }

    public int method3807(int var1) {
        this.offset += 2;
        return ((this.bytes[this.offset - 1] & 255) << 8) + (
            this.bytes[this.offset - 2] & 255);
    }

    public int method3799(int var1) {
        return 0 - this.bytes[++this.offset - 1] & 255;
    }

    public boolean method3786(byte var1) {
        this.offset -= 4;
        int var2 = class73.checksumIEEE(this.bytes, 0, this.offset, (byte) -56);
        int var3 = this.getInt();
        return var3 == var2;
    }

    public int method3812(int var1) {
        this.offset += 3;
        return (this.bytes[this.offset - 3] & 255) + (
            (this.bytes[this.offset - 2] & 255) << 8) + (
            (this.bytes[this.offset - 1] & 255) << 16);
    }

    public int method3964(int var1) {
        this.offset += 4;
        return ((this.bytes[this.offset - 2] & 255) << 24) + (
            (this.bytes[this.offset - 4] & 255) << 8) + (this.bytes[this.offset - 3]
            & 255) + ((this.bytes[this.offset - 1] & 255) << 16);
    }

    public int method3811(int var1) {
        this.offset += 2;
        int var2 = ((this.bytes[this.offset - 1] & 255) << 8) + (
            this.bytes[this.offset - 2] - 128 & 255);
        if (var2 > 32767) {
            var2 -= 65536;
        }

        return var2;
    }

    public int method3810(int var1) {
        this.offset += 2;
        int var2 =
            ((this.bytes[this.offset - 1] & 255) << 8) + (this.bytes[this.offset - 2]
                & 255);
        if (var2 > 32767) {
            var2 -= 65536;
        }

        return var2;
    }

    public void writeLengthShort(int var1) {
        this.bytes[this.offset - var1 - 2] = (byte) (var1 >> 8);
        this.bytes[this.offset - var1 - 1] = (byte) var1;
    }

    public void method3795(int var1, int var2) {
        this.bytes[++this.offset - 1] = (byte) (var1 + 128);
    }

    public void encipherRsa(BigInteger exponent, BigInteger modulus) {
        int var4 = this.offset;
        this.offset = 0;
        byte[] var5 = new byte[var4];
        this.method3781(var5, 0, var4, (byte) 106);
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6;/*var6.modPow(exponent, modulus);*/ // TODO
        byte[] var8 = var7.toByteArray();
        this.offset = 0;
        //this.writeShort(var8.length);
        this.writeBytes(var8, 0, var8.length);
    }

    public void method3806(int var1, int var2) {
        this.bytes[++this.offset - 1] = (byte) (var1 + 128);
        this.bytes[++this.offset - 1] = (byte) (var1 >> 8);
    }

    public void method3813(int var1, byte var2) {
        this.bytes[++this.offset - 1] = (byte) var1;
        this.bytes[++this.offset - 1] = (byte) (var1 >> 8);
        this.bytes[++this.offset - 1] = (byte) (var1 >> 16);
        this.bytes[++this.offset - 1] = (byte) (var1 >> 24);
    }

    public int method3784(int var1) {
        int var2 = 0;

        int var3;
        for (var3 = this.method3783(259887783); var3 == 32767; var3 = this.method3783(1540079482)) {
            var2 += 32767;
        }

        var2 += var3;
        return var2;
    }

    public byte method3968(int var1) {
        return (byte) (this.bytes[++this.offset - 1] - 128);
    }

    public byte method3802(int var1) {
        return (byte) (0 - this.bytes[++this.offset - 1]);
    }

    public byte method3803(byte var1) {
        return (byte) (128 - this.bytes[++this.offset - 1]);
    }

    public String method3780(byte var1) {
        byte var2 = this.bytes[++this.offset - 1];
        if (var2 != 0) {
            throw new IllegalStateException("");
        } else {
            int var3 = this.method3787((byte) 2);
            if (var3 + this.offset > this.bytes.length) {
                throw new IllegalStateException("");
            } else {
                byte[] var5 = this.bytes;
                int var6 = this.offset;
                char[] var7 = new char[var3];
                int var8 = 0;
                int var9 = var6;

                int var12;
                for (int var10 = var6 + var3; var9 < var10; var7[var8++] = (char) var12) {
                    int var11 = var5[var9++] & 255;
                    if (var11 < 128) {
                        if (var11 == 0) {
                            var12 = 65533;
                        } else {
                            var12 = var11;
                        }
                    } else if (var11 < 192) {
                        var12 = 65533;
                    } else if (var11 < 224) {
                        if (var9 < var10 && (var5[var9] & 192) == 128) {
                            var12 = (var11 & 31) << 6 | var5[var9++] & 63;
                            if (var12 < 128) {
                                var12 = 65533;
                            }
                        } else {
                            var12 = 65533;
                        }
                    } else if (var11 < 240) {
                        if (var9 + 1 < var10 && (var5[var9] & 192) == 128
                            && (var5[var9 + 1] & 192) == 128) {
                            var12 =
                                (var11 & 15) << 12 | (var5[var9++] & 63) << 6 | var5[var9++] & 63;
                            if (var12 < 2048) {
                                var12 = 65533;
                            }
                        } else {
                            var12 = 65533;
                        }
                    } else if (var11 < 248) {
                        if (var9 + 2 < var10 && (var5[var9] & 192) == 128
                            && (var5[var9 + 1] & 192) == 128 && (var5[var9 + 2] & 192) == 128) {
                            var12 = (var11 & 7) << 18 | (var5[var9++] & 63) << 12
                                | (var5[var9++] & 63) << 6 | var5[var9++] & 63;
                            if (var12 >= 65536 && var12 <= 1114111) {
                                var12 = 65533;
                            } else {
                                var12 = 65533;
                            }
                        } else {
                            var12 = 65533;
                        }
                    } else {
                        var12 = 65533;
                    }
                }

                String var4 = new String(var7, 0, var8);
                this.offset += var3;
                return var4;
            }
        }
    }

    public void method3989(CharSequence var1, int var2) {
        int var4 = var1.length();
        int var5 = 0;

        for (int var6 = 0; var6 < var4; ++var6) {
            char var7 = var1.charAt(var6);
            if (var7 <= 127) {
                ++var5;
            } else if (var7 <= 2047) {
                var5 += 2;
            } else {
                var5 += 3;
            }
        }

        this.bytes[++this.offset - 1] = 0;
        this.method3768(var5, (byte) 96);
        this.offset += class26.method491(this.bytes, this.offset, var1, 16711680);
    }

    public void method3797(int var1, int var2) {
        this.bytes[++this.offset - 1] = (byte) (128 - var1);
    }

    public void method3764(int var1, byte var2) {
        this.bytes[this.offset - var1 - 4] = (byte) (var1 >> 24);
        this.bytes[this.offset - var1 - 3] = (byte) (var1 >> 16);
        this.bytes[this.offset - var1 - 2] = (byte) (var1 >> 8);
        this.bytes[this.offset - var1 - 1] = (byte) var1;
    }

    public int method3816(byte var1) {
        this.offset += 4;
        return (this.bytes[this.offset - 4] & 255) + (
            (this.bytes[this.offset - 3] & 255) << 8) + (
            (this.bytes[this.offset - 2] & 255) << 16) + (
            (this.bytes[this.offset - 1] & 255) << 24);
    }

    public void method3919(byte[] var1, int var2, int var3, byte var4) {
        for (int var5 = var2; var5 < var3 + var2; ++var5) {
            var1[var5] = (byte) (this.bytes[++this.offset - 1] - 128);
        }

    }

    public void method3757(long var1) {
        this.bytes[++this.offset - 1] = (byte) ((int) (var1 >> 40));
        this.bytes[++this.offset - 1] = (byte) ((int) (var1 >> 32));
        this.bytes[++this.offset - 1] = (byte) ((int) (var1 >> 24));
        this.bytes[++this.offset - 1] = (byte) ((int) (var1 >> 16));
        this.bytes[++this.offset - 1] = (byte) ((int) (var1 >> 8));
        this.bytes[++this.offset - 1] = (byte) ((int) var1);
    }

    public void method3939(int var1, int var2) {
        this.bytes[++this.offset - 1] = (byte) (var1 >> 16);
        this.bytes[++this.offset - 1] = (byte) (var1 >> 24);
        this.bytes[++this.offset - 1] = (byte) var1;
        this.bytes[++this.offset - 1] = (byte) (var1 >> 8);
    }

    public void method3788(int[] var1, short var2) {
        int var3 = this.offset / 8;
        this.offset = 0;

        for (int var4 = 0; var4 < var3; ++var4) {
            int var5 = this.getInt();
            int var6 = this.getInt();
            int var7 = 0;
            int var8 = -1640531527;

            for (int var9 = 32; var9-- > 0;
                 var6 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var1[var7 >>> 11 & 3] + var7) {
                var5 += var6 + (var6 << 4 ^ var6 >>> 5) ^ var7 + var1[var7 & 3];
                var7 += var8;
            }

            this.offset -= 8;
            this.writeInt(var5);
            this.writeInt(var6);
        }

    }

    public void encipherXtea(int[] var1, int var2, int var3, byte var4) {
        int var5 = this.offset;
        this.offset = var2;
        int var6 = (var3 - var2) / 8;

        for (int var7 = 0; var7 < var6; ++var7) {
            int var8 = this.getInt();
            int var9 = this.getInt();
            int var10 = 0;
            int var11 = -1640531527;

            for (int var12 = 32; var12-- > 0;
                 var9 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var1[var10 >>> 11 & 3] + var10) {
                var8 += var9 + (var9 << 4 ^ var9 >>> 5) ^ var10 + var1[var10 & 3];
                var10 += var11;
            }

            this.offset -= 8;
            this.writeInt(var8);
            this.writeInt(var9);
        }

        this.offset = var5;
    }

    public void method3759(int var1, byte var2) {
        if (var1 >= 0 && var1 < 128) {
            this.writeByte(var1);
        } else if (var1 >= 0 && var1 < 32768) {
            this.writeShort(var1 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void method3918(int[] var1, int var2) {
        int var3 = this.offset / 8;
        this.offset = 0;

        for (int var4 = 0; var4 < var3; ++var4) {
            int var5 = this.getInt();
            int var6 = this.getInt();
            int var7 = -957401312;
            int var8 = -1640531527;

            for (int var9 = 32; var9-- > 0;
                 var5 -= var6 + (var6 << 4 ^ var6 >>> 5) ^ var7 + var1[var7 & 3]) {
                var6 -= var5 + (var5 << 4 ^ var5 >>> 5) ^ var1[var7 >>> 11 & 3] + var7;
                var7 -= var8;
            }

            this.offset -= 8;
            this.writeInt(var5);
            this.writeInt(var6);
        }

    }
}
