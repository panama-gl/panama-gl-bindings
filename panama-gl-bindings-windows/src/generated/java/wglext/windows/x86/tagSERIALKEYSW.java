// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagSERIALKEYSW {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        Constants$root.C_LONG$LAYOUT.withName("dwFlags"),
        Constants$root.C_POINTER$LAYOUT.withName("lpszActivePort"),
        Constants$root.C_POINTER$LAYOUT.withName("lpszPort"),
        Constants$root.C_LONG$LAYOUT.withName("iBaudRate"),
        Constants$root.C_LONG$LAYOUT.withName("iPortState"),
        Constants$root.C_LONG$LAYOUT.withName("iActive"),
        MemoryLayout.paddingLayout(32)
    ).withName("tagSERIALKEYSW");
    public static MemoryLayout $LAYOUT() {
        return tagSERIALKEYSW.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return tagSERIALKEYSW.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)tagSERIALKEYSW.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        tagSERIALKEYSW.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)tagSERIALKEYSW.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        tagSERIALKEYSW.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return tagSERIALKEYSW.dwFlags$VH;
    }
    public static int dwFlags$get(MemorySegment seg) {
        return (int)tagSERIALKEYSW.dwFlags$VH.get(seg);
    }
    public static void dwFlags$set( MemorySegment seg, int x) {
        tagSERIALKEYSW.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)tagSERIALKEYSW.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        tagSERIALKEYSW.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpszActivePort$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpszActivePort"));
    public static VarHandle lpszActivePort$VH() {
        return tagSERIALKEYSW.lpszActivePort$VH;
    }
    public static MemoryAddress lpszActivePort$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagSERIALKEYSW.lpszActivePort$VH.get(seg);
    }
    public static void lpszActivePort$set( MemorySegment seg, MemoryAddress x) {
        tagSERIALKEYSW.lpszActivePort$VH.set(seg, x);
    }
    public static MemoryAddress lpszActivePort$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagSERIALKEYSW.lpszActivePort$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpszActivePort$set(MemorySegment seg, long index, MemoryAddress x) {
        tagSERIALKEYSW.lpszActivePort$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpszPort$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpszPort"));
    public static VarHandle lpszPort$VH() {
        return tagSERIALKEYSW.lpszPort$VH;
    }
    public static MemoryAddress lpszPort$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagSERIALKEYSW.lpszPort$VH.get(seg);
    }
    public static void lpszPort$set( MemorySegment seg, MemoryAddress x) {
        tagSERIALKEYSW.lpszPort$VH.set(seg, x);
    }
    public static MemoryAddress lpszPort$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagSERIALKEYSW.lpszPort$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpszPort$set(MemorySegment seg, long index, MemoryAddress x) {
        tagSERIALKEYSW.lpszPort$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iBaudRate$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iBaudRate"));
    public static VarHandle iBaudRate$VH() {
        return tagSERIALKEYSW.iBaudRate$VH;
    }
    public static int iBaudRate$get(MemorySegment seg) {
        return (int)tagSERIALKEYSW.iBaudRate$VH.get(seg);
    }
    public static void iBaudRate$set( MemorySegment seg, int x) {
        tagSERIALKEYSW.iBaudRate$VH.set(seg, x);
    }
    public static int iBaudRate$get(MemorySegment seg, long index) {
        return (int)tagSERIALKEYSW.iBaudRate$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iBaudRate$set(MemorySegment seg, long index, int x) {
        tagSERIALKEYSW.iBaudRate$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iPortState$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iPortState"));
    public static VarHandle iPortState$VH() {
        return tagSERIALKEYSW.iPortState$VH;
    }
    public static int iPortState$get(MemorySegment seg) {
        return (int)tagSERIALKEYSW.iPortState$VH.get(seg);
    }
    public static void iPortState$set( MemorySegment seg, int x) {
        tagSERIALKEYSW.iPortState$VH.set(seg, x);
    }
    public static int iPortState$get(MemorySegment seg, long index) {
        return (int)tagSERIALKEYSW.iPortState$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iPortState$set(MemorySegment seg, long index, int x) {
        tagSERIALKEYSW.iPortState$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iActive$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iActive"));
    public static VarHandle iActive$VH() {
        return tagSERIALKEYSW.iActive$VH;
    }
    public static int iActive$get(MemorySegment seg) {
        return (int)tagSERIALKEYSW.iActive$VH.get(seg);
    }
    public static void iActive$set( MemorySegment seg, int x) {
        tagSERIALKEYSW.iActive$VH.set(seg, x);
    }
    public static int iActive$get(MemorySegment seg, long index) {
        return (int)tagSERIALKEYSW.iActive$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iActive$set(MemorySegment seg, long index, int x) {
        tagSERIALKEYSW.iActive$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


