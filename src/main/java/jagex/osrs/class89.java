package jagex.osrs;

import java.io.IOException;

public class class89 {

    public IssacRandom random;
    AbstractSocket field1291;
    IterableDeque field1279;
    PacketBuffer buffer;
    int field1290;
    Buffer field1281;
    InboundPacketDescriptor currentPacket;
    boolean readFirstByte;
    int packetLength;
    InboundPacketDescriptor secondPacket;
    InboundPacketDescriptor thirdPacket;
    int field1287;
    int field1288;
    InboundPacketDescriptor lastPacket;

    class89() {
        this.field1279 = new IterableDeque();
        this.field1290 = 0;
        this.field1281 = new Buffer(5000);
        this.buffer = new PacketBuffer(40000);
        this.currentPacket = null;
        this.packetLength = 0;
        this.readFirstByte = true;
        this.field1287 = 0;
        this.field1288 = 0;
    }

    public static void method2200(byte var0) {
        ItemConfig.field3507.method4199();
        ItemConfig.field3508.method4199();
        ItemConfig.field3546.method4199();
    }

    static int method2210(int var0, class86 var1, boolean var2, byte var3) {
        class232 var4;
        if (var0 == 2700) {
            var4 = class18.method213(ScriptExecutor.field1070[--class60.field600], -1437668443);
            ScriptExecutor.field1070[++class60.field600 - 1] = var4.field2793;
            return 1;
        } else if (var0 == 2701) {
            var4 = class18.method213(ScriptExecutor.field1070[--class60.field600], -1652307533);
            if (var4.field2793 != -1) {
                ScriptExecutor.field1070[++class60.field600 - 1] = var4.field2794;
            } else {
                ScriptExecutor.field1070[++class60.field600 - 1] = 0;
            }

            return 1;
        } else if (var0 == 2702) {
            int var6 = ScriptExecutor.field1070[--class60.field600];
            class56 var5 = (class56) client.field804.method4224((long) var6);
            if (var5 != null) {
                ScriptExecutor.field1070[++class60.field600 - 1] = 1;
            } else {
                ScriptExecutor.field1070[++class60.field600 - 1] = 0;
            }

            return 1;
        } else if (var0 == 2706) {
            ScriptExecutor.field1070[++class60.field600 - 1] = client.field803;
            return 1;
        } else {
            return 2;
        }
    }

    AbstractSocket getSocket() {
        return this.field1291;
    }

    void method2190(byte var1) {
        if (this.field1291 != null) {
            this.field1291.vmethod3558(-1174910556);
            this.field1291 = null;
        }

    }

    void method2191(byte var1) {
        this.field1291 = null;
    }

    final void method2194() {
        this.field1279.clear();
        this.field1290 = 0;
    }

    public final void method2193(OutboundPacket var1, int var2) {
        this.field1279.method4269(var1);
        var1.field2333 = var1.buffer.offset;
        var1.buffer.offset = 0;
        this.field1290 += var1.field2333;
    }

    final void method2187(int var1) throws IOException {
        if (this.field1291 != null && this.field1290 > 0) {
            this.field1281.offset = 0;

            while (true) {
                OutboundPacket var2 = (OutboundPacket) this.field1279.method4250();
                if (var2 == null || var2.field2333
                    > this.field1281.bytes.length - this.field1281.offset) {
                    this.field1291
                        .vmethod3578(this.field1281.bytes, 0, this.field1281.offset,
                                     -6135039);
                    this.field1288 = 0;
                    break;
                }

                this.field1281.writeBytes(var2.buffer.bytes, 0, var2.field2333);
                this.field1290 -= var2.field2333;
                var2.unlink();
                var2.buffer.method3752((byte) -33);
                var2.method3668((short) 3911);
            }
        }

    }

    void method2189(AbstractSocket var1, int var2) {
        this.field1291 = var1;
    }
}
