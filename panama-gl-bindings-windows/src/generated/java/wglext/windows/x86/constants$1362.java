// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1362 {

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
        constants$1362.gluNurbsSurface$FUNC
    );
    static final FunctionDescriptor gluLoadSamplingMatrices$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gluLoadSamplingMatrices$MH = RuntimeHelper.downcallHandle(
        "gluLoadSamplingMatrices",
        constants$1362.gluLoadSamplingMatrices$FUNC
    );
    static final FunctionDescriptor gluNurbsProperty$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle gluNurbsProperty$MH = RuntimeHelper.downcallHandle(
        "gluNurbsProperty",
        constants$1362.gluNurbsProperty$FUNC
    );
    static final FunctionDescriptor gluGetNurbsProperty$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gluGetNurbsProperty$MH = RuntimeHelper.downcallHandle(
        "gluGetNurbsProperty",
        constants$1362.gluGetNurbsProperty$FUNC
    );
    static final FunctionDescriptor gluNurbsCallback$fn$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle gluNurbsCallback$fn$MH = RuntimeHelper.downcallHandle(
        constants$1362.gluNurbsCallback$fn$FUNC
    );
}


