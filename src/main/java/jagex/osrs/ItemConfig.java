package jagex.osrs;

public class ItemConfig extends class208 {

    public static class202 field3546;
    static class202 field3507;
    static class202 field3508;
    static class249 field3506;
    static int len;

    static {
        field3507 = new class202(64);
        field3508 = new class202(50);
        field3546 = new class202(200);
    }

    public String[] field3541;
    public String field3515;
    public int field3517;
    public int field3557;
    public int field3524;
    public int field3519;
    public int field3521;
    public int stackable;
    public int field3522;
    public int field3520;
    public boolean field3512;
    public int value;
    public int field3552;
    public String[] field3526;
    public boolean field3509;
    public int field3548;
    public int field3531;
    public int field3549;
    public int field3540;
    public int field3510;
    public int field3555;
    int field3529;
    int field3556;
    int field3558;
    int[] field3553;
    int field3528;
    class199 field3551;
    int field3530;
    int field3554;
    int field3535;
    int field3539;
    int field3532;
    int field3545;
    int[] field3542;
    int field3533;
    int field3536;
    int field3525;
    int field3537;
    int field3547;
    short[] field3513;
    int field3502;
    int field3534;
    short[] field3538;
    short[] field3514;
    int field3518;
    short[] field3516;
    int field3511;

    ItemConfig() {
        this.field3515 = "null";
        this.field3517 = 2000;
        this.field3524 = 0;
        this.field3519 = 0;
        this.field3520 = 0;
        this.field3521 = 0;
        this.field3522 = 0;
        this.stackable = 0;
        this.value = 1;
        this.field3512 = false;
        this.field3526 = new String[]{null, null, "Take", null, null};
        this.field3541 = new String[]{null, null, null, null, "Drop"};
        this.field3528 = -2;
        this.field3529 = -1;
        this.field3530 = -1;
        this.field3502 = 0;
        this.field3532 = -1;
        this.field3533 = -1;
        this.field3534 = 0;
        this.field3535 = -1;
        this.field3536 = -1;
        this.field3556 = -1;
        this.field3554 = -1;
        this.field3539 = -1;
        this.field3545 = -1;
        this.field3549 = -1;
        this.field3552 = -1;
        this.field3525 = 128;
        this.field3537 = 128;
        this.field3547 = 128;
        this.field3548 = 0;
        this.field3531 = 0;
        this.field3540 = 0;
        this.field3509 = false;
        this.field3511 = -1;
        this.field3518 = -1;
        this.field3555 = -1;
        this.field3510 = -1;
    }

  public static ItemConfig get(int var0) {
      ItemConfig var2 = (ItemConfig) field3507.method4198((long) var0);
      if (var2 != null) {
          return var2;
      } else {
          byte[] var3 = field3506.method4831(10, var0, 1789634852);
          var2 = new ItemConfig();
          var2.field3557 = var0;
          if (var3 != null) {
              var2.method5375(new Buffer(var3), 1116128472);
          }

          var2.method5322(-1590833438);
          if (var2.field3552 != -1) {
              var2.method5325(get(var2.field3552),
                              get(var2.field3549), -1496668389);
          }

          if (var2.field3518 != -1) {
              var2.method5338(get(var2.field3518),
                              get(var2.field3511), (byte) 1);
          }

          if (var2.field3510 != -1) {
              var2.method5327(get(var2.field3510),
                              get(var2.field3555), (byte) 2);
          }

          if (!class229.field2648 && var2.field3512) {
              var2.field3515 = "Members object";
              var2.field3509 = false;
              var2.field3526 = null;
              var2.field3541 = null;
              var2.field3528 = -1;
              var2.field3540 = 0;
              if (var2.field3551 != null) {
                  boolean var4 = false;

                  for (Node var5 = var2.field3551.method4172(); var5 != null;
                       var5 = var2.field3551.method4173()) {
                      class266 var6 = class25.method479((int) var5.key, (byte) -25);
                      if (var6.field3404) {
                          var5.unlink();
                      } else {
                          var4 = true;
                      }
                  }

                  if (!var4) {
                      var2.field3551 = null;
                  }
              }
          }

          field3507.method4204(var2, (long) var0);
          return var2;
      }
  }

