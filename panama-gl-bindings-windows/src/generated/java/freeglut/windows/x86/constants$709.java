// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$709 {

    static final FunctionDescriptor gluNurbsCurve$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle gluNurbsCurve$MH = RuntimeHelper.downcallHandle(
        "gluNurbsCurve",
        constants$709.gluNurbsCurve$FUNC
    );
    static final FunctionDescriptor gluNurbsSurface$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle gluNurbsSurface$MH = RuntimeHelper.downcallHandle(
        "gluNurbsSurface",
        constants$709.gluNurbsSurface$FUNC
    );
    static final FunctionDescriptor gluLoadSamplingMatrices$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gluLoadSamplingMatrices$MH = RuntimeHelper.downcallHandle(
        "gluLoadSamplingMatrices",
        constants$709.gluLoadSamplingMatrices$FUNC
    );
    static final FunctionDescriptor gluNurbsProperty$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle gluNurbsProperty$MH = RuntimeHelper.downcallHandle(
        "gluNurbsProperty",
        constants$709.gluNurbsProperty$FUNC
    );
    static final FunctionDescriptor gluGetNurbsProperty$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gluGetNurbsProperty$MH = RuntimeHelper.downcallHandle(
        "gluGetNurbsProperty",
        constants$709.gluGetNurbsProperty$FUNC
    );
    static final FunctionDescriptor gluNurbsCallback$fn$FUNC = FunctionDescriptor.ofVoid();
}

