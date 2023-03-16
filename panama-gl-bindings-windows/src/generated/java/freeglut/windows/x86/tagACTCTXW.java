// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagACTCTXW {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        Constants$root.C_LONG$LAYOUT.withName("dwFlags"),
        Constants$root.C_POINTER$LAYOUT.withName("lpSource"),
        Constants$root.C_SHORT$LAYOUT.withName("wProcessorArchitecture"),
        Constants$root.C_SHORT$LAYOUT.withName("wLangId"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("lpAssemblyDirectory"),
        Constants$root.C_POINTER$LAYOUT.withName("lpResourceName"),
        Constants$root.C_POINTER$LAYOUT.withName("lpApplicationName"),
        Constants$root.C_POINTER$LAYOUT.withName("hModule")
    ).withName("tagACTCTXW");
    public static MemoryLayout $LAYOUT() {
        return tagACTCTXW.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return tagACTCTXW.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)tagACTCTXW.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        tagACTCTXW.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)tagACTCTXW.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        tagACTCTXW.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return tagACTCTXW.dwFlags$VH;
    }
    public static int dwFlags$get(MemorySegment seg) {
        return (int)tagACTCTXW.dwFlags$VH.get(seg);
    }
    public static void dwFlags$set( MemorySegment seg, int x) {
        tagACTCTXW.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)tagACTCTXW.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        tagACTCTXW.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpSource$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpSource"));
    public static VarHandle lpSource$VH() {
        return tagACTCTXW.lpSource$VH;
    }
    public static MemoryAddress lpSource$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagACTCTXW.lpSource$VH.get(seg);
    }
    public static void lpSource$set( MemorySegment seg, MemoryAddress x) {
        tagACTCTXW.lpSource$VH.set(seg, x);
    }
    public static MemoryAddress lpSource$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagACTCTXW.lpSource$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpSource$set(MemorySegment seg, long index, MemoryAddress x) {
        tagACTCTXW.lpSource$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wProcessorArchitecture$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wProcessorArchitecture"));
    public static VarHandle wProcessorArchitecture$VH() {
        return tagACTCTXW.wProcessorArchitecture$VH;
    }
    public static short wProcessorArchitecture$get(MemorySegment seg) {
        return (short)tagACTCTXW.wProcessorArchitecture$VH.get(seg);
    }
    public static void wProcessorArchitecture$set( MemorySegment seg, short x) {
        tagACTCTXW.wProcessorArchitecture$VH.set(seg, x);
    }
    public static short wProcessorArchitecture$get(MemorySegment seg, long index) {
        return (short)tagACTCTXW.wProcessorArchitecture$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wProcessorArchitecture$set(MemorySegment seg, long index, short x) {
        tagACTCTXW.wProcessorArchitecture$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wLangId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wLangId"));
    public static VarHandle wLangId$VH() {
        return tagACTCTXW.wLangId$VH;
    }
    public static short wLangId$get(MemorySegment seg) {
        return (short)tagACTCTXW.wLangId$VH.get(seg);
    }
    public static void wLangId$set( MemorySegment seg, short x) {
        tagACTCTXW.wLangId$VH.set(seg, x);
    }
    public static short wLangId$get(MemorySegment seg, long index) {
        return (short)tagACTCTXW.wLangId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wLangId$set(MemorySegment seg, long index, short x) {
        tagACTCTXW.wLangId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpAssemblyDirectory$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpAssemblyDirectory"));
    public static VarHandle lpAssemblyDirectory$VH() {
        return tagACTCTXW.lpAssemblyDirectory$VH;
    }
    public static MemoryAddress lpAssemblyDirectory$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagACTCTXW.lpAssemblyDirectory$VH.get(seg);
    }
    public static void lpAssemblyDirectory$set( MemorySegment seg, MemoryAddress x) {
        tagACTCTXW.lpAssemblyDirectory$VH.set(seg, x);
    }
    public static MemoryAddress lpAssemblyDirectory$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagACTCTXW.lpAssemblyDirectory$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpAssemblyDirectory$set(MemorySegment seg, long index, MemoryAddress x) {
        tagACTCTXW.lpAssemblyDirectory$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpResourceName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpResourceName"));
    public static VarHandle lpResourceName$VH() {
        return tagACTCTXW.lpResourceName$VH;
    }
    public static MemoryAddress lpResourceName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagACTCTXW.lpResourceName$VH.get(seg);
    }
    public static void lpResourceName$set( MemorySegment seg, MemoryAddress x) {
        tagACTCTXW.lpResourceName$VH.set(seg, x);
    }
    public static MemoryAddress lpResourceName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagACTCTXW.lpResourceName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpResourceName$set(MemorySegment seg, long index, MemoryAddress x) {
        tagACTCTXW.lpResourceName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpApplicationName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpApplicationName"));
    public static VarHandle lpApplicationName$VH() {
        return tagACTCTXW.lpApplicationName$VH;
    }
    public static MemoryAddress lpApplicationName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagACTCTXW.lpApplicationName$VH.get(seg);
    }
    public static void lpApplicationName$set( MemorySegment seg, MemoryAddress x) {
        tagACTCTXW.lpApplicationName$VH.set(seg, x);
    }
    public static MemoryAddress lpApplicationName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagACTCTXW.lpApplicationName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpApplicationName$set(MemorySegment seg, long index, MemoryAddress x) {
        tagACTCTXW.lpApplicationName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hModule$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hModule"));
    public static VarHandle hModule$VH() {
        return tagACTCTXW.hModule$VH;
    }
    public static MemoryAddress hModule$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagACTCTXW.hModule$VH.get(seg);
    }
    public static void hModule$set( MemorySegment seg, MemoryAddress x) {
        tagACTCTXW.hModule$VH.set(seg, x);
    }
    public static MemoryAddress hModule$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagACTCTXW.hModule$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hModule$set(MemorySegment seg, long index, MemoryAddress x) {
        tagACTCTXW.hModule$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

