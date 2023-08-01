package com.machado001.words.ui.screens.homeScreen


import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import com.machado001.words.MainActivity
import com.machado001.words.R
import com.machado001.words.ui.LeaveGameDialog
import com.machado001.words.ui.screens.policy.PrivacyPolicyScreen
import ir.kaaveh.sdpcompose.sdp
import ir.kaaveh.sdpcompose.ssp


@Composable
fun Home(
    modifier: Modifier = Modifier,
    onNavigateToGame: () -> Unit = {},
    onNavigateToInstructions: () -> Unit = {},
    onNavigateUp: () -> Unit,
    activity: MainActivity,
) {

    Box(modifier = modifier.fillMaxSize()) {
        CenterDiv(
            modifier = modifier
                .align(Alignment.Center),
            onNavigateToGame = onNavigateToGame,
            onNavigateToInstructions = onNavigateToInstructions,
            onNavigateUp = onNavigateUp,
            activity = activity
        )
    }
}

@Composable
fun CenterDiv(
    modifier: Modifier = Modifier,
    onNavigateUp: () -> Unit,
    onNavigateToGame: () -> Unit,
    onNavigateToInstructions: () -> Unit,
    activity: MainActivity,
) {
    val paddingValue = 8.sdp
    LeaveGameDialog(onNavigateUp)
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            val appTextTitle = stringResource(id = R.string.APP_NAME).uppercase()
            repeat(appTextTitle.length) {
                Card(
                    modifier = modifier
                        .padding(3.sdp)
                        .size(36.sdp),
                    elevation = CardDefaults.elevatedCardElevation(4.sdp),
                    colors = CardDefaults.cardColors(
                        containerColor = MaterialTheme.colorScheme.onSurfaceVariant,
                        contentColor = MaterialTheme.colorScheme.surface
                    )
                ) {
                    Text(
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally),
                        text = appTextTitle[it].toString(),
                        textAlign = TextAlign.Center,
                        fontSize = 28.ssp
                    )
                }
            }
        }
        Column(
            modifier = modifier
                .padding(paddingValue)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(
                modifier = Modifier
                    .width(IntrinsicSize.Min)
            ) {
                ButtonToNavigate(
                    onNavigateToGame,
                    modifier,
                    paddingValue,
                    R.string.PLAY_BUTTON
                )
                Spacer(modifier = Modifier.padding(bottom = 8.sdp))
                ButtonToNavigate(
                    onNavigateToInstructions,
                    modifier,
                    paddingValue,
                    R.string.INSTRUCTIONS_TITLE
                )
            }
            PrivacyPolicyScreen(modifier = Modifier.padding(top = 16.sdp), activity)
        }
    }
}


@Composable
private fun ButtonToNavigate(
    onNavigateTo: () -> Unit,
    modifier: Modifier = Modifier,
    paddingValue: Dp,
    @StringRes stringResourceId: Int
) {
    Row {
        Button(
            onClick = onNavigateTo,
            modifier = modifier
                .fillMaxWidth()
                .padding(end = paddingValue),
            elevation = ButtonDefaults.buttonElevation(paddingValue)
        ) {
            UppercaseText(
                text = stringResource(id = stringResourceId),
            )
        }
    }
}

@Composable
fun UppercaseText(
    modifier: Modifier = Modifier,
    text: String,
) {
    Text(
        modifier = modifier,
        text = text.uppercase(),
        style = MaterialTheme.typography.titleMedium,
        textAlign = TextAlign.Center
    )
}
