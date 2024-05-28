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
 * struct _BCRYPT_DH_KEY_BLOB {
 *     ULONG dwMagic;
 *     ULONG cbKey;
 * }
 * }
 */
public class _BCRYPT_DH_KEY_BLOB {

    _BCRYPT_DH_KEY_BLOB() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG.withName("dwMagic"),
        wgl_h.C_LONG.withName("cbKey")
    ).withName("_BCRYPT_DH_KEY_BLOB");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt dwMagic$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwMagic"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG dwMagic
     * }
     */
    public static final OfInt dwMagic$layout() {
        return dwMagic$LAYOUT;
    }

    private static final long dwMagic$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG dwMagic
     * }
     */
    public static final long dwMagic$offset() {
        return dwMagic$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG dwMagic
     * }
     */
    public static int dwMagic(MemorySegment struct) {
        return struct.get(dwMagic$LAYOUT, dwMagic$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG dwMagic
     * }
     */
    public static void dwMagic(MemorySegment struct, int fieldValue) {
        struct.set(dwMagic$LAYOUT, dwMagic$OFFSET, fieldValue);
    }

    private static final OfInt cbKey$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbKey"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG cbKey
     * }
     */
    public static final OfInt cbKey$layout() {
        return cbKey$LAYOUT;
    }

    private static final long cbKey$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG cbKey
     * }
     */
    public static final long cbKey$offset() {
        return cbKey$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG cbKey
     * }
     */
    public static int cbKey(MemorySegment struct) {
        return struct.get(cbKey$LAYOUT, cbKey$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG cbKey
     * }
     */
    public static void cbKey(MemorySegment struct, int fieldValue) {
        struct.set(cbKey$LAYOUT, cbKey$OFFSET, fieldValue);
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

