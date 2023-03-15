// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _COAUTHIDENTITY {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("User"),
        Constants$root.C_LONG$LAYOUT.withName("UserLength"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("Domain"),
        Constants$root.C_LONG$LAYOUT.withName("DomainLength"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("Password"),
        Constants$root.C_LONG$LAYOUT.withName("PasswordLength"),
        Constants$root.C_LONG$LAYOUT.withName("Flags")
    ).withName("_COAUTHIDENTITY");
    public static MemoryLayout $LAYOUT() {
        return _COAUTHIDENTITY.$struct$LAYOUT;
    }
    static final VarHandle User$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("User"));
    public static VarHandle User$VH() {
        return _COAUTHIDENTITY.User$VH;
    }
    public static MemoryAddress User$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_COAUTHIDENTITY.User$VH.get(seg);
    }
    public static void User$set( MemorySegment seg, MemoryAddress x) {
        _COAUTHIDENTITY.User$VH.set(seg, x);
    }
    public static MemoryAddress User$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_COAUTHIDENTITY.User$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void User$set(MemorySegment seg, long index, MemoryAddress x) {
        _COAUTHIDENTITY.User$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle UserLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("UserLength"));
    public static VarHandle UserLength$VH() {
        return _COAUTHIDENTITY.UserLength$VH;
    }
    public static int UserLength$get(MemorySegment seg) {
        return (int)_COAUTHIDENTITY.UserLength$VH.get(seg);
    }
    public static void UserLength$set( MemorySegment seg, int x) {
        _COAUTHIDENTITY.UserLength$VH.set(seg, x);
    }
    public static int UserLength$get(MemorySegment seg, long index) {
        return (int)_COAUTHIDENTITY.UserLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void UserLength$set(MemorySegment seg, long index, int x) {
        _COAUTHIDENTITY.UserLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Domain$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Domain"));
    public static VarHandle Domain$VH() {
        return _COAUTHIDENTITY.Domain$VH;
    }
    public static MemoryAddress Domain$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_COAUTHIDENTITY.Domain$VH.get(seg);
    }
    public static void Domain$set( MemorySegment seg, MemoryAddress x) {
        _COAUTHIDENTITY.Domain$VH.set(seg, x);
    }
    public static MemoryAddress Domain$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_COAUTHIDENTITY.Domain$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Domain$set(MemorySegment seg, long index, MemoryAddress x) {
        _COAUTHIDENTITY.Domain$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DomainLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DomainLength"));
    public static VarHandle DomainLength$VH() {
        return _COAUTHIDENTITY.DomainLength$VH;
    }
    public static int DomainLength$get(MemorySegment seg) {
        return (int)_COAUTHIDENTITY.DomainLength$VH.get(seg);
    }
    public static void DomainLength$set( MemorySegment seg, int x) {
        _COAUTHIDENTITY.DomainLength$VH.set(seg, x);
    }
    public static int DomainLength$get(MemorySegment seg, long index) {
        return (int)_COAUTHIDENTITY.DomainLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DomainLength$set(MemorySegment seg, long index, int x) {
        _COAUTHIDENTITY.DomainLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Password$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Password"));
    public static VarHandle Password$VH() {
        return _COAUTHIDENTITY.Password$VH;
    }
    public static MemoryAddress Password$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_COAUTHIDENTITY.Password$VH.get(seg);
    }
    public static void Password$set( MemorySegment seg, MemoryAddress x) {
        _COAUTHIDENTITY.Password$VH.set(seg, x);
    }
    public static MemoryAddress Password$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_COAUTHIDENTITY.Password$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Password$set(MemorySegment seg, long index, MemoryAddress x) {
        _COAUTHIDENTITY.Password$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle PasswordLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PasswordLength"));
    public static VarHandle PasswordLength$VH() {
        return _COAUTHIDENTITY.PasswordLength$VH;
    }
    public static int PasswordLength$get(MemorySegment seg) {
        return (int)_COAUTHIDENTITY.PasswordLength$VH.get(seg);
    }
    public static void PasswordLength$set( MemorySegment seg, int x) {
        _COAUTHIDENTITY.PasswordLength$VH.set(seg, x);
    }
    public static int PasswordLength$get(MemorySegment seg, long index) {
        return (int)_COAUTHIDENTITY.PasswordLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PasswordLength$set(MemorySegment seg, long index, int x) {
        _COAUTHIDENTITY.PasswordLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _COAUTHIDENTITY.Flags$VH;
    }
    public static int Flags$get(MemorySegment seg) {
        return (int)_COAUTHIDENTITY.Flags$VH.get(seg);
    }
    public static void Flags$set( MemorySegment seg, int x) {
        _COAUTHIDENTITY.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)_COAUTHIDENTITY.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        _COAUTHIDENTITY.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


