// Generated by jextract

package opengl.linux.x86;

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
 * typedef GLenum (*PFNGLPATHGLYPHINDEXRANGENVPROC)(GLenum, const void *, GLbitfield, GLuint, GLfloat, GLuint *)
 * }
 */
public class PFNGLPATHGLYPHINDEXRANGENVPROC {

    PFNGLPATHGLYPHINDEXRANGENVPROC() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        int apply(int fontTarget, MemorySegment fontName, int fontStyle, int pathParameterTemplate, float emScale, MemorySegment baseAndCount);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
        glut_h.C_INT,
        glut_h.C_INT,
        glut_h.C_POINTER,
        glut_h.C_INT,
        glut_h.C_INT,
        glut_h.C_FLOAT,
        glut_h.C_POINTER
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = glut_h.upcallHandle(PFNGLPATHGLYPHINDEXRANGENVPROC.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(PFNGLPATHGLYPHINDEXRANGENVPROC.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static int invoke(MemorySegment funcPtr,int fontTarget, MemorySegment fontName, int fontStyle, int pathParameterTemplate, float emScale, MemorySegment baseAndCount) {
        try {
            return (int) DOWN$MH.invokeExact(funcPtr, fontTarget, fontName, fontStyle, pathParameterTemplate, emScale, baseAndCount);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

