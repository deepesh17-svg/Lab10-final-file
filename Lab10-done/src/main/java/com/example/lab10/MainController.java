package com.example.lab10;

public class MainController {
    // Add references to your GUI components here.

    public void searchGames() {
        String query = "Enter game title here"; // Replace this with the actual query from the GUI.
        try {
            String games = APIUtility.getGamesFromAPI(query);
            // Populate the game list view or other GUI elements with the response data.
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
