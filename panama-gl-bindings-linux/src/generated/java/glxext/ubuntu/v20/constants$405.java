// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$405 {

    static final FunctionDescriptor PFNGLDEBUGMESSAGEINSERTARBPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNGLDEBUGMESSAGEINSERTARBPROC$MH = RuntimeHelper.downcallHandle(
        constants$405.PFNGLDEBUGMESSAGEINSERTARBPROC$FUNC
    );
    static final FunctionDescriptor PFNGLDEBUGMESSAGECALLBACKARBPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNGLDEBUGMESSAGECALLBACKARBPROC$MH = RuntimeHelper.downcallHandle(
        constants$405.PFNGLDEBUGMESSAGECALLBACKARBPROC$FUNC
    );
    static final FunctionDescriptor PFNGLGETDEBUGMESSAGELOGARBPROC$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNGLGETDEBUGMESSAGELOGARBPROC$MH = RuntimeHelper.downcallHandle(
        constants$405.PFNGLGETDEBUGMESSAGELOGARBPROC$FUNC
    );
}


