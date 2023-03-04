// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _LDT_ENTRY {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("LimitLow"),
        Constants$root.C_SHORT$LAYOUT.withName("BaseLow"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_CHAR$LAYOUT.withName("BaseMid"),
                Constants$root.C_CHAR$LAYOUT.withName("Flags1"),
                Constants$root.C_CHAR$LAYOUT.withName("Flags2"),
                Constants$root.C_CHAR$LAYOUT.withName("BaseHi")
            ).withName("Bytes"),
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    MemoryLayout.paddingLayout(8).withName("BaseMid"),
                    MemoryLayout.paddingLayout(5).withName("Type"),
                    MemoryLayout.paddingLayout(2).withName("Dpl"),
                    MemoryLayout.paddingLayout(1).withName("Pres"),
                    MemoryLayout.paddingLayout(4).withName("LimitHi"),
                    MemoryLayout.paddingLayout(1).withName("Sys"),
                    MemoryLayout.paddingLayout(1).withName("Reserved_0"),
                    MemoryLayout.paddingLayout(1).withName("Default_Big"),
                    MemoryLayout.paddingLayout(1).withName("Granularity"),
                    MemoryLayout.paddingLayout(8).withName("BaseHi")
                )
            ).withName("Bits")
        ).withName("HighWord")
    ).withName("_LDT_ENTRY");
    public static MemoryLayout $LAYOUT() {
        return _LDT_ENTRY.$struct$LAYOUT;
    }
    static final VarHandle LimitLow$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LimitLow"));
    public static VarHandle LimitLow$VH() {
        return _LDT_ENTRY.LimitLow$VH;
    }
    public static short LimitLow$get(MemorySegment seg) {
        return (short)_LDT_ENTRY.LimitLow$VH.get(seg);
    }
    public static void LimitLow$set( MemorySegment seg, short x) {
        _LDT_ENTRY.LimitLow$VH.set(seg, x);
    }
    public static short LimitLow$get(MemorySegment seg, long index) {
        return (short)_LDT_ENTRY.LimitLow$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LimitLow$set(MemorySegment seg, long index, short x) {
        _LDT_ENTRY.LimitLow$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle BaseLow$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("BaseLow"));
    public static VarHandle BaseLow$VH() {
        return _LDT_ENTRY.BaseLow$VH;
    }
    public static short BaseLow$get(MemorySegment seg) {
        return (short)_LDT_ENTRY.BaseLow$VH.get(seg);
    }
    public static void BaseLow$set( MemorySegment seg, short x) {
        _LDT_ENTRY.BaseLow$VH.set(seg, x);
    }
    public static short BaseLow$get(MemorySegment seg, long index) {
        return (short)_LDT_ENTRY.BaseLow$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void BaseLow$set(MemorySegment seg, long index, short x) {
        _LDT_ENTRY.BaseLow$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static class HighWord {

        static final  GroupLayout HighWord$union$LAYOUT = MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_CHAR$LAYOUT.withName("BaseMid"),
                Constants$root.C_CHAR$LAYOUT.withName("Flags1"),
                Constants$root.C_CHAR$LAYOUT.withName("Flags2"),
                Constants$root.C_CHAR$LAYOUT.withName("BaseHi")
            ).withName("Bytes"),
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    MemoryLayout.paddingLayout(8).withName("BaseMid"),
                    MemoryLayout.paddingLayout(5).withName("Type"),
                    MemoryLayout.paddingLayout(2).withName("Dpl"),
                    MemoryLayout.paddingLayout(1).withName("Pres"),
                    MemoryLayout.paddingLayout(4).withName("LimitHi"),
                    MemoryLayout.paddingLayout(1).withName("Sys"),
                    MemoryLayout.paddingLayout(1).withName("Reserved_0"),
                    MemoryLayout.paddingLayout(1).withName("Default_Big"),
                    MemoryLayout.paddingLayout(1).withName("Granularity"),
                    MemoryLayout.paddingLayout(8).withName("BaseHi")
                )
            ).withName("Bits")
        );
        public static MemoryLayout $LAYOUT() {
            return HighWord.HighWord$union$LAYOUT;
        }
        public static class Bytes {

            static final  GroupLayout HighWord$Bytes$struct$LAYOUT = MemoryLayout.structLayout(
                Constants$root.C_CHAR$LAYOUT.withName("BaseMid"),
                Constants$root.C_CHAR$LAYOUT.withName("Flags1"),
                Constants$root.C_CHAR$LAYOUT.withName("Flags2"),
                Constants$root.C_CHAR$LAYOUT.withName("BaseHi")
            );
            public static MemoryLayout $LAYOUT() {
                return Bytes.HighWord$Bytes$struct$LAYOUT;
            }
            static final VarHandle BaseMid$VH = HighWord$Bytes$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("BaseMid"));
            public static VarHandle BaseMid$VH() {
                return Bytes.BaseMid$VH;
            }
            public static byte BaseMid$get(MemorySegment seg) {
                return (byte)Bytes.BaseMid$VH.get(seg);
            }
            public static void BaseMid$set( MemorySegment seg, byte x) {
                Bytes.BaseMid$VH.set(seg, x);
            }
            public static byte BaseMid$get(MemorySegment seg, long index) {
                return (byte)Bytes.BaseMid$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void BaseMid$set(MemorySegment seg, long index, byte x) {
                Bytes.BaseMid$VH.set(seg.asSlice(index*sizeof()), x);
            }
            static final VarHandle Flags1$VH = HighWord$Bytes$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags1"));
            public static VarHandle Flags1$VH() {
                return Bytes.Flags1$VH;
            }
            public static byte Flags1$get(MemorySegment seg) {
                return (byte)Bytes.Flags1$VH.get(seg);
            }
            public static void Flags1$set( MemorySegment seg, byte x) {
                Bytes.Flags1$VH.set(seg, x);
            }
            public static byte Flags1$get(MemorySegment seg, long index) {
                return (byte)Bytes.Flags1$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void Flags1$set(MemorySegment seg, long index, byte x) {
                Bytes.Flags1$VH.set(seg.asSlice(index*sizeof()), x);
            }
            static final VarHandle Flags2$VH = HighWord$Bytes$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags2"));
            public static VarHandle Flags2$VH() {
                return Bytes.Flags2$VH;
            }
            public static byte Flags2$get(MemorySegment seg) {
                return (byte)Bytes.Flags2$VH.get(seg);
            }
            public static void Flags2$set( MemorySegment seg, byte x) {
                Bytes.Flags2$VH.set(seg, x);
            }
            public static byte Flags2$get(MemorySegment seg, long index) {
                return (byte)Bytes.Flags2$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void Flags2$set(MemorySegment seg, long index, byte x) {
                Bytes.Flags2$VH.set(seg.asSlice(index*sizeof()), x);
            }
            static final VarHandle BaseHi$VH = HighWord$Bytes$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("BaseHi"));
            public static VarHandle BaseHi$VH() {
                return Bytes.BaseHi$VH;
            }
            public static byte BaseHi$get(MemorySegment seg) {
                return (byte)Bytes.BaseHi$VH.get(seg);
            }
            public static void BaseHi$set( MemorySegment seg, byte x) {
                Bytes.BaseHi$VH.set(seg, x);
            }
            public static byte BaseHi$get(MemorySegment seg, long index) {
                return (byte)Bytes.BaseHi$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void BaseHi$set(MemorySegment seg, long index, byte x) {
                Bytes.BaseHi$VH.set(seg.asSlice(index*sizeof()), x);
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
            public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
                return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
            }
            public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
        }

        public static MemorySegment Bytes$slice(MemorySegment seg) {
            return seg.asSlice(0, 4);
        }
        public static class Bits {

            static final  GroupLayout HighWord$Bits$struct$LAYOUT = MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    MemoryLayout.paddingLayout(8).withName("BaseMid"),
                    MemoryLayout.paddingLayout(5).withName("Type"),
                    MemoryLayout.paddingLayout(2).withName("Dpl"),
                    MemoryLayout.paddingLayout(1).withName("Pres"),
                    MemoryLayout.paddingLayout(4).withName("LimitHi"),
                    MemoryLayout.paddingLayout(1).withName("Sys"),
                    MemoryLayout.paddingLayout(1).withName("Reserved_0"),
                    MemoryLayout.paddingLayout(1).withName("Default_Big"),
                    MemoryLayout.paddingLayout(1).withName("Granularity"),
                    MemoryLayout.paddingLayout(8).withName("BaseHi")
                )
            );
            public static MemoryLayout $LAYOUT() {
                return Bits.HighWord$Bits$struct$LAYOUT;
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
            public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
                return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
            }
            public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
        }

        public static MemorySegment Bits$slice(MemorySegment seg) {
            return seg.asSlice(0, 4);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
    }

    public static MemorySegment HighWord$slice(MemorySegment seg) {
        return seg.asSlice(4, 4);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


