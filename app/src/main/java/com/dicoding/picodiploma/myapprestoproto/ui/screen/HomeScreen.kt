package com.dicoding.picodiploma.myapprestoproto.ui.screen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.dicoding.picodiploma.myapprestoproto.ui.data.Food
import com.dicoding.picodiploma.myapprestoproto.ui.FoodItem
import com.dicoding.picodiploma.myapprestoproto.R

val foods = listOf(
    Food("Pizza", "Adonan tipis yang ditutupi dengan saus tomat, keju, dan beragam topping lezat.", R.drawable.pizza, listOf(
        "Adonan pizza", "Saus tomat", "Keju (mozzarella, cheddar, atau parmesan)", "Daging sapi cincang", "Sosis", "Ham", "Jamur", "Paprika", "Bawang bombay", "Zaitun"
    )),
    Food("Burger", "Patty daging dalam roti bundar dengan keju, sayuran segar, dan saus.", R.drawable.burger, listOf(
        "Roti burger (bun)", "Patty daging (daging sapi cincang, daging ayam cincang, atau alternatif nabati seperti tempe atau kacang-kacangan)", "Sayuran segar (daun selada, irisan tomat, bawang bombay)", "Keju", "Saus (saus tomat, mayones, mustard, saus sambal, saus BBQ)"
    )),
    Food("Sushi", "Nasi gumpal kecil dengan potongan ikan, makanan laut, atau sayuran mentah di atasnya.", R.drawable.sushi, listOf(
        "Adonan pizza", "Saus tomat", "Keju (mozzarella, cheddar, atau parmesan)", "Daging sapi cincang", "Sosis", "Ham", "Jamur", "Paprika", "Bawang bombay", "Zaitun"
    )),
    Food("Nasi Goreng", "Nasi yang digoreng dengan bumbu dan bahan tambahan yang lezat", R.drawable.nasi_goreng, listOf(
        "Nasi putih", "Minyak goreng", "Bawang merah, cincang", "Bawang putih, cincang", "Ayam/daging/sosis (sesuai selera), potong kecil-kecil", "Telur, kocok lepas", "Kecap manis", "Garam", "Merica", "Daun bawang, iris tipis", "Bawang goreng (opsional)"
    )),
    Food("Capcay", "Sejenis tumisan sayuran dengan campuran daging atau seafood", R.drawable.capcay, listOf(
        "Brokoli, potong-potong", "Kol, iris tipis", "Wortel, iris tipis", "Buncis, potong-potong", "Paprika, potong-potong", "Daging ayam/udang/ikan (sesuai selera), potong kecil-kecil", "Bawang putih, cincang", "Bawang bombay, iris tipis", "Kaldu ayam/udang", "Kecap manis", "Garam", "Merica", "Minyak sayur"
    )),
    Food("Spaghetti Carbonara", "Pasta yang disajikan dengan saus krim, daging bacon, dan keju parmesan", R.drawable.spaghetti, listOf(
        "Spaghetti", "Daging bacon, iris tipis", "Bawang putih, cincang halus", "Telur", "Keju parmesan, parut", "Susu cair", "Garam", "Merica", "Minyak zaitun"
    )),
    Food("Mie Ayam", "Mie yang disajikan dengan irisan daging ayam, pangsit, dan kuah kaldu", R.drawable.mie_ayam, listOf(
        "Mie telur", "Daging ayam, rebus dan iris tipis", "Pangsit, rebus dan iris tipis", "Sawi hijau, potong-potong", "Bawang putih, cincang halus", "Kecap manis", "Kecap asin", "Garam", "Merica", "Minyak wijen", "Bawang goreng (opsional)"
    )),
    Food("Gado-gado", "Salad sayuran dengan saus kacang yang lezat", R.drawable.gado2, listOf(
        "Tahu goreng", "Tempe goreng", "Kangkung, rebus sebentar", "Kacang panjang, rebus sebentar", "Tauge", "Kubis, iris tipis", "Timun, iris tipis", "Telur rebus, belah dua", "Kentang rebus, potong-potong", "Bawang goreng", "Kerupuk"
    )),
    Food("Ayam Bakar", "Ayam yang dipanggang dengan bumbu rempah yang kaya akan rasa", R.drawable.ayam_bakar, listOf(
        "Ayam potong (misalnya paha, dada)", "Bawang merah, haluskan", "Bawang putih, haluskan", "Jahe, parut", "Serai, memarkan", "Daun jeruk, sobek-sobek", "Garam", "Merica", "Kecap manis", "Minyak goreng"
    )),
    Food("Sate Ayam", "Potongan daging ayam yang ditusuk pada tusuk sate dan dipanggang, disajikan dengan bumbu kacang", R.drawable.sate, listOf(
        "Daging ayam, potong dadu", "Bawang merah, haluskan", "Bawang putih, haluskan", "Kecap manis", "Minyak goreng", "Jeruk nipis, peras airnya", "Garam", "Merica", "Tusuk sate", "Bumbu kacang (kacang tanah, bawang putih, bawang merah, cabai rawit, gula, garam)"
    ))
)

@Composable
fun HomeScreen(navController: NavController) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ){
        Scaffold(
            topBar = {
                TopAppBar(
                    title = { Text("Home") },
                    actions = {
                        IconButton(onClick = { navController.navigate("profile") }) {
                            Icon(Icons.Filled.Person, contentDescription = "Profile")
                        }
                    }
                )
            },
            content = {
                LazyColumn(
                    modifier = Modifier.padding(16.dp)
                ) {
                    items(foods) { food ->
                        FoodItem(food) {
                            navController.navigate("detail/${food.name}")
                        }
                    }
                }
            }
        )
    }
}