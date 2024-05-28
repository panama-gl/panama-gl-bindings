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
 * typedef void (*PFNGLPRIMITIVEBOUNDINGBOXARBPROC)(GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat)
 * }
 */
public class PFNGLPRIMITIVEBOUNDINGBOXARBPROC {

    PFNGLPRIMITIVEBOUNDINGBOXARBPROC() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        void apply(float minX, float minY, float minZ, float minW, float maxX, float maxY, float maxZ, float maxW);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
        glut_h.C_FLOAT,
        glut_h.C_FLOAT,
        glut_h.C_FLOAT,
        glut_h.C_FLOAT,
        glut_h.C_FLOAT,
        glut_h.C_FLOAT,
        glut_h.C_FLOAT,
        glut_h.C_FLOAT
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = glut_h.upcallHandle(PFNGLPRIMITIVEBOUNDINGBOXARBPROC.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(PFNGLPRIMITIVEBOUNDINGBOXARBPROC.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static void invoke(MemorySegment funcPtr,float minX, float minY, float minZ, float minW, float maxX, float maxY, float maxZ, float maxW) {
        try {
             DOWN$MH.invokeExact(funcPtr, minX, minY, minZ, minW, maxX, maxY, maxZ, maxW);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

