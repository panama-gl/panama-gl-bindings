// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _DISPATCHER_CONTEXT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("ControlPc"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("ImageBase"),
        Constants$root.C_POINTER$LAYOUT.withName("FunctionEntry"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("EstablisherFrame"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("TargetIp"),
        Constants$root.C_POINTER$LAYOUT.withName("ContextRecord"),
        Constants$root.C_POINTER$LAYOUT.withName("LanguageHandler"),
        Constants$root.C_POINTER$LAYOUT.withName("HandlerData"),
        Constants$root.C_POINTER$LAYOUT.withName("HistoryTable"),
        Constants$root.C_LONG$LAYOUT.withName("ScopeIndex"),
        Constants$root.C_LONG$LAYOUT.withName("Fill0")
    ).withName("_DISPATCHER_CONTEXT");
    public static MemoryLayout $LAYOUT() {
        return _DISPATCHER_CONTEXT.$struct$LAYOUT;
    }
    static final VarHandle ControlPc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ControlPc"));
    public static VarHandle ControlPc$VH() {
        return _DISPATCHER_CONTEXT.ControlPc$VH;
    }
    public static long ControlPc$get(MemorySegment seg) {
        return (long)_DISPATCHER_CONTEXT.ControlPc$VH.get(seg);
    }
    public static void ControlPc$set( MemorySegment seg, long x) {
        _DISPATCHER_CONTEXT.ControlPc$VH.set(seg, x);
    }
    public static long ControlPc$get(MemorySegment seg, long index) {
        return (long)_DISPATCHER_CONTEXT.ControlPc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ControlPc$set(MemorySegment seg, long index, long x) {
        _DISPATCHER_CONTEXT.ControlPc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ImageBase$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ImageBase"));
    public static VarHandle ImageBase$VH() {
        return _DISPATCHER_CONTEXT.ImageBase$VH;
    }
    public static long ImageBase$get(MemorySegment seg) {
        return (long)_DISPATCHER_CONTEXT.ImageBase$VH.get(seg);
    }
    public static void ImageBase$set( MemorySegment seg, long x) {
        _DISPATCHER_CONTEXT.ImageBase$VH.set(seg, x);
    }
    public static long ImageBase$get(MemorySegment seg, long index) {
        return (long)_DISPATCHER_CONTEXT.ImageBase$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ImageBase$set(MemorySegment seg, long index, long x) {
        _DISPATCHER_CONTEXT.ImageBase$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle FunctionEntry$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("FunctionEntry"));
    public static VarHandle FunctionEntry$VH() {
        return _DISPATCHER_CONTEXT.FunctionEntry$VH;
    }
    public static MemoryAddress FunctionEntry$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_DISPATCHER_CONTEXT.FunctionEntry$VH.get(seg);
    }
    public static void FunctionEntry$set( MemorySegment seg, MemoryAddress x) {
        _DISPATCHER_CONTEXT.FunctionEntry$VH.set(seg, x);
    }
    public static MemoryAddress FunctionEntry$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_DISPATCHER_CONTEXT.FunctionEntry$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FunctionEntry$set(MemorySegment seg, long index, MemoryAddress x) {
        _DISPATCHER_CONTEXT.FunctionEntry$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle EstablisherFrame$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("EstablisherFrame"));
    public static VarHandle EstablisherFrame$VH() {
        return _DISPATCHER_CONTEXT.EstablisherFrame$VH;
    }
    public static long EstablisherFrame$get(MemorySegment seg) {
        return (long)_DISPATCHER_CONTEXT.EstablisherFrame$VH.get(seg);
    }
    public static void EstablisherFrame$set( MemorySegment seg, long x) {
        _DISPATCHER_CONTEXT.EstablisherFrame$VH.set(seg, x);
    }
    public static long EstablisherFrame$get(MemorySegment seg, long index) {
        return (long)_DISPATCHER_CONTEXT.EstablisherFrame$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void EstablisherFrame$set(MemorySegment seg, long index, long x) {
        _DISPATCHER_CONTEXT.EstablisherFrame$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TargetIp$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TargetIp"));
    public static VarHandle TargetIp$VH() {
        return _DISPATCHER_CONTEXT.TargetIp$VH;
    }
    public static long TargetIp$get(MemorySegment seg) {
        return (long)_DISPATCHER_CONTEXT.TargetIp$VH.get(seg);
    }
    public static void TargetIp$set( MemorySegment seg, long x) {
        _DISPATCHER_CONTEXT.TargetIp$VH.set(seg, x);
    }
    public static long TargetIp$get(MemorySegment seg, long index) {
        return (long)_DISPATCHER_CONTEXT.TargetIp$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TargetIp$set(MemorySegment seg, long index, long x) {
        _DISPATCHER_CONTEXT.TargetIp$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ContextRecord$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ContextRecord"));
    public static VarHandle ContextRecord$VH() {
        return _DISPATCHER_CONTEXT.ContextRecord$VH;
    }
    public static MemoryAddress ContextRecord$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_DISPATCHER_CONTEXT.ContextRecord$VH.get(seg);
    }
    public static void ContextRecord$set( MemorySegment seg, MemoryAddress x) {
        _DISPATCHER_CONTEXT.ContextRecord$VH.set(seg, x);
    }
    public static MemoryAddress ContextRecord$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_DISPATCHER_CONTEXT.ContextRecord$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ContextRecord$set(MemorySegment seg, long index, MemoryAddress x) {
        _DISPATCHER_CONTEXT.ContextRecord$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle LanguageHandler$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LanguageHandler"));
    public static VarHandle LanguageHandler$VH() {
        return _DISPATCHER_CONTEXT.LanguageHandler$VH;
    }
    public static MemoryAddress LanguageHandler$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_DISPATCHER_CONTEXT.LanguageHandler$VH.get(seg);
    }
    public static void LanguageHandler$set( MemorySegment seg, MemoryAddress x) {
        _DISPATCHER_CONTEXT.LanguageHandler$VH.set(seg, x);
    }
    public static MemoryAddress LanguageHandler$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_DISPATCHER_CONTEXT.LanguageHandler$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LanguageHandler$set(MemorySegment seg, long index, MemoryAddress x) {
        _DISPATCHER_CONTEXT.LanguageHandler$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static PEXCEPTION_ROUTINE LanguageHandler (MemorySegment segment, MemorySession session) {
        return PEXCEPTION_ROUTINE.ofAddress(LanguageHandler$get(segment), session);
    }
    static final VarHandle HandlerData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("HandlerData"));
    public static VarHandle HandlerData$VH() {
        return _DISPATCHER_CONTEXT.HandlerData$VH;
    }
    public static MemoryAddress HandlerData$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_DISPATCHER_CONTEXT.HandlerData$VH.get(seg);
    }
    public static void HandlerData$set( MemorySegment seg, MemoryAddress x) {
        _DISPATCHER_CONTEXT.HandlerData$VH.set(seg, x);
    }
    public static MemoryAddress HandlerData$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_DISPATCHER_CONTEXT.HandlerData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void HandlerData$set(MemorySegment seg, long index, MemoryAddress x) {
        _DISPATCHER_CONTEXT.HandlerData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle HistoryTable$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("HistoryTable"));
    public static VarHandle HistoryTable$VH() {
        return _DISPATCHER_CONTEXT.HistoryTable$VH;
    }
    public static MemoryAddress HistoryTable$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_DISPATCHER_CONTEXT.HistoryTable$VH.get(seg);
    }
    public static void HistoryTable$set( MemorySegment seg, MemoryAddress x) {
        _DISPATCHER_CONTEXT.HistoryTable$VH.set(seg, x);
    }
    public static MemoryAddress HistoryTable$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_DISPATCHER_CONTEXT.HistoryTable$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void HistoryTable$set(MemorySegment seg, long index, MemoryAddress x) {
        _DISPATCHER_CONTEXT.HistoryTable$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ScopeIndex$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ScopeIndex"));
    public static VarHandle ScopeIndex$VH() {
        return _DISPATCHER_CONTEXT.ScopeIndex$VH;
    }
    public static int ScopeIndex$get(MemorySegment seg) {
        return (int)_DISPATCHER_CONTEXT.ScopeIndex$VH.get(seg);
    }
    public static void ScopeIndex$set( MemorySegment seg, int x) {
        _DISPATCHER_CONTEXT.ScopeIndex$VH.set(seg, x);
    }
    public static int ScopeIndex$get(MemorySegment seg, long index) {
        return (int)_DISPATCHER_CONTEXT.ScopeIndex$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ScopeIndex$set(MemorySegment seg, long index, int x) {
        _DISPATCHER_CONTEXT.ScopeIndex$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Fill0$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Fill0"));
    public static VarHandle Fill0$VH() {
        return _DISPATCHER_CONTEXT.Fill0$VH;
    }
    public static int Fill0$get(MemorySegment seg) {
        return (int)_DISPATCHER_CONTEXT.Fill0$VH.get(seg);
    }
    public static void Fill0$set( MemorySegment seg, int x) {
        _DISPATCHER_CONTEXT.Fill0$VH.set(seg, x);
    }
    public static int Fill0$get(MemorySegment seg, long index) {
        return (int)_DISPATCHER_CONTEXT.Fill0$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Fill0$set(MemorySegment seg, long index, int x) {
        _DISPATCHER_CONTEXT.Fill0$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


