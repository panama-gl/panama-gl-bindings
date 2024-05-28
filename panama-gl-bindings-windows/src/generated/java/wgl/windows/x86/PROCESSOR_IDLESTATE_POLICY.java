// Generated by jextract

package wgl.windows.x86;

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
 * struct {
 *     WORD Revision;
 *     union {
 *         WORD AsWORD;
 *         struct {
 *             WORD AllowScaling : 1;
 *             WORD Disabled : 1;
 *             WORD Reserved : 14;
 *         };
 *     } Flags;
 *     DWORD PolicyCount;
 *     PROCESSOR_IDLESTATE_INFO Policy[3];
 * }
 * }
 */
public class PROCESSOR_IDLESTATE_POLICY {

    PROCESSOR_IDLESTATE_POLICY() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_SHORT.withName("Revision"),
        PROCESSOR_IDLESTATE_POLICY.Flags.layout().withName("Flags"),
        wgl_h.C_LONG.withName("PolicyCount"),
        MemoryLayout.sequenceLayout(3, PROCESSOR_IDLESTATE_INFO.layout()).withName("Policy")
    ).withName("$anon$16635:9");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfShort Revision$LAYOUT = (OfShort)$LAYOUT.select(groupElement("Revision"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD Revision
     * }
     */
    public static final OfShort Revision$layout() {
        return Revision$LAYOUT;
    }

    private static final long Revision$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD Revision
     * }
     */
    public static final long Revision$offset() {
        return Revision$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD Revision
     * }
     */
    public static short Revision(MemorySegment struct) {
        return struct.get(Revision$LAYOUT, Revision$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD Revision
     * }
     */
    public static void Revision(MemorySegment struct, short fieldValue) {
        struct.set(Revision$LAYOUT, Revision$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * union {
     *     WORD AsWORD;
     *     struct {
     *         WORD AllowScaling : 1;
     *         WORD Disabled : 1;
     *         WORD Reserved : 14;
     *     };
     * }
     * }
     */
    public static class Flags {

        Flags() {
            // Should not be called directly
        }

        private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout(
            wgl_h.C_SHORT.withName("AsWORD"),
            MemoryLayout.structLayout(
                MemoryLayout.paddingLayout(2)
            ).withName("$anon$16639:9")
        ).withName("$anon$16637:5");

        /**
         * The layout of this union
         */
        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        private static final OfShort AsWORD$LAYOUT = (OfShort)$LAYOUT.select(groupElement("AsWORD"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * WORD AsWORD
         * }
         */
        public static final OfShort AsWORD$layout() {
            return AsWORD$LAYOUT;
        }

        private static final long AsWORD$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * WORD AsWORD
         * }
         */
        public static final long AsWORD$offset() {
            return AsWORD$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * WORD AsWORD
         * }
         */
        public static short AsWORD(MemorySegment union) {
            return union.get(AsWORD$LAYOUT, AsWORD$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * WORD AsWORD
         * }
         */
        public static void AsWORD(MemorySegment union, short fieldValue) {
            union.set(AsWORD$LAYOUT, AsWORD$OFFSET, fieldValue);
        }

        /**
         * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
         * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
         */
        public static MemorySegment asSlice(MemorySegment array, long index) {
            return array.asSlice(layout().byteSize() * index);
        }

        /**
         * The size (in bytes) of this union
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

    private static final GroupLayout Flags$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("Flags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * union {
     *     WORD AsWORD;
     *     struct {
     *         WORD AllowScaling : 1;
     *         WORD Disabled : 1;
     *         WORD Reserved : 14;
     *     };
     * } Flags
     * }
     */
    public static final GroupLayout Flags$layout() {
        return Flags$LAYOUT;
    }

    private static final long Flags$OFFSET = 2;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * union {
     *     WORD AsWORD;
     *     struct {
     *         WORD AllowScaling : 1;
     *         WORD Disabled : 1;
     *         WORD Reserved : 14;
     *     };
     * } Flags
     * }
     */
    public static final long Flags$offset() {
        return Flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * union {
     *     WORD AsWORD;
     *     struct {
     *         WORD AllowScaling : 1;
     *         WORD Disabled : 1;
     *         WORD Reserved : 14;
     *     };
     * } Flags
     * }
     */
    public static MemorySegment Flags(MemorySegment struct) {
        return struct.asSlice(Flags$OFFSET, Flags$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * union {
     *     WORD AsWORD;
     *     struct {
     *         WORD AllowScaling : 1;
     *         WORD Disabled : 1;
     *         WORD Reserved : 14;
     *     };
     * } Flags
     * }
     */
    public static void Flags(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Flags$OFFSET, Flags$LAYOUT.byteSize());
    }

    private static final OfInt PolicyCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("PolicyCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD PolicyCount
     * }
     */
    public static final OfInt PolicyCount$layout() {
        return PolicyCount$LAYOUT;
    }

    private static final long PolicyCount$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD PolicyCount
     * }
     */
    public static final long PolicyCount$offset() {
        return PolicyCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD PolicyCount
     * }
     */
    public static int PolicyCount(MemorySegment struct) {
        return struct.get(PolicyCount$LAYOUT, PolicyCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD PolicyCount
     * }
     */
    public static void PolicyCount(MemorySegment struct, int fieldValue) {
        struct.set(PolicyCount$LAYOUT, PolicyCount$OFFSET, fieldValue);
    }

    private static final SequenceLayout Policy$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("Policy"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PROCESSOR_IDLESTATE_INFO Policy[3]
     * }
     */
    public static final SequenceLayout Policy$layout() {
        return Policy$LAYOUT;
    }

    private static final long Policy$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PROCESSOR_IDLESTATE_INFO Policy[3]
     * }
     */
    public static final long Policy$offset() {
        return Policy$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PROCESSOR_IDLESTATE_INFO Policy[3]
     * }
     */
    public static MemorySegment Policy(MemorySegment struct) {
        return struct.asSlice(Policy$OFFSET, Policy$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PROCESSOR_IDLESTATE_INFO Policy[3]
     * }
     */
    public static void Policy(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Policy$OFFSET, Policy$LAYOUT.byteSize());
    }

    private static long[] Policy$DIMS = { 3 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * PROCESSOR_IDLESTATE_INFO Policy[3]
     * }
     */
    public static long[] Policy$dimensions() {
        return Policy$DIMS;
    }
    private static final MethodHandle Policy$ELEM_HANDLE = Policy$LAYOUT.sliceHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * PROCESSOR_IDLESTATE_INFO Policy[3]
     * }
     */
    public static MemorySegment Policy(MemorySegment struct, long index0) {
        try {
            return (MemorySegment)Policy$ELEM_HANDLE.invokeExact(struct, 0L, index0);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * PROCESSOR_IDLESTATE_INFO Policy[3]
     * }
     */
    public static void Policy(MemorySegment struct, long index0, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, Policy(struct, index0), 0L, PROCESSOR_IDLESTATE_INFO.layout().byteSize());
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

