// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1188 {

    static final FunctionDescriptor SafeArrayDestroyData$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SafeArrayDestroyData$MH = RuntimeHelper.downcallHandle(
        "SafeArrayDestroyData",
        constants$1188.SafeArrayDestroyData$FUNC
    );
    static final FunctionDescriptor SafeArrayAddRef$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SafeArrayAddRef$MH = RuntimeHelper.downcallHandle(
        "SafeArrayAddRef",
        constants$1188.SafeArrayAddRef$FUNC
    );
    static final FunctionDescriptor SafeArrayDestroy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SafeArrayDestroy$MH = RuntimeHelper.downcallHandle(
        "SafeArrayDestroy",
        constants$1188.SafeArrayDestroy$FUNC
    );
    static final FunctionDescriptor SafeArrayRedim$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SafeArrayRedim$MH = RuntimeHelper.downcallHandle(
        "SafeArrayRedim",
        constants$1188.SafeArrayRedim$FUNC
    );
    static final FunctionDescriptor SafeArrayGetDim$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SafeArrayGetDim$MH = RuntimeHelper.downcallHandle(
        "SafeArrayGetDim",
        constants$1188.SafeArrayGetDim$FUNC
    );
    static final FunctionDescriptor SafeArrayGetElemsize$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SafeArrayGetElemsize$MH = RuntimeHelper.downcallHandle(
        "SafeArrayGetElemsize",
        constants$1188.SafeArrayGetElemsize$FUNC
    );
}


