// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$943 {

    static final FunctionDescriptor glutSetWindow$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glutSetWindow$MH = RuntimeHelper.downcallHandle(
        "glutSetWindow",
        constants$943.glutSetWindow$FUNC
    );
    static final FunctionDescriptor glutGetWindow$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle glutGetWindow$MH = RuntimeHelper.downcallHandle(
        "glutGetWindow",
        constants$943.glutGetWindow$FUNC
    );
    static final FunctionDescriptor glutSetWindowTitle$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glutSetWindowTitle$MH = RuntimeHelper.downcallHandle(
        "glutSetWindowTitle",
        constants$943.glutSetWindowTitle$FUNC
    );
    static final FunctionDescriptor glutSetIconTitle$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glutSetIconTitle$MH = RuntimeHelper.downcallHandle(
        "glutSetIconTitle",
        constants$943.glutSetIconTitle$FUNC
    );
    static final FunctionDescriptor glutReshapeWindow$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glutReshapeWindow$MH = RuntimeHelper.downcallHandle(
        "glutReshapeWindow",
        constants$943.glutReshapeWindow$FUNC
    );
    static final FunctionDescriptor glutPositionWindow$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glutPositionWindow$MH = RuntimeHelper.downcallHandle(
        "glutPositionWindow",
        constants$943.glutPositionWindow$FUNC
    );
}


