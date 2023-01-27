package mytest.kopring2.repository

import mytest.kopring2.entity.TestMany
import mytest.kopring2.entity.Test
import org.json.JSONObject
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TestRepository : JpaRepository<Test, Long> {
    fun findOneBy(): Test
}