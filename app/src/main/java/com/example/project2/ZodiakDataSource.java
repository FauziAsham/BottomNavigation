package com.example.project2;

import java.util.ArrayList;
import java.util.List;

public class ZodiakDataSource {
        private static String[] zodiakNames = {
                "Aries (21 Maret - 20 April)",
                "Taurus (21 April - 20 Mei)",
                "Gemini (21 Mei - 20 Juni",
                "Cancer (21 Juni - 20 Juli)",
                "Leo (21 Juli - 21 Agustus)",
                "Virgo (22 Agustus - 22 September)",
                "Libra (23 September - 22 Oktober)",
                "Scorpio (23 Oktober - 22 November)",
                "Sagitarius (23 November - 20 Desember)",
                "Capricorn (21 Desember - 19 Januari)",
                "Aquarius (20 Januari - 18 Februari)",
                "Pisces (19 Februari - 20 Maret)"
        };

        private static String[] zodiakDetails = {
                "Mereka kabarnya merupakan pribadi yang memegang teguh nilai kejujuran sehingga ucapannya sering terdengar kasar dan blak-blakan.\n Tidak hanya itu, para Aries dikenal hanya akan melakukan sesuatu yang diinginkannya dan cenderung tempramental.",
                "Urutan zodiak berikutnya adalah Taurus, yang dikenal pintar dan dapat dipercaya.\n Para Taurus juga terkenal memiliki pendirian yang teguh karena ia memiliki kompas sendiri dalam hidupnya.\n Oleh sebab itu, Taurus bisa tampak malas saat melakukan sesuatu untuk memenuhi keinginan orang lain.\n Sisi baiknya, ia tak terpengaruh oleh berbagai gosip maupun drama dan memercayai orang terdekatnya dengan sepenuh hati.",
                "Sebagaimana lambang zodiak ini, para Gemini disebut memiliki dua sisi yang dapat ditunjukkan pada dunia.\n Karakternya dapat berubah dengan cepat sesuai dengan lingkungan dan energi yang ia dapat, mirip karakter anak kedua.\n Hal ini berkat intuisinya yang tajam dan kemampuan untuk membaca situasi.\n Inilah yang membuat seorang Gemini bisa menjadi teman dan pemimpin yang baik.",
                "Dipengaruhi oleh bulan dan dilambangkan dengan kepiting, ada banyak hal yang tersembunyi dalam diri zodiak Cancer.\n Ia memiliki intuisi yang kuat, sehingga dapat memutuskan sesuatu dengan baik tanpa mendengar seluruh fakta yang ada.\n Sayangnya, zodiak Cancer tampak sombong dan sulit didekati pada pertemuan pertama sehingga orang cenderung takut padanya.",
                "Seorang Leo memiliki rasa percaya diri tinggi, sehingga ia akan menjadi orang pertama yang memuji dirinya atas sebuah kesuksesan.\n Inilah yang membuatnya disebut sebagai pemimpin alami dari para zodiak.\n Namun karena rasa percaya diri yang tinggi ini Leo sangat keras dalam mengkritik dirinya sendiri.",
                "Tanggal kelahiran zodiak Virgo adalah 22 Agustus hingga 22 September.\n Mereka dikenal memiliki karakter yang cerdas dan baik hati sehingga senang memberikan bantuan untuk orang lain.\n Bahkan sebagai seorang teman, para Virgo sering menempatkan dirinya sebagai prioritas terakhir.",
                "Seorang dengan bintang kelahiran Libra menjunjung tinggi harmoni dalam segala aspek kehidupan.\n Oleh sebab itu, mereka dikenal sebagai master kompromi dan diplomasi, sehingga dapat menjadi penengah yang baik.\n Zodiak satu ini menyukai lingkaran sosial yang luas dan senang dikelilingi banyak orang.\n Namun seringkali ia terlalu fokus pada kebahagiaan orang sekitarnya, sehingga mengabaikan keinginannya sendiri.",
                "Zodiak Scorpio menyukai perdebatan, tidak takut kontroversi, dan enggan mundur jika berargumen dengan siapapun.\n Kalajengking satu ini tidak takut untuk memilih jalannya sendiri tak peduli apapun yang orang lain pikirkan.\n Meski terlihat sulit didekati, zodiak Scorpio memiliki perasaan yang sensitif dan sangat loyal pada lingkaran terdekatnya.",
                "Memiliki kemauan kuat, mereka dengan bintang kelahiran Sagitarius tidak suka mengikuti jalan yang sudah ada.\n Ia adalah seorang independen yang tak takut untuk berjalan sendiri dan berpetualang, terpisah dari kawanan.\n Namun di sisi lain, ia adalah seorang yang loyal dan pandai menjaga rahasia bagi teman-temannya.",
                "Mereka dengan zodiak Capricorn tunduk pada aturan, hirarki, dan memiliki pakem untuk melakukan sesuatu.\n Sayangnya kambing laut satu ini kadang terlalu fokus pada bagaimana sesuatu terlihat, bukan terasa, sehingga sering dinilai dingin dan tak peka.\n Tak hanya itu, Capricorn bisa tampak sangat keras kepala di mata orang lain.",
                "Tidak ada yang seperti Aquarius, mereka independen dan penuh dengan teka-teki.\n Namun mereka juga memiliki kecendrungan untuk memerhatikan orang lain sehingga mampu melihat sisi terbaik dalam diri seseorang.\n Hanya saja, idealisme mereka cenderung tinggi dan dalam kamusnya tidak ada kata ‘cukup baik’.",
                "Pada urutan terakhir ada zodiak Pisces, si ikan yang gemar berkhayal dan memiliki daya imajinasi yang tinggi.\n Para Pisces juga terkenal mempunyai firasat dan intuisi tajam karena dapat merasakan segala hal dengan dalam.\n Oleh sebab itu, mereka bisa menjadi pemberi saran dan pendengar yang baik mengenai berbagai hal."
        };

        private static int[] zodiakImages = {
                R.drawable.aries,
                R.drawable.taurus,
                R.drawable.gemini,
                R.drawable.cancer,
                R.drawable.leo,
                R.drawable.virgo,
                R.drawable.libra,
                R.drawable.scorpion,
                R.drawable.sagitarius,
                R.drawable.capricorn,
                R.drawable.aquarius,
                R.drawable.pisces
        };

    static List<Zodiak> getListData() {
            List<Zodiak> list = new ArrayList<>();
            for (int position = 0; position < zodiakNames.length; position++) {
                Zodiak zodiak = new Zodiak();
                zodiak.setName(zodiakNames[position]);
                zodiak.setDetail(zodiakDetails[position]);
                zodiak.setPhoto(zodiakImages[position]);
                list.add(zodiak);
            }
            return list;
        }
}
