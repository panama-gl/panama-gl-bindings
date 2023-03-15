// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GET_MEDIA_TYPES {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("DeviceType"),
        Constants$root.C_LONG$LAYOUT.withName("MediaInfoCount"),
        MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
            MemoryLayout.unionLayout(
                MemoryLayout.structLayout(
                    MemoryLayout.unionLayout(
                        MemoryLayout.structLayout(
                            Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                            Constants$root.C_LONG$LAYOUT.withName("HighPart")
                        ).withName("$anon$0"),
                        MemoryLayout.structLayout(
                            Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                            Constants$root.C_LONG$LAYOUT.withName("HighPart")
                        ).withName("u"),
                        Constants$root.C_LONG_LONG$LAYOUT.withName("QuadPart")
                    ).withName("Cylinders"),
                    Constants$root.C_LONG$LAYOUT.withName("MediaType"),
                    Constants$root.C_LONG$LAYOUT.withName("TracksPerCylinder"),
                    Constants$root.C_LONG$LAYOUT.withName("SectorsPerTrack"),
                    Constants$root.C_LONG$LAYOUT.withName("BytesPerSector"),
                    Constants$root.C_LONG$LAYOUT.withName("NumberMediaSides"),
                    Constants$root.C_LONG$LAYOUT.withName("MediaCharacteristics")
                ).withName("DiskInfo"),
                MemoryLayout.structLayout(
                    MemoryLayout.unionLayout(
                        MemoryLayout.structLayout(
                            Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                            Constants$root.C_LONG$LAYOUT.withName("HighPart")
                        ).withName("$anon$0"),
                        MemoryLayout.structLayout(
                            Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                            Constants$root.C_LONG$LAYOUT.withName("HighPart")
                        ).withName("u"),
                        Constants$root.C_LONG_LONG$LAYOUT.withName("QuadPart")
                    ).withName("Cylinders"),
                    Constants$root.C_LONG$LAYOUT.withName("MediaType"),
                    Constants$root.C_LONG$LAYOUT.withName("TracksPerCylinder"),
                    Constants$root.C_LONG$LAYOUT.withName("SectorsPerTrack"),
                    Constants$root.C_LONG$LAYOUT.withName("BytesPerSector"),
                    Constants$root.C_LONG$LAYOUT.withName("NumberMediaSides"),
                    Constants$root.C_LONG$LAYOUT.withName("MediaCharacteristics")
                ).withName("RemovableDiskInfo"),
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("MediaType"),
                    Constants$root.C_LONG$LAYOUT.withName("MediaCharacteristics"),
                    Constants$root.C_LONG$LAYOUT.withName("CurrentBlockSize"),
                    Constants$root.C_LONG$LAYOUT.withName("BusType"),
                    MemoryLayout.unionLayout(
                        MemoryLayout.structLayout(
                            Constants$root.C_CHAR$LAYOUT.withName("MediumType"),
                            Constants$root.C_CHAR$LAYOUT.withName("DensityCode")
                        ).withName("ScsiInformation")
                    ).withName("BusSpecificData"),
                    MemoryLayout.paddingLayout(16)
                ).withName("TapeInfo")
            ).withName("DeviceSpecific")
        ).withName("_DEVICE_MEDIA_INFO")).withName("MediaInfo")
    ).withName("_GET_MEDIA_TYPES");
    public static MemoryLayout $LAYOUT() {
        return _GET_MEDIA_TYPES.$struct$LAYOUT;
    }
    static final VarHandle DeviceType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DeviceType"));
    public static VarHandle DeviceType$VH() {
        return _GET_MEDIA_TYPES.DeviceType$VH;
    }
    public static int DeviceType$get(MemorySegment seg) {
        return (int)_GET_MEDIA_TYPES.DeviceType$VH.get(seg);
    }
    public static void DeviceType$set( MemorySegment seg, int x) {
        _GET_MEDIA_TYPES.DeviceType$VH.set(seg, x);
    }
    public static int DeviceType$get(MemorySegment seg, long index) {
        return (int)_GET_MEDIA_TYPES.DeviceType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DeviceType$set(MemorySegment seg, long index, int x) {
        _GET_MEDIA_TYPES.DeviceType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MediaInfoCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MediaInfoCount"));
    public static VarHandle MediaInfoCount$VH() {
        return _GET_MEDIA_TYPES.MediaInfoCount$VH;
    }
    public static int MediaInfoCount$get(MemorySegment seg) {
        return (int)_GET_MEDIA_TYPES.MediaInfoCount$VH.get(seg);
    }
    public static void MediaInfoCount$set( MemorySegment seg, int x) {
        _GET_MEDIA_TYPES.MediaInfoCount$VH.set(seg, x);
    }
    public static int MediaInfoCount$get(MemorySegment seg, long index) {
        return (int)_GET_MEDIA_TYPES.MediaInfoCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MediaInfoCount$set(MemorySegment seg, long index, int x) {
        _GET_MEDIA_TYPES.MediaInfoCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment MediaInfo$slice(MemorySegment seg) {
        return seg.asSlice(8, 32);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


