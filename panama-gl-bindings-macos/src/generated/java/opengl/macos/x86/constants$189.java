// Generated by jextract

package opengl.macos.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$189 {

    static final FunctionDescriptor glutIdleFunc$func$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glutIdleFunc$func$MH = RuntimeHelper.downcallHandle(
        constants$189.glutIdleFunc$func$FUNC
    );
    static final FunctionDescriptor glutIdleFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glutIdleFunc$MH = RuntimeHelper.downcallHandle(
        "glutIdleFunc",
        constants$189.glutIdleFunc$FUNC
    );
    static final FunctionDescriptor glutTimerFunc$func$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glutTimerFunc$func$MH = RuntimeHelper.downcallHandle(
        constants$189.glutTimerFunc$func$FUNC
    );
    static final FunctionDescriptor glutTimerFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glutTimerFunc$MH = RuntimeHelper.downcallHandle(
        "glutTimerFunc",
        constants$189.glutTimerFunc$FUNC
    );
    static final FunctionDescriptor glutMenuStateFunc$func$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
}

