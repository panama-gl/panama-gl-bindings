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
 * struct tagPROPSPEC {
 *     ULONG ulKind;
 *     union {
 *         PROPID propid;
 *         LPOLESTR lpwstr;
 *     };
 * }
 * }
 */
public class tagPROPSPEC {

    tagPROPSPEC() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG.withName("ulKind"),
        MemoryLayout.paddingLayout(4),
        MemoryLayout.unionLayout(
            wgl_h.C_LONG.withName("propid"),
            wgl_h.C_POINTER.withName("lpwstr")
        ).withName("$anon$444:43")
    ).withName("tagPROPSPEC");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt ulKind$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ulKind"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG ulKind
     * }
     */
    public static final OfInt ulKind$layout() {
        return ulKind$LAYOUT;
    }

    private static final long ulKind$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG ulKind
     * }
     */
    public static final long ulKind$offset() {
        return ulKind$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG ulKind
     * }
     */
    public static int ulKind(MemorySegment struct) {
        return struct.get(ulKind$LAYOUT, ulKind$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG ulKind
     * }
     */
    public static void ulKind(MemorySegment struct, int fieldValue) {
        struct.set(ulKind$LAYOUT, ulKind$OFFSET, fieldValue);
    }

    private static final OfInt propid$LAYOUT = (OfInt)$LAYOUT.select(groupElement("$anon$444:43"), groupElement("propid"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PROPID propid
     * }
     */
    public static final OfInt propid$layout() {
        return propid$LAYOUT;
    }

    private static final long propid$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PROPID propid
     * }
     */
    public static final long propid$offset() {
        return propid$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PROPID propid
     * }
     */
    public static int propid(MemorySegment struct) {
        return struct.get(propid$LAYOUT, propid$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PROPID propid
     * }
     */
    public static void propid(MemorySegment struct, int fieldValue) {
        struct.set(propid$LAYOUT, propid$OFFSET, fieldValue);
    }

    private static final AddressLayout lpwstr$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("$anon$444:43"), groupElement("lpwstr"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPOLESTR lpwstr
     * }
     */
    public static final AddressLayout lpwstr$layout() {
        return lpwstr$LAYOUT;
    }

    private static final long lpwstr$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPOLESTR lpwstr
     * }
     */
    public static final long lpwstr$offset() {
        return lpwstr$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPOLESTR lpwstr
     * }
     */
    public static MemorySegment lpwstr(MemorySegment struct) {
        return struct.get(lpwstr$LAYOUT, lpwstr$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPOLESTR lpwstr
     * }
     */
    public static void lpwstr(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpwstr$LAYOUT, lpwstr$OFFSET, fieldValue);
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

