// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class XWMHints {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("flags"),
        Constants$root.C_INT$LAYOUT.withName("input"),
        Constants$root.C_INT$LAYOUT.withName("initial_state"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("icon_pixmap"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("icon_window"),
        Constants$root.C_INT$LAYOUT.withName("icon_x"),
        Constants$root.C_INT$LAYOUT.withName("icon_y"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("icon_mask"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("window_group")
    );
    public static MemoryLayout $LAYOUT() {
        return XWMHints.$struct$LAYOUT;
    }
    static final VarHandle flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("flags"));
    public static VarHandle flags$VH() {
        return XWMHints.flags$VH;
    }
    public static long flags$get(MemorySegment seg) {
        return (long)XWMHints.flags$VH.get(seg);
    }
    public static void flags$set( MemorySegment seg, long x) {
        XWMHints.flags$VH.set(seg, x);
    }
    public static long flags$get(MemorySegment seg, long index) {
        return (long)XWMHints.flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, long x) {
        XWMHints.flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle input$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("input"));
    public static VarHandle input$VH() {
        return XWMHints.input$VH;
    }
    public static int input$get(MemorySegment seg) {
        return (int)XWMHints.input$VH.get(seg);
    }
    public static void input$set( MemorySegment seg, int x) {
        XWMHints.input$VH.set(seg, x);
    }
    public static int input$get(MemorySegment seg, long index) {
        return (int)XWMHints.input$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void input$set(MemorySegment seg, long index, int x) {
        XWMHints.input$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle initial_state$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("initial_state"));
    public static VarHandle initial_state$VH() {
        return XWMHints.initial_state$VH;
    }
    public static int initial_state$get(MemorySegment seg) {
        return (int)XWMHints.initial_state$VH.get(seg);
    }
    public static void initial_state$set( MemorySegment seg, int x) {
        XWMHints.initial_state$VH.set(seg, x);
    }
    public static int initial_state$get(MemorySegment seg, long index) {
        return (int)XWMHints.initial_state$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void initial_state$set(MemorySegment seg, long index, int x) {
        XWMHints.initial_state$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle icon_pixmap$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("icon_pixmap"));
    public static VarHandle icon_pixmap$VH() {
        return XWMHints.icon_pixmap$VH;
    }
    public static long icon_pixmap$get(MemorySegment seg) {
        return (long)XWMHints.icon_pixmap$VH.get(seg);
    }
    public static void icon_pixmap$set( MemorySegment seg, long x) {
        XWMHints.icon_pixmap$VH.set(seg, x);
    }
    public static long icon_pixmap$get(MemorySegment seg, long index) {
        return (long)XWMHints.icon_pixmap$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void icon_pixmap$set(MemorySegment seg, long index, long x) {
        XWMHints.icon_pixmap$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle icon_window$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("icon_window"));
    public static VarHandle icon_window$VH() {
        return XWMHints.icon_window$VH;
    }
    public static long icon_window$get(MemorySegment seg) {
        return (long)XWMHints.icon_window$VH.get(seg);
    }
    public static void icon_window$set( MemorySegment seg, long x) {
        XWMHints.icon_window$VH.set(seg, x);
    }
    public static long icon_window$get(MemorySegment seg, long index) {
        return (long)XWMHints.icon_window$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void icon_window$set(MemorySegment seg, long index, long x) {
        XWMHints.icon_window$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle icon_x$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("icon_x"));
    public static VarHandle icon_x$VH() {
        return XWMHints.icon_x$VH;
    }
    public static int icon_x$get(MemorySegment seg) {
        return (int)XWMHints.icon_x$VH.get(seg);
    }
    public static void icon_x$set( MemorySegment seg, int x) {
        XWMHints.icon_x$VH.set(seg, x);
    }
    public static int icon_x$get(MemorySegment seg, long index) {
        return (int)XWMHints.icon_x$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void icon_x$set(MemorySegment seg, long index, int x) {
        XWMHints.icon_x$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle icon_y$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("icon_y"));
    public static VarHandle icon_y$VH() {
        return XWMHints.icon_y$VH;
    }
    public static int icon_y$get(MemorySegment seg) {
        return (int)XWMHints.icon_y$VH.get(seg);
    }
    public static void icon_y$set( MemorySegment seg, int x) {
        XWMHints.icon_y$VH.set(seg, x);
    }
    public static int icon_y$get(MemorySegment seg, long index) {
        return (int)XWMHints.icon_y$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void icon_y$set(MemorySegment seg, long index, int x) {
        XWMHints.icon_y$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle icon_mask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("icon_mask"));
    public static VarHandle icon_mask$VH() {
        return XWMHints.icon_mask$VH;
    }
    public static long icon_mask$get(MemorySegment seg) {
        return (long)XWMHints.icon_mask$VH.get(seg);
    }
    public static void icon_mask$set( MemorySegment seg, long x) {
        XWMHints.icon_mask$VH.set(seg, x);
    }
    public static long icon_mask$get(MemorySegment seg, long index) {
        return (long)XWMHints.icon_mask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void icon_mask$set(MemorySegment seg, long index, long x) {
        XWMHints.icon_mask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle window_group$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("window_group"));
    public static VarHandle window_group$VH() {
        return XWMHints.window_group$VH;
    }
    public static long window_group$get(MemorySegment seg) {
        return (long)XWMHints.window_group$VH.get(seg);
    }
    public static void window_group$set( MemorySegment seg, long x) {
        XWMHints.window_group$VH.set(seg, x);
    }
    public static long window_group$get(MemorySegment seg, long index) {
        return (long)XWMHints.window_group$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void window_group$set(MemorySegment seg, long index, long x) {
        XWMHints.window_group$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


