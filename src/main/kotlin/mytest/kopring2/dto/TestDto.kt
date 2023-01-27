package mytest.kopring2.dto

data class ReadTestDto (
    val memberId: Long? = null,
    val id: String,
    val pw: String,
    val name : String,
    val phoneNumber: Number,
    val etc: String,
)