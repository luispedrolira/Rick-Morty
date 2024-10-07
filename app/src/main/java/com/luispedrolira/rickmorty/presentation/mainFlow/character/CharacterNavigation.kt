package com.luispedrolira.rickmorty.presentation.mainFlow.character

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.navigation
import com.luispedrolira.rickmorty.presentation.mainFlow.character.list.CharacterListDestination
import com.luispedrolira.rickmorty.presentation.mainFlow.character.list.characterListScreen
import com.luispedrolira.rickmorty.presentation.mainFlow.character.profile.characterProfileScreen
import com.luispedrolira.rickmorty.presentation.mainFlow.character.profile.navigateToCharacterProfileScreen
import kotlinx.serialization.Serializable

@Serializable
data object CharacterNavGraph

fun NavController.navigateToCharacterGraph(navOptions: NavOptions? = null) {
    this.navigate(CharacterNavGraph, navOptions)
}

fun NavGraphBuilder.characterGraph(
    navController: NavController
) {
    navigation<CharacterNavGraph>(
        startDestination = CharacterListDestination
    ) {
        characterListScreen(
            onCharacterClick = navController::navigateToCharacterProfileScreen
        )
        characterProfileScreen(
            onNavigateBack = navController::navigateUp
        )
    }
}