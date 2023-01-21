// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class XDestroyWindowEvent {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("type"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_LONG_LONG$LAYOUT.withName("serial"),
        Constants$root.C_INT$LAYOUT.withName("send_event"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("display"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("event"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("window")
    );
    public static MemoryLayout $LAYOUT() {
        return XDestroyWindowEvent.$struct$LAYOUT;
    }
    static final VarHandle type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("type"));
    public static VarHandle type$VH() {
        return XDestroyWindowEvent.type$VH;
    }
    public static int type$get(MemorySegment seg) {
        return (int)XDestroyWindowEvent.type$VH.get(seg);
    }
    public static void type$set( MemorySegment seg, int x) {
        XDestroyWindowEvent.type$VH.set(seg, x);
    }
    public static int type$get(MemorySegment seg, long index) {
        return (int)XDestroyWindowEvent.type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, int x) {
        XDestroyWindowEvent.type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle serial$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("serial"));
    public static VarHandle serial$VH() {
        return XDestroyWindowEvent.serial$VH;
    }
    public static long serial$get(MemorySegment seg) {
        return (long)XDestroyWindowEvent.serial$VH.get(seg);
    }
    public static void serial$set( MemorySegment seg, long x) {
        XDestroyWindowEvent.serial$VH.set(seg, x);
    }
    public static long serial$get(MemorySegment seg, long index) {
        return (long)XDestroyWindowEvent.serial$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void serial$set(MemorySegment seg, long index, long x) {
        XDestroyWindowEvent.serial$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle send_event$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("send_event"));
    public static VarHandle send_event$VH() {
        return XDestroyWindowEvent.send_event$VH;
    }
    public static int send_event$get(MemorySegment seg) {
        return (int)XDestroyWindowEvent.send_event$VH.get(seg);
    }
    public static void send_event$set( MemorySegment seg, int x) {
        XDestroyWindowEvent.send_event$VH.set(seg, x);
    }
    public static int send_event$get(MemorySegment seg, long index) {
        return (int)XDestroyWindowEvent.send_event$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void send_event$set(MemorySegment seg, long index, int x) {
        XDestroyWindowEvent.send_event$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle display$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("display"));
    public static VarHandle display$VH() {
        return XDestroyWindowEvent.display$VH;
    }
    public static MemoryAddress display$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)XDestroyWindowEvent.display$VH.get(seg);
    }
    public static void display$set( MemorySegment seg, MemoryAddress x) {
        XDestroyWindowEvent.display$VH.set(seg, x);
    }
    public static MemoryAddress display$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)XDestroyWindowEvent.display$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void display$set(MemorySegment seg, long index, MemoryAddress x) {
        XDestroyWindowEvent.display$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle event$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("event"));
    public static VarHandle event$VH() {
        return XDestroyWindowEvent.event$VH;
    }
    public static long event$get(MemorySegment seg) {
        return (long)XDestroyWindowEvent.event$VH.get(seg);
    }
    public static void event$set( MemorySegment seg, long x) {
        XDestroyWindowEvent.event$VH.set(seg, x);
    }
    public static long event$get(MemorySegment seg, long index) {
        return (long)XDestroyWindowEvent.event$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void event$set(MemorySegment seg, long index, long x) {
        XDestroyWindowEvent.event$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle window$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("window"));
    public static VarHandle window$VH() {
        return XDestroyWindowEvent.window$VH;
    }
    public static long window$get(MemorySegment seg) {
        return (long)XDestroyWindowEvent.window$VH.get(seg);
    }
    public static void window$set( MemorySegment seg, long x) {
        XDestroyWindowEvent.window$VH.set(seg, x);
    }
    public static long window$get(MemorySegment seg, long index) {
        return (long)XDestroyWindowEvent.window$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void window$set(MemorySegment seg, long index, long x) {
        XDestroyWindowEvent.window$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


