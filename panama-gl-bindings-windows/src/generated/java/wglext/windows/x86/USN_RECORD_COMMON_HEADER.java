// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class USN_RECORD_COMMON_HEADER {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("RecordLength"),
        Constants$root.C_SHORT$LAYOUT.withName("MajorVersion"),
        Constants$root.C_SHORT$LAYOUT.withName("MinorVersion")
    );
    public static MemoryLayout $LAYOUT() {
        return USN_RECORD_COMMON_HEADER.$struct$LAYOUT;
    }
    static final VarHandle RecordLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("RecordLength"));
    public static VarHandle RecordLength$VH() {
        return USN_RECORD_COMMON_HEADER.RecordLength$VH;
    }
    public static int RecordLength$get(MemorySegment seg) {
        return (int)USN_RECORD_COMMON_HEADER.RecordLength$VH.get(seg);
    }
    public static void RecordLength$set( MemorySegment seg, int x) {
        USN_RECORD_COMMON_HEADER.RecordLength$VH.set(seg, x);
    }
    public static int RecordLength$get(MemorySegment seg, long index) {
        return (int)USN_RECORD_COMMON_HEADER.RecordLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RecordLength$set(MemorySegment seg, long index, int x) {
        USN_RECORD_COMMON_HEADER.RecordLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MajorVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MajorVersion"));
    public static VarHandle MajorVersion$VH() {
        return USN_RECORD_COMMON_HEADER.MajorVersion$VH;
    }
    public static short MajorVersion$get(MemorySegment seg) {
        return (short)USN_RECORD_COMMON_HEADER.MajorVersion$VH.get(seg);
    }
    public static void MajorVersion$set( MemorySegment seg, short x) {
        USN_RECORD_COMMON_HEADER.MajorVersion$VH.set(seg, x);
    }
    public static short MajorVersion$get(MemorySegment seg, long index) {
        return (short)USN_RECORD_COMMON_HEADER.MajorVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MajorVersion$set(MemorySegment seg, long index, short x) {
        USN_RECORD_COMMON_HEADER.MajorVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MinorVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MinorVersion"));
    public static VarHandle MinorVersion$VH() {
        return USN_RECORD_COMMON_HEADER.MinorVersion$VH;
    }
    public static short MinorVersion$get(MemorySegment seg) {
        return (short)USN_RECORD_COMMON_HEADER.MinorVersion$VH.get(seg);
    }
    public static void MinorVersion$set( MemorySegment seg, short x) {
        USN_RECORD_COMMON_HEADER.MinorVersion$VH.set(seg, x);
    }
    public static short MinorVersion$get(MemorySegment seg, long index) {
        return (short)USN_RECORD_COMMON_HEADER.MinorVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MinorVersion$set(MemorySegment seg, long index, short x) {
        USN_RECORD_COMMON_HEADER.MinorVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

