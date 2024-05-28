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
 * struct tagDIBSECTION {
 *     BITMAP dsBm;
 *     BITMAPINFOHEADER dsBmih;
 *     DWORD dsBitfields[3];
 *     HANDLE dshSection;
 *     DWORD dsOffset;
 * }
 * }
 */
public class tagDIBSECTION {

    tagDIBSECTION() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        tagBITMAP.layout().withName("dsBm"),
        tagBITMAPINFOHEADER.layout().withName("dsBmih"),
        MemoryLayout.sequenceLayout(3, wgl_h.C_LONG).withName("dsBitfields"),
        MemoryLayout.paddingLayout(4),
        wgl_h.C_POINTER.withName("dshSection"),
        wgl_h.C_LONG.withName("dsOffset"),
        MemoryLayout.paddingLayout(4)
    ).withName("tagDIBSECTION");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout dsBm$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("dsBm"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BITMAP dsBm
     * }
     */
    public static final GroupLayout dsBm$layout() {
        return dsBm$LAYOUT;
    }

    private static final long dsBm$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BITMAP dsBm
     * }
     */
    public static final long dsBm$offset() {
        return dsBm$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BITMAP dsBm
     * }
     */
    public static MemorySegment dsBm(MemorySegment struct) {
        return struct.asSlice(dsBm$OFFSET, dsBm$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BITMAP dsBm
     * }
     */
    public static void dsBm(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, dsBm$OFFSET, dsBm$LAYOUT.byteSize());
    }

    private static final GroupLayout dsBmih$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("dsBmih"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BITMAPINFOHEADER dsBmih
     * }
     */
    public static final GroupLayout dsBmih$layout() {
        return dsBmih$LAYOUT;
    }

    private static final long dsBmih$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BITMAPINFOHEADER dsBmih
     * }
     */
    public static final long dsBmih$offset() {
        return dsBmih$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BITMAPINFOHEADER dsBmih
     * }
     */
    public static MemorySegment dsBmih(MemorySegment struct) {
        return struct.asSlice(dsBmih$OFFSET, dsBmih$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BITMAPINFOHEADER dsBmih
     * }
     */
    public static void dsBmih(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, dsBmih$OFFSET, dsBmih$LAYOUT.byteSize());
    }

    private static final SequenceLayout dsBitfields$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("dsBitfields"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dsBitfields[3]
     * }
     */
    public static final SequenceLayout dsBitfields$layout() {
        return dsBitfields$LAYOUT;
    }

    private static final long dsBitfields$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dsBitfields[3]
     * }
     */
    public static final long dsBitfields$offset() {
        return dsBitfields$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dsBitfields[3]
     * }
     */
    public static MemorySegment dsBitfields(MemorySegment struct) {
        return struct.asSlice(dsBitfields$OFFSET, dsBitfields$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dsBitfields[3]
     * }
     */
    public static void dsBitfields(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, dsBitfields$OFFSET, dsBitfields$LAYOUT.byteSize());
    }

    private static long[] dsBitfields$DIMS = { 3 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * DWORD dsBitfields[3]
     * }
     */
    public static long[] dsBitfields$dimensions() {
        return dsBitfields$DIMS;
    }
    private static final VarHandle dsBitfields$ELEM_HANDLE = dsBitfields$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * DWORD dsBitfields[3]
     * }
     */
    public static int dsBitfields(MemorySegment struct, long index0) {
        return (int)dsBitfields$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * DWORD dsBitfields[3]
     * }
     */
    public static void dsBitfields(MemorySegment struct, long index0, int fieldValue) {
        dsBitfields$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final AddressLayout dshSection$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("dshSection"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HANDLE dshSection
     * }
     */
    public static final AddressLayout dshSection$layout() {
        return dshSection$LAYOUT;
    }

    private static final long dshSection$OFFSET = 88;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HANDLE dshSection
     * }
     */
    public static final long dshSection$offset() {
        return dshSection$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HANDLE dshSection
     * }
     */
    public static MemorySegment dshSection(MemorySegment struct) {
        return struct.get(dshSection$LAYOUT, dshSection$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HANDLE dshSection
     * }
     */
    public static void dshSection(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(dshSection$LAYOUT, dshSection$OFFSET, fieldValue);
    }

    private static final OfInt dsOffset$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dsOffset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dsOffset
     * }
     */
    public static final OfInt dsOffset$layout() {
        return dsOffset$LAYOUT;
    }

    private static final long dsOffset$OFFSET = 96;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dsOffset
     * }
     */
    public static final long dsOffset$offset() {
        return dsOffset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dsOffset
     * }
     */
    public static int dsOffset(MemorySegment struct) {
        return struct.get(dsOffset$LAYOUT, dsOffset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dsOffset
     * }
     */
    public static void dsOffset(MemorySegment struct, int fieldValue) {
        struct.set(dsOffset$LAYOUT, dsOffset$OFFSET, fieldValue);
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

