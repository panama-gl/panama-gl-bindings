// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _IMAGE_RESOURCE_DIRECTORY_STRING {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("Length"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_CHAR$LAYOUT).withName("NameString"),
        MemoryLayout.paddingLayout(8)
    ).withName("_IMAGE_RESOURCE_DIRECTORY_STRING");
    public static MemoryLayout $LAYOUT() {
        return _IMAGE_RESOURCE_DIRECTORY_STRING.$struct$LAYOUT;
    }
    static final VarHandle Length$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Length"));
    public static VarHandle Length$VH() {
        return _IMAGE_RESOURCE_DIRECTORY_STRING.Length$VH;
    }
    public static short Length$get(MemorySegment seg) {
        return (short)_IMAGE_RESOURCE_DIRECTORY_STRING.Length$VH.get(seg);
    }
    public static void Length$set( MemorySegment seg, short x) {
        _IMAGE_RESOURCE_DIRECTORY_STRING.Length$VH.set(seg, x);
    }
    public static short Length$get(MemorySegment seg, long index) {
        return (short)_IMAGE_RESOURCE_DIRECTORY_STRING.Length$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Length$set(MemorySegment seg, long index, short x) {
        _IMAGE_RESOURCE_DIRECTORY_STRING.Length$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment NameString$slice(MemorySegment seg) {
        return seg.asSlice(2, 1);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


