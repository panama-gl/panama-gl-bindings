// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GENERIC_MAPPING {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("GenericRead"),
        Constants$root.C_LONG$LAYOUT.withName("GenericWrite"),
        Constants$root.C_LONG$LAYOUT.withName("GenericExecute"),
        Constants$root.C_LONG$LAYOUT.withName("GenericAll")
    ).withName("_GENERIC_MAPPING");
    public static MemoryLayout $LAYOUT() {
        return _GENERIC_MAPPING.$struct$LAYOUT;
    }
    static final VarHandle GenericRead$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GenericRead"));
    public static VarHandle GenericRead$VH() {
        return _GENERIC_MAPPING.GenericRead$VH;
    }
    public static int GenericRead$get(MemorySegment seg) {
        return (int)_GENERIC_MAPPING.GenericRead$VH.get(seg);
    }
    public static void GenericRead$set( MemorySegment seg, int x) {
        _GENERIC_MAPPING.GenericRead$VH.set(seg, x);
    }
    public static int GenericRead$get(MemorySegment seg, long index) {
        return (int)_GENERIC_MAPPING.GenericRead$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GenericRead$set(MemorySegment seg, long index, int x) {
        _GENERIC_MAPPING.GenericRead$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle GenericWrite$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GenericWrite"));
    public static VarHandle GenericWrite$VH() {
        return _GENERIC_MAPPING.GenericWrite$VH;
    }
    public static int GenericWrite$get(MemorySegment seg) {
        return (int)_GENERIC_MAPPING.GenericWrite$VH.get(seg);
    }
    public static void GenericWrite$set( MemorySegment seg, int x) {
        _GENERIC_MAPPING.GenericWrite$VH.set(seg, x);
    }
    public static int GenericWrite$get(MemorySegment seg, long index) {
        return (int)_GENERIC_MAPPING.GenericWrite$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GenericWrite$set(MemorySegment seg, long index, int x) {
        _GENERIC_MAPPING.GenericWrite$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle GenericExecute$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GenericExecute"));
    public static VarHandle GenericExecute$VH() {
        return _GENERIC_MAPPING.GenericExecute$VH;
    }
    public static int GenericExecute$get(MemorySegment seg) {
        return (int)_GENERIC_MAPPING.GenericExecute$VH.get(seg);
    }
    public static void GenericExecute$set( MemorySegment seg, int x) {
        _GENERIC_MAPPING.GenericExecute$VH.set(seg, x);
    }
    public static int GenericExecute$get(MemorySegment seg, long index) {
        return (int)_GENERIC_MAPPING.GenericExecute$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GenericExecute$set(MemorySegment seg, long index, int x) {
        _GENERIC_MAPPING.GenericExecute$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle GenericAll$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GenericAll"));
    public static VarHandle GenericAll$VH() {
        return _GENERIC_MAPPING.GenericAll$VH;
    }
    public static int GenericAll$get(MemorySegment seg) {
        return (int)_GENERIC_MAPPING.GenericAll$VH.get(seg);
    }
    public static void GenericAll$set( MemorySegment seg, int x) {
        _GENERIC_MAPPING.GenericAll$VH.set(seg, x);
    }
    public static int GenericAll$get(MemorySegment seg, long index) {
        return (int)_GENERIC_MAPPING.GenericAll$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GenericAll$set(MemorySegment seg, long index, int x) {
        _GENERIC_MAPPING.GenericAll$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


