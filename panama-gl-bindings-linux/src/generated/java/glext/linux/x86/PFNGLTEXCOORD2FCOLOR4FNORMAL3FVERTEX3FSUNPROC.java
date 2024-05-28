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
 * typedef void (*PFNGLTEXCOORD2FCOLOR4FNORMAL3FVERTEX3FSUNPROC)(GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat)
 * }
 */
public class PFNGLTEXCOORD2FCOLOR4FNORMAL3FVERTEX3FSUNPROC {

    PFNGLTEXCOORD2FCOLOR4FNORMAL3FVERTEX3FSUNPROC() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        void apply(float s, float t, float r, float g, float b, float a, float nx, float ny, float nz, float x, float y, float z);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
        glext_h.C_FLOAT,
        glext_h.C_FLOAT,
        glext_h.C_FLOAT,
        glext_h.C_FLOAT,
        glext_h.C_FLOAT,
        glext_h.C_FLOAT,
        glext_h.C_FLOAT,
        glext_h.C_FLOAT,
        glext_h.C_FLOAT,
        glext_h.C_FLOAT,
        glext_h.C_FLOAT,
        glext_h.C_FLOAT
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = glext_h.upcallHandle(PFNGLTEXCOORD2FCOLOR4FNORMAL3FVERTEX3FSUNPROC.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(PFNGLTEXCOORD2FCOLOR4FNORMAL3FVERTEX3FSUNPROC.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static void invoke(MemorySegment funcPtr,float s, float t, float r, float g, float b, float a, float nx, float ny, float nz, float x, float y, float z) {
        try {
             DOWN$MH.invokeExact(funcPtr, s, t, r, g, b, a, nx, ny, nz, x, y, z);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

