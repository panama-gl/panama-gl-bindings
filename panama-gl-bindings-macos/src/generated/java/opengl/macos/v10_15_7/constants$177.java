// Generated by jextract

package opengl.macos.v10_15_7;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$177 {

    static final FunctionDescriptor glutInitWindowSize$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glutInitWindowSize$MH = RuntimeHelper.downcallHandle(
        "glutInitWindowSize",
        constants$177.glutInitWindowSize$FUNC
    );
    static final FunctionDescriptor glutMainLoop$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glutMainLoop$MH = RuntimeHelper.downcallHandle(
        "glutMainLoop",
        constants$177.glutMainLoop$FUNC
    );
    static final FunctionDescriptor glutCreateWindow$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glutCreateWindow$MH = RuntimeHelper.downcallHandle(
        "glutCreateWindow",
        constants$177.glutCreateWindow$FUNC
    );
    static final FunctionDescriptor glutCreateSubWindow$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glutCreateSubWindow$MH = RuntimeHelper.downcallHandle(
        "glutCreateSubWindow",
        constants$177.glutCreateSubWindow$FUNC
    );
    static final FunctionDescriptor glutDestroyWindow$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glutDestroyWindow$MH = RuntimeHelper.downcallHandle(
        "glutDestroyWindow",
        constants$177.glutDestroyWindow$FUNC
    );
    static final FunctionDescriptor glutPostRedisplay$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glutPostRedisplay$MH = RuntimeHelper.downcallHandle(
        "glutPostRedisplay",
        constants$177.glutPostRedisplay$FUNC
    );
}

