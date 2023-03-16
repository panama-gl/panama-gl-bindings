// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _DISK_CACHE_INFORMATION {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_CHAR$LAYOUT.withName("ParametersSavable"),
        Constants$root.C_CHAR$LAYOUT.withName("ReadCacheEnabled"),
        Constants$root.C_CHAR$LAYOUT.withName("WriteCacheEnabled"),
        MemoryLayout.paddingLayout(8),
        Constants$root.C_LONG$LAYOUT.withName("ReadRetentionPriority"),
        Constants$root.C_LONG$LAYOUT.withName("WriteRetentionPriority"),
        Constants$root.C_SHORT$LAYOUT.withName("DisablePrefetchTransferLength"),
        Constants$root.C_CHAR$LAYOUT.withName("PrefetchScalar"),
        MemoryLayout.paddingLayout(8),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_SHORT$LAYOUT.withName("Minimum"),
                Constants$root.C_SHORT$LAYOUT.withName("Maximum"),
                Constants$root.C_SHORT$LAYOUT.withName("MaximumBlocks")
            ).withName("ScalarPrefetch"),
            MemoryLayout.structLayout(
                Constants$root.C_SHORT$LAYOUT.withName("Minimum"),
                Constants$root.C_SHORT$LAYOUT.withName("Maximum")
            ).withName("BlockPrefetch")
        ).withName("$anon$0"),
        MemoryLayout.paddingLayout(16)
    ).withName("_DISK_CACHE_INFORMATION");
    public static MemoryLayout $LAYOUT() {
        return _DISK_CACHE_INFORMATION.$struct$LAYOUT;
    }
    static final VarHandle ParametersSavable$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ParametersSavable"));
    public static VarHandle ParametersSavable$VH() {
        return _DISK_CACHE_INFORMATION.ParametersSavable$VH;
    }
    public static byte ParametersSavable$get(MemorySegment seg) {
        return (byte)_DISK_CACHE_INFORMATION.ParametersSavable$VH.get(seg);
    }
    public static void ParametersSavable$set( MemorySegment seg, byte x) {
        _DISK_CACHE_INFORMATION.ParametersSavable$VH.set(seg, x);
    }
    public static byte ParametersSavable$get(MemorySegment seg, long index) {
        return (byte)_DISK_CACHE_INFORMATION.ParametersSavable$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ParametersSavable$set(MemorySegment seg, long index, byte x) {
        _DISK_CACHE_INFORMATION.ParametersSavable$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ReadCacheEnabled$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ReadCacheEnabled"));
    public static VarHandle ReadCacheEnabled$VH() {
        return _DISK_CACHE_INFORMATION.ReadCacheEnabled$VH;
    }
    public static byte ReadCacheEnabled$get(MemorySegment seg) {
        return (byte)_DISK_CACHE_INFORMATION.ReadCacheEnabled$VH.get(seg);
    }
    public static void ReadCacheEnabled$set( MemorySegment seg, byte x) {
        _DISK_CACHE_INFORMATION.ReadCacheEnabled$VH.set(seg, x);
    }
    public static byte ReadCacheEnabled$get(MemorySegment seg, long index) {
        return (byte)_DISK_CACHE_INFORMATION.ReadCacheEnabled$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ReadCacheEnabled$set(MemorySegment seg, long index, byte x) {
        _DISK_CACHE_INFORMATION.ReadCacheEnabled$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle WriteCacheEnabled$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("WriteCacheEnabled"));
    public static VarHandle WriteCacheEnabled$VH() {
        return _DISK_CACHE_INFORMATION.WriteCacheEnabled$VH;
    }
    public static byte WriteCacheEnabled$get(MemorySegment seg) {
        return (byte)_DISK_CACHE_INFORMATION.WriteCacheEnabled$VH.get(seg);
    }
    public static void WriteCacheEnabled$set( MemorySegment seg, byte x) {
        _DISK_CACHE_INFORMATION.WriteCacheEnabled$VH.set(seg, x);
    }
    public static byte WriteCacheEnabled$get(MemorySegment seg, long index) {
        return (byte)_DISK_CACHE_INFORMATION.WriteCacheEnabled$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void WriteCacheEnabled$set(MemorySegment seg, long index, byte x) {
        _DISK_CACHE_INFORMATION.WriteCacheEnabled$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ReadRetentionPriority$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ReadRetentionPriority"));
    public static VarHandle ReadRetentionPriority$VH() {
        return _DISK_CACHE_INFORMATION.ReadRetentionPriority$VH;
    }
    public static int ReadRetentionPriority$get(MemorySegment seg) {
        return (int)_DISK_CACHE_INFORMATION.ReadRetentionPriority$VH.get(seg);
    }
    public static void ReadRetentionPriority$set( MemorySegment seg, int x) {
        _DISK_CACHE_INFORMATION.ReadRetentionPriority$VH.set(seg, x);
    }
    public static int ReadRetentionPriority$get(MemorySegment seg, long index) {
        return (int)_DISK_CACHE_INFORMATION.ReadRetentionPriority$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ReadRetentionPriority$set(MemorySegment seg, long index, int x) {
        _DISK_CACHE_INFORMATION.ReadRetentionPriority$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle WriteRetentionPriority$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("WriteRetentionPriority"));
    public static VarHandle WriteRetentionPriority$VH() {
        return _DISK_CACHE_INFORMATION.WriteRetentionPriority$VH;
    }
    public static int WriteRetentionPriority$get(MemorySegment seg) {
        return (int)_DISK_CACHE_INFORMATION.WriteRetentionPriority$VH.get(seg);
    }
    public static void WriteRetentionPriority$set( MemorySegment seg, int x) {
        _DISK_CACHE_INFORMATION.WriteRetentionPriority$VH.set(seg, x);
    }
    public static int WriteRetentionPriority$get(MemorySegment seg, long index) {
        return (int)_DISK_CACHE_INFORMATION.WriteRetentionPriority$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void WriteRetentionPriority$set(MemorySegment seg, long index, int x) {
        _DISK_CACHE_INFORMATION.WriteRetentionPriority$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DisablePrefetchTransferLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DisablePrefetchTransferLength"));
    public static VarHandle DisablePrefetchTransferLength$VH() {
        return _DISK_CACHE_INFORMATION.DisablePrefetchTransferLength$VH;
    }
    public static short DisablePrefetchTransferLength$get(MemorySegment seg) {
        return (short)_DISK_CACHE_INFORMATION.DisablePrefetchTransferLength$VH.get(seg);
    }
    public static void DisablePrefetchTransferLength$set( MemorySegment seg, short x) {
        _DISK_CACHE_INFORMATION.DisablePrefetchTransferLength$VH.set(seg, x);
    }
    public static short DisablePrefetchTransferLength$get(MemorySegment seg, long index) {
        return (short)_DISK_CACHE_INFORMATION.DisablePrefetchTransferLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DisablePrefetchTransferLength$set(MemorySegment seg, long index, short x) {
        _DISK_CACHE_INFORMATION.DisablePrefetchTransferLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle PrefetchScalar$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PrefetchScalar"));
    public static VarHandle PrefetchScalar$VH() {
        return _DISK_CACHE_INFORMATION.PrefetchScalar$VH;
    }
    public static byte PrefetchScalar$get(MemorySegment seg) {
        return (byte)_DISK_CACHE_INFORMATION.PrefetchScalar$VH.get(seg);
    }
    public static void PrefetchScalar$set( MemorySegment seg, byte x) {
        _DISK_CACHE_INFORMATION.PrefetchScalar$VH.set(seg, x);
    }
    public static byte PrefetchScalar$get(MemorySegment seg, long index) {
        return (byte)_DISK_CACHE_INFORMATION.PrefetchScalar$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PrefetchScalar$set(MemorySegment seg, long index, byte x) {
        _DISK_CACHE_INFORMATION.PrefetchScalar$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static class ScalarPrefetch {

        static final  GroupLayout ScalarPrefetch$struct$LAYOUT = MemoryLayout.structLayout(
            Constants$root.C_SHORT$LAYOUT.withName("Minimum"),
            Constants$root.C_SHORT$LAYOUT.withName("Maximum"),
            Constants$root.C_SHORT$LAYOUT.withName("MaximumBlocks")
        );
        public static MemoryLayout $LAYOUT() {
            return ScalarPrefetch.ScalarPrefetch$struct$LAYOUT;
        }
        static final VarHandle Minimum$VH = ScalarPrefetch$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Minimum"));
        public static VarHandle Minimum$VH() {
            return ScalarPrefetch.Minimum$VH;
        }
        public static short Minimum$get(MemorySegment seg) {
            return (short)ScalarPrefetch.Minimum$VH.get(seg);
        }
        public static void Minimum$set( MemorySegment seg, short x) {
            ScalarPrefetch.Minimum$VH.set(seg, x);
        }
        public static short Minimum$get(MemorySegment seg, long index) {
            return (short)ScalarPrefetch.Minimum$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void Minimum$set(MemorySegment seg, long index, short x) {
            ScalarPrefetch.Minimum$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle Maximum$VH = ScalarPrefetch$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Maximum"));
        public static VarHandle Maximum$VH() {
            return ScalarPrefetch.Maximum$VH;
        }
        public static short Maximum$get(MemorySegment seg) {
            return (short)ScalarPrefetch.Maximum$VH.get(seg);
        }
        public static void Maximum$set( MemorySegment seg, short x) {
            ScalarPrefetch.Maximum$VH.set(seg, x);
        }
        public static short Maximum$get(MemorySegment seg, long index) {
            return (short)ScalarPrefetch.Maximum$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void Maximum$set(MemorySegment seg, long index, short x) {
            ScalarPrefetch.Maximum$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle MaximumBlocks$VH = ScalarPrefetch$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MaximumBlocks"));
        public static VarHandle MaximumBlocks$VH() {
            return ScalarPrefetch.MaximumBlocks$VH;
        }
        public static short MaximumBlocks$get(MemorySegment seg) {
            return (short)ScalarPrefetch.MaximumBlocks$VH.get(seg);
        }
        public static void MaximumBlocks$set( MemorySegment seg, short x) {
            ScalarPrefetch.MaximumBlocks$VH.set(seg, x);
        }
        public static short MaximumBlocks$get(MemorySegment seg, long index) {
            return (short)ScalarPrefetch.MaximumBlocks$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void MaximumBlocks$set(MemorySegment seg, long index, short x) {
            ScalarPrefetch.MaximumBlocks$VH.set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
    }

    public static MemorySegment ScalarPrefetch$slice(MemorySegment seg) {
        return seg.asSlice(16, 6);
    }
    public static class BlockPrefetch {

        static final  GroupLayout BlockPrefetch$struct$LAYOUT = MemoryLayout.structLayout(
            Constants$root.C_SHORT$LAYOUT.withName("Minimum"),
            Constants$root.C_SHORT$LAYOUT.withName("Maximum")
        );
        public static MemoryLayout $LAYOUT() {
            return BlockPrefetch.BlockPrefetch$struct$LAYOUT;
        }
        static final VarHandle Minimum$VH = BlockPrefetch$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Minimum"));
        public static VarHandle Minimum$VH() {
            return BlockPrefetch.Minimum$VH;
        }
        public static short Minimum$get(MemorySegment seg) {
            return (short)BlockPrefetch.Minimum$VH.get(seg);
        }
        public static void Minimum$set( MemorySegment seg, short x) {
            BlockPrefetch.Minimum$VH.set(seg, x);
        }
        public static short Minimum$get(MemorySegment seg, long index) {
            return (short)BlockPrefetch.Minimum$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void Minimum$set(MemorySegment seg, long index, short x) {
            BlockPrefetch.Minimum$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle Maximum$VH = BlockPrefetch$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Maximum"));
        public static VarHandle Maximum$VH() {
            return BlockPrefetch.Maximum$VH;
        }
        public static short Maximum$get(MemorySegment seg) {
            return (short)BlockPrefetch.Maximum$VH.get(seg);
        }
        public static void Maximum$set( MemorySegment seg, short x) {
            BlockPrefetch.Maximum$VH.set(seg, x);
        }
        public static short Maximum$get(MemorySegment seg, long index) {
            return (short)BlockPrefetch.Maximum$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void Maximum$set(MemorySegment seg, long index, short x) {
            BlockPrefetch.Maximum$VH.set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
    }

    public static MemorySegment BlockPrefetch$slice(MemorySegment seg) {
        return seg.asSlice(16, 4);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


