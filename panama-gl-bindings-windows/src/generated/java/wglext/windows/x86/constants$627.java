// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$627 {

    static final FunctionDescriptor waveOutGetErrorTextW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle waveOutGetErrorTextW$MH = RuntimeHelper.downcallHandle(
        "waveOutGetErrorTextW",
        constants$627.waveOutGetErrorTextW$FUNC
    );
    static final FunctionDescriptor waveOutOpen$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle waveOutOpen$MH = RuntimeHelper.downcallHandle(
        "waveOutOpen",
        constants$627.waveOutOpen$FUNC
    );
    static final FunctionDescriptor waveOutClose$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle waveOutClose$MH = RuntimeHelper.downcallHandle(
        "waveOutClose",
        constants$627.waveOutClose$FUNC
    );
    static final FunctionDescriptor waveOutPrepareHeader$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle waveOutPrepareHeader$MH = RuntimeHelper.downcallHandle(
        "waveOutPrepareHeader",
        constants$627.waveOutPrepareHeader$FUNC
    );
    static final FunctionDescriptor waveOutUnprepareHeader$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle waveOutUnprepareHeader$MH = RuntimeHelper.downcallHandle(
        "waveOutUnprepareHeader",
        constants$627.waveOutUnprepareHeader$FUNC
    );
    static final FunctionDescriptor waveOutWrite$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle waveOutWrite$MH = RuntimeHelper.downcallHandle(
        "waveOutWrite",
        constants$627.waveOutWrite$FUNC
    );
}

