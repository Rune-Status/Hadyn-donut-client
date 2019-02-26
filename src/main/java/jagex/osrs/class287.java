package jagex.osrs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public abstract class class287 {

    final int field3704;
    HashMap field3701;
    class284[] field3700;
    int field3699;
    Comparator field3698;
    HashMap field3702;

    class287(int var1) {
        this.field3699 = 0;
        this.field3698 = null;
        this.field3704 = var1;
        this.field3700 = this.vmethod5760(var1, -1957564969);
        this.field3701 = new HashMap(var1 / 8);
        this.field3702 = new HashMap(var1 / 8);
    }

    public class284 method5589(class293 var1, int var2) {
        class284 var3 = this.method5590(var1, -266772152);
        return var3 != null ? var3 : this.method5629(var1, (byte) -1);
    }

    class284 method5594(class293 var1, class293 var2, byte var3) {
        if (this.method5590(var1, -266772152) != null) {
            throw new IllegalStateException();
        } else {
            class284 var4 = this.vmethod5744(-1755896640);
            var4.method5545(var1, var2, (byte) 0);
            this.method5660(var4, 1684099917);
            this.method5588(var4, (byte) -110);
            return var4;
        }
    }

    final int method5598(class284 var1, byte var2) {
        for (int var3 = 0; var3 < this.field3699; ++var3) {
            if (this.field3700[var3] == var1) {
                return var3;
            }
        }

        return -1;
    }

    final void method5599(class284 var1, int var2) {
        if (this.field3701.remove(var1.field3692) == null) {
            throw new IllegalStateException();
        } else {
            if (var1.field3693 != null) {
                this.field3702.remove(var1.field3693);
            }

        }
    }

    class284 method5590(class293 var1, int var2) {
        return !var1.method5707(862724253) ? null : (class284) this.field3701.get(var1);
    }

    public int method5586(byte var1) {
        return this.field3699;
    }

    public boolean method5587(byte var1) {
        return this.field3704 == this.field3699;
    }

    public final void method5601(short var1) {
        if (this.field3698 == null) {
            Arrays.sort(this.field3700, 0, this.field3699);
        } else {
            Arrays.sort(this.field3700, 0, this.field3699, this.field3698);
        }

    }

    public boolean method5608(class293 var1, byte var2) {
        return !var1.method5707(1276637347) ? false
            : (this.field3701.containsKey(var1) ? true : this.field3702.containsKey(var1));
    }

    class284 method5629(class293 var1, byte var2) {
        return !var1.method5707(1958133288) ? null : (class284) this.field3702.get(var1);
    }

    abstract class284 vmethod5744(int var1);

    public void method5585(int var1) {
        this.field3699 = 0;
        Arrays.fill(this.field3700, (Object) null);
        this.field3701.clear();
        this.field3702.clear();
    }

    final void method5602(int var1, int var2) {
        --this.field3699;
        if (var1 < this.field3699) {
            System.arraycopy(this.field3700, var1 + 1, this.field3700, var1, this.field3699 - var1);
        }

    }

    final void method5641(class284 var1, int var2) {
        int var3 = this.method5598(var1, (byte) -24);
        if (var3 != -1) {
            this.method5602(var3, -55098367);
            this.method5599(var1, 289313210);
        }
    }

    public final class284 method5595(int var1, int var2) {
        if (var1 >= 0 && var1 < this.field3699) {
            return this.field3700[var1];
        } else {
            throw new ArrayIndexOutOfBoundsException(var1);
        }
    }

    final void method5588(class284 var1, byte var2) {
        this.field3701.put(var1.field3692, var1);
        if (var1.field3693 != null) {
            class284 var3 = (class284) this.field3702.put(var1.field3693, var1);
            if (var3 != null && var3 != var1) {
                var3.field3693 = null;
            }
        }

    }

    abstract class284[] vmethod5760(int var1, int var2);

    public final boolean method5592(class293 var1, short var2) {
        class284 var3 = this.method5590(var1, -266772152);
        if (var3 == null) {
            return false;
        } else {
            this.method5641(var3, -458036019);
            return true;
        }
    }

    final void method5660(class284 var1, int var2) {
        this.field3700[++this.field3699 - 1] = var1;
    }

    class284 method5663(class293 var1, int var2) {
        return this.method5594(var1, (class293) null, (byte) -29);
    }

    final void method5591(class284 var1, class293 var2, class293 var3, int var4) {
        this.method5599(var1, -169351794);
        var1.method5545(var2, var3, (byte) 0);
        this.method5588(var1, (byte) 1);
    }

    public final void method5605(byte var1) {
        this.field3698 = null;
    }

    public final void method5606(Comparator var1, int var2) {
        if (this.field3698 == null) {
            this.field3698 = var1;
        } else if (this.field3698 instanceof class285) {
            ((class285) this.field3698).method5562(var1, 1461286313);
        }

    }
}
