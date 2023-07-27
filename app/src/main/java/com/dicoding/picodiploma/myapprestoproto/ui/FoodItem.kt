package com.dicoding.picodiploma.myapprestoproto.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dicoding.picodiploma.myapprestoproto.R
import com.dicoding.picodiploma.myapprestoproto.ui.data.Food

@Composable
fun FoodItem(food: Food, onItemClick: () -> Unit) {
    Card(
        shape = MaterialTheme.shapes.medium,
        elevation = 4.dp,
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp, horizontal = 8.dp)
            .clickable(onClick = onItemClick)
    ) {
        Row(
            modifier = Modifier.padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(food.imageResId),
                contentDescription = null,
                modifier = Modifier
                    .size(80.dp)
                    .padding(8.dp),
                contentScale = ContentScale.Crop
            )
            Column(modifier = Modifier.padding(8.dp)) {
                Text(text = food.name, fontSize = 20.sp)
                Text(text = food.description, fontSize = 14.sp, color = Color.Gray)
            }
        }
    }
}

fun getFoodById(foodId: String?): Food? {
    return when (foodId) {
        "Pizza" -> Food("Pizza", "Adonan tipis yang ditutupi dengan saus tomat, keju, dan beragam topping lezat.",
            R.drawable.pizza, listOf(
            "Adonan pizza",
            "Saus tomat",
            "Keju (mozzarella, cheddar, atau parmesan)",
            "Daging sapi cincang",
            "Sosis",
            "Ham",
            "Jamur",
            "Paprika",
            "Bawang bombay",
            "Zaitun"
        ))
        "Burger" -> Food("Burger", "Patty daging dalam roti bundar dengan keju, sayuran segar, dan saus.",
            R.drawable.burger, listOf(
            "Roti burger (bun)",
            "Patty daging (daging sapi cincang, daging ayam cincang, atau alternatif nabati seperti tempe atau kacang-kacangan)",
            "Sayuran segar (daun selada, irisan tomat, bawang bombay)",
            "Keju",
            "Saus (saus tomat, mayones, mustard, saus sambal, saus BBQ)"
        ))
        "Sushi" -> Food("Sushi", "Nasi gumpal kecil dengan potongan ikan, makanan laut, atau sayuran mentah di atasnya.", R.drawable.sushi, listOf(
            "Adonan pizza",
            "Saus tomat",
            "Keju (mozzarella, cheddar, atau parmesan)",
            "Daging sapi cincang",
            "Sosis",
            "Ham",
            "Jamur",
            "Paprika",
            "Bawang bombay",
            "Zaitun"
        ))
        "Nasi Goreng" -> Food("Nasi Goreng", "Nasi yang digoreng dengan bumbu dan bahan tambahan yang lezat", R.drawable.nasi_goreng, listOf(
            "Nasi putih", "Minyak goreng", "Bawang merah, cincang", "Bawang putih, cincang", "Ayam/daging/sosis (sesuai selera), potong kecil-kecil", "Telur, kocok lepas", "Kecap manis", "Garam", "Merica", "Daun bawang, iris tipis", "Bawang goreng (opsional)"
        ))
        "Capcay" -> Food("Capcay", "Sejenis tumisan sayuran dengan campuran daging atau seafood", R.drawable.capcay, listOf(
            "Brokoli, potong-potong", "Kol, iris tipis", "Wortel, iris tipis", "Buncis, potong-potong", "Paprika, potong-potong", "Daging ayam/udang/ikan (sesuai selera), potong kecil-kecil", "Bawang putih, cincang", "Bawang bombay, iris tipis", "Kaldu ayam/udang", "Kecap manis", "Garam", "Merica", "Minyak sayur"
        ))
        "Spaghetti Carbonara" -> Food("Spaghetti Carbonara", "Pasta yang disajikan dengan saus krim, daging bacon, dan keju parmesan", R.drawable.spaghetti, listOf(
            "Spaghetti", "Daging bacon, iris tipis", "Bawang putih, cincang halus", "Telur", "Keju parmesan, parut", "Susu cair", "Garam", "Merica", "Minyak zaitun"
        ))
        "Mie Ayam" -> Food("Mie Ayam", "Mie yang disajikan dengan irisan daging ayam, pangsit, dan kuah kaldu", R.drawable.mie_ayam, listOf(
            "Mie telur", "Daging ayam, rebus dan iris tipis", "Pangsit, rebus dan iris tipis", "Sawi hijau, potong-potong", "Bawang putih, cincang halus", "Kecap manis", "Kecap asin", "Garam", "Merica", "Minyak wijen", "Bawang goreng (opsional)"
        ))
        "Gado-gado" -> Food("Gado-gado", "Salad sayuran dengan saus kacang yang lezat", R.drawable.gado2, listOf(
            "Tahu goreng", "Tempe goreng", "Kangkung, rebus sebentar", "Kacang panjang, rebus sebentar", "Tauge", "Kubis, iris tipis", "Timun, iris tipis", "Telur rebus, belah dua", "Kentang rebus, potong-potong", "Bawang goreng", "Kerupuk"
        ))
        "Ayam Bakar" -> Food("Ayam Bakar", "Ayam yang dipanggang dengan bumbu rempah yang kaya akan rasa", R.drawable.ayam_bakar, listOf(
            "Ayam potong (misalnya paha, dada)", "Bawang merah, haluskan", "Bawang putih, haluskan", "Jahe, parut", "Serai, memarkan", "Daun jeruk, sobek-sobek", "Garam", "Merica", "Kecap manis", "Minyak goreng"
        ))
        "Sate Ayam" -> Food("Sate Ayam", "Potongan daging ayam yang ditusuk pada tusuk sate dan dipanggang, disajikan dengan bumbu kacang", R.drawable.sate, listOf(
            "Daging ayam, potong dadu", "Bawang merah, haluskan", "Bawang putih, haluskan", "Kecap manis", "Minyak goreng", "Jeruk nipis, peras airnya", "Garam", "Merica", "Tusuk sate", "Bumbu kacang (kacang tanah, bawang putih, bawang merah, cabai rawit, gula, garam)"
        ))
        else -> null
    }
}
