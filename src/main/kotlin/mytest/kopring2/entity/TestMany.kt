package mytest.kopring2.entity

import mytest.kopring2.dto.ReadTestDto
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
// 그래서 그냥했으면 대문자로 이름지었던거 그냥 소문자로 됐을 거임
// 따라서 여기서도 소문자로 써야하며, 여기서 대문자로 쓰고 싶을 경우엔 PostgreSQL에서는 하단바(_) 쓰고 다음 글자 대문자가 됨
// 즉, JPA의 카멜 표기법은 postgreSQL의 스네이크 표기법으로 변환
@Table(name = "manydata")
data class TestMany (
    @Id @GeneratedValue
    @Column(name = "memberid")
    val memberId: Long,
    val id: String,
    val pw: String,
    val name: String,
    @Column(name = "phonenumber")
    val phoneNumber: Long,
    val etc: String
) {
    fun toReadTestDTO(): ReadTestDto {
        return ReadTestDto(
            memberId = memberId,
            id = id,
            pw = pw,
            name = name,
            phoneNumber = phoneNumber,
            etc = etc,
        )
    }
}