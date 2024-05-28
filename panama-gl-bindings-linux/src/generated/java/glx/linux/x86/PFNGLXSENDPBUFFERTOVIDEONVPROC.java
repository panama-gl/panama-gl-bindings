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
 * typedef int (*PFNGLXSENDPBUFFERTOVIDEONVPROC)(Display *, GLXPbuffer, int, unsigned long *, GLboolean)
 * }
 */
public class PFNGLXSENDPBUFFERTOVIDEONVPROC {

    PFNGLXSENDPBUFFERTOVIDEONVPROC() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        int apply(MemorySegment dpy, long pbuf, int iBufferType, MemorySegment pulCounterPbuffer, byte bBlock);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
        glx_h.C_INT,
        glx_h.C_POINTER,
        glx_h.C_LONG,
        glx_h.C_INT,
        glx_h.C_POINTER,
        glx_h.C_CHAR
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = glx_h.upcallHandle(PFNGLXSENDPBUFFERTOVIDEONVPROC.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(PFNGLXSENDPBUFFERTOVIDEONVPROC.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static int invoke(MemorySegment funcPtr,MemorySegment dpy, long pbuf, int iBufferType, MemorySegment pulCounterPbuffer, byte bBlock) {
        try {
            return (int) DOWN$MH.invokeExact(funcPtr, dpy, pbuf, iBufferType, pulCounterPbuffer, bBlock);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

