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
 * typedef void (*PFNGLNORMAL3FVERTEX3FVSUNPROC)(const GLfloat *, const GLfloat *)
 * }
 */
public class PFNGLNORMAL3FVERTEX3FVSUNPROC {

    PFNGLNORMAL3FVERTEX3FVSUNPROC() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        void apply(MemorySegment n, MemorySegment v);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
        glext_h.C_POINTER,
        glext_h.C_POINTER
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = glext_h.upcallHandle(PFNGLNORMAL3FVERTEX3FVSUNPROC.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(PFNGLNORMAL3FVERTEX3FVSUNPROC.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static void invoke(MemorySegment funcPtr,MemorySegment n, MemorySegment v) {
        try {
             DOWN$MH.invokeExact(funcPtr, n, v);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

