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
 * typedef void (*PFNGLGETPATHMETRICSNVPROC)(GLbitfield, GLsizei, GLenum, const void *, GLuint, GLsizei, GLfloat *)
 * }
 */
public class PFNGLGETPATHMETRICSNVPROC {

    PFNGLGETPATHMETRICSNVPROC() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        void apply(int metricQueryMask, int numPaths, int pathNameType, MemorySegment paths, int pathBase, int stride, MemorySegment metrics);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
        glx_h.C_INT,
        glx_h.C_INT,
        glx_h.C_INT,
        glx_h.C_POINTER,
        glx_h.C_INT,
        glx_h.C_INT,
        glx_h.C_POINTER
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = glx_h.upcallHandle(PFNGLGETPATHMETRICSNVPROC.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(PFNGLGETPATHMETRICSNVPROC.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static void invoke(MemorySegment funcPtr,int metricQueryMask, int numPaths, int pathNameType, MemorySegment paths, int pathBase, int stride, MemorySegment metrics) {
        try {
             DOWN$MH.invokeExact(funcPtr, metricQueryMask, numPaths, pathNameType, paths, pathBase, stride, metrics);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

