// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _EXIT_THREAD_DEBUG_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwExitCode")
    ).withName("_EXIT_THREAD_DEBUG_INFO");
    public static MemoryLayout $LAYOUT() {
        return _EXIT_THREAD_DEBUG_INFO.$struct$LAYOUT;
    }
    static final VarHandle dwExitCode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwExitCode"));
    public static VarHandle dwExitCode$VH() {
        return _EXIT_THREAD_DEBUG_INFO.dwExitCode$VH;
    }
    public static int dwExitCode$get(MemorySegment seg) {
        return (int)_EXIT_THREAD_DEBUG_INFO.dwExitCode$VH.get(seg);
    }
    public static void dwExitCode$set( MemorySegment seg, int x) {
        _EXIT_THREAD_DEBUG_INFO.dwExitCode$VH.set(seg, x);
    }
    public static int dwExitCode$get(MemorySegment seg, long index) {
        return (int)_EXIT_THREAD_DEBUG_INFO.dwExitCode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwExitCode$set(MemorySegment seg, long index, int x) {
        _EXIT_THREAD_DEBUG_INFO.dwExitCode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


