// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _FILE_IO_PRIORITY_HINT_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("PriorityHint")
    ).withName("_FILE_IO_PRIORITY_HINT_INFO");
    public static MemoryLayout $LAYOUT() {
        return _FILE_IO_PRIORITY_HINT_INFO.$struct$LAYOUT;
    }
    static final VarHandle PriorityHint$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PriorityHint"));
    public static VarHandle PriorityHint$VH() {
        return _FILE_IO_PRIORITY_HINT_INFO.PriorityHint$VH;
    }
    public static int PriorityHint$get(MemorySegment seg) {
        return (int)_FILE_IO_PRIORITY_HINT_INFO.PriorityHint$VH.get(seg);
    }
    public static void PriorityHint$set( MemorySegment seg, int x) {
        _FILE_IO_PRIORITY_HINT_INFO.PriorityHint$VH.set(seg, x);
    }
    public static int PriorityHint$get(MemorySegment seg, long index) {
        return (int)_FILE_IO_PRIORITY_HINT_INFO.PriorityHint$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PriorityHint$set(MemorySegment seg, long index, int x) {
        _FILE_IO_PRIORITY_HINT_INFO.PriorityHint$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


