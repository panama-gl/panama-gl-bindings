// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$693 {

    static final FunctionDescriptor I_RpcMgmtEnableDedicatedThreadPool$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle I_RpcMgmtEnableDedicatedThreadPool$MH = RuntimeHelper.downcallHandle(
        "I_RpcMgmtEnableDedicatedThreadPool",
        constants$693.I_RpcMgmtEnableDedicatedThreadPool$FUNC
    );
    static final FunctionDescriptor I_RpcGetDefaultSD$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle I_RpcGetDefaultSD$MH = RuntimeHelper.downcallHandle(
        "I_RpcGetDefaultSD",
        constants$693.I_RpcGetDefaultSD$FUNC
    );
    static final FunctionDescriptor I_RpcOpenClientProcess$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle I_RpcOpenClientProcess$MH = RuntimeHelper.downcallHandle(
        "I_RpcOpenClientProcess",
        constants$693.I_RpcOpenClientProcess$FUNC
    );
    static final FunctionDescriptor I_RpcBindingIsServerLocal$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle I_RpcBindingIsServerLocal$MH = RuntimeHelper.downcallHandle(
        "I_RpcBindingIsServerLocal",
        constants$693.I_RpcBindingIsServerLocal$FUNC
    );
    static final FunctionDescriptor I_RpcBindingSetPrivateOption$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle I_RpcBindingSetPrivateOption$MH = RuntimeHelper.downcallHandle(
        "I_RpcBindingSetPrivateOption",
        constants$693.I_RpcBindingSetPrivateOption$FUNC
    );
    static final FunctionDescriptor I_RpcServerSubscribeForDisconnectNotification$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle I_RpcServerSubscribeForDisconnectNotification$MH = RuntimeHelper.downcallHandle(
        "I_RpcServerSubscribeForDisconnectNotification",
        constants$693.I_RpcServerSubscribeForDisconnectNotification$FUNC
    );
}

