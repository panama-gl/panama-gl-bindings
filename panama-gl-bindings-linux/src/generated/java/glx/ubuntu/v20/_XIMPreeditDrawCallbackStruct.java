// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _XIMPreeditDrawCallbackStruct {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("caret"),
        Constants$root.C_INT$LAYOUT.withName("chg_first"),
        Constants$root.C_INT$LAYOUT.withName("chg_length"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("text")
    ).withName("_XIMPreeditDrawCallbackStruct");
    public static MemoryLayout $LAYOUT() {
        return _XIMPreeditDrawCallbackStruct.$struct$LAYOUT;
    }
    static final VarHandle caret$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("caret"));
    public static VarHandle caret$VH() {
        return _XIMPreeditDrawCallbackStruct.caret$VH;
    }
    public static int caret$get(MemorySegment seg) {
        return (int)_XIMPreeditDrawCallbackStruct.caret$VH.get(seg);
    }
    public static void caret$set( MemorySegment seg, int x) {
        _XIMPreeditDrawCallbackStruct.caret$VH.set(seg, x);
    }
    public static int caret$get(MemorySegment seg, long index) {
        return (int)_XIMPreeditDrawCallbackStruct.caret$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void caret$set(MemorySegment seg, long index, int x) {
        _XIMPreeditDrawCallbackStruct.caret$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle chg_first$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("chg_first"));
    public static VarHandle chg_first$VH() {
        return _XIMPreeditDrawCallbackStruct.chg_first$VH;
    }
    public static int chg_first$get(MemorySegment seg) {
        return (int)_XIMPreeditDrawCallbackStruct.chg_first$VH.get(seg);
    }
    public static void chg_first$set( MemorySegment seg, int x) {
        _XIMPreeditDrawCallbackStruct.chg_first$VH.set(seg, x);
    }
    public static int chg_first$get(MemorySegment seg, long index) {
        return (int)_XIMPreeditDrawCallbackStruct.chg_first$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void chg_first$set(MemorySegment seg, long index, int x) {
        _XIMPreeditDrawCallbackStruct.chg_first$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle chg_length$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("chg_length"));
    public static VarHandle chg_length$VH() {
        return _XIMPreeditDrawCallbackStruct.chg_length$VH;
    }
    public static int chg_length$get(MemorySegment seg) {
        return (int)_XIMPreeditDrawCallbackStruct.chg_length$VH.get(seg);
    }
    public static void chg_length$set( MemorySegment seg, int x) {
        _XIMPreeditDrawCallbackStruct.chg_length$VH.set(seg, x);
    }
    public static int chg_length$get(MemorySegment seg, long index) {
        return (int)_XIMPreeditDrawCallbackStruct.chg_length$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void chg_length$set(MemorySegment seg, long index, int x) {
        _XIMPreeditDrawCallbackStruct.chg_length$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle text$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("text"));
    public static VarHandle text$VH() {
        return _XIMPreeditDrawCallbackStruct.text$VH;
    }
    public static MemoryAddress text$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_XIMPreeditDrawCallbackStruct.text$VH.get(seg);
    }
    public static void text$set( MemorySegment seg, MemoryAddress x) {
        _XIMPreeditDrawCallbackStruct.text$VH.set(seg, x);
    }
    public static MemoryAddress text$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_XIMPreeditDrawCallbackStruct.text$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void text$set(MemorySegment seg, long index, MemoryAddress x) {
        _XIMPreeditDrawCallbackStruct.text$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


