// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$14 {

    static final FunctionDescriptor XDefaultVisual$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle XDefaultVisual$MH = RuntimeHelper.downcallHandle(
        "XDefaultVisual",
        constants$14.XDefaultVisual$FUNC
    );
    static final FunctionDescriptor XDefaultVisualOfScreen$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XDefaultVisualOfScreen$MH = RuntimeHelper.downcallHandle(
        "XDefaultVisualOfScreen",
        constants$14.XDefaultVisualOfScreen$FUNC
    );
    static final FunctionDescriptor XDefaultGC$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle XDefaultGC$MH = RuntimeHelper.downcallHandle(
        "XDefaultGC",
        constants$14.XDefaultGC$FUNC
    );
    static final FunctionDescriptor XDefaultGCOfScreen$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XDefaultGCOfScreen$MH = RuntimeHelper.downcallHandle(
        "XDefaultGCOfScreen",
        constants$14.XDefaultGCOfScreen$FUNC
    );
    static final FunctionDescriptor XBlackPixel$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle XBlackPixel$MH = RuntimeHelper.downcallHandle(
        "XBlackPixel",
        constants$14.XBlackPixel$FUNC
    );
    static final FunctionDescriptor XWhitePixel$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle XWhitePixel$MH = RuntimeHelper.downcallHandle(
        "XWhitePixel",
        constants$14.XWhitePixel$FUNC
    );
}

