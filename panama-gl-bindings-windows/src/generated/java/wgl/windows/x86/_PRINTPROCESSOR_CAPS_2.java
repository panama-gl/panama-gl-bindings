// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _PRINTPROCESSOR_CAPS_2 {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwLevel"),
        Constants$root.C_LONG$LAYOUT.withName("dwNupOptions"),
        Constants$root.C_LONG$LAYOUT.withName("dwPageOrderFlags"),
        Constants$root.C_LONG$LAYOUT.withName("dwNumberOfCopies"),
        Constants$root.C_LONG$LAYOUT.withName("dwDuplexHandlingCaps"),
        Constants$root.C_LONG$LAYOUT.withName("dwNupDirectionCaps"),
        Constants$root.C_LONG$LAYOUT.withName("dwNupBorderCaps"),
        Constants$root.C_LONG$LAYOUT.withName("dwBookletHandlingCaps"),
        Constants$root.C_LONG$LAYOUT.withName("dwScalingCaps")
    ).withName("_PRINTPROCESSOR_CAPS_2");
    public static MemoryLayout $LAYOUT() {
        return _PRINTPROCESSOR_CAPS_2.$struct$LAYOUT;
    }
    static final VarHandle dwLevel$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwLevel"));
    public static VarHandle dwLevel$VH() {
        return _PRINTPROCESSOR_CAPS_2.dwLevel$VH;
    }
    public static int dwLevel$get(MemorySegment seg) {
        return (int)_PRINTPROCESSOR_CAPS_2.dwLevel$VH.get(seg);
    }
    public static void dwLevel$set( MemorySegment seg, int x) {
        _PRINTPROCESSOR_CAPS_2.dwLevel$VH.set(seg, x);
    }
    public static int dwLevel$get(MemorySegment seg, long index) {
        return (int)_PRINTPROCESSOR_CAPS_2.dwLevel$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwLevel$set(MemorySegment seg, long index, int x) {
        _PRINTPROCESSOR_CAPS_2.dwLevel$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwNupOptions$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwNupOptions"));
    public static VarHandle dwNupOptions$VH() {
        return _PRINTPROCESSOR_CAPS_2.dwNupOptions$VH;
    }
    public static int dwNupOptions$get(MemorySegment seg) {
        return (int)_PRINTPROCESSOR_CAPS_2.dwNupOptions$VH.get(seg);
    }
    public static void dwNupOptions$set( MemorySegment seg, int x) {
        _PRINTPROCESSOR_CAPS_2.dwNupOptions$VH.set(seg, x);
    }
    public static int dwNupOptions$get(MemorySegment seg, long index) {
        return (int)_PRINTPROCESSOR_CAPS_2.dwNupOptions$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwNupOptions$set(MemorySegment seg, long index, int x) {
        _PRINTPROCESSOR_CAPS_2.dwNupOptions$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwPageOrderFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwPageOrderFlags"));
    public static VarHandle dwPageOrderFlags$VH() {
        return _PRINTPROCESSOR_CAPS_2.dwPageOrderFlags$VH;
    }
    public static int dwPageOrderFlags$get(MemorySegment seg) {
        return (int)_PRINTPROCESSOR_CAPS_2.dwPageOrderFlags$VH.get(seg);
    }
    public static void dwPageOrderFlags$set( MemorySegment seg, int x) {
        _PRINTPROCESSOR_CAPS_2.dwPageOrderFlags$VH.set(seg, x);
    }
    public static int dwPageOrderFlags$get(MemorySegment seg, long index) {
        return (int)_PRINTPROCESSOR_CAPS_2.dwPageOrderFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwPageOrderFlags$set(MemorySegment seg, long index, int x) {
        _PRINTPROCESSOR_CAPS_2.dwPageOrderFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwNumberOfCopies$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwNumberOfCopies"));
    public static VarHandle dwNumberOfCopies$VH() {
        return _PRINTPROCESSOR_CAPS_2.dwNumberOfCopies$VH;
    }
    public static int dwNumberOfCopies$get(MemorySegment seg) {
        return (int)_PRINTPROCESSOR_CAPS_2.dwNumberOfCopies$VH.get(seg);
    }
    public static void dwNumberOfCopies$set( MemorySegment seg, int x) {
        _PRINTPROCESSOR_CAPS_2.dwNumberOfCopies$VH.set(seg, x);
    }
    public static int dwNumberOfCopies$get(MemorySegment seg, long index) {
        return (int)_PRINTPROCESSOR_CAPS_2.dwNumberOfCopies$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwNumberOfCopies$set(MemorySegment seg, long index, int x) {
        _PRINTPROCESSOR_CAPS_2.dwNumberOfCopies$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwDuplexHandlingCaps$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwDuplexHandlingCaps"));
    public static VarHandle dwDuplexHandlingCaps$VH() {
        return _PRINTPROCESSOR_CAPS_2.dwDuplexHandlingCaps$VH;
    }
    public static int dwDuplexHandlingCaps$get(MemorySegment seg) {
        return (int)_PRINTPROCESSOR_CAPS_2.dwDuplexHandlingCaps$VH.get(seg);
    }
    public static void dwDuplexHandlingCaps$set( MemorySegment seg, int x) {
        _PRINTPROCESSOR_CAPS_2.dwDuplexHandlingCaps$VH.set(seg, x);
    }
    public static int dwDuplexHandlingCaps$get(MemorySegment seg, long index) {
        return (int)_PRINTPROCESSOR_CAPS_2.dwDuplexHandlingCaps$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwDuplexHandlingCaps$set(MemorySegment seg, long index, int x) {
        _PRINTPROCESSOR_CAPS_2.dwDuplexHandlingCaps$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwNupDirectionCaps$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwNupDirectionCaps"));
    public static VarHandle dwNupDirectionCaps$VH() {
        return _PRINTPROCESSOR_CAPS_2.dwNupDirectionCaps$VH;
    }
    public static int dwNupDirectionCaps$get(MemorySegment seg) {
        return (int)_PRINTPROCESSOR_CAPS_2.dwNupDirectionCaps$VH.get(seg);
    }
    public static void dwNupDirectionCaps$set( MemorySegment seg, int x) {
        _PRINTPROCESSOR_CAPS_2.dwNupDirectionCaps$VH.set(seg, x);
    }
    public static int dwNupDirectionCaps$get(MemorySegment seg, long index) {
        return (int)_PRINTPROCESSOR_CAPS_2.dwNupDirectionCaps$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwNupDirectionCaps$set(MemorySegment seg, long index, int x) {
        _PRINTPROCESSOR_CAPS_2.dwNupDirectionCaps$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwNupBorderCaps$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwNupBorderCaps"));
    public static VarHandle dwNupBorderCaps$VH() {
        return _PRINTPROCESSOR_CAPS_2.dwNupBorderCaps$VH;
    }
    public static int dwNupBorderCaps$get(MemorySegment seg) {
        return (int)_PRINTPROCESSOR_CAPS_2.dwNupBorderCaps$VH.get(seg);
    }
    public static void dwNupBorderCaps$set( MemorySegment seg, int x) {
        _PRINTPROCESSOR_CAPS_2.dwNupBorderCaps$VH.set(seg, x);
    }
    public static int dwNupBorderCaps$get(MemorySegment seg, long index) {
        return (int)_PRINTPROCESSOR_CAPS_2.dwNupBorderCaps$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwNupBorderCaps$set(MemorySegment seg, long index, int x) {
        _PRINTPROCESSOR_CAPS_2.dwNupBorderCaps$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwBookletHandlingCaps$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwBookletHandlingCaps"));
    public static VarHandle dwBookletHandlingCaps$VH() {
        return _PRINTPROCESSOR_CAPS_2.dwBookletHandlingCaps$VH;
    }
    public static int dwBookletHandlingCaps$get(MemorySegment seg) {
        return (int)_PRINTPROCESSOR_CAPS_2.dwBookletHandlingCaps$VH.get(seg);
    }
    public static void dwBookletHandlingCaps$set( MemorySegment seg, int x) {
        _PRINTPROCESSOR_CAPS_2.dwBookletHandlingCaps$VH.set(seg, x);
    }
    public static int dwBookletHandlingCaps$get(MemorySegment seg, long index) {
        return (int)_PRINTPROCESSOR_CAPS_2.dwBookletHandlingCaps$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwBookletHandlingCaps$set(MemorySegment seg, long index, int x) {
        _PRINTPROCESSOR_CAPS_2.dwBookletHandlingCaps$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwScalingCaps$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwScalingCaps"));
    public static VarHandle dwScalingCaps$VH() {
        return _PRINTPROCESSOR_CAPS_2.dwScalingCaps$VH;
    }
    public static int dwScalingCaps$get(MemorySegment seg) {
        return (int)_PRINTPROCESSOR_CAPS_2.dwScalingCaps$VH.get(seg);
    }
    public static void dwScalingCaps$set( MemorySegment seg, int x) {
        _PRINTPROCESSOR_CAPS_2.dwScalingCaps$VH.set(seg, x);
    }
    public static int dwScalingCaps$get(MemorySegment seg, long index) {
        return (int)_PRINTPROCESSOR_CAPS_2.dwScalingCaps$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwScalingCaps$set(MemorySegment seg, long index, int x) {
        _PRINTPROCESSOR_CAPS_2.dwScalingCaps$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


