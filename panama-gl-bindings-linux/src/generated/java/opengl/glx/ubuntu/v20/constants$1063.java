// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.CLinker;
import jdk.incubator.foreign.FunctionDescriptor;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.MemorySegment;
import jdk.incubator.foreign.ResourceScope;
class constants$1063 {

    static final FunctionDescriptor PFNGLXQUERYFRAMETRACKINGMESAPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PFNGLXQUERYFRAMETRACKINGMESAPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1063.PFNGLXQUERYFRAMETRACKINGMESAPROC$FUNC, false
    );
    static final MemorySegment __FD_ZERO_STOS$SEGMENT = CLinker.toCString("stosq", ResourceScope.newImplicitScope());
    static final MemoryAddress NULL$ADDR = MemoryAddress.ofLong(0L);
    static final MemorySegment XNRequiredCharSet$SEGMENT = CLinker.toCString("requiredCharSet", ResourceScope.newImplicitScope());
    static final MemorySegment XNQueryOrientation$SEGMENT = CLinker.toCString("queryOrientation", ResourceScope.newImplicitScope());
}


