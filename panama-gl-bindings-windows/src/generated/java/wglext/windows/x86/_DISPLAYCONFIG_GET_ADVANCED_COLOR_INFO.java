// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _DISPLAYCONFIG_GET_ADVANCED_COLOR_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("type"),
            Constants$root.C_LONG$LAYOUT.withName("size"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("adapterId"),
            Constants$root.C_LONG$LAYOUT.withName("id")
        ).withName("header"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    MemoryLayout.paddingLayout(1).withName("advancedColorSupported"),
                    MemoryLayout.paddingLayout(1).withName("advancedColorEnabled"),
                    MemoryLayout.paddingLayout(1).withName("wideColorEnforced"),
                    MemoryLayout.paddingLayout(1).withName("advancedColorForceDisabled"),
                    MemoryLayout.paddingLayout(28).withName("reserved")
                )
            ).withName("$anon$0"),
            Constants$root.C_LONG$LAYOUT.withName("value")
        ).withName("$anon$0"),
        Constants$root.C_LONG$LAYOUT.withName("colorEncoding"),
        Constants$root.C_LONG$LAYOUT.withName("bitsPerColorChannel")
    ).withName("_DISPLAYCONFIG_GET_ADVANCED_COLOR_INFO");
    public static MemoryLayout $LAYOUT() {
        return _DISPLAYCONFIG_GET_ADVANCED_COLOR_INFO.$struct$LAYOUT;
    }
    public static MemorySegment header$slice(MemorySegment seg) {
        return seg.asSlice(0, 20);
    }
    static final VarHandle value$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("value"));
    public static VarHandle value$VH() {
        return _DISPLAYCONFIG_GET_ADVANCED_COLOR_INFO.value$VH;
    }
    public static int value$get(MemorySegment seg) {
        return (int)_DISPLAYCONFIG_GET_ADVANCED_COLOR_INFO.value$VH.get(seg);
    }
    public static void value$set( MemorySegment seg, int x) {
        _DISPLAYCONFIG_GET_ADVANCED_COLOR_INFO.value$VH.set(seg, x);
    }
    public static int value$get(MemorySegment seg, long index) {
        return (int)_DISPLAYCONFIG_GET_ADVANCED_COLOR_INFO.value$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void value$set(MemorySegment seg, long index, int x) {
        _DISPLAYCONFIG_GET_ADVANCED_COLOR_INFO.value$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle colorEncoding$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("colorEncoding"));
    public static VarHandle colorEncoding$VH() {
        return _DISPLAYCONFIG_GET_ADVANCED_COLOR_INFO.colorEncoding$VH;
    }
    public static int colorEncoding$get(MemorySegment seg) {
        return (int)_DISPLAYCONFIG_GET_ADVANCED_COLOR_INFO.colorEncoding$VH.get(seg);
    }
    public static void colorEncoding$set( MemorySegment seg, int x) {
        _DISPLAYCONFIG_GET_ADVANCED_COLOR_INFO.colorEncoding$VH.set(seg, x);
    }
    public static int colorEncoding$get(MemorySegment seg, long index) {
        return (int)_DISPLAYCONFIG_GET_ADVANCED_COLOR_INFO.colorEncoding$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void colorEncoding$set(MemorySegment seg, long index, int x) {
        _DISPLAYCONFIG_GET_ADVANCED_COLOR_INFO.colorEncoding$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bitsPerColorChannel$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bitsPerColorChannel"));
    public static VarHandle bitsPerColorChannel$VH() {
        return _DISPLAYCONFIG_GET_ADVANCED_COLOR_INFO.bitsPerColorChannel$VH;
    }
    public static int bitsPerColorChannel$get(MemorySegment seg) {
        return (int)_DISPLAYCONFIG_GET_ADVANCED_COLOR_INFO.bitsPerColorChannel$VH.get(seg);
    }
    public static void bitsPerColorChannel$set( MemorySegment seg, int x) {
        _DISPLAYCONFIG_GET_ADVANCED_COLOR_INFO.bitsPerColorChannel$VH.set(seg, x);
    }
    public static int bitsPerColorChannel$get(MemorySegment seg, long index) {
        return (int)_DISPLAYCONFIG_GET_ADVANCED_COLOR_INFO.bitsPerColorChannel$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bitsPerColorChannel$set(MemorySegment seg, long index, int x) {
        _DISPLAYCONFIG_GET_ADVANCED_COLOR_INFO.bitsPerColorChannel$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


