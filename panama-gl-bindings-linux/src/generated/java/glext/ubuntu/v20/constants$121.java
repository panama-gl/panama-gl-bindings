// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$121 {

    static final FunctionDescriptor glDeleteQueries$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glDeleteQueries$MH = RuntimeHelper.downcallHandle(
        "glDeleteQueries",
        constants$121.glDeleteQueries$FUNC
    );
    static final FunctionDescriptor glIsQuery$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glIsQuery$MH = RuntimeHelper.downcallHandle(
        "glIsQuery",
        constants$121.glIsQuery$FUNC
    );
    static final FunctionDescriptor glBeginQuery$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glBeginQuery$MH = RuntimeHelper.downcallHandle(
        "glBeginQuery",
        constants$121.glBeginQuery$FUNC
    );
    static final FunctionDescriptor glEndQuery$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glEndQuery$MH = RuntimeHelper.downcallHandle(
        "glEndQuery",
        constants$121.glEndQuery$FUNC
    );
    static final FunctionDescriptor glGetQueryiv$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glGetQueryiv$MH = RuntimeHelper.downcallHandle(
        "glGetQueryiv",
        constants$121.glGetQueryiv$FUNC
    );
    static final FunctionDescriptor glGetQueryObjectiv$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glGetQueryObjectiv$MH = RuntimeHelper.downcallHandle(
        "glGetQueryObjectiv",
        constants$121.glGetQueryObjectiv$FUNC
    );
}


