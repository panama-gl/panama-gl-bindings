// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _IMAGE_THUNK_DATA64 {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.unionLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("ForwarderString"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("Function"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("Ordinal"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("AddressOfData")
        ).withName("u1")
    ).withName("_IMAGE_THUNK_DATA64");
    public static MemoryLayout $LAYOUT() {
        return _IMAGE_THUNK_DATA64.$struct$LAYOUT;
    }
    public static class u1 {

        static final  GroupLayout u1$union$LAYOUT = MemoryLayout.unionLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("ForwarderString"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("Function"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("Ordinal"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("AddressOfData")
        );
        public static MemoryLayout $LAYOUT() {
            return u1.u1$union$LAYOUT;
        }
        static final VarHandle ForwarderString$VH = u1$union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ForwarderString"));
        public static VarHandle ForwarderString$VH() {
            return u1.ForwarderString$VH;
        }
        public static long ForwarderString$get(MemorySegment seg) {
            return (long)u1.ForwarderString$VH.get(seg);
        }
        public static void ForwarderString$set( MemorySegment seg, long x) {
            u1.ForwarderString$VH.set(seg, x);
        }
        public static long ForwarderString$get(MemorySegment seg, long index) {
            return (long)u1.ForwarderString$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void ForwarderString$set(MemorySegment seg, long index, long x) {
            u1.ForwarderString$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle Function$VH = u1$union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Function"));
        public static VarHandle Function$VH() {
            return u1.Function$VH;
        }
        public static long Function$get(MemorySegment seg) {
            return (long)u1.Function$VH.get(seg);
        }
        public static void Function$set( MemorySegment seg, long x) {
            u1.Function$VH.set(seg, x);
        }
        public static long Function$get(MemorySegment seg, long index) {
            return (long)u1.Function$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void Function$set(MemorySegment seg, long index, long x) {
            u1.Function$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle Ordinal$VH = u1$union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Ordinal"));
        public static VarHandle Ordinal$VH() {
            return u1.Ordinal$VH;
        }
        public static long Ordinal$get(MemorySegment seg) {
            return (long)u1.Ordinal$VH.get(seg);
        }
        public static void Ordinal$set( MemorySegment seg, long x) {
            u1.Ordinal$VH.set(seg, x);
        }
        public static long Ordinal$get(MemorySegment seg, long index) {
            return (long)u1.Ordinal$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void Ordinal$set(MemorySegment seg, long index, long x) {
            u1.Ordinal$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle AddressOfData$VH = u1$union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddressOfData"));
        public static VarHandle AddressOfData$VH() {
            return u1.AddressOfData$VH;
        }
        public static long AddressOfData$get(MemorySegment seg) {
            return (long)u1.AddressOfData$VH.get(seg);
        }
        public static void AddressOfData$set( MemorySegment seg, long x) {
            u1.AddressOfData$VH.set(seg, x);
        }
        public static long AddressOfData$get(MemorySegment seg, long index) {
            return (long)u1.AddressOfData$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void AddressOfData$set(MemorySegment seg, long index, long x) {
            u1.AddressOfData$VH.set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
    }

    public static MemorySegment u1$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


