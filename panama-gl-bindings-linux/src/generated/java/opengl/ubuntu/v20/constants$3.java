// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$3 {

    static final FunctionDescriptor glEdgeFlagv$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glEdgeFlagv$MH = RuntimeHelper.downcallHandle(
        "glEdgeFlagv",
        constants$3.glEdgeFlagv$FUNC
    );
    static final FunctionDescriptor glScissor$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glScissor$MH = RuntimeHelper.downcallHandle(
        "glScissor",
        constants$3.glScissor$FUNC
    );
    static final FunctionDescriptor glClipPlane$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glClipPlane$MH = RuntimeHelper.downcallHandle(
        "glClipPlane",
        constants$3.glClipPlane$FUNC
    );
    static final FunctionDescriptor glGetClipPlane$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glGetClipPlane$MH = RuntimeHelper.downcallHandle(
        "glGetClipPlane",
        constants$3.glGetClipPlane$FUNC
    );
    static final FunctionDescriptor glDrawBuffer$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glDrawBuffer$MH = RuntimeHelper.downcallHandle(
        "glDrawBuffer",
        constants$3.glDrawBuffer$FUNC
    );
    static final FunctionDescriptor glReadBuffer$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glReadBuffer$MH = RuntimeHelper.downcallHandle(
        "glReadBuffer",
        constants$3.glReadBuffer$FUNC
    );
}


