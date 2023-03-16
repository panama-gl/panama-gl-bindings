// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _STORAGE_QUERY_DEPENDENT_VOLUME_RESPONSE {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("ResponseLevel"),
        Constants$root.C_LONG$LAYOUT.withName("NumberEntries"),
        MemoryLayout.unionLayout(
            MemoryLayout.sequenceLayout(0, MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("EntryLength"),
                Constants$root.C_LONG$LAYOUT.withName("DependencyTypeFlags"),
                Constants$root.C_LONG$LAYOUT.withName("ProviderSpecificFlags"),
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("DeviceId"),
                    MemoryLayout.structLayout(
                        Constants$root.C_LONG$LAYOUT.withName("Data1"),
                        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
                        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
                        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
                    ).withName("VendorId")
                ).withName("VirtualStorageType")
            ).withName("_STORAGE_QUERY_DEPENDENT_VOLUME_LEV1_ENTRY")).withName("Lev1Depends"),
            MemoryLayout.sequenceLayout(0, MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("EntryLength"),
                Constants$root.C_LONG$LAYOUT.withName("DependencyTypeFlags"),
                Constants$root.C_LONG$LAYOUT.withName("ProviderSpecificFlags"),
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("DeviceId"),
                    MemoryLayout.structLayout(
                        Constants$root.C_LONG$LAYOUT.withName("Data1"),
                        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
                        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
                        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
                    ).withName("VendorId")
                ).withName("VirtualStorageType"),
                Constants$root.C_LONG$LAYOUT.withName("AncestorLevel"),
                Constants$root.C_LONG$LAYOUT.withName("HostVolumeNameOffset"),
                Constants$root.C_LONG$LAYOUT.withName("HostVolumeNameSize"),
                Constants$root.C_LONG$LAYOUT.withName("DependentVolumeNameOffset"),
                Constants$root.C_LONG$LAYOUT.withName("DependentVolumeNameSize"),
                Constants$root.C_LONG$LAYOUT.withName("RelativePathOffset"),
                Constants$root.C_LONG$LAYOUT.withName("RelativePathSize"),
                Constants$root.C_LONG$LAYOUT.withName("DependentDeviceNameOffset"),
                Constants$root.C_LONG$LAYOUT.withName("DependentDeviceNameSize")
            ).withName("_STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY")).withName("Lev2Depends"),
            MemoryLayout.paddingLayout(32)
        ).withName("$anon$0")
    ).withName("_STORAGE_QUERY_DEPENDENT_VOLUME_RESPONSE");
    public static MemoryLayout $LAYOUT() {
        return _STORAGE_QUERY_DEPENDENT_VOLUME_RESPONSE.$struct$LAYOUT;
    }
    static final VarHandle ResponseLevel$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ResponseLevel"));
    public static VarHandle ResponseLevel$VH() {
        return _STORAGE_QUERY_DEPENDENT_VOLUME_RESPONSE.ResponseLevel$VH;
    }
    public static int ResponseLevel$get(MemorySegment seg) {
        return (int)_STORAGE_QUERY_DEPENDENT_VOLUME_RESPONSE.ResponseLevel$VH.get(seg);
    }
    public static void ResponseLevel$set( MemorySegment seg, int x) {
        _STORAGE_QUERY_DEPENDENT_VOLUME_RESPONSE.ResponseLevel$VH.set(seg, x);
    }
    public static int ResponseLevel$get(MemorySegment seg, long index) {
        return (int)_STORAGE_QUERY_DEPENDENT_VOLUME_RESPONSE.ResponseLevel$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ResponseLevel$set(MemorySegment seg, long index, int x) {
        _STORAGE_QUERY_DEPENDENT_VOLUME_RESPONSE.ResponseLevel$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumberEntries$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberEntries"));
    public static VarHandle NumberEntries$VH() {
        return _STORAGE_QUERY_DEPENDENT_VOLUME_RESPONSE.NumberEntries$VH;
    }
    public static int NumberEntries$get(MemorySegment seg) {
        return (int)_STORAGE_QUERY_DEPENDENT_VOLUME_RESPONSE.NumberEntries$VH.get(seg);
    }
    public static void NumberEntries$set( MemorySegment seg, int x) {
        _STORAGE_QUERY_DEPENDENT_VOLUME_RESPONSE.NumberEntries$VH.set(seg, x);
    }
    public static int NumberEntries$get(MemorySegment seg, long index) {
        return (int)_STORAGE_QUERY_DEPENDENT_VOLUME_RESPONSE.NumberEntries$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberEntries$set(MemorySegment seg, long index, int x) {
        _STORAGE_QUERY_DEPENDENT_VOLUME_RESPONSE.NumberEntries$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


