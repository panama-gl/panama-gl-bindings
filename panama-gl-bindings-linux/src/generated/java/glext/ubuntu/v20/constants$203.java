// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$203 {

    static final FunctionDescriptor glBindBufferBase$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glBindBufferBase$MH = RuntimeHelper.downcallHandle(
        "glBindBufferBase",
        constants$203.glBindBufferBase$FUNC
    );
    static final FunctionDescriptor glTransformFeedbackVaryings$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glTransformFeedbackVaryings$MH = RuntimeHelper.downcallHandle(
        "glTransformFeedbackVaryings",
        constants$203.glTransformFeedbackVaryings$FUNC
    );
    static final FunctionDescriptor glGetTransformFeedbackVarying$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glGetTransformFeedbackVarying$MH = RuntimeHelper.downcallHandle(
        "glGetTransformFeedbackVarying",
        constants$203.glGetTransformFeedbackVarying$FUNC
    );
    static final FunctionDescriptor glClampColor$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glClampColor$MH = RuntimeHelper.downcallHandle(
        "glClampColor",
        constants$203.glClampColor$FUNC
    );
    static final FunctionDescriptor glBeginConditionalRender$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glBeginConditionalRender$MH = RuntimeHelper.downcallHandle(
        "glBeginConditionalRender",
        constants$203.glBeginConditionalRender$FUNC
    );
    static final FunctionDescriptor glEndConditionalRender$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glEndConditionalRender$MH = RuntimeHelper.downcallHandle(
        "glEndConditionalRender",
        constants$203.glEndConditionalRender$FUNC
    );
}

