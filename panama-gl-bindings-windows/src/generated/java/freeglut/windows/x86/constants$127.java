// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$127 {

    static final FunctionDescriptor TpSetCallbackPriority$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle TpSetCallbackPriority$MH = RuntimeHelper.downcallHandle(
        "TpSetCallbackPriority",
        constants$127.TpSetCallbackPriority$FUNC
    );
    static final FunctionDescriptor TpSetCallbackPersistent$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle TpSetCallbackPersistent$MH = RuntimeHelper.downcallHandle(
        "TpSetCallbackPersistent",
        constants$127.TpSetCallbackPersistent$FUNC
    );
    static final FunctionDescriptor TpDestroyCallbackEnviron$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle TpDestroyCallbackEnviron$MH = RuntimeHelper.downcallHandle(
        "TpDestroyCallbackEnviron",
        constants$127.TpDestroyCallbackEnviron$FUNC
    );
    static final FunctionDescriptor PTP_WORK_CALLBACK$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PTP_WORK_CALLBACK$MH = RuntimeHelper.downcallHandle(
        constants$127.PTP_WORK_CALLBACK$FUNC
    );
    static final FunctionDescriptor PTP_TIMER_CALLBACK$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
}


