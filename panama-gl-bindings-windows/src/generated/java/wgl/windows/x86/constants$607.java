// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$607 {

    static final FunctionDescriptor DdeReconnect$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DdeReconnect$MH = RuntimeHelper.downcallHandle(
        "DdeReconnect",
        constants$607.DdeReconnect$FUNC
    );
    static final FunctionDescriptor DdeQueryConvInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DdeQueryConvInfo$MH = RuntimeHelper.downcallHandle(
        "DdeQueryConvInfo",
        constants$607.DdeQueryConvInfo$FUNC
    );
    static final FunctionDescriptor DdeSetUserHandle$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle DdeSetUserHandle$MH = RuntimeHelper.downcallHandle(
        "DdeSetUserHandle",
        constants$607.DdeSetUserHandle$FUNC
    );
    static final FunctionDescriptor DdeAbandonTransaction$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DdeAbandonTransaction$MH = RuntimeHelper.downcallHandle(
        "DdeAbandonTransaction",
        constants$607.DdeAbandonTransaction$FUNC
    );
    static final FunctionDescriptor DdePostAdvise$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DdePostAdvise$MH = RuntimeHelper.downcallHandle(
        "DdePostAdvise",
        constants$607.DdePostAdvise$FUNC
    );
    static final FunctionDescriptor DdeEnableCallback$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DdeEnableCallback$MH = RuntimeHelper.downcallHandle(
        "DdeEnableCallback",
        constants$607.DdeEnableCallback$FUNC
    );
}


