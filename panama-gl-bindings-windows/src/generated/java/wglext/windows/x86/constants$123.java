// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$123 {

    static final FunctionDescriptor TpSetCallbackCleanupGroup$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle TpSetCallbackCleanupGroup$MH = RuntimeHelper.downcallHandle(
        "TpSetCallbackCleanupGroup",
        constants$123.TpSetCallbackCleanupGroup$FUNC
    );
    static final FunctionDescriptor TpSetCallbackActivationContext$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle TpSetCallbackActivationContext$MH = RuntimeHelper.downcallHandle(
        "TpSetCallbackActivationContext",
        constants$123.TpSetCallbackActivationContext$FUNC
    );
    static final FunctionDescriptor TpSetCallbackNoActivationContext$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle TpSetCallbackNoActivationContext$MH = RuntimeHelper.downcallHandle(
        "TpSetCallbackNoActivationContext",
        constants$123.TpSetCallbackNoActivationContext$FUNC
    );
    static final FunctionDescriptor TpSetCallbackLongFunction$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle TpSetCallbackLongFunction$MH = RuntimeHelper.downcallHandle(
        "TpSetCallbackLongFunction",
        constants$123.TpSetCallbackLongFunction$FUNC
    );
    static final FunctionDescriptor TpSetCallbackRaceWithDll$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle TpSetCallbackRaceWithDll$MH = RuntimeHelper.downcallHandle(
        "TpSetCallbackRaceWithDll",
        constants$123.TpSetCallbackRaceWithDll$FUNC
    );
    static final FunctionDescriptor TpSetCallbackFinalizationCallback$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle TpSetCallbackFinalizationCallback$MH = RuntimeHelper.downcallHandle(
        "TpSetCallbackFinalizationCallback",
        constants$123.TpSetCallbackFinalizationCallback$FUNC
    );
}


