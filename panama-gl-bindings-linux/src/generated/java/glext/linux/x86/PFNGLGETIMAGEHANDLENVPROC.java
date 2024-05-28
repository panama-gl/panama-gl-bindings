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
 * typedef GLuint64 (*PFNGLGETIMAGEHANDLENVPROC)(GLuint, GLint, GLboolean, GLint, GLenum)
 * }
 */
public class PFNGLGETIMAGEHANDLENVPROC {

    PFNGLGETIMAGEHANDLENVPROC() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        long apply(int texture, int level, byte layered, int layer, int format);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
        glext_h.C_LONG,
        glext_h.C_INT,
        glext_h.C_INT,
        glext_h.C_CHAR,
        glext_h.C_INT,
        glext_h.C_INT
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = glext_h.upcallHandle(PFNGLGETIMAGEHANDLENVPROC.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(PFNGLGETIMAGEHANDLENVPROC.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static long invoke(MemorySegment funcPtr,int texture, int level, byte layered, int layer, int format) {
        try {
            return (long) DOWN$MH.invokeExact(funcPtr, texture, level, layered, layer, format);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

