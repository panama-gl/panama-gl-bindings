// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class FILE_ID_DESCRIPTOR {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwSize"),
        Constants$root.C_LONG$LAYOUT.withName("Type"),
        MemoryLayout.unionLayout(
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
            ).withName("FileId"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("Data1"),
                Constants$root.C_SHORT$LAYOUT.withName("Data2"),
                Constants$root.C_SHORT$LAYOUT.withName("Data3"),
                MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
            ).withName("ObjectId"),
            MemoryLayout.structLayout(
                MemoryLayout.sequenceLayout(16, Constants$root.C_CHAR$LAYOUT).withName("Identifier")
            ).withName("ExtendedFileId")
        ).withName("$anon$0")
    ).withName("FILE_ID_DESCRIPTOR");
    public static MemoryLayout $LAYOUT() {
        return FILE_ID_DESCRIPTOR.$struct$LAYOUT;
    }
    static final VarHandle dwSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwSize"));
    public static VarHandle dwSize$VH() {
        return FILE_ID_DESCRIPTOR.dwSize$VH;
    }
    public static int dwSize$get(MemorySegment seg) {
        return (int)FILE_ID_DESCRIPTOR.dwSize$VH.get(seg);
    }
    public static void dwSize$set( MemorySegment seg, int x) {
        FILE_ID_DESCRIPTOR.dwSize$VH.set(seg, x);
    }
    public static int dwSize$get(MemorySegment seg, long index) {
        return (int)FILE_ID_DESCRIPTOR.dwSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwSize$set(MemorySegment seg, long index, int x) {
        FILE_ID_DESCRIPTOR.dwSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Type"));
    public static VarHandle Type$VH() {
        return FILE_ID_DESCRIPTOR.Type$VH;
    }
    public static int Type$get(MemorySegment seg) {
        return (int)FILE_ID_DESCRIPTOR.Type$VH.get(seg);
    }
    public static void Type$set( MemorySegment seg, int x) {
        FILE_ID_DESCRIPTOR.Type$VH.set(seg, x);
    }
    public static int Type$get(MemorySegment seg, long index) {
        return (int)FILE_ID_DESCRIPTOR.Type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Type$set(MemorySegment seg, long index, int x) {
        FILE_ID_DESCRIPTOR.Type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment FileId$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    public static MemorySegment ObjectId$slice(MemorySegment seg) {
        return seg.asSlice(8, 16);
    }
    public static MemorySegment ExtendedFileId$slice(MemorySegment seg) {
        return seg.asSlice(8, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


