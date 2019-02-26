package jagex.osrs;

import java.io.EOFException;
import java.io.IOException;

public class BufferedFile {

    static class159 field1489;
    static class322[] field1490;
    static byte[][] field1487;
    long length;
    int field1480;
    long field1484;
    long field1485;
    long field1477;
    long field1479;
    SeekableFile field1478;
    int field1483;
    byte[] field1481;
    byte[] field1482;
    long field1488;

    public BufferedFile(SeekableFile var1, int var2, int var3) throws IOException {
        this.field1479 = -1L;
        this.field1485 = -1L;
        this.field1483 = 0;
        this.field1478 = var1;
        this.length = this.field1488 = var1.method2719(488939355);
        this.field1482 = new byte[var2];
        this.field1481 = new byte[var3];
        this.field1477 = 0L;
    }

    static void method2713(int var0, int var1) {
        if (var0 == -3) {
            class185.method4006("Connection timed out.", "Please try using a different world.", "",
                                1841303194);
        } else if (var0 == -2) {
            class185.method4006("", "Error connecting to server.", "", 1922930154);
        } else if (var0 == -1) {
            class185
                .method4006("No response from server.", "Please try using a different world.", "",
                            2007913171);
        } else if (var0 == 3) {
            class79.field1163 = 3;
            class79.field1161 = 1;
        } else if (var0 == 4) {
            class79.field1163 = 12;
            class79.field1142 = 0;
        } else if (var0 == 5) {
            class79.field1161 = 2;
            class185.method4006("Your account has not logged out from its last",
                                "session or the server is too busy right now.",
                                "Please try again in a few minutes.", 1845257210);
        } else if (var0 == 6 || !client.field770 && var0 == 68) {
            class185.method4006("RuneScape has been updated!", "Please reload this page.", "",
                                1608572757);
        } else if (var0 == 7) {
            class185
                .method4006("This world is full.", "Please use a different world.", "", 1632182564);
        } else if (var0 == 8) {
            class185.method4006("Unable to connect.", "Login server offline.", "", 2016782678);
        } else if (var0 == 9) {
            class185
                .method4006("Login limit exceeded.", "Too many connections from your address.", "",
                            1813820257);
        } else if (var0 == 10) {
            class185.method4006("Unable to connect.", "Bad session id.", "", 1993946842);
        } else if (var0 == 11) {
            class185.method4006("We suspect someone knows your password.",
                                "Press \'change your password\' on front page.", "", 1817502739);
        } else if (var0 == 12) {
            class185.method4006("You need a members account to login to this world.",
                                "Please subscribe, or use a different world.", "", 1850582093);
        } else if (var0 == 13) {
            class185
                .method4006("Could not complete login.", "Please try using a different world.", "",
                            1412205772);
        } else if (var0 == 14) {
            class185
                .method4006("The server is being updated.", "Please wait 1 minute and try again.",
                            "", 1549287963);
        } else if (var0 == 16) {
            class185.method4006("Too many login attempts.",
                                "Please wait a few minutes before trying again.", "", 1791763073);
        } else if (var0 == 17) {
            class185.method4006("You are standing in a members-only area.",
                                "To play on this world move to a free area first", "", 2055877480);
        } else if (var0 == 18) {
            class79.field1163 = 12;
            class79.field1142 = 1;
        } else if (var0 == 19) {
            class185
                .method4006("This world is running a closed Beta.", "Sorry invited players only.",
                            "Please use a different world.", 1325009642);
        } else if (var0 == 20) {
            class185
                .method4006("Invalid loginserver requested.", "Please try using a different world.",
                            "", 1484876444);
        } else if (var0 == 22) {
            class185.method4006("Malformed login packet.", "Please try again.", "", 1610591013);
        } else if (var0 == 23) {
            class185
                .method4006("No reply from loginserver.", "Please wait 1 minute and try again.", "",
                            1642596692);
        } else if (var0 == 24) {
            class185
                .method4006("Error loading your profile.", "Please contact customer support.", "",
                            1535193754);
        } else if (var0 == 25) {
            class185.method4006("Unexpected loginserver response.",
                                "Please try using a different world.", "", 2007528264);
        } else if (var0 == 26) {
            class185.method4006("This computers address has been blocked",
                                "as it was used to break our rules.", "", 2013522893);
        } else if (var0 == 27) {
            class185.method4006("", "Service unavailable.", "", 1495949577);
        } else if (var0 == 31) {
            class185.method4006("Your account must have a displayname set",
                                "in order to play the game.  Please set it",
                                "via the website, or the main game.", 2099548820);
        } else if (var0 == 32) {
            class185.method4006("Your attempt to log into your account was",
                                "unsuccessful.  Don\'t worry, you can sort",
                                "this out by visiting the billing system.", 1770606636);
        } else if (var0 == 37) {
            class185.method4006("Your account is currently inaccessible.",
                                "Please try again in a few minutes.", "", 1656235048);
        } else if (var0 == 38) {
            class185.method4006("You need to vote to play!", "Visit runescape.com and vote,",
                                "and then come back here!", 1942276916);
        } else if (var0 == 55) {
            class79.field1163 = 8;
        } else {
            if (var0 == 56) {
                class185
                    .method4006("Enter the 6-digit code generated by your", "authenticator app.",
                                "", 1762349013);
                class16.method202(11, -1194677662);
                return;
            }

            if (var0 == 57) {
                class185.method4006("The code you entered was incorrect.", "Please try again.", "",
                                    1521210313);
                class16.method202(11, -1194677662);
                return;
            }

            if (var0 == 61) {
                class79.field1163 = 7;
            } else {
                class185
                    .method4006("Unexpected server response", "Please try using a different world.",
                                "", 2038103228);
            }
        }

        class16.method202(10, -1194677662);
    }

