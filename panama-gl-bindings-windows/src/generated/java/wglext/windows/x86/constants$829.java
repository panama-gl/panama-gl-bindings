// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$829 {

    static final FunctionDescriptor STUB_THUNK$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle STUB_THUNK$MH = RuntimeHelper.downcallHandle(
        constants$829.STUB_THUNK$FUNC
    );
    static final FunctionDescriptor SERVER_ROUTINE$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle SERVER_ROUTINE$MH = RuntimeHelper.downcallHandle(
        constants$829.SERVER_ROUTINE$FUNC
    );
    static final FunctionDescriptor NdrClientGetSupportedSyntaxes$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle NdrClientGetSupportedSyntaxes$MH = RuntimeHelper.downcallHandle(
        "NdrClientGetSupportedSyntaxes",
        constants$829.NdrClientGetSupportedSyntaxes$FUNC
    );
    static final FunctionDescriptor NdrServerGetSupportedSyntaxes$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle NdrServerGetSupportedSyntaxes$MH = RuntimeHelper.downcallHandle(
        "NdrServerGetSupportedSyntaxes",
        constants$829.NdrServerGetSupportedSyntaxes$FUNC
    );
}


