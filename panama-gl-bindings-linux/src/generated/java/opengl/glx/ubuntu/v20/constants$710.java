// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$710 {

    static final FunctionDescriptor PFNGLBLITFRAMEBUFFEREXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLBLITFRAMEBUFFEREXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIIIIIII)V",
        constants$710.PFNGLBLITFRAMEBUFFEREXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLRENDERBUFFERSTORAGEMULTISAMPLEEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLRENDERBUFFERSTORAGEMULTISAMPLEEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIII)V",
        constants$710.PFNGLRENDERBUFFERSTORAGEMULTISAMPLEEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLISRENDERBUFFEREXTPROC$FUNC = FunctionDescriptor.of(C_CHAR,
        C_INT
    );
    static final MethodHandle PFNGLISRENDERBUFFEREXTPROC$MH = RuntimeHelper.downcallHandle(
        "(I)B",
        constants$710.PFNGLISRENDERBUFFEREXTPROC$FUNC, false
    );
}