    public void read(byte[] var1, int var2, int var3, int var4) throws IOException {
        try {
            if (var3 + var2 > var1.length) {
                throw new ArrayIndexOutOfBoundsException(var3 + var2 - var1.length);
            }

            if (-1L != this.field1485 && this.field1477 >= this.field1485
                && (long) var3 + this.field1477 <= this.field1485 + (long) this.field1483) {
                System
                    .arraycopy(this.field1481, (int) (this.field1477 - this.field1485), var1, var2,
                               var3);
                this.field1477 += (long) var3;
                return;
            }

            long var5 = this.field1477;
            int var8 = var3;
            int var9;
            if (this.field1477 >= this.field1479
                && this.field1477 < this.field1479 + (long) this.field1480) {
                var9 = (int) ((long) this.field1480 - (this.field1477 - this.field1479));
                if (var9 > var3) {
                    var9 = var3;
                }

                System
                    .arraycopy(this.field1482, (int) (this.field1477 - this.field1479), var1, var2,
                               var9);
                this.field1477 += (long) var9;
                var2 += var9;
                var3 -= var9;
            }

            if (var3 > this.field1482.length) {
                this.field1478.method2718(this.field1477);

                for (this.field1484 = this.field1477; var3 > 0; var3 -= var9) {
                    var9 = this.field1478.method2720(var1, var2, var3, 347221077);
                    if (var9 == -1) {
                        break;
                    }

                    this.field1484 += (long) var9;
                    this.field1477 += (long) var9;
                    var2 += var9;
                }
            } else if (var3 > 0) {
                this.method2687(-2121542963);
                var9 = var3;
                if (var3 > this.field1480) {
                    var9 = this.field1480;
                }

                System.arraycopy(this.field1482, 0, var1, var2, var9);
                var2 += var9;
                var3 -= var9;
                this.field1477 += (long) var9;
            }

            if (this.field1485 != -1L) {
                if (this.field1485 > this.field1477 && var3 > 0) {
                    var9 = var2 + (int) (this.field1485 - this.field1477);
                    if (var9 > var3 + var2) {
                        var9 = var3 + var2;
                    }

                    while (var2 < var9) {
                        var1[var2++] = 0;
                        --var3;
                        ++this.field1477;
                    }
                }

                long var14 = -1L;
                long var11 = -1L;
                if (this.field1485 >= var5 && this.field1485 < var5 + (long) var8) {
                    var14 = this.field1485;
                } else if (var5 >= this.field1485
                    && var5 < this.field1485 + (long) this.field1483) {
                    var14 = var5;
                }

                if ((long) this.field1483 + this.field1485 > var5
                    && (long) this.field1483 + this.field1485 <= (long) var8 + var5) {
                    var11 = (long) this.field1483 + this.field1485;
                } else if ((long) var8 + var5 > this.field1485
                    && (long) var8 + var5 <= (long) this.field1483 + this.field1485) {
                    var11 = (long) var8 + var5;
                }

                if (var14 > -1L && var11 > var14) {
                    int var13 = (int) (var11 - var14);
                    System.arraycopy(this.field1481, (int) (var14 - this.field1485), var1,
                                     (int) (var14 - var5) + var2, var13);
                    if (var11 > this.field1477) {
                        var3 = (int) ((long) var3 - (var11 - this.field1477));
                        this.field1477 = var11;
                    }
                }
            }
        } catch (IOException var17) {
            this.field1484 = -1L;
            throw var17;
        }

        if (var3 > 0) {
            throw new EOFException();
        }
    }

