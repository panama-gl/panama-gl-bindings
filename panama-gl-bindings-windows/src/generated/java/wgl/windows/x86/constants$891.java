// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$891 {

    static final FunctionDescriptor DestroyPropertySheetPage$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DestroyPropertySheetPage$MH = RuntimeHelper.downcallHandle(
        "DestroyPropertySheetPage",
        constants$891.DestroyPropertySheetPage$FUNC
    );
    static final FunctionDescriptor PropertySheetA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PropertySheetA$MH = RuntimeHelper.downcallHandle(
        "PropertySheetA",
        constants$891.PropertySheetA$FUNC
    );
    static final FunctionDescriptor PropertySheetW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PropertySheetW$MH = RuntimeHelper.downcallHandle(
        "PropertySheetW",
        constants$891.PropertySheetW$FUNC
    );
    static final FunctionDescriptor LPFNADDPROPSHEETPAGE$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle LPFNADDPROPSHEETPAGE$MH = RuntimeHelper.downcallHandle(
        constants$891.LPFNADDPROPSHEETPAGE$FUNC
    );
    static final FunctionDescriptor LPFNADDPROPSHEETPAGES$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
}

