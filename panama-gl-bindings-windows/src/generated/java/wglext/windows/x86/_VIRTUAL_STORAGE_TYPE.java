// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _VIRTUAL_STORAGE_TYPE {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("DeviceId"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Data1"),
            Constants$root.C_SHORT$LAYOUT.withName("Data2"),
            Constants$root.C_SHORT$LAYOUT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
        ).withName("VendorId")
    ).withName("_VIRTUAL_STORAGE_TYPE");
    public static MemoryLayout $LAYOUT() {
        return _VIRTUAL_STORAGE_TYPE.$struct$LAYOUT;
    }
    static final VarHandle DeviceId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DeviceId"));
    public static VarHandle DeviceId$VH() {
        return _VIRTUAL_STORAGE_TYPE.DeviceId$VH;
    }
    public static int DeviceId$get(MemorySegment seg) {
        return (int)_VIRTUAL_STORAGE_TYPE.DeviceId$VH.get(seg);
    }
    public static void DeviceId$set( MemorySegment seg, int x) {
        _VIRTUAL_STORAGE_TYPE.DeviceId$VH.set(seg, x);
    }
    public static int DeviceId$get(MemorySegment seg, long index) {
        return (int)_VIRTUAL_STORAGE_TYPE.DeviceId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DeviceId$set(MemorySegment seg, long index, int x) {
        _VIRTUAL_STORAGE_TYPE.DeviceId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment VendorId$slice(MemorySegment seg) {
        return seg.asSlice(4, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


