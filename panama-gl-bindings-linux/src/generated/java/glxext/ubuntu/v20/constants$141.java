// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$141 {

    static final FunctionDescriptor glPushName$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glPushName$MH = RuntimeHelper.downcallHandle(
        "glPushName",
        constants$141.glPushName$FUNC
    );
    static final FunctionDescriptor glPopName$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glPopName$MH = RuntimeHelper.downcallHandle(
        "glPopName",
        constants$141.glPopName$FUNC
    );
    static final FunctionDescriptor glDrawRangeElements$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glDrawRangeElements$MH = RuntimeHelper.downcallHandle(
        "glDrawRangeElements",
        constants$141.glDrawRangeElements$FUNC
    );
    static final FunctionDescriptor glTexImage3D$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glTexImage3D$MH = RuntimeHelper.downcallHandle(
        "glTexImage3D",
        constants$141.glTexImage3D$FUNC
    );
    static final FunctionDescriptor glTexSubImage3D$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glTexSubImage3D$MH = RuntimeHelper.downcallHandle(
        "glTexSubImage3D",
        constants$141.glTexSubImage3D$FUNC
    );
    static final FunctionDescriptor glCopyTexSubImage3D$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glCopyTexSubImage3D$MH = RuntimeHelper.downcallHandle(
        "glCopyTexSubImage3D",
        constants$141.glCopyTexSubImage3D$FUNC
    );
}


