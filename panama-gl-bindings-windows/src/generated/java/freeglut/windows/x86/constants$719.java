// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$719 {

    static final FunctionDescriptor glutPostWindowRedisplay$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle glutPostWindowRedisplay$MH = RuntimeHelper.downcallHandle(
        "glutPostWindowRedisplay",
        constants$719.glutPostWindowRedisplay$FUNC
    );
    static final FunctionDescriptor glutPostRedisplay$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glutPostRedisplay$MH = RuntimeHelper.downcallHandle(
        "glutPostRedisplay",
        constants$719.glutPostRedisplay$FUNC
    );
    static final FunctionDescriptor glutSwapBuffers$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glutSwapBuffers$MH = RuntimeHelper.downcallHandle(
        "glutSwapBuffers",
        constants$719.glutSwapBuffers$FUNC
    );
    static final FunctionDescriptor glutWarpPointer$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle glutWarpPointer$MH = RuntimeHelper.downcallHandle(
        "glutWarpPointer",
        constants$719.glutWarpPointer$FUNC
    );
    static final FunctionDescriptor glutSetCursor$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle glutSetCursor$MH = RuntimeHelper.downcallHandle(
        "glutSetCursor",
        constants$719.glutSetCursor$FUNC
    );
    static final FunctionDescriptor glutEstablishOverlay$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glutEstablishOverlay$MH = RuntimeHelper.downcallHandle(
        "glutEstablishOverlay",
        constants$719.glutEstablishOverlay$FUNC
    );
}


