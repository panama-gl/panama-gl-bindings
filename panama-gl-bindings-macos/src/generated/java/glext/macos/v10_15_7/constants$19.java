// Generated by jextract

package glext.macos.v10_15_7;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$19 {

    static final FunctionDescriptor glFenceSync$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glFenceSync$MH = RuntimeHelper.downcallHandle(
        "glFenceSync",
        constants$19.glFenceSync$FUNC
    );
    static final FunctionDescriptor glIsSync$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glIsSync$MH = RuntimeHelper.downcallHandle(
        "glIsSync",
        constants$19.glIsSync$FUNC
    );
    static final FunctionDescriptor glDeleteSync$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glDeleteSync$MH = RuntimeHelper.downcallHandle(
        "glDeleteSync",
        constants$19.glDeleteSync$FUNC
    );
    static final FunctionDescriptor glClientWaitSync$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle glClientWaitSync$MH = RuntimeHelper.downcallHandle(
        "glClientWaitSync",
        constants$19.glClientWaitSync$FUNC
    );
    static final FunctionDescriptor glWaitSync$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle glWaitSync$MH = RuntimeHelper.downcallHandle(
        "glWaitSync",
        constants$19.glWaitSync$FUNC
    );
    static final FunctionDescriptor glGetInteger64v$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glGetInteger64v$MH = RuntimeHelper.downcallHandle(
        "glGetInteger64v",
        constants$19.glGetInteger64v$FUNC
    );
}


