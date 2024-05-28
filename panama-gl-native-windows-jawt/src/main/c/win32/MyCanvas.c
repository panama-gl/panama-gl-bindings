#include "MyCanvas.h"
#include <jawt_md.h>
#include <assert.h>

// From Microsoft sample
#include <windows.h>
#include <d2d1.h>
#pragma comment(lib, "d2d1")
//#include "basewin.h"

JNIEXPORT void JNICALL
Java_MyCanvas_paint(JNIEnv* env, jobject canvas, jobject graphics)
{
    JAWT awt;
    JAWT_DrawingSurface* ds;
    JAWT_DrawingSurfaceInfo* dsi;
    JAWT_Win32DrawingSurfaceInfo* dsi_win;
    jboolean result;
    jint lock;

    // Get the AWT. Request version 9 to access features in that release.
    awt.version = JAWT_VERSION_9;
    result = JAWT_GetAWT(env, &awt);
    assert(result != JNI_FALSE);

    // Get the drawing surface
    ds = awt.GetDrawingSurface(env, canvas);
    assert(ds != NULL);

    // Lock the drawing surface
    lock = ds->Lock(ds);
    assert((lock & JAWT_LOCK_ERROR) == 0);

    // Get the drawing surface info
    dsi = ds->GetDrawingSurfaceInfo(ds);


	// Get the platform-specific drawing info
    dsi_win = (JAWT_Win32DrawingSurfaceInfo*)dsi->platformInfo;

    //////////////////////////////
    // !!! DO PAINTING HERE !!! //
    /*
    ID2D1Factory            *pFactory;
    ID2D1HwndRenderTarget   *pRenderTarget;
    ID2D1SolidColorBrush    *pBrush;
    D2D1_ELLIPSE            ellipse;

    RECT rc;
    GetClientRect(dsi_win->hwnd, &rc);
    D2D1_SIZE_U size = D2D1::SizeU(rc.right, rc.bottom);

    HRESULT hr = pFactory->CreateHwndRenderTarget(
            D2D1::RenderTargetProperties(),
            D2D1::HwndRenderTargetProperties(m_hwnd, size),
            &pRenderTarget);

    if (SUCCEEDED(hr))
    {
      const D2D1_COLOR_F color = D2D1::ColorF(1.0f, 1.0f, 0);
      hr = pRenderTarget->CreateSolidColorBrush(color, &pBrush);

      if (SUCCEEDED(hr))
      {
        if (pRenderTarget != NULL)
	    {
	        D2D1_SIZE_F size = pRenderTarget->GetSize();
	        const float x = size.width / 2;
	        const float y = size.height / 2;
	        const float radius = min(x, y);
	        ellipse = D2D1::Ellipse(D2D1::Point2F(x, y), radius, radius);
	    }
      }
    }
   */
    //////////////////////////////


    // Free the drawing surface info
    ds->FreeDrawingSurfaceInfo(dsi);

    // Unlock the drawing surface
    ds->Unlock(ds);

    // Free the drawing surface
    awt.FreeDrawingSurface(ds);
}
