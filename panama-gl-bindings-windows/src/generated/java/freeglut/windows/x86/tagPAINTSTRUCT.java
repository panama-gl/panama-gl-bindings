// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagPAINTSTRUCT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("hdc"),
        Constants$root.C_LONG$LAYOUT.withName("fErase"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("left"),
            Constants$root.C_LONG$LAYOUT.withName("top"),
            Constants$root.C_LONG$LAYOUT.withName("right"),
            Constants$root.C_LONG$LAYOUT.withName("bottom")
        ).withName("rcPaint"),
        Constants$root.C_LONG$LAYOUT.withName("fRestore"),
        Constants$root.C_LONG$LAYOUT.withName("fIncUpdate"),
        MemoryLayout.sequenceLayout(32, Constants$root.C_CHAR$LAYOUT).withName("rgbReserved"),
        MemoryLayout.paddingLayout(32)
    ).withName("tagPAINTSTRUCT");
    public static MemoryLayout $LAYOUT() {
        return tagPAINTSTRUCT.$struct$LAYOUT;
    }
    static final VarHandle hdc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hdc"));
    public static VarHandle hdc$VH() {
        return tagPAINTSTRUCT.hdc$VH;
    }
    public static MemoryAddress hdc$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagPAINTSTRUCT.hdc$VH.get(seg);
    }
    public static void hdc$set( MemorySegment seg, MemoryAddress x) {
        tagPAINTSTRUCT.hdc$VH.set(seg, x);
    }
    public static MemoryAddress hdc$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagPAINTSTRUCT.hdc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hdc$set(MemorySegment seg, long index, MemoryAddress x) {
        tagPAINTSTRUCT.hdc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fErase$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fErase"));
    public static VarHandle fErase$VH() {
        return tagPAINTSTRUCT.fErase$VH;
    }
    public static int fErase$get(MemorySegment seg) {
        return (int)tagPAINTSTRUCT.fErase$VH.get(seg);
    }
    public static void fErase$set( MemorySegment seg, int x) {
        tagPAINTSTRUCT.fErase$VH.set(seg, x);
    }
    public static int fErase$get(MemorySegment seg, long index) {
        return (int)tagPAINTSTRUCT.fErase$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fErase$set(MemorySegment seg, long index, int x) {
        tagPAINTSTRUCT.fErase$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment rcPaint$slice(MemorySegment seg) {
        return seg.asSlice(12, 16);
    }
    static final VarHandle fRestore$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fRestore"));
    public static VarHandle fRestore$VH() {
        return tagPAINTSTRUCT.fRestore$VH;
    }
    public static int fRestore$get(MemorySegment seg) {
        return (int)tagPAINTSTRUCT.fRestore$VH.get(seg);
    }
    public static void fRestore$set( MemorySegment seg, int x) {
        tagPAINTSTRUCT.fRestore$VH.set(seg, x);
    }
    public static int fRestore$get(MemorySegment seg, long index) {
        return (int)tagPAINTSTRUCT.fRestore$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fRestore$set(MemorySegment seg, long index, int x) {
        tagPAINTSTRUCT.fRestore$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fIncUpdate$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fIncUpdate"));
    public static VarHandle fIncUpdate$VH() {
        return tagPAINTSTRUCT.fIncUpdate$VH;
    }
    public static int fIncUpdate$get(MemorySegment seg) {
        return (int)tagPAINTSTRUCT.fIncUpdate$VH.get(seg);
    }
    public static void fIncUpdate$set( MemorySegment seg, int x) {
        tagPAINTSTRUCT.fIncUpdate$VH.set(seg, x);
    }
    public static int fIncUpdate$get(MemorySegment seg, long index) {
        return (int)tagPAINTSTRUCT.fIncUpdate$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fIncUpdate$set(MemorySegment seg, long index, int x) {
        tagPAINTSTRUCT.fIncUpdate$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment rgbReserved$slice(MemorySegment seg) {
        return seg.asSlice(36, 32);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


