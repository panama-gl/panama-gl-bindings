// Generated by jextract

package opengl.macos.arm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$39 {

    static final FunctionDescriptor glWindowPos3sARB$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle glWindowPos3sARB$MH = RuntimeHelper.downcallHandle(
        "glWindowPos3sARB",
        constants$39.glWindowPos3sARB$FUNC
    );
    static final FunctionDescriptor glWindowPos3svARB$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glWindowPos3svARB$MH = RuntimeHelper.downcallHandle(
        "glWindowPos3svARB",
        constants$39.glWindowPos3svARB$FUNC
    );
    static final FunctionDescriptor glUniformBufferEXT$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glUniformBufferEXT$MH = RuntimeHelper.downcallHandle(
        "glUniformBufferEXT",
        constants$39.glUniformBufferEXT$FUNC
    );
    static final FunctionDescriptor glGetUniformBufferSizeEXT$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glGetUniformBufferSizeEXT$MH = RuntimeHelper.downcallHandle(
        "glGetUniformBufferSizeEXT",
        constants$39.glGetUniformBufferSizeEXT$FUNC
    );
    static final FunctionDescriptor glGetUniformOffsetEXT$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glGetUniformOffsetEXT$MH = RuntimeHelper.downcallHandle(
        "glGetUniformOffsetEXT",
        constants$39.glGetUniformOffsetEXT$FUNC
    );
    static final FunctionDescriptor glBlendColorEXT$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle glBlendColorEXT$MH = RuntimeHelper.downcallHandle(
        "glBlendColorEXT",
        constants$39.glBlendColorEXT$FUNC
    );
}


