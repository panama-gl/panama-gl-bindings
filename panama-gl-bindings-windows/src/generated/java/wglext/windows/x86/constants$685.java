// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$685 {

    static final FunctionDescriptor I_RpcServerRegisterForwardFunction$pForwardFunction$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle I_RpcServerRegisterForwardFunction$pForwardFunction$MH = RuntimeHelper.downcallHandle(
        constants$685.I_RpcServerRegisterForwardFunction$pForwardFunction$FUNC
    );
    static final FunctionDescriptor I_RpcServerRegisterForwardFunction$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle I_RpcServerRegisterForwardFunction$MH = RuntimeHelper.downcallHandle(
        "I_RpcServerRegisterForwardFunction",
        constants$685.I_RpcServerRegisterForwardFunction$FUNC
    );
    static final FunctionDescriptor I_RpcServerInqAddressChangeFn$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle I_RpcServerInqAddressChangeFn$MH = RuntimeHelper.downcallHandle(
        "I_RpcServerInqAddressChangeFn",
        constants$685.I_RpcServerInqAddressChangeFn$FUNC
    );
    static final FunctionDescriptor I_RpcServerSetAddressChangeFn$pAddressChangeFn$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle I_RpcServerSetAddressChangeFn$pAddressChangeFn$MH = RuntimeHelper.downcallHandle(
        constants$685.I_RpcServerSetAddressChangeFn$pAddressChangeFn$FUNC
    );
    static final FunctionDescriptor I_RpcServerSetAddressChangeFn$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle I_RpcServerSetAddressChangeFn$MH = RuntimeHelper.downcallHandle(
        "I_RpcServerSetAddressChangeFn",
        constants$685.I_RpcServerSetAddressChangeFn$FUNC
    );
}

