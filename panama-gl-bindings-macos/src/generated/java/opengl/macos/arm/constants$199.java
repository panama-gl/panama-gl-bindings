// Generated by jextract

package opengl.macos.arm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$199 {

    static final FunctionDescriptor glutBitmapWidth$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glutBitmapWidth$MH = RuntimeHelper.downcallHandle(
        "glutBitmapWidth",
        constants$199.glutBitmapWidth$FUNC
    );
    static final FunctionDescriptor glutStrokeCharacter$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glutStrokeCharacter$MH = RuntimeHelper.downcallHandle(
        "glutStrokeCharacter",
        constants$199.glutStrokeCharacter$FUNC
    );
    static final FunctionDescriptor glutStrokeWidth$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glutStrokeWidth$MH = RuntimeHelper.downcallHandle(
        "glutStrokeWidth",
        constants$199.glutStrokeWidth$FUNC
    );
    static final FunctionDescriptor glutBitmapLength$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glutBitmapLength$MH = RuntimeHelper.downcallHandle(
        "glutBitmapLength",
        constants$199.glutBitmapLength$FUNC
    );
    static final FunctionDescriptor glutStrokeLength$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glutStrokeLength$MH = RuntimeHelper.downcallHandle(
        "glutStrokeLength",
        constants$199.glutStrokeLength$FUNC
    );
    static final FunctionDescriptor glutWireSphere$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glutWireSphere$MH = RuntimeHelper.downcallHandle(
        "glutWireSphere",
        constants$199.glutWireSphere$FUNC
    );
}


