// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _MENU_EVENT_RECORD {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwCommandId")
    ).withName("_MENU_EVENT_RECORD");
    public static MemoryLayout $LAYOUT() {
        return _MENU_EVENT_RECORD.$struct$LAYOUT;
    }
    static final VarHandle dwCommandId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwCommandId"));
    public static VarHandle dwCommandId$VH() {
        return _MENU_EVENT_RECORD.dwCommandId$VH;
    }
    public static int dwCommandId$get(MemorySegment seg) {
        return (int)_MENU_EVENT_RECORD.dwCommandId$VH.get(seg);
    }
    public static void dwCommandId$set( MemorySegment seg, int x) {
        _MENU_EVENT_RECORD.dwCommandId$VH.set(seg, x);
    }
    public static int dwCommandId$get(MemorySegment seg, long index) {
        return (int)_MENU_EVENT_RECORD.dwCommandId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwCommandId$set(MemorySegment seg, long index, int x) {
        _MENU_EVENT_RECORD.dwCommandId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


