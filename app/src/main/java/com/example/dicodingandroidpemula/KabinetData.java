package com.example.dicodingandroidpemula;

import java.util.ArrayList;

class KabinetData {
    private static String[] kabinetNames = {
            "Joko Widodo",
            "Jusuf Kalla",
            "Wiranto",
            "Darmin Nasution",
            "Luhut Binsar Panjaitan",
            "Darmin Nasution",
            "Pratikno",
            "Tjahjo Kumolo",
            "Retno Lestari Priansari Marsudi",
            "Ryamizard Ryacudu",
            "Tjahjo Kumolo",
            "Sri Mulyani Indrawati",
            "Ignasius Jonan",
            "Airlangga Hartarto",
            "Enggartiasto Lukita",
            "Amran Sulaiman",
            "Siti Nurbaya Bakar",
            "Budi Karya Sumadi",
            "Susi Pudjiastuti",
            "Hanif Dhakiri",
            "Eko Putro Sandjojo",
            "Basuki Hadimuljono",
            "Nila Djuwita Anfasa Moeloek",
            "Muhadjir Effendy",
            "Muhammad Nasir",
            "Agus Gumiwang Kartasasmita",
            "Lukman Hakim Saifuddin",
            "Arief Yahya",
            "Rudiantara",
            "Anak Agung Gede Ngurah Puspayoga",
            "Yohana Yembise",
            "Syafruddin",
            "Bambang Brodjonegoro",
            "Sofyan Djalil",
            "Rini Mariani Soemarno Soewandi",
            "Hanif Dhakiri"
    };

