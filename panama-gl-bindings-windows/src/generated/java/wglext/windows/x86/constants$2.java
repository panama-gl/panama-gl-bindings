// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$2 {

    static final FunctionDescriptor __pctype_func$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle __pctype_func$MH = RuntimeHelper.downcallHandle(
        "__pctype_func",
        constants$2.__pctype_func$FUNC
    );
    static final FunctionDescriptor __pwctype_func$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle __pwctype_func$MH = RuntimeHelper.downcallHandle(
        "__pwctype_func",
        constants$2.__pwctype_func$FUNC
    );
    static final FunctionDescriptor iswalnum$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle iswalnum$MH = RuntimeHelper.downcallHandle(
        "iswalnum",
        constants$2.iswalnum$FUNC
    );
    static final FunctionDescriptor iswalpha$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle iswalpha$MH = RuntimeHelper.downcallHandle(
        "iswalpha",
        constants$2.iswalpha$FUNC
    );
    static final FunctionDescriptor iswascii$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle iswascii$MH = RuntimeHelper.downcallHandle(
        "iswascii",
        constants$2.iswascii$FUNC
    );
    static final FunctionDescriptor iswblank$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle iswblank$MH = RuntimeHelper.downcallHandle(
        "iswblank",
        constants$2.iswblank$FUNC
    );
}

