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
 * struct _CACHE_RELATIONSHIP {
 *     BYTE Level;
 *     BYTE Associativity;
 *     WORD LineSize;
 *     DWORD CacheSize;
 *     PROCESSOR_CACHE_TYPE Type;
 *     BYTE Reserved[20];
 *     GROUP_AFFINITY GroupMask;
 * }
 * }
 */
public class _CACHE_RELATIONSHIP {

    _CACHE_RELATIONSHIP() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        freeglut_h.C_CHAR.withName("Level"),
        freeglut_h.C_CHAR.withName("Associativity"),
        freeglut_h.C_SHORT.withName("LineSize"),
        freeglut_h.C_LONG.withName("CacheSize"),
        freeglut_h.C_INT.withName("Type"),
        MemoryLayout.sequenceLayout(20, freeglut_h.C_CHAR).withName("Reserved"),
        _GROUP_AFFINITY.layout().withName("GroupMask")
    ).withName("_CACHE_RELATIONSHIP");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfByte Level$LAYOUT = (OfByte)$LAYOUT.select(groupElement("Level"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE Level
     * }
     */
    public static final OfByte Level$layout() {
        return Level$LAYOUT;
    }

    private static final long Level$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE Level
     * }
     */
    public static final long Level$offset() {
        return Level$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE Level
     * }
     */
    public static byte Level(MemorySegment struct) {
        return struct.get(Level$LAYOUT, Level$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE Level
     * }
     */
    public static void Level(MemorySegment struct, byte fieldValue) {
        struct.set(Level$LAYOUT, Level$OFFSET, fieldValue);
    }

    private static final OfByte Associativity$LAYOUT = (OfByte)$LAYOUT.select(groupElement("Associativity"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE Associativity
     * }
     */
    public static final OfByte Associativity$layout() {
        return Associativity$LAYOUT;
    }

    private static final long Associativity$OFFSET = 1;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE Associativity
     * }
     */
    public static final long Associativity$offset() {
        return Associativity$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE Associativity
     * }
     */
    public static byte Associativity(MemorySegment struct) {
        return struct.get(Associativity$LAYOUT, Associativity$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE Associativity
     * }
     */
    public static void Associativity(MemorySegment struct, byte fieldValue) {
        struct.set(Associativity$LAYOUT, Associativity$OFFSET, fieldValue);
    }

    private static final OfShort LineSize$LAYOUT = (OfShort)$LAYOUT.select(groupElement("LineSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD LineSize
     * }
     */
    public static final OfShort LineSize$layout() {
        return LineSize$LAYOUT;
    }

    private static final long LineSize$OFFSET = 2;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD LineSize
     * }
     */
    public static final long LineSize$offset() {
        return LineSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD LineSize
     * }
     */
    public static short LineSize(MemorySegment struct) {
        return struct.get(LineSize$LAYOUT, LineSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD LineSize
     * }
     */
    public static void LineSize(MemorySegment struct, short fieldValue) {
        struct.set(LineSize$LAYOUT, LineSize$OFFSET, fieldValue);
    }

    private static final OfInt CacheSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("CacheSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD CacheSize
     * }
     */
    public static final OfInt CacheSize$layout() {
        return CacheSize$LAYOUT;
    }

    private static final long CacheSize$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD CacheSize
     * }
     */
    public static final long CacheSize$offset() {
        return CacheSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD CacheSize
     * }
     */
    public static int CacheSize(MemorySegment struct) {
        return struct.get(CacheSize$LAYOUT, CacheSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD CacheSize
     * }
     */
    public static void CacheSize(MemorySegment struct, int fieldValue) {
        struct.set(CacheSize$LAYOUT, CacheSize$OFFSET, fieldValue);
    }

    private static final OfInt Type$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Type"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PROCESSOR_CACHE_TYPE Type
     * }
     */
    public static final OfInt Type$layout() {
        return Type$LAYOUT;
    }

    private static final long Type$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PROCESSOR_CACHE_TYPE Type
     * }
     */
    public static final long Type$offset() {
        return Type$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PROCESSOR_CACHE_TYPE Type
     * }
     */
    public static int Type(MemorySegment struct) {
        return struct.get(Type$LAYOUT, Type$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PROCESSOR_CACHE_TYPE Type
     * }
     */
    public static void Type(MemorySegment struct, int fieldValue) {
        struct.set(Type$LAYOUT, Type$OFFSET, fieldValue);
    }

    private static final SequenceLayout Reserved$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("Reserved"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE Reserved[20]
     * }
     */
    public static final SequenceLayout Reserved$layout() {
        return Reserved$LAYOUT;
    }

    private static final long Reserved$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE Reserved[20]
     * }
     */
    public static final long Reserved$offset() {
        return Reserved$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE Reserved[20]
     * }
     */
    public static MemorySegment Reserved(MemorySegment struct) {
        return struct.asSlice(Reserved$OFFSET, Reserved$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE Reserved[20]
     * }
     */
    public static void Reserved(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Reserved$OFFSET, Reserved$LAYOUT.byteSize());
    }

    private static long[] Reserved$DIMS = { 20 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * BYTE Reserved[20]
     * }
     */
    public static long[] Reserved$dimensions() {
        return Reserved$DIMS;
    }
    private static final VarHandle Reserved$ELEM_HANDLE = Reserved$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * BYTE Reserved[20]
     * }
     */
    public static byte Reserved(MemorySegment struct, long index0) {
        return (byte)Reserved$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * BYTE Reserved[20]
     * }
     */
    public static void Reserved(MemorySegment struct, long index0, byte fieldValue) {
        Reserved$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final GroupLayout GroupMask$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("GroupMask"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GROUP_AFFINITY GroupMask
     * }
     */
    public static final GroupLayout GroupMask$layout() {
        return GroupMask$LAYOUT;
    }

    private static final long GroupMask$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GROUP_AFFINITY GroupMask
     * }
     */
    public static final long GroupMask$offset() {
        return GroupMask$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GROUP_AFFINITY GroupMask
     * }
     */
    public static MemorySegment GroupMask(MemorySegment struct) {
        return struct.asSlice(GroupMask$OFFSET, GroupMask$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GROUP_AFFINITY GroupMask
     * }
     */
    public static void GroupMask(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, GroupMask$OFFSET, GroupMask$LAYOUT.byteSize());
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

