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
 * struct tagENUMLOGFONTEXDVA {
 *     ENUMLOGFONTEXA elfEnumLogfontEx;
 *     DESIGNVECTOR elfDesignVector;
 * }
 * }
 */
public class tagENUMLOGFONTEXDVA {

    tagENUMLOGFONTEXDVA() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        tagENUMLOGFONTEXA.layout().withName("elfEnumLogfontEx"),
        tagDESIGNVECTOR.layout().withName("elfDesignVector")
    ).withName("tagENUMLOGFONTEXDVA");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout elfEnumLogfontEx$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("elfEnumLogfontEx"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ENUMLOGFONTEXA elfEnumLogfontEx
     * }
     */
    public static final GroupLayout elfEnumLogfontEx$layout() {
        return elfEnumLogfontEx$LAYOUT;
    }

    private static final long elfEnumLogfontEx$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ENUMLOGFONTEXA elfEnumLogfontEx
     * }
     */
    public static final long elfEnumLogfontEx$offset() {
        return elfEnumLogfontEx$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ENUMLOGFONTEXA elfEnumLogfontEx
     * }
     */
    public static MemorySegment elfEnumLogfontEx(MemorySegment struct) {
        return struct.asSlice(elfEnumLogfontEx$OFFSET, elfEnumLogfontEx$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ENUMLOGFONTEXA elfEnumLogfontEx
     * }
     */
    public static void elfEnumLogfontEx(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, elfEnumLogfontEx$OFFSET, elfEnumLogfontEx$LAYOUT.byteSize());
    }

    private static final GroupLayout elfDesignVector$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("elfDesignVector"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DESIGNVECTOR elfDesignVector
     * }
     */
    public static final GroupLayout elfDesignVector$layout() {
        return elfDesignVector$LAYOUT;
    }

    private static final long elfDesignVector$OFFSET = 188;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DESIGNVECTOR elfDesignVector
     * }
     */
    public static final long elfDesignVector$offset() {
        return elfDesignVector$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DESIGNVECTOR elfDesignVector
     * }
     */
    public static MemorySegment elfDesignVector(MemorySegment struct) {
        return struct.asSlice(elfDesignVector$OFFSET, elfDesignVector$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DESIGNVECTOR elfDesignVector
     * }
     */
    public static void elfDesignVector(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, elfDesignVector$OFFSET, elfDesignVector$LAYOUT.byteSize());
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

