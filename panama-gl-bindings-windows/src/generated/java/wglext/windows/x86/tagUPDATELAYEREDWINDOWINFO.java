// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagUPDATELAYEREDWINDOWINFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("hdcDst"),
        Constants$root.C_POINTER$LAYOUT.withName("pptDst"),
        Constants$root.C_POINTER$LAYOUT.withName("psize"),
        Constants$root.C_POINTER$LAYOUT.withName("hdcSrc"),
        Constants$root.C_POINTER$LAYOUT.withName("pptSrc"),
        Constants$root.C_LONG$LAYOUT.withName("crKey"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pblend"),
        Constants$root.C_LONG$LAYOUT.withName("dwFlags"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("prcDirty")
    ).withName("tagUPDATELAYEREDWINDOWINFO");
    public static MemoryLayout $LAYOUT() {
        return tagUPDATELAYEREDWINDOWINFO.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return tagUPDATELAYEREDWINDOWINFO.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)tagUPDATELAYEREDWINDOWINFO.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        tagUPDATELAYEREDWINDOWINFO.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)tagUPDATELAYEREDWINDOWINFO.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        tagUPDATELAYEREDWINDOWINFO.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hdcDst$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hdcDst"));
    public static VarHandle hdcDst$VH() {
        return tagUPDATELAYEREDWINDOWINFO.hdcDst$VH;
    }
    public static MemoryAddress hdcDst$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagUPDATELAYEREDWINDOWINFO.hdcDst$VH.get(seg);
    }
    public static void hdcDst$set( MemorySegment seg, MemoryAddress x) {
        tagUPDATELAYEREDWINDOWINFO.hdcDst$VH.set(seg, x);
    }
    public static MemoryAddress hdcDst$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagUPDATELAYEREDWINDOWINFO.hdcDst$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hdcDst$set(MemorySegment seg, long index, MemoryAddress x) {
        tagUPDATELAYEREDWINDOWINFO.hdcDst$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pptDst$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pptDst"));
    public static VarHandle pptDst$VH() {
        return tagUPDATELAYEREDWINDOWINFO.pptDst$VH;
    }
    public static MemoryAddress pptDst$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagUPDATELAYEREDWINDOWINFO.pptDst$VH.get(seg);
    }
    public static void pptDst$set( MemorySegment seg, MemoryAddress x) {
        tagUPDATELAYEREDWINDOWINFO.pptDst$VH.set(seg, x);
    }
    public static MemoryAddress pptDst$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagUPDATELAYEREDWINDOWINFO.pptDst$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pptDst$set(MemorySegment seg, long index, MemoryAddress x) {
        tagUPDATELAYEREDWINDOWINFO.pptDst$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle psize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("psize"));
    public static VarHandle psize$VH() {
        return tagUPDATELAYEREDWINDOWINFO.psize$VH;
    }
    public static MemoryAddress psize$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagUPDATELAYEREDWINDOWINFO.psize$VH.get(seg);
    }
    public static void psize$set( MemorySegment seg, MemoryAddress x) {
        tagUPDATELAYEREDWINDOWINFO.psize$VH.set(seg, x);
    }
    public static MemoryAddress psize$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagUPDATELAYEREDWINDOWINFO.psize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void psize$set(MemorySegment seg, long index, MemoryAddress x) {
        tagUPDATELAYEREDWINDOWINFO.psize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hdcSrc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hdcSrc"));
    public static VarHandle hdcSrc$VH() {
        return tagUPDATELAYEREDWINDOWINFO.hdcSrc$VH;
    }
    public static MemoryAddress hdcSrc$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagUPDATELAYEREDWINDOWINFO.hdcSrc$VH.get(seg);
    }
    public static void hdcSrc$set( MemorySegment seg, MemoryAddress x) {
        tagUPDATELAYEREDWINDOWINFO.hdcSrc$VH.set(seg, x);
    }
    public static MemoryAddress hdcSrc$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagUPDATELAYEREDWINDOWINFO.hdcSrc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hdcSrc$set(MemorySegment seg, long index, MemoryAddress x) {
        tagUPDATELAYEREDWINDOWINFO.hdcSrc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pptSrc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pptSrc"));
    public static VarHandle pptSrc$VH() {
        return tagUPDATELAYEREDWINDOWINFO.pptSrc$VH;
    }
    public static MemoryAddress pptSrc$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagUPDATELAYEREDWINDOWINFO.pptSrc$VH.get(seg);
    }
    public static void pptSrc$set( MemorySegment seg, MemoryAddress x) {
        tagUPDATELAYEREDWINDOWINFO.pptSrc$VH.set(seg, x);
    }
    public static MemoryAddress pptSrc$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagUPDATELAYEREDWINDOWINFO.pptSrc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pptSrc$set(MemorySegment seg, long index, MemoryAddress x) {
        tagUPDATELAYEREDWINDOWINFO.pptSrc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle crKey$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("crKey"));
    public static VarHandle crKey$VH() {
        return tagUPDATELAYEREDWINDOWINFO.crKey$VH;
    }
    public static int crKey$get(MemorySegment seg) {
        return (int)tagUPDATELAYEREDWINDOWINFO.crKey$VH.get(seg);
    }
    public static void crKey$set( MemorySegment seg, int x) {
        tagUPDATELAYEREDWINDOWINFO.crKey$VH.set(seg, x);
    }
    public static int crKey$get(MemorySegment seg, long index) {
        return (int)tagUPDATELAYEREDWINDOWINFO.crKey$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void crKey$set(MemorySegment seg, long index, int x) {
        tagUPDATELAYEREDWINDOWINFO.crKey$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pblend$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pblend"));
    public static VarHandle pblend$VH() {
        return tagUPDATELAYEREDWINDOWINFO.pblend$VH;
    }
    public static MemoryAddress pblend$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagUPDATELAYEREDWINDOWINFO.pblend$VH.get(seg);
    }
    public static void pblend$set( MemorySegment seg, MemoryAddress x) {
        tagUPDATELAYEREDWINDOWINFO.pblend$VH.set(seg, x);
    }
    public static MemoryAddress pblend$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagUPDATELAYEREDWINDOWINFO.pblend$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pblend$set(MemorySegment seg, long index, MemoryAddress x) {
        tagUPDATELAYEREDWINDOWINFO.pblend$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return tagUPDATELAYEREDWINDOWINFO.dwFlags$VH;
    }
    public static int dwFlags$get(MemorySegment seg) {
        return (int)tagUPDATELAYEREDWINDOWINFO.dwFlags$VH.get(seg);
    }
    public static void dwFlags$set( MemorySegment seg, int x) {
        tagUPDATELAYEREDWINDOWINFO.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)tagUPDATELAYEREDWINDOWINFO.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        tagUPDATELAYEREDWINDOWINFO.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle prcDirty$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("prcDirty"));
    public static VarHandle prcDirty$VH() {
        return tagUPDATELAYEREDWINDOWINFO.prcDirty$VH;
    }
    public static MemoryAddress prcDirty$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagUPDATELAYEREDWINDOWINFO.prcDirty$VH.get(seg);
    }
    public static void prcDirty$set( MemorySegment seg, MemoryAddress x) {
        tagUPDATELAYEREDWINDOWINFO.prcDirty$VH.set(seg, x);
    }
    public static MemoryAddress prcDirty$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagUPDATELAYEREDWINDOWINFO.prcDirty$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void prcDirty$set(MemorySegment seg, long index, MemoryAddress x) {
        tagUPDATELAYEREDWINDOWINFO.prcDirty$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

