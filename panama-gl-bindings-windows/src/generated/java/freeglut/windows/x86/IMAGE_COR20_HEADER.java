// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class IMAGE_COR20_HEADER {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cb"),
        Constants$root.C_SHORT$LAYOUT.withName("MajorRuntimeVersion"),
        Constants$root.C_SHORT$LAYOUT.withName("MinorRuntimeVersion"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("VirtualAddress"),
            Constants$root.C_LONG$LAYOUT.withName("Size")
        ).withName("MetaData"),
        Constants$root.C_LONG$LAYOUT.withName("Flags"),
        MemoryLayout.unionLayout(
            Constants$root.C_LONG$LAYOUT.withName("EntryPointToken"),
            Constants$root.C_LONG$LAYOUT.withName("EntryPointRVA")
        ).withName("$anon$0"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("VirtualAddress"),
            Constants$root.C_LONG$LAYOUT.withName("Size")
        ).withName("Resources"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("VirtualAddress"),
            Constants$root.C_LONG$LAYOUT.withName("Size")
        ).withName("StrongNameSignature"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("VirtualAddress"),
            Constants$root.C_LONG$LAYOUT.withName("Size")
        ).withName("CodeManagerTable"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("VirtualAddress"),
            Constants$root.C_LONG$LAYOUT.withName("Size")
        ).withName("VTableFixups"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("VirtualAddress"),
            Constants$root.C_LONG$LAYOUT.withName("Size")
        ).withName("ExportAddressTableJumps"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("VirtualAddress"),
            Constants$root.C_LONG$LAYOUT.withName("Size")
        ).withName("ManagedNativeHeader")
    ).withName("IMAGE_COR20_HEADER");
    public static MemoryLayout $LAYOUT() {
        return IMAGE_COR20_HEADER.$struct$LAYOUT;
    }
    static final VarHandle cb$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cb"));
    public static VarHandle cb$VH() {
        return IMAGE_COR20_HEADER.cb$VH;
    }
    public static int cb$get(MemorySegment seg) {
        return (int)IMAGE_COR20_HEADER.cb$VH.get(seg);
    }
    public static void cb$set( MemorySegment seg, int x) {
        IMAGE_COR20_HEADER.cb$VH.set(seg, x);
    }
    public static int cb$get(MemorySegment seg, long index) {
        return (int)IMAGE_COR20_HEADER.cb$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cb$set(MemorySegment seg, long index, int x) {
        IMAGE_COR20_HEADER.cb$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MajorRuntimeVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MajorRuntimeVersion"));
    public static VarHandle MajorRuntimeVersion$VH() {
        return IMAGE_COR20_HEADER.MajorRuntimeVersion$VH;
    }
    public static short MajorRuntimeVersion$get(MemorySegment seg) {
        return (short)IMAGE_COR20_HEADER.MajorRuntimeVersion$VH.get(seg);
    }
    public static void MajorRuntimeVersion$set( MemorySegment seg, short x) {
        IMAGE_COR20_HEADER.MajorRuntimeVersion$VH.set(seg, x);
    }
    public static short MajorRuntimeVersion$get(MemorySegment seg, long index) {
        return (short)IMAGE_COR20_HEADER.MajorRuntimeVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MajorRuntimeVersion$set(MemorySegment seg, long index, short x) {
        IMAGE_COR20_HEADER.MajorRuntimeVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MinorRuntimeVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MinorRuntimeVersion"));
    public static VarHandle MinorRuntimeVersion$VH() {
        return IMAGE_COR20_HEADER.MinorRuntimeVersion$VH;
    }
    public static short MinorRuntimeVersion$get(MemorySegment seg) {
        return (short)IMAGE_COR20_HEADER.MinorRuntimeVersion$VH.get(seg);
    }
    public static void MinorRuntimeVersion$set( MemorySegment seg, short x) {
        IMAGE_COR20_HEADER.MinorRuntimeVersion$VH.set(seg, x);
    }
    public static short MinorRuntimeVersion$get(MemorySegment seg, long index) {
        return (short)IMAGE_COR20_HEADER.MinorRuntimeVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MinorRuntimeVersion$set(MemorySegment seg, long index, short x) {
        IMAGE_COR20_HEADER.MinorRuntimeVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment MetaData$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return IMAGE_COR20_HEADER.Flags$VH;
    }
    public static int Flags$get(MemorySegment seg) {
        return (int)IMAGE_COR20_HEADER.Flags$VH.get(seg);
    }
    public static void Flags$set( MemorySegment seg, int x) {
        IMAGE_COR20_HEADER.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)IMAGE_COR20_HEADER.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        IMAGE_COR20_HEADER.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle EntryPointToken$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("EntryPointToken"));
    public static VarHandle EntryPointToken$VH() {
        return IMAGE_COR20_HEADER.EntryPointToken$VH;
    }
    public static int EntryPointToken$get(MemorySegment seg) {
        return (int)IMAGE_COR20_HEADER.EntryPointToken$VH.get(seg);
    }
    public static void EntryPointToken$set( MemorySegment seg, int x) {
        IMAGE_COR20_HEADER.EntryPointToken$VH.set(seg, x);
    }
    public static int EntryPointToken$get(MemorySegment seg, long index) {
        return (int)IMAGE_COR20_HEADER.EntryPointToken$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void EntryPointToken$set(MemorySegment seg, long index, int x) {
        IMAGE_COR20_HEADER.EntryPointToken$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle EntryPointRVA$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("EntryPointRVA"));
    public static VarHandle EntryPointRVA$VH() {
        return IMAGE_COR20_HEADER.EntryPointRVA$VH;
    }
    public static int EntryPointRVA$get(MemorySegment seg) {
        return (int)IMAGE_COR20_HEADER.EntryPointRVA$VH.get(seg);
    }
    public static void EntryPointRVA$set( MemorySegment seg, int x) {
        IMAGE_COR20_HEADER.EntryPointRVA$VH.set(seg, x);
    }
    public static int EntryPointRVA$get(MemorySegment seg, long index) {
        return (int)IMAGE_COR20_HEADER.EntryPointRVA$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void EntryPointRVA$set(MemorySegment seg, long index, int x) {
        IMAGE_COR20_HEADER.EntryPointRVA$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Resources$slice(MemorySegment seg) {
        return seg.asSlice(24, 8);
    }
    public static MemorySegment StrongNameSignature$slice(MemorySegment seg) {
        return seg.asSlice(32, 8);
    }
    public static MemorySegment CodeManagerTable$slice(MemorySegment seg) {
        return seg.asSlice(40, 8);
    }
    public static MemorySegment VTableFixups$slice(MemorySegment seg) {
        return seg.asSlice(48, 8);
    }
    public static MemorySegment ExportAddressTableJumps$slice(MemorySegment seg) {
        return seg.asSlice(56, 8);
    }
    public static MemorySegment ManagedNativeHeader$slice(MemorySegment seg) {
        return seg.asSlice(64, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


