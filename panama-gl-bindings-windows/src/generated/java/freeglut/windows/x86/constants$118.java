// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$118 {

    static final FunctionDescriptor RTL_UMS_SCHEDULER_ENTRY_POINT$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RTL_UMS_SCHEDULER_ENTRY_POINT$MH = RuntimeHelper.downcallHandle(
        constants$118.RTL_UMS_SCHEDULER_ENTRY_POINT$FUNC
    );
    static final FunctionDescriptor PRTL_UMS_SCHEDULER_ENTRY_POINT$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PRTL_UMS_SCHEDULER_ENTRY_POINT$MH = RuntimeHelper.downcallHandle(
        constants$118.PRTL_UMS_SCHEDULER_ENTRY_POINT$FUNC
    );
    static final FunctionDescriptor RtlCrc32$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RtlCrc32$MH = RuntimeHelper.downcallHandle(
        "RtlCrc32",
        constants$118.RtlCrc32$FUNC
    );
    static final FunctionDescriptor RtlCrc64$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle RtlCrc64$MH = RuntimeHelper.downcallHandle(
        "RtlCrc64",
        constants$118.RtlCrc64$FUNC
    );
    static final FunctionDescriptor RtlOsDeploymentState$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RtlOsDeploymentState$MH = RuntimeHelper.downcallHandle(
        "RtlOsDeploymentState",
        constants$118.RtlOsDeploymentState$FUNC
    );
}


