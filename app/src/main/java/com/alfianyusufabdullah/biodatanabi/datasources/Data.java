package com.alfianyusufabdullah.biodatanabi.datasources;


import com.alfianyusufabdullah.biodatanabi.model.Nabi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jonesrandom on 2/6/18.
 *
 * @site www.androidexample.web.id
 * @github @alfianyusufabdullah
 */

public class Data {

    private static List<Nabi> getListNabi() {
        List<Nabi> nabis = new ArrayList<>();
        nabis.add(new Nabi("ADAM AS.", "Adam As.", "930 tahun.", "5872-4942 SM.", "India, ada yang berpendapat di Jazirah Arab.", "India, ada yang berpendapat di Mekkah.", "Al-Quran menyebutkan namanya sebanyak 25 kali.", "", "40 laki-laki dan perempuan.", new ArrayList<String>()));

        List<String> idris = Arrays.asList("Adam As.", "Syits", "Anusy", "Qinan", "Mihlail", "Yarid", "Idris As.");
        nabis.add(new Nabi("IDRIS AS.", " Idris/Akhnukh bin Yarid, nama Ibunya Asyut.", "345 tahun", "4533-4188 SM. ", "Irak Kuno (Babylon, Babilonia) dan Mesir (Memphis). ", " Allah mengangkatnya ke langit dan ke surga. ", "Al-Quran menyebutkan namanya sebanyak 2 kali.", "", "", idris));

        List<String> nuh =  Arrays.asList("Adam As.", "Syits", "Anusy", "Qinan", "Mihlail", "Yarid", "Idris As.", "Matusyalih", "Lamak", "Nuh As.");
        nabis.add(new Nabi("NUH AS. ", "Nuh/Yasykur/Abdul Ghaffar bin Lamak.", "950 tahun. ", "3993-3043 SM. ", "Selatan Irak.", "Mekkah.", "Al-Quran menyebutkan namanya sebanyak 43 kali.", "Kaum Nuh.", "4 putra (Sam, Ham, Yafits dan Kan’an).", nuh));

        List<String> hud =  Arrays.asList("Adam As.", "Syits", "Anusy", "Qinan", "Mihlail", "Yarid", "Idris As.", "Matusyalih", "Lamak", "Nuh As.", "Sam", "Iram (Aram)", "‘Aush (‘Uks)", "‘Ad", "al-Khulud", "Rabah", "Abdullah", "Hud As.");
        nabis.add(new Nabi("HUD AS. ", "Hud bin Abdullah.", "130 tahun.", "2450-2320 SM.", "Al-Ahqaf (antara Yaman dan Oman).", "Bagian Timur Hadhramaut Yaman.", "Al-Quran menyebutkan namanya sebanyak 7 kali.", "Kaum ‘Ad. ", "", hud));

        List<String> shalih =  Arrays.asList("Adam As.", "Syits", "Anusy", "Qinan", "Mihlail", "Yarid", "Idris As.", "Matusyalih", "Lamak", "Nuh As.", "Sam", "Iram (Aram)", "Amir", "Tsamud", "Hadzir", "Ubaid", "Masah", "Asif", "Ubaid", "Shalih As.");
        nabis.add(new Nabi("SHALIH AS.", "Shalih bin Ubaid.", "70 tahun.", "2150-2080 SM.", "Daerah al-Hijr (Mada’in Shalih, antara Madinah dan Syria).", "Mekkah.", "Al-Quran menyebutkan namanya sebanyak 10 kali.", "Kaum Tsamud.", "", shalih));

        List<String> ibrahim =  Arrays.asList("Adam As.", "Syits", "Anusy", "Qinan", "Mihlail", "Yarid", "Idris As.", "Matusyalih", "Lamak", "Nuh As.", "Sam", "Arfakhsyad", "Syalih", "Abir", "Falij", "Ra’u", "Saruj", "Nahur", "Tarakh", "Ibrahim As.");
        nabis.add(new Nabi("IBRAHIM AS.", "Ibrahim bin Tarakh.", "175 tahun.", "1997-1822 SM.", "Ur, daerah selatan Babylon (Irak).", "Al-Khalil (Hebron, Palestina/Israel).", "Al-Quran menyebutkan namanya sebanyak 69 kali.", "Bangsa Kaldan", "13 anak (termasuk Nabi Ismail As. dan Nabi Ishaq As.).", ibrahim));

        List<String> luth =  Arrays.asList("Adam As.", "Syits", "Anusy", "Qinan", "Mihlail", "Yarid", "Idris As.", "Matusyalih", "Lamak", "Nuh As.", "Sam", "Arfakhsyad", "Syalih", "Abir", "Falij", "Ra’u", "Saruj", "Nahur", "Tarakh", "Haran", "Luth As.");
        nabis.add(new Nabi("LUTH AS.", "Luth bin Haran.", "80 tahun.", "1950-1870 SM.", "Sodom dan Amurah (Laut Mati atau Danau Luth).", "Desa Shafrah di Syam (Syria).", "Al-Quran menyebutkan namanya sebanyak 27 kali.", "Kaum Luth.", "2 putri (Ratsiya dan Za’rita).", luth));

        List<String> ismail =  Arrays.asList("Adam As.", "Syits", "Anusy", "Qinan", "Mihlail", "Yarid", "Idris As.", "Matusyalih", "Lamak", "Nuh As.", "Sam", "Arfakhsyad", "Syalih", "Abir", "Falij", "Ra’u", "Saruj", "Nahur", "Tarakh", "Ibrahim As.", "Ismail As.");
        nabis.add(new Nabi("ISMAIL AS.", "Ismail bin Ibrahim.", "137 tahun.", "1911-1774 SM.", "Mekah.", "Mekah.", "Al-Quran menyebutkan namanya sebanyak 12 kali.", "Amaliq dan Kabilah Yaman.", "", ismail));

        List<String> ishaq =  Arrays.asList("Adam As.", "Syits", "Anusy", "Qinan", "Mihlail", "Yarid", "Idris As.", "Matusyalih", "Lamak", "Nuh As.", "Sam", "Arfakhsyad", "Syalih", "Abir", "Falij", "Ra’u", "Saruj", "Nahur", "Tarakh", "Ibrahim As.", "Ishaq As.");
        nabis.add(new Nabi("ISHAQ AS.", "Ishaq bin Ibrahim.", "180 tahun.", "1897-1717 SM.", "Kota al-Khalil (Hebron) di daerah Kan’an (Kana’an).", "Al-Khalil (Hebron).", "Al-Quran menyebutkan namanya sebanyak: 17 kali.", "Bangsa Kan’an.", "2 anak (termasuk Nabi Ya’qub As./Israel).", ishaq));

        List<String> yaqub =  Arrays.asList("Adam As.", "Syits", "Anusy", "Qinan", "Mihlail", "Yarid", "Idris As.", "Matusyalih", "Lamak", "Nuh As.", "Sam", "Arfakhsyad", "Syalih", "Abir", "Falij", "Ra’u", "Saruj", "Nahur", "Tarakh", "Ibrahim As.", "Ishaq As.", "Ya’qub As.");
        nabis.add(new Nabi("YA’QUB AS.", "Ya’qub/Israel bin Ishaq.", "147 tahun.", "1837-1690 SM.", "Syam (Syria).", "Al-Khalil (Hebron), Palestina.", "Al-Quran menyebutkan namanya sebanyak 18 kali.", "Bangsa Kan’an.", "12 anak laki-laki (Rubin, Simeon, Lewi, Yahuda, Dan, Naftali, Gad, Asyir, Isakhar, Zebulaon, Yusuf dan Benyamin) dan 2 anak perempuan (Dina dan Yathirah).", yaqub));

        List<String> yusuf =  Arrays.asList("Adam As.", "Syits", "Anusy", "Qinan", "Mihlail", "Yarid", "Idris As.", "Matusyalih", "Lamak", "Nuh As.", "Sam", "Arfakhsyad", "Syalih", "Abir", "Falij", "Ra’u", "Saruj", "Nahur", "Tarakh", "Ibrahim As.", "Ishaq As.", "Ya’qub As.", "Yusuf As.");
        nabis.add(new Nabi("YUSUF AS.", "Yusuf bin Ya’qub.", "110 tahun.", "1745-1635 SM.", "Mesir.", "Nablus.", "Al-Quran menyebutkan namanya sebanyak 58 kali.", "Heksos dan Bani Israel.", "3 anak; 2 laki-laki dan 1 perempuan.", yusuf));

        List<String> ayyub =  Arrays.asList("Adam As.", "Syits", "Anusy", "Qinan", "Mihlail", "Yarid", "Idris As.", "Matusyalih", "Lamak", "Nuh As.", "Sam", "Arfakhsyad", "Syalih", "Abir", "Falij", "Ra’u", "Saruj", "Nahur", "Tarakh", "Ibrahim As.", "Ishaq As.", "al-‘Aish", "Rum", "Tawakh", "Amush", "Ayub As.");
        nabis.add(new Nabi("AYYUB AS.", "Ayyub bin Amush.", "120 tahun.", "1540-1420 SM.", "Dataran Hauran.", "Dataran Hauran.", "Al-Quran menyebutkan namanya sebanyak 4 kali.", "Bangsa Arami dan Amori, di daerah Syria dan Yordania.", "26 anak.", ayyub));

        List<String> syuaib =  Arrays.asList("Adam As.", "Syits", "Anusy", "Qinan", "Mihlail", "Yarid", "Idris As.", "Matusyalih", "Lamak", "Nuh As.", "Sam", "Arfakhsyad", "Syalih", "Abir", "Falij", "Ra’u", "Saruj", "Nahur", "Tarakh", "Ibrahim As.", "Madyan", "Yasyjur", "Mikail", "Syu’aib As.");
        nabis.add(new Nabi("SYU’AIB AS.", "Syu’aib bin Mikail.", "110 tahun.", "1600-1490 SM.", "Madyan (pesisir Laut Merah di tenggara Gunung Sinai).", "Yordania.", "Al-Quran menyebutkan namanya sebanyak: 11 kali.", "Madyan dan Ash-habul Aikah.", "2 anak perempuan.", syuaib));

        List<String> musa =  Arrays.asList("Adam As.", "Syits", "Anusy", "Qinan", "Mihlail", "Yarid", "Idris As.", "Matisyalih", "Lamak", "Nuh As.", "Sam", "Arfakhsyad", "Syalih", "Abir", "Falij", "Ra’u", "Saruj", "Nahur", "Tarakh", "Ibrahim As.", "Ishaq As.", "Ya’qub As.", "Lawi", "Azar", "Qahats", "Imran", "Musa As.");
        nabis.add(new Nabi("MUSA AS.", "Musa bin Imran, nama Ibunya Yukabad atau Yuhanaz Bilzal.", "120 tahun.", "1527-1407 SM.", "Sinai di Mesir.", "Gunung Nebu (Bukit Nabu’) di Jordania (sekarang).", "Al-Quran menyebutkan namanya sebanyak 136 kali.", "Bani Israel dan Fir’aun (gelar raja Mesir).", "2 anak, Azir dan Jarsyun, dari istrinya bernama Shafura binti Syu’aib As. ", musa));

        List<String> harun =  Arrays.asList("Adam As.", "Syits", "Anusy", "Qinan", "Mihlail", "Yarid", "Idris As.", "Matusyalih", "Lamak", "Nuh As.", "Sam", "Arfakhsyad", "Syalih", "Abir", "Falij", "Ra’u", "Saruj", "Nahur", "Tarakh", "Ibrahim As.", "Ishaq As.", "Ya’qub As.", "Lawi", "Azar", "Qahats", "Imran", "Harun As.");
        nabis.add(new Nabi("HARUN AS.", "Harun bin Imran, istrinya bernama Ayariha.", "", "", "", "", "", "", "", harun));

        List<String> dzulkifli =  Arrays.asList("Adam As.", "Syits", "Anusy", "Qinan", "Mihlail", "Yarid", "Idris As.", "Matusyalih", "Lamak", "Nuh As.", "Sam", "Arfakhsyad", "Syalih", "Abir", "Falij", "Ra’u", "Saruj", "Nahur", "Tarakh", "Ibrahim As.", "Ishaq As.", "al-‘Aish", "Rum", "Tawakh", "Amush", "Ayyub As.", "Dzulkifli As.");
        nabis.add(new Nabi("DZULKIFLI AS.", "Dzulkifli/Bisyr/Basyar bin Ayyub.", "75 tahun.", "1500-1425 SM.", "Damaskus dan sekitarnya.", "Damaskus.", "Al-Quran menyebutkan namanya sebanyak 2 kali.", "Bangsa Arami dan Amori (Kaum Rom), Syria dan Yordania.", "", dzulkifli));

        List<String> daud =  Arrays.asList("Adam As.", "Syits", "Anusy", "Qinan", "Mihlail", "Yarid", "Idris As.", "Matusyalih", "Lamak", "Nuh As.", "Sam", "Arfakhsyad", "Syalih", "Abir", "Falij", "Ra’u", "Saruj", "Nahur", "Tarakh", "Ibrahim As.", "Ishaq As.", "Yahudza", "Farish", "Hashrun", "Aram", "Aminadab", "Hasyun", "Salmun", "Bu’az", "Uwaibid", "Isya", "Daud As.");
        nabis.add(new Nabi("DAUD AS.", "Daud bin Isya.", "100 tahun.", "1063-963 SM.", "Palestina (dan Israel).", "Baitul Maqdis (Yerusalem).", "Al-Quran menyebutkan namanya sebanyak 18 kali.", "Bani Israel.", "1 anak, Sulaiman As.", daud));

        List<String> sulaiman =  Arrays.asList("Adam As.", "Syits", "Anusy", "Qinan", "Mihlail", "Yarid", "Idris As.", "Matisyalih", "Lamak", "Nuh As.", "Sam", "Arfakhsyad", "Syalih", "Abir", "Falij", "Ra’u", "Saruj", "Nahur", "Tarakh", "Ibrahim As.", "Ishaq As.", "Yahudza", "Farish", "Hashrun", "Aram", "Aminadab", "Hasyun", "Salmun", "Bu’az", "Uwaibid", "Isya", "Daud As.", "Sulaiman As.");
        nabis.add(new Nabi("SULAIMAN AS.", "Sulaiman bin Daud.", "66 tahun.", "989-923 SM.", "Palestina (dan Israel).", "Baitul Maqdis (Yerusalem).", "Al-Quran menyebutkan namanya sebanyak 21 kali.", "Bani Israel.", "1 anak, Rahab’an.", sulaiman));

        List<String> ilyas =  Arrays.asList("Adam As.", "Syits", "Anusy", "Qinan", "Mihlail", "Yarid", "Idris As.", "Matusyalih", "Lamak", "Nuh As.", "Sam", "Arfakhsyad", "Syalih", "Abir", "Falij", "Ra’u", "Saruj", "Nahur", "Tarakh", "Ibrahim As.", "Ishaq As.", "Ya’qub As.", "Lawi", "Azar", "Qahats", "Imran", "Harun As.", "Alzar", "Fanhash", "Yasin", "Ilyas As.");
        nabis.add(new Nabi("ILYAS AS.", "Ilyas bin Yasin.", "60 tahun", "910-850 SM.", "Ba’labak (Lebanon).", "Diangkat Allah ke langit.", "Al-Quran menyebutkan namanya sebanyak 4 kali.", "Bangsa Fenisia.", "", ilyas));

        List<String> ilyasa =  Arrays.asList("Adam As.", "Syits", "Anusy", "Qinan", "Mihlail", "Yarid", "Idris As.", "Matusyalih", "Lamak", "Nuh As.", "Sam", "Arfakhsyad", "Syalih", "Abir", "Falij", "Ra’u", "Saruj", "Nahur", "Tarakh", "Ibrahim As.", "Ishaq As.", "Ya’qub As.", "Yusuf As.", "Ifrayim", "Syutlim", "Akhthub", "Ilyasa’ As.");
        nabis.add(new Nabi("ILYASA’ AS.", "Ilyasa’ bin Akhthub.", "90 tahun.", "885-795 SM.", "Jaubar, Damaskus.", "Palestina.", "Al-Quran menyebutkan namanya sebanyak 2 kali.", "Bangsa Arami dan Bani Israel.", "", ilyasa));

        List<String> yunus =  Arrays.asList("Adam As.", "Syits", "Anusy", "Qinan", "Mihlail", "Yarid", "Idris As.", "Matusyalih", "Lamak", "Nuh As.", "Sam", "Arfakhsyad", "Syalih", "Abir", "Falij", "Ra’u", "Saruj", "Nahur", "Tarakh", "Ibrahim As.", "Ishaq As.", "Ya’qub As.", "Yusuf As.", "Bunyamin", "Abumatta", "Matta", "Yunus As.");
        nabis.add(new Nabi("YUNUS AS.", "Yunus/Yunan/Dzan Nun bin Matta binti Abumatta, Matta adalah nama Ibunya. (Catatan: Tidak ada dari para nabi yang dinasabkan ke Ibunya kecuali Yunus dan Isa As.).", "70 tahun.", "820-750 SM.", "Ninawa, Irak.", "Ninawa, Irak.", "Al-Quran menyebutkan namanya sebanyak 5 kali.", "Bangsa Asyiria, di utara Irak.", "", yunus));

        List<String> zakaria =  Arrays.asList("Adam As.", "Syits", "Anusy", "Qinan", "Mihlail", "Yarid", "Idris As.", "Matusyalih", "Lamak", "Nuh As.", "Sam", "Arfakhsyad", "Syalih", "Abir", "Falij", "Ra’u", "Saruj", "Nahur", "Tarakh", "Ibrahim As.", "Ishaq As.", "Yahudza", "Farish", "Hashrun", "Aram", "Aminadab", "Hasyun", "Salmun", "Bu’az", "Uwaibid", "Isya", "Daud As.", "Sulaiman As.", "Rahab’am", "Aynaman", "Yahfayath", "Syalum", "Nahur", "Bal’athah", "Barkhiya", "Shiddiqah", "Muslim", "Sulaiman", "Daud", "Hasyban", "Shaduq", "Muslim", "Dan", "Zakariya As.");
        nabis.add(new Nabi("ZAKARIYA AS.", "Zakariya bin Dan.", "122 tahun.", "91 SM-31 M.", "Palestina.", "Halab (Aleppo).", "Al-Quran menyebutkan namanya sebanyak 12 kali.", "Bani Israel", "1 Anak", zakaria));

        List<String> yahya =  Arrays.asList("Adam As.", "Syits", "Anusy", "Qinan", "Mihlail", "Yarid", "Idris As.", "Matusyalih", "Lamak", "Nuh As.", "Sam", "Arfakhsyad", "Syalih", "Abir", "Falij", "Ra’u", "Saruj", "Nahur", "Tarakh", "Ibrahim As.", "Ishaq As.", "Yahudza", "Farish", "Hashrun", "Aram", "Aminadab", "Hasyun", "Salmun", "Bu’az", "Uwaibid", "Isya", "Daud As.", "Sulaiman As.", "Rahab’am", "Aynaman", "Yahfayath", "Syalum", "Nahur", "Bal’athah", "Barkhiya", "Shiddiqah", "Muslim", "Sulaiman", "Daud", "Hasyban", "Shaduq", "Muslim", "Dan", "Zakariya As.", "Yahya As.");
        nabis.add(new Nabi("YAHYA AS.", "Yahya bin Zakariya.", "32 tahun.", "1 SM-31 M.", "Palestina.", "Damaskus.", "Al-Quran menyebutkan namanya sebanyak 5 kali.", "Bani Israel", "", yahya));

        List<String> isa =  Arrays.asList("Adam As.", "Syits", "Anusy", "Qinan", "Mihlail", "Yarid", "Idris As.", "Matusyalih", "Lamak", "Nuh As.", "Sam", "Arfakhsyad", "Syalih", "Abir", "Falij", "Ra’u", "Saruj", "Nahur", "Tarakh", "Ibrahim As.", "Ishaq As.", "Yahudza", "Farish", "Hashrun", "Aram", "Aminadab", "Hasyun", "Salmun", "Bu’az", "Uwaibid", "Isya", "Daud As.", "Sulaiman As.", "Rahab’am", "Radim", "Yahusafat", "Barid", "Nausa", "Nawas", "Amsaya", "Izazaya", "Au’am", "Ahrif", "Hizkil", "Misyam", "Amur", "Sahim", "Imran", "Maryam", "Isa As.");
        nabis.add(new Nabi("ISA AS.", "Isa bin Maryam binti Imran. (Catatan: Tidak ada dari para nabi yang dinasabkan ke Ibunya kecuali Yunus dan Isa As.).", "33 tahun", "1 SM-32 M.", "Palestina.", "Diangkat oleh Allah ke langit.", "Al-Quran menyebutkan namanya sebanyak 21 kali, sebutan al-Masih sebanyak 11 kali, dan sebutan Ibnu (Putra) Maryam sebanyak 23 kali.", "Bani Israel.", "", isa));

        List<String> muhammad =  Arrays.asList("Garis Keturunan Ayah:", "Adam As.", "Syits", "Anusy", "Qinan", "Mihlail", "Yarid", "Idris As.", "Matusyalih", "Lamak", "Nuh As.", "Sam", "Arfakhsyad", "Syalih", "Abir", "Falij", "Ra’u", "Saruj", "Nahur", "Tarakh", "Ibrahim As.", "Ismail As.", "Nabit", "Yasyjub", "Ya’rub", "Tairah", "Nahur", "Muqawwim", "Udad", "Adnan", "Ma’ad", "Nizar", "Mudhar", "Ilyas", "Mudrikah", "Khuzaimah", "Kinanah", "an-Nadhar", "Malik", "Quraisy (Fihr)", "Ghalib", "Lu’ay", "Ka’ab", "Murrah", "Kilab", "Qushay", "Zuhrah", "Abdu Manaf", "Hasyim", "Abdul Muthalib", "Abdullah", "Muhammad Saw.", "Garis Keturunan Ibu:", " Adam As.", "Syits", "Anusy", "Qinan", "Mihlail", "Yarid", "Idris As.", "Matusyalih", "Lamak", "Nuh As.", "Sam", "Arfakhsyad", "Syalih", "Abir", "Falij", "Ra’u", "Saruj", "Nahur", "Tarakh", "Ibrahim As.", "Ismail As.", "Nabit", "Yasyjub", "Ya’rub", "Tairah", "Nahur", "Muqawwim", "Udad", "Adnan", "Ma’ad", "Nizar", "Mudhar", "Ilyas", "Mudrikah", "Khuzaimah", "Kinanah", "an-Nadhar", "Malik", "Quraisy (Fihr)", "Ghalib", "Lu’ay", "Ka’ab", "Murrah", "Kilab", "Qushay", "Zuhrah", "Abdu Manaf", "Wahab", "Aminah", "Muhammad Saw.");
        nabis.add(new Nabi("MUHAMMAD SAW.", "Muhammad bin Abdullah.", "63 tahun.", "570-632 M.", "Mekkah.", "Madinah.", "Al-Quran menyebutkan namanya sebanyak 25 kali.", "Bangsa Arab.", "7 anak; 3 laki-laki Qasim, Abdullah dan Ibrahim, dan 4 perempuan Zainab, Ruqayyah, Ummi Kultsum dan Fatimah az-Zahra.", muhammad));
        return nabis;
    }

    public static Nabi getNabi(int pos) {
        return getListNabi().get(pos);
    }

}
