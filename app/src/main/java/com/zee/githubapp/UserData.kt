package com.zee.githubapp

object UserData {
    private val userUsername = arrayOf("Joko",
        "Syaiful24",
        "Ryandhikabaa",
        "Sirajjj",
        "Reiyan",
        "Afreeyance",
        "Ridwan",
        "yazidScript",
        "LisaLis",
        "Vinnn")

    private val userName = arrayOf("Joko Susilo",
        "Syaiful Umar",
        "Ryandhika Abiyyi",
        "Sirajudin",
        "Hariyanto",
        "Ilyas Afreyan",
        "Ridwan Malik",
        "Yazid Shollakhudin",
        "Lisa Nurhidayah",
        "Kevin")

    private val userAddress = arrayOf("Demak, Indonesia",
        "Kudus, Indonesia",
        "Kudus, Indonesia",
        "Jepara, Indonesia",
        "Semarang, Indonesia",
        "Malang, Indonesia",
        "Pati, Indonesia",
        "Kudus, Indonesia",
        "Surabaya, Indonesia",
        "Jepara, Indonesia")

    private val userCompany = arrayOf("PT.JAYA BAYA",
        "Garden Indonesia",
        "PT.NUSA BANGSA",
        "PT.KULI BANGUNAN",
        "Sembooh",
        "RS Mugi Waras",
        "PT.Sehat Sentosa",
        "Apotek Farma",
        "PT.JATI KULON",
        "RS Anggrek")

    private val userImages = intArrayOf(R.drawable.avatar,
        R.drawable.avatar_1,
        R.drawable.avatar_2,
        R.drawable.avatar_3,
        R.drawable.avatar_4,
        R.drawable.avatar_5,
        R.drawable.avatar_6,
        R.drawable.avatar_7,
        R.drawable.avatar_8,
        R.drawable.avatar_2)

    val listData: ArrayList<UserModel>
        get() {
            val list = arrayListOf<UserModel>()
            for (position in userUsername.indices) {
                val user = UserModel()
                user.username = userUsername[position]
                user.name = userName[position]
                user.company = userCompany[position]
                user.address = userAddress[position]
                user.photo = userImages[position]
                list.add(user)
            }
            return list
        }
}