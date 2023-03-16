// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class NTFS_FILE_RECORD_OUTPUT_BUFFER {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("u"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("QuadPart")
        ).withName("FileReferenceNumber"),
        Constants$root.C_LONG$LAYOUT.withName("FileRecordLength"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_CHAR$LAYOUT).withName("FileRecordBuffer"),
        MemoryLayout.paddingLayout(24)
    );
    public static MemoryLayout $LAYOUT() {
        return NTFS_FILE_RECORD_OUTPUT_BUFFER.$struct$LAYOUT;
    }
    public static MemorySegment FileReferenceNumber$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    static final VarHandle FileRecordLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("FileRecordLength"));
    public static VarHandle FileRecordLength$VH() {
        return NTFS_FILE_RECORD_OUTPUT_BUFFER.FileRecordLength$VH;
    }
    public static int FileRecordLength$get(MemorySegment seg) {
        return (int)NTFS_FILE_RECORD_OUTPUT_BUFFER.FileRecordLength$VH.get(seg);
    }
    public static void FileRecordLength$set( MemorySegment seg, int x) {
        NTFS_FILE_RECORD_OUTPUT_BUFFER.FileRecordLength$VH.set(seg, x);
    }
    public static int FileRecordLength$get(MemorySegment seg, long index) {
        return (int)NTFS_FILE_RECORD_OUTPUT_BUFFER.FileRecordLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FileRecordLength$set(MemorySegment seg, long index, int x) {
        NTFS_FILE_RECORD_OUTPUT_BUFFER.FileRecordLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment FileRecordBuffer$slice(MemorySegment seg) {
        return seg.asSlice(12, 1);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


