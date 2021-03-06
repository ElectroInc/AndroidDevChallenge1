package com.electro.devchallenge

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.electro.devchallenge.ui.theme.PetAdoptionChallengeTheme

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            DetailsContent()
        }
    }
}

@Composable
fun DetailsContent() {
    PetAdoptionChallengeTheme {
        Surface(color = MaterialTheme.colors.background) {
            MaterialTheme {
                Column(modifier = Modifier.fillMaxHeight()
                ) {

                    Column(modifier = Modifier.fillMaxHeight()) {
                        Column(modifier = Modifier.weight(1f)) {
                            MyAppBar()

                            val bird = Bird("Robert, from Paris, loves repeating what you say", R.drawable.im2, "Paris, France",1)
                            Image(
                                painter = painterResource(bird.image),
                                contentDescription = null,
                                modifier = Modifier
                                    .fillMaxWidth(),
                                contentScale = ContentScale.Crop

                            )
                            Column(modifier = Modifier
                                .padding(16.dp,16.dp,16.dp,0.dp)
                            ) {
                                NewsStory(bird)
                                ProfileFab()
                            }
                            Text("Robert is a colorful parrot able to repeat simple sentences. He loves watching old TV Series and he often repeats famous replicas. Robert is very funny, and he knows how to make you laugh, however he has the bad habit to wake you up at night, by shouting some of his favorite replicas.", modifier= Modifier.padding(16.dp))
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun ProfileFab(modifier: Modifier = Modifier) {

    FloatingActionButton(
            onClick = { },
            modifier = modifier
                .padding(16.dp)
                .height(48.dp)
                .width(250.dp),
            content = { Text(text = "Meet Robert in a video call !")},
            backgroundColor = MaterialTheme.colors.primary,
            contentColor = MaterialTheme.colors.onPrimary
    )
}


