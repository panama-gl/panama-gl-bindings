// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1099 {

    static final FunctionDescriptor CoBuildVersion$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle CoBuildVersion$MH = RuntimeHelper.downcallHandle(
        "CoBuildVersion",
        constants$1099.CoBuildVersion$FUNC
    );
    static final FunctionDescriptor CoInitialize$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CoInitialize$MH = RuntimeHelper.downcallHandle(
        "CoInitialize",
        constants$1099.CoInitialize$FUNC
    );
    static final FunctionDescriptor CoRegisterMallocSpy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CoRegisterMallocSpy$MH = RuntimeHelper.downcallHandle(
        "CoRegisterMallocSpy",
        constants$1099.CoRegisterMallocSpy$FUNC
    );
    static final FunctionDescriptor CoRevokeMallocSpy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle CoRevokeMallocSpy$MH = RuntimeHelper.downcallHandle(
        "CoRevokeMallocSpy",
        constants$1099.CoRevokeMallocSpy$FUNC
    );
    static final FunctionDescriptor CoCreateStandardMalloc$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CoCreateStandardMalloc$MH = RuntimeHelper.downcallHandle(
        "CoCreateStandardMalloc",
        constants$1099.CoCreateStandardMalloc$FUNC
    );
    static final FunctionDescriptor CoRegisterInitializeSpy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CoRegisterInitializeSpy$MH = RuntimeHelper.downcallHandle(
        "CoRegisterInitializeSpy",
        constants$1099.CoRegisterInitializeSpy$FUNC
    );
}

