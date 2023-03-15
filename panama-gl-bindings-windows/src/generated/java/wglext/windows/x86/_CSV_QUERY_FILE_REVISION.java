// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CSV_QUERY_FILE_REVISION {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("FileId"),
        MemoryLayout.sequenceLayout(3, Constants$root.C_LONG_LONG$LAYOUT).withName("FileRevision")
    ).withName("_CSV_QUERY_FILE_REVISION");
    public static MemoryLayout $LAYOUT() {
        return _CSV_QUERY_FILE_REVISION.$struct$LAYOUT;
    }
    static final VarHandle FileId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("FileId"));
    public static VarHandle FileId$VH() {
        return _CSV_QUERY_FILE_REVISION.FileId$VH;
    }
    public static long FileId$get(MemorySegment seg) {
        return (long)_CSV_QUERY_FILE_REVISION.FileId$VH.get(seg);
    }
    public static void FileId$set( MemorySegment seg, long x) {
        _CSV_QUERY_FILE_REVISION.FileId$VH.set(seg, x);
    }
    public static long FileId$get(MemorySegment seg, long index) {
        return (long)_CSV_QUERY_FILE_REVISION.FileId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FileId$set(MemorySegment seg, long index, long x) {
        _CSV_QUERY_FILE_REVISION.FileId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment FileRevision$slice(MemorySegment seg) {
        return seg.asSlice(8, 24);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


