// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagWINDOWINFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("left"),
            Constants$root.C_LONG$LAYOUT.withName("top"),
            Constants$root.C_LONG$LAYOUT.withName("right"),
            Constants$root.C_LONG$LAYOUT.withName("bottom")
        ).withName("rcWindow"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("left"),
            Constants$root.C_LONG$LAYOUT.withName("top"),
            Constants$root.C_LONG$LAYOUT.withName("right"),
            Constants$root.C_LONG$LAYOUT.withName("bottom")
        ).withName("rcClient"),
        Constants$root.C_LONG$LAYOUT.withName("dwStyle"),
        Constants$root.C_LONG$LAYOUT.withName("dwExStyle"),
        Constants$root.C_LONG$LAYOUT.withName("dwWindowStatus"),
        Constants$root.C_LONG$LAYOUT.withName("cxWindowBorders"),
        Constants$root.C_LONG$LAYOUT.withName("cyWindowBorders"),
        Constants$root.C_SHORT$LAYOUT.withName("atomWindowType"),
        Constants$root.C_SHORT$LAYOUT.withName("wCreatorVersion")
    ).withName("tagWINDOWINFO");
    public static MemoryLayout $LAYOUT() {
        return tagWINDOWINFO.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return tagWINDOWINFO.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)tagWINDOWINFO.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        tagWINDOWINFO.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)tagWINDOWINFO.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        tagWINDOWINFO.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment rcWindow$slice(MemorySegment seg) {
        return seg.asSlice(4, 16);
    }
    public static MemorySegment rcClient$slice(MemorySegment seg) {
        return seg.asSlice(20, 16);
    }
    static final VarHandle dwStyle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwStyle"));
    public static VarHandle dwStyle$VH() {
        return tagWINDOWINFO.dwStyle$VH;
    }
    public static int dwStyle$get(MemorySegment seg) {
        return (int)tagWINDOWINFO.dwStyle$VH.get(seg);
    }
    public static void dwStyle$set( MemorySegment seg, int x) {
        tagWINDOWINFO.dwStyle$VH.set(seg, x);
    }
    public static int dwStyle$get(MemorySegment seg, long index) {
        return (int)tagWINDOWINFO.dwStyle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwStyle$set(MemorySegment seg, long index, int x) {
        tagWINDOWINFO.dwStyle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwExStyle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwExStyle"));
    public static VarHandle dwExStyle$VH() {
        return tagWINDOWINFO.dwExStyle$VH;
    }
    public static int dwExStyle$get(MemorySegment seg) {
        return (int)tagWINDOWINFO.dwExStyle$VH.get(seg);
    }
    public static void dwExStyle$set( MemorySegment seg, int x) {
        tagWINDOWINFO.dwExStyle$VH.set(seg, x);
    }
    public static int dwExStyle$get(MemorySegment seg, long index) {
        return (int)tagWINDOWINFO.dwExStyle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwExStyle$set(MemorySegment seg, long index, int x) {
        tagWINDOWINFO.dwExStyle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwWindowStatus$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwWindowStatus"));
    public static VarHandle dwWindowStatus$VH() {
        return tagWINDOWINFO.dwWindowStatus$VH;
    }
    public static int dwWindowStatus$get(MemorySegment seg) {
        return (int)tagWINDOWINFO.dwWindowStatus$VH.get(seg);
    }
    public static void dwWindowStatus$set( MemorySegment seg, int x) {
        tagWINDOWINFO.dwWindowStatus$VH.set(seg, x);
    }
    public static int dwWindowStatus$get(MemorySegment seg, long index) {
        return (int)tagWINDOWINFO.dwWindowStatus$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwWindowStatus$set(MemorySegment seg, long index, int x) {
        tagWINDOWINFO.dwWindowStatus$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cxWindowBorders$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cxWindowBorders"));
    public static VarHandle cxWindowBorders$VH() {
        return tagWINDOWINFO.cxWindowBorders$VH;
    }
    public static int cxWindowBorders$get(MemorySegment seg) {
        return (int)tagWINDOWINFO.cxWindowBorders$VH.get(seg);
    }
    public static void cxWindowBorders$set( MemorySegment seg, int x) {
        tagWINDOWINFO.cxWindowBorders$VH.set(seg, x);
    }
    public static int cxWindowBorders$get(MemorySegment seg, long index) {
        return (int)tagWINDOWINFO.cxWindowBorders$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cxWindowBorders$set(MemorySegment seg, long index, int x) {
        tagWINDOWINFO.cxWindowBorders$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cyWindowBorders$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cyWindowBorders"));
    public static VarHandle cyWindowBorders$VH() {
        return tagWINDOWINFO.cyWindowBorders$VH;
    }
    public static int cyWindowBorders$get(MemorySegment seg) {
        return (int)tagWINDOWINFO.cyWindowBorders$VH.get(seg);
    }
    public static void cyWindowBorders$set( MemorySegment seg, int x) {
        tagWINDOWINFO.cyWindowBorders$VH.set(seg, x);
    }
    public static int cyWindowBorders$get(MemorySegment seg, long index) {
        return (int)tagWINDOWINFO.cyWindowBorders$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cyWindowBorders$set(MemorySegment seg, long index, int x) {
        tagWINDOWINFO.cyWindowBorders$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle atomWindowType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("atomWindowType"));
    public static VarHandle atomWindowType$VH() {
        return tagWINDOWINFO.atomWindowType$VH;
    }
    public static short atomWindowType$get(MemorySegment seg) {
        return (short)tagWINDOWINFO.atomWindowType$VH.get(seg);
    }
    public static void atomWindowType$set( MemorySegment seg, short x) {
        tagWINDOWINFO.atomWindowType$VH.set(seg, x);
    }
    public static short atomWindowType$get(MemorySegment seg, long index) {
        return (short)tagWINDOWINFO.atomWindowType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void atomWindowType$set(MemorySegment seg, long index, short x) {
        tagWINDOWINFO.atomWindowType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wCreatorVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wCreatorVersion"));
    public static VarHandle wCreatorVersion$VH() {
        return tagWINDOWINFO.wCreatorVersion$VH;
    }
    public static short wCreatorVersion$get(MemorySegment seg) {
        return (short)tagWINDOWINFO.wCreatorVersion$VH.get(seg);
    }
    public static void wCreatorVersion$set( MemorySegment seg, short x) {
        tagWINDOWINFO.wCreatorVersion$VH.set(seg, x);
    }
    public static short wCreatorVersion$get(MemorySegment seg, long index) {
        return (short)tagWINDOWINFO.wCreatorVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wCreatorVersion$set(MemorySegment seg, long index, short x) {
        tagWINDOWINFO.wCreatorVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


