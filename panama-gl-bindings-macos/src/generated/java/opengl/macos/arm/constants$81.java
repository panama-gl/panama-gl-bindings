// Generated by jextract

package opengl.macos.arm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$81 {

    static final FunctionDescriptor glDrawElements$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glDrawElements$MH = RuntimeHelper.downcallHandle(
        "glDrawElements",
        constants$81.glDrawElements$FUNC
    );
    static final FunctionDescriptor glDrawPixels$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glDrawPixels$MH = RuntimeHelper.downcallHandle(
        "glDrawPixels",
        constants$81.glDrawPixels$FUNC
    );
    static final FunctionDescriptor glDrawRangeElements$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glDrawRangeElements$MH = RuntimeHelper.downcallHandle(
        "glDrawRangeElements",
        constants$81.glDrawRangeElements$FUNC
    );
    static final FunctionDescriptor glEdgeFlag$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle glEdgeFlag$MH = RuntimeHelper.downcallHandle(
        "glEdgeFlag",
        constants$81.glEdgeFlag$FUNC
    );
    static final FunctionDescriptor glEdgeFlagPointer$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glEdgeFlagPointer$MH = RuntimeHelper.downcallHandle(
        "glEdgeFlagPointer",
        constants$81.glEdgeFlagPointer$FUNC
    );
    static final FunctionDescriptor glEdgeFlagv$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glEdgeFlagv$MH = RuntimeHelper.downcallHandle(
        "glEdgeFlagv",
        constants$81.glEdgeFlagv$FUNC
    );
}


