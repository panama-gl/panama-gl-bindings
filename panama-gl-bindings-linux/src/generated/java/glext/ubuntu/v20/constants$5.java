// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$5 {

    static final FunctionDescriptor glGetDoublev$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glGetDoublev$MH = RuntimeHelper.downcallHandle(
        "glGetDoublev",
        constants$5.glGetDoublev$FUNC
    );
    static final FunctionDescriptor glGetFloatv$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glGetFloatv$MH = RuntimeHelper.downcallHandle(
        "glGetFloatv",
        constants$5.glGetFloatv$FUNC
    );
    static final FunctionDescriptor glGetIntegerv$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glGetIntegerv$MH = RuntimeHelper.downcallHandle(
        "glGetIntegerv",
        constants$5.glGetIntegerv$FUNC
    );
    static final FunctionDescriptor glPushAttrib$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glPushAttrib$MH = RuntimeHelper.downcallHandle(
        "glPushAttrib",
        constants$5.glPushAttrib$FUNC
    );
    static final FunctionDescriptor glPopAttrib$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glPopAttrib$MH = RuntimeHelper.downcallHandle(
        "glPopAttrib",
        constants$5.glPopAttrib$FUNC
    );
    static final FunctionDescriptor glPushClientAttrib$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glPushClientAttrib$MH = RuntimeHelper.downcallHandle(
        "glPushClientAttrib",
        constants$5.glPushClientAttrib$FUNC
    );
}


