// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _FOCUS_EVENT_RECORD {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("bSetFocus")
    ).withName("_FOCUS_EVENT_RECORD");
    public static MemoryLayout $LAYOUT() {
        return _FOCUS_EVENT_RECORD.$struct$LAYOUT;
    }
    static final VarHandle bSetFocus$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bSetFocus"));
    public static VarHandle bSetFocus$VH() {
        return _FOCUS_EVENT_RECORD.bSetFocus$VH;
    }
    public static int bSetFocus$get(MemorySegment seg) {
        return (int)_FOCUS_EVENT_RECORD.bSetFocus$VH.get(seg);
    }
    public static void bSetFocus$set( MemorySegment seg, int x) {
        _FOCUS_EVENT_RECORD.bSetFocus$VH.set(seg, x);
    }
    public static int bSetFocus$get(MemorySegment seg, long index) {
        return (int)_FOCUS_EVENT_RECORD.bSetFocus$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bSetFocus$set(MemorySegment seg, long index, int x) {
        _FOCUS_EVENT_RECORD.bSetFocus$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


