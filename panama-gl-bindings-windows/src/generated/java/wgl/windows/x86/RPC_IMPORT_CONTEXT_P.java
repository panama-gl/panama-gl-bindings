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
 * struct {
 *     RPC_NS_HANDLE LookupContext;
 *     RPC_BINDING_HANDLE ProposedHandle;
 *     RPC_BINDING_VECTOR *Bindings;
 * }
 * }
 */
public class RPC_IMPORT_CONTEXT_P {

    RPC_IMPORT_CONTEXT_P() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_POINTER.withName("LookupContext"),
        wgl_h.C_POINTER.withName("ProposedHandle"),
        wgl_h.C_POINTER.withName("Bindings")
    ).withName("$anon$32:9");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout LookupContext$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("LookupContext"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * RPC_NS_HANDLE LookupContext
     * }
     */
    public static final AddressLayout LookupContext$layout() {
        return LookupContext$LAYOUT;
    }

    private static final long LookupContext$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * RPC_NS_HANDLE LookupContext
     * }
     */
    public static final long LookupContext$offset() {
        return LookupContext$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * RPC_NS_HANDLE LookupContext
     * }
     */
    public static MemorySegment LookupContext(MemorySegment struct) {
        return struct.get(LookupContext$LAYOUT, LookupContext$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * RPC_NS_HANDLE LookupContext
     * }
     */
    public static void LookupContext(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(LookupContext$LAYOUT, LookupContext$OFFSET, fieldValue);
    }

    private static final AddressLayout ProposedHandle$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("ProposedHandle"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * RPC_BINDING_HANDLE ProposedHandle
     * }
     */
    public static final AddressLayout ProposedHandle$layout() {
        return ProposedHandle$LAYOUT;
    }

    private static final long ProposedHandle$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * RPC_BINDING_HANDLE ProposedHandle
     * }
     */
    public static final long ProposedHandle$offset() {
        return ProposedHandle$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * RPC_BINDING_HANDLE ProposedHandle
     * }
     */
    public static MemorySegment ProposedHandle(MemorySegment struct) {
        return struct.get(ProposedHandle$LAYOUT, ProposedHandle$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * RPC_BINDING_HANDLE ProposedHandle
     * }
     */
    public static void ProposedHandle(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(ProposedHandle$LAYOUT, ProposedHandle$OFFSET, fieldValue);
    }

    private static final AddressLayout Bindings$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("Bindings"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * RPC_BINDING_VECTOR *Bindings
     * }
     */
    public static final AddressLayout Bindings$layout() {
        return Bindings$LAYOUT;
    }

    private static final long Bindings$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * RPC_BINDING_VECTOR *Bindings
     * }
     */
    public static final long Bindings$offset() {
        return Bindings$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * RPC_BINDING_VECTOR *Bindings
     * }
     */
    public static MemorySegment Bindings(MemorySegment struct) {
        return struct.get(Bindings$LAYOUT, Bindings$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * RPC_BINDING_VECTOR *Bindings
     * }
     */
    public static void Bindings(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(Bindings$LAYOUT, Bindings$OFFSET, fieldValue);
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

