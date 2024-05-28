// Generated by jextract

package glext.linux.x86;

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
 * typedef GLuint (*PFNGLGETDEBUGMESSAGELOGAMDPROC)(GLuint, GLsizei, GLenum *, GLuint *, GLuint *, GLsizei *, GLchar *)
 * }
 */
public class PFNGLGETDEBUGMESSAGELOGAMDPROC {

    PFNGLGETDEBUGMESSAGELOGAMDPROC() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        int apply(int count, int bufsize, MemorySegment categories, MemorySegment severities, MemorySegment ids, MemorySegment lengths, MemorySegment message);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
        glext_h.C_INT,
        glext_h.C_INT,
        glext_h.C_INT,
        glext_h.C_POINTER,
        glext_h.C_POINTER,
        glext_h.C_POINTER,
        glext_h.C_POINTER,
        glext_h.C_POINTER
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = glext_h.upcallHandle(PFNGLGETDEBUGMESSAGELOGAMDPROC.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(PFNGLGETDEBUGMESSAGELOGAMDPROC.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static int invoke(MemorySegment funcPtr,int count, int bufsize, MemorySegment categories, MemorySegment severities, MemorySegment ids, MemorySegment lengths, MemorySegment message) {
        try {
            return (int) DOWN$MH.invokeExact(funcPtr, count, bufsize, categories, severities, ids, lengths, message);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

