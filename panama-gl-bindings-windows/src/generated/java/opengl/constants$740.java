// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$740 {

    static final FunctionDescriptor glutWireIcosahedron$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glutWireIcosahedron$MH = RuntimeHelper.downcallHandle(
        "glutWireIcosahedron",
        constants$740.glutWireIcosahedron$FUNC
    );
    static final FunctionDescriptor glutSolidIcosahedron$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glutSolidIcosahedron$MH = RuntimeHelper.downcallHandle(
        "glutSolidIcosahedron",
        constants$740.glutSolidIcosahedron$FUNC
    );
    static final FunctionDescriptor glutWireTeapot$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle glutWireTeapot$MH = RuntimeHelper.downcallHandle(
        "glutWireTeapot",
        constants$740.glutWireTeapot$FUNC
    );
    static final FunctionDescriptor glutSolidTeapot$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle glutSolidTeapot$MH = RuntimeHelper.downcallHandle(
        "glutSolidTeapot",
        constants$740.glutSolidTeapot$FUNC
    );
    static final FunctionDescriptor glutGameModeString$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glutGameModeString$MH = RuntimeHelper.downcallHandle(
        "glutGameModeString",
        constants$740.glutGameModeString$FUNC
    );
    static final FunctionDescriptor glutEnterGameMode$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle glutEnterGameMode$MH = RuntimeHelper.downcallHandle(
        "glutEnterGameMode",
        constants$740.glutEnterGameMode$FUNC
    );
}


