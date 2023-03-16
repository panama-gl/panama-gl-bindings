// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagCLIPDATA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        Constants$root.C_LONG$LAYOUT.withName("ulClipFmt"),
        Constants$root.C_POINTER$LAYOUT.withName("pClipData")
    ).withName("tagCLIPDATA");
    public static MemoryLayout $LAYOUT() {
        return tagCLIPDATA.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return tagCLIPDATA.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)tagCLIPDATA.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        tagCLIPDATA.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)tagCLIPDATA.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        tagCLIPDATA.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ulClipFmt$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ulClipFmt"));
    public static VarHandle ulClipFmt$VH() {
        return tagCLIPDATA.ulClipFmt$VH;
    }
    public static int ulClipFmt$get(MemorySegment seg) {
        return (int)tagCLIPDATA.ulClipFmt$VH.get(seg);
    }
    public static void ulClipFmt$set( MemorySegment seg, int x) {
        tagCLIPDATA.ulClipFmt$VH.set(seg, x);
    }
    public static int ulClipFmt$get(MemorySegment seg, long index) {
        return (int)tagCLIPDATA.ulClipFmt$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ulClipFmt$set(MemorySegment seg, long index, int x) {
        tagCLIPDATA.ulClipFmt$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pClipData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pClipData"));
    public static VarHandle pClipData$VH() {
        return tagCLIPDATA.pClipData$VH;
    }
    public static MemoryAddress pClipData$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagCLIPDATA.pClipData$VH.get(seg);
    }
    public static void pClipData$set( MemorySegment seg, MemoryAddress x) {
        tagCLIPDATA.pClipData$VH.set(seg, x);
    }
    public static MemoryAddress pClipData$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagCLIPDATA.pClipData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pClipData$set(MemorySegment seg, long index, MemoryAddress x) {
        tagCLIPDATA.pClipData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


