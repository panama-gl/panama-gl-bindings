// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$518 {

    static final FunctionDescriptor SetDebugErrorLevel$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetDebugErrorLevel$MH = RuntimeHelper.downcallHandle(
        "SetDebugErrorLevel",
        constants$518.SetDebugErrorLevel$FUNC
    );
    static final FunctionDescriptor SetLastErrorEx$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetLastErrorEx$MH = RuntimeHelper.downcallHandle(
        "SetLastErrorEx",
        constants$518.SetLastErrorEx$FUNC
    );
    static final FunctionDescriptor InternalGetWindowText$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle InternalGetWindowText$MH = RuntimeHelper.downcallHandle(
        "InternalGetWindowText",
        constants$518.InternalGetWindowText$FUNC
    );
    static final FunctionDescriptor CancelShutdown$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle CancelShutdown$MH = RuntimeHelper.downcallHandle(
        "CancelShutdown",
        constants$518.CancelShutdown$FUNC
    );
    static final FunctionDescriptor MonitorFromPoint$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("x"),
            Constants$root.C_LONG$LAYOUT.withName("y")
        ).withName("tagPOINT"),
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle MonitorFromPoint$MH = RuntimeHelper.downcallHandle(
        "MonitorFromPoint",
        constants$518.MonitorFromPoint$FUNC
    );
    static final FunctionDescriptor MonitorFromRect$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle MonitorFromRect$MH = RuntimeHelper.downcallHandle(
        "MonitorFromRect",
        constants$518.MonitorFromRect$FUNC
    );
}


