// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$145 {

    static final FunctionDescriptor glBlendColor$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle glBlendColor$MH = RuntimeHelper.downcallHandle(
        "glBlendColor",
        constants$145.glBlendColor$FUNC
    );
    static final FunctionDescriptor glHistogram$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle glHistogram$MH = RuntimeHelper.downcallHandle(
        "glHistogram",
        constants$145.glHistogram$FUNC
    );
    static final FunctionDescriptor glResetHistogram$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glResetHistogram$MH = RuntimeHelper.downcallHandle(
        "glResetHistogram",
        constants$145.glResetHistogram$FUNC
    );
    static final FunctionDescriptor glGetHistogram$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glGetHistogram$MH = RuntimeHelper.downcallHandle(
        "glGetHistogram",
        constants$145.glGetHistogram$FUNC
    );
    static final FunctionDescriptor glGetHistogramParameterfv$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glGetHistogramParameterfv$MH = RuntimeHelper.downcallHandle(
        "glGetHistogramParameterfv",
        constants$145.glGetHistogramParameterfv$FUNC
    );
    static final FunctionDescriptor glGetHistogramParameteriv$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glGetHistogramParameteriv$MH = RuntimeHelper.downcallHandle(
        "glGetHistogramParameteriv",
        constants$145.glGetHistogramParameteriv$FUNC
    );
}