    void method2691(int var1) throws IOException {
        if (this.field1485 != -1L) {
            if (this.field1484 != this.field1485) {
                this.field1478.method2718(this.field1485);
                this.field1484 = this.field1485;
            }

            this.field1478.write(this.field1481, 0, this.field1483);
            this.field1484 += (long) (this.field1483 * 136693003) * -239280477L;
            if (this.field1484 > this.field1488) {
                this.field1488 = this.field1484;
            }

            long var2 = -1L;
            long var4 = -1L;
            if (this.field1485 >= this.field1479
                && this.field1485 < this.field1479 + (long) this.field1480) {
                var2 = this.field1485;
            } else if (this.field1479 >= this.field1485
                && this.field1479 < this.field1485 + (long) this.field1483) {
                var2 = this.field1479;
            }

            if ((long) this.field1483 + this.field1485 > this.field1479
                && this.field1485 + (long) this.field1483
                <= (long) this.field1480 + this.field1479) {
                var4 = (long) this.field1483 + this.field1485;
            } else if (this.field1479 + (long) this.field1480 > this.field1485
                && this.field1479 + (long) this.field1480
                <= (long) this.field1483 + this.field1485) {
                var4 = (long) this.field1480 + this.field1479;
            }

            if (var2 > -1L && var4 > var2) {
                int var6 = (int) (var4 - var2);
                System.arraycopy(this.field1481, (int) (var2 - this.field1485), this.field1482,
                                 (int) (var2 - this.field1479), var6);
            }

            this.field1485 = -1L;
            this.field1483 = 0;
        }

    }

    public long length() {
        return this.length;
    }

    public void seek(long var1) throws IOException {
        if (var1 < 0L) {
            throw new IOException("");
        } else {
            this.field1477 = var1;
        }
    }

    public void method2692(byte[] var1, int var2, int var3, byte var4) throws IOException {
        try {
            if ((long) var3 + this.field1477 > this.length) {
                this.length = this.field1477 + (long) var3;
            }

            if (-1L != this.field1485 && (this.field1477 < this.field1485
                || this.field1477 > (long) this.field1483 + this.field1485)) {
                this.method2691(805418179);
            }

            if (-1L != this.field1485
                && (long) var3 + this.field1477 > this.field1485 + (long) this.field1481.length) {
                int var5 = (int) ((long) this.field1481.length - (this.field1477 - this.field1485));
                System
                    .arraycopy(var1, var2, this.field1481, (int) (this.field1477 - this.field1485),
                               var5);
                this.field1477 += (long) var5;
                var2 += var5;
                var3 -= var5;
                this.field1483 = this.field1481.length;
                this.method2691(805418179);
            }

            if (var3 <= this.field1481.length) {
                if (var3 > 0) {
                    if (-1L == this.field1485) {
                        this.field1485 = this.field1477;
                    }

                    System.arraycopy(var1, var2, this.field1481,
                                     (int) (this.field1477 - this.field1485), var3);
                    this.field1477 += (long) var3;
                    if (this.field1477 - this.field1485 > (long) this.field1483) {
                        this.field1483 = (int) (this.field1477 - this.field1485);
                    }

                }
            } else {
                if (this.field1477 != this.field1484) {
                    this.field1478.method2718(this.field1477);
                    this.field1484 = this.field1477;
                }

                this.field1478.write(var1, var2, var3);
                this.field1484 += (long) var3;
                if (this.field1484 > this.field1488) {
                    this.field1488 = this.field1484;
                }

                long var10 = -1L;
                long var7 = -1L;
                if (this.field1477 >= this.field1479
                    && this.field1477 < (long) this.field1480 + this.field1479) {
                    var10 = this.field1477;
                } else if (this.field1479 >= this.field1477
                    && this.field1479 < this.field1477 + (long) var3) {
                    var10 = this.field1479;
                }

                if ((long) var3 + this.field1477 > this.field1479
                    && this.field1477 + (long) var3 <= this.field1479 + (long) this.field1480) {
                    var7 = (long) var3 + this.field1477;
                } else if (this.field1479 + (long) this.field1480 > this.field1477
                    && (long) this.field1480 + this.field1479 <= (long) var3 + this.field1477) {
                    var7 = this.field1479 + (long) this.field1480;
                }

                if (var10 > -1L && var7 > var10) {
                    int var9 = (int) (var7 - var10);
                    System.arraycopy(var1, (int) (var10 + (long) var2 - this.field1477),
                                     this.field1482, (int) (var10 - this.field1479), var9);
                }

                this.field1477 += (long) var3;
            }
        } catch (IOException var13) {
            this.field1484 = -1L;
            throw var13;
        }
    }

    void method2687(int var1) throws IOException {
        this.field1480 = 0;
        if (this.field1484 != this.field1477) {
            this.field1478.method2718(this.field1477);
            this.field1484 = this.field1477;
        }

        int var2;
        for (this.field1479 = this.field1477; this.field1480 < this.field1482.length;
             this.field1480 += var2) {
            var2 = this.field1478
                .method2720(this.field1482, this.field1480, this.field1482.length - this.field1480,
                            -59239569);
            if (var2 == -1) {
                break;
            }

            this.field1484 += (long) var2;
        }

    }

    public void method2682(int var1) throws IOException {
        this.method2691(805418179);
        this.field1478.method2717(-1498033738);
    }

    public void method2685(byte[] var1, int var2) throws IOException {
        this.read(var1, 0, var1.length, 749697465);
    }
}
