// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$341 {

    static final FunctionDescriptor PFNGLINVALIDATETEXSUBIMAGEPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLINVALIDATETEXSUBIMAGEPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIIIII)V",
        constants$341.PFNGLINVALIDATETEXSUBIMAGEPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLINVALIDATETEXIMAGEPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLINVALIDATETEXIMAGEPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$341.PFNGLINVALIDATETEXIMAGEPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLINVALIDATEBUFFERSUBDATAPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_LONG,
        C_LONG
    );
    static final MethodHandle PFNGLINVALIDATEBUFFERSUBDATAPROC$MH = RuntimeHelper.downcallHandle(
        "(IJJ)V",
        constants$341.PFNGLINVALIDATEBUFFERSUBDATAPROC$FUNC, false
    );
}

