// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _SD_GLOBAL_CHANGE_OUTPUT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Flags"),
        Constants$root.C_LONG$LAYOUT.withName("ChangeType"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG_LONG$LAYOUT.withName("NumSDChangedSuccess"),
                Constants$root.C_LONG_LONG$LAYOUT.withName("NumSDChangedFail"),
                Constants$root.C_LONG_LONG$LAYOUT.withName("NumSDUnused"),
                Constants$root.C_LONG_LONG$LAYOUT.withName("NumSDTotal"),
                Constants$root.C_LONG_LONG$LAYOUT.withName("NumMftSDChangedSuccess"),
                Constants$root.C_LONG_LONG$LAYOUT.withName("NumMftSDChangedFail"),
                Constants$root.C_LONG_LONG$LAYOUT.withName("NumMftSDTotal")
            ).withName("SdChange"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG_LONG$LAYOUT.withName("SdsStreamSize"),
                Constants$root.C_LONG_LONG$LAYOUT.withName("SdsAllocationSize"),
                Constants$root.C_LONG_LONG$LAYOUT.withName("SiiStreamSize"),
                Constants$root.C_LONG_LONG$LAYOUT.withName("SiiAllocationSize"),
                Constants$root.C_LONG_LONG$LAYOUT.withName("SdhStreamSize"),
                Constants$root.C_LONG_LONG$LAYOUT.withName("SdhAllocationSize"),
                Constants$root.C_LONG_LONG$LAYOUT.withName("NumSDTotal"),
                Constants$root.C_LONG_LONG$LAYOUT.withName("NumSDUnused")
            ).withName("SdQueryStats"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG_LONG$LAYOUT.withName("NextOffset"),
                Constants$root.C_LONG_LONG$LAYOUT.withName("NumSDEntriesReturned"),
                Constants$root.C_LONG_LONG$LAYOUT.withName("NumSDBytesReturned"),
                MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("Hash"),
                    Constants$root.C_LONG$LAYOUT.withName("SecurityId"),
                    Constants$root.C_LONG_LONG$LAYOUT.withName("Offset"),
                    Constants$root.C_LONG$LAYOUT.withName("Length"),
                    MemoryLayout.sequenceLayout(1, Constants$root.C_CHAR$LAYOUT).withName("Descriptor"),
                    MemoryLayout.paddingLayout(24)
                ).withName("_SD_ENUM_SDS_ENTRY")).withName("SDEntry")
            ).withName("SdEnumSds")
        ).withName("$anon$0")
    ).withName("_SD_GLOBAL_CHANGE_OUTPUT");
    public static MemoryLayout $LAYOUT() {
        return _SD_GLOBAL_CHANGE_OUTPUT.$struct$LAYOUT;
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _SD_GLOBAL_CHANGE_OUTPUT.Flags$VH;
    }
    public static int Flags$get(MemorySegment seg) {
        return (int)_SD_GLOBAL_CHANGE_OUTPUT.Flags$VH.get(seg);
    }
    public static void Flags$set( MemorySegment seg, int x) {
        _SD_GLOBAL_CHANGE_OUTPUT.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)_SD_GLOBAL_CHANGE_OUTPUT.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        _SD_GLOBAL_CHANGE_OUTPUT.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ChangeType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ChangeType"));
    public static VarHandle ChangeType$VH() {
        return _SD_GLOBAL_CHANGE_OUTPUT.ChangeType$VH;
    }
    public static int ChangeType$get(MemorySegment seg) {
        return (int)_SD_GLOBAL_CHANGE_OUTPUT.ChangeType$VH.get(seg);
    }
    public static void ChangeType$set( MemorySegment seg, int x) {
        _SD_GLOBAL_CHANGE_OUTPUT.ChangeType$VH.set(seg, x);
    }
    public static int ChangeType$get(MemorySegment seg, long index) {
        return (int)_SD_GLOBAL_CHANGE_OUTPUT.ChangeType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ChangeType$set(MemorySegment seg, long index, int x) {
        _SD_GLOBAL_CHANGE_OUTPUT.ChangeType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment SdChange$slice(MemorySegment seg) {
        return seg.asSlice(8, 56);
    }
    public static MemorySegment SdQueryStats$slice(MemorySegment seg) {
        return seg.asSlice(8, 64);
    }
    public static MemorySegment SdEnumSds$slice(MemorySegment seg) {
        return seg.asSlice(8, 48);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

