// Generated by jextract

package opengl.macos.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$170 {

    static final FunctionDescriptor gluNurbsProperty$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle gluNurbsProperty$MH = RuntimeHelper.downcallHandle(
        "gluNurbsProperty",
        constants$170.gluNurbsProperty$FUNC
    );
    static final FunctionDescriptor gluNurbsSurface$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gluNurbsSurface$MH = RuntimeHelper.downcallHandle(
        "gluNurbsSurface",
        constants$170.gluNurbsSurface$FUNC
    );
    static final FunctionDescriptor gluOrtho2D$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle gluOrtho2D$MH = RuntimeHelper.downcallHandle(
        "gluOrtho2D",
        constants$170.gluOrtho2D$FUNC
    );
    static final FunctionDescriptor gluPartialDisk$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle gluPartialDisk$MH = RuntimeHelper.downcallHandle(
        "gluPartialDisk",
        constants$170.gluPartialDisk$FUNC
    );
    static final FunctionDescriptor gluPerspective$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle gluPerspective$MH = RuntimeHelper.downcallHandle(
        "gluPerspective",
        constants$170.gluPerspective$FUNC
    );
    static final FunctionDescriptor gluPickMatrix$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gluPickMatrix$MH = RuntimeHelper.downcallHandle(
        "gluPickMatrix",
        constants$170.gluPickMatrix$FUNC
    );
}

