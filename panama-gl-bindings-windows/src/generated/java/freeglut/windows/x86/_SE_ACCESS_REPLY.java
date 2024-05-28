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
 * struct _SE_ACCESS_REPLY {
 *     DWORD Size;
 *     DWORD ResultListCount;
 *     PACCESS_MASK GrantedAccess;
 *     PDWORD AccessStatus;
 *     PACCESS_REASONS AccessReason;
 *     PPRIVILEGE_SET *Privileges;
 * }
 * }
 */
public class _SE_ACCESS_REPLY {

    _SE_ACCESS_REPLY() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        freeglut_h.C_LONG.withName("Size"),
        freeglut_h.C_LONG.withName("ResultListCount"),
        freeglut_h.C_POINTER.withName("GrantedAccess"),
        freeglut_h.C_POINTER.withName("AccessStatus"),
        freeglut_h.C_POINTER.withName("AccessReason"),
        freeglut_h.C_POINTER.withName("Privileges")
    ).withName("_SE_ACCESS_REPLY");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt Size$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Size"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Size
     * }
     */
    public static final OfInt Size$layout() {
        return Size$LAYOUT;
    }

    private static final long Size$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Size
     * }
     */
    public static final long Size$offset() {
        return Size$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Size
     * }
     */
    public static int Size(MemorySegment struct) {
        return struct.get(Size$LAYOUT, Size$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Size
     * }
     */
    public static void Size(MemorySegment struct, int fieldValue) {
        struct.set(Size$LAYOUT, Size$OFFSET, fieldValue);
    }

    private static final OfInt ResultListCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ResultListCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ResultListCount
     * }
     */
    public static final OfInt ResultListCount$layout() {
        return ResultListCount$LAYOUT;
    }

    private static final long ResultListCount$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ResultListCount
     * }
     */
    public static final long ResultListCount$offset() {
        return ResultListCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ResultListCount
     * }
     */
    public static int ResultListCount(MemorySegment struct) {
        return struct.get(ResultListCount$LAYOUT, ResultListCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ResultListCount
     * }
     */
    public static void ResultListCount(MemorySegment struct, int fieldValue) {
        struct.set(ResultListCount$LAYOUT, ResultListCount$OFFSET, fieldValue);
    }

    private static final AddressLayout GrantedAccess$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("GrantedAccess"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PACCESS_MASK GrantedAccess
     * }
     */
    public static final AddressLayout GrantedAccess$layout() {
        return GrantedAccess$LAYOUT;
    }

    private static final long GrantedAccess$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PACCESS_MASK GrantedAccess
     * }
     */
    public static final long GrantedAccess$offset() {
        return GrantedAccess$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PACCESS_MASK GrantedAccess
     * }
     */
    public static MemorySegment GrantedAccess(MemorySegment struct) {
        return struct.get(GrantedAccess$LAYOUT, GrantedAccess$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PACCESS_MASK GrantedAccess
     * }
     */
    public static void GrantedAccess(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(GrantedAccess$LAYOUT, GrantedAccess$OFFSET, fieldValue);
    }

    private static final AddressLayout AccessStatus$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("AccessStatus"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PDWORD AccessStatus
     * }
     */
    public static final AddressLayout AccessStatus$layout() {
        return AccessStatus$LAYOUT;
    }

    private static final long AccessStatus$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PDWORD AccessStatus
     * }
     */
    public static final long AccessStatus$offset() {
        return AccessStatus$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PDWORD AccessStatus
     * }
     */
    public static MemorySegment AccessStatus(MemorySegment struct) {
        return struct.get(AccessStatus$LAYOUT, AccessStatus$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PDWORD AccessStatus
     * }
     */
    public static void AccessStatus(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(AccessStatus$LAYOUT, AccessStatus$OFFSET, fieldValue);
    }

    private static final AddressLayout AccessReason$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("AccessReason"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PACCESS_REASONS AccessReason
     * }
     */
    public static final AddressLayout AccessReason$layout() {
        return AccessReason$LAYOUT;
    }

    private static final long AccessReason$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PACCESS_REASONS AccessReason
     * }
     */
    public static final long AccessReason$offset() {
        return AccessReason$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PACCESS_REASONS AccessReason
     * }
     */
    public static MemorySegment AccessReason(MemorySegment struct) {
        return struct.get(AccessReason$LAYOUT, AccessReason$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PACCESS_REASONS AccessReason
     * }
     */
    public static void AccessReason(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(AccessReason$LAYOUT, AccessReason$OFFSET, fieldValue);
    }

    private static final AddressLayout Privileges$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("Privileges"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PPRIVILEGE_SET *Privileges
     * }
     */
    public static final AddressLayout Privileges$layout() {
        return Privileges$LAYOUT;
    }

    private static final long Privileges$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PPRIVILEGE_SET *Privileges
     * }
     */
    public static final long Privileges$offset() {
        return Privileges$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PPRIVILEGE_SET *Privileges
     * }
     */
    public static MemorySegment Privileges(MemorySegment struct) {
        return struct.get(Privileges$LAYOUT, Privileges$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PPRIVILEGE_SET *Privileges
     * }
     */
    public static void Privileges(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(Privileges$LAYOUT, Privileges$OFFSET, fieldValue);
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