    private static String[] kabinetDetails = {
            "Presiden Republik Indonesia 2014-2019. Ir. H. Joko Widodo atau Jokowi (lahir di Surakarta, Jawa Tengah, 21 Juni 1961; umur 58 tahun) adalah Presiden ke-7 Indonesia yang mulai menjabat sejak 20 Oktober 2014. Ia terpilih bersama Wakil Presiden Muhammad Jusuf Kalla dalam Pemilu Presiden 2014.",
            "Wakil Presiden Republik Indonesia 2014-2019. Dr.(H.C.) Drs. H. Muhammad Jusuf Kalla (lahir di Watampone, Kabupaten Bone, Sulawesi Selatan, 15 Mei 1942; umur 77 tahun), sering ditulis sebagai Jusuf Kalla atau JK adalah pengusaha dan politisi Indonesia yang menjabat sebagai Wakil Presiden Indonesia (Wapres) ke-10 dan ke-12.",
            "Menteri Koordinator Bidang Politik, Hukum, dan Keamanan. Jenderal TNI (Purn.) Dr. H. Wiranto, S.H., S.I.P., M.M. (lahir di Kota Yogyakarta, DIY, 4 April 1947; umur 72 tahun ) adalah politikus Indonesia dan tokoh militer Indonesia. Saat ini dia menjabat sebagai Menteri Koordinator Bidang Politik, Hukum, dan Keamanan pada reshuffle Kabinet Kerja kedua menggantikan Luhut Binsar Panjaitan.",
            "Menteri Koordinator Bidang Perekonomian. Darmin Nasution (lahir di Pasar Maga, Lembah Sorik Marapi, Mandailing Natal, Sumatra Utara, 21 Desember 1948; umur 70 tahun) adalah Menteri Koordinator Perekonomian Indonesia saat ini, ia menjabat sejak 12 Agustus 2015.",
            "Menteri Koordinator Bidang Kemaritiman dan Sumber Daya. Jenderal TNI (HOR) (Purn.) Luhut Binsar Pandjaitan, M.P.A. (lahir di Simargala, Huta Namora, Silaen, Toba Samosir, Sumatra Utara, 28 September 1947; umur 72 tahun) adalah Menteri Koordinator Bidang Kemaritiman Indonesia saat ini.",
            "PLT Menteri Koordinator Bidang Pembangunan Manusia dan Kebudayaan menggantikan Puan Maharani",
            "Menteri Sekretaris Negara. Prof. Dr. Pratikno, M.Soc.Sc. (lahir di Bojonegoro, Jawa Timur, Indonesia, 13 Februari 1962; umur 57 tahun) adalah Menteri Sekretaris Negara yang menjabat sejak 27 Oktober 2014. Sebelumnya ia merupakan rektor Universitas Gadjah Mada yang ke 14.",
            "Menteri Dalam Negeri. Tjahjo Kumolo, SH, (lahir di Surakarta, Jawa Tengah, 1 Desember 1957; umur 61 tahun), adalah Menteri Dalam Negeri Indonesia yang menjabat dari 27 Oktober 2014 pada Kabinet Kerja Presiden Joko Widodo.",
            "Menteri Luar Negeri. Retno Lestari Priansari Marsudi (lahir di Semarang, Jawa Tengah, 27 November 1962; umur 56 tahun) adalah Menteri Luar Negeri perempuan pertama Indonesia yang menjabat dari 27 Oktober 2014 dalam Kabinet Kerja Presiden Joko Widodo.",
            "Menteri Pertahanan. Jenderal TNI (Purn.) Ryamizard Ryacudu (lahir di Palembang, Sumatra Selatan, 21 April 1950; umur 69 tahun) adalah Menteri Pertahanan pada Kabinet Kerja bentukan Presiden Joko Widodo yang mulai menjabat sejak 27 Oktober 2014.",
            "PLT Menteri Hukum dan Hak Asasi Manusia menggantikan Yasonna Laoly",
            "Menteri Keuangan. Sri Mulyani Indrawati, S.E., M.Sc., Ph.D (lahir di Bandar Lampung, Lampung, 26 Agustus 1962; umur 57 tahun) adalah wanita sekaligus orang Indonesia pertama yang menjabat sebagai Direktur Pelaksana Bank Dunia. Jabatan ini diembannya mulai 1 Juni 2010 hingga dia dipanggil kembali oleh Presiden Joko Widodo untuk menjabat sebagai Menteri Keuangan menggantikan Bambang Brodjonegoro, dia mulai menjabat lagi sejak 27 Juli 2016.",
            "Menteri Energi dan Sumber Daya Mineral. Ignasius Jonan ( ejaan lama: Ignasius Djonan, lahir di Singapura, 21 Juni 1963; umur 56 tahun) adalah Menteri Energi dan Sumber Daya Mineral (ESDM) Indonesia sejak 14 Oktober 2016. Sebelumnya, Ignasius Jonan menjabat sebagai Menteri Perhubungan Indonesia sejak 27 Oktober 2014 hingga di reshuffle oleh Presiden Joko Widodo (Jokowi) dan digantikan oleh Budi Karya Sumadi pada tangga 27 Juli 2016.",
            "Menteri Perindustrian. Ir. Airlangga Hartarto, M.B.A., M.M.T., (lahir di Surabaya, Jawa Timur, 1 Oktober 1962; umur 57 tahun) adalah seorang politisi Golkar berkebangsaan Indonesia. Pada 27 Juli 2016 ditunjuk untuk menjabat sebagai Menteri Perindustrian menggantikan Saleh Husin pada perombakan Kabinet Kerja Joko Widodo.",
            "Menteri Perdagangan. Drs. Enggartiasto Lukita (lahir di Cirebon, Jawa Barat, 12 Oktober 1951; umur 68 tahun) adalah politikus dan pengusaha berkebangsaan Indonesia yang sekarang menjabat sebagai Menteri Perdagangan sejak 27 Juli 2016. Namanya dikenal secara luas saat menjadi anggota DPR RI dari Partai Golongan Karya (1997-1999 dan 2004-2009).",
            "Menteri Pertanian. Dr. Ir. H. Andi Amran Sulaiman, MP (lahir di Bone, 27 April 1968; umur 51 tahun) adalah Menteri Pertanian dalam Kabinet Kerja 2014–2019.",
            "Menteri Lingkungan Hidup dan Kehutanan. Dr. Ir. Siti Nurbaya Bakar, M.Sc. (lahir di Jakarta, Indonesia, 28 Juli 1956; umur 63 tahun) adalah Menteri Lingkungan Hidup dan Kehutanan dalam Kabinet Kerja 2014 - 2019.",
            "Menteri Perhubungan. Ir. Budi Karya Sumadi adalah Menteri Perhubungan Republik Indonesia pada Kabinet Kerja yang menjabat sejak 27 Juli 2016 menggantikan Ignasius Jonan.",
            "Menteri Kelautan dan Perikanan. Dr. (H.C.) Susi Pudjiastuti (lahir di Pangandaran, 15 Januari 1965; umur 54 tahun) adalah seorang Menteri Kelautan dan Perikanan dari Kabinet Kerja 2014-2019 yang juga pengusaha pemilik dan Presdir PT ASI Pudjiastuti Marine Product, eksportir hasil-hasil perikanan dan PT ASI Pudjiastuti Aviation atau penerbangan Susi Air dari Jawa Barat",
            "Menteri Ketenagakerjaan. Muhammad Hanif Dhakiri, S.Ag., M.Si. (lahir di Semarang, 6 Juni 1972; umur 47 tahun) adalah Menteri Ketenagakerjaan pada Kabinet Kerja (2014-2019). Ia pernah menjadi anggota DPR RI periode 2009-2014 dari PKB mewakili Jawa Tengah khususnya wilayah Kabupaten Batang, Kabupaten Pekalongan, Kota Pekalongan dan Kabupaten Pemalang.",
            "Menteri Desa, Pembangunan Daerah Tertinggal dan Transmigrasi. Eko Putro Sandjojo, BSEE., M.BA. (lahir di Jakarta, 21 Mei 1965; umur 54 tahun) adalah Menteri Desa, Pembangunan Daerah Tertinggal dan Transmigrasi Indonesia pada Kabinet Kerja yang menjabat sejak 27 Juli 2016 menggantikan Marwan Jafar rekan satu partainya.",
            "Menteri Pekerjaan Umum dan Perumahan Rakyat. Ir. Mochamad Basoeki Hadimoeljono, M.Sc., Ph.D. (lahir di Surakarta, 5 November 1954; umur 64 tahun) adalah Menteri Pekerjaan Umum dan Perumahan Rakyat (PUPR) pada Kabinet Kerja 2014 - 2019.",
            "Menteri Kesehatan. Prof. Dr. dr. Nila Djuwita Faried Anfasa Moeloek, SpM (K). (lahir di Jakarta, 11 April 1949; umur 70 tahun) adalah Menteri Kesehatan Indonesia pada Kabinet Kerja Presiden Joko Widodo. Ia juga seorang ahli oftalmologi (ilmu penyakit mata) dan guru besar Fakultas Kedokteran Universitas Indonesia (FKUI).",
            "Menteri Pendidikan dan Kebudayaan. Prof. Dr. Muhajir Effendy, M.A.P (lahir di Madiun, Jawa Timur, 29 Juli 1956; umur 63 tahun) adalah Menteri Pendidikan dan Kebudayaan Republik Indonesia pada Kabinet Kerja yang menjabat sejak 27 Juli 2016 menggantikan Anies Baswedan.",
            "Menteri Riset, Teknologi dan Pendidikan Tinggi. Prof. H. Mohamad Nasir, Drs., Ak., M.Si., Ph.D, (lahir di Ngawi, 27 Juni 1960; umur 59 tahun ) adalah Menteri Riset Teknologi dan Pendidikan Tinggi pada Kabinet Kerja (2014–2019).",
            "Menteri Sosial. Dr. Agus Gumiwang Kartasasmita, M.Si. (lahir di Jakarta, Indonesia, 3 Januari 1969; umur 50 tahun) adalah seorang politikus Indonesia. Ia menjabat sebagai anggota DPR periode 2009-2014. Sejak 24 Agustus, Agus menjabat sebagai Menteri Sosial, menggantikan Idrus Marham.",
            "Menteri Agama. Lukman Hakim Saifuddin (lahir di Jakarta, 25 November 1962; umur 56 tahun) adalah Menteri Agama Indonesia yang menjabat sejak 9 Juni 2014 di Kabinet Indonesia Bersatu II dan kembali menjadi menteri di Kabinet Kerja sejak 27 Oktober 2014. Ia pernah menjadi anggota DPR RI periode 1999-2004, 2004-2009 dan 2009-2014 dari Partai Persatuan Pembangunan mewakili Jawa Tengah.",
            "Menteri Pariwisata. Dr. Ir. Arief Yahya, M.Sc. (lahir di Banyuwangi, 2 April 1961; umur 58 tahun) adalah Menteri Pariwisata Indonesia yang menjabat dari 27 Oktober 2014 pada Kabinet Kerja Presiden Joko Widodo. Sebelumnya ia menjabat sebagai CEO PT Telekomunikasi Indonesia sejak 11 Mei 2012 menggantikan posisi Rinaldi Firmansyah.",
            "Menteri Komunikasi dan Informatika. Rudiantara, S.Stat., MBA. (lahir di Bogor, 3 Mei 1959; umur 60 tahun) adalah Menteri Komunikasi dan Informatika Republik Indonesia pada Kabinet Kerja (2014–2019). Ia merupakan profesional di bidang telekomunikasi dan pernah berkarier di Indosat, Telkomsel, Excelcomindo (kini XL Axiata), dan Telkom.",
            "Menteri Koperasi dan Usaha Kecil dan Menengah. Drs. Anak Agung Gede Ngurah Puspayoga (lahir di Denpasar, Bali, 7 Juli 1965; umur 54 tahun) adalah Menteri Koperasi dan Usaha Kecil dan Menengah Indonesia pada Kabinet Kerja Presiden Joko Widodo yang menjabat sejak 27 Oktober 2014. Ia juga adalah Wakil Gubernur Bali periode 2008-2013.",
            "Menteri Pemberdayaan Perempuan dan Perlindungan Anak. Yohana Susana Yembise (lahir di Manokwari, Provinsi Papua Barat, 1 Oktober 1958; umur 61 tahun) adalah Menteri Pemberdayaan Perempuan dan Perlindungan Anak dalam Kabinet Kerja 2014-2019. Ia dikenal karena menjadi menteri dan guru besar perempuan pertama dari Papua. Sebelum diangkat menjadi menteri, ia adalah seorang profesor di Universitas Cenderawasih.",
            "Menteri Pendayagunaan Aparatur Negara dan Reformasi Birokrasi. Syafruddin menjadi Menteri Pendayagunaan Aparatur Negara dan Reformasi Birokrasi sejak 15 Agustus 2018 menggantikan Asman Abnur.",
            "Menteri Perencanaan Pembangunan Nasional/Kepala Badan Perencanaan Pembangunan Nasional. Prof. Bambang Permadi Soemantri Brodjonegoro, S.E., M.U.P., Ph.D. (lahir di Jakarta, 3 Oktober 1966; umur 53 tahun) adalah Menteri Perencanaan Pembangunan Nasional Indonesia sejak 27 Juli 2016, sebelumnya di Kabinet yang sama dia adalah Menteri Keuangan Republik Indonesia pada Kabinet Kerja yang menjabat sejak tanggal 27 Oktober 2014 hingga 27 Juli 2016",
            "Menteri Agraria dan Tata Ruang/Kepala Badan Pertanahan Nasional. Dr. Sofyan A. Djalil, S.H., M.A., M.ALD. (lahir di Aceh Timur, Aceh, Indonesia, 23 September 1953; umur 66 tahun) adalah Menteri Agraria dan Tata Ruang Indonesia saat ini.",
            "Menteri Badan Usaha Milik Negara. Rini Mariani Soemarno atau biasa dikenal Rini Soemarno (lahir di Maryland, Amerika Serikat, 9 Juni 1958; umur 61 tahun), adalah Menteri Badan Usaha Milik Negara dalam Kabinet Kerja periode 2014-2019 oleh Presiden Jokowi sejak 26 Oktober 2014.",
            "PLT Menteri Pemuda dan Olahraga menggantikan Imam Nahrawi"
    };

