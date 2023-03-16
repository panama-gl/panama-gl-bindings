// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _IMAGE_SYMBOL {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.unionLayout(
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("ShortName"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("Short"),
                Constants$root.C_LONG$LAYOUT.withName("Long")
            ).withName("Name"),
            MemoryLayout.sequenceLayout(2, Constants$root.C_LONG$LAYOUT).withName("LongName")
        ).withName("N"),
        Constants$root.C_LONG$LAYOUT.withName("Value"),
        Constants$root.C_SHORT$LAYOUT.withName("SectionNumber"),
        Constants$root.C_SHORT$LAYOUT.withName("Type"),
        Constants$root.C_CHAR$LAYOUT.withName("StorageClass"),
        Constants$root.C_CHAR$LAYOUT.withName("NumberOfAuxSymbols")
    ).withName("_IMAGE_SYMBOL");
    public static MemoryLayout $LAYOUT() {
        return _IMAGE_SYMBOL.$struct$LAYOUT;
    }
    public static class N {

        static final  GroupLayout N$union$LAYOUT = MemoryLayout.unionLayout(
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("ShortName"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("Short"),
                Constants$root.C_LONG$LAYOUT.withName("Long")
            ).withName("Name"),
            MemoryLayout.sequenceLayout(2, Constants$root.C_LONG$LAYOUT).withName("LongName")
        );
        public static MemoryLayout $LAYOUT() {
            return N.N$union$LAYOUT;
        }
        public static MemorySegment ShortName$slice(MemorySegment seg) {
            return seg.asSlice(0, 8);
        }
        public static class Name {

            static final  GroupLayout N$Name$struct$LAYOUT = MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("Short"),
                Constants$root.C_LONG$LAYOUT.withName("Long")
            );
            public static MemoryLayout $LAYOUT() {
                return Name.N$Name$struct$LAYOUT;
            }
            static final VarHandle Short$VH = N$Name$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Short"));
            public static VarHandle Short$VH() {
                return Name.Short$VH;
            }
            public static int Short$get(MemorySegment seg) {
                return (int)Name.Short$VH.get(seg);
            }
            public static void Short$set( MemorySegment seg, int x) {
                Name.Short$VH.set(seg, x);
            }
            public static int Short$get(MemorySegment seg, long index) {
                return (int)Name.Short$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void Short$set(MemorySegment seg, long index, int x) {
                Name.Short$VH.set(seg.asSlice(index*sizeof()), x);
            }
            static final VarHandle Long$VH = N$Name$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Long"));
            public static VarHandle Long$VH() {
                return Name.Long$VH;
            }
            public static int Long$get(MemorySegment seg) {
                return (int)Name.Long$VH.get(seg);
            }
            public static void Long$set( MemorySegment seg, int x) {
                Name.Long$VH.set(seg, x);
            }
            public static int Long$get(MemorySegment seg, long index) {
                return (int)Name.Long$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void Long$set(MemorySegment seg, long index, int x) {
                Name.Long$VH.set(seg.asSlice(index*sizeof()), x);
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
            public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
                return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
            }
            public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
        }

        public static MemorySegment Name$slice(MemorySegment seg) {
            return seg.asSlice(0, 8);
        }
        public static MemorySegment LongName$slice(MemorySegment seg) {
            return seg.asSlice(0, 8);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
    }

    public static MemorySegment N$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    static final VarHandle Value$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Value"));
    public static VarHandle Value$VH() {
        return _IMAGE_SYMBOL.Value$VH;
    }
    public static int Value$get(MemorySegment seg) {
        return (int)_IMAGE_SYMBOL.Value$VH.get(seg);
    }
    public static void Value$set( MemorySegment seg, int x) {
        _IMAGE_SYMBOL.Value$VH.set(seg, x);
    }
    public static int Value$get(MemorySegment seg, long index) {
        return (int)_IMAGE_SYMBOL.Value$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Value$set(MemorySegment seg, long index, int x) {
        _IMAGE_SYMBOL.Value$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SectionNumber$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SectionNumber"));
    public static VarHandle SectionNumber$VH() {
        return _IMAGE_SYMBOL.SectionNumber$VH;
    }
    public static short SectionNumber$get(MemorySegment seg) {
        return (short)_IMAGE_SYMBOL.SectionNumber$VH.get(seg);
    }
    public static void SectionNumber$set( MemorySegment seg, short x) {
        _IMAGE_SYMBOL.SectionNumber$VH.set(seg, x);
    }
    public static short SectionNumber$get(MemorySegment seg, long index) {
        return (short)_IMAGE_SYMBOL.SectionNumber$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SectionNumber$set(MemorySegment seg, long index, short x) {
        _IMAGE_SYMBOL.SectionNumber$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Type"));
    public static VarHandle Type$VH() {
        return _IMAGE_SYMBOL.Type$VH;
    }
    public static short Type$get(MemorySegment seg) {
        return (short)_IMAGE_SYMBOL.Type$VH.get(seg);
    }
    public static void Type$set( MemorySegment seg, short x) {
        _IMAGE_SYMBOL.Type$VH.set(seg, x);
    }
    public static short Type$get(MemorySegment seg, long index) {
        return (short)_IMAGE_SYMBOL.Type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Type$set(MemorySegment seg, long index, short x) {
        _IMAGE_SYMBOL.Type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle StorageClass$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("StorageClass"));
    public static VarHandle StorageClass$VH() {
        return _IMAGE_SYMBOL.StorageClass$VH;
    }
    public static byte StorageClass$get(MemorySegment seg) {
        return (byte)_IMAGE_SYMBOL.StorageClass$VH.get(seg);
    }
    public static void StorageClass$set( MemorySegment seg, byte x) {
        _IMAGE_SYMBOL.StorageClass$VH.set(seg, x);
    }
    public static byte StorageClass$get(MemorySegment seg, long index) {
        return (byte)_IMAGE_SYMBOL.StorageClass$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void StorageClass$set(MemorySegment seg, long index, byte x) {
        _IMAGE_SYMBOL.StorageClass$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumberOfAuxSymbols$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberOfAuxSymbols"));
    public static VarHandle NumberOfAuxSymbols$VH() {
        return _IMAGE_SYMBOL.NumberOfAuxSymbols$VH;
    }
    public static byte NumberOfAuxSymbols$get(MemorySegment seg) {
        return (byte)_IMAGE_SYMBOL.NumberOfAuxSymbols$VH.get(seg);
    }
    public static void NumberOfAuxSymbols$set( MemorySegment seg, byte x) {
        _IMAGE_SYMBOL.NumberOfAuxSymbols$VH.set(seg, x);
    }
    public static byte NumberOfAuxSymbols$get(MemorySegment seg, long index) {
        return (byte)_IMAGE_SYMBOL.NumberOfAuxSymbols$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfAuxSymbols$set(MemorySegment seg, long index, byte x) {
        _IMAGE_SYMBOL.NumberOfAuxSymbols$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


