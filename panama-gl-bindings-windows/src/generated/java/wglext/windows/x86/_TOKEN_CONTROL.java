// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _TOKEN_CONTROL {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("LowPart"),
            Constants$root.C_LONG$LAYOUT.withName("HighPart")
        ).withName("TokenId"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("LowPart"),
            Constants$root.C_LONG$LAYOUT.withName("HighPart")
        ).withName("AuthenticationId"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("LowPart"),
            Constants$root.C_LONG$LAYOUT.withName("HighPart")
        ).withName("ModifiedId"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("SourceName"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("SourceIdentifier")
        ).withName("TokenSource")
    ).withName("_TOKEN_CONTROL");
    public static MemoryLayout $LAYOUT() {
        return _TOKEN_CONTROL.$struct$LAYOUT;
    }
    public static MemorySegment TokenId$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static MemorySegment AuthenticationId$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    public static MemorySegment ModifiedId$slice(MemorySegment seg) {
        return seg.asSlice(16, 8);
    }
    public static MemorySegment TokenSource$slice(MemorySegment seg) {
        return seg.asSlice(24, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


