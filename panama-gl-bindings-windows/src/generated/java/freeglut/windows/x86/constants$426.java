// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$426 {

    static final FunctionDescriptor IsHungAppWindow$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IsHungAppWindow$MH = RuntimeHelper.downcallHandle(
        "IsHungAppWindow",
        constants$426.IsHungAppWindow$FUNC
    );
    static final FunctionDescriptor DisableProcessWindowsGhosting$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle DisableProcessWindowsGhosting$MH = RuntimeHelper.downcallHandle(
        "DisableProcessWindowsGhosting",
        constants$426.DisableProcessWindowsGhosting$FUNC
    );
    static final FunctionDescriptor RegisterWindowMessageA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegisterWindowMessageA$MH = RuntimeHelper.downcallHandle(
        "RegisterWindowMessageA",
        constants$426.RegisterWindowMessageA$FUNC
    );
    static final FunctionDescriptor RegisterWindowMessageW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegisterWindowMessageW$MH = RuntimeHelper.downcallHandle(
        "RegisterWindowMessageW",
        constants$426.RegisterWindowMessageW$FUNC
    );
    static final FunctionDescriptor TrackMouseEvent$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle TrackMouseEvent$MH = RuntimeHelper.downcallHandle(
        "TrackMouseEvent",
        constants$426.TrackMouseEvent$FUNC
    );
    static final FunctionDescriptor DrawEdge$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DrawEdge$MH = RuntimeHelper.downcallHandle(
        "DrawEdge",
        constants$426.DrawEdge$FUNC
    );
}

