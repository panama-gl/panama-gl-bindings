// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagRAWKEYBOARD {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("MakeCode"),
        Constants$root.C_SHORT$LAYOUT.withName("Flags"),
        Constants$root.C_SHORT$LAYOUT.withName("Reserved"),
        Constants$root.C_SHORT$LAYOUT.withName("VKey"),
        Constants$root.C_LONG$LAYOUT.withName("Message"),
        Constants$root.C_LONG$LAYOUT.withName("ExtraInformation")
    ).withName("tagRAWKEYBOARD");
    public static MemoryLayout $LAYOUT() {
        return tagRAWKEYBOARD.$struct$LAYOUT;
    }
    static final VarHandle MakeCode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MakeCode"));
    public static VarHandle MakeCode$VH() {
        return tagRAWKEYBOARD.MakeCode$VH;
    }
    public static short MakeCode$get(MemorySegment seg) {
        return (short)tagRAWKEYBOARD.MakeCode$VH.get(seg);
    }
    public static void MakeCode$set( MemorySegment seg, short x) {
        tagRAWKEYBOARD.MakeCode$VH.set(seg, x);
    }
    public static short MakeCode$get(MemorySegment seg, long index) {
        return (short)tagRAWKEYBOARD.MakeCode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MakeCode$set(MemorySegment seg, long index, short x) {
        tagRAWKEYBOARD.MakeCode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return tagRAWKEYBOARD.Flags$VH;
    }
    public static short Flags$get(MemorySegment seg) {
        return (short)tagRAWKEYBOARD.Flags$VH.get(seg);
    }
    public static void Flags$set( MemorySegment seg, short x) {
        tagRAWKEYBOARD.Flags$VH.set(seg, x);
    }
    public static short Flags$get(MemorySegment seg, long index) {
        return (short)tagRAWKEYBOARD.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, short x) {
        tagRAWKEYBOARD.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Reserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reserved"));
    public static VarHandle Reserved$VH() {
        return tagRAWKEYBOARD.Reserved$VH;
    }
    public static short Reserved$get(MemorySegment seg) {
        return (short)tagRAWKEYBOARD.Reserved$VH.get(seg);
    }
    public static void Reserved$set( MemorySegment seg, short x) {
        tagRAWKEYBOARD.Reserved$VH.set(seg, x);
    }
    public static short Reserved$get(MemorySegment seg, long index) {
        return (short)tagRAWKEYBOARD.Reserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved$set(MemorySegment seg, long index, short x) {
        tagRAWKEYBOARD.Reserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle VKey$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("VKey"));
    public static VarHandle VKey$VH() {
        return tagRAWKEYBOARD.VKey$VH;
    }
    public static short VKey$get(MemorySegment seg) {
        return (short)tagRAWKEYBOARD.VKey$VH.get(seg);
    }
    public static void VKey$set( MemorySegment seg, short x) {
        tagRAWKEYBOARD.VKey$VH.set(seg, x);
    }
    public static short VKey$get(MemorySegment seg, long index) {
        return (short)tagRAWKEYBOARD.VKey$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void VKey$set(MemorySegment seg, long index, short x) {
        tagRAWKEYBOARD.VKey$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Message$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Message"));
    public static VarHandle Message$VH() {
        return tagRAWKEYBOARD.Message$VH;
    }
    public static int Message$get(MemorySegment seg) {
        return (int)tagRAWKEYBOARD.Message$VH.get(seg);
    }
    public static void Message$set( MemorySegment seg, int x) {
        tagRAWKEYBOARD.Message$VH.set(seg, x);
    }
    public static int Message$get(MemorySegment seg, long index) {
        return (int)tagRAWKEYBOARD.Message$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Message$set(MemorySegment seg, long index, int x) {
        tagRAWKEYBOARD.Message$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ExtraInformation$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ExtraInformation"));
    public static VarHandle ExtraInformation$VH() {
        return tagRAWKEYBOARD.ExtraInformation$VH;
    }
    public static int ExtraInformation$get(MemorySegment seg) {
        return (int)tagRAWKEYBOARD.ExtraInformation$VH.get(seg);
    }
    public static void ExtraInformation$set( MemorySegment seg, int x) {
        tagRAWKEYBOARD.ExtraInformation$VH.set(seg, x);
    }
    public static int ExtraInformation$get(MemorySegment seg, long index) {
        return (int)tagRAWKEYBOARD.ExtraInformation$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ExtraInformation$set(MemorySegment seg, long index, int x) {
        tagRAWKEYBOARD.ExtraInformation$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


