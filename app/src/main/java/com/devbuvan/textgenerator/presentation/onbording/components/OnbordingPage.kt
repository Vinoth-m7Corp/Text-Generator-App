package com.devbuvan.textgenerator.presentation.onbording.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.devbuvan.textgenerator.R
import com.devbuvan.textgenerator.presentation.Dimens
import com.devbuvan.textgenerator.presentation.onbording.Page
import com.devbuvan.textgenerator.presentation.onbording.pages
import com.devbuvan.textgenerator.ui.theme.TextGeneratorTheme

@Composable
fun OnbordingPage(
    modifier: Modifier = Modifier,
    page: Page
) {
    Column(modifier = modifier) {
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.6f),
            painter = painterResource(id = page.image),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(Dimens.mediumpadding1))
        Text(
            text = page.title,
            modifier = Modifier.padding(horizontal = Dimens.mediumpadding2),
            style = MaterialTheme.typography.displaySmall.copy(fontWeight = FontWeight.Bold),
            color = colorResource(id = R.color.display_small)
        )
        Text(
            text = page.description,
            modifier = Modifier.padding(horizontal = Dimens.mediumpadding2),
            style = MaterialTheme.typography.bodyMedium,
            color = colorResource(id = R.color.text_medium)
        )
    }

}

@Preview
@Preview(uiMode = android.content.res.Configuration.UI_MODE_NIGHT_YES)
@Composable
fun OnBordingScreenPreview(){
    TextGeneratorTheme {
        OnbordingPage(page = pages[0])
    }
}