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
 * typedef void (*PFNGLSECONDARYCOLOR3BEXTPROC)(GLbyte, GLbyte, GLbyte)
 * }
 */
public class PFNGLSECONDARYCOLOR3BEXTPROC {

    PFNGLSECONDARYCOLOR3BEXTPROC() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        void apply(byte red, byte green, byte blue);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
        glxext_h.C_CHAR,
        glxext_h.C_CHAR,
        glxext_h.C_CHAR
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = glxext_h.upcallHandle(PFNGLSECONDARYCOLOR3BEXTPROC.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(PFNGLSECONDARYCOLOR3BEXTPROC.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static void invoke(MemorySegment funcPtr,byte red, byte green, byte blue) {
        try {
             DOWN$MH.invokeExact(funcPtr, red, green, blue);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

