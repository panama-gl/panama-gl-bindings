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
 * typedef void (*PFNGLVERTEXATTRIB4HNVPROC)(GLuint, GLhalfNV, GLhalfNV, GLhalfNV, GLhalfNV)
 * }
 */
public class PFNGLVERTEXATTRIB4HNVPROC {

    PFNGLVERTEXATTRIB4HNVPROC() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        void apply(int index, short x, short y, short z, short w);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
        glxext_h.C_INT,
        glxext_h.C_SHORT,
        glxext_h.C_SHORT,
        glxext_h.C_SHORT,
        glxext_h.C_SHORT
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = glxext_h.upcallHandle(PFNGLVERTEXATTRIB4HNVPROC.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(PFNGLVERTEXATTRIB4HNVPROC.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static void invoke(MemorySegment funcPtr,int index, short x, short y, short z, short w) {
        try {
             DOWN$MH.invokeExact(funcPtr, index, x, y, z, w);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

