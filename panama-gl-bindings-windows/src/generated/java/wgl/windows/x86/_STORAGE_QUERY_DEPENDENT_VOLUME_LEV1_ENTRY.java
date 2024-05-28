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
 * struct _STORAGE_QUERY_DEPENDENT_VOLUME_LEV1_ENTRY {
 *     DWORD EntryLength;
 *     DWORD DependencyTypeFlags;
 *     DWORD ProviderSpecificFlags;
 *     VIRTUAL_STORAGE_TYPE VirtualStorageType;
 * }
 * }
 */
public class _STORAGE_QUERY_DEPENDENT_VOLUME_LEV1_ENTRY {

    _STORAGE_QUERY_DEPENDENT_VOLUME_LEV1_ENTRY() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG.withName("EntryLength"),
        wgl_h.C_LONG.withName("DependencyTypeFlags"),
        wgl_h.C_LONG.withName("ProviderSpecificFlags"),
        _VIRTUAL_STORAGE_TYPE.layout().withName("VirtualStorageType")
    ).withName("_STORAGE_QUERY_DEPENDENT_VOLUME_LEV1_ENTRY");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt EntryLength$LAYOUT = (OfInt)$LAYOUT.select(groupElement("EntryLength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD EntryLength
     * }
     */
    public static final OfInt EntryLength$layout() {
        return EntryLength$LAYOUT;
    }

    private static final long EntryLength$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD EntryLength
     * }
     */
    public static final long EntryLength$offset() {
        return EntryLength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD EntryLength
     * }
     */
    public static int EntryLength(MemorySegment struct) {
        return struct.get(EntryLength$LAYOUT, EntryLength$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD EntryLength
     * }
     */
    public static void EntryLength(MemorySegment struct, int fieldValue) {
        struct.set(EntryLength$LAYOUT, EntryLength$OFFSET, fieldValue);
    }

    private static final OfInt DependencyTypeFlags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("DependencyTypeFlags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD DependencyTypeFlags
     * }
     */
    public static final OfInt DependencyTypeFlags$layout() {
        return DependencyTypeFlags$LAYOUT;
    }

    private static final long DependencyTypeFlags$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD DependencyTypeFlags
     * }
     */
    public static final long DependencyTypeFlags$offset() {
        return DependencyTypeFlags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD DependencyTypeFlags
     * }
     */
    public static int DependencyTypeFlags(MemorySegment struct) {
        return struct.get(DependencyTypeFlags$LAYOUT, DependencyTypeFlags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD DependencyTypeFlags
     * }
     */
    public static void DependencyTypeFlags(MemorySegment struct, int fieldValue) {
        struct.set(DependencyTypeFlags$LAYOUT, DependencyTypeFlags$OFFSET, fieldValue);
    }

    private static final OfInt ProviderSpecificFlags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ProviderSpecificFlags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ProviderSpecificFlags
     * }
     */
    public static final OfInt ProviderSpecificFlags$layout() {
        return ProviderSpecificFlags$LAYOUT;
    }

    private static final long ProviderSpecificFlags$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ProviderSpecificFlags
     * }
     */
    public static final long ProviderSpecificFlags$offset() {
        return ProviderSpecificFlags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ProviderSpecificFlags
     * }
     */
    public static int ProviderSpecificFlags(MemorySegment struct) {
        return struct.get(ProviderSpecificFlags$LAYOUT, ProviderSpecificFlags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ProviderSpecificFlags
     * }
     */
    public static void ProviderSpecificFlags(MemorySegment struct, int fieldValue) {
        struct.set(ProviderSpecificFlags$LAYOUT, ProviderSpecificFlags$OFFSET, fieldValue);
    }

    private static final GroupLayout VirtualStorageType$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("VirtualStorageType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VIRTUAL_STORAGE_TYPE VirtualStorageType
     * }
     */
    public static final GroupLayout VirtualStorageType$layout() {
        return VirtualStorageType$LAYOUT;
    }

    private static final long VirtualStorageType$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VIRTUAL_STORAGE_TYPE VirtualStorageType
     * }
     */
    public static final long VirtualStorageType$offset() {
        return VirtualStorageType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VIRTUAL_STORAGE_TYPE VirtualStorageType
     * }
     */
    public static MemorySegment VirtualStorageType(MemorySegment struct) {
        return struct.asSlice(VirtualStorageType$OFFSET, VirtualStorageType$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VIRTUAL_STORAGE_TYPE VirtualStorageType
     * }
     */
    public static void VirtualStorageType(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, VirtualStorageType$OFFSET, VirtualStorageType$LAYOUT.byteSize());
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

