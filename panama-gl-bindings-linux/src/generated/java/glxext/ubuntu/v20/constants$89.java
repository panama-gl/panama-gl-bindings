// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$89 {

    static final FunctionDescriptor glDrawBuffer$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glDrawBuffer$MH = RuntimeHelper.downcallHandle(
        "glDrawBuffer",
        constants$89.glDrawBuffer$FUNC
    );
    static final FunctionDescriptor glReadBuffer$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glReadBuffer$MH = RuntimeHelper.downcallHandle(
        "glReadBuffer",
        constants$89.glReadBuffer$FUNC
    );
    static final FunctionDescriptor glEnable$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glEnable$MH = RuntimeHelper.downcallHandle(
        "glEnable",
        constants$89.glEnable$FUNC
    );
    static final FunctionDescriptor glDisable$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glDisable$MH = RuntimeHelper.downcallHandle(
        "glDisable",
        constants$89.glDisable$FUNC
    );
    static final FunctionDescriptor glIsEnabled$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glIsEnabled$MH = RuntimeHelper.downcallHandle(
        "glIsEnabled",
        constants$89.glIsEnabled$FUNC
    );
    static final FunctionDescriptor glEnableClientState$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glEnableClientState$MH = RuntimeHelper.downcallHandle(
        "glEnableClientState",
        constants$89.glEnableClientState$FUNC
    );
}


