// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$164 {

    static final FunctionDescriptor PostQueuedCompletionStatus$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PostQueuedCompletionStatus$MH = RuntimeHelper.downcallHandle(
        "PostQueuedCompletionStatus",
        constants$164.PostQueuedCompletionStatus$FUNC
    );
    static final FunctionDescriptor DeviceIoControl$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DeviceIoControl$MH = RuntimeHelper.downcallHandle(
        "DeviceIoControl",
        constants$164.DeviceIoControl$FUNC
    );
    static final FunctionDescriptor GetOverlappedResult$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetOverlappedResult$MH = RuntimeHelper.downcallHandle(
        "GetOverlappedResult",
        constants$164.GetOverlappedResult$FUNC
    );
    static final FunctionDescriptor CancelIoEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CancelIoEx$MH = RuntimeHelper.downcallHandle(
        "CancelIoEx",
        constants$164.CancelIoEx$FUNC
    );
    static final FunctionDescriptor CancelIo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CancelIo$MH = RuntimeHelper.downcallHandle(
        "CancelIo",
        constants$164.CancelIo$FUNC
    );
    static final FunctionDescriptor GetOverlappedResultEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetOverlappedResultEx$MH = RuntimeHelper.downcallHandle(
        "GetOverlappedResultEx",
        constants$164.GetOverlappedResultEx$FUNC
    );
}

