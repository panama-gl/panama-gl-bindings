// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _MEMORY_PARTITION_DEDICATED_MEMORY_INFORMATION {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("NextEntryOffset"),
        Constants$root.C_LONG$LAYOUT.withName("SizeOfInformation"),
        Constants$root.C_LONG$LAYOUT.withName("Flags"),
        Constants$root.C_LONG$LAYOUT.withName("AttributesOffset"),
        Constants$root.C_LONG$LAYOUT.withName("AttributeCount"),
        Constants$root.C_LONG$LAYOUT.withName("Reserved"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("TypeId")
    ).withName("_MEMORY_PARTITION_DEDICATED_MEMORY_INFORMATION");
    public static MemoryLayout $LAYOUT() {
        return _MEMORY_PARTITION_DEDICATED_MEMORY_INFORMATION.$struct$LAYOUT;
    }
    static final VarHandle NextEntryOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NextEntryOffset"));
    public static VarHandle NextEntryOffset$VH() {
        return _MEMORY_PARTITION_DEDICATED_MEMORY_INFORMATION.NextEntryOffset$VH;
    }
    public static int NextEntryOffset$get(MemorySegment seg) {
        return (int)_MEMORY_PARTITION_DEDICATED_MEMORY_INFORMATION.NextEntryOffset$VH.get(seg);
    }
    public static void NextEntryOffset$set( MemorySegment seg, int x) {
        _MEMORY_PARTITION_DEDICATED_MEMORY_INFORMATION.NextEntryOffset$VH.set(seg, x);
    }
    public static int NextEntryOffset$get(MemorySegment seg, long index) {
        return (int)_MEMORY_PARTITION_DEDICATED_MEMORY_INFORMATION.NextEntryOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NextEntryOffset$set(MemorySegment seg, long index, int x) {
        _MEMORY_PARTITION_DEDICATED_MEMORY_INFORMATION.NextEntryOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SizeOfInformation$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SizeOfInformation"));
    public static VarHandle SizeOfInformation$VH() {
        return _MEMORY_PARTITION_DEDICATED_MEMORY_INFORMATION.SizeOfInformation$VH;
    }
    public static int SizeOfInformation$get(MemorySegment seg) {
        return (int)_MEMORY_PARTITION_DEDICATED_MEMORY_INFORMATION.SizeOfInformation$VH.get(seg);
    }
    public static void SizeOfInformation$set( MemorySegment seg, int x) {
        _MEMORY_PARTITION_DEDICATED_MEMORY_INFORMATION.SizeOfInformation$VH.set(seg, x);
    }
    public static int SizeOfInformation$get(MemorySegment seg, long index) {
        return (int)_MEMORY_PARTITION_DEDICATED_MEMORY_INFORMATION.SizeOfInformation$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SizeOfInformation$set(MemorySegment seg, long index, int x) {
        _MEMORY_PARTITION_DEDICATED_MEMORY_INFORMATION.SizeOfInformation$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _MEMORY_PARTITION_DEDICATED_MEMORY_INFORMATION.Flags$VH;
    }
    public static int Flags$get(MemorySegment seg) {
        return (int)_MEMORY_PARTITION_DEDICATED_MEMORY_INFORMATION.Flags$VH.get(seg);
    }
    public static void Flags$set( MemorySegment seg, int x) {
        _MEMORY_PARTITION_DEDICATED_MEMORY_INFORMATION.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)_MEMORY_PARTITION_DEDICATED_MEMORY_INFORMATION.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        _MEMORY_PARTITION_DEDICATED_MEMORY_INFORMATION.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle AttributesOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AttributesOffset"));
    public static VarHandle AttributesOffset$VH() {
        return _MEMORY_PARTITION_DEDICATED_MEMORY_INFORMATION.AttributesOffset$VH;
    }
    public static int AttributesOffset$get(MemorySegment seg) {
        return (int)_MEMORY_PARTITION_DEDICATED_MEMORY_INFORMATION.AttributesOffset$VH.get(seg);
    }
    public static void AttributesOffset$set( MemorySegment seg, int x) {
        _MEMORY_PARTITION_DEDICATED_MEMORY_INFORMATION.AttributesOffset$VH.set(seg, x);
    }
    public static int AttributesOffset$get(MemorySegment seg, long index) {
        return (int)_MEMORY_PARTITION_DEDICATED_MEMORY_INFORMATION.AttributesOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AttributesOffset$set(MemorySegment seg, long index, int x) {
        _MEMORY_PARTITION_DEDICATED_MEMORY_INFORMATION.AttributesOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle AttributeCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AttributeCount"));
    public static VarHandle AttributeCount$VH() {
        return _MEMORY_PARTITION_DEDICATED_MEMORY_INFORMATION.AttributeCount$VH;
    }
    public static int AttributeCount$get(MemorySegment seg) {
        return (int)_MEMORY_PARTITION_DEDICATED_MEMORY_INFORMATION.AttributeCount$VH.get(seg);
    }
    public static void AttributeCount$set( MemorySegment seg, int x) {
        _MEMORY_PARTITION_DEDICATED_MEMORY_INFORMATION.AttributeCount$VH.set(seg, x);
    }
    public static int AttributeCount$get(MemorySegment seg, long index) {
        return (int)_MEMORY_PARTITION_DEDICATED_MEMORY_INFORMATION.AttributeCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AttributeCount$set(MemorySegment seg, long index, int x) {
        _MEMORY_PARTITION_DEDICATED_MEMORY_INFORMATION.AttributeCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Reserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reserved"));
    public static VarHandle Reserved$VH() {
        return _MEMORY_PARTITION_DEDICATED_MEMORY_INFORMATION.Reserved$VH;
    }
    public static int Reserved$get(MemorySegment seg) {
        return (int)_MEMORY_PARTITION_DEDICATED_MEMORY_INFORMATION.Reserved$VH.get(seg);
    }
    public static void Reserved$set( MemorySegment seg, int x) {
        _MEMORY_PARTITION_DEDICATED_MEMORY_INFORMATION.Reserved$VH.set(seg, x);
    }
    public static int Reserved$get(MemorySegment seg, long index) {
        return (int)_MEMORY_PARTITION_DEDICATED_MEMORY_INFORMATION.Reserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved$set(MemorySegment seg, long index, int x) {
        _MEMORY_PARTITION_DEDICATED_MEMORY_INFORMATION.Reserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TypeId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TypeId"));
    public static VarHandle TypeId$VH() {
        return _MEMORY_PARTITION_DEDICATED_MEMORY_INFORMATION.TypeId$VH;
    }
    public static long TypeId$get(MemorySegment seg) {
        return (long)_MEMORY_PARTITION_DEDICATED_MEMORY_INFORMATION.TypeId$VH.get(seg);
    }
    public static void TypeId$set( MemorySegment seg, long x) {
        _MEMORY_PARTITION_DEDICATED_MEMORY_INFORMATION.TypeId$VH.set(seg, x);
    }
    public static long TypeId$get(MemorySegment seg, long index) {
        return (long)_MEMORY_PARTITION_DEDICATED_MEMORY_INFORMATION.TypeId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TypeId$set(MemorySegment seg, long index, long x) {
        _MEMORY_PARTITION_DEDICATED_MEMORY_INFORMATION.TypeId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


