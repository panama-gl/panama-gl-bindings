// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _IMAGE_DYNAMIC_RELOCATION64_V2 {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("HeaderSize"),
        Constants$root.C_LONG$LAYOUT.withName("FixupInfoSize"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("Symbol"),
        Constants$root.C_LONG$LAYOUT.withName("SymbolGroup"),
        Constants$root.C_LONG$LAYOUT.withName("Flags")
    ).withName("_IMAGE_DYNAMIC_RELOCATION64_V2");
    public static MemoryLayout $LAYOUT() {
        return _IMAGE_DYNAMIC_RELOCATION64_V2.$struct$LAYOUT;
    }
    static final VarHandle HeaderSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("HeaderSize"));
    public static VarHandle HeaderSize$VH() {
        return _IMAGE_DYNAMIC_RELOCATION64_V2.HeaderSize$VH;
    }
    public static int HeaderSize$get(MemorySegment seg) {
        return (int)_IMAGE_DYNAMIC_RELOCATION64_V2.HeaderSize$VH.get(seg);
    }
    public static void HeaderSize$set( MemorySegment seg, int x) {
        _IMAGE_DYNAMIC_RELOCATION64_V2.HeaderSize$VH.set(seg, x);
    }
    public static int HeaderSize$get(MemorySegment seg, long index) {
        return (int)_IMAGE_DYNAMIC_RELOCATION64_V2.HeaderSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void HeaderSize$set(MemorySegment seg, long index, int x) {
        _IMAGE_DYNAMIC_RELOCATION64_V2.HeaderSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle FixupInfoSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("FixupInfoSize"));
    public static VarHandle FixupInfoSize$VH() {
        return _IMAGE_DYNAMIC_RELOCATION64_V2.FixupInfoSize$VH;
    }
    public static int FixupInfoSize$get(MemorySegment seg) {
        return (int)_IMAGE_DYNAMIC_RELOCATION64_V2.FixupInfoSize$VH.get(seg);
    }
    public static void FixupInfoSize$set( MemorySegment seg, int x) {
        _IMAGE_DYNAMIC_RELOCATION64_V2.FixupInfoSize$VH.set(seg, x);
    }
    public static int FixupInfoSize$get(MemorySegment seg, long index) {
        return (int)_IMAGE_DYNAMIC_RELOCATION64_V2.FixupInfoSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FixupInfoSize$set(MemorySegment seg, long index, int x) {
        _IMAGE_DYNAMIC_RELOCATION64_V2.FixupInfoSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Symbol$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Symbol"));
    public static VarHandle Symbol$VH() {
        return _IMAGE_DYNAMIC_RELOCATION64_V2.Symbol$VH;
    }
    public static long Symbol$get(MemorySegment seg) {
        return (long)_IMAGE_DYNAMIC_RELOCATION64_V2.Symbol$VH.get(seg);
    }
    public static void Symbol$set( MemorySegment seg, long x) {
        _IMAGE_DYNAMIC_RELOCATION64_V2.Symbol$VH.set(seg, x);
    }
    public static long Symbol$get(MemorySegment seg, long index) {
        return (long)_IMAGE_DYNAMIC_RELOCATION64_V2.Symbol$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Symbol$set(MemorySegment seg, long index, long x) {
        _IMAGE_DYNAMIC_RELOCATION64_V2.Symbol$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SymbolGroup$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SymbolGroup"));
    public static VarHandle SymbolGroup$VH() {
        return _IMAGE_DYNAMIC_RELOCATION64_V2.SymbolGroup$VH;
    }
    public static int SymbolGroup$get(MemorySegment seg) {
        return (int)_IMAGE_DYNAMIC_RELOCATION64_V2.SymbolGroup$VH.get(seg);
    }
    public static void SymbolGroup$set( MemorySegment seg, int x) {
        _IMAGE_DYNAMIC_RELOCATION64_V2.SymbolGroup$VH.set(seg, x);
    }
    public static int SymbolGroup$get(MemorySegment seg, long index) {
        return (int)_IMAGE_DYNAMIC_RELOCATION64_V2.SymbolGroup$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SymbolGroup$set(MemorySegment seg, long index, int x) {
        _IMAGE_DYNAMIC_RELOCATION64_V2.SymbolGroup$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _IMAGE_DYNAMIC_RELOCATION64_V2.Flags$VH;
    }
    public static int Flags$get(MemorySegment seg) {
        return (int)_IMAGE_DYNAMIC_RELOCATION64_V2.Flags$VH.get(seg);
    }
    public static void Flags$set( MemorySegment seg, int x) {
        _IMAGE_DYNAMIC_RELOCATION64_V2.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)_IMAGE_DYNAMIC_RELOCATION64_V2.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        _IMAGE_DYNAMIC_RELOCATION64_V2.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


