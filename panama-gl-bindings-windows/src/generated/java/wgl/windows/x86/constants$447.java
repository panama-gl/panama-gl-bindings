// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$447 {

    static final FunctionDescriptor GetOpenClipboardWindow$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle GetOpenClipboardWindow$MH = RuntimeHelper.downcallHandle(
        "GetOpenClipboardWindow",
        constants$447.GetOpenClipboardWindow$FUNC
    );
    static final FunctionDescriptor AddClipboardFormatListener$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddClipboardFormatListener$MH = RuntimeHelper.downcallHandle(
        "AddClipboardFormatListener",
        constants$447.AddClipboardFormatListener$FUNC
    );
    static final FunctionDescriptor RemoveClipboardFormatListener$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RemoveClipboardFormatListener$MH = RuntimeHelper.downcallHandle(
        "RemoveClipboardFormatListener",
        constants$447.RemoveClipboardFormatListener$FUNC
    );
    static final FunctionDescriptor GetUpdatedClipboardFormats$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetUpdatedClipboardFormats$MH = RuntimeHelper.downcallHandle(
        "GetUpdatedClipboardFormats",
        constants$447.GetUpdatedClipboardFormats$FUNC
    );
    static final FunctionDescriptor CharToOemA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CharToOemA$MH = RuntimeHelper.downcallHandle(
        "CharToOemA",
        constants$447.CharToOemA$FUNC
    );
    static final FunctionDescriptor CharToOemW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CharToOemW$MH = RuntimeHelper.downcallHandle(
        "CharToOemW",
        constants$447.CharToOemW$FUNC
    );
}


