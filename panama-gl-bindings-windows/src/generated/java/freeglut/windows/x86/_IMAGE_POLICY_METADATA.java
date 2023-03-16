// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _IMAGE_POLICY_METADATA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_CHAR$LAYOUT.withName("Version"),
        MemoryLayout.sequenceLayout(7, Constants$root.C_CHAR$LAYOUT).withName("Reserved0"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("ApplicationId"),
        MemoryLayout.sequenceLayout(0, MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Type"),
            Constants$root.C_LONG$LAYOUT.withName("PolicyId"),
            MemoryLayout.unionLayout(
                Constants$root.C_POINTER$LAYOUT.withName("None"),
                Constants$root.C_CHAR$LAYOUT.withName("BoolValue"),
                Constants$root.C_CHAR$LAYOUT.withName("Int8Value"),
                Constants$root.C_CHAR$LAYOUT.withName("UInt8Value"),
                Constants$root.C_SHORT$LAYOUT.withName("Int16Value"),
                Constants$root.C_SHORT$LAYOUT.withName("UInt16Value"),
                Constants$root.C_LONG$LAYOUT.withName("Int32Value"),
                Constants$root.C_LONG$LAYOUT.withName("UInt32Value"),
                Constants$root.C_LONG_LONG$LAYOUT.withName("Int64Value"),
                Constants$root.C_LONG_LONG$LAYOUT.withName("UInt64Value"),
                Constants$root.C_POINTER$LAYOUT.withName("AnsiStringValue"),
                Constants$root.C_POINTER$LAYOUT.withName("UnicodeStringValue")
            ).withName("u")
        ).withName("_IMAGE_POLICY_ENTRY")).withName("Policies")
    ).withName("_IMAGE_POLICY_METADATA");
    public static MemoryLayout $LAYOUT() {
        return _IMAGE_POLICY_METADATA.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _IMAGE_POLICY_METADATA.Version$VH;
    }
    public static byte Version$get(MemorySegment seg) {
        return (byte)_IMAGE_POLICY_METADATA.Version$VH.get(seg);
    }
    public static void Version$set( MemorySegment seg, byte x) {
        _IMAGE_POLICY_METADATA.Version$VH.set(seg, x);
    }
    public static byte Version$get(MemorySegment seg, long index) {
        return (byte)_IMAGE_POLICY_METADATA.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, byte x) {
        _IMAGE_POLICY_METADATA.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Reserved0$slice(MemorySegment seg) {
        return seg.asSlice(1, 7);
    }
    static final VarHandle ApplicationId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ApplicationId"));
    public static VarHandle ApplicationId$VH() {
        return _IMAGE_POLICY_METADATA.ApplicationId$VH;
    }
    public static long ApplicationId$get(MemorySegment seg) {
        return (long)_IMAGE_POLICY_METADATA.ApplicationId$VH.get(seg);
    }
    public static void ApplicationId$set( MemorySegment seg, long x) {
        _IMAGE_POLICY_METADATA.ApplicationId$VH.set(seg, x);
    }
    public static long ApplicationId$get(MemorySegment seg, long index) {
        return (long)_IMAGE_POLICY_METADATA.ApplicationId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ApplicationId$set(MemorySegment seg, long index, long x) {
        _IMAGE_POLICY_METADATA.ApplicationId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

