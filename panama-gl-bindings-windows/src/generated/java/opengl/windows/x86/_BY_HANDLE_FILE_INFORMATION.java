// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _BY_HANDLE_FILE_INFORMATION {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwFileAttributes"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("dwLowDateTime"),
            Constants$root.C_LONG$LAYOUT.withName("dwHighDateTime")
        ).withName("ftCreationTime"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("dwLowDateTime"),
            Constants$root.C_LONG$LAYOUT.withName("dwHighDateTime")
        ).withName("ftLastAccessTime"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("dwLowDateTime"),
            Constants$root.C_LONG$LAYOUT.withName("dwHighDateTime")
        ).withName("ftLastWriteTime"),
        Constants$root.C_LONG$LAYOUT.withName("dwVolumeSerialNumber"),
        Constants$root.C_LONG$LAYOUT.withName("nFileSizeHigh"),
        Constants$root.C_LONG$LAYOUT.withName("nFileSizeLow"),
        Constants$root.C_LONG$LAYOUT.withName("nNumberOfLinks"),
        Constants$root.C_LONG$LAYOUT.withName("nFileIndexHigh"),
        Constants$root.C_LONG$LAYOUT.withName("nFileIndexLow")
    ).withName("_BY_HANDLE_FILE_INFORMATION");
    public static MemoryLayout $LAYOUT() {
        return _BY_HANDLE_FILE_INFORMATION.$struct$LAYOUT;
    }
    static final VarHandle dwFileAttributes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFileAttributes"));
    public static VarHandle dwFileAttributes$VH() {
        return _BY_HANDLE_FILE_INFORMATION.dwFileAttributes$VH;
    }
    public static int dwFileAttributes$get(MemorySegment seg) {
        return (int)_BY_HANDLE_FILE_INFORMATION.dwFileAttributes$VH.get(seg);
    }
    public static void dwFileAttributes$set( MemorySegment seg, int x) {
        _BY_HANDLE_FILE_INFORMATION.dwFileAttributes$VH.set(seg, x);
    }
    public static int dwFileAttributes$get(MemorySegment seg, long index) {
        return (int)_BY_HANDLE_FILE_INFORMATION.dwFileAttributes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFileAttributes$set(MemorySegment seg, long index, int x) {
        _BY_HANDLE_FILE_INFORMATION.dwFileAttributes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ftCreationTime$slice(MemorySegment seg) {
        return seg.asSlice(4, 8);
    }
    public static MemorySegment ftLastAccessTime$slice(MemorySegment seg) {
        return seg.asSlice(12, 8);
    }
    public static MemorySegment ftLastWriteTime$slice(MemorySegment seg) {
        return seg.asSlice(20, 8);
    }
    static final VarHandle dwVolumeSerialNumber$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwVolumeSerialNumber"));
    public static VarHandle dwVolumeSerialNumber$VH() {
        return _BY_HANDLE_FILE_INFORMATION.dwVolumeSerialNumber$VH;
    }
    public static int dwVolumeSerialNumber$get(MemorySegment seg) {
        return (int)_BY_HANDLE_FILE_INFORMATION.dwVolumeSerialNumber$VH.get(seg);
    }
    public static void dwVolumeSerialNumber$set( MemorySegment seg, int x) {
        _BY_HANDLE_FILE_INFORMATION.dwVolumeSerialNumber$VH.set(seg, x);
    }
    public static int dwVolumeSerialNumber$get(MemorySegment seg, long index) {
        return (int)_BY_HANDLE_FILE_INFORMATION.dwVolumeSerialNumber$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwVolumeSerialNumber$set(MemorySegment seg, long index, int x) {
        _BY_HANDLE_FILE_INFORMATION.dwVolumeSerialNumber$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nFileSizeHigh$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nFileSizeHigh"));
    public static VarHandle nFileSizeHigh$VH() {
        return _BY_HANDLE_FILE_INFORMATION.nFileSizeHigh$VH;
    }
    public static int nFileSizeHigh$get(MemorySegment seg) {
        return (int)_BY_HANDLE_FILE_INFORMATION.nFileSizeHigh$VH.get(seg);
    }
    public static void nFileSizeHigh$set( MemorySegment seg, int x) {
        _BY_HANDLE_FILE_INFORMATION.nFileSizeHigh$VH.set(seg, x);
    }
    public static int nFileSizeHigh$get(MemorySegment seg, long index) {
        return (int)_BY_HANDLE_FILE_INFORMATION.nFileSizeHigh$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nFileSizeHigh$set(MemorySegment seg, long index, int x) {
        _BY_HANDLE_FILE_INFORMATION.nFileSizeHigh$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nFileSizeLow$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nFileSizeLow"));
    public static VarHandle nFileSizeLow$VH() {
        return _BY_HANDLE_FILE_INFORMATION.nFileSizeLow$VH;
    }
    public static int nFileSizeLow$get(MemorySegment seg) {
        return (int)_BY_HANDLE_FILE_INFORMATION.nFileSizeLow$VH.get(seg);
    }
    public static void nFileSizeLow$set( MemorySegment seg, int x) {
        _BY_HANDLE_FILE_INFORMATION.nFileSizeLow$VH.set(seg, x);
    }
    public static int nFileSizeLow$get(MemorySegment seg, long index) {
        return (int)_BY_HANDLE_FILE_INFORMATION.nFileSizeLow$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nFileSizeLow$set(MemorySegment seg, long index, int x) {
        _BY_HANDLE_FILE_INFORMATION.nFileSizeLow$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nNumberOfLinks$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nNumberOfLinks"));
    public static VarHandle nNumberOfLinks$VH() {
        return _BY_HANDLE_FILE_INFORMATION.nNumberOfLinks$VH;
    }
    public static int nNumberOfLinks$get(MemorySegment seg) {
        return (int)_BY_HANDLE_FILE_INFORMATION.nNumberOfLinks$VH.get(seg);
    }
    public static void nNumberOfLinks$set( MemorySegment seg, int x) {
        _BY_HANDLE_FILE_INFORMATION.nNumberOfLinks$VH.set(seg, x);
    }
    public static int nNumberOfLinks$get(MemorySegment seg, long index) {
        return (int)_BY_HANDLE_FILE_INFORMATION.nNumberOfLinks$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nNumberOfLinks$set(MemorySegment seg, long index, int x) {
        _BY_HANDLE_FILE_INFORMATION.nNumberOfLinks$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nFileIndexHigh$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nFileIndexHigh"));
    public static VarHandle nFileIndexHigh$VH() {
        return _BY_HANDLE_FILE_INFORMATION.nFileIndexHigh$VH;
    }
    public static int nFileIndexHigh$get(MemorySegment seg) {
        return (int)_BY_HANDLE_FILE_INFORMATION.nFileIndexHigh$VH.get(seg);
    }
    public static void nFileIndexHigh$set( MemorySegment seg, int x) {
        _BY_HANDLE_FILE_INFORMATION.nFileIndexHigh$VH.set(seg, x);
    }
    public static int nFileIndexHigh$get(MemorySegment seg, long index) {
        return (int)_BY_HANDLE_FILE_INFORMATION.nFileIndexHigh$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nFileIndexHigh$set(MemorySegment seg, long index, int x) {
        _BY_HANDLE_FILE_INFORMATION.nFileIndexHigh$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nFileIndexLow$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nFileIndexLow"));
    public static VarHandle nFileIndexLow$VH() {
        return _BY_HANDLE_FILE_INFORMATION.nFileIndexLow$VH;
    }
    public static int nFileIndexLow$get(MemorySegment seg) {
        return (int)_BY_HANDLE_FILE_INFORMATION.nFileIndexLow$VH.get(seg);
    }
    public static void nFileIndexLow$set( MemorySegment seg, int x) {
        _BY_HANDLE_FILE_INFORMATION.nFileIndexLow$VH.set(seg, x);
    }
    public static int nFileIndexLow$get(MemorySegment seg, long index) {
        return (int)_BY_HANDLE_FILE_INFORMATION.nFileIndexLow$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nFileIndexLow$set(MemorySegment seg, long index, int x) {
        _BY_HANDLE_FILE_INFORMATION.nFileIndexLow$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


