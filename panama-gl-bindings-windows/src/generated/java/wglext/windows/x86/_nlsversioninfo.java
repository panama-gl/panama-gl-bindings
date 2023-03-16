// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _nlsversioninfo {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwNLSVersionInfoSize"),
        Constants$root.C_LONG$LAYOUT.withName("dwNLSVersion"),
        Constants$root.C_LONG$LAYOUT.withName("dwDefinedVersion"),
        Constants$root.C_LONG$LAYOUT.withName("dwEffectiveId"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Data1"),
            Constants$root.C_SHORT$LAYOUT.withName("Data2"),
            Constants$root.C_SHORT$LAYOUT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
        ).withName("guidCustomVersion")
    ).withName("_nlsversioninfo");
    public static MemoryLayout $LAYOUT() {
        return _nlsversioninfo.$struct$LAYOUT;
    }
    static final VarHandle dwNLSVersionInfoSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwNLSVersionInfoSize"));
    public static VarHandle dwNLSVersionInfoSize$VH() {
        return _nlsversioninfo.dwNLSVersionInfoSize$VH;
    }
    public static int dwNLSVersionInfoSize$get(MemorySegment seg) {
        return (int)_nlsversioninfo.dwNLSVersionInfoSize$VH.get(seg);
    }
    public static void dwNLSVersionInfoSize$set( MemorySegment seg, int x) {
        _nlsversioninfo.dwNLSVersionInfoSize$VH.set(seg, x);
    }
    public static int dwNLSVersionInfoSize$get(MemorySegment seg, long index) {
        return (int)_nlsversioninfo.dwNLSVersionInfoSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwNLSVersionInfoSize$set(MemorySegment seg, long index, int x) {
        _nlsversioninfo.dwNLSVersionInfoSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwNLSVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwNLSVersion"));
    public static VarHandle dwNLSVersion$VH() {
        return _nlsversioninfo.dwNLSVersion$VH;
    }
    public static int dwNLSVersion$get(MemorySegment seg) {
        return (int)_nlsversioninfo.dwNLSVersion$VH.get(seg);
    }
    public static void dwNLSVersion$set( MemorySegment seg, int x) {
        _nlsversioninfo.dwNLSVersion$VH.set(seg, x);
    }
    public static int dwNLSVersion$get(MemorySegment seg, long index) {
        return (int)_nlsversioninfo.dwNLSVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwNLSVersion$set(MemorySegment seg, long index, int x) {
        _nlsversioninfo.dwNLSVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwDefinedVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwDefinedVersion"));
    public static VarHandle dwDefinedVersion$VH() {
        return _nlsversioninfo.dwDefinedVersion$VH;
    }
    public static int dwDefinedVersion$get(MemorySegment seg) {
        return (int)_nlsversioninfo.dwDefinedVersion$VH.get(seg);
    }
    public static void dwDefinedVersion$set( MemorySegment seg, int x) {
        _nlsversioninfo.dwDefinedVersion$VH.set(seg, x);
    }
    public static int dwDefinedVersion$get(MemorySegment seg, long index) {
        return (int)_nlsversioninfo.dwDefinedVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwDefinedVersion$set(MemorySegment seg, long index, int x) {
        _nlsversioninfo.dwDefinedVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwEffectiveId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwEffectiveId"));
    public static VarHandle dwEffectiveId$VH() {
        return _nlsversioninfo.dwEffectiveId$VH;
    }
    public static int dwEffectiveId$get(MemorySegment seg) {
        return (int)_nlsversioninfo.dwEffectiveId$VH.get(seg);
    }
    public static void dwEffectiveId$set( MemorySegment seg, int x) {
        _nlsversioninfo.dwEffectiveId$VH.set(seg, x);
    }
    public static int dwEffectiveId$get(MemorySegment seg, long index) {
        return (int)_nlsversioninfo.dwEffectiveId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwEffectiveId$set(MemorySegment seg, long index, int x) {
        _nlsversioninfo.dwEffectiveId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment guidCustomVersion$slice(MemorySegment seg) {
        return seg.asSlice(16, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


