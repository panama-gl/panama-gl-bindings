// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("ulFlags"),
        Constants$root.C_LONG$LAYOUT.withName("ulEncodedAssemblyIdentityLength"),
        Constants$root.C_LONG$LAYOUT.withName("ulManifestPathType"),
        Constants$root.C_LONG$LAYOUT.withName("ulManifestPathLength"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("u"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("QuadPart")
        ).withName("liManifestLastWriteTime"),
        Constants$root.C_LONG$LAYOUT.withName("ulPolicyPathType"),
        Constants$root.C_LONG$LAYOUT.withName("ulPolicyPathLength"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("u"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("QuadPart")
        ).withName("liPolicyLastWriteTime"),
        Constants$root.C_LONG$LAYOUT.withName("ulMetadataSatelliteRosterIndex"),
        Constants$root.C_LONG$LAYOUT.withName("ulManifestVersionMajor"),
        Constants$root.C_LONG$LAYOUT.withName("ulManifestVersionMinor"),
        Constants$root.C_LONG$LAYOUT.withName("ulPolicyVersionMajor"),
        Constants$root.C_LONG$LAYOUT.withName("ulPolicyVersionMinor"),
        Constants$root.C_LONG$LAYOUT.withName("ulAssemblyDirectoryNameLength"),
        Constants$root.C_POINTER$LAYOUT.withName("lpAssemblyEncodedAssemblyIdentity"),
        Constants$root.C_POINTER$LAYOUT.withName("lpAssemblyManifestPath"),
        Constants$root.C_POINTER$LAYOUT.withName("lpAssemblyPolicyPath"),
        Constants$root.C_POINTER$LAYOUT.withName("lpAssemblyDirectoryName"),
        Constants$root.C_LONG$LAYOUT.withName("ulFileCount"),
        MemoryLayout.paddingLayout(32)
    ).withName("_ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION");
    public static MemoryLayout $LAYOUT() {
        return _ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.$struct$LAYOUT;
    }
    static final VarHandle ulFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ulFlags"));
    public static VarHandle ulFlags$VH() {
        return _ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.ulFlags$VH;
    }
    public static int ulFlags$get(MemorySegment seg) {
        return (int)_ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.ulFlags$VH.get(seg);
    }
    public static void ulFlags$set( MemorySegment seg, int x) {
        _ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.ulFlags$VH.set(seg, x);
    }
    public static int ulFlags$get(MemorySegment seg, long index) {
        return (int)_ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.ulFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ulFlags$set(MemorySegment seg, long index, int x) {
        _ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.ulFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ulEncodedAssemblyIdentityLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ulEncodedAssemblyIdentityLength"));
    public static VarHandle ulEncodedAssemblyIdentityLength$VH() {
        return _ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.ulEncodedAssemblyIdentityLength$VH;
    }
    public static int ulEncodedAssemblyIdentityLength$get(MemorySegment seg) {
        return (int)_ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.ulEncodedAssemblyIdentityLength$VH.get(seg);
    }
    public static void ulEncodedAssemblyIdentityLength$set( MemorySegment seg, int x) {
        _ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.ulEncodedAssemblyIdentityLength$VH.set(seg, x);
    }
    public static int ulEncodedAssemblyIdentityLength$get(MemorySegment seg, long index) {
        return (int)_ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.ulEncodedAssemblyIdentityLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ulEncodedAssemblyIdentityLength$set(MemorySegment seg, long index, int x) {
        _ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.ulEncodedAssemblyIdentityLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ulManifestPathType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ulManifestPathType"));
    public static VarHandle ulManifestPathType$VH() {
        return _ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.ulManifestPathType$VH;
    }
    public static int ulManifestPathType$get(MemorySegment seg) {
        return (int)_ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.ulManifestPathType$VH.get(seg);
    }
    public static void ulManifestPathType$set( MemorySegment seg, int x) {
        _ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.ulManifestPathType$VH.set(seg, x);
    }
    public static int ulManifestPathType$get(MemorySegment seg, long index) {
        return (int)_ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.ulManifestPathType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ulManifestPathType$set(MemorySegment seg, long index, int x) {
        _ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.ulManifestPathType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ulManifestPathLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ulManifestPathLength"));
    public static VarHandle ulManifestPathLength$VH() {
        return _ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.ulManifestPathLength$VH;
    }
    public static int ulManifestPathLength$get(MemorySegment seg) {
        return (int)_ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.ulManifestPathLength$VH.get(seg);
    }
    public static void ulManifestPathLength$set( MemorySegment seg, int x) {
        _ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.ulManifestPathLength$VH.set(seg, x);
    }
    public static int ulManifestPathLength$get(MemorySegment seg, long index) {
        return (int)_ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.ulManifestPathLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ulManifestPathLength$set(MemorySegment seg, long index, int x) {
        _ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.ulManifestPathLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment liManifestLastWriteTime$slice(MemorySegment seg) {
        return seg.asSlice(16, 8);
    }
    static final VarHandle ulPolicyPathType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ulPolicyPathType"));
    public static VarHandle ulPolicyPathType$VH() {
        return _ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.ulPolicyPathType$VH;
    }
    public static int ulPolicyPathType$get(MemorySegment seg) {
        return (int)_ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.ulPolicyPathType$VH.get(seg);
    }
    public static void ulPolicyPathType$set( MemorySegment seg, int x) {
        _ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.ulPolicyPathType$VH.set(seg, x);
    }
    public static int ulPolicyPathType$get(MemorySegment seg, long index) {
        return (int)_ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.ulPolicyPathType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ulPolicyPathType$set(MemorySegment seg, long index, int x) {
        _ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.ulPolicyPathType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ulPolicyPathLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ulPolicyPathLength"));
    public static VarHandle ulPolicyPathLength$VH() {
        return _ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.ulPolicyPathLength$VH;
    }
    public static int ulPolicyPathLength$get(MemorySegment seg) {
        return (int)_ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.ulPolicyPathLength$VH.get(seg);
    }
    public static void ulPolicyPathLength$set( MemorySegment seg, int x) {
        _ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.ulPolicyPathLength$VH.set(seg, x);
    }
    public static int ulPolicyPathLength$get(MemorySegment seg, long index) {
        return (int)_ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.ulPolicyPathLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ulPolicyPathLength$set(MemorySegment seg, long index, int x) {
        _ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.ulPolicyPathLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment liPolicyLastWriteTime$slice(MemorySegment seg) {
        return seg.asSlice(32, 8);
    }
    static final VarHandle ulMetadataSatelliteRosterIndex$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ulMetadataSatelliteRosterIndex"));
    public static VarHandle ulMetadataSatelliteRosterIndex$VH() {
        return _ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.ulMetadataSatelliteRosterIndex$VH;
    }
    public static int ulMetadataSatelliteRosterIndex$get(MemorySegment seg) {
        return (int)_ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.ulMetadataSatelliteRosterIndex$VH.get(seg);
    }
    public static void ulMetadataSatelliteRosterIndex$set( MemorySegment seg, int x) {
        _ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.ulMetadataSatelliteRosterIndex$VH.set(seg, x);
    }
    public static int ulMetadataSatelliteRosterIndex$get(MemorySegment seg, long index) {
        return (int)_ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.ulMetadataSatelliteRosterIndex$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ulMetadataSatelliteRosterIndex$set(MemorySegment seg, long index, int x) {
        _ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.ulMetadataSatelliteRosterIndex$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ulManifestVersionMajor$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ulManifestVersionMajor"));
    public static VarHandle ulManifestVersionMajor$VH() {
        return _ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.ulManifestVersionMajor$VH;
    }
    public static int ulManifestVersionMajor$get(MemorySegment seg) {
        return (int)_ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.ulManifestVersionMajor$VH.get(seg);
    }
    public static void ulManifestVersionMajor$set( MemorySegment seg, int x) {
        _ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.ulManifestVersionMajor$VH.set(seg, x);
    }
    public static int ulManifestVersionMajor$get(MemorySegment seg, long index) {
        return (int)_ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.ulManifestVersionMajor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ulManifestVersionMajor$set(MemorySegment seg, long index, int x) {
        _ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.ulManifestVersionMajor$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ulManifestVersionMinor$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ulManifestVersionMinor"));
    public static VarHandle ulManifestVersionMinor$VH() {
        return _ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.ulManifestVersionMinor$VH;
    }
    public static int ulManifestVersionMinor$get(MemorySegment seg) {
        return (int)_ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.ulManifestVersionMinor$VH.get(seg);
    }
    public static void ulManifestVersionMinor$set( MemorySegment seg, int x) {
        _ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.ulManifestVersionMinor$VH.set(seg, x);
    }
    public static int ulManifestVersionMinor$get(MemorySegment seg, long index) {
        return (int)_ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.ulManifestVersionMinor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ulManifestVersionMinor$set(MemorySegment seg, long index, int x) {
        _ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.ulManifestVersionMinor$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ulPolicyVersionMajor$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ulPolicyVersionMajor"));
    public static VarHandle ulPolicyVersionMajor$VH() {
        return _ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.ulPolicyVersionMajor$VH;
    }
    public static int ulPolicyVersionMajor$get(MemorySegment seg) {
        return (int)_ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.ulPolicyVersionMajor$VH.get(seg);
    }
    public static void ulPolicyVersionMajor$set( MemorySegment seg, int x) {
        _ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.ulPolicyVersionMajor$VH.set(seg, x);
    }
    public static int ulPolicyVersionMajor$get(MemorySegment seg, long index) {
        return (int)_ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.ulPolicyVersionMajor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ulPolicyVersionMajor$set(MemorySegment seg, long index, int x) {
        _ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.ulPolicyVersionMajor$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ulPolicyVersionMinor$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ulPolicyVersionMinor"));
    public static VarHandle ulPolicyVersionMinor$VH() {
        return _ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.ulPolicyVersionMinor$VH;
    }
    public static int ulPolicyVersionMinor$get(MemorySegment seg) {
        return (int)_ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.ulPolicyVersionMinor$VH.get(seg);
    }
    public static void ulPolicyVersionMinor$set( MemorySegment seg, int x) {
        _ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.ulPolicyVersionMinor$VH.set(seg, x);
    }
    public static int ulPolicyVersionMinor$get(MemorySegment seg, long index) {
        return (int)_ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.ulPolicyVersionMinor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ulPolicyVersionMinor$set(MemorySegment seg, long index, int x) {
        _ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.ulPolicyVersionMinor$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ulAssemblyDirectoryNameLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ulAssemblyDirectoryNameLength"));
    public static VarHandle ulAssemblyDirectoryNameLength$VH() {
        return _ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.ulAssemblyDirectoryNameLength$VH;
    }
    public static int ulAssemblyDirectoryNameLength$get(MemorySegment seg) {
        return (int)_ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.ulAssemblyDirectoryNameLength$VH.get(seg);
    }
    public static void ulAssemblyDirectoryNameLength$set( MemorySegment seg, int x) {
        _ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.ulAssemblyDirectoryNameLength$VH.set(seg, x);
    }
    public static int ulAssemblyDirectoryNameLength$get(MemorySegment seg, long index) {
        return (int)_ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.ulAssemblyDirectoryNameLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ulAssemblyDirectoryNameLength$set(MemorySegment seg, long index, int x) {
        _ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.ulAssemblyDirectoryNameLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpAssemblyEncodedAssemblyIdentity$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpAssemblyEncodedAssemblyIdentity"));
    public static VarHandle lpAssemblyEncodedAssemblyIdentity$VH() {
        return _ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.lpAssemblyEncodedAssemblyIdentity$VH;
    }
    public static MemoryAddress lpAssemblyEncodedAssemblyIdentity$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.lpAssemblyEncodedAssemblyIdentity$VH.get(seg);
    }
    public static void lpAssemblyEncodedAssemblyIdentity$set( MemorySegment seg, MemoryAddress x) {
        _ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.lpAssemblyEncodedAssemblyIdentity$VH.set(seg, x);
    }
    public static MemoryAddress lpAssemblyEncodedAssemblyIdentity$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.lpAssemblyEncodedAssemblyIdentity$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpAssemblyEncodedAssemblyIdentity$set(MemorySegment seg, long index, MemoryAddress x) {
        _ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.lpAssemblyEncodedAssemblyIdentity$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpAssemblyManifestPath$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpAssemblyManifestPath"));
    public static VarHandle lpAssemblyManifestPath$VH() {
        return _ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.lpAssemblyManifestPath$VH;
    }
    public static MemoryAddress lpAssemblyManifestPath$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.lpAssemblyManifestPath$VH.get(seg);
    }
    public static void lpAssemblyManifestPath$set( MemorySegment seg, MemoryAddress x) {
        _ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.lpAssemblyManifestPath$VH.set(seg, x);
    }
    public static MemoryAddress lpAssemblyManifestPath$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.lpAssemblyManifestPath$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpAssemblyManifestPath$set(MemorySegment seg, long index, MemoryAddress x) {
        _ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.lpAssemblyManifestPath$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpAssemblyPolicyPath$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpAssemblyPolicyPath"));
    public static VarHandle lpAssemblyPolicyPath$VH() {
        return _ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.lpAssemblyPolicyPath$VH;
    }
    public static MemoryAddress lpAssemblyPolicyPath$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.lpAssemblyPolicyPath$VH.get(seg);
    }
    public static void lpAssemblyPolicyPath$set( MemorySegment seg, MemoryAddress x) {
        _ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.lpAssemblyPolicyPath$VH.set(seg, x);
    }
    public static MemoryAddress lpAssemblyPolicyPath$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.lpAssemblyPolicyPath$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpAssemblyPolicyPath$set(MemorySegment seg, long index, MemoryAddress x) {
        _ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.lpAssemblyPolicyPath$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpAssemblyDirectoryName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpAssemblyDirectoryName"));
    public static VarHandle lpAssemblyDirectoryName$VH() {
        return _ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.lpAssemblyDirectoryName$VH;
    }
    public static MemoryAddress lpAssemblyDirectoryName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.lpAssemblyDirectoryName$VH.get(seg);
    }
    public static void lpAssemblyDirectoryName$set( MemorySegment seg, MemoryAddress x) {
        _ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.lpAssemblyDirectoryName$VH.set(seg, x);
    }
    public static MemoryAddress lpAssemblyDirectoryName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.lpAssemblyDirectoryName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpAssemblyDirectoryName$set(MemorySegment seg, long index, MemoryAddress x) {
        _ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.lpAssemblyDirectoryName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ulFileCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ulFileCount"));
    public static VarHandle ulFileCount$VH() {
        return _ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.ulFileCount$VH;
    }
    public static int ulFileCount$get(MemorySegment seg) {
        return (int)_ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.ulFileCount$VH.get(seg);
    }
    public static void ulFileCount$set( MemorySegment seg, int x) {
        _ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.ulFileCount$VH.set(seg, x);
    }
    public static int ulFileCount$get(MemorySegment seg, long index) {
        return (int)_ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.ulFileCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ulFileCount$set(MemorySegment seg, long index, int x) {
        _ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION.ulFileCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


