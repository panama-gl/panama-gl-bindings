// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$615 {

    static final FunctionDescriptor mciGetDeviceIDW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle mciGetDeviceIDW$MH = RuntimeHelper.downcallHandle(
        "mciGetDeviceIDW",
        constants$615.mciGetDeviceIDW$FUNC
    );
    static final FunctionDescriptor mciGetDeviceIDFromElementIDA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle mciGetDeviceIDFromElementIDA$MH = RuntimeHelper.downcallHandle(
        "mciGetDeviceIDFromElementIDA",
        constants$615.mciGetDeviceIDFromElementIDA$FUNC
    );
    static final FunctionDescriptor mciGetDeviceIDFromElementIDW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle mciGetDeviceIDFromElementIDW$MH = RuntimeHelper.downcallHandle(
        "mciGetDeviceIDFromElementIDW",
        constants$615.mciGetDeviceIDFromElementIDW$FUNC
    );
    static final FunctionDescriptor mciGetErrorStringA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle mciGetErrorStringA$MH = RuntimeHelper.downcallHandle(
        "mciGetErrorStringA",
        constants$615.mciGetErrorStringA$FUNC
    );
    static final FunctionDescriptor mciGetErrorStringW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle mciGetErrorStringW$MH = RuntimeHelper.downcallHandle(
        "mciGetErrorStringW",
        constants$615.mciGetErrorStringW$FUNC
    );
    static final FunctionDescriptor mciSetYieldProc$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle mciSetYieldProc$MH = RuntimeHelper.downcallHandle(
        "mciSetYieldProc",
        constants$615.mciSetYieldProc$FUNC
    );
}


