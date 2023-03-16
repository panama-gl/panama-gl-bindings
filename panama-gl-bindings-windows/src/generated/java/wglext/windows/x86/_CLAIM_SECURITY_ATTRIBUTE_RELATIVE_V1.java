// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CLAIM_SECURITY_ATTRIBUTE_RELATIVE_V1 {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Name"),
        Constants$root.C_SHORT$LAYOUT.withName("ValueType"),
        Constants$root.C_SHORT$LAYOUT.withName("Reserved"),
        Constants$root.C_LONG$LAYOUT.withName("Flags"),
        Constants$root.C_LONG$LAYOUT.withName("ValueCount"),
        MemoryLayout.unionLayout(
            MemoryLayout.sequenceLayout(1, Constants$root.C_LONG$LAYOUT).withName("pInt64"),
            MemoryLayout.sequenceLayout(1, Constants$root.C_LONG$LAYOUT).withName("pUint64"),
            MemoryLayout.sequenceLayout(1, Constants$root.C_LONG$LAYOUT).withName("ppString"),
            MemoryLayout.sequenceLayout(1, Constants$root.C_LONG$LAYOUT).withName("pFqbn"),
            MemoryLayout.sequenceLayout(1, Constants$root.C_LONG$LAYOUT).withName("pOctetString")
        ).withName("Values")
    ).withName("_CLAIM_SECURITY_ATTRIBUTE_RELATIVE_V1");
    public static MemoryLayout $LAYOUT() {
        return _CLAIM_SECURITY_ATTRIBUTE_RELATIVE_V1.$struct$LAYOUT;
    }
    static final VarHandle Name$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Name"));
    public static VarHandle Name$VH() {
        return _CLAIM_SECURITY_ATTRIBUTE_RELATIVE_V1.Name$VH;
    }
    public static int Name$get(MemorySegment seg) {
        return (int)_CLAIM_SECURITY_ATTRIBUTE_RELATIVE_V1.Name$VH.get(seg);
    }
    public static void Name$set( MemorySegment seg, int x) {
        _CLAIM_SECURITY_ATTRIBUTE_RELATIVE_V1.Name$VH.set(seg, x);
    }
    public static int Name$get(MemorySegment seg, long index) {
        return (int)_CLAIM_SECURITY_ATTRIBUTE_RELATIVE_V1.Name$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Name$set(MemorySegment seg, long index, int x) {
        _CLAIM_SECURITY_ATTRIBUTE_RELATIVE_V1.Name$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ValueType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ValueType"));
    public static VarHandle ValueType$VH() {
        return _CLAIM_SECURITY_ATTRIBUTE_RELATIVE_V1.ValueType$VH;
    }
    public static short ValueType$get(MemorySegment seg) {
        return (short)_CLAIM_SECURITY_ATTRIBUTE_RELATIVE_V1.ValueType$VH.get(seg);
    }
    public static void ValueType$set( MemorySegment seg, short x) {
        _CLAIM_SECURITY_ATTRIBUTE_RELATIVE_V1.ValueType$VH.set(seg, x);
    }
    public static short ValueType$get(MemorySegment seg, long index) {
        return (short)_CLAIM_SECURITY_ATTRIBUTE_RELATIVE_V1.ValueType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ValueType$set(MemorySegment seg, long index, short x) {
        _CLAIM_SECURITY_ATTRIBUTE_RELATIVE_V1.ValueType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Reserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reserved"));
    public static VarHandle Reserved$VH() {
        return _CLAIM_SECURITY_ATTRIBUTE_RELATIVE_V1.Reserved$VH;
    }
    public static short Reserved$get(MemorySegment seg) {
        return (short)_CLAIM_SECURITY_ATTRIBUTE_RELATIVE_V1.Reserved$VH.get(seg);
    }
    public static void Reserved$set( MemorySegment seg, short x) {
        _CLAIM_SECURITY_ATTRIBUTE_RELATIVE_V1.Reserved$VH.set(seg, x);
    }
    public static short Reserved$get(MemorySegment seg, long index) {
        return (short)_CLAIM_SECURITY_ATTRIBUTE_RELATIVE_V1.Reserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved$set(MemorySegment seg, long index, short x) {
        _CLAIM_SECURITY_ATTRIBUTE_RELATIVE_V1.Reserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _CLAIM_SECURITY_ATTRIBUTE_RELATIVE_V1.Flags$VH;
    }
    public static int Flags$get(MemorySegment seg) {
        return (int)_CLAIM_SECURITY_ATTRIBUTE_RELATIVE_V1.Flags$VH.get(seg);
    }
    public static void Flags$set( MemorySegment seg, int x) {
        _CLAIM_SECURITY_ATTRIBUTE_RELATIVE_V1.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)_CLAIM_SECURITY_ATTRIBUTE_RELATIVE_V1.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        _CLAIM_SECURITY_ATTRIBUTE_RELATIVE_V1.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ValueCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ValueCount"));
    public static VarHandle ValueCount$VH() {
        return _CLAIM_SECURITY_ATTRIBUTE_RELATIVE_V1.ValueCount$VH;
    }
    public static int ValueCount$get(MemorySegment seg) {
        return (int)_CLAIM_SECURITY_ATTRIBUTE_RELATIVE_V1.ValueCount$VH.get(seg);
    }
    public static void ValueCount$set( MemorySegment seg, int x) {
        _CLAIM_SECURITY_ATTRIBUTE_RELATIVE_V1.ValueCount$VH.set(seg, x);
    }
    public static int ValueCount$get(MemorySegment seg, long index) {
        return (int)_CLAIM_SECURITY_ATTRIBUTE_RELATIVE_V1.ValueCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ValueCount$set(MemorySegment seg, long index, int x) {
        _CLAIM_SECURITY_ATTRIBUTE_RELATIVE_V1.ValueCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static class Values {

        static final  GroupLayout Values$union$LAYOUT = MemoryLayout.unionLayout(
            MemoryLayout.sequenceLayout(1, Constants$root.C_LONG$LAYOUT).withName("pInt64"),
            MemoryLayout.sequenceLayout(1, Constants$root.C_LONG$LAYOUT).withName("pUint64"),
            MemoryLayout.sequenceLayout(1, Constants$root.C_LONG$LAYOUT).withName("ppString"),
            MemoryLayout.sequenceLayout(1, Constants$root.C_LONG$LAYOUT).withName("pFqbn"),
            MemoryLayout.sequenceLayout(1, Constants$root.C_LONG$LAYOUT).withName("pOctetString")
        );
        public static MemoryLayout $LAYOUT() {
            return Values.Values$union$LAYOUT;
        }
        public static MemorySegment pInt64$slice(MemorySegment seg) {
            return seg.asSlice(0, 4);
        }
        public static MemorySegment pUint64$slice(MemorySegment seg) {
            return seg.asSlice(0, 4);
        }
        public static MemorySegment ppString$slice(MemorySegment seg) {
            return seg.asSlice(0, 4);
        }
        public static MemorySegment pFqbn$slice(MemorySegment seg) {
            return seg.asSlice(0, 4);
        }
        public static MemorySegment pOctetString$slice(MemorySegment seg) {
            return seg.asSlice(0, 4);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
    }

    public static MemorySegment Values$slice(MemorySegment seg) {
        return seg.asSlice(16, 4);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


