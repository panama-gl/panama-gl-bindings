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
 * struct _CTL_INFO {
 *     DWORD dwVersion;
 *     CTL_USAGE SubjectUsage;
 *     CRYPT_DATA_BLOB ListIdentifier;
 *     CRYPT_INTEGER_BLOB SequenceNumber;
 *     FILETIME ThisUpdate;
 *     FILETIME NextUpdate;
 *     CRYPT_ALGORITHM_IDENTIFIER SubjectAlgorithm;
 *     DWORD cCTLEntry;
 *     PCTL_ENTRY rgCTLEntry;
 *     DWORD cExtension;
 *     PCERT_EXTENSION rgExtension;
 * }
 * }
 */
public class _CTL_INFO {

    _CTL_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG.withName("dwVersion"),
        MemoryLayout.paddingLayout(4),
        _CTL_USAGE.layout().withName("SubjectUsage"),
        _CRYPTOAPI_BLOB.layout().withName("ListIdentifier"),
        _CRYPTOAPI_BLOB.layout().withName("SequenceNumber"),
        _FILETIME.layout().withName("ThisUpdate"),
        _FILETIME.layout().withName("NextUpdate"),
        _CRYPT_ALGORITHM_IDENTIFIER.layout().withName("SubjectAlgorithm"),
        wgl_h.C_LONG.withName("cCTLEntry"),
        MemoryLayout.paddingLayout(4),
        wgl_h.C_POINTER.withName("rgCTLEntry"),
        wgl_h.C_LONG.withName("cExtension"),
        MemoryLayout.paddingLayout(4),
        wgl_h.C_POINTER.withName("rgExtension")
    ).withName("_CTL_INFO");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt dwVersion$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwVersion"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwVersion
     * }
     */
    public static final OfInt dwVersion$layout() {
        return dwVersion$LAYOUT;
    }

    private static final long dwVersion$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwVersion
     * }
     */
    public static final long dwVersion$offset() {
        return dwVersion$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwVersion
     * }
     */
    public static int dwVersion(MemorySegment struct) {
        return struct.get(dwVersion$LAYOUT, dwVersion$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwVersion
     * }
     */
    public static void dwVersion(MemorySegment struct, int fieldValue) {
        struct.set(dwVersion$LAYOUT, dwVersion$OFFSET, fieldValue);
    }

    private static final GroupLayout SubjectUsage$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("SubjectUsage"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CTL_USAGE SubjectUsage
     * }
     */
    public static final GroupLayout SubjectUsage$layout() {
        return SubjectUsage$LAYOUT;
    }

    private static final long SubjectUsage$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CTL_USAGE SubjectUsage
     * }
     */
    public static final long SubjectUsage$offset() {
        return SubjectUsage$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CTL_USAGE SubjectUsage
     * }
     */
    public static MemorySegment SubjectUsage(MemorySegment struct) {
        return struct.asSlice(SubjectUsage$OFFSET, SubjectUsage$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CTL_USAGE SubjectUsage
     * }
     */
    public static void SubjectUsage(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, SubjectUsage$OFFSET, SubjectUsage$LAYOUT.byteSize());
    }

    private static final GroupLayout ListIdentifier$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("ListIdentifier"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CRYPT_DATA_BLOB ListIdentifier
     * }
     */
    public static final GroupLayout ListIdentifier$layout() {
        return ListIdentifier$LAYOUT;
    }

    private static final long ListIdentifier$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CRYPT_DATA_BLOB ListIdentifier
     * }
     */
    public static final long ListIdentifier$offset() {
        return ListIdentifier$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CRYPT_DATA_BLOB ListIdentifier
     * }
     */
    public static MemorySegment ListIdentifier(MemorySegment struct) {
        return struct.asSlice(ListIdentifier$OFFSET, ListIdentifier$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CRYPT_DATA_BLOB ListIdentifier
     * }
     */
    public static void ListIdentifier(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, ListIdentifier$OFFSET, ListIdentifier$LAYOUT.byteSize());
    }

    private static final GroupLayout SequenceNumber$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("SequenceNumber"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CRYPT_INTEGER_BLOB SequenceNumber
     * }
     */
    public static final GroupLayout SequenceNumber$layout() {
        return SequenceNumber$LAYOUT;
    }

    private static final long SequenceNumber$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CRYPT_INTEGER_BLOB SequenceNumber
     * }
     */
    public static final long SequenceNumber$offset() {
        return SequenceNumber$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CRYPT_INTEGER_BLOB SequenceNumber
     * }
     */
    public static MemorySegment SequenceNumber(MemorySegment struct) {
        return struct.asSlice(SequenceNumber$OFFSET, SequenceNumber$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CRYPT_INTEGER_BLOB SequenceNumber
     * }
     */
    public static void SequenceNumber(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, SequenceNumber$OFFSET, SequenceNumber$LAYOUT.byteSize());
    }

    private static final GroupLayout ThisUpdate$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("ThisUpdate"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * FILETIME ThisUpdate
     * }
     */
    public static final GroupLayout ThisUpdate$layout() {
        return ThisUpdate$LAYOUT;
    }

    private static final long ThisUpdate$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * FILETIME ThisUpdate
     * }
     */
    public static final long ThisUpdate$offset() {
        return ThisUpdate$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * FILETIME ThisUpdate
     * }
     */
    public static MemorySegment ThisUpdate(MemorySegment struct) {
        return struct.asSlice(ThisUpdate$OFFSET, ThisUpdate$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * FILETIME ThisUpdate
     * }
     */
    public static void ThisUpdate(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, ThisUpdate$OFFSET, ThisUpdate$LAYOUT.byteSize());
    }

    private static final GroupLayout NextUpdate$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("NextUpdate"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * FILETIME NextUpdate
     * }
     */
    public static final GroupLayout NextUpdate$layout() {
        return NextUpdate$LAYOUT;
    }

    private static final long NextUpdate$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * FILETIME NextUpdate
     * }
     */
    public static final long NextUpdate$offset() {
        return NextUpdate$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * FILETIME NextUpdate
     * }
     */
    public static MemorySegment NextUpdate(MemorySegment struct) {
        return struct.asSlice(NextUpdate$OFFSET, NextUpdate$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * FILETIME NextUpdate
     * }
     */
    public static void NextUpdate(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, NextUpdate$OFFSET, NextUpdate$LAYOUT.byteSize());
    }

    private static final GroupLayout SubjectAlgorithm$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("SubjectAlgorithm"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CRYPT_ALGORITHM_IDENTIFIER SubjectAlgorithm
     * }
     */
    public static final GroupLayout SubjectAlgorithm$layout() {
        return SubjectAlgorithm$LAYOUT;
    }

    private static final long SubjectAlgorithm$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CRYPT_ALGORITHM_IDENTIFIER SubjectAlgorithm
     * }
     */
    public static final long SubjectAlgorithm$offset() {
        return SubjectAlgorithm$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CRYPT_ALGORITHM_IDENTIFIER SubjectAlgorithm
     * }
     */
    public static MemorySegment SubjectAlgorithm(MemorySegment struct) {
        return struct.asSlice(SubjectAlgorithm$OFFSET, SubjectAlgorithm$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CRYPT_ALGORITHM_IDENTIFIER SubjectAlgorithm
     * }
     */
    public static void SubjectAlgorithm(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, SubjectAlgorithm$OFFSET, SubjectAlgorithm$LAYOUT.byteSize());
    }

    private static final OfInt cCTLEntry$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cCTLEntry"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cCTLEntry
     * }
     */
    public static final OfInt cCTLEntry$layout() {
        return cCTLEntry$LAYOUT;
    }

    private static final long cCTLEntry$OFFSET = 96;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cCTLEntry
     * }
     */
    public static final long cCTLEntry$offset() {
        return cCTLEntry$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cCTLEntry
     * }
     */
    public static int cCTLEntry(MemorySegment struct) {
        return struct.get(cCTLEntry$LAYOUT, cCTLEntry$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cCTLEntry
     * }
     */
    public static void cCTLEntry(MemorySegment struct, int fieldValue) {
        struct.set(cCTLEntry$LAYOUT, cCTLEntry$OFFSET, fieldValue);
    }

    private static final AddressLayout rgCTLEntry$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("rgCTLEntry"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PCTL_ENTRY rgCTLEntry
     * }
     */
    public static final AddressLayout rgCTLEntry$layout() {
        return rgCTLEntry$LAYOUT;
    }

    private static final long rgCTLEntry$OFFSET = 104;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PCTL_ENTRY rgCTLEntry
     * }
     */
    public static final long rgCTLEntry$offset() {
        return rgCTLEntry$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PCTL_ENTRY rgCTLEntry
     * }
     */
    public static MemorySegment rgCTLEntry(MemorySegment struct) {
        return struct.get(rgCTLEntry$LAYOUT, rgCTLEntry$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PCTL_ENTRY rgCTLEntry
     * }
     */
    public static void rgCTLEntry(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(rgCTLEntry$LAYOUT, rgCTLEntry$OFFSET, fieldValue);
    }

    private static final OfInt cExtension$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cExtension"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cExtension
     * }
     */
    public static final OfInt cExtension$layout() {
        return cExtension$LAYOUT;
    }

    private static final long cExtension$OFFSET = 112;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cExtension
     * }
     */
    public static final long cExtension$offset() {
        return cExtension$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cExtension
     * }
     */
    public static int cExtension(MemorySegment struct) {
        return struct.get(cExtension$LAYOUT, cExtension$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cExtension
     * }
     */
    public static void cExtension(MemorySegment struct, int fieldValue) {
        struct.set(cExtension$LAYOUT, cExtension$OFFSET, fieldValue);
    }

    private static final AddressLayout rgExtension$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("rgExtension"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PCERT_EXTENSION rgExtension
     * }
     */
    public static final AddressLayout rgExtension$layout() {
        return rgExtension$LAYOUT;
    }

    private static final long rgExtension$OFFSET = 120;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PCERT_EXTENSION rgExtension
     * }
     */
    public static final long rgExtension$offset() {
        return rgExtension$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PCERT_EXTENSION rgExtension
     * }
     */
    public static MemorySegment rgExtension(MemorySegment struct) {
        return struct.get(rgExtension$LAYOUT, rgExtension$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PCERT_EXTENSION rgExtension
     * }
     */
    public static void rgExtension(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(rgExtension$LAYOUT, rgExtension$OFFSET, fieldValue);
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

