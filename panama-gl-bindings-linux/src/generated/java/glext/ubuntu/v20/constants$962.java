// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$962 {

    static final FunctionDescriptor glutGetModifiers$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle glutGetModifiers$MH = RuntimeHelper.downcallHandle(
        "glutGetModifiers",
        constants$962.glutGetModifiers$FUNC
    );
    static final FunctionDescriptor glutLayerGet$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glutLayerGet$MH = RuntimeHelper.downcallHandle(
        "glutLayerGet",
        constants$962.glutLayerGet$FUNC
    );
    static final FunctionDescriptor glutBitmapCharacter$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glutBitmapCharacter$MH = RuntimeHelper.downcallHandle(
        "glutBitmapCharacter",
        constants$962.glutBitmapCharacter$FUNC
    );
    static final FunctionDescriptor glutBitmapWidth$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glutBitmapWidth$MH = RuntimeHelper.downcallHandle(
        "glutBitmapWidth",
        constants$962.glutBitmapWidth$FUNC
    );
    static final FunctionDescriptor glutStrokeCharacter$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glutStrokeCharacter$MH = RuntimeHelper.downcallHandle(
        "glutStrokeCharacter",
        constants$962.glutStrokeCharacter$FUNC
    );
    static final FunctionDescriptor glutStrokeWidth$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glutStrokeWidth$MH = RuntimeHelper.downcallHandle(
        "glutStrokeWidth",
        constants$962.glutStrokeWidth$FUNC
    );
}


