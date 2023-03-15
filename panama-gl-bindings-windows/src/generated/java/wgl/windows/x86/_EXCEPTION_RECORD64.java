// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _EXCEPTION_RECORD64 {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("ExceptionCode"),
        Constants$root.C_LONG$LAYOUT.withName("ExceptionFlags"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("ExceptionRecord"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("ExceptionAddress"),
        Constants$root.C_LONG$LAYOUT.withName("NumberParameters"),
        Constants$root.C_LONG$LAYOUT.withName("__unusedAlignment"),
        MemoryLayout.sequenceLayout(15, Constants$root.C_LONG_LONG$LAYOUT).withName("ExceptionInformation")
    ).withName("_EXCEPTION_RECORD64");
    public static MemoryLayout $LAYOUT() {
        return _EXCEPTION_RECORD64.$struct$LAYOUT;
    }
    static final VarHandle ExceptionCode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ExceptionCode"));
    public static VarHandle ExceptionCode$VH() {
        return _EXCEPTION_RECORD64.ExceptionCode$VH;
    }
    public static int ExceptionCode$get(MemorySegment seg) {
        return (int)_EXCEPTION_RECORD64.ExceptionCode$VH.get(seg);
    }
    public static void ExceptionCode$set( MemorySegment seg, int x) {
        _EXCEPTION_RECORD64.ExceptionCode$VH.set(seg, x);
    }
    public static int ExceptionCode$get(MemorySegment seg, long index) {
        return (int)_EXCEPTION_RECORD64.ExceptionCode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ExceptionCode$set(MemorySegment seg, long index, int x) {
        _EXCEPTION_RECORD64.ExceptionCode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ExceptionFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ExceptionFlags"));
    public static VarHandle ExceptionFlags$VH() {
        return _EXCEPTION_RECORD64.ExceptionFlags$VH;
    }
    public static int ExceptionFlags$get(MemorySegment seg) {
        return (int)_EXCEPTION_RECORD64.ExceptionFlags$VH.get(seg);
    }
    public static void ExceptionFlags$set( MemorySegment seg, int x) {
        _EXCEPTION_RECORD64.ExceptionFlags$VH.set(seg, x);
    }
    public static int ExceptionFlags$get(MemorySegment seg, long index) {
        return (int)_EXCEPTION_RECORD64.ExceptionFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ExceptionFlags$set(MemorySegment seg, long index, int x) {
        _EXCEPTION_RECORD64.ExceptionFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ExceptionRecord$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ExceptionRecord"));
    public static VarHandle ExceptionRecord$VH() {
        return _EXCEPTION_RECORD64.ExceptionRecord$VH;
    }
    public static long ExceptionRecord$get(MemorySegment seg) {
        return (long)_EXCEPTION_RECORD64.ExceptionRecord$VH.get(seg);
    }
    public static void ExceptionRecord$set( MemorySegment seg, long x) {
        _EXCEPTION_RECORD64.ExceptionRecord$VH.set(seg, x);
    }
    public static long ExceptionRecord$get(MemorySegment seg, long index) {
        return (long)_EXCEPTION_RECORD64.ExceptionRecord$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ExceptionRecord$set(MemorySegment seg, long index, long x) {
        _EXCEPTION_RECORD64.ExceptionRecord$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ExceptionAddress$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ExceptionAddress"));
    public static VarHandle ExceptionAddress$VH() {
        return _EXCEPTION_RECORD64.ExceptionAddress$VH;
    }
    public static long ExceptionAddress$get(MemorySegment seg) {
        return (long)_EXCEPTION_RECORD64.ExceptionAddress$VH.get(seg);
    }
    public static void ExceptionAddress$set( MemorySegment seg, long x) {
        _EXCEPTION_RECORD64.ExceptionAddress$VH.set(seg, x);
    }
    public static long ExceptionAddress$get(MemorySegment seg, long index) {
        return (long)_EXCEPTION_RECORD64.ExceptionAddress$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ExceptionAddress$set(MemorySegment seg, long index, long x) {
        _EXCEPTION_RECORD64.ExceptionAddress$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumberParameters$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberParameters"));
    public static VarHandle NumberParameters$VH() {
        return _EXCEPTION_RECORD64.NumberParameters$VH;
    }
    public static int NumberParameters$get(MemorySegment seg) {
        return (int)_EXCEPTION_RECORD64.NumberParameters$VH.get(seg);
    }
    public static void NumberParameters$set( MemorySegment seg, int x) {
        _EXCEPTION_RECORD64.NumberParameters$VH.set(seg, x);
    }
    public static int NumberParameters$get(MemorySegment seg, long index) {
        return (int)_EXCEPTION_RECORD64.NumberParameters$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberParameters$set(MemorySegment seg, long index, int x) {
        _EXCEPTION_RECORD64.NumberParameters$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle __unusedAlignment$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__unusedAlignment"));
    public static VarHandle __unusedAlignment$VH() {
        return _EXCEPTION_RECORD64.__unusedAlignment$VH;
    }
    public static int __unusedAlignment$get(MemorySegment seg) {
        return (int)_EXCEPTION_RECORD64.__unusedAlignment$VH.get(seg);
    }
    public static void __unusedAlignment$set( MemorySegment seg, int x) {
        _EXCEPTION_RECORD64.__unusedAlignment$VH.set(seg, x);
    }
    public static int __unusedAlignment$get(MemorySegment seg, long index) {
        return (int)_EXCEPTION_RECORD64.__unusedAlignment$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __unusedAlignment$set(MemorySegment seg, long index, int x) {
        _EXCEPTION_RECORD64.__unusedAlignment$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ExceptionInformation$slice(MemorySegment seg) {
        return seg.asSlice(32, 120);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


