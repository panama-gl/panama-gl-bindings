// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class DDEPOKE {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.paddingLayout(13).withName("unused"),
            MemoryLayout.paddingLayout(1).withName("fRelease"),
            MemoryLayout.paddingLayout(2).withName("fReserved")
        ),
        Constants$root.C_SHORT$LAYOUT.withName("cfFormat"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_CHAR$LAYOUT).withName("Value"),
        MemoryLayout.paddingLayout(8)
    );
    public static MemoryLayout $LAYOUT() {
        return DDEPOKE.$struct$LAYOUT;
    }
    static final VarHandle cfFormat$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cfFormat"));
    public static VarHandle cfFormat$VH() {
        return DDEPOKE.cfFormat$VH;
    }
    public static short cfFormat$get(MemorySegment seg) {
        return (short)DDEPOKE.cfFormat$VH.get(seg);
    }
    public static void cfFormat$set( MemorySegment seg, short x) {
        DDEPOKE.cfFormat$VH.set(seg, x);
    }
    public static short cfFormat$get(MemorySegment seg, long index) {
        return (short)DDEPOKE.cfFormat$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cfFormat$set(MemorySegment seg, long index, short x) {
        DDEPOKE.cfFormat$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Value$slice(MemorySegment seg) {
        return seg.asSlice(4, 1);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


