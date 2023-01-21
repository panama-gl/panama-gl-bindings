// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class XExposeEvent {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("type"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_LONG_LONG$LAYOUT.withName("serial"),
        Constants$root.C_INT$LAYOUT.withName("send_event"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("display"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("window"),
        Constants$root.C_INT$LAYOUT.withName("x"),
        Constants$root.C_INT$LAYOUT.withName("y"),
        Constants$root.C_INT$LAYOUT.withName("width"),
        Constants$root.C_INT$LAYOUT.withName("height"),
        Constants$root.C_INT$LAYOUT.withName("count"),
        MemoryLayout.paddingLayout(32)
    );
    public static MemoryLayout $LAYOUT() {
        return XExposeEvent.$struct$LAYOUT;
    }
    static final VarHandle type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("type"));
    public static VarHandle type$VH() {
        return XExposeEvent.type$VH;
    }
    public static int type$get(MemorySegment seg) {
        return (int)XExposeEvent.type$VH.get(seg);
    }
    public static void type$set( MemorySegment seg, int x) {
        XExposeEvent.type$VH.set(seg, x);
    }
    public static int type$get(MemorySegment seg, long index) {
        return (int)XExposeEvent.type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, int x) {
        XExposeEvent.type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle serial$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("serial"));
    public static VarHandle serial$VH() {
        return XExposeEvent.serial$VH;
    }
    public static long serial$get(MemorySegment seg) {
        return (long)XExposeEvent.serial$VH.get(seg);
    }
    public static void serial$set( MemorySegment seg, long x) {
        XExposeEvent.serial$VH.set(seg, x);
    }
    public static long serial$get(MemorySegment seg, long index) {
        return (long)XExposeEvent.serial$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void serial$set(MemorySegment seg, long index, long x) {
        XExposeEvent.serial$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle send_event$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("send_event"));
    public static VarHandle send_event$VH() {
        return XExposeEvent.send_event$VH;
    }
    public static int send_event$get(MemorySegment seg) {
        return (int)XExposeEvent.send_event$VH.get(seg);
    }
    public static void send_event$set( MemorySegment seg, int x) {
        XExposeEvent.send_event$VH.set(seg, x);
    }
    public static int send_event$get(MemorySegment seg, long index) {
        return (int)XExposeEvent.send_event$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void send_event$set(MemorySegment seg, long index, int x) {
        XExposeEvent.send_event$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle display$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("display"));
    public static VarHandle display$VH() {
        return XExposeEvent.display$VH;
    }
    public static MemoryAddress display$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)XExposeEvent.display$VH.get(seg);
    }
    public static void display$set( MemorySegment seg, MemoryAddress x) {
        XExposeEvent.display$VH.set(seg, x);
    }
    public static MemoryAddress display$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)XExposeEvent.display$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void display$set(MemorySegment seg, long index, MemoryAddress x) {
        XExposeEvent.display$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle window$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("window"));
    public static VarHandle window$VH() {
        return XExposeEvent.window$VH;
    }
    public static long window$get(MemorySegment seg) {
        return (long)XExposeEvent.window$VH.get(seg);
    }
    public static void window$set( MemorySegment seg, long x) {
        XExposeEvent.window$VH.set(seg, x);
    }
    public static long window$get(MemorySegment seg, long index) {
        return (long)XExposeEvent.window$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void window$set(MemorySegment seg, long index, long x) {
        XExposeEvent.window$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle x$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("x"));
    public static VarHandle x$VH() {
        return XExposeEvent.x$VH;
    }
    public static int x$get(MemorySegment seg) {
        return (int)XExposeEvent.x$VH.get(seg);
    }
    public static void x$set( MemorySegment seg, int x) {
        XExposeEvent.x$VH.set(seg, x);
    }
    public static int x$get(MemorySegment seg, long index) {
        return (int)XExposeEvent.x$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void x$set(MemorySegment seg, long index, int x) {
        XExposeEvent.x$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle y$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("y"));
    public static VarHandle y$VH() {
        return XExposeEvent.y$VH;
    }
    public static int y$get(MemorySegment seg) {
        return (int)XExposeEvent.y$VH.get(seg);
    }
    public static void y$set( MemorySegment seg, int x) {
        XExposeEvent.y$VH.set(seg, x);
    }
    public static int y$get(MemorySegment seg, long index) {
        return (int)XExposeEvent.y$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void y$set(MemorySegment seg, long index, int x) {
        XExposeEvent.y$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle width$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("width"));
    public static VarHandle width$VH() {
        return XExposeEvent.width$VH;
    }
    public static int width$get(MemorySegment seg) {
        return (int)XExposeEvent.width$VH.get(seg);
    }
    public static void width$set( MemorySegment seg, int x) {
        XExposeEvent.width$VH.set(seg, x);
    }
    public static int width$get(MemorySegment seg, long index) {
        return (int)XExposeEvent.width$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void width$set(MemorySegment seg, long index, int x) {
        XExposeEvent.width$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle height$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("height"));
    public static VarHandle height$VH() {
        return XExposeEvent.height$VH;
    }
    public static int height$get(MemorySegment seg) {
        return (int)XExposeEvent.height$VH.get(seg);
    }
    public static void height$set( MemorySegment seg, int x) {
        XExposeEvent.height$VH.set(seg, x);
    }
    public static int height$get(MemorySegment seg, long index) {
        return (int)XExposeEvent.height$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void height$set(MemorySegment seg, long index, int x) {
        XExposeEvent.height$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle count$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("count"));
    public static VarHandle count$VH() {
        return XExposeEvent.count$VH;
    }
    public static int count$get(MemorySegment seg) {
        return (int)XExposeEvent.count$VH.get(seg);
    }
    public static void count$set( MemorySegment seg, int x) {
        XExposeEvent.count$VH.set(seg, x);
    }
    public static int count$get(MemorySegment seg, long index) {
        return (int)XExposeEvent.count$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void count$set(MemorySegment seg, long index, int x) {
        XExposeEvent.count$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


