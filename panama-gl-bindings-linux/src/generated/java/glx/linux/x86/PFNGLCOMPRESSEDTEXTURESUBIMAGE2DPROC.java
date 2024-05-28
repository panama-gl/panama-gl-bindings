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
 * typedef void (*PFNGLCOMPRESSEDTEXTURESUBIMAGE2DPROC)(GLuint, GLint, GLint, GLint, GLsizei, GLsizei, GLenum, GLsizei, const void *)
 * }
 */
public class PFNGLCOMPRESSEDTEXTURESUBIMAGE2DPROC {

    PFNGLCOMPRESSEDTEXTURESUBIMAGE2DPROC() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        void apply(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, MemorySegment data);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
        glx_h.C_INT,
        glx_h.C_INT,
        glx_h.C_INT,
        glx_h.C_INT,
        glx_h.C_INT,
        glx_h.C_INT,
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

    private static final MethodHandle UP$MH = glx_h.upcallHandle(PFNGLCOMPRESSEDTEXTURESUBIMAGE2DPROC.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(PFNGLCOMPRESSEDTEXTURESUBIMAGE2DPROC.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static void invoke(MemorySegment funcPtr,int texture, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, MemorySegment data) {
        try {
             DOWN$MH.invokeExact(funcPtr, texture, level, xoffset, yoffset, width, height, format, imageSize, data);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

