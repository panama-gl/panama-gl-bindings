// Generated by jextract

package opengl.macos.v10_15_7;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$69 {

    static final FunctionDescriptor glClear$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glClear$MH = RuntimeHelper.downcallHandle(
        "glClear",
        constants$69.glClear$FUNC
    );
    static final FunctionDescriptor glClearAccum$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle glClearAccum$MH = RuntimeHelper.downcallHandle(
        "glClearAccum",
        constants$69.glClearAccum$FUNC
    );
    static final FunctionDescriptor glClearColor$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle glClearColor$MH = RuntimeHelper.downcallHandle(
        "glClearColor",
        constants$69.glClearColor$FUNC
    );
    static final FunctionDescriptor glClearDepth$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle glClearDepth$MH = RuntimeHelper.downcallHandle(
        "glClearDepth",
        constants$69.glClearDepth$FUNC
    );
    static final FunctionDescriptor glClearIndex$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle glClearIndex$MH = RuntimeHelper.downcallHandle(
        "glClearIndex",
        constants$69.glClearIndex$FUNC
    );
    static final FunctionDescriptor glClearStencil$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glClearStencil$MH = RuntimeHelper.downcallHandle(
        "glClearStencil",
        constants$69.glClearStencil$FUNC
    );
}


