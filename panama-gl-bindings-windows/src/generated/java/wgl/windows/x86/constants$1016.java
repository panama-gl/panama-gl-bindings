// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1016 {

    static final FunctionDescriptor IMoniker_RemoteBindToStorage_Proxy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IMoniker_RemoteBindToStorage_Proxy$MH = RuntimeHelper.downcallHandle(
        "IMoniker_RemoteBindToStorage_Proxy",
        constants$1016.IMoniker_RemoteBindToStorage_Proxy$FUNC
    );
    static final FunctionDescriptor IMoniker_RemoteBindToStorage_Stub$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IMoniker_RemoteBindToStorage_Stub$MH = RuntimeHelper.downcallHandle(
        "IMoniker_RemoteBindToStorage_Stub",
        constants$1016.IMoniker_RemoteBindToStorage_Stub$FUNC
    );
    static final  OfAddress __MIDL_itf_objidl_0000_0061_v0_0_c_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_objidl_0000_0061_v0_0_c_ifspec$VH = constants$1016.__MIDL_itf_objidl_0000_0061_v0_0_c_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_objidl_0000_0061_v0_0_c_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_objidl_0000_0061_v0_0_c_ifspec", constants$1016.__MIDL_itf_objidl_0000_0061_v0_0_c_ifspec$LAYOUT);
    static final  OfAddress __MIDL_itf_objidl_0000_0061_v0_0_s_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_objidl_0000_0061_v0_0_s_ifspec$VH = constants$1016.__MIDL_itf_objidl_0000_0061_v0_0_s_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_objidl_0000_0061_v0_0_s_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_objidl_0000_0061_v0_0_s_ifspec", constants$1016.__MIDL_itf_objidl_0000_0061_v0_0_s_ifspec$LAYOUT);
    static final  GroupLayout IID_IROTData$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IROTData$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_IROTData", constants$1016.IID_IROTData$LAYOUT);
    static final  OfAddress __MIDL_itf_objidl_0000_0062_v0_0_c_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_objidl_0000_0062_v0_0_c_ifspec$VH = constants$1016.__MIDL_itf_objidl_0000_0062_v0_0_c_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_objidl_0000_0062_v0_0_c_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_objidl_0000_0062_v0_0_c_ifspec", constants$1016.__MIDL_itf_objidl_0000_0062_v0_0_c_ifspec$LAYOUT);
}


