// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1057 {

    static final FunctionDescriptor PFNGLCALLCOMMANDLISTNVPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle PFNGLCALLCOMMANDLISTNVPROC$MH = RuntimeHelper.downcallHandle(
        constants$1057.PFNGLCALLCOMMANDLISTNVPROC$FUNC
    );
    static final FunctionDescriptor glCreateStatesNV$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glCreateStatesNV$MH = RuntimeHelper.downcallHandle(
        "glCreateStatesNV",
        constants$1057.glCreateStatesNV$FUNC
    );
    static final FunctionDescriptor glDeleteStatesNV$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glDeleteStatesNV$MH = RuntimeHelper.downcallHandle(
        "glDeleteStatesNV",
        constants$1057.glDeleteStatesNV$FUNC
    );
    static final FunctionDescriptor glIsStateNV$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glIsStateNV$MH = RuntimeHelper.downcallHandle(
        "glIsStateNV",
        constants$1057.glIsStateNV$FUNC
    );
    static final FunctionDescriptor glStateCaptureNV$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glStateCaptureNV$MH = RuntimeHelper.downcallHandle(
        "glStateCaptureNV",
        constants$1057.glStateCaptureNV$FUNC
    );
    static final FunctionDescriptor glGetCommandHeaderNV$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glGetCommandHeaderNV$MH = RuntimeHelper.downcallHandle(
        "glGetCommandHeaderNV",
        constants$1057.glGetCommandHeaderNV$FUNC
    );
}

