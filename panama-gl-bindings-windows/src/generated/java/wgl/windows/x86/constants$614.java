// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$614 {

    static final FunctionDescriptor YIELDPROC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle YIELDPROC$MH = RuntimeHelper.downcallHandle(
        constants$614.YIELDPROC$FUNC
    );
    static final FunctionDescriptor mciSendCommandA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle mciSendCommandA$MH = RuntimeHelper.downcallHandle(
        "mciSendCommandA",
        constants$614.mciSendCommandA$FUNC
    );
    static final FunctionDescriptor mciSendCommandW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle mciSendCommandW$MH = RuntimeHelper.downcallHandle(
        "mciSendCommandW",
        constants$614.mciSendCommandW$FUNC
    );
    static final FunctionDescriptor mciSendStringA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle mciSendStringA$MH = RuntimeHelper.downcallHandle(
        "mciSendStringA",
        constants$614.mciSendStringA$FUNC
    );
    static final FunctionDescriptor mciSendStringW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle mciSendStringW$MH = RuntimeHelper.downcallHandle(
        "mciSendStringW",
        constants$614.mciSendStringW$FUNC
    );
    static final FunctionDescriptor mciGetDeviceIDA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle mciGetDeviceIDA$MH = RuntimeHelper.downcallHandle(
        "mciGetDeviceIDA",
        constants$614.mciGetDeviceIDA$FUNC
    );
}

