// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _FILE_REGION_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("FileOffset"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("Length"),
        Constants$root.C_LONG$LAYOUT.withName("Usage"),
        Constants$root.C_LONG$LAYOUT.withName("Reserved")
    ).withName("_FILE_REGION_INFO");
    public static MemoryLayout $LAYOUT() {
        return _FILE_REGION_INFO.$struct$LAYOUT;
    }
    static final VarHandle FileOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("FileOffset"));
    public static VarHandle FileOffset$VH() {
        return _FILE_REGION_INFO.FileOffset$VH;
    }
    public static long FileOffset$get(MemorySegment seg) {
        return (long)_FILE_REGION_INFO.FileOffset$VH.get(seg);
    }
    public static void FileOffset$set( MemorySegment seg, long x) {
        _FILE_REGION_INFO.FileOffset$VH.set(seg, x);
    }
    public static long FileOffset$get(MemorySegment seg, long index) {
        return (long)_FILE_REGION_INFO.FileOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FileOffset$set(MemorySegment seg, long index, long x) {
        _FILE_REGION_INFO.FileOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Length$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Length"));
    public static VarHandle Length$VH() {
        return _FILE_REGION_INFO.Length$VH;
    }
    public static long Length$get(MemorySegment seg) {
        return (long)_FILE_REGION_INFO.Length$VH.get(seg);
    }
    public static void Length$set( MemorySegment seg, long x) {
        _FILE_REGION_INFO.Length$VH.set(seg, x);
    }
    public static long Length$get(MemorySegment seg, long index) {
        return (long)_FILE_REGION_INFO.Length$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Length$set(MemorySegment seg, long index, long x) {
        _FILE_REGION_INFO.Length$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Usage$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Usage"));
    public static VarHandle Usage$VH() {
        return _FILE_REGION_INFO.Usage$VH;
    }
    public static int Usage$get(MemorySegment seg) {
        return (int)_FILE_REGION_INFO.Usage$VH.get(seg);
    }
    public static void Usage$set( MemorySegment seg, int x) {
        _FILE_REGION_INFO.Usage$VH.set(seg, x);
    }
    public static int Usage$get(MemorySegment seg, long index) {
        return (int)_FILE_REGION_INFO.Usage$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Usage$set(MemorySegment seg, long index, int x) {
        _FILE_REGION_INFO.Usage$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Reserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reserved"));
    public static VarHandle Reserved$VH() {
        return _FILE_REGION_INFO.Reserved$VH;
    }
    public static int Reserved$get(MemorySegment seg) {
        return (int)_FILE_REGION_INFO.Reserved$VH.get(seg);
    }
    public static void Reserved$set( MemorySegment seg, int x) {
        _FILE_REGION_INFO.Reserved$VH.set(seg, x);
    }
    public static int Reserved$get(MemorySegment seg, long index) {
        return (int)_FILE_REGION_INFO.Reserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved$set(MemorySegment seg, long index, int x) {
        _FILE_REGION_INFO.Reserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


