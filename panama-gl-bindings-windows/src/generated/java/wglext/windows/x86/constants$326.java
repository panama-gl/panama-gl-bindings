// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$326 {

    static final FunctionDescriptor TzSpecificLocalTimeToSystemTimeEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle TzSpecificLocalTimeToSystemTimeEx$MH = RuntimeHelper.downcallHandle(
        "TzSpecificLocalTimeToSystemTimeEx",
        constants$326.TzSpecificLocalTimeToSystemTimeEx$FUNC
    );
    static final FunctionDescriptor LocalFileTimeToLocalSystemTime$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LocalFileTimeToLocalSystemTime$MH = RuntimeHelper.downcallHandle(
        "LocalFileTimeToLocalSystemTime",
        constants$326.LocalFileTimeToLocalSystemTime$FUNC
    );
    static final FunctionDescriptor LocalSystemTimeToLocalFileTime$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LocalSystemTimeToLocalFileTime$MH = RuntimeHelper.downcallHandle(
        "LocalSystemTimeToLocalFileTime",
        constants$326.LocalSystemTimeToLocalFileTime$FUNC
    );
    static final FunctionDescriptor SetSystemPowerState$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetSystemPowerState$MH = RuntimeHelper.downcallHandle(
        "SetSystemPowerState",
        constants$326.SetSystemPowerState$FUNC
    );
    static final FunctionDescriptor GetSystemPowerStatus$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetSystemPowerStatus$MH = RuntimeHelper.downcallHandle(
        "GetSystemPowerStatus",
        constants$326.GetSystemPowerStatus$FUNC
    );
    static final FunctionDescriptor MapUserPhysicalPagesScatter$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle MapUserPhysicalPagesScatter$MH = RuntimeHelper.downcallHandle(
        "MapUserPhysicalPagesScatter",
        constants$326.MapUserPhysicalPagesScatter$FUNC
    );
}

