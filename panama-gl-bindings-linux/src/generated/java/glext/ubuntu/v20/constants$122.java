// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$122 {

    static final FunctionDescriptor glGetQueryObjectuiv$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glGetQueryObjectuiv$MH = RuntimeHelper.downcallHandle(
        "glGetQueryObjectuiv",
        constants$122.glGetQueryObjectuiv$FUNC
    );
    static final FunctionDescriptor glBindBuffer$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glBindBuffer$MH = RuntimeHelper.downcallHandle(
        "glBindBuffer",
        constants$122.glBindBuffer$FUNC
    );
    static final FunctionDescriptor glDeleteBuffers$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glDeleteBuffers$MH = RuntimeHelper.downcallHandle(
        "glDeleteBuffers",
        constants$122.glDeleteBuffers$FUNC
    );
    static final FunctionDescriptor glGenBuffers$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glGenBuffers$MH = RuntimeHelper.downcallHandle(
        "glGenBuffers",
        constants$122.glGenBuffers$FUNC
    );
    static final FunctionDescriptor glIsBuffer$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glIsBuffer$MH = RuntimeHelper.downcallHandle(
        "glIsBuffer",
        constants$122.glIsBuffer$FUNC
    );
    static final FunctionDescriptor glBufferData$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glBufferData$MH = RuntimeHelper.downcallHandle(
        "glBufferData",
        constants$122.glBufferData$FUNC
    );
}

