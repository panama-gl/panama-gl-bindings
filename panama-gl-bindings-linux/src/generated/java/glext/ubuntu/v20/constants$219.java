// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$219 {

    static final FunctionDescriptor PFNGLGETACTIVEUNIFORMBLOCKNAMEPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNGLGETACTIVEUNIFORMBLOCKNAMEPROC$MH = RuntimeHelper.downcallHandle(
        constants$219.PFNGLGETACTIVEUNIFORMBLOCKNAMEPROC$FUNC
    );
    static final FunctionDescriptor PFNGLUNIFORMBLOCKBINDINGPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle PFNGLUNIFORMBLOCKBINDINGPROC$MH = RuntimeHelper.downcallHandle(
        constants$219.PFNGLUNIFORMBLOCKBINDINGPROC$FUNC
    );
    static final FunctionDescriptor glDrawArraysInstanced$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glDrawArraysInstanced$MH = RuntimeHelper.downcallHandle(
        "glDrawArraysInstanced",
        constants$219.glDrawArraysInstanced$FUNC
    );
    static final FunctionDescriptor glDrawElementsInstanced$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glDrawElementsInstanced$MH = RuntimeHelper.downcallHandle(
        "glDrawElementsInstanced",
        constants$219.glDrawElementsInstanced$FUNC
    );
    static final FunctionDescriptor glTexBuffer$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glTexBuffer$MH = RuntimeHelper.downcallHandle(
        "glTexBuffer",
        constants$219.glTexBuffer$FUNC
    );
}


