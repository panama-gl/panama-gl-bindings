// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$220 {

    static final FunctionDescriptor ReleaseMutexWhenCallbackReturns$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReleaseMutexWhenCallbackReturns$MH = RuntimeHelper.downcallHandle(
        "ReleaseMutexWhenCallbackReturns",
        constants$220.ReleaseMutexWhenCallbackReturns$FUNC
    );
    static final FunctionDescriptor LeaveCriticalSectionWhenCallbackReturns$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LeaveCriticalSectionWhenCallbackReturns$MH = RuntimeHelper.downcallHandle(
        "LeaveCriticalSectionWhenCallbackReturns",
        constants$220.LeaveCriticalSectionWhenCallbackReturns$FUNC
    );
    static final FunctionDescriptor FreeLibraryWhenCallbackReturns$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FreeLibraryWhenCallbackReturns$MH = RuntimeHelper.downcallHandle(
        "FreeLibraryWhenCallbackReturns",
        constants$220.FreeLibraryWhenCallbackReturns$FUNC
    );
    static final FunctionDescriptor CallbackMayRunLong$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CallbackMayRunLong$MH = RuntimeHelper.downcallHandle(
        "CallbackMayRunLong",
        constants$220.CallbackMayRunLong$FUNC
    );
    static final FunctionDescriptor DisassociateCurrentThreadFromCallback$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DisassociateCurrentThreadFromCallback$MH = RuntimeHelper.downcallHandle(
        "DisassociateCurrentThreadFromCallback",
        constants$220.DisassociateCurrentThreadFromCallback$FUNC
    );
    static final FunctionDescriptor TrySubmitThreadpoolCallback$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle TrySubmitThreadpoolCallback$MH = RuntimeHelper.downcallHandle(
        "TrySubmitThreadpoolCallback",
        constants$220.TrySubmitThreadpoolCallback$FUNC
    );
}

