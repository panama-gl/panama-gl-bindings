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
 * struct tagOLEVERB {
 *     LONG lVerb;
 *     LPOLESTR lpszVerbName;
 *     DWORD fuFlags;
 *     DWORD grfAttribs;
 * }
 * }
 */
public class tagOLEVERB {

    tagOLEVERB() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG.withName("lVerb"),
        MemoryLayout.paddingLayout(4),
        wgl_h.C_POINTER.withName("lpszVerbName"),
        wgl_h.C_LONG.withName("fuFlags"),
        wgl_h.C_LONG.withName("grfAttribs")
    ).withName("tagOLEVERB");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt lVerb$LAYOUT = (OfInt)$LAYOUT.select(groupElement("lVerb"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LONG lVerb
     * }
     */
    public static final OfInt lVerb$layout() {
        return lVerb$LAYOUT;
    }

    private static final long lVerb$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONG lVerb
     * }
     */
    public static final long lVerb$offset() {
        return lVerb$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONG lVerb
     * }
     */
    public static int lVerb(MemorySegment struct) {
        return struct.get(lVerb$LAYOUT, lVerb$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONG lVerb
     * }
     */
    public static void lVerb(MemorySegment struct, int fieldValue) {
        struct.set(lVerb$LAYOUT, lVerb$OFFSET, fieldValue);
    }

    private static final AddressLayout lpszVerbName$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpszVerbName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPOLESTR lpszVerbName
     * }
     */
    public static final AddressLayout lpszVerbName$layout() {
        return lpszVerbName$LAYOUT;
    }

    private static final long lpszVerbName$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPOLESTR lpszVerbName
     * }
     */
    public static final long lpszVerbName$offset() {
        return lpszVerbName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPOLESTR lpszVerbName
     * }
     */
    public static MemorySegment lpszVerbName(MemorySegment struct) {
        return struct.get(lpszVerbName$LAYOUT, lpszVerbName$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPOLESTR lpszVerbName
     * }
     */
    public static void lpszVerbName(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpszVerbName$LAYOUT, lpszVerbName$OFFSET, fieldValue);
    }

    private static final OfInt fuFlags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("fuFlags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD fuFlags
     * }
     */
    public static final OfInt fuFlags$layout() {
        return fuFlags$LAYOUT;
    }

    private static final long fuFlags$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD fuFlags
     * }
     */
    public static final long fuFlags$offset() {
        return fuFlags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD fuFlags
     * }
     */
    public static int fuFlags(MemorySegment struct) {
        return struct.get(fuFlags$LAYOUT, fuFlags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD fuFlags
     * }
     */
    public static void fuFlags(MemorySegment struct, int fieldValue) {
        struct.set(fuFlags$LAYOUT, fuFlags$OFFSET, fieldValue);
    }

    private static final OfInt grfAttribs$LAYOUT = (OfInt)$LAYOUT.select(groupElement("grfAttribs"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD grfAttribs
     * }
     */
    public static final OfInt grfAttribs$layout() {
        return grfAttribs$LAYOUT;
    }

    private static final long grfAttribs$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD grfAttribs
     * }
     */
    public static final long grfAttribs$offset() {
        return grfAttribs$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD grfAttribs
     * }
     */
    public static int grfAttribs(MemorySegment struct) {
        return struct.get(grfAttribs$LAYOUT, grfAttribs$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD grfAttribs
     * }
     */
    public static void grfAttribs(MemorySegment struct, int fieldValue) {
        struct.set(grfAttribs$LAYOUT, grfAttribs$OFFSET, fieldValue);
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

