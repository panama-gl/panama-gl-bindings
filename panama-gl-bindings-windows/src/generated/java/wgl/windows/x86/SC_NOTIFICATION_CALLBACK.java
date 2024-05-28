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
 * typedef void (SC_NOTIFICATION_CALLBACK)(DWORD, PVOID) __attribute__((stdcall))
 * }
 */
public class SC_NOTIFICATION_CALLBACK {

    SC_NOTIFICATION_CALLBACK() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        void apply(int dwNotify, MemorySegment pCallbackContext);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
        wgl_h.C_LONG,
        wgl_h.C_POINTER
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = wgl_h.upcallHandle(SC_NOTIFICATION_CALLBACK.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(SC_NOTIFICATION_CALLBACK.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static void invoke(MemorySegment funcPtr,int dwNotify, MemorySegment pCallbackContext) {
        try {
             DOWN$MH.invokeExact(funcPtr, dwNotify, pCallbackContext);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

