// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class XSizeHints {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("flags"),
        Constants$root.C_INT$LAYOUT.withName("x"),
        Constants$root.C_INT$LAYOUT.withName("y"),
        Constants$root.C_INT$LAYOUT.withName("width"),
        Constants$root.C_INT$LAYOUT.withName("height"),
        Constants$root.C_INT$LAYOUT.withName("min_width"),
        Constants$root.C_INT$LAYOUT.withName("min_height"),
        Constants$root.C_INT$LAYOUT.withName("max_width"),
        Constants$root.C_INT$LAYOUT.withName("max_height"),
        Constants$root.C_INT$LAYOUT.withName("width_inc"),
        Constants$root.C_INT$LAYOUT.withName("height_inc"),
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("x"),
            Constants$root.C_INT$LAYOUT.withName("y")
        ).withName("min_aspect"),
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("x"),
            Constants$root.C_INT$LAYOUT.withName("y")
        ).withName("max_aspect"),
        Constants$root.C_INT$LAYOUT.withName("base_width"),
        Constants$root.C_INT$LAYOUT.withName("base_height"),
        Constants$root.C_INT$LAYOUT.withName("win_gravity"),
        MemoryLayout.paddingLayout(32)
    );
    public static MemoryLayout $LAYOUT() {
        return XSizeHints.$struct$LAYOUT;
    }
    static final VarHandle flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("flags"));
    public static VarHandle flags$VH() {
        return XSizeHints.flags$VH;
    }
    public static long flags$get(MemorySegment seg) {
        return (long)XSizeHints.flags$VH.get(seg);
    }
    public static void flags$set( MemorySegment seg, long x) {
        XSizeHints.flags$VH.set(seg, x);
    }
    public static long flags$get(MemorySegment seg, long index) {
        return (long)XSizeHints.flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, long x) {
        XSizeHints.flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle x$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("x"));
    public static VarHandle x$VH() {
        return XSizeHints.x$VH;
    }
    public static int x$get(MemorySegment seg) {
        return (int)XSizeHints.x$VH.get(seg);
    }
    public static void x$set( MemorySegment seg, int x) {
        XSizeHints.x$VH.set(seg, x);
    }
    public static int x$get(MemorySegment seg, long index) {
        return (int)XSizeHints.x$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void x$set(MemorySegment seg, long index, int x) {
        XSizeHints.x$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle y$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("y"));
    public static VarHandle y$VH() {
        return XSizeHints.y$VH;
    }
    public static int y$get(MemorySegment seg) {
        return (int)XSizeHints.y$VH.get(seg);
    }
    public static void y$set( MemorySegment seg, int x) {
        XSizeHints.y$VH.set(seg, x);
    }
    public static int y$get(MemorySegment seg, long index) {
        return (int)XSizeHints.y$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void y$set(MemorySegment seg, long index, int x) {
        XSizeHints.y$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle width$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("width"));
    public static VarHandle width$VH() {
        return XSizeHints.width$VH;
    }
    public static int width$get(MemorySegment seg) {
        return (int)XSizeHints.width$VH.get(seg);
    }
    public static void width$set( MemorySegment seg, int x) {
        XSizeHints.width$VH.set(seg, x);
    }
    public static int width$get(MemorySegment seg, long index) {
        return (int)XSizeHints.width$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void width$set(MemorySegment seg, long index, int x) {
        XSizeHints.width$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle height$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("height"));
    public static VarHandle height$VH() {
        return XSizeHints.height$VH;
    }
    public static int height$get(MemorySegment seg) {
        return (int)XSizeHints.height$VH.get(seg);
    }
    public static void height$set( MemorySegment seg, int x) {
        XSizeHints.height$VH.set(seg, x);
    }
    public static int height$get(MemorySegment seg, long index) {
        return (int)XSizeHints.height$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void height$set(MemorySegment seg, long index, int x) {
        XSizeHints.height$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle min_width$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("min_width"));
    public static VarHandle min_width$VH() {
        return XSizeHints.min_width$VH;
    }
    public static int min_width$get(MemorySegment seg) {
        return (int)XSizeHints.min_width$VH.get(seg);
    }
    public static void min_width$set( MemorySegment seg, int x) {
        XSizeHints.min_width$VH.set(seg, x);
    }
    public static int min_width$get(MemorySegment seg, long index) {
        return (int)XSizeHints.min_width$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void min_width$set(MemorySegment seg, long index, int x) {
        XSizeHints.min_width$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle min_height$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("min_height"));
    public static VarHandle min_height$VH() {
        return XSizeHints.min_height$VH;
    }
    public static int min_height$get(MemorySegment seg) {
        return (int)XSizeHints.min_height$VH.get(seg);
    }
    public static void min_height$set( MemorySegment seg, int x) {
        XSizeHints.min_height$VH.set(seg, x);
    }
    public static int min_height$get(MemorySegment seg, long index) {
        return (int)XSizeHints.min_height$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void min_height$set(MemorySegment seg, long index, int x) {
        XSizeHints.min_height$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle max_width$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("max_width"));
    public static VarHandle max_width$VH() {
        return XSizeHints.max_width$VH;
    }
    public static int max_width$get(MemorySegment seg) {
        return (int)XSizeHints.max_width$VH.get(seg);
    }
    public static void max_width$set( MemorySegment seg, int x) {
        XSizeHints.max_width$VH.set(seg, x);
    }
    public static int max_width$get(MemorySegment seg, long index) {
        return (int)XSizeHints.max_width$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void max_width$set(MemorySegment seg, long index, int x) {
        XSizeHints.max_width$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle max_height$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("max_height"));
    public static VarHandle max_height$VH() {
        return XSizeHints.max_height$VH;
    }
    public static int max_height$get(MemorySegment seg) {
        return (int)XSizeHints.max_height$VH.get(seg);
    }
    public static void max_height$set( MemorySegment seg, int x) {
        XSizeHints.max_height$VH.set(seg, x);
    }
    public static int max_height$get(MemorySegment seg, long index) {
        return (int)XSizeHints.max_height$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void max_height$set(MemorySegment seg, long index, int x) {
        XSizeHints.max_height$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle width_inc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("width_inc"));
    public static VarHandle width_inc$VH() {
        return XSizeHints.width_inc$VH;
    }
    public static int width_inc$get(MemorySegment seg) {
        return (int)XSizeHints.width_inc$VH.get(seg);
    }
    public static void width_inc$set( MemorySegment seg, int x) {
        XSizeHints.width_inc$VH.set(seg, x);
    }
    public static int width_inc$get(MemorySegment seg, long index) {
        return (int)XSizeHints.width_inc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void width_inc$set(MemorySegment seg, long index, int x) {
        XSizeHints.width_inc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle height_inc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("height_inc"));
    public static VarHandle height_inc$VH() {
        return XSizeHints.height_inc$VH;
    }
    public static int height_inc$get(MemorySegment seg) {
        return (int)XSizeHints.height_inc$VH.get(seg);
    }
    public static void height_inc$set( MemorySegment seg, int x) {
        XSizeHints.height_inc$VH.set(seg, x);
    }
    public static int height_inc$get(MemorySegment seg, long index) {
        return (int)XSizeHints.height_inc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void height_inc$set(MemorySegment seg, long index, int x) {
        XSizeHints.height_inc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static class min_aspect {

        static final  GroupLayout min_aspect$struct$LAYOUT = MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("x"),
            Constants$root.C_INT$LAYOUT.withName("y")
        );
        public static MemoryLayout $LAYOUT() {
            return min_aspect.min_aspect$struct$LAYOUT;
        }
        static final VarHandle x$VH = min_aspect$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("x"));
        public static VarHandle x$VH() {
            return min_aspect.x$VH;
        }
        public static int x$get(MemorySegment seg) {
            return (int)min_aspect.x$VH.get(seg);
        }
        public static void x$set( MemorySegment seg, int x) {
            min_aspect.x$VH.set(seg, x);
        }
        public static int x$get(MemorySegment seg, long index) {
            return (int)min_aspect.x$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void x$set(MemorySegment seg, long index, int x) {
            min_aspect.x$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle y$VH = min_aspect$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("y"));
        public static VarHandle y$VH() {
            return min_aspect.y$VH;
        }
        public static int y$get(MemorySegment seg) {
            return (int)min_aspect.y$VH.get(seg);
        }
        public static void y$set( MemorySegment seg, int x) {
            min_aspect.y$VH.set(seg, x);
        }
        public static int y$get(MemorySegment seg, long index) {
            return (int)min_aspect.y$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void y$set(MemorySegment seg, long index, int x) {
            min_aspect.y$VH.set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
    }

    public static MemorySegment min_aspect$slice(MemorySegment seg) {
        return seg.asSlice(48, 8);
    }
    public static class max_aspect {

        static final  GroupLayout max_aspect$struct$LAYOUT = MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("x"),
            Constants$root.C_INT$LAYOUT.withName("y")
        );
        public static MemoryLayout $LAYOUT() {
            return max_aspect.max_aspect$struct$LAYOUT;
        }
        static final VarHandle x$VH = max_aspect$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("x"));
        public static VarHandle x$VH() {
            return max_aspect.x$VH;
        }
        public static int x$get(MemorySegment seg) {
            return (int)max_aspect.x$VH.get(seg);
        }
        public static void x$set( MemorySegment seg, int x) {
            max_aspect.x$VH.set(seg, x);
        }
        public static int x$get(MemorySegment seg, long index) {
            return (int)max_aspect.x$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void x$set(MemorySegment seg, long index, int x) {
            max_aspect.x$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle y$VH = max_aspect$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("y"));
        public static VarHandle y$VH() {
            return max_aspect.y$VH;
        }
        public static int y$get(MemorySegment seg) {
            return (int)max_aspect.y$VH.get(seg);
        }
        public static void y$set( MemorySegment seg, int x) {
            max_aspect.y$VH.set(seg, x);
        }
        public static int y$get(MemorySegment seg, long index) {
            return (int)max_aspect.y$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void y$set(MemorySegment seg, long index, int x) {
            max_aspect.y$VH.set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
    }

    public static MemorySegment max_aspect$slice(MemorySegment seg) {
        return seg.asSlice(56, 8);
    }
    static final VarHandle base_width$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("base_width"));
    public static VarHandle base_width$VH() {
        return XSizeHints.base_width$VH;
    }
    public static int base_width$get(MemorySegment seg) {
        return (int)XSizeHints.base_width$VH.get(seg);
    }
    public static void base_width$set( MemorySegment seg, int x) {
        XSizeHints.base_width$VH.set(seg, x);
    }
    public static int base_width$get(MemorySegment seg, long index) {
        return (int)XSizeHints.base_width$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void base_width$set(MemorySegment seg, long index, int x) {
        XSizeHints.base_width$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle base_height$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("base_height"));
    public static VarHandle base_height$VH() {
        return XSizeHints.base_height$VH;
    }
    public static int base_height$get(MemorySegment seg) {
        return (int)XSizeHints.base_height$VH.get(seg);
    }
    public static void base_height$set( MemorySegment seg, int x) {
        XSizeHints.base_height$VH.set(seg, x);
    }
    public static int base_height$get(MemorySegment seg, long index) {
        return (int)XSizeHints.base_height$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void base_height$set(MemorySegment seg, long index, int x) {
        XSizeHints.base_height$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle win_gravity$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("win_gravity"));
    public static VarHandle win_gravity$VH() {
        return XSizeHints.win_gravity$VH;
    }
    public static int win_gravity$get(MemorySegment seg) {
        return (int)XSizeHints.win_gravity$VH.get(seg);
    }
    public static void win_gravity$set( MemorySegment seg, int x) {
        XSizeHints.win_gravity$VH.set(seg, x);
    }
    public static int win_gravity$get(MemorySegment seg, long index) {
        return (int)XSizeHints.win_gravity$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void win_gravity$set(MemorySegment seg, long index, int x) {
        XSizeHints.win_gravity$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