  void method5324(Buffer var1, int var2, int var3) {
        if (var2 == 1) {
            this.field3558 = var1.readUint16();
        } else if (var2 == 2) {
            this.field3515 = var1.getString();
        } else if (var2 == 4) {
            this.field3517 = var1.readUint16();
        } else if (var2 == 5) {
            this.field3524 = var1.readUint16();
        } else if (var2 == 6) {
            this.field3519 = var1.readUint16();
        } else if (var2 == 7) {
            this.field3521 = var1.readUint16();
            if (this.field3521 > 32767) {
                this.field3521 -= 65536;
            }
        } else if (var2 == 8) {
            this.field3522 = var1.readUint16();
            if (this.field3522 > 32767) {
                this.field3522 -= 65536;
            }
        } else if (var2 == 11) {
            this.stackable = 1;
        } else if (var2 == 12) {
            this.value = var1.getInt();
        } else if (var2 == 16) {
            this.field3512 = true;
        } else if (var2 == 23) {
            this.field3529 = var1.readUint16();
            this.field3502 = var1.readUint8();
        } else if (var2 == 24) {
            this.field3530 = var1.readUint16();
        } else if (var2 == 25) {
            this.field3532 = var1.readUint16();
            this.field3534 = var1.readUint8();
        } else if (var2 == 26) {
            this.field3533 = var1.readUint16();
        } else if (var2 >= 30 && var2 < 35) {
            this.field3526[var2 - 30] = var1.getString();
            if (this.field3526[var2 - 30].equalsIgnoreCase("Hidden")) {
                this.field3526[var2 - 30] = null;
            }
        } else if (var2 >= 35 && var2 < 40) {
            this.field3541[var2 - 35] = var1.getString();
        } else {
            int var4;
            int var5;
            if (var2 == 40) {
                var4 = var1.readUint8();
                this.field3513 = new short[var4];
                this.field3514 = new short[var4];

                for (var5 = 0; var5 < var4; ++var5) {
                    this.field3513[var5] = (short) var1.readUint16();
                    this.field3514[var5] = (short) var1.readUint16();
                }
            } else if (var2 == 41) {
                var4 = var1.readUint8();
                this.field3538 = new short[var4];
                this.field3516 = new short[var4];

                for (var5 = 0; var5 < var4; ++var5) {
                    this.field3538[var5] = (short) var1.readUint16();
                    this.field3516[var5] = (short) var1.readUint16();
                }
            } else if (var2 == 42) {
                this.field3528 = var1.method3931(2142860688);
            } else if (var2 == 65) {
                this.field3509 = true;
            } else if (var2 == 78) {
                this.field3535 = var1.readUint16();
            } else if (var2 == 79) {
                this.field3536 = var1.readUint16();
            } else if (var2 == 90) {
                this.field3556 = var1.readUint16();
            } else if (var2 == 91) {
                this.field3539 = var1.readUint16();
            } else if (var2 == 92) {
                this.field3554 = var1.readUint16();
            } else if (var2 == 93) {
                this.field3545 = var1.readUint16();
            } else if (var2 == 95) {
                this.field3520 = var1.readUint16();
            } else if (var2 == 97) {
                this.field3549 = var1.readUint16();
            } else if (var2 == 98) {
                this.field3552 = var1.readUint16();
            } else if (var2 >= 100 && var2 < 110) {
                if (this.field3553 == null) {
                    this.field3553 = new int[10];
                    this.field3542 = new int[10];
                }

                this.field3553[var2 - 100] = var1.readUint16();
                this.field3542[var2 - 100] = var1.readUint16();
            } else if (var2 == 110) {
                this.field3525 = var1.readUint16();
            } else if (var2 == 111) {
                this.field3537 = var1.readUint16();
            } else if (var2 == 112) {
                this.field3547 = var1.readUint16();
            } else if (var2 == 113) {
                this.field3548 = var1.method3931(2128516482);
            } else if (var2 == 114) {
                this.field3531 = var1.method3931(2043331970);
            } else if (var2 == 115) {
                this.field3540 = var1.readUint8();
            } else if (var2 == 139) {
                this.field3511 = var1.readUint16();
            } else if (var2 == 140) {
                this.field3518 = var1.readUint16();
            } else if (var2 == 148) {
                this.field3555 = var1.readUint16();
            } else if (var2 == 149) {
                this.field3510 = var1.readUint16();
            } else if (var2 == 249) {
                this.field3551 = class226.method4634(var1, this.field3551, (short) -26349);
            }
        }

    }

    public final class121 method5350(int var1, int var2) {
        if (this.field3553 != null && var1 > 1) {
            int var3 = -1;

            for (int var4 = 0; var4 < 10; ++var4) {
                if (var1 >= this.field3542[var4] && this.field3542[var4] != 0) {
                    var3 = this.field3553[var4];
                }
            }

            if (var3 != -1) {
                return get(var3).method5350(1, -1185226375);
            }
        }

        class121 var6 = (class121) field3508.method4198((long) this.field3557);
        if (var6 != null) {
            return var6;
        } else {
            class115 var7 = class115.method2843(class4.field32, this.field3558, 0);
            if (var7 == null) {
                return null;
            } else {
                if (this.field3525 != 128 || this.field3537 != 128 || this.field3547 != 128) {
                    var7.method2783(this.field3525, this.field3537, this.field3547);
                }

                int var5;
                if (this.field3513 != null) {
                    for (var5 = 0; var5 < this.field3513.length; ++var5) {
                        var7.method2775(this.field3513[var5], this.field3514[var5]);
                    }
                }

                if (this.field3538 != null) {
                    for (var5 = 0; var5 < this.field3538.length; ++var5) {
                        var7.method2785(this.field3538[var5], this.field3516[var5]);
                    }
                }

                var6 = var7
                    .method2772(this.field3548 + 64, this.field3531 * 5 + 768, -50, -10, -50);
                var6.field1664 = true;
                field3508.method4204(var6, (long) this.field3557);
                return var6;
            }
        }
    }

