// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _DEVICE_MEDIA_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
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
    ).withName("_DEVICE_MEDIA_INFO");
    public static MemoryLayout $LAYOUT() {
        return _DEVICE_MEDIA_INFO.$struct$LAYOUT;
    }
    public static class DeviceSpecific {

        static final  GroupLayout DeviceSpecific$union$LAYOUT = MemoryLayout.unionLayout(
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
        );
        public static MemoryLayout $LAYOUT() {
            return DeviceSpecific.DeviceSpecific$union$LAYOUT;
        }
        public static class DiskInfo {

            static final  GroupLayout DeviceSpecific$DiskInfo$struct$LAYOUT = MemoryLayout.structLayout(
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
            );
            public static MemoryLayout $LAYOUT() {
                return DiskInfo.DeviceSpecific$DiskInfo$struct$LAYOUT;
            }
            public static MemorySegment Cylinders$slice(MemorySegment seg) {
                return seg.asSlice(0, 8);
            }
            static final VarHandle MediaType$VH = DeviceSpecific$DiskInfo$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MediaType"));
            public static VarHandle MediaType$VH() {
                return DiskInfo.MediaType$VH;
            }
            public static int MediaType$get(MemorySegment seg) {
                return (int)DiskInfo.MediaType$VH.get(seg);
            }
            public static void MediaType$set( MemorySegment seg, int x) {
                DiskInfo.MediaType$VH.set(seg, x);
            }
            public static int MediaType$get(MemorySegment seg, long index) {
                return (int)DiskInfo.MediaType$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void MediaType$set(MemorySegment seg, long index, int x) {
                DiskInfo.MediaType$VH.set(seg.asSlice(index*sizeof()), x);
            }
            static final VarHandle TracksPerCylinder$VH = DeviceSpecific$DiskInfo$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TracksPerCylinder"));
            public static VarHandle TracksPerCylinder$VH() {
                return DiskInfo.TracksPerCylinder$VH;
            }
            public static int TracksPerCylinder$get(MemorySegment seg) {
                return (int)DiskInfo.TracksPerCylinder$VH.get(seg);
            }
            public static void TracksPerCylinder$set( MemorySegment seg, int x) {
                DiskInfo.TracksPerCylinder$VH.set(seg, x);
            }
            public static int TracksPerCylinder$get(MemorySegment seg, long index) {
                return (int)DiskInfo.TracksPerCylinder$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void TracksPerCylinder$set(MemorySegment seg, long index, int x) {
                DiskInfo.TracksPerCylinder$VH.set(seg.asSlice(index*sizeof()), x);
            }
            static final VarHandle SectorsPerTrack$VH = DeviceSpecific$DiskInfo$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SectorsPerTrack"));
            public static VarHandle SectorsPerTrack$VH() {
                return DiskInfo.SectorsPerTrack$VH;
            }
            public static int SectorsPerTrack$get(MemorySegment seg) {
                return (int)DiskInfo.SectorsPerTrack$VH.get(seg);
            }
            public static void SectorsPerTrack$set( MemorySegment seg, int x) {
                DiskInfo.SectorsPerTrack$VH.set(seg, x);
            }
            public static int SectorsPerTrack$get(MemorySegment seg, long index) {
                return (int)DiskInfo.SectorsPerTrack$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void SectorsPerTrack$set(MemorySegment seg, long index, int x) {
                DiskInfo.SectorsPerTrack$VH.set(seg.asSlice(index*sizeof()), x);
            }
            static final VarHandle BytesPerSector$VH = DeviceSpecific$DiskInfo$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("BytesPerSector"));
            public static VarHandle BytesPerSector$VH() {
                return DiskInfo.BytesPerSector$VH;
            }
            public static int BytesPerSector$get(MemorySegment seg) {
                return (int)DiskInfo.BytesPerSector$VH.get(seg);
            }
            public static void BytesPerSector$set( MemorySegment seg, int x) {
                DiskInfo.BytesPerSector$VH.set(seg, x);
            }
            public static int BytesPerSector$get(MemorySegment seg, long index) {
                return (int)DiskInfo.BytesPerSector$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void BytesPerSector$set(MemorySegment seg, long index, int x) {
                DiskInfo.BytesPerSector$VH.set(seg.asSlice(index*sizeof()), x);
            }
            static final VarHandle NumberMediaSides$VH = DeviceSpecific$DiskInfo$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberMediaSides"));
            public static VarHandle NumberMediaSides$VH() {
                return DiskInfo.NumberMediaSides$VH;
            }
            public static int NumberMediaSides$get(MemorySegment seg) {
                return (int)DiskInfo.NumberMediaSides$VH.get(seg);
            }
            public static void NumberMediaSides$set( MemorySegment seg, int x) {
                DiskInfo.NumberMediaSides$VH.set(seg, x);
            }
            public static int NumberMediaSides$get(MemorySegment seg, long index) {
                return (int)DiskInfo.NumberMediaSides$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void NumberMediaSides$set(MemorySegment seg, long index, int x) {
                DiskInfo.NumberMediaSides$VH.set(seg.asSlice(index*sizeof()), x);
            }
            static final VarHandle MediaCharacteristics$VH = DeviceSpecific$DiskInfo$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MediaCharacteristics"));
            public static VarHandle MediaCharacteristics$VH() {
                return DiskInfo.MediaCharacteristics$VH;
            }
            public static int MediaCharacteristics$get(MemorySegment seg) {
                return (int)DiskInfo.MediaCharacteristics$VH.get(seg);
            }
            public static void MediaCharacteristics$set( MemorySegment seg, int x) {
                DiskInfo.MediaCharacteristics$VH.set(seg, x);
            }
            public static int MediaCharacteristics$get(MemorySegment seg, long index) {
                return (int)DiskInfo.MediaCharacteristics$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void MediaCharacteristics$set(MemorySegment seg, long index, int x) {
                DiskInfo.MediaCharacteristics$VH.set(seg.asSlice(index*sizeof()), x);
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
            public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
                return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
            }
            public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
        }

        public static MemorySegment DiskInfo$slice(MemorySegment seg) {
            return seg.asSlice(0, 32);
        }
        public static class RemovableDiskInfo {

            static final  GroupLayout DeviceSpecific$RemovableDiskInfo$struct$LAYOUT = MemoryLayout.structLayout(
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
            );
            public static MemoryLayout $LAYOUT() {
                return RemovableDiskInfo.DeviceSpecific$RemovableDiskInfo$struct$LAYOUT;
            }
            public static MemorySegment Cylinders$slice(MemorySegment seg) {
                return seg.asSlice(0, 8);
            }
            static final VarHandle MediaType$VH = DeviceSpecific$RemovableDiskInfo$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MediaType"));
            public static VarHandle MediaType$VH() {
                return RemovableDiskInfo.MediaType$VH;
            }
            public static int MediaType$get(MemorySegment seg) {
                return (int)RemovableDiskInfo.MediaType$VH.get(seg);
            }
            public static void MediaType$set( MemorySegment seg, int x) {
                RemovableDiskInfo.MediaType$VH.set(seg, x);
            }
            public static int MediaType$get(MemorySegment seg, long index) {
                return (int)RemovableDiskInfo.MediaType$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void MediaType$set(MemorySegment seg, long index, int x) {
                RemovableDiskInfo.MediaType$VH.set(seg.asSlice(index*sizeof()), x);
            }
            static final VarHandle TracksPerCylinder$VH = DeviceSpecific$RemovableDiskInfo$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TracksPerCylinder"));
            public static VarHandle TracksPerCylinder$VH() {
                return RemovableDiskInfo.TracksPerCylinder$VH;
            }
            public static int TracksPerCylinder$get(MemorySegment seg) {
                return (int)RemovableDiskInfo.TracksPerCylinder$VH.get(seg);
            }
            public static void TracksPerCylinder$set( MemorySegment seg, int x) {
                RemovableDiskInfo.TracksPerCylinder$VH.set(seg, x);
            }
            public static int TracksPerCylinder$get(MemorySegment seg, long index) {
                return (int)RemovableDiskInfo.TracksPerCylinder$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void TracksPerCylinder$set(MemorySegment seg, long index, int x) {
                RemovableDiskInfo.TracksPerCylinder$VH.set(seg.asSlice(index*sizeof()), x);
            }
            static final VarHandle SectorsPerTrack$VH = DeviceSpecific$RemovableDiskInfo$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SectorsPerTrack"));
            public static VarHandle SectorsPerTrack$VH() {
                return RemovableDiskInfo.SectorsPerTrack$VH;
            }
            public static int SectorsPerTrack$get(MemorySegment seg) {
                return (int)RemovableDiskInfo.SectorsPerTrack$VH.get(seg);
            }
            public static void SectorsPerTrack$set( MemorySegment seg, int x) {
                RemovableDiskInfo.SectorsPerTrack$VH.set(seg, x);
            }
            public static int SectorsPerTrack$get(MemorySegment seg, long index) {
                return (int)RemovableDiskInfo.SectorsPerTrack$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void SectorsPerTrack$set(MemorySegment seg, long index, int x) {
                RemovableDiskInfo.SectorsPerTrack$VH.set(seg.asSlice(index*sizeof()), x);
            }
            static final VarHandle BytesPerSector$VH = DeviceSpecific$RemovableDiskInfo$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("BytesPerSector"));
            public static VarHandle BytesPerSector$VH() {
                return RemovableDiskInfo.BytesPerSector$VH;
            }
            public static int BytesPerSector$get(MemorySegment seg) {
                return (int)RemovableDiskInfo.BytesPerSector$VH.get(seg);
            }
            public static void BytesPerSector$set( MemorySegment seg, int x) {
                RemovableDiskInfo.BytesPerSector$VH.set(seg, x);
            }
            public static int BytesPerSector$get(MemorySegment seg, long index) {
                return (int)RemovableDiskInfo.BytesPerSector$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void BytesPerSector$set(MemorySegment seg, long index, int x) {
                RemovableDiskInfo.BytesPerSector$VH.set(seg.asSlice(index*sizeof()), x);
            }
            static final VarHandle NumberMediaSides$VH = DeviceSpecific$RemovableDiskInfo$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberMediaSides"));
            public static VarHandle NumberMediaSides$VH() {
                return RemovableDiskInfo.NumberMediaSides$VH;
            }
            public static int NumberMediaSides$get(MemorySegment seg) {
                return (int)RemovableDiskInfo.NumberMediaSides$VH.get(seg);
            }
            public static void NumberMediaSides$set( MemorySegment seg, int x) {
                RemovableDiskInfo.NumberMediaSides$VH.set(seg, x);
            }
            public static int NumberMediaSides$get(MemorySegment seg, long index) {
                return (int)RemovableDiskInfo.NumberMediaSides$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void NumberMediaSides$set(MemorySegment seg, long index, int x) {
                RemovableDiskInfo.NumberMediaSides$VH.set(seg.asSlice(index*sizeof()), x);
            }
            static final VarHandle MediaCharacteristics$VH = DeviceSpecific$RemovableDiskInfo$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MediaCharacteristics"));
            public static VarHandle MediaCharacteristics$VH() {
                return RemovableDiskInfo.MediaCharacteristics$VH;
            }
            public static int MediaCharacteristics$get(MemorySegment seg) {
                return (int)RemovableDiskInfo.MediaCharacteristics$VH.get(seg);
            }
            public static void MediaCharacteristics$set( MemorySegment seg, int x) {
                RemovableDiskInfo.MediaCharacteristics$VH.set(seg, x);
            }
            public static int MediaCharacteristics$get(MemorySegment seg, long index) {
                return (int)RemovableDiskInfo.MediaCharacteristics$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void MediaCharacteristics$set(MemorySegment seg, long index, int x) {
                RemovableDiskInfo.MediaCharacteristics$VH.set(seg.asSlice(index*sizeof()), x);
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
            public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
                return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
            }
            public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
        }

        public static MemorySegment RemovableDiskInfo$slice(MemorySegment seg) {
            return seg.asSlice(0, 32);
        }
        public static class TapeInfo {

            static final  GroupLayout DeviceSpecific$TapeInfo$struct$LAYOUT = MemoryLayout.structLayout(
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
            );
            public static MemoryLayout $LAYOUT() {
                return TapeInfo.DeviceSpecific$TapeInfo$struct$LAYOUT;
            }
            static final VarHandle MediaType$VH = DeviceSpecific$TapeInfo$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MediaType"));
            public static VarHandle MediaType$VH() {
                return TapeInfo.MediaType$VH;
            }
            public static int MediaType$get(MemorySegment seg) {
                return (int)TapeInfo.MediaType$VH.get(seg);
            }
            public static void MediaType$set( MemorySegment seg, int x) {
                TapeInfo.MediaType$VH.set(seg, x);
            }
            public static int MediaType$get(MemorySegment seg, long index) {
                return (int)TapeInfo.MediaType$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void MediaType$set(MemorySegment seg, long index, int x) {
                TapeInfo.MediaType$VH.set(seg.asSlice(index*sizeof()), x);
            }
            static final VarHandle MediaCharacteristics$VH = DeviceSpecific$TapeInfo$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MediaCharacteristics"));
            public static VarHandle MediaCharacteristics$VH() {
                return TapeInfo.MediaCharacteristics$VH;
            }
            public static int MediaCharacteristics$get(MemorySegment seg) {
                return (int)TapeInfo.MediaCharacteristics$VH.get(seg);
            }
            public static void MediaCharacteristics$set( MemorySegment seg, int x) {
                TapeInfo.MediaCharacteristics$VH.set(seg, x);
            }
            public static int MediaCharacteristics$get(MemorySegment seg, long index) {
                return (int)TapeInfo.MediaCharacteristics$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void MediaCharacteristics$set(MemorySegment seg, long index, int x) {
                TapeInfo.MediaCharacteristics$VH.set(seg.asSlice(index*sizeof()), x);
            }
            static final VarHandle CurrentBlockSize$VH = DeviceSpecific$TapeInfo$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CurrentBlockSize"));
            public static VarHandle CurrentBlockSize$VH() {
                return TapeInfo.CurrentBlockSize$VH;
            }
            public static int CurrentBlockSize$get(MemorySegment seg) {
                return (int)TapeInfo.CurrentBlockSize$VH.get(seg);
            }
            public static void CurrentBlockSize$set( MemorySegment seg, int x) {
                TapeInfo.CurrentBlockSize$VH.set(seg, x);
            }
            public static int CurrentBlockSize$get(MemorySegment seg, long index) {
                return (int)TapeInfo.CurrentBlockSize$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void CurrentBlockSize$set(MemorySegment seg, long index, int x) {
                TapeInfo.CurrentBlockSize$VH.set(seg.asSlice(index*sizeof()), x);
            }
            static final VarHandle BusType$VH = DeviceSpecific$TapeInfo$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("BusType"));
            public static VarHandle BusType$VH() {
                return TapeInfo.BusType$VH;
            }
            public static int BusType$get(MemorySegment seg) {
                return (int)TapeInfo.BusType$VH.get(seg);
            }
            public static void BusType$set( MemorySegment seg, int x) {
                TapeInfo.BusType$VH.set(seg, x);
            }
            public static int BusType$get(MemorySegment seg, long index) {
                return (int)TapeInfo.BusType$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void BusType$set(MemorySegment seg, long index, int x) {
                TapeInfo.BusType$VH.set(seg.asSlice(index*sizeof()), x);
            }
            public static class BusSpecificData {

                static final  GroupLayout DeviceSpecific$TapeInfo$BusSpecificData$union$LAYOUT = MemoryLayout.unionLayout(
                    MemoryLayout.structLayout(
                        Constants$root.C_CHAR$LAYOUT.withName("MediumType"),
                        Constants$root.C_CHAR$LAYOUT.withName("DensityCode")
                    ).withName("ScsiInformation")
                );
                public static MemoryLayout $LAYOUT() {
                    return BusSpecificData.DeviceSpecific$TapeInfo$BusSpecificData$union$LAYOUT;
                }
                public static class ScsiInformation {

                    static final  GroupLayout DeviceSpecific$TapeInfo$BusSpecificData$ScsiInformation$struct$LAYOUT = MemoryLayout.structLayout(
                        Constants$root.C_CHAR$LAYOUT.withName("MediumType"),
                        Constants$root.C_CHAR$LAYOUT.withName("DensityCode")
                    );
                    public static MemoryLayout $LAYOUT() {
                        return ScsiInformation.DeviceSpecific$TapeInfo$BusSpecificData$ScsiInformation$struct$LAYOUT;
                    }
                    static final VarHandle MediumType$VH = DeviceSpecific$TapeInfo$BusSpecificData$ScsiInformation$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MediumType"));
                    public static VarHandle MediumType$VH() {
                        return ScsiInformation.MediumType$VH;
                    }
                    public static byte MediumType$get(MemorySegment seg) {
                        return (byte)ScsiInformation.MediumType$VH.get(seg);
                    }
                    public static void MediumType$set( MemorySegment seg, byte x) {
                        ScsiInformation.MediumType$VH.set(seg, x);
                    }
                    public static byte MediumType$get(MemorySegment seg, long index) {
                        return (byte)ScsiInformation.MediumType$VH.get(seg.asSlice(index*sizeof()));
                    }
                    public static void MediumType$set(MemorySegment seg, long index, byte x) {
                        ScsiInformation.MediumType$VH.set(seg.asSlice(index*sizeof()), x);
                    }
                    static final VarHandle DensityCode$VH = DeviceSpecific$TapeInfo$BusSpecificData$ScsiInformation$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DensityCode"));
                    public static VarHandle DensityCode$VH() {
                        return ScsiInformation.DensityCode$VH;
                    }
                    public static byte DensityCode$get(MemorySegment seg) {
                        return (byte)ScsiInformation.DensityCode$VH.get(seg);
                    }
                    public static void DensityCode$set( MemorySegment seg, byte x) {
                        ScsiInformation.DensityCode$VH.set(seg, x);
                    }
                    public static byte DensityCode$get(MemorySegment seg, long index) {
                        return (byte)ScsiInformation.DensityCode$VH.get(seg.asSlice(index*sizeof()));
                    }
                    public static void DensityCode$set(MemorySegment seg, long index, byte x) {
                        ScsiInformation.DensityCode$VH.set(seg.asSlice(index*sizeof()), x);
                    }
                    public static long sizeof() { return $LAYOUT().byteSize(); }
                    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
                    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
                        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
                    }
                    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
                }

                public static MemorySegment ScsiInformation$slice(MemorySegment seg) {
                    return seg.asSlice(0, 2);
                }
                public static long sizeof() { return $LAYOUT().byteSize(); }
                public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
                public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
                    return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
                }
                public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
            }

            public static MemorySegment BusSpecificData$slice(MemorySegment seg) {
                return seg.asSlice(16, 2);
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
            public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
                return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
            }
            public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
        }

        public static MemorySegment TapeInfo$slice(MemorySegment seg) {
            return seg.asSlice(0, 20);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
    }

    public static MemorySegment DeviceSpecific$slice(MemorySegment seg) {
        return seg.asSlice(0, 32);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


