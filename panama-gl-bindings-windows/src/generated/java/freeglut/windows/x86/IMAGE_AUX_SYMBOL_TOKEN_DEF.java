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
 * struct IMAGE_AUX_SYMBOL_TOKEN_DEF {
 *     BYTE bAuxType;
 *     BYTE bReserved;
 *     DWORD SymbolTableIndex;
 *     BYTE rgbReserved[12];
 * }
 * }
 */
public class IMAGE_AUX_SYMBOL_TOKEN_DEF {

    IMAGE_AUX_SYMBOL_TOKEN_DEF() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        freeglut_h.C_CHAR.withName("bAuxType"),
        freeglut_h.C_CHAR.withName("bReserved"),
        freeglut_h.align(freeglut_h.C_LONG, 2).withName("SymbolTableIndex"),
        MemoryLayout.sequenceLayout(12, freeglut_h.C_CHAR).withName("rgbReserved")
    ).withName("IMAGE_AUX_SYMBOL_TOKEN_DEF");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfByte bAuxType$LAYOUT = (OfByte)$LAYOUT.select(groupElement("bAuxType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE bAuxType
     * }
     */
    public static final OfByte bAuxType$layout() {
        return bAuxType$LAYOUT;
    }

    private static final long bAuxType$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE bAuxType
     * }
     */
    public static final long bAuxType$offset() {
        return bAuxType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE bAuxType
     * }
     */
    public static byte bAuxType(MemorySegment struct) {
        return struct.get(bAuxType$LAYOUT, bAuxType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE bAuxType
     * }
     */
    public static void bAuxType(MemorySegment struct, byte fieldValue) {
        struct.set(bAuxType$LAYOUT, bAuxType$OFFSET, fieldValue);
    }

    private static final OfByte bReserved$LAYOUT = (OfByte)$LAYOUT.select(groupElement("bReserved"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE bReserved
     * }
     */
    public static final OfByte bReserved$layout() {
        return bReserved$LAYOUT;
    }

    private static final long bReserved$OFFSET = 1;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE bReserved
     * }
     */
    public static final long bReserved$offset() {
        return bReserved$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE bReserved
     * }
     */
    public static byte bReserved(MemorySegment struct) {
        return struct.get(bReserved$LAYOUT, bReserved$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE bReserved
     * }
     */
    public static void bReserved(MemorySegment struct, byte fieldValue) {
        struct.set(bReserved$LAYOUT, bReserved$OFFSET, fieldValue);
    }

    private static final OfInt SymbolTableIndex$LAYOUT = (OfInt)$LAYOUT.select(groupElement("SymbolTableIndex"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD SymbolTableIndex
     * }
     */
    public static final OfInt SymbolTableIndex$layout() {
        return SymbolTableIndex$LAYOUT;
    }

    private static final long SymbolTableIndex$OFFSET = 2;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD SymbolTableIndex
     * }
     */
    public static final long SymbolTableIndex$offset() {
        return SymbolTableIndex$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD SymbolTableIndex
     * }
     */
    public static int SymbolTableIndex(MemorySegment struct) {
        return struct.get(SymbolTableIndex$LAYOUT, SymbolTableIndex$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD SymbolTableIndex
     * }
     */
    public static void SymbolTableIndex(MemorySegment struct, int fieldValue) {
        struct.set(SymbolTableIndex$LAYOUT, SymbolTableIndex$OFFSET, fieldValue);
    }

    private static final SequenceLayout rgbReserved$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("rgbReserved"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE rgbReserved[12]
     * }
     */
    public static final SequenceLayout rgbReserved$layout() {
        return rgbReserved$LAYOUT;
    }

    private static final long rgbReserved$OFFSET = 6;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE rgbReserved[12]
     * }
     */
    public static final long rgbReserved$offset() {
        return rgbReserved$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE rgbReserved[12]
     * }
     */
    public static MemorySegment rgbReserved(MemorySegment struct) {
        return struct.asSlice(rgbReserved$OFFSET, rgbReserved$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE rgbReserved[12]
     * }
     */
    public static void rgbReserved(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, rgbReserved$OFFSET, rgbReserved$LAYOUT.byteSize());
    }

    private static long[] rgbReserved$DIMS = { 12 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * BYTE rgbReserved[12]
     * }
     */
    public static long[] rgbReserved$dimensions() {
        return rgbReserved$DIMS;
    }
    private static final VarHandle rgbReserved$ELEM_HANDLE = rgbReserved$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * BYTE rgbReserved[12]
     * }
     */
    public static byte rgbReserved(MemorySegment struct, long index0) {
        return (byte)rgbReserved$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * BYTE rgbReserved[12]
     * }
     */
    public static void rgbReserved(MemorySegment struct, long index0, byte fieldValue) {
        rgbReserved$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