    public final class115 method5381(int var1, short var2) {
        int var4;
        if (this.field3553 != null && var1 > 1) {
            int var3 = -1;

            for (var4 = 0; var4 < 10; ++var4) {
                if (var1 >= this.field3542[var4] && this.field3542[var4] != 0) {
                    var3 = this.field3553[var4];
                }
            }

            if (var3 != -1) {
                return get(var3).method5381(1, (short) -6978);
            }
        }

        class115 var5 = class115.method2843(class4.field32, this.field3558, 0);
        if (var5 == null) {
            return null;
        } else {
            if (this.field3525 != 128 || this.field3537 != 128 || this.field3547 != 128) {
                var5.method2783(this.field3525, this.field3537, this.field3547);
            }

            if (this.field3513 != null) {
                for (var4 = 0; var4 < this.field3513.length; ++var4) {
                    var5.method2775(this.field3513[var4], this.field3514[var4]);
                }
            }

            if (this.field3538 != null) {
                for (var4 = 0; var4 < this.field3538.length; ++var4) {
                    var5.method2785(this.field3538[var4], this.field3516[var4]);
                }
            }

            return var5;
        }
    }

    void method5322(int var1) {
    }

    public final boolean method5333(boolean var1, int var2) {
        int var3 = this.field3556;
        int var4 = this.field3554;
        if (var1) {
            var3 = this.field3539;
            var4 = this.field3545;
        }

        if (var3 == -1) {
            return true;
        } else {
            boolean var5 = true;
            if (!class4.field32.method4830(var3, 0, (byte) 61)) {
                var5 = false;
            }

            if (var4 != -1 && !class4.field32.method4830(var4, 0, (byte) -3)) {
                var5 = false;
            }

            return var5;
        }
    }

    void method5375(Buffer var1, int var2) {
        while (true) {
            int var3 = var1.readUint8();
            if (var3 == 0) {
                return;
            }

            this.method5324(var1, var3, -801705677);
        }
    }

    public final class115 method5365(boolean var1, short var2) {
        int var3 = this.field3556;
        int var4 = this.field3554;
        if (var1) {
            var3 = this.field3539;
            var4 = this.field3545;
        }

        if (var3 == -1) {
            return null;
        } else {
            class115 var5 = class115.method2843(class4.field32, var3, 0);
            if (var4 != -1) {
                class115 var6 = class115.method2843(class4.field32, var4, 0);
                class115[] var7 = new class115[]{var5, var6};
                var5 = new class115(var7, 2);
            }

            int var8;
            if (this.field3513 != null) {
                for (var8 = 0; var8 < this.field3513.length; ++var8) {
                    var5.method2775(this.field3513[var8], this.field3514[var8]);
                }
            }

            if (this.field3538 != null) {
                for (var8 = 0; var8 < this.field3538.length; ++var8) {
                    var5.method2785(this.field3538[var8], this.field3516[var8]);
                }
            }

            return var5;
        }
    }

    public final boolean method5331(boolean var1, int var2) {
        int var3 = this.field3529;
        int var4 = this.field3530;
        int var5 = this.field3535;
        if (var1) {
            var3 = this.field3532;
            var4 = this.field3533;
            var5 = this.field3536;
        }

        if (var3 == -1) {
            return true;
        } else {
            boolean var6 = true;
            if (!class4.field32.method4830(var3, 0, (byte) -7)) {
                var6 = false;
            }

            if (var4 != -1 && !class4.field32.method4830(var4, 0, (byte) 25)) {
                var6 = false;
            }

            if (var5 != -1 && !class4.field32.method4830(var5, 0, (byte) 22)) {
                var6 = false;
            }

            return var6;
        }
    }

