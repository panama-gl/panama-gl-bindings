// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$559 {

    static final FunctionDescriptor GetSystemPreferredUILanguages$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetSystemPreferredUILanguages$MH = RuntimeHelper.downcallHandle(
        "GetSystemPreferredUILanguages",
        constants$559.GetSystemPreferredUILanguages$FUNC
    );
    static final FunctionDescriptor GetThreadPreferredUILanguages$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetThreadPreferredUILanguages$MH = RuntimeHelper.downcallHandle(
        "GetThreadPreferredUILanguages",
        constants$559.GetThreadPreferredUILanguages$FUNC
    );
    static final FunctionDescriptor SetThreadPreferredUILanguages$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetThreadPreferredUILanguages$MH = RuntimeHelper.downcallHandle(
        "SetThreadPreferredUILanguages",
        constants$559.SetThreadPreferredUILanguages$FUNC
    );
    static final FunctionDescriptor GetFileMUIInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetFileMUIInfo$MH = RuntimeHelper.downcallHandle(
        "GetFileMUIInfo",
        constants$559.GetFileMUIInfo$FUNC
    );
    static final FunctionDescriptor GetFileMUIPath$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetFileMUIPath$MH = RuntimeHelper.downcallHandle(
        "GetFileMUIPath",
        constants$559.GetFileMUIPath$FUNC
    );
    static final FunctionDescriptor GetUILanguageInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetUILanguageInfo$MH = RuntimeHelper.downcallHandle(
        "GetUILanguageInfo",
        constants$559.GetUILanguageInfo$FUNC
    );
}


