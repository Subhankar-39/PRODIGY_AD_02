package com.swancompany.journal.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType.Companion.IntType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.subhankar.journal.ui.presentation.aboutScreen.AboutScreen
import com.subhankar.journal.ui.presentation.addNoteScreen.AddNoteScreen
import com.subhankar.journal.ui.presentation.homeScreen.HomeScreen
import com.subhankar.journal.ui.presentation.updateNoteScreen.UpdateNoteScreen

@Composable
fun JournalApp(
    navController: NavHostController = rememberNavController(),
) {
    NavHost(
        navController = navController,
        startDestination = JournalAppScreens.Home.name,
    ) {
        composable(route = JournalAppScreens.Home.name) {
            HomeScreen(
                onFabClicked = { navController.navigate(JournalAppScreens.AddNotes.name) },
                navigateToUpdateNoteScreen = { noteId ->
                    navController.navigate("${JournalAppScreens.UpdateNotes.name}/$noteId")
                },
                navigateToAboutScreen = {navController.navigate(JournalAppScreens.About.name)}
            )
        }
        composable(route = "${JournalAppScreens.UpdateNotes.name}/{noteId}",
            arguments = listOf(navArgument("noteId") { type = IntType })
        ) { backStackEntry ->
            val noteId = backStackEntry.arguments?.getInt("noteId") ?: 0
            UpdateNoteScreen(
                noteId = noteId,
                navigateBack = { navController.popBackStack() }
            )
        }
        composable(JournalAppScreens.AddNotes.name) {
            AddNoteScreen(navigateBack = { navController.popBackStack() })
        }
        composable(JournalAppScreens.About.name){
            AboutScreen (navigateBack = { navController.popBackStack() })
        }
    }
}