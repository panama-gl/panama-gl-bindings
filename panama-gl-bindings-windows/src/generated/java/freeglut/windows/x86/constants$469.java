// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$469 {

    static final FunctionDescriptor MapVirtualKeyExW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle MapVirtualKeyExW$MH = RuntimeHelper.downcallHandle(
        "MapVirtualKeyExW",
        constants$469.MapVirtualKeyExW$FUNC
    );
    static final FunctionDescriptor GetInputState$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle GetInputState$MH = RuntimeHelper.downcallHandle(
        "GetInputState",
        constants$469.GetInputState$FUNC
    );
    static final FunctionDescriptor GetQueueStatus$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetQueueStatus$MH = RuntimeHelper.downcallHandle(
        "GetQueueStatus",
        constants$469.GetQueueStatus$FUNC
    );
    static final FunctionDescriptor GetCapture$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle GetCapture$MH = RuntimeHelper.downcallHandle(
        "GetCapture",
        constants$469.GetCapture$FUNC
    );
    static final FunctionDescriptor SetCapture$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetCapture$MH = RuntimeHelper.downcallHandle(
        "SetCapture",
        constants$469.SetCapture$FUNC
    );
    static final FunctionDescriptor ReleaseCapture$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle ReleaseCapture$MH = RuntimeHelper.downcallHandle(
        "ReleaseCapture",
        constants$469.ReleaseCapture$FUNC
    );
}


