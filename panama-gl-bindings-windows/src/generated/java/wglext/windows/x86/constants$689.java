// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$689 {

    static final FunctionDescriptor I_RpcServerUnregisterEndpointW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle I_RpcServerUnregisterEndpointW$MH = RuntimeHelper.downcallHandle(
        "I_RpcServerUnregisterEndpointW",
        constants$689.I_RpcServerUnregisterEndpointW$FUNC
    );
    static final FunctionDescriptor I_RpcServerInqTransportType$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle I_RpcServerInqTransportType$MH = RuntimeHelper.downcallHandle(
        "I_RpcServerInqTransportType",
        constants$689.I_RpcServerInqTransportType$FUNC
    );
    static final FunctionDescriptor I_RpcMapWin32Status$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle I_RpcMapWin32Status$MH = RuntimeHelper.downcallHandle(
        "I_RpcMapWin32Status",
        constants$689.I_RpcMapWin32Status$FUNC
    );
    static final FunctionDescriptor I_RpcProxyIsValidMachineFn$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle I_RpcProxyIsValidMachineFn$MH = RuntimeHelper.downcallHandle(
        constants$689.I_RpcProxyIsValidMachineFn$FUNC
    );
    static final FunctionDescriptor I_RpcProxyGetClientAddressFn$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
}

