// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$542 {

    static final FunctionDescriptor GetStringTypeExW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetStringTypeExW$MH = RuntimeHelper.downcallHandle(
        "GetStringTypeExW",
        constants$542.GetStringTypeExW$FUNC
    );
    static final FunctionDescriptor GetStringTypeW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetStringTypeW$MH = RuntimeHelper.downcallHandle(
        "GetStringTypeW",
        constants$542.GetStringTypeW$FUNC
    );
    static final FunctionDescriptor MultiByteToWideChar$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle MultiByteToWideChar$MH = RuntimeHelper.downcallHandle(
        "MultiByteToWideChar",
        constants$542.MultiByteToWideChar$FUNC
    );
    static final FunctionDescriptor WideCharToMultiByte$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WideCharToMultiByte$MH = RuntimeHelper.downcallHandle(
        "WideCharToMultiByte",
        constants$542.WideCharToMultiByte$FUNC
    );
    static final FunctionDescriptor IsValidCodePage$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle IsValidCodePage$MH = RuntimeHelper.downcallHandle(
        "IsValidCodePage",
        constants$542.IsValidCodePage$FUNC
    );
    static final FunctionDescriptor GetACP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle GetACP$MH = RuntimeHelper.downcallHandle(
        "GetACP",
        constants$542.GetACP$FUNC
    );
}


