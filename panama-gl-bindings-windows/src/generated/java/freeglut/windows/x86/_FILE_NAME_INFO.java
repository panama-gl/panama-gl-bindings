// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _FILE_NAME_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("FileNameLength"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_SHORT$LAYOUT).withName("FileName"),
        MemoryLayout.paddingLayout(16)
    ).withName("_FILE_NAME_INFO");
    public static MemoryLayout $LAYOUT() {
        return _FILE_NAME_INFO.$struct$LAYOUT;
    }
    static final VarHandle FileNameLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("FileNameLength"));
    public static VarHandle FileNameLength$VH() {
        return _FILE_NAME_INFO.FileNameLength$VH;
    }
    public static int FileNameLength$get(MemorySegment seg) {
        return (int)_FILE_NAME_INFO.FileNameLength$VH.get(seg);
    }
    public static void FileNameLength$set( MemorySegment seg, int x) {
        _FILE_NAME_INFO.FileNameLength$VH.set(seg, x);
    }
    public static int FileNameLength$get(MemorySegment seg, long index) {
        return (int)_FILE_NAME_INFO.FileNameLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FileNameLength$set(MemorySegment seg, long index, int x) {
        _FILE_NAME_INFO.FileNameLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment FileName$slice(MemorySegment seg) {
        return seg.asSlice(4, 2);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

