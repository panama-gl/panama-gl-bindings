// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _FILE_ID_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("VolumeSerialNumber"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(16, Constants$root.C_CHAR$LAYOUT).withName("Identifier")
        ).withName("FileId")
    ).withName("_FILE_ID_INFO");
    public static MemoryLayout $LAYOUT() {
        return _FILE_ID_INFO.$struct$LAYOUT;
    }
    static final VarHandle VolumeSerialNumber$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("VolumeSerialNumber"));
    public static VarHandle VolumeSerialNumber$VH() {
        return _FILE_ID_INFO.VolumeSerialNumber$VH;
    }
    public static long VolumeSerialNumber$get(MemorySegment seg) {
        return (long)_FILE_ID_INFO.VolumeSerialNumber$VH.get(seg);
    }
    public static void VolumeSerialNumber$set( MemorySegment seg, long x) {
        _FILE_ID_INFO.VolumeSerialNumber$VH.set(seg, x);
    }
    public static long VolumeSerialNumber$get(MemorySegment seg, long index) {
        return (long)_FILE_ID_INFO.VolumeSerialNumber$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void VolumeSerialNumber$set(MemorySegment seg, long index, long x) {
        _FILE_ID_INFO.VolumeSerialNumber$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment FileId$slice(MemorySegment seg) {
        return seg.asSlice(8, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


