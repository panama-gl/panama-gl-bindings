// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$645 {

    static final FunctionDescriptor joyGetDevCapsW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle joyGetDevCapsW$MH = RuntimeHelper.downcallHandle(
        "joyGetDevCapsW",
        constants$645.joyGetDevCapsW$FUNC
    );
    static final FunctionDescriptor joyGetPos$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle joyGetPos$MH = RuntimeHelper.downcallHandle(
        "joyGetPos",
        constants$645.joyGetPos$FUNC
    );
    static final FunctionDescriptor joyGetThreshold$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle joyGetThreshold$MH = RuntimeHelper.downcallHandle(
        "joyGetThreshold",
        constants$645.joyGetThreshold$FUNC
    );
    static final FunctionDescriptor joyReleaseCapture$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle joyReleaseCapture$MH = RuntimeHelper.downcallHandle(
        "joyReleaseCapture",
        constants$645.joyReleaseCapture$FUNC
    );
    static final FunctionDescriptor joySetCapture$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle joySetCapture$MH = RuntimeHelper.downcallHandle(
        "joySetCapture",
        constants$645.joySetCapture$FUNC
    );
    static final FunctionDescriptor joySetThreshold$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle joySetThreshold$MH = RuntimeHelper.downcallHandle(
        "joySetThreshold",
        constants$645.joySetThreshold$FUNC
    );
}


