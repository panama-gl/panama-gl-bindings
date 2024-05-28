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
 * struct _ACL {
 *     BYTE AclRevision;
 *     BYTE Sbz1;
 *     WORD AclSize;
 *     WORD AceCount;
 *     WORD Sbz2;
 * }
 * }
 */
public class _ACL {

    _ACL() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_CHAR.withName("AclRevision"),
        wgl_h.C_CHAR.withName("Sbz1"),
        wgl_h.C_SHORT.withName("AclSize"),
        wgl_h.C_SHORT.withName("AceCount"),
        wgl_h.C_SHORT.withName("Sbz2")
    ).withName("_ACL");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfByte AclRevision$LAYOUT = (OfByte)$LAYOUT.select(groupElement("AclRevision"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE AclRevision
     * }
     */
    public static final OfByte AclRevision$layout() {
        return AclRevision$LAYOUT;
    }

    private static final long AclRevision$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE AclRevision
     * }
     */
    public static final long AclRevision$offset() {
        return AclRevision$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE AclRevision
     * }
     */
    public static byte AclRevision(MemorySegment struct) {
        return struct.get(AclRevision$LAYOUT, AclRevision$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE AclRevision
     * }
     */
    public static void AclRevision(MemorySegment struct, byte fieldValue) {
        struct.set(AclRevision$LAYOUT, AclRevision$OFFSET, fieldValue);
    }

    private static final OfByte Sbz1$LAYOUT = (OfByte)$LAYOUT.select(groupElement("Sbz1"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE Sbz1
     * }
     */
    public static final OfByte Sbz1$layout() {
        return Sbz1$LAYOUT;
    }

    private static final long Sbz1$OFFSET = 1;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE Sbz1
     * }
     */
    public static final long Sbz1$offset() {
        return Sbz1$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE Sbz1
     * }
     */
    public static byte Sbz1(MemorySegment struct) {
        return struct.get(Sbz1$LAYOUT, Sbz1$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE Sbz1
     * }
     */
    public static void Sbz1(MemorySegment struct, byte fieldValue) {
        struct.set(Sbz1$LAYOUT, Sbz1$OFFSET, fieldValue);
    }

    private static final OfShort AclSize$LAYOUT = (OfShort)$LAYOUT.select(groupElement("AclSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD AclSize
     * }
     */
    public static final OfShort AclSize$layout() {
        return AclSize$LAYOUT;
    }

    private static final long AclSize$OFFSET = 2;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD AclSize
     * }
     */
    public static final long AclSize$offset() {
        return AclSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD AclSize
     * }
     */
    public static short AclSize(MemorySegment struct) {
        return struct.get(AclSize$LAYOUT, AclSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD AclSize
     * }
     */
    public static void AclSize(MemorySegment struct, short fieldValue) {
        struct.set(AclSize$LAYOUT, AclSize$OFFSET, fieldValue);
    }

    private static final OfShort AceCount$LAYOUT = (OfShort)$LAYOUT.select(groupElement("AceCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD AceCount
     * }
     */
    public static final OfShort AceCount$layout() {
        return AceCount$LAYOUT;
    }

    private static final long AceCount$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD AceCount
     * }
     */
    public static final long AceCount$offset() {
        return AceCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD AceCount
     * }
     */
    public static short AceCount(MemorySegment struct) {
        return struct.get(AceCount$LAYOUT, AceCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD AceCount
     * }
     */
    public static void AceCount(MemorySegment struct, short fieldValue) {
        struct.set(AceCount$LAYOUT, AceCount$OFFSET, fieldValue);
    }

    private static final OfShort Sbz2$LAYOUT = (OfShort)$LAYOUT.select(groupElement("Sbz2"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD Sbz2
     * }
     */
    public static final OfShort Sbz2$layout() {
        return Sbz2$LAYOUT;
    }

    private static final long Sbz2$OFFSET = 6;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD Sbz2
     * }
     */
    public static final long Sbz2$offset() {
        return Sbz2$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD Sbz2
     * }
     */
    public static short Sbz2(MemorySegment struct) {
        return struct.get(Sbz2$LAYOUT, Sbz2$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD Sbz2
     * }
     */
    public static void Sbz2(MemorySegment struct, short fieldValue) {
        struct.set(Sbz2$LAYOUT, Sbz2$OFFSET, fieldValue);
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

