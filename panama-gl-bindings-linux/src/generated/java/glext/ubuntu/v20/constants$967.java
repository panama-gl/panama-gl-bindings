// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$967 {

    static final FunctionDescriptor glutVideoResizeGet$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glutVideoResizeGet$MH = RuntimeHelper.downcallHandle(
        "glutVideoResizeGet",
        constants$967.glutVideoResizeGet$FUNC
    );
    static final FunctionDescriptor glutSetupVideoResizing$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glutSetupVideoResizing$MH = RuntimeHelper.downcallHandle(
        "glutSetupVideoResizing",
        constants$967.glutSetupVideoResizing$FUNC
    );
    static final FunctionDescriptor glutStopVideoResizing$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glutStopVideoResizing$MH = RuntimeHelper.downcallHandle(
        "glutStopVideoResizing",
        constants$967.glutStopVideoResizing$FUNC
    );
    static final FunctionDescriptor glutVideoResize$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glutVideoResize$MH = RuntimeHelper.downcallHandle(
        "glutVideoResize",
        constants$967.glutVideoResize$FUNC
    );
    static final FunctionDescriptor glutVideoPan$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glutVideoPan$MH = RuntimeHelper.downcallHandle(
        "glutVideoPan",
        constants$967.glutVideoPan$FUNC
    );
    static final FunctionDescriptor glutSetColor$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle glutSetColor$MH = RuntimeHelper.downcallHandle(
        "glutSetColor",
        constants$967.glutSetColor$FUNC
    );
}


