// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$975 {

    static final FunctionDescriptor erand48$FUNC = FunctionDescriptor.of(C_DOUBLE,
        C_POINTER
    );
    static final MethodHandle erand48$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "erand48",
        "(Ljdk/incubator/foreign/MemoryAddress;)D",
        constants$975.erand48$FUNC, false
    );
    static final FunctionDescriptor lrand48$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle lrand48$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "lrand48",
        "()J",
        constants$975.lrand48$FUNC, false
    );
    static final FunctionDescriptor nrand48$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle nrand48$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "nrand48",
        "(Ljdk/incubator/foreign/MemoryAddress;)J",
        constants$975.nrand48$FUNC, false
    );
    static final FunctionDescriptor mrand48$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle mrand48$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "mrand48",
        "()J",
        constants$975.mrand48$FUNC, false
    );
    static final FunctionDescriptor jrand48$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle jrand48$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "jrand48",
        "(Ljdk/incubator/foreign/MemoryAddress;)J",
        constants$975.jrand48$FUNC, false
    );
    static final FunctionDescriptor srand48$FUNC = FunctionDescriptor.ofVoid(
        C_LONG
    );
    static final MethodHandle srand48$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "srand48",
        "(J)V",
        constants$975.srand48$FUNC, false
    );
}

