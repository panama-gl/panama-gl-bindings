// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$328 {

    static final FunctionDescriptor CreateBoundaryDescriptorA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreateBoundaryDescriptorA$MH = RuntimeHelper.downcallHandle(
        "CreateBoundaryDescriptorA",
        constants$328.CreateBoundaryDescriptorA$FUNC
    );
    static final FunctionDescriptor AddIntegrityLabelToBoundaryDescriptor$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddIntegrityLabelToBoundaryDescriptor$MH = RuntimeHelper.downcallHandle(
        "AddIntegrityLabelToBoundaryDescriptor",
        constants$328.AddIntegrityLabelToBoundaryDescriptor$FUNC
    );
    static final FunctionDescriptor GetCurrentHwProfileA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetCurrentHwProfileA$MH = RuntimeHelper.downcallHandle(
        "GetCurrentHwProfileA",
        constants$328.GetCurrentHwProfileA$FUNC
    );
    static final FunctionDescriptor GetCurrentHwProfileW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetCurrentHwProfileW$MH = RuntimeHelper.downcallHandle(
        "GetCurrentHwProfileW",
        constants$328.GetCurrentHwProfileW$FUNC
    );
    static final FunctionDescriptor VerifyVersionInfoA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle VerifyVersionInfoA$MH = RuntimeHelper.downcallHandle(
        "VerifyVersionInfoA",
        constants$328.VerifyVersionInfoA$FUNC
    );
    static final FunctionDescriptor VerifyVersionInfoW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle VerifyVersionInfoW$MH = RuntimeHelper.downcallHandle(
        "VerifyVersionInfoW",
        constants$328.VerifyVersionInfoW$FUNC
    );
}

