// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class DLGTEMPLATE {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("style"),
        Constants$root.C_LONG$LAYOUT.withName("dwExtendedStyle"),
        Constants$root.C_SHORT$LAYOUT.withName("cdit"),
        Constants$root.C_SHORT$LAYOUT.withName("x"),
        Constants$root.C_SHORT$LAYOUT.withName("y"),
        Constants$root.C_SHORT$LAYOUT.withName("cx"),
        Constants$root.C_SHORT$LAYOUT.withName("cy")
    );
    public static MemoryLayout $LAYOUT() {
        return DLGTEMPLATE.$struct$LAYOUT;
    }
    static final VarHandle style$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("style"));
    public static VarHandle style$VH() {
        return DLGTEMPLATE.style$VH;
    }
    public static int style$get(MemorySegment seg) {
        return (int)DLGTEMPLATE.style$VH.get(seg);
    }
    public static void style$set( MemorySegment seg, int x) {
        DLGTEMPLATE.style$VH.set(seg, x);
    }
    public static int style$get(MemorySegment seg, long index) {
        return (int)DLGTEMPLATE.style$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void style$set(MemorySegment seg, long index, int x) {
        DLGTEMPLATE.style$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwExtendedStyle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwExtendedStyle"));
    public static VarHandle dwExtendedStyle$VH() {
        return DLGTEMPLATE.dwExtendedStyle$VH;
    }
    public static int dwExtendedStyle$get(MemorySegment seg) {
        return (int)DLGTEMPLATE.dwExtendedStyle$VH.get(seg);
    }
    public static void dwExtendedStyle$set( MemorySegment seg, int x) {
        DLGTEMPLATE.dwExtendedStyle$VH.set(seg, x);
    }
    public static int dwExtendedStyle$get(MemorySegment seg, long index) {
        return (int)DLGTEMPLATE.dwExtendedStyle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwExtendedStyle$set(MemorySegment seg, long index, int x) {
        DLGTEMPLATE.dwExtendedStyle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cdit$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cdit"));
    public static VarHandle cdit$VH() {
        return DLGTEMPLATE.cdit$VH;
    }
    public static short cdit$get(MemorySegment seg) {
        return (short)DLGTEMPLATE.cdit$VH.get(seg);
    }
    public static void cdit$set( MemorySegment seg, short x) {
        DLGTEMPLATE.cdit$VH.set(seg, x);
    }
    public static short cdit$get(MemorySegment seg, long index) {
        return (short)DLGTEMPLATE.cdit$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cdit$set(MemorySegment seg, long index, short x) {
        DLGTEMPLATE.cdit$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle x$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("x"));
    public static VarHandle x$VH() {
        return DLGTEMPLATE.x$VH;
    }
    public static short x$get(MemorySegment seg) {
        return (short)DLGTEMPLATE.x$VH.get(seg);
    }
    public static void x$set( MemorySegment seg, short x) {
        DLGTEMPLATE.x$VH.set(seg, x);
    }
    public static short x$get(MemorySegment seg, long index) {
        return (short)DLGTEMPLATE.x$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void x$set(MemorySegment seg, long index, short x) {
        DLGTEMPLATE.x$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle y$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("y"));
    public static VarHandle y$VH() {
        return DLGTEMPLATE.y$VH;
    }
    public static short y$get(MemorySegment seg) {
        return (short)DLGTEMPLATE.y$VH.get(seg);
    }
    public static void y$set( MemorySegment seg, short x) {
        DLGTEMPLATE.y$VH.set(seg, x);
    }
    public static short y$get(MemorySegment seg, long index) {
        return (short)DLGTEMPLATE.y$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void y$set(MemorySegment seg, long index, short x) {
        DLGTEMPLATE.y$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cx$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cx"));
    public static VarHandle cx$VH() {
        return DLGTEMPLATE.cx$VH;
    }
    public static short cx$get(MemorySegment seg) {
        return (short)DLGTEMPLATE.cx$VH.get(seg);
    }
    public static void cx$set( MemorySegment seg, short x) {
        DLGTEMPLATE.cx$VH.set(seg, x);
    }
    public static short cx$get(MemorySegment seg, long index) {
        return (short)DLGTEMPLATE.cx$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cx$set(MemorySegment seg, long index, short x) {
        DLGTEMPLATE.cx$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cy$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cy"));
    public static VarHandle cy$VH() {
        return DLGTEMPLATE.cy$VH;
    }
    public static short cy$get(MemorySegment seg) {
        return (short)DLGTEMPLATE.cy$VH.get(seg);
    }
    public static void cy$set( MemorySegment seg, short x) {
        DLGTEMPLATE.cy$VH.set(seg, x);
    }
    public static short cy$get(MemorySegment seg, long index) {
        return (short)DLGTEMPLATE.cy$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cy$set(MemorySegment seg, long index, short x) {
        DLGTEMPLATE.cy$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


