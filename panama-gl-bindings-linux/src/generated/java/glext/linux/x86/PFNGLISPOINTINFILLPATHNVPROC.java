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
 * typedef GLboolean (*PFNGLISPOINTINFILLPATHNVPROC)(GLuint, GLuint, GLfloat, GLfloat)
 * }
 */
public class PFNGLISPOINTINFILLPATHNVPROC {

    PFNGLISPOINTINFILLPATHNVPROC() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        byte apply(int path, int mask, float x, float y);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
        glext_h.C_CHAR,
        glext_h.C_INT,
        glext_h.C_INT,
        glext_h.C_FLOAT,
        glext_h.C_FLOAT
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = glext_h.upcallHandle(PFNGLISPOINTINFILLPATHNVPROC.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(PFNGLISPOINTINFILLPATHNVPROC.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static byte invoke(MemorySegment funcPtr,int path, int mask, float x, float y) {
        try {
            return (byte) DOWN$MH.invokeExact(funcPtr, path, mask, x, y);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

