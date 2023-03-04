// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _PROCESS_DYNAMIC_EH_CONTINUATION_TARGETS_INFORMATION {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("NumberOfTargets"),
        Constants$root.C_SHORT$LAYOUT.withName("Reserved"),
        Constants$root.C_LONG$LAYOUT.withName("Reserved2"),
        Constants$root.C_POINTER$LAYOUT.withName("Targets")
    ).withName("_PROCESS_DYNAMIC_EH_CONTINUATION_TARGETS_INFORMATION");
    public static MemoryLayout $LAYOUT() {
        return _PROCESS_DYNAMIC_EH_CONTINUATION_TARGETS_INFORMATION.$struct$LAYOUT;
    }
    static final VarHandle NumberOfTargets$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberOfTargets"));
    public static VarHandle NumberOfTargets$VH() {
        return _PROCESS_DYNAMIC_EH_CONTINUATION_TARGETS_INFORMATION.NumberOfTargets$VH;
    }
    public static short NumberOfTargets$get(MemorySegment seg) {
        return (short)_PROCESS_DYNAMIC_EH_CONTINUATION_TARGETS_INFORMATION.NumberOfTargets$VH.get(seg);
    }
    public static void NumberOfTargets$set( MemorySegment seg, short x) {
        _PROCESS_DYNAMIC_EH_CONTINUATION_TARGETS_INFORMATION.NumberOfTargets$VH.set(seg, x);
    }
    public static short NumberOfTargets$get(MemorySegment seg, long index) {
        return (short)_PROCESS_DYNAMIC_EH_CONTINUATION_TARGETS_INFORMATION.NumberOfTargets$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfTargets$set(MemorySegment seg, long index, short x) {
        _PROCESS_DYNAMIC_EH_CONTINUATION_TARGETS_INFORMATION.NumberOfTargets$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Reserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reserved"));
    public static VarHandle Reserved$VH() {
        return _PROCESS_DYNAMIC_EH_CONTINUATION_TARGETS_INFORMATION.Reserved$VH;
    }
    public static short Reserved$get(MemorySegment seg) {
        return (short)_PROCESS_DYNAMIC_EH_CONTINUATION_TARGETS_INFORMATION.Reserved$VH.get(seg);
    }
    public static void Reserved$set( MemorySegment seg, short x) {
        _PROCESS_DYNAMIC_EH_CONTINUATION_TARGETS_INFORMATION.Reserved$VH.set(seg, x);
    }
    public static short Reserved$get(MemorySegment seg, long index) {
        return (short)_PROCESS_DYNAMIC_EH_CONTINUATION_TARGETS_INFORMATION.Reserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved$set(MemorySegment seg, long index, short x) {
        _PROCESS_DYNAMIC_EH_CONTINUATION_TARGETS_INFORMATION.Reserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Reserved2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reserved2"));
    public static VarHandle Reserved2$VH() {
        return _PROCESS_DYNAMIC_EH_CONTINUATION_TARGETS_INFORMATION.Reserved2$VH;
    }
    public static int Reserved2$get(MemorySegment seg) {
        return (int)_PROCESS_DYNAMIC_EH_CONTINUATION_TARGETS_INFORMATION.Reserved2$VH.get(seg);
    }
    public static void Reserved2$set( MemorySegment seg, int x) {
        _PROCESS_DYNAMIC_EH_CONTINUATION_TARGETS_INFORMATION.Reserved2$VH.set(seg, x);
    }
    public static int Reserved2$get(MemorySegment seg, long index) {
        return (int)_PROCESS_DYNAMIC_EH_CONTINUATION_TARGETS_INFORMATION.Reserved2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved2$set(MemorySegment seg, long index, int x) {
        _PROCESS_DYNAMIC_EH_CONTINUATION_TARGETS_INFORMATION.Reserved2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Targets$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Targets"));
    public static VarHandle Targets$VH() {
        return _PROCESS_DYNAMIC_EH_CONTINUATION_TARGETS_INFORMATION.Targets$VH;
    }
    public static MemoryAddress Targets$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_PROCESS_DYNAMIC_EH_CONTINUATION_TARGETS_INFORMATION.Targets$VH.get(seg);
    }
    public static void Targets$set( MemorySegment seg, MemoryAddress x) {
        _PROCESS_DYNAMIC_EH_CONTINUATION_TARGETS_INFORMATION.Targets$VH.set(seg, x);
    }
    public static MemoryAddress Targets$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_PROCESS_DYNAMIC_EH_CONTINUATION_TARGETS_INFORMATION.Targets$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Targets$set(MemorySegment seg, long index, MemoryAddress x) {
        _PROCESS_DYNAMIC_EH_CONTINUATION_TARGETS_INFORMATION.Targets$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


