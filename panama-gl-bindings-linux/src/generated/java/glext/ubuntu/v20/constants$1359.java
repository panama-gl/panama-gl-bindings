// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1359 {

    static final  OfAddress glutBitmapHelvetica10$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle glutBitmapHelvetica10$VH = constants$1359.glutBitmapHelvetica10$LAYOUT.varHandle();
    static final MemorySegment glutBitmapHelvetica10$SEGMENT = RuntimeHelper.lookupGlobalVariable("glutBitmapHelvetica10", constants$1359.glutBitmapHelvetica10$LAYOUT);
    static final  OfAddress glutBitmapHelvetica12$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle glutBitmapHelvetica12$VH = constants$1359.glutBitmapHelvetica12$LAYOUT.varHandle();
    static final MemorySegment glutBitmapHelvetica12$SEGMENT = RuntimeHelper.lookupGlobalVariable("glutBitmapHelvetica12", constants$1359.glutBitmapHelvetica12$LAYOUT);
    static final  OfAddress glutBitmapHelvetica18$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle glutBitmapHelvetica18$VH = constants$1359.glutBitmapHelvetica18$LAYOUT.varHandle();
    static final MemorySegment glutBitmapHelvetica18$SEGMENT = RuntimeHelper.lookupGlobalVariable("glutBitmapHelvetica18", constants$1359.glutBitmapHelvetica18$LAYOUT);
    static final FunctionDescriptor glutInit$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glutInit$MH = RuntimeHelper.downcallHandle(
        "glutInit",
        constants$1359.glutInit$FUNC
    );
    static final FunctionDescriptor glutInitWindowPosition$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glutInitWindowPosition$MH = RuntimeHelper.downcallHandle(
        "glutInitWindowPosition",
        constants$1359.glutInitWindowPosition$FUNC
    );
    static final FunctionDescriptor glutInitWindowSize$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glutInitWindowSize$MH = RuntimeHelper.downcallHandle(
        "glutInitWindowSize",
        constants$1359.glutInitWindowSize$FUNC
    );
}


