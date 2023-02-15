// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class XMapEvent {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("type"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_LONG_LONG$LAYOUT.withName("serial"),
        Constants$root.C_INT$LAYOUT.withName("send_event"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("display"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("event"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("window"),
        Constants$root.C_INT$LAYOUT.withName("override_redirect"),
        MemoryLayout.paddingLayout(32)
    );
    public static MemoryLayout $LAYOUT() {
        return XMapEvent.$struct$LAYOUT;
    }
    static final VarHandle type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("type"));
    public static VarHandle type$VH() {
        return XMapEvent.type$VH;
    }
    public static int type$get(MemorySegment seg) {
        return (int)XMapEvent.type$VH.get(seg);
    }
    public static void type$set( MemorySegment seg, int x) {
        XMapEvent.type$VH.set(seg, x);
    }
    public static int type$get(MemorySegment seg, long index) {
        return (int)XMapEvent.type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, int x) {
        XMapEvent.type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle serial$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("serial"));
    public static VarHandle serial$VH() {
        return XMapEvent.serial$VH;
    }
    public static long serial$get(MemorySegment seg) {
        return (long)XMapEvent.serial$VH.get(seg);
    }
    public static void serial$set( MemorySegment seg, long x) {
        XMapEvent.serial$VH.set(seg, x);
    }
    public static long serial$get(MemorySegment seg, long index) {
        return (long)XMapEvent.serial$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void serial$set(MemorySegment seg, long index, long x) {
        XMapEvent.serial$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle send_event$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("send_event"));
    public static VarHandle send_event$VH() {
        return XMapEvent.send_event$VH;
    }
    public static int send_event$get(MemorySegment seg) {
        return (int)XMapEvent.send_event$VH.get(seg);
    }
    public static void send_event$set( MemorySegment seg, int x) {
        XMapEvent.send_event$VH.set(seg, x);
    }
    public static int send_event$get(MemorySegment seg, long index) {
        return (int)XMapEvent.send_event$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void send_event$set(MemorySegment seg, long index, int x) {
        XMapEvent.send_event$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle display$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("display"));
    public static VarHandle display$VH() {
        return XMapEvent.display$VH;
    }
    public static MemoryAddress display$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)XMapEvent.display$VH.get(seg);
    }
    public static void display$set( MemorySegment seg, MemoryAddress x) {
        XMapEvent.display$VH.set(seg, x);
    }
    public static MemoryAddress display$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)XMapEvent.display$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void display$set(MemorySegment seg, long index, MemoryAddress x) {
        XMapEvent.display$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle event$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("event"));
    public static VarHandle event$VH() {
        return XMapEvent.event$VH;
    }
    public static long event$get(MemorySegment seg) {
        return (long)XMapEvent.event$VH.get(seg);
    }
    public static void event$set( MemorySegment seg, long x) {
        XMapEvent.event$VH.set(seg, x);
    }
    public static long event$get(MemorySegment seg, long index) {
        return (long)XMapEvent.event$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void event$set(MemorySegment seg, long index, long x) {
        XMapEvent.event$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle window$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("window"));
    public static VarHandle window$VH() {
        return XMapEvent.window$VH;
    }
    public static long window$get(MemorySegment seg) {
        return (long)XMapEvent.window$VH.get(seg);
    }
    public static void window$set( MemorySegment seg, long x) {
        XMapEvent.window$VH.set(seg, x);
    }
    public static long window$get(MemorySegment seg, long index) {
        return (long)XMapEvent.window$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void window$set(MemorySegment seg, long index, long x) {
        XMapEvent.window$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle override_redirect$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("override_redirect"));
    public static VarHandle override_redirect$VH() {
        return XMapEvent.override_redirect$VH;
    }
    public static int override_redirect$get(MemorySegment seg) {
        return (int)XMapEvent.override_redirect$VH.get(seg);
    }
    public static void override_redirect$set( MemorySegment seg, int x) {
        XMapEvent.override_redirect$VH.set(seg, x);
    }
    public static int override_redirect$get(MemorySegment seg, long index) {
        return (int)XMapEvent.override_redirect$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void override_redirect$set(MemorySegment seg, long index, int x) {
        XMapEvent.override_redirect$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


