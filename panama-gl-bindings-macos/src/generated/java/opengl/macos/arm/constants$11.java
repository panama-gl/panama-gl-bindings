// Generated by jextract

package opengl.macos.arm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$11 {

    static final FunctionDescriptor glIsQueryARB$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glIsQueryARB$MH = RuntimeHelper.downcallHandle(
        "glIsQueryARB",
        constants$11.glIsQueryARB$FUNC
    );
    static final FunctionDescriptor glBeginQueryARB$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glBeginQueryARB$MH = RuntimeHelper.downcallHandle(
        "glBeginQueryARB",
        constants$11.glBeginQueryARB$FUNC
    );
    static final FunctionDescriptor glEndQueryARB$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glEndQueryARB$MH = RuntimeHelper.downcallHandle(
        "glEndQueryARB",
        constants$11.glEndQueryARB$FUNC
    );
    static final FunctionDescriptor glGetQueryivARB$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glGetQueryivARB$MH = RuntimeHelper.downcallHandle(
        "glGetQueryivARB",
        constants$11.glGetQueryivARB$FUNC
    );
    static final FunctionDescriptor glGetQueryObjectivARB$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glGetQueryObjectivARB$MH = RuntimeHelper.downcallHandle(
        "glGetQueryObjectivARB",
        constants$11.glGetQueryObjectivARB$FUNC
    );
    static final FunctionDescriptor glGetQueryObjectuivARB$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glGetQueryObjectuivARB$MH = RuntimeHelper.downcallHandle(
        "glGetQueryObjectuivARB",
        constants$11.glGetQueryObjectuivARB$FUNC
    );
}


