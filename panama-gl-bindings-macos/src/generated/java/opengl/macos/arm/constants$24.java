// Generated by jextract

package opengl.macos.arm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$24 {

    static final FunctionDescriptor glGenBuffersARB$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glGenBuffersARB$MH = RuntimeHelper.downcallHandle(
        "glGenBuffersARB",
        constants$24.glGenBuffersARB$FUNC
    );
    static final FunctionDescriptor glIsBufferARB$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glIsBufferARB$MH = RuntimeHelper.downcallHandle(
        "glIsBufferARB",
        constants$24.glIsBufferARB$FUNC
    );
    static final FunctionDescriptor glBufferDataARB$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glBufferDataARB$MH = RuntimeHelper.downcallHandle(
        "glBufferDataARB",
        constants$24.glBufferDataARB$FUNC
    );
    static final FunctionDescriptor glBufferSubDataARB$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glBufferSubDataARB$MH = RuntimeHelper.downcallHandle(
        "glBufferSubDataARB",
        constants$24.glBufferSubDataARB$FUNC
    );
    static final FunctionDescriptor glGetBufferSubDataARB$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glGetBufferSubDataARB$MH = RuntimeHelper.downcallHandle(
        "glGetBufferSubDataARB",
        constants$24.glGetBufferSubDataARB$FUNC
    );
    static final FunctionDescriptor glMapBufferARB$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glMapBufferARB$MH = RuntimeHelper.downcallHandle(
        "glMapBufferARB",
        constants$24.glMapBufferARB$FUNC
    );
}


