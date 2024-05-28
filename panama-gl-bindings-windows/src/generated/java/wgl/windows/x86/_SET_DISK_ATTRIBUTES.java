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
 * struct _SET_DISK_ATTRIBUTES {
 *     DWORD Version;
 *     BOOLEAN Persist;
 *     BYTE Reserved1[3];
 *     DWORDLONG Attributes;
 *     DWORDLONG AttributesMask;
 *     DWORD Reserved2[4];
 * }
 * }
 */
public class _SET_DISK_ATTRIBUTES {

    _SET_DISK_ATTRIBUTES() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG.withName("Version"),
        wgl_h.C_CHAR.withName("Persist"),
        MemoryLayout.sequenceLayout(3, wgl_h.C_CHAR).withName("Reserved1"),
        wgl_h.C_LONG_LONG.withName("Attributes"),
        wgl_h.C_LONG_LONG.withName("AttributesMask"),
        MemoryLayout.sequenceLayout(4, wgl_h.C_LONG).withName("Reserved2")
    ).withName("_SET_DISK_ATTRIBUTES");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt Version$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Version"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Version
     * }
     */
    public static final OfInt Version$layout() {
        return Version$LAYOUT;
    }

    private static final long Version$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Version
     * }
     */
    public static final long Version$offset() {
        return Version$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Version
     * }
     */
    public static int Version(MemorySegment struct) {
        return struct.get(Version$LAYOUT, Version$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Version
     * }
     */
    public static void Version(MemorySegment struct, int fieldValue) {
        struct.set(Version$LAYOUT, Version$OFFSET, fieldValue);
    }

    private static final OfByte Persist$LAYOUT = (OfByte)$LAYOUT.select(groupElement("Persist"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOLEAN Persist
     * }
     */
    public static final OfByte Persist$layout() {
        return Persist$LAYOUT;
    }

    private static final long Persist$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOLEAN Persist
     * }
     */
    public static final long Persist$offset() {
        return Persist$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOLEAN Persist
     * }
     */
    public static byte Persist(MemorySegment struct) {
        return struct.get(Persist$LAYOUT, Persist$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOLEAN Persist
     * }
     */
    public static void Persist(MemorySegment struct, byte fieldValue) {
        struct.set(Persist$LAYOUT, Persist$OFFSET, fieldValue);
    }

    private static final SequenceLayout Reserved1$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("Reserved1"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE Reserved1[3]
     * }
     */
    public static final SequenceLayout Reserved1$layout() {
        return Reserved1$LAYOUT;
    }

    private static final long Reserved1$OFFSET = 5;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE Reserved1[3]
     * }
     */
    public static final long Reserved1$offset() {
        return Reserved1$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE Reserved1[3]
     * }
     */
    public static MemorySegment Reserved1(MemorySegment struct) {
        return struct.asSlice(Reserved1$OFFSET, Reserved1$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE Reserved1[3]
     * }
     */
    public static void Reserved1(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Reserved1$OFFSET, Reserved1$LAYOUT.byteSize());
    }

    private static long[] Reserved1$DIMS = { 3 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * BYTE Reserved1[3]
     * }
     */
    public static long[] Reserved1$dimensions() {
        return Reserved1$DIMS;
    }
    private static final VarHandle Reserved1$ELEM_HANDLE = Reserved1$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * BYTE Reserved1[3]
     * }
     */
    public static byte Reserved1(MemorySegment struct, long index0) {
        return (byte)Reserved1$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * BYTE Reserved1[3]
     * }
     */
    public static void Reserved1(MemorySegment struct, long index0, byte fieldValue) {
        Reserved1$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final OfLong Attributes$LAYOUT = (OfLong)$LAYOUT.select(groupElement("Attributes"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORDLONG Attributes
     * }
     */
    public static final OfLong Attributes$layout() {
        return Attributes$LAYOUT;
    }

    private static final long Attributes$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORDLONG Attributes
     * }
     */
    public static final long Attributes$offset() {
        return Attributes$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORDLONG Attributes
     * }
     */
    public static long Attributes(MemorySegment struct) {
        return struct.get(Attributes$LAYOUT, Attributes$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORDLONG Attributes
     * }
     */
    public static void Attributes(MemorySegment struct, long fieldValue) {
        struct.set(Attributes$LAYOUT, Attributes$OFFSET, fieldValue);
    }

    private static final OfLong AttributesMask$LAYOUT = (OfLong)$LAYOUT.select(groupElement("AttributesMask"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORDLONG AttributesMask
     * }
     */
    public static final OfLong AttributesMask$layout() {
        return AttributesMask$LAYOUT;
    }

    private static final long AttributesMask$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORDLONG AttributesMask
     * }
     */
    public static final long AttributesMask$offset() {
        return AttributesMask$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORDLONG AttributesMask
     * }
     */
    public static long AttributesMask(MemorySegment struct) {
        return struct.get(AttributesMask$LAYOUT, AttributesMask$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORDLONG AttributesMask
     * }
     */
    public static void AttributesMask(MemorySegment struct, long fieldValue) {
        struct.set(AttributesMask$LAYOUT, AttributesMask$OFFSET, fieldValue);
    }

    private static final SequenceLayout Reserved2$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("Reserved2"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Reserved2[4]
     * }
     */
    public static final SequenceLayout Reserved2$layout() {
        return Reserved2$LAYOUT;
    }

    private static final long Reserved2$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Reserved2[4]
     * }
     */
    public static final long Reserved2$offset() {
        return Reserved2$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Reserved2[4]
     * }
     */
    public static MemorySegment Reserved2(MemorySegment struct) {
        return struct.asSlice(Reserved2$OFFSET, Reserved2$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Reserved2[4]
     * }
     */
    public static void Reserved2(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Reserved2$OFFSET, Reserved2$LAYOUT.byteSize());
    }

    private static long[] Reserved2$DIMS = { 4 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * DWORD Reserved2[4]
     * }
     */
    public static long[] Reserved2$dimensions() {
        return Reserved2$DIMS;
    }
    private static final VarHandle Reserved2$ELEM_HANDLE = Reserved2$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * DWORD Reserved2[4]
     * }
     */
    public static int Reserved2(MemorySegment struct, long index0) {
        return (int)Reserved2$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * DWORD Reserved2[4]
     * }
     */
    public static void Reserved2(MemorySegment struct, long index0, int fieldValue) {
        Reserved2$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

