// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$9 {

    static final FunctionDescriptor XCreateSimpleWindow$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle XCreateSimpleWindow$MH = RuntimeHelper.downcallHandle(
        "XCreateSimpleWindow",
        constants$9.XCreateSimpleWindow$FUNC
    );
    static final FunctionDescriptor XGetSelectionOwner$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle XGetSelectionOwner$MH = RuntimeHelper.downcallHandle(
        "XGetSelectionOwner",
        constants$9.XGetSelectionOwner$FUNC
    );
    static final FunctionDescriptor XCreateWindow$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XCreateWindow$MH = RuntimeHelper.downcallHandle(
        "XCreateWindow",
        constants$9.XCreateWindow$FUNC
    );
    static final FunctionDescriptor XListInstalledColormaps$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XListInstalledColormaps$MH = RuntimeHelper.downcallHandle(
        "XListInstalledColormaps",
        constants$9.XListInstalledColormaps$FUNC
    );
    static final FunctionDescriptor XListFonts$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XListFonts$MH = RuntimeHelper.downcallHandle(
        "XListFonts",
        constants$9.XListFonts$FUNC
    );
    static final FunctionDescriptor XListFontsWithInfo$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XListFontsWithInfo$MH = RuntimeHelper.downcallHandle(
        "XListFontsWithInfo",
        constants$9.XListFontsWithInfo$FUNC
    );
}


