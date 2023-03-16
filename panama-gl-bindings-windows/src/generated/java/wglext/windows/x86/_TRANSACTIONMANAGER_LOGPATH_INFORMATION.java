// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _TRANSACTIONMANAGER_LOGPATH_INFORMATION {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("LogPathLength"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_SHORT$LAYOUT).withName("LogPath"),
        MemoryLayout.paddingLayout(16)
    ).withName("_TRANSACTIONMANAGER_LOGPATH_INFORMATION");
    public static MemoryLayout $LAYOUT() {
        return _TRANSACTIONMANAGER_LOGPATH_INFORMATION.$struct$LAYOUT;
    }
    static final VarHandle LogPathLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LogPathLength"));
    public static VarHandle LogPathLength$VH() {
        return _TRANSACTIONMANAGER_LOGPATH_INFORMATION.LogPathLength$VH;
    }
    public static int LogPathLength$get(MemorySegment seg) {
        return (int)_TRANSACTIONMANAGER_LOGPATH_INFORMATION.LogPathLength$VH.get(seg);
    }
    public static void LogPathLength$set( MemorySegment seg, int x) {
        _TRANSACTIONMANAGER_LOGPATH_INFORMATION.LogPathLength$VH.set(seg, x);
    }
    public static int LogPathLength$get(MemorySegment seg, long index) {
        return (int)_TRANSACTIONMANAGER_LOGPATH_INFORMATION.LogPathLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LogPathLength$set(MemorySegment seg, long index, int x) {
        _TRANSACTIONMANAGER_LOGPATH_INFORMATION.LogPathLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment LogPath$slice(MemorySegment seg) {
        return seg.asSlice(4, 2);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


