// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$461 {

    static final FunctionDescriptor DestroySyntheticPointerDevice$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DestroySyntheticPointerDevice$MH = RuntimeHelper.downcallHandle(
        "DestroySyntheticPointerDevice",
        constants$461.DestroySyntheticPointerDevice$FUNC
    );
    static final FunctionDescriptor EnableMouseInPointer$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle EnableMouseInPointer$MH = RuntimeHelper.downcallHandle(
        "EnableMouseInPointer",
        constants$461.EnableMouseInPointer$FUNC
    );
    static final FunctionDescriptor IsMouseInPointerEnabled$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle IsMouseInPointerEnabled$MH = RuntimeHelper.downcallHandle(
        "IsMouseInPointerEnabled",
        constants$461.IsMouseInPointerEnabled$FUNC
    );
    static final FunctionDescriptor EnableMouseInPointerForThread$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle EnableMouseInPointerForThread$MH = RuntimeHelper.downcallHandle(
        "EnableMouseInPointerForThread",
        constants$461.EnableMouseInPointerForThread$FUNC
    );
    static final FunctionDescriptor RegisterTouchHitTestingWindow$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RegisterTouchHitTestingWindow$MH = RuntimeHelper.downcallHandle(
        "RegisterTouchHitTestingWindow",
        constants$461.RegisterTouchHitTestingWindow$FUNC
    );
    static final FunctionDescriptor EvaluateProximityToRect$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle EvaluateProximityToRect$MH = RuntimeHelper.downcallHandle(
        "EvaluateProximityToRect",
        constants$461.EvaluateProximityToRect$FUNC
    );
}

