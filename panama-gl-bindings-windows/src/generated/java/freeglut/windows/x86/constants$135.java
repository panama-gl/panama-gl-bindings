// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$135 {

    static final FunctionDescriptor GetCurrentDirectoryW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetCurrentDirectoryW$MH = RuntimeHelper.downcallHandle(
        "GetCurrentDirectoryW",
        constants$135.GetCurrentDirectoryW$FUNC
    );
    static final FunctionDescriptor SearchPathW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SearchPathW$MH = RuntimeHelper.downcallHandle(
        "SearchPathW",
        constants$135.SearchPathW$FUNC
    );
    static final FunctionDescriptor SearchPathA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SearchPathA$MH = RuntimeHelper.downcallHandle(
        "SearchPathA",
        constants$135.SearchPathA$FUNC
    );
    static final FunctionDescriptor NeedCurrentDirectoryForExePathA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle NeedCurrentDirectoryForExePathA$MH = RuntimeHelper.downcallHandle(
        "NeedCurrentDirectoryForExePathA",
        constants$135.NeedCurrentDirectoryForExePathA$FUNC
    );
    static final FunctionDescriptor NeedCurrentDirectoryForExePathW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle NeedCurrentDirectoryForExePathW$MH = RuntimeHelper.downcallHandle(
        "NeedCurrentDirectoryForExePathW",
        constants$135.NeedCurrentDirectoryForExePathW$FUNC
    );
    static final FunctionDescriptor CompareFileTime$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CompareFileTime$MH = RuntimeHelper.downcallHandle(
        "CompareFileTime",
        constants$135.CompareFileTime$FUNC
    );
}

