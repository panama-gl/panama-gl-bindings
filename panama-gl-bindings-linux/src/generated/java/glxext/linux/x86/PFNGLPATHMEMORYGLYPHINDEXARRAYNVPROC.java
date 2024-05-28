// Generated by jextract

package glxext.linux.x86;

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
 * typedef GLenum (*PFNGLPATHMEMORYGLYPHINDEXARRAYNVPROC)(GLuint, GLenum, GLsizeiptr, const void *, GLsizei, GLuint, GLsizei, GLuint, GLfloat)
 * }
 */
public class PFNGLPATHMEMORYGLYPHINDEXARRAYNVPROC {

    PFNGLPATHMEMORYGLYPHINDEXARRAYNVPROC() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        int apply(int firstPathName, int fontTarget, long fontSize, MemorySegment fontData, int faceIndex, int firstGlyphIndex, int numGlyphs, int pathParameterTemplate, float emScale);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
        glxext_h.C_INT,
        glxext_h.C_INT,
        glxext_h.C_INT,
        glxext_h.C_LONG,
        glxext_h.C_POINTER,
        glxext_h.C_INT,
        glxext_h.C_INT,
        glxext_h.C_INT,
        glxext_h.C_INT,
        glxext_h.C_FLOAT
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = glxext_h.upcallHandle(PFNGLPATHMEMORYGLYPHINDEXARRAYNVPROC.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(PFNGLPATHMEMORYGLYPHINDEXARRAYNVPROC.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static int invoke(MemorySegment funcPtr,int firstPathName, int fontTarget, long fontSize, MemorySegment fontData, int faceIndex, int firstGlyphIndex, int numGlyphs, int pathParameterTemplate, float emScale) {
        try {
            return (int) DOWN$MH.invokeExact(funcPtr, firstPathName, fontTarget, fontSize, fontData, faceIndex, firstGlyphIndex, numGlyphs, pathParameterTemplate, emScale);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

