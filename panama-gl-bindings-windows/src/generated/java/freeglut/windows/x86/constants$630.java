// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$630 {

    static final FunctionDescriptor ImmDestroyContext$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ImmDestroyContext$MH = RuntimeHelper.downcallHandle(
        "ImmDestroyContext",
        constants$630.ImmDestroyContext$FUNC
    );
    static final FunctionDescriptor ImmGetContext$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ImmGetContext$MH = RuntimeHelper.downcallHandle(
        "ImmGetContext",
        constants$630.ImmGetContext$FUNC
    );
    static final FunctionDescriptor ImmReleaseContext$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ImmReleaseContext$MH = RuntimeHelper.downcallHandle(
        "ImmReleaseContext",
        constants$630.ImmReleaseContext$FUNC
    );
    static final FunctionDescriptor ImmAssociateContext$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ImmAssociateContext$MH = RuntimeHelper.downcallHandle(
        "ImmAssociateContext",
        constants$630.ImmAssociateContext$FUNC
    );
    static final FunctionDescriptor ImmAssociateContextEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ImmAssociateContextEx$MH = RuntimeHelper.downcallHandle(
        "ImmAssociateContextEx",
        constants$630.ImmAssociateContextEx$FUNC
    );
    static final FunctionDescriptor ImmGetCompositionStringA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ImmGetCompositionStringA$MH = RuntimeHelper.downcallHandle(
        "ImmGetCompositionStringA",
        constants$630.ImmGetCompositionStringA$FUNC
    );
}


