// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$167 {

    static final FunctionDescriptor CreateIoCompletionPort$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreateIoCompletionPort$MH = RuntimeHelper.downcallHandle(
        "CreateIoCompletionPort",
        constants$167.CreateIoCompletionPort$FUNC
    );
    static final FunctionDescriptor GetQueuedCompletionStatus$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetQueuedCompletionStatus$MH = RuntimeHelper.downcallHandle(
        "GetQueuedCompletionStatus",
        constants$167.GetQueuedCompletionStatus$FUNC
    );
    static final FunctionDescriptor GetQueuedCompletionStatusEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetQueuedCompletionStatusEx$MH = RuntimeHelper.downcallHandle(
        "GetQueuedCompletionStatusEx",
        constants$167.GetQueuedCompletionStatusEx$FUNC
    );
    static final FunctionDescriptor PostQueuedCompletionStatus$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PostQueuedCompletionStatus$MH = RuntimeHelper.downcallHandle(
        "PostQueuedCompletionStatus",
        constants$167.PostQueuedCompletionStatus$FUNC
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
        constants$167.DeviceIoControl$FUNC
    );
    static final FunctionDescriptor GetOverlappedResult$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetOverlappedResult$MH = RuntimeHelper.downcallHandle(
        "GetOverlappedResult",
        constants$167.GetOverlappedResult$FUNC
    );
}

