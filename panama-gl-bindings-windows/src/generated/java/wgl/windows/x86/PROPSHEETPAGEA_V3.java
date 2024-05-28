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
 * typedef struct _PROPSHEETPAGEA_V3 {
 *     DWORD dwSize;
 *     DWORD dwFlags;
 *     HINSTANCE hInstance;
 *     union {
 *         LPCSTR pszTemplate;
 *         PROPSHEETPAGE_RESOURCE pResource;
 *     };
 *     union {
 *         HICON hIcon;
 *         LPCSTR pszIcon;
 *     };
 *     LPCSTR pszTitle;
 *     DLGPROC pfnDlgProc;
 *     LPARAM lParam;
 *     LPFNPSPCALLBACKA pfnCallback;
 *     UINT *pcRefParent;
 *     LPCSTR pszHeaderTitle;
 *     LPCSTR pszHeaderSubTitle;
 *     HANDLE hActCtx;
 * } PROPSHEETPAGEA_V3
 * }
 */
public class PROPSHEETPAGEA_V3 extends _PROPSHEETPAGEA_V3 {

    PROPSHEETPAGEA_V3() {
        // Should not be called directly
    }
}

