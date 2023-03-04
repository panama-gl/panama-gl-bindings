// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagENUMUILANG {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("NumOfEnumUILang"),
        Constants$root.C_LONG$LAYOUT.withName("SizeOfEnumUIBuffer"),
        Constants$root.C_POINTER$LAYOUT.withName("pEnumUIBuffer")
    ).withName("tagENUMUILANG");
    public static MemoryLayout $LAYOUT() {
        return tagENUMUILANG.$struct$LAYOUT;
    }
    static final VarHandle NumOfEnumUILang$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumOfEnumUILang"));
    public static VarHandle NumOfEnumUILang$VH() {
        return tagENUMUILANG.NumOfEnumUILang$VH;
    }
    public static int NumOfEnumUILang$get(MemorySegment seg) {
        return (int)tagENUMUILANG.NumOfEnumUILang$VH.get(seg);
    }
    public static void NumOfEnumUILang$set( MemorySegment seg, int x) {
        tagENUMUILANG.NumOfEnumUILang$VH.set(seg, x);
    }
    public static int NumOfEnumUILang$get(MemorySegment seg, long index) {
        return (int)tagENUMUILANG.NumOfEnumUILang$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumOfEnumUILang$set(MemorySegment seg, long index, int x) {
        tagENUMUILANG.NumOfEnumUILang$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SizeOfEnumUIBuffer$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SizeOfEnumUIBuffer"));
    public static VarHandle SizeOfEnumUIBuffer$VH() {
        return tagENUMUILANG.SizeOfEnumUIBuffer$VH;
    }
    public static int SizeOfEnumUIBuffer$get(MemorySegment seg) {
        return (int)tagENUMUILANG.SizeOfEnumUIBuffer$VH.get(seg);
    }
    public static void SizeOfEnumUIBuffer$set( MemorySegment seg, int x) {
        tagENUMUILANG.SizeOfEnumUIBuffer$VH.set(seg, x);
    }
    public static int SizeOfEnumUIBuffer$get(MemorySegment seg, long index) {
        return (int)tagENUMUILANG.SizeOfEnumUIBuffer$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SizeOfEnumUIBuffer$set(MemorySegment seg, long index, int x) {
        tagENUMUILANG.SizeOfEnumUIBuffer$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pEnumUIBuffer$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pEnumUIBuffer"));
    public static VarHandle pEnumUIBuffer$VH() {
        return tagENUMUILANG.pEnumUIBuffer$VH;
    }
    public static MemoryAddress pEnumUIBuffer$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagENUMUILANG.pEnumUIBuffer$VH.get(seg);
    }
    public static void pEnumUIBuffer$set( MemorySegment seg, MemoryAddress x) {
        tagENUMUILANG.pEnumUIBuffer$VH.set(seg, x);
    }
    public static MemoryAddress pEnumUIBuffer$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagENUMUILANG.pEnumUIBuffer$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pEnumUIBuffer$set(MemorySegment seg, long index, MemoryAddress x) {
        tagENUMUILANG.pEnumUIBuffer$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


