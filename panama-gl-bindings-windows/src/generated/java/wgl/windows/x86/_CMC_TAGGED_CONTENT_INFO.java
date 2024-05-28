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
 * struct _CMC_TAGGED_CONTENT_INFO {
 *     DWORD dwBodyPartID;
 *     CRYPT_DER_BLOB EncodedContentInfo;
 * }
 * }
 */
public class _CMC_TAGGED_CONTENT_INFO {

    _CMC_TAGGED_CONTENT_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG.withName("dwBodyPartID"),
        MemoryLayout.paddingLayout(4),
        _CRYPTOAPI_BLOB.layout().withName("EncodedContentInfo")
    ).withName("_CMC_TAGGED_CONTENT_INFO");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt dwBodyPartID$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwBodyPartID"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwBodyPartID
     * }
     */
    public static final OfInt dwBodyPartID$layout() {
        return dwBodyPartID$LAYOUT;
    }

    private static final long dwBodyPartID$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwBodyPartID
     * }
     */
    public static final long dwBodyPartID$offset() {
        return dwBodyPartID$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwBodyPartID
     * }
     */
    public static int dwBodyPartID(MemorySegment struct) {
        return struct.get(dwBodyPartID$LAYOUT, dwBodyPartID$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwBodyPartID
     * }
     */
    public static void dwBodyPartID(MemorySegment struct, int fieldValue) {
        struct.set(dwBodyPartID$LAYOUT, dwBodyPartID$OFFSET, fieldValue);
    }

    private static final GroupLayout EncodedContentInfo$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("EncodedContentInfo"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CRYPT_DER_BLOB EncodedContentInfo
     * }
     */
    public static final GroupLayout EncodedContentInfo$layout() {
        return EncodedContentInfo$LAYOUT;
    }

    private static final long EncodedContentInfo$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CRYPT_DER_BLOB EncodedContentInfo
     * }
     */
    public static final long EncodedContentInfo$offset() {
        return EncodedContentInfo$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CRYPT_DER_BLOB EncodedContentInfo
     * }
     */
    public static MemorySegment EncodedContentInfo(MemorySegment struct) {
        return struct.asSlice(EncodedContentInfo$OFFSET, EncodedContentInfo$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CRYPT_DER_BLOB EncodedContentInfo
     * }
     */
    public static void EncodedContentInfo(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, EncodedContentInfo$OFFSET, EncodedContentInfo$LAYOUT.byteSize());
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

