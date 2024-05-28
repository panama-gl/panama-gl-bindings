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
 * struct _HMAC_Info {
 *     ALG_ID HashAlgid;
 *     BYTE *pbInnerString;
 *     DWORD cbInnerString;
 *     BYTE *pbOuterString;
 *     DWORD cbOuterString;
 * }
 * }
 */
public class _HMAC_Info {

    _HMAC_Info() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_INT.withName("HashAlgid"),
        MemoryLayout.paddingLayout(4),
        wgl_h.C_POINTER.withName("pbInnerString"),
        wgl_h.C_LONG.withName("cbInnerString"),
        MemoryLayout.paddingLayout(4),
        wgl_h.C_POINTER.withName("pbOuterString"),
        wgl_h.C_LONG.withName("cbOuterString"),
        MemoryLayout.paddingLayout(4)
    ).withName("_HMAC_Info");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt HashAlgid$LAYOUT = (OfInt)$LAYOUT.select(groupElement("HashAlgid"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ALG_ID HashAlgid
     * }
     */
    public static final OfInt HashAlgid$layout() {
        return HashAlgid$LAYOUT;
    }

    private static final long HashAlgid$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ALG_ID HashAlgid
     * }
     */
    public static final long HashAlgid$offset() {
        return HashAlgid$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ALG_ID HashAlgid
     * }
     */
    public static int HashAlgid(MemorySegment struct) {
        return struct.get(HashAlgid$LAYOUT, HashAlgid$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ALG_ID HashAlgid
     * }
     */
    public static void HashAlgid(MemorySegment struct, int fieldValue) {
        struct.set(HashAlgid$LAYOUT, HashAlgid$OFFSET, fieldValue);
    }

    private static final AddressLayout pbInnerString$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pbInnerString"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE *pbInnerString
     * }
     */
    public static final AddressLayout pbInnerString$layout() {
        return pbInnerString$LAYOUT;
    }

    private static final long pbInnerString$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE *pbInnerString
     * }
     */
    public static final long pbInnerString$offset() {
        return pbInnerString$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE *pbInnerString
     * }
     */
    public static MemorySegment pbInnerString(MemorySegment struct) {
        return struct.get(pbInnerString$LAYOUT, pbInnerString$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE *pbInnerString
     * }
     */
    public static void pbInnerString(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pbInnerString$LAYOUT, pbInnerString$OFFSET, fieldValue);
    }

    private static final OfInt cbInnerString$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbInnerString"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cbInnerString
     * }
     */
    public static final OfInt cbInnerString$layout() {
        return cbInnerString$LAYOUT;
    }

    private static final long cbInnerString$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cbInnerString
     * }
     */
    public static final long cbInnerString$offset() {
        return cbInnerString$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cbInnerString
     * }
     */
    public static int cbInnerString(MemorySegment struct) {
        return struct.get(cbInnerString$LAYOUT, cbInnerString$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cbInnerString
     * }
     */
    public static void cbInnerString(MemorySegment struct, int fieldValue) {
        struct.set(cbInnerString$LAYOUT, cbInnerString$OFFSET, fieldValue);
    }

    private static final AddressLayout pbOuterString$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pbOuterString"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE *pbOuterString
     * }
     */
    public static final AddressLayout pbOuterString$layout() {
        return pbOuterString$LAYOUT;
    }

    private static final long pbOuterString$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE *pbOuterString
     * }
     */
    public static final long pbOuterString$offset() {
        return pbOuterString$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE *pbOuterString
     * }
     */
    public static MemorySegment pbOuterString(MemorySegment struct) {
        return struct.get(pbOuterString$LAYOUT, pbOuterString$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE *pbOuterString
     * }
     */
    public static void pbOuterString(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pbOuterString$LAYOUT, pbOuterString$OFFSET, fieldValue);
    }

    private static final OfInt cbOuterString$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbOuterString"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cbOuterString
     * }
     */
    public static final OfInt cbOuterString$layout() {
        return cbOuterString$LAYOUT;
    }

    private static final long cbOuterString$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cbOuterString
     * }
     */
    public static final long cbOuterString$offset() {
        return cbOuterString$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cbOuterString
     * }
     */
    public static int cbOuterString(MemorySegment struct) {
        return struct.get(cbOuterString$LAYOUT, cbOuterString$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cbOuterString
     * }
     */
    public static void cbOuterString(MemorySegment struct, int fieldValue) {
        struct.set(cbOuterString$LAYOUT, cbOuterString$OFFSET, fieldValue);
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

