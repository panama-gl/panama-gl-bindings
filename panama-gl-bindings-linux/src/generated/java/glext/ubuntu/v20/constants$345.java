// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$345 {

    static final FunctionDescriptor PFNGLDEBUGMESSAGECALLBACKPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNGLDEBUGMESSAGECALLBACKPROC$MH = RuntimeHelper.downcallHandle(
        constants$345.PFNGLDEBUGMESSAGECALLBACKPROC$FUNC
    );
    static final FunctionDescriptor PFNGLGETDEBUGMESSAGELOGPROC$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNGLGETDEBUGMESSAGELOGPROC$MH = RuntimeHelper.downcallHandle(
        constants$345.PFNGLGETDEBUGMESSAGELOGPROC$FUNC
    );
    static final FunctionDescriptor PFNGLPUSHDEBUGGROUPPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNGLPUSHDEBUGGROUPPROC$MH = RuntimeHelper.downcallHandle(
        constants$345.PFNGLPUSHDEBUGGROUPPROC$FUNC
    );
}

