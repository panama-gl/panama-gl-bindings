// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$228 {

    static final FunctionDescriptor glDrawRangeElementsBaseVertex$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glDrawRangeElementsBaseVertex$MH = RuntimeHelper.downcallHandle(
        "glDrawRangeElementsBaseVertex",
        constants$228.glDrawRangeElementsBaseVertex$FUNC
    );
    static final FunctionDescriptor glDrawElementsInstancedBaseVertex$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glDrawElementsInstancedBaseVertex$MH = RuntimeHelper.downcallHandle(
        "glDrawElementsInstancedBaseVertex",
        constants$228.glDrawElementsInstancedBaseVertex$FUNC
    );
    static final FunctionDescriptor glMultiDrawElementsBaseVertex$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glMultiDrawElementsBaseVertex$MH = RuntimeHelper.downcallHandle(
        "glMultiDrawElementsBaseVertex",
        constants$228.glMultiDrawElementsBaseVertex$FUNC
    );
    static final FunctionDescriptor glProvokingVertex$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glProvokingVertex$MH = RuntimeHelper.downcallHandle(
        "glProvokingVertex",
        constants$228.glProvokingVertex$FUNC
    );
    static final FunctionDescriptor glFenceSync$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glFenceSync$MH = RuntimeHelper.downcallHandle(
        "glFenceSync",
        constants$228.glFenceSync$FUNC
    );
    static final FunctionDescriptor glIsSync$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glIsSync$MH = RuntimeHelper.downcallHandle(
        "glIsSync",
        constants$228.glIsSync$FUNC
    );
}

