// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$954 {

    static final FunctionDescriptor getenv_s$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle getenv_s$MH = RuntimeHelper.downcallHandle(
        "getenv_s",
        constants$954.getenv_s$FUNC
    );
    static final FunctionDescriptor __p___argc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle __p___argc$MH = RuntimeHelper.downcallHandle(
        "__p___argc",
        constants$954.__p___argc$FUNC
    );
    static final FunctionDescriptor __p___argv$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle __p___argv$MH = RuntimeHelper.downcallHandle(
        "__p___argv",
        constants$954.__p___argv$FUNC
    );
    static final FunctionDescriptor __p___wargv$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle __p___wargv$MH = RuntimeHelper.downcallHandle(
        "__p___wargv",
        constants$954.__p___wargv$FUNC
    );
    static final FunctionDescriptor __p__environ$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle __p__environ$MH = RuntimeHelper.downcallHandle(
        "__p__environ",
        constants$954.__p__environ$FUNC
    );
    static final FunctionDescriptor __p__wenviron$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle __p__wenviron$MH = RuntimeHelper.downcallHandle(
        "__p__wenviron",
        constants$954.__p__wenviron$FUNC
    );
}

