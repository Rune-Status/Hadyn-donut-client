package jagex.osrs;

import java.util.Iterator;

public class class212 implements Iterator {

    Node field2511;
    Node field2509;
    class199 field2508;
    int field2510;

    class212(class199 var1) {
        this.field2511 = null;
        this.field2508 = var1;
        this.method4326();
    }

    void method4326() {
        this.field2509 = this.field2508.field2472[0].nextNode;
        this.field2510 = 1;
        this.field2511 = null;
    }

    public boolean hasNext() {
        if (this.field2508.field2472[this.field2510 - 1] != this.field2509) {
            return true;
        } else {
            while (this.field2510 < this.field2508.field2470) {
                if (this.field2508.field2472[this.field2510++].nextNode
                    != this.field2508.field2472[this.field2510 - 1]) {
                    this.field2509 = this.field2508.field2472[this.field2510 - 1].nextNode;
                    return true;
                }

                this.field2509 = this.field2508.field2472[this.field2510 - 1];
            }

            return false;
        }
    }

    public Object next() {
        Node var1;
        if (this.field2508.field2472[this.field2510 - 1] != this.field2509) {
            var1 = this.field2509;
            this.field2509 = var1.nextNode;
            this.field2511 = var1;
            return var1;
        } else {
            do {
                if (this.field2510 >= this.field2508.field2470) {
                    return null;
                }

                var1 = this.field2508.field2472[this.field2510++].nextNode;
            } while (var1 == this.field2508.field2472[this.field2510 - 1]);

            this.field2509 = var1.nextNode;
            this.field2511 = var1;
            return var1;
        }
    }

    public void remove() {
        this.field2511.unlink();
        this.field2511 = null;
    }
}
