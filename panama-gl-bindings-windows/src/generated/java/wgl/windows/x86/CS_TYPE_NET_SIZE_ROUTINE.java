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
 * typedef void (*CS_TYPE_NET_SIZE_ROUTINE)(RPC_BINDING_HANDLE, unsigned long, unsigned long, IDL_CS_CONVERT *, unsigned long *, error_status_t *) __attribute__((stdcall))
 * }
 */
public class CS_TYPE_NET_SIZE_ROUTINE {

    CS_TYPE_NET_SIZE_ROUTINE() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        void apply(MemorySegment hBinding, int ulNetworkCodeSet, int ulLocalBufferSize, MemorySegment conversionType, MemorySegment pulNetworkBufferSize, MemorySegment pStatus);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
        wgl_h.C_POINTER,
        wgl_h.C_LONG,
        wgl_h.C_LONG,
        wgl_h.C_POINTER,
        wgl_h.C_POINTER,
        wgl_h.C_POINTER
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = wgl_h.upcallHandle(CS_TYPE_NET_SIZE_ROUTINE.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(CS_TYPE_NET_SIZE_ROUTINE.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static void invoke(MemorySegment funcPtr,MemorySegment hBinding, int ulNetworkCodeSet, int ulLocalBufferSize, MemorySegment conversionType, MemorySegment pulNetworkBufferSize, MemorySegment pStatus) {
        try {
             DOWN$MH.invokeExact(funcPtr, hBinding, ulNetworkCodeSet, ulLocalBufferSize, conversionType, pulNetworkBufferSize, pStatus);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

