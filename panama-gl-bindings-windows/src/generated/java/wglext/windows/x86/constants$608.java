// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$608 {

    static final FunctionDescriptor DdeImpersonateClient$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DdeImpersonateClient$MH = RuntimeHelper.downcallHandle(
        "DdeImpersonateClient",
        constants$608.DdeImpersonateClient$FUNC
    );
    static final FunctionDescriptor DdeNameService$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DdeNameService$MH = RuntimeHelper.downcallHandle(
        "DdeNameService",
        constants$608.DdeNameService$FUNC
    );
    static final FunctionDescriptor DdeClientTransaction$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DdeClientTransaction$MH = RuntimeHelper.downcallHandle(
        "DdeClientTransaction",
        constants$608.DdeClientTransaction$FUNC
    );
    static final FunctionDescriptor DdeCreateDataHandle$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DdeCreateDataHandle$MH = RuntimeHelper.downcallHandle(
        "DdeCreateDataHandle",
        constants$608.DdeCreateDataHandle$FUNC
    );
    static final FunctionDescriptor DdeAddData$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DdeAddData$MH = RuntimeHelper.downcallHandle(
        "DdeAddData",
        constants$608.DdeAddData$FUNC
    );
    static final FunctionDescriptor DdeGetData$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DdeGetData$MH = RuntimeHelper.downcallHandle(
        "DdeGetData",
        constants$608.DdeGetData$FUNC
    );
}


