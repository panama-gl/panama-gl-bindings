// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$0 {

    static final FunctionDescriptor glClearIndex$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle glClearIndex$MH = RuntimeHelper.downcallHandle(
        "glClearIndex",
        constants$0.glClearIndex$FUNC
    );
    static final FunctionDescriptor glClearColor$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle glClearColor$MH = RuntimeHelper.downcallHandle(
        "glClearColor",
        constants$0.glClearColor$FUNC
    );
    static final FunctionDescriptor glClear$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glClear$MH = RuntimeHelper.downcallHandle(
        "glClear",
        constants$0.glClear$FUNC
    );
    static final FunctionDescriptor glIndexMask$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glIndexMask$MH = RuntimeHelper.downcallHandle(
        "glIndexMask",
        constants$0.glIndexMask$FUNC
    );
    static final FunctionDescriptor glColorMask$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle glColorMask$MH = RuntimeHelper.downcallHandle(
        "glColorMask",
        constants$0.glColorMask$FUNC
    );
    static final FunctionDescriptor glAlphaFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle glAlphaFunc$MH = RuntimeHelper.downcallHandle(
        "glAlphaFunc",
        constants$0.glAlphaFunc$FUNC
    );
}


