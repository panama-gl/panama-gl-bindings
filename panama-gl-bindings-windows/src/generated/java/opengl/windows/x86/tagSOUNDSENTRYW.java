// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagSOUNDSENTRYW {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        Constants$root.C_LONG$LAYOUT.withName("dwFlags"),
        Constants$root.C_LONG$LAYOUT.withName("iFSTextEffect"),
        Constants$root.C_LONG$LAYOUT.withName("iFSTextEffectMSec"),
        Constants$root.C_LONG$LAYOUT.withName("iFSTextEffectColorBits"),
        Constants$root.C_LONG$LAYOUT.withName("iFSGrafEffect"),
        Constants$root.C_LONG$LAYOUT.withName("iFSGrafEffectMSec"),
        Constants$root.C_LONG$LAYOUT.withName("iFSGrafEffectColor"),
        Constants$root.C_LONG$LAYOUT.withName("iWindowsEffect"),
        Constants$root.C_LONG$LAYOUT.withName("iWindowsEffectMSec"),
        Constants$root.C_POINTER$LAYOUT.withName("lpszWindowsEffectDLL"),
        Constants$root.C_LONG$LAYOUT.withName("iWindowsEffectOrdinal"),
        MemoryLayout.paddingLayout(32)
    ).withName("tagSOUNDSENTRYW");
    public static MemoryLayout $LAYOUT() {
        return tagSOUNDSENTRYW.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return tagSOUNDSENTRYW.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)tagSOUNDSENTRYW.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        tagSOUNDSENTRYW.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)tagSOUNDSENTRYW.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        tagSOUNDSENTRYW.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return tagSOUNDSENTRYW.dwFlags$VH;
    }
    public static int dwFlags$get(MemorySegment seg) {
        return (int)tagSOUNDSENTRYW.dwFlags$VH.get(seg);
    }
    public static void dwFlags$set( MemorySegment seg, int x) {
        tagSOUNDSENTRYW.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)tagSOUNDSENTRYW.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        tagSOUNDSENTRYW.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iFSTextEffect$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iFSTextEffect"));
    public static VarHandle iFSTextEffect$VH() {
        return tagSOUNDSENTRYW.iFSTextEffect$VH;
    }
    public static int iFSTextEffect$get(MemorySegment seg) {
        return (int)tagSOUNDSENTRYW.iFSTextEffect$VH.get(seg);
    }
    public static void iFSTextEffect$set( MemorySegment seg, int x) {
        tagSOUNDSENTRYW.iFSTextEffect$VH.set(seg, x);
    }
    public static int iFSTextEffect$get(MemorySegment seg, long index) {
        return (int)tagSOUNDSENTRYW.iFSTextEffect$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iFSTextEffect$set(MemorySegment seg, long index, int x) {
        tagSOUNDSENTRYW.iFSTextEffect$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iFSTextEffectMSec$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iFSTextEffectMSec"));
    public static VarHandle iFSTextEffectMSec$VH() {
        return tagSOUNDSENTRYW.iFSTextEffectMSec$VH;
    }
    public static int iFSTextEffectMSec$get(MemorySegment seg) {
        return (int)tagSOUNDSENTRYW.iFSTextEffectMSec$VH.get(seg);
    }
    public static void iFSTextEffectMSec$set( MemorySegment seg, int x) {
        tagSOUNDSENTRYW.iFSTextEffectMSec$VH.set(seg, x);
    }
    public static int iFSTextEffectMSec$get(MemorySegment seg, long index) {
        return (int)tagSOUNDSENTRYW.iFSTextEffectMSec$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iFSTextEffectMSec$set(MemorySegment seg, long index, int x) {
        tagSOUNDSENTRYW.iFSTextEffectMSec$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iFSTextEffectColorBits$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iFSTextEffectColorBits"));
    public static VarHandle iFSTextEffectColorBits$VH() {
        return tagSOUNDSENTRYW.iFSTextEffectColorBits$VH;
    }
    public static int iFSTextEffectColorBits$get(MemorySegment seg) {
        return (int)tagSOUNDSENTRYW.iFSTextEffectColorBits$VH.get(seg);
    }
    public static void iFSTextEffectColorBits$set( MemorySegment seg, int x) {
        tagSOUNDSENTRYW.iFSTextEffectColorBits$VH.set(seg, x);
    }
    public static int iFSTextEffectColorBits$get(MemorySegment seg, long index) {
        return (int)tagSOUNDSENTRYW.iFSTextEffectColorBits$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iFSTextEffectColorBits$set(MemorySegment seg, long index, int x) {
        tagSOUNDSENTRYW.iFSTextEffectColorBits$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iFSGrafEffect$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iFSGrafEffect"));
    public static VarHandle iFSGrafEffect$VH() {
        return tagSOUNDSENTRYW.iFSGrafEffect$VH;
    }
    public static int iFSGrafEffect$get(MemorySegment seg) {
        return (int)tagSOUNDSENTRYW.iFSGrafEffect$VH.get(seg);
    }
    public static void iFSGrafEffect$set( MemorySegment seg, int x) {
        tagSOUNDSENTRYW.iFSGrafEffect$VH.set(seg, x);
    }
    public static int iFSGrafEffect$get(MemorySegment seg, long index) {
        return (int)tagSOUNDSENTRYW.iFSGrafEffect$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iFSGrafEffect$set(MemorySegment seg, long index, int x) {
        tagSOUNDSENTRYW.iFSGrafEffect$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iFSGrafEffectMSec$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iFSGrafEffectMSec"));
    public static VarHandle iFSGrafEffectMSec$VH() {
        return tagSOUNDSENTRYW.iFSGrafEffectMSec$VH;
    }
    public static int iFSGrafEffectMSec$get(MemorySegment seg) {
        return (int)tagSOUNDSENTRYW.iFSGrafEffectMSec$VH.get(seg);
    }
    public static void iFSGrafEffectMSec$set( MemorySegment seg, int x) {
        tagSOUNDSENTRYW.iFSGrafEffectMSec$VH.set(seg, x);
    }
    public static int iFSGrafEffectMSec$get(MemorySegment seg, long index) {
        return (int)tagSOUNDSENTRYW.iFSGrafEffectMSec$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iFSGrafEffectMSec$set(MemorySegment seg, long index, int x) {
        tagSOUNDSENTRYW.iFSGrafEffectMSec$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iFSGrafEffectColor$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iFSGrafEffectColor"));
    public static VarHandle iFSGrafEffectColor$VH() {
        return tagSOUNDSENTRYW.iFSGrafEffectColor$VH;
    }
    public static int iFSGrafEffectColor$get(MemorySegment seg) {
        return (int)tagSOUNDSENTRYW.iFSGrafEffectColor$VH.get(seg);
    }
    public static void iFSGrafEffectColor$set( MemorySegment seg, int x) {
        tagSOUNDSENTRYW.iFSGrafEffectColor$VH.set(seg, x);
    }
    public static int iFSGrafEffectColor$get(MemorySegment seg, long index) {
        return (int)tagSOUNDSENTRYW.iFSGrafEffectColor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iFSGrafEffectColor$set(MemorySegment seg, long index, int x) {
        tagSOUNDSENTRYW.iFSGrafEffectColor$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iWindowsEffect$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iWindowsEffect"));
    public static VarHandle iWindowsEffect$VH() {
        return tagSOUNDSENTRYW.iWindowsEffect$VH;
    }
    public static int iWindowsEffect$get(MemorySegment seg) {
        return (int)tagSOUNDSENTRYW.iWindowsEffect$VH.get(seg);
    }
    public static void iWindowsEffect$set( MemorySegment seg, int x) {
        tagSOUNDSENTRYW.iWindowsEffect$VH.set(seg, x);
    }
    public static int iWindowsEffect$get(MemorySegment seg, long index) {
        return (int)tagSOUNDSENTRYW.iWindowsEffect$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iWindowsEffect$set(MemorySegment seg, long index, int x) {
        tagSOUNDSENTRYW.iWindowsEffect$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iWindowsEffectMSec$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iWindowsEffectMSec"));
    public static VarHandle iWindowsEffectMSec$VH() {
        return tagSOUNDSENTRYW.iWindowsEffectMSec$VH;
    }
    public static int iWindowsEffectMSec$get(MemorySegment seg) {
        return (int)tagSOUNDSENTRYW.iWindowsEffectMSec$VH.get(seg);
    }
    public static void iWindowsEffectMSec$set( MemorySegment seg, int x) {
        tagSOUNDSENTRYW.iWindowsEffectMSec$VH.set(seg, x);
    }
    public static int iWindowsEffectMSec$get(MemorySegment seg, long index) {
        return (int)tagSOUNDSENTRYW.iWindowsEffectMSec$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iWindowsEffectMSec$set(MemorySegment seg, long index, int x) {
        tagSOUNDSENTRYW.iWindowsEffectMSec$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpszWindowsEffectDLL$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpszWindowsEffectDLL"));
    public static VarHandle lpszWindowsEffectDLL$VH() {
        return tagSOUNDSENTRYW.lpszWindowsEffectDLL$VH;
    }
    public static MemoryAddress lpszWindowsEffectDLL$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagSOUNDSENTRYW.lpszWindowsEffectDLL$VH.get(seg);
    }
    public static void lpszWindowsEffectDLL$set( MemorySegment seg, MemoryAddress x) {
        tagSOUNDSENTRYW.lpszWindowsEffectDLL$VH.set(seg, x);
    }
    public static MemoryAddress lpszWindowsEffectDLL$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagSOUNDSENTRYW.lpszWindowsEffectDLL$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpszWindowsEffectDLL$set(MemorySegment seg, long index, MemoryAddress x) {
        tagSOUNDSENTRYW.lpszWindowsEffectDLL$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iWindowsEffectOrdinal$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iWindowsEffectOrdinal"));
    public static VarHandle iWindowsEffectOrdinal$VH() {
        return tagSOUNDSENTRYW.iWindowsEffectOrdinal$VH;
    }
    public static int iWindowsEffectOrdinal$get(MemorySegment seg) {
        return (int)tagSOUNDSENTRYW.iWindowsEffectOrdinal$VH.get(seg);
    }
    public static void iWindowsEffectOrdinal$set( MemorySegment seg, int x) {
        tagSOUNDSENTRYW.iWindowsEffectOrdinal$VH.set(seg, x);
    }
    public static int iWindowsEffectOrdinal$get(MemorySegment seg, long index) {
        return (int)tagSOUNDSENTRYW.iWindowsEffectOrdinal$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iWindowsEffectOrdinal$set(MemorySegment seg, long index, int x) {
        tagSOUNDSENTRYW.iWindowsEffectOrdinal$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


