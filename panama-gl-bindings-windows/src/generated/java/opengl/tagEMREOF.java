// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagEMREOF {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("iType"),
            Constants$root.C_LONG$LAYOUT.withName("nSize")
        ).withName("emr"),
        Constants$root.C_LONG$LAYOUT.withName("nPalEntries"),
        Constants$root.C_LONG$LAYOUT.withName("offPalEntries"),
        Constants$root.C_LONG$LAYOUT.withName("nSizeLast")
    ).withName("tagEMREOF");
    public static MemoryLayout $LAYOUT() {
        return tagEMREOF.$struct$LAYOUT;
    }
    public static MemorySegment emr$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    static final VarHandle nPalEntries$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nPalEntries"));
    public static VarHandle nPalEntries$VH() {
        return tagEMREOF.nPalEntries$VH;
    }
    public static int nPalEntries$get(MemorySegment seg) {
        return (int)tagEMREOF.nPalEntries$VH.get(seg);
    }
    public static void nPalEntries$set( MemorySegment seg, int x) {
        tagEMREOF.nPalEntries$VH.set(seg, x);
    }
    public static int nPalEntries$get(MemorySegment seg, long index) {
        return (int)tagEMREOF.nPalEntries$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nPalEntries$set(MemorySegment seg, long index, int x) {
        tagEMREOF.nPalEntries$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle offPalEntries$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("offPalEntries"));
    public static VarHandle offPalEntries$VH() {
        return tagEMREOF.offPalEntries$VH;
    }
    public static int offPalEntries$get(MemorySegment seg) {
        return (int)tagEMREOF.offPalEntries$VH.get(seg);
    }
    public static void offPalEntries$set( MemorySegment seg, int x) {
        tagEMREOF.offPalEntries$VH.set(seg, x);
    }
    public static int offPalEntries$get(MemorySegment seg, long index) {
        return (int)tagEMREOF.offPalEntries$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void offPalEntries$set(MemorySegment seg, long index, int x) {
        tagEMREOF.offPalEntries$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nSizeLast$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nSizeLast"));
    public static VarHandle nSizeLast$VH() {
        return tagEMREOF.nSizeLast$VH;
    }
    public static int nSizeLast$get(MemorySegment seg) {
        return (int)tagEMREOF.nSizeLast$VH.get(seg);
    }
    public static void nSizeLast$set( MemorySegment seg, int x) {
        tagEMREOF.nSizeLast$VH.set(seg, x);
    }
    public static int nSizeLast$get(MemorySegment seg, long index) {
        return (int)tagEMREOF.nSizeLast$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nSizeLast$set(MemorySegment seg, long index, int x) {
        tagEMREOF.nSizeLast$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


