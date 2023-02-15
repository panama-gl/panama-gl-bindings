// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class XMotionEvent {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("type"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_LONG_LONG$LAYOUT.withName("serial"),
        Constants$root.C_INT$LAYOUT.withName("send_event"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("display"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("window"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("root"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("subwindow"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("time"),
        Constants$root.C_INT$LAYOUT.withName("x"),
        Constants$root.C_INT$LAYOUT.withName("y"),
        Constants$root.C_INT$LAYOUT.withName("x_root"),
        Constants$root.C_INT$LAYOUT.withName("y_root"),
        Constants$root.C_INT$LAYOUT.withName("state"),
        Constants$root.C_CHAR$LAYOUT.withName("is_hint"),
        MemoryLayout.paddingLayout(24),
        Constants$root.C_INT$LAYOUT.withName("same_screen"),
        MemoryLayout.paddingLayout(32)
    );
    public static MemoryLayout $LAYOUT() {
        return XMotionEvent.$struct$LAYOUT;
    }
    static final VarHandle type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("type"));
    public static VarHandle type$VH() {
        return XMotionEvent.type$VH;
    }
    public static int type$get(MemorySegment seg) {
        return (int)XMotionEvent.type$VH.get(seg);
    }
    public static void type$set( MemorySegment seg, int x) {
        XMotionEvent.type$VH.set(seg, x);
    }
    public static int type$get(MemorySegment seg, long index) {
        return (int)XMotionEvent.type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, int x) {
        XMotionEvent.type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle serial$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("serial"));
    public static VarHandle serial$VH() {
        return XMotionEvent.serial$VH;
    }
    public static long serial$get(MemorySegment seg) {
        return (long)XMotionEvent.serial$VH.get(seg);
    }
    public static void serial$set( MemorySegment seg, long x) {
        XMotionEvent.serial$VH.set(seg, x);
    }
    public static long serial$get(MemorySegment seg, long index) {
        return (long)XMotionEvent.serial$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void serial$set(MemorySegment seg, long index, long x) {
        XMotionEvent.serial$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle send_event$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("send_event"));
    public static VarHandle send_event$VH() {
        return XMotionEvent.send_event$VH;
    }
    public static int send_event$get(MemorySegment seg) {
        return (int)XMotionEvent.send_event$VH.get(seg);
    }
    public static void send_event$set( MemorySegment seg, int x) {
        XMotionEvent.send_event$VH.set(seg, x);
    }
    public static int send_event$get(MemorySegment seg, long index) {
        return (int)XMotionEvent.send_event$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void send_event$set(MemorySegment seg, long index, int x) {
        XMotionEvent.send_event$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle display$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("display"));
    public static VarHandle display$VH() {
        return XMotionEvent.display$VH;
    }
    public static MemoryAddress display$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)XMotionEvent.display$VH.get(seg);
    }
    public static void display$set( MemorySegment seg, MemoryAddress x) {
        XMotionEvent.display$VH.set(seg, x);
    }
    public static MemoryAddress display$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)XMotionEvent.display$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void display$set(MemorySegment seg, long index, MemoryAddress x) {
        XMotionEvent.display$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle window$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("window"));
    public static VarHandle window$VH() {
        return XMotionEvent.window$VH;
    }
    public static long window$get(MemorySegment seg) {
        return (long)XMotionEvent.window$VH.get(seg);
    }
    public static void window$set( MemorySegment seg, long x) {
        XMotionEvent.window$VH.set(seg, x);
    }
    public static long window$get(MemorySegment seg, long index) {
        return (long)XMotionEvent.window$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void window$set(MemorySegment seg, long index, long x) {
        XMotionEvent.window$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle root$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("root"));
    public static VarHandle root$VH() {
        return XMotionEvent.root$VH;
    }
    public static long root$get(MemorySegment seg) {
        return (long)XMotionEvent.root$VH.get(seg);
    }
    public static void root$set( MemorySegment seg, long x) {
        XMotionEvent.root$VH.set(seg, x);
    }
    public static long root$get(MemorySegment seg, long index) {
        return (long)XMotionEvent.root$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void root$set(MemorySegment seg, long index, long x) {
        XMotionEvent.root$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle subwindow$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("subwindow"));
    public static VarHandle subwindow$VH() {
        return XMotionEvent.subwindow$VH;
    }
    public static long subwindow$get(MemorySegment seg) {
        return (long)XMotionEvent.subwindow$VH.get(seg);
    }
    public static void subwindow$set( MemorySegment seg, long x) {
        XMotionEvent.subwindow$VH.set(seg, x);
    }
    public static long subwindow$get(MemorySegment seg, long index) {
        return (long)XMotionEvent.subwindow$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void subwindow$set(MemorySegment seg, long index, long x) {
        XMotionEvent.subwindow$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle time$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("time"));
    public static VarHandle time$VH() {
        return XMotionEvent.time$VH;
    }
    public static long time$get(MemorySegment seg) {
        return (long)XMotionEvent.time$VH.get(seg);
    }
    public static void time$set( MemorySegment seg, long x) {
        XMotionEvent.time$VH.set(seg, x);
    }
    public static long time$get(MemorySegment seg, long index) {
        return (long)XMotionEvent.time$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void time$set(MemorySegment seg, long index, long x) {
        XMotionEvent.time$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle x$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("x"));
    public static VarHandle x$VH() {
        return XMotionEvent.x$VH;
    }
    public static int x$get(MemorySegment seg) {
        return (int)XMotionEvent.x$VH.get(seg);
    }
    public static void x$set( MemorySegment seg, int x) {
        XMotionEvent.x$VH.set(seg, x);
    }
    public static int x$get(MemorySegment seg, long index) {
        return (int)XMotionEvent.x$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void x$set(MemorySegment seg, long index, int x) {
        XMotionEvent.x$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle y$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("y"));
    public static VarHandle y$VH() {
        return XMotionEvent.y$VH;
    }
    public static int y$get(MemorySegment seg) {
        return (int)XMotionEvent.y$VH.get(seg);
    }
    public static void y$set( MemorySegment seg, int x) {
        XMotionEvent.y$VH.set(seg, x);
    }
    public static int y$get(MemorySegment seg, long index) {
        return (int)XMotionEvent.y$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void y$set(MemorySegment seg, long index, int x) {
        XMotionEvent.y$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle x_root$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("x_root"));
    public static VarHandle x_root$VH() {
        return XMotionEvent.x_root$VH;
    }
    public static int x_root$get(MemorySegment seg) {
        return (int)XMotionEvent.x_root$VH.get(seg);
    }
    public static void x_root$set( MemorySegment seg, int x) {
        XMotionEvent.x_root$VH.set(seg, x);
    }
    public static int x_root$get(MemorySegment seg, long index) {
        return (int)XMotionEvent.x_root$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void x_root$set(MemorySegment seg, long index, int x) {
        XMotionEvent.x_root$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle y_root$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("y_root"));
    public static VarHandle y_root$VH() {
        return XMotionEvent.y_root$VH;
    }
    public static int y_root$get(MemorySegment seg) {
        return (int)XMotionEvent.y_root$VH.get(seg);
    }
    public static void y_root$set( MemorySegment seg, int x) {
        XMotionEvent.y_root$VH.set(seg, x);
    }
    public static int y_root$get(MemorySegment seg, long index) {
        return (int)XMotionEvent.y_root$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void y_root$set(MemorySegment seg, long index, int x) {
        XMotionEvent.y_root$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle state$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("state"));
    public static VarHandle state$VH() {
        return XMotionEvent.state$VH;
    }
    public static int state$get(MemorySegment seg) {
        return (int)XMotionEvent.state$VH.get(seg);
    }
    public static void state$set( MemorySegment seg, int x) {
        XMotionEvent.state$VH.set(seg, x);
    }
    public static int state$get(MemorySegment seg, long index) {
        return (int)XMotionEvent.state$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void state$set(MemorySegment seg, long index, int x) {
        XMotionEvent.state$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle is_hint$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("is_hint"));
    public static VarHandle is_hint$VH() {
        return XMotionEvent.is_hint$VH;
    }
    public static byte is_hint$get(MemorySegment seg) {
        return (byte)XMotionEvent.is_hint$VH.get(seg);
    }
    public static void is_hint$set( MemorySegment seg, byte x) {
        XMotionEvent.is_hint$VH.set(seg, x);
    }
    public static byte is_hint$get(MemorySegment seg, long index) {
        return (byte)XMotionEvent.is_hint$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void is_hint$set(MemorySegment seg, long index, byte x) {
        XMotionEvent.is_hint$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle same_screen$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("same_screen"));
    public static VarHandle same_screen$VH() {
        return XMotionEvent.same_screen$VH;
    }
    public static int same_screen$get(MemorySegment seg) {
        return (int)XMotionEvent.same_screen$VH.get(seg);
    }
    public static void same_screen$set( MemorySegment seg, int x) {
        XMotionEvent.same_screen$VH.set(seg, x);
    }
    public static int same_screen$get(MemorySegment seg, long index) {
        return (int)XMotionEvent.same_screen$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void same_screen$set(MemorySegment seg, long index, int x) {
        XMotionEvent.same_screen$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


