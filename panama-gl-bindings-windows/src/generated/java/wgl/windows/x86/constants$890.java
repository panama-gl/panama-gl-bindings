// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$890 {

    static final FunctionDescriptor LPFNPSPCALLBACKW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LPFNPSPCALLBACKW$MH = RuntimeHelper.downcallHandle(
        constants$890.LPFNPSPCALLBACKW$FUNC
    );
    static final FunctionDescriptor PFNPROPSHEETCALLBACK$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle PFNPROPSHEETCALLBACK$MH = RuntimeHelper.downcallHandle(
        constants$890.PFNPROPSHEETCALLBACK$FUNC
    );
    static final FunctionDescriptor CreatePropertySheetPageA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreatePropertySheetPageA$MH = RuntimeHelper.downcallHandle(
        "CreatePropertySheetPageA",
        constants$890.CreatePropertySheetPageA$FUNC
    );
    static final FunctionDescriptor CreatePropertySheetPageW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreatePropertySheetPageW$MH = RuntimeHelper.downcallHandle(
        "CreatePropertySheetPageW",
        constants$890.CreatePropertySheetPageW$FUNC
    );
}

