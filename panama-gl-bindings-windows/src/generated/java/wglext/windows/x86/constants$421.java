// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$421 {

    static final FunctionDescriptor RegisterWindowMessageW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegisterWindowMessageW$MH = RuntimeHelper.downcallHandle(
        "RegisterWindowMessageW",
        constants$421.RegisterWindowMessageW$FUNC
    );
    static final FunctionDescriptor TrackMouseEvent$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle TrackMouseEvent$MH = RuntimeHelper.downcallHandle(
        "TrackMouseEvent",
        constants$421.TrackMouseEvent$FUNC
    );
    static final FunctionDescriptor DrawEdge$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DrawEdge$MH = RuntimeHelper.downcallHandle(
        "DrawEdge",
        constants$421.DrawEdge$FUNC
    );
    static final FunctionDescriptor DrawFrameControl$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DrawFrameControl$MH = RuntimeHelper.downcallHandle(
        "DrawFrameControl",
        constants$421.DrawFrameControl$FUNC
    );
    static final FunctionDescriptor DrawCaption$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DrawCaption$MH = RuntimeHelper.downcallHandle(
        "DrawCaption",
        constants$421.DrawCaption$FUNC
    );
    static final FunctionDescriptor DrawAnimatedRects$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DrawAnimatedRects$MH = RuntimeHelper.downcallHandle(
        "DrawAnimatedRects",
        constants$421.DrawAnimatedRects$FUNC
    );
}

