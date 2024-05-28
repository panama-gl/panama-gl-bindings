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
 * typedef void (*PFNGLMULTITEXCOORD4FARBPROC)(GLenum, GLfloat, GLfloat, GLfloat, GLfloat)
 * }
 */
public class PFNGLMULTITEXCOORD4FARBPROC {

    PFNGLMULTITEXCOORD4FARBPROC() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        void apply(int target, float s, float t, float r, float q);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
        glut_h.C_INT,
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

    private static final MethodHandle UP$MH = glut_h.upcallHandle(PFNGLMULTITEXCOORD4FARBPROC.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(PFNGLMULTITEXCOORD4FARBPROC.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static void invoke(MemorySegment funcPtr,int target, float s, float t, float r, float q) {
        try {
             DOWN$MH.invokeExact(funcPtr, target, s, t, r, q);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

