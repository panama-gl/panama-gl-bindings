// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$508 {

    static final FunctionDescriptor CreateIcon$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateIcon$MH = RuntimeHelper.downcallHandle(
        "CreateIcon",
        constants$508.CreateIcon$FUNC
    );
    static final FunctionDescriptor DestroyIcon$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DestroyIcon$MH = RuntimeHelper.downcallHandle(
        "DestroyIcon",
        constants$508.DestroyIcon$FUNC
    );
    static final FunctionDescriptor LookupIconIdFromDirectory$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle LookupIconIdFromDirectory$MH = RuntimeHelper.downcallHandle(
        "LookupIconIdFromDirectory",
        constants$508.LookupIconIdFromDirectory$FUNC
    );
    static final FunctionDescriptor LookupIconIdFromDirectoryEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle LookupIconIdFromDirectoryEx$MH = RuntimeHelper.downcallHandle(
        "LookupIconIdFromDirectoryEx",
        constants$508.LookupIconIdFromDirectoryEx$FUNC
    );
    static final FunctionDescriptor CreateIconFromResource$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreateIconFromResource$MH = RuntimeHelper.downcallHandle(
        "CreateIconFromResource",
        constants$508.CreateIconFromResource$FUNC
    );
    static final FunctionDescriptor CreateIconFromResourceEx$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreateIconFromResourceEx$MH = RuntimeHelper.downcallHandle(
        "CreateIconFromResourceEx",
        constants$508.CreateIconFromResourceEx$FUNC
    );
}


