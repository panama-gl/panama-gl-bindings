// Generated by jextract

package opengl.macos.v10_15_7;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$12 {

    static final FunctionDescriptor glPointParameterfARB$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle glPointParameterfARB$MH = RuntimeHelper.downcallHandle(
        "glPointParameterfARB",
        constants$12.glPointParameterfARB$FUNC
    );
    static final FunctionDescriptor glPointParameterfvARB$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glPointParameterfvARB$MH = RuntimeHelper.downcallHandle(
        "glPointParameterfvARB",
        constants$12.glPointParameterfvARB$FUNC
    );
    static final FunctionDescriptor glProvokingVertex$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glProvokingVertex$MH = RuntimeHelper.downcallHandle(
        "glProvokingVertex",
        constants$12.glProvokingVertex$FUNC
    );
    static final FunctionDescriptor glDeleteObjectARB$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glDeleteObjectARB$MH = RuntimeHelper.downcallHandle(
        "glDeleteObjectARB",
        constants$12.glDeleteObjectARB$FUNC
    );
    static final FunctionDescriptor glGetHandleARB$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glGetHandleARB$MH = RuntimeHelper.downcallHandle(
        "glGetHandleARB",
        constants$12.glGetHandleARB$FUNC
    );
    static final FunctionDescriptor glDetachObjectARB$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glDetachObjectARB$MH = RuntimeHelper.downcallHandle(
        "glDetachObjectARB",
        constants$12.glDetachObjectARB$FUNC
    );
}

