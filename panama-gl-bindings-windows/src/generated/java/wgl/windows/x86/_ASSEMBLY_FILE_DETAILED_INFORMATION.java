// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _ASSEMBLY_FILE_DETAILED_INFORMATION {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("ulFlags"),
        Constants$root.C_LONG$LAYOUT.withName("ulFilenameLength"),
        Constants$root.C_LONG$LAYOUT.withName("ulPathLength"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("lpFileName"),
        Constants$root.C_POINTER$LAYOUT.withName("lpFilePath")
    ).withName("_ASSEMBLY_FILE_DETAILED_INFORMATION");
    public static MemoryLayout $LAYOUT() {
        return _ASSEMBLY_FILE_DETAILED_INFORMATION.$struct$LAYOUT;
    }
    static final VarHandle ulFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ulFlags"));
    public static VarHandle ulFlags$VH() {
        return _ASSEMBLY_FILE_DETAILED_INFORMATION.ulFlags$VH;
    }
    public static int ulFlags$get(MemorySegment seg) {
        return (int)_ASSEMBLY_FILE_DETAILED_INFORMATION.ulFlags$VH.get(seg);
    }
    public static void ulFlags$set( MemorySegment seg, int x) {
        _ASSEMBLY_FILE_DETAILED_INFORMATION.ulFlags$VH.set(seg, x);
    }
    public static int ulFlags$get(MemorySegment seg, long index) {
        return (int)_ASSEMBLY_FILE_DETAILED_INFORMATION.ulFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ulFlags$set(MemorySegment seg, long index, int x) {
        _ASSEMBLY_FILE_DETAILED_INFORMATION.ulFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ulFilenameLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ulFilenameLength"));
    public static VarHandle ulFilenameLength$VH() {
        return _ASSEMBLY_FILE_DETAILED_INFORMATION.ulFilenameLength$VH;
    }
    public static int ulFilenameLength$get(MemorySegment seg) {
        return (int)_ASSEMBLY_FILE_DETAILED_INFORMATION.ulFilenameLength$VH.get(seg);
    }
    public static void ulFilenameLength$set( MemorySegment seg, int x) {
        _ASSEMBLY_FILE_DETAILED_INFORMATION.ulFilenameLength$VH.set(seg, x);
    }
    public static int ulFilenameLength$get(MemorySegment seg, long index) {
        return (int)_ASSEMBLY_FILE_DETAILED_INFORMATION.ulFilenameLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ulFilenameLength$set(MemorySegment seg, long index, int x) {
        _ASSEMBLY_FILE_DETAILED_INFORMATION.ulFilenameLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ulPathLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ulPathLength"));
    public static VarHandle ulPathLength$VH() {
        return _ASSEMBLY_FILE_DETAILED_INFORMATION.ulPathLength$VH;
    }
    public static int ulPathLength$get(MemorySegment seg) {
        return (int)_ASSEMBLY_FILE_DETAILED_INFORMATION.ulPathLength$VH.get(seg);
    }
    public static void ulPathLength$set( MemorySegment seg, int x) {
        _ASSEMBLY_FILE_DETAILED_INFORMATION.ulPathLength$VH.set(seg, x);
    }
    public static int ulPathLength$get(MemorySegment seg, long index) {
        return (int)_ASSEMBLY_FILE_DETAILED_INFORMATION.ulPathLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ulPathLength$set(MemorySegment seg, long index, int x) {
        _ASSEMBLY_FILE_DETAILED_INFORMATION.ulPathLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpFileName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpFileName"));
    public static VarHandle lpFileName$VH() {
        return _ASSEMBLY_FILE_DETAILED_INFORMATION.lpFileName$VH;
    }
    public static MemoryAddress lpFileName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_ASSEMBLY_FILE_DETAILED_INFORMATION.lpFileName$VH.get(seg);
    }
    public static void lpFileName$set( MemorySegment seg, MemoryAddress x) {
        _ASSEMBLY_FILE_DETAILED_INFORMATION.lpFileName$VH.set(seg, x);
    }
    public static MemoryAddress lpFileName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_ASSEMBLY_FILE_DETAILED_INFORMATION.lpFileName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpFileName$set(MemorySegment seg, long index, MemoryAddress x) {
        _ASSEMBLY_FILE_DETAILED_INFORMATION.lpFileName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpFilePath$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpFilePath"));
    public static VarHandle lpFilePath$VH() {
        return _ASSEMBLY_FILE_DETAILED_INFORMATION.lpFilePath$VH;
    }
    public static MemoryAddress lpFilePath$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_ASSEMBLY_FILE_DETAILED_INFORMATION.lpFilePath$VH.get(seg);
    }
    public static void lpFilePath$set( MemorySegment seg, MemoryAddress x) {
        _ASSEMBLY_FILE_DETAILED_INFORMATION.lpFilePath$VH.set(seg, x);
    }
    public static MemoryAddress lpFilePath$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_ASSEMBLY_FILE_DETAILED_INFORMATION.lpFilePath$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpFilePath$set(MemorySegment seg, long index, MemoryAddress x) {
        _ASSEMBLY_FILE_DETAILED_INFORMATION.lpFilePath$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


