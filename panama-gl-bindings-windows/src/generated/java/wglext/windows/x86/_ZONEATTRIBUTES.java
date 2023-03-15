// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _ZONEATTRIBUTES {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        MemoryLayout.sequenceLayout(260, Constants$root.C_SHORT$LAYOUT).withName("szDisplayName"),
        MemoryLayout.sequenceLayout(200, Constants$root.C_SHORT$LAYOUT).withName("szDescription"),
        MemoryLayout.sequenceLayout(260, Constants$root.C_SHORT$LAYOUT).withName("szIconPath"),
        Constants$root.C_LONG$LAYOUT.withName("dwTemplateMinLevel"),
        Constants$root.C_LONG$LAYOUT.withName("dwTemplateRecommended"),
        Constants$root.C_LONG$LAYOUT.withName("dwTemplateCurrentLevel"),
        Constants$root.C_LONG$LAYOUT.withName("dwFlags")
    ).withName("_ZONEATTRIBUTES");
    public static MemoryLayout $LAYOUT() {
        return _ZONEATTRIBUTES.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _ZONEATTRIBUTES.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)_ZONEATTRIBUTES.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        _ZONEATTRIBUTES.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_ZONEATTRIBUTES.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _ZONEATTRIBUTES.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment szDisplayName$slice(MemorySegment seg) {
        return seg.asSlice(4, 520);
    }
    public static MemorySegment szDescription$slice(MemorySegment seg) {
        return seg.asSlice(524, 400);
    }
    public static MemorySegment szIconPath$slice(MemorySegment seg) {
        return seg.asSlice(924, 520);
    }
    static final VarHandle dwTemplateMinLevel$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwTemplateMinLevel"));
    public static VarHandle dwTemplateMinLevel$VH() {
        return _ZONEATTRIBUTES.dwTemplateMinLevel$VH;
    }
    public static int dwTemplateMinLevel$get(MemorySegment seg) {
        return (int)_ZONEATTRIBUTES.dwTemplateMinLevel$VH.get(seg);
    }
    public static void dwTemplateMinLevel$set( MemorySegment seg, int x) {
        _ZONEATTRIBUTES.dwTemplateMinLevel$VH.set(seg, x);
    }
    public static int dwTemplateMinLevel$get(MemorySegment seg, long index) {
        return (int)_ZONEATTRIBUTES.dwTemplateMinLevel$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwTemplateMinLevel$set(MemorySegment seg, long index, int x) {
        _ZONEATTRIBUTES.dwTemplateMinLevel$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwTemplateRecommended$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwTemplateRecommended"));
    public static VarHandle dwTemplateRecommended$VH() {
        return _ZONEATTRIBUTES.dwTemplateRecommended$VH;
    }
    public static int dwTemplateRecommended$get(MemorySegment seg) {
        return (int)_ZONEATTRIBUTES.dwTemplateRecommended$VH.get(seg);
    }
    public static void dwTemplateRecommended$set( MemorySegment seg, int x) {
        _ZONEATTRIBUTES.dwTemplateRecommended$VH.set(seg, x);
    }
    public static int dwTemplateRecommended$get(MemorySegment seg, long index) {
        return (int)_ZONEATTRIBUTES.dwTemplateRecommended$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwTemplateRecommended$set(MemorySegment seg, long index, int x) {
        _ZONEATTRIBUTES.dwTemplateRecommended$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwTemplateCurrentLevel$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwTemplateCurrentLevel"));
    public static VarHandle dwTemplateCurrentLevel$VH() {
        return _ZONEATTRIBUTES.dwTemplateCurrentLevel$VH;
    }
    public static int dwTemplateCurrentLevel$get(MemorySegment seg) {
        return (int)_ZONEATTRIBUTES.dwTemplateCurrentLevel$VH.get(seg);
    }
    public static void dwTemplateCurrentLevel$set( MemorySegment seg, int x) {
        _ZONEATTRIBUTES.dwTemplateCurrentLevel$VH.set(seg, x);
    }
    public static int dwTemplateCurrentLevel$get(MemorySegment seg, long index) {
        return (int)_ZONEATTRIBUTES.dwTemplateCurrentLevel$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwTemplateCurrentLevel$set(MemorySegment seg, long index, int x) {
        _ZONEATTRIBUTES.dwTemplateCurrentLevel$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return _ZONEATTRIBUTES.dwFlags$VH;
    }
    public static int dwFlags$get(MemorySegment seg) {
        return (int)_ZONEATTRIBUTES.dwFlags$VH.get(seg);
    }
    public static void dwFlags$set( MemorySegment seg, int x) {
        _ZONEATTRIBUTES.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)_ZONEATTRIBUTES.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        _ZONEATTRIBUTES.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


