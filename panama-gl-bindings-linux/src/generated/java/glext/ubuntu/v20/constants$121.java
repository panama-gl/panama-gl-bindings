// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$121 {

    static final FunctionDescriptor PFNGLGETSHADERSOURCEPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNGLGETSHADERSOURCEPROC$MH = RuntimeHelper.downcallHandle(
        constants$121.PFNGLGETSHADERSOURCEPROC$FUNC
    );
    static final FunctionDescriptor PFNGLGETUNIFORMLOCATIONPROC$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNGLGETUNIFORMLOCATIONPROC$MH = RuntimeHelper.downcallHandle(
        constants$121.PFNGLGETUNIFORMLOCATIONPROC$FUNC
    );
    static final FunctionDescriptor PFNGLGETUNIFORMFVPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNGLGETUNIFORMFVPROC$MH = RuntimeHelper.downcallHandle(
        constants$121.PFNGLGETUNIFORMFVPROC$FUNC
    );
}


