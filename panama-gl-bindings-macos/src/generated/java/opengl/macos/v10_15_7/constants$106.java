// Generated by jextract

package opengl.macos.v10_15_7;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$106 {

    static final FunctionDescriptor glPolygonOffset$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle glPolygonOffset$MH = RuntimeHelper.downcallHandle(
        "glPolygonOffset",
        constants$106.glPolygonOffset$FUNC
    );
    static final FunctionDescriptor glPolygonStipple$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glPolygonStipple$MH = RuntimeHelper.downcallHandle(
        "glPolygonStipple",
        constants$106.glPolygonStipple$FUNC
    );
    static final FunctionDescriptor glPopAttrib$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glPopAttrib$MH = RuntimeHelper.downcallHandle(
        "glPopAttrib",
        constants$106.glPopAttrib$FUNC
    );
    static final FunctionDescriptor glPopClientAttrib$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glPopClientAttrib$MH = RuntimeHelper.downcallHandle(
        "glPopClientAttrib",
        constants$106.glPopClientAttrib$FUNC
    );
    static final FunctionDescriptor glPopMatrix$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glPopMatrix$MH = RuntimeHelper.downcallHandle(
        "glPopMatrix",
        constants$106.glPopMatrix$FUNC
    );
    static final FunctionDescriptor glPopName$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glPopName$MH = RuntimeHelper.downcallHandle(
        "glPopName",
        constants$106.glPopName$FUNC
    );
}


