// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _cpinfo {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("MaxCharSize"),
        MemoryLayout.sequenceLayout(2, Constants$root.C_CHAR$LAYOUT).withName("DefaultChar"),
        MemoryLayout.sequenceLayout(12, Constants$root.C_CHAR$LAYOUT).withName("LeadByte"),
        MemoryLayout.paddingLayout(16)
    ).withName("_cpinfo");
    public static MemoryLayout $LAYOUT() {
        return _cpinfo.$struct$LAYOUT;
    }
    static final VarHandle MaxCharSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MaxCharSize"));
    public static VarHandle MaxCharSize$VH() {
        return _cpinfo.MaxCharSize$VH;
    }
    public static int MaxCharSize$get(MemorySegment seg) {
        return (int)_cpinfo.MaxCharSize$VH.get(seg);
    }
    public static void MaxCharSize$set( MemorySegment seg, int x) {
        _cpinfo.MaxCharSize$VH.set(seg, x);
    }
    public static int MaxCharSize$get(MemorySegment seg, long index) {
        return (int)_cpinfo.MaxCharSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MaxCharSize$set(MemorySegment seg, long index, int x) {
        _cpinfo.MaxCharSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment DefaultChar$slice(MemorySegment seg) {
        return seg.asSlice(4, 2);
    }
    public static MemorySegment LeadByte$slice(MemorySegment seg) {
        return seg.asSlice(6, 12);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


