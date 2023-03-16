// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _FILE_FS_PERSISTENT_VOLUME_INFORMATION {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("VolumeFlags"),
        Constants$root.C_LONG$LAYOUT.withName("FlagMask"),
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        Constants$root.C_LONG$LAYOUT.withName("Reserved")
    ).withName("_FILE_FS_PERSISTENT_VOLUME_INFORMATION");
    public static MemoryLayout $LAYOUT() {
        return _FILE_FS_PERSISTENT_VOLUME_INFORMATION.$struct$LAYOUT;
    }
    static final VarHandle VolumeFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("VolumeFlags"));
    public static VarHandle VolumeFlags$VH() {
        return _FILE_FS_PERSISTENT_VOLUME_INFORMATION.VolumeFlags$VH;
    }
    public static int VolumeFlags$get(MemorySegment seg) {
        return (int)_FILE_FS_PERSISTENT_VOLUME_INFORMATION.VolumeFlags$VH.get(seg);
    }
    public static void VolumeFlags$set( MemorySegment seg, int x) {
        _FILE_FS_PERSISTENT_VOLUME_INFORMATION.VolumeFlags$VH.set(seg, x);
    }
    public static int VolumeFlags$get(MemorySegment seg, long index) {
        return (int)_FILE_FS_PERSISTENT_VOLUME_INFORMATION.VolumeFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void VolumeFlags$set(MemorySegment seg, long index, int x) {
        _FILE_FS_PERSISTENT_VOLUME_INFORMATION.VolumeFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle FlagMask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("FlagMask"));
    public static VarHandle FlagMask$VH() {
        return _FILE_FS_PERSISTENT_VOLUME_INFORMATION.FlagMask$VH;
    }
    public static int FlagMask$get(MemorySegment seg) {
        return (int)_FILE_FS_PERSISTENT_VOLUME_INFORMATION.FlagMask$VH.get(seg);
    }
    public static void FlagMask$set( MemorySegment seg, int x) {
        _FILE_FS_PERSISTENT_VOLUME_INFORMATION.FlagMask$VH.set(seg, x);
    }
    public static int FlagMask$get(MemorySegment seg, long index) {
        return (int)_FILE_FS_PERSISTENT_VOLUME_INFORMATION.FlagMask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FlagMask$set(MemorySegment seg, long index, int x) {
        _FILE_FS_PERSISTENT_VOLUME_INFORMATION.FlagMask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _FILE_FS_PERSISTENT_VOLUME_INFORMATION.Version$VH;
    }
    public static int Version$get(MemorySegment seg) {
        return (int)_FILE_FS_PERSISTENT_VOLUME_INFORMATION.Version$VH.get(seg);
    }
    public static void Version$set( MemorySegment seg, int x) {
        _FILE_FS_PERSISTENT_VOLUME_INFORMATION.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_FILE_FS_PERSISTENT_VOLUME_INFORMATION.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _FILE_FS_PERSISTENT_VOLUME_INFORMATION.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Reserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reserved"));
    public static VarHandle Reserved$VH() {
        return _FILE_FS_PERSISTENT_VOLUME_INFORMATION.Reserved$VH;
    }
    public static int Reserved$get(MemorySegment seg) {
        return (int)_FILE_FS_PERSISTENT_VOLUME_INFORMATION.Reserved$VH.get(seg);
    }
    public static void Reserved$set( MemorySegment seg, int x) {
        _FILE_FS_PERSISTENT_VOLUME_INFORMATION.Reserved$VH.set(seg, x);
    }
    public static int Reserved$get(MemorySegment seg, long index) {
        return (int)_FILE_FS_PERSISTENT_VOLUME_INFORMATION.Reserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved$set(MemorySegment seg, long index, int x) {
        _FILE_FS_PERSISTENT_VOLUME_INFORMATION.Reserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


