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
 * struct _DISK_GEOMETRY {
 *     LARGE_INTEGER Cylinders;
 *     MEDIA_TYPE MediaType;
 *     DWORD TracksPerCylinder;
 *     DWORD SectorsPerTrack;
 *     DWORD BytesPerSector;
 * }
 * }
 */
public class _DISK_GEOMETRY {

    _DISK_GEOMETRY() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _LARGE_INTEGER.layout().withName("Cylinders"),
        wgl_h.C_INT.withName("MediaType"),
        wgl_h.C_LONG.withName("TracksPerCylinder"),
        wgl_h.C_LONG.withName("SectorsPerTrack"),
        wgl_h.C_LONG.withName("BytesPerSector")
    ).withName("_DISK_GEOMETRY");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout Cylinders$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("Cylinders"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LARGE_INTEGER Cylinders
     * }
     */
    public static final GroupLayout Cylinders$layout() {
        return Cylinders$LAYOUT;
    }

    private static final long Cylinders$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LARGE_INTEGER Cylinders
     * }
     */
    public static final long Cylinders$offset() {
        return Cylinders$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER Cylinders
     * }
     */
    public static MemorySegment Cylinders(MemorySegment struct) {
        return struct.asSlice(Cylinders$OFFSET, Cylinders$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER Cylinders
     * }
     */
    public static void Cylinders(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Cylinders$OFFSET, Cylinders$LAYOUT.byteSize());
    }

    private static final OfInt MediaType$LAYOUT = (OfInt)$LAYOUT.select(groupElement("MediaType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * MEDIA_TYPE MediaType
     * }
     */
    public static final OfInt MediaType$layout() {
        return MediaType$LAYOUT;
    }

    private static final long MediaType$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * MEDIA_TYPE MediaType
     * }
     */
    public static final long MediaType$offset() {
        return MediaType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * MEDIA_TYPE MediaType
     * }
     */
    public static int MediaType(MemorySegment struct) {
        return struct.get(MediaType$LAYOUT, MediaType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * MEDIA_TYPE MediaType
     * }
     */
    public static void MediaType(MemorySegment struct, int fieldValue) {
        struct.set(MediaType$LAYOUT, MediaType$OFFSET, fieldValue);
    }

    private static final OfInt TracksPerCylinder$LAYOUT = (OfInt)$LAYOUT.select(groupElement("TracksPerCylinder"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD TracksPerCylinder
     * }
     */
    public static final OfInt TracksPerCylinder$layout() {
        return TracksPerCylinder$LAYOUT;
    }

    private static final long TracksPerCylinder$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD TracksPerCylinder
     * }
     */
    public static final long TracksPerCylinder$offset() {
        return TracksPerCylinder$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD TracksPerCylinder
     * }
     */
    public static int TracksPerCylinder(MemorySegment struct) {
        return struct.get(TracksPerCylinder$LAYOUT, TracksPerCylinder$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD TracksPerCylinder
     * }
     */
    public static void TracksPerCylinder(MemorySegment struct, int fieldValue) {
        struct.set(TracksPerCylinder$LAYOUT, TracksPerCylinder$OFFSET, fieldValue);
    }

    private static final OfInt SectorsPerTrack$LAYOUT = (OfInt)$LAYOUT.select(groupElement("SectorsPerTrack"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD SectorsPerTrack
     * }
     */
    public static final OfInt SectorsPerTrack$layout() {
        return SectorsPerTrack$LAYOUT;
    }

    private static final long SectorsPerTrack$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD SectorsPerTrack
     * }
     */
    public static final long SectorsPerTrack$offset() {
        return SectorsPerTrack$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD SectorsPerTrack
     * }
     */
    public static int SectorsPerTrack(MemorySegment struct) {
        return struct.get(SectorsPerTrack$LAYOUT, SectorsPerTrack$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD SectorsPerTrack
     * }
     */
    public static void SectorsPerTrack(MemorySegment struct, int fieldValue) {
        struct.set(SectorsPerTrack$LAYOUT, SectorsPerTrack$OFFSET, fieldValue);
    }

    private static final OfInt BytesPerSector$LAYOUT = (OfInt)$LAYOUT.select(groupElement("BytesPerSector"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD BytesPerSector
     * }
     */
    public static final OfInt BytesPerSector$layout() {
        return BytesPerSector$LAYOUT;
    }

    private static final long BytesPerSector$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD BytesPerSector
     * }
     */
    public static final long BytesPerSector$offset() {
        return BytesPerSector$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD BytesPerSector
     * }
     */
    public static int BytesPerSector(MemorySegment struct) {
        return struct.get(BytesPerSector$LAYOUT, BytesPerSector$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD BytesPerSector
     * }
     */
    public static void BytesPerSector(MemorySegment struct, int fieldValue) {
        struct.set(BytesPerSector$LAYOUT, BytesPerSector$OFFSET, fieldValue);
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

