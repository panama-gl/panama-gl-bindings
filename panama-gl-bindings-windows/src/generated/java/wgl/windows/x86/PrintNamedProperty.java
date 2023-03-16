// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class PrintNamedProperty {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("propertyName"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("ePropertyType"),
            MemoryLayout.paddingLayout(32),
            MemoryLayout.unionLayout(
                Constants$root.C_CHAR$LAYOUT.withName("propertyByte"),
                Constants$root.C_POINTER$LAYOUT.withName("propertyString"),
                Constants$root.C_LONG$LAYOUT.withName("propertyInt32"),
                Constants$root.C_LONG_LONG$LAYOUT.withName("propertyInt64"),
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("cbBuf"),
                    MemoryLayout.paddingLayout(32),
                    Constants$root.C_POINTER$LAYOUT.withName("pBuf")
                ).withName("propertyBlob")
            ).withName("value")
        ).withName("propertyValue")
    );
    public static MemoryLayout $LAYOUT() {
        return PrintNamedProperty.$struct$LAYOUT;
    }
    static final VarHandle propertyName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("propertyName"));
    public static VarHandle propertyName$VH() {
        return PrintNamedProperty.propertyName$VH;
    }
    public static MemoryAddress propertyName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)PrintNamedProperty.propertyName$VH.get(seg);
    }
    public static void propertyName$set( MemorySegment seg, MemoryAddress x) {
        PrintNamedProperty.propertyName$VH.set(seg, x);
    }
    public static MemoryAddress propertyName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)PrintNamedProperty.propertyName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void propertyName$set(MemorySegment seg, long index, MemoryAddress x) {
        PrintNamedProperty.propertyName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment propertyValue$slice(MemorySegment seg) {
        return seg.asSlice(8, 24);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


