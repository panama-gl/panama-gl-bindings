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
 * typedef GLuint (*PFNGLASYNCCOPYBUFFERSUBDATANVXPROC)(GLsizei, const GLuint *, const GLuint64 *, GLuint, GLbitfield, GLuint, GLuint, GLintptr, GLintptr, GLsizeiptr, GLsizei, const GLuint *, const GLuint64 *)
 * }
 */
public class PFNGLASYNCCOPYBUFFERSUBDATANVXPROC {

    PFNGLASYNCCOPYBUFFERSUBDATANVXPROC() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        int apply(int waitSemaphoreCount, MemorySegment waitSemaphoreArray, MemorySegment fenceValueArray, int readGpu, int writeGpuMask, int readBuffer, int writeBuffer, long readOffset, long writeOffset, long size, int signalSemaphoreCount, MemorySegment signalSemaphoreArray, MemorySegment signalValueArray);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
        glxext_h.C_INT,
        glxext_h.C_INT,
        glxext_h.C_POINTER,
        glxext_h.C_POINTER,
        glxext_h.C_INT,
        glxext_h.C_INT,
        glxext_h.C_INT,
        glxext_h.C_INT,
        glxext_h.C_LONG,
        glxext_h.C_LONG,
        glxext_h.C_LONG,
        glxext_h.C_INT,
        glxext_h.C_POINTER,
        glxext_h.C_POINTER
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = glxext_h.upcallHandle(PFNGLASYNCCOPYBUFFERSUBDATANVXPROC.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(PFNGLASYNCCOPYBUFFERSUBDATANVXPROC.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static int invoke(MemorySegment funcPtr,int waitSemaphoreCount, MemorySegment waitSemaphoreArray, MemorySegment fenceValueArray, int readGpu, int writeGpuMask, int readBuffer, int writeBuffer, long readOffset, long writeOffset, long size, int signalSemaphoreCount, MemorySegment signalSemaphoreArray, MemorySegment signalValueArray) {
        try {
            return (int) DOWN$MH.invokeExact(funcPtr, waitSemaphoreCount, waitSemaphoreArray, fenceValueArray, readGpu, writeGpuMask, readBuffer, writeBuffer, readOffset, writeOffset, size, signalSemaphoreCount, signalSemaphoreArray, signalValueArray);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

