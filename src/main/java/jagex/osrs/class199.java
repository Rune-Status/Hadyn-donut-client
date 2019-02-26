package jagex.osrs;

import java.util.Iterator;

public final class class199 implements Iterable {

    int field2470;
    int field2474;
    Node[] field2472;
    Node field2473;
    Node field2471;

    public class199(int var1) {
        this.field2474 = 0;
        this.field2470 = var1;
        this.field2472 = new Node[var1];

        for (int var2 = 0; var2 < var1; ++var2) {
            Node var3 = this.field2472[var2] = new Node();
            var3.nextNode = var3;
            var3.prevNode = var3;
        }

    }

    public Node method4185(long var1) {
        Node var3 = this.field2472[(int) (var1 & (long) (this.field2470 - 1))];

        for (this.field2471 = var3.nextNode; var3 != this.field2471;
             this.field2471 = this.field2471.nextNode) {
            if (this.field2471.key == var1) {
                Node var4 = this.field2471;
                this.field2471 = this.field2471.nextNode;
                return var4;
            }
        }

        this.field2471 = null;
        return null;
    }

    public Node method4173() {
        Node var1;
        if (this.field2474 > 0 && this.field2472[this.field2474 - 1] != this.field2473) {
            var1 = this.field2473;
            this.field2473 = var1.nextNode;
            return var1;
        } else {
            do {
                if (this.field2474 >= this.field2470) {
                    return null;
                }

                var1 = this.field2472[this.field2474++].nextNode;
            } while (var1 == this.field2472[this.field2474 - 1]);

            this.field2473 = var1.nextNode;
            return var1;
        }
    }

    public void method4178() {
        for (int var1 = 0; var1 < this.field2470; ++var1) {
            Node var2 = this.field2472[var1];

            while (true) {
                Node var3 = var2.nextNode;
                if (var3 == var2) {
                    break;
                }

                var3.unlink();
            }
        }

        this.field2471 = null;
        this.field2473 = null;
    }

    public Iterator iterator() {
        return new class212(this);
    }

    public void method4170(Node var1, long var2) {
        if (var1.prevNode != null) {
            var1.unlink();
        }

        Node var4 = this.field2472[(int) (var2 & (long) (this.field2470 - 1))];
        var1.prevNode = var4.prevNode;
        var1.nextNode = var4;
        var1.prevNode.nextNode = var1;
        var1.nextNode.prevNode = var1;
        var1.key = var2;
    }

    public Node method4172() {
        this.field2474 = 0;
        return this.method4173();
    }
}
