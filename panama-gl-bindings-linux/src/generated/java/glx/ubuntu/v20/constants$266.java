// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$266 {

    static final FunctionDescriptor PFNGLDELETESYNCPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNGLDELETESYNCPROC$MH = RuntimeHelper.downcallHandle(
        constants$266.PFNGLDELETESYNCPROC$FUNC
    );
    static final FunctionDescriptor PFNGLCLIENTWAITSYNCPROC$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle PFNGLCLIENTWAITSYNCPROC$MH = RuntimeHelper.downcallHandle(
        constants$266.PFNGLCLIENTWAITSYNCPROC$FUNC
    );
    static final FunctionDescriptor PFNGLWAITSYNCPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle PFNGLWAITSYNCPROC$MH = RuntimeHelper.downcallHandle(
        constants$266.PFNGLWAITSYNCPROC$FUNC
    );
}

