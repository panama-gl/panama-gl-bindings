// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$111 {

    static final FunctionDescriptor RtlDeleteFunctionTable$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RtlDeleteFunctionTable$MH = RuntimeHelper.downcallHandle(
        "RtlDeleteFunctionTable",
        constants$111.RtlDeleteFunctionTable$FUNC
    );
    static final FunctionDescriptor RtlInstallFunctionTableCallback$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RtlInstallFunctionTableCallback$MH = RuntimeHelper.downcallHandle(
        "RtlInstallFunctionTableCallback",
        constants$111.RtlInstallFunctionTableCallback$FUNC
    );
    static final FunctionDescriptor RtlAddGrowableFunctionTable$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle RtlAddGrowableFunctionTable$MH = RuntimeHelper.downcallHandle(
        "RtlAddGrowableFunctionTable",
        constants$111.RtlAddGrowableFunctionTable$FUNC
    );
    static final FunctionDescriptor RtlGrowFunctionTable$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RtlGrowFunctionTable$MH = RuntimeHelper.downcallHandle(
        "RtlGrowFunctionTable",
        constants$111.RtlGrowFunctionTable$FUNC
    );
    static final FunctionDescriptor RtlDeleteGrowableFunctionTable$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RtlDeleteGrowableFunctionTable$MH = RuntimeHelper.downcallHandle(
        "RtlDeleteGrowableFunctionTable",
        constants$111.RtlDeleteGrowableFunctionTable$FUNC
    );
    static final FunctionDescriptor RtlLookupFunctionEntry$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RtlLookupFunctionEntry$MH = RuntimeHelper.downcallHandle(
        "RtlLookupFunctionEntry",
        constants$111.RtlLookupFunctionEntry$FUNC
    );
}


