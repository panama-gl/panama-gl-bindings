// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1091 {

    static final FunctionDescriptor ITypeLib2_GetDocumentation2_Stub$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ITypeLib2_GetDocumentation2_Stub$MH = RuntimeHelper.downcallHandle(
        "ITypeLib2_GetDocumentation2_Stub",
        constants$1091.ITypeLib2_GetDocumentation2_Stub$FUNC
    );
    static final FunctionDescriptor IPropertyBag_Read_Proxy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IPropertyBag_Read_Proxy$MH = RuntimeHelper.downcallHandle(
        "IPropertyBag_Read_Proxy",
        constants$1091.IPropertyBag_Read_Proxy$FUNC
    );
    static final FunctionDescriptor IPropertyBag_Read_Stub$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IPropertyBag_Read_Stub$MH = RuntimeHelper.downcallHandle(
        "IPropertyBag_Read_Stub",
        constants$1091.IPropertyBag_Read_Stub$FUNC
    );
    static final  OfAddress __MIDL_itf_propidlbase_0000_0000_v0_0_c_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_propidlbase_0000_0000_v0_0_c_ifspec$VH = constants$1091.__MIDL_itf_propidlbase_0000_0000_v0_0_c_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_propidlbase_0000_0000_v0_0_c_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_propidlbase_0000_0000_v0_0_c_ifspec", constants$1091.__MIDL_itf_propidlbase_0000_0000_v0_0_c_ifspec$LAYOUT);
    static final  OfAddress __MIDL_itf_propidlbase_0000_0000_v0_0_s_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_propidlbase_0000_0000_v0_0_s_ifspec$VH = constants$1091.__MIDL_itf_propidlbase_0000_0000_v0_0_s_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_propidlbase_0000_0000_v0_0_s_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_propidlbase_0000_0000_v0_0_s_ifspec", constants$1091.__MIDL_itf_propidlbase_0000_0000_v0_0_s_ifspec$LAYOUT);
    static final  GroupLayout IID_IPropertyStorage$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IPropertyStorage$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_IPropertyStorage", constants$1091.IID_IPropertyStorage$LAYOUT);
}


