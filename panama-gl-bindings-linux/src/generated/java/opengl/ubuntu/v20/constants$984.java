// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_LONG_LONG;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
import jdk.incubator.foreign.MemoryLayout;
class constants$984 {

    static final FunctionDescriptor abs$FUNC = FunctionDescriptor.of(C_INT,
        C_INT
    );
    static final MethodHandle abs$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "abs",
        "(I)I",
        constants$984.abs$FUNC, false
    );
    static final FunctionDescriptor labs$FUNC = FunctionDescriptor.of(C_LONG,
        C_LONG
    );
    static final MethodHandle labs$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "labs",
        "(J)J",
        constants$984.labs$FUNC, false
    );
    static final FunctionDescriptor llabs$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_LONG_LONG
    );
    static final MethodHandle llabs$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "llabs",
        "(J)J",
        constants$984.llabs$FUNC, false
    );
    static final FunctionDescriptor div$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        C_INT.withName("quot"),
        C_INT.withName("rem")
    ),
        C_INT,
        C_INT
    );
    static final MethodHandle div$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "div",
        "(II)Ljdk/incubator/foreign/MemorySegment;",
        constants$984.div$FUNC, false
    );
    static final FunctionDescriptor ldiv$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        C_LONG.withName("quot"),
        C_LONG.withName("rem")
    ),
        C_LONG,
        C_LONG
    );
    static final MethodHandle ldiv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "ldiv",
        "(JJ)Ljdk/incubator/foreign/MemorySegment;",
        constants$984.ldiv$FUNC, false
    );
    static final FunctionDescriptor lldiv$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        C_LONG_LONG.withName("quot"),
        C_LONG_LONG.withName("rem")
    ),
        C_LONG_LONG,
        C_LONG_LONG
    );
    static final MethodHandle lldiv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "lldiv",
        "(JJ)Ljdk/incubator/foreign/MemorySegment;",
        constants$984.lldiv$FUNC, false
    );
}

