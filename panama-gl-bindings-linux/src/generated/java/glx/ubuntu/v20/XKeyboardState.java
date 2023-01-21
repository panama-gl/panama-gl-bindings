// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class XKeyboardState {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("key_click_percent"),
        Constants$root.C_INT$LAYOUT.withName("bell_percent"),
        Constants$root.C_INT$LAYOUT.withName("bell_pitch"),
        Constants$root.C_INT$LAYOUT.withName("bell_duration"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("led_mask"),
        Constants$root.C_INT$LAYOUT.withName("global_auto_repeat"),
        MemoryLayout.sequenceLayout(32, Constants$root.C_CHAR$LAYOUT).withName("auto_repeats"),
        MemoryLayout.paddingLayout(32)
    );
    public static MemoryLayout $LAYOUT() {
        return XKeyboardState.$struct$LAYOUT;
    }
    static final VarHandle key_click_percent$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("key_click_percent"));
    public static VarHandle key_click_percent$VH() {
        return XKeyboardState.key_click_percent$VH;
    }
    public static int key_click_percent$get(MemorySegment seg) {
        return (int)XKeyboardState.key_click_percent$VH.get(seg);
    }
    public static void key_click_percent$set( MemorySegment seg, int x) {
        XKeyboardState.key_click_percent$VH.set(seg, x);
    }
    public static int key_click_percent$get(MemorySegment seg, long index) {
        return (int)XKeyboardState.key_click_percent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void key_click_percent$set(MemorySegment seg, long index, int x) {
        XKeyboardState.key_click_percent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bell_percent$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bell_percent"));
    public static VarHandle bell_percent$VH() {
        return XKeyboardState.bell_percent$VH;
    }
    public static int bell_percent$get(MemorySegment seg) {
        return (int)XKeyboardState.bell_percent$VH.get(seg);
    }
    public static void bell_percent$set( MemorySegment seg, int x) {
        XKeyboardState.bell_percent$VH.set(seg, x);
    }
    public static int bell_percent$get(MemorySegment seg, long index) {
        return (int)XKeyboardState.bell_percent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bell_percent$set(MemorySegment seg, long index, int x) {
        XKeyboardState.bell_percent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bell_pitch$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bell_pitch"));
    public static VarHandle bell_pitch$VH() {
        return XKeyboardState.bell_pitch$VH;
    }
    public static int bell_pitch$get(MemorySegment seg) {
        return (int)XKeyboardState.bell_pitch$VH.get(seg);
    }
    public static void bell_pitch$set( MemorySegment seg, int x) {
        XKeyboardState.bell_pitch$VH.set(seg, x);
    }
    public static int bell_pitch$get(MemorySegment seg, long index) {
        return (int)XKeyboardState.bell_pitch$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bell_pitch$set(MemorySegment seg, long index, int x) {
        XKeyboardState.bell_pitch$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bell_duration$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bell_duration"));
    public static VarHandle bell_duration$VH() {
        return XKeyboardState.bell_duration$VH;
    }
    public static int bell_duration$get(MemorySegment seg) {
        return (int)XKeyboardState.bell_duration$VH.get(seg);
    }
    public static void bell_duration$set( MemorySegment seg, int x) {
        XKeyboardState.bell_duration$VH.set(seg, x);
    }
    public static int bell_duration$get(MemorySegment seg, long index) {
        return (int)XKeyboardState.bell_duration$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bell_duration$set(MemorySegment seg, long index, int x) {
        XKeyboardState.bell_duration$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle led_mask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("led_mask"));
    public static VarHandle led_mask$VH() {
        return XKeyboardState.led_mask$VH;
    }
    public static long led_mask$get(MemorySegment seg) {
        return (long)XKeyboardState.led_mask$VH.get(seg);
    }
    public static void led_mask$set( MemorySegment seg, long x) {
        XKeyboardState.led_mask$VH.set(seg, x);
    }
    public static long led_mask$get(MemorySegment seg, long index) {
        return (long)XKeyboardState.led_mask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void led_mask$set(MemorySegment seg, long index, long x) {
        XKeyboardState.led_mask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle global_auto_repeat$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("global_auto_repeat"));
    public static VarHandle global_auto_repeat$VH() {
        return XKeyboardState.global_auto_repeat$VH;
    }
    public static int global_auto_repeat$get(MemorySegment seg) {
        return (int)XKeyboardState.global_auto_repeat$VH.get(seg);
    }
    public static void global_auto_repeat$set( MemorySegment seg, int x) {
        XKeyboardState.global_auto_repeat$VH.set(seg, x);
    }
    public static int global_auto_repeat$get(MemorySegment seg, long index) {
        return (int)XKeyboardState.global_auto_repeat$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void global_auto_repeat$set(MemorySegment seg, long index, int x) {
        XKeyboardState.global_auto_repeat$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment auto_repeats$slice(MemorySegment seg) {
        return seg.asSlice(28, 32);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


