// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagRAWINPUT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("dwType"),
            Constants$root.C_LONG$LAYOUT.withName("dwSize"),
            Constants$root.C_POINTER$LAYOUT.withName("hDevice"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("wParam")
        ).withName("header"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_SHORT$LAYOUT.withName("usFlags"),
                MemoryLayout.paddingLayout(16),
                MemoryLayout.unionLayout(
                    Constants$root.C_LONG$LAYOUT.withName("ulButtons"),
                    MemoryLayout.structLayout(
                        Constants$root.C_SHORT$LAYOUT.withName("usButtonFlags"),
                        Constants$root.C_SHORT$LAYOUT.withName("usButtonData")
                    ).withName("$anon$0")
                ).withName("$anon$0"),
                Constants$root.C_LONG$LAYOUT.withName("ulRawButtons"),
                Constants$root.C_LONG$LAYOUT.withName("lLastX"),
                Constants$root.C_LONG$LAYOUT.withName("lLastY"),
                Constants$root.C_LONG$LAYOUT.withName("ulExtraInformation")
            ).withName("mouse"),
            MemoryLayout.structLayout(
                Constants$root.C_SHORT$LAYOUT.withName("MakeCode"),
                Constants$root.C_SHORT$LAYOUT.withName("Flags"),
                Constants$root.C_SHORT$LAYOUT.withName("Reserved"),
                Constants$root.C_SHORT$LAYOUT.withName("VKey"),
                Constants$root.C_LONG$LAYOUT.withName("Message"),
                Constants$root.C_LONG$LAYOUT.withName("ExtraInformation")
            ).withName("keyboard"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("dwSizeHid"),
                Constants$root.C_LONG$LAYOUT.withName("dwCount"),
                MemoryLayout.sequenceLayout(1, Constants$root.C_CHAR$LAYOUT).withName("bRawData"),
                MemoryLayout.paddingLayout(24)
            ).withName("hid")
        ).withName("data")
    ).withName("tagRAWINPUT");
    public static MemoryLayout $LAYOUT() {
        return tagRAWINPUT.$struct$LAYOUT;
    }
    public static MemorySegment header$slice(MemorySegment seg) {
        return seg.asSlice(0, 24);
    }
    public static class data {

        static final  GroupLayout data$union$LAYOUT = MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_SHORT$LAYOUT.withName("usFlags"),
                MemoryLayout.paddingLayout(16),
                MemoryLayout.unionLayout(
                    Constants$root.C_LONG$LAYOUT.withName("ulButtons"),
                    MemoryLayout.structLayout(
                        Constants$root.C_SHORT$LAYOUT.withName("usButtonFlags"),
                        Constants$root.C_SHORT$LAYOUT.withName("usButtonData")
                    ).withName("$anon$0")
                ).withName("$anon$0"),
                Constants$root.C_LONG$LAYOUT.withName("ulRawButtons"),
                Constants$root.C_LONG$LAYOUT.withName("lLastX"),
                Constants$root.C_LONG$LAYOUT.withName("lLastY"),
                Constants$root.C_LONG$LAYOUT.withName("ulExtraInformation")
            ).withName("mouse"),
            MemoryLayout.structLayout(
                Constants$root.C_SHORT$LAYOUT.withName("MakeCode"),
                Constants$root.C_SHORT$LAYOUT.withName("Flags"),
                Constants$root.C_SHORT$LAYOUT.withName("Reserved"),
                Constants$root.C_SHORT$LAYOUT.withName("VKey"),
                Constants$root.C_LONG$LAYOUT.withName("Message"),
                Constants$root.C_LONG$LAYOUT.withName("ExtraInformation")
            ).withName("keyboard"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("dwSizeHid"),
                Constants$root.C_LONG$LAYOUT.withName("dwCount"),
                MemoryLayout.sequenceLayout(1, Constants$root.C_CHAR$LAYOUT).withName("bRawData"),
                MemoryLayout.paddingLayout(24)
            ).withName("hid")
        );
        public static MemoryLayout $LAYOUT() {
            return data.data$union$LAYOUT;
        }
        public static MemorySegment mouse$slice(MemorySegment seg) {
            return seg.asSlice(0, 24);
        }
        public static MemorySegment keyboard$slice(MemorySegment seg) {
            return seg.asSlice(0, 16);
        }
        public static MemorySegment hid$slice(MemorySegment seg) {
            return seg.asSlice(0, 12);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
    }

    public static MemorySegment data$slice(MemorySegment seg) {
        return seg.asSlice(24, 24);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


