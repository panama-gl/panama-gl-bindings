// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$210 {

    static final FunctionDescriptor LoadEnclaveData$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LoadEnclaveData$MH = RuntimeHelper.downcallHandle(
        "LoadEnclaveData",
        constants$210.LoadEnclaveData$FUNC
    );
    static final FunctionDescriptor InitializeEnclave$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle InitializeEnclave$MH = RuntimeHelper.downcallHandle(
        "InitializeEnclave",
        constants$210.InitializeEnclave$FUNC
    );
    static final FunctionDescriptor LoadEnclaveImageA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LoadEnclaveImageA$MH = RuntimeHelper.downcallHandle(
        "LoadEnclaveImageA",
        constants$210.LoadEnclaveImageA$FUNC
    );
    static final FunctionDescriptor LoadEnclaveImageW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LoadEnclaveImageW$MH = RuntimeHelper.downcallHandle(
        "LoadEnclaveImageW",
        constants$210.LoadEnclaveImageW$FUNC
    );
    static final FunctionDescriptor CallEnclave$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CallEnclave$MH = RuntimeHelper.downcallHandle(
        "CallEnclave",
        constants$210.CallEnclave$FUNC
    );
    static final FunctionDescriptor TerminateEnclave$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle TerminateEnclave$MH = RuntimeHelper.downcallHandle(
        "TerminateEnclave",
        constants$210.TerminateEnclave$FUNC
    );
}


