// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1357 {

    static final FunctionDescriptor gluCylinder$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle gluCylinder$MH = RuntimeHelper.downcallHandle(
        "gluCylinder",
        constants$1357.gluCylinder$FUNC
    );
    static final FunctionDescriptor gluDisk$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle gluDisk$MH = RuntimeHelper.downcallHandle(
        "gluDisk",
        constants$1357.gluDisk$FUNC
    );
    static final FunctionDescriptor gluPartialDisk$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle gluPartialDisk$MH = RuntimeHelper.downcallHandle(
        "gluPartialDisk",
        constants$1357.gluPartialDisk$FUNC
    );
    static final FunctionDescriptor gluSphere$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle gluSphere$MH = RuntimeHelper.downcallHandle(
        "gluSphere",
        constants$1357.gluSphere$FUNC
    );
    static final FunctionDescriptor gluQuadricCallback$fn$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle gluQuadricCallback$fn$MH = RuntimeHelper.downcallHandle(
        constants$1357.gluQuadricCallback$fn$FUNC
    );
}

