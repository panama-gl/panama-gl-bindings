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
 * typedef INT64 (*PFNWGLSWAPBUFFERSMSCOMLPROC)(HDC, INT64, INT64, INT64) __attribute__((stdcall))
 * }
 */
public class PFNWGLSWAPBUFFERSMSCOMLPROC {

    PFNWGLSWAPBUFFERSMSCOMLPROC() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        long apply(MemorySegment hdc, long target_msc, long divisor, long remainder);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
        wgl_h.C_LONG_LONG,
        wgl_h.C_POINTER,
        wgl_h.C_LONG_LONG,
        wgl_h.C_LONG_LONG,
        wgl_h.C_LONG_LONG
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = wgl_h.upcallHandle(PFNWGLSWAPBUFFERSMSCOMLPROC.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(PFNWGLSWAPBUFFERSMSCOMLPROC.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static long invoke(MemorySegment funcPtr,MemorySegment hdc, long target_msc, long divisor, long remainder) {
        try {
            return (long) DOWN$MH.invokeExact(funcPtr, hdc, target_msc, divisor, remainder);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

