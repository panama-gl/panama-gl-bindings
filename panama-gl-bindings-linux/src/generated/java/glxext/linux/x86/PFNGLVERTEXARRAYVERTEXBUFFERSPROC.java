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
 * typedef void (*PFNGLVERTEXARRAYVERTEXBUFFERSPROC)(GLuint, GLuint, GLsizei, const GLuint *, const GLintptr *, const GLsizei *)
 * }
 */
public class PFNGLVERTEXARRAYVERTEXBUFFERSPROC {

    PFNGLVERTEXARRAYVERTEXBUFFERSPROC() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        void apply(int vaobj, int first, int count, MemorySegment buffers, MemorySegment offsets, MemorySegment strides);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
        glxext_h.C_INT,
        glxext_h.C_INT,
        glxext_h.C_INT,
        glxext_h.C_POINTER,
        glxext_h.C_POINTER,
        glxext_h.C_POINTER
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = glxext_h.upcallHandle(PFNGLVERTEXARRAYVERTEXBUFFERSPROC.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(PFNGLVERTEXARRAYVERTEXBUFFERSPROC.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static void invoke(MemorySegment funcPtr,int vaobj, int first, int count, MemorySegment buffers, MemorySegment offsets, MemorySegment strides) {
        try {
             DOWN$MH.invokeExact(funcPtr, vaobj, first, count, buffers, offsets, strides);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

