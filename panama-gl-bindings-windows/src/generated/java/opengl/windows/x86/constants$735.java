// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$735 {

    static final FunctionDescriptor glutTabletMotionFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glutTabletMotionFunc$MH = RuntimeHelper.downcallHandle(
        "glutTabletMotionFunc",
        constants$735.glutTabletMotionFunc$FUNC
    );
    static final FunctionDescriptor glutTabletButtonFunc$callback$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle glutTabletButtonFunc$callback$MH = RuntimeHelper.downcallHandle(
        constants$735.glutTabletButtonFunc$callback$FUNC
    );
    static final FunctionDescriptor glutTabletButtonFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glutTabletButtonFunc$MH = RuntimeHelper.downcallHandle(
        "glutTabletButtonFunc",
        constants$735.glutTabletButtonFunc$FUNC
    );
    static final FunctionDescriptor glutGet$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle glutGet$MH = RuntimeHelper.downcallHandle(
        "glutGet",
        constants$735.glutGet$FUNC
    );
    static final FunctionDescriptor glutDeviceGet$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle glutDeviceGet$MH = RuntimeHelper.downcallHandle(
        "glutDeviceGet",
        constants$735.glutDeviceGet$FUNC
    );
}


