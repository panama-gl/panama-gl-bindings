// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class PRINT_EXECUTION_DATA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("context"),
        Constants$root.C_LONG$LAYOUT.withName("clientAppPID")
    );
    public static MemoryLayout $LAYOUT() {
        return PRINT_EXECUTION_DATA.$struct$LAYOUT;
    }
    static final VarHandle context$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("context"));
    public static VarHandle context$VH() {
        return PRINT_EXECUTION_DATA.context$VH;
    }
    public static int context$get(MemorySegment seg) {
        return (int)PRINT_EXECUTION_DATA.context$VH.get(seg);
    }
    public static void context$set( MemorySegment seg, int x) {
        PRINT_EXECUTION_DATA.context$VH.set(seg, x);
    }
    public static int context$get(MemorySegment seg, long index) {
        return (int)PRINT_EXECUTION_DATA.context$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void context$set(MemorySegment seg, long index, int x) {
        PRINT_EXECUTION_DATA.context$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle clientAppPID$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("clientAppPID"));
    public static VarHandle clientAppPID$VH() {
        return PRINT_EXECUTION_DATA.clientAppPID$VH;
    }
    public static int clientAppPID$get(MemorySegment seg) {
        return (int)PRINT_EXECUTION_DATA.clientAppPID$VH.get(seg);
    }
    public static void clientAppPID$set( MemorySegment seg, int x) {
        PRINT_EXECUTION_DATA.clientAppPID$VH.set(seg, x);
    }
    public static int clientAppPID$get(MemorySegment seg, long index) {
        return (int)PRINT_EXECUTION_DATA.clientAppPID$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void clientAppPID$set(MemorySegment seg, long index, int x) {
        PRINT_EXECUTION_DATA.clientAppPID$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


