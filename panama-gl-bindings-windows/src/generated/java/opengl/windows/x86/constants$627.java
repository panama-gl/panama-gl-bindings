// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$627 {

    static final FunctionDescriptor WaitServiceState$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WaitServiceState$MH = RuntimeHelper.downcallHandle(
        "WaitServiceState",
        constants$627.WaitServiceState$FUNC
    );
    static final FunctionDescriptor GetServiceRegistryStateKey$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetServiceRegistryStateKey$MH = RuntimeHelper.downcallHandle(
        "GetServiceRegistryStateKey",
        constants$627.GetServiceRegistryStateKey$FUNC
    );
    static final FunctionDescriptor GetServiceDirectory$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetServiceDirectory$MH = RuntimeHelper.downcallHandle(
        "GetServiceDirectory",
        constants$627.GetServiceDirectory$FUNC
    );
    static final FunctionDescriptor GetSharedServiceRegistryStateKey$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetSharedServiceRegistryStateKey$MH = RuntimeHelper.downcallHandle(
        "GetSharedServiceRegistryStateKey",
        constants$627.GetSharedServiceRegistryStateKey$FUNC
    );
    static final FunctionDescriptor GetSharedServiceDirectory$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetSharedServiceDirectory$MH = RuntimeHelper.downcallHandle(
        "GetSharedServiceDirectory",
        constants$627.GetSharedServiceDirectory$FUNC
    );
    static final FunctionDescriptor IMCENUMPROC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
}


