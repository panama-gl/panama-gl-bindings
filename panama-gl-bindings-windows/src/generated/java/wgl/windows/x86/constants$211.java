// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$211 {

    static final FunctionDescriptor DeleteEnclave$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DeleteEnclave$MH = RuntimeHelper.downcallHandle(
        "DeleteEnclave",
        constants$211.DeleteEnclave$FUNC
    );
    static final FunctionDescriptor QueueUserWorkItem$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle QueueUserWorkItem$MH = RuntimeHelper.downcallHandle(
        "QueueUserWorkItem",
        constants$211.QueueUserWorkItem$FUNC
    );
    static final FunctionDescriptor UnregisterWaitEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle UnregisterWaitEx$MH = RuntimeHelper.downcallHandle(
        "UnregisterWaitEx",
        constants$211.UnregisterWaitEx$FUNC
    );
    static final FunctionDescriptor CreateTimerQueue$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle CreateTimerQueue$MH = RuntimeHelper.downcallHandle(
        "CreateTimerQueue",
        constants$211.CreateTimerQueue$FUNC
    );
    static final FunctionDescriptor CreateTimerQueueTimer$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreateTimerQueueTimer$MH = RuntimeHelper.downcallHandle(
        "CreateTimerQueueTimer",
        constants$211.CreateTimerQueueTimer$FUNC
    );
    static final FunctionDescriptor ChangeTimerQueueTimer$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ChangeTimerQueueTimer$MH = RuntimeHelper.downcallHandle(
        "ChangeTimerQueueTimer",
        constants$211.ChangeTimerQueueTimer$FUNC
    );
}


