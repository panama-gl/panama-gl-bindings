// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _IMAGE_LINENUMBER {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.unionLayout(
            Constants$root.C_LONG$LAYOUT.withName("SymbolTableIndex"),
            Constants$root.C_LONG$LAYOUT.withName("VirtualAddress")
        ).withName("Type"),
        Constants$root.C_SHORT$LAYOUT.withName("Linenumber")
    ).withName("_IMAGE_LINENUMBER");
    public static MemoryLayout $LAYOUT() {
        return _IMAGE_LINENUMBER.$struct$LAYOUT;
    }
    public static class Type {

        static final  GroupLayout Type$union$LAYOUT = MemoryLayout.unionLayout(
            Constants$root.C_LONG$LAYOUT.withName("SymbolTableIndex"),
            Constants$root.C_LONG$LAYOUT.withName("VirtualAddress")
        );
        public static MemoryLayout $LAYOUT() {
            return Type.Type$union$LAYOUT;
        }
        static final VarHandle SymbolTableIndex$VH = Type$union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SymbolTableIndex"));
        public static VarHandle SymbolTableIndex$VH() {
            return Type.SymbolTableIndex$VH;
        }
        public static int SymbolTableIndex$get(MemorySegment seg) {
            return (int)Type.SymbolTableIndex$VH.get(seg);
        }
        public static void SymbolTableIndex$set( MemorySegment seg, int x) {
            Type.SymbolTableIndex$VH.set(seg, x);
        }
        public static int SymbolTableIndex$get(MemorySegment seg, long index) {
            return (int)Type.SymbolTableIndex$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void SymbolTableIndex$set(MemorySegment seg, long index, int x) {
            Type.SymbolTableIndex$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle VirtualAddress$VH = Type$union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("VirtualAddress"));
        public static VarHandle VirtualAddress$VH() {
            return Type.VirtualAddress$VH;
        }
        public static int VirtualAddress$get(MemorySegment seg) {
            return (int)Type.VirtualAddress$VH.get(seg);
        }
        public static void VirtualAddress$set( MemorySegment seg, int x) {
            Type.VirtualAddress$VH.set(seg, x);
        }
        public static int VirtualAddress$get(MemorySegment seg, long index) {
            return (int)Type.VirtualAddress$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void VirtualAddress$set(MemorySegment seg, long index, int x) {
            Type.VirtualAddress$VH.set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
    }

    public static MemorySegment Type$slice(MemorySegment seg) {
        return seg.asSlice(0, 4);
    }
    static final VarHandle Linenumber$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Linenumber"));
    public static VarHandle Linenumber$VH() {
        return _IMAGE_LINENUMBER.Linenumber$VH;
    }
    public static short Linenumber$get(MemorySegment seg) {
        return (short)_IMAGE_LINENUMBER.Linenumber$VH.get(seg);
    }
    public static void Linenumber$set( MemorySegment seg, short x) {
        _IMAGE_LINENUMBER.Linenumber$VH.set(seg, x);
    }
    public static short Linenumber$get(MemorySegment seg, long index) {
        return (short)_IMAGE_LINENUMBER.Linenumber$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Linenumber$set(MemorySegment seg, long index, short x) {
        _IMAGE_LINENUMBER.Linenumber$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


