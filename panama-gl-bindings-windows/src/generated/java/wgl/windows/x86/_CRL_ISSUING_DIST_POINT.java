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
 * struct _CRL_ISSUING_DIST_POINT {
 *     CRL_DIST_POINT_NAME DistPointName;
 *     BOOL fOnlyContainsUserCerts;
 *     BOOL fOnlyContainsCACerts;
 *     CRYPT_BIT_BLOB OnlySomeReasonFlags;
 *     BOOL fIndirectCRL;
 * }
 * }
 */
public class _CRL_ISSUING_DIST_POINT {

    _CRL_ISSUING_DIST_POINT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _CRL_DIST_POINT_NAME.layout().withName("DistPointName"),
        wgl_h.C_INT.withName("fOnlyContainsUserCerts"),
        wgl_h.C_INT.withName("fOnlyContainsCACerts"),
        _CRYPT_BIT_BLOB.layout().withName("OnlySomeReasonFlags"),
        wgl_h.C_INT.withName("fIndirectCRL"),
        MemoryLayout.paddingLayout(4)
    ).withName("_CRL_ISSUING_DIST_POINT");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout DistPointName$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("DistPointName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CRL_DIST_POINT_NAME DistPointName
     * }
     */
    public static final GroupLayout DistPointName$layout() {
        return DistPointName$LAYOUT;
    }

    private static final long DistPointName$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CRL_DIST_POINT_NAME DistPointName
     * }
     */
    public static final long DistPointName$offset() {
        return DistPointName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CRL_DIST_POINT_NAME DistPointName
     * }
     */
    public static MemorySegment DistPointName(MemorySegment struct) {
        return struct.asSlice(DistPointName$OFFSET, DistPointName$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CRL_DIST_POINT_NAME DistPointName
     * }
     */
    public static void DistPointName(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, DistPointName$OFFSET, DistPointName$LAYOUT.byteSize());
    }

    private static final OfInt fOnlyContainsUserCerts$LAYOUT = (OfInt)$LAYOUT.select(groupElement("fOnlyContainsUserCerts"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOL fOnlyContainsUserCerts
     * }
     */
    public static final OfInt fOnlyContainsUserCerts$layout() {
        return fOnlyContainsUserCerts$LAYOUT;
    }

    private static final long fOnlyContainsUserCerts$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOL fOnlyContainsUserCerts
     * }
     */
    public static final long fOnlyContainsUserCerts$offset() {
        return fOnlyContainsUserCerts$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOL fOnlyContainsUserCerts
     * }
     */
    public static int fOnlyContainsUserCerts(MemorySegment struct) {
        return struct.get(fOnlyContainsUserCerts$LAYOUT, fOnlyContainsUserCerts$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOL fOnlyContainsUserCerts
     * }
     */
    public static void fOnlyContainsUserCerts(MemorySegment struct, int fieldValue) {
        struct.set(fOnlyContainsUserCerts$LAYOUT, fOnlyContainsUserCerts$OFFSET, fieldValue);
    }

    private static final OfInt fOnlyContainsCACerts$LAYOUT = (OfInt)$LAYOUT.select(groupElement("fOnlyContainsCACerts"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOL fOnlyContainsCACerts
     * }
     */
    public static final OfInt fOnlyContainsCACerts$layout() {
        return fOnlyContainsCACerts$LAYOUT;
    }

    private static final long fOnlyContainsCACerts$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOL fOnlyContainsCACerts
     * }
     */
    public static final long fOnlyContainsCACerts$offset() {
        return fOnlyContainsCACerts$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOL fOnlyContainsCACerts
     * }
     */
    public static int fOnlyContainsCACerts(MemorySegment struct) {
        return struct.get(fOnlyContainsCACerts$LAYOUT, fOnlyContainsCACerts$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOL fOnlyContainsCACerts
     * }
     */
    public static void fOnlyContainsCACerts(MemorySegment struct, int fieldValue) {
        struct.set(fOnlyContainsCACerts$LAYOUT, fOnlyContainsCACerts$OFFSET, fieldValue);
    }

    private static final GroupLayout OnlySomeReasonFlags$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("OnlySomeReasonFlags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CRYPT_BIT_BLOB OnlySomeReasonFlags
     * }
     */
    public static final GroupLayout OnlySomeReasonFlags$layout() {
        return OnlySomeReasonFlags$LAYOUT;
    }

    private static final long OnlySomeReasonFlags$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CRYPT_BIT_BLOB OnlySomeReasonFlags
     * }
     */
    public static final long OnlySomeReasonFlags$offset() {
        return OnlySomeReasonFlags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CRYPT_BIT_BLOB OnlySomeReasonFlags
     * }
     */
    public static MemorySegment OnlySomeReasonFlags(MemorySegment struct) {
        return struct.asSlice(OnlySomeReasonFlags$OFFSET, OnlySomeReasonFlags$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CRYPT_BIT_BLOB OnlySomeReasonFlags
     * }
     */
    public static void OnlySomeReasonFlags(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, OnlySomeReasonFlags$OFFSET, OnlySomeReasonFlags$LAYOUT.byteSize());
    }

    private static final OfInt fIndirectCRL$LAYOUT = (OfInt)$LAYOUT.select(groupElement("fIndirectCRL"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOL fIndirectCRL
     * }
     */
    public static final OfInt fIndirectCRL$layout() {
        return fIndirectCRL$LAYOUT;
    }

    private static final long fIndirectCRL$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOL fIndirectCRL
     * }
     */
    public static final long fIndirectCRL$offset() {
        return fIndirectCRL$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOL fIndirectCRL
     * }
     */
    public static int fIndirectCRL(MemorySegment struct) {
        return struct.get(fIndirectCRL$LAYOUT, fIndirectCRL$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOL fIndirectCRL
     * }
     */
    public static void fIndirectCRL(MemorySegment struct, int fieldValue) {
        struct.set(fIndirectCRL$LAYOUT, fIndirectCRL$OFFSET, fieldValue);
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

