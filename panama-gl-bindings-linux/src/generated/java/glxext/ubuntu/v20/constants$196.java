// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$196 {

    static final FunctionDescriptor PFNGLISBUFFERPROC$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle PFNGLISBUFFERPROC$MH = RuntimeHelper.downcallHandle(
        constants$196.PFNGLISBUFFERPROC$FUNC
    );
    static final FunctionDescriptor PFNGLBUFFERDATAPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle PFNGLBUFFERDATAPROC$MH = RuntimeHelper.downcallHandle(
        constants$196.PFNGLBUFFERDATAPROC$FUNC
    );
    static final FunctionDescriptor PFNGLBUFFERSUBDATAPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNGLBUFFERSUBDATAPROC$MH = RuntimeHelper.downcallHandle(
        constants$196.PFNGLBUFFERSUBDATAPROC$FUNC
    );
}

