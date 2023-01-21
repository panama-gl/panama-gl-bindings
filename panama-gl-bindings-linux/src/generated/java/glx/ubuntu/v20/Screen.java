// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class Screen {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ext_data"),
        Constants$root.C_POINTER$LAYOUT.withName("display"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("root"),
        Constants$root.C_INT$LAYOUT.withName("width"),
        Constants$root.C_INT$LAYOUT.withName("height"),
        Constants$root.C_INT$LAYOUT.withName("mwidth"),
        Constants$root.C_INT$LAYOUT.withName("mheight"),
        Constants$root.C_INT$LAYOUT.withName("ndepths"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("depths"),
        Constants$root.C_INT$LAYOUT.withName("root_depth"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("root_visual"),
        Constants$root.C_POINTER$LAYOUT.withName("default_gc"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("cmap"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("white_pixel"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("black_pixel"),
        Constants$root.C_INT$LAYOUT.withName("max_maps"),
        Constants$root.C_INT$LAYOUT.withName("min_maps"),
        Constants$root.C_INT$LAYOUT.withName("backing_store"),
        Constants$root.C_INT$LAYOUT.withName("save_unders"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("root_input_mask")
    );
    public static MemoryLayout $LAYOUT() {
        return Screen.$struct$LAYOUT;
    }
    static final VarHandle ext_data$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ext_data"));
    public static VarHandle ext_data$VH() {
        return Screen.ext_data$VH;
    }
    public static MemoryAddress ext_data$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)Screen.ext_data$VH.get(seg);
    }
    public static void ext_data$set( MemorySegment seg, MemoryAddress x) {
        Screen.ext_data$VH.set(seg, x);
    }
    public static MemoryAddress ext_data$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)Screen.ext_data$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ext_data$set(MemorySegment seg, long index, MemoryAddress x) {
        Screen.ext_data$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle display$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("display"));
    public static VarHandle display$VH() {
        return Screen.display$VH;
    }
    public static MemoryAddress display$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)Screen.display$VH.get(seg);
    }
    public static void display$set( MemorySegment seg, MemoryAddress x) {
        Screen.display$VH.set(seg, x);
    }
    public static MemoryAddress display$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)Screen.display$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void display$set(MemorySegment seg, long index, MemoryAddress x) {
        Screen.display$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle root$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("root"));
    public static VarHandle root$VH() {
        return Screen.root$VH;
    }
    public static long root$get(MemorySegment seg) {
        return (long)Screen.root$VH.get(seg);
    }
    public static void root$set( MemorySegment seg, long x) {
        Screen.root$VH.set(seg, x);
    }
    public static long root$get(MemorySegment seg, long index) {
        return (long)Screen.root$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void root$set(MemorySegment seg, long index, long x) {
        Screen.root$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle width$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("width"));
    public static VarHandle width$VH() {
        return Screen.width$VH;
    }
    public static int width$get(MemorySegment seg) {
        return (int)Screen.width$VH.get(seg);
    }
    public static void width$set( MemorySegment seg, int x) {
        Screen.width$VH.set(seg, x);
    }
    public static int width$get(MemorySegment seg, long index) {
        return (int)Screen.width$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void width$set(MemorySegment seg, long index, int x) {
        Screen.width$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle height$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("height"));
    public static VarHandle height$VH() {
        return Screen.height$VH;
    }
    public static int height$get(MemorySegment seg) {
        return (int)Screen.height$VH.get(seg);
    }
    public static void height$set( MemorySegment seg, int x) {
        Screen.height$VH.set(seg, x);
    }
    public static int height$get(MemorySegment seg, long index) {
        return (int)Screen.height$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void height$set(MemorySegment seg, long index, int x) {
        Screen.height$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle mwidth$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("mwidth"));
    public static VarHandle mwidth$VH() {
        return Screen.mwidth$VH;
    }
    public static int mwidth$get(MemorySegment seg) {
        return (int)Screen.mwidth$VH.get(seg);
    }
    public static void mwidth$set( MemorySegment seg, int x) {
        Screen.mwidth$VH.set(seg, x);
    }
    public static int mwidth$get(MemorySegment seg, long index) {
        return (int)Screen.mwidth$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void mwidth$set(MemorySegment seg, long index, int x) {
        Screen.mwidth$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle mheight$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("mheight"));
    public static VarHandle mheight$VH() {
        return Screen.mheight$VH;
    }
    public static int mheight$get(MemorySegment seg) {
        return (int)Screen.mheight$VH.get(seg);
    }
    public static void mheight$set( MemorySegment seg, int x) {
        Screen.mheight$VH.set(seg, x);
    }
    public static int mheight$get(MemorySegment seg, long index) {
        return (int)Screen.mheight$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void mheight$set(MemorySegment seg, long index, int x) {
        Screen.mheight$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ndepths$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ndepths"));
    public static VarHandle ndepths$VH() {
        return Screen.ndepths$VH;
    }
    public static int ndepths$get(MemorySegment seg) {
        return (int)Screen.ndepths$VH.get(seg);
    }
    public static void ndepths$set( MemorySegment seg, int x) {
        Screen.ndepths$VH.set(seg, x);
    }
    public static int ndepths$get(MemorySegment seg, long index) {
        return (int)Screen.ndepths$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ndepths$set(MemorySegment seg, long index, int x) {
        Screen.ndepths$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle depths$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("depths"));
    public static VarHandle depths$VH() {
        return Screen.depths$VH;
    }
    public static MemoryAddress depths$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)Screen.depths$VH.get(seg);
    }
    public static void depths$set( MemorySegment seg, MemoryAddress x) {
        Screen.depths$VH.set(seg, x);
    }
    public static MemoryAddress depths$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)Screen.depths$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void depths$set(MemorySegment seg, long index, MemoryAddress x) {
        Screen.depths$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle root_depth$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("root_depth"));
    public static VarHandle root_depth$VH() {
        return Screen.root_depth$VH;
    }
    public static int root_depth$get(MemorySegment seg) {
        return (int)Screen.root_depth$VH.get(seg);
    }
    public static void root_depth$set( MemorySegment seg, int x) {
        Screen.root_depth$VH.set(seg, x);
    }
    public static int root_depth$get(MemorySegment seg, long index) {
        return (int)Screen.root_depth$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void root_depth$set(MemorySegment seg, long index, int x) {
        Screen.root_depth$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle root_visual$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("root_visual"));
    public static VarHandle root_visual$VH() {
        return Screen.root_visual$VH;
    }
    public static MemoryAddress root_visual$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)Screen.root_visual$VH.get(seg);
    }
    public static void root_visual$set( MemorySegment seg, MemoryAddress x) {
        Screen.root_visual$VH.set(seg, x);
    }
    public static MemoryAddress root_visual$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)Screen.root_visual$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void root_visual$set(MemorySegment seg, long index, MemoryAddress x) {
        Screen.root_visual$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle default_gc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("default_gc"));
    public static VarHandle default_gc$VH() {
        return Screen.default_gc$VH;
    }
    public static MemoryAddress default_gc$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)Screen.default_gc$VH.get(seg);
    }
    public static void default_gc$set( MemorySegment seg, MemoryAddress x) {
        Screen.default_gc$VH.set(seg, x);
    }
    public static MemoryAddress default_gc$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)Screen.default_gc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void default_gc$set(MemorySegment seg, long index, MemoryAddress x) {
        Screen.default_gc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cmap$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cmap"));
    public static VarHandle cmap$VH() {
        return Screen.cmap$VH;
    }
    public static long cmap$get(MemorySegment seg) {
        return (long)Screen.cmap$VH.get(seg);
    }
    public static void cmap$set( MemorySegment seg, long x) {
        Screen.cmap$VH.set(seg, x);
    }
    public static long cmap$get(MemorySegment seg, long index) {
        return (long)Screen.cmap$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cmap$set(MemorySegment seg, long index, long x) {
        Screen.cmap$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle white_pixel$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("white_pixel"));
    public static VarHandle white_pixel$VH() {
        return Screen.white_pixel$VH;
    }
    public static long white_pixel$get(MemorySegment seg) {
        return (long)Screen.white_pixel$VH.get(seg);
    }
    public static void white_pixel$set( MemorySegment seg, long x) {
        Screen.white_pixel$VH.set(seg, x);
    }
    public static long white_pixel$get(MemorySegment seg, long index) {
        return (long)Screen.white_pixel$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void white_pixel$set(MemorySegment seg, long index, long x) {
        Screen.white_pixel$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle black_pixel$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("black_pixel"));
    public static VarHandle black_pixel$VH() {
        return Screen.black_pixel$VH;
    }
    public static long black_pixel$get(MemorySegment seg) {
        return (long)Screen.black_pixel$VH.get(seg);
    }
    public static void black_pixel$set( MemorySegment seg, long x) {
        Screen.black_pixel$VH.set(seg, x);
    }
    public static long black_pixel$get(MemorySegment seg, long index) {
        return (long)Screen.black_pixel$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void black_pixel$set(MemorySegment seg, long index, long x) {
        Screen.black_pixel$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle max_maps$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("max_maps"));
    public static VarHandle max_maps$VH() {
        return Screen.max_maps$VH;
    }
    public static int max_maps$get(MemorySegment seg) {
        return (int)Screen.max_maps$VH.get(seg);
    }
    public static void max_maps$set( MemorySegment seg, int x) {
        Screen.max_maps$VH.set(seg, x);
    }
    public static int max_maps$get(MemorySegment seg, long index) {
        return (int)Screen.max_maps$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void max_maps$set(MemorySegment seg, long index, int x) {
        Screen.max_maps$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle min_maps$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("min_maps"));
    public static VarHandle min_maps$VH() {
        return Screen.min_maps$VH;
    }
    public static int min_maps$get(MemorySegment seg) {
        return (int)Screen.min_maps$VH.get(seg);
    }
    public static void min_maps$set( MemorySegment seg, int x) {
        Screen.min_maps$VH.set(seg, x);
    }
    public static int min_maps$get(MemorySegment seg, long index) {
        return (int)Screen.min_maps$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void min_maps$set(MemorySegment seg, long index, int x) {
        Screen.min_maps$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle backing_store$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("backing_store"));
    public static VarHandle backing_store$VH() {
        return Screen.backing_store$VH;
    }
    public static int backing_store$get(MemorySegment seg) {
        return (int)Screen.backing_store$VH.get(seg);
    }
    public static void backing_store$set( MemorySegment seg, int x) {
        Screen.backing_store$VH.set(seg, x);
    }
    public static int backing_store$get(MemorySegment seg, long index) {
        return (int)Screen.backing_store$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void backing_store$set(MemorySegment seg, long index, int x) {
        Screen.backing_store$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle save_unders$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("save_unders"));
    public static VarHandle save_unders$VH() {
        return Screen.save_unders$VH;
    }
    public static int save_unders$get(MemorySegment seg) {
        return (int)Screen.save_unders$VH.get(seg);
    }
    public static void save_unders$set( MemorySegment seg, int x) {
        Screen.save_unders$VH.set(seg, x);
    }
    public static int save_unders$get(MemorySegment seg, long index) {
        return (int)Screen.save_unders$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void save_unders$set(MemorySegment seg, long index, int x) {
        Screen.save_unders$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle root_input_mask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("root_input_mask"));
    public static VarHandle root_input_mask$VH() {
        return Screen.root_input_mask$VH;
    }
    public static long root_input_mask$get(MemorySegment seg) {
        return (long)Screen.root_input_mask$VH.get(seg);
    }
    public static void root_input_mask$set( MemorySegment seg, long x) {
        Screen.root_input_mask$VH.set(seg, x);
    }
    public static long root_input_mask$get(MemorySegment seg, long index) {
        return (long)Screen.root_input_mask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void root_input_mask$set(MemorySegment seg, long index, long x) {
        Screen.root_input_mask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


