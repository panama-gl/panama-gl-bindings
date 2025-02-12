// Generated by jextract

package glx.linux.x86;

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
 * struct __pthread_cond_s {
 *     union {
 *         unsigned long long __wseq;
 *         struct {
 *             unsigned int __low;
 *             unsigned int __high;
 *         } __wseq32;
 *     };
 *     union {
 *         unsigned long long __g1_start;
 *         struct {
 *             unsigned int __low;
 *             unsigned int __high;
 *         } __g1_start32;
 *     };
 *     unsigned int __g_refs[2];
 *     unsigned int __g_size[2];
 *     unsigned int __g1_orig_size;
 *     unsigned int __wrefs;
 *     unsigned int __g_signals[2];
 * }
 * }
 */
public class __pthread_cond_s {

    __pthread_cond_s() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.unionLayout(
            glx_h.C_LONG_LONG.withName("__wseq"),
            __pthread_cond_s.__wseq32.layout().withName("__wseq32")
        ).withName("$anon$94:17"),
        MemoryLayout.unionLayout(
            glx_h.C_LONG_LONG.withName("__g1_start"),
            __pthread_cond_s.__g1_start32.layout().withName("__g1_start32")
        ).withName("$anon$103:17"),
        MemoryLayout.sequenceLayout(2, glx_h.C_INT).withName("__g_refs"),
        MemoryLayout.sequenceLayout(2, glx_h.C_INT).withName("__g_size"),
        glx_h.C_INT.withName("__g1_orig_size"),
        glx_h.C_INT.withName("__wrefs"),
        MemoryLayout.sequenceLayout(2, glx_h.C_INT).withName("__g_signals")
    ).withName("__pthread_cond_s");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong __wseq$LAYOUT = (OfLong)$LAYOUT.select(groupElement("$anon$94:17"), groupElement("__wseq"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned long long __wseq
     * }
     */
    public static final OfLong __wseq$layout() {
        return __wseq$LAYOUT;
    }

    private static final long __wseq$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned long long __wseq
     * }
     */
    public static final long __wseq$offset() {
        return __wseq$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned long long __wseq
     * }
     */
    public static long __wseq(MemorySegment struct) {
        return struct.get(__wseq$LAYOUT, __wseq$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned long long __wseq
     * }
     */
    public static void __wseq(MemorySegment struct, long fieldValue) {
        struct.set(__wseq$LAYOUT, __wseq$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * struct {
     *     unsigned int __low;
     *     unsigned int __high;
     * }
     * }
     */
    public static class __wseq32 {

        __wseq32() {
            // Should not be called directly
        }

        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
            glx_h.C_INT.withName("__low"),
            glx_h.C_INT.withName("__high")
        ).withName("$anon$97:5");

        /**
         * The layout of this struct
         */
        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        private static final OfInt __low$LAYOUT = (OfInt)$LAYOUT.select(groupElement("__low"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * unsigned int __low
         * }
         */
        public static final OfInt __low$layout() {
            return __low$LAYOUT;
        }

        private static final long __low$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * unsigned int __low
         * }
         */
        public static final long __low$offset() {
            return __low$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * unsigned int __low
         * }
         */
        public static int __low(MemorySegment struct) {
            return struct.get(__low$LAYOUT, __low$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * unsigned int __low
         * }
         */
        public static void __low(MemorySegment struct, int fieldValue) {
            struct.set(__low$LAYOUT, __low$OFFSET, fieldValue);
        }

        private static final OfInt __high$LAYOUT = (OfInt)$LAYOUT.select(groupElement("__high"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * unsigned int __high
         * }
         */
        public static final OfInt __high$layout() {
            return __high$LAYOUT;
        }

        private static final long __high$OFFSET = 4;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * unsigned int __high
         * }
         */
        public static final long __high$offset() {
            return __high$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * unsigned int __high
         * }
         */
        public static int __high(MemorySegment struct) {
            return struct.get(__high$LAYOUT, __high$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * unsigned int __high
         * }
         */
        public static void __high(MemorySegment struct, int fieldValue) {
            struct.set(__high$LAYOUT, __high$OFFSET, fieldValue);
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

    private static final GroupLayout __wseq32$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("$anon$94:17"), groupElement("__wseq32"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct {
     *     unsigned int __low;
     *     unsigned int __high;
     * } __wseq32
     * }
     */
    public static final GroupLayout __wseq32$layout() {
        return __wseq32$LAYOUT;
    }

    private static final long __wseq32$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct {
     *     unsigned int __low;
     *     unsigned int __high;
     * } __wseq32
     * }
     */
    public static final long __wseq32$offset() {
        return __wseq32$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct {
     *     unsigned int __low;
     *     unsigned int __high;
     * } __wseq32
     * }
     */
    public static MemorySegment __wseq32(MemorySegment struct) {
        return struct.asSlice(__wseq32$OFFSET, __wseq32$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct {
     *     unsigned int __low;
     *     unsigned int __high;
     * } __wseq32
     * }
     */
    public static void __wseq32(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, __wseq32$OFFSET, __wseq32$LAYOUT.byteSize());
    }

    private static final OfLong __g1_start$LAYOUT = (OfLong)$LAYOUT.select(groupElement("$anon$103:17"), groupElement("__g1_start"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned long long __g1_start
     * }
     */
    public static final OfLong __g1_start$layout() {
        return __g1_start$LAYOUT;
    }

    private static final long __g1_start$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned long long __g1_start
     * }
     */
    public static final long __g1_start$offset() {
        return __g1_start$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned long long __g1_start
     * }
     */
    public static long __g1_start(MemorySegment struct) {
        return struct.get(__g1_start$LAYOUT, __g1_start$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned long long __g1_start
     * }
     */
    public static void __g1_start(MemorySegment struct, long fieldValue) {
        struct.set(__g1_start$LAYOUT, __g1_start$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * struct {
     *     unsigned int __low;
     *     unsigned int __high;
     * }
     * }
     */
    public static class __g1_start32 {

        __g1_start32() {
            // Should not be called directly
        }

        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
            glx_h.C_INT.withName("__low"),
            glx_h.C_INT.withName("__high")
        ).withName("$anon$106:5");

        /**
         * The layout of this struct
         */
        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        private static final OfInt __low$LAYOUT = (OfInt)$LAYOUT.select(groupElement("__low"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * unsigned int __low
         * }
         */
        public static final OfInt __low$layout() {
            return __low$LAYOUT;
        }

        private static final long __low$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * unsigned int __low
         * }
         */
        public static final long __low$offset() {
            return __low$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * unsigned int __low
         * }
         */
        public static int __low(MemorySegment struct) {
            return struct.get(__low$LAYOUT, __low$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * unsigned int __low
         * }
         */
        public static void __low(MemorySegment struct, int fieldValue) {
            struct.set(__low$LAYOUT, __low$OFFSET, fieldValue);
        }

        private static final OfInt __high$LAYOUT = (OfInt)$LAYOUT.select(groupElement("__high"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * unsigned int __high
         * }
         */
        public static final OfInt __high$layout() {
            return __high$LAYOUT;
        }

        private static final long __high$OFFSET = 4;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * unsigned int __high
         * }
         */
        public static final long __high$offset() {
            return __high$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * unsigned int __high
         * }
         */
        public static int __high(MemorySegment struct) {
            return struct.get(__high$LAYOUT, __high$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * unsigned int __high
         * }
         */
        public static void __high(MemorySegment struct, int fieldValue) {
            struct.set(__high$LAYOUT, __high$OFFSET, fieldValue);
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

    private static final GroupLayout __g1_start32$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("$anon$103:17"), groupElement("__g1_start32"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct {
     *     unsigned int __low;
     *     unsigned int __high;
     * } __g1_start32
     * }
     */
    public static final GroupLayout __g1_start32$layout() {
        return __g1_start32$LAYOUT;
    }

    private static final long __g1_start32$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct {
     *     unsigned int __low;
     *     unsigned int __high;
     * } __g1_start32
     * }
     */
    public static final long __g1_start32$offset() {
        return __g1_start32$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct {
     *     unsigned int __low;
     *     unsigned int __high;
     * } __g1_start32
     * }
     */
    public static MemorySegment __g1_start32(MemorySegment struct) {
        return struct.asSlice(__g1_start32$OFFSET, __g1_start32$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct {
     *     unsigned int __low;
     *     unsigned int __high;
     * } __g1_start32
     * }
     */
    public static void __g1_start32(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, __g1_start32$OFFSET, __g1_start32$LAYOUT.byteSize());
    }

    private static final SequenceLayout __g_refs$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("__g_refs"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned int __g_refs[2]
     * }
     */
    public static final SequenceLayout __g_refs$layout() {
        return __g_refs$LAYOUT;
    }

    private static final long __g_refs$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned int __g_refs[2]
     * }
     */
    public static final long __g_refs$offset() {
        return __g_refs$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned int __g_refs[2]
     * }
     */
    public static MemorySegment __g_refs(MemorySegment struct) {
        return struct.asSlice(__g_refs$OFFSET, __g_refs$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned int __g_refs[2]
     * }
     */
    public static void __g_refs(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, __g_refs$OFFSET, __g_refs$LAYOUT.byteSize());
    }

    private static long[] __g_refs$DIMS = { 2 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * unsigned int __g_refs[2]
     * }
     */
    public static long[] __g_refs$dimensions() {
        return __g_refs$DIMS;
    }
    private static final VarHandle __g_refs$ELEM_HANDLE = __g_refs$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * unsigned int __g_refs[2]
     * }
     */
    public static int __g_refs(MemorySegment struct, long index0) {
        return (int)__g_refs$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * unsigned int __g_refs[2]
     * }
     */
    public static void __g_refs(MemorySegment struct, long index0, int fieldValue) {
        __g_refs$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final SequenceLayout __g_size$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("__g_size"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned int __g_size[2]
     * }
     */
    public static final SequenceLayout __g_size$layout() {
        return __g_size$LAYOUT;
    }

    private static final long __g_size$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned int __g_size[2]
     * }
     */
    public static final long __g_size$offset() {
        return __g_size$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned int __g_size[2]
     * }
     */
    public static MemorySegment __g_size(MemorySegment struct) {
        return struct.asSlice(__g_size$OFFSET, __g_size$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned int __g_size[2]
     * }
     */
    public static void __g_size(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, __g_size$OFFSET, __g_size$LAYOUT.byteSize());
    }

    private static long[] __g_size$DIMS = { 2 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * unsigned int __g_size[2]
     * }
     */
    public static long[] __g_size$dimensions() {
        return __g_size$DIMS;
    }
    private static final VarHandle __g_size$ELEM_HANDLE = __g_size$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * unsigned int __g_size[2]
     * }
     */
    public static int __g_size(MemorySegment struct, long index0) {
        return (int)__g_size$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * unsigned int __g_size[2]
     * }
     */
    public static void __g_size(MemorySegment struct, long index0, int fieldValue) {
        __g_size$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final OfInt __g1_orig_size$LAYOUT = (OfInt)$LAYOUT.select(groupElement("__g1_orig_size"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned int __g1_orig_size
     * }
     */
    public static final OfInt __g1_orig_size$layout() {
        return __g1_orig_size$LAYOUT;
    }

    private static final long __g1_orig_size$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned int __g1_orig_size
     * }
     */
    public static final long __g1_orig_size$offset() {
        return __g1_orig_size$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned int __g1_orig_size
     * }
     */
    public static int __g1_orig_size(MemorySegment struct) {
        return struct.get(__g1_orig_size$LAYOUT, __g1_orig_size$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned int __g1_orig_size
     * }
     */
    public static void __g1_orig_size(MemorySegment struct, int fieldValue) {
        struct.set(__g1_orig_size$LAYOUT, __g1_orig_size$OFFSET, fieldValue);
    }

    private static final OfInt __wrefs$LAYOUT = (OfInt)$LAYOUT.select(groupElement("__wrefs"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned int __wrefs
     * }
     */
    public static final OfInt __wrefs$layout() {
        return __wrefs$LAYOUT;
    }

    private static final long __wrefs$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned int __wrefs
     * }
     */
    public static final long __wrefs$offset() {
        return __wrefs$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned int __wrefs
     * }
     */
    public static int __wrefs(MemorySegment struct) {
        return struct.get(__wrefs$LAYOUT, __wrefs$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned int __wrefs
     * }
     */
    public static void __wrefs(MemorySegment struct, int fieldValue) {
        struct.set(__wrefs$LAYOUT, __wrefs$OFFSET, fieldValue);
    }

    private static final SequenceLayout __g_signals$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("__g_signals"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned int __g_signals[2]
     * }
     */
    public static final SequenceLayout __g_signals$layout() {
        return __g_signals$LAYOUT;
    }

    private static final long __g_signals$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned int __g_signals[2]
     * }
     */
    public static final long __g_signals$offset() {
        return __g_signals$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned int __g_signals[2]
     * }
     */
    public static MemorySegment __g_signals(MemorySegment struct) {
        return struct.asSlice(__g_signals$OFFSET, __g_signals$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned int __g_signals[2]
     * }
     */
    public static void __g_signals(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, __g_signals$OFFSET, __g_signals$LAYOUT.byteSize());
    }

    private static long[] __g_signals$DIMS = { 2 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * unsigned int __g_signals[2]
     * }
     */
    public static long[] __g_signals$dimensions() {
        return __g_signals$DIMS;
    }
    private static final VarHandle __g_signals$ELEM_HANDLE = __g_signals$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * unsigned int __g_signals[2]
     * }
     */
    public static int __g_signals(MemorySegment struct, long index0) {
        return (int)__g_signals$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * unsigned int __g_signals[2]
     * }
     */
    public static void __g_signals(MemorySegment struct, long index0, int fieldValue) {
        __g_signals$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

