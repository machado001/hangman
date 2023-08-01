package com.machado001.words.ui.screens.policy

import android.content.Intent
import android.net.Uri
import androidx.activity.ComponentActivity
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import com.machado001.words.R
import ir.kaaveh.sdpcompose.sdp


@Composable
fun PrivacyPolicyScreen(
    modifier: Modifier = Modifier,
    activity: ComponentActivity
) {
    val privacyPolicyUrl =
        "https://machado001.blogspot.com/2023/07/privacy-policy-gabriel-machado-built.html"

    Card(modifier = modifier) {
        Text(
            text = stringResource(id = R.string.PRIVACY_POLICY_TITTLE),
            style = MaterialTheme.typography.labelMedium,
            modifier = Modifier.clickable {
                val customTabIntent = Intent(Intent.ACTION_VIEW, Uri.parse(privacyPolicyUrl))
                activity.startActivity(customTabIntent)
            }
                .padding(4.sdp),
            fontWeight = FontWeight.Light
        )
    }
}