// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$330 {

    static final FunctionDescriptor SetTimeZoneInformation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetTimeZoneInformation$MH = RuntimeHelper.downcallHandle(
        "SetTimeZoneInformation",
        constants$330.SetTimeZoneInformation$FUNC
    );
    static final FunctionDescriptor SetDynamicTimeZoneInformation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetDynamicTimeZoneInformation$MH = RuntimeHelper.downcallHandle(
        "SetDynamicTimeZoneInformation",
        constants$330.SetDynamicTimeZoneInformation$FUNC
    );
    static final FunctionDescriptor GetDynamicTimeZoneInformation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetDynamicTimeZoneInformation$MH = RuntimeHelper.downcallHandle(
        "GetDynamicTimeZoneInformation",
        constants$330.GetDynamicTimeZoneInformation$FUNC
    );
    static final FunctionDescriptor GetTimeZoneInformationForYear$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetTimeZoneInformationForYear$MH = RuntimeHelper.downcallHandle(
        "GetTimeZoneInformationForYear",
        constants$330.GetTimeZoneInformationForYear$FUNC
    );
    static final FunctionDescriptor EnumDynamicTimeZoneInformation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle EnumDynamicTimeZoneInformation$MH = RuntimeHelper.downcallHandle(
        "EnumDynamicTimeZoneInformation",
        constants$330.EnumDynamicTimeZoneInformation$FUNC
    );
    static final FunctionDescriptor GetDynamicTimeZoneInformationEffectiveYears$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetDynamicTimeZoneInformationEffectiveYears$MH = RuntimeHelper.downcallHandle(
        "GetDynamicTimeZoneInformationEffectiveYears",
        constants$330.GetDynamicTimeZoneInformationEffectiveYears$FUNC
    );
}


