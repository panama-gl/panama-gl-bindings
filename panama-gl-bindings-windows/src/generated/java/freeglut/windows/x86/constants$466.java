// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$466 {

    static final FunctionDescriptor UnregisterPointerInputTargetEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle UnregisterPointerInputTargetEx$MH = RuntimeHelper.downcallHandle(
        "UnregisterPointerInputTargetEx",
        constants$466.UnregisterPointerInputTargetEx$FUNC
    );
    static final FunctionDescriptor CreateSyntheticPointerDevice$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreateSyntheticPointerDevice$MH = RuntimeHelper.downcallHandle(
        "CreateSyntheticPointerDevice",
        constants$466.CreateSyntheticPointerDevice$FUNC
    );
    static final FunctionDescriptor InjectSyntheticPointerInput$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle InjectSyntheticPointerInput$MH = RuntimeHelper.downcallHandle(
        "InjectSyntheticPointerInput",
        constants$466.InjectSyntheticPointerInput$FUNC
    );
    static final FunctionDescriptor DestroySyntheticPointerDevice$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DestroySyntheticPointerDevice$MH = RuntimeHelper.downcallHandle(
        "DestroySyntheticPointerDevice",
        constants$466.DestroySyntheticPointerDevice$FUNC
    );
    static final FunctionDescriptor EnableMouseInPointer$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle EnableMouseInPointer$MH = RuntimeHelper.downcallHandle(
        "EnableMouseInPointer",
        constants$466.EnableMouseInPointer$FUNC
    );
    static final FunctionDescriptor IsMouseInPointerEnabled$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle IsMouseInPointerEnabled$MH = RuntimeHelper.downcallHandle(
        "IsMouseInPointerEnabled",
        constants$466.IsMouseInPointerEnabled$FUNC
    );
}


