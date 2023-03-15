// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _VIRTUALIZATION_INSTANCE_INFO_INPUT_EX {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("HeaderSize"),
        MemoryLayout.paddingLayout(16),
        Constants$root.C_LONG$LAYOUT.withName("Flags"),
        Constants$root.C_LONG$LAYOUT.withName("NotificationInfoSize"),
        Constants$root.C_SHORT$LAYOUT.withName("NotificationInfoOffset"),
        Constants$root.C_SHORT$LAYOUT.withName("ProviderMajorVersion")
    ).withName("_VIRTUALIZATION_INSTANCE_INFO_INPUT_EX");
    public static MemoryLayout $LAYOUT() {
        return _VIRTUALIZATION_INSTANCE_INFO_INPUT_EX.$struct$LAYOUT;
    }
    static final VarHandle HeaderSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("HeaderSize"));
    public static VarHandle HeaderSize$VH() {
        return _VIRTUALIZATION_INSTANCE_INFO_INPUT_EX.HeaderSize$VH;
    }
    public static short HeaderSize$get(MemorySegment seg) {
        return (short)_VIRTUALIZATION_INSTANCE_INFO_INPUT_EX.HeaderSize$VH.get(seg);
    }
    public static void HeaderSize$set( MemorySegment seg, short x) {
        _VIRTUALIZATION_INSTANCE_INFO_INPUT_EX.HeaderSize$VH.set(seg, x);
    }
    public static short HeaderSize$get(MemorySegment seg, long index) {
        return (short)_VIRTUALIZATION_INSTANCE_INFO_INPUT_EX.HeaderSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void HeaderSize$set(MemorySegment seg, long index, short x) {
        _VIRTUALIZATION_INSTANCE_INFO_INPUT_EX.HeaderSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _VIRTUALIZATION_INSTANCE_INFO_INPUT_EX.Flags$VH;
    }
    public static int Flags$get(MemorySegment seg) {
        return (int)_VIRTUALIZATION_INSTANCE_INFO_INPUT_EX.Flags$VH.get(seg);
    }
    public static void Flags$set( MemorySegment seg, int x) {
        _VIRTUALIZATION_INSTANCE_INFO_INPUT_EX.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)_VIRTUALIZATION_INSTANCE_INFO_INPUT_EX.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        _VIRTUALIZATION_INSTANCE_INFO_INPUT_EX.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NotificationInfoSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NotificationInfoSize"));
    public static VarHandle NotificationInfoSize$VH() {
        return _VIRTUALIZATION_INSTANCE_INFO_INPUT_EX.NotificationInfoSize$VH;
    }
    public static int NotificationInfoSize$get(MemorySegment seg) {
        return (int)_VIRTUALIZATION_INSTANCE_INFO_INPUT_EX.NotificationInfoSize$VH.get(seg);
    }
    public static void NotificationInfoSize$set( MemorySegment seg, int x) {
        _VIRTUALIZATION_INSTANCE_INFO_INPUT_EX.NotificationInfoSize$VH.set(seg, x);
    }
    public static int NotificationInfoSize$get(MemorySegment seg, long index) {
        return (int)_VIRTUALIZATION_INSTANCE_INFO_INPUT_EX.NotificationInfoSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NotificationInfoSize$set(MemorySegment seg, long index, int x) {
        _VIRTUALIZATION_INSTANCE_INFO_INPUT_EX.NotificationInfoSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NotificationInfoOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NotificationInfoOffset"));
    public static VarHandle NotificationInfoOffset$VH() {
        return _VIRTUALIZATION_INSTANCE_INFO_INPUT_EX.NotificationInfoOffset$VH;
    }
    public static short NotificationInfoOffset$get(MemorySegment seg) {
        return (short)_VIRTUALIZATION_INSTANCE_INFO_INPUT_EX.NotificationInfoOffset$VH.get(seg);
    }
    public static void NotificationInfoOffset$set( MemorySegment seg, short x) {
        _VIRTUALIZATION_INSTANCE_INFO_INPUT_EX.NotificationInfoOffset$VH.set(seg, x);
    }
    public static short NotificationInfoOffset$get(MemorySegment seg, long index) {
        return (short)_VIRTUALIZATION_INSTANCE_INFO_INPUT_EX.NotificationInfoOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NotificationInfoOffset$set(MemorySegment seg, long index, short x) {
        _VIRTUALIZATION_INSTANCE_INFO_INPUT_EX.NotificationInfoOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ProviderMajorVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ProviderMajorVersion"));
    public static VarHandle ProviderMajorVersion$VH() {
        return _VIRTUALIZATION_INSTANCE_INFO_INPUT_EX.ProviderMajorVersion$VH;
    }
    public static short ProviderMajorVersion$get(MemorySegment seg) {
        return (short)_VIRTUALIZATION_INSTANCE_INFO_INPUT_EX.ProviderMajorVersion$VH.get(seg);
    }
    public static void ProviderMajorVersion$set( MemorySegment seg, short x) {
        _VIRTUALIZATION_INSTANCE_INFO_INPUT_EX.ProviderMajorVersion$VH.set(seg, x);
    }
    public static short ProviderMajorVersion$get(MemorySegment seg, long index) {
        return (short)_VIRTUALIZATION_INSTANCE_INFO_INPUT_EX.ProviderMajorVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ProviderMajorVersion$set(MemorySegment seg, long index, short x) {
        _VIRTUALIZATION_INSTANCE_INFO_INPUT_EX.ProviderMajorVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


