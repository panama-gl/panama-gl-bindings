// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$549 {

    static final FunctionDescriptor IsValidLanguageGroup$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle IsValidLanguageGroup$MH = RuntimeHelper.downcallHandle(
        "IsValidLanguageGroup",
        constants$549.IsValidLanguageGroup$FUNC
    );
    static final FunctionDescriptor GetNLSVersion$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetNLSVersion$MH = RuntimeHelper.downcallHandle(
        "GetNLSVersion",
        constants$549.GetNLSVersion$FUNC
    );
    static final FunctionDescriptor IsValidLocale$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle IsValidLocale$MH = RuntimeHelper.downcallHandle(
        "IsValidLocale",
        constants$549.IsValidLocale$FUNC
    );
    static final FunctionDescriptor GetGeoInfoA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle GetGeoInfoA$MH = RuntimeHelper.downcallHandle(
        "GetGeoInfoA",
        constants$549.GetGeoInfoA$FUNC
    );
    static final FunctionDescriptor GetGeoInfoW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle GetGeoInfoW$MH = RuntimeHelper.downcallHandle(
        "GetGeoInfoW",
        constants$549.GetGeoInfoW$FUNC
    );
    static final FunctionDescriptor GetGeoInfoEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetGeoInfoEx$MH = RuntimeHelper.downcallHandle(
        "GetGeoInfoEx",
        constants$549.GetGeoInfoEx$FUNC
    );
}

