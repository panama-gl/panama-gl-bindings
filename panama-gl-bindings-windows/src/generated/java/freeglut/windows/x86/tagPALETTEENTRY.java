// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagPALETTEENTRY {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_CHAR$LAYOUT.withName("peRed"),
        Constants$root.C_CHAR$LAYOUT.withName("peGreen"),
        Constants$root.C_CHAR$LAYOUT.withName("peBlue"),
        Constants$root.C_CHAR$LAYOUT.withName("peFlags")
    ).withName("tagPALETTEENTRY");
    public static MemoryLayout $LAYOUT() {
        return tagPALETTEENTRY.$struct$LAYOUT;
    }
    static final VarHandle peRed$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("peRed"));
    public static VarHandle peRed$VH() {
        return tagPALETTEENTRY.peRed$VH;
    }
    public static byte peRed$get(MemorySegment seg) {
        return (byte)tagPALETTEENTRY.peRed$VH.get(seg);
    }
    public static void peRed$set( MemorySegment seg, byte x) {
        tagPALETTEENTRY.peRed$VH.set(seg, x);
    }
    public static byte peRed$get(MemorySegment seg, long index) {
        return (byte)tagPALETTEENTRY.peRed$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void peRed$set(MemorySegment seg, long index, byte x) {
        tagPALETTEENTRY.peRed$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle peGreen$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("peGreen"));
    public static VarHandle peGreen$VH() {
        return tagPALETTEENTRY.peGreen$VH;
    }
    public static byte peGreen$get(MemorySegment seg) {
        return (byte)tagPALETTEENTRY.peGreen$VH.get(seg);
    }
    public static void peGreen$set( MemorySegment seg, byte x) {
        tagPALETTEENTRY.peGreen$VH.set(seg, x);
    }
    public static byte peGreen$get(MemorySegment seg, long index) {
        return (byte)tagPALETTEENTRY.peGreen$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void peGreen$set(MemorySegment seg, long index, byte x) {
        tagPALETTEENTRY.peGreen$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle peBlue$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("peBlue"));
    public static VarHandle peBlue$VH() {
        return tagPALETTEENTRY.peBlue$VH;
    }
    public static byte peBlue$get(MemorySegment seg) {
        return (byte)tagPALETTEENTRY.peBlue$VH.get(seg);
    }
    public static void peBlue$set( MemorySegment seg, byte x) {
        tagPALETTEENTRY.peBlue$VH.set(seg, x);
    }
    public static byte peBlue$get(MemorySegment seg, long index) {
        return (byte)tagPALETTEENTRY.peBlue$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void peBlue$set(MemorySegment seg, long index, byte x) {
        tagPALETTEENTRY.peBlue$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle peFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("peFlags"));
    public static VarHandle peFlags$VH() {
        return tagPALETTEENTRY.peFlags$VH;
    }
    public static byte peFlags$get(MemorySegment seg) {
        return (byte)tagPALETTEENTRY.peFlags$VH.get(seg);
    }
    public static void peFlags$set( MemorySegment seg, byte x) {
        tagPALETTEENTRY.peFlags$VH.set(seg, x);
    }
    public static byte peFlags$get(MemorySegment seg, long index) {
        return (byte)tagPALETTEENTRY.peFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void peFlags$set(MemorySegment seg, long index, byte x) {
        tagPALETTEENTRY.peFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


