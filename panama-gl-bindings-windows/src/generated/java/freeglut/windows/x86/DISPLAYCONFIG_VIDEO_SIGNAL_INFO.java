// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct DISPLAYCONFIG_VIDEO_SIGNAL_INFO {
 *     UINT64 pixelRate;
 *     DISPLAYCONFIG_RATIONAL hSyncFreq;
 *     DISPLAYCONFIG_RATIONAL vSyncFreq;
 *     DISPLAYCONFIG_2DREGION activeSize;
 *     DISPLAYCONFIG_2DREGION totalSize;
 *     union {
 *         struct {
 *             UINT32 videoStandard : 16;
 *             UINT32 vSyncFreqDivider : 6;
 *             UINT32 reserved : 10;
 *         } AdditionalSignalInfo;
 *         UINT32 videoStandard;
 *     };
 *     DISPLAYCONFIG_SCANLINE_ORDERING scanLineOrdering;
 * }
 * }
 */
public class DISPLAYCONFIG_VIDEO_SIGNAL_INFO {

    DISPLAYCONFIG_VIDEO_SIGNAL_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        freeglut_h.C_LONG_LONG.withName("pixelRate"),
        DISPLAYCONFIG_RATIONAL.layout().withName("hSyncFreq"),
        DISPLAYCONFIG_RATIONAL.layout().withName("vSyncFreq"),
        DISPLAYCONFIG_2DREGION.layout().withName("activeSize"),
        DISPLAYCONFIG_2DREGION.layout().withName("totalSize"),
        MemoryLayout.unionLayout(
            DISPLAYCONFIG_VIDEO_SIGNAL_INFO.AdditionalSignalInfo.layout().withName("AdditionalSignalInfo"),
            freeglut_h.C_INT.withName("videoStandard")
        ).withName("$anon$2850:5"),
        freeglut_h.C_INT.withName("scanLineOrdering")
    ).withName("DISPLAYCONFIG_VIDEO_SIGNAL_INFO");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong pixelRate$LAYOUT = (OfLong)$LAYOUT.select(groupElement("pixelRate"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT64 pixelRate
     * }
     */
    public static final OfLong pixelRate$layout() {
        return pixelRate$LAYOUT;
    }

    private static final long pixelRate$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT64 pixelRate
     * }
     */
    public static final long pixelRate$offset() {
        return pixelRate$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT64 pixelRate
     * }
     */
    public static long pixelRate(MemorySegment struct) {
        return struct.get(pixelRate$LAYOUT, pixelRate$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT64 pixelRate
     * }
     */
    public static void pixelRate(MemorySegment struct, long fieldValue) {
        struct.set(pixelRate$LAYOUT, pixelRate$OFFSET, fieldValue);
    }

    private static final GroupLayout hSyncFreq$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("hSyncFreq"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DISPLAYCONFIG_RATIONAL hSyncFreq
     * }
     */
    public static final GroupLayout hSyncFreq$layout() {
        return hSyncFreq$LAYOUT;
    }

    private static final long hSyncFreq$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DISPLAYCONFIG_RATIONAL hSyncFreq
     * }
     */
    public static final long hSyncFreq$offset() {
        return hSyncFreq$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DISPLAYCONFIG_RATIONAL hSyncFreq
     * }
     */
    public static MemorySegment hSyncFreq(MemorySegment struct) {
        return struct.asSlice(hSyncFreq$OFFSET, hSyncFreq$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DISPLAYCONFIG_RATIONAL hSyncFreq
     * }
     */
    public static void hSyncFreq(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, hSyncFreq$OFFSET, hSyncFreq$LAYOUT.byteSize());
    }

    private static final GroupLayout vSyncFreq$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("vSyncFreq"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DISPLAYCONFIG_RATIONAL vSyncFreq
     * }
     */
    public static final GroupLayout vSyncFreq$layout() {
        return vSyncFreq$LAYOUT;
    }

    private static final long vSyncFreq$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DISPLAYCONFIG_RATIONAL vSyncFreq
     * }
     */
    public static final long vSyncFreq$offset() {
        return vSyncFreq$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DISPLAYCONFIG_RATIONAL vSyncFreq
     * }
     */
    public static MemorySegment vSyncFreq(MemorySegment struct) {
        return struct.asSlice(vSyncFreq$OFFSET, vSyncFreq$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DISPLAYCONFIG_RATIONAL vSyncFreq
     * }
     */
    public static void vSyncFreq(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, vSyncFreq$OFFSET, vSyncFreq$LAYOUT.byteSize());
    }

    private static final GroupLayout activeSize$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("activeSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DISPLAYCONFIG_2DREGION activeSize
     * }
     */
    public static final GroupLayout activeSize$layout() {
        return activeSize$LAYOUT;
    }

    private static final long activeSize$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DISPLAYCONFIG_2DREGION activeSize
     * }
     */
    public static final long activeSize$offset() {
        return activeSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DISPLAYCONFIG_2DREGION activeSize
     * }
     */
    public static MemorySegment activeSize(MemorySegment struct) {
        return struct.asSlice(activeSize$OFFSET, activeSize$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DISPLAYCONFIG_2DREGION activeSize
     * }
     */
    public static void activeSize(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, activeSize$OFFSET, activeSize$LAYOUT.byteSize());
    }

    private static final GroupLayout totalSize$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("totalSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DISPLAYCONFIG_2DREGION totalSize
     * }
     */
    public static final GroupLayout totalSize$layout() {
        return totalSize$LAYOUT;
    }

    private static final long totalSize$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DISPLAYCONFIG_2DREGION totalSize
     * }
     */
    public static final long totalSize$offset() {
        return totalSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DISPLAYCONFIG_2DREGION totalSize
     * }
     */
    public static MemorySegment totalSize(MemorySegment struct) {
        return struct.asSlice(totalSize$OFFSET, totalSize$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DISPLAYCONFIG_2DREGION totalSize
     * }
     */
    public static void totalSize(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, totalSize$OFFSET, totalSize$LAYOUT.byteSize());
    }

    /**
     * {@snippet lang=c :
     * struct {
     *     UINT32 videoStandard : 16;
     *     UINT32 vSyncFreqDivider : 6;
     *     UINT32 reserved : 10;
     * }
     * }
     */
    public static class AdditionalSignalInfo {

        AdditionalSignalInfo() {
            // Should not be called directly
        }

        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
            MemoryLayout.paddingLayout(4)
        ).withName("$anon$2852:9");

        /**
         * The layout of this struct
         */
        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        /**
         * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
         * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
         */
        public static MemorySegment asSlice(MemorySegment array, long index) {
            return array.asSlice(layout().byteSize() * index);
        }

        /**
         * The size (in bytes) of this struct
         */
        public static long sizeof() { return layout().byteSize(); }

        /**
         * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
         */
        public static MemorySegment allocate(SegmentAllocator allocator) {
            return allocator.allocate(layout());
        }

        /**
         * Allocate an array of size {@code elementCount} using {@code allocator}.
         * The returned segment has size {@code elementCount * layout().byteSize()}.
         */
        public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
        }

        /**
         * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
         * The returned segment has size {@code layout().byteSize()}
         */
        public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
            return reinterpret(addr, 1, arena, cleanup);
        }

        /**
         * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
         * The returned segment has size {@code elementCount * layout().byteSize()}
         */
        public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
            return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
        }
    }

    private static final GroupLayout AdditionalSignalInfo$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("$anon$2850:5"), groupElement("AdditionalSignalInfo"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct {
     *     UINT32 videoStandard : 16;
     *     UINT32 vSyncFreqDivider : 6;
     *     UINT32 reserved : 10;
     * } AdditionalSignalInfo
     * }
     */
    public static final GroupLayout AdditionalSignalInfo$layout() {
        return AdditionalSignalInfo$LAYOUT;
    }

    private static final long AdditionalSignalInfo$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct {
     *     UINT32 videoStandard : 16;
     *     UINT32 vSyncFreqDivider : 6;
     *     UINT32 reserved : 10;
     * } AdditionalSignalInfo
     * }
     */
    public static final long AdditionalSignalInfo$offset() {
        return AdditionalSignalInfo$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct {
     *     UINT32 videoStandard : 16;
     *     UINT32 vSyncFreqDivider : 6;
     *     UINT32 reserved : 10;
     * } AdditionalSignalInfo
     * }
     */
    public static MemorySegment AdditionalSignalInfo(MemorySegment struct) {
        return struct.asSlice(AdditionalSignalInfo$OFFSET, AdditionalSignalInfo$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct {
     *     UINT32 videoStandard : 16;
     *     UINT32 vSyncFreqDivider : 6;
     *     UINT32 reserved : 10;
     * } AdditionalSignalInfo
     * }
     */
    public static void AdditionalSignalInfo(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, AdditionalSignalInfo$OFFSET, AdditionalSignalInfo$LAYOUT.byteSize());
    }

    private static final OfInt videoStandard$LAYOUT = (OfInt)$LAYOUT.select(groupElement("$anon$2850:5"), groupElement("videoStandard"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT32 videoStandard
     * }
     */
    public static final OfInt videoStandard$layout() {
        return videoStandard$LAYOUT;
    }

    private static final long videoStandard$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT32 videoStandard
     * }
     */
    public static final long videoStandard$offset() {
        return videoStandard$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT32 videoStandard
     * }
     */
    public static int videoStandard(MemorySegment struct) {
        return struct.get(videoStandard$LAYOUT, videoStandard$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT32 videoStandard
     * }
     */
    public static void videoStandard(MemorySegment struct, int fieldValue) {
        struct.set(videoStandard$LAYOUT, videoStandard$OFFSET, fieldValue);
    }

    private static final OfInt scanLineOrdering$LAYOUT = (OfInt)$LAYOUT.select(groupElement("scanLineOrdering"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DISPLAYCONFIG_SCANLINE_ORDERING scanLineOrdering
     * }
     */
    public static final OfInt scanLineOrdering$layout() {
        return scanLineOrdering$LAYOUT;
    }

    private static final long scanLineOrdering$OFFSET = 44;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DISPLAYCONFIG_SCANLINE_ORDERING scanLineOrdering
     * }
     */
    public static final long scanLineOrdering$offset() {
        return scanLineOrdering$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DISPLAYCONFIG_SCANLINE_ORDERING scanLineOrdering
     * }
     */
    public static int scanLineOrdering(MemorySegment struct) {
        return struct.get(scanLineOrdering$LAYOUT, scanLineOrdering$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DISPLAYCONFIG_SCANLINE_ORDERING scanLineOrdering
     * }
     */
    public static void scanLineOrdering(MemorySegment struct, int fieldValue) {
        struct.set(scanLineOrdering$LAYOUT, scanLineOrdering$OFFSET, fieldValue);
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}

