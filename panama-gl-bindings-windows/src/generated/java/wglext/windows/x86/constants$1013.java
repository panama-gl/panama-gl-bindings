// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1013 {

    static final FunctionDescriptor IBindCtx_RemoteGetBindOptions_Proxy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IBindCtx_RemoteGetBindOptions_Proxy$MH = RuntimeHelper.downcallHandle(
        "IBindCtx_RemoteGetBindOptions_Proxy",
        constants$1013.IBindCtx_RemoteGetBindOptions_Proxy$FUNC
    );
    static final FunctionDescriptor IBindCtx_RemoteGetBindOptions_Stub$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IBindCtx_RemoteGetBindOptions_Stub$MH = RuntimeHelper.downcallHandle(
        "IBindCtx_RemoteGetBindOptions_Stub",
        constants$1013.IBindCtx_RemoteGetBindOptions_Stub$FUNC
    );
    static final  GroupLayout IID_IEnumMoniker$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IEnumMoniker$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_IEnumMoniker", constants$1013.IID_IEnumMoniker$LAYOUT);
    static final FunctionDescriptor IEnumMoniker_RemoteNext_Proxy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IEnumMoniker_RemoteNext_Proxy$MH = RuntimeHelper.downcallHandle(
        "IEnumMoniker_RemoteNext_Proxy",
        constants$1013.IEnumMoniker_RemoteNext_Proxy$FUNC
    );
    static final FunctionDescriptor IEnumMoniker_RemoteNext_Stub$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IEnumMoniker_RemoteNext_Stub$MH = RuntimeHelper.downcallHandle(
        "IEnumMoniker_RemoteNext_Stub",
        constants$1013.IEnumMoniker_RemoteNext_Stub$FUNC
    );
    static final  OfAddress __MIDL_itf_objidl_0000_0056_v0_0_c_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_objidl_0000_0056_v0_0_c_ifspec$VH = constants$1013.__MIDL_itf_objidl_0000_0056_v0_0_c_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_objidl_0000_0056_v0_0_c_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_objidl_0000_0056_v0_0_c_ifspec", constants$1013.__MIDL_itf_objidl_0000_0056_v0_0_c_ifspec$LAYOUT);
}


