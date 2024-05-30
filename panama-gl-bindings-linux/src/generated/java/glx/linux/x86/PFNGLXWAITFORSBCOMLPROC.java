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
 * typedef int (*PFNGLXWAITFORSBCOMLPROC)(Display *, GLXDrawable, int64_t, int64_t *, int64_t *, int64_t *)
 * }
 */
public class PFNGLXWAITFORSBCOMLPROC {

    PFNGLXWAITFORSBCOMLPROC() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        int apply(MemorySegment dpy, long drawable, long target_sbc, MemorySegment ust, MemorySegment msc, MemorySegment sbc);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
        glx_h.C_INT,
        glx_h.C_POINTER,
        glx_h.C_LONG,
        glx_h.C_LONG,
        glx_h.C_POINTER,
        glx_h.C_POINTER,
        glx_h.C_POINTER
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = glx_h.upcallHandle(PFNGLXWAITFORSBCOMLPROC.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(PFNGLXWAITFORSBCOMLPROC.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static int invoke(MemorySegment funcPtr,MemorySegment dpy, long drawable, long target_sbc, MemorySegment ust, MemorySegment msc, MemorySegment sbc) {
        try {
            return (int) DOWN$MH.invokeExact(funcPtr, dpy, drawable, target_sbc, ust, msc, sbc);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}
