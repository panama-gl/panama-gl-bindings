// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct IInternetHostSecurityManagerVtbl {
 *     HRESULT (*QueryInterface)(IInternetHostSecurityManager *, const IID *const, void **) __attribute__((stdcall));
 *     ULONG (*AddRef)(IInternetHostSecurityManager *) __attribute__((stdcall));
 *     ULONG (*Release)(IInternetHostSecurityManager *) __attribute__((stdcall));
 *     HRESULT (*GetSecurityId)(IInternetHostSecurityManager *, BYTE *, DWORD *, DWORD_PTR) __attribute__((stdcall));
 *     HRESULT (*ProcessUrlAction)(IInternetHostSecurityManager *, DWORD, BYTE *, DWORD, BYTE *, DWORD, DWORD, DWORD) __attribute__((stdcall));
 *     HRESULT (*QueryCustomPolicy)(IInternetHostSecurityManager *, const GUID *const, BYTE **, DWORD *, BYTE *, DWORD, DWORD) __attribute__((stdcall));
 * }
 * }
 */
public class IInternetHostSecurityManagerVtbl {

    IInternetHostSecurityManagerVtbl() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_POINTER.withName("QueryInterface"),
        wgl_h.C_POINTER.withName("AddRef"),
        wgl_h.C_POINTER.withName("Release"),
        wgl_h.C_POINTER.withName("GetSecurityId"),
        wgl_h.C_POINTER.withName("ProcessUrlAction"),
        wgl_h.C_POINTER.withName("QueryCustomPolicy")
    ).withName("IInternetHostSecurityManagerVtbl");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    /**
     * {@snippet lang=c :
     * HRESULT (*QueryInterface)(IInternetHostSecurityManager *, const IID *const, void **) __attribute__((stdcall))
     * }
     */
    public static class QueryInterface {

        QueryInterface() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            int apply(MemorySegment _x0, MemorySegment _x1, MemorySegment _x2);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            wgl_h.C_LONG,
            wgl_h.C_POINTER,
            wgl_h.C_POINTER,
            wgl_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = wgl_h.upcallHandle(QueryInterface.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(QueryInterface.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static int invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1, MemorySegment _x2) {
            try {
                return (int) DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout QueryInterface$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("QueryInterface"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HRESULT (*QueryInterface)(IInternetHostSecurityManager *, const IID *const, void **) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout QueryInterface$layout() {
        return QueryInterface$LAYOUT;
    }

    private static final long QueryInterface$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HRESULT (*QueryInterface)(IInternetHostSecurityManager *, const IID *const, void **) __attribute__((stdcall))
     * }
     */
    public static final long QueryInterface$offset() {
        return QueryInterface$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HRESULT (*QueryInterface)(IInternetHostSecurityManager *, const IID *const, void **) __attribute__((stdcall))
     * }
     */
    public static MemorySegment QueryInterface(MemorySegment struct) {
        return struct.get(QueryInterface$LAYOUT, QueryInterface$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HRESULT (*QueryInterface)(IInternetHostSecurityManager *, const IID *const, void **) __attribute__((stdcall))
     * }
     */
    public static void QueryInterface(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(QueryInterface$LAYOUT, QueryInterface$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * ULONG (*AddRef)(IInternetHostSecurityManager *) __attribute__((stdcall))
     * }
     */
    public static class AddRef {

        AddRef() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            int apply(MemorySegment _x0);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            wgl_h.C_LONG,
            wgl_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = wgl_h.upcallHandle(AddRef.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(AddRef.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static int invoke(MemorySegment funcPtr,MemorySegment _x0) {
            try {
                return (int) DOWN$MH.invokeExact(funcPtr, _x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout AddRef$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("AddRef"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG (*AddRef)(IInternetHostSecurityManager *) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout AddRef$layout() {
        return AddRef$LAYOUT;
    }

    private static final long AddRef$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG (*AddRef)(IInternetHostSecurityManager *) __attribute__((stdcall))
     * }
     */
    public static final long AddRef$offset() {
        return AddRef$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG (*AddRef)(IInternetHostSecurityManager *) __attribute__((stdcall))
     * }
     */
    public static MemorySegment AddRef(MemorySegment struct) {
        return struct.get(AddRef$LAYOUT, AddRef$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG (*AddRef)(IInternetHostSecurityManager *) __attribute__((stdcall))
     * }
     */
    public static void AddRef(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(AddRef$LAYOUT, AddRef$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * ULONG (*Release)(IInternetHostSecurityManager *) __attribute__((stdcall))
     * }
     */
    public static class Release {

        Release() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            int apply(MemorySegment _x0);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            wgl_h.C_LONG,
            wgl_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = wgl_h.upcallHandle(Release.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(Release.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static int invoke(MemorySegment funcPtr,MemorySegment _x0) {
            try {
                return (int) DOWN$MH.invokeExact(funcPtr, _x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout Release$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("Release"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG (*Release)(IInternetHostSecurityManager *) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout Release$layout() {
        return Release$LAYOUT;
    }

    private static final long Release$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG (*Release)(IInternetHostSecurityManager *) __attribute__((stdcall))
     * }
     */
    public static final long Release$offset() {
        return Release$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG (*Release)(IInternetHostSecurityManager *) __attribute__((stdcall))
     * }
     */
    public static MemorySegment Release(MemorySegment struct) {
        return struct.get(Release$LAYOUT, Release$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG (*Release)(IInternetHostSecurityManager *) __attribute__((stdcall))
     * }
     */
    public static void Release(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(Release$LAYOUT, Release$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * HRESULT (*GetSecurityId)(IInternetHostSecurityManager *, BYTE *, DWORD *, DWORD_PTR) __attribute__((stdcall))
     * }
     */
    public static class GetSecurityId {

        GetSecurityId() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            int apply(MemorySegment _x0, MemorySegment _x1, MemorySegment _x2, long _x3);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            wgl_h.C_LONG,
            wgl_h.C_POINTER,
            wgl_h.C_POINTER,
            wgl_h.C_POINTER,
            wgl_h.C_LONG_LONG
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = wgl_h.upcallHandle(GetSecurityId.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(GetSecurityId.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static int invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1, MemorySegment _x2, long _x3) {
            try {
                return (int) DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2, _x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout GetSecurityId$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("GetSecurityId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HRESULT (*GetSecurityId)(IInternetHostSecurityManager *, BYTE *, DWORD *, DWORD_PTR) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout GetSecurityId$layout() {
        return GetSecurityId$LAYOUT;
    }

    private static final long GetSecurityId$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HRESULT (*GetSecurityId)(IInternetHostSecurityManager *, BYTE *, DWORD *, DWORD_PTR) __attribute__((stdcall))
     * }
     */
    public static final long GetSecurityId$offset() {
        return GetSecurityId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HRESULT (*GetSecurityId)(IInternetHostSecurityManager *, BYTE *, DWORD *, DWORD_PTR) __attribute__((stdcall))
     * }
     */
    public static MemorySegment GetSecurityId(MemorySegment struct) {
        return struct.get(GetSecurityId$LAYOUT, GetSecurityId$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HRESULT (*GetSecurityId)(IInternetHostSecurityManager *, BYTE *, DWORD *, DWORD_PTR) __attribute__((stdcall))
     * }
     */
    public static void GetSecurityId(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(GetSecurityId$LAYOUT, GetSecurityId$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * HRESULT (*ProcessUrlAction)(IInternetHostSecurityManager *, DWORD, BYTE *, DWORD, BYTE *, DWORD, DWORD, DWORD) __attribute__((stdcall))
     * }
     */
    public static class ProcessUrlAction {

        ProcessUrlAction() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            int apply(MemorySegment _x0, int _x1, MemorySegment _x2, int _x3, MemorySegment _x4, int _x5, int _x6, int _x7);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            wgl_h.C_LONG,
            wgl_h.C_POINTER,
            wgl_h.C_LONG,
            wgl_h.C_POINTER,
            wgl_h.C_LONG,
            wgl_h.C_POINTER,
            wgl_h.C_LONG,
            wgl_h.C_LONG,
            wgl_h.C_LONG
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = wgl_h.upcallHandle(ProcessUrlAction.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(ProcessUrlAction.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static int invoke(MemorySegment funcPtr,MemorySegment _x0, int _x1, MemorySegment _x2, int _x3, MemorySegment _x4, int _x5, int _x6, int _x7) {
            try {
                return (int) DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2, _x3, _x4, _x5, _x6, _x7);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout ProcessUrlAction$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("ProcessUrlAction"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HRESULT (*ProcessUrlAction)(IInternetHostSecurityManager *, DWORD, BYTE *, DWORD, BYTE *, DWORD, DWORD, DWORD) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout ProcessUrlAction$layout() {
        return ProcessUrlAction$LAYOUT;
    }

    private static final long ProcessUrlAction$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HRESULT (*ProcessUrlAction)(IInternetHostSecurityManager *, DWORD, BYTE *, DWORD, BYTE *, DWORD, DWORD, DWORD) __attribute__((stdcall))
     * }
     */
    public static final long ProcessUrlAction$offset() {
        return ProcessUrlAction$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HRESULT (*ProcessUrlAction)(IInternetHostSecurityManager *, DWORD, BYTE *, DWORD, BYTE *, DWORD, DWORD, DWORD) __attribute__((stdcall))
     * }
     */
    public static MemorySegment ProcessUrlAction(MemorySegment struct) {
        return struct.get(ProcessUrlAction$LAYOUT, ProcessUrlAction$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HRESULT (*ProcessUrlAction)(IInternetHostSecurityManager *, DWORD, BYTE *, DWORD, BYTE *, DWORD, DWORD, DWORD) __attribute__((stdcall))
     * }
     */
    public static void ProcessUrlAction(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(ProcessUrlAction$LAYOUT, ProcessUrlAction$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * HRESULT (*QueryCustomPolicy)(IInternetHostSecurityManager *, const GUID *const, BYTE **, DWORD *, BYTE *, DWORD, DWORD) __attribute__((stdcall))
     * }
     */
    public static class QueryCustomPolicy {

        QueryCustomPolicy() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            int apply(MemorySegment _x0, MemorySegment _x1, MemorySegment _x2, MemorySegment _x3, MemorySegment _x4, int _x5, int _x6);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            wgl_h.C_LONG,
            wgl_h.C_POINTER,
            wgl_h.C_POINTER,
            wgl_h.C_POINTER,
            wgl_h.C_POINTER,
            wgl_h.C_POINTER,
            wgl_h.C_LONG,
            wgl_h.C_LONG
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = wgl_h.upcallHandle(QueryCustomPolicy.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(QueryCustomPolicy.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static int invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1, MemorySegment _x2, MemorySegment _x3, MemorySegment _x4, int _x5, int _x6) {
            try {
                return (int) DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2, _x3, _x4, _x5, _x6);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout QueryCustomPolicy$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("QueryCustomPolicy"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HRESULT (*QueryCustomPolicy)(IInternetHostSecurityManager *, const GUID *const, BYTE **, DWORD *, BYTE *, DWORD, DWORD) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout QueryCustomPolicy$layout() {
        return QueryCustomPolicy$LAYOUT;
    }

    private static final long QueryCustomPolicy$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HRESULT (*QueryCustomPolicy)(IInternetHostSecurityManager *, const GUID *const, BYTE **, DWORD *, BYTE *, DWORD, DWORD) __attribute__((stdcall))
     * }
     */
    public static final long QueryCustomPolicy$offset() {
        return QueryCustomPolicy$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HRESULT (*QueryCustomPolicy)(IInternetHostSecurityManager *, const GUID *const, BYTE **, DWORD *, BYTE *, DWORD, DWORD) __attribute__((stdcall))
     * }
     */
    public static MemorySegment QueryCustomPolicy(MemorySegment struct) {
        return struct.get(QueryCustomPolicy$LAYOUT, QueryCustomPolicy$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HRESULT (*QueryCustomPolicy)(IInternetHostSecurityManager *, const GUID *const, BYTE **, DWORD *, BYTE *, DWORD, DWORD) __attribute__((stdcall))
     * }
     */
    public static void QueryCustomPolicy(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(QueryCustomPolicy$LAYOUT, QueryCustomPolicy$OFFSET, fieldValue);
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}

