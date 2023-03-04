// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class DISPLAYCONFIG_TARGET_MODE {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("pixelRate"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("Numerator"),
                Constants$root.C_LONG$LAYOUT.withName("Denominator")
            ).withName("hSyncFreq"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("Numerator"),
                Constants$root.C_LONG$LAYOUT.withName("Denominator")
            ).withName("vSyncFreq"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("cx"),
                Constants$root.C_LONG$LAYOUT.withName("cy")
            ).withName("activeSize"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("cx"),
                Constants$root.C_LONG$LAYOUT.withName("cy")
            ).withName("totalSize"),
            MemoryLayout.unionLayout(
                MemoryLayout.structLayout(
                    MemoryLayout.structLayout(
                        MemoryLayout.paddingLayout(16).withName("videoStandard"),
                        MemoryLayout.paddingLayout(6).withName("vSyncFreqDivider"),
                        MemoryLayout.paddingLayout(10).withName("reserved")
                    )
                ).withName("AdditionalSignalInfo"),
                Constants$root.C_LONG$LAYOUT.withName("videoStandard")
            ).withName("$anon$0"),
            Constants$root.C_LONG$LAYOUT.withName("scanLineOrdering")
        ).withName("targetVideoSignalInfo")
    ).withName("DISPLAYCONFIG_TARGET_MODE");
    public static MemoryLayout $LAYOUT() {
        return DISPLAYCONFIG_TARGET_MODE.$struct$LAYOUT;
    }
    public static MemorySegment targetVideoSignalInfo$slice(MemorySegment seg) {
        return seg.asSlice(0, 48);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


