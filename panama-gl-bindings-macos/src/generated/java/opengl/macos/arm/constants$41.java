// Generated by jextract

package opengl.macos.arm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$41 {

    static final FunctionDescriptor glPushGroupMarkerEXT$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glPushGroupMarkerEXT$MH = RuntimeHelper.downcallHandle(
        "glPushGroupMarkerEXT",
        constants$41.glPushGroupMarkerEXT$FUNC
    );
    static final FunctionDescriptor glPopGroupMarkerEXT$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glPopGroupMarkerEXT$MH = RuntimeHelper.downcallHandle(
        "glPopGroupMarkerEXT",
        constants$41.glPopGroupMarkerEXT$FUNC
    );
    static final FunctionDescriptor glDepthBoundsEXT$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle glDepthBoundsEXT$MH = RuntimeHelper.downcallHandle(
        "glDepthBoundsEXT",
        constants$41.glDepthBoundsEXT$FUNC
    );
    static final FunctionDescriptor glColorMaskIndexedEXT$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle glColorMaskIndexedEXT$MH = RuntimeHelper.downcallHandle(
        "glColorMaskIndexedEXT",
        constants$41.glColorMaskIndexedEXT$FUNC
    );
    static final FunctionDescriptor glEnableIndexedEXT$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glEnableIndexedEXT$MH = RuntimeHelper.downcallHandle(
        "glEnableIndexedEXT",
        constants$41.glEnableIndexedEXT$FUNC
    );
    static final FunctionDescriptor glDisableIndexedEXT$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glDisableIndexedEXT$MH = RuntimeHelper.downcallHandle(
        "glDisableIndexedEXT",
        constants$41.glDisableIndexedEXT$FUNC
    );
}


