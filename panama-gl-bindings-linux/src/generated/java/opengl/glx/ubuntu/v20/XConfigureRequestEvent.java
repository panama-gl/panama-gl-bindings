// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.VarHandle;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.MemoryHandles;
import jdk.incubator.foreign.MemoryLayout;
import jdk.incubator.foreign.MemorySegment;
import jdk.incubator.foreign.ResourceScope;
import jdk.incubator.foreign.SegmentAllocator;
public class XConfigureRequestEvent {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_INT.withName("type"),
        MemoryLayout.paddingLayout(32),
        C_LONG.withName("serial"),
        C_INT.withName("send_event"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("display"),
        C_LONG.withName("parent"),
        C_LONG.withName("window"),
        C_INT.withName("x"),
        C_INT.withName("y"),
        C_INT.withName("width"),
        C_INT.withName("height"),
        C_INT.withName("border_width"),
        MemoryLayout.paddingLayout(32),
        C_LONG.withName("above"),
        C_INT.withName("detail"),
        MemoryLayout.paddingLayout(32),
        C_LONG.withName("value_mask")
    );
    public static MemoryLayout $LAYOUT() {
        return XConfigureRequestEvent.$struct$LAYOUT;
    }
    static final VarHandle type$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("type"));
    public static VarHandle type$VH() {
        return XConfigureRequestEvent.type$VH;
    }
    public static int type$get(MemorySegment seg) {
        return (int)XConfigureRequestEvent.type$VH.get(seg);
    }
    public static void type$set( MemorySegment seg, int x) {
        XConfigureRequestEvent.type$VH.set(seg, x);
    }
    public static int type$get(MemorySegment seg, long index) {
        return (int)XConfigureRequestEvent.type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, int x) {
        XConfigureRequestEvent.type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle serial$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("serial"));
    public static VarHandle serial$VH() {
        return XConfigureRequestEvent.serial$VH;
    }
    public static long serial$get(MemorySegment seg) {
        return (long)XConfigureRequestEvent.serial$VH.get(seg);
    }
    public static void serial$set( MemorySegment seg, long x) {
        XConfigureRequestEvent.serial$VH.set(seg, x);
    }
    public static long serial$get(MemorySegment seg, long index) {
        return (long)XConfigureRequestEvent.serial$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void serial$set(MemorySegment seg, long index, long x) {
        XConfigureRequestEvent.serial$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle send_event$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("send_event"));
    public static VarHandle send_event$VH() {
        return XConfigureRequestEvent.send_event$VH;
    }
    public static int send_event$get(MemorySegment seg) {
        return (int)XConfigureRequestEvent.send_event$VH.get(seg);
    }
    public static void send_event$set( MemorySegment seg, int x) {
        XConfigureRequestEvent.send_event$VH.set(seg, x);
    }
    public static int send_event$get(MemorySegment seg, long index) {
        return (int)XConfigureRequestEvent.send_event$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void send_event$set(MemorySegment seg, long index, int x) {
        XConfigureRequestEvent.send_event$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle display$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("display")));
    public static VarHandle display$VH() {
        return XConfigureRequestEvent.display$VH;
    }
    public static MemoryAddress display$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)XConfigureRequestEvent.display$VH.get(seg);
    }
    public static void display$set( MemorySegment seg, MemoryAddress x) {
        XConfigureRequestEvent.display$VH.set(seg, x);
    }
    public static MemoryAddress display$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)XConfigureRequestEvent.display$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void display$set(MemorySegment seg, long index, MemoryAddress x) {
        XConfigureRequestEvent.display$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle parent$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("parent"));
    public static VarHandle parent$VH() {
        return XConfigureRequestEvent.parent$VH;
    }
    public static long parent$get(MemorySegment seg) {
        return (long)XConfigureRequestEvent.parent$VH.get(seg);
    }
    public static void parent$set( MemorySegment seg, long x) {
        XConfigureRequestEvent.parent$VH.set(seg, x);
    }
    public static long parent$get(MemorySegment seg, long index) {
        return (long)XConfigureRequestEvent.parent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void parent$set(MemorySegment seg, long index, long x) {
        XConfigureRequestEvent.parent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle window$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("window"));
    public static VarHandle window$VH() {
        return XConfigureRequestEvent.window$VH;
    }
    public static long window$get(MemorySegment seg) {
        return (long)XConfigureRequestEvent.window$VH.get(seg);
    }
    public static void window$set( MemorySegment seg, long x) {
        XConfigureRequestEvent.window$VH.set(seg, x);
    }
    public static long window$get(MemorySegment seg, long index) {
        return (long)XConfigureRequestEvent.window$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void window$set(MemorySegment seg, long index, long x) {
        XConfigureRequestEvent.window$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle x$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("x"));
    public static VarHandle x$VH() {
        return XConfigureRequestEvent.x$VH;
    }
    public static int x$get(MemorySegment seg) {
        return (int)XConfigureRequestEvent.x$VH.get(seg);
    }
    public static void x$set( MemorySegment seg, int x) {
        XConfigureRequestEvent.x$VH.set(seg, x);
    }
    public static int x$get(MemorySegment seg, long index) {
        return (int)XConfigureRequestEvent.x$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void x$set(MemorySegment seg, long index, int x) {
        XConfigureRequestEvent.x$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle y$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("y"));
    public static VarHandle y$VH() {
        return XConfigureRequestEvent.y$VH;
    }
    public static int y$get(MemorySegment seg) {
        return (int)XConfigureRequestEvent.y$VH.get(seg);
    }
    public static void y$set( MemorySegment seg, int x) {
        XConfigureRequestEvent.y$VH.set(seg, x);
    }
    public static int y$get(MemorySegment seg, long index) {
        return (int)XConfigureRequestEvent.y$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void y$set(MemorySegment seg, long index, int x) {
        XConfigureRequestEvent.y$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle width$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("width"));
    public static VarHandle width$VH() {
        return XConfigureRequestEvent.width$VH;
    }
    public static int width$get(MemorySegment seg) {
        return (int)XConfigureRequestEvent.width$VH.get(seg);
    }
    public static void width$set( MemorySegment seg, int x) {
        XConfigureRequestEvent.width$VH.set(seg, x);
    }
    public static int width$get(MemorySegment seg, long index) {
        return (int)XConfigureRequestEvent.width$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void width$set(MemorySegment seg, long index, int x) {
        XConfigureRequestEvent.width$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle height$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("height"));
    public static VarHandle height$VH() {
        return XConfigureRequestEvent.height$VH;
    }
    public static int height$get(MemorySegment seg) {
        return (int)XConfigureRequestEvent.height$VH.get(seg);
    }
    public static void height$set( MemorySegment seg, int x) {
        XConfigureRequestEvent.height$VH.set(seg, x);
    }
    public static int height$get(MemorySegment seg, long index) {
        return (int)XConfigureRequestEvent.height$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void height$set(MemorySegment seg, long index, int x) {
        XConfigureRequestEvent.height$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle border_width$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("border_width"));
    public static VarHandle border_width$VH() {
        return XConfigureRequestEvent.border_width$VH;
    }
    public static int border_width$get(MemorySegment seg) {
        return (int)XConfigureRequestEvent.border_width$VH.get(seg);
    }
    public static void border_width$set( MemorySegment seg, int x) {
        XConfigureRequestEvent.border_width$VH.set(seg, x);
    }
    public static int border_width$get(MemorySegment seg, long index) {
        return (int)XConfigureRequestEvent.border_width$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void border_width$set(MemorySegment seg, long index, int x) {
        XConfigureRequestEvent.border_width$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle above$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("above"));
    public static VarHandle above$VH() {
        return XConfigureRequestEvent.above$VH;
    }
    public static long above$get(MemorySegment seg) {
        return (long)XConfigureRequestEvent.above$VH.get(seg);
    }
    public static void above$set( MemorySegment seg, long x) {
        XConfigureRequestEvent.above$VH.set(seg, x);
    }
    public static long above$get(MemorySegment seg, long index) {
        return (long)XConfigureRequestEvent.above$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void above$set(MemorySegment seg, long index, long x) {
        XConfigureRequestEvent.above$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle detail$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("detail"));
    public static VarHandle detail$VH() {
        return XConfigureRequestEvent.detail$VH;
    }
    public static int detail$get(MemorySegment seg) {
        return (int)XConfigureRequestEvent.detail$VH.get(seg);
    }
    public static void detail$set( MemorySegment seg, int x) {
        XConfigureRequestEvent.detail$VH.set(seg, x);
    }
    public static int detail$get(MemorySegment seg, long index) {
        return (int)XConfigureRequestEvent.detail$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void detail$set(MemorySegment seg, long index, int x) {
        XConfigureRequestEvent.detail$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle value_mask$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("value_mask"));
    public static VarHandle value_mask$VH() {
        return XConfigureRequestEvent.value_mask$VH;
    }
    public static long value_mask$get(MemorySegment seg) {
        return (long)XConfigureRequestEvent.value_mask$VH.get(seg);
    }
    public static void value_mask$set( MemorySegment seg, long x) {
        XConfigureRequestEvent.value_mask$VH.set(seg, x);
    }
    public static long value_mask$get(MemorySegment seg, long index) {
        return (long)XConfigureRequestEvent.value_mask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void value_mask$set(MemorySegment seg, long index, long x) {
        XConfigureRequestEvent.value_mask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocate(ResourceScope scope) { return allocate(SegmentAllocator.ofScope(scope)); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment allocateArray(int len, ResourceScope scope) {
        return allocateArray(len, SegmentAllocator.ofScope(scope));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, ResourceScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


