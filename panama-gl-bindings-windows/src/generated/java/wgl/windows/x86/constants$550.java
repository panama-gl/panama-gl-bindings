// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$550 {

    static final FunctionDescriptor EnumSystemGeoID$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle EnumSystemGeoID$MH = RuntimeHelper.downcallHandle(
        "EnumSystemGeoID",
        constants$550.EnumSystemGeoID$FUNC
    );
    static final FunctionDescriptor EnumSystemGeoNames$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle EnumSystemGeoNames$MH = RuntimeHelper.downcallHandle(
        "EnumSystemGeoNames",
        constants$550.EnumSystemGeoNames$FUNC
    );
    static final FunctionDescriptor GetUserGeoID$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetUserGeoID$MH = RuntimeHelper.downcallHandle(
        "GetUserGeoID",
        constants$550.GetUserGeoID$FUNC
    );
    static final FunctionDescriptor GetUserDefaultGeoName$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetUserDefaultGeoName$MH = RuntimeHelper.downcallHandle(
        "GetUserDefaultGeoName",
        constants$550.GetUserDefaultGeoName$FUNC
    );
    static final FunctionDescriptor SetUserGeoID$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetUserGeoID$MH = RuntimeHelper.downcallHandle(
        "SetUserGeoID",
        constants$550.SetUserGeoID$FUNC
    );
    static final FunctionDescriptor SetUserGeoName$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetUserGeoName$MH = RuntimeHelper.downcallHandle(
        "SetUserGeoName",
        constants$550.SetUserGeoName$FUNC
    );
}


