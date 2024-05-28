// Generated by jextract

package glx.linux.x86;

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
 * typedef int (*PFNGLXQUERYCHANNELRECTSGIXPROC)(Display *, int, int, int *, int *, int *, int *)
 * }
 */
public class PFNGLXQUERYCHANNELRECTSGIXPROC {

    PFNGLXQUERYCHANNELRECTSGIXPROC() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        int apply(MemorySegment display, int screen, int channel, MemorySegment dx, MemorySegment dy, MemorySegment dw, MemorySegment dh);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
        glx_h.C_INT,
        glx_h.C_POINTER,
        glx_h.C_INT,
        glx_h.C_INT,
        glx_h.C_POINTER,
        glx_h.C_POINTER,
        glx_h.C_POINTER,
        glx_h.C_POINTER
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = glx_h.upcallHandle(PFNGLXQUERYCHANNELRECTSGIXPROC.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(PFNGLXQUERYCHANNELRECTSGIXPROC.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static int invoke(MemorySegment funcPtr,MemorySegment display, int screen, int channel, MemorySegment dx, MemorySegment dy, MemorySegment dw, MemorySegment dh) {
        try {
            return (int) DOWN$MH.invokeExact(funcPtr, display, screen, channel, dx, dy, dw, dh);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

