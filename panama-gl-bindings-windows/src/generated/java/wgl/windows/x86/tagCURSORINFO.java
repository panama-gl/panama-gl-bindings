// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagCURSORINFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        Constants$root.C_LONG$LAYOUT.withName("flags"),
        Constants$root.C_POINTER$LAYOUT.withName("hCursor"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("x"),
            Constants$root.C_LONG$LAYOUT.withName("y")
        ).withName("ptScreenPos")
    ).withName("tagCURSORINFO");
    public static MemoryLayout $LAYOUT() {
        return tagCURSORINFO.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return tagCURSORINFO.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)tagCURSORINFO.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        tagCURSORINFO.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)tagCURSORINFO.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        tagCURSORINFO.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("flags"));
    public static VarHandle flags$VH() {
        return tagCURSORINFO.flags$VH;
    }
    public static int flags$get(MemorySegment seg) {
        return (int)tagCURSORINFO.flags$VH.get(seg);
    }
    public static void flags$set( MemorySegment seg, int x) {
        tagCURSORINFO.flags$VH.set(seg, x);
    }
    public static int flags$get(MemorySegment seg, long index) {
        return (int)tagCURSORINFO.flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, int x) {
        tagCURSORINFO.flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hCursor$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hCursor"));
    public static VarHandle hCursor$VH() {
        return tagCURSORINFO.hCursor$VH;
    }
    public static MemoryAddress hCursor$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagCURSORINFO.hCursor$VH.get(seg);
    }
    public static void hCursor$set( MemorySegment seg, MemoryAddress x) {
        tagCURSORINFO.hCursor$VH.set(seg, x);
    }
    public static MemoryAddress hCursor$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagCURSORINFO.hCursor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hCursor$set(MemorySegment seg, long index, MemoryAddress x) {
        tagCURSORINFO.hCursor$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ptScreenPos$slice(MemorySegment seg) {
        return seg.asSlice(16, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

