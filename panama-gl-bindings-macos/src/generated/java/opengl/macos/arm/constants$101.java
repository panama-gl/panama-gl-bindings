// Generated by jextract

package opengl.macos.arm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$101 {

    static final FunctionDescriptor glMateriali$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glMateriali$MH = RuntimeHelper.downcallHandle(
        "glMateriali",
        constants$101.glMateriali$FUNC
    );
    static final FunctionDescriptor glMaterialiv$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glMaterialiv$MH = RuntimeHelper.downcallHandle(
        "glMaterialiv",
        constants$101.glMaterialiv$FUNC
    );
    static final FunctionDescriptor glMatrixMode$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glMatrixMode$MH = RuntimeHelper.downcallHandle(
        "glMatrixMode",
        constants$101.glMatrixMode$FUNC
    );
    static final FunctionDescriptor glMinmax$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle glMinmax$MH = RuntimeHelper.downcallHandle(
        "glMinmax",
        constants$101.glMinmax$FUNC
    );
    static final FunctionDescriptor glMultMatrixd$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glMultMatrixd$MH = RuntimeHelper.downcallHandle(
        "glMultMatrixd",
        constants$101.glMultMatrixd$FUNC
    );
    static final FunctionDescriptor glMultMatrixf$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glMultMatrixf$MH = RuntimeHelper.downcallHandle(
        "glMultMatrixf",
        constants$101.glMultMatrixf$FUNC
    );
}

