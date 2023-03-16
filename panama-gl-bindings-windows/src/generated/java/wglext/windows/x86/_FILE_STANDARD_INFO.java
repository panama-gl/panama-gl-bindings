// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _FILE_STANDARD_INFO {

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
        ).withName("AllocationSize"),
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
        ).withName("EndOfFile"),
        Constants$root.C_LONG$LAYOUT.withName("NumberOfLinks"),
        Constants$root.C_CHAR$LAYOUT.withName("DeletePending"),
        Constants$root.C_CHAR$LAYOUT.withName("Directory"),
        MemoryLayout.paddingLayout(16)
    ).withName("_FILE_STANDARD_INFO");
    public static MemoryLayout $LAYOUT() {
        return _FILE_STANDARD_INFO.$struct$LAYOUT;
    }
    public static MemorySegment AllocationSize$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static MemorySegment EndOfFile$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    static final VarHandle NumberOfLinks$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberOfLinks"));
    public static VarHandle NumberOfLinks$VH() {
        return _FILE_STANDARD_INFO.NumberOfLinks$VH;
    }
    public static int NumberOfLinks$get(MemorySegment seg) {
        return (int)_FILE_STANDARD_INFO.NumberOfLinks$VH.get(seg);
    }
    public static void NumberOfLinks$set( MemorySegment seg, int x) {
        _FILE_STANDARD_INFO.NumberOfLinks$VH.set(seg, x);
    }
    public static int NumberOfLinks$get(MemorySegment seg, long index) {
        return (int)_FILE_STANDARD_INFO.NumberOfLinks$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfLinks$set(MemorySegment seg, long index, int x) {
        _FILE_STANDARD_INFO.NumberOfLinks$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DeletePending$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DeletePending"));
    public static VarHandle DeletePending$VH() {
        return _FILE_STANDARD_INFO.DeletePending$VH;
    }
    public static byte DeletePending$get(MemorySegment seg) {
        return (byte)_FILE_STANDARD_INFO.DeletePending$VH.get(seg);
    }
    public static void DeletePending$set( MemorySegment seg, byte x) {
        _FILE_STANDARD_INFO.DeletePending$VH.set(seg, x);
    }
    public static byte DeletePending$get(MemorySegment seg, long index) {
        return (byte)_FILE_STANDARD_INFO.DeletePending$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DeletePending$set(MemorySegment seg, long index, byte x) {
        _FILE_STANDARD_INFO.DeletePending$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Directory$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Directory"));
    public static VarHandle Directory$VH() {
        return _FILE_STANDARD_INFO.Directory$VH;
    }
    public static byte Directory$get(MemorySegment seg) {
        return (byte)_FILE_STANDARD_INFO.Directory$VH.get(seg);
    }
    public static void Directory$set( MemorySegment seg, byte x) {
        _FILE_STANDARD_INFO.Directory$VH.set(seg, x);
    }
    public static byte Directory$get(MemorySegment seg, long index) {
        return (byte)_FILE_STANDARD_INFO.Directory$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Directory$set(MemorySegment seg, long index, byte x) {
        _FILE_STANDARD_INFO.Directory$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


