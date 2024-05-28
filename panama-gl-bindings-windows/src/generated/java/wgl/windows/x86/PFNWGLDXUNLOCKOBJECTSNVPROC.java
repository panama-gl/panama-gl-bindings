// Generated by jextract

package wgl.windows.x86;

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
 * typedef BOOL (*PFNWGLDXUNLOCKOBJECTSNVPROC)(HANDLE, GLint, HANDLE *) __attribute__((stdcall))
 * }
 */
public class PFNWGLDXUNLOCKOBJECTSNVPROC {

    PFNWGLDXUNLOCKOBJECTSNVPROC() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        int apply(MemorySegment hDevice, int count, MemorySegment hObjects);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
        wgl_h.C_INT,
        wgl_h.C_POINTER,
        wgl_h.C_INT,
        wgl_h.C_POINTER
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = wgl_h.upcallHandle(PFNWGLDXUNLOCKOBJECTSNVPROC.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(PFNWGLDXUNLOCKOBJECTSNVPROC.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static int invoke(MemorySegment funcPtr,MemorySegment hDevice, int count, MemorySegment hObjects) {
        try {
            return (int) DOWN$MH.invokeExact(funcPtr, hDevice, count, hObjects);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

