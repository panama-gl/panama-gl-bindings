// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagHARDWAREHOOKSTRUCT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("hwnd"),
        Constants$root.C_LONG$LAYOUT.withName("message"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_LONG_LONG$LAYOUT.withName("wParam"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("lParam")
    ).withName("tagHARDWAREHOOKSTRUCT");
    public static MemoryLayout $LAYOUT() {
        return tagHARDWAREHOOKSTRUCT.$struct$LAYOUT;
    }
    static final VarHandle hwnd$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hwnd"));
    public static VarHandle hwnd$VH() {
        return tagHARDWAREHOOKSTRUCT.hwnd$VH;
    }
    public static MemoryAddress hwnd$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagHARDWAREHOOKSTRUCT.hwnd$VH.get(seg);
    }
    public static void hwnd$set( MemorySegment seg, MemoryAddress x) {
        tagHARDWAREHOOKSTRUCT.hwnd$VH.set(seg, x);
    }
    public static MemoryAddress hwnd$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagHARDWAREHOOKSTRUCT.hwnd$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hwnd$set(MemorySegment seg, long index, MemoryAddress x) {
        tagHARDWAREHOOKSTRUCT.hwnd$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle message$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("message"));
    public static VarHandle message$VH() {
        return tagHARDWAREHOOKSTRUCT.message$VH;
    }
    public static int message$get(MemorySegment seg) {
        return (int)tagHARDWAREHOOKSTRUCT.message$VH.get(seg);
    }
    public static void message$set( MemorySegment seg, int x) {
        tagHARDWAREHOOKSTRUCT.message$VH.set(seg, x);
    }
    public static int message$get(MemorySegment seg, long index) {
        return (int)tagHARDWAREHOOKSTRUCT.message$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void message$set(MemorySegment seg, long index, int x) {
        tagHARDWAREHOOKSTRUCT.message$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wParam$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wParam"));
    public static VarHandle wParam$VH() {
        return tagHARDWAREHOOKSTRUCT.wParam$VH;
    }
    public static long wParam$get(MemorySegment seg) {
        return (long)tagHARDWAREHOOKSTRUCT.wParam$VH.get(seg);
    }
    public static void wParam$set( MemorySegment seg, long x) {
        tagHARDWAREHOOKSTRUCT.wParam$VH.set(seg, x);
    }
    public static long wParam$get(MemorySegment seg, long index) {
        return (long)tagHARDWAREHOOKSTRUCT.wParam$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wParam$set(MemorySegment seg, long index, long x) {
        tagHARDWAREHOOKSTRUCT.wParam$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lParam$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lParam"));
    public static VarHandle lParam$VH() {
        return tagHARDWAREHOOKSTRUCT.lParam$VH;
    }
    public static long lParam$get(MemorySegment seg) {
        return (long)tagHARDWAREHOOKSTRUCT.lParam$VH.get(seg);
    }
    public static void lParam$set( MemorySegment seg, long x) {
        tagHARDWAREHOOKSTRUCT.lParam$VH.set(seg, x);
    }
    public static long lParam$get(MemorySegment seg, long index) {
        return (long)tagHARDWAREHOOKSTRUCT.lParam$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lParam$set(MemorySegment seg, long index, long x) {
        tagHARDWAREHOOKSTRUCT.lParam$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


