// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$86 {

    static final FunctionDescriptor glColorMask$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle glColorMask$MH = RuntimeHelper.downcallHandle(
        "glColorMask",
        constants$86.glColorMask$FUNC
    );
    static final FunctionDescriptor glAlphaFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle glAlphaFunc$MH = RuntimeHelper.downcallHandle(
        "glAlphaFunc",
        constants$86.glAlphaFunc$FUNC
    );
    static final FunctionDescriptor glBlendFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glBlendFunc$MH = RuntimeHelper.downcallHandle(
        "glBlendFunc",
        constants$86.glBlendFunc$FUNC
    );
    static final FunctionDescriptor glLogicOp$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glLogicOp$MH = RuntimeHelper.downcallHandle(
        "glLogicOp",
        constants$86.glLogicOp$FUNC
    );
    static final FunctionDescriptor glCullFace$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glCullFace$MH = RuntimeHelper.downcallHandle(
        "glCullFace",
        constants$86.glCullFace$FUNC
    );
    static final FunctionDescriptor glFrontFace$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glFrontFace$MH = RuntimeHelper.downcallHandle(
        "glFrontFace",
        constants$86.glFrontFace$FUNC
    );
}


