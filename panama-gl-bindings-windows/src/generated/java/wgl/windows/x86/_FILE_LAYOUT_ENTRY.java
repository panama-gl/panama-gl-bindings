// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _FILE_LAYOUT_ENTRY {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        Constants$root.C_LONG$LAYOUT.withName("NextFileOffset"),
        Constants$root.C_LONG$LAYOUT.withName("Flags"),
        Constants$root.C_LONG$LAYOUT.withName("FileAttributes"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("FileReferenceNumber"),
        Constants$root.C_LONG$LAYOUT.withName("FirstNameOffset"),
        Constants$root.C_LONG$LAYOUT.withName("FirstStreamOffset"),
        Constants$root.C_LONG$LAYOUT.withName("ExtraInfoOffset"),
        Constants$root.C_LONG$LAYOUT.withName("ExtraInfoLength")
    ).withName("_FILE_LAYOUT_ENTRY");
    public static MemoryLayout $LAYOUT() {
        return _FILE_LAYOUT_ENTRY.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _FILE_LAYOUT_ENTRY.Version$VH;
    }
    public static int Version$get(MemorySegment seg) {
        return (int)_FILE_LAYOUT_ENTRY.Version$VH.get(seg);
    }
    public static void Version$set( MemorySegment seg, int x) {
        _FILE_LAYOUT_ENTRY.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_FILE_LAYOUT_ENTRY.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _FILE_LAYOUT_ENTRY.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NextFileOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NextFileOffset"));
    public static VarHandle NextFileOffset$VH() {
        return _FILE_LAYOUT_ENTRY.NextFileOffset$VH;
    }
    public static int NextFileOffset$get(MemorySegment seg) {
        return (int)_FILE_LAYOUT_ENTRY.NextFileOffset$VH.get(seg);
    }
    public static void NextFileOffset$set( MemorySegment seg, int x) {
        _FILE_LAYOUT_ENTRY.NextFileOffset$VH.set(seg, x);
    }
    public static int NextFileOffset$get(MemorySegment seg, long index) {
        return (int)_FILE_LAYOUT_ENTRY.NextFileOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NextFileOffset$set(MemorySegment seg, long index, int x) {
        _FILE_LAYOUT_ENTRY.NextFileOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _FILE_LAYOUT_ENTRY.Flags$VH;
    }
    public static int Flags$get(MemorySegment seg) {
        return (int)_FILE_LAYOUT_ENTRY.Flags$VH.get(seg);
    }
    public static void Flags$set( MemorySegment seg, int x) {
        _FILE_LAYOUT_ENTRY.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)_FILE_LAYOUT_ENTRY.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        _FILE_LAYOUT_ENTRY.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle FileAttributes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("FileAttributes"));
    public static VarHandle FileAttributes$VH() {
        return _FILE_LAYOUT_ENTRY.FileAttributes$VH;
    }
    public static int FileAttributes$get(MemorySegment seg) {
        return (int)_FILE_LAYOUT_ENTRY.FileAttributes$VH.get(seg);
    }
    public static void FileAttributes$set( MemorySegment seg, int x) {
        _FILE_LAYOUT_ENTRY.FileAttributes$VH.set(seg, x);
    }
    public static int FileAttributes$get(MemorySegment seg, long index) {
        return (int)_FILE_LAYOUT_ENTRY.FileAttributes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FileAttributes$set(MemorySegment seg, long index, int x) {
        _FILE_LAYOUT_ENTRY.FileAttributes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle FileReferenceNumber$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("FileReferenceNumber"));
    public static VarHandle FileReferenceNumber$VH() {
        return _FILE_LAYOUT_ENTRY.FileReferenceNumber$VH;
    }
    public static long FileReferenceNumber$get(MemorySegment seg) {
        return (long)_FILE_LAYOUT_ENTRY.FileReferenceNumber$VH.get(seg);
    }
    public static void FileReferenceNumber$set( MemorySegment seg, long x) {
        _FILE_LAYOUT_ENTRY.FileReferenceNumber$VH.set(seg, x);
    }
    public static long FileReferenceNumber$get(MemorySegment seg, long index) {
        return (long)_FILE_LAYOUT_ENTRY.FileReferenceNumber$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FileReferenceNumber$set(MemorySegment seg, long index, long x) {
        _FILE_LAYOUT_ENTRY.FileReferenceNumber$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle FirstNameOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("FirstNameOffset"));
    public static VarHandle FirstNameOffset$VH() {
        return _FILE_LAYOUT_ENTRY.FirstNameOffset$VH;
    }
    public static int FirstNameOffset$get(MemorySegment seg) {
        return (int)_FILE_LAYOUT_ENTRY.FirstNameOffset$VH.get(seg);
    }
    public static void FirstNameOffset$set( MemorySegment seg, int x) {
        _FILE_LAYOUT_ENTRY.FirstNameOffset$VH.set(seg, x);
    }
    public static int FirstNameOffset$get(MemorySegment seg, long index) {
        return (int)_FILE_LAYOUT_ENTRY.FirstNameOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FirstNameOffset$set(MemorySegment seg, long index, int x) {
        _FILE_LAYOUT_ENTRY.FirstNameOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle FirstStreamOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("FirstStreamOffset"));
    public static VarHandle FirstStreamOffset$VH() {
        return _FILE_LAYOUT_ENTRY.FirstStreamOffset$VH;
    }
    public static int FirstStreamOffset$get(MemorySegment seg) {
        return (int)_FILE_LAYOUT_ENTRY.FirstStreamOffset$VH.get(seg);
    }
    public static void FirstStreamOffset$set( MemorySegment seg, int x) {
        _FILE_LAYOUT_ENTRY.FirstStreamOffset$VH.set(seg, x);
    }
    public static int FirstStreamOffset$get(MemorySegment seg, long index) {
        return (int)_FILE_LAYOUT_ENTRY.FirstStreamOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FirstStreamOffset$set(MemorySegment seg, long index, int x) {
        _FILE_LAYOUT_ENTRY.FirstStreamOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ExtraInfoOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ExtraInfoOffset"));
    public static VarHandle ExtraInfoOffset$VH() {
        return _FILE_LAYOUT_ENTRY.ExtraInfoOffset$VH;
    }
    public static int ExtraInfoOffset$get(MemorySegment seg) {
        return (int)_FILE_LAYOUT_ENTRY.ExtraInfoOffset$VH.get(seg);
    }
    public static void ExtraInfoOffset$set( MemorySegment seg, int x) {
        _FILE_LAYOUT_ENTRY.ExtraInfoOffset$VH.set(seg, x);
    }
    public static int ExtraInfoOffset$get(MemorySegment seg, long index) {
        return (int)_FILE_LAYOUT_ENTRY.ExtraInfoOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ExtraInfoOffset$set(MemorySegment seg, long index, int x) {
        _FILE_LAYOUT_ENTRY.ExtraInfoOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ExtraInfoLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ExtraInfoLength"));
    public static VarHandle ExtraInfoLength$VH() {
        return _FILE_LAYOUT_ENTRY.ExtraInfoLength$VH;
    }
    public static int ExtraInfoLength$get(MemorySegment seg) {
        return (int)_FILE_LAYOUT_ENTRY.ExtraInfoLength$VH.get(seg);
    }
    public static void ExtraInfoLength$set( MemorySegment seg, int x) {
        _FILE_LAYOUT_ENTRY.ExtraInfoLength$VH.set(seg, x);
    }
    public static int ExtraInfoLength$get(MemorySegment seg, long index) {
        return (int)_FILE_LAYOUT_ENTRY.ExtraInfoLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ExtraInfoLength$set(MemorySegment seg, long index, int x) {
        _FILE_LAYOUT_ENTRY.ExtraInfoLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


