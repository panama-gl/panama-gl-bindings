// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class GLXPipeRect {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(80, Constants$root.C_CHAR$LAYOUT).withName("pipeName"),
        Constants$root.C_INT$LAYOUT.withName("srcXOrigin"),
        Constants$root.C_INT$LAYOUT.withName("srcYOrigin"),
        Constants$root.C_INT$LAYOUT.withName("srcWidth"),
        Constants$root.C_INT$LAYOUT.withName("srcHeight"),
        Constants$root.C_INT$LAYOUT.withName("destXOrigin"),
        Constants$root.C_INT$LAYOUT.withName("destYOrigin"),
        Constants$root.C_INT$LAYOUT.withName("destWidth"),
        Constants$root.C_INT$LAYOUT.withName("destHeight")
    );
    public static MemoryLayout $LAYOUT() {
        return GLXPipeRect.$struct$LAYOUT;
    }
    public static MemorySegment pipeName$slice(MemorySegment seg) {
        return seg.asSlice(0, 80);
    }
    static final VarHandle srcXOrigin$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("srcXOrigin"));
    public static VarHandle srcXOrigin$VH() {
        return GLXPipeRect.srcXOrigin$VH;
    }
    public static int srcXOrigin$get(MemorySegment seg) {
        return (int)GLXPipeRect.srcXOrigin$VH.get(seg);
    }
    public static void srcXOrigin$set( MemorySegment seg, int x) {
        GLXPipeRect.srcXOrigin$VH.set(seg, x);
    }
    public static int srcXOrigin$get(MemorySegment seg, long index) {
        return (int)GLXPipeRect.srcXOrigin$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void srcXOrigin$set(MemorySegment seg, long index, int x) {
        GLXPipeRect.srcXOrigin$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle srcYOrigin$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("srcYOrigin"));
    public static VarHandle srcYOrigin$VH() {
        return GLXPipeRect.srcYOrigin$VH;
    }
    public static int srcYOrigin$get(MemorySegment seg) {
        return (int)GLXPipeRect.srcYOrigin$VH.get(seg);
    }
    public static void srcYOrigin$set( MemorySegment seg, int x) {
        GLXPipeRect.srcYOrigin$VH.set(seg, x);
    }
    public static int srcYOrigin$get(MemorySegment seg, long index) {
        return (int)GLXPipeRect.srcYOrigin$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void srcYOrigin$set(MemorySegment seg, long index, int x) {
        GLXPipeRect.srcYOrigin$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle srcWidth$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("srcWidth"));
    public static VarHandle srcWidth$VH() {
        return GLXPipeRect.srcWidth$VH;
    }
    public static int srcWidth$get(MemorySegment seg) {
        return (int)GLXPipeRect.srcWidth$VH.get(seg);
    }
    public static void srcWidth$set( MemorySegment seg, int x) {
        GLXPipeRect.srcWidth$VH.set(seg, x);
    }
    public static int srcWidth$get(MemorySegment seg, long index) {
        return (int)GLXPipeRect.srcWidth$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void srcWidth$set(MemorySegment seg, long index, int x) {
        GLXPipeRect.srcWidth$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle srcHeight$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("srcHeight"));
    public static VarHandle srcHeight$VH() {
        return GLXPipeRect.srcHeight$VH;
    }
    public static int srcHeight$get(MemorySegment seg) {
        return (int)GLXPipeRect.srcHeight$VH.get(seg);
    }
    public static void srcHeight$set( MemorySegment seg, int x) {
        GLXPipeRect.srcHeight$VH.set(seg, x);
    }
    public static int srcHeight$get(MemorySegment seg, long index) {
        return (int)GLXPipeRect.srcHeight$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void srcHeight$set(MemorySegment seg, long index, int x) {
        GLXPipeRect.srcHeight$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle destXOrigin$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("destXOrigin"));
    public static VarHandle destXOrigin$VH() {
        return GLXPipeRect.destXOrigin$VH;
    }
    public static int destXOrigin$get(MemorySegment seg) {
        return (int)GLXPipeRect.destXOrigin$VH.get(seg);
    }
    public static void destXOrigin$set( MemorySegment seg, int x) {
        GLXPipeRect.destXOrigin$VH.set(seg, x);
    }
    public static int destXOrigin$get(MemorySegment seg, long index) {
        return (int)GLXPipeRect.destXOrigin$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void destXOrigin$set(MemorySegment seg, long index, int x) {
        GLXPipeRect.destXOrigin$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle destYOrigin$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("destYOrigin"));
    public static VarHandle destYOrigin$VH() {
        return GLXPipeRect.destYOrigin$VH;
    }
    public static int destYOrigin$get(MemorySegment seg) {
        return (int)GLXPipeRect.destYOrigin$VH.get(seg);
    }
    public static void destYOrigin$set( MemorySegment seg, int x) {
        GLXPipeRect.destYOrigin$VH.set(seg, x);
    }
    public static int destYOrigin$get(MemorySegment seg, long index) {
        return (int)GLXPipeRect.destYOrigin$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void destYOrigin$set(MemorySegment seg, long index, int x) {
        GLXPipeRect.destYOrigin$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle destWidth$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("destWidth"));
    public static VarHandle destWidth$VH() {
        return GLXPipeRect.destWidth$VH;
    }
    public static int destWidth$get(MemorySegment seg) {
        return (int)GLXPipeRect.destWidth$VH.get(seg);
    }
    public static void destWidth$set( MemorySegment seg, int x) {
        GLXPipeRect.destWidth$VH.set(seg, x);
    }
    public static int destWidth$get(MemorySegment seg, long index) {
        return (int)GLXPipeRect.destWidth$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void destWidth$set(MemorySegment seg, long index, int x) {
        GLXPipeRect.destWidth$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle destHeight$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("destHeight"));
    public static VarHandle destHeight$VH() {
        return GLXPipeRect.destHeight$VH;
    }
    public static int destHeight$get(MemorySegment seg) {
        return (int)GLXPipeRect.destHeight$VH.get(seg);
    }
    public static void destHeight$set( MemorySegment seg, int x) {
        GLXPipeRect.destHeight$VH.set(seg, x);
    }
    public static int destHeight$get(MemorySegment seg, long index) {
        return (int)GLXPipeRect.destHeight$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void destHeight$set(MemorySegment seg, long index, int x) {
        GLXPipeRect.destHeight$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


