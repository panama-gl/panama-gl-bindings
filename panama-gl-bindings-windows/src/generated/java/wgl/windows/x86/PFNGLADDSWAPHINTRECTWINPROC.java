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
 * typedef void (*PFNGLADDSWAPHINTRECTWINPROC)(GLint, GLint, GLsizei, GLsizei) __attribute__((stdcall))
 * }
 */
public class PFNGLADDSWAPHINTRECTWINPROC {

    PFNGLADDSWAPHINTRECTWINPROC() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        void apply(int x, int y, int width, int height);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
        wgl_h.C_INT,
        wgl_h.C_INT,
        wgl_h.C_INT,
        wgl_h.C_INT
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = wgl_h.upcallHandle(PFNGLADDSWAPHINTRECTWINPROC.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(PFNGLADDSWAPHINTRECTWINPROC.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static void invoke(MemorySegment funcPtr,int x, int y, int width, int height) {
        try {
             DOWN$MH.invokeExact(funcPtr, x, y, width, height);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

