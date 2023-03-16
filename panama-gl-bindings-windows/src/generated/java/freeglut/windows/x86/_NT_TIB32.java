// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _NT_TIB32 {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("ExceptionList"),
        Constants$root.C_LONG$LAYOUT.withName("StackBase"),
        Constants$root.C_LONG$LAYOUT.withName("StackLimit"),
        Constants$root.C_LONG$LAYOUT.withName("SubSystemTib"),
        MemoryLayout.unionLayout(
            Constants$root.C_LONG$LAYOUT.withName("FiberData"),
            Constants$root.C_LONG$LAYOUT.withName("Version")
        ).withName("$anon$0"),
        Constants$root.C_LONG$LAYOUT.withName("ArbitraryUserPointer"),
        Constants$root.C_LONG$LAYOUT.withName("Self")
    ).withName("_NT_TIB32");
    public static MemoryLayout $LAYOUT() {
        return _NT_TIB32.$struct$LAYOUT;
    }
    static final VarHandle ExceptionList$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ExceptionList"));
    public static VarHandle ExceptionList$VH() {
        return _NT_TIB32.ExceptionList$VH;
    }
    public static int ExceptionList$get(MemorySegment seg) {
        return (int)_NT_TIB32.ExceptionList$VH.get(seg);
    }
    public static void ExceptionList$set( MemorySegment seg, int x) {
        _NT_TIB32.ExceptionList$VH.set(seg, x);
    }
    public static int ExceptionList$get(MemorySegment seg, long index) {
        return (int)_NT_TIB32.ExceptionList$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ExceptionList$set(MemorySegment seg, long index, int x) {
        _NT_TIB32.ExceptionList$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle StackBase$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("StackBase"));
    public static VarHandle StackBase$VH() {
        return _NT_TIB32.StackBase$VH;
    }
    public static int StackBase$get(MemorySegment seg) {
        return (int)_NT_TIB32.StackBase$VH.get(seg);
    }
    public static void StackBase$set( MemorySegment seg, int x) {
        _NT_TIB32.StackBase$VH.set(seg, x);
    }
    public static int StackBase$get(MemorySegment seg, long index) {
        return (int)_NT_TIB32.StackBase$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void StackBase$set(MemorySegment seg, long index, int x) {
        _NT_TIB32.StackBase$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle StackLimit$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("StackLimit"));
    public static VarHandle StackLimit$VH() {
        return _NT_TIB32.StackLimit$VH;
    }
    public static int StackLimit$get(MemorySegment seg) {
        return (int)_NT_TIB32.StackLimit$VH.get(seg);
    }
    public static void StackLimit$set( MemorySegment seg, int x) {
        _NT_TIB32.StackLimit$VH.set(seg, x);
    }
    public static int StackLimit$get(MemorySegment seg, long index) {
        return (int)_NT_TIB32.StackLimit$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void StackLimit$set(MemorySegment seg, long index, int x) {
        _NT_TIB32.StackLimit$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SubSystemTib$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SubSystemTib"));
    public static VarHandle SubSystemTib$VH() {
        return _NT_TIB32.SubSystemTib$VH;
    }
    public static int SubSystemTib$get(MemorySegment seg) {
        return (int)_NT_TIB32.SubSystemTib$VH.get(seg);
    }
    public static void SubSystemTib$set( MemorySegment seg, int x) {
        _NT_TIB32.SubSystemTib$VH.set(seg, x);
    }
    public static int SubSystemTib$get(MemorySegment seg, long index) {
        return (int)_NT_TIB32.SubSystemTib$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SubSystemTib$set(MemorySegment seg, long index, int x) {
        _NT_TIB32.SubSystemTib$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle FiberData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("FiberData"));
    public static VarHandle FiberData$VH() {
        return _NT_TIB32.FiberData$VH;
    }
    public static int FiberData$get(MemorySegment seg) {
        return (int)_NT_TIB32.FiberData$VH.get(seg);
    }
    public static void FiberData$set( MemorySegment seg, int x) {
        _NT_TIB32.FiberData$VH.set(seg, x);
    }
    public static int FiberData$get(MemorySegment seg, long index) {
        return (int)_NT_TIB32.FiberData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FiberData$set(MemorySegment seg, long index, int x) {
        _NT_TIB32.FiberData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _NT_TIB32.Version$VH;
    }
    public static int Version$get(MemorySegment seg) {
        return (int)_NT_TIB32.Version$VH.get(seg);
    }
    public static void Version$set( MemorySegment seg, int x) {
        _NT_TIB32.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_NT_TIB32.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _NT_TIB32.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ArbitraryUserPointer$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ArbitraryUserPointer"));
    public static VarHandle ArbitraryUserPointer$VH() {
        return _NT_TIB32.ArbitraryUserPointer$VH;
    }
    public static int ArbitraryUserPointer$get(MemorySegment seg) {
        return (int)_NT_TIB32.ArbitraryUserPointer$VH.get(seg);
    }
    public static void ArbitraryUserPointer$set( MemorySegment seg, int x) {
        _NT_TIB32.ArbitraryUserPointer$VH.set(seg, x);
    }
    public static int ArbitraryUserPointer$get(MemorySegment seg, long index) {
        return (int)_NT_TIB32.ArbitraryUserPointer$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ArbitraryUserPointer$set(MemorySegment seg, long index, int x) {
        _NT_TIB32.ArbitraryUserPointer$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Self$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Self"));
    public static VarHandle Self$VH() {
        return _NT_TIB32.Self$VH;
    }
    public static int Self$get(MemorySegment seg) {
        return (int)_NT_TIB32.Self$VH.get(seg);
    }
    public static void Self$set( MemorySegment seg, int x) {
        _NT_TIB32.Self$VH.set(seg, x);
    }
    public static int Self$get(MemorySegment seg, long index) {
        return (int)_NT_TIB32.Self$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Self$set(MemorySegment seg, long index, int x) {
        _NT_TIB32.Self$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


