// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _STORAGE_OPERATIONAL_REASON {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        Constants$root.C_LONG$LAYOUT.withName("Size"),
        Constants$root.C_LONG$LAYOUT.withName("Reason"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_CHAR$LAYOUT.withName("SenseKey"),
                Constants$root.C_CHAR$LAYOUT.withName("ASC"),
                Constants$root.C_CHAR$LAYOUT.withName("ASCQ"),
                Constants$root.C_CHAR$LAYOUT.withName("Reserved")
            ).withName("ScsiSenseKey"),
            MemoryLayout.structLayout(
                Constants$root.C_CHAR$LAYOUT.withName("CriticalHealth"),
                MemoryLayout.sequenceLayout(2, Constants$root.C_CHAR$LAYOUT).withName("ModuleHealth"),
                Constants$root.C_CHAR$LAYOUT.withName("ErrorThresholdStatus")
            ).withName("NVDIMM_N"),
            Constants$root.C_LONG$LAYOUT.withName("AsUlong")
        ).withName("RawBytes")
    ).withName("_STORAGE_OPERATIONAL_REASON");
    public static MemoryLayout $LAYOUT() {
        return _STORAGE_OPERATIONAL_REASON.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _STORAGE_OPERATIONAL_REASON.Version$VH;
    }
    public static int Version$get(MemorySegment seg) {
        return (int)_STORAGE_OPERATIONAL_REASON.Version$VH.get(seg);
    }
    public static void Version$set( MemorySegment seg, int x) {
        _STORAGE_OPERATIONAL_REASON.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_STORAGE_OPERATIONAL_REASON.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _STORAGE_OPERATIONAL_REASON.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _STORAGE_OPERATIONAL_REASON.Size$VH;
    }
    public static int Size$get(MemorySegment seg) {
        return (int)_STORAGE_OPERATIONAL_REASON.Size$VH.get(seg);
    }
    public static void Size$set( MemorySegment seg, int x) {
        _STORAGE_OPERATIONAL_REASON.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_STORAGE_OPERATIONAL_REASON.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _STORAGE_OPERATIONAL_REASON.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Reason$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reason"));
    public static VarHandle Reason$VH() {
        return _STORAGE_OPERATIONAL_REASON.Reason$VH;
    }
    public static int Reason$get(MemorySegment seg) {
        return (int)_STORAGE_OPERATIONAL_REASON.Reason$VH.get(seg);
    }
    public static void Reason$set( MemorySegment seg, int x) {
        _STORAGE_OPERATIONAL_REASON.Reason$VH.set(seg, x);
    }
    public static int Reason$get(MemorySegment seg, long index) {
        return (int)_STORAGE_OPERATIONAL_REASON.Reason$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reason$set(MemorySegment seg, long index, int x) {
        _STORAGE_OPERATIONAL_REASON.Reason$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static class RawBytes {

        static final  GroupLayout RawBytes$union$LAYOUT = MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_CHAR$LAYOUT.withName("SenseKey"),
                Constants$root.C_CHAR$LAYOUT.withName("ASC"),
                Constants$root.C_CHAR$LAYOUT.withName("ASCQ"),
                Constants$root.C_CHAR$LAYOUT.withName("Reserved")
            ).withName("ScsiSenseKey"),
            MemoryLayout.structLayout(
                Constants$root.C_CHAR$LAYOUT.withName("CriticalHealth"),
                MemoryLayout.sequenceLayout(2, Constants$root.C_CHAR$LAYOUT).withName("ModuleHealth"),
                Constants$root.C_CHAR$LAYOUT.withName("ErrorThresholdStatus")
            ).withName("NVDIMM_N"),
            Constants$root.C_LONG$LAYOUT.withName("AsUlong")
        );
        public static MemoryLayout $LAYOUT() {
            return RawBytes.RawBytes$union$LAYOUT;
        }
        public static class ScsiSenseKey {

            static final  GroupLayout RawBytes$ScsiSenseKey$struct$LAYOUT = MemoryLayout.structLayout(
                Constants$root.C_CHAR$LAYOUT.withName("SenseKey"),
                Constants$root.C_CHAR$LAYOUT.withName("ASC"),
                Constants$root.C_CHAR$LAYOUT.withName("ASCQ"),
                Constants$root.C_CHAR$LAYOUT.withName("Reserved")
            );
            public static MemoryLayout $LAYOUT() {
                return ScsiSenseKey.RawBytes$ScsiSenseKey$struct$LAYOUT;
            }
            static final VarHandle SenseKey$VH = RawBytes$ScsiSenseKey$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SenseKey"));
            public static VarHandle SenseKey$VH() {
                return ScsiSenseKey.SenseKey$VH;
            }
            public static byte SenseKey$get(MemorySegment seg) {
                return (byte)ScsiSenseKey.SenseKey$VH.get(seg);
            }
            public static void SenseKey$set( MemorySegment seg, byte x) {
                ScsiSenseKey.SenseKey$VH.set(seg, x);
            }
            public static byte SenseKey$get(MemorySegment seg, long index) {
                return (byte)ScsiSenseKey.SenseKey$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void SenseKey$set(MemorySegment seg, long index, byte x) {
                ScsiSenseKey.SenseKey$VH.set(seg.asSlice(index*sizeof()), x);
            }
            static final VarHandle ASC$VH = RawBytes$ScsiSenseKey$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ASC"));
            public static VarHandle ASC$VH() {
                return ScsiSenseKey.ASC$VH;
            }
            public static byte ASC$get(MemorySegment seg) {
                return (byte)ScsiSenseKey.ASC$VH.get(seg);
            }
            public static void ASC$set( MemorySegment seg, byte x) {
                ScsiSenseKey.ASC$VH.set(seg, x);
            }
            public static byte ASC$get(MemorySegment seg, long index) {
                return (byte)ScsiSenseKey.ASC$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void ASC$set(MemorySegment seg, long index, byte x) {
                ScsiSenseKey.ASC$VH.set(seg.asSlice(index*sizeof()), x);
            }
            static final VarHandle ASCQ$VH = RawBytes$ScsiSenseKey$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ASCQ"));
            public static VarHandle ASCQ$VH() {
                return ScsiSenseKey.ASCQ$VH;
            }
            public static byte ASCQ$get(MemorySegment seg) {
                return (byte)ScsiSenseKey.ASCQ$VH.get(seg);
            }
            public static void ASCQ$set( MemorySegment seg, byte x) {
                ScsiSenseKey.ASCQ$VH.set(seg, x);
            }
            public static byte ASCQ$get(MemorySegment seg, long index) {
                return (byte)ScsiSenseKey.ASCQ$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void ASCQ$set(MemorySegment seg, long index, byte x) {
                ScsiSenseKey.ASCQ$VH.set(seg.asSlice(index*sizeof()), x);
            }
            static final VarHandle Reserved$VH = RawBytes$ScsiSenseKey$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reserved"));
            public static VarHandle Reserved$VH() {
                return ScsiSenseKey.Reserved$VH;
            }
            public static byte Reserved$get(MemorySegment seg) {
                return (byte)ScsiSenseKey.Reserved$VH.get(seg);
            }
            public static void Reserved$set( MemorySegment seg, byte x) {
                ScsiSenseKey.Reserved$VH.set(seg, x);
            }
            public static byte Reserved$get(MemorySegment seg, long index) {
                return (byte)ScsiSenseKey.Reserved$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void Reserved$set(MemorySegment seg, long index, byte x) {
                ScsiSenseKey.Reserved$VH.set(seg.asSlice(index*sizeof()), x);
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
            public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
                return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
            }
            public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
        }

        public static MemorySegment ScsiSenseKey$slice(MemorySegment seg) {
            return seg.asSlice(0, 4);
        }
        public static class NVDIMM_N {

            static final  GroupLayout RawBytes$NVDIMM_N$struct$LAYOUT = MemoryLayout.structLayout(
                Constants$root.C_CHAR$LAYOUT.withName("CriticalHealth"),
                MemoryLayout.sequenceLayout(2, Constants$root.C_CHAR$LAYOUT).withName("ModuleHealth"),
                Constants$root.C_CHAR$LAYOUT.withName("ErrorThresholdStatus")
            );
            public static MemoryLayout $LAYOUT() {
                return NVDIMM_N.RawBytes$NVDIMM_N$struct$LAYOUT;
            }
            static final VarHandle CriticalHealth$VH = RawBytes$NVDIMM_N$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CriticalHealth"));
            public static VarHandle CriticalHealth$VH() {
                return NVDIMM_N.CriticalHealth$VH;
            }
            public static byte CriticalHealth$get(MemorySegment seg) {
                return (byte)NVDIMM_N.CriticalHealth$VH.get(seg);
            }
            public static void CriticalHealth$set( MemorySegment seg, byte x) {
                NVDIMM_N.CriticalHealth$VH.set(seg, x);
            }
            public static byte CriticalHealth$get(MemorySegment seg, long index) {
                return (byte)NVDIMM_N.CriticalHealth$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void CriticalHealth$set(MemorySegment seg, long index, byte x) {
                NVDIMM_N.CriticalHealth$VH.set(seg.asSlice(index*sizeof()), x);
            }
            public static MemorySegment ModuleHealth$slice(MemorySegment seg) {
                return seg.asSlice(1, 2);
            }
            static final VarHandle ErrorThresholdStatus$VH = RawBytes$NVDIMM_N$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ErrorThresholdStatus"));
            public static VarHandle ErrorThresholdStatus$VH() {
                return NVDIMM_N.ErrorThresholdStatus$VH;
            }
            public static byte ErrorThresholdStatus$get(MemorySegment seg) {
                return (byte)NVDIMM_N.ErrorThresholdStatus$VH.get(seg);
            }
            public static void ErrorThresholdStatus$set( MemorySegment seg, byte x) {
                NVDIMM_N.ErrorThresholdStatus$VH.set(seg, x);
            }
            public static byte ErrorThresholdStatus$get(MemorySegment seg, long index) {
                return (byte)NVDIMM_N.ErrorThresholdStatus$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void ErrorThresholdStatus$set(MemorySegment seg, long index, byte x) {
                NVDIMM_N.ErrorThresholdStatus$VH.set(seg.asSlice(index*sizeof()), x);
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
            public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
                return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
            }
            public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
        }

        public static MemorySegment NVDIMM_N$slice(MemorySegment seg) {
            return seg.asSlice(0, 4);
        }
        static final VarHandle AsUlong$VH = RawBytes$union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AsUlong"));
        public static VarHandle AsUlong$VH() {
            return RawBytes.AsUlong$VH;
        }
        public static int AsUlong$get(MemorySegment seg) {
            return (int)RawBytes.AsUlong$VH.get(seg);
        }
        public static void AsUlong$set( MemorySegment seg, int x) {
            RawBytes.AsUlong$VH.set(seg, x);
        }
        public static int AsUlong$get(MemorySegment seg, long index) {
            return (int)RawBytes.AsUlong$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void AsUlong$set(MemorySegment seg, long index, int x) {
            RawBytes.AsUlong$VH.set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
    }

    public static MemorySegment RawBytes$slice(MemorySegment seg) {
        return seg.asSlice(12, 4);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

