package com.example.fantasybooksapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Create a list of 30 fantasy books
        val bookList = listOf(
            // Classic Fantasy (1-10)
            Book("The Hobbit", "A must-read adventure filled with dwarves, a dragon, and more.", R.drawable.hobbit_cover, 1),
            Book("The Lord of the Rings", "Epic fantasy set in Middle-earth.", R.drawable.lotr_cover, 2),
            Book("A Wizard of Earthsea", "The tale of Ged, a young mage’s journey to master his powers.", R.drawable.earthsea_cover, 3),
            Book("The Chronicles of Narnia: The Lion, the Witch and the Wardrobe", "Enter the magical world of Narnia through a wardrobe.", R.drawable.narnia_cover, 4),
            Book("The Once and Future King", "A modern retelling of King Arthur’s story.", R.drawable.once_future_king_cover, 5),
            Book("The Name of the Wind", "A beautifully written tale about the legendary Kvothe.", R.drawable.name_of_the_wind_cover, 6),
            Book("The Eye of the World", "Start of the massive 'Wheel of Time' series filled with prophecy and battles.", R.drawable.eye_of_the_world_cover, 7),
            Book("Mistborn: The Final Empire", "An intriguing world where magic comes from metals.", R.drawable.mistborn_cover, 8),
            Book("The Lies of Locke Lamora", "Follow the adventures of master thief Locke in a gritty, urban fantasy world.", R.drawable.locke_lamora_cover, 9),
            Book("The Silmarillion", "Dive deep into the lore of Middle-earth’s history.", R.drawable.silmarillion_cover, 10),

            // Modern Fantasy (11-20)
            Book("The Way of Kings", "First in the 'Stormlight Archive', an epic of powerful knights and ancient enemies.", R.drawable.way_of_kings_cover, 11),
            Book("The Blade Itself", "A dark and gritty tale with morally complex characters.", R.drawable.blade_itself_cover, 12),
            Book("Jonathan Strange & Mr Norrell", "A magical alternative history of England during the Napoleonic Wars.", R.drawable.strange_norrell_cover, 13),
            Book("The Bone Season", "A dystopian London filled with clairvoyants and secretive magic.", R.drawable.bone_season_cover, 14),
            Book("The Priory of the Orange Tree", "A high-fantasy standalone featuring dragons and a world on the brink of war.", R.drawable.priory_of_orange_tree_cover, 15),
            Book("The Night Circus", "A mysterious circus that only opens at night, with a magical competition at its heart.", R.drawable.night_circus_cover, 16),
            Book("The Fifth Season", "A unique world where apocalyptic events are commonplace and people control seismic activity.", R.drawable.fifth_season_cover, 17),
            Book("The Poppy War", "A war-driven fantasy based on the history of 20th-century China, but with added magic.", R.drawable.poppy_war_cover, 18),
            Book("Spinning Silver", "A retelling of Rumpelstiltskin with a wintry, magical atmosphere.", R.drawable.spinning_silver_cover, 19),
            Book("Circe", "A retelling of the myth of Circe, the powerful witch from Greek mythology.", R.drawable.circe_cover, 20),

            // Hidden Gems and Lesser-Known Titles (21-30)
            Book("The Rage of Dragons", "A story of revenge set in a society that revolves around military prowess.", R.drawable.rage_of_dragons_cover, 21),
            Book("The Black Prism", "A unique magic system based on colors in a tale of war and politics.", R.drawable.black_prism_cover, 22),
            Book("The Golem and the Jinni", "A fascinating blend of fantasy and historical fiction set in 19th-century New York.", R.drawable.golem_and_jinni_cover, 23),
            Book("An Ember in the Ashes", "A brutal Roman-inspired world filled with oppression, magic, and rebellion.", R.drawable.ember_in_ashes_cover, 24),
            Book("The City of Brass", "A lush Middle Eastern-inspired fantasy with djinns and magical intrigue.", R.drawable.city_of_brass_cover, 25),
            Book("The Wolf", "A world of warring clans and medieval politics, but with a twist on humans and their rivals.", R.drawable.wolf_cover, 26),
            Book("The Song of Achilles", "A love story and war epic from the perspective of Achilles' closest companion, Patroclus.", R.drawable.song_of_achilles_cover, 27),
            Book("The Goblin Emperor", "A surprising and heartwarming tale of a young goblin becoming an emperor.", R.drawable.goblin_emperor_cover, 28),
            Book("Elantris", "A standalone epic about a fallen magical city and the people trying to bring it back to glory.", R.drawable.elantris_cover, 29),
            Book("Foundryside", "A fast-paced fantasy with unique magic involving programmable objects.", R.drawable.foundryside_cover, 30)
        )

        val adapter = BookAdapter(bookList)
        recyclerView.adapter = adapter
    }
}
