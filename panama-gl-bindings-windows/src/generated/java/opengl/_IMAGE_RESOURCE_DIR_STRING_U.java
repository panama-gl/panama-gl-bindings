// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _IMAGE_RESOURCE_DIR_STRING_U {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("Length"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_SHORT$LAYOUT).withName("NameString")
    ).withName("_IMAGE_RESOURCE_DIR_STRING_U");
    public static MemoryLayout $LAYOUT() {
        return _IMAGE_RESOURCE_DIR_STRING_U.$struct$LAYOUT;
    }
    static final VarHandle Length$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Length"));
    public static VarHandle Length$VH() {
        return _IMAGE_RESOURCE_DIR_STRING_U.Length$VH;
    }
    public static short Length$get(MemorySegment seg) {
        return (short)_IMAGE_RESOURCE_DIR_STRING_U.Length$VH.get(seg);
    }
    public static void Length$set( MemorySegment seg, short x) {
        _IMAGE_RESOURCE_DIR_STRING_U.Length$VH.set(seg, x);
    }
    public static short Length$get(MemorySegment seg, long index) {
        return (short)_IMAGE_RESOURCE_DIR_STRING_U.Length$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Length$set(MemorySegment seg, long index, short x) {
        _IMAGE_RESOURCE_DIR_STRING_U.Length$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment NameString$slice(MemorySegment seg) {
        return seg.asSlice(2, 2);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


