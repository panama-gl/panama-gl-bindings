// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagBITMAPFILEHEADER {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("bfType"),
        Constants$root.C_LONG$LAYOUT.withName("bfSize"),
        Constants$root.C_SHORT$LAYOUT.withName("bfReserved1"),
        Constants$root.C_SHORT$LAYOUT.withName("bfReserved2"),
        Constants$root.C_LONG$LAYOUT.withName("bfOffBits")
    ).withName("tagBITMAPFILEHEADER");
    public static MemoryLayout $LAYOUT() {
        return tagBITMAPFILEHEADER.$struct$LAYOUT;
    }
    static final VarHandle bfType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bfType"));
    public static VarHandle bfType$VH() {
        return tagBITMAPFILEHEADER.bfType$VH;
    }
    public static short bfType$get(MemorySegment seg) {
        return (short)tagBITMAPFILEHEADER.bfType$VH.get(seg);
    }
    public static void bfType$set( MemorySegment seg, short x) {
        tagBITMAPFILEHEADER.bfType$VH.set(seg, x);
    }
    public static short bfType$get(MemorySegment seg, long index) {
        return (short)tagBITMAPFILEHEADER.bfType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bfType$set(MemorySegment seg, long index, short x) {
        tagBITMAPFILEHEADER.bfType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bfSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bfSize"));
    public static VarHandle bfSize$VH() {
        return tagBITMAPFILEHEADER.bfSize$VH;
    }
    public static int bfSize$get(MemorySegment seg) {
        return (int)tagBITMAPFILEHEADER.bfSize$VH.get(seg);
    }
    public static void bfSize$set( MemorySegment seg, int x) {
        tagBITMAPFILEHEADER.bfSize$VH.set(seg, x);
    }
    public static int bfSize$get(MemorySegment seg, long index) {
        return (int)tagBITMAPFILEHEADER.bfSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bfSize$set(MemorySegment seg, long index, int x) {
        tagBITMAPFILEHEADER.bfSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bfReserved1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bfReserved1"));
    public static VarHandle bfReserved1$VH() {
        return tagBITMAPFILEHEADER.bfReserved1$VH;
    }
    public static short bfReserved1$get(MemorySegment seg) {
        return (short)tagBITMAPFILEHEADER.bfReserved1$VH.get(seg);
    }
    public static void bfReserved1$set( MemorySegment seg, short x) {
        tagBITMAPFILEHEADER.bfReserved1$VH.set(seg, x);
    }
    public static short bfReserved1$get(MemorySegment seg, long index) {
        return (short)tagBITMAPFILEHEADER.bfReserved1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bfReserved1$set(MemorySegment seg, long index, short x) {
        tagBITMAPFILEHEADER.bfReserved1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bfReserved2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bfReserved2"));
    public static VarHandle bfReserved2$VH() {
        return tagBITMAPFILEHEADER.bfReserved2$VH;
    }
    public static short bfReserved2$get(MemorySegment seg) {
        return (short)tagBITMAPFILEHEADER.bfReserved2$VH.get(seg);
    }
    public static void bfReserved2$set( MemorySegment seg, short x) {
        tagBITMAPFILEHEADER.bfReserved2$VH.set(seg, x);
    }
    public static short bfReserved2$get(MemorySegment seg, long index) {
        return (short)tagBITMAPFILEHEADER.bfReserved2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bfReserved2$set(MemorySegment seg, long index, short x) {
        tagBITMAPFILEHEADER.bfReserved2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bfOffBits$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bfOffBits"));
    public static VarHandle bfOffBits$VH() {
        return tagBITMAPFILEHEADER.bfOffBits$VH;
    }
    public static int bfOffBits$get(MemorySegment seg) {
        return (int)tagBITMAPFILEHEADER.bfOffBits$VH.get(seg);
    }
    public static void bfOffBits$set( MemorySegment seg, int x) {
        tagBITMAPFILEHEADER.bfOffBits$VH.set(seg, x);
    }
    public static int bfOffBits$get(MemorySegment seg, long index) {
        return (int)tagBITMAPFILEHEADER.bfOffBits$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bfOffBits$set(MemorySegment seg, long index, int x) {
        tagBITMAPFILEHEADER.bfOffBits$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


