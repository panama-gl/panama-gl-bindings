// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CRYPT_SMART_CARD_ROOT_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(16, Constants$root.C_CHAR$LAYOUT).withName("rgbCardID"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("LowPart"),
            Constants$root.C_LONG$LAYOUT.withName("HighPart")
        ).withName("luid")
    ).withName("_CRYPT_SMART_CARD_ROOT_INFO");
    public static MemoryLayout $LAYOUT() {
        return _CRYPT_SMART_CARD_ROOT_INFO.$struct$LAYOUT;
    }
    public static MemorySegment rgbCardID$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    public static MemorySegment luid$slice(MemorySegment seg) {
        return seg.asSlice(16, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


