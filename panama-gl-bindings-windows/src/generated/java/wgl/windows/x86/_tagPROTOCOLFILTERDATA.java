// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _tagPROTOCOLFILTERDATA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pProtocolSink"),
        Constants$root.C_POINTER$LAYOUT.withName("pProtocol"),
        Constants$root.C_POINTER$LAYOUT.withName("pUnk"),
        Constants$root.C_LONG$LAYOUT.withName("dwFilterFlags"),
        MemoryLayout.paddingLayout(32)
    ).withName("_tagPROTOCOLFILTERDATA");
    public static MemoryLayout $LAYOUT() {
        return _tagPROTOCOLFILTERDATA.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _tagPROTOCOLFILTERDATA.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)_tagPROTOCOLFILTERDATA.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        _tagPROTOCOLFILTERDATA.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_tagPROTOCOLFILTERDATA.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _tagPROTOCOLFILTERDATA.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pProtocolSink$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pProtocolSink"));
    public static VarHandle pProtocolSink$VH() {
        return _tagPROTOCOLFILTERDATA.pProtocolSink$VH;
    }
    public static MemoryAddress pProtocolSink$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_tagPROTOCOLFILTERDATA.pProtocolSink$VH.get(seg);
    }
    public static void pProtocolSink$set( MemorySegment seg, MemoryAddress x) {
        _tagPROTOCOLFILTERDATA.pProtocolSink$VH.set(seg, x);
    }
    public static MemoryAddress pProtocolSink$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_tagPROTOCOLFILTERDATA.pProtocolSink$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pProtocolSink$set(MemorySegment seg, long index, MemoryAddress x) {
        _tagPROTOCOLFILTERDATA.pProtocolSink$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pProtocol$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pProtocol"));
    public static VarHandle pProtocol$VH() {
        return _tagPROTOCOLFILTERDATA.pProtocol$VH;
    }
    public static MemoryAddress pProtocol$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_tagPROTOCOLFILTERDATA.pProtocol$VH.get(seg);
    }
    public static void pProtocol$set( MemorySegment seg, MemoryAddress x) {
        _tagPROTOCOLFILTERDATA.pProtocol$VH.set(seg, x);
    }
    public static MemoryAddress pProtocol$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_tagPROTOCOLFILTERDATA.pProtocol$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pProtocol$set(MemorySegment seg, long index, MemoryAddress x) {
        _tagPROTOCOLFILTERDATA.pProtocol$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pUnk$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pUnk"));
    public static VarHandle pUnk$VH() {
        return _tagPROTOCOLFILTERDATA.pUnk$VH;
    }
    public static MemoryAddress pUnk$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_tagPROTOCOLFILTERDATA.pUnk$VH.get(seg);
    }
    public static void pUnk$set( MemorySegment seg, MemoryAddress x) {
        _tagPROTOCOLFILTERDATA.pUnk$VH.set(seg, x);
    }
    public static MemoryAddress pUnk$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_tagPROTOCOLFILTERDATA.pUnk$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pUnk$set(MemorySegment seg, long index, MemoryAddress x) {
        _tagPROTOCOLFILTERDATA.pUnk$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFilterFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFilterFlags"));
    public static VarHandle dwFilterFlags$VH() {
        return _tagPROTOCOLFILTERDATA.dwFilterFlags$VH;
    }
    public static int dwFilterFlags$get(MemorySegment seg) {
        return (int)_tagPROTOCOLFILTERDATA.dwFilterFlags$VH.get(seg);
    }
    public static void dwFilterFlags$set( MemorySegment seg, int x) {
        _tagPROTOCOLFILTERDATA.dwFilterFlags$VH.set(seg, x);
    }
    public static int dwFilterFlags$get(MemorySegment seg, long index) {
        return (int)_tagPROTOCOLFILTERDATA.dwFilterFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFilterFlags$set(MemorySegment seg, long index, int x) {
        _tagPROTOCOLFILTERDATA.dwFilterFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


