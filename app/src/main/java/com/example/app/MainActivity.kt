package com.example.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.app.ui.theme.AppTheme
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.app.ui.theme.DarkBlue


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mainViewModel = MainViewModel(context = applicationContext)
        setContent {
            AppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = DarkBlue
                ) {
                    MainScreen(mainViewModel)
                }
            }
        }
    }
}

val skModernistRegular = FontFamily(Font(R.font.sk_modernist_regular))
val skModernistBold = FontFamily(Font(R.font.sk_modernist_bold))
val montserratRegular = FontFamily(Font(R.font.montserrat_regular))


@Composable
fun MainScreen(mainViewModel: MainViewModel = viewModel()) {

    val context = LocalContext.current

    val usageLevel by mainViewModel.usageLevel.observeAsState()
    val description by mainViewModel.description.observeAsState()
    val rating by mainViewModel.rating.observeAsState()
    val reviews by mainViewModel.reviews.observeAsState()
    val installButtonName by mainViewModel.installButtonName.observeAsState()

    LazyColumn(content = {

        item { ImageGameHeader(usageLevel.orEmpty()) }
        item { KeyWords() }
        item { DescriptionGame(description.orEmpty()) }
        item { ScenesGame() }
        item { ReviewRating(rating.orEmpty(), reviews.orEmpty()) }
        item {

            val feedbackList = mutableListOf<Feedback>()

            feedbackList.add(Feedback(
                image = R.drawable.person_1,
                author = context.getString(R.string.person1_name),
                date = context.getString(R.string.person1_date),
                text = context.getString(R.string.person1_text)
            ))

            feedbackList.add(Feedback(
                image = R.drawable.person_2,
                author = context.getString(R.string.person2_name),
                date = context.getString(R.string.person2_date),
                text = context.getString(R.string.person2_text)
            ))

            FeedbackList(feedbackList)

        }

        item { InstallButton(installButtonName.orEmpty()) }

    }, modifier = Modifier.fillMaxSize())

}


//@Composable
//fun GameScreen() {
//
//    LazyColumn(content = {
//        item { ImageHeader() }
//        item { IConHeader() }
//        item { KeyWords() }
//        item { DescriptionGame() }
//        item { ScenesGame() }
//        item { ReviewRating() }
//        item {
//
//            FeedbackPerson(
//                Feedback(
//                    image = R.drawable.person_1,
//                    author = "Auguste Conte",
//                    date = "February 14, 2019",
//                    text = "“Once you start to learn its secrets, there’s a wild" +
//                            " and exciting variety of play here that’s unmatched, even by its peers.”"
//                )
//            )
//        }
//        item {
//
//            FeedbackPerson(
//                Feedback(
//                    image = R.drawable.person_2,
//                    author = "Jang Marcelino",
//                    date = "February 14, 2019",
//                    text = "“Once you start to learn its secrets, there’s a wild" +
//                            " and exciting variety of play here that’s unmatched, even by its peers.”"
//                )
//            )
//        }
//        item { InstallButton() }
//
//
//    }, modifier = Modifier.fillMaxSize())
//}



