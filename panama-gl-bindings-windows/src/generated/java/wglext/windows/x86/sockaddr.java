// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class sockaddr {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("sa_family"),
        MemoryLayout.sequenceLayout(14, Constants$root.C_CHAR$LAYOUT).withName("sa_data")
    ).withName("sockaddr");
    public static MemoryLayout $LAYOUT() {
        return sockaddr.$struct$LAYOUT;
    }
    static final VarHandle sa_family$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("sa_family"));
    public static VarHandle sa_family$VH() {
        return sockaddr.sa_family$VH;
    }
    public static short sa_family$get(MemorySegment seg) {
        return (short)sockaddr.sa_family$VH.get(seg);
    }
    public static void sa_family$set( MemorySegment seg, short x) {
        sockaddr.sa_family$VH.set(seg, x);
    }
    public static short sa_family$get(MemorySegment seg, long index) {
        return (short)sockaddr.sa_family$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void sa_family$set(MemorySegment seg, long index, short x) {
        sockaddr.sa_family$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment sa_data$slice(MemorySegment seg) {
        return seg.asSlice(2, 14);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


