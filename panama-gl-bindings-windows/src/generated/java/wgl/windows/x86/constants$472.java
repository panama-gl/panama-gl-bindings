// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$472 {

    static final FunctionDescriptor ModifyMenuA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ModifyMenuA$MH = RuntimeHelper.downcallHandle(
        "ModifyMenuA",
        constants$472.ModifyMenuA$FUNC
    );
    static final FunctionDescriptor ModifyMenuW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ModifyMenuW$MH = RuntimeHelper.downcallHandle(
        "ModifyMenuW",
        constants$472.ModifyMenuW$FUNC
    );
    static final FunctionDescriptor RemoveMenu$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RemoveMenu$MH = RuntimeHelper.downcallHandle(
        "RemoveMenu",
        constants$472.RemoveMenu$FUNC
    );
    static final FunctionDescriptor DeleteMenu$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DeleteMenu$MH = RuntimeHelper.downcallHandle(
        "DeleteMenu",
        constants$472.DeleteMenu$FUNC
    );
    static final FunctionDescriptor SetMenuItemBitmaps$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetMenuItemBitmaps$MH = RuntimeHelper.downcallHandle(
        "SetMenuItemBitmaps",
        constants$472.SetMenuItemBitmaps$FUNC
    );
    static final FunctionDescriptor GetMenuCheckMarkDimensions$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle GetMenuCheckMarkDimensions$MH = RuntimeHelper.downcallHandle(
        "GetMenuCheckMarkDimensions",
        constants$472.GetMenuCheckMarkDimensions$FUNC
    );
}


