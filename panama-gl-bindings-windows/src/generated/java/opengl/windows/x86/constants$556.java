// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$556 {

    static final FunctionDescriptor GetUserGeoID$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetUserGeoID$MH = RuntimeHelper.downcallHandle(
        "GetUserGeoID",
        constants$556.GetUserGeoID$FUNC
    );
    static final FunctionDescriptor GetUserDefaultGeoName$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetUserDefaultGeoName$MH = RuntimeHelper.downcallHandle(
        "GetUserDefaultGeoName",
        constants$556.GetUserDefaultGeoName$FUNC
    );
    static final FunctionDescriptor SetUserGeoID$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetUserGeoID$MH = RuntimeHelper.downcallHandle(
        "SetUserGeoID",
        constants$556.SetUserGeoID$FUNC
    );
    static final FunctionDescriptor SetUserGeoName$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetUserGeoName$MH = RuntimeHelper.downcallHandle(
        "SetUserGeoName",
        constants$556.SetUserGeoName$FUNC
    );
    static final FunctionDescriptor ConvertDefaultLocale$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ConvertDefaultLocale$MH = RuntimeHelper.downcallHandle(
        "ConvertDefaultLocale",
        constants$556.ConvertDefaultLocale$FUNC
    );
    static final FunctionDescriptor GetSystemDefaultUILanguage$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT);
    static final MethodHandle GetSystemDefaultUILanguage$MH = RuntimeHelper.downcallHandle(
        "GetSystemDefaultUILanguage",
        constants$556.GetSystemDefaultUILanguage$FUNC
    );
}


