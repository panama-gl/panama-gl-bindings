// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1402 {

    static final FunctionDescriptor PFNWGLFREEMEMORYNVPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNWGLFREEMEMORYNVPROC$MH = RuntimeHelper.downcallHandle(
        constants$1402.PFNWGLFREEMEMORYNVPROC$FUNC
    );
    static final FunctionDescriptor PFNWGLBINDVIDEOCAPTUREDEVICENVPROC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNWGLBINDVIDEOCAPTUREDEVICENVPROC$MH = RuntimeHelper.downcallHandle(
        constants$1402.PFNWGLBINDVIDEOCAPTUREDEVICENVPROC$FUNC
    );
    static final FunctionDescriptor PFNWGLENUMERATEVIDEOCAPTUREDEVICESNVPROC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNWGLENUMERATEVIDEOCAPTUREDEVICESNVPROC$MH = RuntimeHelper.downcallHandle(
        constants$1402.PFNWGLENUMERATEVIDEOCAPTUREDEVICESNVPROC$FUNC
    );
}


