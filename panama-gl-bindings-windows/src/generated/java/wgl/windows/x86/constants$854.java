// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$854 {

    static final FunctionDescriptor RPC_CLIENT_FREE$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RPC_CLIENT_FREE$MH = RuntimeHelper.downcallHandle(
        constants$854.RPC_CLIENT_FREE$FUNC
    );
    static final FunctionDescriptor RpcSsAllocate$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle RpcSsAllocate$MH = RuntimeHelper.downcallHandle(
        "RpcSsAllocate",
        constants$854.RpcSsAllocate$FUNC
    );
    static final FunctionDescriptor RpcSsDisableAllocate$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle RpcSsDisableAllocate$MH = RuntimeHelper.downcallHandle(
        "RpcSsDisableAllocate",
        constants$854.RpcSsDisableAllocate$FUNC
    );
    static final FunctionDescriptor RpcSsEnableAllocate$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle RpcSsEnableAllocate$MH = RuntimeHelper.downcallHandle(
        "RpcSsEnableAllocate",
        constants$854.RpcSsEnableAllocate$FUNC
    );
    static final FunctionDescriptor RpcSsFree$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcSsFree$MH = RuntimeHelper.downcallHandle(
        "RpcSsFree",
        constants$854.RpcSsFree$FUNC
    );
    static final FunctionDescriptor RpcSsGetThreadHandle$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle RpcSsGetThreadHandle$MH = RuntimeHelper.downcallHandle(
        "RpcSsGetThreadHandle",
        constants$854.RpcSsGetThreadHandle$FUNC
    );
}


