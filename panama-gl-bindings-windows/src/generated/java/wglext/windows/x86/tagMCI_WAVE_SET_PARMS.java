// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagMCI_WAVE_SET_PARMS {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("dwCallback"),
        Constants$root.C_LONG$LAYOUT.withName("dwTimeFormat"),
        Constants$root.C_LONG$LAYOUT.withName("dwAudio"),
        Constants$root.C_LONG$LAYOUT.withName("wInput"),
        Constants$root.C_LONG$LAYOUT.withName("wOutput"),
        Constants$root.C_SHORT$LAYOUT.withName("wFormatTag"),
        Constants$root.C_SHORT$LAYOUT.withName("wReserved2"),
        Constants$root.C_SHORT$LAYOUT.withName("nChannels"),
        Constants$root.C_SHORT$LAYOUT.withName("wReserved3"),
        Constants$root.C_LONG$LAYOUT.withName("nSamplesPerSec"),
        Constants$root.C_LONG$LAYOUT.withName("nAvgBytesPerSec"),
        Constants$root.C_SHORT$LAYOUT.withName("nBlockAlign"),
        Constants$root.C_SHORT$LAYOUT.withName("wReserved4"),
        Constants$root.C_SHORT$LAYOUT.withName("wBitsPerSample"),
        Constants$root.C_SHORT$LAYOUT.withName("wReserved5")
    ).withName("tagMCI_WAVE_SET_PARMS");
    public static MemoryLayout $LAYOUT() {
        return tagMCI_WAVE_SET_PARMS.$struct$LAYOUT;
    }
    static final VarHandle dwCallback$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwCallback"));
    public static VarHandle dwCallback$VH() {
        return tagMCI_WAVE_SET_PARMS.dwCallback$VH;
    }
    public static long dwCallback$get(MemorySegment seg) {
        return (long)tagMCI_WAVE_SET_PARMS.dwCallback$VH.get(seg);
    }
    public static void dwCallback$set( MemorySegment seg, long x) {
        tagMCI_WAVE_SET_PARMS.dwCallback$VH.set(seg, x);
    }
    public static long dwCallback$get(MemorySegment seg, long index) {
        return (long)tagMCI_WAVE_SET_PARMS.dwCallback$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwCallback$set(MemorySegment seg, long index, long x) {
        tagMCI_WAVE_SET_PARMS.dwCallback$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwTimeFormat$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwTimeFormat"));
    public static VarHandle dwTimeFormat$VH() {
        return tagMCI_WAVE_SET_PARMS.dwTimeFormat$VH;
    }
    public static int dwTimeFormat$get(MemorySegment seg) {
        return (int)tagMCI_WAVE_SET_PARMS.dwTimeFormat$VH.get(seg);
    }
    public static void dwTimeFormat$set( MemorySegment seg, int x) {
        tagMCI_WAVE_SET_PARMS.dwTimeFormat$VH.set(seg, x);
    }
    public static int dwTimeFormat$get(MemorySegment seg, long index) {
        return (int)tagMCI_WAVE_SET_PARMS.dwTimeFormat$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwTimeFormat$set(MemorySegment seg, long index, int x) {
        tagMCI_WAVE_SET_PARMS.dwTimeFormat$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwAudio$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwAudio"));
    public static VarHandle dwAudio$VH() {
        return tagMCI_WAVE_SET_PARMS.dwAudio$VH;
    }
    public static int dwAudio$get(MemorySegment seg) {
        return (int)tagMCI_WAVE_SET_PARMS.dwAudio$VH.get(seg);
    }
    public static void dwAudio$set( MemorySegment seg, int x) {
        tagMCI_WAVE_SET_PARMS.dwAudio$VH.set(seg, x);
    }
    public static int dwAudio$get(MemorySegment seg, long index) {
        return (int)tagMCI_WAVE_SET_PARMS.dwAudio$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwAudio$set(MemorySegment seg, long index, int x) {
        tagMCI_WAVE_SET_PARMS.dwAudio$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wInput$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wInput"));
    public static VarHandle wInput$VH() {
        return tagMCI_WAVE_SET_PARMS.wInput$VH;
    }
    public static int wInput$get(MemorySegment seg) {
        return (int)tagMCI_WAVE_SET_PARMS.wInput$VH.get(seg);
    }
    public static void wInput$set( MemorySegment seg, int x) {
        tagMCI_WAVE_SET_PARMS.wInput$VH.set(seg, x);
    }
    public static int wInput$get(MemorySegment seg, long index) {
        return (int)tagMCI_WAVE_SET_PARMS.wInput$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wInput$set(MemorySegment seg, long index, int x) {
        tagMCI_WAVE_SET_PARMS.wInput$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wOutput$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wOutput"));
    public static VarHandle wOutput$VH() {
        return tagMCI_WAVE_SET_PARMS.wOutput$VH;
    }
    public static int wOutput$get(MemorySegment seg) {
        return (int)tagMCI_WAVE_SET_PARMS.wOutput$VH.get(seg);
    }
    public static void wOutput$set( MemorySegment seg, int x) {
        tagMCI_WAVE_SET_PARMS.wOutput$VH.set(seg, x);
    }
    public static int wOutput$get(MemorySegment seg, long index) {
        return (int)tagMCI_WAVE_SET_PARMS.wOutput$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wOutput$set(MemorySegment seg, long index, int x) {
        tagMCI_WAVE_SET_PARMS.wOutput$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wFormatTag$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wFormatTag"));
    public static VarHandle wFormatTag$VH() {
        return tagMCI_WAVE_SET_PARMS.wFormatTag$VH;
    }
    public static short wFormatTag$get(MemorySegment seg) {
        return (short)tagMCI_WAVE_SET_PARMS.wFormatTag$VH.get(seg);
    }
    public static void wFormatTag$set( MemorySegment seg, short x) {
        tagMCI_WAVE_SET_PARMS.wFormatTag$VH.set(seg, x);
    }
    public static short wFormatTag$get(MemorySegment seg, long index) {
        return (short)tagMCI_WAVE_SET_PARMS.wFormatTag$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wFormatTag$set(MemorySegment seg, long index, short x) {
        tagMCI_WAVE_SET_PARMS.wFormatTag$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wReserved2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wReserved2"));
    public static VarHandle wReserved2$VH() {
        return tagMCI_WAVE_SET_PARMS.wReserved2$VH;
    }
    public static short wReserved2$get(MemorySegment seg) {
        return (short)tagMCI_WAVE_SET_PARMS.wReserved2$VH.get(seg);
    }
    public static void wReserved2$set( MemorySegment seg, short x) {
        tagMCI_WAVE_SET_PARMS.wReserved2$VH.set(seg, x);
    }
    public static short wReserved2$get(MemorySegment seg, long index) {
        return (short)tagMCI_WAVE_SET_PARMS.wReserved2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wReserved2$set(MemorySegment seg, long index, short x) {
        tagMCI_WAVE_SET_PARMS.wReserved2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nChannels$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nChannels"));
    public static VarHandle nChannels$VH() {
        return tagMCI_WAVE_SET_PARMS.nChannels$VH;
    }
    public static short nChannels$get(MemorySegment seg) {
        return (short)tagMCI_WAVE_SET_PARMS.nChannels$VH.get(seg);
    }
    public static void nChannels$set( MemorySegment seg, short x) {
        tagMCI_WAVE_SET_PARMS.nChannels$VH.set(seg, x);
    }
    public static short nChannels$get(MemorySegment seg, long index) {
        return (short)tagMCI_WAVE_SET_PARMS.nChannels$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nChannels$set(MemorySegment seg, long index, short x) {
        tagMCI_WAVE_SET_PARMS.nChannels$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wReserved3$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wReserved3"));
    public static VarHandle wReserved3$VH() {
        return tagMCI_WAVE_SET_PARMS.wReserved3$VH;
    }
    public static short wReserved3$get(MemorySegment seg) {
        return (short)tagMCI_WAVE_SET_PARMS.wReserved3$VH.get(seg);
    }
    public static void wReserved3$set( MemorySegment seg, short x) {
        tagMCI_WAVE_SET_PARMS.wReserved3$VH.set(seg, x);
    }
    public static short wReserved3$get(MemorySegment seg, long index) {
        return (short)tagMCI_WAVE_SET_PARMS.wReserved3$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wReserved3$set(MemorySegment seg, long index, short x) {
        tagMCI_WAVE_SET_PARMS.wReserved3$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nSamplesPerSec$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nSamplesPerSec"));
    public static VarHandle nSamplesPerSec$VH() {
        return tagMCI_WAVE_SET_PARMS.nSamplesPerSec$VH;
    }
    public static int nSamplesPerSec$get(MemorySegment seg) {
        return (int)tagMCI_WAVE_SET_PARMS.nSamplesPerSec$VH.get(seg);
    }
    public static void nSamplesPerSec$set( MemorySegment seg, int x) {
        tagMCI_WAVE_SET_PARMS.nSamplesPerSec$VH.set(seg, x);
    }
    public static int nSamplesPerSec$get(MemorySegment seg, long index) {
        return (int)tagMCI_WAVE_SET_PARMS.nSamplesPerSec$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nSamplesPerSec$set(MemorySegment seg, long index, int x) {
        tagMCI_WAVE_SET_PARMS.nSamplesPerSec$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nAvgBytesPerSec$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nAvgBytesPerSec"));
    public static VarHandle nAvgBytesPerSec$VH() {
        return tagMCI_WAVE_SET_PARMS.nAvgBytesPerSec$VH;
    }
    public static int nAvgBytesPerSec$get(MemorySegment seg) {
        return (int)tagMCI_WAVE_SET_PARMS.nAvgBytesPerSec$VH.get(seg);
    }
    public static void nAvgBytesPerSec$set( MemorySegment seg, int x) {
        tagMCI_WAVE_SET_PARMS.nAvgBytesPerSec$VH.set(seg, x);
    }
    public static int nAvgBytesPerSec$get(MemorySegment seg, long index) {
        return (int)tagMCI_WAVE_SET_PARMS.nAvgBytesPerSec$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nAvgBytesPerSec$set(MemorySegment seg, long index, int x) {
        tagMCI_WAVE_SET_PARMS.nAvgBytesPerSec$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nBlockAlign$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nBlockAlign"));
    public static VarHandle nBlockAlign$VH() {
        return tagMCI_WAVE_SET_PARMS.nBlockAlign$VH;
    }
    public static short nBlockAlign$get(MemorySegment seg) {
        return (short)tagMCI_WAVE_SET_PARMS.nBlockAlign$VH.get(seg);
    }
    public static void nBlockAlign$set( MemorySegment seg, short x) {
        tagMCI_WAVE_SET_PARMS.nBlockAlign$VH.set(seg, x);
    }
    public static short nBlockAlign$get(MemorySegment seg, long index) {
        return (short)tagMCI_WAVE_SET_PARMS.nBlockAlign$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nBlockAlign$set(MemorySegment seg, long index, short x) {
        tagMCI_WAVE_SET_PARMS.nBlockAlign$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wReserved4$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wReserved4"));
    public static VarHandle wReserved4$VH() {
        return tagMCI_WAVE_SET_PARMS.wReserved4$VH;
    }
    public static short wReserved4$get(MemorySegment seg) {
        return (short)tagMCI_WAVE_SET_PARMS.wReserved4$VH.get(seg);
    }
    public static void wReserved4$set( MemorySegment seg, short x) {
        tagMCI_WAVE_SET_PARMS.wReserved4$VH.set(seg, x);
    }
    public static short wReserved4$get(MemorySegment seg, long index) {
        return (short)tagMCI_WAVE_SET_PARMS.wReserved4$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wReserved4$set(MemorySegment seg, long index, short x) {
        tagMCI_WAVE_SET_PARMS.wReserved4$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wBitsPerSample$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wBitsPerSample"));
    public static VarHandle wBitsPerSample$VH() {
        return tagMCI_WAVE_SET_PARMS.wBitsPerSample$VH;
    }
    public static short wBitsPerSample$get(MemorySegment seg) {
        return (short)tagMCI_WAVE_SET_PARMS.wBitsPerSample$VH.get(seg);
    }
    public static void wBitsPerSample$set( MemorySegment seg, short x) {
        tagMCI_WAVE_SET_PARMS.wBitsPerSample$VH.set(seg, x);
    }
    public static short wBitsPerSample$get(MemorySegment seg, long index) {
        return (short)tagMCI_WAVE_SET_PARMS.wBitsPerSample$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wBitsPerSample$set(MemorySegment seg, long index, short x) {
        tagMCI_WAVE_SET_PARMS.wBitsPerSample$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wReserved5$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wReserved5"));
    public static VarHandle wReserved5$VH() {
        return tagMCI_WAVE_SET_PARMS.wReserved5$VH;
    }
    public static short wReserved5$get(MemorySegment seg) {
        return (short)tagMCI_WAVE_SET_PARMS.wReserved5$VH.get(seg);
    }
    public static void wReserved5$set( MemorySegment seg, short x) {
        tagMCI_WAVE_SET_PARMS.wReserved5$VH.set(seg, x);
    }
    public static short wReserved5$get(MemorySegment seg, long index) {
        return (short)tagMCI_WAVE_SET_PARMS.wReserved5$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wReserved5$set(MemorySegment seg, long index, short x) {
        tagMCI_WAVE_SET_PARMS.wReserved5$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

