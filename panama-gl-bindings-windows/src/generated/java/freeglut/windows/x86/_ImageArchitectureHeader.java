// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _ImageArchitectureHeader {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.paddingLayout(1).withName("AmaskValue"),
            MemoryLayout.paddingLayout(7),
            MemoryLayout.paddingLayout(8).withName("AmaskShift"),
            MemoryLayout.paddingLayout(16)
        ),
        Constants$root.C_LONG$LAYOUT.withName("FirstEntryRVA")
    ).withName("_ImageArchitectureHeader");
    public static MemoryLayout $LAYOUT() {
        return _ImageArchitectureHeader.$struct$LAYOUT;
    }
    static final VarHandle FirstEntryRVA$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("FirstEntryRVA"));
    public static VarHandle FirstEntryRVA$VH() {
        return _ImageArchitectureHeader.FirstEntryRVA$VH;
    }
    public static int FirstEntryRVA$get(MemorySegment seg) {
        return (int)_ImageArchitectureHeader.FirstEntryRVA$VH.get(seg);
    }
    public static void FirstEntryRVA$set( MemorySegment seg, int x) {
        _ImageArchitectureHeader.FirstEntryRVA$VH.set(seg, x);
    }
    public static int FirstEntryRVA$get(MemorySegment seg, long index) {
        return (int)_ImageArchitectureHeader.FirstEntryRVA$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FirstEntryRVA$set(MemorySegment seg, long index, int x) {
        _ImageArchitectureHeader.FirstEntryRVA$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


