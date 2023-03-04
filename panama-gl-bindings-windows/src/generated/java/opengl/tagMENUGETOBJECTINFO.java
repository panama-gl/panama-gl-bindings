// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagMENUGETOBJECTINFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwFlags"),
        Constants$root.C_LONG$LAYOUT.withName("uPos"),
        Constants$root.C_POINTER$LAYOUT.withName("hmenu"),
        Constants$root.C_POINTER$LAYOUT.withName("riid"),
        Constants$root.C_POINTER$LAYOUT.withName("pvObj")
    ).withName("tagMENUGETOBJECTINFO");
    public static MemoryLayout $LAYOUT() {
        return tagMENUGETOBJECTINFO.$struct$LAYOUT;
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return tagMENUGETOBJECTINFO.dwFlags$VH;
    }
    public static int dwFlags$get(MemorySegment seg) {
        return (int)tagMENUGETOBJECTINFO.dwFlags$VH.get(seg);
    }
    public static void dwFlags$set( MemorySegment seg, int x) {
        tagMENUGETOBJECTINFO.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)tagMENUGETOBJECTINFO.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        tagMENUGETOBJECTINFO.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle uPos$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("uPos"));
    public static VarHandle uPos$VH() {
        return tagMENUGETOBJECTINFO.uPos$VH;
    }
    public static int uPos$get(MemorySegment seg) {
        return (int)tagMENUGETOBJECTINFO.uPos$VH.get(seg);
    }
    public static void uPos$set( MemorySegment seg, int x) {
        tagMENUGETOBJECTINFO.uPos$VH.set(seg, x);
    }
    public static int uPos$get(MemorySegment seg, long index) {
        return (int)tagMENUGETOBJECTINFO.uPos$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void uPos$set(MemorySegment seg, long index, int x) {
        tagMENUGETOBJECTINFO.uPos$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hmenu$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hmenu"));
    public static VarHandle hmenu$VH() {
        return tagMENUGETOBJECTINFO.hmenu$VH;
    }
    public static MemoryAddress hmenu$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagMENUGETOBJECTINFO.hmenu$VH.get(seg);
    }
    public static void hmenu$set( MemorySegment seg, MemoryAddress x) {
        tagMENUGETOBJECTINFO.hmenu$VH.set(seg, x);
    }
    public static MemoryAddress hmenu$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagMENUGETOBJECTINFO.hmenu$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hmenu$set(MemorySegment seg, long index, MemoryAddress x) {
        tagMENUGETOBJECTINFO.hmenu$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle riid$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("riid"));
    public static VarHandle riid$VH() {
        return tagMENUGETOBJECTINFO.riid$VH;
    }
    public static MemoryAddress riid$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagMENUGETOBJECTINFO.riid$VH.get(seg);
    }
    public static void riid$set( MemorySegment seg, MemoryAddress x) {
        tagMENUGETOBJECTINFO.riid$VH.set(seg, x);
    }
    public static MemoryAddress riid$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagMENUGETOBJECTINFO.riid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void riid$set(MemorySegment seg, long index, MemoryAddress x) {
        tagMENUGETOBJECTINFO.riid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pvObj$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pvObj"));
    public static VarHandle pvObj$VH() {
        return tagMENUGETOBJECTINFO.pvObj$VH;
    }
    public static MemoryAddress pvObj$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagMENUGETOBJECTINFO.pvObj$VH.get(seg);
    }
    public static void pvObj$set( MemorySegment seg, MemoryAddress x) {
        tagMENUGETOBJECTINFO.pvObj$VH.set(seg, x);
    }
    public static MemoryAddress pvObj$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagMENUGETOBJECTINFO.pvObj$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pvObj$set(MemorySegment seg, long index, MemoryAddress x) {
        tagMENUGETOBJECTINFO.pvObj$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