    public final class115 method5332(boolean var1, byte var2) {
        int var3 = this.field3529;
        int var4 = this.field3530;
        int var5 = this.field3535;
        if (var1) {
            var3 = this.field3532;
            var4 = this.field3533;
            var5 = this.field3536;
        }

        if (var3 == -1) {
            return null;
        } else {
            class115 var6 = class115.method2843(class4.field32, var3, 0);
            if (var4 != -1) {
                class115 var7 = class115.method2843(class4.field32, var4, 0);
                if (var5 != -1) {
                    class115 var8 = class115.method2843(class4.field32, var5, 0);
                    class115[] var9 = new class115[]{var6, var7, var8};
                    var6 = new class115(var9, 3);
                } else {
                    class115[] var11 = new class115[]{var6, var7};
                    var6 = new class115(var11, 2);
                }
            }

            if (!var1 && this.field3502 != 0) {
                var6.method2827(0, this.field3502, 0);
            }

            if (var1 && this.field3534 != 0) {
                var6.method2827(0, this.field3534, 0);
            }

            int var10;
            if (this.field3513 != null) {
                for (var10 = 0; var10 < this.field3513.length; ++var10) {
                    var6.method2775(this.field3513[var10], this.field3514[var10]);
                }
            }

            if (this.field3538 != null) {
                for (var10 = 0; var10 < this.field3538.length; ++var10) {
                    var6.method2785(this.field3538[var10], this.field3516[var10]);
                }
            }

            return var6;
        }
    }

    void method5325(ItemConfig var1, ItemConfig var2, int var3) {
        this.field3558 = var1.field3558;
        this.field3517 = var1.field3517;
        this.field3524 = var1.field3524;
        this.field3519 = var1.field3519;
        this.field3520 = var1.field3520;
        this.field3521 = var1.field3521;
        this.field3522 = var1.field3522;
        this.field3513 = var1.field3513;
        this.field3514 = var1.field3514;
        this.field3538 = var1.field3538;
        this.field3516 = var1.field3516;
        this.field3515 = var2.field3515;
        this.field3512 = var2.field3512;
        this.value = var2.value;
        this.stackable = 1;
    }

    void method5338(ItemConfig var1, ItemConfig var2, byte var3) {
        this.field3558 = var1.field3558;
        this.field3517 = var1.field3517;
        this.field3524 = var1.field3524;
        this.field3519 = var1.field3519;
        this.field3520 = var1.field3520;
        this.field3521 = var1.field3521;
        this.field3522 = var1.field3522;
        this.field3513 = var2.field3513;
        this.field3514 = var2.field3514;
        this.field3538 = var2.field3538;
        this.field3516 = var2.field3516;
        this.field3515 = var2.field3515;
        this.field3512 = var2.field3512;
        this.stackable = var2.stackable;
        this.field3529 = var2.field3529;
        this.field3530 = var2.field3530;
        this.field3535 = var2.field3535;
        this.field3532 = var2.field3532;
        this.field3533 = var2.field3533;
        this.field3536 = var2.field3536;
        this.field3556 = var2.field3556;
        this.field3554 = var2.field3554;
        this.field3539 = var2.field3539;
        this.field3545 = var2.field3545;
        this.field3540 = var2.field3540;
        this.field3526 = var2.field3526;
        this.field3541 = new String[5];
        if (var2.field3541 != null) {
            for (int var4 = 0; var4 < 4; ++var4) {
                this.field3541[var4] = var2.field3541[var4];
            }
        }

        this.field3541[4] = "Discard";
        this.value = 0;
    }

    void method5327(ItemConfig var1, ItemConfig var2, byte var3) {
        this.field3558 = var1.field3558;
        this.field3517 = var1.field3517;
        this.field3524 = var1.field3524;
        this.field3519 = var1.field3519;
        this.field3520 = var1.field3520;
        this.field3521 = var1.field3521;
        this.field3522 = var1.field3522;
        this.field3513 = var1.field3513;
        this.field3514 = var1.field3514;
        this.field3538 = var1.field3538;
        this.field3516 = var1.field3516;
        this.stackable = var1.stackable;
        this.field3515 = var2.field3515;
        this.value = 0;
        this.field3512 = false;
        this.field3509 = false;
    }

    public ItemConfig method5373(int var1, int var2) {
        if (this.field3553 != null && var1 > 1) {
            int var3 = -1;

            for (int var4 = 0; var4 < 10; ++var4) {
                if (var1 >= this.field3542[var4] && this.field3542[var4] != 0) {
                    var3 = this.field3553[var4];
                }
            }

            if (var3 != -1) {
                return get(var3);
            }
        }

        return this;
    }

    public String method5335(int var1, String var2, int var3) {
        return class148.method3369(this.field3551, var1, var2, (short) 3129);
    }

    public int method5360(int var1, int var2, int var3) {
        return class148.method3363(this.field3551, var1, var2, (byte) 95);
    }

    public int method5336(int var1) {
        return this.field3528 != -1 && this.field3541 != null ? (this.field3528 >= 0 ? (
            this.field3541[this.field3528] != null ? this.field3528 : -1)
            : ("Drop".equalsIgnoreCase(this.field3541[4]) ? 4 : -1)) : -1;
    }
}
