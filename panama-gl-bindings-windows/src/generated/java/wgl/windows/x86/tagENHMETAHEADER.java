// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagENHMETAHEADER {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("iType"),
        Constants$root.C_LONG$LAYOUT.withName("nSize"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("left"),
            Constants$root.C_LONG$LAYOUT.withName("top"),
            Constants$root.C_LONG$LAYOUT.withName("right"),
            Constants$root.C_LONG$LAYOUT.withName("bottom")
        ).withName("rclBounds"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("left"),
            Constants$root.C_LONG$LAYOUT.withName("top"),
            Constants$root.C_LONG$LAYOUT.withName("right"),
            Constants$root.C_LONG$LAYOUT.withName("bottom")
        ).withName("rclFrame"),
        Constants$root.C_LONG$LAYOUT.withName("dSignature"),
        Constants$root.C_LONG$LAYOUT.withName("nVersion"),
        Constants$root.C_LONG$LAYOUT.withName("nBytes"),
        Constants$root.C_LONG$LAYOUT.withName("nRecords"),
        Constants$root.C_SHORT$LAYOUT.withName("nHandles"),
        Constants$root.C_SHORT$LAYOUT.withName("sReserved"),
        Constants$root.C_LONG$LAYOUT.withName("nDescription"),
        Constants$root.C_LONG$LAYOUT.withName("offDescription"),
        Constants$root.C_LONG$LAYOUT.withName("nPalEntries"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("cx"),
            Constants$root.C_LONG$LAYOUT.withName("cy")
        ).withName("szlDevice"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("cx"),
            Constants$root.C_LONG$LAYOUT.withName("cy")
        ).withName("szlMillimeters"),
        Constants$root.C_LONG$LAYOUT.withName("cbPixelFormat"),
        Constants$root.C_LONG$LAYOUT.withName("offPixelFormat"),
        Constants$root.C_LONG$LAYOUT.withName("bOpenGL"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("cx"),
            Constants$root.C_LONG$LAYOUT.withName("cy")
        ).withName("szlMicrometers")
    ).withName("tagENHMETAHEADER");
    public static MemoryLayout $LAYOUT() {
        return tagENHMETAHEADER.$struct$LAYOUT;
    }
    static final VarHandle iType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iType"));
    public static VarHandle iType$VH() {
        return tagENHMETAHEADER.iType$VH;
    }
    public static int iType$get(MemorySegment seg) {
        return (int)tagENHMETAHEADER.iType$VH.get(seg);
    }
    public static void iType$set( MemorySegment seg, int x) {
        tagENHMETAHEADER.iType$VH.set(seg, x);
    }
    public static int iType$get(MemorySegment seg, long index) {
        return (int)tagENHMETAHEADER.iType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iType$set(MemorySegment seg, long index, int x) {
        tagENHMETAHEADER.iType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nSize"));
    public static VarHandle nSize$VH() {
        return tagENHMETAHEADER.nSize$VH;
    }
    public static int nSize$get(MemorySegment seg) {
        return (int)tagENHMETAHEADER.nSize$VH.get(seg);
    }
    public static void nSize$set( MemorySegment seg, int x) {
        tagENHMETAHEADER.nSize$VH.set(seg, x);
    }
    public static int nSize$get(MemorySegment seg, long index) {
        return (int)tagENHMETAHEADER.nSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nSize$set(MemorySegment seg, long index, int x) {
        tagENHMETAHEADER.nSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment rclBounds$slice(MemorySegment seg) {
        return seg.asSlice(8, 16);
    }
    public static MemorySegment rclFrame$slice(MemorySegment seg) {
        return seg.asSlice(24, 16);
    }
    static final VarHandle dSignature$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dSignature"));
    public static VarHandle dSignature$VH() {
        return tagENHMETAHEADER.dSignature$VH;
    }
    public static int dSignature$get(MemorySegment seg) {
        return (int)tagENHMETAHEADER.dSignature$VH.get(seg);
    }
    public static void dSignature$set( MemorySegment seg, int x) {
        tagENHMETAHEADER.dSignature$VH.set(seg, x);
    }
    public static int dSignature$get(MemorySegment seg, long index) {
        return (int)tagENHMETAHEADER.dSignature$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dSignature$set(MemorySegment seg, long index, int x) {
        tagENHMETAHEADER.dSignature$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nVersion"));
    public static VarHandle nVersion$VH() {
        return tagENHMETAHEADER.nVersion$VH;
    }
    public static int nVersion$get(MemorySegment seg) {
        return (int)tagENHMETAHEADER.nVersion$VH.get(seg);
    }
    public static void nVersion$set( MemorySegment seg, int x) {
        tagENHMETAHEADER.nVersion$VH.set(seg, x);
    }
    public static int nVersion$get(MemorySegment seg, long index) {
        return (int)tagENHMETAHEADER.nVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nVersion$set(MemorySegment seg, long index, int x) {
        tagENHMETAHEADER.nVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nBytes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nBytes"));
    public static VarHandle nBytes$VH() {
        return tagENHMETAHEADER.nBytes$VH;
    }
    public static int nBytes$get(MemorySegment seg) {
        return (int)tagENHMETAHEADER.nBytes$VH.get(seg);
    }
    public static void nBytes$set( MemorySegment seg, int x) {
        tagENHMETAHEADER.nBytes$VH.set(seg, x);
    }
    public static int nBytes$get(MemorySegment seg, long index) {
        return (int)tagENHMETAHEADER.nBytes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nBytes$set(MemorySegment seg, long index, int x) {
        tagENHMETAHEADER.nBytes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nRecords$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nRecords"));
    public static VarHandle nRecords$VH() {
        return tagENHMETAHEADER.nRecords$VH;
    }
    public static int nRecords$get(MemorySegment seg) {
        return (int)tagENHMETAHEADER.nRecords$VH.get(seg);
    }
    public static void nRecords$set( MemorySegment seg, int x) {
        tagENHMETAHEADER.nRecords$VH.set(seg, x);
    }
    public static int nRecords$get(MemorySegment seg, long index) {
        return (int)tagENHMETAHEADER.nRecords$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nRecords$set(MemorySegment seg, long index, int x) {
        tagENHMETAHEADER.nRecords$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nHandles$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nHandles"));
    public static VarHandle nHandles$VH() {
        return tagENHMETAHEADER.nHandles$VH;
    }
    public static short nHandles$get(MemorySegment seg) {
        return (short)tagENHMETAHEADER.nHandles$VH.get(seg);
    }
    public static void nHandles$set( MemorySegment seg, short x) {
        tagENHMETAHEADER.nHandles$VH.set(seg, x);
    }
    public static short nHandles$get(MemorySegment seg, long index) {
        return (short)tagENHMETAHEADER.nHandles$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nHandles$set(MemorySegment seg, long index, short x) {
        tagENHMETAHEADER.nHandles$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle sReserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("sReserved"));
    public static VarHandle sReserved$VH() {
        return tagENHMETAHEADER.sReserved$VH;
    }
    public static short sReserved$get(MemorySegment seg) {
        return (short)tagENHMETAHEADER.sReserved$VH.get(seg);
    }
    public static void sReserved$set( MemorySegment seg, short x) {
        tagENHMETAHEADER.sReserved$VH.set(seg, x);
    }
    public static short sReserved$get(MemorySegment seg, long index) {
        return (short)tagENHMETAHEADER.sReserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void sReserved$set(MemorySegment seg, long index, short x) {
        tagENHMETAHEADER.sReserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nDescription$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nDescription"));
    public static VarHandle nDescription$VH() {
        return tagENHMETAHEADER.nDescription$VH;
    }
    public static int nDescription$get(MemorySegment seg) {
        return (int)tagENHMETAHEADER.nDescription$VH.get(seg);
    }
    public static void nDescription$set( MemorySegment seg, int x) {
        tagENHMETAHEADER.nDescription$VH.set(seg, x);
    }
    public static int nDescription$get(MemorySegment seg, long index) {
        return (int)tagENHMETAHEADER.nDescription$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nDescription$set(MemorySegment seg, long index, int x) {
        tagENHMETAHEADER.nDescription$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle offDescription$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("offDescription"));
    public static VarHandle offDescription$VH() {
        return tagENHMETAHEADER.offDescription$VH;
    }
    public static int offDescription$get(MemorySegment seg) {
        return (int)tagENHMETAHEADER.offDescription$VH.get(seg);
    }
    public static void offDescription$set( MemorySegment seg, int x) {
        tagENHMETAHEADER.offDescription$VH.set(seg, x);
    }
    public static int offDescription$get(MemorySegment seg, long index) {
        return (int)tagENHMETAHEADER.offDescription$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void offDescription$set(MemorySegment seg, long index, int x) {
        tagENHMETAHEADER.offDescription$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nPalEntries$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nPalEntries"));
    public static VarHandle nPalEntries$VH() {
        return tagENHMETAHEADER.nPalEntries$VH;
    }
    public static int nPalEntries$get(MemorySegment seg) {
        return (int)tagENHMETAHEADER.nPalEntries$VH.get(seg);
    }
    public static void nPalEntries$set( MemorySegment seg, int x) {
        tagENHMETAHEADER.nPalEntries$VH.set(seg, x);
    }
    public static int nPalEntries$get(MemorySegment seg, long index) {
        return (int)tagENHMETAHEADER.nPalEntries$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nPalEntries$set(MemorySegment seg, long index, int x) {
        tagENHMETAHEADER.nPalEntries$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment szlDevice$slice(MemorySegment seg) {
        return seg.asSlice(72, 8);
    }
    public static MemorySegment szlMillimeters$slice(MemorySegment seg) {
        return seg.asSlice(80, 8);
    }
    static final VarHandle cbPixelFormat$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbPixelFormat"));
    public static VarHandle cbPixelFormat$VH() {
        return tagENHMETAHEADER.cbPixelFormat$VH;
    }
    public static int cbPixelFormat$get(MemorySegment seg) {
        return (int)tagENHMETAHEADER.cbPixelFormat$VH.get(seg);
    }
    public static void cbPixelFormat$set( MemorySegment seg, int x) {
        tagENHMETAHEADER.cbPixelFormat$VH.set(seg, x);
    }
    public static int cbPixelFormat$get(MemorySegment seg, long index) {
        return (int)tagENHMETAHEADER.cbPixelFormat$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbPixelFormat$set(MemorySegment seg, long index, int x) {
        tagENHMETAHEADER.cbPixelFormat$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle offPixelFormat$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("offPixelFormat"));
    public static VarHandle offPixelFormat$VH() {
        return tagENHMETAHEADER.offPixelFormat$VH;
    }
    public static int offPixelFormat$get(MemorySegment seg) {
        return (int)tagENHMETAHEADER.offPixelFormat$VH.get(seg);
    }
    public static void offPixelFormat$set( MemorySegment seg, int x) {
        tagENHMETAHEADER.offPixelFormat$VH.set(seg, x);
    }
    public static int offPixelFormat$get(MemorySegment seg, long index) {
        return (int)tagENHMETAHEADER.offPixelFormat$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void offPixelFormat$set(MemorySegment seg, long index, int x) {
        tagENHMETAHEADER.offPixelFormat$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bOpenGL$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bOpenGL"));
    public static VarHandle bOpenGL$VH() {
        return tagENHMETAHEADER.bOpenGL$VH;
    }
    public static int bOpenGL$get(MemorySegment seg) {
        return (int)tagENHMETAHEADER.bOpenGL$VH.get(seg);
    }
    public static void bOpenGL$set( MemorySegment seg, int x) {
        tagENHMETAHEADER.bOpenGL$VH.set(seg, x);
    }
    public static int bOpenGL$get(MemorySegment seg, long index) {
        return (int)tagENHMETAHEADER.bOpenGL$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bOpenGL$set(MemorySegment seg, long index, int x) {
        tagENHMETAHEADER.bOpenGL$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment szlMicrometers$slice(MemorySegment seg) {
        return seg.asSlice(100, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


