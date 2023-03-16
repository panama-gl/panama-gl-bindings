// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagCREATESTRUCTW {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("lpCreateParams"),
        Constants$root.C_POINTER$LAYOUT.withName("hInstance"),
        Constants$root.C_POINTER$LAYOUT.withName("hMenu"),
        Constants$root.C_POINTER$LAYOUT.withName("hwndParent"),
        Constants$root.C_LONG$LAYOUT.withName("cy"),
        Constants$root.C_LONG$LAYOUT.withName("cx"),
        Constants$root.C_LONG$LAYOUT.withName("y"),
        Constants$root.C_LONG$LAYOUT.withName("x"),
        Constants$root.C_LONG$LAYOUT.withName("style"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("lpszName"),
        Constants$root.C_POINTER$LAYOUT.withName("lpszClass"),
        Constants$root.C_LONG$LAYOUT.withName("dwExStyle"),
        MemoryLayout.paddingLayout(32)
    ).withName("tagCREATESTRUCTW");
    public static MemoryLayout $LAYOUT() {
        return tagCREATESTRUCTW.$struct$LAYOUT;
    }
    static final VarHandle lpCreateParams$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpCreateParams"));
    public static VarHandle lpCreateParams$VH() {
        return tagCREATESTRUCTW.lpCreateParams$VH;
    }
    public static MemoryAddress lpCreateParams$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagCREATESTRUCTW.lpCreateParams$VH.get(seg);
    }
    public static void lpCreateParams$set( MemorySegment seg, MemoryAddress x) {
        tagCREATESTRUCTW.lpCreateParams$VH.set(seg, x);
    }
    public static MemoryAddress lpCreateParams$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagCREATESTRUCTW.lpCreateParams$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpCreateParams$set(MemorySegment seg, long index, MemoryAddress x) {
        tagCREATESTRUCTW.lpCreateParams$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hInstance$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hInstance"));
    public static VarHandle hInstance$VH() {
        return tagCREATESTRUCTW.hInstance$VH;
    }
    public static MemoryAddress hInstance$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagCREATESTRUCTW.hInstance$VH.get(seg);
    }
    public static void hInstance$set( MemorySegment seg, MemoryAddress x) {
        tagCREATESTRUCTW.hInstance$VH.set(seg, x);
    }
    public static MemoryAddress hInstance$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagCREATESTRUCTW.hInstance$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hInstance$set(MemorySegment seg, long index, MemoryAddress x) {
        tagCREATESTRUCTW.hInstance$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hMenu$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hMenu"));
    public static VarHandle hMenu$VH() {
        return tagCREATESTRUCTW.hMenu$VH;
    }
    public static MemoryAddress hMenu$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagCREATESTRUCTW.hMenu$VH.get(seg);
    }
    public static void hMenu$set( MemorySegment seg, MemoryAddress x) {
        tagCREATESTRUCTW.hMenu$VH.set(seg, x);
    }
    public static MemoryAddress hMenu$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagCREATESTRUCTW.hMenu$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hMenu$set(MemorySegment seg, long index, MemoryAddress x) {
        tagCREATESTRUCTW.hMenu$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hwndParent$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hwndParent"));
    public static VarHandle hwndParent$VH() {
        return tagCREATESTRUCTW.hwndParent$VH;
    }
    public static MemoryAddress hwndParent$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagCREATESTRUCTW.hwndParent$VH.get(seg);
    }
    public static void hwndParent$set( MemorySegment seg, MemoryAddress x) {
        tagCREATESTRUCTW.hwndParent$VH.set(seg, x);
    }
    public static MemoryAddress hwndParent$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagCREATESTRUCTW.hwndParent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hwndParent$set(MemorySegment seg, long index, MemoryAddress x) {
        tagCREATESTRUCTW.hwndParent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cy$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cy"));
    public static VarHandle cy$VH() {
        return tagCREATESTRUCTW.cy$VH;
    }
    public static int cy$get(MemorySegment seg) {
        return (int)tagCREATESTRUCTW.cy$VH.get(seg);
    }
    public static void cy$set( MemorySegment seg, int x) {
        tagCREATESTRUCTW.cy$VH.set(seg, x);
    }
    public static int cy$get(MemorySegment seg, long index) {
        return (int)tagCREATESTRUCTW.cy$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cy$set(MemorySegment seg, long index, int x) {
        tagCREATESTRUCTW.cy$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cx$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cx"));
    public static VarHandle cx$VH() {
        return tagCREATESTRUCTW.cx$VH;
    }
    public static int cx$get(MemorySegment seg) {
        return (int)tagCREATESTRUCTW.cx$VH.get(seg);
    }
    public static void cx$set( MemorySegment seg, int x) {
        tagCREATESTRUCTW.cx$VH.set(seg, x);
    }
    public static int cx$get(MemorySegment seg, long index) {
        return (int)tagCREATESTRUCTW.cx$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cx$set(MemorySegment seg, long index, int x) {
        tagCREATESTRUCTW.cx$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle y$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("y"));
    public static VarHandle y$VH() {
        return tagCREATESTRUCTW.y$VH;
    }
    public static int y$get(MemorySegment seg) {
        return (int)tagCREATESTRUCTW.y$VH.get(seg);
    }
    public static void y$set( MemorySegment seg, int x) {
        tagCREATESTRUCTW.y$VH.set(seg, x);
    }
    public static int y$get(MemorySegment seg, long index) {
        return (int)tagCREATESTRUCTW.y$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void y$set(MemorySegment seg, long index, int x) {
        tagCREATESTRUCTW.y$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle x$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("x"));
    public static VarHandle x$VH() {
        return tagCREATESTRUCTW.x$VH;
    }
    public static int x$get(MemorySegment seg) {
        return (int)tagCREATESTRUCTW.x$VH.get(seg);
    }
    public static void x$set( MemorySegment seg, int x) {
        tagCREATESTRUCTW.x$VH.set(seg, x);
    }
    public static int x$get(MemorySegment seg, long index) {
        return (int)tagCREATESTRUCTW.x$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void x$set(MemorySegment seg, long index, int x) {
        tagCREATESTRUCTW.x$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle style$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("style"));
    public static VarHandle style$VH() {
        return tagCREATESTRUCTW.style$VH;
    }
    public static int style$get(MemorySegment seg) {
        return (int)tagCREATESTRUCTW.style$VH.get(seg);
    }
    public static void style$set( MemorySegment seg, int x) {
        tagCREATESTRUCTW.style$VH.set(seg, x);
    }
    public static int style$get(MemorySegment seg, long index) {
        return (int)tagCREATESTRUCTW.style$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void style$set(MemorySegment seg, long index, int x) {
        tagCREATESTRUCTW.style$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpszName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpszName"));
    public static VarHandle lpszName$VH() {
        return tagCREATESTRUCTW.lpszName$VH;
    }
    public static MemoryAddress lpszName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagCREATESTRUCTW.lpszName$VH.get(seg);
    }
    public static void lpszName$set( MemorySegment seg, MemoryAddress x) {
        tagCREATESTRUCTW.lpszName$VH.set(seg, x);
    }
    public static MemoryAddress lpszName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagCREATESTRUCTW.lpszName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpszName$set(MemorySegment seg, long index, MemoryAddress x) {
        tagCREATESTRUCTW.lpszName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpszClass$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpszClass"));
    public static VarHandle lpszClass$VH() {
        return tagCREATESTRUCTW.lpszClass$VH;
    }
    public static MemoryAddress lpszClass$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagCREATESTRUCTW.lpszClass$VH.get(seg);
    }
    public static void lpszClass$set( MemorySegment seg, MemoryAddress x) {
        tagCREATESTRUCTW.lpszClass$VH.set(seg, x);
    }
    public static MemoryAddress lpszClass$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagCREATESTRUCTW.lpszClass$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpszClass$set(MemorySegment seg, long index, MemoryAddress x) {
        tagCREATESTRUCTW.lpszClass$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwExStyle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwExStyle"));
    public static VarHandle dwExStyle$VH() {
        return tagCREATESTRUCTW.dwExStyle$VH;
    }
    public static int dwExStyle$get(MemorySegment seg) {
        return (int)tagCREATESTRUCTW.dwExStyle$VH.get(seg);
    }
    public static void dwExStyle$set( MemorySegment seg, int x) {
        tagCREATESTRUCTW.dwExStyle$VH.set(seg, x);
    }
    public static int dwExStyle$get(MemorySegment seg, long index) {
        return (int)tagCREATESTRUCTW.dwExStyle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwExStyle$set(MemorySegment seg, long index, int x) {
        tagCREATESTRUCTW.dwExStyle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

