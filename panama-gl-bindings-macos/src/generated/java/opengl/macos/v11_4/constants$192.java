// Generated by jextract

package opengl.macos.v11_4;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$192 {

    static final FunctionDescriptor glutSpaceballButtonFunc$func$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle glutSpaceballButtonFunc$func$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$192.glutSpaceballButtonFunc$func$FUNC, false
    );
    static final FunctionDescriptor glutSpaceballButtonFunc$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glutSpaceballButtonFunc$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutSpaceballButtonFunc",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$192.glutSpaceballButtonFunc$FUNC, false
    );
    static final FunctionDescriptor glutButtonBoxFunc$func$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle glutButtonBoxFunc$func$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$192.glutButtonBoxFunc$func$FUNC, false
    );
    static final FunctionDescriptor glutButtonBoxFunc$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glutButtonBoxFunc$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutButtonBoxFunc",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$192.glutButtonBoxFunc$FUNC, false
    );
    static final FunctionDescriptor glutDialsFunc$func$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
}

