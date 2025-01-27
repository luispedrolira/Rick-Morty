package com.luispedrolira.rickmorty.presentation.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.LocationOn
import androidx.compose.material.icons.outlined.Person
import androidx.compose.ui.graphics.vector.ImageVector
import com.luispedrolira.rickmorty.presentation.mainFlow.character.CharacterNavGraph
import com.luispedrolira.rickmorty.presentation.mainFlow.character.list.CharacterListDestination
import com.luispedrolira.rickmorty.presentation.mainFlow.location.LocationsNavGraph
import com.luispedrolira.rickmorty.presentation.mainFlow.location.list.LocationListDestination
import com.luispedrolira.rickmorty.presentation.mainFlow.profile.ProfileDestination

data class NavItem(
    val title: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val destination: Any, // Utilizamos Any ya que debemos poner aquí nuestros Destinations
)

val navigationItems = listOf(
    NavItem(
        title = "Characters",
        selectedIcon = Icons.Filled.AccountBox,
        unselectedIcon = Icons.Outlined.AccountCircle,
        destination = CharacterNavGraph
    ),
    NavItem(
        title = "Locations",
        selectedIcon = Icons.Filled.LocationOn,
        unselectedIcon = Icons.Outlined.LocationOn,
        destination = LocationsNavGraph
    ),
    NavItem(
        title = "Profile",
        selectedIcon = Icons.Filled.Person,
        unselectedIcon = Icons.Outlined.Person,
        destination = ProfileDestination
    )
)

val topLevelDestinations = listOf(
    CharacterListDestination::class,
    LocationListDestination::class,
    ProfileDestination::class
)