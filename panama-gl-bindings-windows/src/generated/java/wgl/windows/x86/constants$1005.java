// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1005 {

    static final FunctionDescriptor CoTestCancel$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle CoTestCancel$MH = RuntimeHelper.downcallHandle(
        "CoTestCancel",
        constants$1005.CoTestCancel$FUNC
    );
    static final FunctionDescriptor CoEnableCallCancellation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CoEnableCallCancellation$MH = RuntimeHelper.downcallHandle(
        "CoEnableCallCancellation",
        constants$1005.CoEnableCallCancellation$FUNC
    );
    static final FunctionDescriptor CoDisableCallCancellation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CoDisableCallCancellation$MH = RuntimeHelper.downcallHandle(
        "CoDisableCallCancellation",
        constants$1005.CoDisableCallCancellation$FUNC
    );
    static final FunctionDescriptor StringFromCLSID$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle StringFromCLSID$MH = RuntimeHelper.downcallHandle(
        "StringFromCLSID",
        constants$1005.StringFromCLSID$FUNC
    );
    static final FunctionDescriptor CLSIDFromString$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CLSIDFromString$MH = RuntimeHelper.downcallHandle(
        "CLSIDFromString",
        constants$1005.CLSIDFromString$FUNC
    );
    static final FunctionDescriptor StringFromIID$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle StringFromIID$MH = RuntimeHelper.downcallHandle(
        "StringFromIID",
        constants$1005.StringFromIID$FUNC
    );
}


