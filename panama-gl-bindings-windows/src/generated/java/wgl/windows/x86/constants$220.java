// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$220 {

    static final FunctionDescriptor SetIoRateControlInformationJobObject$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetIoRateControlInformationJobObject$MH = RuntimeHelper.downcallHandle(
        "SetIoRateControlInformationJobObject",
        constants$220.SetIoRateControlInformationJobObject$FUNC
    );
    static final FunctionDescriptor QueryInformationJobObject$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInformationJobObject$MH = RuntimeHelper.downcallHandle(
        "QueryInformationJobObject",
        constants$220.QueryInformationJobObject$FUNC
    );
    static final FunctionDescriptor QueryIoRateControlInformationJobObject$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryIoRateControlInformationJobObject$MH = RuntimeHelper.downcallHandle(
        "QueryIoRateControlInformationJobObject",
        constants$220.QueryIoRateControlInformationJobObject$FUNC
    );
    static final FunctionDescriptor Wow64DisableWow64FsRedirection$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Wow64DisableWow64FsRedirection$MH = RuntimeHelper.downcallHandle(
        "Wow64DisableWow64FsRedirection",
        constants$220.Wow64DisableWow64FsRedirection$FUNC
    );
    static final FunctionDescriptor Wow64RevertWow64FsRedirection$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Wow64RevertWow64FsRedirection$MH = RuntimeHelper.downcallHandle(
        "Wow64RevertWow64FsRedirection",
        constants$220.Wow64RevertWow64FsRedirection$FUNC
    );
    static final FunctionDescriptor IsWow64Process$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IsWow64Process$MH = RuntimeHelper.downcallHandle(
        "IsWow64Process",
        constants$220.IsWow64Process$FUNC
    );
}


