// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _MESSAGE_RESOURCE_DATA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("NumberOfBlocks"),
        MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("LowId"),
            Constants$root.C_LONG$LAYOUT.withName("HighId"),
            Constants$root.C_LONG$LAYOUT.withName("OffsetToEntries")
        ).withName("_MESSAGE_RESOURCE_BLOCK")).withName("Blocks")
    ).withName("_MESSAGE_RESOURCE_DATA");
    public static MemoryLayout $LAYOUT() {
        return _MESSAGE_RESOURCE_DATA.$struct$LAYOUT;
    }
    static final VarHandle NumberOfBlocks$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberOfBlocks"));
    public static VarHandle NumberOfBlocks$VH() {
        return _MESSAGE_RESOURCE_DATA.NumberOfBlocks$VH;
    }
    public static int NumberOfBlocks$get(MemorySegment seg) {
        return (int)_MESSAGE_RESOURCE_DATA.NumberOfBlocks$VH.get(seg);
    }
    public static void NumberOfBlocks$set( MemorySegment seg, int x) {
        _MESSAGE_RESOURCE_DATA.NumberOfBlocks$VH.set(seg, x);
    }
    public static int NumberOfBlocks$get(MemorySegment seg, long index) {
        return (int)_MESSAGE_RESOURCE_DATA.NumberOfBlocks$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfBlocks$set(MemorySegment seg, long index, int x) {
        _MESSAGE_RESOURCE_DATA.NumberOfBlocks$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Blocks$slice(MemorySegment seg) {
        return seg.asSlice(4, 12);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


