// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagMCI_BREAK_PARMS {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("dwCallback"),
        Constants$root.C_LONG$LAYOUT.withName("nVirtKey"),
        Constants$root.C_POINTER$LAYOUT.withName("hwndBreak")
    ).withName("tagMCI_BREAK_PARMS");
    public static MemoryLayout $LAYOUT() {
        return tagMCI_BREAK_PARMS.$struct$LAYOUT;
    }
    static final VarHandle dwCallback$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwCallback"));
    public static VarHandle dwCallback$VH() {
        return tagMCI_BREAK_PARMS.dwCallback$VH;
    }
    public static long dwCallback$get(MemorySegment seg) {
        return (long)tagMCI_BREAK_PARMS.dwCallback$VH.get(seg);
    }
    public static void dwCallback$set( MemorySegment seg, long x) {
        tagMCI_BREAK_PARMS.dwCallback$VH.set(seg, x);
    }
    public static long dwCallback$get(MemorySegment seg, long index) {
        return (long)tagMCI_BREAK_PARMS.dwCallback$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwCallback$set(MemorySegment seg, long index, long x) {
        tagMCI_BREAK_PARMS.dwCallback$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nVirtKey$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nVirtKey"));
    public static VarHandle nVirtKey$VH() {
        return tagMCI_BREAK_PARMS.nVirtKey$VH;
    }
    public static int nVirtKey$get(MemorySegment seg) {
        return (int)tagMCI_BREAK_PARMS.nVirtKey$VH.get(seg);
    }
    public static void nVirtKey$set( MemorySegment seg, int x) {
        tagMCI_BREAK_PARMS.nVirtKey$VH.set(seg, x);
    }
    public static int nVirtKey$get(MemorySegment seg, long index) {
        return (int)tagMCI_BREAK_PARMS.nVirtKey$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nVirtKey$set(MemorySegment seg, long index, int x) {
        tagMCI_BREAK_PARMS.nVirtKey$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hwndBreak$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hwndBreak"));
    public static VarHandle hwndBreak$VH() {
        return tagMCI_BREAK_PARMS.hwndBreak$VH;
    }
    public static MemoryAddress hwndBreak$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagMCI_BREAK_PARMS.hwndBreak$VH.get(seg);
    }
    public static void hwndBreak$set( MemorySegment seg, MemoryAddress x) {
        tagMCI_BREAK_PARMS.hwndBreak$VH.set(seg, x);
    }
    public static MemoryAddress hwndBreak$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagMCI_BREAK_PARMS.hwndBreak$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hwndBreak$set(MemorySegment seg, long index, MemoryAddress x) {
        tagMCI_BREAK_PARMS.hwndBreak$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


