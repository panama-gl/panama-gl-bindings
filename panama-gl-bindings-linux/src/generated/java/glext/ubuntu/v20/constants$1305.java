// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1305 {

    static final FunctionDescriptor glInstrumentsBufferSGIX$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glInstrumentsBufferSGIX$MH = RuntimeHelper.downcallHandle(
        "glInstrumentsBufferSGIX",
        constants$1305.glInstrumentsBufferSGIX$FUNC
    );
    static final FunctionDescriptor glPollInstrumentsSGIX$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glPollInstrumentsSGIX$MH = RuntimeHelper.downcallHandle(
        "glPollInstrumentsSGIX",
        constants$1305.glPollInstrumentsSGIX$FUNC
    );
    static final FunctionDescriptor glReadInstrumentsSGIX$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glReadInstrumentsSGIX$MH = RuntimeHelper.downcallHandle(
        "glReadInstrumentsSGIX",
        constants$1305.glReadInstrumentsSGIX$FUNC
    );
    static final FunctionDescriptor glStartInstrumentsSGIX$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glStartInstrumentsSGIX$MH = RuntimeHelper.downcallHandle(
        "glStartInstrumentsSGIX",
        constants$1305.glStartInstrumentsSGIX$FUNC
    );
    static final FunctionDescriptor glStopInstrumentsSGIX$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glStopInstrumentsSGIX$MH = RuntimeHelper.downcallHandle(
        "glStopInstrumentsSGIX",
        constants$1305.glStopInstrumentsSGIX$FUNC
    );
    static final FunctionDescriptor PFNGLGETLISTPARAMETERFVSGIXPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
}

