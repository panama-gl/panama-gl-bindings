// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$463 {

    static final FunctionDescriptor MapVirtualKeyA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle MapVirtualKeyA$MH = RuntimeHelper.downcallHandle(
        "MapVirtualKeyA",
        constants$463.MapVirtualKeyA$FUNC
    );
    static final FunctionDescriptor MapVirtualKeyW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle MapVirtualKeyW$MH = RuntimeHelper.downcallHandle(
        "MapVirtualKeyW",
        constants$463.MapVirtualKeyW$FUNC
    );
    static final FunctionDescriptor MapVirtualKeyExA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle MapVirtualKeyExA$MH = RuntimeHelper.downcallHandle(
        "MapVirtualKeyExA",
        constants$463.MapVirtualKeyExA$FUNC
    );
    static final FunctionDescriptor MapVirtualKeyExW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle MapVirtualKeyExW$MH = RuntimeHelper.downcallHandle(
        "MapVirtualKeyExW",
        constants$463.MapVirtualKeyExW$FUNC
    );
    static final FunctionDescriptor GetInputState$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle GetInputState$MH = RuntimeHelper.downcallHandle(
        "GetInputState",
        constants$463.GetInputState$FUNC
    );
    static final FunctionDescriptor GetQueueStatus$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetQueueStatus$MH = RuntimeHelper.downcallHandle(
        "GetQueueStatus",
        constants$463.GetQueueStatus$FUNC
    );
}


