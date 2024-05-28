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
 * typedef GLboolean (*PFNGLISOBJECTBUFFERATIPROC)(GLuint)
 * }
 */
public class PFNGLISOBJECTBUFFERATIPROC {

    PFNGLISOBJECTBUFFERATIPROC() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        byte apply(int buffer);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
        glut_h.C_CHAR,
        glut_h.C_INT
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = glut_h.upcallHandle(PFNGLISOBJECTBUFFERATIPROC.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(PFNGLISOBJECTBUFFERATIPROC.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static byte invoke(MemorySegment funcPtr,int buffer) {
        try {
            return (byte) DOWN$MH.invokeExact(funcPtr, buffer);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

