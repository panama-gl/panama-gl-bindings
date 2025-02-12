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
 * typedef HGLRC (*PFNWGLGETCURRENTASSOCIATEDCONTEXTAMDPROC)(void) __attribute__((stdcall))
 * }
 */
public class PFNWGLGETCURRENTASSOCIATEDCONTEXTAMDPROC {

    PFNWGLGETCURRENTASSOCIATEDCONTEXTAMDPROC() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        MemorySegment apply();
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
        wgl_h.C_POINTER);

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = wgl_h.upcallHandle(PFNWGLGETCURRENTASSOCIATEDCONTEXTAMDPROC.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(PFNWGLGETCURRENTASSOCIATEDCONTEXTAMDPROC.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static MemorySegment invoke(MemorySegment funcPtr) {
        try {
            return (MemorySegment) DOWN$MH.invokeExact(funcPtr);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

