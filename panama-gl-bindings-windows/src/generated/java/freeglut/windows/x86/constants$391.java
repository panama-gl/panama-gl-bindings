// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$391 {

    static final FunctionDescriptor CombineTransform$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CombineTransform$MH = RuntimeHelper.downcallHandle(
        "CombineTransform",
        constants$391.CombineTransform$FUNC
    );
    static final FunctionDescriptor CreateDIBSection$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreateDIBSection$MH = RuntimeHelper.downcallHandle(
        "CreateDIBSection",
        constants$391.CreateDIBSection$FUNC
    );
    static final FunctionDescriptor GetDIBColorTable$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetDIBColorTable$MH = RuntimeHelper.downcallHandle(
        "GetDIBColorTable",
        constants$391.GetDIBColorTable$FUNC
    );
    static final FunctionDescriptor SetDIBColorTable$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetDIBColorTable$MH = RuntimeHelper.downcallHandle(
        "SetDIBColorTable",
        constants$391.SetDIBColorTable$FUNC
    );
    static final FunctionDescriptor SetColorAdjustment$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetColorAdjustment$MH = RuntimeHelper.downcallHandle(
        "SetColorAdjustment",
        constants$391.SetColorAdjustment$FUNC
    );
    static final FunctionDescriptor GetColorAdjustment$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetColorAdjustment$MH = RuntimeHelper.downcallHandle(
        "GetColorAdjustment",
        constants$391.GetColorAdjustment$FUNC
    );
}

