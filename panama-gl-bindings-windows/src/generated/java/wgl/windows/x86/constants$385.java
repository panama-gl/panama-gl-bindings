// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$385 {

    static final FunctionDescriptor GetWorldTransform$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetWorldTransform$MH = RuntimeHelper.downcallHandle(
        "GetWorldTransform",
        constants$385.GetWorldTransform$FUNC
    );
    static final FunctionDescriptor SetWorldTransform$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetWorldTransform$MH = RuntimeHelper.downcallHandle(
        "SetWorldTransform",
        constants$385.SetWorldTransform$FUNC
    );
    static final FunctionDescriptor ModifyWorldTransform$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ModifyWorldTransform$MH = RuntimeHelper.downcallHandle(
        "ModifyWorldTransform",
        constants$385.ModifyWorldTransform$FUNC
    );
    static final FunctionDescriptor CombineTransform$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CombineTransform$MH = RuntimeHelper.downcallHandle(
        "CombineTransform",
        constants$385.CombineTransform$FUNC
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
        constants$385.CreateDIBSection$FUNC
    );
    static final FunctionDescriptor GetDIBColorTable$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetDIBColorTable$MH = RuntimeHelper.downcallHandle(
        "GetDIBColorTable",
        constants$385.GetDIBColorTable$FUNC
    );
}


