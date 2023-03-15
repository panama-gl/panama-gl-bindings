// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class OPENCARDNAMEW {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwStructSize"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("hwndOwner"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("hSCardContext"),
        Constants$root.C_POINTER$LAYOUT.withName("lpstrGroupNames"),
        Constants$root.C_LONG$LAYOUT.withName("nMaxGroupNames"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("lpstrCardNames"),
        Constants$root.C_LONG$LAYOUT.withName("nMaxCardNames"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("rgguidInterfaces"),
        Constants$root.C_LONG$LAYOUT.withName("cguidInterfaces"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("lpstrRdr"),
        Constants$root.C_LONG$LAYOUT.withName("nMaxRdr"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("lpstrCard"),
        Constants$root.C_LONG$LAYOUT.withName("nMaxCard"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("lpstrTitle"),
        Constants$root.C_LONG$LAYOUT.withName("dwFlags"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pvUserData"),
        Constants$root.C_LONG$LAYOUT.withName("dwShareMode"),
        Constants$root.C_LONG$LAYOUT.withName("dwPreferredProtocols"),
        Constants$root.C_LONG$LAYOUT.withName("dwActiveProtocol"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("lpfnConnect"),
        Constants$root.C_POINTER$LAYOUT.withName("lpfnCheck"),
        Constants$root.C_POINTER$LAYOUT.withName("lpfnDisconnect"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("hCardHandle")
    );
    public static MemoryLayout $LAYOUT() {
        return OPENCARDNAMEW.$struct$LAYOUT;
    }
    static final VarHandle dwStructSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwStructSize"));
    public static VarHandle dwStructSize$VH() {
        return OPENCARDNAMEW.dwStructSize$VH;
    }
    public static int dwStructSize$get(MemorySegment seg) {
        return (int)OPENCARDNAMEW.dwStructSize$VH.get(seg);
    }
    public static void dwStructSize$set( MemorySegment seg, int x) {
        OPENCARDNAMEW.dwStructSize$VH.set(seg, x);
    }
    public static int dwStructSize$get(MemorySegment seg, long index) {
        return (int)OPENCARDNAMEW.dwStructSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwStructSize$set(MemorySegment seg, long index, int x) {
        OPENCARDNAMEW.dwStructSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hwndOwner$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hwndOwner"));
    public static VarHandle hwndOwner$VH() {
        return OPENCARDNAMEW.hwndOwner$VH;
    }
    public static MemoryAddress hwndOwner$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)OPENCARDNAMEW.hwndOwner$VH.get(seg);
    }
    public static void hwndOwner$set( MemorySegment seg, MemoryAddress x) {
        OPENCARDNAMEW.hwndOwner$VH.set(seg, x);
    }
    public static MemoryAddress hwndOwner$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)OPENCARDNAMEW.hwndOwner$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hwndOwner$set(MemorySegment seg, long index, MemoryAddress x) {
        OPENCARDNAMEW.hwndOwner$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hSCardContext$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hSCardContext"));
    public static VarHandle hSCardContext$VH() {
        return OPENCARDNAMEW.hSCardContext$VH;
    }
    public static long hSCardContext$get(MemorySegment seg) {
        return (long)OPENCARDNAMEW.hSCardContext$VH.get(seg);
    }
    public static void hSCardContext$set( MemorySegment seg, long x) {
        OPENCARDNAMEW.hSCardContext$VH.set(seg, x);
    }
    public static long hSCardContext$get(MemorySegment seg, long index) {
        return (long)OPENCARDNAMEW.hSCardContext$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hSCardContext$set(MemorySegment seg, long index, long x) {
        OPENCARDNAMEW.hSCardContext$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpstrGroupNames$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpstrGroupNames"));
    public static VarHandle lpstrGroupNames$VH() {
        return OPENCARDNAMEW.lpstrGroupNames$VH;
    }
    public static MemoryAddress lpstrGroupNames$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)OPENCARDNAMEW.lpstrGroupNames$VH.get(seg);
    }
    public static void lpstrGroupNames$set( MemorySegment seg, MemoryAddress x) {
        OPENCARDNAMEW.lpstrGroupNames$VH.set(seg, x);
    }
    public static MemoryAddress lpstrGroupNames$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)OPENCARDNAMEW.lpstrGroupNames$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpstrGroupNames$set(MemorySegment seg, long index, MemoryAddress x) {
        OPENCARDNAMEW.lpstrGroupNames$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nMaxGroupNames$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nMaxGroupNames"));
    public static VarHandle nMaxGroupNames$VH() {
        return OPENCARDNAMEW.nMaxGroupNames$VH;
    }
    public static int nMaxGroupNames$get(MemorySegment seg) {
        return (int)OPENCARDNAMEW.nMaxGroupNames$VH.get(seg);
    }
    public static void nMaxGroupNames$set( MemorySegment seg, int x) {
        OPENCARDNAMEW.nMaxGroupNames$VH.set(seg, x);
    }
    public static int nMaxGroupNames$get(MemorySegment seg, long index) {
        return (int)OPENCARDNAMEW.nMaxGroupNames$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nMaxGroupNames$set(MemorySegment seg, long index, int x) {
        OPENCARDNAMEW.nMaxGroupNames$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpstrCardNames$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpstrCardNames"));
    public static VarHandle lpstrCardNames$VH() {
        return OPENCARDNAMEW.lpstrCardNames$VH;
    }
    public static MemoryAddress lpstrCardNames$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)OPENCARDNAMEW.lpstrCardNames$VH.get(seg);
    }
    public static void lpstrCardNames$set( MemorySegment seg, MemoryAddress x) {
        OPENCARDNAMEW.lpstrCardNames$VH.set(seg, x);
    }
    public static MemoryAddress lpstrCardNames$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)OPENCARDNAMEW.lpstrCardNames$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpstrCardNames$set(MemorySegment seg, long index, MemoryAddress x) {
        OPENCARDNAMEW.lpstrCardNames$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nMaxCardNames$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nMaxCardNames"));
    public static VarHandle nMaxCardNames$VH() {
        return OPENCARDNAMEW.nMaxCardNames$VH;
    }
    public static int nMaxCardNames$get(MemorySegment seg) {
        return (int)OPENCARDNAMEW.nMaxCardNames$VH.get(seg);
    }
    public static void nMaxCardNames$set( MemorySegment seg, int x) {
        OPENCARDNAMEW.nMaxCardNames$VH.set(seg, x);
    }
    public static int nMaxCardNames$get(MemorySegment seg, long index) {
        return (int)OPENCARDNAMEW.nMaxCardNames$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nMaxCardNames$set(MemorySegment seg, long index, int x) {
        OPENCARDNAMEW.nMaxCardNames$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgguidInterfaces$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rgguidInterfaces"));
    public static VarHandle rgguidInterfaces$VH() {
        return OPENCARDNAMEW.rgguidInterfaces$VH;
    }
    public static MemoryAddress rgguidInterfaces$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)OPENCARDNAMEW.rgguidInterfaces$VH.get(seg);
    }
    public static void rgguidInterfaces$set( MemorySegment seg, MemoryAddress x) {
        OPENCARDNAMEW.rgguidInterfaces$VH.set(seg, x);
    }
    public static MemoryAddress rgguidInterfaces$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)OPENCARDNAMEW.rgguidInterfaces$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgguidInterfaces$set(MemorySegment seg, long index, MemoryAddress x) {
        OPENCARDNAMEW.rgguidInterfaces$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cguidInterfaces$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cguidInterfaces"));
    public static VarHandle cguidInterfaces$VH() {
        return OPENCARDNAMEW.cguidInterfaces$VH;
    }
    public static int cguidInterfaces$get(MemorySegment seg) {
        return (int)OPENCARDNAMEW.cguidInterfaces$VH.get(seg);
    }
    public static void cguidInterfaces$set( MemorySegment seg, int x) {
        OPENCARDNAMEW.cguidInterfaces$VH.set(seg, x);
    }
    public static int cguidInterfaces$get(MemorySegment seg, long index) {
        return (int)OPENCARDNAMEW.cguidInterfaces$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cguidInterfaces$set(MemorySegment seg, long index, int x) {
        OPENCARDNAMEW.cguidInterfaces$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpstrRdr$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpstrRdr"));
    public static VarHandle lpstrRdr$VH() {
        return OPENCARDNAMEW.lpstrRdr$VH;
    }
    public static MemoryAddress lpstrRdr$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)OPENCARDNAMEW.lpstrRdr$VH.get(seg);
    }
    public static void lpstrRdr$set( MemorySegment seg, MemoryAddress x) {
        OPENCARDNAMEW.lpstrRdr$VH.set(seg, x);
    }
    public static MemoryAddress lpstrRdr$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)OPENCARDNAMEW.lpstrRdr$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpstrRdr$set(MemorySegment seg, long index, MemoryAddress x) {
        OPENCARDNAMEW.lpstrRdr$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nMaxRdr$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nMaxRdr"));
    public static VarHandle nMaxRdr$VH() {
        return OPENCARDNAMEW.nMaxRdr$VH;
    }
    public static int nMaxRdr$get(MemorySegment seg) {
        return (int)OPENCARDNAMEW.nMaxRdr$VH.get(seg);
    }
    public static void nMaxRdr$set( MemorySegment seg, int x) {
        OPENCARDNAMEW.nMaxRdr$VH.set(seg, x);
    }
    public static int nMaxRdr$get(MemorySegment seg, long index) {
        return (int)OPENCARDNAMEW.nMaxRdr$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nMaxRdr$set(MemorySegment seg, long index, int x) {
        OPENCARDNAMEW.nMaxRdr$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpstrCard$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpstrCard"));
    public static VarHandle lpstrCard$VH() {
        return OPENCARDNAMEW.lpstrCard$VH;
    }
    public static MemoryAddress lpstrCard$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)OPENCARDNAMEW.lpstrCard$VH.get(seg);
    }
    public static void lpstrCard$set( MemorySegment seg, MemoryAddress x) {
        OPENCARDNAMEW.lpstrCard$VH.set(seg, x);
    }
    public static MemoryAddress lpstrCard$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)OPENCARDNAMEW.lpstrCard$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpstrCard$set(MemorySegment seg, long index, MemoryAddress x) {
        OPENCARDNAMEW.lpstrCard$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nMaxCard$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nMaxCard"));
    public static VarHandle nMaxCard$VH() {
        return OPENCARDNAMEW.nMaxCard$VH;
    }
    public static int nMaxCard$get(MemorySegment seg) {
        return (int)OPENCARDNAMEW.nMaxCard$VH.get(seg);
    }
    public static void nMaxCard$set( MemorySegment seg, int x) {
        OPENCARDNAMEW.nMaxCard$VH.set(seg, x);
    }
    public static int nMaxCard$get(MemorySegment seg, long index) {
        return (int)OPENCARDNAMEW.nMaxCard$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nMaxCard$set(MemorySegment seg, long index, int x) {
        OPENCARDNAMEW.nMaxCard$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpstrTitle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpstrTitle"));
    public static VarHandle lpstrTitle$VH() {
        return OPENCARDNAMEW.lpstrTitle$VH;
    }
    public static MemoryAddress lpstrTitle$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)OPENCARDNAMEW.lpstrTitle$VH.get(seg);
    }
    public static void lpstrTitle$set( MemorySegment seg, MemoryAddress x) {
        OPENCARDNAMEW.lpstrTitle$VH.set(seg, x);
    }
    public static MemoryAddress lpstrTitle$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)OPENCARDNAMEW.lpstrTitle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpstrTitle$set(MemorySegment seg, long index, MemoryAddress x) {
        OPENCARDNAMEW.lpstrTitle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return OPENCARDNAMEW.dwFlags$VH;
    }
    public static int dwFlags$get(MemorySegment seg) {
        return (int)OPENCARDNAMEW.dwFlags$VH.get(seg);
    }
    public static void dwFlags$set( MemorySegment seg, int x) {
        OPENCARDNAMEW.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)OPENCARDNAMEW.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        OPENCARDNAMEW.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pvUserData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pvUserData"));
    public static VarHandle pvUserData$VH() {
        return OPENCARDNAMEW.pvUserData$VH;
    }
    public static MemoryAddress pvUserData$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)OPENCARDNAMEW.pvUserData$VH.get(seg);
    }
    public static void pvUserData$set( MemorySegment seg, MemoryAddress x) {
        OPENCARDNAMEW.pvUserData$VH.set(seg, x);
    }
    public static MemoryAddress pvUserData$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)OPENCARDNAMEW.pvUserData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pvUserData$set(MemorySegment seg, long index, MemoryAddress x) {
        OPENCARDNAMEW.pvUserData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwShareMode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwShareMode"));
    public static VarHandle dwShareMode$VH() {
        return OPENCARDNAMEW.dwShareMode$VH;
    }
    public static int dwShareMode$get(MemorySegment seg) {
        return (int)OPENCARDNAMEW.dwShareMode$VH.get(seg);
    }
    public static void dwShareMode$set( MemorySegment seg, int x) {
        OPENCARDNAMEW.dwShareMode$VH.set(seg, x);
    }
    public static int dwShareMode$get(MemorySegment seg, long index) {
        return (int)OPENCARDNAMEW.dwShareMode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwShareMode$set(MemorySegment seg, long index, int x) {
        OPENCARDNAMEW.dwShareMode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwPreferredProtocols$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwPreferredProtocols"));
    public static VarHandle dwPreferredProtocols$VH() {
        return OPENCARDNAMEW.dwPreferredProtocols$VH;
    }
    public static int dwPreferredProtocols$get(MemorySegment seg) {
        return (int)OPENCARDNAMEW.dwPreferredProtocols$VH.get(seg);
    }
    public static void dwPreferredProtocols$set( MemorySegment seg, int x) {
        OPENCARDNAMEW.dwPreferredProtocols$VH.set(seg, x);
    }
    public static int dwPreferredProtocols$get(MemorySegment seg, long index) {
        return (int)OPENCARDNAMEW.dwPreferredProtocols$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwPreferredProtocols$set(MemorySegment seg, long index, int x) {
        OPENCARDNAMEW.dwPreferredProtocols$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwActiveProtocol$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwActiveProtocol"));
    public static VarHandle dwActiveProtocol$VH() {
        return OPENCARDNAMEW.dwActiveProtocol$VH;
    }
    public static int dwActiveProtocol$get(MemorySegment seg) {
        return (int)OPENCARDNAMEW.dwActiveProtocol$VH.get(seg);
    }
    public static void dwActiveProtocol$set( MemorySegment seg, int x) {
        OPENCARDNAMEW.dwActiveProtocol$VH.set(seg, x);
    }
    public static int dwActiveProtocol$get(MemorySegment seg, long index) {
        return (int)OPENCARDNAMEW.dwActiveProtocol$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwActiveProtocol$set(MemorySegment seg, long index, int x) {
        OPENCARDNAMEW.dwActiveProtocol$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpfnConnect$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpfnConnect"));
    public static VarHandle lpfnConnect$VH() {
        return OPENCARDNAMEW.lpfnConnect$VH;
    }
    public static MemoryAddress lpfnConnect$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)OPENCARDNAMEW.lpfnConnect$VH.get(seg);
    }
    public static void lpfnConnect$set( MemorySegment seg, MemoryAddress x) {
        OPENCARDNAMEW.lpfnConnect$VH.set(seg, x);
    }
    public static MemoryAddress lpfnConnect$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)OPENCARDNAMEW.lpfnConnect$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpfnConnect$set(MemorySegment seg, long index, MemoryAddress x) {
        OPENCARDNAMEW.lpfnConnect$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static LPOCNCONNPROCW lpfnConnect (MemorySegment segment, MemorySession session) {
        return LPOCNCONNPROCW.ofAddress(lpfnConnect$get(segment), session);
    }
    static final VarHandle lpfnCheck$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpfnCheck"));
    public static VarHandle lpfnCheck$VH() {
        return OPENCARDNAMEW.lpfnCheck$VH;
    }
    public static MemoryAddress lpfnCheck$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)OPENCARDNAMEW.lpfnCheck$VH.get(seg);
    }
    public static void lpfnCheck$set( MemorySegment seg, MemoryAddress x) {
        OPENCARDNAMEW.lpfnCheck$VH.set(seg, x);
    }
    public static MemoryAddress lpfnCheck$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)OPENCARDNAMEW.lpfnCheck$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpfnCheck$set(MemorySegment seg, long index, MemoryAddress x) {
        OPENCARDNAMEW.lpfnCheck$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static LPOCNCHKPROC lpfnCheck (MemorySegment segment, MemorySession session) {
        return LPOCNCHKPROC.ofAddress(lpfnCheck$get(segment), session);
    }
    static final VarHandle lpfnDisconnect$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpfnDisconnect"));
    public static VarHandle lpfnDisconnect$VH() {
        return OPENCARDNAMEW.lpfnDisconnect$VH;
    }
    public static MemoryAddress lpfnDisconnect$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)OPENCARDNAMEW.lpfnDisconnect$VH.get(seg);
    }
    public static void lpfnDisconnect$set( MemorySegment seg, MemoryAddress x) {
        OPENCARDNAMEW.lpfnDisconnect$VH.set(seg, x);
    }
    public static MemoryAddress lpfnDisconnect$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)OPENCARDNAMEW.lpfnDisconnect$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpfnDisconnect$set(MemorySegment seg, long index, MemoryAddress x) {
        OPENCARDNAMEW.lpfnDisconnect$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static LPOCNDSCPROC lpfnDisconnect (MemorySegment segment, MemorySession session) {
        return LPOCNDSCPROC.ofAddress(lpfnDisconnect$get(segment), session);
    }
    static final VarHandle hCardHandle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hCardHandle"));
    public static VarHandle hCardHandle$VH() {
        return OPENCARDNAMEW.hCardHandle$VH;
    }
    public static long hCardHandle$get(MemorySegment seg) {
        return (long)OPENCARDNAMEW.hCardHandle$VH.get(seg);
    }
    public static void hCardHandle$set( MemorySegment seg, long x) {
        OPENCARDNAMEW.hCardHandle$VH.set(seg, x);
    }
    public static long hCardHandle$get(MemorySegment seg, long index) {
        return (long)OPENCARDNAMEW.hCardHandle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hCardHandle$set(MemorySegment seg, long index, long x) {
        OPENCARDNAMEW.hCardHandle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


