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
 * typedef GLvdpauSurfaceNV (*PFNGLVDPAUREGISTERVIDEOSURFACEWITHPICTURESTRUCTURENVPROC)(const void *, GLenum, GLsizei, const GLuint *, GLboolean)
 * }
 */
public class PFNGLVDPAUREGISTERVIDEOSURFACEWITHPICTURESTRUCTURENVPROC {

    PFNGLVDPAUREGISTERVIDEOSURFACEWITHPICTURESTRUCTURENVPROC() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        long apply(MemorySegment vdpSurface, int target, int numTextureNames, MemorySegment textureNames, byte isFrameStructure);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
        glut_h.C_LONG,
        glut_h.C_POINTER,
        glut_h.C_INT,
        glut_h.C_INT,
        glut_h.C_POINTER,
        glut_h.C_CHAR
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = glut_h.upcallHandle(PFNGLVDPAUREGISTERVIDEOSURFACEWITHPICTURESTRUCTURENVPROC.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(PFNGLVDPAUREGISTERVIDEOSURFACEWITHPICTURESTRUCTURENVPROC.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static long invoke(MemorySegment funcPtr,MemorySegment vdpSurface, int target, int numTextureNames, MemorySegment textureNames, byte isFrameStructure) {
        try {
            return (long) DOWN$MH.invokeExact(funcPtr, vdpSurface, target, numTextureNames, textureNames, isFrameStructure);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

