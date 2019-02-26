package jagex.osrs;

import java.util.Iterator;
import java.util.LinkedList;

public class class20 {

    String field192;
    int field195;
    int field200;
    boolean field202;
    int field196;
    String field201;
    class228 field197;
    LinkedList field193;
    int field199;
    int field203;
    int field198;
    int field194;

    public class20() {
        this.field200 = -1;
        this.field195 = -1;
        this.field196 = -1;
        this.field197 = null;
        this.field198 = Integer.MAX_VALUE;
        this.field199 = 0;
        this.field194 = Integer.MAX_VALUE;
        this.field203 = 0;
        this.field202 = false;
    }

    static final void method318(String var0, byte var1) {
        class34.method643("Please remove " + var0 + " from your friend list first", 1537880184);
    }

    static void method317(class249 var0, class249 var1, boolean var2, int var3, byte var4) {
        if (class79.field1174) {
            if (var3 == 4) {
                class79.field1163 = 4;
            }

        } else {
            class79.field1163 = var3;
            class319.method6043();
            byte[] var5 = var0.method4849("title.jpg", "", -2130431892);
            class79.field1145 = class70.method1946(var5, 272914243);
            class79.field1146 = class79.field1145.method6153();
            if ((client.field660 & 536870912) != 0) {
                class265.field3401 = class257
                    .method5047(var1, "logo_deadman_mode", "", -1559670221);
            } else {
                class265.field3401 = class257.method5047(var1, "logo", "", -1750273605);
            }

            class79.field1149 = class257.method5047(var1, "titlebox", "", -339705951);
            class307.field3801 = class257.method5047(var1, "titlebutton", "", 1184381845);
            int var7 = var1.method4825("runes", 1011742774);
            int var8 = var1.method4847(var7, "", -333224879);
            class322[] var9;
            if (!class17.method212(var1, var7, var8, (byte) 1)) {
                var9 = null;
            } else {
                var9 = class311.method5957(2063264131);
            }

            class6.field44 = var9;
            var8 = var1.method4825("title_mute", 1011742774);
            int var11 = var1.method4847(var8, "", 810281283);
            class322[] var10;
            if (!class17.method212(var1, var8, var11, (byte) 1)) {
                var10 = null;
            } else {
                var10 = class311.method5957(2004537898);
            }

            class79.field1147 = var10;
            class185.field2417 = class257
                .method5047(var1, "options_radio_buttons,0", "", 305258241);
            class79.field1148 = class257
                .method5047(var1, "options_radio_buttons,4", "", -722642983);
            class132.field1861 = class257
                .method5047(var1, "options_radio_buttons,2", "", -573731551);
            class138.field1925 = class257
                .method5047(var1, "options_radio_buttons,6", "", 1315317318);
            class69.field1050 = class185.field2417.field3872;
            class42.field405 = class185.field2417.field3873;
            class79.field1151 = new int[256];

            for (var8 = 0; var8 < 64; ++var8) {
                class79.field1151[var8] = var8 * 262144;
            }

            for (var8 = 0; var8 < 64; ++var8) {
                class79.field1151[var8 + 64] = var8 * 1024 + 16711680;
            }

            for (var8 = 0; var8 < 64; ++var8) {
                class79.field1151[var8 + 128] = var8 * 4 + 16776960;
            }

            for (var8 = 0; var8 < 64; ++var8) {
                class79.field1151[var8 + 192] = 16777215;
            }

            class58.field583 = new int[256];

            for (var8 = 0; var8 < 64; ++var8) {
                class58.field583[var8] = var8 * 1024;
            }

            for (var8 = 0; var8 < 64; ++var8) {
                class58.field583[var8 + 64] = var8 * 4 + 65280;
            }

            for (var8 = 0; var8 < 64; ++var8) {
                class58.field583[var8 + 128] = var8 * 262144 + 65535;
            }

            for (var8 = 0; var8 < 64; ++var8) {
                class58.field583[var8 + 192] = 16777215;
            }

            class161.field2048 = new int[256];

            for (var8 = 0; var8 < 64; ++var8) {
                class161.field2048[var8] = var8 * 4;
            }

            for (var8 = 0; var8 < 64; ++var8) {
                class161.field2048[var8 + 64] = var8 * 262144 + 255;
            }

            for (var8 = 0; var8 < 64; ++var8) {
                class161.field2048[var8 + 128] = var8 * 1024 + 16711935;
            }

            for (var8 = 0; var8 < 64; ++var8) {
                class161.field2048[var8 + 192] = 16777215;
            }

            class69.field1047 = new int[256];
            class62.field640 = new int['\u8000'];
            class32.field322 = new int['\u8000'];
            class278.method5494((class322) null, 1351792385);
            class19.field182 = new int['\u8000'];
            class19.field183 = new int['\u8000'];
            if (var2) {
                class79.username = "";
                class79.password = "";
            }

            class60.field604 = 0;
            class10.field82 = "";
            class79.field1172 = true;
            class79.field1176 = false;
            if (!GameApplet.field435.field1035) {
                class27.method516(2, InboundPacketDescriptor.index6, "scape main", "", 255, false, 507894573);
            } else {
                class180.method3732(2, -1397011765);
            }

            class227.method4642(false, -714835684);
            class79.field1174 = true;
            class79.field1143 = (class68.windowWidth - 765) / 2;
            class79.field1144 = class79.field1143 + 202;
            class13.field103 = class79.field1144 + 180;
            class79.field1145.method6184(class79.field1143, 0);
            class79.field1146.method6184(class79.field1143 + 382, 0);
            class265.field3401
                .method6143(class79.field1143 + 382 - class265.field3401.field3872 / 2, 18);
        }
    }

