// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagRID_DEVICE_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        Constants$root.C_LONG$LAYOUT.withName("dwType"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("dwId"),
                Constants$root.C_LONG$LAYOUT.withName("dwNumberOfButtons"),
                Constants$root.C_LONG$LAYOUT.withName("dwSampleRate"),
                Constants$root.C_LONG$LAYOUT.withName("fHasHorizontalWheel")
            ).withName("mouse"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("dwType"),
                Constants$root.C_LONG$LAYOUT.withName("dwSubType"),
                Constants$root.C_LONG$LAYOUT.withName("dwKeyboardMode"),
                Constants$root.C_LONG$LAYOUT.withName("dwNumberOfFunctionKeys"),
                Constants$root.C_LONG$LAYOUT.withName("dwNumberOfIndicators"),
                Constants$root.C_LONG$LAYOUT.withName("dwNumberOfKeysTotal")
            ).withName("keyboard"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("dwVendorId"),
                Constants$root.C_LONG$LAYOUT.withName("dwProductId"),
                Constants$root.C_LONG$LAYOUT.withName("dwVersionNumber"),
                Constants$root.C_SHORT$LAYOUT.withName("usUsagePage"),
                Constants$root.C_SHORT$LAYOUT.withName("usUsage")
            ).withName("hid")
        ).withName("$anon$0")
    ).withName("tagRID_DEVICE_INFO");
    public static MemoryLayout $LAYOUT() {
        return tagRID_DEVICE_INFO.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return tagRID_DEVICE_INFO.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)tagRID_DEVICE_INFO.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        tagRID_DEVICE_INFO.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)tagRID_DEVICE_INFO.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        tagRID_DEVICE_INFO.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwType"));
    public static VarHandle dwType$VH() {
        return tagRID_DEVICE_INFO.dwType$VH;
    }
    public static int dwType$get(MemorySegment seg) {
        return (int)tagRID_DEVICE_INFO.dwType$VH.get(seg);
    }
    public static void dwType$set( MemorySegment seg, int x) {
        tagRID_DEVICE_INFO.dwType$VH.set(seg, x);
    }
    public static int dwType$get(MemorySegment seg, long index) {
        return (int)tagRID_DEVICE_INFO.dwType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwType$set(MemorySegment seg, long index, int x) {
        tagRID_DEVICE_INFO.dwType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment mouse$slice(MemorySegment seg) {
        return seg.asSlice(8, 16);
    }
    public static MemorySegment keyboard$slice(MemorySegment seg) {
        return seg.asSlice(8, 24);
    }
    public static MemorySegment hid$slice(MemorySegment seg) {
        return seg.asSlice(8, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


