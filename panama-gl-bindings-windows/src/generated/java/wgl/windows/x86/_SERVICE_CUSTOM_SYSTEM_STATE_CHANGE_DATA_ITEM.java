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
 * struct _SERVICE_CUSTOM_SYSTEM_STATE_CHANGE_DATA_ITEM {
 *     union {
 *         SERVICE_TRIGGER_CUSTOM_STATE_ID CustomStateId;
 *         struct {
 *             DWORD DataOffset;
 *             BYTE Data[1];
 *         } s;
 *     } u;
 * }
 * }
 */
public class _SERVICE_CUSTOM_SYSTEM_STATE_CHANGE_DATA_ITEM {

    _SERVICE_CUSTOM_SYSTEM_STATE_CHANGE_DATA_ITEM() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _SERVICE_CUSTOM_SYSTEM_STATE_CHANGE_DATA_ITEM.u.layout().withName("u")
    ).withName("_SERVICE_CUSTOM_SYSTEM_STATE_CHANGE_DATA_ITEM");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    /**
     * {@snippet lang=c :
     * union {
     *     SERVICE_TRIGGER_CUSTOM_STATE_ID CustomStateId;
     *     struct {
     *         DWORD DataOffset;
     *         BYTE Data[1];
     *     } s;
     * }
     * }
     */
    public static class u {

        u() {
            // Should not be called directly
        }

        private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout(
            SERVICE_TRIGGER_CUSTOM_STATE_ID.layout().withName("CustomStateId"),
            _SERVICE_CUSTOM_SYSTEM_STATE_CHANGE_DATA_ITEM.u.s.layout().withName("s")
        ).withName("$anon$478:5");

        /**
         * The layout of this union
         */
        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        private static final GroupLayout CustomStateId$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("CustomStateId"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * SERVICE_TRIGGER_CUSTOM_STATE_ID CustomStateId
         * }
         */
        public static final GroupLayout CustomStateId$layout() {
            return CustomStateId$LAYOUT;
        }

        private static final long CustomStateId$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * SERVICE_TRIGGER_CUSTOM_STATE_ID CustomStateId
         * }
         */
        public static final long CustomStateId$offset() {
            return CustomStateId$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * SERVICE_TRIGGER_CUSTOM_STATE_ID CustomStateId
         * }
         */
        public static MemorySegment CustomStateId(MemorySegment union) {
            return union.asSlice(CustomStateId$OFFSET, CustomStateId$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * SERVICE_TRIGGER_CUSTOM_STATE_ID CustomStateId
         * }
         */
        public static void CustomStateId(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, union, CustomStateId$OFFSET, CustomStateId$LAYOUT.byteSize());
        }

        /**
         * {@snippet lang=c :
         * struct {
         *     DWORD DataOffset;
         *     BYTE Data[1];
         * }
         * }
         */
        public static class s {

            s() {
                // Should not be called directly
            }

            private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
                wgl_h.C_LONG.withName("DataOffset"),
                MemoryLayout.sequenceLayout(1, wgl_h.C_CHAR).withName("Data"),
                MemoryLayout.paddingLayout(3)
            ).withName("$anon$480:9");

            /**
             * The layout of this struct
             */
            public static final GroupLayout layout() {
                return $LAYOUT;
            }

            private static final OfInt DataOffset$LAYOUT = (OfInt)$LAYOUT.select(groupElement("DataOffset"));

            /**
             * Layout for field:
             * {@snippet lang=c :
             * DWORD DataOffset
             * }
             */
            public static final OfInt DataOffset$layout() {
                return DataOffset$LAYOUT;
            }

            private static final long DataOffset$OFFSET = 0;

            /**
             * Offset for field:
             * {@snippet lang=c :
             * DWORD DataOffset
             * }
             */
            public static final long DataOffset$offset() {
                return DataOffset$OFFSET;
            }

            /**
             * Getter for field:
             * {@snippet lang=c :
             * DWORD DataOffset
             * }
             */
            public static int DataOffset(MemorySegment struct) {
                return struct.get(DataOffset$LAYOUT, DataOffset$OFFSET);
            }

            /**
             * Setter for field:
             * {@snippet lang=c :
             * DWORD DataOffset
             * }
             */
            public static void DataOffset(MemorySegment struct, int fieldValue) {
                struct.set(DataOffset$LAYOUT, DataOffset$OFFSET, fieldValue);
            }

            private static final SequenceLayout Data$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("Data"));

            /**
             * Layout for field:
             * {@snippet lang=c :
             * BYTE Data[1]
             * }
             */
            public static final SequenceLayout Data$layout() {
                return Data$LAYOUT;
            }

            private static final long Data$OFFSET = 4;

            /**
             * Offset for field:
             * {@snippet lang=c :
             * BYTE Data[1]
             * }
             */
            public static final long Data$offset() {
                return Data$OFFSET;
            }

            /**
             * Getter for field:
             * {@snippet lang=c :
             * BYTE Data[1]
             * }
             */
            public static MemorySegment Data(MemorySegment struct) {
                return struct.asSlice(Data$OFFSET, Data$LAYOUT.byteSize());
            }

            /**
             * Setter for field:
             * {@snippet lang=c :
             * BYTE Data[1]
             * }
             */
            public static void Data(MemorySegment struct, MemorySegment fieldValue) {
                MemorySegment.copy(fieldValue, 0L, struct, Data$OFFSET, Data$LAYOUT.byteSize());
            }

            private static long[] Data$DIMS = { 1 };

            /**
             * Dimensions for array field:
             * {@snippet lang=c :
             * BYTE Data[1]
             * }
             */
            public static long[] Data$dimensions() {
                return Data$DIMS;
            }
            private static final VarHandle Data$ELEM_HANDLE = Data$LAYOUT.varHandle(sequenceElement());

            /**
             * Indexed getter for field:
             * {@snippet lang=c :
             * BYTE Data[1]
             * }
             */
            public static byte Data(MemorySegment struct, long index0) {
                return (byte)Data$ELEM_HANDLE.get(struct, 0L, index0);
            }

            /**
             * Indexed setter for field:
             * {@snippet lang=c :
             * BYTE Data[1]
             * }
             */
            public static void Data(MemorySegment struct, long index0, byte fieldValue) {
                Data$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

        private static final GroupLayout s$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("s"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * struct {
         *     DWORD DataOffset;
         *     BYTE Data[1];
         * } s
         * }
         */
        public static final GroupLayout s$layout() {
            return s$LAYOUT;
        }

        private static final long s$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * struct {
         *     DWORD DataOffset;
         *     BYTE Data[1];
         * } s
         * }
         */
        public static final long s$offset() {
            return s$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * struct {
         *     DWORD DataOffset;
         *     BYTE Data[1];
         * } s
         * }
         */
        public static MemorySegment s(MemorySegment union) {
            return union.asSlice(s$OFFSET, s$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * struct {
         *     DWORD DataOffset;
         *     BYTE Data[1];
         * } s
         * }
         */
        public static void s(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, union, s$OFFSET, s$LAYOUT.byteSize());
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

    private static final GroupLayout u$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("u"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * union {
     *     SERVICE_TRIGGER_CUSTOM_STATE_ID CustomStateId;
     *     struct {
     *         DWORD DataOffset;
     *         BYTE Data[1];
     *     } s;
     * } u
     * }
     */
    public static final GroupLayout u$layout() {
        return u$LAYOUT;
    }

    private static final long u$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * union {
     *     SERVICE_TRIGGER_CUSTOM_STATE_ID CustomStateId;
     *     struct {
     *         DWORD DataOffset;
     *         BYTE Data[1];
     *     } s;
     * } u
     * }
     */
    public static final long u$offset() {
        return u$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * union {
     *     SERVICE_TRIGGER_CUSTOM_STATE_ID CustomStateId;
     *     struct {
     *         DWORD DataOffset;
     *         BYTE Data[1];
     *     } s;
     * } u
     * }
     */
    public static MemorySegment u(MemorySegment struct) {
        return struct.asSlice(u$OFFSET, u$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * union {
     *     SERVICE_TRIGGER_CUSTOM_STATE_ID CustomStateId;
     *     struct {
     *         DWORD DataOffset;
     *         BYTE Data[1];
     *     } s;
     * } u
     * }
     */
    public static void u(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, u$OFFSET, u$LAYOUT.byteSize());
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

