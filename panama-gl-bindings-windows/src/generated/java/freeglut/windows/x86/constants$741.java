// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$741 {

    static final FunctionDescriptor glutLeaveGameMode$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glutLeaveGameMode$MH = RuntimeHelper.downcallHandle(
        "glutLeaveGameMode",
        constants$741.glutLeaveGameMode$FUNC
    );
    static final FunctionDescriptor glutGameModeGet$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle glutGameModeGet$MH = RuntimeHelper.downcallHandle(
        "glutGameModeGet",
        constants$741.glutGameModeGet$FUNC
    );
    static final FunctionDescriptor glutVideoResizeGet$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle glutVideoResizeGet$MH = RuntimeHelper.downcallHandle(
        "glutVideoResizeGet",
        constants$741.glutVideoResizeGet$FUNC
    );
    static final FunctionDescriptor glutSetupVideoResizing$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glutSetupVideoResizing$MH = RuntimeHelper.downcallHandle(
        "glutSetupVideoResizing",
        constants$741.glutSetupVideoResizing$FUNC
    );
    static final FunctionDescriptor glutStopVideoResizing$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glutStopVideoResizing$MH = RuntimeHelper.downcallHandle(
        "glutStopVideoResizing",
        constants$741.glutStopVideoResizing$FUNC
    );
    static final FunctionDescriptor glutVideoResize$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle glutVideoResize$MH = RuntimeHelper.downcallHandle(
        "glutVideoResize",
        constants$741.glutVideoResize$FUNC
    );
}


