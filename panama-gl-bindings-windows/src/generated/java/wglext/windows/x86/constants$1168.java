// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1168 {

    static final FunctionDescriptor CoInternetIsFeatureEnabledForUrl$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CoInternetIsFeatureEnabledForUrl$MH = RuntimeHelper.downcallHandle(
        "CoInternetIsFeatureEnabledForUrl",
        constants$1168.CoInternetIsFeatureEnabledForUrl$FUNC
    );
    static final FunctionDescriptor CoInternetIsFeatureEnabledForIUri$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CoInternetIsFeatureEnabledForIUri$MH = RuntimeHelper.downcallHandle(
        "CoInternetIsFeatureEnabledForIUri",
        constants$1168.CoInternetIsFeatureEnabledForIUri$FUNC
    );
    static final FunctionDescriptor CoInternetIsFeatureZoneElevationEnabled$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CoInternetIsFeatureZoneElevationEnabled$MH = RuntimeHelper.downcallHandle(
        "CoInternetIsFeatureZoneElevationEnabled",
        constants$1168.CoInternetIsFeatureZoneElevationEnabled$FUNC
    );
    static final FunctionDescriptor CopyStgMedium$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CopyStgMedium$MH = RuntimeHelper.downcallHandle(
        "CopyStgMedium",
        constants$1168.CopyStgMedium$FUNC
    );
    static final FunctionDescriptor CopyBindInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CopyBindInfo$MH = RuntimeHelper.downcallHandle(
        "CopyBindInfo",
        constants$1168.CopyBindInfo$FUNC
    );
    static final FunctionDescriptor ReleaseBindInfo$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReleaseBindInfo$MH = RuntimeHelper.downcallHandle(
        "ReleaseBindInfo",
        constants$1168.ReleaseBindInfo$FUNC
    );
}

