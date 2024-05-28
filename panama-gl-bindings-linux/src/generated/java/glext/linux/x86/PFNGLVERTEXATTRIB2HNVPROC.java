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
 * typedef void (*PFNGLVERTEXATTRIB2HNVPROC)(GLuint, GLhalfNV, GLhalfNV)
 * }
 */
public class PFNGLVERTEXATTRIB2HNVPROC {

    PFNGLVERTEXATTRIB2HNVPROC() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        void apply(int index, short x, short y);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
        glext_h.C_INT,
        glext_h.C_SHORT,
        glext_h.C_SHORT
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = glext_h.upcallHandle(PFNGLVERTEXATTRIB2HNVPROC.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(PFNGLVERTEXATTRIB2HNVPROC.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static void invoke(MemorySegment funcPtr,int index, short x, short y) {
        try {
             DOWN$MH.invokeExact(funcPtr, index, x, y);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

