// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$659 {

    static final FunctionDescriptor RpcMgmtIsServerListening$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcMgmtIsServerListening$MH = RuntimeHelper.downcallHandle(
        "RpcMgmtIsServerListening",
        constants$659.RpcMgmtIsServerListening$FUNC
    );
    static final FunctionDescriptor RpcMgmtStopServerListening$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcMgmtStopServerListening$MH = RuntimeHelper.downcallHandle(
        "RpcMgmtStopServerListening",
        constants$659.RpcMgmtStopServerListening$FUNC
    );
    static final FunctionDescriptor RpcMgmtWaitServerListen$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle RpcMgmtWaitServerListen$MH = RuntimeHelper.downcallHandle(
        "RpcMgmtWaitServerListen",
        constants$659.RpcMgmtWaitServerListen$FUNC
    );
    static final FunctionDescriptor RpcMgmtSetServerStackSize$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RpcMgmtSetServerStackSize$MH = RuntimeHelper.downcallHandle(
        "RpcMgmtSetServerStackSize",
        constants$659.RpcMgmtSetServerStackSize$FUNC
    );
    static final FunctionDescriptor RpcSsDontSerializeContext$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle RpcSsDontSerializeContext$MH = RuntimeHelper.downcallHandle(
        "RpcSsDontSerializeContext",
        constants$659.RpcSsDontSerializeContext$FUNC
    );
    static final FunctionDescriptor RpcMgmtEnableIdleCleanup$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle RpcMgmtEnableIdleCleanup$MH = RuntimeHelper.downcallHandle(
        "RpcMgmtEnableIdleCleanup",
        constants$659.RpcMgmtEnableIdleCleanup$FUNC
    );
}

