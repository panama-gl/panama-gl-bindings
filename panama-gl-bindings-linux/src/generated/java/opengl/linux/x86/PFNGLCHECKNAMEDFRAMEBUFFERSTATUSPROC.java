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
 * typedef GLenum (*PFNGLCHECKNAMEDFRAMEBUFFERSTATUSPROC)(GLuint, GLenum)
 * }
 */
public class PFNGLCHECKNAMEDFRAMEBUFFERSTATUSPROC {

    PFNGLCHECKNAMEDFRAMEBUFFERSTATUSPROC() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        int apply(int framebuffer, int target);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
        glut_h.C_INT,
        glut_h.C_INT,
        glut_h.C_INT
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = glut_h.upcallHandle(PFNGLCHECKNAMEDFRAMEBUFFERSTATUSPROC.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(PFNGLCHECKNAMEDFRAMEBUFFERSTATUSPROC.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static int invoke(MemorySegment funcPtr,int framebuffer, int target) {
        try {
            return (int) DOWN$MH.invokeExact(funcPtr, framebuffer, target);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

