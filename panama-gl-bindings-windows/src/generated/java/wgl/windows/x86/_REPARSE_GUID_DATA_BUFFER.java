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
 * struct _REPARSE_GUID_DATA_BUFFER {
 *     DWORD ReparseTag;
 *     WORD ReparseDataLength;
 *     WORD Reserved;
 *     GUID ReparseGuid;
 *     struct {
 *         BYTE DataBuffer[1];
 *     } GenericReparseBuffer;
 * }
 * }
 */
public class _REPARSE_GUID_DATA_BUFFER {

    _REPARSE_GUID_DATA_BUFFER() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG.withName("ReparseTag"),
        wgl_h.C_SHORT.withName("ReparseDataLength"),
        wgl_h.C_SHORT.withName("Reserved"),
        _GUID.layout().withName("ReparseGuid"),
        _REPARSE_GUID_DATA_BUFFER.GenericReparseBuffer.layout().withName("GenericReparseBuffer"),
        MemoryLayout.paddingLayout(3)
    ).withName("_REPARSE_GUID_DATA_BUFFER");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt ReparseTag$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ReparseTag"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ReparseTag
     * }
     */
    public static final OfInt ReparseTag$layout() {
        return ReparseTag$LAYOUT;
    }

    private static final long ReparseTag$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ReparseTag
     * }
     */
    public static final long ReparseTag$offset() {
        return ReparseTag$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ReparseTag
     * }
     */
    public static int ReparseTag(MemorySegment struct) {
        return struct.get(ReparseTag$LAYOUT, ReparseTag$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ReparseTag
     * }
     */
    public static void ReparseTag(MemorySegment struct, int fieldValue) {
        struct.set(ReparseTag$LAYOUT, ReparseTag$OFFSET, fieldValue);
    }

    private static final OfShort ReparseDataLength$LAYOUT = (OfShort)$LAYOUT.select(groupElement("ReparseDataLength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD ReparseDataLength
     * }
     */
    public static final OfShort ReparseDataLength$layout() {
        return ReparseDataLength$LAYOUT;
    }

    private static final long ReparseDataLength$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD ReparseDataLength
     * }
     */
    public static final long ReparseDataLength$offset() {
        return ReparseDataLength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD ReparseDataLength
     * }
     */
    public static short ReparseDataLength(MemorySegment struct) {
        return struct.get(ReparseDataLength$LAYOUT, ReparseDataLength$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD ReparseDataLength
     * }
     */
    public static void ReparseDataLength(MemorySegment struct, short fieldValue) {
        struct.set(ReparseDataLength$LAYOUT, ReparseDataLength$OFFSET, fieldValue);
    }

    private static final OfShort Reserved$LAYOUT = (OfShort)$LAYOUT.select(groupElement("Reserved"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD Reserved
     * }
     */
    public static final OfShort Reserved$layout() {
        return Reserved$LAYOUT;
    }

    private static final long Reserved$OFFSET = 6;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD Reserved
     * }
     */
    public static final long Reserved$offset() {
        return Reserved$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD Reserved
     * }
     */
    public static short Reserved(MemorySegment struct) {
        return struct.get(Reserved$LAYOUT, Reserved$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD Reserved
     * }
     */
    public static void Reserved(MemorySegment struct, short fieldValue) {
        struct.set(Reserved$LAYOUT, Reserved$OFFSET, fieldValue);
    }

    private static final GroupLayout ReparseGuid$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("ReparseGuid"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GUID ReparseGuid
     * }
     */
    public static final GroupLayout ReparseGuid$layout() {
        return ReparseGuid$LAYOUT;
    }

    private static final long ReparseGuid$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GUID ReparseGuid
     * }
     */
    public static final long ReparseGuid$offset() {
        return ReparseGuid$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GUID ReparseGuid
     * }
     */
    public static MemorySegment ReparseGuid(MemorySegment struct) {
        return struct.asSlice(ReparseGuid$OFFSET, ReparseGuid$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GUID ReparseGuid
     * }
     */
    public static void ReparseGuid(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, ReparseGuid$OFFSET, ReparseGuid$LAYOUT.byteSize());
    }

    /**
     * {@snippet lang=c :
     * struct {
     *     BYTE DataBuffer[1];
     * }
     * }
     */
    public static class GenericReparseBuffer {

        GenericReparseBuffer() {
            // Should not be called directly
        }

        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(1, wgl_h.C_CHAR).withName("DataBuffer")
        ).withName("$anon$13453:5");

        /**
         * The layout of this struct
         */
        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        private static final SequenceLayout DataBuffer$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("DataBuffer"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * BYTE DataBuffer[1]
         * }
         */
        public static final SequenceLayout DataBuffer$layout() {
            return DataBuffer$LAYOUT;
        }

        private static final long DataBuffer$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * BYTE DataBuffer[1]
         * }
         */
        public static final long DataBuffer$offset() {
            return DataBuffer$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * BYTE DataBuffer[1]
         * }
         */
        public static MemorySegment DataBuffer(MemorySegment struct) {
            return struct.asSlice(DataBuffer$OFFSET, DataBuffer$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * BYTE DataBuffer[1]
         * }
         */
        public static void DataBuffer(MemorySegment struct, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, struct, DataBuffer$OFFSET, DataBuffer$LAYOUT.byteSize());
        }

        private static long[] DataBuffer$DIMS = { 1 };

        /**
         * Dimensions for array field:
         * {@snippet lang=c :
         * BYTE DataBuffer[1]
         * }
         */
        public static long[] DataBuffer$dimensions() {
            return DataBuffer$DIMS;
        }
        private static final VarHandle DataBuffer$ELEM_HANDLE = DataBuffer$LAYOUT.varHandle(sequenceElement());

        /**
         * Indexed getter for field:
         * {@snippet lang=c :
         * BYTE DataBuffer[1]
         * }
         */
        public static byte DataBuffer(MemorySegment struct, long index0) {
            return (byte)DataBuffer$ELEM_HANDLE.get(struct, 0L, index0);
        }

        /**
         * Indexed setter for field:
         * {@snippet lang=c :
         * BYTE DataBuffer[1]
         * }
         */
        public static void DataBuffer(MemorySegment struct, long index0, byte fieldValue) {
            DataBuffer$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

    private static final GroupLayout GenericReparseBuffer$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("GenericReparseBuffer"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct {
     *     BYTE DataBuffer[1];
     * } GenericReparseBuffer
     * }
     */
    public static final GroupLayout GenericReparseBuffer$layout() {
        return GenericReparseBuffer$LAYOUT;
    }

    private static final long GenericReparseBuffer$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct {
     *     BYTE DataBuffer[1];
     * } GenericReparseBuffer
     * }
     */
    public static final long GenericReparseBuffer$offset() {
        return GenericReparseBuffer$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct {
     *     BYTE DataBuffer[1];
     * } GenericReparseBuffer
     * }
     */
    public static MemorySegment GenericReparseBuffer(MemorySegment struct) {
        return struct.asSlice(GenericReparseBuffer$OFFSET, GenericReparseBuffer$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct {
     *     BYTE DataBuffer[1];
     * } GenericReparseBuffer
     * }
     */
    public static void GenericReparseBuffer(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, GenericReparseBuffer$OFFSET, GenericReparseBuffer$LAYOUT.byteSize());
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

