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
 * typedef struct _PROPSHEETPAGEW {
 *     DWORD dwSize;
 *     DWORD dwFlags;
 *     HINSTANCE hInstance;
 *     union {
 *         LPCWSTR pszTemplate;
 *         PROPSHEETPAGE_RESOURCE pResource;
 *     };
 *     union {
 *         HICON hIcon;
 *         LPCWSTR pszIcon;
 *     };
 *     LPCWSTR pszTitle;
 *     DLGPROC pfnDlgProc;
 *     LPARAM lParam;
 *     LPFNPSPCALLBACKW pfnCallback;
 *     UINT *pcRefParent;
 *     LPCWSTR pszHeaderTitle;
 *     LPCWSTR pszHeaderSubTitle;
 *     HANDLE hActCtx;
 *     union {
 *         HBITMAP hbmHeader;
 *         LPCWSTR pszbmHeader;
 *     };
 * } PROPSHEETPAGEW_V4
 * }
 */
public class PROPSHEETPAGEW_V4 extends _PROPSHEETPAGEW {

    PROPSHEETPAGEW_V4() {
        // Should not be called directly
    }
}

