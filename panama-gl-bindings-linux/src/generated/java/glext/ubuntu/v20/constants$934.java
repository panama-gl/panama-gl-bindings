// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$934 {

    static final FunctionDescriptor gluGetTessProperty$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gluGetTessProperty$MH = RuntimeHelper.downcallHandle(
        "gluGetTessProperty",
        constants$934.gluGetTessProperty$FUNC
    );
    static final FunctionDescriptor gluLoadSamplingMatrices$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gluLoadSamplingMatrices$MH = RuntimeHelper.downcallHandle(
        "gluLoadSamplingMatrices",
        constants$934.gluLoadSamplingMatrices$FUNC
    );
    static final FunctionDescriptor gluLookAt$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle gluLookAt$MH = RuntimeHelper.downcallHandle(
        "gluLookAt",
        constants$934.gluLookAt$FUNC
    );
    static final FunctionDescriptor gluNewNurbsRenderer$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gluNewNurbsRenderer$MH = RuntimeHelper.downcallHandle(
        "gluNewNurbsRenderer",
        constants$934.gluNewNurbsRenderer$FUNC
    );
    static final FunctionDescriptor gluNewQuadric$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gluNewQuadric$MH = RuntimeHelper.downcallHandle(
        "gluNewQuadric",
        constants$934.gluNewQuadric$FUNC
    );
    static final FunctionDescriptor gluNewTess$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gluNewTess$MH = RuntimeHelper.downcallHandle(
        "gluNewTess",
        constants$934.gluNewTess$FUNC
    );
}


