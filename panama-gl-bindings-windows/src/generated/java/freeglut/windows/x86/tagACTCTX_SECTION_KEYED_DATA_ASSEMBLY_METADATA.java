// Generated by jextract

package freeglut.windows.x86;

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
 * struct tagACTCTX_SECTION_KEYED_DATA_ASSEMBLY_METADATA {
 *     PVOID lpInformation;
 *     PVOID lpSectionBase;
 *     ULONG ulSectionLength;
 *     PVOID lpSectionGlobalDataBase;
 *     ULONG ulSectionGlobalDataLength;
 * }
 * }
 */
public class tagACTCTX_SECTION_KEYED_DATA_ASSEMBLY_METADATA {

    tagACTCTX_SECTION_KEYED_DATA_ASSEMBLY_METADATA() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        freeglut_h.C_POINTER.withName("lpInformation"),
        freeglut_h.C_POINTER.withName("lpSectionBase"),
        freeglut_h.C_LONG.withName("ulSectionLength"),
        MemoryLayout.paddingLayout(4),
        freeglut_h.C_POINTER.withName("lpSectionGlobalDataBase"),
        freeglut_h.C_LONG.withName("ulSectionGlobalDataLength"),
        MemoryLayout.paddingLayout(4)
    ).withName("tagACTCTX_SECTION_KEYED_DATA_ASSEMBLY_METADATA");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout lpInformation$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpInformation"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PVOID lpInformation
     * }
     */
    public static final AddressLayout lpInformation$layout() {
        return lpInformation$LAYOUT;
    }

    private static final long lpInformation$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PVOID lpInformation
     * }
     */
    public static final long lpInformation$offset() {
        return lpInformation$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PVOID lpInformation
     * }
     */
    public static MemorySegment lpInformation(MemorySegment struct) {
        return struct.get(lpInformation$LAYOUT, lpInformation$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PVOID lpInformation
     * }
     */
    public static void lpInformation(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpInformation$LAYOUT, lpInformation$OFFSET, fieldValue);
    }

    private static final AddressLayout lpSectionBase$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpSectionBase"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PVOID lpSectionBase
     * }
     */
    public static final AddressLayout lpSectionBase$layout() {
        return lpSectionBase$LAYOUT;
    }

    private static final long lpSectionBase$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PVOID lpSectionBase
     * }
     */
    public static final long lpSectionBase$offset() {
        return lpSectionBase$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PVOID lpSectionBase
     * }
     */
    public static MemorySegment lpSectionBase(MemorySegment struct) {
        return struct.get(lpSectionBase$LAYOUT, lpSectionBase$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PVOID lpSectionBase
     * }
     */
    public static void lpSectionBase(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpSectionBase$LAYOUT, lpSectionBase$OFFSET, fieldValue);
    }

    private static final OfInt ulSectionLength$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ulSectionLength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG ulSectionLength
     * }
     */
    public static final OfInt ulSectionLength$layout() {
        return ulSectionLength$LAYOUT;
    }

    private static final long ulSectionLength$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG ulSectionLength
     * }
     */
    public static final long ulSectionLength$offset() {
        return ulSectionLength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG ulSectionLength
     * }
     */
    public static int ulSectionLength(MemorySegment struct) {
        return struct.get(ulSectionLength$LAYOUT, ulSectionLength$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG ulSectionLength
     * }
     */
    public static void ulSectionLength(MemorySegment struct, int fieldValue) {
        struct.set(ulSectionLength$LAYOUT, ulSectionLength$OFFSET, fieldValue);
    }

    private static final AddressLayout lpSectionGlobalDataBase$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpSectionGlobalDataBase"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PVOID lpSectionGlobalDataBase
     * }
     */
    public static final AddressLayout lpSectionGlobalDataBase$layout() {
        return lpSectionGlobalDataBase$LAYOUT;
    }

    private static final long lpSectionGlobalDataBase$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PVOID lpSectionGlobalDataBase
     * }
     */
    public static final long lpSectionGlobalDataBase$offset() {
        return lpSectionGlobalDataBase$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PVOID lpSectionGlobalDataBase
     * }
     */
    public static MemorySegment lpSectionGlobalDataBase(MemorySegment struct) {
        return struct.get(lpSectionGlobalDataBase$LAYOUT, lpSectionGlobalDataBase$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PVOID lpSectionGlobalDataBase
     * }
     */
    public static void lpSectionGlobalDataBase(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpSectionGlobalDataBase$LAYOUT, lpSectionGlobalDataBase$OFFSET, fieldValue);
    }

    private static final OfInt ulSectionGlobalDataLength$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ulSectionGlobalDataLength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG ulSectionGlobalDataLength
     * }
     */
    public static final OfInt ulSectionGlobalDataLength$layout() {
        return ulSectionGlobalDataLength$LAYOUT;
    }

    private static final long ulSectionGlobalDataLength$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG ulSectionGlobalDataLength
     * }
     */
    public static final long ulSectionGlobalDataLength$offset() {
        return ulSectionGlobalDataLength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG ulSectionGlobalDataLength
     * }
     */
    public static int ulSectionGlobalDataLength(MemorySegment struct) {
        return struct.get(ulSectionGlobalDataLength$LAYOUT, ulSectionGlobalDataLength$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG ulSectionGlobalDataLength
     * }
     */
    public static void ulSectionGlobalDataLength(MemorySegment struct, int fieldValue) {
        struct.set(ulSectionGlobalDataLength$LAYOUT, ulSectionGlobalDataLength$OFFSET, fieldValue);
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

