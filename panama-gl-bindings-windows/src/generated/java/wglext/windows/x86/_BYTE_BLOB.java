// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _BYTE_BLOB {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("clSize"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_CHAR$LAYOUT).withName("abData"),
        MemoryLayout.paddingLayout(24)
    ).withName("_BYTE_BLOB");
    public static MemoryLayout $LAYOUT() {
        return _BYTE_BLOB.$struct$LAYOUT;
    }
    static final VarHandle clSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("clSize"));
    public static VarHandle clSize$VH() {
        return _BYTE_BLOB.clSize$VH;
    }
    public static int clSize$get(MemorySegment seg) {
        return (int)_BYTE_BLOB.clSize$VH.get(seg);
    }
    public static void clSize$set( MemorySegment seg, int x) {
        _BYTE_BLOB.clSize$VH.set(seg, x);
    }
    public static int clSize$get(MemorySegment seg, long index) {
        return (int)_BYTE_BLOB.clSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void clSize$set(MemorySegment seg, long index, int x) {
        _BYTE_BLOB.clSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment abData$slice(MemorySegment seg) {
        return seg.asSlice(4, 1);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


