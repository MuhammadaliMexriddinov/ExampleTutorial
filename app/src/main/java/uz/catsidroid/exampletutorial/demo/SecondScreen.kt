//package uz.catsidroid.exampletutorial.demo
//
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.layout.width
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.ArrowForward
//import androidx.compose.material3.Icon
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.SideEffect
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.graphics.ColorFilter
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.text.style.TextAlign
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import androidx.core.graphics.toColorInt
//import com.google.accompanist.systemuicontroller.rememberSystemUiController
//import uz.catsidroid.exampletutorial.R
//
//@Preview
//@Composable
//fun SecondScreen() {
//    val systemUiController = rememberSystemUiController()
//    SideEffect {
//        systemUiController.setStatusBarColor(
//            color = Color(0xFF32777D),
//            darkIcons = false
//        )
//    }
//    Column(modifier = Modifier.fillMaxSize()) {
//        Box(
//            modifier = Modifier
//                .fillMaxWidth()
//                .height(76.dp)
//                .background(color = Color("#32777D".toColorInt()))
//                .padding(8.dp),
//        ) {
//            Image(
//                painterResource(id = R.drawable.baseline_arrow_back_ios_new_24),
//                contentDescription = "",
//                modifier = Modifier.align(Alignment.CenterStart),
//                colorFilter = ColorFilter.tint(Color.White)
//            )
//            Text(
//                text = "Dashboard",
//                modifier = Modifier.align(Alignment.Center),
//                fontWeight = FontWeight.Bold,
//                fontSize = 24.sp,
//                color = Color.White
//            )
//        }
//
//
//        Column(
//            modifier = Modifier
//                .fillMaxSize()
//                .weight(1f)
//        ) {
//
//            Row(
//                modifier = Modifier
//                    .fillMaxSize()
//                    .weight(1f)
//            ) {
//
//                Box(
//                    modifier = Modifier
//                        .fillMaxSize()
//                        .weight(1f)
//                ) {
//                    Column(
//                        modifier = Modifier
//                            .fillMaxSize()
//                            .background(Color("#36748A".toColorInt()))
//
//                    ) {
//                        Image(
//                            painterResource(id = R.drawable.ic_launcher_foreground),
//                            contentDescription = "",
//                            modifier = Modifier
//                                .height(96.dp)
//                                .width(96.dp)
//                                .align(Alignment.CenterHorizontally)
//                        )
//
//                        Box(
//                            modifier = Modifier
//                                .height(2.dp)
//                                .width(56.dp)
//                                .background(Color.White)
//                                .align(Alignment.CenterHorizontally)
//                        ) {
//
//                        }
//
//
//                        Text(
//                            text = "Profile",
//                            fontSize = 20.sp,
//                            color = Color.White,
//                            modifier = Modifier
//                                .align(Alignment.CenterHorizontally)
//                                .padding(top = 12.dp)
//                        )
//
//
//                        Text(
//                            text = "Priuryoweyrweofileiuwrytwwqiuoreyt",
//                            fontSize = 16.sp,
//                            color = Color.Black,
//                            modifier = Modifier
//                                .align(Alignment.CenterHorizontally)
//                                .padding(top = 12.dp, start = 8.dp, end = 8.dp),
//                            textAlign = TextAlign.Center
//                        )
//
//                    }
//                    Icon(
//                        imageVector = Icons.Default.ArrowForward,
//                        contentDescription = " ",
//                        modifier = Modifier.align(
//                            Alignment.BottomEnd
//                        ).padding(16.dp) , tint = Color.White
//                    )
//                }
//
//                Box(
//                    modifier = Modifier
//                        .fillMaxSize()
//                        .weight(1f)
//                ) {
//                    Column(
//                        modifier = Modifier
//                            .fillMaxSize()
//                            .background(Color("#B97222".toColorInt()))
//
//                    ) {
//                        Image(
//                            painterResource(id = R.drawable.ic_launcher_foreground),
//                            contentDescription = "",
//                            modifier = Modifier
//                                .height(96.dp)
//                                .width(96.dp)
//                                .align(Alignment.CenterHorizontally)
//                        )
//
//                        Box(
//                            modifier = Modifier
//                                .height(2.dp)
//                                .width(56.dp)
//                                .background(Color.White)
//                                .align(Alignment.CenterHorizontally)
//                        ) {
//
//                        }
//
//
//                        Text(
//                            text = "Profile",
//                            fontSize = 20.sp,
//                            color = Color.White,
//                            modifier = Modifier
//                                .align(Alignment.CenterHorizontally)
//                                .padding(top = 12.dp)
//                        )
//
//
//                        Text(
//                            text = "Priuryoweyrweofileiuwrytwwqiuoreyt",
//                            fontSize = 16.sp,
//                            color = Color.Black,
//                            modifier = Modifier
//                                .align(Alignment.CenterHorizontally)
//                                .padding(top = 12.dp, start = 8.dp, end = 8.dp),
//                            textAlign = TextAlign.Center
//                        )
//
//                    }
//                    Icon(
//                        imageVector = Icons.Default.ArrowForward,
//                        contentDescription = " ",
//                        modifier = Modifier.align(
//                            Alignment.BottomEnd
//                        ).padding(16.dp) , tint = Color.White
//                    )
//                }
//            }
//
//        }
//        Column(
//            modifier = Modifier
//                .fillMaxSize()
//                .weight(1f)
//        ) {
//
//            Row(
//                modifier = Modifier
//                    .fillMaxSize()
//                    .weight(1f)
//            ) {
//
//                Box(
//                    modifier = Modifier
//                        .fillMaxSize()
//                        .weight(1f)
//                ) {
//                    Column(
//                        modifier = Modifier
//                            .fillMaxSize()
//                            .background(Color("#CA4B3A".toColorInt()))
//
//                    ) {
//                        Image(
//                            painterResource(id = R.drawable.ic_launcher_foreground),
//                            contentDescription = "",
//                            modifier = Modifier
//                                .height(96.dp)
//                                .width(96.dp)
//                                .align(Alignment.CenterHorizontally)
//                        )
//
//                        Box(
//                            modifier = Modifier
//                                .height(2.dp)
//                                .width(56.dp)
//                                .background(Color.White)
//                                .align(Alignment.CenterHorizontally)
//                        ) {
//
//                        }
//
//
//                        Text(
//                            text = "Profile",
//                            fontSize = 20.sp,
//                            color = Color.White,
//                            modifier = Modifier
//                                .align(Alignment.CenterHorizontally)
//                                .padding(top = 12.dp)
//                        )
//
//
//                        Text(
//                            text = "Priuryoweyrweofileiuwrytwwqiuoreyt",
//                            fontSize = 16.sp,
//                            color = Color.Black,
//                            modifier = Modifier
//                                .align(Alignment.CenterHorizontally)
//                                .padding(top = 12.dp, start = 8.dp, end = 8.dp),
//                            textAlign = TextAlign.Center
//                        )
//
//                    }
//                    Icon(
//                        imageVector = Icons.Default.ArrowForward,
//                        contentDescription = " ",
//                        modifier = Modifier.align(
//                            Alignment.BottomEnd
//                        ).padding(16.dp) , tint = Color.White
//                    )
//                }
//
//                Box(
//                    modifier = Modifier
//                        .fillMaxSize()
//                        .weight(1f)
//                ) {
//                    Column(
//                        modifier = Modifier
//                            .fillMaxSize()
//                            .background(Color("#536857".toColorInt()))
//
//                    ) {
//                        Image(
//                            painterResource(id = R.drawable.ic_launcher_foreground),
//                            contentDescription = "",
//                            modifier = Modifier
//                                .height(96.dp)
//                                .width(96.dp)
//                                .align(Alignment.CenterHorizontally)
//                        )
//
//                        Box(
//                            modifier = Modifier
//                                .height(2.dp)
//                                .width(56.dp)
//                                .background(Color.White)
//                                .align(Alignment.CenterHorizontally)
//                        ) {
//
//                        }
//
//
//                        Text(
//                            text = "Profile",
//                            fontSize = 20.sp,
//                            color = Color.White,
//                            modifier = Modifier
//                                .align(Alignment.CenterHorizontally)
//                                .padding(top = 12.dp)
//                        )
//
//
//                        Text(
//                            text = "Priuryoweyrweofileiuwrytwwqiuoreyt",
//                            fontSize = 16.sp,
//                            color = Color.Black,
//                            modifier = Modifier
//                                .align(Alignment.CenterHorizontally)
//                                .padding(top = 12.dp, start = 8.dp, end = 8.dp),
//                            textAlign = TextAlign.Center
//                        )
//
//                    }
//                    Icon(
//                        imageVector = Icons.Default.ArrowForward,
//                        contentDescription = " ",
//                        modifier = Modifier.align(
//                            Alignment.BottomEnd
//                        ).padding(16.dp) , tint = Color.White
//                    )
//                }
//            }
//
//        }
//        Column(
//            modifier = Modifier
//                .fillMaxSize()
//                .weight(1f)
//        ) {
//            Row(
//                modifier = Modifier
//                    .fillMaxSize()
//                    .weight(1f)
//            ) {
//
//                Box(
//                    modifier = Modifier
//                        .fillMaxSize()
//                        .weight(1f)
//                ) {
//                    Column(
//                        modifier = Modifier
//                            .fillMaxSize()
//                            .background(Color("#3D8C4A".toColorInt()))
//
//                    ) {
//                        Image(
//                            painterResource(id = R.drawable.ic_launcher_foreground),
//                            contentDescription = "",
//                            modifier = Modifier
//                                .height(96.dp)
//                                .width(96.dp)
//                                .align(Alignment.CenterHorizontally)
//                        )
//
//                        Box(
//                            modifier = Modifier
//                                .height(2.dp)
//                                .width(56.dp)
//                                .background(Color.White)
//                                .align(Alignment.CenterHorizontally)
//                        ) {
//
//                        }
//
//
//                        Text(
//                            text = "Profile",
//                            fontSize = 20.sp,
//                            color = Color.White,
//                            modifier = Modifier
//                                .align(Alignment.CenterHorizontally)
//                                .padding(top = 12.dp)
//                        )
//
//
//                        Text(
//                            text = "Priuryoweyrweofileiuwrytwwqiuoreyt",
//                            fontSize = 16.sp,
//                            color = Color.Black,
//                            modifier = Modifier
//                                .align(Alignment.CenterHorizontally)
//                                .padding(top = 12.dp, start = 8.dp, end = 8.dp),
//                            textAlign = TextAlign.Center
//                        )
//
//                    }
//                    Icon(
//                        imageVector = Icons.Default.ArrowForward,
//                        contentDescription = " ",
//                        modifier = Modifier.align(
//                            Alignment.BottomEnd
//                        ).padding(16.dp) , tint = Color.White
//                    )
//                }
//
//                Box(
//                    modifier = Modifier
//                        .fillMaxSize()
//                        .weight(1f)
//                ) {
//                    Column(
//                        modifier = Modifier
//                            .fillMaxSize()
//                            .background(Color("#8A548E".toColorInt()))
//
//                    ) {
//                        Image(
//                            painterResource(id = R.drawable.ic_launcher_foreground),
//                            contentDescription = "",
//                            modifier = Modifier
//                                .height(96.dp)
//                                .width(96.dp)
//                                .align(Alignment.CenterHorizontally)
//                        )
//
//                        Box(
//                            modifier = Modifier
//                                .height(2.dp)
//                                .width(56.dp)
//                                .background(Color.White)
//                                .align(Alignment.CenterHorizontally)
//                        ) {
//
//                        }
//
//
//                        Text(
//                            text = "Profile",
//                            fontSize = 20.sp,
//                            color = Color.White,
//                            modifier = Modifier
//                                .align(Alignment.CenterHorizontally)
//                                .padding(top = 12.dp)
//                        )
//
//
//                        Text(
//                            text = "Priuryoweyrweofileiuwrytwwqiuoreyt",
//                            fontSize = 16.sp,
//                            color = Color.Black,
//                            modifier = Modifier
//                                .align(Alignment.CenterHorizontally)
//                                .padding(top = 12.dp, start = 8.dp, end = 8.dp),
//                            textAlign = TextAlign.Center
//                        )
//
//                    }
//                    Icon(
//                        imageVector = Icons.Default.ArrowForward,
//                        contentDescription = " ",
//                        modifier = Modifier.align(
//                            Alignment.BottomEnd
//                        ).padding(16.dp) , tint = Color.White
//                    )
//                }
//            }
//        }
//    }
//
//}