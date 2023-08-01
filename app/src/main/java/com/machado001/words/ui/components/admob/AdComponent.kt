import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdSize
import com.google.android.gms.ads.AdView
import com.machado001.words.R
import ir.kaaveh.sdpcompose.sdp

@Composable
fun AdComponent(modifier: Modifier = Modifier) {
    val currentWidth = LocalConfiguration.current.screenWidthDp
    Box(modifier = modifier.sizeIn(maxWidth = currentWidth.dp, maxHeight = 60.sdp)) {
        AndroidView(factory = {
            AdView(it).apply {
                setAdSize(
                    AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(
                        context,
                        currentWidth
                    )
                )
                adUnitId = context.getString(R.string.AD_UNIT_ID_TEST)
                loadAd(AdRequest.Builder().build())
            }
        })
    }
}