// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagMDICREATESTRUCTA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("szClass"),
        Constants$root.C_POINTER$LAYOUT.withName("szTitle"),
        Constants$root.C_POINTER$LAYOUT.withName("hOwner"),
        Constants$root.C_LONG$LAYOUT.withName("x"),
        Constants$root.C_LONG$LAYOUT.withName("y"),
        Constants$root.C_LONG$LAYOUT.withName("cx"),
        Constants$root.C_LONG$LAYOUT.withName("cy"),
        Constants$root.C_LONG$LAYOUT.withName("style"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_LONG_LONG$LAYOUT.withName("lParam")
    ).withName("tagMDICREATESTRUCTA");
    public static MemoryLayout $LAYOUT() {
        return tagMDICREATESTRUCTA.$struct$LAYOUT;
    }
    static final VarHandle szClass$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("szClass"));
    public static VarHandle szClass$VH() {
        return tagMDICREATESTRUCTA.szClass$VH;
    }
    public static MemoryAddress szClass$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagMDICREATESTRUCTA.szClass$VH.get(seg);
    }
    public static void szClass$set( MemorySegment seg, MemoryAddress x) {
        tagMDICREATESTRUCTA.szClass$VH.set(seg, x);
    }
    public static MemoryAddress szClass$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagMDICREATESTRUCTA.szClass$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void szClass$set(MemorySegment seg, long index, MemoryAddress x) {
        tagMDICREATESTRUCTA.szClass$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle szTitle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("szTitle"));
    public static VarHandle szTitle$VH() {
        return tagMDICREATESTRUCTA.szTitle$VH;
    }
    public static MemoryAddress szTitle$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagMDICREATESTRUCTA.szTitle$VH.get(seg);
    }
    public static void szTitle$set( MemorySegment seg, MemoryAddress x) {
        tagMDICREATESTRUCTA.szTitle$VH.set(seg, x);
    }
    public static MemoryAddress szTitle$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagMDICREATESTRUCTA.szTitle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void szTitle$set(MemorySegment seg, long index, MemoryAddress x) {
        tagMDICREATESTRUCTA.szTitle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hOwner$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hOwner"));
    public static VarHandle hOwner$VH() {
        return tagMDICREATESTRUCTA.hOwner$VH;
    }
    public static MemoryAddress hOwner$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagMDICREATESTRUCTA.hOwner$VH.get(seg);
    }
    public static void hOwner$set( MemorySegment seg, MemoryAddress x) {
        tagMDICREATESTRUCTA.hOwner$VH.set(seg, x);
    }
    public static MemoryAddress hOwner$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagMDICREATESTRUCTA.hOwner$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hOwner$set(MemorySegment seg, long index, MemoryAddress x) {
        tagMDICREATESTRUCTA.hOwner$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle x$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("x"));
    public static VarHandle x$VH() {
        return tagMDICREATESTRUCTA.x$VH;
    }
    public static int x$get(MemorySegment seg) {
        return (int)tagMDICREATESTRUCTA.x$VH.get(seg);
    }
    public static void x$set( MemorySegment seg, int x) {
        tagMDICREATESTRUCTA.x$VH.set(seg, x);
    }
    public static int x$get(MemorySegment seg, long index) {
        return (int)tagMDICREATESTRUCTA.x$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void x$set(MemorySegment seg, long index, int x) {
        tagMDICREATESTRUCTA.x$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle y$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("y"));
    public static VarHandle y$VH() {
        return tagMDICREATESTRUCTA.y$VH;
    }
    public static int y$get(MemorySegment seg) {
        return (int)tagMDICREATESTRUCTA.y$VH.get(seg);
    }
    public static void y$set( MemorySegment seg, int x) {
        tagMDICREATESTRUCTA.y$VH.set(seg, x);
    }
    public static int y$get(MemorySegment seg, long index) {
        return (int)tagMDICREATESTRUCTA.y$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void y$set(MemorySegment seg, long index, int x) {
        tagMDICREATESTRUCTA.y$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cx$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cx"));
    public static VarHandle cx$VH() {
        return tagMDICREATESTRUCTA.cx$VH;
    }
    public static int cx$get(MemorySegment seg) {
        return (int)tagMDICREATESTRUCTA.cx$VH.get(seg);
    }
    public static void cx$set( MemorySegment seg, int x) {
        tagMDICREATESTRUCTA.cx$VH.set(seg, x);
    }
    public static int cx$get(MemorySegment seg, long index) {
        return (int)tagMDICREATESTRUCTA.cx$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cx$set(MemorySegment seg, long index, int x) {
        tagMDICREATESTRUCTA.cx$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cy$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cy"));
    public static VarHandle cy$VH() {
        return tagMDICREATESTRUCTA.cy$VH;
    }
    public static int cy$get(MemorySegment seg) {
        return (int)tagMDICREATESTRUCTA.cy$VH.get(seg);
    }
    public static void cy$set( MemorySegment seg, int x) {
        tagMDICREATESTRUCTA.cy$VH.set(seg, x);
    }
    public static int cy$get(MemorySegment seg, long index) {
        return (int)tagMDICREATESTRUCTA.cy$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cy$set(MemorySegment seg, long index, int x) {
        tagMDICREATESTRUCTA.cy$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle style$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("style"));
    public static VarHandle style$VH() {
        return tagMDICREATESTRUCTA.style$VH;
    }
    public static int style$get(MemorySegment seg) {
        return (int)tagMDICREATESTRUCTA.style$VH.get(seg);
    }
    public static void style$set( MemorySegment seg, int x) {
        tagMDICREATESTRUCTA.style$VH.set(seg, x);
    }
    public static int style$get(MemorySegment seg, long index) {
        return (int)tagMDICREATESTRUCTA.style$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void style$set(MemorySegment seg, long index, int x) {
        tagMDICREATESTRUCTA.style$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lParam$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lParam"));
    public static VarHandle lParam$VH() {
        return tagMDICREATESTRUCTA.lParam$VH;
    }
    public static long lParam$get(MemorySegment seg) {
        return (long)tagMDICREATESTRUCTA.lParam$VH.get(seg);
    }
    public static void lParam$set( MemorySegment seg, long x) {
        tagMDICREATESTRUCTA.lParam$VH.set(seg, x);
    }
    public static long lParam$get(MemorySegment seg, long index) {
        return (long)tagMDICREATESTRUCTA.lParam$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lParam$set(MemorySegment seg, long index, long x) {
        tagMDICREATESTRUCTA.lParam$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


