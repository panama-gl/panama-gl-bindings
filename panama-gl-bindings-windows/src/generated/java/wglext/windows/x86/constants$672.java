// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$672 {

    static final FunctionDescriptor RpcExceptionFilter$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RpcExceptionFilter$MH = RuntimeHelper.downcallHandle(
        "RpcExceptionFilter",
        constants$672.RpcExceptionFilter$FUNC
    );
    static final FunctionDescriptor RPC_INTERFACE_GROUP_IDLE_CALLBACK_FN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RPC_INTERFACE_GROUP_IDLE_CALLBACK_FN$MH = RuntimeHelper.downcallHandle(
        constants$672.RPC_INTERFACE_GROUP_IDLE_CALLBACK_FN$FUNC
    );
    static final FunctionDescriptor RpcServerInterfaceGroupCreateW$IdleCallbackFn$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RpcServerInterfaceGroupCreateW$IdleCallbackFn$MH = RuntimeHelper.downcallHandle(
        constants$672.RpcServerInterfaceGroupCreateW$IdleCallbackFn$FUNC
    );
    static final FunctionDescriptor RpcServerInterfaceGroupCreateW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcServerInterfaceGroupCreateW$MH = RuntimeHelper.downcallHandle(
        "RpcServerInterfaceGroupCreateW",
        constants$672.RpcServerInterfaceGroupCreateW$FUNC
    );
}


