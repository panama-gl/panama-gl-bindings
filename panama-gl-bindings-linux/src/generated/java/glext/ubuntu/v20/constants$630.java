// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$630 {

    static final FunctionDescriptor PFNGLDEBUGMESSAGEENABLEAMDPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle PFNGLDEBUGMESSAGEENABLEAMDPROC$MH = RuntimeHelper.downcallHandle(
        constants$630.PFNGLDEBUGMESSAGEENABLEAMDPROC$FUNC
    );
    static final FunctionDescriptor PFNGLDEBUGMESSAGEINSERTAMDPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNGLDEBUGMESSAGEINSERTAMDPROC$MH = RuntimeHelper.downcallHandle(
        constants$630.PFNGLDEBUGMESSAGEINSERTAMDPROC$FUNC
    );
    static final FunctionDescriptor PFNGLDEBUGMESSAGECALLBACKAMDPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNGLDEBUGMESSAGECALLBACKAMDPROC$MH = RuntimeHelper.downcallHandle(
        constants$630.PFNGLDEBUGMESSAGECALLBACKAMDPROC$FUNC
    );
}

