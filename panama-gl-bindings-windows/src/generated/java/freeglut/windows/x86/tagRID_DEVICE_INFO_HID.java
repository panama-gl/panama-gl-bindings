// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagRID_DEVICE_INFO_HID {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwVendorId"),
        Constants$root.C_LONG$LAYOUT.withName("dwProductId"),
        Constants$root.C_LONG$LAYOUT.withName("dwVersionNumber"),
        Constants$root.C_SHORT$LAYOUT.withName("usUsagePage"),
        Constants$root.C_SHORT$LAYOUT.withName("usUsage")
    ).withName("tagRID_DEVICE_INFO_HID");
    public static MemoryLayout $LAYOUT() {
        return tagRID_DEVICE_INFO_HID.$struct$LAYOUT;
    }
    static final VarHandle dwVendorId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwVendorId"));
    public static VarHandle dwVendorId$VH() {
        return tagRID_DEVICE_INFO_HID.dwVendorId$VH;
    }
    public static int dwVendorId$get(MemorySegment seg) {
        return (int)tagRID_DEVICE_INFO_HID.dwVendorId$VH.get(seg);
    }
    public static void dwVendorId$set( MemorySegment seg, int x) {
        tagRID_DEVICE_INFO_HID.dwVendorId$VH.set(seg, x);
    }
    public static int dwVendorId$get(MemorySegment seg, long index) {
        return (int)tagRID_DEVICE_INFO_HID.dwVendorId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwVendorId$set(MemorySegment seg, long index, int x) {
        tagRID_DEVICE_INFO_HID.dwVendorId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwProductId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwProductId"));
    public static VarHandle dwProductId$VH() {
        return tagRID_DEVICE_INFO_HID.dwProductId$VH;
    }
    public static int dwProductId$get(MemorySegment seg) {
        return (int)tagRID_DEVICE_INFO_HID.dwProductId$VH.get(seg);
    }
    public static void dwProductId$set( MemorySegment seg, int x) {
        tagRID_DEVICE_INFO_HID.dwProductId$VH.set(seg, x);
    }
    public static int dwProductId$get(MemorySegment seg, long index) {
        return (int)tagRID_DEVICE_INFO_HID.dwProductId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwProductId$set(MemorySegment seg, long index, int x) {
        tagRID_DEVICE_INFO_HID.dwProductId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwVersionNumber$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwVersionNumber"));
    public static VarHandle dwVersionNumber$VH() {
        return tagRID_DEVICE_INFO_HID.dwVersionNumber$VH;
    }
    public static int dwVersionNumber$get(MemorySegment seg) {
        return (int)tagRID_DEVICE_INFO_HID.dwVersionNumber$VH.get(seg);
    }
    public static void dwVersionNumber$set( MemorySegment seg, int x) {
        tagRID_DEVICE_INFO_HID.dwVersionNumber$VH.set(seg, x);
    }
    public static int dwVersionNumber$get(MemorySegment seg, long index) {
        return (int)tagRID_DEVICE_INFO_HID.dwVersionNumber$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwVersionNumber$set(MemorySegment seg, long index, int x) {
        tagRID_DEVICE_INFO_HID.dwVersionNumber$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle usUsagePage$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("usUsagePage"));
    public static VarHandle usUsagePage$VH() {
        return tagRID_DEVICE_INFO_HID.usUsagePage$VH;
    }
    public static short usUsagePage$get(MemorySegment seg) {
        return (short)tagRID_DEVICE_INFO_HID.usUsagePage$VH.get(seg);
    }
    public static void usUsagePage$set( MemorySegment seg, short x) {
        tagRID_DEVICE_INFO_HID.usUsagePage$VH.set(seg, x);
    }
    public static short usUsagePage$get(MemorySegment seg, long index) {
        return (short)tagRID_DEVICE_INFO_HID.usUsagePage$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void usUsagePage$set(MemorySegment seg, long index, short x) {
        tagRID_DEVICE_INFO_HID.usUsagePage$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle usUsage$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("usUsage"));
    public static VarHandle usUsage$VH() {
        return tagRID_DEVICE_INFO_HID.usUsage$VH;
    }
    public static short usUsage$get(MemorySegment seg) {
        return (short)tagRID_DEVICE_INFO_HID.usUsage$VH.get(seg);
    }
    public static void usUsage$set( MemorySegment seg, short x) {
        tagRID_DEVICE_INFO_HID.usUsage$VH.set(seg, x);
    }
    public static short usUsage$get(MemorySegment seg, long index) {
        return (short)tagRID_DEVICE_INFO_HID.usUsage$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void usUsage$set(MemorySegment seg, long index, short x) {
        tagRID_DEVICE_INFO_HID.usUsage$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


