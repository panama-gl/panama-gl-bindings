// Generated by jextract

package freeglut.windows.x86;

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
 * struct _DEBUG_EVENT {
 *     DWORD dwDebugEventCode;
 *     DWORD dwProcessId;
 *     DWORD dwThreadId;
 *     union {
 *         EXCEPTION_DEBUG_INFO Exception;
 *         CREATE_THREAD_DEBUG_INFO CreateThread;
 *         CREATE_PROCESS_DEBUG_INFO CreateProcessInfo;
 *         EXIT_THREAD_DEBUG_INFO ExitThread;
 *         EXIT_PROCESS_DEBUG_INFO ExitProcess;
 *         LOAD_DLL_DEBUG_INFO LoadDll;
 *         UNLOAD_DLL_DEBUG_INFO UnloadDll;
 *         OUTPUT_DEBUG_STRING_INFO DebugString;
 *         RIP_INFO RipInfo;
 *     } u;
 * }
 * }
 */
public class _DEBUG_EVENT {

    _DEBUG_EVENT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        freeglut_h.C_LONG.withName("dwDebugEventCode"),
        freeglut_h.C_LONG.withName("dwProcessId"),
        freeglut_h.C_LONG.withName("dwThreadId"),
        MemoryLayout.paddingLayout(4),
        _DEBUG_EVENT.u.layout().withName("u")
    ).withName("_DEBUG_EVENT");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt dwDebugEventCode$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwDebugEventCode"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwDebugEventCode
     * }
     */
    public static final OfInt dwDebugEventCode$layout() {
        return dwDebugEventCode$LAYOUT;
    }

    private static final long dwDebugEventCode$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwDebugEventCode
     * }
     */
    public static final long dwDebugEventCode$offset() {
        return dwDebugEventCode$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwDebugEventCode
     * }
     */
    public static int dwDebugEventCode(MemorySegment struct) {
        return struct.get(dwDebugEventCode$LAYOUT, dwDebugEventCode$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwDebugEventCode
     * }
     */
    public static void dwDebugEventCode(MemorySegment struct, int fieldValue) {
        struct.set(dwDebugEventCode$LAYOUT, dwDebugEventCode$OFFSET, fieldValue);
    }

    private static final OfInt dwProcessId$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwProcessId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwProcessId
     * }
     */
    public static final OfInt dwProcessId$layout() {
        return dwProcessId$LAYOUT;
    }

    private static final long dwProcessId$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwProcessId
     * }
     */
    public static final long dwProcessId$offset() {
        return dwProcessId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwProcessId
     * }
     */
    public static int dwProcessId(MemorySegment struct) {
        return struct.get(dwProcessId$LAYOUT, dwProcessId$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwProcessId
     * }
     */
    public static void dwProcessId(MemorySegment struct, int fieldValue) {
        struct.set(dwProcessId$LAYOUT, dwProcessId$OFFSET, fieldValue);
    }

    private static final OfInt dwThreadId$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwThreadId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwThreadId
     * }
     */
    public static final OfInt dwThreadId$layout() {
        return dwThreadId$LAYOUT;
    }

    private static final long dwThreadId$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwThreadId
     * }
     */
    public static final long dwThreadId$offset() {
        return dwThreadId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwThreadId
     * }
     */
    public static int dwThreadId(MemorySegment struct) {
        return struct.get(dwThreadId$LAYOUT, dwThreadId$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwThreadId
     * }
     */
    public static void dwThreadId(MemorySegment struct, int fieldValue) {
        struct.set(dwThreadId$LAYOUT, dwThreadId$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * union {
     *     EXCEPTION_DEBUG_INFO Exception;
     *     CREATE_THREAD_DEBUG_INFO CreateThread;
     *     CREATE_PROCESS_DEBUG_INFO CreateProcessInfo;
     *     EXIT_THREAD_DEBUG_INFO ExitThread;
     *     EXIT_PROCESS_DEBUG_INFO ExitProcess;
     *     LOAD_DLL_DEBUG_INFO LoadDll;
     *     UNLOAD_DLL_DEBUG_INFO UnloadDll;
     *     OUTPUT_DEBUG_STRING_INFO DebugString;
     *     RIP_INFO RipInfo;
     * }
     * }
     */
    public static class u {

        u() {
            // Should not be called directly
        }

        private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout(
            _EXCEPTION_DEBUG_INFO.layout().withName("Exception"),
            _CREATE_THREAD_DEBUG_INFO.layout().withName("CreateThread"),
            _CREATE_PROCESS_DEBUG_INFO.layout().withName("CreateProcessInfo"),
            _EXIT_THREAD_DEBUG_INFO.layout().withName("ExitThread"),
            _EXIT_PROCESS_DEBUG_INFO.layout().withName("ExitProcess"),
            _LOAD_DLL_DEBUG_INFO.layout().withName("LoadDll"),
            _UNLOAD_DLL_DEBUG_INFO.layout().withName("UnloadDll"),
            _OUTPUT_DEBUG_STRING_INFO.layout().withName("DebugString"),
            _RIP_INFO.layout().withName("RipInfo")
        ).withName("$anon$365:5");

        /**
         * The layout of this union
         */
        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        private static final GroupLayout Exception$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("Exception"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * EXCEPTION_DEBUG_INFO Exception
         * }
         */
        public static final GroupLayout Exception$layout() {
            return Exception$LAYOUT;
        }

        private static final long Exception$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * EXCEPTION_DEBUG_INFO Exception
         * }
         */
        public static final long Exception$offset() {
            return Exception$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * EXCEPTION_DEBUG_INFO Exception
         * }
         */
        public static MemorySegment Exception(MemorySegment union) {
            return union.asSlice(Exception$OFFSET, Exception$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * EXCEPTION_DEBUG_INFO Exception
         * }
         */
        public static void Exception(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, union, Exception$OFFSET, Exception$LAYOUT.byteSize());
        }

        private static final GroupLayout CreateThread$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("CreateThread"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * CREATE_THREAD_DEBUG_INFO CreateThread
         * }
         */
        public static final GroupLayout CreateThread$layout() {
            return CreateThread$LAYOUT;
        }

        private static final long CreateThread$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * CREATE_THREAD_DEBUG_INFO CreateThread
         * }
         */
        public static final long CreateThread$offset() {
            return CreateThread$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * CREATE_THREAD_DEBUG_INFO CreateThread
         * }
         */
        public static MemorySegment CreateThread(MemorySegment union) {
            return union.asSlice(CreateThread$OFFSET, CreateThread$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * CREATE_THREAD_DEBUG_INFO CreateThread
         * }
         */
        public static void CreateThread(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, union, CreateThread$OFFSET, CreateThread$LAYOUT.byteSize());
        }

        private static final GroupLayout CreateProcessInfo$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("CreateProcessInfo"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * CREATE_PROCESS_DEBUG_INFO CreateProcessInfo
         * }
         */
        public static final GroupLayout CreateProcessInfo$layout() {
            return CreateProcessInfo$LAYOUT;
        }

        private static final long CreateProcessInfo$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * CREATE_PROCESS_DEBUG_INFO CreateProcessInfo
         * }
         */
        public static final long CreateProcessInfo$offset() {
            return CreateProcessInfo$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * CREATE_PROCESS_DEBUG_INFO CreateProcessInfo
         * }
         */
        public static MemorySegment CreateProcessInfo(MemorySegment union) {
            return union.asSlice(CreateProcessInfo$OFFSET, CreateProcessInfo$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * CREATE_PROCESS_DEBUG_INFO CreateProcessInfo
         * }
         */
        public static void CreateProcessInfo(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, union, CreateProcessInfo$OFFSET, CreateProcessInfo$LAYOUT.byteSize());
        }

        private static final GroupLayout ExitThread$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("ExitThread"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * EXIT_THREAD_DEBUG_INFO ExitThread
         * }
         */
        public static final GroupLayout ExitThread$layout() {
            return ExitThread$LAYOUT;
        }

        private static final long ExitThread$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * EXIT_THREAD_DEBUG_INFO ExitThread
         * }
         */
        public static final long ExitThread$offset() {
            return ExitThread$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * EXIT_THREAD_DEBUG_INFO ExitThread
         * }
         */
        public static MemorySegment ExitThread(MemorySegment union) {
            return union.asSlice(ExitThread$OFFSET, ExitThread$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * EXIT_THREAD_DEBUG_INFO ExitThread
         * }
         */
        public static void ExitThread(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, union, ExitThread$OFFSET, ExitThread$LAYOUT.byteSize());
        }

        private static final GroupLayout ExitProcess$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("ExitProcess"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * EXIT_PROCESS_DEBUG_INFO ExitProcess
         * }
         */
        public static final GroupLayout ExitProcess$layout() {
            return ExitProcess$LAYOUT;
        }

        private static final long ExitProcess$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * EXIT_PROCESS_DEBUG_INFO ExitProcess
         * }
         */
        public static final long ExitProcess$offset() {
            return ExitProcess$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * EXIT_PROCESS_DEBUG_INFO ExitProcess
         * }
         */
        public static MemorySegment ExitProcess(MemorySegment union) {
            return union.asSlice(ExitProcess$OFFSET, ExitProcess$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * EXIT_PROCESS_DEBUG_INFO ExitProcess
         * }
         */
        public static void ExitProcess(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, union, ExitProcess$OFFSET, ExitProcess$LAYOUT.byteSize());
        }

        private static final GroupLayout LoadDll$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("LoadDll"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * LOAD_DLL_DEBUG_INFO LoadDll
         * }
         */
        public static final GroupLayout LoadDll$layout() {
            return LoadDll$LAYOUT;
        }

        private static final long LoadDll$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * LOAD_DLL_DEBUG_INFO LoadDll
         * }
         */
        public static final long LoadDll$offset() {
            return LoadDll$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * LOAD_DLL_DEBUG_INFO LoadDll
         * }
         */
        public static MemorySegment LoadDll(MemorySegment union) {
            return union.asSlice(LoadDll$OFFSET, LoadDll$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * LOAD_DLL_DEBUG_INFO LoadDll
         * }
         */
        public static void LoadDll(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, union, LoadDll$OFFSET, LoadDll$LAYOUT.byteSize());
        }

        private static final GroupLayout UnloadDll$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("UnloadDll"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * UNLOAD_DLL_DEBUG_INFO UnloadDll
         * }
         */
        public static final GroupLayout UnloadDll$layout() {
            return UnloadDll$LAYOUT;
        }

        private static final long UnloadDll$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * UNLOAD_DLL_DEBUG_INFO UnloadDll
         * }
         */
        public static final long UnloadDll$offset() {
            return UnloadDll$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * UNLOAD_DLL_DEBUG_INFO UnloadDll
         * }
         */
        public static MemorySegment UnloadDll(MemorySegment union) {
            return union.asSlice(UnloadDll$OFFSET, UnloadDll$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * UNLOAD_DLL_DEBUG_INFO UnloadDll
         * }
         */
        public static void UnloadDll(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, union, UnloadDll$OFFSET, UnloadDll$LAYOUT.byteSize());
        }

        private static final GroupLayout DebugString$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("DebugString"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * OUTPUT_DEBUG_STRING_INFO DebugString
         * }
         */
        public static final GroupLayout DebugString$layout() {
            return DebugString$LAYOUT;
        }

        private static final long DebugString$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * OUTPUT_DEBUG_STRING_INFO DebugString
         * }
         */
        public static final long DebugString$offset() {
            return DebugString$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * OUTPUT_DEBUG_STRING_INFO DebugString
         * }
         */
        public static MemorySegment DebugString(MemorySegment union) {
            return union.asSlice(DebugString$OFFSET, DebugString$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * OUTPUT_DEBUG_STRING_INFO DebugString
         * }
         */
        public static void DebugString(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, union, DebugString$OFFSET, DebugString$LAYOUT.byteSize());
        }

        private static final GroupLayout RipInfo$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("RipInfo"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * RIP_INFO RipInfo
         * }
         */
        public static final GroupLayout RipInfo$layout() {
            return RipInfo$LAYOUT;
        }

        private static final long RipInfo$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * RIP_INFO RipInfo
         * }
         */
        public static final long RipInfo$offset() {
            return RipInfo$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * RIP_INFO RipInfo
         * }
         */
        public static MemorySegment RipInfo(MemorySegment union) {
            return union.asSlice(RipInfo$OFFSET, RipInfo$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * RIP_INFO RipInfo
         * }
         */
        public static void RipInfo(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, union, RipInfo$OFFSET, RipInfo$LAYOUT.byteSize());
        }

        /**
         * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
         * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
         */
        public static MemorySegment asSlice(MemorySegment array, long index) {
            return array.asSlice(layout().byteSize() * index);
        }

        /**
         * The size (in bytes) of this union
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

    private static final GroupLayout u$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("u"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * union {
     *     EXCEPTION_DEBUG_INFO Exception;
     *     CREATE_THREAD_DEBUG_INFO CreateThread;
     *     CREATE_PROCESS_DEBUG_INFO CreateProcessInfo;
     *     EXIT_THREAD_DEBUG_INFO ExitThread;
     *     EXIT_PROCESS_DEBUG_INFO ExitProcess;
     *     LOAD_DLL_DEBUG_INFO LoadDll;
     *     UNLOAD_DLL_DEBUG_INFO UnloadDll;
     *     OUTPUT_DEBUG_STRING_INFO DebugString;
     *     RIP_INFO RipInfo;
     * } u
     * }
     */
    public static final GroupLayout u$layout() {
        return u$LAYOUT;
    }

    private static final long u$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * union {
     *     EXCEPTION_DEBUG_INFO Exception;
     *     CREATE_THREAD_DEBUG_INFO CreateThread;
     *     CREATE_PROCESS_DEBUG_INFO CreateProcessInfo;
     *     EXIT_THREAD_DEBUG_INFO ExitThread;
     *     EXIT_PROCESS_DEBUG_INFO ExitProcess;
     *     LOAD_DLL_DEBUG_INFO LoadDll;
     *     UNLOAD_DLL_DEBUG_INFO UnloadDll;
     *     OUTPUT_DEBUG_STRING_INFO DebugString;
     *     RIP_INFO RipInfo;
     * } u
     * }
     */
    public static final long u$offset() {
        return u$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * union {
     *     EXCEPTION_DEBUG_INFO Exception;
     *     CREATE_THREAD_DEBUG_INFO CreateThread;
     *     CREATE_PROCESS_DEBUG_INFO CreateProcessInfo;
     *     EXIT_THREAD_DEBUG_INFO ExitThread;
     *     EXIT_PROCESS_DEBUG_INFO ExitProcess;
     *     LOAD_DLL_DEBUG_INFO LoadDll;
     *     UNLOAD_DLL_DEBUG_INFO UnloadDll;
     *     OUTPUT_DEBUG_STRING_INFO DebugString;
     *     RIP_INFO RipInfo;
     * } u
     * }
     */
    public static MemorySegment u(MemorySegment struct) {
        return struct.asSlice(u$OFFSET, u$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * union {
     *     EXCEPTION_DEBUG_INFO Exception;
     *     CREATE_THREAD_DEBUG_INFO CreateThread;
     *     CREATE_PROCESS_DEBUG_INFO CreateProcessInfo;
     *     EXIT_THREAD_DEBUG_INFO ExitThread;
     *     EXIT_PROCESS_DEBUG_INFO ExitProcess;
     *     LOAD_DLL_DEBUG_INFO LoadDll;
     *     UNLOAD_DLL_DEBUG_INFO UnloadDll;
     *     OUTPUT_DEBUG_STRING_INFO DebugString;
     *     RIP_INFO RipInfo;
     * } u
     * }
     */
    public static void u(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, u$OFFSET, u$LAYOUT.byteSize());
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

