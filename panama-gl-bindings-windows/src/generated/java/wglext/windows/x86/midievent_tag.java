// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class midievent_tag {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwDeltaTime"),
        Constants$root.C_LONG$LAYOUT.withName("dwStreamID"),
        Constants$root.C_LONG$LAYOUT.withName("dwEvent"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_LONG$LAYOUT).withName("dwParms")
    ).withName("midievent_tag");
    public static MemoryLayout $LAYOUT() {
        return midievent_tag.$struct$LAYOUT;
    }
    static final VarHandle dwDeltaTime$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwDeltaTime"));
    public static VarHandle dwDeltaTime$VH() {
        return midievent_tag.dwDeltaTime$VH;
    }
    public static int dwDeltaTime$get(MemorySegment seg) {
        return (int)midievent_tag.dwDeltaTime$VH.get(seg);
    }
    public static void dwDeltaTime$set( MemorySegment seg, int x) {
        midievent_tag.dwDeltaTime$VH.set(seg, x);
    }
    public static int dwDeltaTime$get(MemorySegment seg, long index) {
        return (int)midievent_tag.dwDeltaTime$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwDeltaTime$set(MemorySegment seg, long index, int x) {
        midievent_tag.dwDeltaTime$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwStreamID$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwStreamID"));
    public static VarHandle dwStreamID$VH() {
        return midievent_tag.dwStreamID$VH;
    }
    public static int dwStreamID$get(MemorySegment seg) {
        return (int)midievent_tag.dwStreamID$VH.get(seg);
    }
    public static void dwStreamID$set( MemorySegment seg, int x) {
        midievent_tag.dwStreamID$VH.set(seg, x);
    }
    public static int dwStreamID$get(MemorySegment seg, long index) {
        return (int)midievent_tag.dwStreamID$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwStreamID$set(MemorySegment seg, long index, int x) {
        midievent_tag.dwStreamID$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwEvent$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwEvent"));
    public static VarHandle dwEvent$VH() {
        return midievent_tag.dwEvent$VH;
    }
    public static int dwEvent$get(MemorySegment seg) {
        return (int)midievent_tag.dwEvent$VH.get(seg);
    }
    public static void dwEvent$set( MemorySegment seg, int x) {
        midievent_tag.dwEvent$VH.set(seg, x);
    }
    public static int dwEvent$get(MemorySegment seg, long index) {
        return (int)midievent_tag.dwEvent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwEvent$set(MemorySegment seg, long index, int x) {
        midievent_tag.dwEvent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment dwParms$slice(MemorySegment seg) {
        return seg.asSlice(12, 4);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


