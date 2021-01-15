package model

import Adapter.StudentAdapter
import FRagment.ViewFragment

val listStudent: ArrayList<Students> =  ArrayList()
val adapter = StudentAdapter(listStudent, ViewFragment())

fun add(){ listStudent.add(Students("Julia Roberts",
    21,
    "Female",
    "Washington",
    "https://www.pngitem.com/pimgs/m/110-1104775_user-woman-business-woman-png-icon-transparent-png.png"))
    listStudent.add(Students(
        "Joel Dangal",
        23,"Male",
        "Maitidevi",
        "https://cdn.onlinewebfonts.com/svg/img_504768.png"))
    listStudent.add(Students("Sita kumari yadav",
        24,
        "female",
        "Sarlahi",
        "https://www.pngitem.com/pimgs/m/110-1104775_user-woman-business-woman-png-icon-transparent-png.png"))}

