// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$517 {

    static final FunctionDescriptor DisplayConfigGetDeviceInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DisplayConfigGetDeviceInfo$MH = RuntimeHelper.downcallHandle(
        "DisplayConfigGetDeviceInfo",
        constants$517.DisplayConfigGetDeviceInfo$FUNC
    );
    static final FunctionDescriptor DisplayConfigSetDeviceInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DisplayConfigSetDeviceInfo$MH = RuntimeHelper.downcallHandle(
        "DisplayConfigSetDeviceInfo",
        constants$517.DisplayConfigSetDeviceInfo$FUNC
    );
    static final FunctionDescriptor SystemParametersInfoA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SystemParametersInfoA$MH = RuntimeHelper.downcallHandle(
        "SystemParametersInfoA",
        constants$517.SystemParametersInfoA$FUNC
    );
    static final FunctionDescriptor SystemParametersInfoW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SystemParametersInfoW$MH = RuntimeHelper.downcallHandle(
        "SystemParametersInfoW",
        constants$517.SystemParametersInfoW$FUNC
    );
    static final FunctionDescriptor SystemParametersInfoForDpi$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SystemParametersInfoForDpi$MH = RuntimeHelper.downcallHandle(
        "SystemParametersInfoForDpi",
        constants$517.SystemParametersInfoForDpi$FUNC
    );
    static final FunctionDescriptor SoundSentry$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle SoundSentry$MH = RuntimeHelper.downcallHandle(
        "SoundSentry",
        constants$517.SoundSentry$FUNC
    );
}

