// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$473 {

    static final FunctionDescriptor TrackPopupMenu$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle TrackPopupMenu$MH = RuntimeHelper.downcallHandle(
        "TrackPopupMenu",
        constants$473.TrackPopupMenu$FUNC
    );
    static final FunctionDescriptor TrackPopupMenuEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle TrackPopupMenuEx$MH = RuntimeHelper.downcallHandle(
        "TrackPopupMenuEx",
        constants$473.TrackPopupMenuEx$FUNC
    );
    static final FunctionDescriptor CalculatePopupWindowPosition$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CalculatePopupWindowPosition$MH = RuntimeHelper.downcallHandle(
        "CalculatePopupWindowPosition",
        constants$473.CalculatePopupWindowPosition$FUNC
    );
    static final FunctionDescriptor GetMenuInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetMenuInfo$MH = RuntimeHelper.downcallHandle(
        "GetMenuInfo",
        constants$473.GetMenuInfo$FUNC
    );
    static final FunctionDescriptor SetMenuInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetMenuInfo$MH = RuntimeHelper.downcallHandle(
        "SetMenuInfo",
        constants$473.SetMenuInfo$FUNC
    );
    static final FunctionDescriptor EndMenu$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle EndMenu$MH = RuntimeHelper.downcallHandle(
        "EndMenu",
        constants$473.EndMenu$FUNC
    );
}


