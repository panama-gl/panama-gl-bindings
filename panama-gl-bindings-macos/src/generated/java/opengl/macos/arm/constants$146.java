// Generated by jextract

package opengl.macos.arm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$146 {

    static final FunctionDescriptor glDeleteBuffers$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glDeleteBuffers$MH = RuntimeHelper.downcallHandle(
        "glDeleteBuffers",
        constants$146.glDeleteBuffers$FUNC
    );
    static final FunctionDescriptor glGenBuffers$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glGenBuffers$MH = RuntimeHelper.downcallHandle(
        "glGenBuffers",
        constants$146.glGenBuffers$FUNC
    );
    static final FunctionDescriptor glIsBuffer$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glIsBuffer$MH = RuntimeHelper.downcallHandle(
        "glIsBuffer",
        constants$146.glIsBuffer$FUNC
    );
    static final FunctionDescriptor glBufferData$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glBufferData$MH = RuntimeHelper.downcallHandle(
        "glBufferData",
        constants$146.glBufferData$FUNC
    );
    static final FunctionDescriptor glBufferSubData$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glBufferSubData$MH = RuntimeHelper.downcallHandle(
        "glBufferSubData",
        constants$146.glBufferSubData$FUNC
    );
    static final FunctionDescriptor glGetBufferSubData$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glGetBufferSubData$MH = RuntimeHelper.downcallHandle(
        "glGetBufferSubData",
        constants$146.glGetBufferSubData$FUNC
    );
}


