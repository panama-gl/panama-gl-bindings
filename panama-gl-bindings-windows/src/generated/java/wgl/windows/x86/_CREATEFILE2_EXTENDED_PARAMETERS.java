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
 * struct _CREATEFILE2_EXTENDED_PARAMETERS {
 *     DWORD dwSize;
 *     DWORD dwFileAttributes;
 *     DWORD dwFileFlags;
 *     DWORD dwSecurityQosFlags;
 *     LPSECURITY_ATTRIBUTES lpSecurityAttributes;
 *     HANDLE hTemplateFile;
 * }
 * }
 */
public class _CREATEFILE2_EXTENDED_PARAMETERS {

    _CREATEFILE2_EXTENDED_PARAMETERS() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG.withName("dwSize"),
        wgl_h.C_LONG.withName("dwFileAttributes"),
        wgl_h.C_LONG.withName("dwFileFlags"),
        wgl_h.C_LONG.withName("dwSecurityQosFlags"),
        wgl_h.C_POINTER.withName("lpSecurityAttributes"),
        wgl_h.C_POINTER.withName("hTemplateFile")
    ).withName("_CREATEFILE2_EXTENDED_PARAMETERS");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt dwSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwSize
     * }
     */
    public static final OfInt dwSize$layout() {
        return dwSize$LAYOUT;
    }

    private static final long dwSize$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwSize
     * }
     */
    public static final long dwSize$offset() {
        return dwSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwSize
     * }
     */
    public static int dwSize(MemorySegment struct) {
        return struct.get(dwSize$LAYOUT, dwSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwSize
     * }
     */
    public static void dwSize(MemorySegment struct, int fieldValue) {
        struct.set(dwSize$LAYOUT, dwSize$OFFSET, fieldValue);
    }

    private static final OfInt dwFileAttributes$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwFileAttributes"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwFileAttributes
     * }
     */
    public static final OfInt dwFileAttributes$layout() {
        return dwFileAttributes$LAYOUT;
    }

    private static final long dwFileAttributes$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwFileAttributes
     * }
     */
    public static final long dwFileAttributes$offset() {
        return dwFileAttributes$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwFileAttributes
     * }
     */
    public static int dwFileAttributes(MemorySegment struct) {
        return struct.get(dwFileAttributes$LAYOUT, dwFileAttributes$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwFileAttributes
     * }
     */
    public static void dwFileAttributes(MemorySegment struct, int fieldValue) {
        struct.set(dwFileAttributes$LAYOUT, dwFileAttributes$OFFSET, fieldValue);
    }

    private static final OfInt dwFileFlags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwFileFlags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwFileFlags
     * }
     */
    public static final OfInt dwFileFlags$layout() {
        return dwFileFlags$LAYOUT;
    }

    private static final long dwFileFlags$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwFileFlags
     * }
     */
    public static final long dwFileFlags$offset() {
        return dwFileFlags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwFileFlags
     * }
     */
    public static int dwFileFlags(MemorySegment struct) {
        return struct.get(dwFileFlags$LAYOUT, dwFileFlags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwFileFlags
     * }
     */
    public static void dwFileFlags(MemorySegment struct, int fieldValue) {
        struct.set(dwFileFlags$LAYOUT, dwFileFlags$OFFSET, fieldValue);
    }

    private static final OfInt dwSecurityQosFlags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwSecurityQosFlags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwSecurityQosFlags
     * }
     */
    public static final OfInt dwSecurityQosFlags$layout() {
        return dwSecurityQosFlags$LAYOUT;
    }

    private static final long dwSecurityQosFlags$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwSecurityQosFlags
     * }
     */
    public static final long dwSecurityQosFlags$offset() {
        return dwSecurityQosFlags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwSecurityQosFlags
     * }
     */
    public static int dwSecurityQosFlags(MemorySegment struct) {
        return struct.get(dwSecurityQosFlags$LAYOUT, dwSecurityQosFlags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwSecurityQosFlags
     * }
     */
    public static void dwSecurityQosFlags(MemorySegment struct, int fieldValue) {
        struct.set(dwSecurityQosFlags$LAYOUT, dwSecurityQosFlags$OFFSET, fieldValue);
    }

    private static final AddressLayout lpSecurityAttributes$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpSecurityAttributes"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPSECURITY_ATTRIBUTES lpSecurityAttributes
     * }
     */
    public static final AddressLayout lpSecurityAttributes$layout() {
        return lpSecurityAttributes$LAYOUT;
    }

    private static final long lpSecurityAttributes$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPSECURITY_ATTRIBUTES lpSecurityAttributes
     * }
     */
    public static final long lpSecurityAttributes$offset() {
        return lpSecurityAttributes$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPSECURITY_ATTRIBUTES lpSecurityAttributes
     * }
     */
    public static MemorySegment lpSecurityAttributes(MemorySegment struct) {
        return struct.get(lpSecurityAttributes$LAYOUT, lpSecurityAttributes$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPSECURITY_ATTRIBUTES lpSecurityAttributes
     * }
     */
    public static void lpSecurityAttributes(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpSecurityAttributes$LAYOUT, lpSecurityAttributes$OFFSET, fieldValue);
    }

    private static final AddressLayout hTemplateFile$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hTemplateFile"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HANDLE hTemplateFile
     * }
     */
    public static final AddressLayout hTemplateFile$layout() {
        return hTemplateFile$LAYOUT;
    }

    private static final long hTemplateFile$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HANDLE hTemplateFile
     * }
     */
    public static final long hTemplateFile$offset() {
        return hTemplateFile$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HANDLE hTemplateFile
     * }
     */
    public static MemorySegment hTemplateFile(MemorySegment struct) {
        return struct.get(hTemplateFile$LAYOUT, hTemplateFile$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HANDLE hTemplateFile
     * }
     */
    public static void hTemplateFile(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hTemplateFile$LAYOUT, hTemplateFile$OFFSET, fieldValue);
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

