// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagUSEROBJECTFLAGS {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("fInherit"),
        Constants$root.C_LONG$LAYOUT.withName("fReserved"),
        Constants$root.C_LONG$LAYOUT.withName("dwFlags")
    ).withName("tagUSEROBJECTFLAGS");
    public static MemoryLayout $LAYOUT() {
        return tagUSEROBJECTFLAGS.$struct$LAYOUT;
    }
    static final VarHandle fInherit$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fInherit"));
    public static VarHandle fInherit$VH() {
        return tagUSEROBJECTFLAGS.fInherit$VH;
    }
    public static int fInherit$get(MemorySegment seg) {
        return (int)tagUSEROBJECTFLAGS.fInherit$VH.get(seg);
    }
    public static void fInherit$set( MemorySegment seg, int x) {
        tagUSEROBJECTFLAGS.fInherit$VH.set(seg, x);
    }
    public static int fInherit$get(MemorySegment seg, long index) {
        return (int)tagUSEROBJECTFLAGS.fInherit$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fInherit$set(MemorySegment seg, long index, int x) {
        tagUSEROBJECTFLAGS.fInherit$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fReserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fReserved"));
    public static VarHandle fReserved$VH() {
        return tagUSEROBJECTFLAGS.fReserved$VH;
    }
    public static int fReserved$get(MemorySegment seg) {
        return (int)tagUSEROBJECTFLAGS.fReserved$VH.get(seg);
    }
    public static void fReserved$set( MemorySegment seg, int x) {
        tagUSEROBJECTFLAGS.fReserved$VH.set(seg, x);
    }
    public static int fReserved$get(MemorySegment seg, long index) {
        return (int)tagUSEROBJECTFLAGS.fReserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fReserved$set(MemorySegment seg, long index, int x) {
        tagUSEROBJECTFLAGS.fReserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return tagUSEROBJECTFLAGS.dwFlags$VH;
    }
    public static int dwFlags$get(MemorySegment seg) {
        return (int)tagUSEROBJECTFLAGS.dwFlags$VH.get(seg);
    }
    public static void dwFlags$set( MemorySegment seg, int x) {
        tagUSEROBJECTFLAGS.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)tagUSEROBJECTFLAGS.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        tagUSEROBJECTFLAGS.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