    public void method262(Buffer var1, int var2, int var3) {
        this.field200 = var2;
        this.field201 = var1.method3778(-2077960881);
        this.field192 = var1.method3778(-794565518);
        this.field197 = new class228(var1.getInt());
        this.field195 = var1.getInt();
        var1.getUByte();
        this.field202 = var1.getUByte() == 1;
        this.field196 = var1.getUByte();
        int var4 = var1.getUByte();
        this.field193 = new LinkedList();

        for (int var5 = 0; var5 < var4; ++var5) {
            this.field193.add(this.method247(var1, -2104615271));
        }

        this.method289(1851803046);
    }

    public String method264(byte var1) {
        return this.field201;
    }

    public boolean method249(int var1, int var2, byte var3) {
        int var4 = var1 / 64;
        int var5 = var2 / 64;
        if (var4 >= this.field198 && var4 <= this.field199) {
            if (var5 >= this.field194 && var5 <= this.field203) {
                Iterator var6 = this.field193.iterator();

                class31 var7;
                do {
                    if (!var6.hasNext()) {
                        return false;
                    }

                    var7 = (class31) var6.next();
                } while (!var7.vmethod706(var1, var2, (byte) 79));

                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public int method253(byte var1) {
        return this.field200;
    }

    public int[] method250(int var1, int var2, int var3, int var4) {
        Iterator var5 = this.field193.iterator();

        class31 var6;
        do {
            if (!var5.hasNext()) {
                return null;
            }

            var6 = (class31) var5.next();
        } while (!var6.vmethod696(var1, var2, var3, (byte) -81));

        return var6.vmethod715(var1, var2, var3, -1381851995);
    }

    public int method280(byte var1) {
        return this.field198;
    }

    public int method251(byte var1) {
        return this.field194;
    }

    public boolean method248(int var1, int var2, int var3, int var4) {
        Iterator var5 = this.field193.iterator();

        class31 var6;
        do {
            if (!var5.hasNext()) {
                return false;
            }

            var6 = (class31) var5.next();
        } while (!var6.vmethod696(var1, var2, var3, (byte) -86));

        return true;
    }

    public class228 method279(int var1, int var2, int var3) {
        Iterator var4 = this.field193.iterator();

        class31 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }

            var5 = (class31) var4.next();
        } while (!var5.vmethod706(var1, var2, (byte) 100));

        return var5.vmethod695(var1, var2, (byte) -126);
    }

    public int method256(int var1) {
        return this.field197.field2634;
    }

    public int method303(int var1) {
        return this.field197.field2632;
    }

    public int method265(int var1) {
        return this.field197.field2633;
    }

    public int method258(byte var1) {
        return this.field196;
    }

    void method289(int var1) {
        Iterator var2 = this.field193.iterator();

        while (var2.hasNext()) {
            class31 var3 = (class31) var2.next();
            var3.vmethod697(this, (byte) -126);
        }

    }

    class31 method247(Buffer var1, int var2) {
        int var3 = var1.getUByte();
        class15 var4 = (class15) class43
            .method791(class15.method170((short) 8313), var3, 1443720514);
        Object var5 = null;
        switch (var4.field137) {
            case 0:
                var5 = new class14();
                break;
            case 1:
                var5 = new class27();
                break;
            case 2:
                var5 = new class37();
                break;
            case 3:
                var5 = new class18();
                break;
            default:
                throw new IllegalStateException("");
        }

        ((class31) var5).vmethod709(var1, -821481708);
        return (class31) var5;
    }

    public boolean method254(int var1) {
        return this.field202;
    }

    public int method260(int var1) {
        return this.field199;
    }

    public int method271(byte var1) {
        return this.field203;
    }

    int method257(int var1) {
        return this.field195;
    }

    public String method267(int var1) {
        return this.field192;
    }

    public class228 method266(byte var1) {
        return new class228(this.field197);
    }
}
