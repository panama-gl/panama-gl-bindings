// Generated by jextract

package freeglut.windows.x86;

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
 * typedef DWORD (*LPPROGRESS_ROUTINE)(LARGE_INTEGER, LARGE_INTEGER, LARGE_INTEGER, LARGE_INTEGER, DWORD, DWORD, HANDLE, HANDLE, LPVOID) __attribute__((stdcall))
 * }
 */
public class LPPROGRESS_ROUTINE {

    LPPROGRESS_ROUTINE() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        int apply(MemorySegment TotalFileSize, MemorySegment TotalBytesTransferred, MemorySegment StreamSize, MemorySegment StreamBytesTransferred, int dwStreamNumber, int dwCallbackReason, MemorySegment hSourceFile, MemorySegment hDestinationFile, MemorySegment lpData);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
        freeglut_h.C_LONG,
        _LARGE_INTEGER.layout(),
        _LARGE_INTEGER.layout(),
        _LARGE_INTEGER.layout(),
        _LARGE_INTEGER.layout(),
        freeglut_h.C_LONG,
        freeglut_h.C_LONG,
        freeglut_h.C_POINTER,
        freeglut_h.C_POINTER,
        freeglut_h.C_POINTER
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = freeglut_h.upcallHandle(LPPROGRESS_ROUTINE.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(LPPROGRESS_ROUTINE.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static int invoke(MemorySegment funcPtr,MemorySegment TotalFileSize, MemorySegment TotalBytesTransferred, MemorySegment StreamSize, MemorySegment StreamBytesTransferred, int dwStreamNumber, int dwCallbackReason, MemorySegment hSourceFile, MemorySegment hDestinationFile, MemorySegment lpData) {
        try {
            return (int) DOWN$MH.invokeExact(funcPtr, TotalFileSize, TotalBytesTransferred, StreamSize, StreamBytesTransferred, dwStreamNumber, dwCallbackReason, hSourceFile, hDestinationFile, lpData);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

