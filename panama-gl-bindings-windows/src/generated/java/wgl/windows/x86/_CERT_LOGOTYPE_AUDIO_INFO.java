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
 * struct _CERT_LOGOTYPE_AUDIO_INFO {
 *     DWORD dwFileSize;
 *     DWORD dwPlayTime;
 *     DWORD dwChannels;
 *     DWORD dwSampleRate;
 *     LPWSTR pwszLanguage;
 * }
 * }
 */
public class _CERT_LOGOTYPE_AUDIO_INFO {

    _CERT_LOGOTYPE_AUDIO_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG.withName("dwFileSize"),
        wgl_h.C_LONG.withName("dwPlayTime"),
        wgl_h.C_LONG.withName("dwChannels"),
        wgl_h.C_LONG.withName("dwSampleRate"),
        wgl_h.C_POINTER.withName("pwszLanguage")
    ).withName("_CERT_LOGOTYPE_AUDIO_INFO");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt dwFileSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwFileSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwFileSize
     * }
     */
    public static final OfInt dwFileSize$layout() {
        return dwFileSize$LAYOUT;
    }

    private static final long dwFileSize$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwFileSize
     * }
     */
    public static final long dwFileSize$offset() {
        return dwFileSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwFileSize
     * }
     */
    public static int dwFileSize(MemorySegment struct) {
        return struct.get(dwFileSize$LAYOUT, dwFileSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwFileSize
     * }
     */
    public static void dwFileSize(MemorySegment struct, int fieldValue) {
        struct.set(dwFileSize$LAYOUT, dwFileSize$OFFSET, fieldValue);
    }

    private static final OfInt dwPlayTime$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwPlayTime"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwPlayTime
     * }
     */
    public static final OfInt dwPlayTime$layout() {
        return dwPlayTime$LAYOUT;
    }

    private static final long dwPlayTime$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwPlayTime
     * }
     */
    public static final long dwPlayTime$offset() {
        return dwPlayTime$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwPlayTime
     * }
     */
    public static int dwPlayTime(MemorySegment struct) {
        return struct.get(dwPlayTime$LAYOUT, dwPlayTime$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwPlayTime
     * }
     */
    public static void dwPlayTime(MemorySegment struct, int fieldValue) {
        struct.set(dwPlayTime$LAYOUT, dwPlayTime$OFFSET, fieldValue);
    }

    private static final OfInt dwChannels$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwChannels"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwChannels
     * }
     */
    public static final OfInt dwChannels$layout() {
        return dwChannels$LAYOUT;
    }

    private static final long dwChannels$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwChannels
     * }
     */
    public static final long dwChannels$offset() {
        return dwChannels$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwChannels
     * }
     */
    public static int dwChannels(MemorySegment struct) {
        return struct.get(dwChannels$LAYOUT, dwChannels$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwChannels
     * }
     */
    public static void dwChannels(MemorySegment struct, int fieldValue) {
        struct.set(dwChannels$LAYOUT, dwChannels$OFFSET, fieldValue);
    }

    private static final OfInt dwSampleRate$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwSampleRate"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwSampleRate
     * }
     */
    public static final OfInt dwSampleRate$layout() {
        return dwSampleRate$LAYOUT;
    }

    private static final long dwSampleRate$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwSampleRate
     * }
     */
    public static final long dwSampleRate$offset() {
        return dwSampleRate$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwSampleRate
     * }
     */
    public static int dwSampleRate(MemorySegment struct) {
        return struct.get(dwSampleRate$LAYOUT, dwSampleRate$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwSampleRate
     * }
     */
    public static void dwSampleRate(MemorySegment struct, int fieldValue) {
        struct.set(dwSampleRate$LAYOUT, dwSampleRate$OFFSET, fieldValue);
    }

    private static final AddressLayout pwszLanguage$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pwszLanguage"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPWSTR pwszLanguage
     * }
     */
    public static final AddressLayout pwszLanguage$layout() {
        return pwszLanguage$LAYOUT;
    }

    private static final long pwszLanguage$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPWSTR pwszLanguage
     * }
     */
    public static final long pwszLanguage$offset() {
        return pwszLanguage$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPWSTR pwszLanguage
     * }
     */
    public static MemorySegment pwszLanguage(MemorySegment struct) {
        return struct.get(pwszLanguage$LAYOUT, pwszLanguage$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPWSTR pwszLanguage
     * }
     */
    public static void pwszLanguage(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pwszLanguage$LAYOUT, pwszLanguage$OFFSET, fieldValue);
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

