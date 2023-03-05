// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _numberfmtW {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("NumDigits"),
        Constants$root.C_LONG$LAYOUT.withName("LeadingZero"),
        Constants$root.C_LONG$LAYOUT.withName("Grouping"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("lpDecimalSep"),
        Constants$root.C_POINTER$LAYOUT.withName("lpThousandSep"),
        Constants$root.C_LONG$LAYOUT.withName("NegativeOrder"),
        MemoryLayout.paddingLayout(32)
    ).withName("_numberfmtW");
    public static MemoryLayout $LAYOUT() {
        return _numberfmtW.$struct$LAYOUT;
    }
    static final VarHandle NumDigits$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumDigits"));
    public static VarHandle NumDigits$VH() {
        return _numberfmtW.NumDigits$VH;
    }
    public static int NumDigits$get(MemorySegment seg) {
        return (int)_numberfmtW.NumDigits$VH.get(seg);
    }
    public static void NumDigits$set( MemorySegment seg, int x) {
        _numberfmtW.NumDigits$VH.set(seg, x);
    }
    public static int NumDigits$get(MemorySegment seg, long index) {
        return (int)_numberfmtW.NumDigits$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumDigits$set(MemorySegment seg, long index, int x) {
        _numberfmtW.NumDigits$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle LeadingZero$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LeadingZero"));
    public static VarHandle LeadingZero$VH() {
        return _numberfmtW.LeadingZero$VH;
    }
    public static int LeadingZero$get(MemorySegment seg) {
        return (int)_numberfmtW.LeadingZero$VH.get(seg);
    }
    public static void LeadingZero$set( MemorySegment seg, int x) {
        _numberfmtW.LeadingZero$VH.set(seg, x);
    }
    public static int LeadingZero$get(MemorySegment seg, long index) {
        return (int)_numberfmtW.LeadingZero$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LeadingZero$set(MemorySegment seg, long index, int x) {
        _numberfmtW.LeadingZero$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Grouping$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Grouping"));
    public static VarHandle Grouping$VH() {
        return _numberfmtW.Grouping$VH;
    }
    public static int Grouping$get(MemorySegment seg) {
        return (int)_numberfmtW.Grouping$VH.get(seg);
    }
    public static void Grouping$set( MemorySegment seg, int x) {
        _numberfmtW.Grouping$VH.set(seg, x);
    }
    public static int Grouping$get(MemorySegment seg, long index) {
        return (int)_numberfmtW.Grouping$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Grouping$set(MemorySegment seg, long index, int x) {
        _numberfmtW.Grouping$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpDecimalSep$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpDecimalSep"));
    public static VarHandle lpDecimalSep$VH() {
        return _numberfmtW.lpDecimalSep$VH;
    }
    public static MemoryAddress lpDecimalSep$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_numberfmtW.lpDecimalSep$VH.get(seg);
    }
    public static void lpDecimalSep$set( MemorySegment seg, MemoryAddress x) {
        _numberfmtW.lpDecimalSep$VH.set(seg, x);
    }
    public static MemoryAddress lpDecimalSep$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_numberfmtW.lpDecimalSep$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpDecimalSep$set(MemorySegment seg, long index, MemoryAddress x) {
        _numberfmtW.lpDecimalSep$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpThousandSep$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpThousandSep"));
    public static VarHandle lpThousandSep$VH() {
        return _numberfmtW.lpThousandSep$VH;
    }
    public static MemoryAddress lpThousandSep$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_numberfmtW.lpThousandSep$VH.get(seg);
    }
    public static void lpThousandSep$set( MemorySegment seg, MemoryAddress x) {
        _numberfmtW.lpThousandSep$VH.set(seg, x);
    }
    public static MemoryAddress lpThousandSep$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_numberfmtW.lpThousandSep$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpThousandSep$set(MemorySegment seg, long index, MemoryAddress x) {
        _numberfmtW.lpThousandSep$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NegativeOrder$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NegativeOrder"));
    public static VarHandle NegativeOrder$VH() {
        return _numberfmtW.NegativeOrder$VH;
    }
    public static int NegativeOrder$get(MemorySegment seg) {
        return (int)_numberfmtW.NegativeOrder$VH.get(seg);
    }
    public static void NegativeOrder$set( MemorySegment seg, int x) {
        _numberfmtW.NegativeOrder$VH.set(seg, x);
    }
    public static int NegativeOrder$get(MemorySegment seg, long index) {
        return (int)_numberfmtW.NegativeOrder$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NegativeOrder$set(MemorySegment seg, long index, int x) {
        _numberfmtW.NegativeOrder$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


