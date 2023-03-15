// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _tagPROTOCOLDATA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("grfFlags"),
        Constants$root.C_LONG$LAYOUT.withName("dwState"),
        Constants$root.C_POINTER$LAYOUT.withName("pData"),
        Constants$root.C_LONG$LAYOUT.withName("cbData"),
        MemoryLayout.paddingLayout(32)
    ).withName("_tagPROTOCOLDATA");
    public static MemoryLayout $LAYOUT() {
        return _tagPROTOCOLDATA.$struct$LAYOUT;
    }
    static final VarHandle grfFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("grfFlags"));
    public static VarHandle grfFlags$VH() {
        return _tagPROTOCOLDATA.grfFlags$VH;
    }
    public static int grfFlags$get(MemorySegment seg) {
        return (int)_tagPROTOCOLDATA.grfFlags$VH.get(seg);
    }
    public static void grfFlags$set( MemorySegment seg, int x) {
        _tagPROTOCOLDATA.grfFlags$VH.set(seg, x);
    }
    public static int grfFlags$get(MemorySegment seg, long index) {
        return (int)_tagPROTOCOLDATA.grfFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void grfFlags$set(MemorySegment seg, long index, int x) {
        _tagPROTOCOLDATA.grfFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwState$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwState"));
    public static VarHandle dwState$VH() {
        return _tagPROTOCOLDATA.dwState$VH;
    }
    public static int dwState$get(MemorySegment seg) {
        return (int)_tagPROTOCOLDATA.dwState$VH.get(seg);
    }
    public static void dwState$set( MemorySegment seg, int x) {
        _tagPROTOCOLDATA.dwState$VH.set(seg, x);
    }
    public static int dwState$get(MemorySegment seg, long index) {
        return (int)_tagPROTOCOLDATA.dwState$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwState$set(MemorySegment seg, long index, int x) {
        _tagPROTOCOLDATA.dwState$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pData"));
    public static VarHandle pData$VH() {
        return _tagPROTOCOLDATA.pData$VH;
    }
    public static MemoryAddress pData$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_tagPROTOCOLDATA.pData$VH.get(seg);
    }
    public static void pData$set( MemorySegment seg, MemoryAddress x) {
        _tagPROTOCOLDATA.pData$VH.set(seg, x);
    }
    public static MemoryAddress pData$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_tagPROTOCOLDATA.pData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pData$set(MemorySegment seg, long index, MemoryAddress x) {
        _tagPROTOCOLDATA.pData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbData"));
    public static VarHandle cbData$VH() {
        return _tagPROTOCOLDATA.cbData$VH;
    }
    public static int cbData$get(MemorySegment seg) {
        return (int)_tagPROTOCOLDATA.cbData$VH.get(seg);
    }
    public static void cbData$set( MemorySegment seg, int x) {
        _tagPROTOCOLDATA.cbData$VH.set(seg, x);
    }
    public static int cbData$get(MemorySegment seg, long index) {
        return (int)_tagPROTOCOLDATA.cbData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbData$set(MemorySegment seg, long index, int x) {
        _tagPROTOCOLDATA.cbData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


