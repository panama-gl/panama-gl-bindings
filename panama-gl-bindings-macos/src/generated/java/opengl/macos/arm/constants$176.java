// Generated by jextract

package opengl.macos.arm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$176 {

    static final  OfAddress glutBitmapHelvetica12$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle glutBitmapHelvetica12$VH = constants$176.glutBitmapHelvetica12$LAYOUT.varHandle();
    static final MemorySegment glutBitmapHelvetica12$SEGMENT = RuntimeHelper.lookupGlobalVariable("glutBitmapHelvetica12", constants$176.glutBitmapHelvetica12$LAYOUT);
    static final  OfAddress glutBitmapHelvetica18$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle glutBitmapHelvetica18$VH = constants$176.glutBitmapHelvetica18$LAYOUT.varHandle();
    static final MemorySegment glutBitmapHelvetica18$SEGMENT = RuntimeHelper.lookupGlobalVariable("glutBitmapHelvetica18", constants$176.glutBitmapHelvetica18$LAYOUT);
    static final FunctionDescriptor glutInit$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glutInit$MH = RuntimeHelper.downcallHandle(
        "glutInit",
        constants$176.glutInit$FUNC
    );
    static final FunctionDescriptor glutInitDisplayMode$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glutInitDisplayMode$MH = RuntimeHelper.downcallHandle(
        "glutInitDisplayMode",
        constants$176.glutInitDisplayMode$FUNC
    );
    static final FunctionDescriptor glutInitDisplayString$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glutInitDisplayString$MH = RuntimeHelper.downcallHandle(
        "glutInitDisplayString",
        constants$176.glutInitDisplayString$FUNC
    );
    static final FunctionDescriptor glutInitWindowPosition$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glutInitWindowPosition$MH = RuntimeHelper.downcallHandle(
        "glutInitWindowPosition",
        constants$176.glutInitWindowPosition$FUNC
    );
}

