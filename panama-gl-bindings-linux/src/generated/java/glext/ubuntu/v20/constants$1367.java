// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1367 {

    static final FunctionDescriptor glutDetachMenu$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glutDetachMenu$MH = RuntimeHelper.downcallHandle(
        "glutDetachMenu",
        constants$1367.glutDetachMenu$FUNC
    );
    static final FunctionDescriptor glutTimerFunc$callback$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glutTimerFunc$callback$MH = RuntimeHelper.downcallHandle(
        constants$1367.glutTimerFunc$callback$FUNC
    );
    static final FunctionDescriptor glutTimerFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glutTimerFunc$MH = RuntimeHelper.downcallHandle(
        "glutTimerFunc",
        constants$1367.glutTimerFunc$FUNC
    );
    static final FunctionDescriptor glutIdleFunc$callback$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glutIdleFunc$callback$MH = RuntimeHelper.downcallHandle(
        constants$1367.glutIdleFunc$callback$FUNC
    );
}

