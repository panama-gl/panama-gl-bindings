// Generated by jextract

package opengl.macos.arm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$63 {

    static final FunctionDescriptor glDeleteVertexArraysAPPLE$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glDeleteVertexArraysAPPLE$MH = RuntimeHelper.downcallHandle(
        "glDeleteVertexArraysAPPLE",
        constants$63.glDeleteVertexArraysAPPLE$FUNC
    );
    static final FunctionDescriptor glGenVertexArraysAPPLE$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glGenVertexArraysAPPLE$MH = RuntimeHelper.downcallHandle(
        "glGenVertexArraysAPPLE",
        constants$63.glGenVertexArraysAPPLE$FUNC
    );
    static final FunctionDescriptor glIsVertexArrayAPPLE$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glIsVertexArrayAPPLE$MH = RuntimeHelper.downcallHandle(
        "glIsVertexArrayAPPLE",
        constants$63.glIsVertexArrayAPPLE$FUNC
    );
    static final FunctionDescriptor glVertexArrayRangeAPPLE$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glVertexArrayRangeAPPLE$MH = RuntimeHelper.downcallHandle(
        "glVertexArrayRangeAPPLE",
        constants$63.glVertexArrayRangeAPPLE$FUNC
    );
    static final FunctionDescriptor glFlushVertexArrayRangeAPPLE$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glFlushVertexArrayRangeAPPLE$MH = RuntimeHelper.downcallHandle(
        "glFlushVertexArrayRangeAPPLE",
        constants$63.glFlushVertexArrayRangeAPPLE$FUNC
    );
    static final FunctionDescriptor glVertexArrayParameteriAPPLE$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glVertexArrayParameteriAPPLE$MH = RuntimeHelper.downcallHandle(
        "glVertexArrayParameteriAPPLE",
        constants$63.glVertexArrayParameteriAPPLE$FUNC
    );
}


