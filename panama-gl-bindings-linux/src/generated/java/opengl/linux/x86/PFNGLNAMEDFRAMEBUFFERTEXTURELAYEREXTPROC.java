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
 * typedef void (*PFNGLNAMEDFRAMEBUFFERTEXTURELAYEREXTPROC)(GLuint, GLenum, GLuint, GLint, GLint)
 * }
 */
public class PFNGLNAMEDFRAMEBUFFERTEXTURELAYEREXTPROC {

    PFNGLNAMEDFRAMEBUFFERTEXTURELAYEREXTPROC() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        void apply(int framebuffer, int attachment, int texture, int level, int layer);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
        glut_h.C_INT,
        glut_h.C_INT,
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

    private static final MethodHandle UP$MH = glut_h.upcallHandle(PFNGLNAMEDFRAMEBUFFERTEXTURELAYEREXTPROC.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(PFNGLNAMEDFRAMEBUFFERTEXTURELAYEREXTPROC.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static void invoke(MemorySegment funcPtr,int framebuffer, int attachment, int texture, int level, int layer) {
        try {
             DOWN$MH.invokeExact(funcPtr, framebuffer, attachment, texture, level, layer);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

