// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$905 {

    static final FunctionDescriptor PFNGLMAKEBUFFERRESIDENTNVPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle PFNGLMAKEBUFFERRESIDENTNVPROC$MH = RuntimeHelper.downcallHandle(
        constants$905.PFNGLMAKEBUFFERRESIDENTNVPROC$FUNC
    );
    static final FunctionDescriptor PFNGLMAKEBUFFERNONRESIDENTNVPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle PFNGLMAKEBUFFERNONRESIDENTNVPROC$MH = RuntimeHelper.downcallHandle(
        constants$905.PFNGLMAKEBUFFERNONRESIDENTNVPROC$FUNC
    );
    static final FunctionDescriptor PFNGLISBUFFERRESIDENTNVPROC$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle PFNGLISBUFFERRESIDENTNVPROC$MH = RuntimeHelper.downcallHandle(
        constants$905.PFNGLISBUFFERRESIDENTNVPROC$FUNC
    );
}