    private static int[] heroesImages = {
            R.drawable.joko_widodo,
            R.drawable.jusuf_kalla,
            R.drawable.wiranto,
            R.drawable.darmin_nasution,
            R.drawable.luhut_binsar_panjaitan,
            R.drawable.darmin_nasution,
            R.drawable.pratikno,
            R.drawable.tjahjo_kumolo,
            R.drawable.retno_lestari_priansari_marsudi,
            R.drawable.ryamizard_ryacudu,
            R.drawable.tjahjo_kumolo,
            R.drawable.sri_mulyani_indrawati,
            R.drawable.ignatius_jonan,
            R.drawable.airlangga_hartarto,
            R.drawable.enggartiasto_lukita,
            R.drawable.amran_sulaiman,
            R.drawable.siti_nurbaya_bakar,
            R.drawable.budi_karya_sumadi,
            R.drawable.susi_pujiastuti,
            R.drawable.hanif_dhakiri,
            R.drawable.eko_putro_sandjojo,
            R.drawable.basuki_hadimuljono,
            R.drawable.nila_djuwita,
            R.drawable.muhadjir_effendy,
            R.drawable.muhammad_nasir,
            R.drawable.agus_g_kartasasmita,
            R.drawable.lukman_hakim_saifuddin,
            R.drawable.arif_yahya,
            R.drawable.rudiantara,
            R.drawable.anak_agung_gede_ngurah_puspayoga,
            R.drawable.yohanna_yambise,
            R.drawable.syafruddin,
            R.drawable.bambang_brodjonegoro,
            R.drawable.sofyan_dalil,
            R.drawable.rini_m_soemarno,
            R.drawable.hanif_dhakiri
    };

    static ArrayList<Kabinet> getListData() {
        ArrayList<Kabinet> list = new ArrayList<>();
        for (int position = 0; position < kabinetNames.length; position++) {
            Kabinet kabinet = new Kabinet();
            kabinet.setName(kabinetNames[position]);
            kabinet.setDetail(kabinetDetails[position]);
            kabinet.setFoto(heroesImages[position]);
            list.add(kabinet);
        }
        return list;
    }
}
