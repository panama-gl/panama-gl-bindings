// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.VarHandle;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.MemoryHandles;
import jdk.incubator.foreign.MemoryLayout;
import jdk.incubator.foreign.MemorySegment;
import jdk.incubator.foreign.ResourceScope;
import jdk.incubator.foreign.SegmentAllocator;
public class XServerInterpretedAddress {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_INT.withName("typelength"),
        C_INT.withName("valuelength"),
        C_POINTER.withName("type"),
        C_POINTER.withName("value")
    );
    public static MemoryLayout $LAYOUT() {
        return XServerInterpretedAddress.$struct$LAYOUT;
    }
    static final VarHandle typelength$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("typelength"));
    public static VarHandle typelength$VH() {
        return XServerInterpretedAddress.typelength$VH;
    }
    public static int typelength$get(MemorySegment seg) {
        return (int)XServerInterpretedAddress.typelength$VH.get(seg);
    }
    public static void typelength$set( MemorySegment seg, int x) {
        XServerInterpretedAddress.typelength$VH.set(seg, x);
    }
    public static int typelength$get(MemorySegment seg, long index) {
        return (int)XServerInterpretedAddress.typelength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void typelength$set(MemorySegment seg, long index, int x) {
        XServerInterpretedAddress.typelength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle valuelength$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("valuelength"));
    public static VarHandle valuelength$VH() {
        return XServerInterpretedAddress.valuelength$VH;
    }
    public static int valuelength$get(MemorySegment seg) {
        return (int)XServerInterpretedAddress.valuelength$VH.get(seg);
    }
    public static void valuelength$set( MemorySegment seg, int x) {
        XServerInterpretedAddress.valuelength$VH.set(seg, x);
    }
    public static int valuelength$get(MemorySegment seg, long index) {
        return (int)XServerInterpretedAddress.valuelength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void valuelength$set(MemorySegment seg, long index, int x) {
        XServerInterpretedAddress.valuelength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle type$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("type")));
    public static VarHandle type$VH() {
        return XServerInterpretedAddress.type$VH;
    }
    public static MemoryAddress type$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)XServerInterpretedAddress.type$VH.get(seg);
    }
    public static void type$set( MemorySegment seg, MemoryAddress x) {
        XServerInterpretedAddress.type$VH.set(seg, x);
    }
    public static MemoryAddress type$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)XServerInterpretedAddress.type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, MemoryAddress x) {
        XServerInterpretedAddress.type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle value$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("value")));
    public static VarHandle value$VH() {
        return XServerInterpretedAddress.value$VH;
    }
    public static MemoryAddress value$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)XServerInterpretedAddress.value$VH.get(seg);
    }
    public static void value$set( MemorySegment seg, MemoryAddress x) {
        XServerInterpretedAddress.value$VH.set(seg, x);
    }
    public static MemoryAddress value$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)XServerInterpretedAddress.value$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void value$set(MemorySegment seg, long index, MemoryAddress x) {
        XServerInterpretedAddress.value$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocate(ResourceScope scope) { return allocate(SegmentAllocator.ofScope(scope)); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment allocateArray(int len, ResourceScope scope) {
        return allocateArray(len, SegmentAllocator.ofScope(scope));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, ResourceScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

