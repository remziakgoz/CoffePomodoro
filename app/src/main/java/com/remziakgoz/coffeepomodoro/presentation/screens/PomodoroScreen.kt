package com.remziakgoz.coffeepomodoro.presentation.screens

import CoffeeAnimation
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.remziakgoz.coffeepomodoro.presentation.components.PomodoroWithCanvasClock
import com.remziakgoz.coffeepomodoro.presentation.components.StartButton

@Composable
fun PomodoroScreen(modifier: Modifier, innerPadding: PaddingValues) {
    var shouldStart by remember { mutableStateOf(false) }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(innerPadding),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Spacer(modifier = modifier.padding(top = 50.dp))
        PomodoroWithCanvasClock(shouldStart = shouldStart)
        CoffeeAnimation(innerPadding = innerPadding, shouldStart = shouldStart)
        Spacer(modifier = Modifier.padding(5.dp))
        StartButton(onClick = { shouldStart = !shouldStart }, shouldStart = shouldStart)
        Spacer(modifier = Modifier.padding(5.dp))
    }
}