// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$706 {

    static final FunctionDescriptor RpcErrorEndEnumeration$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcErrorEndEnumeration$MH = RuntimeHelper.downcallHandle(
        "RpcErrorEndEnumeration",
        constants$706.RpcErrorEndEnumeration$FUNC
    );
    static final FunctionDescriptor RpcErrorResetEnumeration$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcErrorResetEnumeration$MH = RuntimeHelper.downcallHandle(
        "RpcErrorResetEnumeration",
        constants$706.RpcErrorResetEnumeration$FUNC
    );
    static final FunctionDescriptor RpcErrorGetNumberOfRecords$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcErrorGetNumberOfRecords$MH = RuntimeHelper.downcallHandle(
        "RpcErrorGetNumberOfRecords",
        constants$706.RpcErrorGetNumberOfRecords$FUNC
    );
    static final FunctionDescriptor RpcErrorSaveErrorInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcErrorSaveErrorInfo$MH = RuntimeHelper.downcallHandle(
        "RpcErrorSaveErrorInfo",
        constants$706.RpcErrorSaveErrorInfo$FUNC
    );
    static final FunctionDescriptor RpcErrorLoadErrorInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcErrorLoadErrorInfo$MH = RuntimeHelper.downcallHandle(
        "RpcErrorLoadErrorInfo",
        constants$706.RpcErrorLoadErrorInfo$FUNC
    );
    static final FunctionDescriptor RpcErrorAddRecord$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcErrorAddRecord$MH = RuntimeHelper.downcallHandle(
        "RpcErrorAddRecord",
        constants$706.RpcErrorAddRecord$FUNC
    );
}

